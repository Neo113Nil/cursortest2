package com.tapjoy;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.gx;
import com.tapjoy.internal.ha;

/* loaded from: classes2.dex */
public class TapjoyLog {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7783a = "TapjoyLog";

    /* renamed from: c, reason: collision with root package name */
    private static int f7785c = 4;

    /* renamed from: d, reason: collision with root package name */
    private static int f7786d = 2;
    private static boolean e;

    /* renamed from: b, reason: collision with root package name */
    private static int f7784b = 6;
    private static int f = f7784b;

    public static void setDebugEnabled(boolean z) {
        boolean z2;
        e = z;
        ha a2 = ha.a();
        if (gx.f8223a != z) {
            gx.f8223a = z;
            if (z) {
                gx.a("The debug mode has been enabled");
            } else {
                gx.a("The debug mode has been disabled");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z && a2.k) {
            a2.i.a();
        }
        if (e) {
            a(TapjoyConstants.LOG_LEVEL_DEBUG_ON, false);
        } else {
            a(TapjoyConstants.LOG_LEVEL_DEBUG_OFF, false);
        }
    }

    public static void setInternalLogging(boolean z) {
        if (z) {
            a("internal", true);
        }
    }

    @TargetApi(19)
    static void a(String str, boolean z) {
        if (!z && TapjoyAppSettings.getInstance() != null && TapjoyAppSettings.getInstance().f7745a != null) {
            d(f7783a, "setLoggingLevel -- log setting already persisted");
            return;
        }
        if (str.equals("internal")) {
            f = f7786d;
            if (Build.VERSION.SDK_INT >= 19) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tapjoy.TapjoyLog.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TapjoyLog.d(TapjoyLog.f7783a, "Enabling WebView debugging");
                        WebView.setWebContentsDebuggingEnabled(true);
                    }
                });
            }
        } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_ON)) {
            f = f7785c;
        } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_OFF)) {
            f = f7784b;
        } else {
            d(f7783a, "unrecognized loggingLevel: " + str);
            f = f7784b;
        }
        d(f7783a, "logThreshold=" + f);
    }

    public static boolean isLoggingEnabled() {
        return e;
    }

    public static void i(String str, String str2) {
        a(4, str, str2);
    }

    public static void e(String str, String str2) {
        e(str, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTERNAL_ERROR, str2));
    }

    public static void e(String str, TapjoyErrorMessage tapjoyErrorMessage) {
        if (tapjoyErrorMessage != null) {
            if (f == f7786d || tapjoyErrorMessage.getType() != TapjoyErrorMessage.ErrorType.INTERNAL_ERROR) {
                a(6, str, tapjoyErrorMessage.toString());
            }
        }
    }

    public static void w(String str, String str2) {
        a(5, str, str2);
    }

    public static void d(String str, String str2) {
        a(3, str, str2);
    }

    public static void v(String str, String str2) {
        a(2, str, str2);
    }

    private static void a(int i, String str, String str2) {
        String str3 = f7783a + ":" + str;
        if (f <= i) {
            if (str2.length() > 4096) {
                int i2 = 0;
                while (i2 <= str2.length() / 4096) {
                    int i3 = i2 * 4096;
                    i2++;
                    int i4 = i2 * 4096;
                    if (i4 > str2.length()) {
                        i4 = str2.length();
                    }
                    Log.println(i, str3, str2.substring(i3, i4));
                }
                return;
            }
            Log.println(i, str3, str2);
        }
    }
}
