package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f12 extends s0 implements Collection, l71 {
    public w0 m;
    public Object[] n;
    public Object[] o;
    public int p;
    public nm1 q = new nm1(1);
    public Object[] r;
    public Object[] s;
    public int t;

    public f12(w0 w0Var, Object[] objArr, Object[] objArr2, int i) {
        this.m = w0Var;
        this.n = objArr;
        this.o = objArr2;
        this.p = i;
        this.r = objArr;
        this.s = objArr2;
        this.t = w0Var.size();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (z(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(Function1 function1) {
        int i;
        Function1 function12 = function1;
        int G = G();
        Object[] objArr = null;
        j31 j31Var = new j31(null);
        boolean z = false;
        if (this.r != null) {
            l0 l = l(0);
            int i2 = 32;
            while (i2 == 32 && l.hasNext()) {
                i2 = y(function12, (Object[]) l.next(), 32, j31Var);
            }
            if (i2 == 32) {
                int z2 = z(function12, G, j31Var);
                if (z2 == 0) {
                    s(this.r, this.t, this.p);
                }
            } else {
                int i3 = (l.m - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (l.hasNext()) {
                    i4 = x(function12, (Object[]) l.next(), 32, i4, j31Var, arrayList2, arrayList);
                    function12 = function1;
                }
                int x = x(function1, this.s, G, i4, j31Var, arrayList2, arrayList);
                Object obj = j31Var.m;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, x, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.r;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = t(objArr3, i3, this.p, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    v32.a("invalid size");
                }
                if (size == 0) {
                    this.p = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.p;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.p = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = q(objArr3, i5, i);
                }
                this.r = objArr;
                this.s = objArr2;
                this.t = size + x;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] B(Object[] objArr, int i, int i2, j31 j31Var) {
        int e = gk2.e(i2, i);
        if (i == 0) {
            Object obj = objArr[e];
            Object[] m = m(objArr);
            ni.e(e, e + 1, 32, objArr, m);
            m[31] = j31Var.m;
            j31Var.m = obj;
            return m;
        }
        int e2 = objArr[31] == null ? gk2.e(D() - 1, i) : 31;
        Object[] m2 = m(objArr);
        int i3 = i - 5;
        int i4 = e + 1;
        if (i4 <= e2) {
            while (true) {
                Object obj2 = m2[e2];
                obj2.getClass();
                m2[e2] = B((Object[]) obj2, i3, 0, j31Var);
                if (e2 == i4) {
                    break;
                }
                e2--;
            }
        }
        Object obj3 = m2[e];
        obj3.getClass();
        m2[e] = B((Object[]) obj3, i3, i2, j31Var);
        return m2;
    }

    public final Object C(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.t - i;
        Object[] objArr2 = this.s;
        if (i4 == 1) {
            Object obj = objArr2[0];
            s(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] m = m(objArr2);
        ni.e(i3, i3 + 1, i4, objArr2, m);
        m[i4 - 1] = null;
        this.r = objArr;
        this.s = m;
        this.t = (i + i4) - 1;
        this.p = i2;
        return obj2;
    }

    public final int D() {
        int i = this.t;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] E(Object[] objArr, int i, int i2, Object obj, j31 j31Var) {
        int e = gk2.e(i2, i);
        Object[] m = m(objArr);
        if (i != 0) {
            Object obj2 = m[e];
            obj2.getClass();
            m[e] = E((Object[]) obj2, i - 5, i2, obj, j31Var);
            return m;
        }
        if (m != objArr) {
            ((AbstractList) this).modCount++;
        }
        j31Var.m = m[e];
        m[e] = obj;
        return m;
    }

    public final void F(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] o;
        if (i3 < 1) {
            v32.a("requires at least one nullBuffer");
        }
        Object[] m = m(objArr);
        objArr2[0] = m;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ni.e(size + 1, i4, i2, m, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                o = m;
            } else {
                o = o();
                i3--;
                objArr2[i3] = o;
            }
            int i7 = i2 - i6;
            ni.e(0, i7, i2, m, objArr3);
            ni.e(size + 1, i4, i7, m, o);
            objArr3 = o;
        }
        Iterator it = collection.iterator();
        d(m, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] o2 = o();
            d(o2, 0, it);
            objArr2[i8] = o2;
        }
        d(objArr3, 0, it);
    }

    public final int G() {
        int i = this.t;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.s0
    public final int a() {
        return this.t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        yj1.n(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int D = D();
        if (i >= D) {
            j(i - D, obj, this.r);
            return;
        }
        j31 j31Var = new j31(null);
        Object[] objArr = this.r;
        objArr.getClass();
        j(0, j31Var.m, g(objArr, this.p, i, obj, j31Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] o;
        yj1.n(i, this.t);
        if (i == this.t) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.t - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.s;
            Object[] m = m(objArr);
            ni.e(size2 + 1, i3, G(), objArr, m);
            d(m, i3, collection.iterator());
            this.s = m;
            this.t = collection.size() + this.t;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int G = G();
        int size3 = collection.size() + this.t;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= D()) {
            o = o();
            collection2 = collection;
            F(collection2, i, this.s, G, objArr2, size, o);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.s;
            if (size3 > G) {
                int i4 = size3 - G;
                Object[] n = n(i4, objArr3);
                f(collection2, i, i4, objArr2, size, n);
                objArr2 = objArr2;
                o = n;
            } else {
                o = o();
                int i5 = G - size3;
                ni.e(0, i5, G, objArr3, o);
                int i6 = 32 - i5;
                Object[] n2 = n(i6, this.s);
                int i7 = size - 1;
                objArr2[i7] = n2;
                f(collection2, i, i6, objArr2, i7, n2);
                collection2 = collection2;
            }
        }
        this.r = u(this.r, i2, objArr2);
        this.s = o;
        this.t = collection2.size() + this.t;
        return true;
    }

    @Override // defpackage.s0
    public final Object b(int i) {
        yj1.m(i, a());
        ((AbstractList) this).modCount++;
        int D = D();
        if (i >= D) {
            return C(this.r, D, this.p, i - D);
        }
        j31 j31Var = new j31(this.s[0]);
        Object[] objArr = this.r;
        objArr.getClass();
        C(B(objArr, this.p, i, j31Var), D, this.p, 0);
        return j31Var.m;
    }

    public final w0 c() {
        w0 e12Var;
        Object[] objArr = this.r;
        if (objArr == this.n && this.s == this.o) {
            e12Var = this.m;
        } else {
            this.q = new nm1(1);
            this.n = objArr;
            Object[] objArr2 = this.s;
            this.o = objArr2;
            if (objArr == null) {
                e12Var = objArr2.length == 0 ? am2.o : new am2(Arrays.copyOf(this.s, a()));
            } else {
                Object[] objArr3 = this.r;
                objArr3.getClass();
                e12Var = new e12(objArr3, this.s, a(), this.p);
            }
        }
        this.m = e12Var;
        return e12Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.r == null) {
            lh.g("root is null");
            return;
        }
        int i4 = i >> 5;
        l0 l = l(D() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (l.m - 1 != i4) {
            Object[] objArr4 = (Object[]) l.previous();
            ni.e(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = n(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) l.previous();
        int D = i3 - (((D() >> 5) - 1) - i4);
        if (D < i3) {
            objArr2 = objArr[D];
            objArr2.getClass();
        }
        F(collection, i, objArr5, 32, objArr, D, objArr2);
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, j31 j31Var) {
        Object obj2;
        int e = gk2.e(i2, i);
        if (i == 0) {
            j31Var.m = objArr[31];
            Object[] m = m(objArr);
            ni.e(e + 1, e, 31, objArr, m);
            m[e] = obj;
            return m;
        }
        Object[] m2 = m(objArr);
        int i3 = i - 5;
        Object obj3 = m2[e];
        obj3.getClass();
        m2[e] = g((Object[]) obj3, i3, i2, obj, j31Var);
        while (true) {
            e++;
            if (e >= 32 || (obj2 = m2[e]) == null) {
                break;
            }
            m2[e] = g((Object[]) obj2, i3, 0, j31Var.m, j31Var);
        }
        return m2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        yj1.m(i, a());
        if (D() <= i) {
            objArr = this.s;
        } else {
            Object[] objArr2 = this.r;
            objArr2.getClass();
            for (int i2 = this.p; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[gk2.e(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj, Object[] objArr) {
        int G = G();
        Object[] m = m(this.s);
        Object[] objArr2 = this.s;
        if (G >= 32) {
            Object obj2 = objArr2[31];
            ni.e(i + 1, i, 31, objArr2, m);
            m[i] = obj;
            v(objArr, m, p(obj2));
            return;
        }
        ni.e(i + 1, i, G, objArr2, m);
        m[i] = obj;
        this.r = objArr;
        this.s = m;
        this.t++;
    }

    public final boolean k(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.q;
    }

    public final l0 l(int i) {
        Object[] objArr = this.r;
        if (objArr == null) {
            lh.g("Invalid root");
            return null;
        }
        int D = D() >> 5;
        yj1.n(i, D);
        int i2 = this.p;
        return i2 == 0 ? new gq(i, objArr) : new tz2(objArr, i, D, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        yj1.n(i, this.t);
        return new h12(this, i);
    }

    public final Object[] m(Object[] objArr) {
        if (objArr == null) {
            return o();
        }
        if (k(objArr)) {
            return objArr;
        }
        Object[] o = o();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ni.i(0, length, 6, objArr, o);
        return o;
    }

    public final Object[] n(int i, Object[] objArr) {
        if (k(objArr)) {
            ni.e(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] o = o();
        ni.e(i, 0, 32 - i, objArr, o);
        return o;
    }

    public final Object[] o() {
        Object[] objArr = new Object[33];
        objArr[32] = this.q;
        return objArr;
    }

    public final Object[] p(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.q;
        return objArr;
    }

    public final Object[] q(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            v32.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int e = gk2.e(i, i2);
        Object obj = objArr[e];
        obj.getClass();
        Object q = q((Object[]) obj, i, i2 - 5);
        if (e < 31) {
            int i3 = e + 1;
            if (objArr[i3] != null) {
                if (k(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] o = o();
                ni.e(0, 0, i3, objArr, o);
                objArr = o;
            }
        }
        if (q == objArr[e]) {
            return objArr;
        }
        Object[] m = m(objArr);
        m[e] = q;
        return m;
    }

    public final Object[] r(Object[] objArr, int i, int i2, j31 j31Var) {
        Object[] r;
        int e = gk2.e(i2 - 1, i);
        if (i == 5) {
            j31Var.m = objArr[e];
            r = null;
        } else {
            Object obj = objArr[e];
            obj.getClass();
            r = r((Object[]) obj, i - 5, i2, j31Var);
        }
        if (r == null && e == 0) {
            return null;
        }
        Object[] m = m(objArr);
        m[e] = r;
        return m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return A(new v0(1, collection));
    }

    public final void s(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.r = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.s = objArr;
            this.t = i;
            this.p = i2;
            return;
        }
        j31 j31Var = new j31(null);
        objArr.getClass();
        Object[] r = r(objArr, i2, i, j31Var);
        r.getClass();
        Object obj = j31Var.m;
        obj.getClass();
        this.s = (Object[]) obj;
        this.t = i;
        if (r[1] == null) {
            this.r = (Object[]) r[0];
            this.p = i2 - 5;
        } else {
            this.r = r;
            this.p = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        yj1.m(i, a());
        if (D() > i) {
            j31 j31Var = new j31(null);
            Object[] objArr = this.r;
            objArr.getClass();
            this.r = E(objArr, this.p, i, obj, j31Var);
            return j31Var.m;
        }
        Object[] m = m(this.s);
        if (m != this.s) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = m[i2];
        m[i2] = obj;
        this.s = m;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            v32.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            v32.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] m = m(objArr);
        int e = gk2.e(i, i2);
        int i3 = i2 - 5;
        m[e] = t((Object[]) m[e], i, i3, it);
        while (true) {
            e++;
            if (e >= 32 || !it.hasNext()) {
                break;
            }
            m[e] = t((Object[]) m[e], 0, i3, it);
        }
        return m;
    }

    public final Object[] u(Object[] objArr, int i, Object[][] objArr2) {
        i0 i0Var = new i0(objArr2);
        int i2 = i >> 5;
        int i3 = this.p;
        Object[] t = i2 < (1 << i3) ? t(objArr, i, i3, i0Var) : m(objArr);
        while (i0Var.hasNext()) {
            this.p += 5;
            t = p(t);
            int i4 = this.p;
            t(t, 1 << i4, i4, i0Var);
        }
        return t;
    }

    public final void v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.t;
        int i2 = i >> 5;
        int i3 = this.p;
        if (i2 > (1 << i3)) {
            this.r = w(this.p + 5, p(objArr), objArr2);
            this.s = objArr3;
            this.p += 5;
            this.t++;
            return;
        }
        if (objArr == null) {
            this.r = objArr2;
            this.s = objArr3;
            this.t = i + 1;
        } else {
            this.r = w(i3, objArr, objArr2);
            this.s = objArr3;
            this.t++;
        }
    }

    public final Object[] w(int i, Object[] objArr, Object[] objArr2) {
        int e = gk2.e(a() - 1, i);
        Object[] m = m(objArr);
        if (i == 5) {
            m[e] = objArr2;
            return m;
        }
        m[e] = w(i - 5, (Object[]) m[e], objArr2);
        return m;
    }

    public final int x(Function1 function1, Object[] objArr, int i, int i2, j31 j31Var, ArrayList arrayList, ArrayList arrayList2) {
        if (k(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = j31Var.m;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : o();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        j31Var.m = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int y(Function1 function1, Object[] objArr, int i, j31 j31Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = m(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        j31Var.m = objArr2;
        return i2;
    }

    public final int z(Function1 function1, int i, j31 j31Var) {
        int y = y(function1, this.s, i, j31Var);
        Object obj = j31Var.m;
        if (y == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, y, i, (Object) null);
        this.s = objArr;
        this.t -= i - y;
        return y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int G = G();
        if (G < 32) {
            Object[] m = m(this.s);
            m[G] = obj;
            this.s = m;
            this.t = a() + 1;
        } else {
            v(this.r, this.s, p(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int G = G();
        Iterator it = collection.iterator();
        if (32 - G >= collection.size()) {
            Object[] m = m(this.s);
            d(m, G, it);
            this.s = m;
            this.t = collection.size() + this.t;
            return true;
        }
        int size = ((collection.size() + G) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] m2 = m(this.s);
        d(m2, G, it);
        objArr[0] = m2;
        for (int i = 1; i < size; i++) {
            Object[] o = o();
            d(o, 0, it);
            objArr[i] = o;
        }
        this.r = u(this.r, D(), objArr);
        Object[] o2 = o();
        d(o2, 0, it);
        this.s = o2;
        this.t = collection.size() + this.t;
        return true;
    }
}
