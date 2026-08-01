package defpackage;

import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class wg {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params h(b6 b6Var) {
        return b6Var.getTextMetricsParams();
    }

    public static void i(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static boolean j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
