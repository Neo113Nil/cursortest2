package q0;

import W.InterfaceC0113f;

/* renamed from: q0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1355D implements InterfaceC0113f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0.e f14817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1377t f14818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0.g f14819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14820d;

    public /* synthetic */ C1355D(f0.e eVar, C1377t c1377t, n0.g gVar, int i4) {
        this.f14817a = eVar;
        this.f14818b = c1377t;
        this.f14819c = gVar;
        this.f14820d = i4;
    }

    @Override // W.InterfaceC0113f
    public final void accept(Object obj) {
        H h2 = (H) obj;
        f0.e eVar = this.f14817a;
        h2.c(eVar.f8491a, eVar.f8492b, this.f14818b, this.f14819c, this.f14820d);
    }
}
