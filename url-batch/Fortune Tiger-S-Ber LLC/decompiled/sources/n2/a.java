package n2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends a3.b implements ListIterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f2947i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i4) {
        super(cVar);
        this.f2947i = cVar;
        int a4 = cVar.a();
        if (i4 >= 0 && i4 <= a4) {
            this.g = i4;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + a4);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.g > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i4 = this.g - 1;
        this.g = i4;
        return this.f2947i.get(i4);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
