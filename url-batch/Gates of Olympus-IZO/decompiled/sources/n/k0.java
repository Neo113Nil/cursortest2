package n;

import F.C0047j0;
import I.C0089d;
import I.C0096g0;

/* loaded from: classes.dex */
public final class k0 implements o.h0 {

    /* renamed from: i, reason: collision with root package name */
    public static final C2.c f6105i;

    /* renamed from: a, reason: collision with root package name */
    public final C0096g0 f6106a;

    /* renamed from: e, reason: collision with root package name */
    public float f6110e;

    /* renamed from: b, reason: collision with root package name */
    public final C0096g0 f6107b = C0089d.I(0);

    /* renamed from: c, reason: collision with root package name */
    public final q.j f6108c = new q.j();

    /* renamed from: d, reason: collision with root package name */
    public final C0096g0 f6109d = C0089d.I(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final H2.h f6111f = new H2.h(new C0047j0(22, this));

    /* renamed from: g, reason: collision with root package name */
    public final I.G f6112g = C0089d.D(new j0(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final I.G f6113h = C0089d.D(new j0(this, 0));

    static {
        i0 i0Var = i0.f6094e;
        C0662q c0662q = C0662q.f6143h;
        C2.c cVar = R.o.f3164a;
        f6105i = new C2.c(i0Var, 3, c0662q);
    }

    public k0(int i3) {
        this.f6106a = C0089d.I(i3);
    }

    @Override // o.h0
    public final boolean a() {
        return ((Boolean) this.f6112g.getValue()).booleanValue();
    }

    @Override // o.h0
    public final float b(float f3) {
        return this.f6111f.b(f3);
    }

    @Override // o.h0
    public final boolean c() {
        return ((Boolean) this.f6113h.getValue()).booleanValue();
    }

    @Override // o.h0
    public final boolean d() {
        return this.f6111f.d();
    }

    @Override // o.h0
    public final Object e(X x3, Y1.e eVar, R1.c cVar) {
        Object e3 = this.f6111f.e(x3, eVar, cVar);
        return e3 == Q1.a.f3113d ? e3 : L1.z.f2729a;
    }
}
