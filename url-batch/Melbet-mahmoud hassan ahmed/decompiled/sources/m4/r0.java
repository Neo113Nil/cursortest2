package m4;

import java.util.Iterator;

/* loaded from: classes.dex */
abstract class r0<F, T> implements Iterator<T> {

    /* renamed from: f, reason: collision with root package name */
    final Iterator<? extends F> f19208f;

    r0(Iterator<? extends F> it) {
        this.f19208f = (Iterator) l4.j.i(it);
    }

    abstract T a(F f7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19208f.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f19208f.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19208f.remove();
    }
}
