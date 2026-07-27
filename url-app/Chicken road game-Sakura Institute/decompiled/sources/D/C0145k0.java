package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import w.AbstractC1264d;

/* renamed from: D.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145k0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1870e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0145k0(int i2, long j4, Object obj) {
        super(2);
        this.f1869d = i2;
        this.f1870e = j4;
        this.f1871i = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f1869d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    E.a.a(this.f1870e, U1.a(F.f.f2387a, c0216p), O.f.b(-1771489750, new A((O.a) this.f1871i, 1), c0216p), c0216p, 384);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    long j4 = this.f1870e;
                    if (j4 != 9205357640488583168L) {
                        c0216p2.S(1828881000);
                        S.o f4 = androidx.compose.foundation.layout.c.f((S.o) this.f1871i, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), 0.0f, 0.0f, 12);
                        InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3953e, false);
                        int i2 = c0216p2.f2861P;
                        InterfaceC0213n0 m4 = c0216p2.m();
                        S.o d4 = S.a.d(c0216p2, f4);
                        InterfaceC1070k.f9822h.getClass();
                        C1068i c1068i = C1069j.f9816b;
                        c0216p2.W();
                        if (c0216p2.f2860O) {
                            c0216p2.l(c1068i);
                        } else {
                            c0216p2.f0();
                        }
                        C0192d.R(c0216p2, e4, C1069j.f9820f);
                        C0192d.R(c0216p2, m4, C1069j.f9819e);
                        C1067h c1067h = C1069j.f9821g;
                        if (c0216p2.f2860O || !Intrinsics.a(c0216p2.I(), Integer.valueOf(i2))) {
                            AbstractC0017m.r(i2, c0216p2, i2, c1067h);
                        }
                        C0192d.R(c0216p2, d4, C1069j.f9818d);
                        AbstractC1264d.b(null, c0216p2, 0, 1);
                        c0216p2.q(true);
                        c0216p2.q(false);
                    } else {
                        c0216p2.S(1829217412);
                        AbstractC1264d.b((S.o) this.f1871i, c0216p2, 0, 0);
                        c0216p2.q(false);
                    }
                }
                break;
        }
        return Unit.f7487a;
    }
}
