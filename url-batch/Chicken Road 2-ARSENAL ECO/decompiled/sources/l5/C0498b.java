package l5;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: l5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498b extends R5.g implements ListIterator {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0500d f5292i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0498b(AbstractC0500d abstractC0500d, int i7) {
        super(6, abstractC0500d);
        this.f5292i = abstractC0500d;
        int a7 = abstractC0500d.a();
        if (i7 < 0 || i7 > a7) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, a7, "index: ", ", size: "));
        }
        this.f2168g = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2168g > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2168g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f2168g - 1;
        this.f2168g = i7;
        return this.f5292i.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2168g - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
