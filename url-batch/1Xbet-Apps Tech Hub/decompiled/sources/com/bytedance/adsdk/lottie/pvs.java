package com.bytedance.adsdk.lottie;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class pvs<E> implements Collection<E>, Set<E> {
    private static Object[] NB;
    private static int sUS;
    private static int so;
    private static Object[] yiw;
    private int[] Mxy;
    private IP<E, E> Wyp;
    int icD;
    Object[] pvs;
    private static final int[] vG = new int[0];
    private static final Object[] Jd = new Object[0];

    private int pvs(Object obj, int i) {
        int i2 = this.icD;
        if (i2 == 0) {
            return -1;
        }
        int pvs = icD.pvs(this.Mxy, i2, i);
        if (pvs < 0 || obj.equals(this.pvs[pvs])) {
            return pvs;
        }
        int i3 = pvs + 1;
        while (i3 < i2 && this.Mxy[i3] == i) {
            if (obj.equals(this.pvs[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = pvs - 1; i4 >= 0 && this.Mxy[i4] == i; i4--) {
            if (obj.equals(this.pvs[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private int pvs() {
        int i = this.icD;
        if (i == 0) {
            return -1;
        }
        int pvs = icD.pvs(this.Mxy, i, 0);
        if (pvs < 0 || this.pvs[pvs] == null) {
            return pvs;
        }
        int i2 = pvs + 1;
        while (i2 < i && this.Mxy[i2] == 0) {
            if (this.pvs[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = pvs - 1; i3 >= 0 && this.Mxy[i3] == 0; i3--) {
            if (this.pvs[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private void Jd(int i) {
        if (i == 8) {
            synchronized (pvs.class) {
                Object[] objArr = yiw;
                if (objArr != null) {
                    this.pvs = objArr;
                    yiw = (Object[]) objArr[0];
                    this.Mxy = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    so--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (pvs.class) {
                Object[] objArr2 = NB;
                if (objArr2 != null) {
                    this.pvs = objArr2;
                    NB = (Object[]) objArr2[0];
                    this.Mxy = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    sUS--;
                    return;
                }
            }
        }
        this.Mxy = new int[i];
        this.pvs = new Object[i];
    }

    private static void pvs(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (pvs.class) {
                if (so < 10) {
                    objArr[0] = yiw;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    yiw = objArr;
                    so++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (pvs.class) {
                if (sUS < 10) {
                    objArr[0] = NB;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    NB = objArr;
                    sUS++;
                }
            }
        }
    }

    public pvs() {
        this(0);
    }

    public pvs(int i) {
        if (i == 0) {
            this.Mxy = vG;
            this.pvs = Jd;
        } else {
            Jd(i);
        }
        this.icD = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.icD;
        if (i != 0) {
            pvs(this.Mxy, this.pvs, i);
            this.Mxy = vG;
            this.pvs = Jd;
            this.icD = 0;
        }
    }

    public void pvs(int i) {
        int[] iArr = this.Mxy;
        if (iArr.length < i) {
            Object[] objArr = this.pvs;
            Jd(i);
            int i2 = this.icD;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.Mxy, 0, i2);
                System.arraycopy(objArr, 0, this.pvs, 0, this.icD);
            }
            pvs(iArr, objArr, this.icD);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return pvs(obj) >= 0;
    }

    public int pvs(Object obj) {
        return obj == null ? pvs() : pvs(obj, obj.hashCode());
    }

    public E icD(int i) {
        return (E) this.pvs[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.icD <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int pvs;
        if (e == null) {
            pvs = pvs();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            pvs = pvs(e, hashCode);
        }
        if (pvs >= 0) {
            return false;
        }
        int i2 = ~pvs;
        int i3 = this.icD;
        int[] iArr = this.Mxy;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.pvs;
            Jd(i4);
            int[] iArr2 = this.Mxy;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.pvs, 0, objArr.length);
            }
            pvs(iArr, objArr, this.icD);
        }
        int i5 = this.icD;
        if (i2 < i5) {
            int[] iArr3 = this.Mxy;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.pvs;
            System.arraycopy(objArr2, i2, objArr2, i6, this.icD - i2);
        }
        this.Mxy[i2] = i;
        this.pvs[i2] = e;
        this.icD++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int pvs = pvs(obj);
        if (pvs < 0) {
            return false;
        }
        vG(pvs);
        return true;
    }

    public E vG(int i) {
        Object[] objArr = this.pvs;
        E e = (E) objArr[i];
        int i2 = this.icD;
        if (i2 <= 1) {
            pvs(this.Mxy, objArr, i2);
            this.Mxy = vG;
            this.pvs = Jd;
            this.icD = 0;
        } else {
            int[] iArr = this.Mxy;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                Jd(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.icD--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.Mxy, 0, i);
                    System.arraycopy(objArr, 0, this.pvs, 0, i);
                }
                int i3 = this.icD;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.Mxy, i, i3 - i);
                    System.arraycopy(objArr, i4, this.pvs, i, this.icD - i);
                }
            } else {
                int i5 = i2 - 1;
                this.icD = i5;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, iArr, i, i5 - i);
                    Object[] objArr2 = this.pvs;
                    System.arraycopy(objArr2, i6, objArr2, i, this.icD - i);
                }
                this.pvs[this.icD] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.icD;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.icD;
        Object[] objArr = new Object[i];
        System.arraycopy(this.pvs, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.icD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.icD));
        }
        System.arraycopy(this.pvs, 0, tArr, 0, this.icD);
        int length = tArr.length;
        int i = this.icD;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.icD; i++) {
                try {
                    if (!set.contains(icD(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.Mxy;
        int i = this.icD;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.icD * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < this.icD; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E icD = icD(i);
            if (icD != this) {
                sb.append(icD);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    private IP<E, E> icD() {
        if (this.Wyp == null) {
            this.Wyp = new IP<E, E>() { // from class: com.bytedance.adsdk.lottie.pvs.1
                @Override // com.bytedance.adsdk.lottie.IP
                protected int pvs() {
                    return pvs.this.icD;
                }

                @Override // com.bytedance.adsdk.lottie.IP
                protected Object pvs(int i, int i2) {
                    return pvs.this.pvs[i];
                }

                @Override // com.bytedance.adsdk.lottie.IP
                protected int pvs(Object obj) {
                    return pvs.this.pvs(obj);
                }

                @Override // com.bytedance.adsdk.lottie.IP
                protected Map<E, E> icD() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.lottie.IP
                protected void pvs(int i) {
                    pvs.this.vG(i);
                }

                @Override // com.bytedance.adsdk.lottie.IP
                protected void vG() {
                    pvs.this.clear();
                }
            };
        }
        return this.Wyp;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return icD().Jd().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        pvs(this.icD + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.icD - 1; i >= 0; i--) {
            if (!collection.contains(this.pvs[i])) {
                vG(i);
                z = true;
            }
        }
        return z;
    }
}
