package h4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import u4.InterfaceC1482b;

/* renamed from: h4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490h extends AbstractCollection implements Collection, InterfaceC1482b {

    /* renamed from: a, reason: collision with root package name */
    public final C0488f f5822a;

    public C0490h(C0488f backing) {
        kotlin.jvm.internal.i.e(backing, "backing");
        this.f5822a = backing;
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
        this.f5822a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5822a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f5822a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0488f c0488f = this.f5822a;
        c0488f.getClass();
        return new C0486d(c0488f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C0488f c0488f = this.f5822a;
        c0488f.d();
        int j2 = c0488f.j(obj);
        if (j2 < 0) {
            return false;
        }
        c0488f.m(j2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5822a.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5822a.d();
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f5822a.f5815i;
    }
}
