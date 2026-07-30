package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cb2 implements List, fu0 {
    public final int OPXfSBeufaJ8;
    public int dgRBjINgWbAK;
    public final d82 rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public cb2(d82 d82Var, int i, int i2) {
        this.rtx2ld2ELZv4 = d82Var;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = ov2.BjEWd04qc7Mw(d82Var);
        this.dgRBjINgWbAK = i2 - i;
    }

    public final void PxuCJdSBwIXG() {
        if (ov2.BjEWd04qc7Mw(this.rtx2ld2ELZv4) != this.wdg6QnbFHrFF) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        PxuCJdSBwIXG();
        int i = this.OPXfSBeufaJ8 + this.dgRBjINgWbAK;
        d82 d82Var = this.rtx2ld2ELZv4;
        d82Var.add(i, obj);
        this.dgRBjINgWbAK++;
        this.wdg6QnbFHrFF = ov2.BjEWd04qc7Mw(d82Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        PxuCJdSBwIXG();
        int i2 = i + this.OPXfSBeufaJ8;
        d82 d82Var = this.rtx2ld2ELZv4;
        boolean addAll = d82Var.addAll(i2, collection);
        if (addAll) {
            this.dgRBjINgWbAK = collection.size() + this.dgRBjINgWbAK;
            this.wdg6QnbFHrFF = ov2.BjEWd04qc7Mw(d82Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.dgRBjINgWbAK > 0) {
            PxuCJdSBwIXG();
            int i = this.dgRBjINgWbAK;
            int i2 = this.OPXfSBeufaJ8;
            d82 d82Var = this.rtx2ld2ELZv4;
            d82Var.TSizfFm2Yiuu(i2, i + i2);
            this.dgRBjINgWbAK = 0;
            this.wdg6QnbFHrFF = ov2.BjEWd04qc7Mw(d82Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        PxuCJdSBwIXG();
        ov2.r3s1LDPKFs1S(i, this.dgRBjINgWbAK);
        return this.rtx2ld2ELZv4.get(this.OPXfSBeufaJ8 + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        PxuCJdSBwIXG();
        int i = this.dgRBjINgWbAK;
        int i2 = this.OPXfSBeufaJ8;
        Iterator it = ng0.nLZGh9p8gVSu(i2, i + i2).iterator();
        while (((zq0) it).wdg6QnbFHrFF) {
            int nextInt = ((rq0) it).nextInt();
            if (cs0.wdg6QnbFHrFF(obj, this.rtx2ld2ELZv4.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.dgRBjINgWbAK == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        PxuCJdSBwIXG();
        int i = this.dgRBjINgWbAK;
        int i2 = this.OPXfSBeufaJ8;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (cs0.wdg6QnbFHrFF(obj, this.rtx2ld2ELZv4.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        PxuCJdSBwIXG();
        xt1 xt1Var = new xt1();
        xt1Var.rtx2ld2ELZv4 = i - 1;
        return new fw1(xt1Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        PxuCJdSBwIXG();
        int i2 = this.OPXfSBeufaJ8 + i;
        d82 d82Var = this.rtx2ld2ELZv4;
        Object remove = d82Var.remove(i2);
        this.dgRBjINgWbAK--;
        this.wdg6QnbFHrFF = ov2.BjEWd04qc7Mw(d82Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        tmVwIGCQF4zR tmvwigcqf4zr;
        j72 OPXfSBeufaJ8;
        boolean BRwzKIf41E4i;
        PxuCJdSBwIXG();
        d82 d82Var = this.rtx2ld2ELZv4;
        int i2 = this.OPXfSBeufaJ8;
        int i3 = this.dgRBjINgWbAK + i2;
        int size = d82Var.size();
        do {
            synchronized (ov2.x50lh2ztY7Y5) {
                o92 o92Var = d82Var.rtx2ld2ELZv4;
                o92Var.getClass();
                o92 o92Var2 = (o92) s72.RAsUl2FVSrh6(o92Var);
                i = o92Var2.Y1f8riQaR6yg;
                tmvwigcqf4zr = o92Var2.TSizfFm2Yiuu;
            }
            tmvwigcqf4zr.getClass();
            vl1 e9gEMXR7LXtO = tmvwigcqf4zr.e9gEMXR7LXtO();
            e9gEMXR7LXtO.subList(i2, i3).retainAll(collection);
            tmVwIGCQF4zR TSizfFm2Yiuu = e9gEMXR7LXtO.TSizfFm2Yiuu();
            if (cs0.wdg6QnbFHrFF(TSizfFm2Yiuu, tmvwigcqf4zr)) {
                break;
            }
            o92 o92Var3 = d82Var.rtx2ld2ELZv4;
            o92Var3.getClass();
            synchronized (s72.TSizfFm2Yiuu) {
                j72.Companion.getClass();
                OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
                BRwzKIf41E4i = ov2.BRwzKIf41E4i((o92) s72.VhhvGxCb8gfr(o92Var3, d82Var, OPXfSBeufaJ8), i, TSizfFm2Yiuu, true);
            }
            s72.cpQdD2nAriOS(OPXfSBeufaJ8, d82Var);
        } while (!BRwzKIf41E4i);
        int size2 = size - d82Var.size();
        if (size2 > 0) {
            this.wdg6QnbFHrFF = ov2.BjEWd04qc7Mw(this.rtx2ld2ELZv4);
            this.dgRBjINgWbAK -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ov2.r3s1LDPKFs1S(i, this.dgRBjINgWbAK);
        PxuCJdSBwIXG();
        int i2 = i + this.OPXfSBeufaJ8;
        d82 d82Var = this.rtx2ld2ELZv4;
        Object obj2 = d82Var.set(i2, obj);
        this.wdg6QnbFHrFF = ov2.BjEWd04qc7Mw(d82Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.dgRBjINgWbAK;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.dgRBjINgWbAK) {
            gp1.PxuCJdSBwIXG("fromIndex or toIndex are out of bounds");
        }
        PxuCJdSBwIXG();
        int i3 = this.OPXfSBeufaJ8;
        return new cb2(this.rtx2ld2ELZv4, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return mm2.yQRudnv4La6p(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return mm2.KUoIVIumpKat(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        PxuCJdSBwIXG();
        int i2 = this.OPXfSBeufaJ8 + i;
        d82 d82Var = this.rtx2ld2ELZv4;
        d82Var.add(i2, obj);
        this.dgRBjINgWbAK++;
        this.wdg6QnbFHrFF = ov2.BjEWd04qc7Mw(d82Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.dgRBjINgWbAK, collection);
    }
}
