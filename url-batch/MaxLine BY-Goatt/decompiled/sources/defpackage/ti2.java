package defpackage;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.majelw.libystne.R;
import java.lang.reflect.Modifier;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ti2 {
    public static void a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            ch2.h("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        } else if (Modifier.isAbstract(modifiers)) {
            ch2.h("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public static final int b(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int c(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static void d(lq lqVar) {
        lqVar.k(null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.c() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int e(int i, String str) {
        ag0 ag0Var;
        String str2;
        int i2;
        Integer num = null;
        if (ag0.d()) {
            ag0Var = ag0.a();
        }
        ag0Var = null;
        if (ag0Var != null) {
            if (!(ag0Var.c() == 1)) {
                lh.g("Not initialized yet");
                return 0;
            }
            j8.o(str, "charSequence cannot be null");
            mh mhVar = ag0Var.e.b;
            mhVar.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    f13[] f13VarArr = (f13[]) spanned.getSpans(i, i + 1, f13.class);
                    if (f13VarArr.length > 0) {
                        i2 = spanned.getSpanEnd(f13VarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((mg0) mhVar.A(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new mg0(i))).o;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.c() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int f(int i, String str) {
        ag0 ag0Var;
        Integer num = null;
        if (ag0.d()) {
            ag0Var = ag0.a();
        }
        ag0Var = null;
        if (ag0Var != null) {
            int b = ag0Var.b(str, Math.max(0, i - 1));
            Integer valueOf = Integer.valueOf(b);
            if (b != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final ViewParent g(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static t32 h(bh bhVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new t32(km.n(bhVar));
        }
        TextPaint textPaint = new TextPaint(bhVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = bhVar.getBreakStrategy();
        int hyphenationFrequency = bhVar.getHyphenationFrequency();
        if (bhVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (bhVar.getInputType() & 15) != 3) {
                boolean z = bhVar.getLayoutDirection() == 1;
                switch (bhVar.getTextDirection()) {
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
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
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
                byte directionality = Character.getDirectionality(km.e(DecimalFormatSymbols.getInstance(bhVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new t32(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void j(TextView textView, int i) {
        if (i < 0) {
            b71.t();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            km.r(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void k(TextView textView, int i) {
        if (i < 0) {
            b71.t();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void l(TextView textView, int i) {
        if (i < 0) {
            b71.t();
            return;
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback m(ActionMode.Callback callback) {
        return (!(callback instanceof uw2) || Build.VERSION.SDK_INT < 26) ? callback : ((uw2) callback).a;
    }

    public static ActionMode.Callback n(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof uw2) || callback == null) ? callback : new uw2(callback, textView);
    }

    public static kc3 o(qb3 qb3Var, js0 js0Var, ArrayList arrayList, boolean z) {
        kc3 kc3Var;
        ak2.n("reduce", 1, arrayList);
        ak2.o(2, "reduce", arrayList);
        kc3 x = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
        if (!(x instanceof zb3)) {
            lh.e("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            kc3Var = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
            if (kc3Var instanceof vb3) {
                lh.e("Failed to parse initial value");
                return null;
            }
        } else {
            if (qb3Var.n() == 0) {
                lh.g("Empty array with no initial value error");
                return null;
            }
            kc3Var = null;
        }
        zb3 zb3Var = (zb3) x;
        int n = qb3Var.n();
        int i = z ? 0 : n - 1;
        int i2 = z ? n - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (kc3Var == null) {
            kc3Var = qb3Var.o(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (qb3Var.q(i)) {
                kc3Var = zb3Var.h(js0Var, Arrays.asList(kc3Var, qb3Var.o(i), new xb3(Double.valueOf(i)), qb3Var));
                if (kc3Var instanceof vb3) {
                    lh.g("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return kc3Var;
    }

    public static qb3 p(qb3 qb3Var, js0 js0Var, ic3 ic3Var, Boolean bool, Boolean bool2) {
        qb3 qb3Var2 = new qb3();
        Iterator m = qb3Var.m();
        while (m.hasNext()) {
            int intValue = ((Integer) m.next()).intValue();
            if (qb3Var.q(intValue)) {
                kc3 h = ic3Var.h(js0Var, Arrays.asList(qb3Var.o(intValue), new xb3(Double.valueOf(intValue)), qb3Var));
                if (h.a().equals(bool)) {
                    break;
                }
                if (bool2 == null || h.a().equals(bool2)) {
                    qb3Var2.p(intValue, h);
                }
            }
        }
        return qb3Var2;
    }

    public abstract Object i(Class cls);
}
