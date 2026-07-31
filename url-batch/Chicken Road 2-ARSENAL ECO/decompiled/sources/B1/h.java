package B1;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final l f105a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.h f106b;

    public h(l lVar, k1.h hVar) {
        this.f105a = lVar;
        this.f106b = hVar;
    }

    @Override // B1.k
    public final boolean a(C1.a aVar) {
        if (aVar.f190b != 4 || this.f105a.a(aVar)) {
            return false;
        }
        String str = aVar.f191c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f106b.a(new a(str, aVar.f193e, aVar.f194f));
        return true;
    }

    @Override // B1.k
    public final boolean b(Exception exc) {
        this.f106b.b(exc);
        return true;
    }
}
