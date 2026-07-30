package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z11 extends rZjpSjn4zoMv implements RandomAccess, Serializable {
    private static final y11 Companion = new y11();
    public static final z11 dgRBjINgWbAK;
    public int OPXfSBeufaJ8;
    public Object[] rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    static {
        z11 z11Var = new z11(0);
        z11Var.wdg6QnbFHrFF = true;
        dgRBjINgWbAK = z11Var;
    }

    public z11(int i) {
        if (i >= 0) {
            this.rtx2ld2ELZv4 = new Object[i];
        } else {
            u9.XL4ISE6Oc65B("capacity must be non-negative.");
            throw null;
        }
    }

    public final void OPXfSBeufaJ8(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.rtx2ld2ELZv4;
        na.VzNxmvWisHL1(objArr, objArr, i, i + i2, this.OPXfSBeufaJ8);
        Object[] objArr2 = this.rtx2ld2ELZv4;
        int i3 = this.OPXfSBeufaJ8;
        kj0.ryVscX7ZL4Ux(objArr2, i3 - i2, i3);
        this.OPXfSBeufaJ8 -= i2;
    }

    @Override // defpackage.rZjpSjn4zoMv
    public final int PxuCJdSBwIXG() {
        return this.OPXfSBeufaJ8;
    }

    public final void RAsUl2FVSrh6(int i, int i2) {
        int i3 = this.OPXfSBeufaJ8 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.rtx2ld2ELZv4;
        if (i3 > objArr.length) {
            S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
            int length = objArr.length;
            s2OOm9zPNm0h.getClass();
            int Y1f8riQaR6yg = S2OOm9zPNm0h.Y1f8riQaR6yg(length, i3);
            Object[] objArr2 = this.rtx2ld2ELZv4;
            objArr2.getClass();
            this.rtx2ld2ELZv4 = Arrays.copyOf(objArr2, Y1f8riQaR6yg);
        }
        Object[] objArr3 = this.rtx2ld2ELZv4;
        na.VzNxmvWisHL1(objArr3, objArr3, i + i2, i, this.OPXfSBeufaJ8);
        this.OPXfSBeufaJ8 += i2;
    }

    public final void Y1f8riQaR6yg(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        RAsUl2FVSrh6(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.rtx2ld2ELZv4[i + i3] = it.next();
        }
    }

    public final void a92UlCVFR9N8() {
        if (this.wdg6QnbFHrFF) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.OPXfSBeufaJ8;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, i2);
        ((AbstractList) this).modCount++;
        RAsUl2FVSrh6(i, 1);
        this.rtx2ld2ELZv4[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.OPXfSBeufaJ8;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, i2);
        int size = collection.size();
        Y1f8riQaR6yg(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a92UlCVFR9N8();
        OPXfSBeufaJ8(0, this.OPXfSBeufaJ8);
    }

    public final void e9gEMXR7LXtO(int i, Object obj) {
        ((AbstractList) this).modCount++;
        RAsUl2FVSrh6(i, 1);
        this.rtx2ld2ELZv4[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.rtx2ld2ELZv4;
            int i = this.OPXfSBeufaJ8;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (cs0.wdg6QnbFHrFF(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.OPXfSBeufaJ8;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        return this.rtx2ld2ELZv4[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.rtx2ld2ELZv4;
        int i = this.OPXfSBeufaJ8;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.OPXfSBeufaJ8; i++) {
            if (cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.OPXfSBeufaJ8 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.rZjpSjn4zoMv
    public final Object lS5Rgt96tfkO(int i) {
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.OPXfSBeufaJ8;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        return rtx2ld2ELZv4(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.OPXfSBeufaJ8 - 1; i >= 0; i--) {
            if (cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.OPXfSBeufaJ8;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, i2);
        return new xj0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        a92UlCVFR9N8();
        return wdg6QnbFHrFF(0, this.OPXfSBeufaJ8, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        a92UlCVFR9N8();
        return wdg6QnbFHrFF(0, this.OPXfSBeufaJ8, collection, true) > 0;
    }

    public final Object rtx2ld2ELZv4(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.rtx2ld2ELZv4;
        Object obj = objArr[i];
        na.VzNxmvWisHL1(objArr, objArr, i, i + 1, this.OPXfSBeufaJ8);
        Object[] objArr2 = this.rtx2ld2ELZv4;
        int i2 = this.OPXfSBeufaJ8 - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.OPXfSBeufaJ8--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a92UlCVFR9N8();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.OPXfSBeufaJ8;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        Object[] objArr = this.rtx2ld2ELZv4;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i3 = this.OPXfSBeufaJ8;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.TSizfFm2Yiuu(i, i2, i3);
        return new x11(this.rtx2ld2ELZv4, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.OPXfSBeufaJ8;
        Object[] objArr2 = this.rtx2ld2ELZv4;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        na.VzNxmvWisHL1(objArr2, objArr, 0, 0, i);
        int i2 = this.OPXfSBeufaJ8;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return kj0.a92UlCVFR9N8(this.rtx2ld2ELZv4, 0, this.OPXfSBeufaJ8, this);
    }

    public final int wdg6QnbFHrFF(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.rtx2ld2ELZv4;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.rtx2ld2ELZv4;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        na.VzNxmvWisHL1(objArr, objArr, i + i4, i2 + i, this.OPXfSBeufaJ8);
        Object[] objArr3 = this.rtx2ld2ELZv4;
        int i7 = this.OPXfSBeufaJ8;
        kj0.ryVscX7ZL4Ux(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.OPXfSBeufaJ8 -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a92UlCVFR9N8();
        int i = this.OPXfSBeufaJ8;
        ((AbstractList) this).modCount++;
        RAsUl2FVSrh6(i, 1);
        this.rtx2ld2ELZv4[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        a92UlCVFR9N8();
        int size = collection.size();
        Y1f8riQaR6yg(this.OPXfSBeufaJ8, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return na.fRTaYY6FBZcX(this.rtx2ld2ELZv4, 0, this.OPXfSBeufaJ8);
    }
}
