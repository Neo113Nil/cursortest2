package s1;

/* renamed from: s1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331n implements b1.i {

    /* renamed from: a, reason: collision with root package name */
    public final k1.f f4057a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.i f4058b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0331n(b1.i iVar, j1.l lVar) {
        k1.e.e(iVar, "baseKey");
        this.f4057a = (k1.f) lVar;
        this.f4058b = iVar instanceof C0331n ? ((C0331n) iVar).f4058b : iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j1.l, k1.f] */
    public final b1.h a(AbstractC0332o abstractC0332o) {
        return (b1.h) this.f4057a.g(abstractC0332o);
    }
}
