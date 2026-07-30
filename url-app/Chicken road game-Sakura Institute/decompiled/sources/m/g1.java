package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g1 implements o.y0 {

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.room.c f6158i;

    /* renamed from: a, reason: collision with root package name */
    public final g0.d1 f6159a;

    /* renamed from: e, reason: collision with root package name */
    public float f6163e;

    /* renamed from: b, reason: collision with root package name */
    public final g0.d1 f6160b = g0.d.I(0);

    /* renamed from: c, reason: collision with root package name */
    public final p.j f6161c = new p.j();

    /* renamed from: d, reason: collision with root package name */
    public final g0.d1 f6162d = g0.d.I(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final o.m f6164f = new o.m(new c1.a(18, this));

    /* renamed from: g, reason: collision with root package name */
    public final g0.e0 f6165g = g0.d.C(new f1(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final g0.e0 f6166h = g0.d.C(new f1(this, 0));

    static {
        k kVar = k.f6191l;
        androidx.room.c cVar = p0.m.f7013a;
        f6158i = new androidx.room.c(e1.f6140g, 28, kVar);
    }

    public g1(int i7) {
        this.f6159a = g0.d.I(i7);
    }

    @Override // o.y0
    public final boolean a() {
        return ((Boolean) this.f6166h.getValue()).booleanValue();
    }

    @Override // o.y0
    public final Object b(p0 p0Var, q6.e eVar, j6.c cVar) {
        Object b9 = this.f6164f.b(p0Var, eVar, cVar);
        return b9 == i6.a.f4956f ? b9 : d6.z.f2639a;
    }

    @Override // o.y0
    public final boolean c() {
        return this.f6164f.c();
    }

    @Override // o.y0
    public final boolean d() {
        return ((Boolean) this.f6165g.getValue()).booleanValue();
    }

    @Override // o.y0
    public final float e(float f9) {
        return this.f6164f.e(f9);
    }
}
