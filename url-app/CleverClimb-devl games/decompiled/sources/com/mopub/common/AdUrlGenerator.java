package com.mopub.common;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.mopub.common.ClientMetadata;
import com.mopub.common.privacy.ConsentData;
import com.mopub.common.privacy.PersonalInfoManager;
import com.mopub.common.util.DateAndTime;
import com.tapjoy.TJAdUnitConstants;

/* loaded from: classes2.dex */
public abstract class AdUrlGenerator extends BaseUrlGenerator {
    private static final String ADVANCED_BIDDING_TOKENS_KEY = "abt";
    private static final String CARRIER_NAME_KEY = "cn";
    private static final String CARRIER_TYPE_KEY = "ct";
    private static final String CONSENTED_PRIVACY_POLICY_VERSION = "consented_privacy_policy_version";
    private static final String CONSENTED_VENDOR_LIST_VERSION = "consented_vendor_list_version";
    private static final String COUNTRY_CODE_KEY = "iso";
    private static final String CURRENT_CONSENT_STATUS = "current_consent_status";
    private static final String GDPR_APPLIES = "gdpr_applies";
    private static final String IS_MRAID_KEY = "mr";
    private static final String KEYWORDS_KEY = "q";
    private static final String LAT_LONG_ACCURACY_KEY = "lla";
    private static final String LAT_LONG_FRESHNESS_KEY = "llf";
    private static final String LAT_LONG_FROM_SDK_KEY = "llsdk";
    private static final String LAT_LONG_KEY = "ll";
    private static final String MOBILE_COUNTRY_CODE_KEY = "mcc";
    private static final String MOBILE_NETWORK_CODE_KEY = "mnc";
    private static final String ORIENTATION_KEY = "o";
    private static final String SCREEN_SCALE_KEY = "sc";
    private static final String TIMEZONE_OFFSET_KEY = "z";
    private static final String USER_DATA_KEYWORDS_KEY = "user_data_q";
    private static final String VIEWABILITY_KEY = "vv";
    protected String mAdUnitId;
    private final ConsentData mConsentData;
    protected Context mContext;
    protected String mKeywords;
    protected Location mLocation;
    private final PersonalInfoManager mPersonalInfoManager = MoPub.getPersonalInformationManager();
    protected String mUserDataKeywords;

    @Deprecated
    public AdUrlGenerator withFacebookSupported(boolean z) {
        return this;
    }

    public AdUrlGenerator(Context context) {
        this.mContext = context;
        if (this.mPersonalInfoManager == null) {
            this.mConsentData = null;
        } else {
            this.mConsentData = this.mPersonalInfoManager.getConsentData();
        }
    }

    public AdUrlGenerator withAdUnitId(String str) {
        this.mAdUnitId = str;
        return this;
    }

    public AdUrlGenerator withKeywords(String str) {
        this.mKeywords = str;
        return this;
    }

    public AdUrlGenerator withUserDataKeywords(String str) {
        this.mUserDataKeywords = str;
        return this;
    }

    public AdUrlGenerator withLocation(Location location) {
        this.mLocation = location;
        return this;
    }

    protected void setAdUnitId(String str) {
        addParam("id", str);
    }

    protected void setSdkVersion(String str) {
        addParam("nv", str);
    }

    protected void setKeywords(String str) {
        addParam(KEYWORDS_KEY, str);
    }

    protected void setUserDataKeywords(String str) {
        if (MoPub.canCollectPersonalInformation()) {
            addParam(USER_DATA_KEYWORDS_KEY, str);
        }
    }

    protected void setLocation(Location location) {
        if (MoPub.canCollectPersonalInformation()) {
            Location lastKnownLocation = LocationService.getLastKnownLocation(this.mContext, MoPub.getLocationPrecision(), MoPub.getLocationAwareness());
            if (lastKnownLocation != null && (location == null || lastKnownLocation.getTime() >= location.getTime())) {
                location = lastKnownLocation;
            }
            if (location != null) {
                addParam(LAT_LONG_KEY, location.getLatitude() + "," + location.getLongitude());
                addParam(LAT_LONG_ACCURACY_KEY, String.valueOf((int) location.getAccuracy()));
                addParam(LAT_LONG_FRESHNESS_KEY, String.valueOf(calculateLocationStalenessInMilliseconds(location)));
                if (location == lastKnownLocation) {
                    addParam(LAT_LONG_FROM_SDK_KEY, "1");
                }
            }
        }
    }

