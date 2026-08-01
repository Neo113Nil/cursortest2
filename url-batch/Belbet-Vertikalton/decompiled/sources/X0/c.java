package X0;

import G1.AbstractC0001b;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends b implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f1372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i) {
        super(eVar);
        this.f1372d = eVar;
        int a2 = eVar.a();
        if (i < 0 || i > a2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, a2, "index: ", ", size: "));
        }
        this.f1370b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1370b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1370b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f1370b - 1;
        this.f1370b = i;
        return this.f1372d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1370b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
