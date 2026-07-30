package k0;

import d6.q;
import e6.k;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends e6.f implements Collection, s6.b {

    /* renamed from: f, reason: collision with root package name */
    public c f5302f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5303g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f5304h;

    /* renamed from: i, reason: collision with root package name */
    public int f5305i;

    /* renamed from: j, reason: collision with root package name */
    public n0.b f5306j = new n0.b();

    /* renamed from: k, reason: collision with root package name */
    public Object[] f5307k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f5308l;

    /* renamed from: m, reason: collision with root package name */
    public int f5309m;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i7) {
        this.f5302f = cVar;
        this.f5303g = objArr;
        this.f5304h = objArr2;
        this.f5305i = i7;
        this.f5307k = objArr;
        this.f5308l = objArr2;
        this.f5309m = cVar.a();
    }

    public static void w(Object[] objArr, int i7, Iterator it) {
        while (i7 < 32 && it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
    }

    public final void A(Object[] objArr, int i7, Object obj) {
        int X = X();
        Object[] D = D(this.f5308l);
        if (X < 32) {
            k.X(this.f5308l, D, i7 + 1, i7, X);
            D[i7] = obj;
            this.f5307k = objArr;
            this.f5308l = D;
            this.f5309m++;
            return;
        }
        Object[] objArr2 = this.f5308l;
        Object obj2 = objArr2[31];
        k.X(objArr2, D, i7 + 1, i7, 31);
        D[i7] = obj;
        M(objArr, D, G(obj2));
    }

    public final boolean B(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f5306j;
    }

    public final a C(int i7) {
        Object[] objArr = this.f5307k;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int U = U() >> 5;
        a.a.n(i7, U);
        int i8 = this.f5305i;
        return i8 == 0 ? new d(i7, objArr) : new j(objArr, i7, U, i8 / 5);
    }

    public final Object[] D(Object[] objArr) {
        if (objArr == null) {
            return F();
        }
        if (B(objArr)) {
            return objArr;
        }
        Object[] F = F();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        k.Z(objArr, F, 0, length, 6);
        return F;
    }

    public final Object[] E(Object[] objArr, int i7) {
        if (B(objArr)) {
            k.X(objArr, objArr, i7, 0, 32 - i7);
            return objArr;
        }
        Object[] F = F();
        k.X(objArr, F, i7, 0, 32 - i7);
        return F;
    }

    public final Object[] F() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f5306j;
        return objArr;
    }

    public final Object[] G(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f5306j;
        return objArr;
    }

    public final Object[] H(Object[] objArr, int i7, int i8) {
        if (i8 < 0) {
            g0.d.R("shift should be positive");
            throw null;
        }
        if (i8 == 0) {
            return objArr;
        }
        int f02 = j1.c.f0(i7, i8);
        Object obj = objArr[f02];
        r6.k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object H = H((Object[]) obj, i7, i8 - 5);
        if (f02 < 31) {
            int i9 = f02 + 1;
            if (objArr[i9] != null) {
                if (B(objArr)) {
                    Arrays.fill(objArr, i9, 32, (Object) null);
                }
                Object[] F = F();
                k.X(objArr, F, 0, 0, i9);
                objArr = F;
            }
        }
        if (H == objArr[f02]) {
            return objArr;
        }
        Object[] D = D(objArr);
        D[f02] = H;
        return D;
    }

    public final Object[] I(Object[] objArr, int i7, int i8, c3.h hVar) {
        Object[] I;
        int f02 = j1.c.f0(i8 - 1, i7);
        if (i7 == 5) {
            hVar.f1653a = objArr[f02];
            I = null;
        } else {
            Object obj = objArr[f02];
            r6.k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            I = I((Object[]) obj, i7 - 5, i8, hVar);
        }
        if (I == null && f02 == 0) {
            return null;
        }
        Object[] D = D(objArr);
        D[f02] = I;
        return D;
    }

    public final void J(Object[] objArr, int i7, int i8) {
        if (i8 == 0) {
            this.f5307k = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f5308l = objArr;
            this.f5309m = i7;
            this.f5305i = i8;
            return;
        }
        c3.h hVar = new c3.h(null);
        r6.k.c(objArr);
        Object[] I = I(objArr, i8, i7, hVar);
        r6.k.c(I);
        Object obj = hVar.f1653a;
        r6.k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f5308l = (Object[]) obj;
        this.f5309m = i7;
        if (I[1] == null) {
            this.f5307k = (Object[]) I[0];
            this.f5305i = i8 - 5;
        } else {
            this.f5307k = I;
            this.f5305i = i8;
        }
    }

    public final Object[] K(Object[] objArr, int i7, int i8, Iterator it) {
        if (!it.hasNext()) {
            g0.d.R("invalid buffersIterator");
            throw null;
        }
        if (!(i8 >= 0)) {
            g0.d.R("negative shift");
            throw null;
        }
        if (i8 == 0) {
            return (Object[]) it.next();
        }
        Object[] D = D(objArr);
        int f02 = j1.c.f0(i7, i8);
        int i9 = i8 - 5;
        D[f02] = K((Object[]) D[f02], i7, i9, it);
        while (true) {
            f02++;
            if (f02 >= 32 || !it.hasNext()) {
                break;
            }
            D[f02] = K((Object[]) D[f02], 0, i9, it);
        }
        return D;
    }

    public final Object[] L(Object[] objArr, int i7, Object[][] objArr2) {
        q h3 = r6.k.h(objArr2);
        int i8 = i7 >> 5;
        int i9 = this.f5305i;
        Object[] K = i8 < (1 << i9) ? K(objArr, i7, i9, h3) : D(objArr);
        while (h3.hasNext()) {
            this.f5305i += 5;
            K = G(K);
            int i10 = this.f5305i;
            K(K, 1 << i10, i10, h3);
        }
        return K;
    }

    public final void M(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f5309m;
        int i8 = i7 >> 5;
        int i9 = this.f5305i;
        if (i8 > (1 << i9)) {
            this.f5307k = N(this.f5305i + 5, G(objArr), objArr2);
            this.f5308l = objArr3;
            this.f5305i += 5;
            this.f5309m++;
            return;
        }
        if (objArr == null) {
            this.f5307k = objArr2;
            this.f5308l = objArr3;
            this.f5309m = i7 + 1;
        } else {
            this.f5307k = N(i9, objArr, objArr2);
            this.f5308l = objArr3;
            this.f5309m++;
        }
    }

    public final Object[] N(int i7, Object[] objArr, Object[] objArr2) {
        int f02 = j1.c.f0(a() - 1, i7);
        Object[] D = D(objArr);
        if (i7 == 5) {
            D[f02] = objArr2;
            return D;
        }
        D[f02] = N(i7 - 5, (Object[]) D[f02], objArr2);
        return D;
    }

    public final int O(q6.c cVar, Object[] objArr, int i7, int i8, c3.h hVar, ArrayList arrayList, ArrayList arrayList2) {
        if (B(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = hVar.f1653a;
        r6.k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj2 = objArr[i9];
            if (!((Boolean) cVar.f(obj2)).booleanValue()) {
                if (i8 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : F();
                    i8 = 0;
                }
                objArr3[i8] = obj2;
                i8++;
            }
        }
        hVar.f1653a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i8;
    }

    public final int P(q6.c cVar, Object[] objArr, int i7, c3.h hVar) {
        Object[] objArr2 = objArr;
        int i8 = i7;
        boolean z8 = false;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (((Boolean) cVar.f(obj)).booleanValue()) {
                if (!z8) {
                    objArr2 = D(objArr);
                    z8 = true;
                    i8 = i9;
                }
            } else if (z8) {
                objArr2[i8] = obj;
                i8++;
            }
        }
        hVar.f1653a = objArr2;
        return i8;
    }

    public final int Q(q6.c cVar, int i7, c3.h hVar) {
        int P = P(cVar, this.f5308l, i7, hVar);
        if (P == i7) {
            return i7;
        }
        Object obj = hVar.f1653a;
        r6.k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, P, i7, (Object) null);
        this.f5308l = objArr;
        this.f5309m -= i7 - P;
        return P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (Q(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R(q6.c cVar) {
        Object[] K;
        int i7;
        q6.c cVar2 = cVar;
        int X = X();
        Object[] objArr = null;
        c3.h hVar = new c3.h(null);
        boolean z8 = false;
        if (this.f5307k != null) {
            a C = C(0);
            int i8 = 32;
            while (i8 == 32 && C.hasNext()) {
                i8 = P(cVar2, (Object[]) C.next(), 32, hVar);
            }
            if (i8 == 32) {
                int Q = Q(cVar2, X, hVar);
                if (Q == 0) {
                    J(this.f5307k, this.f5309m, this.f5305i);
                }
            } else {
                int i9 = (C.f5292f - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i10 = i8;
                while (C.hasNext()) {
                    i10 = O(cVar2, (Object[]) C.next(), 32, i10, hVar, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int O = O(cVar, this.f5308l, X, i10, hVar, arrayList2, arrayList);
                Object obj = hVar.f1653a;
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, O, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    K = this.f5307k;
                    r6.k.c(K);
                } else {
                    K = K(this.f5307k, i9, this.f5305i, arrayList.iterator());
                }
                int size = i9 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    g0.d.R("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f5305i = 0;
                } else {
                    int i11 = size - 1;
                    while (true) {
                        i7 = this.f5305i;
                        if ((i11 >> i7) != 0) {
                            break;
                        }
                        this.f5305i = i7 - 5;
                        Object[] objArr3 = K[0];
                        r6.k.d(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        K = objArr3;
                    }
                    objArr = H(K, i11, i7);
                }
                this.f5307k = objArr;
                this.f5308l = objArr2;
                this.f5309m = size + O;
            }
            z8 = true;
            if (z8) {
                ((AbstractList) this).modCount++;
            }
            return z8;
        }
    }

    public final Object[] S(Object[] objArr, int i7, int i8, c3.h hVar) {
        int f02 = j1.c.f0(i8, i7);
        if (i7 == 0) {
            Object obj = objArr[f02];
            Object[] D = D(objArr);
            k.X(objArr, D, f02, f02 + 1, 32);
            D[31] = hVar.f1653a;
            hVar.f1653a = obj;
            return D;
        }
        int f03 = objArr[31] == null ? j1.c.f0(U() - 1, i7) : 31;
        Object[] D2 = D(objArr);
        int i9 = i7 - 5;
        int i10 = f02 + 1;
        if (i10 <= f03) {
            while (true) {
                Object obj2 = D2[f03];
                r6.k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                D2[f03] = S((Object[]) obj2, i9, 0, hVar);
                if (f03 == i10) {
                    break;
                }
                f03--;
            }
        }
        Object obj3 = D2[f02];
        r6.k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        D2[f02] = S((Object[]) obj3, i9, i8, hVar);
        return D2;
    }

    public final Object T(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f5309m - i7;
        if (i10 == 1) {
            Object obj = this.f5308l[0];
            J(objArr, i7, i8);
            return obj;
        }
        Object[] objArr2 = this.f5308l;
        Object obj2 = objArr2[i9];
        Object[] D = D(objArr2);
        k.X(objArr2, D, i9, i9 + 1, i10);
        D[i10 - 1] = null;
        this.f5307k = objArr;
        this.f5308l = D;
        this.f5309m = (i7 + i10) - 1;
        this.f5305i = i8;
        return obj2;
    }

    public final int U() {
        int i7 = this.f5309m;
        if (i7 <= 32) {
            return 0;
        }
        return (i7 - 1) & (-32);
    }

    public final Object[] V(Object[] objArr, int i7, int i8, Object obj, c3.h hVar) {
        int f02 = j1.c.f0(i8, i7);
        Object[] D = D(objArr);
        if (i7 != 0) {
            Object obj2 = D[f02];
            r6.k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            D[f02] = V((Object[]) obj2, i7 - 5, i8, obj, hVar);
            return D;
        }
        if (D != objArr) {
            ((AbstractList) this).modCount++;
        }
        hVar.f1653a = D[f02];
        D[f02] = obj;
        return D;
    }

    public final void W(Collection collection, int i7, Object[] objArr, int i8, Object[][] objArr2, int i9, Object[] objArr3) {
        Object[] F;
        if (i9 < 1) {
            g0.d.R("requires at least one nullBuffer");
            throw null;
        }
        Object[] D = D(objArr);
        objArr2[0] = D;
        int i10 = i7 & 31;
        int size = ((collection.size() + i7) - 1) & 31;
        int i11 = (i8 - i10) + size;
        if (i11 < 32) {
            k.X(D, objArr3, size + 1, i10, i8);
        } else {
            int i12 = i11 - 31;
            if (i9 == 1) {
                F = D;
            } else {
                F = F();
                i9--;
                objArr2[i9] = F;
            }
            int i13 = i8 - i12;
            k.X(D, objArr3, 0, i13, i8);
            k.X(D, F, size + 1, i10, i13);
            objArr3 = F;
        }
        Iterator it = collection.iterator();
        w(D, i10, it);
        for (int i14 = 1; i14 < i9; i14++) {
            Object[] F2 = F();
            w(F2, 0, it);
            objArr2[i14] = F2;
        }
        w(objArr3, 0, it);
    }

    public final int X() {
        int i7 = this.f5309m;
        return i7 <= 32 ? i7 : i7 - ((i7 - 1) & (-32));
    }

    @Override // e6.f
    public final int a() {
        return this.f5309m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        a.a.n(i7, a());
        if (i7 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int U = U();
        if (i7 >= U) {
            A(this.f5307k, i7 - U, obj);
            return;
        }
        c3.h hVar = new c3.h(null);
        Object[] objArr = this.f5307k;
        r6.k.c(objArr);
        A(z(objArr, this.f5305i, i7, obj, hVar), 0, hVar.f1653a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] F;
        a.a.n(i7, this.f5309m);
        if (i7 == this.f5309m) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i8 = (i7 >> 5) << 5;
        int size = ((collection.size() + (this.f5309m - i8)) - 1) / 32;
        if (size == 0) {
            int i9 = i7 & 31;
            int size2 = ((collection.size() + i7) - 1) & 31;
            Object[] objArr = this.f5308l;
            Object[] D = D(objArr);
            k.X(objArr, D, size2 + 1, i9, X());
            w(D, i9, collection.iterator());
            this.f5308l = D;
            this.f5309m = collection.size() + this.f5309m;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int X = X();
        int size3 = collection.size() + this.f5309m;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i7 >= U()) {
            F = F();
            collection2 = collection;
            W(collection2, i7, this.f5308l, X, objArr2, size, F);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > X) {
                int i10 = size3 - X;
                Object[] E = E(fVar.f5308l, i10);
                fVar.y(collection2, i7, i10, objArr2, size, E);
                objArr2 = objArr2;
                F = E;
            } else {
                Object[] objArr3 = fVar.f5308l;
                F = F();
                int i11 = X - size3;
                k.X(objArr3, F, 0, i11, X);
                int i12 = 32 - i11;
                Object[] E2 = E(fVar.f5308l, i12);
                int i13 = size - 1;
                objArr2[i13] = E2;
                fVar.y(collection2, i7, i12, objArr2, i13, E2);
                collection2 = collection2;
            }
        }
        fVar.f5307k = L(fVar.f5307k, i8, objArr2);
        fVar.f5308l = F;
        fVar.f5309m = collection2.size() + fVar.f5309m;
        return true;
    }

    @Override // e6.f
    public final Object g(int i7) {
        a.a.l(i7, a());
        ((AbstractList) this).modCount++;
        int U = U();
        if (i7 >= U) {
            return T(this.f5307k, U, this.f5305i, i7 - U);
        }
        c3.h hVar = new c3.h(this.f5308l[0]);
        Object[] objArr = this.f5307k;
        r6.k.c(objArr);
        T(S(objArr, this.f5305i, i7, hVar), U, this.f5305i, 0);
        return hVar.f1653a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        a.a.l(i7, a());
        if (U() <= i7) {
            objArr = this.f5308l;
        } else {
            objArr = this.f5307k;
            r6.k.c(objArr);
            for (int i8 = this.f5305i; i8 > 0; i8 -= 5) {
                Object obj = objArr[j1.c.f0(i7, i8)];
                r6.k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        a.a.n(i7, this.f5309m);
        return new h(this, i7);
    }

    public final c m() {
        c eVar;
        Object[] objArr = this.f5307k;
        if (objArr == this.f5303g && this.f5308l == this.f5304h) {
            eVar = this.f5302f;
        } else {
            this.f5306j = new n0.b();
            this.f5303g = objArr;
            Object[] objArr2 = this.f5308l;
            this.f5304h = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f5309m, this.f5305i);
            } else if (objArr2.length == 0) {
                eVar = i.f5316g;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, this.f5309m);
                r6.k.e(copyOf, "copyOf(this, newSize)");
                eVar = new i(copyOf);
            }
        }
        this.f5302f = eVar;
        return eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return R(new b(1, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a.a.l(i7, a());
        if (U() > i7) {
            c3.h hVar = new c3.h(null);
            Object[] objArr = this.f5307k;
            r6.k.c(objArr);
            this.f5307k = V(objArr, this.f5305i, i7, obj, hVar);
            return hVar.f1653a;
        }
        Object[] D = D(this.f5308l);
        if (D != this.f5308l) {
            ((AbstractList) this).modCount++;
        }
        int i8 = i7 & 31;
        Object obj2 = D[i8];
        D[i8] = obj;
        this.f5308l = D;
        return obj2;
    }

    public final int x() {
        return ((AbstractList) this).modCount;
    }

    public final void y(Collection collection, int i7, int i8, Object[][] objArr, int i9, Object[] objArr2) {
        if (this.f5307k == null) {
            throw new IllegalStateException("root is null");
        }
        int i10 = i7 >> 5;
        a C = C(U() >> 5);
        int i11 = i9;
        Object[] objArr3 = objArr2;
        while (C.f5292f - 1 != i10) {
            Object[] objArr4 = (Object[]) C.previous();
            k.X(objArr4, objArr3, 0, 32 - i8, 32);
            objArr3 = E(objArr4, i8);
            i11--;
            objArr[i11] = objArr3;
        }
        Object[] objArr5 = (Object[]) C.previous();
        int U = i9 - (((U() >> 5) - 1) - i10);
        if (U < i9) {
            objArr2 = objArr[U];
            r6.k.c(objArr2);
        }
        W(collection, i7, objArr5, 32, objArr, U, objArr2);
    }

    public final Object[] z(Object[] objArr, int i7, int i8, Object obj, c3.h hVar) {
        Object obj2;
        int f02 = j1.c.f0(i8, i7);
        if (i7 == 0) {
            hVar.f1653a = objArr[31];
            Object[] D = D(objArr);
            k.X(objArr, D, f02 + 1, f02, 31);
            D[f02] = obj;
            return D;
        }
        Object[] D2 = D(objArr);
        int i9 = i7 - 5;
        Object obj3 = D2[f02];
        r6.k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        D2[f02] = z((Object[]) obj3, i9, i8, obj, hVar);
        while (true) {
            f02++;
            if (f02 >= 32 || (obj2 = D2[f02]) == null) {
                break;
            }
            D2[f02] = z((Object[]) obj2, i9, 0, hVar.f1653a, hVar);
        }
        return D2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int X = X();
        if (X < 32) {
            Object[] D = D(this.f5308l);
            D[X] = obj;
            this.f5308l = D;
            this.f5309m = a() + 1;
        } else {
            M(this.f5307k, this.f5308l, G(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int X = X();
        Iterator it = collection.iterator();
        if (32 - X >= collection.size()) {
            Object[] D = D(this.f5308l);
            w(D, X, it);
            this.f5308l = D;
            this.f5309m = collection.size() + this.f5309m;
            return true;
        }
        int size = ((collection.size() + X) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] D2 = D(this.f5308l);
        w(D2, X, it);
        objArr[0] = D2;
        for (int i7 = 1; i7 < size; i7++) {
            Object[] F = F();
            w(F, 0, it);
            objArr[i7] = F;
        }
        this.f5307k = L(this.f5307k, U(), objArr);
        Object[] F2 = F();
        w(F2, 0, it);
        this.f5308l = F2;
        this.f5309m = collection.size() + this.f5309m;
        return true;
    }
}