    protected void setTimezone(String str) {
        addParam(TIMEZONE_OFFSET_KEY, str);
    }

    protected void setOrientation(String str) {
        addParam(ORIENTATION_KEY, str);
    }

    protected void setDensity(float f) {
        addParam("sc", "" + f);
    }

    protected void setMraidFlag(boolean z) {
        if (z) {
            addParam(IS_MRAID_KEY, "1");
        }
    }

    protected void setMccCode(String str) {
        addParam(MOBILE_COUNTRY_CODE_KEY, str == null ? "" : str.substring(0, mncPortionLength(str)));
    }

    protected void setMncCode(String str) {
        addParam(MOBILE_NETWORK_CODE_KEY, str == null ? "" : str.substring(mncPortionLength(str)));
    }

    protected void setIsoCountryCode(String str) {
        addParam(COUNTRY_CODE_KEY, str);
    }

    protected void setCarrierName(String str) {
        addParam(CARRIER_NAME_KEY, str);
    }

    protected void setNetworkType(ClientMetadata.MoPubNetworkType moPubNetworkType) {
        addParam(CARRIER_TYPE_KEY, moPubNetworkType);
    }

    protected void setBundleId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        addParam(TJAdUnitConstants.String.BUNDLE, str);
    }

    protected void enableViewability(String str) {
        Preconditions.checkNotNull(str);
        addParam(VIEWABILITY_KEY, str);
    }

    protected void setAdvancedBiddingTokens() {
        addParam(ADVANCED_BIDDING_TOKENS_KEY, MoPub.getAdvancedBiddingTokensJson(this.mContext));
    }

    protected void setGdprApplies() {
        if (this.mPersonalInfoManager != null) {
            addParam(GDPR_APPLIES, this.mPersonalInfoManager.gdprApplies());
        }
    }

    protected void setCurrentConsentStatus() {
        if (this.mPersonalInfoManager != null) {
            addParam(CURRENT_CONSENT_STATUS, this.mPersonalInfoManager.getPersonalInfoConsentStatus().getValue());
        }
    }

    protected void setConsentedPrivacyPolicyVersion() {
        if (this.mConsentData != null) {
            addParam(CONSENTED_PRIVACY_POLICY_VERSION, this.mConsentData.getConsentedPrivacyPolicyVersion());
        }
    }

    protected void setConsentedVendorListVersion() {
        if (this.mConsentData != null) {
            addParam(CONSENTED_VENDOR_LIST_VERSION, this.mConsentData.getConsentedVendorListVersion());
        }
    }

    protected void addBaseParams(ClientMetadata clientMetadata) {
        setAdUnitId(this.mAdUnitId);
        setSdkVersion(clientMetadata.getSdkVersion());
        setDeviceInfo(clientMetadata.getDeviceManufacturer(), clientMetadata.getDeviceModel(), clientMetadata.getDeviceProduct());
        setBundleId(clientMetadata.getAppPackageName());
        setKeywords(this.mKeywords);
        if (MoPub.canCollectPersonalInformation()) {
            setUserDataKeywords(this.mUserDataKeywords);
            setLocation(this.mLocation);
        }
        setTimezone(DateAndTime.getTimeZoneOffsetString());
        setOrientation(clientMetadata.getOrientationString());
        setDeviceDimensions(clientMetadata.getDeviceDimensions());
        setDensity(clientMetadata.getDensity());
        String networkOperatorForUrl = clientMetadata.getNetworkOperatorForUrl();
        setMccCode(networkOperatorForUrl);
        setMncCode(networkOperatorForUrl);
        setIsoCountryCode(clientMetadata.getIsoCountryCode());
        setCarrierName(clientMetadata.getNetworkOperatorName());
        setNetworkType(clientMetadata.getActiveNetworkType());
        setAppVersion(clientMetadata.getAppVersion());
        setAdvancedBiddingTokens();
        appendAdvertisingInfoTemplates();
        setGdprApplies();
        setCurrentConsentStatus();
        setConsentedPrivacyPolicyVersion();
        setConsentedVendorListVersion();
    }

    private void addParam(String str, ClientMetadata.MoPubNetworkType moPubNetworkType) {
        addParam(str, moPubNetworkType.toString());
    }

    private int mncPortionLength(String str) {
        return Math.min(3, str.length());
    }

    private static int calculateLocationStalenessInMilliseconds(Location location) {
        Preconditions.checkNotNull(location);
        return (int) (System.currentTimeMillis() - location.getTime());
    }
}
