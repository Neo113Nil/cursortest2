package com.mopub.common.privacy;

import com.mopub.common.Preconditions;

/* loaded from: classes2.dex */
public class SyncResponse {
    private final String mCallAgainAfterSecs;
    private final String mConsentChangeReason;
    private final String mCurrentPrivacyPolicyLink;
    private final String mCurrentPrivacyPolicyVersion;
    private final String mCurrentVendorListIabFormat;
    private final String mCurrentVendorListIabHash;
    private final String mCurrentVendorListLink;
    private final String mCurrentVendorListVersion;
    private final String mExtras;
    private final boolean mForceExplicitNo;
    private final boolean mInvalidateConsent;
    private final boolean mIsGdprRegion;
    private final boolean mIsWhitelisted;
    private final boolean mReacquireConsent;

    public boolean isGdprRegion() {
        return this.mIsGdprRegion;
    }

    public boolean isForceExplicitNo() {
        return this.mForceExplicitNo;
    }

    public boolean isInvalidateConsent() {
        return this.mInvalidateConsent;
    }

    public boolean isReacquireConsent() {
        return this.mReacquireConsent;
    }

    public boolean isWhitelisted() {
        return this.mIsWhitelisted;
    }

    public String getCurrentVendorListVersion() {
        return this.mCurrentVendorListVersion;
    }

    public String getCurrentVendorListLink() {
        return this.mCurrentVendorListLink;
    }

    public String getCurrentPrivacyPolicyVersion() {
        return this.mCurrentPrivacyPolicyVersion;
    }

    public String getCurrentPrivacyPolicyLink() {
        return this.mCurrentPrivacyPolicyLink;
    }

    public String getCurrentVendorListIabFormat() {
        return this.mCurrentVendorListIabFormat;
    }

    public String getCurrentVendorListIabHash() {
        return this.mCurrentVendorListIabHash;
    }

    public String getCallAgainAfterSecs() {
        return this.mCallAgainAfterSecs;
    }

    String getExtras() {
        return this.mExtras;
    }

    public String getConsentChangeReason() {
        return this.mConsentChangeReason;
    }

    private SyncResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str5);
        Preconditions.checkNotNull(str6);
        Preconditions.checkNotNull(str7);
        Preconditions.checkNotNull(str8);
        Preconditions.checkNotNull(str9);
        Preconditions.checkNotNull(str11);
        this.mIsGdprRegion = !"0".equals(str);
        this.mForceExplicitNo = "1".equals(str2);
        this.mInvalidateConsent = "1".equals(str3);
        this.mReacquireConsent = "1".equals(str4);
        this.mIsWhitelisted = "1".equals(str5);
        this.mCurrentVendorListVersion = str6;
        this.mCurrentVendorListLink = str7;
        this.mCurrentPrivacyPolicyVersion = str8;
        this.mCurrentPrivacyPolicyLink = str9;
        this.mCurrentVendorListIabFormat = str10;
        this.mCurrentVendorListIabHash = str11;
        this.mCallAgainAfterSecs = str12;
        this.mExtras = str13;
        this.mConsentChangeReason = str14;
    }

    public static class Builder {
        private String callAgainAfterSecs;
        private String consentChangeReason;
        private String currentPrivacyPolicyLink;
        private String currentPrivacyPolicyVersion;
        private String currentVendorListIabFormat;
        private String currentVendorListIabHash;
        private String currentVendorListLink;
        private String currentVendorListVersion;
        private String extras;
        private String forceExplicitNo;
        private String invalidateConsent;
        private String isGdprRegion;
        private String isWhitelisted;
        private String reacquireConsent;

        public Builder setIsGdprRegion(String str) {
            this.isGdprRegion = str;
            return this;
        }

        public Builder setForceExplicitNo(String str) {
            this.forceExplicitNo = str;
            return this;
        }

        public Builder setInvalidateConsent(String str) {
            this.invalidateConsent = str;
            return this;
        }

        public Builder setReacquireConsent(String str) {
            this.reacquireConsent = str;
            return this;
        }

        public Builder setIsWhitelisted(String str) {
            this.isWhitelisted = str;
            return this;
        }

        public Builder setCurrentVendorListVersion(String str) {
            this.currentVendorListVersion = str;
            return this;
        }

        public Builder setCurrentVendorListLink(String str) {
            this.currentVendorListLink = str;
            return this;
        }

        public Builder setCurrentPrivacyPolicyVersion(String str) {
            this.currentPrivacyPolicyVersion = str;
            return this;
        }

        public Builder setCurrentPrivacyPolicyLink(String str) {
            this.currentPrivacyPolicyLink = str;
            return this;
        }

        public Builder setCurrentVendorListIabFormat(String str) {
            this.currentVendorListIabFormat = str;
            return this;
        }

        public Builder setCurrentVendorListIabHash(String str) {
            this.currentVendorListIabHash = str;
            return this;
        }

        public Builder setCallAgainAfterSecs(String str) {
            this.callAgainAfterSecs = str;
            return this;
        }

        public Builder setExtras(String str) {
            this.extras = str;
            return this;
        }

        public Builder setConsentChangeReason(String str) {
            this.consentChangeReason = str;
            return this;
        }

        public SyncResponse build() {
            return new SyncResponse(this.isGdprRegion, this.forceExplicitNo, this.invalidateConsent, this.reacquireConsent, this.isWhitelisted, this.currentVendorListVersion, this.currentVendorListLink, this.currentPrivacyPolicyVersion, this.currentPrivacyPolicyLink, this.currentVendorListIabFormat, this.currentVendorListIabHash, this.callAgainAfterSecs, this.extras, this.consentChangeReason);
        }
    }
}
