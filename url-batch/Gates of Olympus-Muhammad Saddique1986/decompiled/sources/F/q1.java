package F;

import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import androidx.compose.material3.MinimumInteractiveModifier;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import n.C0694u;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public final class q1 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.q f1749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.Q f1750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f1752h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0694u f1753i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.k f1754j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1755k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f1756l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1757m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q.a f1758n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(U.q qVar, b0.Q q3, long j3, float f3, C0694u c0694u, q.k kVar, boolean z3, InterfaceC0422a interfaceC0422a, float f4, Q.a aVar) {
        super(2);
        this.f1749e = qVar;
        this.f1750f = q3;
        this.f1751g = j3;
        this.f1752h = f3;
        this.f1753i = c0694u;
        this.f1754j = kVar;
        this.f1755k = z3;
        this.f1756l = interfaceC0422a;
        this.f1757m = f4;
        this.f1758n = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            I.X0 x02 = AbstractC0121t0.f1816a;
            U.q c2 = androidx.compose.foundation.a.c(r1.c(this.f1749e.i(MinimumInteractiveModifier.f4881a), this.f1750f, r1.d(this.f1751g, this.f1752h, c0167p), this.f1753i, ((O0.b) c0167p.k(AbstractC1101g0.f9354f)).J(this.f1757m)), this.f1754j, e1.a(false, 0.0f, c0167p, 0, 7), this.f1755k, null, this.f1756l, 24);
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, true);
            int i3 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, c2);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
                A.k.o(i3, c0167p, i3, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            this.f1758n.h(c0167p, 0);
            c0167p.p(true);
        }
        return R1.y.f4171a;
    }
}
