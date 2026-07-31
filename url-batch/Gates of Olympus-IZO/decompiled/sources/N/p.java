package N;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: g, reason: collision with root package name */
    public final g f2848g;

    public p(g gVar) {
        this.f2848g = gVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f2846f;
        this.f2846f = i3 + 2;
        Object[] objArr = this.f2844d;
        return new b(this.f2848g, objArr[i3], objArr[i3 + 1]);
    }
}
