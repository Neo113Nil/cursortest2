package n0;

import j.AbstractC0495m;
import j.C0494l;
import j.C0504v;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC0522a;
import r0.InterfaceC0838k;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.a0;
import t0.l0;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    public final U.k f6205b;

    /* renamed from: c, reason: collision with root package name */
    public final E2.n f6206c;

    /* renamed from: d, reason: collision with root package name */
    public final C0494l f6207d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f6208e;

    /* renamed from: f, reason: collision with root package name */
    public g f6209f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6210g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6211h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6212i;

    public e(U.k kVar) {
        super(0);
        this.f6205b = kVar;
        E2.n nVar = new E2.n();
        nVar.f844c = new long[2];
        this.f6206c = nVar;
        this.f6207d = new C0494l(2);
        this.f6211h = true;
        this.f6212i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // n0.f
    public final boolean a(C0494l c0494l, InterfaceC0838k interfaceC0838k, C2.c cVar, boolean z3) {
        C0494l c0494l2;
        E2.n nVar;
        Object obj;
        boolean z4;
        boolean z5;
        boolean z6;
        g gVar;
        boolean z7;
        int i3;
        int i4;
        int i5;
        long j3;
        List list;
        boolean a3 = super.a(c0494l, interfaceC0838k, cVar, z3);
        AbstractC0905m abstractC0905m = this.f6205b;
        if (!abstractC0905m.p) {
            return true;
        }
        ?? r8 = 0;
        while (abstractC0905m != 0) {
            if (abstractC0905m instanceof l0) {
                this.f6208e = AbstractC0898f.r((l0) abstractC0905m, 16);
            } else if ((abstractC0905m.f3305f & 16) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                U.k kVar = abstractC0905m.f7937r;
                int i6 = 0;
                abstractC0905m = abstractC0905m;
                r8 = r8;
                while (kVar != null) {
                    if ((kVar.f3305f & 16) != 0) {
                        i6++;
                        r8 = r8;
                        if (i6 == 1) {
                            abstractC0905m = kVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new K.d(new U.k[16]);
                            }
                            if (abstractC0905m != 0) {
                                r8.b(abstractC0905m);
                                abstractC0905m = 0;
                            }
                            r8.b(kVar);
                        }
                    }
                    kVar = kVar.f3308i;
                    abstractC0905m = abstractC0905m;
                    r8 = r8;
                }
                if (i6 == 1) {
                }
            }
            abstractC0905m = AbstractC0898f.f(r8);
        }
        int c3 = c0494l.c();
        int i7 = 0;
        while (true) {
            c0494l2 = this.f6207d;
            nVar = this.f6206c;
            if (i7 >= c3) {
                break;
            }
            long a4 = c0494l.a(i7);
            m mVar = (m) c0494l.d(i7);
            if (nVar.b(a4)) {
                long j4 = mVar.f6229g;
                if (a0.c.f(j4)) {
                    long j5 = mVar.f6225c;
                    if (a0.c.f(j5)) {
                        List list2 = mVar.f6233k;
                        List list3 = M1.u.f2803d;
                        if (list2 == null) {
                            list2 = list3;
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        List list4 = mVar.f6233k;
                        i3 = c3;
                        if (list4 == null) {
                            list4 = list3;
                        }
                        int size = list4.size();
                        z7 = a3;
                        int i8 = 0;
                        while (i8 < size) {
                            int i9 = size;
                            C0672b c0672b = (C0672b) list4.get(i8);
                            long j6 = a4;
                            long j7 = c0672b.f6196b;
                            if (a0.c.f(j7)) {
                                list = list4;
                                a0 a0Var = this.f6208e;
                                Z1.i.c(a0Var);
                                long J02 = a0Var.J0(interfaceC0838k, j7);
                                i5 = i7;
                                j3 = j5;
                                arrayList.add(new C0672b(c0672b.f6195a, J02, c0672b.f6197c));
                            } else {
                                i5 = i7;
                                j3 = j5;
                                list = list4;
                            }
                            i8++;
                            i7 = i5;
                            list4 = list;
                            size = i9;
                            j5 = j3;
                            a4 = j6;
                        }
                        i4 = i7;
                        a0 a0Var2 = this.f6208e;
                        Z1.i.c(a0Var2);
                        long J03 = a0Var2.J0(interfaceC0838k, j4);
                        a0 a0Var3 = this.f6208e;
                        Z1.i.c(a0Var3);
                        m mVar2 = new m(mVar.f6223a, mVar.f6224b, a0Var3.J0(interfaceC0838k, j5), mVar.f6226d, mVar.f6227e, mVar.f6228f, J03, mVar.f6230h, mVar.f6231i, arrayList, mVar.f6232j, mVar.f6234l);
                        mVar2.f6235m = mVar.f6235m;
                        c0494l2.b(a4, mVar2);
                        i7 = i4 + 1;
                        c3 = i3;
                        a3 = z7;
                    }
                }
            }
            z7 = a3;
            i3 = c3;
            i4 = i7;
            i7 = i4 + 1;
            c3 = i3;
            a3 = z7;
        }
        boolean z8 = a3;
        if (c0494l2.c() == 0) {
            nVar.f843b = 0;
            this.f6213a.h();
            return true;
        }
        for (int i10 = nVar.f843b - 1; -1 < i10; i10--) {
            long j8 = ((long[]) nVar.f844c)[i10];
            if (c0494l.f5169d) {
                int i11 = c0494l.f5172g;
                long[] jArr = c0494l.f5170e;
                Object[] objArr = c0494l.f5171f;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != AbstractC0495m.f5173a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                c0494l.f5169d = false;
                c0494l.f5172g = i12;
            }
            if (AbstractC0522a.b(c0494l.f5170e, c0494l.f5172g, j8) < 0) {
                nVar.e(i10);
            }
        }
        ArrayList arrayList2 = new ArrayList(c0494l2.c());
        int c4 = c0494l2.c();
        for (int i14 = 0; i14 < c4; i14++) {
            arrayList2.add(c0494l2.d(i14));
        }
        g gVar2 = new g(arrayList2, cVar);
        int size2 = arrayList2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i15);
            if (cVar.g(((m) obj).f6223a)) {
                break;
            }
            i15++;
        }
        m mVar3 = (m) obj;
        if (mVar3 != null) {
            boolean z9 = mVar3.f6226d;
            if (z3) {
                z4 = false;
                if (!this.f6211h && (z9 || mVar3.f6230h)) {
                    a0 a0Var4 = this.f6208e;
                    Z1.i.c(a0Var4);
                    boolean e3 = s.e(mVar3, a0Var4.f7116f);
                    z5 = true;
                    this.f6211h = !e3;
                    if (this.f6211h == this.f6210g && (s.c(gVar2.f6215b, 3) || s.c(gVar2.f6215b, 4) || s.c(gVar2.f6215b, 5))) {
                        gVar2.f6215b = this.f6211h ? 4 : 5;
                    } else if (!s.c(gVar2.f6215b, 4) && this.f6210g && !this.f6212i) {
                        gVar2.f6215b = 3;
                    } else if (s.c(gVar2.f6215b, 5) && this.f6211h && z9) {
                        gVar2.f6215b = 3;
                    }
                }
            } else {
                z4 = false;
                this.f6211h = false;
            }
            z5 = true;
            if (this.f6211h == this.f6210g) {
            }
            if (!s.c(gVar2.f6215b, 4)) {
            }
            if (s.c(gVar2.f6215b, 5)) {
                gVar2.f6215b = 3;
            }
        } else {
            z4 = false;
            z5 = true;
        }
        if (!z8 && s.c(gVar2.f6215b, 3) && (gVar = this.f6209f) != null) {
            ?? r12 = gVar.f6214a;
            int size3 = r12.size();
            ?? r5 = gVar2.f6214a;
            if (size3 == r5.size()) {
                int size4 = r5.size();
                for (?? r7 = z4; r7 < size4; r7++) {
                    if (a0.c.b(((m) r12.get(r7)).f6225c, ((m) r5.get(r7)).f6225c)) {
                    }
                }
                z6 = z4;
                this.f6209f = gVar2;
                return z6;
            }
        }
        z6 = z5;
        this.f6209f = gVar2;
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // n0.f
    public final void c(C2.c cVar) {
        super.c(cVar);
        g gVar = this.f6209f;
        if (gVar == null) {
            return;
        }
        this.f6210g = this.f6211h;
        ?? r12 = gVar.f6214a;
        int size = r12.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) r12.get(i3);
            boolean z3 = mVar.f6226d;
            long j3 = mVar.f6223a;
            boolean g3 = cVar.g(j3);
            boolean z4 = this.f6211h;
            if ((!z3 && !g3) || (!z3 && !z4)) {
                E2.n nVar = this.f6206c;
                int i4 = nVar.f843b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    if (j3 == ((long[]) nVar.f844c)[i5]) {
                        nVar.e(i5);
                        break;
                    }
                    i5++;
                }
            }
        }
        this.f6211h = false;
        this.f6212i = s.c(gVar.f6215b, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [K.d] */
    public final void f() {
        K.d dVar = this.f6213a;
        int i3 = dVar.f2642f;
        if (i3 > 0) {
            Object[] objArr = dVar.f2640d;
            int i4 = 0;
            do {
                ((e) objArr[i4]).f();
                i4++;
            } while (i4 < i3);
        }
        AbstractC0905m abstractC0905m = this.f6205b;
        ?? r4 = 0;
        while (abstractC0905m != 0) {
            if (abstractC0905m instanceof l0) {
                ((l0) abstractC0905m).K();
            } else if ((abstractC0905m.f3305f & 16) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                U.k kVar = abstractC0905m.f7937r;
                int i5 = 0;
                abstractC0905m = abstractC0905m;
                r4 = r4;
                while (kVar != null) {
                    if ((kVar.f3305f & 16) != 0) {
                        i5++;
                        r4 = r4;
                        if (i5 == 1) {
                            abstractC0905m = kVar;
                        } else {
                            if (r4 == 0) {
                                r4 = new K.d(new U.k[16]);
                            }
                            if (abstractC0905m != 0) {
                                r4.b(abstractC0905m);
                                abstractC0905m = 0;
                            }
                            r4.b(kVar);
                        }
                    }
                    kVar = kVar.f3308i;
                    abstractC0905m = abstractC0905m;
                    r4 = r4;
                }
                if (i5 == 1) {
                }
            }
            abstractC0905m = AbstractC0898f.f(r4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092 A[LOOP:0: B:8:0x0090->B:9:0x0092, LOOP_END] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [U.k] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [U.k] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(C2.c cVar) {
        K.d dVar;
        int i3;
        int i4;
        int i5;
        C0494l c0494l = this.f6207d;
        boolean z3 = true;
        if (!(c0494l.c() == 0)) {
            U.k kVar = this.f6205b;
            if (kVar.p) {
                g gVar = this.f6209f;
                Z1.i.c(gVar);
                a0 a0Var = this.f6208e;
                Z1.i.c(a0Var);
                long j3 = a0Var.f7116f;
                AbstractC0905m abstractC0905m = kVar;
                ?? r9 = 0;
                while (abstractC0905m != 0) {
                    if (abstractC0905m instanceof l0) {
                        ((l0) abstractC0905m).f0(gVar, h.f6218f, j3);
                    } else if ((abstractC0905m.f3305f & 16) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                        U.k kVar2 = abstractC0905m.f7937r;
                        int i6 = 0;
                        abstractC0905m = abstractC0905m;
                        r9 = r9;
                        while (kVar2 != null) {
                            if ((kVar2.f3305f & 16) != 0) {
                                i6++;
                                r9 = r9;
                                if (i6 == 1) {
                                    abstractC0905m = kVar2;
                                } else {
                                    if (r9 == 0) {
                                        r9 = new K.d(new U.k[16]);
                                    }
                                    if (abstractC0905m != 0) {
                                        r9.b(abstractC0905m);
                                        abstractC0905m = 0;
                                    }
                                    r9.b(kVar2);
                                }
                            }
                            kVar2 = kVar2.f3308i;
                            abstractC0905m = abstractC0905m;
                            r9 = r9;
                        }
                        if (i6 == 1) {
                        }
                    }
                    abstractC0905m = AbstractC0898f.f(r9);
                }
                if (kVar.p && (i3 = (dVar = this.f6213a).f2642f) > 0) {
                    Object[] objArr = dVar.f2640d;
                    int i7 = 0;
                    do {
                        ((e) objArr[i7]).g(cVar);
                        i7++;
                    } while (i7 < i3);
                }
                c(cVar);
                i4 = c0494l.f5172g;
                Object[] objArr2 = c0494l.f5171f;
                for (i5 = 0; i5 < i4; i5++) {
                    objArr2[i5] = null;
                }
                c0494l.f5172g = 0;
                c0494l.f5169d = false;
                this.f6208e = null;
                return z3;
            }
        }
        z3 = false;
        c(cVar);
        i4 = c0494l.f5172g;
        Object[] objArr22 = c0494l.f5171f;
        while (i5 < i4) {
        }
        c0494l.f5172g = 0;
        c0494l.f5169d = false;
        this.f6208e = null;
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [U.k] */
    /* JADX WARN: Type inference failed for: r0v5, types: [U.k] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [U.k] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [K.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [K.d] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean h(C2.c cVar, boolean z3) {
        K.d dVar;
        int i3;
        if (this.f6207d.c() == 0) {
            return false;
        }
        AbstractC0905m abstractC0905m = this.f6205b;
        if (!abstractC0905m.p) {
            return false;
        }
        g gVar = this.f6209f;
        Z1.i.c(gVar);
        a0 a0Var = this.f6208e;
        Z1.i.c(a0Var);
        long j3 = a0Var.f7116f;
        AbstractC0905m abstractC0905m2 = abstractC0905m;
        ?? r8 = 0;
        while (abstractC0905m2 != 0) {
            if (abstractC0905m2 instanceof l0) {
                ((l0) abstractC0905m2).f0(gVar, h.f6216d, j3);
            } else if ((abstractC0905m2.f3305f & 16) != 0 && (abstractC0905m2 instanceof AbstractC0905m)) {
                U.k kVar = abstractC0905m2.f7937r;
                int i4 = 0;
                abstractC0905m2 = abstractC0905m2;
                r8 = r8;
                while (kVar != null) {
                    if ((kVar.f3305f & 16) != 0) {
                        i4++;
                        r8 = r8;
                        if (i4 == 1) {
                            abstractC0905m2 = kVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new K.d(new U.k[16]);
                            }
                            if (abstractC0905m2 != 0) {
                                r8.b(abstractC0905m2);
                                abstractC0905m2 = 0;
                            }
                            r8.b(kVar);
                        }
                    }
                    kVar = kVar.f3308i;
                    abstractC0905m2 = abstractC0905m2;
                    r8 = r8;
                }
                if (i4 == 1) {
                }
            }
            abstractC0905m2 = AbstractC0898f.f(r8);
        }
        if (abstractC0905m.p && (i3 = (dVar = this.f6213a).f2642f) > 0) {
            Object[] objArr = dVar.f2640d;
            int i5 = 0;
            do {
                e eVar = (e) objArr[i5];
                Z1.i.c(this.f6208e);
                eVar.h(cVar, z3);
                i5++;
            } while (i5 < i3);
        }
        if (abstractC0905m.p) {
            ?? r14 = 0;
            while (abstractC0905m != 0) {
                if (abstractC0905m instanceof l0) {
                    ((l0) abstractC0905m).f0(gVar, h.f6217e, j3);
                } else if ((abstractC0905m.f3305f & 16) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                    U.k kVar2 = abstractC0905m.f7937r;
                    int i6 = 0;
                    abstractC0905m = abstractC0905m;
                    r14 = r14;
                    while (kVar2 != null) {
                        if ((kVar2.f3305f & 16) != 0) {
                            i6++;
                            r14 = r14;
                            if (i6 == 1) {
                                abstractC0905m = kVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new K.d(new U.k[16]);
                                }
                                if (abstractC0905m != 0) {
                                    r14.b(abstractC0905m);
                                    abstractC0905m = 0;
                                }
                                r14.b(kVar2);
                            }
                        }
                        kVar2 = kVar2.f3308i;
                        abstractC0905m = abstractC0905m;
                        r14 = r14;
                    }
                    if (i6 == 1) {
                    }
                }
                abstractC0905m = AbstractC0898f.f(r14);
            }
        }
        return true;
    }

    public final void i(long j3, C0504v c0504v) {
        E2.n nVar = this.f6206c;
        int i3 = 0;
        if (nVar.b(j3)) {
            Object[] objArr = c0504v.f5218a;
            int i4 = c0504v.f5219b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    i5 = -1;
                    break;
                } else if (equals(objArr[i5])) {
                    break;
                } else {
                    i5++;
                }
            }
            if (!(i5 >= 0)) {
                int i6 = nVar.f843b;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    if (j3 == ((long[]) nVar.f844c)[i7]) {
                        nVar.e(i7);
                        break;
                    }
                    i7++;
                }
                C0494l c0494l = this.f6207d;
                int b2 = AbstractC0522a.b(c0494l.f5170e, c0494l.f5172g, j3);
                if (b2 >= 0) {
                    Object[] objArr2 = c0494l.f5171f;
                    Object obj = objArr2[b2];
                    Object obj2 = AbstractC0495m.f5173a;
                    if (obj != obj2) {
                        objArr2[b2] = obj2;
                        c0494l.f5169d = true;
                    }
                }
            }
        }
        K.d dVar = this.f6213a;
        int i8 = dVar.f2642f;
        if (i8 > 0) {
            Object[] objArr3 = dVar.f2640d;
            do {
                ((e) objArr3[i3]).i(j3, c0504v);
                i3++;
            } while (i3 < i8);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f6205b + ", children=" + this.f6213a + ", pointerIds=" + this.f6206c + ')';
    }
}
