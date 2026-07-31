package B0;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class L extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f43i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I.d f44j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f45k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(I.d dVar, long j2, G0.d dVar2) {
        super(2, dVar2);
        this.f44j = dVar;
        this.f45k = j2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        L l2 = new L(this.f44j, this.f45k, dVar);
        l2.f43i = obj;
        return l2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        L l2 = (L) b((G0.d) obj2, (I.b) obj);
        D0.h hVar = D0.h.f206a;
        l2.m(hVar);
        return hVar;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        I.b bVar = (I.b) this.f43i;
        AbstractC0086a.I(obj);
        bVar.d(this.f44j, new Long(this.f45k));
        return D0.h.f206a;
    }
}
