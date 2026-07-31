package M;

import I.C0089d;
import L1.q;
import M1.B;
import a2.InterfaceC0185b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g extends M1.f implements Collection, InterfaceC0185b {

    /* renamed from: d, reason: collision with root package name */
    public c f2741d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2742e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f2743f;

    /* renamed from: g, reason: collision with root package name */
    public int f2744g;

    /* renamed from: h, reason: collision with root package name */
    public P.b f2745h = new P.b();

    /* renamed from: i, reason: collision with root package name */
    public Object[] f2746i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f2747j;

    /* renamed from: k, reason: collision with root package name */
    public int f2748k;

    public g(c cVar, Object[] objArr, Object[] objArr2, int i3) {
        this.f2741d = cVar;
        this.f2742e = objArr;
        this.f2743f = objArr2;
        this.f2744g = i3;
        this.f2746i = objArr;
        this.f2747j = objArr2;
        this.f2748k = cVar.b();
    }

    public static void i(Object[] objArr, int i3, Iterator it) {
        while (i3 < 32 && it.hasNext()) {
            objArr[i3] = it.next();
            i3++;
        }
    }

    public final int A(Y1.c cVar, Object[] objArr, int i3, int i4, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f2736a;
        Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj2 = objArr[i5];
            if (!((Boolean) cVar.j(obj2)).booleanValue()) {
                if (i4 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i4 = 0;
                }
                objArr3[i4] = obj2;
                i4++;
            }
        }
        eVar.f2736a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i4;
    }

    public final int B(Y1.c cVar, Object[] objArr, int i3, e eVar) {
        Object[] objArr2 = objArr;
        int i4 = i3;
        boolean z3 = false;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (((Boolean) cVar.j(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = p(objArr);
                    z3 = true;
                    i4 = i5;
                }
            } else if (z3) {
                objArr2[i4] = obj;
                i4++;
            }
        }
        eVar.f2736a = objArr2;
        return i4;
    }

    public final int C(Y1.c cVar, int i3, e eVar) {
        int B = B(cVar, this.f2747j, i3, eVar);
        if (B == i3) {
            return i3;
        }
        Object obj = eVar.f2736a;
        Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, B, i3, (Object) null);
        this.f2747j = objArr;
        this.f2748k -= i3 - B;
        return B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (C(r19, r10, r11) != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(Y1.c cVar) {
        Object[] w3;
        int i3;
        int J3 = J();
        Object[] objArr = null;
        e eVar = new e(null);
        boolean z3 = false;
        if (this.f2746i != null) {
            a o3 = o(0);
            int i4 = 32;
            int i5 = 32;
            while (i5 == 32 && o3.hasNext()) {
                i5 = B(cVar, (Object[]) o3.next(), 32, eVar);
            }
            if (i5 == 32) {
                int C = C(cVar, J3, eVar);
                if (C == 0) {
                    v(this.f2746i, this.f2748k, this.f2744g);
                }
            } else {
                int i6 = (o3.f2730d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i7 = i5;
                while (o3.hasNext()) {
                    i7 = A(cVar, (Object[]) o3.next(), 32, i7, eVar, arrayList2, arrayList);
                    i6 = i6;
                    i4 = i4;
                }
                int i8 = i6;
                int A3 = A(cVar, this.f2747j, J3, i7, eVar, arrayList2, arrayList);
                Object obj = eVar.f2736a;
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, A3, i4, (Object) null);
                if (arrayList.isEmpty()) {
                    w3 = this.f2746i;
                    Z1.i.c(w3);
                } else {
                    w3 = w(this.f2746i, i8, this.f2744g, arrayList.iterator());
                }
                int size = i8 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C0089d.R("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f2744g = 0;
                } else {
                    int i9 = size - 1;
                    while (true) {
                        i3 = this.f2744g;
                        if ((i9 >> i3) != 0) {
                            break;
                        }
                        this.f2744g = i3 - 5;
                        Object[] objArr3 = w3[0];
                        Z1.i.d(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        w3 = objArr3;
                    }
                    objArr = t(w3, i9, i3);
                }
                this.f2746i = objArr;
                this.f2747j = objArr2;
                this.f2748k = size + A3;
                z3 = true;
            }
            if (z3) {
                ((AbstractList) this).modCount++;
            }
            return z3;
        }
    }

    public final Object[] E(Object[] objArr, int i3, int i4, e eVar) {
        int F3 = B.F(i4, i3);
        if (i3 == 0) {
            Object obj = objArr[F3];
            Object[] p = p(objArr);
            M1.k.X(objArr, p, F3, F3 + 1, 32);
            p[31] = eVar.f2736a;
            eVar.f2736a = obj;
            return p;
        }
        int F4 = objArr[31] == null ? B.F(G() - 1, i3) : 31;
        Object[] p3 = p(objArr);
        int i5 = i3 - 5;
        int i6 = F3 + 1;
        if (i6 <= F4) {
            while (true) {
                Object obj2 = p3[F4];
                Z1.i.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                p3[F4] = E((Object[]) obj2, i5, 0, eVar);
                if (F4 == i6) {
                    break;
                }
                F4--;
            }
        }
        Object obj3 = p3[F3];
        Z1.i.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        p3[F3] = E((Object[]) obj3, i5, i4, eVar);
        return p3;
    }

    public final Object F(Object[] objArr, int i3, int i4, int i5) {
        int i6 = this.f2748k - i3;
        if (i6 == 1) {
            Object obj = this.f2747j[0];
            v(objArr, i3, i4);
            return obj;
        }
        Object[] objArr2 = this.f2747j;
        Object obj2 = objArr2[i5];
        Object[] p = p(objArr2);
        M1.k.X(objArr2, p, i5, i5 + 1, i6);
        p[i6 - 1] = null;
        this.f2746i = objArr;
        this.f2747j = p;
        this.f2748k = (i3 + i6) - 1;
        this.f2744g = i4;
        return obj2;
    }

    public final int G() {
        int i3 = this.f2748k;
        if (i3 <= 32) {
            return 0;
        }
        return (i3 - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        int F3 = B.F(i4, i3);
        Object[] p = p(objArr);
        if (i3 != 0) {
            Object obj2 = p[F3];
            Z1.i.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            p[F3] = H((Object[]) obj2, i3 - 5, i4, obj, eVar);
            return p;
        }
        if (p != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f2736a = p[F3];
        p[F3] = obj;
        return p;
    }

    public final void I(Collection collection, int i3, Object[] objArr, int i4, Object[][] objArr2, int i5, Object[] objArr3) {
        Object[] r3;
        if (i5 < 1) {
            C0089d.R("requires at least one nullBuffer");
            throw null;
        }
        Object[] p = p(objArr);
        objArr2[0] = p;
        int i6 = i3 & 31;
        int size = ((collection.size() + i3) - 1) & 31;
        int i7 = (i4 - i6) + size;
        if (i7 < 32) {
            M1.k.X(p, objArr3, size + 1, i6, i4);
        } else {
            int i8 = i7 - 31;
            if (i5 == 1) {
                r3 = p;
            } else {
                r3 = r();
                i5--;
                objArr2[i5] = r3;
            }
            int i9 = i4 - i8;
            M1.k.X(p, objArr3, 0, i9, i4);
            M1.k.X(p, r3, size + 1, i6, i9);
            objArr3 = r3;
        }
        Iterator it = collection.iterator();
        i(p, i6, it);
        for (int i10 = 1; i10 < i5; i10++) {
            Object[] r4 = r();
            i(r4, 0, it);
            objArr2[i10] = r4;
        }
        i(objArr3, 0, it);
    }

    public final int J() {
        int i3 = this.f2748k;
        return i3 <= 32 ? i3 : i3 - ((i3 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        B.r(i3, b());
        if (i3 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int G3 = G();
        if (i3 >= G3) {
            m(this.f2746i, i3 - G3, obj);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f2746i;
        Z1.i.c(objArr);
        m(l(objArr, this.f2744g, i3, obj, eVar), 0, eVar.f2736a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        Object[] r3;
        B.r(i3, this.f2748k);
        if (i3 == this.f2748k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i4 = (i3 >> 5) << 5;
        int size = ((collection.size() + (this.f2748k - i4)) - 1) / 32;
        if (size == 0) {
            int i5 = i3 & 31;
            int size2 = ((collection.size() + i3) - 1) & 31;
            Object[] objArr = this.f2747j;
            Object[] p = p(objArr);
            M1.k.X(objArr, p, size2 + 1, i5, J());
            i(p, i5, collection.iterator());
            this.f2747j = p;
            this.f2748k = collection.size() + this.f2748k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int J3 = J();
        int size3 = collection.size() + this.f2748k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i3 >= G()) {
            r3 = r();
            I(collection, i3, this.f2747j, J3, objArr2, size, r3);
        } else if (size3 > J3) {
            int i6 = size3 - J3;
            r3 = q(this.f2747j, i6);
            k(collection, i3, i6, objArr2, size, r3);
        } else {
            Object[] objArr3 = this.f2747j;
            r3 = r();
            int i7 = J3 - size3;
            M1.k.X(objArr3, r3, 0, i7, J3);
            int i8 = 32 - i7;
            Object[] q2 = q(this.f2747j, i8);
            int i9 = size - 1;
            objArr2[i9] = q2;
            k(collection, i3, i8, objArr2, i9, q2);
        }
        this.f2746i = x(this.f2746i, i4, objArr2);
        this.f2747j = r3;
        this.f2748k = collection.size() + this.f2748k;
        return true;
    }

    @Override // M1.f
    public final int b() {
        return this.f2748k;
    }

    @Override // M1.f
    public final Object c(int i3) {
        B.q(i3, b());
        ((AbstractList) this).modCount++;
        int G3 = G();
        if (i3 >= G3) {
            return F(this.f2746i, G3, this.f2744g, i3 - G3);
        }
        e eVar = new e(this.f2747j[0]);
        Object[] objArr = this.f2746i;
        Z1.i.c(objArr);
        F(E(objArr, this.f2744g, i3, eVar), G3, this.f2744g, 0);
        return eVar.f2736a;
    }

    public final c d() {
        c fVar;
        Object[] objArr = this.f2746i;
        if (objArr == this.f2742e && this.f2747j == this.f2743f) {
            fVar = this.f2741d;
        } else {
            this.f2745h = new P.b();
            this.f2742e = objArr;
            Object[] objArr2 = this.f2747j;
            this.f2743f = objArr2;
            if (objArr != null) {
                fVar = new f(objArr, objArr2, this.f2748k, this.f2744g);
            } else if (objArr2.length == 0) {
                fVar = j.f2755e;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f2747j, this.f2748k);
                Z1.i.e(copyOf, "copyOf(this, newSize)");
                fVar = new j(copyOf);
            }
        }
        this.f2741d = fVar;
        return fVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        Object[] objArr;
        B.q(i3, b());
        if (G() <= i3) {
            objArr = this.f2747j;
        } else {
            objArr = this.f2746i;
            Z1.i.c(objArr);
            for (int i4 = this.f2744g; i4 > 0; i4 -= 5) {
                Object obj = objArr[B.F(i3, i4)];
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j() {
        return ((AbstractList) this).modCount;
    }

    public final void k(Collection collection, int i3, int i4, Object[][] objArr, int i5, Object[] objArr2) {
        if (this.f2746i == null) {
            throw new IllegalStateException("root is null");
        }
        int i6 = i3 >> 5;
        a o3 = o(G() >> 5);
        int i7 = i5;
        Object[] objArr3 = objArr2;
        while (o3.f2730d - 1 != i6) {
            Object[] objArr4 = (Object[]) o3.previous();
            M1.k.X(objArr4, objArr3, 0, 32 - i4, 32);
            objArr3 = q(objArr4, i4);
            i7--;
            objArr[i7] = objArr3;
        }
        Object[] objArr5 = (Object[]) o3.previous();
        int G3 = i5 - (((G() >> 5) - 1) - i6);
        if (G3 < i5) {
            objArr2 = objArr[G3];
            Z1.i.c(objArr2);
        }
        I(collection, i3, objArr5, 32, objArr, G3, objArr2);
    }

    public final Object[] l(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        Object obj2;
        int F3 = B.F(i4, i3);
        if (i3 == 0) {
            eVar.f2736a = objArr[31];
            Object[] p = p(objArr);
            M1.k.X(objArr, p, F3 + 1, F3, 31);
            p[F3] = obj;
            return p;
        }
        Object[] p3 = p(objArr);
        int i5 = i3 - 5;
        Object obj3 = p3[F3];
        Z1.i.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        p3[F3] = l((Object[]) obj3, i5, i4, obj, eVar);
        while (true) {
            F3++;
            if (F3 >= 32 || (obj2 = p3[F3]) == null) {
                break;
            }
            p3[F3] = l((Object[]) obj2, i5, 0, eVar.f2736a, eVar);
        }
        return p3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        B.r(i3, this.f2748k);
        return new i(this, i3);
    }

    public final void m(Object[] objArr, int i3, Object obj) {
        int J3 = J();
        Object[] p = p(this.f2747j);
        if (J3 < 32) {
            M1.k.X(this.f2747j, p, i3 + 1, i3, J3);
            p[i3] = obj;
            this.f2746i = objArr;
            this.f2747j = p;
            this.f2748k++;
            return;
        }
        Object[] objArr2 = this.f2747j;
        Object obj2 = objArr2[31];
        M1.k.X(objArr2, p, i3 + 1, i3, 31);
        p[i3] = obj;
        y(objArr, p, s(obj2));
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f2745h;
    }

    public final a o(int i3) {
        Object[] objArr = this.f2746i;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int G3 = G() >> 5;
        B.r(i3, G3);
        int i4 = this.f2744g;
        return i4 == 0 ? new d(i3, objArr) : new k(objArr, i3, G3, i4 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] r3 = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        M1.k.Z(objArr, r3, 0, length, 6);
        return r3;
    }

    public final Object[] q(Object[] objArr, int i3) {
        if (n(objArr)) {
            M1.k.X(objArr, objArr, i3, 0, 32 - i3);
            return objArr;
        }
        Object[] r3 = r();
        M1.k.X(objArr, r3, i3, 0, 32 - i3);
        return r3;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f2745h;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new b(1, collection));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f2745h;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        B.q(i3, b());
        if (G() > i3) {
            e eVar = new e(null);
            Object[] objArr = this.f2746i;
            Z1.i.c(objArr);
            this.f2746i = H(objArr, this.f2744g, i3, obj, eVar);
            return eVar.f2736a;
        }
        Object[] p = p(this.f2747j);
        if (p != this.f2747j) {
            ((AbstractList) this).modCount++;
        }
        int i4 = i3 & 31;
        Object obj2 = p[i4];
        p[i4] = obj;
        this.f2747j = p;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i3, int i4) {
        if (!(i4 >= 0)) {
            C0089d.R("shift should be positive");
            throw null;
        }
        if (i4 == 0) {
            return objArr;
        }
        int F3 = B.F(i3, i4);
        Object obj = objArr[F3];
        Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object t3 = t((Object[]) obj, i3, i4 - 5);
        if (F3 < 31) {
            int i5 = F3 + 1;
            if (objArr[i5] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i5, 32, (Object) null);
                }
                Object[] r3 = r();
                M1.k.X(objArr, r3, 0, 0, i5);
                objArr = r3;
            }
        }
        if (t3 == objArr[F3]) {
            return objArr;
        }
        Object[] p = p(objArr);
        p[F3] = t3;
        return p;
    }

    public final Object[] u(Object[] objArr, int i3, int i4, e eVar) {
        Object[] u3;
        int F3 = B.F(i4 - 1, i3);
        if (i3 == 5) {
            eVar.f2736a = objArr[F3];
            u3 = null;
        } else {
            Object obj = objArr[F3];
            Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            u3 = u((Object[]) obj, i3 - 5, i4, eVar);
        }
        if (u3 == null && F3 == 0) {
            return null;
        }
        Object[] p = p(objArr);
        p[F3] = u3;
        return p;
    }

    public final void v(Object[] objArr, int i3, int i4) {
        if (i4 == 0) {
            this.f2746i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f2747j = objArr;
            this.f2748k = i3;
            this.f2744g = i4;
            return;
        }
        e eVar = new e(null);
        Z1.i.c(objArr);
        Object[] u3 = u(objArr, i4, i3, eVar);
        Z1.i.c(u3);
        Object obj = eVar.f2736a;
        Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f2747j = (Object[]) obj;
        this.f2748k = i3;
        if (u3[1] == null) {
            this.f2746i = (Object[]) u3[0];
            this.f2744g = i4 - 5;
        } else {
            this.f2746i = u3;
            this.f2744g = i4;
        }
    }

    public final Object[] w(Object[] objArr, int i3, int i4, Iterator it) {
        if (!it.hasNext()) {
            C0089d.R("invalid buffersIterator");
            throw null;
        }
        if (!(i4 >= 0)) {
            C0089d.R("negative shift");
            throw null;
        }
        if (i4 == 0) {
            return (Object[]) it.next();
        }
        Object[] p = p(objArr);
        int F3 = B.F(i3, i4);
        int i5 = i4 - 5;
        p[F3] = w((Object[]) p[F3], i3, i5, it);
        while (true) {
            F3++;
            if (F3 >= 32 || !it.hasNext()) {
                break;
            }
            p[F3] = w((Object[]) p[F3], 0, i5, it);
        }
        return p;
    }

    public final Object[] x(Object[] objArr, int i3, Object[][] objArr2) {
        q h3 = Z1.i.h(objArr2);
        int i4 = i3 >> 5;
        int i5 = this.f2744g;
        Object[] w3 = i4 < (1 << i5) ? w(objArr, i3, i5, h3) : p(objArr);
        while (h3.hasNext()) {
            this.f2744g += 5;
            w3 = s(w3);
            int i6 = this.f2744g;
            w(w3, 1 << i6, i6, h3);
        }
        return w3;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f2748k;
        int i4 = i3 >> 5;
        int i5 = this.f2744g;
        if (i4 > (1 << i5)) {
            this.f2746i = z(this.f2744g + 5, s(objArr), objArr2);
            this.f2747j = objArr3;
            this.f2744g += 5;
            this.f2748k++;
            return;
        }
        if (objArr == null) {
            this.f2746i = objArr2;
            this.f2747j = objArr3;
            this.f2748k = i3 + 1;
        } else {
            this.f2746i = z(i5, objArr, objArr2);
            this.f2747j = objArr3;
            this.f2748k++;
        }
    }

    public final Object[] z(int i3, Object[] objArr, Object[] objArr2) {
        int F3 = B.F(b() - 1, i3);
        Object[] p = p(objArr);
        if (i3 == 5) {
            p[F3] = objArr2;
        } else {
            p[F3] = z(i3 - 5, (Object[]) p[F3], objArr2);
        }
        return p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int J3 = J();
        if (J3 < 32) {
            Object[] p = p(this.f2747j);
            p[J3] = obj;
            this.f2747j = p;
            this.f2748k = b() + 1;
        } else {
            y(this.f2746i, this.f2747j, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int J3 = J();
        Iterator it = collection.iterator();
        if (32 - J3 >= collection.size()) {
            Object[] p = p(this.f2747j);
            i(p, J3, it);
            this.f2747j = p;
            this.f2748k = collection.size() + this.f2748k;
        } else {
            int size = ((collection.size() + J3) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] p3 = p(this.f2747j);
            i(p3, J3, it);
            objArr[0] = p3;
            for (int i3 = 1; i3 < size; i3++) {
                Object[] r3 = r();
                i(r3, 0, it);
                objArr[i3] = r3;
            }
            this.f2746i = x(this.f2746i, G(), objArr);
            Object[] r4 = r();
            i(r4, 0, it);
            this.f2747j = r4;
            this.f2748k = collection.size() + this.f2748k;
        }
        return true;
    }
}
