package E;

import A.AbstractC0017m;
import A0.L;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0213n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.j0;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* loaded from: classes.dex */
public final class p extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f2221e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2222i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f2223j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f2224k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(j0 j0Var, long j4, L l4, Function2 function2, int i2) {
        super(2);
        this.f2220d = i2;
        this.f2221e = j0Var;
        this.f2222i = j4;
        this.f2223j = l4;
        this.f2224k = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f2220d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.l lVar = S.l.f3977a;
                    j0 j0Var = this.f2221e;
                    boolean f4 = c0216p.f(j0Var);
                    Object I3 = c0216p.I();
                    if (f4 || I3 == C0208l.f2826a) {
                        I3 = new n(j0Var, 1);
                        c0216p.c0(I3);
                    }
                    S.o a4 = androidx.compose.ui.graphics.a.a(lVar, (Function1) I3);
                    InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
                    int i2 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, a4);
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
                    v.b(this.f2222i, this.f2223j, this.f2224k, c0216p, 0);
                    c0216p.q(true);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    S.l lVar2 = S.l.f3977a;
                    j0 j0Var2 = this.f2221e;
                    boolean f5 = c0216p2.f(j0Var2);
                    Object I4 = c0216p2.I();
                    if (f5 || I4 == C0208l.f2826a) {
                        I4 = new n(j0Var2, 2);
                        c0216p2.c0(I4);
                    }
                    S.o a5 = androidx.compose.ui.graphics.a.a(lVar2, (Function1) I4);
                    InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3952d, false);
                    int i4 = c0216p2.f2861P;
                    InterfaceC0213n0 m5 = c0216p2.m();
                    S.o d5 = S.a.d(c0216p2, a5);
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
                    v.b(this.f2222i, this.f2223j, this.f2224k, c0216p2, 0);
                    c0216p2.q(true);
                }
                break;
        }
        return Unit.f7487a;
    }
}
