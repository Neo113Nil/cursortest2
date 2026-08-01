package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l extends k implements ListIterator {
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, int i) {
        super(nVar);
        this.i = nVar;
        int a = nVar.a();
        if (i < 0 || i > a) {
            throw new IndexOutOfBoundsException(r7.a(i, a, "index: ", ", size: "));
        }
        this.g = i;
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
        int i = this.g - 1;
        this.g = i;
        return this.i.get(i);
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
