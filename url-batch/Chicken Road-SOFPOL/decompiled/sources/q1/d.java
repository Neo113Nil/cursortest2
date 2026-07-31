package q1;

import a0.a0;
import d6.u;
import java.util.ArrayList;
import java.util.List;
import o.e0;
import w1.d1;
import w1.p1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final y0.l f5977c;

    /* renamed from: d, reason: collision with root package name */
    public final k5.e f5978d;

    /* renamed from: e, reason: collision with root package name */
    public final o.q f5979e;

    /* renamed from: f, reason: collision with root package name */
    public d1 f5980f;

    /* renamed from: g, reason: collision with root package name */
    public f f5981g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5982h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5983j;

    public d(y0.l lVar) {
        this.f5977c = lVar;
        k5.e eVar = new k5.e();
        eVar.f4190e = new long[2];
        this.f5978d = eVar;
        this.f5979e = new o.q(2);
        this.i = true;
        this.f5983j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r5v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // q1.e
    public final boolean a(o.q qVar, u1.p pVar, a0 a0Var, boolean z3) {
        o.q qVar2;
        k5.e eVar;
        Object obj;
        boolean z7;
        boolean z8;
        f fVar;
        int i;
        int i8;
        boolean z9;
        int i9;
        boolean z10;
        int i10;
        List list;
        k kVar;
        u1.p pVar2 = pVar;
        boolean a8 = super.a(qVar, pVar, a0Var, z3);
        w1.l lVar = this.f5977c;
        boolean z11 = true;
        if (lVar.f8718q) {
            ?? r8 = 0;
            while (lVar != 0) {
                if (lVar instanceof p1) {
                    this.f5980f = w1.f.s((p1) lVar, 16);
                } else if ((lVar.f8708f & 16) != 0 && (lVar instanceof w1.l)) {
                    y0.l lVar2 = lVar.f7707s;
                    int i11 = 0;
                    lVar = lVar;
                    r8 = r8;
                    while (lVar2 != null) {
                        if ((lVar2.f8708f & 16) != 0) {
                            i11++;
                            r8 = r8;
                            if (i11 == 1) {
                                lVar = lVar2;
                            } else {
                                if (r8 == 0) {
                                    r8 = new o0.e(new y0.l[16]);
                                }
                                if (lVar != 0) {
                                    r8.b(lVar);
                                    lVar = 0;
                                }
                                r8.b(lVar2);
                            }
                        }
                        lVar2 = lVar2.i;
                        lVar = lVar;
                        r8 = r8;
                    }
                    if (i11 == 1) {
                    }
                }
                lVar = w1.f.f(r8);
            }
            if (this.f5980f != null) {
                int g3 = qVar.g();
                int i12 = 0;
                while (true) {
                    qVar2 = this.f5979e;
                    eVar = this.f5978d;
                    if (i12 >= g3) {
                        break;
                    }
                    long d8 = qVar.d(i12);
                    k kVar2 = (k) qVar.h(i12);
                    if (eVar.b(d8)) {
                        boolean z12 = z11;
                        long j7 = kVar2.f6000g;
                        List list2 = kVar2.f6003k;
                        long j8 = kVar2.f5996c;
                        if ((((j7 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j8 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z10 = z12;
                            List list3 = u.f2326d;
                            z9 = a8;
                            ArrayList arrayList = new ArrayList((list2 == null ? list3 : list2).size());
                            if (list2 == null) {
                                list2 = list3;
                            }
                            int size = list2.size();
                            i9 = g3;
                            int i13 = 0;
                            while (i13 < size) {
                                int i14 = size;
                                a aVar = (a) list2.get(i13);
                                long j9 = d8;
                                List list4 = list2;
                                long j10 = aVar.f5961b;
                                if ((((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    list = list4;
                                    kVar = kVar2;
                                    long j11 = aVar.f5960a;
                                    i10 = i13;
                                    d1 d1Var = this.f5980f;
                                    q6.i.b(d1Var);
                                    arrayList.add(new a(j11, d1Var.N0(pVar2, j10), aVar.f5962c));
                                } else {
                                    i10 = i13;
                                    list = list4;
                                    kVar = kVar2;
                                }
                                i13 = i10 + 1;
                                list2 = list;
                                size = i14;
                                d8 = j9;
                                kVar2 = kVar;
                            }
                            long j12 = d8;
                            d1 d1Var2 = this.f5980f;
                            q6.i.b(d1Var2);
                            long N0 = d1Var2.N0(pVar2, j7);
                            d1 d1Var3 = this.f5980f;
                            q6.i.b(d1Var3);
                            k kVar3 = new k(kVar2.f5994a, kVar2.f5995b, d1Var3.N0(pVar2, j8), kVar2.f5997d, kVar2.f5998e, kVar2.f5999f, N0, kVar2.f6001h, kVar2.i, arrayList, kVar2.f6002j, kVar2.f6004l);
                            k kVar4 = kVar2.f6007o;
                            if (kVar4 == null) {
                                kVar4 = kVar2;
                            }
                            kVar3.f6007o = kVar4;
                            k kVar5 = kVar2.f6007o;
                            if (kVar5 != null) {
                                kVar2 = kVar5;
                            }
                            kVar3.f6007o = kVar2;
                            qVar2.e(j12, kVar3);
                        } else {
                            z9 = a8;
                            i9 = g3;
                            z10 = z12;
                        }
                    } else {
                        z9 = a8;
                        i9 = g3;
                        z10 = z11;
                    }
                    i12++;
                    pVar2 = pVar;
                    z11 = z10;
                    g3 = i9;
                    a8 = z9;
                }
                boolean z13 = a8;
                boolean z14 = z11;
                if (qVar2.g() == 0) {
                    eVar.f4189d = 0;
                    this.f5984a.g();
                    return z14;
                }
                int i15 = eVar.f4189d;
                while (true) {
                    i15--;
                    if (-1 >= i15) {
                        break;
                    }
                    if (qVar.c(((long[]) eVar.f4190e)[i15]) < 0 && i15 < (i8 = eVar.f4189d)) {
                        int i16 = i8 - 1;
                        int i17 = i15;
                        while (i17 < i16) {
                            long[] jArr = (long[]) eVar.f4190e;
                            int i18 = i17 + 1;
                            jArr[i17] = jArr[i18];
                            i17 = i18;
                        }
                        eVar.f4189d--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qVar2.g());
                int g7 = qVar2.g();
                for (int i19 = 0; i19 < g7; i19++) {
                    arrayList2.add(qVar2.h(i19));
                }
                f fVar2 = new f(arrayList2, a0Var);
                int size2 = arrayList2.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i20);
                    if (a0Var.i(((k) obj).f5994a)) {
                        break;
                    }
                    i20++;
                }
                k kVar6 = (k) obj;
                if (kVar6 != null) {
                    boolean z15 = kVar6.f5997d;
                    if (z3) {
                        z7 = false;
                        if (!this.i && (z15 || kVar6.f6001h)) {
                            d1 d1Var4 = this.f5980f;
                            q6.i.b(d1Var4);
                            long j13 = d1Var4.f7232f;
                            long j14 = kVar6.f5996c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L));
                            int i21 = (int) (j13 >> 32);
                            this.i = !((intBitsToFloat2 > ((float) ((int) (j13 & 4294967295L))) ? z14 : false) | (intBitsToFloat > ((float) i21) ? z14 : false) | (intBitsToFloat < 0.0f ? z14 : false) | (intBitsToFloat2 < 0.0f ? z14 : false));
                        }
                    } else {
                        z7 = false;
                        this.i = false;
                    }
                    boolean z16 = this.i;
                    boolean z17 = this.f5982h;
                    if (z16 == z17 || !((i = fVar2.f5987b) == 3 || i == 4 || i == 5)) {
                        int i22 = fVar2.f5987b;
                        if (i22 == 4 && z17 && !this.f5983j) {
                            fVar2.f5987b = 3;
                        } else if (i22 == 5 && z16 && z15) {
                            fVar2.f5987b = 3;
                        }
                    } else {
                        fVar2.f5987b = z16 ? 4 : 5;
                    }
                } else {
                    z7 = false;
                }
                if (!z13 && fVar2.f5987b == 3 && (fVar = this.f5981g) != null) {
                    ?? r12 = fVar.f5986a;
                    int size3 = r12.size();
                    ?? r52 = fVar2.f5986a;
                    if (size3 == r52.size()) {
                        int size4 = r52.size();
                        for (?? r62 = z7; r62 < size4; r62++) {
                            if (e1.b.b(((k) r12.get(r62)).f5996c, ((k) r52.get(r62)).f5996c)) {
                            }
                        }
                        z8 = z7;
                        this.f5981g = fVar2;
                        return z8;
                    }
                }
                z8 = z14;
                this.f5981g = fVar2;
                return z8;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // q1.e
    public final void b(a0 a0Var) {
        super.b(a0Var);
        f fVar = this.f5981g;
        if (fVar == null) {
            return;
        }
        this.f5982h = this.i;
        ?? r12 = fVar.f5986a;
        int size = r12.size();
        for (int i = 0; i < size; i++) {
            k kVar = (k) r12.get(i);
            boolean z3 = kVar.f5997d;
            long j7 = kVar.f5994a;
            boolean i8 = a0Var.i(j7);
            boolean z7 = this.i;
            if ((!z3 && !i8) || (!z3 && !z7)) {
                this.f5978d.c(j7);
            }
        }
        this.i = false;
        this.f5983j = fVar.f5987b == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [o0.e] */
    public final void c() {
        o0.e eVar = this.f5984a;
        Object[] objArr = eVar.f5578d;
        int i = eVar.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            ((d) objArr[i8]).c();
        }
        w1.l lVar = this.f5977c;
        ?? r32 = 0;
        while (lVar != 0) {
            if (lVar instanceof p1) {
                ((p1) lVar).S();
            } else if ((lVar.f8708f & 16) != 0 && (lVar instanceof w1.l)) {
                y0.l lVar2 = lVar.f7707s;
                int i9 = 0;
                lVar = lVar;
                r32 = r32;
                while (lVar2 != null) {
                    if ((lVar2.f8708f & 16) != 0) {
                        i9++;
                        r32 = r32;
                        if (i9 == 1) {
                            lVar = lVar2;
                        } else {
                            if (r32 == 0) {
                                r32 = new o0.e(new y0.l[16]);
                            }
                            if (lVar != 0) {
                                r32.b(lVar);
                                lVar = 0;
                            }
                            r32.b(lVar2);
                        }
                    }
                    lVar2 = lVar2.i;
                    lVar = lVar;
                    r32 = r32;
                }
                if (i9 == 1) {
                }
            }
            lVar = w1.f.f(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [y0.l] */
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
    /* JADX WARN: Type inference failed for: r8v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(a0 a0Var) {
        o.q qVar = this.f5979e;
        boolean z3 = false;
        z3 = false;
        if (qVar.g() != 0) {
            y0.l lVar = this.f5977c;
            if (lVar.f8718q) {
                f fVar = this.f5981g;
                q6.i.b(fVar);
                d1 d1Var = this.f5980f;
                q6.i.b(d1Var);
                long j7 = d1Var.f7232f;
                w1.l lVar2 = lVar;
                ?? r8 = 0;
                while (lVar2 != 0) {
                    if (lVar2 instanceof p1) {
                        ((p1) lVar2).C(fVar, g.f5990f, j7);
                    } else if ((lVar2.f8708f & 16) != 0 && (lVar2 instanceof w1.l)) {
                        y0.l lVar3 = lVar2.f7707s;
                        int i = 0;
                        lVar2 = lVar2;
                        r8 = r8;
                        while (lVar3 != null) {
                            if ((lVar3.f8708f & 16) != 0) {
                                i++;
                                r8 = r8;
                                if (i == 1) {
                                    lVar2 = lVar3;
                                } else {
                                    if (r8 == 0) {
                                        r8 = new o0.e(new y0.l[16]);
                                    }
                                    if (lVar2 != 0) {
                                        r8.b(lVar2);
                                        lVar2 = 0;
                                    }
                                    r8.b(lVar3);
                                }
                            }
                            lVar3 = lVar3.i;
                            lVar2 = lVar2;
                            r8 = r8;
                        }
                        if (i == 1) {
                        }
                    }
                    lVar2 = w1.f.f(r8);
                }
                if (lVar.f8718q) {
                    o0.e eVar = this.f5984a;
                    Object[] objArr = eVar.f5578d;
                    int i8 = eVar.f5580f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((d) objArr[i9]).d(a0Var);
                    }
                }
                z3 = true;
            }
        }
        b(a0Var);
        qVar.a();
        this.f5980f = null;
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(a0 a0Var, boolean z3) {
        if (this.f5979e.g() == 0) {
            return false;
        }
        w1.l lVar = this.f5977c;
        if (!lVar.f8718q) {
            return false;
        }
        f fVar = this.f5981g;
        q6.i.b(fVar);
        d1 d1Var = this.f5980f;
        q6.i.b(d1Var);
        long j7 = d1Var.f7232f;
        w1.l lVar2 = lVar;
        ?? r7 = 0;
        while (lVar2 != 0) {
            if (lVar2 instanceof p1) {
                ((p1) lVar2).C(fVar, g.f5988d, j7);
            } else if ((lVar2.f8708f & 16) != 0 && (lVar2 instanceof w1.l)) {
                y0.l lVar3 = lVar2.f7707s;
                int i = 0;
                lVar2 = lVar2;
                r7 = r7;
                while (lVar3 != null) {
                    if ((lVar3.f8708f & 16) != 0) {
                        i++;
                        r7 = r7;
                        if (i == 1) {
                            lVar2 = lVar3;
                        } else {
                            if (r7 == 0) {
                                r7 = new o0.e(new y0.l[16]);
                            }
                            if (lVar2 != 0) {
                                r7.b(lVar2);
                                lVar2 = 0;
                            }
                            r7.b(lVar3);
                        }
                    }
                    lVar3 = lVar3.i;
                    lVar2 = lVar2;
                    r7 = r7;
                }
                if (i == 1) {
                }
            }
            lVar2 = w1.f.f(r7);
        }
        if (lVar.f8718q) {
            o0.e eVar = this.f5984a;
            Object[] objArr = eVar.f5578d;
            int i8 = eVar.f5580f;
            for (int i9 = 0; i9 < i8; i9++) {
                d dVar = (d) objArr[i9];
                q6.i.b(this.f5980f);
                dVar.e(a0Var, z3);
            }
        }
        if (lVar.f8718q) {
            ?? r14 = 0;
            while (lVar != 0) {
                if (lVar instanceof p1) {
                    ((p1) lVar).C(fVar, g.f5989e, j7);
                } else if ((lVar.f8708f & 16) != 0 && (lVar instanceof w1.l)) {
                    y0.l lVar4 = lVar.f7707s;
                    int i10 = 0;
                    lVar = lVar;
                    r14 = r14;
                    while (lVar4 != null) {
                        if ((lVar4.f8708f & 16) != 0) {
                            i10++;
                            r14 = r14;
                            if (i10 == 1) {
                                lVar = lVar4;
                            } else {
                                if (r14 == 0) {
                                    r14 = new o0.e(new y0.l[16]);
                                }
                                if (lVar != 0) {
                                    r14.b(lVar);
                                    lVar = 0;
                                }
                                r14.b(lVar4);
                            }
                        }
                        lVar4 = lVar4.i;
                        lVar = lVar;
                        r14 = r14;
                    }
                    if (i10 == 1) {
                    }
                }
                lVar = w1.f.f(r14);
            }
        }
        return true;
    }

    public final void f(long j7, e0 e0Var) {
        k5.e eVar = this.f5978d;
        if (eVar.b(j7) && e0Var.f(this) < 0) {
            eVar.c(j7);
            this.f5979e.f(j7);
        }
        o0.e eVar2 = this.f5984a;
        Object[] objArr = eVar2.f5578d;
        int i = eVar2.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            ((d) objArr[i8]).f(j7, e0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f5977c + ", children=" + this.f5984a + ", pointerIds=" + this.f5978d + ')';
    }
}
