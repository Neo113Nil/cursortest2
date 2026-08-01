package x2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends i3.a implements ListIterator {
    public final /* synthetic */ c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i) {
        super(3, cVar);
        this.i = cVar;
        int a5 = cVar.a();
        if (i < 0 || i > a5) {
            throw new IndexOutOfBoundsException(a4.b.d(i, a5, "index: ", ", size: "));
        }
        this.f2070g = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2070g > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2070g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2070g - 1;
        this.f2070g = i;
        return this.i.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2070g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
