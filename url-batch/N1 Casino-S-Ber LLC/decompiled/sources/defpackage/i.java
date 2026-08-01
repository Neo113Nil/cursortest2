package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i extends h implements ListIterator {
    public final /* synthetic */ k i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, int i) {
        super(kVar);
        this.i = kVar;
        int a = kVar.a();
        if (i < 0 || i > a) {
            throw new IndexOutOfBoundsException(d30.d(i, a, "index: ", ", size: "));
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
