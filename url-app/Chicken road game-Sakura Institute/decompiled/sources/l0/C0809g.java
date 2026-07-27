package l0;

import j.AbstractC0705a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0980p;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.a0;
import r0.l0;
import z2.C1405I;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809g extends C0810h {

    /* renamed from: b, reason: collision with root package name */
    public final S.n f7898b;

    /* renamed from: c, reason: collision with root package name */
    public final G1.y f7899c;

    /* renamed from: d, reason: collision with root package name */
    public final i.m f7900d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f7901e;

    /* renamed from: f, reason: collision with root package name */
    public C0811i f7902f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7903g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7904h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7905i;

    public C0809g(S.n nVar) {
        super(0);
        this.f7898b = nVar;
        G1.y yVar = new G1.y();
        yVar.f3165b = new long[2];
        this.f7899c = yVar;
        this.f7900d = new i.m(2);
        this.f7904h = true;
        this.f7905i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [S.n] */
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
    /* JADX WARN: Type inference failed for: r8v17, types: [I.d] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [I.d] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // l0.C0810h
    public final boolean a(i.m mVar, InterfaceC0980p interfaceC0980p, y.t tVar, boolean z4) {
        i.m mVar2;
        G1.y yVar;
        Object obj;
        boolean z5;
        boolean z6;
        boolean z7;
        C0811i c0811i;
        boolean z8;
        int i2;
        int i4;
        int i5;
        long j4;
        List list;
        boolean a4 = super.a(mVar, interfaceC0980p, tVar, z4);
        AbstractC1073n abstractC1073n = this.f7898b;
        if (!abstractC1073n.f3990s) {
            return true;
        }
        ?? r8 = 0;
        while (abstractC1073n != 0) {
            if (abstractC1073n instanceof l0) {
                this.f7901e = AbstractC1065f.t((l0) abstractC1073n, 16);
            } else if ((abstractC1073n.f3980i & 16) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                S.n nVar = abstractC1073n.f9826u;
                int i6 = 0;
                abstractC1073n = abstractC1073n;
                r8 = r8;
                while (nVar != null) {
                    if ((nVar.f3980i & 16) != 0) {
                        i6++;
                        r8 = r8;
                        if (i6 == 1) {
                            abstractC1073n = nVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new I.d(new S.n[16]);
                            }
                            if (abstractC1073n != 0) {
                                r8.b(abstractC1073n);
                                abstractC1073n = 0;
                            }
                            r8.b(nVar);
                        }
                    }
                    nVar = nVar.f3983l;
                    abstractC1073n = abstractC1073n;
                    r8 = r8;
                }
                if (i6 == 1) {
                }
            }
            abstractC1073n = AbstractC1065f.f(r8);
        }
        int c4 = mVar.c();
        int i7 = 0;
        while (true) {
            mVar2 = this.f7900d;
            yVar = this.f7899c;
            if (i7 >= c4) {
                break;
            }
            long a5 = mVar.a(i7);
            s sVar = (s) mVar.d(i7);
            if (yVar.b(a5)) {
                long j5 = sVar.f7929g;
                if (Y.c.f(j5)) {
                    long j6 = sVar.f7925c;
                    if (Y.c.f(j6)) {
                        List list2 = sVar.f7933k;
                        if (list2 == null) {
                            list2 = C1405I.f11931d;
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        List list3 = sVar.f7933k;
                        if (list3 == null) {
                            list3 = C1405I.f11931d;
                        }
                        i2 = c4;
                        int size = list3.size();
                        z8 = a4;
                        int i8 = 0;
                        while (i8 < size) {
                            int i9 = size;
                            C0806d c0806d = (C0806d) list3.get(i8);
                            long j7 = a5;
                            long j8 = c0806d.f7889b;
                            if (Y.c.f(j8)) {
                                list = list3;
                                a0 a0Var = this.f7901e;
                                Intrinsics.c(a0Var);
                                long W02 = a0Var.W0(interfaceC0980p, j8);
                                i5 = i7;
                                j4 = j6;
                                arrayList.add(new C0806d(c0806d.f7888a, W02, c0806d.f7890c));
                            } else {
                                i5 = i7;
                                j4 = j6;
                                list = list3;
                            }
                            i8++;
                            i7 = i5;
                            list3 = list;
                            size = i9;
                            j6 = j4;
                            a5 = j7;
                        }
                        i4 = i7;
                        a0 a0Var2 = this.f7901e;
                        Intrinsics.c(a0Var2);
                        long W03 = a0Var2.W0(interfaceC0980p, j5);
                        a0 a0Var3 = this.f7901e;
                        Intrinsics.c(a0Var3);
                        s sVar2 = new s(sVar.f7923a, sVar.f7924b, a0Var3.W0(interfaceC0980p, j6), sVar.f7926d, sVar.f7927e, sVar.f7928f, W03, sVar.f7930h, sVar.f7931i, arrayList, sVar.f7932j, sVar.f7934l);
                        sVar2.f7935m = sVar.f7935m;
                        mVar2.b(a5, sVar2);
                        i7 = i4 + 1;
                        c4 = i2;
                        a4 = z8;
                    }
                }
            }
            z8 = a4;
            i2 = c4;
            i4 = i7;
            i7 = i4 + 1;
            c4 = i2;
            a4 = z8;
        }
        boolean z9 = a4;
        if (mVar2.c() == 0) {
            yVar.f3164a = 0;
            this.f7906a.g();
            return true;
        }
        for (int i10 = yVar.f3164a - 1; -1 < i10; i10--) {
            long j9 = ((long[]) yVar.f3165b)[i10];
            if (mVar.f6925d) {
                int i11 = mVar.f6928j;
                long[] jArr = mVar.f6926e;
                Object[] objArr = mVar.f6927i;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != i.n.f6929a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                mVar.f6925d = false;
                mVar.f6928j = i12;
            }
            if (AbstractC0705a.b(mVar.f6926e, mVar.f6928j, j9) < 0) {
                yVar.e(i10);
            }
        }
        ArrayList arrayList2 = new ArrayList(mVar2.c());
        int c5 = mVar2.c();
        for (int i14 = 0; i14 < c5; i14++) {
            arrayList2.add(mVar2.d(i14));
        }
        C0811i c0811i2 = new C0811i(arrayList2, tVar);
        int size2 = arrayList2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i15);
            if (tVar.g(((s) obj).f7923a)) {
                break;
            }
            i15++;
        }
        s sVar3 = (s) obj;
        if (sVar3 != null) {
            boolean z10 = sVar3.f7926d;
            if (z4) {
                z5 = false;
                if (!this.f7904h && (z10 || sVar3.f7930h)) {
                    a0 a0Var4 = this.f7901e;
                    Intrinsics.c(a0Var4);
                    boolean f4 = AbstractC0819q.f(sVar3, a0Var4.f9007i);
                    z6 = true;
                    this.f7904h = !f4;
                    if (this.f7904h == this.f7903g && (AbstractC0819q.d(c0811i2.f7909c, 3) || AbstractC0819q.d(c0811i2.f7909c, 4) || AbstractC0819q.d(c0811i2.f7909c, 5))) {
                        c0811i2.f7909c = this.f7904h ? 4 : 5;
                    } else if (!AbstractC0819q.d(c0811i2.f7909c, 4) && this.f7903g && !this.f7905i) {
                        c0811i2.f7909c = 3;
                    } else if (AbstractC0819q.d(c0811i2.f7909c, 5) && this.f7904h && z10) {
                        c0811i2.f7909c = 3;
                    }
                }
            } else {
                z5 = false;
                this.f7904h = false;
            }
            z6 = true;
            if (this.f7904h == this.f7903g) {
            }
            if (!AbstractC0819q.d(c0811i2.f7909c, 4)) {
            }
            if (AbstractC0819q.d(c0811i2.f7909c, 5)) {
                c0811i2.f7909c = 3;
            }
        } else {
            z5 = false;
            z6 = true;
        }
        if (!z9 && AbstractC0819q.d(c0811i2.f7909c, 3) && (c0811i = this.f7902f) != null) {
            ?? r12 = c0811i.f7907a;
            int size3 = r12.size();
            ?? r5 = c0811i2.f7907a;
            if (size3 == r5.size()) {
                int size4 = r5.size();
                for (?? r7 = z5; r7 < size4; r7++) {
                    if (Y.c.b(((s) r12.get(r7)).f7925c, ((s) r5.get(r7)).f7925c)) {
                    }
                }
                z7 = z5;
                this.f7902f = c0811i2;
                return z7;
            }
        }
        z7 = z6;
        this.f7902f = c0811i2;
        return z7;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // l0.C0810h
    public final void c(y.t tVar) {
        super.c(tVar);
        C0811i c0811i = this.f7902f;
        if (c0811i == null) {
            return;
        }
        this.f7903g = this.f7904h;
        ?? r12 = c0811i.f7907a;
        int size = r12.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = (s) r12.get(i2);
            boolean z4 = sVar.f7926d;
            long j4 = sVar.f7923a;
            boolean g4 = tVar.g(j4);
            boolean z5 = this.f7904h;
            if ((!z4 && !g4) || (!z4 && !z5)) {
                G1.y yVar = this.f7899c;
                int i4 = yVar.f3164a;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    if (j4 == ((long[]) yVar.f3165b)[i5]) {
                        yVar.e(i5);
                        break;
                    }
                    i5++;
                }
            }
        }
        this.f7904h = false;
        this.f7905i = AbstractC0819q.d(c0811i.f7909c, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [S.n] */
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
    /* JADX WARN: Type inference failed for: r4v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [I.d] */
    public final void f() {
        I.d dVar = this.f7906a;
        int i2 = dVar.f3332i;
        if (i2 > 0) {
            Object[] objArr = dVar.f3330d;
            int i4 = 0;
            do {
                ((C0809g) objArr[i4]).f();
                i4++;
            } while (i4 < i2);
        }
        AbstractC1073n abstractC1073n = this.f7898b;
        ?? r4 = 0;
        while (abstractC1073n != 0) {
            if (abstractC1073n instanceof l0) {
                ((l0) abstractC1073n).S();
            } else if ((abstractC1073n.f3980i & 16) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                S.n nVar = abstractC1073n.f9826u;
                int i5 = 0;
                abstractC1073n = abstractC1073n;
                r4 = r4;
                while (nVar != null) {
                    if ((nVar.f3980i & 16) != 0) {
                        i5++;
                        r4 = r4;
                        if (i5 == 1) {
                            abstractC1073n = nVar;
                        } else {
                            if (r4 == 0) {
                                r4 = new I.d(new S.n[16]);
                            }
                            if (abstractC1073n != 0) {
                                r4.b(abstractC1073n);
                                abstractC1073n = 0;
                            }
                            r4.b(nVar);
                        }
                    }
                    nVar = nVar.f3983l;
                    abstractC1073n = abstractC1073n;
                    r4 = r4;
                }
                if (i5 == 1) {
                }
            }
            abstractC1073n = AbstractC1065f.f(r4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092 A[LOOP:0: B:8:0x0090->B:9:0x0092, LOOP_END] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [S.n] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [S.n] */
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
    /* JADX WARN: Type inference failed for: r9v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(y.t tVar) {
        I.d dVar;
        int i2;
        int i4;
        int i5;
        i.m mVar = this.f7900d;
        boolean z4 = true;
        if (!(mVar.c() == 0)) {
            S.n nVar = this.f7898b;
            if (nVar.f3990s) {
                C0811i c0811i = this.f7902f;
                Intrinsics.c(c0811i);
                a0 a0Var = this.f7901e;
                Intrinsics.c(a0Var);
                long j4 = a0Var.f9007i;
                AbstractC1073n abstractC1073n = nVar;
                ?? r9 = 0;
                while (abstractC1073n != 0) {
                    if (abstractC1073n instanceof l0) {
                        ((l0) abstractC1073n).Z(c0811i, EnumC0812j.f7912i, j4);
                    } else if ((abstractC1073n.f3980i & 16) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                        S.n nVar2 = abstractC1073n.f9826u;
                        int i6 = 0;
                        abstractC1073n = abstractC1073n;
                        r9 = r9;
                        while (nVar2 != null) {
                            if ((nVar2.f3980i & 16) != 0) {
                                i6++;
                                r9 = r9;
                                if (i6 == 1) {
                                    abstractC1073n = nVar2;
                                } else {
                                    if (r9 == 0) {
                                        r9 = new I.d(new S.n[16]);
                                    }
                                    if (abstractC1073n != 0) {
                                        r9.b(abstractC1073n);
                                        abstractC1073n = 0;
                                    }
                                    r9.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f3983l;
                            abstractC1073n = abstractC1073n;
                            r9 = r9;
                        }
                        if (i6 == 1) {
                        }
                    }
                    abstractC1073n = AbstractC1065f.f(r9);
                }
                if (nVar.f3990s && (i2 = (dVar = this.f7906a).f3332i) > 0) {
                    Object[] objArr = dVar.f3330d;
                    int i7 = 0;
                    do {
                        ((C0809g) objArr[i7]).g(tVar);
                        i7++;
                    } while (i7 < i2);
                }
                c(tVar);
                i4 = mVar.f6928j;
                Object[] objArr2 = mVar.f6927i;
                for (i5 = 0; i5 < i4; i5++) {
                    objArr2[i5] = null;
                }
                mVar.f6928j = 0;
                mVar.f6925d = false;
                this.f7901e = null;
                return z4;
            }
        }
        z4 = false;
        c(tVar);
        i4 = mVar.f6928j;
        Object[] objArr22 = mVar.f6927i;
        while (i5 < i4) {
        }
        mVar.f6928j = 0;
        mVar.f6925d = false;
        this.f7901e = null;
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [S.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [S.n] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [I.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [I.d] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [I.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [I.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean h(y.t tVar, boolean z4) {
        I.d dVar;
        int i2;
        if (this.f7900d.c() == 0) {
            return false;
        }
        AbstractC1073n abstractC1073n = this.f7898b;
        if (!abstractC1073n.f3990s) {
            return false;
        }
        C0811i c0811i = this.f7902f;
        Intrinsics.c(c0811i);
        a0 a0Var = this.f7901e;
        Intrinsics.c(a0Var);
        long j4 = a0Var.f9007i;
        AbstractC1073n abstractC1073n2 = abstractC1073n;
        ?? r8 = 0;
        while (abstractC1073n2 != 0) {
            if (abstractC1073n2 instanceof l0) {
                ((l0) abstractC1073n2).Z(c0811i, EnumC0812j.f7910d, j4);
            } else if ((abstractC1073n2.f3980i & 16) != 0 && (abstractC1073n2 instanceof AbstractC1073n)) {
                S.n nVar = abstractC1073n2.f9826u;
                int i4 = 0;
                abstractC1073n2 = abstractC1073n2;
                r8 = r8;
                while (nVar != null) {
                    if ((nVar.f3980i & 16) != 0) {
                        i4++;
                        r8 = r8;
                        if (i4 == 1) {
                            abstractC1073n2 = nVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new I.d(new S.n[16]);
                            }
                            if (abstractC1073n2 != 0) {
                                r8.b(abstractC1073n2);
                                abstractC1073n2 = 0;
                            }
                            r8.b(nVar);
                        }
                    }
                    nVar = nVar.f3983l;
                    abstractC1073n2 = abstractC1073n2;
                    r8 = r8;
                }
                if (i4 == 1) {
                }
            }
            abstractC1073n2 = AbstractC1065f.f(r8);
        }
        if (abstractC1073n.f3990s && (i2 = (dVar = this.f7906a).f3332i) > 0) {
            Object[] objArr = dVar.f3330d;
            int i5 = 0;
            do {
                C0809g c0809g = (C0809g) objArr[i5];
                Intrinsics.c(this.f7901e);
                c0809g.h(tVar, z4);
                i5++;
            } while (i5 < i2);
        }
        if (abstractC1073n.f3990s) {
            ?? r14 = 0;
            while (abstractC1073n != 0) {
                if (abstractC1073n instanceof l0) {
                    ((l0) abstractC1073n).Z(c0811i, EnumC0812j.f7911e, j4);
                } else if ((abstractC1073n.f3980i & 16) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                    S.n nVar2 = abstractC1073n.f9826u;
                    int i6 = 0;
                    abstractC1073n = abstractC1073n;
                    r14 = r14;
                    while (nVar2 != null) {
                        if ((nVar2.f3980i & 16) != 0) {
                            i6++;
                            r14 = r14;
                            if (i6 == 1) {
                                abstractC1073n = nVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new I.d(new S.n[16]);
                                }
                                if (abstractC1073n != 0) {
                                    r14.b(abstractC1073n);
                                    abstractC1073n = 0;
                                }
                                r14.b(nVar2);
                            }
                        }
                        nVar2 = nVar2.f3983l;
                        abstractC1073n = abstractC1073n;
                        r14 = r14;
                    }
                    if (i6 == 1) {
                    }
                }
                abstractC1073n = AbstractC1065f.f(r14);
            }
        }
        return true;
    }

    public final void i(long j4, i.w wVar) {
        G1.y yVar = this.f7899c;
        int i2 = 0;
        if (yVar.b(j4)) {
            Object[] objArr = wVar.f6974a;
            int i4 = wVar.f6975b;
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
                int i6 = yVar.f3164a;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    if (j4 == ((long[]) yVar.f3165b)[i7]) {
                        yVar.e(i7);
                        break;
                    }
                    i7++;
                }
                i.m mVar = this.f7900d;
                int b4 = AbstractC0705a.b(mVar.f6926e, mVar.f6928j, j4);
                if (b4 >= 0) {
                    Object[] objArr2 = mVar.f6927i;
                    Object obj = objArr2[b4];
                    Object obj2 = i.n.f6929a;
                    if (obj != obj2) {
                        objArr2[b4] = obj2;
                        mVar.f6925d = true;
                    }
                }
            }
        }
        I.d dVar = this.f7906a;
        int i8 = dVar.f3332i;
        if (i8 > 0) {
            Object[] objArr3 = dVar.f3330d;
            do {
                ((C0809g) objArr3[i2]).i(j4, wVar);
                i2++;
            } while (i2 < i8);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f7898b + ", children=" + this.f7906a + ", pointerIds=" + this.f7899c + ')';
    }
}
