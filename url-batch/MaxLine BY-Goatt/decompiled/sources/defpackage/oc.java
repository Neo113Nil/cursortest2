package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oc extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(z72 z72Var, yf2 yf2Var, z72 z72Var2, b80 b80Var) {
        super(1);
        this.m = 4;
        this.n = z72Var;
        this.o = yf2Var;
        this.p = z72Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean booleanValue;
        int i = this.m;
        wy2 wy2Var = null;
        Object obj2 = this.o;
        Object obj3 = this.p;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                return new nc((fn2) obj4, obj2, (zc) obj3, 0);
            case 1:
                nv2 nv2Var = (nv2) obj;
                ((zn1) obj2).setValue(nv2Var);
                zn1 zn1Var = (zn1) obj3;
                boolean b = Intrinsics.b((String) zn1Var.getValue(), nv2Var.a.n);
                yd ydVar = nv2Var.a;
                zn1Var.setValue(ydVar.n);
                if (!b) {
                    ((Function1) obj4).invoke(ydVar.n);
                }
                return Unit.a;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                h20 h20Var = (h20) obj4;
                float f = h20Var.C ? 1.0f : -1.0f;
                cg2 cg2Var = h20Var.B;
                long d = cg2Var.d(cg2Var.g(f * floatValue));
                cg2 cg2Var2 = ((ag2) obj3).a;
                float f2 = cg2Var.f(cg2Var.d(cg2.a(cg2Var2, cg2Var2.h, d, 1))) * f;
                if (Math.abs(f2) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f2 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    ((g61) obj2).f(cancellationException);
                }
                return Unit.a;
            case 3:
                yd0 yd0Var = (yd0) obj;
                sc1 sc1Var = (sc1) obj4;
                cw2 d2 = sc1Var.d();
                if (d2 != null) {
                    long j = ((nv2) obj2).b;
                    cu1 cu1Var = (cu1) obj3;
                    ls o = yd0Var.F().o();
                    long j2 = ((jw2) sc1Var.x.getValue()).a;
                    long j3 = ((jw2) sc1Var.y.getValue()).a;
                    bw2 bw2Var = d2.a;
                    aw2 aw2Var = bw2Var.a;
                    sm1 sm1Var = bw2Var.b;
                    vs3 vs3Var = sc1Var.v;
                    long j4 = sc1Var.w;
                    if (!jw2.b(j2)) {
                        vs3Var.e(j4);
                        int g = cu1Var.g(jw2.e(j2));
                        int g2 = cu1Var.g(jw2.d(j2));
                        if (g != g2) {
                            o.f(bw2Var.j(g, g2), vs3Var);
                        }
                    } else if (!jw2.b(j3)) {
                        long b2 = aw2Var.b.b();
                        aw awVar = b2 == 16 ? null : new aw(b2);
                        long j5 = awVar != null ? awVar.a : aw.b;
                        vs3Var.e(aw.b(j5, aw.d(j5) * 0.2f));
                        int g3 = cu1Var.g(jw2.e(j3));
                        int g4 = cu1Var.g(jw2.d(j3));
                        if (g3 != g4) {
                            o.f(bw2Var.j(g3, g4), vs3Var);
                        }
                    } else if (!jw2.b(j)) {
                        vs3Var.e(j4);
                        int g5 = cu1Var.g(jw2.e(j));
                        int g6 = cu1Var.g(jw2.d(j));
                        if (g5 != g6) {
                            o.f(bw2Var.j(g5, g6), vs3Var);
                        }
                    }
                    long j6 = bw2Var.c;
                    boolean z = ((((float) ((int) (j6 >> 32))) > sm1Var.d ? 1 : (((float) ((int) (j6 >> 32))) == sm1Var.d ? 0 : -1)) < 0 || sm1Var.c || (((float) ((int) (j6 & 4294967295L))) > sm1Var.e ? 1 : (((float) ((int) (j6 & 4294967295L))) == sm1Var.e ? 0 : -1)) < 0) && aw2Var.f != 3;
                    if (z) {
                        w72 p = tk3.p(0L, (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32));
                        o.m();
                        ls.l(o, p);
                    }
                    un2 un2Var = aw2Var.b.a;
                    xt2 xt2Var = un2Var.m;
                    pv2 pv2Var = un2Var.a;
                    if (xt2Var == null) {
                        xt2Var = xt2.b;
                    }
                    dk2 dk2Var = un2Var.n;
                    if (dk2Var == null) {
                        dk2Var = dk2.d;
                    }
                    dk2 dk2Var2 = dk2Var;
                    ae0 ae0Var = un2Var.p;
                    if (ae0Var == null) {
                        ae0Var = vl0.a;
                    }
                    ae0 ae0Var2 = ae0Var;
                    try {
                        cq c = pv2Var.c();
                        ov2 ov2Var = ov2.a;
                        if (c != null) {
                            sm1.g(sm1Var, o, c, pv2Var != ov2Var ? pv2Var.a() : 1.0f, dk2Var2, xt2Var, ae0Var2);
                        } else {
                            xt2 xt2Var2 = xt2Var;
                            long b3 = pv2Var != ov2Var ? pv2Var.b() : aw.b;
                            o.m();
                            ArrayList arrayList = sm1Var.h;
                            int size = arrayList.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                az1 az1Var = (az1) arrayList.get(i2);
                                az1Var.a.f(o, b3, dk2Var2, xt2Var2, ae0Var2);
                                o.h(0.0f, az1Var.a.b());
                            }
                            o.j();
                        }
                        if (z) {
                            o.j();
                        }
                    } catch (Throwable th) {
                        if (z) {
                            o.j();
                        }
                        throw th;
                    }
                }
                return Unit.a;
            case 4:
                ld ldVar = (ld) obj;
                z72 z72Var = (z72) obj4;
                float floatValue2 = ((Number) ldVar.e.getValue()).floatValue() - z72Var.m;
                float a = ((yf2) obj2).a(floatValue2);
                z72Var.m = ((Number) ldVar.e.getValue()).floatValue();
                ((z72) obj3).m = ((Number) ldVar.a.b.invoke(ldVar.f)).floatValue();
                if (Math.abs(floatValue2 - a) > 0.5f) {
                    ldVar.i.setValue(Boolean.FALSE);
                    ldVar.d.invoke();
                }
                return Unit.a;
            case 5:
                fn2 fn2Var = (fn2) obj4;
                cp1 cp1Var = (cp1) obj2;
                fn2Var.add(cp1Var);
                return new nc((ab0) obj3, cp1Var, fn2Var);
            case 6:
                rz2 rz2Var = (rz2) obj;
                uc0 uc0Var = (uc0) rz2Var;
                if (!((n9) ((t7) s03.K((uc0) obj2)).m19getDragAndDropManager()).b.contains(uc0Var) || !o70.m(uc0Var, l41.F((ar0) obj3))) {
                    return qz2.m;
                }
                ((c82) obj4).m = rz2Var;
                return qz2.o;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ia2 ia2Var = (ia2) obj;
                so2 so2Var = (so2) obj2;
                so2 so2Var2 = (so2) obj4;
                ia2Var.a(so2Var2 != null ? ((Number) so2Var2.getValue()).floatValue() : 1.0f);
                ia2Var.e(so2Var != null ? ((Number) so2Var.getValue()).floatValue() : 1.0f);
                ia2Var.g(so2Var != null ? ((Number) so2Var.getValue()).floatValue() : 1.0f);
                so2 so2Var3 = (so2) obj3;
                ia2Var.l(so2Var3 != null ? ((wy2) so2Var3.getValue()).a : wy2.b);
                return Unit.a;
            case 8:
                uj0 uj0Var = (uj0) obj3;
                int ordinal = ((th0) obj).ordinal();
                if (ordinal == 0) {
                    gz2 gz2Var = uj0Var.a;
                } else if (ordinal == 1) {
                    wy2Var = (wy2) obj4;
                } else {
                    if (ordinal != 2) {
                        a.b();
                        return null;
                    }
                    gz2 gz2Var2 = uj0Var.a;
                }
                return new wy2(wy2Var != null ? wy2Var.a : wy2.b);
            case 9:
                yo0 yo0Var = (yo0) obj;
                if (Intrinsics.b(yo0Var, (yo0) obj4)) {
                    booleanValue = false;
                } else {
                    if (Intrinsics.b(yo0Var, ((po0) obj2).c)) {
                        lh.g("Focus search landed at the root.");
                        return null;
                    }
                    booleanValue = ((Boolean) ((Function1) obj3).invoke(yo0Var)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case 10:
                m12 m12Var = (m12) obj;
                qj1 qj1Var = (qj1) obj3;
                xx1 xx1Var = (xx1) obj4;
                boolean z2 = xx1Var.E;
                n12 n12Var = (n12) obj2;
                float f3 = xx1Var.A;
                if (z2) {
                    m12.i(m12Var, n12Var, qj1Var.R(f3), qj1Var.R(xx1Var.B));
                } else {
                    m12.g(m12Var, n12Var, qj1Var.R(f3), qj1Var.R(xx1Var.B));
                }
                return Unit.a;
            case 11:
                qj1 qj1Var2 = (qj1) obj2;
                ay1 ay1Var = (ay1) obj3;
                m12.g((m12) obj, (n12) obj4, qj1Var2.R(ay1Var.A.a(qj1Var2.getLayoutDirection())), qj1Var2.R(ay1Var.A.d()));
                return Unit.a;
            default:
                Function1 function1 = (Function1) obj2;
                wv2 wv2Var = (wv2) ((c82) obj3).m;
                nv2 f4 = ((t21) obj4).f((List) obj);
                if (wv2Var != null) {
                    wv2Var.a(null, f4);
                }
                function1.invoke(f4);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }
}
