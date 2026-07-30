package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yj0 implements List, fu0 {
    public final int OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;
    public final /* synthetic */ zj0 wdg6QnbFHrFF;

    public yj0(zj0 zj0Var, int i, int i2) {
        this.wdg6QnbFHrFF = zj0Var;
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof m61) && indexOf((m61) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((m61) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object a92UlCVFR9N8 = this.wdg6QnbFHrFF.rtx2ld2ELZv4.a92UlCVFR9N8(i + this.rtx2ld2ELZv4);
        a92UlCVFR9N8.getClass();
        return (m61) a92UlCVFR9N8;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof m61)) {
            return -1;
        }
        m61 m61Var = (m61) obj;
        int i = this.rtx2ld2ELZv4;
        int i2 = this.OPXfSBeufaJ8;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!cs0.wdg6QnbFHrFF(this.wdg6QnbFHrFF.rtx2ld2ELZv4.a92UlCVFR9N8(i3), m61Var)) {
            if (i3 == i2) {
                return -1;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.rtx2ld2ELZv4;
        return new xj0(this.wdg6QnbFHrFF, i, i, this.OPXfSBeufaJ8);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof m61)) {
            return -1;
        }
        m61 m61Var = (m61) obj;
        int i = this.OPXfSBeufaJ8;
        int i2 = this.rtx2ld2ELZv4;
        if (i2 > i) {
            return -1;
        }
        while (!cs0.wdg6QnbFHrFF(this.wdg6QnbFHrFF.rtx2ld2ELZv4.a92UlCVFR9N8(i), m61Var)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.rtx2ld2ELZv4;
        int i3 = this.OPXfSBeufaJ8;
        return new xj0(this.wdg6QnbFHrFF, i + i2, i2, i3);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.OPXfSBeufaJ8 - this.rtx2ld2ELZv4;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.rtx2ld2ELZv4;
        return new yj0(this.wdg6QnbFHrFF, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return mm2.yQRudnv4La6p(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return mm2.KUoIVIumpKat(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.rtx2ld2ELZv4;
        return new xj0(this.wdg6QnbFHrFF, i, i, this.OPXfSBeufaJ8);
    }
}
