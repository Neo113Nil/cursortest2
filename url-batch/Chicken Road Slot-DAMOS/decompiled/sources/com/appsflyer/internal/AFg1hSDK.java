package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ'\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\fJ'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fR\u0014\u0010\u0018\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "p0", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "getRevenue", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "AFa1zSDK"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFg1hSDK extends AFh1ySDK {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public /* synthetic */ class AFa1vSDK {
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

    private final void getRevenue(AFLogger.LogLevel p02, AFg1cSDK p12, String p22, Throwable p32) {
        if (getRevenue(p02)) {
            String mediationNetwork = getMediationNetwork(p22, p12);
            int i3 = AFa1vSDK.getRevenue[p02.ordinal()];
            if (i3 == 1) {
                Log.d("AppsFlyer_6.17.5", mediationNetwork);
                return;
            }
            if (i3 == 2) {
                Log.i("AppsFlyer_6.17.5", mediationNetwork);
                return;
            }
            if (i3 == 3) {
                Log.w("AppsFlyer_6.17.5", mediationNetwork);
            } else if (i3 == 4) {
                Log.v("AppsFlyer_6.17.5", mediationNetwork);
            } else {
                if (i3 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.17.5", mediationNetwork, p32);
            }
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK p02, String p12, boolean p22) {
        p02.getClass();
        p12.getClass();
        getRevenue(AFLogger.LogLevel.DEBUG, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK p02, String p12, Throwable p22, boolean p32, boolean p4, boolean p52, boolean p62) {
        p02.getClass();
        p12.getClass();
        p22.getClass();
        if (p4) {
            getRevenue(AFLogger.LogLevel.ERROR, p02, p12, p22);
        } else if (p32) {
            getRevenue(AFLogger.LogLevel.DEBUG, p02, p12, null);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK p02, String p12) {
        p02.getClass();
        p12.getClass();
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.17.5", withTag$SDK_prodRelease(p12, p02));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK p02, String p12, boolean p22) {
        p02.getClass();
        p12.getClass();
        getRevenue(AFLogger.LogLevel.INFO, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK p02, String p12, boolean p22) {
        p02.getClass();
        p12.getClass();
        getRevenue(AFLogger.LogLevel.VERBOSE, p02, p12, null);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK p02, String p12, boolean p22) {
        p02.getClass();
        p12.getClass();
        getRevenue(AFLogger.LogLevel.WARNING, p02, p12, null);
    }

    private static boolean getRevenue(AFLogger.LogLevel p02) {
        return p02.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }
}
