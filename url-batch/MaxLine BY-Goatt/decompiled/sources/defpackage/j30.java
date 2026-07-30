package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j30 extends o81 implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j30(int i, Object obj, Object obj2) {
        super(3);
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a8, code lost:
    
        if (r0 != false) goto L69;
     */
    @Override // defpackage.xt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, Object obj2, Object obj3) {
        vl1 k;
        int i = this.m;
        int i2 = 6;
        o30 o30Var = null;
        nj njVar = sz.a;
        Object obj4 = this.n;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && a00Var.B()) {
                    a00Var.S();
                } else {
                    Object M = a00Var.M();
                    if (M == njVar) {
                        M = new b30();
                        a00Var.i0(M);
                    }
                    b30 b30Var = (b30) M;
                    b30Var.a.clear();
                    ((ih2) obj4).invoke(b30Var);
                    b30Var.a((y20) obj5, a00Var, 0);
                }
                return Unit.a;
            case 1:
                t22 t22Var = (t22) obj;
                t22 t22Var2 = (t22) obj2;
                long j = ((au1) obj3).a;
                tf2 tf2Var = (tf2) obj4;
                if (((Boolean) tf2Var.D.invoke(t22Var)).booleanValue()) {
                    if (!tf2Var.I) {
                        if (tf2Var.G == null) {
                            tf2Var.G = s93.g(Integer.MAX_VALUE, 6, null);
                        }
                        tf2Var.I = true;
                        z71.H(tf2Var.u0(), null, new md0(tf2Var, null), 3);
                    }
                    ph2.c((i43) obj5, t22Var);
                    long f = au1.f(t22Var2.c, j);
                    lq lqVar = tf2Var.G;
                    if (lqVar != null) {
                        lqVar.d(new yc0(f));
                    }
                }
                return Unit.a;
            case 2:
                a00 a00Var2 = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var2.X(-353972293);
                a21 b = ((z11) obj4).b((b41) obj5, a00Var2);
                boolean f2 = a00Var2.f(b);
                Object M2 = a00Var2.M();
                if (f2 || M2 == njVar) {
                    M2 = new b21(b);
                    a00Var2.i0(M2);
                }
                b21 b21Var = (b21) M2;
                a00Var2.q(false);
                return b21Var;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                float floatValue3 = ((Number) obj3).floatValue();
                q80 q80Var = (q80) obj4;
                boolean O = q80Var.l().e == ww1.m ? j8.O(q80Var) : ((u81) obj5) == u81.m ? j8.O(q80Var) : !j8.O(q80Var);
                int i3 = q80Var.l().b;
                float w = i3 == 0 ? 0.0f : j8.w(q80Var) / i3;
                float f3 = w - ((int) w);
                char c = Math.abs(floatValue) >= q80Var.p.D(400.0f) ? floatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            floatValue2 = 0.0f;
                        }
                    }
                    floatValue2 = floatValue3;
                } else if (Math.abs(f3) <= 0.5f) {
                    float abs = Math.abs(w);
                    ca0 ca0Var = q80Var.p;
                    ky1 ky1Var = uy1.a;
                    if (abs < Math.abs(Math.min(ca0Var.D(56.0f), q80Var.n() / 2.0f) / q80Var.n())) {
                        floatValue2 = floatValue3;
                        break;
                    } else {
                        floatValue2 = floatValue3;
                    }
                }
                return Float.valueOf(floatValue2);
            case 4:
                a00 a00Var3 = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var3.X(759876635);
                Function0 function0 = (Function0) obj4;
                Object M3 = a00Var3.M();
                if (M3 == njVar) {
                    M3 = ij2.f(function0);
                    a00Var3.i0(M3);
                }
                so2 so2Var = (so2) M3;
                Object M4 = a00Var3.M();
                if (M4 == njVar) {
                    M4 = new jc(new au1(((au1) so2Var.getValue()).a), oh2.b, new au1(oh2.c), 8);
                    a00Var3.i0(M4);
                }
                jc jcVar = (jc) M4;
                Unit unit = Unit.a;
                boolean h = a00Var3.h(jcVar);
                Object M5 = a00Var3.M();
                if (h || M5 == njVar) {
                    M5 = new ed(so2Var, jcVar, o30Var, 19);
                    a00Var3.i0(M5);
                }
                l41.h(a00Var3, unit, (Function2) M5);
                nd ndVar = jcVar.c;
                Function1 function1 = (Function1) obj5;
                boolean f4 = a00Var3.f(ndVar);
                Object M6 = a00Var3.M();
                if (f4 || M6 == njVar) {
                    M6 = new bq1(ndVar, 2);
                    a00Var3.i0(M6);
                }
                vl1 vl1Var = (vl1) function1.invoke((Function0) M6);
                a00Var3.q(false);
                return vl1Var;
            default:
                a00 a00Var4 = (a00) obj2;
                ((Number) obj3).intValue();
                bn1 bn1Var = (bn1) obj5;
                a00Var4.X(-102778667);
                Object M7 = a00Var4.M();
                if (M7 == njVar) {
                    q00 q00Var = new q00(l41.x(h.m, a00Var4));
                    a00Var4.i0(q00Var);
                    M7 = q00Var;
                }
                a50 a50Var = ((q00) M7).m;
                Object M8 = a00Var4.M();
                if (M8 == njVar) {
                    M8 = ij2.j(null);
                    a00Var4.i0(M8);
                }
                zn1 zn1Var = (zn1) M8;
                zn1 k2 = ij2.k((Function1) obj4, a00Var4);
                boolean f5 = a00Var4.f(bn1Var);
                Object M9 = a00Var4.M();
                if (f5 || M9 == njVar) {
                    M9 = new ih2(i2, zn1Var, bn1Var);
                    a00Var4.i0(M9);
                }
                l41.f(bn1Var, (Function1) M9, a00Var4);
                boolean h2 = a00Var4.h(a50Var) | a00Var4.f(bn1Var) | a00Var4.f(k2);
                bn1 bn1Var2 = (bn1) obj5;
                Object M10 = a00Var4.M();
                if (h2 || M10 == njVar) {
                    da daVar = new da(a50Var, zn1Var, bn1Var2, k2, null, 9);
                    a00Var4.i0(daVar);
                    M10 = daVar;
                }
                k = sl1.a.k(new SuspendPointerInputElement(bn1Var, null, new qr2((Function2) M10), 6));
                a00Var4.q(false);
                return k;
        }
    }
}
