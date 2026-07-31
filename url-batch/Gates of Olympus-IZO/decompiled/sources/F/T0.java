package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0110n0;
import androidx.compose.material3.MinimumInteractiveModifier;
import b0.InterfaceC0263N;
import n.C0665u;
import r.AbstractC0818o;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import u0.AbstractC0963b0;

/* loaded from: classes.dex */
public final class T0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.l f1107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0263N f1108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f1110h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0665u f1111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1112j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q.j f1113k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y1.a f1115m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f1116n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q.a f1117o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(U.l lVar, InterfaceC0263N interfaceC0263N, long j3, float f3, C0665u c0665u, boolean z3, q.j jVar, boolean z4, Y1.a aVar, float f4, Q.a aVar2) {
        super(2);
        this.f1107e = lVar;
        this.f1108f = interfaceC0263N;
        this.f1109g = j3;
        this.f1110h = f3;
        this.f1111i = c0665u;
        this.f1112j = z3;
        this.f1113k = jVar;
        this.f1114l = z4;
        this.f1115m = aVar;
        this.f1116n = f4;
        this.f1117o = aVar2;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            I.Y0 y02 = AbstractC0031b0.f1199a;
            U.l c3 = U0.c(this.f1107e.e(MinimumInteractiveModifier.f3695a), this.f1108f, U0.d(this.f1109g, this.f1110h, c0113p), this.f1111i, ((M0.b) c0113p.k(AbstractC0963b0.f8296f)).F(this.f1116n));
            n.Q a3 = B0.a(0.0f, c0113p, 0, 7);
            U.l a4 = androidx.compose.foundation.selection.b.a(c3, this.f1112j, this.f1113k, a3, this.f1114l, null, this.f1115m);
            InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3280d, true);
            int i3 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c4 = U.m.c(c0113p, a4);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, e3);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i3))) {
                AbstractC0080b.p(i3, c0113p, i3, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c4);
            this.f1117o.g(c0113p, 0);
            c0113p.p(true);
        }
        return L1.z.f2729a;
    }
}
