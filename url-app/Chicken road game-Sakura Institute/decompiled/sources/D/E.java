package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import Z.C0323u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import q.AbstractC1031j;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* loaded from: classes.dex */
public final class E extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q.a0 f1219e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f1220i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f1221j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1222k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O.a f1223l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1224m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(float f4, q.a0 a0Var, Function2 function2, Function2 function22, long j4, O.a aVar, long j5) {
        super(2);
        this.f1218d = f4;
        this.f1219e = a0Var;
        this.f1220i = function2;
        this.f1221j = function22;
        this.f1222k = j4;
        this.f1223l = aVar;
        this.f1224m = j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v22 */
    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ?? r9;
        boolean z4;
        boolean z5;
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            S.l lVar = S.l.f3977a;
            S.o g4 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.a(lVar, Float.NaN, this.f1218d), this.f1219e);
            D d4 = D.f1212b;
            int i2 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d5 = S.a.d(c0216p, g4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, d4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                AbstractC0017m.r(i2, c0216p, i2, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d5, c1067h4);
            c0216p.S(-1293169671);
            S.g gVar = S.b.f3956k;
            Function2 function2 = this.f1220i;
            if (function2 != null) {
                S.o c4 = androidx.compose.ui.layout.a.c(lVar, "leadingIcon");
                InterfaceC0945F e4 = AbstractC1035n.e(gVar, false);
                int i4 = c0216p.f2861P;
                InterfaceC0213n0 m5 = c0216p.m();
                S.o d6 = S.a.d(c0216p, c4);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e4, c1067h);
                C0192d.R(c0216p, m5, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i4))) {
                    AbstractC0017m.r(i4, c0216p, i4, c1067h3);
                }
                C0192d.R(c0216p, d6, c1067h4);
                if (function2 != null) {
                    c0216p.S(832788565);
                    C0192d.a(S.f1616a.a(new C0323u(this.f1222k)), function2, c0216p, 8);
                    z5 = false;
                    c0216p.q(false);
                } else {
                    z5 = false;
                    c0216p.S(833040347);
                    c0216p.q(false);
                }
                c0216p.q(true);
                r9 = z5;
            } else {
                r9 = 0;
            }
            c0216p.q(r9);
            S.o i5 = androidx.compose.foundation.layout.b.i(androidx.compose.ui.layout.a.c(lVar, "label"), J.f1339a, (float) r9);
            q.f0 b4 = q.e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 54);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            S.o d7 = S.a.d(c0216p, i5);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b4, c1067h);
            C0192d.R(c0216p, m6, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h3);
            }
            C0192d.R(c0216p, d7, c1067h4);
            this.f1223l.h(c0216p, 0);
            c0216p.q(true);
            c0216p.S(-1293135324);
            Function2 function22 = this.f1221j;
            if (function22 != null) {
                S.o c5 = androidx.compose.ui.layout.a.c(lVar, "trailingIcon");
                InterfaceC0945F e5 = AbstractC1035n.e(gVar, false);
                int i7 = c0216p.f2861P;
                InterfaceC0213n0 m7 = c0216p.m();
                S.o d8 = S.a.d(c0216p, c5);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e5, c1067h);
                C0192d.R(c0216p, m7, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                    AbstractC0017m.r(i7, c0216p, i7, c1067h3);
                }
                C0192d.R(c0216p, d8, c1067h4);
                C0192d.a(S.f1616a.a(new C0323u(this.f1224m)), function22, c0216p, 8);
                z4 = true;
                c0216p.q(true);
            } else {
                z4 = true;
            }
            c0216p.q(false);
            c0216p.q(z4);
        }
        return Unit.f7487a;
    }
}
