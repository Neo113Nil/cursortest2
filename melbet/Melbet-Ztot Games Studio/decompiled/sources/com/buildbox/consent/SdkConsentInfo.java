package com.buildbox.consent;

/* loaded from: classes.dex */
public class SdkConsentInfo {
    private boolean didConsent = false;
    private String displayName;
    private String privacyPolicyUrl;
    private String sdkId;

    public SdkConsentInfo(String str, String str2, String str3) {
        this.sdkId = str;
        this.displayName = str2;
        this.privacyPolicyUrl = str3;
    }

    public String getSdkId() {
        return this.sdkId;
    }

    String getDisplayName() {
        return this.displayName;
    }

    String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public Boolean getConsent() {
        return Boolean.valueOf(this.didConsent);
    }

    public void setConsent(Boolean bool) {
        this.didConsent = bool.booleanValue();
    }
}
