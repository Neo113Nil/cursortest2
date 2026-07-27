package L;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final h f3492j;

    public p(h hVar) {
        this.f3492j = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f3490i;
        this.f3490i = i2 + 2;
        Object[] objArr = this.f3488d;
        return new b(this.f3492j, objArr[i2], objArr[i2 + 1]);
    }
}
