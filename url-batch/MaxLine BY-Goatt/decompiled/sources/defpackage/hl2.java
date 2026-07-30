package defpackage;

import android.graphics.Path;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class hl2 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    public static final void a(vl1 vl1Var, my myVar, a00 a00Var, int i) {
        a00Var.Z(-2105228848);
        if ((((a00Var.f(vl1Var) ? 4 : 2) | i) & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else {
            k9 k9Var = k9.h;
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, vl1Var);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, k9Var, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            myVar.invoke(a00Var, 6);
            a00Var.q(true);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new c6(vl1Var, myVar, i);
        }
    }

    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ni.i(0, i, 6, objArr, objArr2);
        ni.e(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ni.i(0, i, 6, objArr, objArr2);
        ni.e(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ni.i(0, i, 6, objArr, objArr2);
        ni.e(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void e(ow0 ow0Var, x33 x33Var) {
        List list = x33Var.v;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            z33 z33Var = (z33) list.get(i);
            if (z33Var instanceof b43) {
                rz1 rz1Var = new rz1();
                b43 b43Var = (b43) z33Var;
                rz1Var.d = b43Var.n;
                rz1Var.n = true;
                rz1Var.c();
                rz1Var.s.a.setFillType(b43Var.o == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                rz1Var.c();
                rz1Var.c();
                rz1Var.b = b43Var.p;
                rz1Var.c();
                rz1Var.c = b43Var.q;
                rz1Var.c();
                rz1Var.g = b43Var.r;
                rz1Var.c();
                rz1Var.e = b43Var.s;
                rz1Var.c();
                rz1Var.f = b43Var.t;
                rz1Var.o = true;
                rz1Var.c();
                rz1Var.h = b43Var.u;
                rz1Var.o = true;
                rz1Var.c();
                rz1Var.i = b43Var.v;
                rz1Var.o = true;
                rz1Var.c();
                rz1Var.j = b43Var.w;
                rz1Var.o = true;
                rz1Var.c();
                rz1Var.k = b43Var.x;
                rz1Var.p = true;
                rz1Var.c();
                rz1Var.l = b43Var.y;
                rz1Var.p = true;
                rz1Var.c();
                rz1Var.m = b43Var.z;
                rz1Var.p = true;
                rz1Var.c();
                ow0Var.e(i, rz1Var);
            } else if (z33Var instanceof x33) {
                ow0 ow0Var2 = new ow0();
                x33 x33Var2 = (x33) z33Var;
                ow0Var2.k = x33Var2.m;
                ow0Var2.c();
                ow0Var2.l = x33Var2.n;
                ow0Var2.s = true;
                ow0Var2.c();
                ow0Var2.o = x33Var2.q;
                ow0Var2.s = true;
                ow0Var2.c();
                ow0Var2.p = x33Var2.r;
                ow0Var2.s = true;
                ow0Var2.c();
                ow0Var2.q = x33Var2.s;
                ow0Var2.s = true;
                ow0Var2.c();
                ow0Var2.r = x33Var2.t;
                ow0Var2.s = true;
                ow0Var2.c();
                ow0Var2.m = x33Var2.o;
                ow0Var2.s = true;
                ow0Var2.c();
                ow0Var2.n = x33Var2.p;
                ow0Var2.s = true;
                ow0Var2.c();
                ow0Var2.f = x33Var2.u;
                ow0Var2.g = true;
                ow0Var2.c();
                e(ow0Var2, x33Var2);
                ow0Var.e(i, ow0Var2);
            }
        }
    }

    public static final yd f(nv2 nv2Var) {
        yd ydVar = nv2Var.a;
        long j = nv2Var.b;
        ydVar.getClass();
        return ydVar.subSequence(jw2.e(j), jw2.d(j));
    }

    public static final fc g(a00 a00Var) {
        i83 i83Var;
        WeakHashMap weakHashMap = i83.u;
        View view = (View) a00Var.j(AndroidCompositionLocals_androidKt.f);
        WeakHashMap weakHashMap2 = i83.u;
        synchronized (weakHashMap2) {
            try {
                Object obj = weakHashMap2.get(view);
                if (obj == null) {
                    obj = new i83(view);
                    weakHashMap2.put(view, obj);
                }
                i83Var = (i83) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h = a00Var.h(i83Var) | a00Var.h(view);
        Object M = a00Var.M();
        if (h || M == sz.a) {
            M = new ih2(13, i83Var, view);
            a00Var.i0(M);
        }
        l41.f(i83Var, (Function1) M, a00Var);
        return i83Var.g;
    }

    public static final yd h(nv2 nv2Var, int i) {
        yd ydVar = nv2Var.a;
        long j = nv2Var.b;
        return ydVar.subSequence(jw2.d(j), Math.min(jw2.d(j) + i, nv2Var.a.n.length()));
    }

    public static final yd i(nv2 nv2Var, int i) {
        yd ydVar = nv2Var.a;
        long j = nv2Var.b;
        return ydVar.subSequence(Math.max(0, jw2.e(j) - i), jw2.e(j));
    }

    public static final int j(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final a43 k(x01 x01Var, a00 a00Var) {
        ca0 ca0Var = (ca0) a00Var.j(p00.h);
        float f = x01Var.j;
        boolean e2 = a00Var.e((Float.floatToRawIntBits(ca0Var.d()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object M = a00Var.M();
        if (e2 || M == sz.a) {
            ow0 ow0Var = new ow0();
            e(ow0Var, x01Var.f);
            Unit unit = Unit.a;
            float f2 = x01Var.b;
            float f3 = x01Var.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(ca0Var.D(f2)) << 32) | (Float.floatToRawIntBits(ca0Var.D(f3)) & 4294967295L);
            float f4 = x01Var.d;
            float f5 = x01Var.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
            a43 a43Var = new a43(ow0Var);
            String str = x01Var.a;
            long j = x01Var.g;
            mo moVar = j != 16 ? new mo(j, x01Var.h) : null;
            boolean z = x01Var.i;
            a43Var.r.setValue(new ql2(floatToRawIntBits));
            a43Var.s.setValue(Boolean.valueOf(z));
            u33 u33Var = a43Var.t;
            u33Var.g.setValue(moVar);
            u33Var.i.setValue(new ql2(floatToRawIntBits2));
            u33Var.c = str;
            a00Var.i0(a43Var);
            M = a43Var;
        }
        return (a43) M;
    }

    public static final float l(long j, float f, ca0 ca0Var) {
        float c2;
        long b2 = sw2.b(j);
        if (tw2.a(b2, 4294967296L)) {
            if (ca0Var.p() <= 1.05d) {
                return ca0Var.g0(j);
            }
            c2 = sw2.c(j) / sw2.c(ca0Var.l0(f));
        } else {
            if (!tw2.a(b2, 8589934592L)) {
                return Float.NaN;
            }
            c2 = sw2.c(j);
        }
        return c2 * f;
    }

    public static final void m(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(ap.H(j)), i, i2, 33);
        }
    }

    public static final void n(Spannable spannable, long j, ca0 ca0Var, int i, int i2) {
        long b2 = sw2.b(j);
        if (tw2.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(si1.b(ca0Var.g0(j)), false), i, i2, 33);
        } else if (tw2.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(sw2.c(j)), i, i2, 33);
        }
    }

    public static final void o(Spannable spannable, sf1 sf1Var, int i, int i2) {
        if (sf1Var != null) {
            ArrayList arrayList = new ArrayList(rv.l(sf1Var, 10));
            Iterator it = sf1Var.m.iterator();
            while (it.hasNext()) {
                arrayList.add(((rf1) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void p(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static void q(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object r(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder("Invalid conditional user property field type. '");
        sb.append(str);
        sb.append("' expected [");
        sb.append(canonicalName);
        sb.append("] but was [");
        lh.g(q40.p(sb, canonicalName2, "]"));
        return null;
    }
}
