package u0;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9595d = i.f9590e.f9594d;

    /* renamed from: e, reason: collision with root package name */
    public int f9596e;

    /* renamed from: i, reason: collision with root package name */
    public int f9597i;

    public final void a(Object[] objArr, int i3, int i10) {
        this.f9595d = objArr;
        this.f9596e = i3;
        this.f9597i = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9597i < this.f9596e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
