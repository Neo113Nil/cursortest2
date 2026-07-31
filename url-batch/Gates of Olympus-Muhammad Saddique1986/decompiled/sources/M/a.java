package M;

import g2.InterfaceC0439a;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public int f3421d;

    /* renamed from: e, reason: collision with root package name */
    public int f3422e;

    public a(int i3, int i4) {
        this.f3421d = i3;
        this.f3422e = i4;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3421d < this.f3422e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3421d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3421d;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3421d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
