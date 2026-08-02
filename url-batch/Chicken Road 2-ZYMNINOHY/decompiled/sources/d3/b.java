package d3;

import E.AbstractC0005f;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f8320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i4) {
        super(dVar);
        this.f8320d = dVar;
        int b4 = dVar.b();
        if (i4 < 0 || i4 > b4) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, b4, "index: ", ", size: "));
        }
        this.f8318b = i4;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8318b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8318b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f8318b - 1;
        this.f8318b = i4;
        return this.f8320d.get(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8318b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
