package j;

import g2.InterfaceC0440b;
import g2.InterfaceC0443e;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k.AbstractC0561a;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532f implements Collection, Set, InterfaceC0440b, InterfaceC0443e {

    /* renamed from: d, reason: collision with root package name */
    public int[] f6279d = AbstractC0561a.f6408a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f6280e = AbstractC0561a.f6410c;

    /* renamed from: f, reason: collision with root package name */
    public int f6281f;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int c2;
        int i4 = this.f6281f;
        if (obj == null) {
            c2 = AbstractC0539m.c(this, null, 0);
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            c2 = AbstractC0539m.c(this, obj, hashCode);
        }
        if (c2 >= 0) {
            return false;
        }
        int i5 = ~c2;
        int[] iArr = this.f6279d;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f6280e;
            AbstractC0539m.b(this, i6);
            if (i4 != this.f6281f) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f6279d;
            if (iArr2.length != 0) {
                S1.k.n0(iArr, iArr2, 0, iArr.length, 6);
                S1.k.o0(objArr, this.f6280e, 0, objArr.length, 6);
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f6279d;
            int i7 = i5 + 1;
            S1.k.l0(iArr3, iArr3, i7, i5, i4);
            Object[] objArr2 = this.f6280e;
            S1.k.m0(objArr2, objArr2, i7, i5, i4);
        }
        int i8 = this.f6281f;
        if (i4 == i8) {
            int[] iArr4 = this.f6279d;
            if (i5 < iArr4.length) {
                iArr4[i5] = i3;
                this.f6280e[i5] = obj;
                this.f6281f = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        f2.j.f(collection, "elements");
        int size = collection.size() + this.f6281f;
        int i3 = this.f6281f;
        int[] iArr = this.f6279d;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f6280e;
            AbstractC0539m.b(this, size);
            int i4 = this.f6281f;
            if (i4 > 0) {
                S1.k.n0(iArr, this.f6279d, 0, i4, 6);
                S1.k.o0(objArr, this.f6280e, 0, this.f6281f, 6);
            }
        }
        if (this.f6281f != i3) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    public final Object b(int i3) {
        int i4 = this.f6281f;
        Object[] objArr = this.f6280e;
        Object obj = objArr[i3];
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.f6279d;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i3 < i5) {
                    int i6 = i3 + 1;
                    S1.k.l0(iArr, iArr, i3, i6, i4);
                    Object[] objArr2 = this.f6280e;
                    S1.k.m0(objArr2, objArr2, i3, i6, i4);
                }
                this.f6280e[i5] = null;
            } else {
                AbstractC0539m.b(this, i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i3 > 0) {
                    S1.k.n0(iArr, this.f6279d, 0, i3, 6);
                    S1.k.o0(objArr, this.f6280e, 0, i3, 6);
                }
                if (i3 < i5) {
                    int i7 = i3 + 1;
                    S1.k.l0(iArr, this.f6279d, i3, i7, i4);
                    S1.k.m0(objArr, this.f6280e, i3, i7, i4);
                }
            }
            if (i4 != this.f6281f) {
                throw new ConcurrentModificationException();
            }
            this.f6281f = i5;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f6281f != 0) {
            this.f6279d = AbstractC0561a.f6408a;
            this.f6280e = AbstractC0561a.f6410c;
            this.f6281f = 0;
        }
        if (this.f6281f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0539m.c(this, null, 0) : AbstractC0539m.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        f2.j.f(collection, "elements");
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
        if ((obj instanceof Set) && this.f6281f == ((Set) obj).size()) {
            try {
                int i3 = this.f6281f;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (((Set) obj).contains(this.f6280e[i4])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f6279d;
        int i3 = this.f6281f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6281f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0527a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c2 = obj == null ? AbstractC0539m.c(this, null, 0) : AbstractC0539m.c(this, obj, obj.hashCode());
        if (c2 < 0) {
            return false;
        }
        b(c2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        f2.j.f(collection, "elements");
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        f2.j.f(collection, "elements");
        boolean z3 = false;
        for (int i3 = this.f6281f - 1; -1 < i3; i3--) {
            Collection collection2 = collection;
            Object obj = this.f6280e[i3];
            if (!(collection2 instanceof Collection ? collection2.contains(obj) : S1.l.M0(collection2, obj) >= 0)) {
                b(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f6281f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return S1.k.q0(this.f6280e, 0, this.f6281f);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6281f * 14);
        sb.append('{');
        int i3 = this.f6281f;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f6280e[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f2.j.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        f2.j.f(objArr, "array");
        int i3 = this.f6281f;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        } else if (objArr.length > i3) {
            objArr[i3] = null;
        }
        S1.k.m0(this.f6280e, objArr, 0, 0, this.f6281f);
        return objArr;
    }
}
