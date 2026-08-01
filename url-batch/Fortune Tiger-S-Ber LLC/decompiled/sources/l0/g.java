package l0;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class g {
    public static ActionMode.Callback A(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof o0.h) || callback == null) ? callback : new o0.h(callback, textView);
    }

    public static void a(Throwable th, Throwable th2) {
        u2.c.e(th, "<this>");
        u2.c.e(th2, "exception");
        if (th != th2) {
            Integer num = q2.a.f3135a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = p2.a.f3018a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static p3.e b() {
        p3.e eVar = p3.e.f3025l;
        u2.c.b(eVar);
        p3.e eVar2 = eVar.f3027f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            p3.e.f3022i.await(p3.e.f3023j, TimeUnit.MILLISECONDS);
            p3.e eVar3 = p3.e.f3025l;
            u2.c.b(eVar3);
            if (eVar3.f3027f != null || System.nanoTime() - nanoTime < p3.e.f3024k) {
                return null;
            }
            return p3.e.f3025l;
        }
        long nanoTime2 = eVar2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            p3.e.f3022i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        p3.e eVar4 = p3.e.f3025l;
        u2.c.b(eVar4);
        eVar4.f3027f = eVar2.f3027f;
        eVar2.f3027f = null;
        return eVar2;
    }

    public static void c(long j4, p3.f fVar, int i4, ArrayList arrayList, int i5, int i6, ArrayList arrayList2) {
        int i7;
        int i8;
        ArrayList arrayList3;
        long j5;
        int i9;
        int i10 = i4;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i5 >= i6) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i5; i11 < i6; i11++) {
            if (((p3.i) arrayList4.get(i11)).a() < i10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        p3.i iVar = (p3.i) arrayList.get(i5);
        p3.i iVar2 = (p3.i) arrayList4.get(i6 - 1);
        if (i10 == iVar.a()) {
            int intValue = ((Number) arrayList5.get(i5)).intValue();
            int i12 = i5 + 1;
            p3.i iVar3 = (p3.i) arrayList4.get(i12);
            i7 = i12;
            i8 = intValue;
            iVar = iVar3;
        } else {
            i7 = i5;
            i8 = -1;
        }
        if (iVar.d(i10) == iVar2.d(i10)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i13 = 0;
            for (int i14 = i10; i14 < min && iVar.d(i14) == iVar2.d(i14); i14++) {
                i13++;
            }
            long j6 = 4;
            long j7 = (fVar.g / j6) + j4 + 2 + i13 + 1;
            fVar.z(-i13);
            fVar.z(i8);
            int i15 = i10 + i13;
            while (i10 < i15) {
                fVar.z(iVar.d(i10) & 255);
                i10++;
            }
            if (i7 + 1 == i6) {
                if (i15 != ((p3.i) arrayList4.get(i7)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.z(((Number) arrayList5.get(i7)).intValue());
                return;
            } else {
                p3.f fVar2 = new p3.f();
                fVar.z(((int) ((fVar2.g / j6) + j7)) * (-1));
                c(j7, fVar2, i15, arrayList4, i7, i6, arrayList5);
                fVar.w(fVar2);
                return;
            }
        }
        int i16 = 1;
        for (int i17 = i7 + 1; i17 < i6; i17++) {
            if (((p3.i) arrayList4.get(i17 - 1)).d(i10) != ((p3.i) arrayList4.get(i17)).d(i10)) {
                i16++;
            }
        }
        long j8 = 4;
        long j9 = (fVar.g / j8) + j4 + 2 + (i16 * 2);
        fVar.z(i16);
        fVar.z(i8);
        for (int i18 = i7; i18 < i6; i18++) {
            int d4 = ((p3.i) arrayList4.get(i18)).d(i10);
            if (i18 == i7 || d4 != ((p3.i) arrayList4.get(i18 - 1)).d(i10)) {
                fVar.z(d4 & 255);
            }
        }
        p3.f fVar3 = new p3.f();
        int i19 = i7;
        while (i19 < i6) {
            byte d5 = ((p3.i) arrayList4.get(i19)).d(i10);
            int i20 = i19 + 1;
            int i21 = i20;
            while (true) {
                if (i21 >= i6) {
                    i21 = i6;
                    break;
                } else if (d5 != ((p3.i) arrayList4.get(i21)).d(i10)) {
                    break;
                } else {
                    i21++;
                }
            }
            if (i20 == i21 && i10 + 1 == ((p3.i) arrayList4.get(i19)).a()) {
                fVar.z(((Number) arrayList5.get(i19)).intValue());
                arrayList3 = arrayList5;
                j5 = j9;
                i9 = i21;
            } else {
                fVar.z(((int) ((fVar3.g / j8) + j9)) * (-1));
                arrayList3 = arrayList5;
                j5 = j9;
                i9 = i21;
                c(j5, fVar3, i10 + 1, arrayList, i19, i9, arrayList3);
                arrayList4 = arrayList;
            }
            j9 = j5;
            i19 = i9;
            arrayList5 = arrayList3;
        }
        fVar.w(fVar3);
    }

    public static final void g(int i4, int i5) {
        if (i4 <= i5) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i5 + ").");
    }

    public static int h(Context context, int i4, int i5) {
        TypedValue X = k3.d.X(context.getTheme(), i4);
        Integer valueOf = X != null ? Integer.valueOf(t(context, X)) : null;
        return valueOf != null ? valueOf.intValue() : i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class i(z2.a aVar) {
        u2.c.e(aVar, "<this>");
        Class a4 = ((u2.a) aVar).a();
        if (a4.isPrimitive()) {
            String name = a4.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a4;
    }

    public static final int j(int i4, int i5, int i6) {
        if (i6 > 0) {
            if (i4 < i5) {
                int i7 = i5 % i6;
                if (i7 < 0) {
                    i7 += i6;
                }
                int i8 = i4 % i6;
                if (i8 < 0) {
                    i8 += i6;
                }
                int i9 = (i7 - i8) % i6;
                if (i9 < 0) {
                    i9 += i6;
                }
                return i5 - i9;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i4 > i5) {
                int i10 = -i6;
                int i11 = i4 % i10;
                if (i11 < 0) {
                    i11 += i10;
                }
                int i12 = i5 % i10;
                if (i12 < 0) {
                    i12 += i10;
                }
                int i13 = (i11 - i12) % i10;
                if (i13 < 0) {
                    i13 += i10;
                }
                return i13 + i5;
            }
        }
        return i5;
    }

    public static i0.c k(z0 z0Var) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new i0.c(d0.a.g(z0Var));
        }
        TextPaint textPaint = new TextPaint(z0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = z0Var.getBreakStrategy();
        int hyphenationFrequency = z0Var.getHyphenationFrequency();
        if (z0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i4 < 28 || (z0Var.getInputType() & 15) != 3) {
                boolean z3 = z0Var.getLayoutDirection() == 1;
                switch (z0Var.getTextDirection()) {
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
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(d0.a.a(DecimalFormatSymbols.getInstance(z0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new i0.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean n(int i4) {
        if (i4 == 0) {
            return false;
        }
        ThreadLocal threadLocal = c0.a.f976a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i4);
        int green = Color.green(i4);
        int blue = Color.blue(i4);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d4 = red / 255.0d;
        double pow = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = green / 255.0d;
        double pow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = blue / 255.0d;
        double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d7 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d7;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d7 / 100.0d > 0.5d;
    }

    public static int o(int i4, int i5, float f4) {
        return c0.a.b(c0.a.d(i5, Math.round(Color.alpha(i5) * f4)), i4);
    }

    public static int t(Context context, TypedValue typedValue) {
        int i4 = typedValue.resourceId;
        return i4 != 0 ? context.getColor(i4) : typedValue.data;
    }

    public static void u(TextView textView, int i4) {
        k3.d.f(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            d0.a.h(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void v(TextView textView, int i4) {
        k3.d.f(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static void w(TextView textView, int i4) {
        k3.d.f(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static y2.a x(y2.c cVar, int i4) {
        u2.c.e(cVar, "<this>");
        boolean z3 = i4 > 0;
        Integer valueOf = Integer.valueOf(i4);
        if (!z3) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i5 = cVar.f3617f;
        int i6 = cVar.g;
        if (cVar.h <= 0) {
            i4 = -i4;
        }
        return new y2.a(i5, i6, i4);
    }

    public static y2.c z(int i4, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new y2.c(i4, i5 - 1, 1);
        }
        y2.c cVar = y2.c.f3620i;
        return y2.c.f3620i;
    }

    public abstract int d(View view, int i4);

    public abstract int e(View view, int i4);

    public abstract List f(List list, String str);

    public int l(View view) {
        return 0;
    }

    public int m() {
        return 0;
    }

    public abstract void q(int i4);

    public abstract void r(View view, int i4, int i5);

    public abstract void s(View view, float f4, float f5);

    public abstract boolean y(View view, int i4);

    public void p(View view, int i4) {
    }
}
