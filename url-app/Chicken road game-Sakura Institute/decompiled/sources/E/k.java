package E;

import A.AbstractC0017m;
import A.C0028y;
import A.J;
import D.S0;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import M2.B;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.U;
import o.C0903o0;
import o.C0908r0;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import q.InterfaceC1021Z;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;
import s0.C1166s;
import s0.X;
import s1.C1193i;

/* loaded from: classes.dex */
public final class k extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2201e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2202i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2203j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i2) {
        super(2);
        this.f2200d = i2;
        this.f2201e = obj;
        this.f2202i = obj2;
        this.f2203j = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = 2;
        Object obj3 = this.f2201e;
        Object obj4 = this.f2202i;
        Object obj5 = this.f2203j;
        switch (this.f2200d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.o c4 = androidx.compose.ui.layout.a.c(S.l.f3977a, "Container");
                    j jVar = new j(0, 0, InterfaceC0191c0.class, (InterfaceC0191c0) obj3, "value", "getValue()Ljava/lang/Object;");
                    float f4 = S0.f1617a;
                    S.o c5 = androidx.compose.ui.draw.a.c(c4, new C0028y(jVar, i2, (InterfaceC1021Z) obj4));
                    InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, true);
                    int i4 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, c5);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i = C1069j.f9816b;
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, e4, C1069j.f9820f);
                    C0192d.R(c0216p, m4, C1069j.f9819e);
                    C1067h c1067h = C1069j.f9821g;
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i4))) {
                        AbstractC0017m.r(i4, c0216p, i4, c1067h);
                    }
                    C0192d.R(c0216p, d4, C1069j.f9818d);
                    ((Function2) obj5).h(c0216p, 0);
                    c0216p.q(true);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    n.c cVar = (n.c) obj3;
                    n.r.a(cVar, (S.o) obj4, O.f.b(1156688164, new J((C0028y) obj5, 4, cVar), c0216p2), c0216p2, 384);
                }
                break;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                B b4 = (B) obj3;
                C0908r0 c0908r0 = (C0908r0) obj4;
                long g4 = c0908r0.g(c0908r0.c(floatValue - b4.f3577d));
                C0908r0 c0908r02 = ((C0903o0) obj5).f8848a;
                b4.f3577d += c0908r0.c(c0908r0.f(C0908r0.a(c0908r02, c0908r02.f8872h, g4, 1)));
                break;
            case 3:
                C0216p c0216p3 = (C0216p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    AbstractC1144g0.a((C1166s) obj3, (X) obj4, (O.a) obj5, c0216p3, 0);
                }
                break;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                W2.B.m((InterfaceC0302y) obj3, null, null, new t1.u(floatValue2, (U) obj4, (C1193i) obj5, null), 3);
                break;
        }
        return Unit.f7487a;
    }
}
