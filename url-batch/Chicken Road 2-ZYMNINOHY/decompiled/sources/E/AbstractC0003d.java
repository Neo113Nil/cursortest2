package E;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.concurrent.Executor;
import k.C1233t;

/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0003d {
    public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long b(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor c(Context context) {
        return context.getMainExecutor();
    }

    public static int d(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String e(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params k(C1233t c1233t) {
        return c1233t.getTextMetricsParams();
    }

    public static int l(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri m(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void n(TextView textView, int i4) {
        textView.setFirstBaselineToTopHeight(i4);
    }

    public static void o(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
