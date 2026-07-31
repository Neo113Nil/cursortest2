package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0005\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\f\u001a\u00020\u000e*\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFi1fSDK;", "", "", "p0", "p1", "values", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFh1wSDK;", "valueOf", "(Lcom/appsflyer/internal/AFh1wSDK;)Ljava/lang/String;", "", "(Ljava/lang/String;Z)Ljava/lang/String;", "AFInAppEventType", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri$Builder;", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/internal/AFi1hSDK;", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFi1hSDK;", "AFKeystoreWrapper", "<init>", "(Lcom/appsflyer/internal/AFd1pSDK;Lcom/appsflyer/internal/AFi1hSDK;)V", "AFa1tSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFi1fSDK {
    public static final String AFKeystoreWrapper;
    public static final String AFLogger;
    public static final String d;
    public static String e;
    public static final String registerClient;
    public static final String unregisterClient;
    private static final String v;
    public static final String valueOf;
    public static final String values;

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public final AFi1hSDK AFKeystoreWrapper;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public final AFd1pSDK valueOf;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFi1fSDK(AFd1pSDK aFd1pSDK) {
        this(aFd1pSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
    }

    private AFi1fSDK(AFd1pSDK aFd1pSDK, AFi1hSDK aFi1hSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(aFi1hSDK, "");
        this.valueOf = aFd1pSDK;
        this.AFKeystoreWrapper = aFi1hSDK;
    }

    public /* synthetic */ AFi1fSDK(AFd1pSDK aFd1pSDK, AFi1gSDK aFi1gSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1pSDK, (i & 2) != 0 ? new AFi1gSDK() : aFi1gSDK);
    }

    static {
        String obj = new StringBuilder().append(AFb1tSDK.AFInAppEventType).append("/androidevent?app_id=").toString();
        v = obj;
        values = new StringBuilder("https://%sattr.%s/api/v").append(obj).toString();
        AFKeystoreWrapper = "https://%sadrevenue.%s/api/v2/generic/v6.12.6/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.12.6/android?app_id=";
        unregisterClient = new StringBuilder("https://%sconversions.%s/api/v").append(obj).toString();
        AFLogger = new StringBuilder("https://%slaunches.%s/api/v").append(obj).toString();
        d = new StringBuilder("https://%sinapps.%s/api/v").append(obj).toString();
        registerClient = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        e = new StringBuilder("https://%svalidate.%s/api/v").append(AFb1tSDK.AFInAppEventType).append("/androidevent?buildnumber=6.12.6&app_id=").toString();
    }

    public final String values(String p0, String p1) {
        String packageName = this.valueOf.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String AFInAppEventParameterName = this.valueOf.AFInAppEventParameterName();
        String str = AFInAppEventParameterName;
        if (str != null && !StringsKt.isBlank(str)) {
            AFInAppEventParameterName = "-".concat(String.valueOf(StringsKt.trim((CharSequence) str).toString()));
        }
        if (AFInAppEventParameterName == null) {
            AFInAppEventParameterName = "";
        }
        Uri.Builder appendPath = Uri.parse(this.AFKeystoreWrapper.AFKeystoreWrapper("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(new StringBuilder().append(packageName).append(StringsKt.trim((CharSequence) AFInAppEventParameterName).toString()).toString());
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        String obj = AFInAppEventType(appendPath, p0, p1).appendQueryParameter("sdk_version", AFb1tSDK.AFInAppEventType).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    private static Uri.Builder AFInAppEventType(Uri.Builder builder, String str, String str2) {
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.afErrorLog(str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")));
            return builder;
        }
        builder.appendQueryParameter("af_sig", AFb1lSDK.AFInAppEventParameterName(new StringBuilder().append(str2).append(str).toString(), str));
        return builder;
    }

    public final String valueOf(AFh1wSDK p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof AFh1tSDK)) {
            if (!(p0 instanceof AFh1uSDK)) {
                throw new UnsupportedOperationException();
            }
            return new StringBuilder().append(this.AFKeystoreWrapper.AFKeystoreWrapper(e)).append(this.valueOf.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()).toString();
        }
        return this.AFKeystoreWrapper.AFKeystoreWrapper("https://%ssdk-services.%s/validate-android-signature");
    }

    public static String valueOf(String str, boolean z) {
        return new StringBuilder().append(str).append(!z ? "&buildnumber=6.12.6" : "").toString();
    }

    public final String AFInAppEventType(String str) {
        StringBuilder append = new StringBuilder().append(str);
        String AFInAppEventParameterName = this.valueOf.AFInAppEventParameterName();
        String concat = AFInAppEventParameterName != null ? "&channel=".concat(String.valueOf(AFInAppEventParameterName)) : null;
        if (concat == null) {
            concat = "";
        }
        return append.append(concat).toString();
    }
}
