package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFj1xSDK {
    public static final String AFInAppEventParameterName;
    public static final String AFLogger;
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f5975d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f5976e;
    public static final String registerClient;
    public static String unregisterClient;
    public static final String valueOf;
    public static final String values;

    /* renamed from: w, reason: collision with root package name */
    private static final String f5977w;
    public final AFd1sSDK AFInAppEventType;
    public final AFj1uSDK AFKeystoreWrapper;

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = AFb1vSDK.AFInAppEventParameterName;
        sb.append(str);
        sb.append("/androidevent?app_id=");
        String obj = sb.toString();
        f5977w = obj;
        StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(obj);
        values = sb2.toString();
        AFInAppEventParameterName = "https://%sadrevenue.%s/api/v2/generic/v6.14.0/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.14.0/android?app_id=";
        StringBuilder sb3 = new StringBuilder("https://%sconversions.%s/api/v");
        sb3.append(obj);
        AFLogger = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%slaunches.%s/api/v");
        sb4.append(obj);
        f5976e = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sinapps.%s/api/v");
        sb5.append(obj);
        registerClient = sb5.toString();
        f5975d = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        StringBuilder sb6 = new StringBuilder("https://%svalidate.%s/api/v");
        sb6.append(str);
        sb6.append("/androidevent?buildnumber=6.14.0&app_id=");
        unregisterClient = sb6.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1xSDK(AFd1sSDK aFd1sSDK) {
        this(aFd1sSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
    }

    public static Uri.Builder AFInAppEventParameterName(Uri.Builder builder, String str, String str2) {
        if (str != null && str2 != null) {
            builder.appendQueryParameter("af_sig", AFb1lSDK.AFKeystoreWrapper(str2.concat(str), str));
            return builder;
        }
        String str3 = str == null ? "devKey" : "timestamp";
        AFLogger.afErrorLog(str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")));
        return builder;
    }

    public static String AFInAppEventType(String str, boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(!z4 ? "&buildnumber=6.14.0" : "");
        return sb.toString();
    }

    public final String valueOf(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String d4 = this.AFInAppEventType.d();
        String concat = d4 != null ? "&channel=".concat(d4) : null;
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        return sb.toString();
    }

    private AFj1xSDK(AFd1sSDK aFd1sSDK, AFj1uSDK aFj1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFj1uSDK, "");
        this.AFInAppEventType = aFd1sSDK;
        this.AFKeystoreWrapper = aFj1uSDK;
    }

    public /* synthetic */ AFj1xSDK(AFd1sSDK aFd1sSDK, AFj1uSDK aFj1uSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, (i2 & 2) != 0 ? new AFj1tSDK() : aFj1uSDK);
    }

    public static String valueOf() {
        return "https://aps-webhandler.appsflyer.com/api/trigger";
    }

    public final String AFInAppEventParameterName(AFh1kSDK aFh1kSDK) {
        Intrinsics.checkNotNullParameter(aFh1kSDK, "");
        if (aFh1kSDK instanceof AFh1nSDK) {
            return this.AFKeystoreWrapper.AFInAppEventParameterName("https://%ssdk-services.%s/validate-android-signature");
        }
        if (aFh1kSDK instanceof AFh1lSDK) {
            String AFInAppEventParameterName2 = this.AFKeystoreWrapper.AFInAppEventParameterName(unregisterClient);
            StringBuilder sb = new StringBuilder();
            sb.append(AFInAppEventParameterName2);
            sb.append(this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
            return sb.toString();
        }
        throw new UnsupportedOperationException();
    }
}
