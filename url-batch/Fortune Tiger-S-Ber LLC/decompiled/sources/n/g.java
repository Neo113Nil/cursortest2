package n;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g implements Collection, Set, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public int[] f2930f = o.a.f2956a;
    public Object[] g = o.a.f2957b;
    public int h;

    public final Object a(int i4) {
        int i5 = this.h;
        Object[] objArr = this.g;
        Object obj = objArr[i4];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f2930f;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i4 < i6) {
                int i7 = i4 + 1;
                n2.f.C(i4, i7, i5, iArr, iArr);
                Object[] objArr2 = this.g;
                n2.f.D(objArr2, objArr2, i4, i7, i5);
            }
            this.g[i6] = null;
        } else {
            int i8 = i5 > 8 ? i5 + (i5 >> 1) : 8;
            int[] iArr2 = new int[i8];
            this.f2930f = iArr2;
            this.g = new Object[i8];
            if (i4 > 0) {
                n2.f.C(0, 0, i4, iArr, iArr2);
                n2.f.E(objArr, this.g, 0, i4, 6);
            }
            if (i4 < i6) {
                int i9 = i4 + 1;
                n2.f.C(i4, i9, i5, iArr, this.f2930f);
                n2.f.D(objArr, this.g, i4, i9, i5);
            }
        }
        if (i5 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i6;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int a4;
        int i5 = this.h;
        if (obj == null) {
            a4 = i.a(this, null, 0);
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            a4 = i.a(this, obj, hashCode);
        }
        if (a4 >= 0) {
            return false;
        }
        int i6 = ~a4;
        int[] iArr = this.f2930f;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.g;
            int[] iArr2 = new int[i7];
            this.f2930f = iArr2;
            this.g = new Object[i7];
            if (i5 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                n2.f.C(0, 0, iArr.length, iArr, iArr2);
                n2.f.E(objArr, this.g, 0, objArr.length, 6);
            }
        }
        if (i6 < i5) {
            int[] iArr3 = this.f2930f;
            int i8 = i6 + 1;
            n2.f.C(i8, i6, i5, iArr3, iArr3);
            Object[] objArr2 = this.g;
            n2.f.D(objArr2, objArr2, i8, i6, i5);
        }
        int i9 = this.h;
        if (i5 == i9) {
            int[] iArr4 = this.f2930f;
            if (i6 < iArr4.length) {
                iArr4[i6] = i4;
                this.g[i6] = obj;
                this.h = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        u2.c.e(collection, "elements");
        int size = collection.size() + this.h;
        int i4 = this.h;
        int[] iArr = this.f2930f;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.g;
            int[] iArr2 = new int[size];
            this.f2930f = iArr2;
            this.g = new Object[size];
            if (i4 > 0) {
                n2.f.C(0, 0, i4, iArr, iArr2);
                n2.f.E(objArr, this.g, 0, this.h, 6);
            }
        }
        if (this.h != i4) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.h != 0) {
            this.f2930f = o.a.f2956a;
            this.g = o.a.f2957b;
            this.h = 0;
        }
        if (this.h != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        u2.c.e(collection, "elements");
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
            int i4 = this.h;
            for (int i5 = 0; i5 < i4; i5++) {
                if (!((Set) obj).contains(this.g[i5])) {
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
        int[] iArr = this.f2930f;
        int i4 = this.h;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a4 = obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode());
        if (a4 < 0) {
            return false;
        }
        a(a4);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        u2.c.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        u2.c.e(collection, "elements");
        boolean z3 = false;
        for (int i4 = this.h - 1; -1 < i4; i4--) {
            if (!collection.contains(this.g[i4])) {
                a(i4);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.g;
        int i4 = this.h;
        u2.c.e(objArr, "<this>");
        l0.g.g(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i4);
        u2.c.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 14);
        sb.append('{');
        int i4 = this.h;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.g[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        u2.c.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        u2.c.e(objArr, "array");
        int i4 = this.h;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        } else if (objArr.length > i4) {
            objArr[i4] = null;
        }
        n2.f.D(this.g, objArr, 0, 0, this.h);
        return objArr;
    }
}
