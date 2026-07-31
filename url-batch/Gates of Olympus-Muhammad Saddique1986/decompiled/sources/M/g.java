package M;

import I.C0143d;
import O2.l;
import R1.p;
import a.AbstractC0235a;
import e2.InterfaceC0424c;
import g2.InterfaceC0440b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g extends S1.f implements Collection, InterfaceC0440b {

    /* renamed from: d, reason: collision with root package name */
    public c f3432d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f3433e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3434f;

    /* renamed from: g, reason: collision with root package name */
    public int f3435g;

    /* renamed from: h, reason: collision with root package name */
    public P.b f3436h = new P.b();

    /* renamed from: i, reason: collision with root package name */
    public Object[] f3437i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f3438j;

    /* renamed from: k, reason: collision with root package name */
    public int f3439k;

    public g(c cVar, Object[] objArr, Object[] objArr2, int i3) {
        this.f3432d = cVar;
        this.f3433e = objArr;
        this.f3434f = objArr2;
        this.f3435g = i3;
        this.f3437i = objArr;
        this.f3438j = objArr2;
        this.f3439k = cVar.b();
    }

    public static void i(Object[] objArr, int i3, Iterator it) {
        while (i3 < 32 && it.hasNext()) {
            objArr[i3] = it.next();
            i3++;
        }
    }

    public final int A(InterfaceC0424c interfaceC0424c, Object[] objArr, int i3, int i4, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f3427a;
        f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj2 = objArr[i5];
            if (!((Boolean) interfaceC0424c.n(obj2)).booleanValue()) {
                if (i4 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i4 = 0;
                }
                objArr3[i4] = obj2;
                i4++;
            }
        }
        eVar.f3427a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i4;
    }

    public final int B(InterfaceC0424c interfaceC0424c, Object[] objArr, int i3, e eVar) {
        Object[] objArr2 = objArr;
        int i4 = i3;
        boolean z3 = false;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (((Boolean) interfaceC0424c.n(obj)).booleanValue()) {
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
        eVar.f3427a = objArr2;
        return i4;
    }

    public final int C(InterfaceC0424c interfaceC0424c, int i3, e eVar) {
        int B3 = B(interfaceC0424c, this.f3438j, i3, eVar);
        if (B3 == i3) {
            return i3;
        }
        Object obj = eVar.f3427a;
        f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, B3, i3, (Object) null);
        this.f3438j = objArr;
        this.f3439k -= i3 - B3;
        return B3;
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
    public final boolean D(InterfaceC0424c interfaceC0424c) {
        Object[] w2;
        int i3;
        int J3 = J();
        Object[] objArr = null;
        e eVar = new e(null);
        boolean z3 = false;
        if (this.f3437i != null) {
            a o3 = o(0);
            int i4 = 32;
            int i5 = 32;
            while (i5 == 32 && o3.hasNext()) {
                i5 = B(interfaceC0424c, (Object[]) o3.next(), 32, eVar);
            }
            if (i5 == 32) {
                int C = C(interfaceC0424c, J3, eVar);
                if (C == 0) {
                    v(this.f3437i, this.f3439k, this.f3435g);
                }
            } else {
                int i6 = (o3.f3421d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i7 = i5;
                while (o3.hasNext()) {
                    i7 = A(interfaceC0424c, (Object[]) o3.next(), 32, i7, eVar, arrayList2, arrayList);
                    i6 = i6;
                    i4 = i4;
                }
                int i8 = i6;
                int A3 = A(interfaceC0424c, this.f3438j, J3, i7, eVar, arrayList2, arrayList);
                Object obj = eVar.f3427a;
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, A3, i4, (Object) null);
                if (arrayList.isEmpty()) {
                    w2 = this.f3437i;
                    f2.j.c(w2);
                } else {
                    w2 = w(this.f3437i, i8, this.f3435g, arrayList.iterator());
                }
                int size = i8 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C0143d.S("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f3435g = 0;
                } else {
                    int i9 = size - 1;
                    while (true) {
                        i3 = this.f3435g;
                        if ((i9 >> i3) != 0) {
                            break;
                        }
                        this.f3435g = i3 - 5;
                        Object[] objArr3 = w2[0];
                        f2.j.d(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        w2 = objArr3;
                    }
                    objArr = t(w2, i9, i3);
                }
                this.f3437i = objArr;
                this.f3438j = objArr2;
                this.f3439k = size + A3;
                z3 = true;
            }
            if (z3) {
                ((AbstractList) this).modCount++;
            }
            return z3;
        }
    }

    public final Object[] E(Object[] objArr, int i3, int i4, e eVar) {
        int h02 = l.h0(i4, i3);
        if (i3 == 0) {
            Object obj = objArr[h02];
            Object[] p3 = p(objArr);
            S1.k.m0(objArr, p3, h02, h02 + 1, 32);
            p3[31] = eVar.f3427a;
            eVar.f3427a = obj;
            return p3;
        }
        int h03 = objArr[31] == null ? l.h0(G() - 1, i3) : 31;
        Object[] p4 = p(objArr);
        int i5 = i3 - 5;
        int i6 = h02 + 1;
        if (i6 <= h03) {
            while (true) {
                Object obj2 = p4[h03];
                f2.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                p4[h03] = E((Object[]) obj2, i5, 0, eVar);
                if (h03 == i6) {
                    break;
                }
                h03--;
            }
        }
        Object obj3 = p4[h02];
        f2.j.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        p4[h02] = E((Object[]) obj3, i5, i4, eVar);
        return p4;
    }

    public final Object F(Object[] objArr, int i3, int i4, int i5) {
        int i6 = this.f3439k - i3;
        if (i6 == 1) {
            Object obj = this.f3438j[0];
            v(objArr, i3, i4);
            return obj;
        }
        Object[] objArr2 = this.f3438j;
        Object obj2 = objArr2[i5];
        Object[] p3 = p(objArr2);
        S1.k.m0(objArr2, p3, i5, i5 + 1, i6);
        p3[i6 - 1] = null;
        this.f3437i = objArr;
        this.f3438j = p3;
        this.f3439k = (i3 + i6) - 1;
        this.f3435g = i4;
        return obj2;
    }

    public final int G() {
        int i3 = this.f3439k;
        if (i3 <= 32) {
            return 0;
        }
        return (i3 - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        int h02 = l.h0(i4, i3);
        Object[] p3 = p(objArr);
        if (i3 != 0) {
            Object obj2 = p3[h02];
            f2.j.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            p3[h02] = H((Object[]) obj2, i3 - 5, i4, obj, eVar);
            return p3;
        }
        if (p3 != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f3427a = p3[h02];
        p3[h02] = obj;
        return p3;
    }

    public final void I(Collection collection, int i3, Object[] objArr, int i4, Object[][] objArr2, int i5, Object[] objArr3) {
        Object[] r3;
        if (i5 < 1) {
            C0143d.S("requires at least one nullBuffer");
            throw null;
        }
        Object[] p3 = p(objArr);
        objArr2[0] = p3;
        int i6 = i3 & 31;
        int size = ((collection.size() + i3) - 1) & 31;
        int i7 = (i4 - i6) + size;
        if (i7 < 32) {
            S1.k.m0(p3, objArr3, size + 1, i6, i4);
        } else {
            int i8 = i7 - 31;
            if (i5 == 1) {
                r3 = p3;
            } else {
                r3 = r();
                i5--;
                objArr2[i5] = r3;
            }
            int i9 = i4 - i8;
            S1.k.m0(p3, objArr3, 0, i9, i4);
            S1.k.m0(p3, r3, size + 1, i6, i9);
            objArr3 = r3;
        }
        Iterator it = collection.iterator();
        i(p3, i6, it);
        for (int i10 = 1; i10 < i5; i10++) {
            Object[] r4 = r();
            i(r4, 0, it);
            objArr2[i10] = r4;
        }
        i(objArr3, 0, it);
    }

    public final int J() {
        int i3 = this.f3439k;
        return i3 <= 32 ? i3 : i3 - ((i3 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        AbstractC0235a.m(i3, b());
        if (i3 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int G3 = G();
        if (i3 >= G3) {
            m(this.f3437i, i3 - G3, obj);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f3437i;
        f2.j.c(objArr);
        m(l(objArr, this.f3435g, i3, obj, eVar), 0, eVar.f3427a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        Object[] r3;
        AbstractC0235a.m(i3, this.f3439k);
        if (i3 == this.f3439k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i4 = (i3 >> 5) << 5;
        int size = ((collection.size() + (this.f3439k - i4)) - 1) / 32;
        if (size == 0) {
            int i5 = i3 & 31;
            int size2 = ((collection.size() + i3) - 1) & 31;
            Object[] objArr = this.f3438j;
            Object[] p3 = p(objArr);
            S1.k.m0(objArr, p3, size2 + 1, i5, J());
            i(p3, i5, collection.iterator());
            this.f3438j = p3;
            this.f3439k = collection.size() + this.f3439k;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int J3 = J();
        int size3 = collection.size() + this.f3439k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i3 >= G()) {
            r3 = r();
            I(collection, i3, this.f3438j, J3, objArr2, size, r3);
        } else if (size3 > J3) {
            int i6 = size3 - J3;
            r3 = q(this.f3438j, i6);
            k(collection, i3, i6, objArr2, size, r3);
        } else {
            Object[] objArr3 = this.f3438j;
            r3 = r();
            int i7 = J3 - size3;
            S1.k.m0(objArr3, r3, 0, i7, J3);
            int i8 = 32 - i7;
            Object[] q3 = q(this.f3438j, i8);
            int i9 = size - 1;
            objArr2[i9] = q3;
            k(collection, i3, i8, objArr2, i9, q3);
        }
        this.f3437i = x(this.f3437i, i4, objArr2);
        this.f3438j = r3;
        this.f3439k = collection.size() + this.f3439k;
        return true;
    }

    @Override // S1.f
    public final int b() {
        return this.f3439k;
    }

    @Override // S1.f
    public final Object c(int i3) {
        AbstractC0235a.l(i3, b());
        ((AbstractList) this).modCount++;
        int G3 = G();
        if (i3 >= G3) {
            return F(this.f3437i, G3, this.f3435g, i3 - G3);
        }
        e eVar = new e(this.f3438j[0]);
        Object[] objArr = this.f3437i;
        f2.j.c(objArr);
        F(E(objArr, this.f3435g, i3, eVar), G3, this.f3435g, 0);
        return eVar.f3427a;
    }

    public final c d() {
        c fVar;
        Object[] objArr = this.f3437i;
        if (objArr == this.f3433e && this.f3438j == this.f3434f) {
            fVar = this.f3432d;
        } else {
            this.f3436h = new P.b();
            this.f3433e = objArr;
            Object[] objArr2 = this.f3438j;
            this.f3434f = objArr2;
            if (objArr != null) {
                fVar = new f(objArr, objArr2, this.f3439k, this.f3435g);
            } else if (objArr2.length == 0) {
                fVar = j.f3446e;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f3438j, this.f3439k);
                f2.j.e(copyOf, "copyOf(this, newSize)");
                fVar = new j(copyOf);
            }
        }
        this.f3432d = fVar;
        return fVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        Object[] objArr;
        AbstractC0235a.l(i3, b());
        if (G() <= i3) {
            objArr = this.f3438j;
        } else {
            objArr = this.f3437i;
            f2.j.c(objArr);
            for (int i4 = this.f3435g; i4 > 0; i4 -= 5) {
                Object obj = objArr[l.h0(i3, i4)];
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
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
        if (this.f3437i == null) {
            throw new IllegalStateException("root is null");
        }
        int i6 = i3 >> 5;
        a o3 = o(G() >> 5);
        int i7 = i5;
        Object[] objArr3 = objArr2;
        while (o3.f3421d - 1 != i6) {
            Object[] objArr4 = (Object[]) o3.previous();
            S1.k.m0(objArr4, objArr3, 0, 32 - i4, 32);
            objArr3 = q(objArr4, i4);
            i7--;
            objArr[i7] = objArr3;
        }
        Object[] objArr5 = (Object[]) o3.previous();
        int G3 = i5 - (((G() >> 5) - 1) - i6);
        if (G3 < i5) {
            objArr2 = objArr[G3];
            f2.j.c(objArr2);
        }
        I(collection, i3, objArr5, 32, objArr, G3, objArr2);
    }

    public final Object[] l(Object[] objArr, int i3, int i4, Object obj, e eVar) {
        Object obj2;
        int h02 = l.h0(i4, i3);
        if (i3 == 0) {
            eVar.f3427a = objArr[31];
            Object[] p3 = p(objArr);
            S1.k.m0(objArr, p3, h02 + 1, h02, 31);
            p3[h02] = obj;
            return p3;
        }
        Object[] p4 = p(objArr);
        int i5 = i3 - 5;
        Object obj3 = p4[h02];
        f2.j.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        p4[h02] = l((Object[]) obj3, i5, i4, obj, eVar);
        while (true) {
            h02++;
            if (h02 >= 32 || (obj2 = p4[h02]) == null) {
                break;
            }
            p4[h02] = l((Object[]) obj2, i5, 0, eVar.f3427a, eVar);
        }
        return p4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        AbstractC0235a.m(i3, this.f3439k);
        return new i(this, i3);
    }

    public final void m(Object[] objArr, int i3, Object obj) {
        int J3 = J();
        Object[] p3 = p(this.f3438j);
        if (J3 < 32) {
            S1.k.m0(this.f3438j, p3, i3 + 1, i3, J3);
            p3[i3] = obj;
            this.f3437i = objArr;
            this.f3438j = p3;
            this.f3439k++;
            return;
        }
        Object[] objArr2 = this.f3438j;
        Object obj2 = objArr2[31];
        S1.k.m0(objArr2, p3, i3 + 1, i3, 31);
        p3[i3] = obj;
        y(objArr, p3, s(obj2));
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f3436h;
    }

    public final a o(int i3) {
        Object[] objArr = this.f3437i;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int G3 = G() >> 5;
        AbstractC0235a.m(i3, G3);
        int i4 = this.f3435g;
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
        S1.k.o0(objArr, r3, 0, length, 6);
        return r3;
    }

    public final Object[] q(Object[] objArr, int i3) {
        if (n(objArr)) {
            S1.k.m0(objArr, objArr, i3, 0, 32 - i3);
            return objArr;
        }
        Object[] r3 = r();
        S1.k.m0(objArr, r3, i3, 0, 32 - i3);
        return r3;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f3436h;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new b(1, collection));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f3436h;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        AbstractC0235a.l(i3, b());
        if (G() > i3) {
            e eVar = new e(null);
            Object[] objArr = this.f3437i;
            f2.j.c(objArr);
            this.f3437i = H(objArr, this.f3435g, i3, obj, eVar);
            return eVar.f3427a;
        }
        Object[] p3 = p(this.f3438j);
        if (p3 != this.f3438j) {
            ((AbstractList) this).modCount++;
        }
        int i4 = i3 & 31;
        Object obj2 = p3[i4];
        p3[i4] = obj;
        this.f3438j = p3;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i3, int i4) {
        if (!(i4 >= 0)) {
            C0143d.S("shift should be positive");
            throw null;
        }
        if (i4 == 0) {
            return objArr;
        }
        int h02 = l.h0(i3, i4);
        Object obj = objArr[h02];
        f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object t3 = t((Object[]) obj, i3, i4 - 5);
        if (h02 < 31) {
            int i5 = h02 + 1;
            if (objArr[i5] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i5, 32, (Object) null);
                }
                Object[] r3 = r();
                S1.k.m0(objArr, r3, 0, 0, i5);
                objArr = r3;
            }
        }
        if (t3 == objArr[h02]) {
            return objArr;
        }
        Object[] p3 = p(objArr);
        p3[h02] = t3;
        return p3;
    }

    public final Object[] u(Object[] objArr, int i3, int i4, e eVar) {
        Object[] u3;
        int h02 = l.h0(i4 - 1, i3);
        if (i3 == 5) {
            eVar.f3427a = objArr[h02];
            u3 = null;
        } else {
            Object obj = objArr[h02];
            f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            u3 = u((Object[]) obj, i3 - 5, i4, eVar);
        }
        if (u3 == null && h02 == 0) {
            return null;
        }
        Object[] p3 = p(objArr);
        p3[h02] = u3;
        return p3;
    }

    public final void v(Object[] objArr, int i3, int i4) {
        if (i4 == 0) {
            this.f3437i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f3438j = objArr;
            this.f3439k = i3;
            this.f3435g = i4;
            return;
        }
        e eVar = new e(null);
        f2.j.c(objArr);
        Object[] u3 = u(objArr, i4, i3, eVar);
        f2.j.c(u3);
        Object obj = eVar.f3427a;
        f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f3438j = (Object[]) obj;
        this.f3439k = i3;
        if (u3[1] == null) {
            this.f3437i = (Object[]) u3[0];
            this.f3435g = i4 - 5;
        } else {
            this.f3437i = u3;
            this.f3435g = i4;
        }
    }

    public final Object[] w(Object[] objArr, int i3, int i4, Iterator it) {
        if (!it.hasNext()) {
            C0143d.S("invalid buffersIterator");
            throw null;
        }
        if (!(i4 >= 0)) {
            C0143d.S("negative shift");
            throw null;
        }
        if (i4 == 0) {
            return (Object[]) it.next();
        }
        Object[] p3 = p(objArr);
        int h02 = l.h0(i3, i4);
        int i5 = i4 - 5;
        p3[h02] = w((Object[]) p3[h02], i3, i5, it);
        while (true) {
            h02++;
            if (h02 >= 32 || !it.hasNext()) {
                break;
            }
            p3[h02] = w((Object[]) p3[h02], 0, i5, it);
        }
        return p3;
    }

    public final Object[] x(Object[] objArr, int i3, Object[][] objArr2) {
        p h3 = f2.j.h(objArr2);
        int i4 = i3 >> 5;
        int i5 = this.f3435g;
        Object[] w2 = i4 < (1 << i5) ? w(objArr, i3, i5, h3) : p(objArr);
        while (h3.hasNext()) {
            this.f3435g += 5;
            w2 = s(w2);
            int i6 = this.f3435g;
            w(w2, 1 << i6, i6, h3);
        }
        return w2;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f3439k;
        int i4 = i3 >> 5;
        int i5 = this.f3435g;
        if (i4 > (1 << i5)) {
            this.f3437i = z(this.f3435g + 5, s(objArr), objArr2);
            this.f3438j = objArr3;
            this.f3435g += 5;
            this.f3439k++;
            return;
        }
        if (objArr == null) {
            this.f3437i = objArr2;
            this.f3438j = objArr3;
            this.f3439k = i3 + 1;
        } else {
            this.f3437i = z(i5, objArr, objArr2);
            this.f3438j = objArr3;
            this.f3439k++;
        }
    }

    public final Object[] z(int i3, Object[] objArr, Object[] objArr2) {
        int h02 = l.h0(b() - 1, i3);
        Object[] p3 = p(objArr);
        if (i3 == 5) {
            p3[h02] = objArr2;
        } else {
            p3[h02] = z(i3 - 5, (Object[]) p3[h02], objArr2);
        }
        return p3;
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
            Object[] p3 = p(this.f3438j);
            p3[J3] = obj;
            this.f3438j = p3;
            this.f3439k = b() + 1;
        } else {
            y(this.f3437i, this.f3438j, s(obj));
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
            Object[] p3 = p(this.f3438j);
            i(p3, J3, it);
            this.f3438j = p3;
            this.f3439k = collection.size() + this.f3439k;
        } else {
            int size = ((collection.size() + J3) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] p4 = p(this.f3438j);
            i(p4, J3, it);
            objArr[0] = p4;
            for (int i3 = 1; i3 < size; i3++) {
                Object[] r3 = r();
                i(r3, 0, it);
                objArr[i3] = r3;
            }
            this.f3437i = x(this.f3437i, G(), objArr);
            Object[] r4 = r();
            i(r4, 0, it);
            this.f3438j = r4;
            this.f3439k = collection.size() + this.f3439k;
        }
        return true;
    }
}
