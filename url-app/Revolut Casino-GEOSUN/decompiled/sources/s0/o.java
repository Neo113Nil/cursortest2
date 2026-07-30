package s0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class o implements P0.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P0.d f2916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G.d f2917g;

    public /* synthetic */ o(P0.d dVar, G.d dVar2, int i2) {
        this.f2915e = i2;
        this.f2916f = dVar;
        this.f2917g = dVar2;
    }

    @Override // P0.d
    public final Object d(P0.e eVar, w0.d dVar) {
        switch (this.f2915e) {
            case 0:
                Object d2 = this.f2916f.d(new C0235n(eVar, this.f2917g, 0), dVar);
                if (d2 != x0.a.f3094e) {
                    break;
                }
                break;
            case 1:
                Object d3 = this.f2916f.d(new C0235n(eVar, this.f2917g, 1), dVar);
                if (d3 != x0.a.f3094e) {
                    break;
                }
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object d4 = this.f2916f.d(new C0235n(eVar, this.f2917g, 2), dVar);
                if (d4 != x0.a.f3094e) {
                    break;
                }
                break;
            default:
                Object d5 = this.f2916f.d(new C0235n(eVar, this.f2917g, 3), dVar);
                if (d5 != x0.a.f3094e) {
                    break;
                }
                break;
        }
        return C0247g.f3005a;
    }
}
