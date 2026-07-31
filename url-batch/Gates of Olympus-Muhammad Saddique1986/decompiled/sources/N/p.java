package N;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: g, reason: collision with root package name */
    public final g f3530g;

    public p(g gVar) {
        this.f3530g = gVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f3528f;
        this.f3528f = i3 + 2;
        Object[] objArr = this.f3526d;
        return new b(this.f3530g, objArr[i3], objArr[i3 + 1]);
    }
}
