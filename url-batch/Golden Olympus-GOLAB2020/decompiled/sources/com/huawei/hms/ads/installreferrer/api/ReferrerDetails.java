package com.huawei.hms.ads.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes.dex */
public class ReferrerDetails {
    public static final String KEY_GRS_COUNTRY_CODE = "grs_country_code";
    public static final String KEY_INSTALL_BEGIN_TIMESTAMP = "install_begin_timestamp_seconds";
    private static final String KEY_INSTALL_CHANNEL = "install_channel";
    public static final String KEY_INSTALL_REFERRER = "install_referrer";
    public static final String KEY_REFERRER_CLICK_TIMESTAMP = "referrer_click_timestamp_seconds";
    private static final long MILLISECOND_IN_SECONDE = 1000;
    private static final int MILLISECOND_MIN_LEN = 13;
    private final Bundle mOriginalBundle;

    public ReferrerDetails(Bundle bundle) {
        this.mOriginalBundle = bundle;
    }

    private long getMilliseconds(long j4) {
        return String.valueOf(j4).length() < 13 ? j4 * MILLISECOND_IN_SECONDE : j4;
    }

    private long getSeconds(long j4) {
        return String.valueOf(j4).length() >= 13 ? j4 / MILLISECOND_IN_SECONDE : j4;
    }

    public String getGrsCountryCode() {
        return this.mOriginalBundle.getString(KEY_GRS_COUNTRY_CODE);
    }

    public long getInstallBeginTimestampMillisecond() {
        return getMilliseconds(this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP));
    }

    public long getInstallBeginTimestampSeconds() {
        return getSeconds(this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP));
    }

    public String getInstallChannel() {
        return this.mOriginalBundle.getString(KEY_INSTALL_CHANNEL);
    }

    public String getInstallReferrer() {
        return this.mOriginalBundle.getString(KEY_INSTALL_REFERRER);
    }

    public long getReferrerClickTimestampMillisecond() {
        return getMilliseconds(this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP));
    }

    public long getReferrerClickTimestampSeconds() {
        return getSeconds(this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP));
    }

    public void setGrsCountryCode(String str) {
        this.mOriginalBundle.putString(KEY_GRS_COUNTRY_CODE, str);
    }

    public void setInstallChannel(String str) {
        this.mOriginalBundle.putString(KEY_INSTALL_CHANNEL, str);
    }

    public ReferrerDetails(String str, long j4, long j5) {
        Bundle bundle = new Bundle();
        this.mOriginalBundle = bundle;
        bundle.putString(KEY_INSTALL_REFERRER, str);
        bundle.putLong(KEY_REFERRER_CLICK_TIMESTAMP, j4);
        bundle.putLong(KEY_INSTALL_BEGIN_TIMESTAMP, j5);
    }
}
