package com.mopub.common;

import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import com.mopub.network.Networking;
import com.mopub.network.PlayServicesUrlRewriter;

/* loaded from: classes2.dex */
public abstract class BaseUrlGenerator {
    protected static final String AD_UNIT_ID_KEY = "id";
    protected static final String BUNDLE_ID_KEY = "bundle";
    protected static final String CONSENTED_PRIVACY_POLICY_VERSION_KEY = "consented_privacy_policy_version";
    protected static final String CONSENTED_VENDOR_LIST_VERSION_KEY = "consented_vendor_list_version";
    protected static final String CURRENT_CONSENT_STATUS_KEY = "current_consent_status";
    protected static final String DNT_KEY = "dnt";
    protected static final String GDPR_APPLIES = "gdpr_applies";
    private static final String HEIGHT_KEY = "h";
    protected static final String SDK_VERSION_KEY = "nv";
    protected static final String UDID_KEY = "udid";
    private static final String WIDTH_KEY = "w";
    private boolean mFirstParam;
    private StringBuilder mStringBuilder;

    public abstract String generateUrlString(String str);

    protected void initUrlString(String str, String str2) {
        StringBuilder sb = new StringBuilder(Networking.getScheme());
        sb.append("://");
        sb.append(str);
        sb.append(str2);
        this.mStringBuilder = sb;
        this.mFirstParam = true;
    }

    protected String getFinalUrlString() {
        return this.mStringBuilder.toString();
    }

    protected void addParam(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.mStringBuilder.append(getParamDelimiter());
        this.mStringBuilder.append(str);
        this.mStringBuilder.append("=");
        this.mStringBuilder.append(Uri.encode(str2));
    }

    protected void addParam(String str, Boolean bool) {
        if (bool == null) {
            return;
        }
        this.mStringBuilder.append(getParamDelimiter());
        this.mStringBuilder.append(str);
        this.mStringBuilder.append("=");
        this.mStringBuilder.append(bool.booleanValue() ? "1" : "0");
    }

    private String getParamDelimiter() {
        if (!this.mFirstParam) {
            return "&";
        }
        this.mFirstParam = false;
        return "?";
    }

    protected void setApiVersion(String str) {
        addParam("v", str);
    }

    protected void setAppVersion(String str) {
        addParam("av", str);
    }

    protected void setExternalStoragePermission(boolean z) {
        addParam("android_perms_ext_storage", z ? "1" : "0");
    }

    protected void setDeviceInfo(String... strArr) {
        StringBuilder sb = new StringBuilder();
        if (strArr == null || strArr.length < 1) {
            return;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            sb.append(strArr[i]);
            sb.append(",");
        }
        sb.append(strArr[strArr.length - 1]);
        addParam("dn", sb.toString());
    }

    protected void setDoNotTrack(boolean z) {
        if (z) {
            addParam(DNT_KEY, "1");
        }
    }

    protected void setUdid(String str) {
        addParam("udid", str);
    }

    protected void appendAdvertisingInfoTemplates() {
        addParam("udid", PlayServicesUrlRewriter.UDID_TEMPLATE);
        addParam(DNT_KEY, PlayServicesUrlRewriter.DO_NOT_TRACK_TEMPLATE);
    }

    protected void setDeviceDimensions(Point point) {
        addParam(WIDTH_KEY, "" + point.x);
        addParam(HEIGHT_KEY, "" + point.y);
    }
}
