package B0;

/* renamed from: B0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039q implements b1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1.d f177f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L.d f178g;

    public /* synthetic */ C0039q(b1.d dVar, L.d dVar2, int i2) {
        this.f176e = i2;
        this.f177f = dVar;
        this.f178g = dVar2;
    }

    @Override // b1.d
    public final Object k(b1.e eVar, H0.d dVar) {
        switch (this.f176e) {
            case 0:
                Object k2 = this.f177f.k(new C0038p(eVar, this.f178g, 0), dVar);
                if (k2 != I0.a.f733e) {
                    break;
                }
                break;
            case 1:
                Object k3 = this.f177f.k(new C0038p(eVar, this.f178g, 1), dVar);
                if (k3 != I0.a.f733e) {
                    break;
                }
                break;
            case 2:
                Object k4 = this.f177f.k(new C0038p(eVar, this.f178g, 2), dVar);
                if (k4 != I0.a.f733e) {
                    break;
                }
                break;
            default:
                Object k5 = this.f177f.k(new C0038p(eVar, this.f178g, 3), dVar);
                if (k5 != I0.a.f733e) {
                    break;
                }
                break;
        }
        return F0.h.f469a;
    }
}
