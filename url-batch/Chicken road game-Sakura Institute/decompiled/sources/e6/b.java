package e6;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends d6.q implements ListIterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f2809i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i7) {
        super(4, dVar);
        this.f2809i = dVar;
        int a3 = dVar.a();
        if (i7 < 0 || i7 > a3) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, a3, "index: ", ", size: "));
        }
        this.f2629g = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2629g > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2629g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f2629g - 1;
        this.f2629g = i7;
        return this.f2809i.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2629g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
