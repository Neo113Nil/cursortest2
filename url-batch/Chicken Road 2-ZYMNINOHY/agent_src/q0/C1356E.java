package q0;

import W.InterfaceC0113f;

/* renamed from: q0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1356E implements InterfaceC0113f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0.e f14822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1377t f14823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.g f14824d;

    public /* synthetic */ C1356E(f0.e eVar, C1377t c1377t, n0.g gVar, int i4) {
        this.f14821a = i4;
        this.f14822b = eVar;
        this.f14823c = c1377t;
        this.f14824d = gVar;
    }

    @Override // W.InterfaceC0113f
    public final void accept(Object obj) {
        H h2 = (H) obj;
        switch (this.f14821a) {
            case 0:
                f0.e eVar = this.f14822b;
                h2.f(eVar.f8491a, eVar.f8492b, this.f14823c, this.f14824d);
                break;
            default:
                f0.e eVar2 = this.f14822b;
                h2.d(eVar2.f8491a, eVar2.f8492b, this.f14823c, this.f14824d);
                break;
        }
    }
}
