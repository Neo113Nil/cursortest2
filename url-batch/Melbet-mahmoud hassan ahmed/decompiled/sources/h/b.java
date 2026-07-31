package h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f16686j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    private static final Object[] f16687k = new Object[0];

    /* renamed from: l, reason: collision with root package name */
    private static Object[] f16688l;

    /* renamed from: m, reason: collision with root package name */
    private static int f16689m;

    /* renamed from: n, reason: collision with root package name */
    private static Object[] f16690n;

    /* renamed from: o, reason: collision with root package name */
    private static int f16691o;

    /* renamed from: f, reason: collision with root package name */
    private int[] f16692f;

    /* renamed from: g, reason: collision with root package name */
    Object[] f16693g;

    /* renamed from: h, reason: collision with root package name */
    int f16694h;

    /* renamed from: i, reason: collision with root package name */
    private d<E, E> f16695i;

    class a extends d<E, E> {
        a() {
        }

        @Override // h.d
        protected void a() {
            b.this.clear();
        }

        @Override // h.d
        protected Object b(int i7, int i8) {
            return b.this.f16693g[i7];
        }

        @Override // h.d
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // h.d
        protected int d() {
            return b.this.f16694h;
        }

        @Override // h.d
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // h.d
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // h.d
        protected void g(E e7, E e8) {
            b.this.add(e7);
        }

        @Override // h.d
        protected void h(int i7) {
            b.this.o(i7);
        }

        @Override // h.d
        protected E i(int i7, E e7) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i7) {
        if (i7 == 0) {
            this.f16692f = f16686j;
            this.f16693g = f16687k;
        } else {
            i(i7);
        }
        this.f16694h = 0;
    }

    private void i(int i7) {
        if (i7 == 8) {
            synchronized (b.class) {
                Object[] objArr = f16690n;
                if (objArr != null) {
                    this.f16693g = objArr;
                    f16690n = (Object[]) objArr[0];
                    this.f16692f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f16691o--;
                    return;
                }
            }
        } else if (i7 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f16688l;
                if (objArr2 != null) {
                    this.f16693g = objArr2;
                    f16688l = (Object[]) objArr2[0];
                    this.f16692f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f16689m--;
                    return;
                }
            }
        }
        this.f16692f = new int[i7];
        this.f16693g = new Object[i7];
    }

    private static void k(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f16691o < 10) {
                    objArr[0] = f16690n;
                    objArr[1] = iArr;
                    for (int i8 = i7 - 1; i8 >= 2; i8--) {
                        objArr[i8] = null;
                    }
                    f16690n = objArr;
                    f16691o++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f16689m < 10) {
                    objArr[0] = f16688l;
                    objArr[1] = iArr;
                    for (int i9 = i7 - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    f16688l = objArr;
                    f16689m++;
                }
            }
        }
    }

    private d<E, E> l() {
        if (this.f16695i == null) {
            this.f16695i = new a();
        }
        return this.f16695i;
    }

    private int m(Object obj, int i7) {
        int i8 = this.f16694h;
        if (i8 == 0) {
            return -1;
        }
        int a7 = c.a(this.f16692f, i8, i7);
        if (a7 < 0 || obj.equals(this.f16693g[a7])) {
            return a7;
        }
        int i9 = a7 + 1;
        while (i9 < i8 && this.f16692f[i9] == i7) {
            if (obj.equals(this.f16693g[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a7 - 1; i10 >= 0 && this.f16692f[i10] == i7; i10--) {
            if (obj.equals(this.f16693g[i10])) {
                return i10;
            }
        }
        return i9 ^ (-1);
    }

    private int n() {
        int i7 = this.f16694h;
        if (i7 == 0) {
            return -1;
        }
        int a7 = c.a(this.f16692f, i7, 0);
        if (a7 < 0 || this.f16693g[a7] == null) {
            return a7;
        }
        int i8 = a7 + 1;
        while (i8 < i7 && this.f16692f[i8] == 0) {
            if (this.f16693g[i8] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a7 - 1; i9 >= 0 && this.f16692f[i9] == 0; i9--) {
            if (this.f16693g[i9] == null) {
                return i9;
            }
        }
        return i8 ^ (-1);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e7) {
        int i7;
        int m7;
        if (e7 == null) {
            m7 = n();
            i7 = 0;
        } else {
            int hashCode = e7.hashCode();
            i7 = hashCode;
            m7 = m(e7, hashCode);
        }
        if (m7 >= 0) {
            return false;
        }
        int i8 = m7 ^ (-1);
        int i9 = this.f16694h;
        int[] iArr = this.f16692f;
        if (i9 >= iArr.length) {
            int i10 = 4;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 >= 4) {
                i10 = 8;
            }
            Object[] objArr = this.f16693g;
            i(i10);
            int[] iArr2 = this.f16692f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f16693g, 0, objArr.length);
            }
            k(iArr, objArr, this.f16694h);
        }
        int i11 = this.f16694h;
        if (i8 < i11) {
            int[] iArr3 = this.f16692f;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr2 = this.f16693g;
            System.arraycopy(objArr2, i8, objArr2, i12, this.f16694h - i8);
        }
        this.f16692f[i8] = i7;
        this.f16693g[i8] = e7;
        this.f16694h++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        j(this.f16694h + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= add(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i7 = this.f16694h;
        if (i7 != 0) {
            k(this.f16692f, this.f16693g, i7);
            this.f16692f = f16686j;
            this.f16693g = f16687k;
            this.f16694h = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f16694h; i7++) {
                try {
                    if (!set.contains(p(i7))) {
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
    public int hashCode() {
        int[] iArr = this.f16692f;
        int i7 = this.f16694h;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    public int indexOf(Object obj) {
        return obj == null ? n() : m(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f16694h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return l().m().iterator();
    }

    public void j(int i7) {
        int[] iArr = this.f16692f;
        if (iArr.length < i7) {
            Object[] objArr = this.f16693g;
            i(i7);
            int i8 = this.f16694h;
            if (i8 > 0) {
                System.arraycopy(iArr, 0, this.f16692f, 0, i8);
                System.arraycopy(objArr, 0, this.f16693g, 0, this.f16694h);
            }
            k(iArr, objArr, this.f16694h);
        }
    }

    public E o(int i7) {
        Object[] objArr = this.f16693g;
        E e7 = (E) objArr[i7];
        int i8 = this.f16694h;
        if (i8 <= 1) {
            k(this.f16692f, objArr, i8);
            this.f16692f = f16686j;
            this.f16693g = f16687k;
            this.f16694h = 0;
        } else {
            int[] iArr = this.f16692f;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                int i9 = i8 - 1;
                this.f16694h = i9;
                if (i7 < i9) {
                    int i10 = i7 + 1;
                    System.arraycopy(iArr, i10, iArr, i7, i9 - i7);
                    Object[] objArr2 = this.f16693g;
                    System.arraycopy(objArr2, i10, objArr2, i7, this.f16694h - i7);
                }
                this.f16693g[this.f16694h] = null;
            } else {
                i(i8 > 8 ? i8 + (i8 >> 1) : 8);
                this.f16694h--;
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f16692f, 0, i7);
                    System.arraycopy(objArr, 0, this.f16693g, 0, i7);
                }
                int i11 = this.f16694h;
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    System.arraycopy(iArr, i12, this.f16692f, i7, i11 - i7);
                    System.arraycopy(objArr, i12, this.f16693g, i7, this.f16694h - i7);
                }
            }
        }
        return e7;
    }

    public E p(int i7) {
        return (E) this.f16693g[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        o(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= remove(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z6 = false;
        for (int i7 = this.f16694h - 1; i7 >= 0; i7--) {
            if (!collection.contains(this.f16693g[i7])) {
                o(i7);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f16694h;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i7 = this.f16694h;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.f16693g, 0, objArr, 0, i7);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f16694h) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f16694h));
        }
        System.arraycopy(this.f16693g, 0, tArr, 0, this.f16694h);
        int length = tArr.length;
        int i7 = this.f16694h;
        if (length > i7) {
            tArr[i7] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16694h * 14);
        sb.append('{');
        for (int i7 = 0; i7 < this.f16694h; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            E p7 = p(i7);
            if (p7 != this) {
                sb.append(p7);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
