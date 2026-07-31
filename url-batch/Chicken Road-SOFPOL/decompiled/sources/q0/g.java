package q0;

import d6.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m0.p1;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends d6.g implements Collection, r6.b {

    /* renamed from: d, reason: collision with root package name */
    public c f5943d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f5944e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f5945f;

    /* renamed from: g, reason: collision with root package name */
    public int f5946g;

    /* renamed from: h, reason: collision with root package name */
    public t0.b f5947h = new t0.b();
    public Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f5948j;

    /* renamed from: k, reason: collision with root package name */
    public int f5949k;

    public g(c cVar, Object[] objArr, Object[] objArr2, int i) {
        this.f5943d = cVar;
        this.f5944e = objArr;
        this.f5945f = objArr2;
        this.f5946g = i;
        this.i = objArr;
        this.f5948j = objArr2;
        this.f5949k = cVar.a();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i8, e eVar) {
        int F = m.a.F(i8, i);
        if (i == 0) {
            Object obj = objArr[F];
            Object[] l3 = l(objArr);
            l.H(objArr, l3, F, F + 1, 32);
            l3[31] = eVar.f5938a;
            eVar.f5938a = obj;
            return l3;
        }
        int F2 = objArr[31] == null ? m.a.F(C() - 1, i) : 31;
        Object[] l7 = l(objArr);
        int i9 = i - 5;
        int i10 = F + 1;
        if (i10 <= F2) {
            while (true) {
                Object obj2 = l7[F2];
                q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                l7[F2] = A((Object[]) obj2, i9, 0, eVar);
                if (F2 == i10) {
                    break;
                }
                F2--;
            }
        }
        Object obj3 = l7[F];
        q6.i.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        l7[F] = A((Object[]) obj3, i9, i8, eVar);
        return l7;
    }

    public final Object B(Object[] objArr, int i, int i8, int i9) {
        int i10 = this.f5949k - i;
        if (i10 == 1) {
            Object obj = this.f5948j[0];
            r(objArr, i, i8);
            return obj;
        }
        Object[] objArr2 = this.f5948j;
        Object obj2 = objArr2[i9];
        Object[] l3 = l(objArr2);
        l.H(objArr2, l3, i9, i9 + 1, i10);
        l3[i10 - 1] = null;
        this.i = objArr;
        this.f5948j = l3;
        this.f5949k = (i + i10) - 1;
        this.f5946g = i8;
        return obj2;
    }

    public final int C() {
        int i = this.f5949k;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] D(Object[] objArr, int i, int i8, Object obj, e eVar) {
        int F = m.a.F(i8, i);
        Object[] l3 = l(objArr);
        if (i != 0) {
            Object obj2 = l3[F];
            q6.i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            l3[F] = D((Object[]) obj2, i - 5, i8, obj, eVar);
            return l3;
        }
        if (l3 != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f5938a = l3[F];
        l3[F] = obj;
        return l3;
    }

    public final void E(Collection collection, int i, Object[] objArr, int i8, Object[][] objArr2, int i9, Object[] objArr3) {
        Object[] n6;
        if (i9 < 1) {
            p1.a("requires at least one nullBuffer");
        }
        Object[] l3 = l(objArr);
        objArr2[0] = l3;
        int i10 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i11 = (i8 - i10) + size;
        if (i11 < 32) {
            l.H(l3, objArr3, size + 1, i10, i8);
        } else {
            int i12 = i11 - 31;
            if (i9 == 1) {
                n6 = l3;
            } else {
                n6 = n();
                i9--;
                objArr2[i9] = n6;
            }
            int i13 = i8 - i12;
            l.H(l3, objArr3, 0, i13, i8);
            l.H(l3, n6, size + 1, i10, i13);
            objArr3 = n6;
        }
        Iterator it = collection.iterator();
        e(l3, i10, it);
        for (int i14 = 1; i14 < i9; i14++) {
            Object[] n7 = n();
            e(n7, 0, it);
            objArr2[i14] = n7;
        }
        e(objArr3, 0, it);
    }

    public final int F() {
        int i = this.f5949k;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // d6.g
    public final int a() {
        return this.f5949k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        r.m(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int C = C();
        if (i >= C) {
            i(this.i, i - C, obj);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.i;
        q6.i.b(objArr);
        i(h(objArr, this.f5946g, i, obj, eVar), 0, eVar.f5938a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        g gVar;
        Object[] n6;
        r.m(i, this.f5949k);
        if (i == this.f5949k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i8 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f5949k - i8)) - 1) / 32;
        if (size == 0) {
            int i9 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f5948j;
            Object[] l3 = l(objArr);
            l.H(objArr, l3, size2 + 1, i9, F());
            e(l3, i9, collection.iterator());
            this.f5948j = l3;
            this.f5949k = collection.size() + this.f5949k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int F = F();
        int size3 = collection.size() + this.f5949k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= C()) {
            n6 = n();
            collection2 = collection;
            E(collection2, i, this.f5948j, F, objArr2, size, n6);
            gVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            gVar = this;
            if (size3 > F) {
                int i10 = size3 - F;
                Object[] m7 = m(i10, gVar.f5948j);
                gVar.g(collection2, i, i10, objArr2, size, m7);
                objArr2 = objArr2;
                n6 = m7;
            } else {
                Object[] objArr3 = gVar.f5948j;
                n6 = n();
                int i11 = F - size3;
                l.H(objArr3, n6, 0, i11, F);
                int i12 = 32 - i11;
                Object[] m8 = m(i12, gVar.f5948j);
                int i13 = size - 1;
                objArr2[i13] = m8;
                gVar.g(collection2, i, i12, objArr2, i13, m8);
                collection2 = collection2;
            }
        }
        gVar.i = t(gVar.i, i8, objArr2);
        gVar.f5948j = n6;
        gVar.f5949k = collection2.size() + gVar.f5949k;
        return true;
    }

    @Override // d6.g
    public final Object b(int i) {
        r.l(i, a());
        ((AbstractList) this).modCount++;
        int C = C();
        if (i >= C) {
            return B(this.i, C, this.f5946g, i - C);
        }
        e eVar = new e(this.f5948j[0]);
        Object[] objArr = this.i;
        q6.i.b(objArr);
        B(A(objArr, this.f5946g, i, eVar), C, this.f5946g, 0);
        return eVar.f5938a;
    }

    public final c c() {
        c fVar;
        Object[] objArr = this.i;
        if (objArr == this.f5944e && this.f5948j == this.f5945f) {
            fVar = this.f5943d;
        } else {
            this.f5947h = new t0.b();
            this.f5944e = objArr;
            Object[] objArr2 = this.f5948j;
            this.f5945f = objArr2;
            if (objArr != null) {
                fVar = new f(objArr, objArr2, this.f5949k, this.f5946g);
            } else if (objArr2.length == 0) {
                fVar = j.f5955e;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, this.f5949k);
                q6.i.d(copyOf, "copyOf(...)");
                fVar = new j(copyOf);
            }
        }
        this.f5943d = fVar;
        return fVar;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i, int i8, Object[][] objArr, int i9, Object[] objArr2) {
        if (this.i == null) {
            throw new IllegalStateException("root is null");
        }
        int i10 = i >> 5;
        a k3 = k(C() >> 5);
        int i11 = i9;
        Object[] objArr3 = objArr2;
        while (k3.f5931d - 1 != i10) {
            Object[] objArr4 = (Object[]) k3.previous();
            l.H(objArr4, objArr3, 0, 32 - i8, 32);
            objArr3 = m(i8, objArr4);
            i11--;
            objArr[i11] = objArr3;
        }
        Object[] objArr5 = (Object[]) k3.previous();
        int C = i9 - (((C() >> 5) - 1) - i10);
        if (C < i9) {
            objArr2 = objArr[C];
            q6.i.b(objArr2);
        }
        E(collection, i, objArr5, 32, objArr, C, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        r.l(i, a());
        if (C() <= i) {
            objArr = this.f5948j;
        } else {
            objArr = this.i;
            q6.i.b(objArr);
            for (int i8 = this.f5946g; i8 > 0; i8 -= 5) {
                Object obj = objArr[m.a.F(i, i8)];
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i8, Object obj, e eVar) {
        Object obj2;
        int F = m.a.F(i8, i);
        if (i == 0) {
            eVar.f5938a = objArr[31];
            Object[] l3 = l(objArr);
            l.H(objArr, l3, F + 1, F, 31);
            l3[F] = obj;
            return l3;
        }
        Object[] l7 = l(objArr);
        int i9 = i - 5;
        Object obj3 = l7[F];
        q6.i.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        l7[F] = h((Object[]) obj3, i9, i8, obj, eVar);
        while (true) {
            F++;
            if (F >= 32 || (obj2 = l7[F]) == null) {
                break;
            }
            l7[F] = h((Object[]) obj2, i9, 0, eVar.f5938a, eVar);
        }
        return l7;
    }

    public final void i(Object[] objArr, int i, Object obj) {
        int F = F();
        Object[] l3 = l(this.f5948j);
        if (F < 32) {
            l.H(this.f5948j, l3, i + 1, i, F);
            l3[i] = obj;
            this.i = objArr;
            this.f5948j = l3;
            this.f5949k++;
            return;
        }
        Object[] objArr2 = this.f5948j;
        Object obj2 = objArr2[31];
        l.H(objArr2, l3, i + 1, i, 31);
        l3[i] = obj;
        u(objArr, l3, o(obj2));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f5947h;
    }

    public final a k(int i) {
        Object[] objArr = this.i;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int C = C() >> 5;
        r.m(i, C);
        int i8 = this.f5946g;
        return i8 == 0 ? new d(i, objArr) : new k(objArr, i, C, i8 / 5);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] n6 = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        l.J(objArr, n6, 0, length, 6);
        return n6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        r.m(i, this.f5949k);
        return new i(this, i);
    }

    public final Object[] m(int i, Object[] objArr) {
        if (j(objArr)) {
            l.H(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] n6 = n();
        l.H(objArr, n6, i, 0, 32 - i);
        return n6;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f5947h;
        return objArr;
    }

    public final Object[] o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f5947h;
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i, int i8) {
        if (i8 < 0) {
            p1.a("shift should be positive");
        }
        if (i8 == 0) {
            return objArr;
        }
        int F = m.a.F(i, i8);
        Object obj = objArr[F];
        q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object p7 = p((Object[]) obj, i, i8 - 5);
        if (F < 31) {
            int i9 = F + 1;
            if (objArr[i9] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i9, 32, (Object) null);
                }
                Object[] n6 = n();
                l.H(objArr, n6, 0, 0, i9);
                objArr = n6;
            }
        }
        if (p7 == objArr[F]) {
            return objArr;
        }
        Object[] l3 = l(objArr);
        l3[F] = p7;
        return l3;
    }

    public final Object[] q(Object[] objArr, int i, int i8, e eVar) {
        Object[] q4;
        int F = m.a.F(i8 - 1, i);
        if (i == 5) {
            eVar.f5938a = objArr[F];
            q4 = null;
        } else {
            Object obj = objArr[F];
            q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            q4 = q((Object[]) obj, i - 5, i8, eVar);
        }
        if (q4 == null && F == 0) {
            return null;
        }
        Object[] l3 = l(objArr);
        l3[F] = q4;
        return l3;
    }

    public final void r(Object[] objArr, int i, int i8) {
        if (i8 == 0) {
            this.i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f5948j = objArr;
            this.f5949k = i;
            this.f5946g = i8;
            return;
        }
        e eVar = new e(null);
        q6.i.b(objArr);
        Object[] q4 = q(objArr, i8, i, eVar);
        q6.i.b(q4);
        Object obj = eVar.f5938a;
        q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f5948j = (Object[]) obj;
        this.f5949k = i;
        if (q4[1] == null) {
            this.i = (Object[]) q4[0];
            this.f5946g = i8 - 5;
        } else {
            this.i = q4;
            this.f5946g = i8;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return z(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i8, Iterator it) {
        if (!it.hasNext()) {
            p1.a("invalid buffersIterator");
        }
        if (!(i8 >= 0)) {
            p1.a("negative shift");
        }
        if (i8 == 0) {
            return (Object[]) it.next();
        }
        Object[] l3 = l(objArr);
        int F = m.a.F(i, i8);
        int i9 = i8 - 5;
        l3[F] = s((Object[]) l3[F], i, i9, it);
        while (true) {
            F++;
            if (F >= 32 || !it.hasNext()) {
                break;
            }
            l3[F] = s((Object[]) l3[F], 0, i9, it);
        }
        return l3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        r.l(i, a());
        if (C() > i) {
            e eVar = new e(null);
            Object[] objArr = this.i;
            q6.i.b(objArr);
            this.i = D(objArr, this.f5946g, i, obj, eVar);
            return eVar.f5938a;
        }
        Object[] l3 = l(this.f5948j);
        if (l3 != this.f5948j) {
            ((AbstractList) this).modCount++;
        }
        int i8 = i & 31;
        Object obj2 = l3[i8];
        l3[i8] = obj;
        this.f5948j = l3;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, Object[][] objArr2) {
        d6.b h8 = q6.i.h(objArr2);
        int i8 = i >> 5;
        int i9 = this.f5946g;
        Object[] s5 = i8 < (1 << i9) ? s(objArr, i, i9, h8) : l(objArr);
        while (h8.hasNext()) {
            this.f5946g += 5;
            s5 = o(s5);
            int i10 = this.f5946g;
            s(s5, 1 << i10, i10, h8);
        }
        return s5;
    }

    public final void u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f5949k;
        int i8 = i >> 5;
        int i9 = this.f5946g;
        if (i8 > (1 << i9)) {
            this.i = v(this.f5946g + 5, o(objArr), objArr2);
            this.f5948j = objArr3;
            this.f5946g += 5;
            this.f5949k++;
            return;
        }
        if (objArr == null) {
            this.i = objArr2;
            this.f5948j = objArr3;
            this.f5949k = i + 1;
        } else {
            this.i = v(i9, objArr, objArr2);
            this.f5948j = objArr3;
            this.f5949k++;
        }
    }

    public final Object[] v(int i, Object[] objArr, Object[] objArr2) {
        int F = m.a.F(a() - 1, i);
        Object[] l3 = l(objArr);
        if (i == 5) {
            l3[F] = objArr2;
            return l3;
        }
        l3[F] = v(i - 5, (Object[]) l3[F], objArr2);
        return l3;
    }

    public final int w(p6.c cVar, Object[] objArr, int i, int i8, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f5938a;
        q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj2 = objArr[i9];
            if (!((Boolean) cVar.i(obj2)).booleanValue()) {
                if (i8 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i8 = 0;
                }
                objArr3[i8] = obj2;
                i8++;
            }
        }
        eVar.f5938a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i8;
    }

    public final int x(p6.c cVar, Object[] objArr, int i, e eVar) {
        Object[] objArr2 = objArr;
        int i8 = i;
        boolean z3 = false;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            if (((Boolean) cVar.i(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = l(objArr);
                    z3 = true;
                    i8 = i9;
                }
            } else if (z3) {
                objArr2[i8] = obj;
                i8++;
            }
        }
        eVar.f5938a = objArr2;
        return i8;
    }

    public final int y(p6.c cVar, int i, e eVar) {
        int x7 = x(cVar, this.f5948j, i, eVar);
        if (x7 == i) {
            return i;
        }
        Object obj = eVar.f5938a;
        q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, x7, i, (Object) null);
        this.f5948j = objArr;
        this.f5949k -= i - x7;
        return x7;
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
    public final boolean z(p6.c cVar) {
        Object[] s5;
        int i;
        p6.c cVar2 = cVar;
        int F = F();
        Object[] objArr = null;
        e eVar = new e(null);
        boolean z3 = false;
        if (this.i != null) {
            a k3 = k(0);
            int i8 = 32;
            while (i8 == 32 && k3.hasNext()) {
                i8 = x(cVar2, (Object[]) k3.next(), 32, eVar);
            }
            if (i8 == 32) {
                int y7 = y(cVar2, F, eVar);
                if (y7 == 0) {
                    r(this.i, this.f5949k, this.f5946g);
                }
            } else {
                int i9 = (k3.f5931d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i10 = i8;
                while (k3.hasNext()) {
                    i10 = w(cVar2, (Object[]) k3.next(), 32, i10, eVar, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int w7 = w(cVar, this.f5948j, F, i10, eVar, arrayList2, arrayList);
                Object obj = eVar.f5938a;
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, w7, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    s5 = this.i;
                    q6.i.b(s5);
                } else {
                    s5 = s(this.i, i9, this.f5946g, arrayList.iterator());
                }
                int size = i9 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    p1.a("invalid size");
                }
                if (size == 0) {
                    this.f5946g = 0;
                } else {
                    int i11 = size - 1;
                    while (true) {
                        i = this.f5946g;
                        if ((i11 >> i) != 0) {
                            break;
                        }
                        this.f5946g = i - 5;
                        Object[] objArr3 = s5[0];
                        q6.i.c(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        s5 = objArr3;
                    }
                    objArr = p(s5, i11, i);
                }
                this.i = objArr;
                this.f5948j = objArr2;
                this.f5949k = size + w7;
            }
            z3 = true;
        }
        if (z3) {
            ((AbstractList) this).modCount++;
        }
        return z3;
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
            Object[] l3 = l(this.f5948j);
            l3[F] = obj;
            this.f5948j = l3;
            this.f5949k = a() + 1;
        } else {
            u(this.i, this.f5948j, o(obj));
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
            Object[] l3 = l(this.f5948j);
            e(l3, F, it);
            this.f5948j = l3;
            this.f5949k = collection.size() + this.f5949k;
            return true;
        }
        int size = ((collection.size() + F) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] l7 = l(this.f5948j);
        e(l7, F, it);
        objArr[0] = l7;
        for (int i = 1; i < size; i++) {
            Object[] n6 = n();
            e(n6, 0, it);
            objArr[i] = n6;
        }
        this.i = t(this.i, C(), objArr);
        Object[] n7 = n();
        e(n7, 0, it);
        this.f5948j = n7;
        this.f5949k = collection.size() + this.f5949k;
        return true;
    }
}
