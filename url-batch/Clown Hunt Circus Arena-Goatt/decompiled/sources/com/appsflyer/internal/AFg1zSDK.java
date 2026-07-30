package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\u0018\u0000 \u00012\u00020\u0011:\u0001\u0001B\u001b\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\t\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFg1zSDK;", "AFa1vSDK", "Lcom/appsflyer/internal/AFg1wSDK;", "values", "Lcom/appsflyer/internal/AFg1wSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFc1zSDK;", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFc1zSDK;", "valueOf", "", "p0", "", "(Ljava/lang/String;Z)Ljava/lang/String;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1zSDK;Lcom/appsflyer/internal/AFg1wSDK;)V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFg1zSDK {
    public static final String AFInAppEventType;
    public static final String AFKeystoreWrapper;
    public static final String AFLogger;
    public static String AFLogger$LogLevel;
    public static String AFVersionDeclaration;
    public static final String afDebugLog;
    public static String afErrorLog;
    private static final String afErrorLogForExcManagerOnly;
    public static String afInfoLog;
    public static final String afRDLog;
    public static String afWarnLog;
    public static String getLevel;
    public static final String valueOf;

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public final AFc1zSDK valueOf;

    /* renamed from: values, reason: from kotlin metadata */
    public final AFg1wSDK AFKeystoreWrapper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFg1zSDK(AFc1zSDK aFc1zSDK) {
        this(aFc1zSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1zSDK, "");
    }

    private AFg1zSDK(AFc1zSDK aFc1zSDK, AFg1wSDK aFg1wSDK) {
        Intrinsics.checkNotNullParameter(aFc1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        this.valueOf = aFc1zSDK;
        this.AFKeystoreWrapper = aFg1wSDK;
    }

    public /* synthetic */ AFg1zSDK(AFc1zSDK aFc1zSDK, AFf1aSDK aFf1aSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1zSDK, (i & 2) != 0 ? new AFf1aSDK() : aFf1aSDK);
    }

    static {
        String obj = new StringBuilder().append(AFa1dSDK.AFKeystoreWrapper).append("/androidevent?app_id=").toString();
        afErrorLogForExcManagerOnly = obj;
        valueOf = new StringBuilder("https://%sattr.%s/api/v").append(obj).toString();
        AFKeystoreWrapper = "https://%sadrevenue.%s/api/v2/generic/v6.12.1/android?app_id=";
        AFInAppEventType = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.12.1/android?app_id=";
        AFLogger = new StringBuilder("https://%sconversions.%s/api/v").append(obj).toString();
        afDebugLog = new StringBuilder("https://%slaunches.%s/api/v").append(obj).toString();
        afRDLog = new StringBuilder("https://%sinapps.%s/api/v").append(obj).toString();
    }

    public static String valueOf(String str, boolean z) {
        return new StringBuilder().append(str).append(!z ? "&buildnumber=6.12.1" : "").toString();
    }
}
