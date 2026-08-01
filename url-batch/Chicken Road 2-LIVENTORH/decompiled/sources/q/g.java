package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g implements Collection, Set, g3.a {

    /* renamed from: f, reason: collision with root package name */
    public int[] f3026f = r.a.f3114a;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3027g = r.a.f3115b;

    /* renamed from: h, reason: collision with root package name */
    public int f3028h;

    public final Object a(int i) {
        int i4 = this.f3028h;
        Object[] objArr = this.f3027g;
        Object obj = objArr[i];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f3026f;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i < i5) {
                int i6 = i + 1;
                a3.d.W(i, i6, i4, iArr, iArr);
                Object[] objArr2 = this.f3027g;
                a3.d.X(objArr2, objArr2, i, i6, i4);
            }
            this.f3027g[i5] = null;
        } else {
            int i7 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArr2 = new int[i7];
            this.f3026f = iArr2;
            this.f3027g = new Object[i7];
            if (i > 0) {
                a3.d.W(0, 0, i, iArr, iArr2);
                a3.d.Y(objArr, this.f3027g, 0, i, 6);
            }
            if (i < i5) {
                int i8 = i + 1;
                a3.d.W(i, i8, i4, iArr, this.f3026f);
                a3.d.X(objArr, this.f3027g, i, i8, i4);
            }
        }
        if (i4 != this.f3028h) {
            throw new ConcurrentModificationException();
        }
        this.f3028h = i5;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int a2;
        int i4 = this.f3028h;
        if (obj == null) {
            a2 = i.a(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            a2 = i.a(this, obj, hashCode);
        }
        if (a2 >= 0) {
            return false;
        }
        int i5 = ~a2;
        int[] iArr = this.f3026f;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f3027g;
            int[] iArr2 = new int[i6];
            this.f3026f = iArr2;
            this.f3027g = new Object[i6];
            if (i4 != this.f3028h) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                a3.d.W(0, 0, iArr.length, iArr, iArr2);
                a3.d.Y(objArr, this.f3027g, 0, objArr.length, 6);
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f3026f;
            int i7 = i5 + 1;
            a3.d.W(i7, i5, i4, iArr3, iArr3);
            Object[] objArr2 = this.f3027g;
            a3.d.X(objArr2, objArr2, i7, i5, i4);
        }
        int i8 = this.f3028h;
        if (i4 == i8) {
            int[] iArr4 = this.f3026f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                this.f3027g[i5] = obj;
                this.f3028h = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        f3.d.e(collection, "elements");
        int size = collection.size() + this.f3028h;
        int i = this.f3028h;
        int[] iArr = this.f3026f;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3027g;
            int[] iArr2 = new int[size];
            this.f3026f = iArr2;
            this.f3027g = new Object[size];
            if (i > 0) {
                a3.d.W(0, 0, i, iArr, iArr2);
                a3.d.Y(objArr, this.f3027g, 0, this.f3028h, 6);
            }
        }
        if (this.f3028h != i) {
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
        if (this.f3028h != 0) {
            this.f3026f = r.a.f3114a;
            this.f3027g = r.a.f3115b;
            this.f3028h = 0;
        }
        if (this.f3028h != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        f3.d.e(collection, "elements");
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
        if (!(obj instanceof Set) || this.f3028h != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f3028h;
            for (int i4 = 0; i4 < i; i4++) {
                if (!((Set) obj).contains(this.f3027g[i4])) {
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
        int[] iArr = this.f3026f;
        int i = this.f3028h;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3028h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a2 = obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode());
        if (a2 < 0) {
            return false;
        }
        a(a2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        f3.d.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        f3.d.e(collection, "elements");
        boolean z3 = false;
        for (int i = this.f3028h - 1; -1 < i; i--) {
            if (!collection.contains(this.f3027g[i])) {
                a(i);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3028h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return a3.d.Z(this.f3027g, 0, this.f3028h);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3028h * 14);
        sb.append('{');
        int i = this.f3028h;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3027g[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f3.d.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        f3.d.e(objArr, "array");
        int i = this.f3028h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        a3.d.X(this.f3027g, objArr, 0, 0, this.f3028h);
        return objArr;
    }
}
