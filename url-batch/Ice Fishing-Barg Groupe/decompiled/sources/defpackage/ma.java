package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ma implements Collection, Set, fu0, hu0 {
    public Object[] OPXfSBeufaJ8;
    public int[] rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public ma(int i) {
        this.rtx2ld2ELZv4 = mm2.TSizfFm2Yiuu;
        this.OPXfSBeufaJ8 = mm2.e9gEMXR7LXtO;
        if (i > 0) {
            this.rtx2ld2ELZv4 = new int[i];
            this.OPXfSBeufaJ8 = new Object[i];
        }
    }

    public final Object PxuCJdSBwIXG(int i) {
        int i2 = this.wdg6QnbFHrFF;
        Object[] objArr = this.OPXfSBeufaJ8;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.rtx2ld2ELZv4;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                na.PsecLrZVVK61(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.OPXfSBeufaJ8;
                na.VzNxmvWisHL1(objArr2, objArr2, i, i4, i2);
            }
            this.OPXfSBeufaJ8[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.rtx2ld2ELZv4 = iArr2;
            this.OPXfSBeufaJ8 = new Object[i5];
            if (i > 0) {
                na.rxipThha848g(iArr, iArr2, 0, i, 6);
                na.hVNtCUZb4tYH(objArr, this.OPXfSBeufaJ8, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                na.PsecLrZVVK61(iArr, this.rtx2ld2ELZv4, i, i6, i2);
                na.VzNxmvWisHL1(objArr, this.OPXfSBeufaJ8, i, i6, i2);
            }
        }
        if (i2 != this.wdg6QnbFHrFF) {
            throw new ConcurrentModificationException();
        }
        this.wdg6QnbFHrFF = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int aF05bpZJlKEP;
        int i2 = this.wdg6QnbFHrFF;
        if (obj == null) {
            aF05bpZJlKEP = zv.aF05bpZJlKEP(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            aF05bpZJlKEP = zv.aF05bpZJlKEP(this, obj, hashCode);
        }
        if (aF05bpZJlKEP >= 0) {
            return false;
        }
        int i3 = ~aF05bpZJlKEP;
        int[] iArr = this.rtx2ld2ELZv4;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.OPXfSBeufaJ8;
            int[] iArr2 = new int[i4];
            this.rtx2ld2ELZv4 = iArr2;
            this.OPXfSBeufaJ8 = new Object[i4];
            if (i2 != this.wdg6QnbFHrFF) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                na.rxipThha848g(iArr, iArr2, 0, iArr.length, 6);
                na.hVNtCUZb4tYH(objArr, this.OPXfSBeufaJ8, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.rtx2ld2ELZv4;
            int i5 = i3 + 1;
            na.PsecLrZVVK61(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.OPXfSBeufaJ8;
            na.VzNxmvWisHL1(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.wdg6QnbFHrFF;
        if (i2 == i6) {
            int[] iArr4 = this.rtx2ld2ELZv4;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.OPXfSBeufaJ8[i3] = obj;
                this.wdg6QnbFHrFF = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.wdg6QnbFHrFF;
        int i = this.wdg6QnbFHrFF;
        int[] iArr = this.rtx2ld2ELZv4;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.OPXfSBeufaJ8;
            int[] iArr2 = new int[size];
            this.rtx2ld2ELZv4 = iArr2;
            this.OPXfSBeufaJ8 = new Object[size];
            if (i > 0) {
                na.rxipThha848g(iArr, iArr2, 0, i, 6);
                na.hVNtCUZb4tYH(objArr, this.OPXfSBeufaJ8, 0, this.wdg6QnbFHrFF, 6);
            }
        }
        if (this.wdg6QnbFHrFF != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.wdg6QnbFHrFF != 0) {
            this.rtx2ld2ELZv4 = mm2.TSizfFm2Yiuu;
            this.OPXfSBeufaJ8 = mm2.e9gEMXR7LXtO;
            this.wdg6QnbFHrFF = 0;
        }
        if (this.wdg6QnbFHrFF != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? zv.aF05bpZJlKEP(this, null, 0) : zv.aF05bpZJlKEP(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.wdg6QnbFHrFF != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.wdg6QnbFHrFF;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.OPXfSBeufaJ8[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.rtx2ld2ELZv4;
        int i = this.wdg6QnbFHrFF;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.wdg6QnbFHrFF <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ga(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int aF05bpZJlKEP = obj == null ? zv.aF05bpZJlKEP(this, null, 0) : zv.aF05bpZJlKEP(this, obj, obj.hashCode());
        if (aF05bpZJlKEP < 0) {
            return false;
        }
        PxuCJdSBwIXG(aF05bpZJlKEP);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.wdg6QnbFHrFF - 1; -1 < i; i--) {
            if (!zk.fkblLSN2bAgv(collection, this.OPXfSBeufaJ8[i])) {
                PxuCJdSBwIXG(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.wdg6QnbFHrFF;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.wdg6QnbFHrFF;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        na.VzNxmvWisHL1(this.OPXfSBeufaJ8, objArr, 0, 0, this.wdg6QnbFHrFF);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.wdg6QnbFHrFF * 14);
        sb.append('{');
        int i = this.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.OPXfSBeufaJ8[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return na.fRTaYY6FBZcX(this.OPXfSBeufaJ8, 0, this.wdg6QnbFHrFF);
    }
}
