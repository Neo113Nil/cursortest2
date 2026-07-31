package B0;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class F extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f21i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I.d f22j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f23k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I.d dVar, boolean z2, G0.d dVar2) {
        super(2, dVar2);
        this.f22j = dVar;
        this.f23k = z2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        F f2 = new F(this.f22j, this.f23k, dVar);
        f2.f21i = obj;
        return f2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        F f2 = (F) b((G0.d) obj2, (I.b) obj);
        D0.h hVar = D0.h.f206a;
        f2.m(hVar);
        return hVar;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        I.b bVar = (I.b) this.f21i;
        AbstractC0086a.I(obj);
        bVar.d(this.f22j, Boolean.valueOf(this.f23k));
        return D0.h.f206a;
    }
}
