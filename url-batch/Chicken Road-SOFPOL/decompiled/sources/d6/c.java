package d6;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends b implements ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f2313g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i) {
        super(0, eVar);
        this.f2313g = eVar;
        int a8 = eVar.a();
        if (i < 0 || i > a8) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", a8));
        }
        this.f2311e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2311e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2311e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2311e - 1;
        this.f2311e = i;
        return this.f2313g.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2311e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
