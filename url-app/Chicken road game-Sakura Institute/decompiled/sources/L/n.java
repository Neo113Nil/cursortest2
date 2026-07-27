package L;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f3488d = m.f3483e.f3487d;

    /* renamed from: e, reason: collision with root package name */
    public int f3489e;

    /* renamed from: i, reason: collision with root package name */
    public int f3490i;

    public final void b(Object[] objArr, int i2, int i4) {
        this.f3488d = objArr;
        this.f3489e = i2;
        this.f3490i = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3490i < this.f3489e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
