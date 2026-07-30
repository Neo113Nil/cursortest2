package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x11 extends rZjpSjn4zoMv implements RandomAccess, Serializable {
    public final int OPXfSBeufaJ8;
    public final x11 dgRBjINgWbAK;
    public Object[] rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public final z11 x50lh2ztY7Y5;

    public x11(Object[] objArr, int i, int i2, x11 x11Var, z11 z11Var) {
        int i3;
        objArr.getClass();
        z11Var.getClass();
        this.rtx2ld2ELZv4 = objArr;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = i2;
        this.dgRBjINgWbAK = x11Var;
        this.x50lh2ztY7Y5 = z11Var;
        i3 = ((AbstractList) z11Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    public final void OPXfSBeufaJ8(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        x11 x11Var = this.dgRBjINgWbAK;
        if (x11Var != null) {
            x11Var.OPXfSBeufaJ8(i, i2);
        } else {
            z11 z11Var = z11.dgRBjINgWbAK;
            this.x50lh2ztY7Y5.OPXfSBeufaJ8(i, i2);
        }
        this.wdg6QnbFHrFF -= i2;
    }

    @Override // defpackage.rZjpSjn4zoMv
    public final int PxuCJdSBwIXG() {
        a92UlCVFR9N8();
        return this.wdg6QnbFHrFF;
    }

    public final void RAsUl2FVSrh6() {
        if (this.x50lh2ztY7Y5.wdg6QnbFHrFF) {
            throw new UnsupportedOperationException();
        }
    }

    public final void Y1f8riQaR6yg(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        z11 z11Var = this.x50lh2ztY7Y5;
        x11 x11Var = this.dgRBjINgWbAK;
        if (x11Var != null) {
            x11Var.Y1f8riQaR6yg(i, collection, i2);
        } else {
            z11 z11Var2 = z11.dgRBjINgWbAK;
            z11Var.Y1f8riQaR6yg(i, collection, i2);
        }
        this.rtx2ld2ELZv4 = z11Var.rtx2ld2ELZv4;
        this.wdg6QnbFHrFF += i2;
    }

    public final void a92UlCVFR9N8() {
        int i;
        i = ((AbstractList) this.x50lh2ztY7Y5).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, i2);
        e9gEMXR7LXtO(this.OPXfSBeufaJ8 + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, i2);
        int size = collection.size();
        Y1f8riQaR6yg(this.OPXfSBeufaJ8 + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        OPXfSBeufaJ8(this.OPXfSBeufaJ8, this.wdg6QnbFHrFF);
    }

    public final void e9gEMXR7LXtO(int i, Object obj) {
        ((AbstractList) this).modCount++;
        z11 z11Var = this.x50lh2ztY7Y5;
        x11 x11Var = this.dgRBjINgWbAK;
        if (x11Var != null) {
            x11Var.e9gEMXR7LXtO(i, obj);
        } else {
            z11 z11Var2 = z11.dgRBjINgWbAK;
            z11Var.e9gEMXR7LXtO(i, obj);
        }
        this.rtx2ld2ELZv4 = z11Var.rtx2ld2ELZv4;
        this.wdg6QnbFHrFF++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        a92UlCVFR9N8();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.rtx2ld2ELZv4;
            int i = this.wdg6QnbFHrFF;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (cs0.wdg6QnbFHrFF(objArr[this.OPXfSBeufaJ8 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        return this.rtx2ld2ELZv4[this.OPXfSBeufaJ8 + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        a92UlCVFR9N8();
        Object[] objArr = this.rtx2ld2ELZv4;
        int i = this.wdg6QnbFHrFF;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.OPXfSBeufaJ8 + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        a92UlCVFR9N8();
        for (int i = 0; i < this.wdg6QnbFHrFF; i++) {
            if (cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4[this.OPXfSBeufaJ8 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        a92UlCVFR9N8();
        return this.wdg6QnbFHrFF == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.rZjpSjn4zoMv
    public final Object lS5Rgt96tfkO(int i) {
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        return rtx2ld2ELZv4(this.OPXfSBeufaJ8 + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        a92UlCVFR9N8();
        for (int i = this.wdg6QnbFHrFF - 1; i >= 0; i--) {
            if (cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4[this.OPXfSBeufaJ8 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, i2);
        return new xj0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            lS5Rgt96tfkO(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        return wdg6QnbFHrFF(this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        return wdg6QnbFHrFF(this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, collection, true) > 0;
    }

    public final Object rtx2ld2ELZv4(int i) {
        Object rtx2ld2ELZv4;
        ((AbstractList) this).modCount++;
        x11 x11Var = this.dgRBjINgWbAK;
        if (x11Var != null) {
            rtx2ld2ELZv4 = x11Var.rtx2ld2ELZv4(i);
        } else {
            z11 z11Var = z11.dgRBjINgWbAK;
            rtx2ld2ELZv4 = this.x50lh2ztY7Y5.rtx2ld2ELZv4(i);
        }
        this.wdg6QnbFHrFF--;
        return rtx2ld2ELZv4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        Object[] objArr = this.rtx2ld2ELZv4;
        int i3 = this.OPXfSBeufaJ8 + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i3 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.TSizfFm2Yiuu(i, i2, i3);
        return new x11(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8 + i, i2 - i, this, this.x50lh2ztY7Y5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        a92UlCVFR9N8();
        int length = objArr.length;
        int i = this.wdg6QnbFHrFF;
        Object[] objArr2 = this.rtx2ld2ELZv4;
        int i2 = this.OPXfSBeufaJ8;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        na.VzNxmvWisHL1(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.wdg6QnbFHrFF;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a92UlCVFR9N8();
        return kj0.a92UlCVFR9N8(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this);
    }

    public final int wdg6QnbFHrFF(int i, int i2, Collection collection, boolean z) {
        int wdg6QnbFHrFF;
        x11 x11Var = this.dgRBjINgWbAK;
        if (x11Var != null) {
            wdg6QnbFHrFF = x11Var.wdg6QnbFHrFF(i, i2, collection, z);
        } else {
            z11 z11Var = z11.dgRBjINgWbAK;
            wdg6QnbFHrFF = this.x50lh2ztY7Y5.wdg6QnbFHrFF(i, i2, collection, z);
        }
        if (wdg6QnbFHrFF > 0) {
            ((AbstractList) this).modCount++;
        }
        this.wdg6QnbFHrFF -= wdg6QnbFHrFF;
        return wdg6QnbFHrFF;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        e9gEMXR7LXtO(this.OPXfSBeufaJ8 + this.wdg6QnbFHrFF, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        RAsUl2FVSrh6();
        a92UlCVFR9N8();
        int size = collection.size();
        Y1f8riQaR6yg(this.OPXfSBeufaJ8 + this.wdg6QnbFHrFF, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        a92UlCVFR9N8();
        Object[] objArr = this.rtx2ld2ELZv4;
        int i = this.wdg6QnbFHrFF;
        int i2 = this.OPXfSBeufaJ8;
        return na.fRTaYY6FBZcX(objArr, i2, i + i2);
    }
}
