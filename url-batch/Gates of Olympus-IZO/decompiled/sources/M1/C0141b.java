package M1;

import H2.AbstractC0080b;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: M1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141b extends L1.q implements ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0143d f2790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0141b(AbstractC0143d abstractC0143d, int i3) {
        super(4, abstractC0143d);
        this.f2790g = abstractC0143d;
        int b2 = abstractC0143d.b();
        if (i3 < 0 || i3 > b2) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, b2, "index: ", ", size: "));
        }
        this.f2719e = i3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2719e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2719e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2719e - 1;
        this.f2719e = i3;
        return this.f2790g.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2719e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
