package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g implements Collection, Set, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public int[] f3108f = r.a.f3175a;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3109g = r.a.f3176b;
    public int h;

    public final Object a(int i) {
        int i4 = this.h;
        Object[] objArr = this.f3109g;
        Object obj = objArr[i];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f3108f;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i < i5) {
                int i6 = i + 1;
                x2.g.G(i, i6, i4, iArr, iArr);
                Object[] objArr2 = this.f3109g;
                x2.g.H(objArr2, objArr2, i, i6, i4);
            }
            this.f3109g[i5] = null;
        } else {
            int i7 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArr2 = new int[i7];
            this.f3108f = iArr2;
            this.f3109g = new Object[i7];
            if (i > 0) {
                x2.g.G(0, 0, i, iArr, iArr2);
                x2.g.I(objArr, this.f3109g, 0, i, 6);
            }
            if (i < i5) {
                int i8 = i + 1;
                x2.g.G(i, i8, i4, iArr, this.f3108f);
                x2.g.H(objArr, this.f3109g, i, i8, i4);
            }
        }
        if (i4 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i5;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int a5;
        int i4 = this.h;
        if (obj == null) {
            a5 = i.a(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            a5 = i.a(this, obj, hashCode);
        }
        if (a5 >= 0) {
            return false;
        }
        int i5 = ~a5;
        int[] iArr = this.f3108f;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f3109g;
            int[] iArr2 = new int[i6];
            this.f3108f = iArr2;
            this.f3109g = new Object[i6];
            if (i4 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                x2.g.G(0, 0, iArr.length, iArr, iArr2);
                x2.g.I(objArr, this.f3109g, 0, objArr.length, 6);
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f3108f;
            int i7 = i5 + 1;
            x2.g.G(i7, i5, i4, iArr3, iArr3);
            Object[] objArr2 = this.f3109g;
            x2.g.H(objArr2, objArr2, i7, i5, i4);
        }
        int i8 = this.h;
        if (i4 == i8) {
            int[] iArr4 = this.f3108f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                this.f3109g[i5] = obj;
                this.h = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        i3.d.e(collection, "elements");
        int size = collection.size() + this.h;
        int i = this.h;
        int[] iArr = this.f3108f;
        boolean z4 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3109g;
            int[] iArr2 = new int[size];
            this.f3108f = iArr2;
            this.f3109g = new Object[size];
            if (i > 0) {
                x2.g.G(0, 0, i, iArr, iArr2);
                x2.g.I(objArr, this.f3109g, 0, this.h, 6);
            }
        }
        if (this.h != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.h != 0) {
            this.f3108f = r.a.f3175a;
            this.f3109g = r.a.f3176b;
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
        i3.d.e(collection, "elements");
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
            for (int i4 = 0; i4 < i; i4++) {
                if (!((Set) obj).contains(this.f3109g[i4])) {
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
        int[] iArr = this.f3108f;
        int i = this.h;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i4 += iArr[i5];
        }
        return i4;
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
        int a5 = obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode());
        if (a5 < 0) {
            return false;
        }
        a(a5);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        i3.d.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        i3.d.e(collection, "elements");
        boolean z4 = false;
        for (int i = this.h - 1; -1 < i; i--) {
            if (!collection.contains(this.f3109g[i])) {
                a(i);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return x2.g.J(this.f3109g, 0, this.h);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 14);
        sb.append('{');
        int i = this.h;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3109g[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        i3.d.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        i3.d.e(objArr, "array");
        int i = this.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        x2.g.H(this.f3109g, objArr, 0, 0, this.h);
        return objArr;
    }
}
