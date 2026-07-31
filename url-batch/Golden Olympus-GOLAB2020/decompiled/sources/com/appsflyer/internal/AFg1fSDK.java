package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFg1fSDK extends AFg1gSDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getRevenue = iArr;
        }
    }

    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static boolean AFAdRevenueData(AFLogger.LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void getCurrencyIso4217Code(AFLogger.LogLevel logLevel, AFg1cSDK aFg1cSDK, String str, Throwable th) {
        if (AFAdRevenueData(logLevel)) {
            String revenue = getRevenue(str, aFg1cSDK);
            int i4 = AFa1tSDK.getRevenue[logLevel.ordinal()];
            if (i4 == 1) {
                Log.d("AppsFlyer_6.17.0", revenue);
                return;
            }
            if (i4 == 2) {
                Log.i("AppsFlyer_6.17.0", revenue);
                return;
            }
            if (i4 == 3) {
                Log.w("AppsFlyer_6.17.0", revenue);
            } else if (i4 == 4) {
                Log.v("AppsFlyer_6.17.0", revenue);
            } else {
                if (i4 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.17.0", revenue, th);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z5) {
            getCurrencyIso4217Code(AFLogger.LogLevel.ERROR, aFg1cSDK, str, th);
        } else if (z4) {
            getCurrencyIso4217Code(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.17.0", withTag$SDK_prodRelease(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.INFO, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.VERBOSE, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        getCurrencyIso4217Code(AFLogger.LogLevel.WARNING, aFg1cSDK, str, null);
    }
}
