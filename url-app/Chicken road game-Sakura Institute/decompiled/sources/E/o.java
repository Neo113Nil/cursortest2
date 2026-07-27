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
public final class o extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f2216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2217e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f2218i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f2219j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j0 j0Var, long j4, L l4, Function2 function2) {
        super(3);
        this.f2216d = j0Var;
        this.f2217e = j4;
        this.f2218i = l4;
        this.f2219j = function2;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        S.o oVar = (S.o) obj;
        C0216p c0216p = (C0216p) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0216p.f(oVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            j0 j0Var = this.f2216d;
            boolean f4 = c0216p.f(j0Var);
            Object I3 = c0216p.I();
            if (f4 || I3 == C0208l.f2826a) {
                I3 = new n(j0Var, 0);
                c0216p.c0(I3);
            }
            S.o a4 = androidx.compose.ui.graphics.a.a(oVar, (Function1) I3);
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
            v.b(this.f2217e, this.f2218i, this.f2219j, c0216p, 0);
            c0216p.q(true);
        }
        return Unit.f7487a;
    }
}
