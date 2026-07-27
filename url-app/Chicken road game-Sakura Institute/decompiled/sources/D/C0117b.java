package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import q.C1042u;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: D.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117b extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f1715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0117b(Function2 function2, int i2) {
        super(2);
        this.f1714d = i2;
        this.f1715e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f1714d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.o h4 = androidx.compose.foundation.layout.b.g(S.l.f3977a, AbstractC0150m.f1893f).h(new HorizontalAlignElement(S.b.f3964s));
                    InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
                    int i2 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, h4);
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
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                        AbstractC0017m.r(i2, c0216p, i2, c1067h);
                    }
                    C0192d.R(c0216p, d4, C1069j.f9818d);
                    this.f1715e.h(c0216p, 0);
                    c0216p.q(true);
                }
                break;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    S.o h5 = androidx.compose.foundation.layout.b.g(C1042u.f9344a.a(false), AbstractC0150m.f1895h).h(new HorizontalAlignElement(S.b.f3963r));
                    InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3952d, false);
                    int i4 = c0216p2.f2861P;
                    InterfaceC0213n0 m5 = c0216p2.m();
                    S.o d5 = S.a.d(c0216p2, h5);
                    InterfaceC1070k.f9822h.getClass();
                    C1068i c1068i2 = C1069j.f9816b;
                    c0216p2.W();
                    if (c0216p2.f2860O) {
                        c0216p2.l(c1068i2);
                    } else {
                        c0216p2.f0();
                    }
                    C0192d.R(c0216p2, e5, C1069j.f9820f);
                    C0192d.R(c0216p2, m5, C1069j.f9819e);
                    C1067h c1067h2 = C1069j.f9821g;
                    if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i4))) {
                        AbstractC0017m.r(i4, c0216p2, i4, c1067h2);
                    }
                    C0192d.R(c0216p2, d5, C1069j.f9818d);
                    this.f1715e.h(c0216p2, 0);
                    c0216p2.q(true);
                }
                break;
            case 2:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    this.f1715e.h(c0216p3, 0);
                }
                break;
            default:
                C0216p c0216p4 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p4.z()) {
                    c0216p4.N();
                } else {
                    N1.a(A0.L.a(U1.a(F.r.f2500c, c0216p4), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), this.f1715e, c0216p4, 0);
                }
                break;
        }
        return Unit.f7487a;
    }
}
