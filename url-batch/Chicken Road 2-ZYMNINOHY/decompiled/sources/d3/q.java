package d3;

import E.AbstractC0005f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p3.InterfaceC1349a;

/* loaded from: classes.dex */
public final class q implements List, Serializable, RandomAccess, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public static final q f8333a = new q();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        Void element = (Void) obj;
        kotlin.jvm.internal.i.e(element, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List
    public final Object get(int i4) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i4 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        Void element = (Void) obj;
        kotlin.jvm.internal.i.e(element, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return p.f8332a;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        Void element = (Void) obj;
        kotlin.jvm.internal.i.e(element, "element");
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return p.f8332a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "fromIndex: ", ", toIndex: "));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.j(this);
    }

    public final String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        if (i4 == 0) {
            return p.f8332a;
        }
        throw new IndexOutOfBoundsException(AbstractC0005f.j(i4, "Index: "));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.k(this, array);
    }
}
