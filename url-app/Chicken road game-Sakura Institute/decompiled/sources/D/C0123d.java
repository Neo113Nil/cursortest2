package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import Z.C0323u;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1041t;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: D.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123d extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f1732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f1733e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f1734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1735j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f1737l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1738m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O.a f1739n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0123d(Function2 function2, Function2 function22, Function2 function23, long j4, long j5, long j6, long j7, O.a aVar) {
        super(2);
        this.f1732d = function2;
        this.f1733e = function22;
        this.f1734i = function23;
        this.f1735j = j4;
        this.f1736k = j5;
        this.f1737l = j6;
        this.f1738m = j7;
        this.f1739n = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        int i2 = 1;
        int i4 = 0;
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            S.o g4 = androidx.compose.foundation.layout.b.g(S.l.f3977a, AbstractC0150m.f1892e);
            C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, g4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, a4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            c0216p.S(-1924971291);
            Function2 function2 = this.f1732d;
            if (function2 != null) {
                C0192d.a(S.f1616a.a(new C0323u(this.f1735j)), O.f.b(934657765, new C0117b(function2, i4), c0216p), c0216p, 56);
            }
            c0216p.q(false);
            c0216p.S(-1924961479);
            Function2 function22 = this.f1733e;
            if (function22 != null) {
                E.a.a(this.f1736k, U1.a(F.c.f2378c, c0216p), O.f.b(434448772, new C0120c(function2, i4, function22), c0216p), c0216p, 384);
            }
            c0216p.q(false);
            c0216p.S(-1924936431);
            Function2 function23 = this.f1734i;
            if (function23 != null) {
                E.a.a(this.f1737l, U1.a(F.c.f2380e, c0216p), O.f.b(-796843771, new C0117b(function23, i2), c0216p), c0216p, 384);
            }
            c0216p.q(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(S.b.f3965t);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, horizontalAlignElement);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h3);
            }
            C0192d.R(c0216p, d5, c1067h4);
            int i7 = F.c.f2376a;
            E.a.a(this.f1738m, U1.a(10, c0216p), this.f1739n, c0216p, 0);
            c0216p.q(true);
            c0216p.q(true);
        }
        return Unit.f7487a;
    }
}
