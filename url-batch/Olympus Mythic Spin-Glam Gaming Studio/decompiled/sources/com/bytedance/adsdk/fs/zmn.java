package com.bytedance.adsdk.fs;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class zmn<E> implements Collection<E>, Set<E> {
    private static Object[] btk;
    private static int hhw;
    private static Object[] nps;
    private static int zg;
    private int[] bvs;
    int fs;
    private cn<E, E> iv;
    Object[] zmn;
    private static final int[] zn = new int[0];
    private static final Object[] fb = new Object[0];

    private int zmn(Object obj, int i) {
        int i2 = this.fs;
        if (i2 == 0) {
            return -1;
        }
        int zmn = fs.zmn(this.bvs, i2, i);
        if (zmn < 0 || obj.equals(this.zmn[zmn])) {
            return zmn;
        }
        int i3 = zmn + 1;
        while (i3 < i2 && this.bvs[i3] == i) {
            if (obj.equals(this.zmn[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = zmn - 1; i4 >= 0 && this.bvs[i4] == i; i4--) {
            if (obj.equals(this.zmn[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private int zmn() {
        int i = this.fs;
        if (i == 0) {
            return -1;
        }
        int zmn = fs.zmn(this.bvs, i, 0);
        if (zmn < 0 || this.zmn[zmn] == null) {
            return zmn;
        }
        int i2 = zmn + 1;
        while (i2 < i && this.bvs[i2] == 0) {
            if (this.zmn[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = zmn - 1; i3 >= 0 && this.bvs[i3] == 0; i3--) {
            if (this.zmn[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private void fb(int i) {
        if (i == 8) {
            synchronized (zmn.class) {
                Object[] objArr = nps;
                if (objArr != null) {
                    this.zmn = objArr;
                    nps = (Object[]) objArr[0];
                    this.bvs = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    zg--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (zmn.class) {
                Object[] objArr2 = btk;
                if (objArr2 != null) {
                    this.zmn = objArr2;
                    btk = (Object[]) objArr2[0];
                    this.bvs = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    hhw--;
                    return;
                }
            }
        }
        this.bvs = new int[i];
        this.zmn = new Object[i];
    }

    private static void zmn(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (zmn.class) {
                try {
                    if (zg < 10) {
                        objArr[0] = nps;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        nps = objArr;
                        zg++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (zmn.class) {
                try {
                    if (hhw < 10) {
                        objArr[0] = btk;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        btk = objArr;
                        hhw++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public zmn() {
        this(0);
    }

    public zmn(int i) {
        if (i == 0) {
            this.bvs = zn;
            this.zmn = fb;
        } else {
            fb(i);
        }
        this.fs = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.fs;
        if (i != 0) {
            zmn(this.bvs, this.zmn, i);
            this.bvs = zn;
            this.zmn = fb;
            this.fs = 0;
        }
    }

    public void zmn(int i) {
        int[] iArr = this.bvs;
        if (iArr.length < i) {
            Object[] objArr = this.zmn;
            fb(i);
            int i2 = this.fs;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.bvs, 0, i2);
                System.arraycopy(objArr, 0, this.zmn, 0, this.fs);
            }
            zmn(iArr, objArr, this.fs);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return zmn(obj) >= 0;
    }

    public int zmn(Object obj) {
        return obj == null ? zmn() : zmn(obj, obj.hashCode());
    }

    public E fs(int i) {
        return (E) this.zmn[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.fs <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int zmn;
        if (e == null) {
            zmn = zmn();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            zmn = zmn(e, hashCode);
        }
        if (zmn >= 0) {
            return false;
        }
        int i2 = ~zmn;
        int i3 = this.fs;
        int[] iArr = this.bvs;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.zmn;
            fb(i4);
            int[] iArr2 = this.bvs;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.zmn, 0, objArr.length);
            }
            zmn(iArr, objArr, this.fs);
        }
        int i5 = this.fs;
        if (i2 < i5) {
            int[] iArr3 = this.bvs;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.zmn;
            System.arraycopy(objArr2, i2, objArr2, i6, this.fs - i2);
        }
        this.bvs[i2] = i;
        this.zmn[i2] = e;
        this.fs++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int zmn = zmn(obj);
        if (zmn < 0) {
            return false;
        }
        zn(zmn);
        return true;
    }

    public E zn(int i) {
        Object[] objArr = this.zmn;
        E e = (E) objArr[i];
        int i2 = this.fs;
        if (i2 <= 1) {
            zmn(this.bvs, objArr, i2);
            this.bvs = zn;
            this.zmn = fb;
            this.fs = 0;
        } else {
            int[] iArr = this.bvs;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                fb(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.fs--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.bvs, 0, i);
                    System.arraycopy(objArr, 0, this.zmn, 0, i);
                }
                int i3 = this.fs;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.bvs, i, i3 - i);
                    System.arraycopy(objArr, i4, this.zmn, i, this.fs - i);
                }
            } else {
                int i5 = i2 - 1;
                this.fs = i5;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, iArr, i, i5 - i);
                    Object[] objArr2 = this.zmn;
                    System.arraycopy(objArr2, i6, objArr2, i, this.fs - i);
                }
                this.zmn[this.fs] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.fs;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.fs;
        Object[] objArr = new Object[i];
        System.arraycopy(this.zmn, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.fs) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.fs));
        }
        System.arraycopy(this.zmn, 0, tArr, 0, this.fs);
        int length = tArr.length;
        int i = this.fs;
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
            for (int i = 0; i < this.fs; i++) {
                try {
                    if (!set.contains(fs(i))) {
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
        int[] iArr = this.bvs;
        int i = this.fs;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.fs * 14);
        sb.append('{');
        for (int i = 0; i < this.fs; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E fs = fs(i);
            if (fs != this) {
                sb.append(fs);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private cn<E, E> fs() {
        if (this.iv == null) {
            this.iv = new cn<E, E>() { // from class: com.bytedance.adsdk.fs.zmn.1
                @Override // com.bytedance.adsdk.fs.cn
                protected int zmn() {
                    return zmn.this.fs;
                }

                @Override // com.bytedance.adsdk.fs.cn
                protected Object zmn(int i, int i2) {
                    return zmn.this.zmn[i];
                }

                @Override // com.bytedance.adsdk.fs.cn
                protected int zmn(Object obj) {
                    return zmn.this.zmn(obj);
                }

                @Override // com.bytedance.adsdk.fs.cn
                protected Map<E, E> fs() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.fs.cn
                protected void zmn(int i) {
                    zmn.this.zn(i);
                }

                @Override // com.bytedance.adsdk.fs.cn
                protected void zn() {
                    zmn.this.clear();
                }
            };
        }
        return this.iv;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return fs().fb().iterator();
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
        zmn(this.fs + collection.size());
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
        for (int i = this.fs - 1; i >= 0; i--) {
            if (!collection.contains(this.zmn[i])) {
                zn(i);
                z = true;
            }
        }
        return z;
    }
}
