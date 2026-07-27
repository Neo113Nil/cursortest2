package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFg1hSDK extends AFg1fSDK {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            AFKeystoreWrapper = iArr;
        }
    }

    private static boolean AFInAppEventType(AFLogger.LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void values(AFLogger.LogLevel logLevel, AFg1aSDK aFg1aSDK, String str, Throwable th) {
        if (AFInAppEventType(logLevel)) {
            String values = values(str, aFg1aSDK);
            int i2 = AFa1zSDK.AFKeystoreWrapper[logLevel.ordinal()];
            if (i2 == 1) {
                Log.d("AppsFlyer_6.14.0", values);
                return;
            }
            if (i2 == 2) {
                Log.i("AppsFlyer_6.14.0", values);
                return;
            }
            if (i2 == 3) {
                Log.w("AppsFlyer_6.14.0", values);
            } else if (i2 == 4) {
                Log.v("AppsFlyer_6.14.0", values);
            } else {
                if (i2 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.14.0", values, th);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        values(AFLogger.LogLevel.DEBUG, aFg1aSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z5) {
            values(AFLogger.LogLevel.ERROR, aFg1aSDK, str, th);
        } else if (z4) {
            values(AFLogger.LogLevel.DEBUG, aFg1aSDK, str, null);
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.14.0", withTag$SDK_prodRelease(str, aFg1aSDK));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        values(AFLogger.LogLevel.INFO, aFg1aSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        values(AFLogger.LogLevel.VERBOSE, aFg1aSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        values(AFLogger.LogLevel.WARNING, aFg1aSDK, str, null);
    }
}
