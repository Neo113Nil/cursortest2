package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p.C0935k;
import q.AbstractC1031j;
import q.AbstractC1039r;
import q.C1041t;
import q.C1042u;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: D.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172t1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f2025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f2026e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0935k f2027i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m.Q f2028j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2029k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f2030l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.a f2031m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0172t1(S.o oVar, boolean z4, C0935k c0935k, m.Q q2, boolean z5, Function0 function0, O.a aVar) {
        super(2);
        this.f2025d = oVar;
        this.f2026e = z4;
        this.f2027i = c0935k;
        this.f2028j = q2;
        this.f2029k = z5;
        this.f2030l = function0;
        this.f2031m = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            y0.f fVar = new y0.f(4);
            S.o h4 = androidx.compose.foundation.selection.b.a(this.f2025d, this.f2026e, this.f2027i, this.f2028j, this.f2029k, fVar, this.f2030l).h(androidx.compose.foundation.layout.c.f5081a);
            C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9268d, S.b.f3964s, c0216p, 54);
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
            C0192d.R(c0216p, a4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                AbstractC0017m.r(i2, c0216p, i2, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            this.f2031m.g(C1042u.f9344a, c0216p, 6);
            c0216p.q(true);
        }
        return Unit.f7487a;
    }
}
