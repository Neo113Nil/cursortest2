package z1;

import B.r;
import K.H;
import K.T;
import K.d0;
import Q.o;
import Q.p;
import U.s;
import Y.V;
import a1.AbstractC0060a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import b1.AbstractC0082a;
import g0.J;
import g0.W;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import l.C0204c0;

/* loaded from: classes.dex */
public abstract class d implements d0 {
    public d() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f49c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList C(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B.m mVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        B.n nVar = new B.n(resources, theme);
        synchronized (r.f60c) {
            try {
                SparseArray sparseArray = (SparseArray) r.f59b.get(nVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (mVar = (B.m) sparseArray.get(i)) != null) {
                    if (mVar.f48b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (mVar.f49c != 0) {
                            }
                            colorStateList2 = mVar.f47a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = r.f58a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = B.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return B.l.b(resources, i, theme);
        }
        synchronized (r.f60c) {
            try {
                WeakHashMap weakHashMap = r.f59b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(nVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(nVar, sparseArray2);
                }
                sparseArray2.append(i, new B.m(colorStateList, nVar.f50a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList D(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !A1.a.p(drawable)) {
            return null;
        }
        colorStateList = A1.a.d(drawable).getColorStateList();
        return colorStateList;
    }

    public static Set E() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static float I(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= RecyclerView.f1559A0 && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final int N(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static I.d P(C0204c0 c0204c0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new I.d(p.c(c0204c0));
        }
        TextPaint textPaint = new TextPaint(c0204c0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = Q.n.a(c0204c0);
        int d = Q.n.d(c0204c0);
        if (c0204c0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c0204c0.getInputType() & 15) != 3) {
                boolean z2 = c0204c0.getLayoutDirection() == 1;
                switch (c0204c0.getTextDirection()) {
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
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(p.b(o.a(c0204c0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new I.d(textPaint, textDirectionHeuristic, a2, d);
    }

    public static int Q(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(V.e("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static boolean R(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static boolean S(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean U(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean W() {
        return e.d;
    }

    public static List Y(Object obj) {
        List singletonList = Collections.singletonList(obj);
        g1.d.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int Z(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int a0(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static TypedValue f0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean g0(Context context, int i, boolean z2) {
        TypedValue f02 = f0(context, i);
        return (f02 == null || f02.type != 18) ? z2 : f02.data != 0;
    }

    public static void h(Throwable th, Throwable th2) {
        g1.d.e(th, "<this>");
        g1.d.e(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC0082a.f1662a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0060a.f1255a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static int h0(Context context, int i, int i2) {
        TypedValue f02 = f0(context, i);
        return (f02 == null || f02.type != 16) ? i2 : f02.data;
    }

    public static E1.e i() {
        E1.e eVar = E1.e.f198l;
        g1.d.b(eVar);
        E1.e eVar2 = eVar.f200f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            E1.e.i.await(E1.e.f196j, TimeUnit.MILLISECONDS);
            E1.e eVar3 = E1.e.f198l;
            g1.d.b(eVar3);
            if (eVar3.f200f != null || System.nanoTime() - nanoTime < E1.e.f197k) {
                return null;
            }
            return E1.e.f198l;
        }
        long nanoTime2 = eVar2.f201g - System.nanoTime();
        if (nanoTime2 > 0) {
            E1.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        E1.e eVar4 = E1.e.f198l;
        g1.d.b(eVar4);
        eVar4.f200f = eVar2.f200f;
        eVar2.f200f = null;
        return eVar2;
    }

    public static TimeInterpolator i0(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!U(valueOf, "cubic-bezier") && !U(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (U(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return M.a.b(I(split, 0), I(split, 1), I(split, 2), I(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!U(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            C.f.b(l.o(substring), path);
            return M.a.c(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = Z(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean k2 = k(i, rect, rect2);
        if (k(i, rect, rect3) || !k2) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static TypedValue j0(Context context, int i, String str) {
        TypedValue f02 = f0(context, i);
        if (f02 != null) {
            return f02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean k(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void l(long j2, E1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        E1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((E1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        E1.i iVar = (E1.i) arrayList.get(i2);
        E1.i iVar2 = (E1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            E1.i iVar3 = (E1.i) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            iVar = iVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (iVar.d(i8) == iVar2.d(i8)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i12 = 0;
            for (int i13 = i8; i13 < min && iVar.d(i13) == iVar2.d(i13); i13++) {
                i12++;
            }
            long j3 = 4;
            long j4 = (fVar.f203b / j3) + j2 + 2 + i12 + 1;
            fVar.w(-i12);
            fVar.w(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.w(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((E1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.w(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                E1.f fVar3 = new E1.f();
                fVar.w(((int) ((fVar3.f203b / j3) + j4)) * (-1));
                l(j4, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.t(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((E1.i) arrayList.get(i16 - 1)).d(i8) != ((E1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.f203b / j5) + j2 + 2 + (i15 * 2);
        fVar.w(i15);
        fVar.w(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d = ((E1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d != ((E1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.w(d & 255);
            }
        }
        E1.f fVar4 = new E1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d2 = ((E1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d2 != ((E1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((E1.i) arrayList.get(i18)).a()) {
                fVar.w(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.w(((int) ((fVar4.f203b / j5) + j6)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                l(j6, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.t(fVar4);
    }

    public static void m0(TextView textView, int i) {
        p(i);
        if (Build.VERSION.SDK_INT >= 28) {
            p.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void n0(TextView textView, int i) {
        p(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void o(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void o0(TextView textView, int i) {
        p(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void p(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void p0(View view, J0.g gVar) {
        C0.a aVar = gVar.f352a.f339b;
        if (aVar == null || !aVar.f93a) {
            return;
        }
        float f2 = RecyclerView.f1559A0;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = T.f440a;
            f2 += H.i((View) parent);
        }
        J0.f fVar = gVar.f352a;
        if (fVar.f346l != f2) {
            fVar.f346l = f2;
            gVar.m();
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void q0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void r(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    public static void r0(Drawable drawable, int i) {
        D.a.g(drawable, i);
    }

    public static final void s(E1.h hVar, Throwable th) {
        if (hVar != null) {
            if (th == null) {
                hVar.close();
                return;
            }
            try {
                hVar.close();
            } catch (Throwable th2) {
                h(th, th2);
            }
        }
    }

    public static int t(W w2, U.g gVar, View view, View view2, J j2, boolean z2) {
        if (j2.v() == 0 || w2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(J.H(view) - J.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int u(W w2, U.g gVar, View view, View view2, J j2, boolean z2, boolean z3) {
        if (j2.v() == 0 || w2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (w2.b() - Math.max(J.H(view), J.H(view2))) - 1) : Math.max(0, Math.min(J.H(view), J.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(J.H(view) - J.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static ActionMode.Callback u0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof Q.r) || callback == null) ? callback : new Q.r(callback, textView);
    }

    public static int v(W w2, U.g gVar, View view, View view2, J j2, boolean z2) {
        if (j2.v() == 0 || w2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return w2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(J.H(view) - J.H(view2)) + 1)) * w2.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s w(Context context) {
        ProviderInfo providerInfo;
        H.e eVar;
        ApplicationInfo applicationInfo;
        J0.e cVar = Build.VERSION.SDK_INT >= 28 ? new U.c(7) : new J0.e(7);
        PackageManager packageManager = context.getPackageManager();
        q(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] j2 = cVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j2) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new H.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (eVar != null) {
                return null;
            }
            return new s(new U.r(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static l x(int i) {
        if (i != 0 && i == 1) {
            return new J0.d();
        }
        return new J0.i();
    }

    public Typeface A(Context context, Resources resources, int i, String str, int i2) {
        File A2 = l.A(context);
        if (A2 == null) {
            return null;
        }
        try {
            if (l.m(A2, resources, i)) {
                return Typeface.createFromFile(A2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A2.delete();
        }
    }

    public H.k B(int i, H.k[] kVarArr) {
        new J0.e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        H.k kVar = null;
        int i3 = Integer.MAX_VALUE;
        for (H.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f296c - i2) * 2) + (kVar2.d == z2 ? 0 : 1);
            if (kVar == null || i3 > abs) {
                kVar = kVar2;
                i3 = abs;
            }
        }
        return kVar;
    }

    public abstract int F();

    public abstract InputFilter[] G(InputFilter[] inputFilterArr);

    public abstract int H();

    public abstract int J();

    public abstract int K();

    public abstract int L(View view);

    public abstract int M(CoordinatorLayout coordinatorLayout);

    public abstract int O();

    public abstract boolean T(float f2);

    public abstract boolean V(View view);

    public abstract boolean X(float f2, float f3);

    public abstract View b0(int i);

    public abstract void c0(int i);

    @Override // K.d0
    public void d() {
    }

    public abstract void d0(Typeface typeface, boolean z2);

    public abstract boolean e0();

    @Override // K.d0
    public void g() {
    }

    public abstract void k0(boolean z2);

    public abstract void l0(boolean z2);

    public abstract int m(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float n(int i);

    public abstract boolean s0(View view, float f2);

    public abstract void t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract Typeface y(Context context, B.g gVar, Resources resources, int i);

    public abstract Typeface z(Context context, H.k[] kVarArr, int i);
}
