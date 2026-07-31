package B0;

import a.AbstractC0086a;

/* renamed from: B0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f94i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I.d f95j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f96k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012m(I.d dVar, String str, G0.d dVar2) {
        super(2, dVar2);
        this.f95j = dVar;
        this.f96k = str;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        C0012m c0012m = new C0012m(this.f95j, this.f96k, dVar);
        c0012m.f94i = obj;
        return c0012m;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        C0012m c0012m = (C0012m) b((G0.d) obj2, (I.b) obj);
        D0.h hVar = D0.h.f206a;
        c0012m.m(hVar);
        return hVar;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        I.b bVar = (I.b) this.f94i;
        AbstractC0086a.I(obj);
        bVar.d(this.f95j, this.f96k);
        return D0.h.f206a;
    }
}
