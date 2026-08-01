package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements Collection, Set, xd.b, xd.f {

    /* renamed from: d, reason: collision with root package name */
    public int[] f8296d = t.a.f9193a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8297e = t.a.f9195c;

    /* renamed from: i, reason: collision with root package name */
    public int f8298i;

    public f(int i3) {
        if (i3 > 0) {
            q.b(this, i3);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int c10;
        int i10 = this.f8298i;
        if (obj == null) {
            c10 = q.c(this, null, 0);
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            c10 = q.c(this, obj, hashCode);
        }
        if (c10 >= 0) {
            return false;
        }
        int i11 = ~c10;
        int[] iArr = this.f8296d;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f8297e;
            int[] iArr2 = new int[i12];
            this.f8296d = iArr2;
            this.f8297e = new Object[i12];
            if (i10 != this.f8298i) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                kotlin.collections.v.f(0, iArr.length, 6, iArr, iArr2);
                kotlin.collections.v.g(0, objArr.length, 6, objArr, this.f8297e);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f8296d;
            int i13 = i11 + 1;
            kotlin.collections.v.c(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f8297e;
            kotlin.collections.v.d(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f8298i;
        if (i10 == i14) {
            int[] iArr4 = this.f8296d;
            if (i11 < iArr4.length) {
                iArr4[i11] = i3;
                this.f8297e[i11] = obj;
                this.f8298i = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f8298i;
        int i3 = this.f8298i;
        int[] iArr = this.f8296d;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8297e;
            int[] iArr2 = new int[size];
            this.f8296d = iArr2;
            this.f8297e = new Object[size];
            if (i3 > 0) {
                kotlin.collections.v.f(0, i3, 6, iArr, iArr2);
                kotlin.collections.v.g(0, this.f8298i, 6, objArr, this.f8297e);
            }
        }
        if (this.f8298i != i3) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    public final Object b(int i3) {
        int i10 = this.f8298i;
        Object[] objArr = this.f8297e;
        Object obj = objArr[i3];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f8296d;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i3 < i11) {
                int i12 = i3 + 1;
                kotlin.collections.v.c(i3, i12, i10, iArr, iArr);
                Object[] objArr2 = this.f8297e;
                kotlin.collections.v.d(i3, i12, i10, objArr2, objArr2);
            }
            this.f8297e[i11] = null;
        } else {
            int i13 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArr2 = new int[i13];
            this.f8296d = iArr2;
            this.f8297e = new Object[i13];
            if (i3 > 0) {
                kotlin.collections.v.f(0, i3, 6, iArr, iArr2);
                kotlin.collections.v.g(0, i3, 6, objArr, this.f8297e);
            }
            if (i3 < i11) {
                int i14 = i3 + 1;
                kotlin.collections.v.c(i3, i14, i10, iArr, this.f8296d);
                kotlin.collections.v.d(i3, i14, i10, objArr, this.f8297e);
            }
        }
        if (i10 != this.f8298i) {
            throw new ConcurrentModificationException();
        }
        this.f8298i = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f8298i != 0) {
            this.f8296d = t.a.f9193a;
            this.f8297e = t.a.f9195c;
            this.f8298i = 0;
        }
        if (this.f8298i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? q.c(this, null, 0) : q.c(this, obj, obj.hashCode())) >= 0;
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
        if (!(obj instanceof Set) || this.f8298i != ((Set) obj).size()) {
            return false;
        }
        try {
            int i3 = this.f8298i;
            for (int i10 = 0; i10 < i3; i10++) {
                if (!((Set) obj).contains(this.f8297e[i10])) {
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
        int[] iArr = this.f8296d;
        int i3 = this.f8298i;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8298i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c10 = obj == null ? q.c(this, null, 0) : q.c(this, obj, obj.hashCode());
        if (c10 < 0) {
            return false;
        }
        b(c10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z10 = false;
        for (int i3 = this.f8298i - 1; -1 < i3; i3--) {
            if (!CollectionsKt.u(collection, this.f8297e[i3])) {
                b(i3);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8298i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i3 = this.f8298i;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        } else if (objArr.length > i3) {
            objArr[i3] = null;
        }
        kotlin.collections.v.d(0, 0, this.f8298i, this.f8297e, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8298i * 14);
        sb2.append('{');
        int i3 = this.f8298i;
        for (int i10 = 0; i10 < i3; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f8297e[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return kotlin.collections.v.h(this.f8297e, 0, this.f8298i);
    }
}
