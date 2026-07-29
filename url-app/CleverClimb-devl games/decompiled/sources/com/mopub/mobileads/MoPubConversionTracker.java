package com.mopub.mobileads;

import android.content.Context;
import android.content.SharedPreferences;
import com.mopub.common.Constants;
import com.mopub.common.MoPub;
import com.mopub.common.Preconditions;
import com.mopub.common.SharedPreferencesHelper;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.ConsentData;
import com.mopub.common.privacy.PersonalInfoManager;
import com.mopub.network.TrackingRequest;
import com.mopub.volley.VolleyError;

/* loaded from: classes2.dex */
public class MoPubConversionTracker {
    private static final String WANT_TO_TRACK = " wantToTrack";
    private final Context mContext;
    private final String mIsTrackedKey;
    private SharedPreferences mSharedPreferences;
    private final String mWantToTrack;

    public MoPubConversionTracker(Context context) {
        Preconditions.checkNotNull(context);
        this.mContext = context.getApplicationContext();
        String packageName = this.mContext.getPackageName();
        this.mWantToTrack = packageName + WANT_TO_TRACK;
        this.mIsTrackedKey = packageName + " tracked";
        this.mSharedPreferences = SharedPreferencesHelper.getSharedPreferences(this.mContext);
    }

    public void reportAppOpen() {
        reportAppOpen(false);
    }

    public void reportAppOpen(boolean z) {
        PersonalInfoManager personalInformationManager = MoPub.getPersonalInformationManager();
        if (personalInformationManager == null) {
            MoPubLog.w("Cannot report app open until initialization is done");
            return;
        }
        if (!z && isAlreadyTracked()) {
            MoPubLog.d("Conversion already tracked");
        } else if (!z && !MoPub.canCollectPersonalInformation()) {
            this.mSharedPreferences.edit().putBoolean(this.mWantToTrack, true).apply();
        } else {
            ConsentData consentData = personalInformationManager.getConsentData();
            TrackingRequest.makeTrackingHttpRequest(new ConversionUrlGenerator(this.mContext).withGdprApplies(personalInformationManager.gdprApplies()).withCurrentConsentStatus(personalInformationManager.getPersonalInfoConsentStatus().getValue()).withConsentedPrivacyPolicyVersion(consentData.getConsentedPrivacyPolicyVersion()).withConsentedVendorListVersion(consentData.getConsentedVendorListVersion()).withSessionTracker(z).generateUrlString(Constants.HOST), this.mContext, new TrackingRequest.Listener() { // from class: com.mopub.mobileads.MoPubConversionTracker.1
                @Override // com.mopub.volley.Response.ErrorListener
                public void onErrorResponse(VolleyError volleyError) {
                }

                @Override // com.mopub.network.TrackingRequest.Listener
                public void onResponse(String str) {
                    MoPubConversionTracker.this.mSharedPreferences.edit().putBoolean(MoPubConversionTracker.this.mIsTrackedKey, true).putBoolean(MoPubConversionTracker.this.mWantToTrack, false).apply();
                }
            });
        }
    }

    public boolean shouldTrack() {
        PersonalInfoManager personalInformationManager = MoPub.getPersonalInformationManager();
        return personalInformationManager != null && personalInformationManager.canCollectPersonalInformation() && this.mSharedPreferences.getBoolean(this.mWantToTrack, false);
    }

    private boolean isAlreadyTracked() {
        return this.mSharedPreferences.getBoolean(this.mIsTrackedKey, false);
    }
}
