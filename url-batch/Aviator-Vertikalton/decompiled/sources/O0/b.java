package O0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(dVar);
        this.f681d = dVar;
        int a2 = dVar.a();
        if (i >= 0 && i <= a2) {
            this.f679b = i;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + a2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f679b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f679b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f679b - 1;
        this.f679b = i;
        return this.f681d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f679b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
