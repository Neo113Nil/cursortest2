package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class xc0 {
    public static i60 a(j6 j6Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new i60(bj.h(j6Var));
        }
        TextPaint textPaint = new TextPaint(j6Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = j6Var.getBreakStrategy();
        int hyphenationFrequency = j6Var.getHyphenationFrequency();
        if (j6Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (j6Var.getInputType() & 15) != 3) {
                boolean z = j6Var.getLayoutDirection() == 1;
                switch (j6Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(bj.b(DecimalFormatSymbols.getInstance(j6Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new i60(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static PorterDuff.Mode b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void c(TextView textView, int i) {
        bi.o(i);
        if (Build.VERSION.SDK_INT >= 28) {
            bj.i(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void d(TextView textView, int i) {
        bi.o(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void e(TextView textView, int i) {
        bi.o(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final Object f(vb0 vb0Var, vb0 vb0Var2, xr xrVar) {
        Object ldVar;
        Object G;
        try {
            gk0.b(xrVar);
            ldVar = xrVar.g(vb0Var2, vb0Var);
        } catch (Throwable th) {
            ldVar = new ld(th, false);
        }
        bh bhVar = bh.COROUTINE_SUSPENDED;
        if (ldVar == bhVar || (G = vb0Var.G(ldVar)) == n9.h) {
            return bhVar;
        }
        if (G instanceof ld) {
            throw ((ld) G).a;
        }
        return n9.T(G);
    }

    public static final long g(String str, long j, long j2, long j3) {
        String str2;
        boolean z;
        int i = bh0.a;
        Long l = null;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        int i2 = 10;
        d50.f(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (mv.i(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i3 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (true) {
                if (i3 < length) {
                    int digit = Character.digit((int) str2.charAt(i3), i2);
                    if (digit < 0) {
                        break;
                    }
                    if (j5 < j6) {
                        if (j6 != -256204778801521550L) {
                            break;
                        }
                        j6 = j4 / 10;
                        if (j5 < j6) {
                            break;
                        }
                    }
                    long j7 = j5 * 10;
                    int i4 = length;
                    long j8 = digit;
                    if (j7 < j4 + j8) {
                        break;
                    }
                    j5 = j7 - j8;
                    i3++;
                    length = i4;
                    i2 = 10;
                } else {
                    l = z ? Long.valueOf(j5) : Long.valueOf(-j5);
                }
            }
        }
        if (l == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = l.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static int h(String str, int i, int i2) {
        return (int) g(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static ActionMode.Callback i(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof vh0) || callback == null) ? callback : new vh0(callback, textView);
    }
}
