package com.mopub.common.privacy;

import android.content.Context;
import com.mopub.common.BaseUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Constants;
import com.mopub.common.Preconditions;
import com.mopub.network.PlayServicesUrlRewriter;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public class SyncUrlGenerator extends BaseUrlGenerator {
    private static final String CACHED_VENDOR_LIST_IAB_HASH_KEY = "cached_vendor_list_iab_hash";
    private static final String CONSENT_CHANGE_REASON_KEY = "consent_change_reason";
    private static final String EXTRAS_KEY = "extras";
    private static final String LAST_CHANGED_MS_KEY = "last_changed_ms";
    private static final String LAST_CONSENT_STATUS_KEY = "last_consent_status";
    private String mAdUnitId;
    private String mCachedVendorListIabHash;
    private String mConsentChangeReason;
    private String mConsentedPrivacyPolicyVersion;
    private String mConsentedVendorListVersion;
    private final Context mContext;
    private final String mCurrentConsentStatus;
    private String mExtras;
    private Boolean mGdprApplies;
    private String mLastChangedMs;
    private String mLastConsentStatus;
    private String mUdid;

    public SyncUrlGenerator(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        this.mContext = context.getApplicationContext();
        this.mCurrentConsentStatus = str;
    }

    public SyncUrlGenerator withAdUnitId(String str) {
        this.mAdUnitId = str;
        return this;
    }

    public SyncUrlGenerator withUdid(String str) {
        this.mUdid = str;
        return this;
    }

    public SyncUrlGenerator withGdprApplies(Boolean bool) {
        this.mGdprApplies = bool;
        return this;
    }

    public SyncUrlGenerator withLastChangedMs(String str) {
        this.mLastChangedMs = str;
        return this;
    }

    public SyncUrlGenerator withLastConsentStatus(ConsentStatus consentStatus) {
        this.mLastConsentStatus = consentStatus == null ? null : consentStatus.getValue();
        return this;
    }

    public SyncUrlGenerator withConsentChangeReason(String str) {
        this.mConsentChangeReason = str;
        return this;
    }

    public SyncUrlGenerator withConsentedVendorListVersion(String str) {
        this.mConsentedVendorListVersion = str;
        return this;
    }

    public SyncUrlGenerator withConsentedPrivacyPolicyVersion(String str) {
        this.mConsentedPrivacyPolicyVersion = str;
        return this;
    }

    public SyncUrlGenerator withCachedVendorListIabHash(String str) {
        this.mCachedVendorListIabHash = str;
        return this;
    }

    public SyncUrlGenerator withExtras(String str) {
        this.mExtras = str;
        return this;
    }

    @Override // com.mopub.common.BaseUrlGenerator
    public String generateUrlString(String str) {
        initUrlString(str, Constants.GDPR_SYNC_HANDLER);
        addParam("id", this.mAdUnitId);
        addParam("nv", "5.0.0");
        addParam(LAST_CHANGED_MS_KEY, this.mLastChangedMs);
        addParam(LAST_CONSENT_STATUS_KEY, this.mLastConsentStatus);
        addParam("current_consent_status", this.mCurrentConsentStatus);
        addParam(CONSENT_CHANGE_REASON_KEY, this.mConsentChangeReason);
        addParam("consented_vendor_list_version", this.mConsentedVendorListVersion);
        addParam("consented_privacy_policy_version", this.mConsentedPrivacyPolicyVersion);
        addParam(CACHED_VENDOR_LIST_IAB_HASH_KEY, this.mCachedVendorListIabHash);
        addParam(EXTRAS_KEY, this.mExtras);
        addParam(TapjoyConstants.TJC_DEVICE_ID_NAME, this.mUdid);
        if (this.mGdprApplies != null) {
            addParam("gdpr_applies", this.mGdprApplies.booleanValue() ? "1" : "0");
        }
        addParam(TJAdUnitConstants.String.BUNDLE, ClientMetadata.getInstance(this.mContext).getAppPackageName());
        addParam("dnt", PlayServicesUrlRewriter.DO_NOT_TRACK_TEMPLATE);
        return getFinalUrlString();
    }
}
