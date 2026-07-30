package s7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: s7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5008h extends AbstractCollection implements Collection, F7.b {

    /* renamed from: n, reason: collision with root package name */
    public final C5006f f40522n;

    public C5008h(C5006f c5006f) {
        this.f40522n = c5006f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f40522n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f40522n.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f40522n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C5006f c5006f = this.f40522n;
        c5006f.getClass();
        return new C5004d(c5006f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C5006f c5006f = this.f40522n;
        c5006f.d();
        int j9 = c5006f.j(obj);
        if (j9 < 0) {
            return false;
        }
        c5006f.m(j9);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f40522n.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f40522n.d();
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f40522n.f40508B;
    }
}
