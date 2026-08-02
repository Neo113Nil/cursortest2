package a;

import C3.s;
import E.AbstractC0005f;
import H.c;
import W.J;
import X3.o;
import a0.T;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.EdgeEffect;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f3.C0431i;
import f3.InterfaceC0428f;
import f3.InterfaceC0429g;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import i2.AbstractC0457a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.flutter.embedding.android.KeyboardMap;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k.p0;
import kotlin.jvm.internal.i;
import o3.InterfaceC1328a;
import o3.InterfaceC1339l;
import o3.p;
import t1.AbstractC1439c;
import t1.C1438b;
import t1.d;
import t1.k;
import x3.AbstractC1562w;
import x3.C1554n;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0124a {
    public static boolean G(String str) {
        C1438b c1438b = k.f15401a;
        Set<d> unmodifiableSet = Collections.unmodifiableSet(AbstractC1439c.f15391c);
        HashSet hashSet = new HashSet();
        for (d dVar : unmodifiableSet) {
            if (((AbstractC1439c) dVar).f15392a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC1439c abstractC1439c = (AbstractC1439c) ((d) it.next());
            if (abstractC1439c.a() || abstractC1439c.b()) {
                return true;
            }
        }
        return false;
    }

    public static List H(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int I(int i4) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i4 <= 0) {
            throw new IllegalArgumentException(AbstractC0005f.k(i4, "x (", ") must be > 0"));
        }
        switch (x2.d.f15985a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0457a.e((i4 > 0) & (((i4 + (-1)) & i4) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i4 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i4);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i4))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i4);
    }

    public static InterfaceC0430h J(InterfaceC0428f interfaceC0428f, InterfaceC0429g key) {
        i.e(key, "key");
        return i.a(interfaceC0428f.getKey(), key) ? C0431i.f8817a : interfaceC0428f;
    }

    public static int K(int i4) {
        int i5 = i4 % 65536;
        return i5 >= 0 ? i5 : i5 + 65536;
    }

    public static float L(EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return H.d.c(edgeEffect, f4, f5);
        }
        c.a(edgeEffect, f4, f5);
        return f4;
    }

    public static void O(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        p0 p0Var = p0.f14071j;
        if (p0Var != null && p0Var.f14073a == view) {
            p0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p0(charSequence, view);
            return;
        }
        p0 p0Var2 = p0.f14072k;
        if (p0Var2 != null && p0Var2.f14073a == view) {
            p0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final Object P(s sVar, s sVar2, p pVar) {
        Object c1554n;
        Object H4;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            c1554n = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            c1554n = new C1554n(th, false);
        }
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        if (c1554n == enumC0441a || (H4 = sVar.H(c1554n)) == AbstractC1562w.f16066d) {
            return enumC0441a;
        }
        if (H4 instanceof C1554n) {
            throw ((C1554n) H4).f16048a;
        }
        return AbstractC1562w.l(H4);
    }

    public static int Q(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static long R(long j4, long j5, long j6, int i4) {
        String str = J.f3263a;
        return j4 + J.U((j5 - j6) & KeyboardMap.kValueMask, 1000000L, i4, RoundingMode.DOWN);
    }

    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static final void b(J3.a aVar, J3.c cVar, String str) {
        J3.d.f1208h.getClass();
        J3.d.f1210j.fine(cVar.f1203b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f1196a);
    }

    public static final boolean c(int i4, int i5, int i6, byte[] a3, byte[] b4) {
        i.e(a3, "a");
        i.e(b4, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (a3[i7 + i4] != b4[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static String d(int i4, int i5, String str) {
        if (i4 < 0) {
            return AbstractC0347t0.n("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return AbstractC0347t0.n("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(AbstractC0005f.j(i5, "negative size: "));
    }

    public static void e(int i4, int i5, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC0347t0.n(str, Integer.valueOf(i4), Integer.valueOf(i5)));
        }
    }

    public static void f(int i4, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC0347t0.n(str, Integer.valueOf(i4)));
        }
    }

    public static void g(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void h(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(boolean z, String str, long j4) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC0347t0.n(str, Long.valueOf(j4)));
        }
    }

    public static void j(boolean z, String str, long j4, long j5) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC0347t0.n(str, Long.valueOf(j4), Long.valueOf(j5)));
        }
    }

    public static void k(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC0347t0.n(str, obj));
        }
    }

    public static void l(boolean z, String str, Object obj, Comparable comparable) {
        if (!z) {
            throw new IllegalArgumentException(AbstractC0347t0.n(str, obj, comparable));
        }
    }

    public static void m(int i4, int i5) {
        String n;
        if (i4 < 0 || i4 >= i5) {
            if (i4 < 0) {
                n = AbstractC0347t0.n("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(AbstractC0005f.j(i5, "negative size: "));
                }
                n = AbstractC0347t0.n("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(n);
        }
    }

    public static void n(T t4) {
        t4.getClass();
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void p(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static void q(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(d(i4, i5, "index"));
        }
    }

    public static void r(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i6) ? d(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? d(i5, i6, "end index") : AbstractC0347t0.n("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public static void s(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void t(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static int u(int i4, int i5) {
        long j4 = i4 + i5;
        int i6 = (int) j4;
        if (j4 == ((long) i6)) {
            return i6;
        }
        throw new ArithmeticException(AbstractC0005f.l("overflow: checkedAdd(", i4, ", ", i5, ")"));
    }

    public static int v(int i4, int i5) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i5 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i6 = i4 / i5;
        int i7 = i4 - (i5 * i6);
        if (i7 == 0) {
            return i6;
        }
        int i8 = ((i4 ^ i5) >> 31) | 1;
        switch (x2.d.f15985a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0457a.e(i7 == 0);
                return i6;
            case 2:
                return i6;
            case 3:
                if (i8 >= 0) {
                    return i6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i7);
                int abs2 = abs - (Math.abs(i5) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i6;
                }
                if (abs2 <= 0) {
                    return i6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i6 + i8;
    }

    public static final String w(long j4) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j4 <= -999500000 ? AbstractC0005f.p(new StringBuilder(), (j4 - 500000000) / 1000000000, " s ") : j4 <= -999500 ? AbstractC0005f.p(new StringBuilder(), (j4 - 500000) / 1000000, " ms") : j4 <= 0 ? AbstractC0005f.p(new StringBuilder(), (j4 - 500) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, " µs") : j4 < 999500 ? AbstractC0005f.p(new StringBuilder(), (j4 + 500) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, " µs") : j4 < 999500000 ? AbstractC0005f.p(new StringBuilder(), (j4 + 500000) / 1000000, " ms") : AbstractC0005f.p(new StringBuilder(), (j4 + 500000000) / 1000000000, " s ")}, 1));
    }

    public static InterfaceC0428f x(InterfaceC0428f interfaceC0428f, InterfaceC0429g key) {
        i.e(key, "key");
        if (i.a(interfaceC0428f.getKey(), key)) {
            return interfaceC0428f;
        }
        return null;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return H.d.b(edgeEffect);
        }
        return 0.0f;
    }

    public abstract InterfaceC1328a A();

    public abstract InterfaceC1339l B();

    public abstract o C();

    public void D(int i4) {
        if (i4 == -2) {
            B().invoke(Boolean.TRUE);
        } else if (i4 == -1) {
            B().invoke(Boolean.FALSE);
        } else {
            if (i4 != 1) {
                return;
            }
            A().invoke();
        }
    }

    public abstract void E();

    public abstract boolean F();

    public abstract void M();

    public abstract void N(W3.a aVar);

    public abstract void S();

    public abstract void T(ArrayList arrayList);

    public abstract long U();

    public abstract W3.a y();
}
