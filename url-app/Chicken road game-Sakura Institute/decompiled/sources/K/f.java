package K;

import G.C0192d;
import M2.C0249a;
import M2.J;
import a.AbstractC0345a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;
import z2.AbstractC1428l;
import z2.C1436t;

/* loaded from: classes.dex */
public final class f extends AbstractC1428l implements Collection, N2.b {

    /* renamed from: d, reason: collision with root package name */
    public J.c f3428d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f3429e;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f3430i;

    /* renamed from: j, reason: collision with root package name */
    public int f3431j;

    /* renamed from: k, reason: collision with root package name */
    public N.b f3432k = new N.b();

    /* renamed from: l, reason: collision with root package name */
    public Object[] f3433l;

    /* renamed from: m, reason: collision with root package name */
    public Object[] f3434m;

    /* renamed from: n, reason: collision with root package name */
    public int f3435n;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i2) {
        this.f3428d = cVar;
        this.f3429e = objArr;
        this.f3430i = objArr2;
        this.f3431j = i2;
        this.f3433l = objArr;
        this.f3434m = objArr2;
        this.f3435n = cVar.size();
    }

    public static void w(Object[] objArr, int i2, Iterator it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
    }

    public final int B() {
        return ((AbstractList) this).modCount;
    }

    public final void C(Collection collection, int i2, int i4, Object[][] objArr, int i5, Object[] objArr2) {
        if (this.f3433l == null) {
            throw new IllegalStateException("root is null");
        }
        int i6 = i2 >> 5;
        a G3 = G(Y() >> 5);
        int i7 = i5;
        Object[] objArr3 = objArr2;
        while (G3.f3418d - 1 != i6) {
            Object[] objArr4 = (Object[]) G3.previous();
            C1436t.f(objArr4, objArr3, 0, 32 - i4, 32);
            objArr3 = I(objArr4, i4);
            i7--;
            objArr[i7] = objArr3;
        }
        Object[] objArr5 = (Object[]) G3.previous();
        int Y3 = i5 - (((Y() >> 5) - 1) - i6);
        if (Y3 < i5) {
            objArr2 = objArr[Y3];
            Intrinsics.c(objArr2);
        }
        a0(collection, i2, objArr5, 32, objArr, Y3, objArr2);
    }

    public final Object[] D(Object[] objArr, int i2, int i4, Object obj, C1294c c1294c) {
        Object obj2;
        int J3 = u3.d.J(i4, i2);
        if (i2 == 0) {
            c1294c.f11388d = objArr[31];
            Object[] H3 = H(objArr);
            C1436t.f(objArr, H3, J3 + 1, J3, 31);
            H3[J3] = obj;
            return H3;
        }
        Object[] H4 = H(objArr);
        int i5 = i2 - 5;
        Object obj3 = H4[J3];
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        H4[J3] = D((Object[]) obj3, i5, i4, obj, c1294c);
        while (true) {
            J3++;
            if (J3 >= 32 || (obj2 = H4[J3]) == null) {
                break;
            }
            H4[J3] = D((Object[]) obj2, i5, 0, c1294c.f11388d, c1294c);
        }
        return H4;
    }

    public final void E(Object[] objArr, int i2, Object obj) {
        int b02 = b0();
        Object[] H3 = H(this.f3434m);
        if (b02 < 32) {
            C1436t.f(this.f3434m, H3, i2 + 1, i2, b02);
            H3[i2] = obj;
            this.f3433l = objArr;
            this.f3434m = H3;
            this.f3435n++;
            return;
        }
        Object[] objArr2 = this.f3434m;
        Object obj2 = objArr2[31];
        C1436t.f(objArr2, H3, i2 + 1, i2, 31);
        H3[i2] = obj;
        Q(objArr, H3, K(obj2));
    }

    public final boolean F(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f3432k;
    }

    public final a G(int i2) {
        Object[] objArr = this.f3433l;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int Y3 = Y() >> 5;
        AbstractC0345a.k(i2, Y3);
        int i4 = this.f3431j;
        return i4 == 0 ? new d(i2, objArr) : new j(objArr, i2, Y3, i4 / 5);
    }

    public final Object[] H(Object[] objArr) {
        if (objArr == null) {
            return J();
        }
        if (F(objArr)) {
            return objArr;
        }
        Object[] J3 = J();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        C1436t.h(objArr, J3, 0, length, 6);
        return J3;
    }

    public final Object[] I(Object[] objArr, int i2) {
        if (F(objArr)) {
            C1436t.f(objArr, objArr, i2, 0, 32 - i2);
            return objArr;
        }
        Object[] J3 = J();
        C1436t.f(objArr, J3, i2, 0, 32 - i2);
        return J3;
    }

    public final Object[] J() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f3432k;
        return objArr;
    }

    public final Object[] K(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f3432k;
        return objArr;
    }

    public final Object[] L(Object[] objArr, int i2, int i4) {
        if (!(i4 >= 0)) {
            C0192d.S("shift should be positive");
            throw null;
        }
        if (i4 == 0) {
            return objArr;
        }
        int J3 = u3.d.J(i2, i4);
        Object obj = objArr[J3];
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object L3 = L((Object[]) obj, i2, i4 - 5);
        if (J3 < 31) {
            int i5 = J3 + 1;
            if (objArr[i5] != null) {
                if (F(objArr)) {
                    Intrinsics.checkNotNullParameter(objArr, "<this>");
                    Arrays.fill(objArr, i5, 32, (Object) null);
                }
                Object[] J4 = J();
                C1436t.f(objArr, J4, 0, 0, i5);
                objArr = J4;
            }
        }
        if (L3 == objArr[J3]) {
            return objArr;
        }
        Object[] H3 = H(objArr);
        H3[J3] = L3;
        return H3;
    }

    public final Object[] M(Object[] objArr, int i2, int i4, C1294c c1294c) {
        Object[] M3;
        int J3 = u3.d.J(i4 - 1, i2);
        if (i2 == 5) {
            c1294c.f11388d = objArr[J3];
            M3 = null;
        } else {
            Object obj = objArr[J3];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            M3 = M((Object[]) obj, i2 - 5, i4, c1294c);
        }
        if (M3 == null && J3 == 0) {
            return null;
        }
        Object[] H3 = H(objArr);
        H3[J3] = M3;
        return H3;
    }

    public final void N(Object[] objArr, int i2, int i4) {
        Object obj = null;
        if (i4 == 0) {
            this.f3433l = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f3434m = objArr;
            this.f3435n = i2;
            this.f3431j = i4;
            return;
        }
        C1294c c1294c = new C1294c(obj);
        Intrinsics.c(objArr);
        Object[] M3 = M(objArr, i4, i2, c1294c);
        Intrinsics.c(M3);
        Object obj2 = c1294c.f11388d;
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f3434m = (Object[]) obj2;
        this.f3435n = i2;
        if (M3[1] == null) {
            this.f3433l = (Object[]) M3[0];
            this.f3431j = i4 - 5;
        } else {
            this.f3433l = M3;
            this.f3431j = i4;
        }
    }

    public final Object[] O(Object[] objArr, int i2, int i4, Iterator it) {
        if (!it.hasNext()) {
            C0192d.S("invalid buffersIterator");
            throw null;
        }
        if (!(i4 >= 0)) {
            C0192d.S("negative shift");
            throw null;
        }
        if (i4 == 0) {
            return (Object[]) it.next();
        }
        Object[] H3 = H(objArr);
        int J3 = u3.d.J(i2, i4);
        int i5 = i4 - 5;
        H3[J3] = O((Object[]) H3[J3], i2, i5, it);
        while (true) {
            J3++;
            if (J3 >= 32 || !it.hasNext()) {
                break;
            }
            H3[J3] = O((Object[]) H3[J3], 0, i5, it);
        }
        return H3;
    }

    public final Object[] P(Object[] objArr, int i2, Object[][] objArr2) {
        C0249a f4 = J.f(objArr2);
        int i4 = i2 >> 5;
        int i5 = this.f3431j;
        Object[] O3 = i4 < (1 << i5) ? O(objArr, i2, i5, f4) : H(objArr);
        while (f4.hasNext()) {
            this.f3431j += 5;
            O3 = K(O3);
            int i6 = this.f3431j;
            O(O3, 1 << i6, i6, f4);
        }
        return O3;
    }

    public final void Q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i2 = this.f3435n;
        int i4 = i2 >> 5;
        int i5 = this.f3431j;
        if (i4 > (1 << i5)) {
            this.f3433l = R(this.f3431j + 5, K(objArr), objArr2);
            this.f3434m = objArr3;
            this.f3431j += 5;
            this.f3435n++;
            return;
        }
        if (objArr == null) {
            this.f3433l = objArr2;
            this.f3434m = objArr3;
            this.f3435n = i2 + 1;
        } else {
            this.f3433l = R(i5, objArr, objArr2);
            this.f3434m = objArr3;
            this.f3435n++;
        }
    }

    public final Object[] R(int i2, Object[] objArr, Object[] objArr2) {
        int J3 = u3.d.J(e() - 1, i2);
        Object[] H3 = H(objArr);
        if (i2 == 5) {
            H3[J3] = objArr2;
        } else {
            H3[J3] = R(i2 - 5, (Object[]) H3[J3], objArr2);
        }
        return H3;
    }

    public final int S(Function1 function1, Object[] objArr, int i2, int i4, C1294c c1294c, ArrayList arrayList, ArrayList arrayList2) {
        if (F(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c1294c.f11388d;
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj2 = objArr[i5];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i4 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : J();
                    i4 = 0;
                }
                objArr3[i4] = obj2;
                i4++;
            }
        }
        c1294c.f11388d = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i4;
    }

    public final int T(Function1 function1, Object[] objArr, int i2, C1294c c1294c) {
        Object[] objArr2 = objArr;
        int i4 = i2;
        boolean z4 = false;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = objArr[i5];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z4) {
                    objArr2 = H(objArr);
                    z4 = true;
                    i4 = i5;
                }
            } else if (z4) {
                objArr2[i4] = obj;
                i4++;
            }
        }
        c1294c.f11388d = objArr2;
        return i4;
    }

    public final int U(Function1 function1, int i2, C1294c c1294c) {
        int T3 = T(function1, this.f3434m, i2, c1294c);
        if (T3 == i2) {
            return i2;
        }
        Object obj = c1294c.f11388d;
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, T3, i2, (Object) null);
        this.f3434m = objArr;
        this.f3435n -= i2 - T3;
        return T3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (U(r19, r10, r11) != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V(Function1 function1) {
        Object[] O3;
        int i2;
        int b02 = b0();
        Object[] objArr = null;
        C1294c c1294c = new C1294c(objArr);
        boolean z4 = false;
        if (this.f3433l != null) {
            a G3 = G(0);
            int i4 = 32;
            int i5 = 32;
            while (i5 == 32 && G3.hasNext()) {
                i5 = T(function1, (Object[]) G3.next(), 32, c1294c);
            }
            if (i5 == 32) {
                int U3 = U(function1, b02, c1294c);
                if (U3 == 0) {
                    N(this.f3433l, this.f3435n, this.f3431j);
                }
            } else {
                int i6 = (G3.f3418d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i7 = i5;
                while (G3.hasNext()) {
                    i7 = S(function1, (Object[]) G3.next(), 32, i7, c1294c, arrayList2, arrayList);
                    i6 = i6;
                    i4 = i4;
                }
                int i8 = i6;
                int S3 = S(function1, this.f3434m, b02, i7, c1294c, arrayList2, arrayList);
                Object obj = c1294c.f11388d;
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                Arrays.fill(objArr2, S3, i4, (Object) null);
                if (arrayList.isEmpty()) {
                    O3 = this.f3433l;
                    Intrinsics.c(O3);
                } else {
                    O3 = O(this.f3433l, i8, this.f3431j, arrayList.iterator());
                }
                int size = i8 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C0192d.S("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f3431j = 0;
                } else {
                    int i9 = size - 1;
                    while (true) {
                        i2 = this.f3431j;
                        if ((i9 >> i2) != 0) {
                            break;
                        }
                        this.f3431j = i2 - 5;
                        Object[] objArr3 = O3[0];
                        Intrinsics.d(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        O3 = objArr3;
                    }
                    objArr = L(O3, i9, i2);
                }
                this.f3433l = objArr;
                this.f3434m = objArr2;
                this.f3435n = size + S3;
                z4 = true;
            }
            if (z4) {
                ((AbstractList) this).modCount++;
            }
            return z4;
        }
    }

    public final Object[] W(Object[] objArr, int i2, int i4, C1294c c1294c) {
        int J3 = u3.d.J(i4, i2);
        if (i2 == 0) {
            Object obj = objArr[J3];
            Object[] H3 = H(objArr);
            C1436t.f(objArr, H3, J3, J3 + 1, 32);
            H3[31] = c1294c.f11388d;
            c1294c.f11388d = obj;
            return H3;
        }
        int J4 = objArr[31] == null ? u3.d.J(Y() - 1, i2) : 31;
        Object[] H4 = H(objArr);
        int i5 = i2 - 5;
        int i6 = J3 + 1;
        if (i6 <= J4) {
            while (true) {
                Object obj2 = H4[J4];
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                H4[J4] = W((Object[]) obj2, i5, 0, c1294c);
                if (J4 == i6) {
                    break;
                }
                J4--;
            }
        }
        Object obj3 = H4[J3];
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        H4[J3] = W((Object[]) obj3, i5, i4, c1294c);
        return H4;
    }

    public final Object X(Object[] objArr, int i2, int i4, int i5) {
        int i6 = this.f3435n - i2;
        if (i6 == 1) {
            Object obj = this.f3434m[0];
            N(objArr, i2, i4);
            return obj;
        }
        Object[] objArr2 = this.f3434m;
        Object obj2 = objArr2[i5];
        Object[] H3 = H(objArr2);
        C1436t.f(objArr2, H3, i5, i5 + 1, i6);
        H3[i6 - 1] = null;
        this.f3433l = objArr;
        this.f3434m = H3;
        this.f3435n = (i2 + i6) - 1;
        this.f3431j = i4;
        return obj2;
    }

    public final int Y() {
        int i2 = this.f3435n;
        if (i2 <= 32) {
            return 0;
        }
        return (i2 - 1) & (-32);
    }

    public final Object[] Z(Object[] objArr, int i2, int i4, Object obj, C1294c c1294c) {
        int J3 = u3.d.J(i4, i2);
        Object[] H3 = H(objArr);
        if (i2 != 0) {
            Object obj2 = H3[J3];
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            H3[J3] = Z((Object[]) obj2, i2 - 5, i4, obj, c1294c);
            return H3;
        }
        if (H3 != objArr) {
            ((AbstractList) this).modCount++;
        }
        c1294c.f11388d = H3[J3];
        H3[J3] = obj;
        return H3;
    }

    public final void a0(Collection collection, int i2, Object[] objArr, int i4, Object[][] objArr2, int i5, Object[] objArr3) {
        Object[] J3;
        if (i5 < 1) {
            C0192d.S("requires at least one nullBuffer");
            throw null;
        }
        Object[] H3 = H(objArr);
        objArr2[0] = H3;
        int i6 = i2 & 31;
        int size = ((collection.size() + i2) - 1) & 31;
        int i7 = (i4 - i6) + size;
        if (i7 < 32) {
            C1436t.f(H3, objArr3, size + 1, i6, i4);
        } else {
            int i8 = i7 - 31;
            if (i5 == 1) {
                J3 = H3;
            } else {
                J3 = J();
                i5--;
                objArr2[i5] = J3;
            }
            int i9 = i4 - i8;
            C1436t.f(H3, objArr3, 0, i9, i4);
            C1436t.f(H3, J3, size + 1, i6, i9);
            objArr3 = J3;
        }
        Iterator it = collection.iterator();
        w(H3, i6, it);
        for (int i10 = 1; i10 < i5; i10++) {
            Object[] J4 = J();
            w(J4, 0, it);
            objArr2[i10] = J4;
        }
        w(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        AbstractC0345a.k(i2, e());
        if (i2 == e()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int Y3 = Y();
        if (i2 >= Y3) {
            E(this.f3433l, i2 - Y3, obj);
            return;
        }
        C1294c c1294c = new C1294c((Object) null);
        Object[] objArr = this.f3433l;
        Intrinsics.c(objArr);
        E(D(objArr, this.f3431j, i2, obj, c1294c), 0, c1294c.f11388d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        Object[] J3;
        AbstractC0345a.k(i2, this.f3435n);
        if (i2 == this.f3435n) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i4 = (i2 >> 5) << 5;
        int size = ((collection.size() + (this.f3435n - i4)) - 1) / 32;
        if (size == 0) {
            int i5 = i2 & 31;
            int size2 = ((collection.size() + i2) - 1) & 31;
            Object[] objArr = this.f3434m;
            Object[] H3 = H(objArr);
            C1436t.f(objArr, H3, size2 + 1, i5, b0());
            w(H3, i5, collection.iterator());
            this.f3434m = H3;
            this.f3435n = collection.size() + this.f3435n;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int b02 = b0();
        int size3 = collection.size() + this.f3435n;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i2 >= Y()) {
            J3 = J();
            a0(collection, i2, this.f3434m, b02, objArr2, size, J3);
        } else if (size3 > b02) {
            int i6 = size3 - b02;
            J3 = I(this.f3434m, i6);
            C(collection, i2, i6, objArr2, size, J3);
        } else {
            Object[] objArr3 = this.f3434m;
            J3 = J();
            int i7 = b02 - size3;
            C1436t.f(objArr3, J3, 0, i7, b02);
            int i8 = 32 - i7;
            Object[] I3 = I(this.f3434m, i8);
            int i9 = size - 1;
            objArr2[i9] = I3;
            C(collection, i2, i8, objArr2, i9, I3);
        }
        this.f3433l = P(this.f3433l, i4, objArr2);
        this.f3434m = J3;
        this.f3435n = collection.size() + this.f3435n;
        return true;
    }

    public final int b0() {
        int i2 = this.f3435n;
        return i2 <= 32 ? i2 : i2 - ((i2 - 1) & (-32));
    }

    @Override // z2.AbstractC1428l
    public final int e() {
        return this.f3435n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        Object[] objArr;
        AbstractC0345a.j(i2, e());
        if (Y() <= i2) {
            objArr = this.f3434m;
        } else {
            objArr = this.f3433l;
            Intrinsics.c(objArr);
            for (int i4 = this.f3431j; i4 > 0; i4 -= 5) {
                Object obj = objArr[u3.d.J(i2, i4)];
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i2 & 31];
    }

    @Override // z2.AbstractC1428l
    public final Object h(int i2) {
        AbstractC0345a.j(i2, e());
        ((AbstractList) this).modCount++;
        int Y3 = Y();
        if (i2 >= Y3) {
            return X(this.f3433l, Y3, this.f3431j, i2 - Y3);
        }
        C1294c c1294c = new C1294c(this.f3434m[0]);
        Object[] objArr = this.f3433l;
        Intrinsics.c(objArr);
        X(W(objArr, this.f3431j, i2, c1294c), Y3, this.f3431j, 0);
        return c1294c.f11388d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        AbstractC0345a.k(i2, this.f3435n);
        return new h(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return V(new b(1, collection));
    }

    public final J.c s() {
        J.c eVar;
        Object[] objArr = this.f3433l;
        if (objArr == this.f3429e && this.f3434m == this.f3430i) {
            eVar = this.f3428d;
        } else {
            this.f3432k = new N.b();
            this.f3429e = objArr;
            Object[] objArr2 = this.f3434m;
            this.f3430i = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f3433l;
                Intrinsics.c(objArr3);
                eVar = new e(objArr3, this.f3434m, e(), this.f3431j);
            } else if (objArr2.length == 0) {
                eVar = i.f3442i;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f3434m, e());
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                eVar = new i(copyOf);
            }
        }
        this.f3428d = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        AbstractC0345a.j(i2, e());
        if (Y() > i2) {
            C1294c c1294c = new C1294c((Object) null);
            Object[] objArr = this.f3433l;
            Intrinsics.c(objArr);
            this.f3433l = Z(objArr, this.f3431j, i2, obj, c1294c);
            return c1294c.f11388d;
        }
        Object[] H3 = H(this.f3434m);
        if (H3 != this.f3434m) {
            ((AbstractList) this).modCount++;
        }
        int i4 = i2 & 31;
        Object obj2 = H3[i4];
        H3[i4] = obj;
        this.f3434m = H3;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int b02 = b0();
        if (b02 < 32) {
            Object[] H3 = H(this.f3434m);
            H3[b02] = obj;
            this.f3434m = H3;
            this.f3435n = e() + 1;
        } else {
            Q(this.f3433l, this.f3434m, K(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int b02 = b0();
        Iterator it = collection.iterator();
        if (32 - b02 >= collection.size()) {
            Object[] H3 = H(this.f3434m);
            w(H3, b02, it);
            this.f3434m = H3;
            this.f3435n = collection.size() + this.f3435n;
        } else {
            int size = ((collection.size() + b02) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] H4 = H(this.f3434m);
            w(H4, b02, it);
            objArr[0] = H4;
            for (int i2 = 1; i2 < size; i2++) {
                Object[] J3 = J();
                w(J3, 0, it);
                objArr[i2] = J3;
            }
            this.f3433l = P(this.f3433l, Y(), objArr);
            Object[] J4 = J();
            w(J4, 0, it);
            this.f3434m = J4;
            this.f3435n = collection.size() + this.f3435n;
        }
        return true;
    }
}
