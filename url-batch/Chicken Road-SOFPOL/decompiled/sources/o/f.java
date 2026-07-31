package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements Collection, Set, r6.b, r6.d {

    /* renamed from: d, reason: collision with root package name */
    public int[] f5444d = p.a.f5707a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f5445e = p.a.f5709c;

    /* renamed from: f, reason: collision with root package name */
    public int f5446f;

    public final Object a(int i) {
        int i8 = this.f5446f;
        Object[] objArr = this.f5445e;
        Object obj = objArr[i];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i9 = i8 - 1;
        int[] iArr = this.f5444d;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            if (i < i9) {
                int i10 = i + 1;
                d6.l.F(i, i10, i8, iArr, iArr);
                Object[] objArr2 = this.f5445e;
                d6.l.H(objArr2, objArr2, i, i10, i8);
            }
            this.f5445e[i9] = null;
        } else {
            int i11 = i8 > 8 ? i8 + (i8 >> 1) : 8;
            int[] iArr2 = new int[i11];
            this.f5444d = iArr2;
            this.f5445e = new Object[i11];
            if (i > 0) {
                d6.l.I(0, i, 6, iArr, iArr2);
                d6.l.J(objArr, this.f5445e, 0, i, 6);
            }
            if (i < i9) {
                int i12 = i + 1;
                d6.l.F(i, i12, i8, iArr, this.f5444d);
                d6.l.H(objArr, this.f5445e, i, i12, i8);
            }
        }
        if (i8 != this.f5446f) {
            throw new ConcurrentModificationException();
        }
        this.f5446f = i9;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int b8;
        int i8 = this.f5446f;
        if (obj == null) {
            b8 = r.b(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            b8 = r.b(this, obj, hashCode);
        }
        if (b8 >= 0) {
            return false;
        }
        int i9 = ~b8;
        int[] iArr = this.f5444d;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f5445e;
            int[] iArr2 = new int[i10];
            this.f5444d = iArr2;
            this.f5445e = new Object[i10];
            if (i8 != this.f5446f) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                d6.l.I(0, iArr.length, 6, iArr, iArr2);
                d6.l.J(objArr, this.f5445e, 0, objArr.length, 6);
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f5444d;
            int i11 = i9 + 1;
            d6.l.F(i11, i9, i8, iArr3, iArr3);
            Object[] objArr2 = this.f5445e;
            d6.l.H(objArr2, objArr2, i11, i9, i8);
        }
        int i12 = this.f5446f;
        if (i8 == i12) {
            int[] iArr4 = this.f5444d;
            if (i9 < iArr4.length) {
                iArr4[i9] = i;
                this.f5445e[i9] = obj;
                this.f5446f = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        q6.i.e(collection, "elements");
        int size = collection.size() + this.f5446f;
        int i = this.f5446f;
        int[] iArr = this.f5444d;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5445e;
            int[] iArr2 = new int[size];
            this.f5444d = iArr2;
            this.f5445e = new Object[size];
            if (i > 0) {
                d6.l.I(0, i, 6, iArr, iArr2);
                d6.l.J(objArr, this.f5445e, 0, this.f5446f, 6);
            }
        }
        if (this.f5446f != i) {
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
        if (this.f5446f != 0) {
            this.f5444d = p.a.f5707a;
            this.f5445e = p.a.f5709c;
            this.f5446f = 0;
        }
        if (this.f5446f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? r.b(this, null, 0) : r.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        q6.i.e(collection, "elements");
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
        if (!(obj instanceof Set) || this.f5446f != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f5446f;
            for (int i8 = 0; i8 < i; i8++) {
                if (!((Set) obj).contains(this.f5445e[i8])) {
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
        int[] iArr = this.f5444d;
        int i = this.f5446f;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5446f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b8 = obj == null ? r.b(this, null, 0) : r.b(this, obj, obj.hashCode());
        if (b8 < 0) {
            return false;
        }
        a(b8);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        q6.i.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        q6.i.e(collection, "elements");
        boolean z3 = false;
        for (int i = this.f5446f - 1; -1 < i; i--) {
            if (!d6.m.Q(collection, this.f5445e[i])) {
                a(i);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5446f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return d6.l.K(this.f5445e, 0, this.f5446f);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5446f * 14);
        sb.append('{');
        int i = this.f5446f;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f5445e[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        q6.i.e(objArr, "array");
        int i = this.f5446f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        d6.l.H(this.f5445e, objArr, 0, 0, this.f5446f);
        return objArr;
    }
}
