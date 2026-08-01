package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class i7 implements Collection, Set, pw {
    public int[] f;
    public Object[] g;
    public int h;

    public i7(int i) {
        this.f = gk0.c;
        this.g = gk0.d;
        if (i > 0) {
            this.f = new int[i];
            this.g = new Object[i];
        }
    }

    public final Object a(int i) {
        int i2 = this.h;
        Object[] objArr = this.g;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                j7.W(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.g;
                j7.Y(objArr2, objArr2, i, i4, i2);
            }
            this.g[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f = iArr2;
            this.g = new Object[i5];
            if (i > 0) {
                j7.W(0, 0, i, iArr, iArr2);
                j7.Z(objArr, this.g, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                j7.W(i, i6, i2, iArr, this.f);
                j7.Y(objArr, this.g, i, i6, i2);
            }
        }
        if (i2 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int u;
        int i2 = this.h;
        if (obj == null) {
            u = gk0.u(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            u = gk0.u(this, obj, hashCode);
        }
        if (u >= 0) {
            return false;
        }
        int i3 = ~u;
        int[] iArr = this.f;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.g;
            int[] iArr2 = new int[i4];
            this.f = iArr2;
            this.g = new Object[i4];
            if (i2 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                j7.W(0, 0, iArr.length, iArr, iArr2);
                j7.Z(objArr, this.g, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f;
            int i5 = i3 + 1;
            j7.W(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.g;
            j7.Y(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.h;
        if (i2 == i6) {
            int[] iArr4 = this.f;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.g[i3] = obj;
                this.h = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.h;
        int i = this.h;
        int[] iArr = this.f;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.g;
            int[] iArr2 = new int[size];
            this.f = iArr2;
            this.g = new Object[size];
            if (i > 0) {
                j7.W(0, 0, i, iArr, iArr2);
                j7.Z(objArr, this.g, 0, this.h, 6);
            }
        }
        if (this.h != i) {
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
        if (this.h != 0) {
            this.f = gk0.c;
            this.g = gk0.d;
            this.h = 0;
        }
        if (this.h != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? gk0.u(this, null, 0) : gk0.u(this, obj, obj.hashCode())) >= 0;
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
        if (!(obj instanceof Set) || this.h != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.h;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.g[i2])) {
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
        int[] iArr = this.f;
        int i = this.h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c7(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int u = obj == null ? gk0.u(this, null, 0) : gk0.u(this, obj, obj.hashCode());
        if (u < 0) {
            return false;
        }
        a(u);
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
        for (int i = this.h - 1; -1 < i; i--) {
            if (!collection.contains(this.g[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        j7.Y(this.g, objArr, 0, 0, this.h);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 14);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.g[i2];
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
        Object[] objArr = this.g;
        int i = this.h;
        objArr.getClass();
        n9.h(i, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
        copyOfRange.getClass();
        return copyOfRange;
    }
}
