package com.mopub.common.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mopub.common.ClientMetadata;
import com.mopub.common.Preconditions;
import com.mopub.common.SharedPreferencesHelper;
import com.mopub.common.VisibleForTesting;
import java.util.Locale;

/* loaded from: classes2.dex */
class PersonalInfoData implements ConsentData {
    private static final String AD_UNIT_ID_SP_KEY = "info/adunit";
    private static final String CONSENTED_PRIVACY_POLICY_VERSION_SP_KEY = "info/consented_privacy_policy_version";
    private static final String CONSENTED_VENDOR_LIST_IAB_FORMAT_SP_KEY = "info/consented_vendor_list_iab_format";
    private static final String CONSENTED_VENDOR_LIST_VERSION_SP_KEY = "info/consented_vendor_list_version";
    private static final String CONSENT_CHANGE_REASON_SP_KEY = "info/consent_change_reason";
    private static final String CONSENT_STATUS_BEFORE_DNT_SP_KEY = "info/consent_status_before_dnt";
    private static final String CONSENT_STATUS_SP_KEY = "info/consent_status";
    private static final String CURRENT_PRIVACY_POLICY_LINK_SP_KEY = "info/current_privacy_policy_link";
    private static final String CURRENT_PRIVACY_POLICY_VERSION_SP_KEY = "info/current_privacy_policy_version";
    private static final String CURRENT_VENDOR_LIST_IAB_FORMAT_SP_KEY = "info/current_vendor_list_iab_format";
    private static final String CURRENT_VENDOR_LIST_IAB_HASH_SP_KEY = "info/current_vendor_list_iab_hash";
    private static final String CURRENT_VENDOR_LIST_LINK_SP_KEY = "info/current_vendor_list_link";
    private static final String CURRENT_VENDOR_LIST_VERSION_SP_KEY = "info/current_vendor_list_version";
    private static final String EXTRAS_SP_KEY = "info/extras";
    private static final String GDPR_APPLIES_SP_KEY = "info/gdpr_applies";
    private static final String IS_WHITELISTED_SP_KEY = "info/is_whitelisted";
    private static final String LANGUAGE_MACRO_KEY = "%%LANGUAGE%%";
    private static final String LAST_CHANGED_MS_SP_KEY = "info/last_changed_ms";
    private static final String LAST_SUCCESSFULLY_SYNCED_CONSENT_STATUS_SP_KEY = "info/last_successfully_synced_consent_status";
    private static final String PERSONAL_INFO_DATA_SHARED_PREFS = "com.mopub.privacy";
    private static final String PERSONAL_INFO_PREFIX = "info/";
    private static final String REACQUIRE_CONSENT_SP_KEY = "info/reacquire_consent";
    private static final String UDID_SP_KEY = "info/udid";
    private String mAdUnitId;
    private final Context mAppContext;
    private String mConsentChangeReason;
    private ConsentStatus mConsentStatus;
    private ConsentStatus mConsentStatusBeforeDnt;
    private String mConsentedPrivacyPolicyVersion;
    private String mConsentedVendorListIabFormat;
    private String mConsentedVendorListVersion;
    private String mCurrentPrivacyPolicyLink;
    private String mCurrentPrivacyPolicyVersion;
    private String mCurrentVendorListIabFormat;
    private String mCurrentVendorListIabHash;
    private String mCurrentVendorListLink;
    private String mCurrentVendorListVersion;
    private String mExtras;
    private Boolean mGdprApplies;
    private boolean mIsWhitelisted;
    private String mLastChangedMs;
    private ConsentStatus mLastSuccessfullySyncedConsentStatus;
    private boolean mReacquireConsent;
    private String mUdid;

    PersonalInfoData(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        this.mAppContext = context.getApplicationContext();
        this.mConsentStatus = ConsentStatus.UNKNOWN;
        getStateFromDisk();
        this.mAdUnitId = str;
    }

