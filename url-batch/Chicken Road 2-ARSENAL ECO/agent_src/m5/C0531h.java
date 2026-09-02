package m5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import y5.InterfaceC0767b;

/* renamed from: m5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531h extends AbstractCollection implements Collection, InterfaceC0767b {

    /* renamed from: f, reason: collision with root package name */
    public final C0529f f5484f;

    public C0531h(C0529f c0529f) {
        this.f5484f = c0529f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f5484f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5484f.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f5484f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0529f c0529f = this.f5484f;
        c0529f.getClass();
        return new C0527d(c0529f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C0529f c0529f = this.f5484f;
        c0529f.c();
        int i7 = c0529f.i(obj);
        if (i7 < 0) {
            return false;
        }
        c0529f.l(i7);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5484f.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5484f.c();
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f5484f.f5477n;
    }
}
