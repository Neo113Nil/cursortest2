package com.mopub.common;

import android.os.Build;
import com.mopub.common.privacy.AdvertisingId;
import com.mopub.network.AdResponse;
import com.tapjoy.TapjoyConstants;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public class AdReport implements Serializable {
    private static final String DATE_FORMAT_PATTERN = "M/d/yy hh:mm:ss a z";
    private static final long serialVersionUID = 1;
    private final AdResponse mAdResponse;
    private final String mAdUnitId;
    private final AdvertisingId mAdvertisingId;
    private final Locale mDeviceLocale;
    private final String mDeviceModel;
    private final String mSdkVersion;

    public AdReport(String str, ClientMetadata clientMetadata, AdResponse adResponse) {
        this.mAdUnitId = str;
        this.mSdkVersion = clientMetadata.getSdkVersion();
        this.mDeviceModel = clientMetadata.getDeviceModel();
        this.mDeviceLocale = clientMetadata.getDeviceLocale();
        this.mAdvertisingId = clientMetadata.getMoPubIdentifier().getAdvertisingInfo();
        this.mAdResponse = adResponse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        appendKeyValue(sb, "sdk_version", this.mSdkVersion);
        appendKeyValue(sb, "creative_id", this.mAdResponse.getDspCreativeId());
        appendKeyValue(sb, "platform_version", Integer.toString(Build.VERSION.SDK_INT));
        appendKeyValue(sb, "device_model", this.mDeviceModel);
        appendKeyValue(sb, "ad_unit_id", this.mAdUnitId);
        appendKeyValue(sb, "device_locale", this.mDeviceLocale == null ? null : this.mDeviceLocale.toString());
        appendKeyValue(sb, "device_id", this.mAdvertisingId.getIdentifier(MoPub.canCollectPersonalInformation()));
        appendKeyValue(sb, "network_type", this.mAdResponse.getNetworkType());
        appendKeyValue(sb, TapjoyConstants.TJC_PLATFORM, TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        appendKeyValue(sb, TapjoyConstants.TJC_TIMESTAMP, getFormattedTimeStamp(this.mAdResponse.getTimestamp()));
        appendKeyValue(sb, "ad_type", this.mAdResponse.getAdType());
        Object width = this.mAdResponse.getWidth();
        Object height = this.mAdResponse.getHeight();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (width == null) {
            width = "0";
        }
        sb2.append(width);
        sb2.append(", ");
        if (height == null) {
            height = "0";
        }
        sb2.append(height);
        sb2.append("}");
        appendKeyValue(sb, "ad_size", sb2.toString());
        return sb.toString();
    }

    public String getResponseString() {
        return this.mAdResponse.getStringBody();
    }

    public String getDspCreativeId() {
        return this.mAdResponse.getDspCreativeId();
    }

    private void appendKeyValue(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        sb.append("\n");
    }

    private String getFormattedTimeStamp(long j) {
        if (j != -1) {
            return new SimpleDateFormat(DATE_FORMAT_PATTERN, Locale.US).format(new Date(j));
        }
        return null;
    }
}
