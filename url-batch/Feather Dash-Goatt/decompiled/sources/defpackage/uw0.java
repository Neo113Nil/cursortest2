package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uw0 extends f0 implements Collection, zb0 {
    public j0 d;
    public Object[] e;
    public Object[] g;
    public int h;
    public j41 i = new j41(23);
    public Object[] j;
    public Object[] k;
    public int l;

    public uw0(j0 j0Var, Object[] objArr, Object[] objArr2, int i) {
        this.d = j0Var;
        this.e = objArr;
        this.g = objArr2;
        this.h = i;
        this.j = objArr;
        this.k = objArr2;
        this.l = j0Var.size();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i2, l90 l90Var) {
        int z = t80.z(i2, i);
        if (i == 0) {
            Object obj = objArr[z];
            Object[] l = l(objArr);
            w9.c(objArr, l, z, z + 1, 32);
            l[31] = l90Var.d;
            l90Var.d = obj;
            return l;
        }
        int z2 = objArr[31] == null ? t80.z(C() - 1, i) : 31;
        Object[] l2 = l(objArr);
        int i3 = i - 5;
        int i4 = z + 1;
        if (i4 <= z2) {
            while (true) {
                Object obj2 = l2[z2];
                obj2.getClass();
                l2[z2] = A((Object[]) obj2, i3, 0, l90Var);
                if (z2 == i4) {
                    break;
                }
                z2--;
            }
        }
        Object obj3 = l2[z];
        obj3.getClass();
        l2[z] = A((Object[]) obj3, i3, i2, l90Var);
        return l2;
    }

    public final Object B(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.l - i;
        Object[] objArr2 = this.k;
        if (i4 == 1) {
            Object obj = objArr2[0];
            r(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] l = l(objArr2);
        w9.c(objArr2, l, i3, i3 + 1, i4);
        l[i4 - 1] = null;
        this.j = objArr;
        this.k = l;
        this.l = (i + i4) - 1;
        this.h = i2;
        return obj2;
    }

    public final int C() {
        int i = this.l;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] D(Object[] objArr, int i, int i2, Object obj, l90 l90Var) {
        int z = t80.z(i2, i);
        Object[] l = l(objArr);
        if (i != 0) {
            Object obj2 = l[z];
            obj2.getClass();
            l[z] = D((Object[]) obj2, i - 5, i2, obj, l90Var);
            return l;
        }
        if (l != objArr) {
            ((AbstractList) this).modCount++;
        }
        l90Var.d = l[z];
        l[z] = obj;
        return l;
    }

    public final void E(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] n;
        if (i3 < 1) {
            cy0.a("requires at least one nullBuffer");
        }
        Object[] l = l(objArr);
        objArr2[0] = l;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            w9.c(l, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                n = l;
            } else {
                n = n();
                i3--;
                objArr2[i3] = n;
            }
            int i7 = i2 - i6;
            w9.c(l, objArr3, 0, i7, i2);
            w9.c(l, n, size + 1, i4, i7);
            objArr3 = n;
        }
        Iterator it = collection.iterator();
        e(l, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] n2 = n();
            e(n2, 0, it);
            objArr2[i8] = n2;
        }
        e(objArr3, 0, it);
    }

    public final int F() {
        int i = this.l;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.f0
    public final int a() {
        return this.l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        y90.k(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int C = C();
        if (i >= C) {
            i(this.j, i - C, obj);
            return;
        }
        l90 l90Var = new l90(null);
        Object[] objArr = this.j;
        objArr.getClass();
        i(h(objArr, this.h, i, obj, l90Var), 0, l90Var.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] n;
        y90.k(i, this.l);
        if (i == this.l) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.l - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.k;
            Object[] l = l(objArr);
            w9.c(objArr, l, size2 + 1, i3, F());
            e(l, i3, collection.iterator());
            this.k = l;
            this.l = collection.size() + this.l;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int F = F();
        int size3 = collection.size() + this.l;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= C()) {
            n = n();
            collection2 = collection;
            E(collection2, i, this.k, F, objArr2, size, n);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.k;
            if (size3 > F) {
                int i4 = size3 - F;
                Object[] m = m(i4, objArr3);
                g(collection2, i, i4, objArr2, size, m);
                objArr2 = objArr2;
                n = m;
            } else {
                n = n();
                int i5 = F - size3;
                w9.c(objArr3, n, 0, i5, F);
                int i6 = 32 - i5;
                Object[] m2 = m(i6, this.k);
                int i7 = size - 1;
                objArr2[i7] = m2;
                g(collection2, i, i6, objArr2, i7, m2);
                collection2 = collection2;
            }
        }
        this.j = t(this.j, i2, objArr2);
        this.k = n;
        this.l = collection2.size() + this.l;
        return true;
    }

    @Override // defpackage.f0
    public final Object b(int i) {
        y90.c(i, a());
        ((AbstractList) this).modCount++;
        int C = C();
        if (i >= C) {
            return B(this.j, C, this.h, i - C);
        }
        l90 l90Var = new l90(this.k[0]);
        Object[] objArr = this.j;
        objArr.getClass();
        B(A(objArr, this.h, i, l90Var), C, this.h, 0);
        return l90Var.d;
    }

    public final j0 d() {
        j0 tw0Var;
        Object[] objArr = this.j;
        if (objArr == this.e && this.k == this.g) {
            tw0Var = this.d;
        } else {
            this.i = new j41(23);
            this.e = objArr;
            Object[] objArr2 = this.k;
            this.g = objArr2;
            if (objArr == null) {
                tw0Var = objArr2.length == 0 ? eb1.g : new eb1(Arrays.copyOf(this.k, a()));
            } else {
                Object[] objArr3 = this.j;
                objArr3.getClass();
                tw0Var = new tw0(objArr3, this.k, a(), this.h);
            }
        }
        this.d = tw0Var;
        return tw0Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.j == null) {
            dd0.j("root is null");
            return;
        }
        int i4 = i >> 5;
        x k = k(C() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (k.d - 1 != i4) {
            Object[] objArr4 = (Object[]) k.previous();
            w9.c(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = m(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) k.previous();
        int C = i3 - (((C() >> 5) - 1) - i4);
        if (C < i3) {
            objArr2 = objArr[C];
            objArr2.getClass();
        }
        E(collection, i, objArr5, 32, objArr, C, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        y90.c(i, a());
        if (C() <= i) {
            objArr = this.k;
        } else {
            Object[] objArr2 = this.j;
            objArr2.getClass();
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[t80.z(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, l90 l90Var) {
        Object obj2;
        int z = t80.z(i2, i);
        if (i == 0) {
            l90Var.d = objArr[31];
            Object[] l = l(objArr);
            w9.c(objArr, l, z + 1, z, 31);
            l[z] = obj;
            return l;
        }
        Object[] l2 = l(objArr);
        int i3 = i - 5;
        Object obj3 = l2[z];
        obj3.getClass();
        l2[z] = h((Object[]) obj3, i3, i2, obj, l90Var);
        while (true) {
            z++;
            if (z >= 32 || (obj2 = l2[z]) == null) {
                break;
            }
            l2[z] = h((Object[]) obj2, i3, 0, l90Var.d, l90Var);
        }
        return l2;
    }

    public final void i(Object[] objArr, int i, Object obj) {
        int F = F();
        Object[] l = l(this.k);
        Object[] objArr2 = this.k;
        if (F >= 32) {
            Object obj2 = objArr2[31];
            w9.c(objArr2, l, i + 1, i, 31);
            l[i] = obj;
            u(objArr, l, o(obj2));
            return;
        }
        w9.c(objArr2, l, i + 1, i, F);
        l[i] = obj;
        this.j = objArr;
        this.k = l;
        this.l++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.i;
    }

    public final x k(int i) {
        Object[] objArr = this.j;
        if (objArr == null) {
            dd0.j("Invalid root");
            return null;
        }
        int C = C() >> 5;
        y90.k(i, C);
        int i2 = this.h;
        return i2 == 0 ? new te(i, objArr) : new nj1(objArr, i, C, i2 / 5);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] n = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        w9.e(objArr, n, 0, length, 6);
        return n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        y90.k(i, this.l);
        return new ww0(this, i);
    }

    public final Object[] m(int i, Object[] objArr) {
        if (j(objArr)) {
            w9.c(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] n = n();
        w9.c(objArr, n, i, 0, 32 - i);
        return n;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            cy0.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int z = t80.z(i, i2);
        Object obj = objArr[z];
        obj.getClass();
        Object p = p((Object[]) obj, i, i2 - 5);
        if (z < 31) {
            int i3 = z + 1;
            if (objArr[i3] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] n = n();
                w9.c(objArr, n, 0, 0, i3);
                objArr = n;
            }
        }
        if (p == objArr[z]) {
            return objArr;
        }
        Object[] l = l(objArr);
        l[z] = p;
        return l;
    }

    public final Object[] q(Object[] objArr, int i, int i2, l90 l90Var) {
        Object[] q;
        int z = t80.z(i2 - 1, i);
        if (i == 5) {
            l90Var.d = objArr[z];
            q = null;
        } else {
            Object obj = objArr[z];
            obj.getClass();
            q = q((Object[]) obj, i - 5, i2, l90Var);
        }
        if (q == null && z == 0) {
            return null;
        }
        Object[] l = l(objArr);
        l[z] = q;
        return l;
    }

    public final void r(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.j = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.k = objArr;
            this.l = i;
            this.h = i2;
            return;
        }
        l90 l90Var = new l90(null);
        objArr.getClass();
        Object[] q = q(objArr, i2, i, l90Var);
        q.getClass();
        Object obj = l90Var.d;
        obj.getClass();
        this.k = (Object[]) obj;
        this.l = i;
        if (q[1] == null) {
            this.j = (Object[]) q[0];
            this.h = i2 - 5;
        } else {
            this.j = q;
            this.h = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return z(new i0(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            cy0.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            cy0.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] l = l(objArr);
        int z = t80.z(i, i2);
        int i3 = i2 - 5;
        l[z] = s((Object[]) l[z], i, i3, it);
        while (true) {
            z++;
            if (z >= 32 || !it.hasNext()) {
                break;
            }
            l[z] = s((Object[]) l[z], 0, i3, it);
        }
        return l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        y90.c(i, a());
        if (C() > i) {
            l90 l90Var = new l90(null);
            Object[] objArr = this.j;
            objArr.getClass();
            this.j = D(objArr, this.h, i, obj, l90Var);
            return l90Var.d;
        }
        Object[] l = l(this.k);
        if (l != this.k) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = l[i2];
        l[i2] = obj;
        this.k = l;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, Object[][] objArr2) {
        t tVar = new t(objArr2);
        int i2 = i >> 5;
        int i3 = this.h;
        Object[] s = i2 < (1 << i3) ? s(objArr, i, i3, tVar) : l(objArr);
        while (tVar.hasNext()) {
            this.h += 5;
            s = o(s);
            int i4 = this.h;
            s(s, 1 << i4, i4, tVar);
        }
        return s;
    }

    public final void u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.l;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 > (1 << i3)) {
            this.j = v(this.h + 5, o(objArr), objArr2);
            this.k = objArr3;
            this.h += 5;
            this.l++;
            return;
        }
        if (objArr == null) {
            this.j = objArr2;
            this.k = objArr3;
            this.l = i + 1;
        } else {
            this.j = v(i3, objArr, objArr2);
            this.k = objArr3;
            this.l++;
        }
    }

    public final Object[] v(int i, Object[] objArr, Object[] objArr2) {
        int z = t80.z(a() - 1, i);
        Object[] l = l(objArr);
        if (i == 5) {
            l[z] = objArr2;
            return l;
        }
        l[z] = v(i - 5, (Object[]) l[z], objArr2);
        return l;
    }

    public final int w(Function1 function1, Object[] objArr, int i, int i2, l90 l90Var, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = l90Var.d;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        l90Var.d = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int x(Function1 function1, Object[] objArr, int i, l90 l90Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = l(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        l90Var.d = objArr2;
        return i2;
    }

    public final int y(Function1 function1, int i, l90 l90Var) {
        int x = x(function1, this.k, i, l90Var);
        Object obj = l90Var.d;
        if (x == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, x, i, (Object) null);
        this.k = objArr;
        this.l -= i - x;
        return x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (y(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(Function1 function1) {
        int i;
        Function1 function12 = function1;
        int F = F();
        Object[] objArr = null;
        l90 l90Var = new l90(null);
        boolean z = false;
        if (this.j != null) {
            x k = k(0);
            int i2 = 32;
            while (i2 == 32 && k.hasNext()) {
                i2 = x(function12, (Object[]) k.next(), 32, l90Var);
            }
            if (i2 == 32) {
                int y = y(function12, F, l90Var);
                if (y == 0) {
                    r(this.j, this.l, this.h);
                }
            } else {
                int i3 = (k.d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (k.hasNext()) {
                    i4 = w(function12, (Object[]) k.next(), 32, i4, l90Var, arrayList2, arrayList);
                    function12 = function1;
                }
                int w = w(function1, this.k, F, i4, l90Var, arrayList2, arrayList);
                Object obj = l90Var.d;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, w, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.j;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = s(objArr3, i3, this.h, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    cy0.a("invalid size");
                }
                if (size == 0) {
                    this.h = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.h;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.h = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = p(objArr3, i5, i);
                }
                this.j = objArr;
                this.k = objArr2;
                this.l = size + w;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int F = F();
        if (F < 32) {
            Object[] l = l(this.k);
            l[F] = obj;
            this.k = l;
            this.l = a() + 1;
        } else {
            u(this.j, this.k, o(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int F = F();
        Iterator it = collection.iterator();
        if (32 - F >= collection.size()) {
            Object[] l = l(this.k);
            e(l, F, it);
            this.k = l;
            this.l = collection.size() + this.l;
            return true;
        }
        int size = ((collection.size() + F) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] l2 = l(this.k);
        e(l2, F, it);
        objArr[0] = l2;
        for (int i = 1; i < size; i++) {
            Object[] n = n();
            e(n, 0, it);
            objArr[i] = n;
        }
        this.j = t(this.j, C(), objArr);
        Object[] n2 = n();
        e(n2, 0, it);
        this.k = n2;
        this.l = collection.size() + this.l;
        return true;
    }
}
