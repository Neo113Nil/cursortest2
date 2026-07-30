package defpackage;

import android.R;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class m90 {
    public static Context a;
    public static Boolean b;
    public static final fv h;
    public static final fv i;
    public static final fv o;
    public static final fv p;
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final hk g = new hk(241178336, false, new ik(0));
    public static final j41 j = new j41(20);
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final StackTraceElement[] l = new StackTraceElement[0];
    public static final p60 m = new p60(2);
    public static final s11 n = new s11(0.0f, 0.0f, 10.0f, 10.0f);

    static {
        int i2 = 1;
        h = new fv("UNDEFINED", i2);
        i = new fv("REUSABLE_CLAIMED", i2);
        o = new fv("NONE", i2);
        p = new fv("PENDING", i2);
    }

    public static int A(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return vi.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean B(l81 l81Var) {
        qp0 d2 = l81Var.d();
        vn0 vn0Var = l81Var.d.d;
        return (d2 != null ? d2.R0() : false) || vn0Var.c(p81.p) || vn0Var.c(p81.o);
    }

    public static final boolean C(l81 l81Var) {
        if (!B(l81Var)) {
            h81 h81Var = l81Var.d;
            if (h81Var.g) {
                return true;
            }
            vn0 vn0Var = h81Var.d;
            Object[] objArr = vn0Var.b;
            Object[] objArr2 = vn0Var.c;
            long[] jArr = vn0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((t81) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static final am0 D(am0 am0Var, xz0 xz0Var, df0 df0Var, et0 et0Var, boolean z) {
        return am0Var.c(new ef0(xz0Var, df0Var, et0Var, z));
    }

    public static float E(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static am0 F(am0 am0Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return am0Var.c(new yq0(f2, f3, new q1(20)));
    }

    public static final Object I(kw0 kw0Var, m01 m01Var) {
        m01Var.getClass();
        Object obj = kw0Var.get(m01Var);
        if (obj == null) {
            obj = m01Var.b();
        }
        return ((gm1) obj).a(kw0Var);
    }

    public static final hk J(int i2, z30 z30Var, hl hlVar) {
        Object L = hlVar.L();
        if (L == bl.a) {
            L = new hk(i2, true, z30Var);
            hlVar.h0(L);
        }
        hk hkVar = (hk) L;
        if (!hkVar.g.equals(z30Var)) {
            hkVar.g = z30Var;
            if (hkVar.e) {
                i11 i11Var = hkVar.h;
                if (i11Var != null) {
                    tl tlVar = i11Var.a;
                    if (tlVar != null) {
                        tlVar.s(i11Var, null);
                    }
                    hkVar.h = null;
                }
                ArrayList arrayList = hkVar.i;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        i11 i11Var2 = (i11) arrayList.get(i3);
                        tl tlVar2 = i11Var2.a;
                        if (tlVar2 != null) {
                            tlVar2.s(i11Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return hkVar;
    }

    public static final View K(yq yqVar) {
        if (!((zl0) yqVar).d.r) {
            o80.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) md0.a(op.I(yqVar));
    }

    public static final void L(dn dnVar, Object obj) {
        if (!(dnVar instanceof hs)) {
            dnVar.l(obj);
            return;
        }
        hs hsVar = (hs) dnVar;
        ln lnVar = hsVar.h;
        fn fnVar = hsVar.i;
        Throwable a2 = k31.a(obj);
        Object hjVar = a2 == null ? obj : new hj(a2, false);
        if (lnVar.l(fnVar.g())) {
            hsVar.j = hjVar;
            hsVar.g = 1;
            lnVar.f(fnVar.g(), hsVar);
            return;
        }
        ew a3 = ci1.a();
        if (a3.g >= 4294967296L) {
            hsVar.j = hjVar;
            hsVar.g = 1;
            a3.q(hsVar);
            return;
        }
        a3.r(true);
        try {
            jb0 jb0Var = (jb0) fnVar.g().d(j41.m);
            if (jb0Var == null || jb0Var.b()) {
                Object obj2 = hsVar.k;
                CoroutineContext g2 = fnVar.g();
                Object c2 = bi1.c(g2, obj2);
                zk1 c3 = c2 != bi1.a ? jn.c(fnVar, g2, c2) : null;
                try {
                    fnVar.l(obj);
                } finally {
                    if (c3 == null || c3.s0()) {
                        bi1.a(g2, c2);
                    }
                }
            } else {
                hsVar.l(ca0.g(jb0Var.o()));
            }
            while (a3.t()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void M(Function2 function2, p pVar, p pVar2) {
        try {
            dn b2 = qa0.b(qa0.a(pVar, pVar2, function2));
            i31 i31Var = k31.d;
            L(b2, Unit.a);
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            pVar2.l(new j31(th));
            throw th;
        }
    }

    public static String N(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final kw0 O(n01[] n01VarArr, kw0 kw0Var, kw0 kw0Var2) {
        jw0 jw0Var = new jw0(kw0.k);
        for (n01 n01Var : n01VarArr) {
            m01 m01Var = n01Var.a;
            if (n01Var.f || !kw0Var.containsKey(m01Var)) {
                jw0Var.put(m01Var, m01Var.c(n01Var, (gm1) kw0Var2.get(m01Var)));
            }
        }
        return jw0Var.e();
    }

    public static float P() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void a(Function1 function1, am0 am0Var, Function1 function12, hl hlVar, int i2) {
        hlVar.Y(-1783766393);
        int i3 = (hlVar.h(function1) ? 4 : 2) | i2;
        if (hlVar.O(i3 & 1, (i3 & 147) != 146)) {
            b(function1, am0Var, function12, hlVar, (i3 & 14) | 27696);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new q4(function1, am0Var, function12, i2, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
    
        if (r25.f(r22) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function1 function1, am0 am0Var, Function1 function12, hl hlVar, int i2) {
        int i3;
        boolean z;
        boolean h2;
        Object L;
        vg0 vg0Var;
        kw0 kw0Var;
        nr nrVar;
        int i4;
        vc0 vc0Var;
        Function1 function13 = function1;
        Object obj = y3.m;
        hlVar.Y(-180024211);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(function13) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.f(am0Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= hlVar.h(obj) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= hlVar.h(function12) ? 16384 : 8192;
        }
        if (hlVar.O(i5 & 1, (i5 & 9363) != 9362)) {
            int hashCode = Long.hashCode(hlVar.T);
            am0 N = p4.N(hlVar, am0Var.c(t00.a).c(n10.a).c(p10.a).c(k10.a));
            nr nrVar2 = (nr) hlVar.j(yl.h);
            vc0 vc0Var2 = (vc0) hlVar.j(yl.n);
            kw0 l2 = hlVar.l();
            vg0 vg0Var2 = (vg0) hlVar.j(gi0.a);
            e61 e61Var = (e61) hlVar.j(ji0.a);
            hlVar.W(1314774735);
            int i6 = i5 & 14;
            int hashCode2 = Long.hashCode(hlVar.T);
            Context context = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
            fl U = la0.U(hlVar);
            t51 t51Var = (t51) hlVar.j(v51.a);
            View view = (View) hlVar.j(AndroidCompositionLocals_androidKt.f);
            boolean h3 = hlVar.h(context);
            if (((i6 & 14) ^ 6) <= 4) {
            }
            if ((i6 & 6) != 4) {
                z = false;
                h2 = h3 | z | hlVar.h(U) | hlVar.h(t51Var) | hlVar.d(hashCode2) | hlVar.h(view);
                L = hlVar.L();
                if (!h2 || L == bl.a) {
                    vg0Var = vg0Var2;
                    kw0Var = l2;
                    nrVar = nrVar2;
                    function13 = function1;
                    i4 = hashCode;
                    vc0Var = vc0Var2;
                    Object g7Var = new g7(context, function13, U, t51Var, hashCode2, view);
                    hlVar.h0(g7Var);
                    L = g7Var;
                } else {
                    function13 = function1;
                    kw0Var = l2;
                    vg0Var = vg0Var2;
                    nrVar = nrVar2;
                    i4 = hashCode;
                    vc0Var = vc0Var2;
                }
                Function0 function0 = (Function0) L;
                hlVar.S(125, null, 1, null);
                hlVar.r = true;
                if (hlVar.S) {
                    hlVar.k0();
                } else {
                    hlVar.k(function0);
                }
                yk.b.getClass();
                ka0.C(hlVar, kw0Var, xk.d);
                ka0.C(hlVar, N, e7.h);
                ka0.C(hlVar, nrVar, e7.i);
                ka0.C(hlVar, vg0Var, e7.j);
                ka0.C(hlVar, e61Var, e7.k);
                ka0.C(hlVar, vc0Var, e7.l);
                ka0.u(hlVar, Integer.valueOf(i4), xk.f);
                ka0.C(hlVar, function12, e7.e);
                ka0.C(hlVar, obj, e7.g);
                hlVar.p(true);
                hlVar.p(false);
            }
            z = true;
            h2 = h3 | z | hlVar.h(U) | hlVar.h(t51Var) | hlVar.d(hashCode2) | hlVar.h(view);
            L = hlVar.L();
            if (h2) {
            }
            vg0Var = vg0Var2;
            kw0Var = l2;
            nrVar = nrVar2;
            function13 = function1;
            i4 = hashCode;
            vc0Var = vc0Var2;
            Object g7Var2 = new g7(context, function13, U, t51Var, hashCode2, view);
            hlVar.h0(g7Var2);
            L = g7Var2;
            Function0 function02 = (Function0) L;
            hlVar.S(125, null, 1, null);
            hlVar.r = true;
            if (hlVar.S) {
            }
            yk.b.getClass();
            ka0.C(hlVar, kw0Var, xk.d);
            ka0.C(hlVar, N, e7.h);
            ka0.C(hlVar, nrVar, e7.i);
            ka0.C(hlVar, vg0Var, e7.j);
            ka0.C(hlVar, e61Var, e7.k);
            ka0.C(hlVar, vc0Var, e7.l);
            ka0.u(hlVar, Integer.valueOf(i4), xk.f);
            ka0.C(hlVar, function12, e7.e);
            ka0.C(hlVar, obj, e7.g);
            hlVar.p(true);
            hlVar.p(false);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new f7(function13, am0Var, function12, i2);
        }
    }

    public static final be1 c(Object obj) {
        if (obj == null) {
            obj = op.l;
        }
        return new be1(obj);
    }

    public static final xu1 d() {
        return new xu1(new Paint(7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String str, String str2, Function0 function0, final Function0 function02, hl hlVar, int i2) {
        Object ho1Var;
        ao0 ao0Var;
        ao0 ao0Var2;
        float[] fArr;
        String str3;
        ao0 ao0Var3;
        boolean z;
        String str4;
        String str5 = str2;
        function0.getClass();
        function02.getClass();
        hlVar.Y(1651303193);
        int i3 = i2 | (hlVar.f(str) ? 4 : 2) | (hlVar.f(str5) ? 32 : 16);
        int i4 = 1;
        if (hlVar.O(i3 & 1, (i3 & 1171) != 1170)) {
            final Context context = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
            int i5 = ((Configuration) hlVar.j(AndroidCompositionLocals_androidKt.a)).orientation;
            Object L = hlVar.L();
            Object obj = bl.a;
            if (L == obj) {
                if (str5 != null) {
                    str4 = !StringsKt.n(str5) ? str5 : null;
                }
                str4 = str;
                L = gb0.F(str4);
                hlVar.h0(L);
            }
            ao0 ao0Var4 = (ao0) L;
            Object L2 = hlVar.L();
            if (L2 == obj) {
                L2 = gb0.F(null);
                hlVar.h0(L2);
            }
            final ao0 ao0Var5 = (ao0) L2;
            Object L3 = hlVar.L();
            if (L3 == obj) {
                L3 = gb0.F(Integer.valueOf(i5));
                hlVar.h0(L3);
            }
            ao0 ao0Var6 = (ao0) L3;
            Object L4 = hlVar.L();
            if (L4 == obj) {
                L4 = gb0.F(Boolean.TRUE);
                hlVar.h0(L4);
            }
            final ao0 ao0Var7 = (ao0) L4;
            Object L5 = hlVar.L();
            if (L5 == obj) {
                L5 = gb0.F(Boolean.FALSE);
                hlVar.h0(L5);
            }
            final ao0 ao0Var8 = (ao0) L5;
            Object L6 = hlVar.L();
            if (L6 == obj) {
                L6 = gb0.F(null);
                hlVar.h0(L6);
            }
            final ao0 ao0Var9 = (ao0) L6;
            Object L7 = hlVar.L();
            if (L7 == obj) {
                L7 = gb0.F((String) ao0Var4.getValue());
                hlVar.h0(L7);
            }
            final ao0 ao0Var10 = (ao0) L7;
            Object L8 = hlVar.L();
            if (L8 == obj) {
                L8 = gb0.F(0);
                hlVar.h0(L8);
            }
            final ao0 ao0Var11 = (ao0) L8;
            Object L9 = hlVar.L();
            if (L9 == obj) {
                L9 = gb0.F(null);
                hlVar.h0(L9);
            }
            final ao0 ao0Var12 = (ao0) L9;
            Object L10 = hlVar.L();
            if (L10 == obj) {
                L10 = gb0.F(null);
                hlVar.h0(L10);
            }
            ao0 ao0Var13 = (ao0) L10;
            Object L11 = hlVar.L();
            if (L11 == obj) {
                L11 = gb0.F(null);
                hlVar.h0(L11);
            }
            final ao0 ao0Var14 = (ao0) L11;
            Object L12 = hlVar.L();
            Object obj2 = L12;
            if (L12 == obj) {
                float[] fArr2 = {-1.0f};
                hlVar.h0(fArr2);
                obj2 = fArr2;
            }
            float[] fArr3 = (float[]) obj2;
            i2 i2Var = new i2(i4);
            Object L13 = hlVar.L();
            if (L13 == obj) {
                L13 = new c(ao0Var13, 20, ao0Var14);
                hlVar.h0(L13);
            }
            final qj0 Y = p4.Y(i2Var, (Function1) L13, hlVar, 48);
            Object L14 = hlVar.L();
            if (L14 == obj) {
                L14 = new te0(ao0Var5, 3);
                hlVar.h0(L14);
            }
            uq1.a(54, 0, hlVar, (Function0) L14, true);
            Unit unit = Unit.a;
            Object L15 = hlVar.L();
            if (L15 == obj) {
                L15 = new l(24, ao0Var5);
                hlVar.h0(L15);
            }
            p4.b(unit, (Function1) L15, hlVar);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object L16 = hlVar.L();
            if (z2 || L16 == obj) {
                ao0Var = ao0Var13;
                ao0Var2 = ao0Var4;
                fArr = fArr3;
                ho1Var = new ho1(str5, function0, str, ao0Var2, null);
                str5 = str5;
                str3 = str;
                hlVar.h0(ho1Var);
            } else {
                ho1Var = L16;
                ao0Var = ao0Var13;
                ao0Var2 = ao0Var4;
                str3 = str;
                fArr = fArr3;
            }
            p4.j(str5, str3, (Function2) ho1Var, hlVar);
            Integer valueOf = Integer.valueOf(i5);
            WebView webView = (WebView) ao0Var5.getValue();
            boolean d2 = hlVar.d(i5);
            Object L17 = hlVar.L();
            if (d2 || L17 == obj) {
                L17 = new d(i5, ao0Var6, ao0Var5, (dn) null);
                hlVar.h0(L17);
            }
            p4.j(valueOf, webView, (Function2) L17, hlVar);
            vy vyVar = xa1.b;
            long j2 = hi.b;
            p60 p60Var = m;
            am0 g2 = mo.g(vyVar, j2, p60Var);
            vk0 d3 = vd.d(j50.g, false);
            final ao0 ao0Var15 = ao0Var;
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, g2);
            yk.b.getClass();
            Function0 function03 = xk.b;
            hlVar.a0();
            final ao0 ao0Var16 = ao0Var2;
            if (hlVar.S) {
                hlVar.k(function03);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d3, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            boolean h2 = hlVar.h(context) | hlVar.h(Y) | hlVar.h(fArr);
            Object L18 = hlVar.L();
            if (h2 || L18 == obj) {
                final float[] fArr4 = fArr;
                Object obj3 = new Function1() { // from class: fo1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        String str6;
                        Context context2 = (Context) obj4;
                        context2.getClass();
                        final FrameLayout frameLayout = new FrameLayout(context2);
                        frameLayout.setBackgroundColor(-16777216);
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        final x80 x80Var = new x80(context2);
                        x80Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        x80Var.getSettings().setJavaScriptEnabled(true);
                        x80Var.getSettings().setDomStorageEnabled(true);
                        x80Var.getSettings().setDatabaseEnabled(true);
                        x80Var.getSettings().setLoadsImagesAutomatically(true);
                        final boolean z3 = false;
                        x80Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
                        x80Var.getSettings().setCacheMode(-1);
                        WebSettings settings = x80Var.getSettings();
                        Context context3 = context;
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                        defaultUserAgent.getClass();
                        settings.setUserAgentString(StringsKt.s(new Regex("\\s{2,}").replace(c.d(c.d(c.d(new Regex(";\\s*wv").replace(defaultUserAgent, ""), "; wv", ""), " wv", ""), "Version/4.0", ""), " ")).toString());
                        x80Var.getSettings().setSafeBrowsingEnabled(true);
                        CookieManager cookieManager = CookieManager.getInstance();
                        cookieManager.setAcceptCookie(true);
                        cookieManager.setAcceptThirdPartyCookies(x80Var, true);
                        x80Var.setWebChromeClient(new jo1(context3, ao0Var15, ao0Var14, Y));
                        x80Var.setWebViewClient(new mo1(context3, ao0Var11, ao0Var10, ao0Var8, ao0Var7, function02, ao0Var12));
                        final float[] fArr5 = fArr4;
                        x80Var.setOnTouchListener(new View.OnTouchListener() { // from class: go1
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                if (motionEvent.getActionMasked() == 0) {
                                    fArr5[0] = motionEvent.getY();
                                }
                                return false;
                            }
                        });
                        frameLayout.addView(x80Var);
                        final i6 i6Var = new i6(14, fArr5);
                        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                        if (currentWebViewPackage != null && (str6 = currentWebViewPackage.versionName) != null) {
                            int m2 = StringsKt.m(str6, '.', 0, 6);
                            if (m2 != -1) {
                                str6 = str6.substring(0, m2);
                            }
                            Integer intOrNull = StringsKt.toIntOrNull(str6);
                            if (intOrNull != null) {
                                z3 = intOrNull.intValue() >= 139;
                            }
                        }
                        WebView.getCurrentWebViewPackage();
                        br0 br0Var = new br0() { // from class: do1
                            @Override // defpackage.br0
                            public final ip1 b(View view, ip1 ip1Var) {
                                float f2;
                                view.getClass();
                                fp1 fp1Var = ip1Var.a;
                                c90 g3 = fp1Var.g(128);
                                g3.getClass();
                                c90 h3 = fp1Var.h(1);
                                h3.getClass();
                                c90 g4 = fp1Var.g(8);
                                g4.getClass();
                                c90 g5 = fp1Var.g(2);
                                g5.getClass();
                                FrameLayout frameLayout2 = frameLayout;
                                boolean z4 = frameLayout2.getResources().getConfiguration().orientation == 2;
                                int i6 = g3.b;
                                if (!z4) {
                                    i6 = Math.max(i6, h3.b);
                                }
                                view.setPadding(g3.a, i6, g3.c, g3.d);
                                x80 x80Var2 = x80Var;
                                ViewGroup.LayoutParams layoutParams = x80Var2.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != 0) {
                                    marginLayoutParams.bottomMargin = 0;
                                    x80Var2.setLayoutParams(marginLayoutParams);
                                }
                                int max = Math.max(g4.d - g5.d, 0);
                                boolean z5 = z3;
                                float f3 = 0.0f;
                                if (!z5 && z4 && max > 0 && x80Var2.getHeight() > 0) {
                                    int height = x80Var2.getHeight() - max;
                                    float f4 = frameLayout2.getResources().getDisplayMetrics().density * 24.0f;
                                    float floatValue = ((Number) i6Var.invoke()).floatValue();
                                    if (floatValue > 0.0f) {
                                        float f5 = height;
                                        if (floatValue > f5 - f4) {
                                            f2 = (floatValue - f5) + f4;
                                            float f6 = max;
                                            if (f2 > f6) {
                                                f2 = f6;
                                            }
                                            f3 = -f2;
                                        }
                                    }
                                    if (floatValue <= 0.0f) {
                                        f2 = max / 2.0f;
                                        f3 = -f2;
                                    }
                                }
                                x80Var2.setTranslationY(f3);
                                wo1 xo1Var = Build.VERSION.SDK_INT >= 34 ? new xo1(ip1Var) : new wo1(ip1Var);
                                c90 c90Var = c90.e;
                                xo1Var.f(128, c90Var);
                                xo1Var.e(null);
                                if (!z5 && z4 && max > 0) {
                                    xo1Var.f(8, c90Var);
                                }
                                return xo1Var.b();
                            }
                        };
                        int i6 = ln1.a;
                        hn1.a(frameLayout, br0Var);
                        fn1.a(frameLayout);
                        boolean isAttachedToWindow = frameLayout.isAttachedToWindow();
                        ao0 ao0Var17 = ao0Var16;
                        ao0 ao0Var18 = ao0Var9;
                        if (isAttachedToWindow) {
                            fn1.a(frameLayout);
                            frameLayout.post(new io1(frameLayout, x80Var, ao0Var17, ao0Var18));
                        } else {
                            frameLayout.addOnAttachStateChangeListener(new no1(frameLayout, frameLayout, x80Var, ao0Var17, ao0Var18));
                        }
                        ao0Var5.setValue(x80Var);
                        return frameLayout;
                    }
                };
                ao0Var8 = ao0Var8;
                ao0Var7 = ao0Var7;
                ao0Var3 = ao0Var16;
                ao0Var9 = ao0Var9;
                hlVar.h0(obj3);
                L18 = obj3;
            } else {
                ao0Var3 = ao0Var16;
            }
            Function1 function1 = (Function1) L18;
            Object L19 = hlVar.L();
            if (L19 == obj) {
                Object sm0Var = new sm0(ao0Var3, ao0Var9, ao0Var8, ao0Var7, ao0Var5, 1);
                hlVar.h0(sm0Var);
                L19 = sm0Var;
            }
            a(function1, vyVar, (Function1) L19, hlVar, 432);
            if (((Boolean) ao0Var7.getValue()).booleanValue()) {
                hlVar.W(-86127672);
                vd.a(mo.g(vyVar, j2, p60Var), hlVar, 6);
                vz0.a(zd.a(j50.k), la0.d(4294947840L), 0.0f, 0L, 0, 0.0f, hlVar, 48);
                z = false;
            } else {
                z = false;
                hlVar.W(-98388017);
            }
            hlVar.p(z);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new se0(str, str2, function0, function02, i2);
        }
    }

    public static final void f(ao0 ao0Var, boolean z) {
        ao0Var.setValue(Boolean.valueOf(z));
    }

    public static float g(EdgeEffect edgeEffect, float f2, float f3, nr nrVar) {
        float f4 = ru.a;
        double k2 = nrVar.k() * 386.0878f * 160.0f * 0.84f;
        double d2 = ru.a * k2;
        float exp = (float) (Math.exp((ru.b / ru.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (exp > (i2 >= 31 ? d8.c(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int a2 = pk0.a(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(a2);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(a2);
        }
        return f2;
    }

    public static final boolean h(ft ftVar, long j2) {
        if (!ftVar.d.r) {
            return false;
        }
        v80 v80Var = (v80) op.I(ftVar).J.d;
        if (!v80Var.U.r) {
            return false;
        }
        long M = v80Var.M(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (M >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (M & 4294967295L));
        long j3 = ftVar.u;
        float f2 = ((int) (j3 >> 32)) + intBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f2) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [j31] */
    public static final Intent i(Context context, WebChromeClient.FileChooserParams fileChooserParams, Uri uri) {
        Intent j31Var;
        Intent intent;
        try {
            i31 i31Var = k31.d;
            j31Var = fileChooserParams.createIntent();
            j31Var.addCategory("android.intent.category.OPENABLE");
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        if (k31.a(j31Var) != null) {
            j31Var = new Intent("android.intent.action.GET_CONTENT");
            j31Var.addCategory("android.intent.category.OPENABLE");
            j31Var.setType("*/*");
            j31Var.putExtra("android.intent.extra.ALLOW_MULTIPLE", fileChooserParams.getMode() == 1);
        }
        Intent intent2 = j31Var;
        if (uri != null) {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uri);
            intent.addFlags(3);
            intent.setClipData(ClipData.newUri(context.getContentResolver(), "Camera image", uri));
        } else {
            intent = null;
        }
        Intent intent3 = new Intent("android.intent.action.CHOOSER");
        intent3.putExtra("android.intent.extra.INTENT", intent2);
        intent3.putExtra("android.intent.extra.TITLE", "Select file");
        if (intent != null) {
            intent3.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
        }
        return intent3;
    }

    public static final View j(zl0 zl0Var) {
        pn1 pn1Var = op.I(zl0Var.d).t;
        View interopView = pn1Var != null ? pn1Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        dd0.j("Could not fetch interop view");
        return null;
    }

    public static final pn1 k(jd0 jd0Var) {
        pn1 pn1Var = jd0Var.t;
        if (pn1Var != null) {
            return pn1Var;
        }
        throw qy0.g("Required value was null.");
    }

    public static final void l(o1 o1Var, l81 l81Var) {
        h81 h81Var = l81Var.d;
        vn0 vn0Var = h81Var.d;
        Object g2 = h81Var.d.g(p81.w);
        if (g2 == null) {
            g2 = null;
        }
        if (la0.q(l81Var)) {
            Object g3 = vn0Var.g(g81.x);
            if (g3 == null) {
                g3 = null;
            }
            z0 z0Var = (z0) g3;
            if (z0Var != null) {
                o1Var.a(new m1(null, R.id.accessibilityActionPageUp, z0Var.a, null));
            }
            Object g4 = vn0Var.g(g81.z);
            if (g4 == null) {
                g4 = null;
            }
            z0 z0Var2 = (z0) g4;
            if (z0Var2 != null) {
                o1Var.a(new m1(null, R.id.accessibilityActionPageDown, z0Var2.a, null));
            }
            Object g5 = vn0Var.g(g81.y);
            if (g5 == null) {
                g5 = null;
            }
            z0 z0Var3 = (z0) g5;
            if (z0Var3 != null) {
                o1Var.a(new m1(null, R.id.accessibilityActionPageLeft, z0Var3.a, null));
            }
            Object g6 = vn0Var.g(g81.A);
            if (g6 == null) {
                g6 = null;
            }
            z0 z0Var4 = (z0) g6;
            if (z0Var4 != null) {
                o1Var.a(new m1(null, R.id.accessibilityActionPageRight, z0Var4.a, null));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(vf1 vf1Var, nx0 nx0Var, yc ycVar) {
        a30 a30Var;
        int i2;
        int size;
        int i3;
        if (ycVar instanceof a30) {
            a30Var = (a30) ycVar;
            int i4 = a30Var.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                a30Var.k = i4 - Integer.MIN_VALUE;
                Object obj = a30Var.j;
                tn tnVar = tn.d;
                i2 = a30Var.k;
                if (i2 != 0) {
                    ca0.v(obj);
                    List list = vf1Var.j.w.a;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (((qx0) list.get(i5)).d) {
                            a30Var.h = vf1Var;
                            a30Var.i = nx0Var;
                            a30Var.k = 1;
                            obj = vf1Var.a(nx0Var, a30Var);
                            if (obj == tnVar) {
                            }
                            List list2 = ((mx0) obj).a;
                            size = list2.size();
                            i3 = 0;
                            while (i3 < size) {
                            }
                            return Unit.a;
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nx0 nx0Var2 = a30Var.i;
                vf1 vf1Var2 = a30Var.h;
                ca0.v(obj);
                nx0Var = nx0Var2;
                vf1Var = vf1Var2;
                List list22 = ((mx0) obj).a;
                size = list22.size();
                i3 = 0;
                while (i3 < size) {
                    if (((qx0) list22.get(i3)).d) {
                        a30Var.h = vf1Var;
                        a30Var.i = nx0Var;
                        a30Var.k = 1;
                        obj = vf1Var.a(nx0Var, a30Var);
                        if (obj == tnVar) {
                            return tnVar;
                        }
                        List list222 = ((mx0) obj).a;
                        size = list222.size();
                        i3 = 0;
                        while (i3 < size) {
                        }
                    } else {
                        i3++;
                    }
                }
                return Unit.a;
            }
        }
        a30Var = new a30(ycVar);
        Object obj2 = a30Var.j;
        tn tnVar2 = tn.d;
        i2 = a30Var.k;
        if (i2 != 0) {
        }
    }

    public static final Object n(ux0 ux0Var, Function2 function2, dn dnVar) {
        tn tnVar;
        Unit unit;
        b30 b30Var = new b30(dnVar.g(), function2, null);
        wf1 wf1Var = (wf1) ux0Var;
        wf1Var.getClass();
        tf tfVar = new tf(1, qa0.b(dnVar));
        tfVar.w();
        vf1 vf1Var = new vf1(wf1Var, tfVar);
        synchronized (wf1Var.y) {
            wf1Var.x.b(vf1Var);
            dn b2 = qa0.b(qa0.a(vf1Var, vf1Var, b30Var));
            tnVar = tn.d;
            h51 h51Var = new h51(b2);
            i31 i31Var = k31.d;
            unit = Unit.a;
            h51Var.l(unit);
        }
        tfVar.y(new a3(24, vf1Var));
        Object u = tfVar.u();
        return u == tnVar ? u : unit;
    }

    public static final int o(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final boolean r(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = nv.d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    l81 l81Var = (l81) obj2;
                    l81 l81Var2 = (l81) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (l81Var2.g().a() >> 32)) - Float.intBitsToFloat((int) (l81Var.g().a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (l81Var2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (l81Var.g().a() & 4294967295L)));
                    arrayList2.add(new wq0((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((wq0) CollectionsKt.p(list)).a;
            } else {
                if (list.isEmpty()) {
                    zh0.b("Empty collection can't be reduced.");
                }
                Object p2 = CollectionsKt.p(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        p2 = new wq0(wq0.e(((wq0) p2).a, ((wq0) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((wq0) p2).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final en0 v(o81 o81Var, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            l81 a2 = o81Var.a();
            jd0 jd0Var = a2.c;
            if (jd0Var.G() && jd0Var.F()) {
                en0 en0Var = new en0(48);
                nq0 nq0Var = new nq0(10);
                x90 C = y90.C(a2.g());
                ((Region) nq0Var.e).set(C.a, C.b, C.c, C.d);
                w(nq0Var, a2, en0Var, function1, a2, new nq0(10));
                return en0Var;
            }
            en0 en0Var2 = r90.a;
            en0Var2.getClass();
            return en0Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void w(nq0 nq0Var, l81 l81Var, en0 en0Var, Function1 function1, l81 l81Var2, nq0 nq0Var2) {
        s11 d1;
        jd0 jd0Var;
        l81 l81Var3 = l81Var;
        int i2 = l81Var3.g;
        nq0 nq0Var3 = nq0Var2;
        Region region = (Region) nq0Var3.e;
        jd0 jd0Var2 = l81Var2.c;
        int i3 = l81Var2.g;
        boolean z = (jd0Var2.G() && jd0Var2.F()) ? false : true;
        nq0 nq0Var4 = nq0Var;
        Region region2 = (Region) nq0Var4.e;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z || l81Var2.e) {
                yq f2 = l81Var2.f();
                if (f2 == null) {
                    d1 = ((v80) jd0Var2.J.d).d1();
                } else {
                    zl0 zl0Var = ((zl0) f2).d;
                    Object g2 = l81Var2.d.d.g(g81.b);
                    if (g2 == null) {
                        g2 = null;
                    }
                    boolean z2 = g2 != null;
                    if (!zl0Var.d.r) {
                        d1 = s11.e;
                    } else if (z2) {
                        d1 = op.G(zl0Var, 8).d1();
                    } else {
                        qp0 G = op.G(zl0Var, 8);
                        d1 = t80.n(G).J(G, true);
                    }
                }
                x90 C = y90.C(d1);
                region.set(C.a, C.b, C.c, C.d);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (l81Var2.e) {
                        l81 l2 = l81Var2.l();
                        en0Var.h(i3, new n81(l81Var2, y90.C((l2 == null || (jd0Var = l2.c) == null || !jd0Var.G()) ? n : l2.g())));
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            en0Var.h(i3, new n81(l81Var2, new x90(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                en0Var.h(i3, new n81(l81Var2, new x90(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List j2 = l81.j(4, l81Var2);
                int size = j2.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) function1.invoke(j2.get(size))).booleanValue()) {
                        w(nq0Var4, l81Var3, en0Var, function1, (l81) j2.get(size), nq0Var3);
                    }
                    size--;
                    nq0Var4 = nq0Var;
                    l81Var3 = l81Var;
                    nq0Var3 = nq0Var2;
                }
                if (C(l81Var2)) {
                    region2.op(C.a, C.b, C.c, C.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final float x(Layout layout, int i2, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = ih1.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : q70.a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float y(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = ih1.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? q70.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final void z(Throwable th, CoroutineContext coroutineContext) {
        try {
            mn mnVar = (mn) coroutineContext.d(j50.u);
            if (mnVar != null) {
                mnVar.y(th, coroutineContext);
            } else {
                op.A(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                lw.a(runtimeException, th);
                th = runtimeException;
            }
            op.A(th, coroutineContext);
        }
    }

    public abstract void G(r0 r0Var, r0 r0Var2);

    public abstract void H(r0 r0Var, Thread thread);

    public b8 p(Context context, Looper looper, jb jbVar, Object obj, e50 e50Var, f50 f50Var) {
        return q(context, looper, jbVar, obj, (es1) e50Var, (es1) f50Var);
    }

    public b8 q(Context context, Looper looper, jb jbVar, Object obj, es1 es1Var, es1 es1Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract boolean s(s0 s0Var, o0 o0Var);

    public abstract boolean t(s0 s0Var, Object obj, Object obj2);

    public abstract boolean u(s0 s0Var, r0 r0Var, r0 r0Var2);
}