    private void getStateFromDisk() {
        SharedPreferences sharedPreferences = SharedPreferencesHelper.getSharedPreferences(this.mAppContext, PERSONAL_INFO_DATA_SHARED_PREFS);
        this.mAdUnitId = sharedPreferences.getString(AD_UNIT_ID_SP_KEY, "");
        this.mConsentStatus = ConsentStatus.fromString(sharedPreferences.getString(CONSENT_STATUS_SP_KEY, ConsentStatus.UNKNOWN.name()));
        String string = sharedPreferences.getString(LAST_SUCCESSFULLY_SYNCED_CONSENT_STATUS_SP_KEY, null);
        if (TextUtils.isEmpty(string)) {
            this.mLastSuccessfullySyncedConsentStatus = null;
        } else {
            this.mLastSuccessfullySyncedConsentStatus = ConsentStatus.fromString(string);
        }
        this.mIsWhitelisted = sharedPreferences.getBoolean(IS_WHITELISTED_SP_KEY, false);
        this.mCurrentVendorListVersion = sharedPreferences.getString(CURRENT_VENDOR_LIST_VERSION_SP_KEY, null);
        this.mCurrentVendorListLink = sharedPreferences.getString(CURRENT_VENDOR_LIST_LINK_SP_KEY, null);
        this.mCurrentPrivacyPolicyVersion = sharedPreferences.getString(CURRENT_PRIVACY_POLICY_VERSION_SP_KEY, null);
        this.mCurrentPrivacyPolicyLink = sharedPreferences.getString(CURRENT_PRIVACY_POLICY_LINK_SP_KEY, null);
        this.mCurrentVendorListIabFormat = sharedPreferences.getString(CURRENT_VENDOR_LIST_IAB_FORMAT_SP_KEY, null);
        this.mCurrentVendorListIabHash = sharedPreferences.getString(CURRENT_VENDOR_LIST_IAB_HASH_SP_KEY, null);
        this.mConsentedVendorListVersion = sharedPreferences.getString(CONSENTED_VENDOR_LIST_VERSION_SP_KEY, null);
        this.mConsentedPrivacyPolicyVersion = sharedPreferences.getString(CONSENTED_PRIVACY_POLICY_VERSION_SP_KEY, null);
        this.mConsentedVendorListIabFormat = sharedPreferences.getString(CONSENTED_VENDOR_LIST_IAB_FORMAT_SP_KEY, null);
        this.mExtras = sharedPreferences.getString(EXTRAS_SP_KEY, null);
        this.mConsentChangeReason = sharedPreferences.getString(CONSENT_CHANGE_REASON_SP_KEY, null);
        this.mReacquireConsent = sharedPreferences.getBoolean(REACQUIRE_CONSENT_SP_KEY, false);
        String string2 = sharedPreferences.getString(GDPR_APPLIES_SP_KEY, null);
        if (TextUtils.isEmpty(string2)) {
            this.mGdprApplies = null;
        } else {
            this.mGdprApplies = Boolean.valueOf(Boolean.parseBoolean(string2));
        }
        this.mUdid = sharedPreferences.getString(UDID_SP_KEY, null);
        this.mLastChangedMs = sharedPreferences.getString(LAST_CHANGED_MS_SP_KEY, null);
        String string3 = sharedPreferences.getString(CONSENT_STATUS_BEFORE_DNT_SP_KEY, null);
        if (TextUtils.isEmpty(string3)) {
            this.mConsentStatusBeforeDnt = null;
        } else {
            this.mConsentStatusBeforeDnt = ConsentStatus.fromString(string3);
        }
    }

    void writeToDisk() {
        SharedPreferences.Editor edit = SharedPreferencesHelper.getSharedPreferences(this.mAppContext, PERSONAL_INFO_DATA_SHARED_PREFS).edit();
        edit.putString(AD_UNIT_ID_SP_KEY, this.mAdUnitId);
        edit.putString(CONSENT_STATUS_SP_KEY, this.mConsentStatus.name());
        edit.putString(LAST_SUCCESSFULLY_SYNCED_CONSENT_STATUS_SP_KEY, this.mLastSuccessfullySyncedConsentStatus == null ? null : this.mLastSuccessfullySyncedConsentStatus.name());
        edit.putBoolean(IS_WHITELISTED_SP_KEY, this.mIsWhitelisted);
        edit.putString(CURRENT_VENDOR_LIST_VERSION_SP_KEY, this.mCurrentVendorListVersion);
        edit.putString(CURRENT_VENDOR_LIST_LINK_SP_KEY, this.mCurrentVendorListLink);
        edit.putString(CURRENT_PRIVACY_POLICY_VERSION_SP_KEY, this.mCurrentPrivacyPolicyVersion);
        edit.putString(CURRENT_PRIVACY_POLICY_LINK_SP_KEY, this.mCurrentPrivacyPolicyLink);
        edit.putString(CURRENT_VENDOR_LIST_IAB_FORMAT_SP_KEY, this.mCurrentVendorListIabFormat);
        edit.putString(CURRENT_VENDOR_LIST_IAB_HASH_SP_KEY, this.mCurrentVendorListIabHash);
        edit.putString(CONSENTED_VENDOR_LIST_VERSION_SP_KEY, this.mConsentedVendorListVersion);
        edit.putString(CONSENTED_PRIVACY_POLICY_VERSION_SP_KEY, this.mConsentedPrivacyPolicyVersion);
        edit.putString(CONSENTED_VENDOR_LIST_IAB_FORMAT_SP_KEY, this.mConsentedVendorListIabFormat);
        edit.putString(EXTRAS_SP_KEY, this.mExtras);
        edit.putString(CONSENT_CHANGE_REASON_SP_KEY, this.mConsentChangeReason);
        edit.putBoolean(REACQUIRE_CONSENT_SP_KEY, this.mReacquireConsent);
        edit.putString(GDPR_APPLIES_SP_KEY, this.mGdprApplies == null ? null : this.mGdprApplies.toString());
        edit.putString(UDID_SP_KEY, this.mUdid);
        edit.putString(LAST_CHANGED_MS_SP_KEY, this.mLastChangedMs);
        edit.putString(CONSENT_STATUS_BEFORE_DNT_SP_KEY, this.mConsentStatusBeforeDnt != null ? this.mConsentStatusBeforeDnt.name() : null);
        edit.apply();
    }

