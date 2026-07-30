package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ii implements Collection, Set, l71, o71 {
    public int[] m = yk3.p;
    public Object[] n = yk3.r;
    public int o;

    public ii(int i) {
        if (i > 0) {
            l41.p(this, i);
        }
    }

    public final Object a(int i) {
        int i2 = this.o;
        Object[] objArr = this.n;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.m;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                ni.d(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.n;
                ni.e(i, i4, i2, objArr2, objArr2);
            }
            this.n[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.m = iArr2;
            this.n = new Object[i5];
            if (i > 0) {
                ni.h(0, i, 6, iArr, iArr2);
                ni.i(0, i, 6, objArr, this.n);
            }
            if (i < i3) {
                int i6 = i + 1;
                ni.d(i, i6, i2, iArr, this.m);
                ni.e(i, i6, i2, objArr, this.n);
            }
        }
        if (i2 != this.o) {
            throw new ConcurrentModificationException();
        }
        this.o = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int H;
        int i2 = this.o;
        if (obj == null) {
            H = l41.H(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            H = l41.H(this, obj, hashCode);
        }
        if (H >= 0) {
            return false;
        }
        int i3 = ~H;
        int[] iArr = this.m;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.n;
            int[] iArr2 = new int[i4];
            this.m = iArr2;
            this.n = new Object[i4];
            if (i2 != this.o) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                ni.h(0, iArr.length, 6, iArr, iArr2);
                ni.i(0, objArr.length, 6, objArr, this.n);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.m;
            int i5 = i3 + 1;
            ni.d(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.n;
            ni.e(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.o;
        if (i2 == i6) {
            int[] iArr4 = this.m;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.n[i3] = obj;
                this.o = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.o;
        int i = this.o;
        int[] iArr = this.m;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.n;
            int[] iArr2 = new int[size];
            this.m = iArr2;
            this.n = new Object[size];
            if (i > 0) {
                ni.h(0, i, 6, iArr, iArr2);
                ni.i(0, this.o, 6, objArr, this.n);
            }
        }
        if (this.o != i) {
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
        if (this.o != 0) {
            this.m = yk3.p;
            this.n = yk3.r;
            this.o = 0;
        }
        if (this.o != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? l41.H(this, null, 0) : l41.H(this, obj, obj.hashCode())) >= 0;
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
        if (!(obj instanceof Set) || this.o != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.o;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.n[i2])) {
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
        int[] iArr = this.m;
        int i = this.o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.o <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new di(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int H = obj == null ? l41.H(this, null, 0) : l41.H(this, obj, obj.hashCode());
        if (H < 0) {
            return false;
        }
        a(H);
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
        for (int i = this.o - 1; -1 < i; i--) {
            if (!zv.q(collection, this.n[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.o;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.o;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ni.e(0, 0, this.o, this.n, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o * 14);
        sb.append('{');
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.n[i2];
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
        return ni.j(this.n, 0, this.o);
    }
}
