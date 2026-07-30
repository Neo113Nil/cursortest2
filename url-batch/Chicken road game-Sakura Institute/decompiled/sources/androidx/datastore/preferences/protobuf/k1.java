package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k1 implements ListIterator {

    /* renamed from: f, reason: collision with root package name */
    public ListIterator f854f;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f854f.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f854f.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f854f.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f854f.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f854f.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f854f.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
