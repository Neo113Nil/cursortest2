package com.appsflyer.internal;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFg1zSDK {
    public static final String AFInAppEventType;
    public static final String AFKeystoreWrapper;
    public static final String AFLogger;
    public static String AFLogger$LogLevel;
    public static String AFVersionDeclaration;
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    public static final String afDebugLog;
    public static String afErrorLog;
    private static final String afErrorLogForExcManagerOnly;
    public static String afInfoLog;
    public static final String afRDLog;
    public static String afWarnLog;
    public static String getLevel;
    public static final String valueOf;
    public final AFc1zSDK AFInAppEventParameterName;
    public final AFg1wSDK values;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(AFa1dSDK.AFKeystoreWrapper);
        sb.append("/androidevent?app_id=");
        String obj = sb.toString();
        afErrorLogForExcManagerOnly = obj;
        StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(obj);
        valueOf = sb2.toString();
        AFKeystoreWrapper = "https://%sadrevenue.%s/api/v2/generic/v6.12.1/android?app_id=";
        AFInAppEventType = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.12.1/android?app_id=";
        StringBuilder sb3 = new StringBuilder("https://%sconversions.%s/api/v");
        sb3.append(obj);
        AFLogger = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%slaunches.%s/api/v");
        sb4.append(obj);
        afDebugLog = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sinapps.%s/api/v");
        sb5.append(obj);
        afRDLog = sb5.toString();
    }

    private AFg1zSDK(AFc1zSDK aFc1zSDK, AFg1wSDK aFg1wSDK) {
        aFc1zSDK.getClass();
        aFg1wSDK.getClass();
        this.AFInAppEventParameterName = aFc1zSDK;
        this.values = aFg1wSDK;
    }

    public static String valueOf(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(!z ? "&buildnumber=6.12.1" : BuildConfig.FLAVOR);
        return sb.toString();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1vSDK {
        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AFa1vSDK() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFg1zSDK(AFc1zSDK aFc1zSDK) {
        this(aFc1zSDK, null, 2, 0 == true ? 1 : 0);
        aFc1zSDK.getClass();
    }

    public /* synthetic */ AFg1zSDK(AFc1zSDK aFc1zSDK, AFg1wSDK aFg1wSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1zSDK, (i & 2) != 0 ? new AFf1aSDK() : aFg1wSDK);
    }
}
