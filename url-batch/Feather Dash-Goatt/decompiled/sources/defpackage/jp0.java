package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jp0 extends tp0 {
    public final zl0 c;
    public final jj d;
    public final aj0 e;
    public qp0 f;
    public mx0 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public jp0(zl0 zl0Var) {
        this.c = zl0Var;
        jj jjVar = new jj();
        jjVar.e = new long[2];
        this.d = jjVar;
        this.e = new aj0(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    @Override // defpackage.tp0
    public final boolean a(aj0 aj0Var, uc0 uc0Var, e30 e30Var, boolean z) {
        jj jjVar;
        aj0 aj0Var2;
        Object obj;
        boolean z2;
        boolean z3;
        mx0 mx0Var;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        qx0 qx0Var;
        boolean a = super.a(aj0Var, uc0Var, e30Var, z);
        zq zqVar = this.c;
        boolean z6 = true;
        if (zqVar.r) {
            ?? r8 = 0;
            while (zqVar != 0) {
                if (zqVar instanceof tx0) {
                    this.f = op.G((tx0) zqVar, 16);
                } else if ((zqVar.g & 16) != 0 && (zqVar instanceof zq)) {
                    zl0 zl0Var = zqVar.t;
                    int i6 = 0;
                    zqVar = zqVar;
                    r8 = r8;
                    while (zl0Var != null) {
                        if ((zl0Var.g & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                zqVar = zl0Var;
                            } else {
                                if (r8 == 0) {
                                    r8 = new eo0(new zl0[16]);
                                }
                                if (zqVar != 0) {
                                    r8.b(zqVar);
                                    zqVar = 0;
                                }
                                r8.b(zl0Var);
                            }
                        }
                        zl0Var = zl0Var.j;
                        zqVar = zqVar;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                zqVar = op.o(r8);
            }
            if (this.f != null) {
                int f = aj0Var.f();
                int i7 = 0;
                while (true) {
                    jjVar = this.d;
                    aj0Var2 = this.e;
                    if (i7 >= f) {
                        break;
                    }
                    long c = aj0Var.c(i7);
                    qx0 qx0Var2 = (qx0) aj0Var.g(i7);
                    if (jjVar.d(c)) {
                        boolean z7 = z6;
                        long j = qx0Var2.g;
                        ArrayList arrayList = qx0Var2.k;
                        long j2 = qx0Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            z4 = a;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? nv.d : arrayList).size());
                            List list = arrayList == null ? nv.d : arrayList;
                            i3 = f;
                            int size = list.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list2 = list;
                                e60 e60Var = (e60) list.get(i8);
                                aj0 aj0Var3 = aj0Var2;
                                long j3 = c;
                                long j4 = e60Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    qx0Var = qx0Var2;
                                    long j5 = e60Var.a;
                                    i5 = size;
                                    qp0 qp0Var = this.f;
                                    qp0Var.getClass();
                                    arrayList2.add(new e60(j5, qp0Var.F(uc0Var, j4), e60Var.c));
                                } else {
                                    i5 = size;
                                    qx0Var = qx0Var2;
                                }
                                i8++;
                                size = i5;
                                list = list2;
                                aj0Var2 = aj0Var3;
                                c = j3;
                                qx0Var2 = qx0Var;
                            }
                            aj0 aj0Var4 = aj0Var2;
                            long j6 = c;
                            qp0 qp0Var2 = this.f;
                            qp0Var2.getClass();
                            long F = qp0Var2.F(uc0Var, j);
                            qp0 qp0Var3 = this.f;
                            qp0Var3.getClass();
                            qx0 qx0Var3 = new qx0(qx0Var2.a, qx0Var2.b, qp0Var3.F(uc0Var, j2), qx0Var2.d, qx0Var2.e, qx0Var2.f, F, qx0Var2.h, qx0Var2.i, arrayList2, qx0Var2.j, qx0Var2.l);
                            qx0 qx0Var4 = qx0Var2.o;
                            if (qx0Var4 == null) {
                                qx0Var4 = qx0Var2;
                            }
                            qx0Var3.o = qx0Var4;
                            qx0 qx0Var5 = qx0Var2.o;
                            if (qx0Var5 != null) {
                                qx0Var2 = qx0Var5;
                            }
                            qx0Var3.o = qx0Var2;
                            aj0Var4.d(j6, qx0Var3);
                        } else {
                            z4 = a;
                            i3 = f;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = a;
                        i3 = f;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    f = i3;
                    z6 = z5;
                    a = z4;
                }
                boolean z8 = a;
                boolean z9 = z6;
                if (aj0Var2.f() == 0) {
                    jjVar.d = 0;
                    this.a.g();
                    return z9;
                }
                int i9 = jjVar.d;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) jjVar.e)[i9];
                    if (aj0Var.d) {
                        int i10 = aj0Var.h;
                        long[] jArr = aj0Var.e;
                        Object[] objArr = aj0Var.g;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != uq1.j) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        aj0Var.d = false;
                        aj0Var.h = i11;
                    }
                    if (p4.p(aj0Var.e, aj0Var.h, j7) < 0 && i9 < (i2 = jjVar.d)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) jjVar.e;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        jjVar.d--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(aj0Var2.f());
                int f2 = aj0Var2.f();
                for (int i16 = 0; i16 < f2; i16++) {
                    arrayList3.add(aj0Var2.g(i16));
                }
                mx0 mx0Var2 = new mx0(arrayList3, e30Var);
                int size2 = arrayList3.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i17);
                    if (e30Var.a(((qx0) obj).a)) {
                        break;
                    }
                    i17++;
                }
                qx0 qx0Var6 = (qx0) obj;
                if (qx0Var6 != null) {
                    boolean z10 = qx0Var6.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z10 || qx0Var6.h)) {
                            qp0 qp0Var4 = this.f;
                            qp0Var4.getClass();
                            long j8 = qp0Var4.g;
                            long j9 = qx0Var6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            this.i = !((intBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (intBitsToFloat2 < 0.0f ? z9 : false) | (intBitsToFloat > ((float) i18) ? z9 : false) | (intBitsToFloat < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z11 = this.i;
                    boolean z12 = this.h;
                    if (z11 == z12 || !((i = mx0Var2.c) == 3 || i == 4 || i == 5)) {
                        int i19 = mx0Var2.c;
                        if (i19 == 4 && z12 && !this.j) {
                            mx0Var2.c = 3;
                        } else if (i19 == 5 && z11 && z10) {
                            mx0Var2.c = 3;
                        }
                    } else {
                        mx0Var2.c = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && mx0Var2.c == 3 && (mx0Var = this.g) != null) {
                    ?? r1 = mx0Var.a;
                    int size3 = r1.size();
                    ?? r4 = mx0Var2.a;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r5 = z2; r5 < size4; r5++) {
                            if (wq0.b(((qx0) r1.get(r5)).c, ((qx0) r4.get(r5)).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = mx0Var2;
                        return z3;
                    }
                }
                z3 = z9;
                this.g = mx0Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.tp0
    public final void b(e30 e30Var) {
        super.b(e30Var);
        mx0 mx0Var = this.g;
        if (mx0Var == null) {
            return;
        }
        this.h = this.i;
        List list = mx0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qx0 qx0Var = (qx0) list.get(i);
            boolean z = qx0Var.d;
            long j = qx0Var.a;
            boolean a = e30Var.a(j);
            boolean z2 = this.i;
            if ((!z && !a) || (!z && !z2)) {
                this.d.f(j);
            }
        }
        this.i = false;
        this.j = mx0Var.c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [eo0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [eo0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [zl0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [zl0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        eo0 eo0Var = this.a;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((jp0) objArr[i2]).c();
        }
        zq zqVar = this.c;
        ?? r1 = 0;
        while (zqVar != 0) {
            if (zqVar instanceof tx0) {
                ((tx0) zqVar).X();
            } else if ((zqVar.g & 16) != 0 && (zqVar instanceof zq)) {
                zl0 zl0Var = zqVar.t;
                int i3 = 0;
                r1 = r1;
                zqVar = zqVar;
                while (zl0Var != null) {
                    if ((zl0Var.g & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            zqVar = zl0Var;
                        } else {
                            if (r1 == 0) {
                                r1 = new eo0(new zl0[16]);
                            }
                            if (zqVar != 0) {
                                r1.b(zqVar);
                                zqVar = 0;
                            }
                            r1.b(zl0Var);
                        }
                    }
                    zl0Var = zl0Var.j;
                    r1 = r1;
                    zqVar = zqVar;
                }
                if (i3 == 1) {
                }
            }
            zqVar = op.o(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(e30 e30Var) {
        aj0 aj0Var = this.e;
        boolean z = false;
        z = false;
        if (aj0Var.f() != 0) {
            zl0 zl0Var = this.c;
            if (zl0Var.r) {
                mx0 mx0Var = this.g;
                mx0Var.getClass();
                qp0 qp0Var = this.f;
                qp0Var.getClass();
                long j = qp0Var.g;
                zq zqVar = zl0Var;
                ?? r8 = 0;
                while (zqVar != 0) {
                    if (zqVar instanceof tx0) {
                        ((tx0) zqVar).z(mx0Var, nx0.g, j);
                    } else if ((zqVar.g & 16) != 0 && (zqVar instanceof zq)) {
                        zl0 zl0Var2 = zqVar.t;
                        int i = 0;
                        zqVar = zqVar;
                        r8 = r8;
                        while (zl0Var2 != null) {
                            if ((zl0Var2.g & 16) != 0) {
                                i++;
                                r8 = r8;
                                if (i == 1) {
                                    zqVar = zl0Var2;
                                } else {
                                    if (r8 == 0) {
                                        r8 = new eo0(new zl0[16]);
                                    }
                                    if (zqVar != 0) {
                                        r8.b(zqVar);
                                        zqVar = 0;
                                    }
                                    r8.b(zl0Var2);
                                }
                            }
                            zl0Var2 = zl0Var2.j;
                            zqVar = zqVar;
                            r8 = r8;
                        }
                        if (i == 1) {
                        }
                    }
                    zqVar = op.o(r8);
                }
                if (zl0Var.r) {
                    eo0 eo0Var = this.a;
                    Object[] objArr = eo0Var.d;
                    int i2 = eo0Var.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((jp0) objArr[i3]).d(e30Var);
                    }
                }
                z = true;
            }
        }
        b(e30Var);
        aj0Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [zl0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [zl0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [zl0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [eo0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v10, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(e30 e30Var, boolean z) {
        if (this.e.f() == 0) {
            return false;
        }
        zq zqVar = this.c;
        if (!zqVar.r) {
            return false;
        }
        mx0 mx0Var = this.g;
        mx0Var.getClass();
        qp0 qp0Var = this.f;
        qp0Var.getClass();
        long j = qp0Var.g;
        zq zqVar2 = zqVar;
        ?? r7 = 0;
        while (zqVar2 != 0) {
            if (zqVar2 instanceof tx0) {
                ((tx0) zqVar2).z(mx0Var, nx0.d, j);
            } else if ((zqVar2.g & 16) != 0 && (zqVar2 instanceof zq)) {
                zl0 zl0Var = zqVar2.t;
                int i = 0;
                zqVar2 = zqVar2;
                r7 = r7;
                while (zl0Var != null) {
                    if ((zl0Var.g & 16) != 0) {
                        i++;
                        r7 = r7;
                        if (i == 1) {
                            zqVar2 = zl0Var;
                        } else {
                            if (r7 == 0) {
                                r7 = new eo0(new zl0[16]);
                            }
                            if (zqVar2 != 0) {
                                r7.b(zqVar2);
                                zqVar2 = 0;
                            }
                            r7.b(zl0Var);
                        }
                    }
                    zl0Var = zl0Var.j;
                    zqVar2 = zqVar2;
                    r7 = r7;
                }
                if (i == 1) {
                }
            }
            zqVar2 = op.o(r7);
        }
        if (zqVar.r) {
            eo0 eo0Var = this.a;
            Object[] objArr = eo0Var.d;
            int i2 = eo0Var.g;
            for (int i3 = 0; i3 < i2; i3++) {
                jp0 jp0Var = (jp0) objArr[i3];
                this.f.getClass();
                jp0Var.e(e30Var, z);
            }
        }
        if (zqVar.r) {
            ?? r13 = 0;
            while (zqVar != 0) {
                if (zqVar instanceof tx0) {
                    ((tx0) zqVar).z(mx0Var, nx0.e, j);
                } else if ((zqVar.g & 16) != 0 && (zqVar instanceof zq)) {
                    zl0 zl0Var2 = zqVar.t;
                    int i4 = 0;
                    zqVar = zqVar;
                    r13 = r13;
                    while (zl0Var2 != null) {
                        if ((zl0Var2.g & 16) != 0) {
                            i4++;
                            r13 = r13;
                            if (i4 == 1) {
                                zqVar = zl0Var2;
                            } else {
                                if (r13 == 0) {
                                    r13 = new eo0(new zl0[16]);
                                }
                                if (zqVar != 0) {
                                    r13.b(zqVar);
                                    zqVar = 0;
                                }
                                r13.b(zl0Var2);
                            }
                        }
                        zl0Var2 = zl0Var2.j;
                        zqVar = zqVar;
                        r13 = r13;
                    }
                    if (i4 == 1) {
                    }
                }
                zqVar = op.o(r13);
            }
        }
        return true;
    }

    public final void f(long j, mn0 mn0Var) {
        jj jjVar = this.d;
        if (jjVar.d(j) && mn0Var.g(this) < 0) {
            jjVar.f(j);
            this.e.e(j);
        }
        eo0 eo0Var = this.a;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((jp0) objArr[i2]).f(j, mn0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
