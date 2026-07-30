package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zj0 implements List, fu0 {
    public final p81 rtx2ld2ELZv4 = new p81(16);
    public final g81 OPXfSBeufaJ8 = new g81(16);
    public int wdg6QnbFHrFF = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long PxuCJdSBwIXG() {
        long PxuCJdSBwIXG = ng0.PxuCJdSBwIXG(Float.POSITIVE_INFINITY, false, false);
        int i = this.wdg6QnbFHrFF + 1;
        int i2 = this.rtx2ld2ELZv4.lS5Rgt96tfkO - 1;
        if (i > i2) {
            return PxuCJdSBwIXG;
        }
        while (true) {
            g81 g81Var = this.OPXfSBeufaJ8;
            if (i < 0) {
                g81Var.getClass();
                break;
            }
            if (i >= g81Var.lS5Rgt96tfkO) {
                break;
            }
            long j = g81Var.PxuCJdSBwIXG[i];
            if (zv.r3s1LDPKFs1S(j, PxuCJdSBwIXG) < 0) {
                PxuCJdSBwIXG = j;
            }
            if ((zv.S9EYkSpbGuxq(PxuCJdSBwIXG) >= 0.0f || !zv.tmVwIGCQF4zR(PxuCJdSBwIXG)) && i != i2) {
                i++;
            }
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and size");
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
        this.wdg6QnbFHrFF = -1;
        this.rtx2ld2ELZv4.Y1f8riQaR6yg();
        this.OPXfSBeufaJ8.lS5Rgt96tfkO = 0;
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
        Object a92UlCVFR9N8 = this.rtx2ld2ELZv4.a92UlCVFR9N8(i);
        a92UlCVFR9N8.getClass();
        return (m61) a92UlCVFR9N8;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof m61)) {
            return -1;
        }
        m61 m61Var = (m61) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4.a92UlCVFR9N8(i), m61Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.rtx2ld2ELZv4();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new xj0(this, 0, 7);
    }

    public final void lS5Rgt96tfkO(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.rtx2ld2ELZv4.x50lh2ztY7Y5(i, i2);
        g81 g81Var = this.OPXfSBeufaJ8;
        if (i >= 0) {
            int i3 = g81Var.lS5Rgt96tfkO;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    u9.XL4ISE6Oc65B("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = g81Var.PxuCJdSBwIXG;
                            na.JTxCbbCwomzt(jArr, jArr, i, i2, i3);
                        }
                        g81Var.lS5Rgt96tfkO -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            g81Var.getClass();
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and size");
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof m61)) {
            return -1;
        }
        m61 m61Var = (m61) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4.a92UlCVFR9N8(size), m61Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new xj0(this, 0, 7);
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
        return this.rtx2ld2ELZv4.lS5Rgt96tfkO;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new yj0(this, i, i2);
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

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new xj0(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
