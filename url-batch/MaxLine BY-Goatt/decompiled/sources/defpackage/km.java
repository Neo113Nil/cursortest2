package defpackage;

import android.app.Application;
import android.app.Notification;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class km {
    public static String a;
    public static int b;
    public static Boolean c;

    public static Typeface a(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static List d(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] e(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String f() {
        BufferedReader bufferedReader;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int i = b;
                if (i == 0) {
                    i = Process.myPid();
                    b = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        String str2 = "/proc/" + i + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                ll3.v(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                a = str;
            }
        }
        return a;
    }

    public static int g(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String h(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params n(bh bhVar) {
        return bhVar.getTextMetricsParams();
    }

    public static int o(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri p(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void q(View view) {
        view.resetPivot();
    }

    public static void r(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void s(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void t(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void u(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static void v(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final void w(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static boolean x(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static boolean y() {
        Boolean bool = c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke == null) {
                        throw new hx(ci2.m(objArr));
                    }
                    bool = (Boolean) invoke;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            c = bool;
        }
        return bool.booleanValue();
    }
}
