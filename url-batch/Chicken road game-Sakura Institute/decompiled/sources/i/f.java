package i;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements Collection, Set, s6.b, s6.f {

    /* renamed from: f, reason: collision with root package name */
    public int[] f4737f = j.a.f4966a;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f4738g = j.a.f4968c;

    /* renamed from: h, reason: collision with root package name */
    public int f4739h;

    public f(int i7) {
        if (i7 > 0) {
            m.b(this, i7);
        }
    }

    public final Object a(int i7) {
        int i8 = this.f4739h;
        Object[] objArr = this.f4738g;
        Object obj = objArr[i7];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i9 = i8 - 1;
        int[] iArr = this.f4737f;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            if (i7 < i9) {
                int i10 = i7 + 1;
                e6.k.W(iArr, iArr, i7, i10, i8);
                Object[] objArr2 = this.f4738g;
                e6.k.X(objArr2, objArr2, i7, i10, i8);
            }
            this.f4738g[i9] = null;
        } else {
            int i11 = i8 > 8 ? i8 + (i8 >> 1) : 8;
            int[] iArr2 = new int[i11];
            this.f4737f = iArr2;
            this.f4738g = new Object[i11];
            if (i7 > 0) {
                e6.k.Y(iArr, iArr2, 0, i7, 6);
                e6.k.Z(objArr, this.f4738g, 0, i7, 6);
            }
            if (i7 < i9) {
                int i12 = i7 + 1;
                e6.k.W(iArr, this.f4737f, i7, i12, i8);
                e6.k.X(objArr, this.f4738g, i7, i12, i8);
            }
        }
        if (i8 != this.f4739h) {
            throw new ConcurrentModificationException();
        }
        this.f4739h = i9;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int c4;
        int i8 = this.f4739h;
        if (obj == null) {
            c4 = m.c(this, null, 0);
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            c4 = m.c(this, obj, hashCode);
        }
        if (c4 >= 0) {
            return false;
        }
        int i9 = ~c4;
        int[] iArr = this.f4737f;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f4738g;
            int[] iArr2 = new int[i10];
            this.f4737f = iArr2;
            this.f4738g = new Object[i10];
            if (i8 != this.f4739h) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                e6.k.Y(iArr, iArr2, 0, iArr.length, 6);
                e6.k.Z(objArr, this.f4738g, 0, objArr.length, 6);
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f4737f;
            int i11 = i9 + 1;
            e6.k.W(iArr3, iArr3, i11, i9, i8);
            Object[] objArr2 = this.f4738g;
            e6.k.X(objArr2, objArr2, i11, i9, i8);
        }
        int i12 = this.f4739h;
        if (i8 == i12) {
            int[] iArr4 = this.f4737f;
            if (i9 < iArr4.length) {
                iArr4[i9] = i7;
                this.f4738g[i9] = obj;
                this.f4739h = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        r6.k.f(collection, "elements");
        int size = collection.size() + this.f4739h;
        int i7 = this.f4739h;
        int[] iArr = this.f4737f;
        boolean z8 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4738g;
            int[] iArr2 = new int[size];
            this.f4737f = iArr2;
            this.f4738g = new Object[size];
            if (i7 > 0) {
                e6.k.Y(iArr, iArr2, 0, i7, 6);
                e6.k.Z(objArr, this.f4738g, 0, this.f4739h, 6);
            }
        }
        if (this.f4739h != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z8 |= add(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f4739h != 0) {
            this.f4737f = j.a.f4966a;
            this.f4738g = j.a.f4968c;
            this.f4739h = 0;
        }
        if (this.f4739h != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m.c(this, null, 0) : m.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        r6.k.f(collection, "elements");
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
        if (!(obj instanceof Set) || this.f4739h != ((Set) obj).size()) {
            return false;
        }
        try {
            int i7 = this.f4739h;
            for (int i8 = 0; i8 < i7; i8++) {
                if (!((Set) obj).contains(this.f4738g[i8])) {
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
        int[] iArr = this.f4737f;
        int i7 = this.f4739h;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4739h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c4 = obj == null ? m.c(this, null, 0) : m.c(this, obj, obj.hashCode());
        if (c4 < 0) {
            return false;
        }
        a(c4);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        r6.k.f(collection, "elements");
        Iterator it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= remove(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        r6.k.f(collection, "elements");
        boolean z8 = false;
        for (int i7 = this.f4739h - 1; -1 < i7; i7--) {
            if (!e6.l.f0(collection, this.f4738g[i7])) {
                a(i7);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4739h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return e6.k.b0(this.f4738g, 0, this.f4739h);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4739h * 14);
        sb.append('{');
        int i7 = this.f4739h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4738g[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        r6.k.f(objArr, "array");
        int i7 = this.f4739h;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        } else if (objArr.length > i7) {
            objArr[i7] = null;
        }
        e6.k.X(this.f4738g, objArr, 0, 0, this.f4739h);
        return objArr;
    }
}
