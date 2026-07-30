package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625d extends R5.u implements ListIterator {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0627f f6127l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0625d(AbstractC0627f abstractC0627f, int i2) {
        super(abstractC0627f);
        this.f6127l = abstractC0627f;
        C0624c c0624c = AbstractC0627f.f6131d;
        int a7 = abstractC0627f.a();
        c0624c.getClass();
        C0624c.c(i2, a7);
        this.f2435e = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2435e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2435e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f2435e - 1;
        this.f2435e = i2;
        return this.f6127l.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2435e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
