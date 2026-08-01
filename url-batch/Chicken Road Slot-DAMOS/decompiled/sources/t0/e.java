package t0;

import b1.t;
import hd.u;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.i0;
import kotlin.collections.l;
import kotlin.collections.v;
import kotlin.jvm.functions.Function1;
import n0.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends l implements Collection, xd.b {

    /* renamed from: d, reason: collision with root package name */
    public b f9204d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f9205e;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f9206i;

    /* renamed from: r, reason: collision with root package name */
    public int f9207r;

    /* renamed from: s, reason: collision with root package name */
    public w0.b f9208s = new w0.b();

    /* renamed from: t, reason: collision with root package name */
    public Object[] f9209t;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f9210u;

    /* renamed from: v, reason: collision with root package name */
    public int f9211v;

    public e(b bVar, Object[] objArr, Object[] objArr2, int i3) {
        this.f9204d = bVar;
        this.f9205e = objArr;
        this.f9206i = objArr2;
        this.f9207r = i3;
        this.f9209t = objArr;
        this.f9210u = objArr2;
        this.f9211v = bVar.size();
    }

    public static void f(Object[] objArr, int i3, Iterator it) {
        while (i3 < 32 && it.hasNext()) {
            objArr[i3] = it.next();
            i3++;
        }
    }

    public final int A(Function1 function1, Object[] objArr, int i3, f2.a aVar) {
        Object[] objArr2 = objArr;
        int i10 = i3;
        boolean z10 = false;
        for (int i11 = 0; i11 < i3; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = o(objArr);
                    z10 = true;
                    i10 = i11;
                }
            } else if (z10) {
                objArr2[i10] = obj;
                i10++;
            }
        }
        aVar.f4064d = objArr2;
        return i10;
    }

    public final int B(Function1 function1, int i3, f2.a aVar) {
        int A = A(function1, this.f9210u, i3, aVar);
        Object obj = aVar.f4064d;
        if (A == i3) {
            return i3;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, A, i3, (Object) null);
        this.f9210u = objArr;
        this.f9211v -= i3 - A;
        return A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (B(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Function1 function1) {
        int i3;
        Function1 function12 = function1;
        int I = I();
        Object[] objArr = null;
        f2.a aVar = new f2.a(null);
        boolean z10 = false;
        if (this.f9209t != null) {
            a n10 = n(0);
            int i10 = 32;
            while (i10 == 32 && n10.hasNext()) {
                i10 = A(function12, (Object[]) n10.next(), 32, aVar);
            }
            if (i10 == 32) {
                int B = B(function12, I, aVar);
                if (B == 0) {
                    u(this.f9209t, this.f9211v, this.f9207r);
                }
            } else {
                int i11 = (n10.f9196d - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i12 = i10;
                while (n10.hasNext()) {
                    i12 = z(function12, (Object[]) n10.next(), 32, i12, aVar, arrayList2, arrayList);
                    function12 = function1;
                }
                int z11 = z(function1, this.f9210u, I, i12, aVar, arrayList2, arrayList);
                Object obj = aVar.f4064d;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, z11, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.f9209t;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = v(objArr3, i11, this.f9207r, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    n1.a("invalid size");
                }
                if (size == 0) {
                    this.f9207r = 0;
                } else {
                    int i13 = size - 1;
                    while (true) {
                        i3 = this.f9207r;
                        if ((i13 >> i3) != 0) {
                            break;
                        }
                        this.f9207r = i3 - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = s(objArr3, i13, i3);
                }
                this.f9209t = objArr;
                this.f9210u = objArr2;
                this.f9211v = size + z11;
            }
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] D(Object[] objArr, int i3, int i10, f2.a aVar) {
        int x10 = k7.e.x(i10, i3);
        if (i3 == 0) {
            Object obj = objArr[x10];
            Object[] o6 = o(objArr);
            v.d(x10, x10 + 1, 32, objArr, o6);
            o6[31] = aVar.f4064d;
            aVar.f4064d = obj;
            return o6;
        }
        int x11 = objArr[31] == null ? k7.e.x(F() - 1, i3) : 31;
        Object[] o10 = o(objArr);
        int i11 = i3 - 5;
        int i12 = x10 + 1;
        if (i12 <= x11) {
            while (true) {
                Object obj2 = o10[x11];
                obj2.getClass();
                o10[x11] = D((Object[]) obj2, i11, 0, aVar);
                if (x11 == i12) {
                    break;
                }
                x11--;
            }
        }
        Object obj3 = o10[x10];
        obj3.getClass();
        o10[x10] = D((Object[]) obj3, i11, i10, aVar);
        return o10;
    }

    public final Object E(Object[] objArr, int i3, int i10, int i11) {
        int i12 = this.f9211v - i3;
        Object[] objArr2 = this.f9210u;
        if (i12 == 1) {
            Object obj = objArr2[0];
            u(objArr, i3, i10);
            return obj;
        }
        Object obj2 = objArr2[i11];
        Object[] o6 = o(objArr2);
        v.d(i11, i11 + 1, i12, objArr2, o6);
        o6[i12 - 1] = null;
        this.f9209t = objArr;
        this.f9210u = o6;
        this.f9211v = (i3 + i12) - 1;
        this.f9207r = i10;
        return obj2;
    }

    public final int F() {
        int i3 = this.f9211v;
        if (i3 <= 32) {
            return 0;
        }
        return (i3 - 1) & (-32);
    }

    public final Object[] G(Object[] objArr, int i3, int i10, Object obj, f2.a aVar) {
        int x10 = k7.e.x(i10, i3);
        Object[] o6 = o(objArr);
        if (i3 != 0) {
            Object obj2 = o6[x10];
            obj2.getClass();
            o6[x10] = G((Object[]) obj2, i3 - 5, i10, obj, aVar);
            return o6;
        }
        if (o6 != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.f4064d = o6[x10];
        o6[x10] = obj;
        return o6;
    }

    public final void H(Collection collection, int i3, Object[] objArr, int i10, Object[][] objArr2, int i11, Object[] objArr3) {
        Object[] q3;
        if (i11 < 1) {
            n1.a("requires at least one nullBuffer");
        }
        Object[] o6 = o(objArr);
        objArr2[0] = o6;
        int i12 = i3 & 31;
        int size = ((collection.size() + i3) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            v.d(size + 1, i12, i10, o6, objArr3);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                q3 = o6;
            } else {
                q3 = q();
                i11--;
                objArr2[i11] = q3;
            }
            int i15 = i10 - i14;
            v.d(0, i15, i10, o6, objArr3);
            v.d(size + 1, i12, i15, o6, q3);
            objArr3 = q3;
        }
        Iterator it = collection.iterator();
        f(o6, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            Object[] q7 = q();
            f(q7, 0, it);
            objArr2[i16] = q7;
        }
        f(objArr3, 0, it);
    }

    public final int I() {
        int i3 = this.f9211v;
        return i3 <= 32 ? i3 : i3 - ((i3 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        i7.a.C(i3, b());
        if (i3 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int F = F();
        if (i3 >= F) {
            k(i3 - F, obj, this.f9209t);
            return;
        }
        f2.a aVar = new f2.a(null);
        Object[] objArr = this.f9209t;
        objArr.getClass();
        k(0, aVar.f4064d, i(objArr, this.f9207r, i3, obj, aVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        Collection collection2;
        e eVar;
        Object[] q3;
        i7.a.C(i3, this.f9211v);
        if (i3 == this.f9211v) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i3 >> 5) << 5;
        int size = ((collection.size() + (this.f9211v - i10)) - 1) / 32;
        if (size == 0) {
            int i11 = i3 & 31;
            int size2 = ((collection.size() + i3) - 1) & 31;
            Object[] objArr = this.f9210u;
            Object[] o6 = o(objArr);
            v.d(size2 + 1, i11, I(), objArr, o6);
            f(o6, i11, collection.iterator());
            this.f9210u = o6;
            this.f9211v = collection.size() + this.f9211v;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int I = I();
        int size3 = collection.size() + this.f9211v;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i3 >= F()) {
            q3 = q();
            collection2 = collection;
            H(collection2, i3, this.f9210u, I, objArr2, size, q3);
            eVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            eVar = this;
            Object[] objArr3 = eVar.f9210u;
            if (size3 > I) {
                int i12 = size3 - I;
                Object[] p4 = p(i12, objArr3);
                eVar.h(collection2, i3, i12, objArr2, size, p4);
                objArr2 = objArr2;
                q3 = p4;
            } else {
                q3 = q();
                int i13 = I - size3;
                v.d(0, i13, I, objArr3, q3);
                int i14 = 32 - i13;
                Object[] p10 = p(i14, eVar.f9210u);
                int i15 = size - 1;
                objArr2[i15] = p10;
                eVar.h(collection2, i3, i14, objArr2, i15, p10);
                collection2 = collection2;
            }
        }
        eVar.f9209t = w(eVar.f9209t, i10, objArr2);
        eVar.f9210u = q3;
        eVar.f9211v = collection2.size() + eVar.f9211v;
        return true;
    }

    @Override // kotlin.collections.l
    public final int b() {
        return this.f9211v;
    }

    @Override // kotlin.collections.l
    public final Object c(int i3) {
        i7.a.w(i3, b());
        ((AbstractList) this).modCount++;
        int F = F();
        if (i3 >= F) {
            return E(this.f9209t, F, this.f9207r, i3 - F);
        }
        f2.a aVar = new f2.a(this.f9210u[0]);
        Object[] objArr = this.f9209t;
        objArr.getClass();
        E(D(objArr, this.f9207r, i3, aVar), F, this.f9207r, 0);
        return aVar.f4064d;
    }

    public final b e() {
        b dVar;
        Object[] objArr = this.f9209t;
        if (objArr == this.f9205e && this.f9210u == this.f9206i) {
            dVar = this.f9204d;
        } else {
            this.f9208s = new w0.b();
            this.f9205e = objArr;
            Object[] objArr2 = this.f9210u;
            this.f9206i = objArr2;
            if (objArr == null) {
                dVar = objArr2.length == 0 ? h.f9218i : new h(Arrays.copyOf(this.f9210u, b()));
            } else {
                Object[] objArr3 = this.f9209t;
                objArr3.getClass();
                dVar = new d(objArr3, this.f9210u, b(), this.f9207r);
            }
        }
        this.f9204d = dVar;
        return dVar;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        Object[] objArr;
        i7.a.w(i3, b());
        if (F() <= i3) {
            objArr = this.f9210u;
        } else {
            objArr = this.f9209t;
            objArr.getClass();
            for (int i10 = this.f9207r; i10 > 0; i10 -= 5) {
                Object obj = objArr[k7.e.x(i3, i10)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i3 & 31];
    }

    public final void h(Collection collection, int i3, int i10, Object[][] objArr, int i11, Object[] objArr2) {
        if (this.f9209t == null) {
            i0.l("root is null");
            return;
        }
        int i12 = i3 >> 5;
        a n10 = n(F() >> 5);
        int i13 = i11;
        Object[] objArr3 = objArr2;
        while (n10.f9196d - 1 != i12) {
            Object[] objArr4 = (Object[]) n10.previous();
            v.d(0, 32 - i10, 32, objArr4, objArr3);
            objArr3 = p(i10, objArr4);
            i13--;
            objArr[i13] = objArr3;
        }
        Object[] objArr5 = (Object[]) n10.previous();
        int F = i11 - (((F() >> 5) - 1) - i12);
        if (F < i11) {
            objArr2 = objArr[F];
            objArr2.getClass();
        }
        H(collection, i3, objArr5, 32, objArr, F, objArr2);
    }

    public final Object[] i(Object[] objArr, int i3, int i10, Object obj, f2.a aVar) {
        Object obj2;
        int x10 = k7.e.x(i10, i3);
        if (i3 == 0) {
            aVar.f4064d = objArr[31];
            Object[] o6 = o(objArr);
            v.d(x10 + 1, x10, 31, objArr, o6);
            o6[x10] = obj;
            return o6;
        }
        Object[] o10 = o(objArr);
        int i11 = i3 - 5;
        Object obj3 = o10[x10];
        obj3.getClass();
        o10[x10] = i((Object[]) obj3, i11, i10, obj, aVar);
        while (true) {
            x10++;
            if (x10 >= 32 || (obj2 = o10[x10]) == null) {
                break;
            }
            o10[x10] = i((Object[]) obj2, i11, 0, aVar.f4064d, aVar);
        }
        return o10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i3, Object obj, Object[] objArr) {
        int I = I();
        Object[] o6 = o(this.f9210u);
        Object[] objArr2 = this.f9210u;
        if (I >= 32) {
            Object obj2 = objArr2[31];
            v.d(i3 + 1, i3, 31, objArr2, o6);
            o6[i3] = obj;
            x(objArr, o6, r(obj2));
            return;
        }
        v.d(i3 + 1, i3, I, objArr2, o6);
        o6[i3] = obj;
        this.f9209t = objArr;
        this.f9210u = o6;
        this.f9211v++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        i7.a.C(i3, this.f9211v);
        return new g(this, i3);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f9208s;
    }

    public final a n(int i3) {
        Object[] objArr = this.f9209t;
        if (objArr == null) {
            i0.l("Invalid root");
            return null;
        }
        int F = F() >> 5;
        i7.a.C(i3, F);
        int i10 = this.f9207r;
        return i10 == 0 ? new c(i3, objArr) : new i(objArr, i3, F, i10 / 5);
    }

    public final Object[] o(Object[] objArr) {
        if (objArr == null) {
            return q();
        }
        if (m(objArr)) {
            return objArr;
        }
        Object[] q3 = q();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        v.g(0, length, 6, objArr, q3);
        return q3;
    }

    public final Object[] p(int i3, Object[] objArr) {
        if (m(objArr)) {
            v.d(i3, 0, 32 - i3, objArr, objArr);
            return objArr;
        }
        Object[] q3 = q();
        v.d(i3, 0, 32 - i3, objArr, q3);
        return q3;
    }

    public final Object[] q() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f9208s;
        return objArr;
    }

    public final Object[] r(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f9208s;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return C(new t(2, collection));
    }

    public final Object[] s(Object[] objArr, int i3, int i10) {
        if (i10 < 0) {
            n1.a("shift should be positive");
        }
        if (i10 == 0) {
            return objArr;
        }
        int x10 = k7.e.x(i3, i10);
        Object obj = objArr[x10];
        obj.getClass();
        Object s3 = s((Object[]) obj, i3, i10 - 5);
        if (x10 < 31) {
            int i11 = x10 + 1;
            if (objArr[i11] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i11, 32, (Object) null);
                }
                Object[] q3 = q();
                v.d(0, 0, i11, objArr, q3);
                objArr = q3;
            }
        }
        if (s3 == objArr[x10]) {
            return objArr;
        }
        Object[] o6 = o(objArr);
        o6[x10] = s3;
        return o6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        i7.a.w(i3, b());
        if (F() > i3) {
            f2.a aVar = new f2.a(null);
            Object[] objArr = this.f9209t;
            objArr.getClass();
            this.f9209t = G(objArr, this.f9207r, i3, obj, aVar);
            return aVar.f4064d;
        }
        Object[] o6 = o(this.f9210u);
        if (o6 != this.f9210u) {
            ((AbstractList) this).modCount++;
        }
        int i10 = i3 & 31;
        Object obj2 = o6[i10];
        o6[i10] = obj;
        this.f9210u = o6;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i3, int i10, f2.a aVar) {
        Object[] t6;
        int x10 = k7.e.x(i10 - 1, i3);
        if (i3 == 5) {
            aVar.f4064d = objArr[x10];
            t6 = null;
        } else {
            Object obj = objArr[x10];
            obj.getClass();
            t6 = t((Object[]) obj, i3 - 5, i10, aVar);
        }
        if (t6 == null && x10 == 0) {
            return null;
        }
        Object[] o6 = o(objArr);
        o6[x10] = t6;
        return o6;
    }

    public final void u(Object[] objArr, int i3, int i10) {
        if (i10 == 0) {
            this.f9209t = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f9210u = objArr;
            this.f9211v = i3;
            this.f9207r = i10;
            return;
        }
        f2.a aVar = new f2.a(null);
        objArr.getClass();
        Object[] t6 = t(objArr, i10, i3, aVar);
        t6.getClass();
        Object obj = aVar.f4064d;
        obj.getClass();
        this.f9210u = (Object[]) obj;
        this.f9211v = i3;
        if (t6[1] == null) {
            this.f9209t = (Object[]) t6[0];
            this.f9207r = i10 - 5;
        } else {
            this.f9209t = t6;
            this.f9207r = i10;
        }
    }

    public final Object[] v(Object[] objArr, int i3, int i10, Iterator it) {
        if (!it.hasNext()) {
            n1.a("invalid buffersIterator");
        }
        if (!(i10 >= 0)) {
            n1.a("negative shift");
        }
        if (i10 == 0) {
            return (Object[]) it.next();
        }
        Object[] o6 = o(objArr);
        int x10 = k7.e.x(i3, i10);
        int i11 = i10 - 5;
        o6[x10] = v((Object[]) o6[x10], i3, i11, it);
        while (true) {
            x10++;
            if (x10 >= 32 || !it.hasNext()) {
                break;
            }
            o6[x10] = v((Object[]) o6[x10], 0, i11, it);
        }
        return o6;
    }

    public final Object[] w(Object[] objArr, int i3, Object[][] objArr2) {
        u uVar = new u(objArr2);
        int i10 = i3 >> 5;
        int i11 = this.f9207r;
        Object[] v10 = i10 < (1 << i11) ? v(objArr, i3, i11, uVar) : o(objArr);
        while (uVar.hasNext()) {
            this.f9207r += 5;
            v10 = r(v10);
            int i12 = this.f9207r;
            v(v10, 1 << i12, i12, uVar);
        }
        return v10;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i3 = this.f9211v;
        int i10 = i3 >> 5;
        int i11 = this.f9207r;
        if (i10 > (1 << i11)) {
            this.f9209t = y(this.f9207r + 5, r(objArr), objArr2);
            this.f9210u = objArr3;
            this.f9207r += 5;
            this.f9211v++;
            return;
        }
        if (objArr == null) {
            this.f9209t = objArr2;
            this.f9210u = objArr3;
            this.f9211v = i3 + 1;
        } else {
            this.f9209t = y(i11, objArr, objArr2);
            this.f9210u = objArr3;
            this.f9211v++;
        }
    }

    public final Object[] y(int i3, Object[] objArr, Object[] objArr2) {
        int x10 = k7.e.x(b() - 1, i3);
        Object[] o6 = o(objArr);
        if (i3 == 5) {
            o6[x10] = objArr2;
            return o6;
        }
        o6[x10] = y(i3 - 5, (Object[]) o6[x10], objArr2);
        return o6;
    }

    public final int z(Function1 function1, Object[] objArr, int i3, int i10, f2.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f4064d;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i11 = 0; i11 < i3; i11++) {
            Object obj2 = objArr[i11];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i10 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : q();
                    i10 = 0;
                }
                objArr3[i10] = obj2;
                i10++;
            }
        }
        aVar.f4064d = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int I = I();
        if (I < 32) {
            Object[] o6 = o(this.f9210u);
            o6[I] = obj;
            this.f9210u = o6;
            this.f9211v = b() + 1;
        } else {
            x(this.f9209t, this.f9210u, r(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        Iterator it = collection.iterator();
        if (32 - I >= collection.size()) {
            Object[] o6 = o(this.f9210u);
            f(o6, I, it);
            this.f9210u = o6;
            this.f9211v = collection.size() + this.f9211v;
            return true;
        }
        int size = ((collection.size() + I) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] o10 = o(this.f9210u);
        f(o10, I, it);
        objArr[0] = o10;
        for (int i3 = 1; i3 < size; i3++) {
            Object[] q3 = q();
            f(q3, 0, it);
            objArr[i3] = q3;
        }
        this.f9209t = w(this.f9209t, F(), objArr);
        Object[] q7 = q();
        f(q7, 0, it);
        this.f9210u = q7;
        this.f9211v = collection.size() + this.f9211v;
        return true;
    }
}
