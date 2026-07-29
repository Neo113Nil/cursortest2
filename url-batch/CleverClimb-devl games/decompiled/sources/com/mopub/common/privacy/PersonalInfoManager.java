package com.mopub.common.privacy;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;
import com.mopub.common.Preconditions;
import com.mopub.common.SdkInitializationListener;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.MoPubIdentifier;
import com.mopub.common.privacy.SyncRequest;
import com.mopub.mobileads.MoPubConversionTracker;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.volley.VolleyError;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class PersonalInfoManager implements SyncRequest.Listener {
    private static final long MINIMUM_SYNC_DELAY = 300000;
    private final Context mAppContext;
    private final ConsentDialogController mConsentDialogController;
    private final Set<ConsentStatusChangeListener> mConsentStatusChangeListeners;
    private final MoPubConversionTracker mConversionTracker;
    private Long mLastSyncRequestTimeUptimeMs;
    private final PersonalInfoData mPersonalInfoData;
    private SdkInitializationListener mSdkInitializationListener;
    private long mSyncDelayMs = MINIMUM_SYNC_DELAY;
    private ConsentStatus mSyncRequestConsentStatus;
    private long mSyncRequestEpochTime;
    private boolean mSyncRequestInFlight;

    public PersonalInfoManager(Context context, String str, SdkInitializationListener sdkInitializationListener) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        this.mAppContext = context.getApplicationContext();
        this.mConsentStatusChangeListeners = Collections.synchronizedSet(new HashSet());
        this.mConsentDialogController = new ConsentDialogController(this.mAppContext);
        this.mPersonalInfoData = new PersonalInfoData(context, str);
        this.mConversionTracker = new MoPubConversionTracker(this.mAppContext);
        MoPubIdentifier.AdvertisingIdChangeListener advertisingIdChangeListener = new MoPubIdentifier.AdvertisingIdChangeListener() { // from class: com.mopub.common.privacy.PersonalInfoManager.1
            @Override // com.mopub.common.privacy.MoPubIdentifier.AdvertisingIdChangeListener
            public void onIdChanged(AdvertisingId advertisingId, AdvertisingId advertisingId2) {
                Preconditions.checkNotNull(advertisingId);
                Preconditions.checkNotNull(advertisingId2);
                if (advertisingId.isDoNotTrack() && advertisingId2.isDoNotTrack()) {
                    return;
                }
                if (!advertisingId.isDoNotTrack() && advertisingId2.isDoNotTrack()) {
                    PersonalInfoManager.this.attemptStateTransition(ConsentStatus.DNT, ConsentChangeReason.DENIED_BY_DNT_ON);
                    PersonalInfoManager.this.requestSync(true);
                    return;
                }
                if (advertisingId.isDoNotTrack() && !advertisingId2.isDoNotTrack()) {
                    if (ConsentStatus.EXPLICIT_NO.equals(PersonalInfoManager.this.mPersonalInfoData.getConsentStatusBeforeDnt())) {
                        PersonalInfoManager.this.attemptStateTransition(ConsentStatus.EXPLICIT_NO, ConsentChangeReason.DNT_OFF);
                        return;
                    } else {
                        PersonalInfoManager.this.attemptStateTransition(ConsentStatus.UNKNOWN, ConsentChangeReason.DNT_OFF);
                        return;
                    }
                }
                if (TextUtils.isEmpty(advertisingId2.mAdvertisingId) || advertisingId2.getIfaWithPrefix().equals(PersonalInfoManager.this.mPersonalInfoData.getUdid()) || !ConsentStatus.EXPLICIT_YES.equals(PersonalInfoManager.this.mPersonalInfoData.getConsentStatus())) {
                    return;
                }
                PersonalInfoManager.this.mPersonalInfoData.setLastSuccessfullySyncedConsentStatus(null);
                PersonalInfoManager.this.mPersonalInfoData.setLastChangedMs(null);
                PersonalInfoManager.this.attemptStateTransition(ConsentStatus.UNKNOWN, ConsentChangeReason.IFA_CHANGED);
            }
        };
        this.mSdkInitializationListener = sdkInitializationListener;
        MoPubIdentifier moPubIdentifier = ClientMetadata.getInstance(this.mAppContext).getMoPubIdentifier();
        moPubIdentifier.setIdChangeListener(advertisingIdChangeListener);
        moPubIdentifier.setInitializationListener(createInitializationListener());
    }

    public boolean shouldShowConsentDialog() {
        if (gdprApplies() == null || !gdprApplies().booleanValue() || ClientMetadata.getInstance(this.mAppContext).getMoPubIdentifier().getAdvertisingInfo().isDoNotTrack()) {
            return false;
        }
        if (this.mPersonalInfoData.shouldReacquireConsent() && this.mPersonalInfoData.getConsentStatus().equals(ConsentStatus.EXPLICIT_YES)) {
            return true;
        }
        return this.mPersonalInfoData.getConsentStatus().equals(ConsentStatus.UNKNOWN);
    }

    public boolean isConsentDialogReady() {
        return this.mConsentDialogController.isReady();
    }

    public void loadConsentDialog(final ConsentDialogListener consentDialogListener) {
        if (!ClientMetadata.getInstance(this.mAppContext).getMoPubIdentifier().getAdvertisingInfo().isDoNotTrack()) {
            this.mConsentDialogController.loadConsentDialog(consentDialogListener, this.mPersonalInfoData.getAdUnitId());
        } else if (consentDialogListener != null) {
            new Handler().post(new Runnable() { // from class: com.mopub.common.privacy.PersonalInfoManager.2
                @Override // java.lang.Runnable
                public void run() {
                    consentDialogListener.onConsentDialogLoadFailed(MoPubErrorCode.DO_NOT_TRACK);
                }
            });
        }
    }

    public boolean showConsentDialog() {
        return this.mConsentDialogController.showConsentDialog();
    }

    public boolean canCollectPersonalInformation() {
        Boolean gdprApplies = gdprApplies();
        if (gdprApplies == null) {
            return false;
        }
        if (gdprApplies.booleanValue()) {
            return getPersonalInfoConsentStatus().equals(ConsentStatus.EXPLICIT_YES) && !ClientMetadata.getInstance(this.mAppContext).getMoPubIdentifier().getAdvertisingInfo().isDoNotTrack();
        }
        return true;
    }

    public Boolean gdprApplies() {
        return this.mPersonalInfoData.getGdprApplies();
    }

    public void invalidateConsent(String str) {
        if (TextUtils.isEmpty(str)) {
            attemptStateTransition(ConsentStatus.UNKNOWN, ConsentChangeReason.REACQUIRE_BY_SERVER);
        } else {
            attemptStateTransition(ConsentStatus.UNKNOWN, str);
        }
    }

    public void forceExplicitNo(String str) {
        if (TextUtils.isEmpty(str)) {
            attemptStateTransition(ConsentStatus.EXPLICIT_NO, ConsentChangeReason.REVOKED_BY_SERVER);
        } else {
            attemptStateTransition(ConsentStatus.EXPLICIT_NO, str);
        }
    }

    public void reacquireConsent(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mPersonalInfoData.setConsentChangeReason(str);
        }
        this.mPersonalInfoData.setShouldReacquireConsent(true);
    }

    public ConsentStatus getPersonalInfoConsentStatus() {
        return this.mPersonalInfoData.getConsentStatus();
    }

    public void grantConsent() {
        if (ClientMetadata.getInstance(this.mAppContext).getMoPubIdentifier().getAdvertisingInfo().isDoNotTrack()) {
            MoPubLog.e("Cannot grant consent because Do Not Track is on.");
            return;
        }
        if (this.mPersonalInfoData.isWhitelisted()) {
            attemptStateTransition(ConsentStatus.EXPLICIT_YES, ConsentChangeReason.GRANTED_BY_WHITELISTED_PUB);
        } else {
            attemptStateTransition(ConsentStatus.POTENTIAL_WHITELIST, ConsentChangeReason.GRANTED_BY_NOT_WHITELISTED_PUB);
        }
        requestSync(true);
    }

    public void revokeConsent() {
        if (ClientMetadata.getInstance(this.mAppContext).getMoPubIdentifier().getAdvertisingInfo().isDoNotTrack()) {
            MoPubLog.e("Cannot revoke consent because Do Not Track is on.");
        } else {
            attemptStateTransition(ConsentStatus.EXPLICIT_NO, ConsentChangeReason.DENIED_BY_PUB);
            requestSync(true);
        }
    }

    void changeConsentStateFromDialog(ConsentStatus consentStatus) {
        Preconditions.checkNotNull(consentStatus);
        switch (consentStatus) {
            case EXPLICIT_YES:
                attemptStateTransition(consentStatus, ConsentChangeReason.GRANTED_BY_USER);
                requestSync(true);
                break;
            case EXPLICIT_NO:
                attemptStateTransition(consentStatus, ConsentChangeReason.DENIED_BY_USER);
                requestSync(true);
                break;
            default:
                MoPubLog.d("Invalid consent status: " + consentStatus + ". This is a bug with the use of changeConsentStateFromDialog.");
                break;
        }
    }

    public void subscribeConsentStatusChangeListener(ConsentStatusChangeListener consentStatusChangeListener) {
        if (consentStatusChangeListener == null) {
            return;
        }
        this.mConsentStatusChangeListeners.add(consentStatusChangeListener);
    }

    public void unsubscribeConsentStatusChangeListener(ConsentStatusChangeListener consentStatusChangeListener) {
        this.mConsentStatusChangeListeners.remove(consentStatusChangeListener);
    }

    @VisibleForTesting
    static boolean shouldMakeSyncRequest(boolean z, Boolean bool, boolean z2, Long l, long j, String str, boolean z3) {
        if (z) {
            return false;
        }
        if (bool == null) {
            return true;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        if (z2) {
            return true;
        }
        if (z3 && TextUtils.isEmpty(str)) {
            return false;
        }
        return l == null || SystemClock.uptimeMillis() - l.longValue() > j;
    }

    public void requestSync(boolean z) {
        if (shouldMakeSyncRequest(this.mSyncRequestInFlight, gdprApplies(), z, this.mLastSyncRequestTimeUptimeMs, this.mSyncDelayMs, this.mPersonalInfoData.getUdid(), ClientMetadata.getInstance(this.mAppContext).getMoPubIdentifier().getAdvertisingInfo().isDoNotTrack())) {
            this.mSyncRequestConsentStatus = this.mPersonalInfoData.getConsentStatus();
            this.mSyncRequestEpochTime = Calendar.getInstance().getTimeInMillis();
            this.mSyncRequestInFlight = true;
            this.mLastSyncRequestTimeUptimeMs = Long.valueOf(SystemClock.uptimeMillis());
            SyncUrlGenerator syncUrlGenerator = new SyncUrlGenerator(this.mAppContext, this.mSyncRequestConsentStatus.getValue());
            syncUrlGenerator.withAdUnitId(this.mPersonalInfoData.getAdUnitId()).withUdid(this.mPersonalInfoData.getUdid()).withLastChangedMs(this.mPersonalInfoData.getLastChangedMs()).withLastConsentStatus(this.mPersonalInfoData.getLastSuccessfullySyncedConsentStatus()).withConsentChangeReason(this.mPersonalInfoData.getConsentChangeReason()).withConsentedVendorListVersion(this.mPersonalInfoData.getConsentedVendorListVersion()).withConsentedPrivacyPolicyVersion(this.mPersonalInfoData.getConsentedPrivacyPolicyVersion()).withCachedVendorListIabHash(this.mPersonalInfoData.getCurrentVendorListIabHash()).withExtras(this.mPersonalInfoData.getExtras()).withGdprApplies(gdprApplies());
            Networking.getRequestQueue(this.mAppContext).add(new SyncRequest(this.mAppContext, syncUrlGenerator.generateUrlString(Constants.HOST), this));
        }
    }

    public ConsentData getConsentData() {
        return new PersonalInfoData(this.mAppContext, this.mPersonalInfoData.getAdUnitId());
    }

    @Override // com.mopub.common.privacy.SyncRequest.Listener
    @Deprecated
    public void onSuccess(SyncResponse syncResponse) {
        if (this.mPersonalInfoData.getGdprApplies() == null) {
            this.mPersonalInfoData.setGdprApplies(syncResponse.isGdprRegion());
        }
        this.mPersonalInfoData.setLastChangedMs("" + this.mSyncRequestEpochTime);
        this.mPersonalInfoData.setLastSuccessfullySyncedConsentStatus(this.mSyncRequestConsentStatus);
        this.mPersonalInfoData.setWhitelisted(syncResponse.isWhitelisted());
        this.mPersonalInfoData.setCurrentVendorListVersion(syncResponse.getCurrentVendorListVersion());
        this.mPersonalInfoData.setCurrentVendorListLink(syncResponse.getCurrentVendorListLink());
        this.mPersonalInfoData.setCurrentPrivacyPolicyVersion(syncResponse.getCurrentPrivacyPolicyVersion());
        this.mPersonalInfoData.setCurrentPrivacyPolicyLink(syncResponse.getCurrentPrivacyPolicyLink());
        String currentVendorListIabHash = syncResponse.getCurrentVendorListIabHash();
        String currentVendorListIabFormat = syncResponse.getCurrentVendorListIabFormat();
        if (!TextUtils.isEmpty(currentVendorListIabHash) && !currentVendorListIabHash.equals(this.mPersonalInfoData.getCurrentVendorListIabHash()) && !TextUtils.isEmpty(currentVendorListIabFormat)) {
            this.mPersonalInfoData.setCurrentVendorListIabFormat(currentVendorListIabFormat);
            this.mPersonalInfoData.setCurrentVendorListIabHash(currentVendorListIabHash);
        }
        String extras = syncResponse.getExtras();
        if (!TextUtils.isEmpty(extras)) {
            this.mPersonalInfoData.setExtras(extras);
        }
        String consentChangeReason = syncResponse.getConsentChangeReason();
        if (syncResponse.isForceExplicitNo()) {
            forceExplicitNo(consentChangeReason);
        } else if (syncResponse.isInvalidateConsent()) {
            invalidateConsent(consentChangeReason);
        } else if (syncResponse.isReacquireConsent()) {
            reacquireConsent(consentChangeReason);
        }
        String callAgainAfterSecs = syncResponse.getCallAgainAfterSecs();
        if (!TextUtils.isEmpty(callAgainAfterSecs)) {
            try {
                long parseLong = Long.parseLong(callAgainAfterSecs);
                if (parseLong > 0) {
                    this.mSyncDelayMs = parseLong * 1000;
                } else {
                    MoPubLog.d("callAgainAfterSecs is not positive: " + callAgainAfterSecs);
                }
            } catch (NumberFormatException unused) {
                MoPubLog.d("Unable to parse callAgainAfterSecs. Ignoring value");
            }
        }
        if (!ConsentStatus.EXPLICIT_YES.equals(this.mSyncRequestConsentStatus)) {
            this.mPersonalInfoData.setUdid(null);
        }
        this.mPersonalInfoData.writeToDisk();
        this.mSyncRequestInFlight = false;
        if (ConsentStatus.POTENTIAL_WHITELIST.equals(this.mSyncRequestConsentStatus) && this.mPersonalInfoData.isWhitelisted()) {
            attemptStateTransition(ConsentStatus.EXPLICIT_YES, ConsentChangeReason.GRANTED_BY_WHITELISTED_PUB);
            requestSync(true);
        }
        if (this.mSdkInitializationListener != null) {
            this.mSdkInitializationListener.onInitializationFinished();
            this.mSdkInitializationListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attemptStateTransition(ConsentStatus consentStatus, ConsentChangeReason consentChangeReason) {
        attemptStateTransition(consentStatus, consentChangeReason.getReason());
    }

    private void attemptStateTransition(final ConsentStatus consentStatus, String str) {
        Preconditions.checkNotNull(consentStatus);
        Preconditions.checkNotNull(str);
        final ConsentStatus consentStatus2 = this.mPersonalInfoData.getConsentStatus();
        MoPubLog.d("Changing consent status from " + consentStatus2 + "to " + consentStatus + " because " + str);
        this.mPersonalInfoData.setConsentChangeReason(str);
        this.mPersonalInfoData.setConsentStatus(consentStatus);
        if (ConsentStatus.POTENTIAL_WHITELIST.equals(consentStatus) || (!ConsentStatus.POTENTIAL_WHITELIST.equals(consentStatus2) && ConsentStatus.EXPLICIT_YES.equals(consentStatus))) {
            this.mPersonalInfoData.setConsentedPrivacyPolicyVersion(this.mPersonalInfoData.getCurrentPrivacyPolicyVersion());
            this.mPersonalInfoData.setConsentedVendorListVersion(this.mPersonalInfoData.getCurrentVendorListVersion());
            this.mPersonalInfoData.setConsentedVendorListIabFormat(this.mPersonalInfoData.getCurrentVendorListIabFormat());
        }
        if (ConsentStatus.DNT.equals(consentStatus) || ConsentStatus.EXPLICIT_NO.equals(consentStatus) || ConsentStatus.UNKNOWN.equals(consentStatus)) {
            this.mPersonalInfoData.setConsentedPrivacyPolicyVersion(null);
            this.mPersonalInfoData.setConsentedVendorListVersion(null);
            this.mPersonalInfoData.setConsentedVendorListIabFormat(null);
        }
        if (ConsentStatus.EXPLICIT_YES.equals(consentStatus)) {
            this.mPersonalInfoData.setUdid(ClientMetadata.getInstance(this.mAppContext).getMoPubIdentifier().getAdvertisingInfo().getIfaWithPrefix());
        }
        if (ConsentStatus.DNT.equals(consentStatus)) {
            this.mPersonalInfoData.setConsentStatusBeforeDnt(consentStatus2);
        }
        this.mPersonalInfoData.setShouldReacquireConsent(false);
        this.mPersonalInfoData.writeToDisk();
        final boolean canCollectPersonalInformation = canCollectPersonalInformation();
        if (canCollectPersonalInformation) {
            ClientMetadata.getInstance(this.mAppContext).repopulateCountryData();
            if (this.mConversionTracker.shouldTrack()) {
                this.mConversionTracker.reportAppOpen(false);
            }
        }
        synchronized (this.mConsentStatusChangeListeners) {
            for (final ConsentStatusChangeListener consentStatusChangeListener : this.mConsentStatusChangeListeners) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mopub.common.privacy.PersonalInfoManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        consentStatusChangeListener.onConsentStateChange(consentStatus2, consentStatus, canCollectPersonalInformation);
                    }
                });
            }
        }
    }

    @Override // com.mopub.volley.Response.ErrorListener
    @Deprecated
    public void onErrorResponse(VolleyError volleyError) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed sync request because of ");
        sb.append(volleyError instanceof MoPubNetworkError ? ((MoPubNetworkError) volleyError).getReason() : volleyError.getMessage());
        MoPubLog.d(sb.toString());
        this.mSyncRequestInFlight = false;
        if (this.mSdkInitializationListener != null) {
            MoPubLog.d("Personal Info Manager initialization finished but ran into errors.");
            this.mSdkInitializationListener.onInitializationFinished();
            this.mSdkInitializationListener = null;
        }
    }

    private SdkInitializationListener createInitializationListener() {
        return new SdkInitializationListener() { // from class: com.mopub.common.privacy.PersonalInfoManager.4
            @Override // com.mopub.common.SdkInitializationListener
            public void onInitializationFinished() {
                MoPubLog.d("MoPubIdentifier initialized.");
                if (!PersonalInfoManager.shouldMakeSyncRequest(PersonalInfoManager.this.mSyncRequestInFlight, PersonalInfoManager.this.gdprApplies(), false, PersonalInfoManager.this.mLastSyncRequestTimeUptimeMs, PersonalInfoManager.this.mSyncDelayMs, PersonalInfoManager.this.mPersonalInfoData.getUdid(), ClientMetadata.getInstance(PersonalInfoManager.this.mAppContext).getMoPubIdentifier().getAdvertisingInfo().isDoNotTrack())) {
                    if (PersonalInfoManager.this.mSdkInitializationListener != null) {
                        PersonalInfoManager.this.mSdkInitializationListener.onInitializationFinished();
                        PersonalInfoManager.this.mSdkInitializationListener = null;
                    }
                } else {
                    PersonalInfoManager.this.requestSync(false);
                }
                new MoPubConversionTracker(PersonalInfoManager.this.mAppContext).reportAppOpen(true);
            }
        };
    }
}
