package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class da extends rZjpSjn4zoMv {
    public static final ca Companion = new ca();
    public static final Object[] dgRBjINgWbAK = new Object[0];
    public Object[] OPXfSBeufaJ8;
    public int rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public da(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = dgRBjINgWbAK;
        } else {
            if (i <= 0) {
                u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new Object[i];
        }
        this.OPXfSBeufaJ8 = objArr;
    }

    public final void OPXfSBeufaJ8(int i, int i2) {
        Object[] objArr = this.OPXfSBeufaJ8;
        if (i < i2) {
            na.v6yxfmkxNKhL(i, i2, null, objArr);
        } else {
            na.v6yxfmkxNKhL(i, objArr.length, null, objArr);
            na.v6yxfmkxNKhL(0, i2, null, this.OPXfSBeufaJ8);
        }
    }

    @Override // defpackage.rZjpSjn4zoMv
    public final int PxuCJdSBwIXG() {
        return this.wdg6QnbFHrFF;
    }

    public final Object RAsUl2FVSrh6() {
        if (isEmpty()) {
            return null;
        }
        return this.OPXfSBeufaJ8[wdg6QnbFHrFF((size() - 1) + this.rtx2ld2ELZv4)];
    }

    public final void TSizfFm2Yiuu(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.OPXfSBeufaJ8.length;
        while (i < length && it.hasNext()) {
            this.OPXfSBeufaJ8[i] = it.next();
            i++;
        }
        int i2 = this.rtx2ld2ELZv4;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.OPXfSBeufaJ8[i3] = it.next();
        }
        this.wdg6QnbFHrFF = collection.size() + this.wdg6QnbFHrFF;
    }

    public final void Y1f8riQaR6yg(int i) {
        if (i < 0) {
            u9.rtx2ld2ELZv4("Deque is too big.");
            return;
        }
        Object[] objArr = this.OPXfSBeufaJ8;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == dgRBjINgWbAK) {
            if (i < 10) {
                i = 10;
            }
            this.OPXfSBeufaJ8 = new Object[i];
            return;
        }
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int length = objArr.length;
        s2OOm9zPNm0h.getClass();
        Object[] objArr2 = new Object[S2OOm9zPNm0h.Y1f8riQaR6yg(length, i)];
        Object[] objArr3 = this.OPXfSBeufaJ8;
        na.VzNxmvWisHL1(objArr3, objArr2, 0, this.rtx2ld2ELZv4, objArr3.length);
        Object[] objArr4 = this.OPXfSBeufaJ8;
        int length2 = objArr4.length;
        int i2 = this.rtx2ld2ELZv4;
        na.VzNxmvWisHL1(objArr4, objArr2, length2 - i2, 0, i2);
        this.rtx2ld2ELZv4 = 0;
        this.OPXfSBeufaJ8 = objArr2;
    }

    public final int a92UlCVFR9N8(int i) {
        this.OPXfSBeufaJ8.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i3 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, i3);
        if (i == this.wdg6QnbFHrFF) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        dgRBjINgWbAK();
        Y1f8riQaR6yg(this.wdg6QnbFHrFF + 1);
        int wdg6QnbFHrFF = wdg6QnbFHrFF(this.rtx2ld2ELZv4 + i);
        int i4 = this.wdg6QnbFHrFF;
        if (i < ((i4 + 1) >> 1)) {
            if (wdg6QnbFHrFF == 0) {
                Object[] objArr = this.OPXfSBeufaJ8;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = wdg6QnbFHrFF - 1;
            }
            int i5 = this.rtx2ld2ELZv4;
            if (i5 == 0) {
                Object[] objArr2 = this.OPXfSBeufaJ8;
                objArr2.getClass();
                i5 = objArr2.length;
            }
            int i6 = i5 - 1;
            int i7 = this.rtx2ld2ELZv4;
            Object[] objArr3 = this.OPXfSBeufaJ8;
            if (i2 >= i7) {
                objArr3[i6] = objArr3[i7];
                na.VzNxmvWisHL1(objArr3, objArr3, i7, i7 + 1, i2 + 1);
            } else {
                na.VzNxmvWisHL1(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                Object[] objArr4 = this.OPXfSBeufaJ8;
                objArr4[objArr4.length - 1] = objArr4[0];
                na.VzNxmvWisHL1(objArr4, objArr4, 0, 1, i2 + 1);
            }
            this.OPXfSBeufaJ8[i2] = obj;
            this.rtx2ld2ELZv4 = i6;
        } else {
            int wdg6QnbFHrFF2 = wdg6QnbFHrFF(i4 + this.rtx2ld2ELZv4);
            Object[] objArr5 = this.OPXfSBeufaJ8;
            if (wdg6QnbFHrFF < wdg6QnbFHrFF2) {
                na.VzNxmvWisHL1(objArr5, objArr5, wdg6QnbFHrFF + 1, wdg6QnbFHrFF, wdg6QnbFHrFF2);
            } else {
                na.VzNxmvWisHL1(objArr5, objArr5, 1, 0, wdg6QnbFHrFF2);
                Object[] objArr6 = this.OPXfSBeufaJ8;
                objArr6[0] = objArr6[objArr6.length - 1];
                na.VzNxmvWisHL1(objArr6, objArr6, wdg6QnbFHrFF + 1, wdg6QnbFHrFF, objArr6.length - 1);
            }
            this.OPXfSBeufaJ8[wdg6QnbFHrFF] = obj;
        }
        this.wdg6QnbFHrFF++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.wdg6QnbFHrFF) {
            return addAll(collection);
        }
        dgRBjINgWbAK();
        Y1f8riQaR6yg(collection.size() + this.wdg6QnbFHrFF);
        int wdg6QnbFHrFF = wdg6QnbFHrFF(this.wdg6QnbFHrFF + this.rtx2ld2ELZv4);
        int wdg6QnbFHrFF2 = wdg6QnbFHrFF(this.rtx2ld2ELZv4 + i);
        int size = collection.size();
        if (i >= ((this.wdg6QnbFHrFF + 1) >> 1)) {
            int i3 = wdg6QnbFHrFF2 + size;
            Object[] objArr = this.OPXfSBeufaJ8;
            if (wdg6QnbFHrFF2 < wdg6QnbFHrFF) {
                int i4 = size + wdg6QnbFHrFF;
                if (i4 <= objArr.length) {
                    na.VzNxmvWisHL1(objArr, objArr, i3, wdg6QnbFHrFF2, wdg6QnbFHrFF);
                } else if (i3 >= objArr.length) {
                    na.VzNxmvWisHL1(objArr, objArr, i3 - objArr.length, wdg6QnbFHrFF2, wdg6QnbFHrFF);
                } else {
                    int length = wdg6QnbFHrFF - (i4 - objArr.length);
                    na.VzNxmvWisHL1(objArr, objArr, 0, length, wdg6QnbFHrFF);
                    Object[] objArr2 = this.OPXfSBeufaJ8;
                    na.VzNxmvWisHL1(objArr2, objArr2, i3, wdg6QnbFHrFF2, length);
                }
            } else {
                na.VzNxmvWisHL1(objArr, objArr, size, 0, wdg6QnbFHrFF);
                Object[] objArr3 = this.OPXfSBeufaJ8;
                if (i3 >= objArr3.length) {
                    na.VzNxmvWisHL1(objArr3, objArr3, i3 - objArr3.length, wdg6QnbFHrFF2, objArr3.length);
                } else {
                    na.VzNxmvWisHL1(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.OPXfSBeufaJ8;
                    na.VzNxmvWisHL1(objArr4, objArr4, i3, wdg6QnbFHrFF2, objArr4.length - size);
                }
            }
            TSizfFm2Yiuu(wdg6QnbFHrFF2, collection);
            return true;
        }
        int i5 = this.rtx2ld2ELZv4;
        int i6 = i5 - size;
        Object[] objArr5 = this.OPXfSBeufaJ8;
        if (wdg6QnbFHrFF2 < i5) {
            na.VzNxmvWisHL1(objArr5, objArr5, i6, i5, objArr5.length);
            Object[] objArr6 = this.OPXfSBeufaJ8;
            if (size >= wdg6QnbFHrFF2) {
                na.VzNxmvWisHL1(objArr6, objArr6, objArr6.length - size, 0, wdg6QnbFHrFF2);
            } else {
                na.VzNxmvWisHL1(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.OPXfSBeufaJ8;
                na.VzNxmvWisHL1(objArr7, objArr7, 0, size, wdg6QnbFHrFF2);
            }
        } else if (i6 >= 0) {
            na.VzNxmvWisHL1(objArr5, objArr5, i6, i5, wdg6QnbFHrFF2);
        } else {
            i6 += objArr5.length;
            int i7 = wdg6QnbFHrFF2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                na.VzNxmvWisHL1(objArr5, objArr5, i6, i5, wdg6QnbFHrFF2);
            } else {
                na.VzNxmvWisHL1(objArr5, objArr5, i6, i5, i5 + length2);
                Object[] objArr8 = this.OPXfSBeufaJ8;
                na.VzNxmvWisHL1(objArr8, objArr8, 0, this.rtx2ld2ELZv4 + length2, wdg6QnbFHrFF2);
            }
        }
        this.rtx2ld2ELZv4 = i6;
        TSizfFm2Yiuu(rtx2ld2ELZv4(wdg6QnbFHrFF2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        dgRBjINgWbAK();
        Y1f8riQaR6yg(this.wdg6QnbFHrFF + 1);
        int i = this.rtx2ld2ELZv4;
        if (i == 0) {
            Object[] objArr = this.OPXfSBeufaJ8;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.rtx2ld2ELZv4 = i2;
        this.OPXfSBeufaJ8[i2] = obj;
        this.wdg6QnbFHrFF++;
    }

    public final void addLast(Object obj) {
        dgRBjINgWbAK();
        Y1f8riQaR6yg(PxuCJdSBwIXG() + 1);
        this.OPXfSBeufaJ8[wdg6QnbFHrFF(PxuCJdSBwIXG() + this.rtx2ld2ELZv4)] = obj;
        this.wdg6QnbFHrFF = PxuCJdSBwIXG() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            dgRBjINgWbAK();
            OPXfSBeufaJ8(this.rtx2ld2ELZv4, wdg6QnbFHrFF(PxuCJdSBwIXG() + this.rtx2ld2ELZv4));
        }
        this.rtx2ld2ELZv4 = 0;
        this.wdg6QnbFHrFF = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void dgRBjINgWbAK() {
        ((AbstractList) this).modCount++;
    }

    public final Object e9gEMXR7LXtO() {
        if (isEmpty()) {
            return null;
        }
        return this.OPXfSBeufaJ8[this.rtx2ld2ELZv4];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.OPXfSBeufaJ8[this.rtx2ld2ELZv4];
        }
        rc1.RAsUl2FVSrh6("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        return this.OPXfSBeufaJ8[wdg6QnbFHrFF(this.rtx2ld2ELZv4 + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int wdg6QnbFHrFF = wdg6QnbFHrFF(PxuCJdSBwIXG() + this.rtx2ld2ELZv4);
        int i2 = this.rtx2ld2ELZv4;
        if (i2 < wdg6QnbFHrFF) {
            while (i2 < wdg6QnbFHrFF) {
                if (cs0.wdg6QnbFHrFF(obj, this.OPXfSBeufaJ8[i2])) {
                    i = this.rtx2ld2ELZv4;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.rtx2ld2ELZv4) < wdg6QnbFHrFF) {
            return -1;
        }
        int length = this.OPXfSBeufaJ8.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < wdg6QnbFHrFF; i3++) {
                    if (cs0.wdg6QnbFHrFF(obj, this.OPXfSBeufaJ8[i3])) {
                        i2 = i3 + this.OPXfSBeufaJ8.length;
                        i = this.rtx2ld2ELZv4;
                    }
                }
                return -1;
            }
            if (cs0.wdg6QnbFHrFF(obj, this.OPXfSBeufaJ8[i2])) {
                i = this.rtx2ld2ELZv4;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return PxuCJdSBwIXG() == 0;
    }

    @Override // defpackage.rZjpSjn4zoMv
    public final Object lS5Rgt96tfkO(int i) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        if (i == PxuCJdSBwIXG() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        dgRBjINgWbAK();
        int wdg6QnbFHrFF = wdg6QnbFHrFF(this.rtx2ld2ELZv4 + i);
        Object[] objArr = this.OPXfSBeufaJ8;
        Object obj = objArr[wdg6QnbFHrFF];
        int i3 = this.wdg6QnbFHrFF >> 1;
        int i4 = this.rtx2ld2ELZv4;
        if (i < i3) {
            if (wdg6QnbFHrFF >= i4) {
                na.VzNxmvWisHL1(objArr, objArr, i4 + 1, i4, wdg6QnbFHrFF);
            } else {
                na.VzNxmvWisHL1(objArr, objArr, 1, 0, wdg6QnbFHrFF);
                Object[] objArr2 = this.OPXfSBeufaJ8;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.rtx2ld2ELZv4;
                na.VzNxmvWisHL1(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.OPXfSBeufaJ8;
            int i6 = this.rtx2ld2ELZv4;
            objArr3[i6] = null;
            this.rtx2ld2ELZv4 = a92UlCVFR9N8(i6);
        } else {
            int wdg6QnbFHrFF2 = wdg6QnbFHrFF((PxuCJdSBwIXG() - 1) + i4);
            Object[] objArr4 = this.OPXfSBeufaJ8;
            if (wdg6QnbFHrFF <= wdg6QnbFHrFF2) {
                na.VzNxmvWisHL1(objArr4, objArr4, wdg6QnbFHrFF, wdg6QnbFHrFF + 1, wdg6QnbFHrFF2 + 1);
            } else {
                na.VzNxmvWisHL1(objArr4, objArr4, wdg6QnbFHrFF, wdg6QnbFHrFF + 1, objArr4.length);
                Object[] objArr5 = this.OPXfSBeufaJ8;
                objArr5[objArr5.length - 1] = objArr5[0];
                na.VzNxmvWisHL1(objArr5, objArr5, 0, 1, wdg6QnbFHrFF2 + 1);
            }
            this.OPXfSBeufaJ8[wdg6QnbFHrFF2] = null;
        }
        this.wdg6QnbFHrFF--;
        return obj;
    }

    public final Object last() {
        if (isEmpty()) {
            rc1.RAsUl2FVSrh6("ArrayDeque is empty.");
            return null;
        }
        return this.OPXfSBeufaJ8[wdg6QnbFHrFF((size() - 1) + this.rtx2ld2ELZv4)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int wdg6QnbFHrFF = wdg6QnbFHrFF(this.wdg6QnbFHrFF + this.rtx2ld2ELZv4);
        int i2 = this.rtx2ld2ELZv4;
        if (i2 < wdg6QnbFHrFF) {
            length = wdg6QnbFHrFF - 1;
            if (i2 <= length) {
                while (!cs0.wdg6QnbFHrFF(obj, this.OPXfSBeufaJ8[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.rtx2ld2ELZv4;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.rtx2ld2ELZv4 >= wdg6QnbFHrFF) {
            while (true) {
                wdg6QnbFHrFF--;
                Object[] objArr = this.OPXfSBeufaJ8;
                if (-1 >= wdg6QnbFHrFF) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.rtx2ld2ELZv4;
                    if (i3 <= length) {
                        while (!cs0.wdg6QnbFHrFF(obj, this.OPXfSBeufaJ8[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.rtx2ld2ELZv4;
                    }
                } else if (cs0.wdg6QnbFHrFF(obj, objArr[wdg6QnbFHrFF])) {
                    length = wdg6QnbFHrFF + this.OPXfSBeufaJ8.length;
                    i = this.rtx2ld2ELZv4;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        lS5Rgt96tfkO(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int wdg6QnbFHrFF;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.OPXfSBeufaJ8.length != 0) {
            int wdg6QnbFHrFF2 = wdg6QnbFHrFF(PxuCJdSBwIXG() + this.rtx2ld2ELZv4);
            int i = this.rtx2ld2ELZv4;
            if (i < wdg6QnbFHrFF2) {
                wdg6QnbFHrFF = i;
                while (true) {
                    objArr = this.OPXfSBeufaJ8;
                    if (i >= wdg6QnbFHrFF2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.OPXfSBeufaJ8[wdg6QnbFHrFF] = obj;
                        wdg6QnbFHrFF++;
                    }
                    i++;
                }
                na.v6yxfmkxNKhL(wdg6QnbFHrFF, wdg6QnbFHrFF2, null, objArr);
            } else {
                int length = this.OPXfSBeufaJ8.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.OPXfSBeufaJ8;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.OPXfSBeufaJ8[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                wdg6QnbFHrFF = wdg6QnbFHrFF(i2);
                for (int i3 = 0; i3 < wdg6QnbFHrFF2; i3++) {
                    Object[] objArr3 = this.OPXfSBeufaJ8;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.OPXfSBeufaJ8[wdg6QnbFHrFF] = obj3;
                        wdg6QnbFHrFF = a92UlCVFR9N8(wdg6QnbFHrFF);
                    }
                }
                z = z2;
            }
            if (z) {
                dgRBjINgWbAK();
                this.wdg6QnbFHrFF = rtx2ld2ELZv4(wdg6QnbFHrFF - this.rtx2ld2ELZv4);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            rc1.RAsUl2FVSrh6("ArrayDeque is empty.");
            return null;
        }
        dgRBjINgWbAK();
        Object[] objArr = this.OPXfSBeufaJ8;
        int i = this.rtx2ld2ELZv4;
        Object obj = objArr[i];
        objArr[i] = null;
        this.rtx2ld2ELZv4 = a92UlCVFR9N8(i);
        this.wdg6QnbFHrFF = PxuCJdSBwIXG() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            rc1.RAsUl2FVSrh6("ArrayDeque is empty.");
            return null;
        }
        dgRBjINgWbAK();
        int wdg6QnbFHrFF = wdg6QnbFHrFF((size() - 1) + this.rtx2ld2ELZv4);
        Object[] objArr = this.OPXfSBeufaJ8;
        Object obj = objArr[wdg6QnbFHrFF];
        objArr[wdg6QnbFHrFF] = null;
        this.wdg6QnbFHrFF = PxuCJdSBwIXG() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i3 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.TSizfFm2Yiuu(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.wdg6QnbFHrFF) {
            clear();
            return;
        }
        if (i4 == 1) {
            lS5Rgt96tfkO(i);
            return;
        }
        dgRBjINgWbAK();
        int i5 = this.wdg6QnbFHrFF - i2;
        int i6 = this.rtx2ld2ELZv4;
        if (i < i5) {
            int wdg6QnbFHrFF = wdg6QnbFHrFF((i - 1) + i6);
            int wdg6QnbFHrFF2 = wdg6QnbFHrFF(this.rtx2ld2ELZv4 + (i2 - 1));
            while (i > 0) {
                int i7 = wdg6QnbFHrFF + 1;
                int min = Math.min(i, Math.min(i7, wdg6QnbFHrFF2 + 1));
                Object[] objArr = this.OPXfSBeufaJ8;
                int i8 = wdg6QnbFHrFF2 - min;
                int i9 = wdg6QnbFHrFF - min;
                na.VzNxmvWisHL1(objArr, objArr, i8 + 1, i9 + 1, i7);
                wdg6QnbFHrFF = rtx2ld2ELZv4(i9);
                wdg6QnbFHrFF2 = rtx2ld2ELZv4(i8);
                i -= min;
            }
            int wdg6QnbFHrFF3 = wdg6QnbFHrFF(this.rtx2ld2ELZv4 + i4);
            OPXfSBeufaJ8(this.rtx2ld2ELZv4, wdg6QnbFHrFF3);
            this.rtx2ld2ELZv4 = wdg6QnbFHrFF3;
        } else {
            int wdg6QnbFHrFF4 = wdg6QnbFHrFF(i6 + i2);
            int wdg6QnbFHrFF5 = wdg6QnbFHrFF(this.rtx2ld2ELZv4 + i);
            int i10 = this.wdg6QnbFHrFF;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.OPXfSBeufaJ8;
                i2 = Math.min(i10, Math.min(objArr2.length - wdg6QnbFHrFF4, objArr2.length - wdg6QnbFHrFF5));
                Object[] objArr3 = this.OPXfSBeufaJ8;
                int i11 = wdg6QnbFHrFF4 + i2;
                na.VzNxmvWisHL1(objArr3, objArr3, wdg6QnbFHrFF5, wdg6QnbFHrFF4, i11);
                wdg6QnbFHrFF4 = wdg6QnbFHrFF(i11);
                wdg6QnbFHrFF5 = wdg6QnbFHrFF(wdg6QnbFHrFF5 + i2);
            }
            int wdg6QnbFHrFF6 = wdg6QnbFHrFF(this.wdg6QnbFHrFF + this.rtx2ld2ELZv4);
            OPXfSBeufaJ8(rtx2ld2ELZv4(wdg6QnbFHrFF6 - i4), wdg6QnbFHrFF6);
        }
        this.wdg6QnbFHrFF -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int wdg6QnbFHrFF;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.OPXfSBeufaJ8.length != 0) {
            int wdg6QnbFHrFF2 = wdg6QnbFHrFF(PxuCJdSBwIXG() + this.rtx2ld2ELZv4);
            int i = this.rtx2ld2ELZv4;
            if (i < wdg6QnbFHrFF2) {
                wdg6QnbFHrFF = i;
                while (true) {
                    objArr = this.OPXfSBeufaJ8;
                    if (i >= wdg6QnbFHrFF2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.OPXfSBeufaJ8[wdg6QnbFHrFF] = obj;
                        wdg6QnbFHrFF++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                na.v6yxfmkxNKhL(wdg6QnbFHrFF, wdg6QnbFHrFF2, null, objArr);
            } else {
                int length = this.OPXfSBeufaJ8.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.OPXfSBeufaJ8;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.OPXfSBeufaJ8[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                wdg6QnbFHrFF = wdg6QnbFHrFF(i2);
                for (int i3 = 0; i3 < wdg6QnbFHrFF2; i3++) {
                    Object[] objArr3 = this.OPXfSBeufaJ8;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.OPXfSBeufaJ8[wdg6QnbFHrFF] = obj3;
                        wdg6QnbFHrFF = a92UlCVFR9N8(wdg6QnbFHrFF);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                dgRBjINgWbAK();
                this.wdg6QnbFHrFF = rtx2ld2ELZv4(wdg6QnbFHrFF - this.rtx2ld2ELZv4);
            }
        }
        return z;
    }

    public final int rtx2ld2ELZv4(int i) {
        return i < 0 ? i + this.OPXfSBeufaJ8.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int i2 = this.wdg6QnbFHrFF;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, i2);
        int wdg6QnbFHrFF = wdg6QnbFHrFF(this.rtx2ld2ELZv4 + i);
        Object[] objArr = this.OPXfSBeufaJ8;
        Object obj2 = objArr[wdg6QnbFHrFF];
        objArr[wdg6QnbFHrFF] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.wdg6QnbFHrFF;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int wdg6QnbFHrFF = wdg6QnbFHrFF(this.wdg6QnbFHrFF + this.rtx2ld2ELZv4);
        int i2 = this.rtx2ld2ELZv4;
        if (i2 < wdg6QnbFHrFF) {
            na.hVNtCUZb4tYH(this.OPXfSBeufaJ8, objArr, i2, wdg6QnbFHrFF, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.OPXfSBeufaJ8;
            na.VzNxmvWisHL1(objArr2, objArr, 0, this.rtx2ld2ELZv4, objArr2.length);
            Object[] objArr3 = this.OPXfSBeufaJ8;
            na.VzNxmvWisHL1(objArr3, objArr, objArr3.length - this.rtx2ld2ELZv4, 0, wdg6QnbFHrFF);
        }
        int i3 = this.wdg6QnbFHrFF;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final int wdg6QnbFHrFF(int i) {
        Object[] objArr = this.OPXfSBeufaJ8;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public da() {
        this.OPXfSBeufaJ8 = dgRBjINgWbAK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[PxuCJdSBwIXG()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        dgRBjINgWbAK();
        Y1f8riQaR6yg(collection.size() + PxuCJdSBwIXG());
        TSizfFm2Yiuu(wdg6QnbFHrFF(PxuCJdSBwIXG() + this.rtx2ld2ELZv4), collection);
        return true;
    }
}
