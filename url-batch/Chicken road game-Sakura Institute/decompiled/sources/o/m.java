package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final r6.l f6685a;

    /* renamed from: b, reason: collision with root package name */
    public final l f6686b = new l(this);

    /* renamed from: c, reason: collision with root package name */
    public final m.s0 f6687c = new m.s0();

    /* renamed from: d, reason: collision with root package name */
    public final g0.g1 f6688d;

    /* renamed from: e, reason: collision with root package name */
    public final g0.g1 f6689e;

    /* renamed from: f, reason: collision with root package name */
    public final g0.g1 f6690f;

    /* JADX WARN: Multi-variable type inference failed */
    public m(q6.c cVar) {
        this.f6685a = (r6.l) cVar;
        Boolean bool = Boolean.FALSE;
        g0.t0 t0Var = g0.t0.f3903k;
        this.f6688d = g0.d.J(bool, t0Var);
        this.f6689e = g0.d.J(bool, t0Var);
        this.f6690f = g0.d.J(bool, t0Var);
    }

    @Override // o.y0
    public final Object b(m.p0 p0Var, q6.e eVar, j6.c cVar) {
        Object d8 = c7.a0.d(new a0.a0(this, p0Var, eVar, null, 15), cVar);
        return d8 == i6.a.f4956f ? d8 : d6.z.f2639a;
    }

    @Override // o.y0
    public final boolean c() {
        return ((Boolean) this.f6688d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q6.c, r6.l] */
    @Override // o.y0
    public final float e(float f9) {
        return ((Number) this.f6685a.f(Float.valueOf(f9))).floatValue();
    }
}
