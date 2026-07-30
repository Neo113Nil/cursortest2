package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y81 implements hu0, Set, fu0 {
    public final w81 OPXfSBeufaJ8;
    public final w81 rtx2ld2ELZv4;

    public y81(w81 w81Var) {
        this.rtx2ld2ELZv4 = w81Var;
        this.OPXfSBeufaJ8 = w81Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.OPXfSBeufaJ8.PxuCJdSBwIXG(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        w81 w81Var = this.OPXfSBeufaJ8;
        int i = w81Var.Y1f8riQaR6yg;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w81Var.dgRBjINgWbAK(it.next());
        }
        return i != w81Var.Y1f8riQaR6yg;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.OPXfSBeufaJ8.lS5Rgt96tfkO();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.rtx2ld2ELZv4.TSizfFm2Yiuu(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y81.class != obj.getClass()) {
            return false;
        }
        return this.rtx2ld2ELZv4.equals(((y81) obj).rtx2ld2ELZv4);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.RAsUl2FVSrh6();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lg0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.OPXfSBeufaJ8.x50lh2ztY7Y5(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        w81 w81Var = this.OPXfSBeufaJ8;
        int i = w81Var.Y1f8riQaR6yg;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w81Var.OPXfSBeufaJ8(it.next());
        }
        return i != w81Var.Y1f8riQaR6yg;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        w81 w81Var = this.OPXfSBeufaJ8;
        Object[] objArr = w81Var.lS5Rgt96tfkO;
        int i = w81Var.Y1f8riQaR6yg;
        long[] jArr = w81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!zk.fkblLSN2bAgv(collection, objArr[i5])) {
                                w81Var.cpQdD2nAriOS(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != w81Var.Y1f8riQaR6yg;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.rtx2ld2ELZv4.Y1f8riQaR6yg;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return mm2.KUoIVIumpKat(this, objArr);
    }

    public final String toString() {
        return this.rtx2ld2ELZv4.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return mm2.yQRudnv4La6p(this);
    }
}
