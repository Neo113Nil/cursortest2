package n;

import a.AbstractC0235a;
import a0.AbstractC0236a;
import a0.C0239d;
import a0.C0240e;
import a0.C0241f;
import b0.AbstractC0347p;
import b0.C0341j;
import b0.C0352v;
import d0.C0401b;
import d0.C0406g;
import d0.InterfaceC0403d;
import t0.AbstractC0993f;
import t0.InterfaceC1002o;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689o extends U.p implements InterfaceC1002o, t0.d0 {

    /* renamed from: q, reason: collision with root package name */
    public long f7173q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0347p f7174r;

    /* renamed from: s, reason: collision with root package name */
    public float f7175s;

    /* renamed from: t, reason: collision with root package name */
    public b0.Q f7176t;

    /* renamed from: u, reason: collision with root package name */
    public long f7177u;

    /* renamed from: v, reason: collision with root package name */
    public O0.k f7178v;

    /* renamed from: w, reason: collision with root package name */
    public b0.K f7179w;

    /* renamed from: x, reason: collision with root package name */
    public b0.Q f7180x;

    @Override // t0.d0
    public final void e0() {
        this.f7177u = 9205357640488583168L;
        this.f7178v = null;
        this.f7179w = null;
        this.f7180x = null;
        AbstractC0993f.m(this);
    }

    @Override // t0.InterfaceC1002o
    public final void h(t0.G g3) {
        C0341j c0341j;
        if (this.f7176t == b0.M.f5355a) {
            if (!C0352v.c(this.f7173q, C0352v.f5439g)) {
                g3.F(this.f7173q, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(g3.d(), 0L) : 0L, 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
            }
            AbstractC0347p abstractC0347p = this.f7174r;
            if (abstractC0347p != null) {
                InterfaceC0403d.s(g3, abstractC0347p, 0L, 0L, this.f7175s, null, 118);
            }
        } else {
            f2.u uVar = new f2.u();
            C0401b c0401b = g3.f8573d;
            if (C0241f.a(c0401b.d(), this.f7177u) && g3.getLayoutDirection() == this.f7178v && f2.j.a(this.f7180x, this.f7176t)) {
                b0.K k3 = this.f7179w;
                f2.j.c(k3);
                uVar.f5832d = k3;
            } else {
                AbstractC0993f.q(this, new K2.i(uVar, this, g3, 1));
            }
            this.f7179w = (b0.K) uVar.f5832d;
            this.f7177u = c0401b.d();
            this.f7178v = g3.getLayoutDirection();
            this.f7180x = this.f7176t;
            Object obj = uVar.f5832d;
            f2.j.c(obj);
            b0.K k4 = (b0.K) obj;
            if (!C0352v.c(this.f7173q, C0352v.f5439g)) {
                b0.M.n(g3, k4, this.f7173q);
            }
            AbstractC0347p abstractC0347p2 = this.f7174r;
            if (abstractC0347p2 != null) {
                float f3 = this.f7175s;
                C0406g c0406g = C0406g.f5653a;
                if (k4 instanceof b0.I) {
                    C0239d c0239d = ((b0.I) k4).f5352a;
                    g3.e(abstractC0347p2, l0.c.e(c0239d.f4724a, c0239d.f4725b), AbstractC0235a.e(c0239d.c(), c0239d.b()), f3, c0406g, null, 3);
                } else {
                    if (k4 instanceof b0.J) {
                        b0.J j3 = (b0.J) k4;
                        c0341j = j3.f5354b;
                        if (c0341j == null) {
                            C0240e c0240e = j3.f5353a;
                            float b3 = AbstractC0236a.b(c0240e.f4735h);
                            g3.f(abstractC0347p2, l0.c.e(c0240e.f4728a, c0240e.f4729b), AbstractC0235a.e(c0240e.b(), c0240e.a()), AbstractC0235a.b(b3, b3), f3, c0406g, null, 3);
                        }
                    } else {
                        if (!(k4 instanceof b0.H)) {
                            throw new C1.c();
                        }
                        c0341j = ((b0.H) k4).f5351a;
                    }
                    g3.a0(c0341j, abstractC0347p2, f3, c0406g, null, 3);
                }
            }
        }
        g3.b();
    }
}
