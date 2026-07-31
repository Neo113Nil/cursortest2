package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583c implements Collection, Set {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f5704j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Object[] f5705k = new Object[0];

    /* renamed from: l, reason: collision with root package name */
    public static Object[] f5706l;

    /* renamed from: m, reason: collision with root package name */
    public static int f5707m;

    /* renamed from: n, reason: collision with root package name */
    public static Object[] f5708n;

    /* renamed from: o, reason: collision with root package name */
    public static int f5709o;

    /* renamed from: f, reason: collision with root package name */
    public int[] f5710f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5711g;

    /* renamed from: h, reason: collision with root package name */
    public int f5712h;

    /* renamed from: i, reason: collision with root package name */
    public C0581a f5713i;

    public C0583c(int i7) {
        if (i7 == 0) {
            this.f5710f = f5704j;
            this.f5711g = f5705k;
        } else {
            a(i7);
        }
        this.f5712h = 0;
    }

    public static void b(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (C0583c.class) {
                try {
                    if (f5709o < 10) {
                        objArr[0] = f5708n;
                        objArr[1] = iArr;
                        for (int i8 = i7 - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f5708n = objArr;
                        f5709o++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0583c.class) {
                try {
                    if (f5707m < 10) {
                        objArr[0] = f5706l;
                        objArr[1] = iArr;
                        for (int i9 = i7 - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f5706l = objArr;
                        f5707m++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i7) {
        if (i7 == 8) {
            synchronized (C0583c.class) {
                try {
                    Object[] objArr = f5708n;
                    if (objArr != null) {
                        this.f5711g = objArr;
                        f5708n = (Object[]) objArr[0];
                        this.f5710f = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5709o--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (C0583c.class) {
                try {
                    Object[] objArr2 = f5706l;
                    if (objArr2 != null) {
                        this.f5711g = objArr2;
                        f5706l = (Object[]) objArr2[0];
                        this.f5710f = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5707m--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f5710f = new int[i7];
        this.f5711g = new Object[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int c7;
        if (obj == null) {
            c7 = d();
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            c7 = c(hashCode, obj);
        }
        if (c7 >= 0) {
            return false;
        }
        int i8 = ~c7;
        int i9 = this.f5712h;
        int[] iArr = this.f5710f;
        if (i9 >= iArr.length) {
            int i10 = 8;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f5711g;
            a(i10);
            int[] iArr2 = this.f5710f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5711g, 0, objArr.length);
            }
            b(iArr, objArr, this.f5712h);
        }
        int i11 = this.f5712h;
        if (i8 < i11) {
            int[] iArr3 = this.f5710f;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr2 = this.f5711g;
            System.arraycopy(objArr2, i8, objArr2, i12, this.f5712h - i8);
        }
        this.f5710f[i8] = i7;
        this.f5711g[i8] = obj;
        this.f5712h++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f5712h;
        int[] iArr = this.f5710f;
        boolean z5 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5711g;
            a(size);
            int i7 = this.f5712h;
            if (i7 > 0) {
                System.arraycopy(iArr, 0, this.f5710f, 0, i7);
                System.arraycopy(objArr, 0, this.f5711g, 0, this.f5712h);
            }
            b(iArr, objArr, this.f5712h);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z5 |= add(it.next());
        }
        return z5;
    }

    public final int c(int i7, Object obj) {
        int i8 = this.f5712h;
        if (i8 == 0) {
            return -1;
        }
        int a7 = AbstractC0584d.a(i8, i7, this.f5710f);
        if (a7 < 0 || obj.equals(this.f5711g[a7])) {
            return a7;
        }
        int i9 = a7 + 1;
        while (i9 < i8 && this.f5710f[i9] == i7) {
            if (obj.equals(this.f5711g[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a7 - 1; i10 >= 0 && this.f5710f[i10] == i7; i10--) {
            if (obj.equals(this.f5711g[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i7 = this.f5712h;
        if (i7 != 0) {
            b(this.f5710f, this.f5711g, i7);
            this.f5710f = f5704j;
            this.f5711g = f5705k;
            this.f5712h = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? d() : c(obj.hashCode(), obj)) >= 0;
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
        int i7 = this.f5712h;
        if (i7 == 0) {
            return -1;
        }
        int a7 = AbstractC0584d.a(i7, 0, this.f5710f);
        if (a7 < 0 || this.f5711g[a7] == null) {
            return a7;
        }
        int i8 = a7 + 1;
        while (i8 < i7 && this.f5710f[i8] == 0) {
            if (this.f5711g[i8] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a7 - 1; i9 >= 0 && this.f5710f[i9] == 0; i9--) {
            if (this.f5711g[i9] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final void e(int i7) {
        Object[] objArr = this.f5711g;
        Object obj = objArr[i7];
        int i8 = this.f5712h;
        if (i8 <= 1) {
            b(this.f5710f, objArr, i8);
            this.f5710f = f5704j;
            this.f5711g = f5705k;
            this.f5712h = 0;
            return;
        }
        int[] iArr = this.f5710f;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            int i9 = i8 - 1;
            this.f5712h = i9;
            if (i7 < i9) {
                int i10 = i7 + 1;
                System.arraycopy(iArr, i10, iArr, i7, i9 - i7);
                Object[] objArr2 = this.f5711g;
                System.arraycopy(objArr2, i10, objArr2, i7, this.f5712h - i7);
            }
            this.f5711g[this.f5712h] = null;
            return;
        }
        a(i8 > 8 ? i8 + (i8 >> 1) : 8);
        this.f5712h--;
        if (i7 > 0) {
            System.arraycopy(iArr, 0, this.f5710f, 0, i7);
            System.arraycopy(objArr, 0, this.f5711g, 0, i7);
        }
        int i11 = this.f5712h;
        if (i7 < i11) {
            int i12 = i7 + 1;
            System.arraycopy(iArr, i12, this.f5710f, i7, i11 - i7);
            System.arraycopy(objArr, i12, this.f5711g, i7, this.f5712h - i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f5712h != set.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f5712h; i7++) {
                try {
                    if (!set.contains(this.f5711g[i7])) {
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
        int[] iArr = this.f5710f;
        int i7 = this.f5712h;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5712h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f5713i == null) {
            this.f5713i = new C0581a(1, this);
        }
        C0581a c0581a = this.f5713i;
        if (((C0588h) c0581a.f1960b) == null) {
            c0581a.f1960b = new C0588h(c0581a, 1);
        }
        return ((C0588h) c0581a.f1960b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int d7 = obj == null ? d() : c(obj.hashCode(), obj);
        if (d7 < 0) {
            return false;
        }
        e(d7);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= remove(it.next());
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z5 = false;
        for (int i7 = this.f5712h - 1; i7 >= 0; i7--) {
            if (!collection.contains(this.f5711g[i7])) {
                e(i7);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5712h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i7 = this.f5712h;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.f5711g, 0, objArr, 0, i7);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5712h * 14);
        sb.append('{');
        for (int i7 = 0; i7 < this.f5712h; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = this.f5711g[i7];
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
        if (objArr.length < this.f5712h) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f5712h);
        }
        System.arraycopy(this.f5711g, 0, objArr, 0, this.f5712h);
        int length = objArr.length;
        int i7 = this.f5712h;
        if (length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
