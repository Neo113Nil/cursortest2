package S1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: S1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223b extends R1.p implements ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0225d f4307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0223b(AbstractC0225d abstractC0225d, int i3) {
        super(4, abstractC0225d);
        this.f4307g = abstractC0225d;
        int b3 = abstractC0225d.b();
        if (i3 < 0 || i3 > b3) {
            throw new IndexOutOfBoundsException(A.k.f(i3, b3, "index: ", ", size: "));
        }
        this.f4161e = i3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4161e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4161e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4161e - 1;
        this.f4161e = i3;
        return this.f4307g.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4161e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