    String getAdUnitId() {
        return this.mAdUnitId;
    }

    ConsentStatus getConsentStatus() {
        return this.mConsentStatus;
    }

    void setConsentStatus(ConsentStatus consentStatus) {
        this.mConsentStatus = consentStatus;
    }

    ConsentStatus getLastSuccessfullySyncedConsentStatus() {
        return this.mLastSuccessfullySyncedConsentStatus;
    }

    void setLastSuccessfullySyncedConsentStatus(ConsentStatus consentStatus) {
        this.mLastSuccessfullySyncedConsentStatus = consentStatus;
    }

    boolean isWhitelisted() {
        return this.mIsWhitelisted;
    }

    void setWhitelisted(boolean z) {
        this.mIsWhitelisted = z;
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getCurrentVendorListVersion() {
        return this.mCurrentVendorListVersion;
    }

    void setCurrentVendorListVersion(String str) {
        this.mCurrentVendorListVersion = str;
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getCurrentVendorListLink() {
        return getCurrentVendorListLink(null);
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getCurrentVendorListLink(String str) {
        return replaceLanguageMacro(this.mCurrentVendorListLink, this.mAppContext, str);
    }

    void setCurrentVendorListLink(String str) {
        this.mCurrentVendorListLink = str;
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getCurrentPrivacyPolicyVersion() {
        return this.mCurrentPrivacyPolicyVersion;
    }

    void setCurrentPrivacyPolicyVersion(String str) {
        this.mCurrentPrivacyPolicyVersion = str;
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getCurrentPrivacyPolicyLink() {
        return getCurrentPrivacyPolicyLink(null);
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getCurrentPrivacyPolicyLink(String str) {
        return replaceLanguageMacro(this.mCurrentPrivacyPolicyLink, this.mAppContext, str);
    }

    void setCurrentPrivacyPolicyLink(String str) {
        this.mCurrentPrivacyPolicyLink = str;
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getCurrentVendorListIabFormat() {
        return this.mCurrentVendorListIabFormat;
    }

    void setCurrentVendorListIabFormat(String str) {
        this.mCurrentVendorListIabFormat = str;
    }

    String getCurrentVendorListIabHash() {
        return this.mCurrentVendorListIabHash;
    }

    void setCurrentVendorListIabHash(String str) {
        this.mCurrentVendorListIabHash = str;
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getConsentedVendorListVersion() {
        return this.mConsentedVendorListVersion;
    }

    void setConsentedVendorListVersion(String str) {
        this.mConsentedVendorListVersion = str;
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getConsentedPrivacyPolicyVersion() {
        return this.mConsentedPrivacyPolicyVersion;
    }

    void setConsentedPrivacyPolicyVersion(String str) {
        this.mConsentedPrivacyPolicyVersion = str;
    }

    @Override // com.mopub.common.privacy.ConsentData
    public String getConsentedVendorListIabFormat() {
        return this.mConsentedVendorListIabFormat;
    }

    void setConsentedVendorListIabFormat(String str) {
        this.mConsentedVendorListIabFormat = str;
    }

    public String getExtras() {
        return this.mExtras;
    }

    public void setExtras(String str) {
        this.mExtras = str;
    }

    String getConsentChangeReason() {
        return this.mConsentChangeReason;
    }

    void setConsentChangeReason(String str) {
        this.mConsentChangeReason = str;
    }

    boolean shouldReacquireConsent() {
        return this.mReacquireConsent;
    }

    void setShouldReacquireConsent(boolean z) {
        this.mReacquireConsent = z;
    }

    Boolean getGdprApplies() {
        return this.mGdprApplies;
    }

    void setGdprApplies(boolean z) {
        this.mGdprApplies = Boolean.valueOf(z);
    }

    String getUdid() {
        return this.mUdid;
    }

    void setUdid(String str) {
        this.mUdid = str;
    }

    String getLastChangedMs() {
        return this.mLastChangedMs;
    }

    void setLastChangedMs(String str) {
        this.mLastChangedMs = str;
    }

    ConsentStatus getConsentStatusBeforeDnt() {
        return this.mConsentStatusBeforeDnt;
    }

    void setConsentStatusBeforeDnt(ConsentStatus consentStatus) {
        this.mConsentStatusBeforeDnt = consentStatus;
    }

    @VisibleForTesting
    static String replaceLanguageMacro(String str, Context context, String str2) {
        Preconditions.checkNotNull(context);
        return TextUtils.isEmpty(str) ? "" : str.replaceAll(LANGUAGE_MACRO_KEY, validateLanguage(context, str2));
    }

    private static String validateLanguage(Context context, String str) {
        Preconditions.checkNotNull(context);
        for (String str2 : Locale.getISOLanguages()) {
            if (str2 != null && str2.equals(str)) {
                return str;
            }
        }
        return ClientMetadata.getCurrentLanguage(context);
    }
}
