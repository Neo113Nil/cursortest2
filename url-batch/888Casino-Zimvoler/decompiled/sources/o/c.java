package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3297e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f3298f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    public static Object[] f3299g;
    public static int h;
    public static Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public static int f3300j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f3301a = f3297e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3302b = f3298f;

    /* renamed from: c, reason: collision with root package name */
    public int f3303c = 0;
    public C0279a d;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f3300j < 10) {
                        objArr[0] = i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        i = objArr;
                        f3300j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (h < 10) {
                        objArr[0] = f3299g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f3299g = objArr;
                        h++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = i;
                    if (objArr != null) {
                        this.f3302b = objArr;
                        i = (Object[]) objArr[0];
                        this.f3301a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3300j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f3299g;
                    if (objArr2 != null) {
                        this.f3302b = objArr2;
                        f3299g = (Object[]) objArr2[0];
                        this.f3301a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3301a = new int[i2];
        this.f3302b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int c2;
        if (obj == null) {
            c2 = d();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            c2 = c(hashCode, obj);
        }
        if (c2 >= 0) {
            return false;
        }
        int i3 = ~c2;
        int i4 = this.f3303c;
        int[] iArr = this.f3301a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f3302b;
            a(i5);
            int[] iArr2 = this.f3301a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3302b, 0, objArr.length);
            }
            b(iArr, objArr, this.f3303c);
        }
        int i6 = this.f3303c;
        if (i3 < i6) {
            int[] iArr3 = this.f3301a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f3302b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f3303c - i3);
        }
        this.f3301a[i3] = i2;
        this.f3302b[i3] = obj;
        this.f3303c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f3303c;
        int[] iArr = this.f3301a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3302b;
            a(size);
            int i2 = this.f3303c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f3301a, 0, i2);
                System.arraycopy(objArr, 0, this.f3302b, 0, this.f3303c);
            }
            b(iArr, objArr, this.f3303c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    public final int c(int i2, Object obj) {
        int i3 = this.f3303c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(i3, i2, this.f3301a);
        if (a2 < 0 || obj.equals(this.f3302b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f3301a[i4] == i2) {
            if (obj.equals(this.f3302b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f3301a[i5] == i2; i5--) {
            if (obj.equals(this.f3302b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f3303c;
        if (i2 != 0) {
            b(this.f3301a, this.f3302b, i2);
            this.f3301a = f3297e;
            this.f3302b = f3298f;
            this.f3303c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f3303c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(i2, 0, this.f3301a);
        if (a2 < 0 || this.f3302b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f3301a[i3] == 0) {
            if (this.f3302b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f3301a[i4] == 0; i4--) {
            if (this.f3302b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void e(int i2) {
        Object[] objArr = this.f3302b;
        Object obj = objArr[i2];
        int i3 = this.f3303c;
        if (i3 <= 1) {
            b(this.f3301a, objArr, i3);
            this.f3301a = f3297e;
            this.f3302b = f3298f;
            this.f3303c = 0;
            return;
        }
        int[] iArr = this.f3301a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.f3303c = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.f3302b;
                System.arraycopy(objArr2, i5, objArr2, i2, this.f3303c - i2);
            }
            this.f3302b[this.f3303c] = null;
            return;
        }
        a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f3303c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f3301a, 0, i2);
            System.arraycopy(objArr, 0, this.f3302b, 0, i2);
        }
        int i6 = this.f3303c;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.f3301a, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.f3302b, i2, this.f3303c - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3303c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f3303c; i2++) {
                try {
                    if (!set.contains(this.f3302b[i2])) {
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
    public final int hashCode() {
        int[] iArr = this.f3301a;
        int i2 = this.f3303c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3303c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.d == null) {
            this.d = new C0279a(1, this);
        }
        C0279a c0279a = this.d;
        if (c0279a.f3294b == null) {
            c0279a.f3294b = new h(c0279a, 1);
        }
        return c0279a.f3294b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f3303c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f3302b[i2])) {
                e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3303c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.f3303c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f3302b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3303c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3303c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3302b[i2];
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
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f3303c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3303c);
        }
        System.arraycopy(this.f3302b, 0, objArr, 0, this.f3303c);
        int length = objArr.length;
        int i2 = this.f3303c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
