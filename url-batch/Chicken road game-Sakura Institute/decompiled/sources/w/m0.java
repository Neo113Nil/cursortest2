package w;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.g f9329a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.k0 f9330b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9333e;

    /* renamed from: g, reason: collision with root package name */
    public final m2.b f9335g;

    /* renamed from: h, reason: collision with root package name */
    public final f2.d f9336h;

    /* renamed from: j, reason: collision with root package name */
    public a2.q f9338j;

    /* renamed from: k, reason: collision with root package name */
    public m2.k f9339k;

    /* renamed from: c, reason: collision with root package name */
    public final int f9331c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f9332d = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f9334f = 1;

    /* renamed from: i, reason: collision with root package name */
    public final List f9337i = e6.u.f2826f;

    public m0(a2.g gVar, a2.k0 k0Var, boolean z8, m2.b bVar, f2.d dVar, int i7) {
        this.f9329a = gVar;
        this.f9330b = k0Var;
        this.f9333e = z8;
        this.f9335g = bVar;
        this.f9336h = dVar;
    }

    public final void a(m2.k kVar) {
        a2.q qVar = this.f9338j;
        if (qVar == null || kVar != this.f9339k || qVar.b()) {
            this.f9339k = kVar;
            qVar = new a2.q(this.f9329a, t6.a.J(this.f9330b, kVar), this.f9337i, this.f9335g, this.f9336h);
        }
        this.f9338j = qVar;
    }
}
