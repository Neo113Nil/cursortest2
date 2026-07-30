package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: A, reason: collision with root package name */
    public static int f40370A;

    /* renamed from: B, reason: collision with root package name */
    public static Object[] f40371B;

    /* renamed from: C, reason: collision with root package name */
    public static int f40372C;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f40373x = new int[0];

    /* renamed from: y, reason: collision with root package name */
    public static final Object[] f40374y = new Object[0];

    /* renamed from: z, reason: collision with root package name */
    public static Object[] f40375z;

    /* renamed from: n, reason: collision with root package name */
    public int[] f40376n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f40377u;

    /* renamed from: v, reason: collision with root package name */
    public int f40378v;

    /* renamed from: w, reason: collision with root package name */
    public C4986a f40379w;

    public c(int i) {
        if (i == 0) {
            this.f40376n = f40373x;
            this.f40377u = f40374y;
        } else {
            a(i);
        }
        this.f40378v = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f40372C < 10) {
                        objArr[0] = f40371B;
                        objArr[1] = iArr;
                        for (int i4 = i - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f40371B = objArr;
                        f40372C++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f40370A < 10) {
                        objArr[0] = f40375z;
                        objArr[1] = iArr;
                        for (int i9 = i - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f40375z = objArr;
                        f40370A++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f40371B;
                    if (objArr != null) {
                        this.f40377u = objArr;
                        f40371B = (Object[]) objArr[0];
                        this.f40376n = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f40372C--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f40375z;
                    if (objArr2 != null) {
                        this.f40377u = objArr2;
                        f40375z = (Object[]) objArr2[0];
                        this.f40376n = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f40370A--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f40376n = new int[i];
        this.f40377u = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int d2;
        if (obj == null) {
            d2 = e();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            d2 = d(hashCode, obj);
        }
        if (d2 >= 0) {
            return false;
        }
        int i4 = ~d2;
        int i9 = this.f40378v;
        int[] iArr = this.f40376n;
        if (i9 >= iArr.length) {
            int i10 = 8;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f40377u;
            a(i10);
            int[] iArr2 = this.f40376n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f40377u, 0, objArr.length);
            }
            c(iArr, objArr, this.f40378v);
        }
        int i11 = this.f40378v;
        if (i4 < i11) {
            int[] iArr3 = this.f40376n;
            int i12 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i12, i11 - i4);
            Object[] objArr2 = this.f40377u;
            System.arraycopy(objArr2, i4, objArr2, i12, this.f40378v - i4);
        }
        this.f40376n[i4] = i;
        this.f40377u[i4] = obj;
        this.f40378v++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f40378v;
        int[] iArr = this.f40376n;
        boolean z8 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f40377u;
            a(size);
            int i = this.f40378v;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f40376n, 0, i);
                System.arraycopy(objArr, 0, this.f40377u, 0, this.f40378v);
            }
            c(iArr, objArr, this.f40378v);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z8 |= add(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f40378v;
        if (i != 0) {
            c(this.f40376n, this.f40377u, i);
            this.f40376n = f40373x;
            this.f40377u = f40374y;
            this.f40378v = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? e() : d(obj.hashCode(), obj)) >= 0;
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

    public final int d(int i, Object obj) {
        int i4 = this.f40378v;
        if (i4 == 0) {
            return -1;
        }
        int a9 = d.a(i4, i, this.f40376n);
        if (a9 < 0 || obj.equals(this.f40377u[a9])) {
            return a9;
        }
        int i9 = a9 + 1;
        while (i9 < i4 && this.f40376n[i9] == i) {
            if (obj.equals(this.f40377u[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a9 - 1; i10 >= 0 && this.f40376n[i10] == i; i10--) {
            if (obj.equals(this.f40377u[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int e() {
        int i = this.f40378v;
        if (i == 0) {
            return -1;
        }
        int a9 = d.a(i, 0, this.f40376n);
        if (a9 < 0 || this.f40377u[a9] == null) {
            return a9;
        }
        int i4 = a9 + 1;
        while (i4 < i && this.f40376n[i4] == 0) {
            if (this.f40377u[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i9 = a9 - 1; i9 >= 0 && this.f40376n[i9] == 0; i9--) {
            if (this.f40377u[i9] == null) {
                return i9;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f40378v != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f40378v; i++) {
                try {
                    if (!set.contains(this.f40377u[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i) {
        Object[] objArr = this.f40377u;
        Object obj = objArr[i];
        int i4 = this.f40378v;
        if (i4 <= 1) {
            c(this.f40376n, objArr, i4);
            this.f40376n = f40373x;
            this.f40377u = f40374y;
            this.f40378v = 0;
            return;
        }
        int[] iArr = this.f40376n;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            int i9 = i4 - 1;
            this.f40378v = i9;
            if (i < i9) {
                int i10 = i + 1;
                System.arraycopy(iArr, i10, iArr, i, i9 - i);
                Object[] objArr2 = this.f40377u;
                System.arraycopy(objArr2, i10, objArr2, i, this.f40378v - i);
            }
            this.f40377u[this.f40378v] = null;
            return;
        }
        a(i4 > 8 ? i4 + (i4 >> 1) : 8);
        this.f40378v--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f40376n, 0, i);
            System.arraycopy(objArr, 0, this.f40377u, 0, i);
        }
        int i11 = this.f40378v;
        if (i < i11) {
            int i12 = i + 1;
            System.arraycopy(iArr, i12, this.f40376n, i, i11 - i);
            System.arraycopy(objArr, i12, this.f40377u, i, this.f40378v - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f40376n;
        int i = this.f40378v;
        int i4 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i4 += iArr[i9];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40378v <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f40379w == null) {
            this.f40379w = new C4986a(1, this);
        }
        C4986a c4986a = this.f40379w;
        if (((g) c4986a.f40401b) == null) {
            c4986a.f40401b = new g(c4986a, 1);
        }
        return ((g) c4986a.f40401b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int e6 = obj == null ? e() : d(obj.hashCode(), obj);
        if (e6 < 0) {
            return false;
        }
        f(e6);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= remove(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z8 = false;
        for (int i = this.f40378v - 1; i >= 0; i--) {
            if (!collection.contains(this.f40377u[i])) {
                f(i);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f40378v;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f40378v;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f40377u, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40378v * 14);
        sb.append('{');
        for (int i = 0; i < this.f40378v; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f40377u[i];
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
        if (objArr.length < this.f40378v) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f40378v);
        }
        System.arraycopy(this.f40377u, 0, objArr, 0, this.f40378v);
        int length = objArr.length;
        int i = this.f40378v;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
