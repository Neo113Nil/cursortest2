package B0;

/* renamed from: B0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016q implements Z0.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z0.d f107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ I.d f108g;

    public /* synthetic */ C0016q(Z0.d dVar, I.d dVar2, int i2) {
        this.f106e = i2;
        this.f107f = dVar;
        this.f108g = dVar2;
    }

    @Override // Z0.d
    public final Object m(Z0.e eVar, G0.d dVar) {
        switch (this.f106e) {
            case 0:
                Object m2 = this.f107f.m(new C0015p(eVar, this.f108g, 0), dVar);
                if (m2 != H0.a.f511e) {
                    break;
                }
                break;
            case 1:
                Object m3 = this.f107f.m(new C0015p(eVar, this.f108g, 1), dVar);
                if (m3 != H0.a.f511e) {
                    break;
                }
                break;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object m4 = this.f107f.m(new C0015p(eVar, this.f108g, 2), dVar);
                if (m4 != H0.a.f511e) {
                    break;
                }
                break;
            default:
                Object m5 = this.f107f.m(new C0015p(eVar, this.f108g, 3), dVar);
                if (m5 != H0.a.f511e) {
                    break;
                }
                break;
        }
        return D0.h.f206a;
    }
}
