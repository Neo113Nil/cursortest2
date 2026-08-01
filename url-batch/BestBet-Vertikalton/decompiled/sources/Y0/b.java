package Y0;

import G1.AbstractC0001b;
import K.V;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends V implements ListIterator {
    public final /* synthetic */ d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(1, dVar);
        this.d = dVar;
        int a2 = dVar.a();
        if (i < 0 || i > a2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, a2, "index: ", ", size: "));
        }
        this.f584b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f584b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f584b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f584b - 1;
        this.f584b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f584b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
