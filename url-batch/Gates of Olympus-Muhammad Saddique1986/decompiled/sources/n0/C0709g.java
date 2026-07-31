package n0;

import a0.C0238c;
import j.AbstractC0539m;
import j.C0538l;
import j.C0548v;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC0561a;
import r0.InterfaceC0919p;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.b0;
import t0.m0;
import z.C1256t;

/* renamed from: n0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709g extends C0710h {

    /* renamed from: b, reason: collision with root package name */
    public final U.p f7283b;

    /* renamed from: c, reason: collision with root package name */
    public final K2.m f7284c;

    /* renamed from: d, reason: collision with root package name */
    public final C0538l f7285d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f7286e;

    /* renamed from: f, reason: collision with root package name */
    public C0711i f7287f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7288g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7289h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7290i;

    public C0709g(U.p pVar) {
        super(0);
        this.f7283b = pVar;
        K2.m mVar = new K2.m();
        mVar.f3331c = new long[2];
        this.f7284c = mVar;
        this.f7285d = new C0538l(2);
        this.f7289h = true;
        this.f7290i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [U.p] */
    /* JADX WARN: Type inference failed for: r5v1, types: [U.p] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [U.p] */
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
    @Override // n0.C0710h
    public final boolean a(C0538l c0538l, InterfaceC0919p interfaceC0919p, C1256t c1256t, boolean z3) {
        C0538l c0538l2;
        K2.m mVar;
        Object obj;
        boolean z4;
        boolean z5;
        boolean z6;
        C0711i c0711i;
        boolean z7;
        int i3;
        int i4;
        int i5;
        long j3;
        List list;
        boolean a3 = super.a(c0538l, interfaceC0919p, c1256t, z3);
        AbstractC1000m abstractC1000m = this.f7283b;
        if (!abstractC1000m.f4501p) {
            return true;
        }
        ?? r8 = 0;
        while (abstractC1000m != 0) {
            if (abstractC1000m instanceof m0) {
                this.f7286e = AbstractC0993f.r((m0) abstractC1000m, 16);
            } else if ((abstractC1000m.f4491f & 16) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                U.p pVar = abstractC1000m.f8771r;
                int i6 = 0;
                abstractC1000m = abstractC1000m;
                r8 = r8;
                while (pVar != null) {
                    if ((pVar.f4491f & 16) != 0) {
                        i6++;
                        r8 = r8;
                        if (i6 == 1) {
                            abstractC1000m = pVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new K.d(new U.p[16]);
                            }
                            if (abstractC1000m != 0) {
                                r8.b(abstractC1000m);
                                abstractC1000m = 0;
                            }
                            r8.b(pVar);
                        }
                    }
                    pVar = pVar.f4494i;
                    abstractC1000m = abstractC1000m;
                    r8 = r8;
                }
                if (i6 == 1) {
                }
            }
            abstractC1000m = AbstractC0993f.f(r8);
        }
        int c2 = c0538l.c();
        int i7 = 0;
        while (true) {
            c0538l2 = this.f7285d;
            mVar = this.f7284c;
            if (i7 >= c2) {
                break;
            }
            long a4 = c0538l.a(i7);
            s sVar = (s) c0538l.d(i7);
            if (mVar.b(a4)) {
                long j4 = sVar.f7314g;
                if (C0238c.f(j4)) {
                    long j5 = sVar.f7310c;
                    if (C0238c.f(j5)) {
                        List list2 = sVar.f7318k;
                        List list3 = S1.u.f4320d;
                        if (list2 == null) {
                            list2 = list3;
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        List list4 = sVar.f7318k;
                        i3 = c2;
                        if (list4 == null) {
                            list4 = list3;
                        }
                        int size = list4.size();
                        z7 = a3;
                        int i8 = 0;
                        while (i8 < size) {
                            int i9 = size;
                            C0706d c0706d = (C0706d) list4.get(i8);
                            long j6 = a4;
                            long j7 = c0706d.f7274b;
                            if (C0238c.f(j7)) {
                                list = list4;
                                b0 b0Var = this.f7286e;
                                f2.j.c(b0Var);
                                long S02 = b0Var.S0(interfaceC0919p, j7);
                                i5 = i7;
                                j3 = j5;
                                arrayList.add(new C0706d(c0706d.f7273a, S02, c0706d.f7275c));
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
                        b0 b0Var2 = this.f7286e;
                        f2.j.c(b0Var2);
                        long S03 = b0Var2.S0(interfaceC0919p, j4);
                        b0 b0Var3 = this.f7286e;
                        f2.j.c(b0Var3);
                        s sVar2 = new s(sVar.f7308a, sVar.f7309b, b0Var3.S0(interfaceC0919p, j5), sVar.f7311d, sVar.f7312e, sVar.f7313f, S03, sVar.f7315h, sVar.f7316i, arrayList, sVar.f7317j, sVar.f7319l);
                        sVar2.f7320m = sVar.f7320m;
                        c0538l2.b(a4, sVar2);
                        i7 = i4 + 1;
                        c2 = i3;
                        a3 = z7;
                    }
                }
            }
            z7 = a3;
            i3 = c2;
            i4 = i7;
            i7 = i4 + 1;
            c2 = i3;
            a3 = z7;
        }
        boolean z8 = a3;
        if (c0538l2.c() == 0) {
            mVar.f3330b = 0;
            this.f7291a.h();
            return true;
        }
        for (int i10 = mVar.f3330b - 1; -1 < i10; i10--) {
            long j8 = ((long[]) mVar.f3331c)[i10];
            if (c0538l.f6287d) {
                int i11 = c0538l.f6290g;
                long[] jArr = c0538l.f6288e;
                Object[] objArr = c0538l.f6289f;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != AbstractC0539m.f6291a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                c0538l.f6287d = false;
                c0538l.f6290g = i12;
            }
            if (AbstractC0561a.b(c0538l.f6288e, c0538l.f6290g, j8) < 0) {
                mVar.e(i10);
            }
        }
        ArrayList arrayList2 = new ArrayList(c0538l2.c());
        int c3 = c0538l2.c();
        for (int i14 = 0; i14 < c3; i14++) {
            arrayList2.add(c0538l2.d(i14));
        }
        C0711i c0711i2 = new C0711i(arrayList2, c1256t);
        int size2 = arrayList2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i15);
            if (c1256t.f(((s) obj).f7308a)) {
                break;
            }
            i15++;
        }
        s sVar3 = (s) obj;
        if (sVar3 != null) {
            boolean z9 = sVar3.f7311d;
            if (z3) {
                z4 = false;
                if (!this.f7289h && (z9 || sVar3.f7315h)) {
                    b0 b0Var4 = this.f7286e;
                    f2.j.c(b0Var4);
                    boolean f3 = q.f(sVar3, b0Var4.f8128f);
                    z5 = true;
                    this.f7289h = !f3;
                    if (this.f7289h == this.f7288g && (q.d(c0711i2.f7294c, 3) || q.d(c0711i2.f7294c, 4) || q.d(c0711i2.f7294c, 5))) {
                        c0711i2.f7294c = this.f7289h ? 4 : 5;
                    } else if (!q.d(c0711i2.f7294c, 4) && this.f7288g && !this.f7290i) {
                        c0711i2.f7294c = 3;
                    } else if (q.d(c0711i2.f7294c, 5) && this.f7289h && z9) {
                        c0711i2.f7294c = 3;
                    }
                }
            } else {
                z4 = false;
                this.f7289h = false;
            }
            z5 = true;
            if (this.f7289h == this.f7288g) {
            }
            if (!q.d(c0711i2.f7294c, 4)) {
            }
            if (q.d(c0711i2.f7294c, 5)) {
                c0711i2.f7294c = 3;
            }
        } else {
            z4 = false;
            z5 = true;
        }
        if (!z8 && q.d(c0711i2.f7294c, 3) && (c0711i = this.f7287f) != null) {
            ?? r12 = c0711i.f7292a;
            int size3 = r12.size();
            ?? r5 = c0711i2.f7292a;
            if (size3 == r5.size()) {
                int size4 = r5.size();
                for (?? r7 = z4; r7 < size4; r7++) {
                    if (C0238c.b(((s) r12.get(r7)).f7310c, ((s) r5.get(r7)).f7310c)) {
                    }
                }
                z6 = z4;
                this.f7287f = c0711i2;
                return z6;
            }
        }
        z6 = z5;
        this.f7287f = c0711i2;
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // n0.C0710h
    public final void c(C1256t c1256t) {
        super.c(c1256t);
        C0711i c0711i = this.f7287f;
        if (c0711i == null) {
            return;
        }
        this.f7288g = this.f7289h;
        ?? r12 = c0711i.f7292a;
        int size = r12.size();
        for (int i3 = 0; i3 < size; i3++) {
            s sVar = (s) r12.get(i3);
            boolean z3 = sVar.f7311d;
            long j3 = sVar.f7308a;
            boolean f3 = c1256t.f(j3);
            boolean z4 = this.f7289h;
            if ((!z3 && !f3) || (!z3 && !z4)) {
                K2.m mVar = this.f7284c;
                int i4 = mVar.f3330b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    if (j3 == ((long[]) mVar.f3331c)[i5]) {
                        mVar.e(i5);
                        break;
                    }
                    i5++;
                }
            }
        }
        this.f7289h = false;
        this.f7290i = q.d(c0711i.f7294c, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [U.p] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [U.p] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [U.p] */
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
        K.d dVar = this.f7291a;
        int i3 = dVar.f3216f;
        if (i3 > 0) {
            Object[] objArr = dVar.f3214d;
            int i4 = 0;
            do {
                ((C0709g) objArr[i4]).f();
                i4++;
            } while (i4 < i3);
        }
        AbstractC1000m abstractC1000m = this.f7283b;
        ?? r4 = 0;
        while (abstractC1000m != 0) {
            if (abstractC1000m instanceof m0) {
                ((m0) abstractC1000m).N();
            } else if ((abstractC1000m.f4491f & 16) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                U.p pVar = abstractC1000m.f8771r;
                int i5 = 0;
                abstractC1000m = abstractC1000m;
                r4 = r4;
                while (pVar != null) {
                    if ((pVar.f4491f & 16) != 0) {
                        i5++;
                        r4 = r4;
                        if (i5 == 1) {
                            abstractC1000m = pVar;
                        } else {
                            if (r4 == 0) {
                                r4 = new K.d(new U.p[16]);
                            }
                            if (abstractC1000m != 0) {
                                r4.b(abstractC1000m);
                                abstractC1000m = 0;
                            }
                            r4.b(pVar);
                        }
                    }
                    pVar = pVar.f4494i;
                    abstractC1000m = abstractC1000m;
                    r4 = r4;
                }
                if (i5 == 1) {
                }
            }
            abstractC1000m = AbstractC0993f.f(r4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092 A[LOOP:0: B:8:0x0090->B:9:0x0092, LOOP_END] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [U.p] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [U.p] */
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
    public final boolean g(C1256t c1256t) {
        K.d dVar;
        int i3;
        int i4;
        int i5;
        C0538l c0538l = this.f7285d;
        boolean z3 = true;
        if (!(c0538l.c() == 0)) {
            U.p pVar = this.f7283b;
            if (pVar.f4501p) {
                C0711i c0711i = this.f7287f;
                f2.j.c(c0711i);
                b0 b0Var = this.f7286e;
                f2.j.c(b0Var);
                long j3 = b0Var.f8128f;
                AbstractC1000m abstractC1000m = pVar;
                ?? r9 = 0;
                while (abstractC1000m != 0) {
                    if (abstractC1000m instanceof m0) {
                        ((m0) abstractC1000m).g0(c0711i, EnumC0712j.f7297f, j3);
                    } else if ((abstractC1000m.f4491f & 16) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                        U.p pVar2 = abstractC1000m.f8771r;
                        int i6 = 0;
                        abstractC1000m = abstractC1000m;
                        r9 = r9;
                        while (pVar2 != null) {
                            if ((pVar2.f4491f & 16) != 0) {
                                i6++;
                                r9 = r9;
                                if (i6 == 1) {
                                    abstractC1000m = pVar2;
                                } else {
                                    if (r9 == 0) {
                                        r9 = new K.d(new U.p[16]);
                                    }
                                    if (abstractC1000m != 0) {
                                        r9.b(abstractC1000m);
                                        abstractC1000m = 0;
                                    }
                                    r9.b(pVar2);
                                }
                            }
                            pVar2 = pVar2.f4494i;
                            abstractC1000m = abstractC1000m;
                            r9 = r9;
                        }
                        if (i6 == 1) {
                        }
                    }
                    abstractC1000m = AbstractC0993f.f(r9);
                }
                if (pVar.f4501p && (i3 = (dVar = this.f7291a).f3216f) > 0) {
                    Object[] objArr = dVar.f3214d;
                    int i7 = 0;
                    do {
                        ((C0709g) objArr[i7]).g(c1256t);
                        i7++;
                    } while (i7 < i3);
                }
                c(c1256t);
                i4 = c0538l.f6290g;
                Object[] objArr2 = c0538l.f6289f;
                for (i5 = 0; i5 < i4; i5++) {
                    objArr2[i5] = null;
                }
                c0538l.f6290g = 0;
                c0538l.f6287d = false;
                this.f7286e = null;
                return z3;
            }
        }
        z3 = false;
        c(c1256t);
        i4 = c0538l.f6290g;
        Object[] objArr22 = c0538l.f6289f;
        while (i5 < i4) {
        }
        c0538l.f6290g = 0;
        c0538l.f6287d = false;
        this.f7286e = null;
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [U.p] */
    /* JADX WARN: Type inference failed for: r0v5, types: [U.p] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [U.p] */
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
    /* JADX WARN: Type inference failed for: r7v1, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [U.p] */
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
    public final boolean h(C1256t c1256t, boolean z3) {
        K.d dVar;
        int i3;
        if (this.f7285d.c() == 0) {
            return false;
        }
        AbstractC1000m abstractC1000m = this.f7283b;
        if (!abstractC1000m.f4501p) {
            return false;
        }
        C0711i c0711i = this.f7287f;
        f2.j.c(c0711i);
        b0 b0Var = this.f7286e;
        f2.j.c(b0Var);
        long j3 = b0Var.f8128f;
        AbstractC1000m abstractC1000m2 = abstractC1000m;
        ?? r8 = 0;
        while (abstractC1000m2 != 0) {
            if (abstractC1000m2 instanceof m0) {
                ((m0) abstractC1000m2).g0(c0711i, EnumC0712j.f7295d, j3);
            } else if ((abstractC1000m2.f4491f & 16) != 0 && (abstractC1000m2 instanceof AbstractC1000m)) {
                U.p pVar = abstractC1000m2.f8771r;
                int i4 = 0;
                abstractC1000m2 = abstractC1000m2;
                r8 = r8;
                while (pVar != null) {
                    if ((pVar.f4491f & 16) != 0) {
                        i4++;
                        r8 = r8;
                        if (i4 == 1) {
                            abstractC1000m2 = pVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new K.d(new U.p[16]);
                            }
                            if (abstractC1000m2 != 0) {
                                r8.b(abstractC1000m2);
                                abstractC1000m2 = 0;
                            }
                            r8.b(pVar);
                        }
                    }
                    pVar = pVar.f4494i;
                    abstractC1000m2 = abstractC1000m2;
                    r8 = r8;
                }
                if (i4 == 1) {
                }
            }
            abstractC1000m2 = AbstractC0993f.f(r8);
        }
        if (abstractC1000m.f4501p && (i3 = (dVar = this.f7291a).f3216f) > 0) {
            Object[] objArr = dVar.f3214d;
            int i5 = 0;
            do {
                C0709g c0709g = (C0709g) objArr[i5];
                f2.j.c(this.f7286e);
                c0709g.h(c1256t, z3);
                i5++;
            } while (i5 < i3);
        }
        if (abstractC1000m.f4501p) {
            ?? r14 = 0;
            while (abstractC1000m != 0) {
                if (abstractC1000m instanceof m0) {
                    ((m0) abstractC1000m).g0(c0711i, EnumC0712j.f7296e, j3);
                } else if ((abstractC1000m.f4491f & 16) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                    U.p pVar2 = abstractC1000m.f8771r;
                    int i6 = 0;
                    abstractC1000m = abstractC1000m;
                    r14 = r14;
                    while (pVar2 != null) {
                        if ((pVar2.f4491f & 16) != 0) {
                            i6++;
                            r14 = r14;
                            if (i6 == 1) {
                                abstractC1000m = pVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new K.d(new U.p[16]);
                                }
                                if (abstractC1000m != 0) {
                                    r14.b(abstractC1000m);
                                    abstractC1000m = 0;
                                }
                                r14.b(pVar2);
                            }
                        }
                        pVar2 = pVar2.f4494i;
                        abstractC1000m = abstractC1000m;
                        r14 = r14;
                    }
                    if (i6 == 1) {
                    }
                }
                abstractC1000m = AbstractC0993f.f(r14);
            }
        }
        return true;
    }

    public final void i(long j3, C0548v c0548v) {
        K2.m mVar = this.f7284c;
        int i3 = 0;
        if (mVar.b(j3)) {
            Object[] objArr = c0548v.f6336a;
            int i4 = c0548v.f6337b;
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
                int i6 = mVar.f3330b;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    if (j3 == ((long[]) mVar.f3331c)[i7]) {
                        mVar.e(i7);
                        break;
                    }
                    i7++;
                }
                C0538l c0538l = this.f7285d;
                int b3 = AbstractC0561a.b(c0538l.f6288e, c0538l.f6290g, j3);
                if (b3 >= 0) {
                    Object[] objArr2 = c0538l.f6289f;
                    Object obj = objArr2[b3];
                    Object obj2 = AbstractC0539m.f6291a;
                    if (obj != obj2) {
                        objArr2[b3] = obj2;
                        c0538l.f6287d = true;
                    }
                }
            }
        }
        K.d dVar = this.f7291a;
        int i8 = dVar.f3216f;
        if (i8 > 0) {
            Object[] objArr3 = dVar.f3214d;
            do {
                ((C0709g) objArr3[i3]).i(j3, c0548v);
                i3++;
            } while (i3 < i8);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f7283b + ", children=" + this.f7291a + ", pointerIds=" + this.f7284c + ')';
    }
}
