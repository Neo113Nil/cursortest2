package l1;

import java.util.ArrayList;
import java.util.List;
import r1.a1;
import r1.l1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: b, reason: collision with root package name */
    public final s0.n f5803b;

    /* renamed from: c, reason: collision with root package name */
    public final l.i f5804c;

    /* renamed from: d, reason: collision with root package name */
    public final i.l f5805d;

    /* renamed from: e, reason: collision with root package name */
    public a1 f5806e;

    /* renamed from: f, reason: collision with root package name */
    public j f5807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5808g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5809h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5810i;

    public h(s0.n nVar) {
        super(0);
        this.f5803b = nVar;
        l.i iVar = new l.i(4, (byte) 0);
        iVar.f5526c = new long[2];
        this.f5804c = iVar;
        this.f5805d = new i.l(2);
        this.f5809h = true;
        this.f5810i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [i0.d] */
    @Override // l1.i
    public final boolean a(i.l lVar, p1.p pVar, androidx.room.c cVar, boolean z8) {
        i.l lVar2;
        l.i iVar;
        Object obj;
        boolean z9;
        boolean z10;
        j jVar;
        int i7;
        boolean z11;
        int i8;
        boolean z12;
        int i9;
        List list;
        v vVar;
        p1.p pVar2 = pVar;
        boolean a3 = super.a(lVar, pVar, cVar, z8);
        r1.m mVar = this.f5803b;
        boolean z13 = true;
        if (!mVar.f8116r) {
            return true;
        }
        ?? r8 = 0;
        while (mVar != 0) {
            if (mVar instanceof l1) {
                this.f5806e = r1.f.r((l1) mVar, 16);
            } else if ((mVar.f8106h & 16) != 0 && (mVar instanceof r1.m)) {
                s0.n nVar = mVar.f7853t;
                int i10 = 0;
                mVar = mVar;
                r8 = r8;
                while (nVar != null) {
                    if ((nVar.f8106h & 16) != 0) {
                        i10++;
                        r8 = r8;
                        if (i10 == 1) {
                            mVar = nVar;
                        } else {
                            if (r8 == 0) {
                                r8 = new i0.d(new s0.n[16]);
                            }
                            if (mVar != 0) {
                                r8.b(mVar);
                                mVar = 0;
                            }
                            r8.b(nVar);
                        }
                    }
                    nVar = nVar.f8109k;
                    mVar = mVar;
                    r8 = r8;
                }
                if (i10 == 1) {
                }
            }
            mVar = r1.f.f(r8);
        }
        int c4 = lVar.c();
        int i11 = 0;
        while (true) {
            lVar2 = this.f5805d;
            iVar = this.f5804c;
            if (i11 >= c4) {
                break;
            }
            long a9 = lVar.a(i11);
            v vVar2 = (v) lVar.d(i11);
            if (iVar.c(a9)) {
                boolean z14 = z13;
                long j8 = vVar2.f5836g;
                List list2 = vVar2.f5840k;
                long j9 = vVar2.f5832c;
                if (y0.c.f(j8) && y0.c.f(j9)) {
                    z12 = z14;
                    List list3 = e6.u.f2826f;
                    z11 = a3;
                    ArrayList arrayList = new ArrayList((list2 == null ? list3 : list2).size());
                    if (list2 == null) {
                        list2 = list3;
                    }
                    int size = list2.size();
                    i8 = c4;
                    int i12 = 0;
                    while (i12 < size) {
                        int i13 = size;
                        d dVar = (d) list2.get(i12);
                        long j10 = a9;
                        List list4 = list2;
                        long j11 = dVar.f5786b;
                        if (y0.c.f(j11)) {
                            list = list4;
                            vVar = vVar2;
                            long j12 = dVar.f5785a;
                            i9 = i12;
                            a1 a1Var = this.f5806e;
                            r6.k.c(a1Var);
                            arrayList.add(new d(j12, a1Var.U0(pVar2, j11), dVar.f5787c));
                        } else {
                            i9 = i12;
                            list = list4;
                            vVar = vVar2;
                        }
                        i12 = i9 + 1;
                        list2 = list;
                        size = i13;
                        a9 = j10;
                        vVar2 = vVar;
                    }
                    a1 a1Var2 = this.f5806e;
                    r6.k.c(a1Var2);
                    long U0 = a1Var2.U0(pVar2, j8);
                    a1 a1Var3 = this.f5806e;
                    r6.k.c(a1Var3);
                    v vVar3 = new v(vVar2.f5830a, vVar2.f5831b, a1Var3.U0(pVar2, j9), vVar2.f5833d, vVar2.f5834e, vVar2.f5835f, U0, vVar2.f5837h, vVar2.f5838i, arrayList, vVar2.f5839j, vVar2.f5841l);
                    vVar3.f5842m = vVar2.f5842m;
                    lVar2.b(a9, vVar3);
                } else {
                    z11 = a3;
                    i8 = c4;
                    z12 = z14;
                }
            } else {
                z11 = a3;
                i8 = c4;
                z12 = z13;
            }
            i11++;
            pVar2 = pVar;
            z13 = z12;
            a3 = z11;
            c4 = i8;
        }
        boolean z15 = a3;
        boolean z16 = z13;
        if (lVar2.c() == 0) {
            iVar.f5525b = 0;
            this.f5811a.h();
            return z16;
        }
        int i14 = iVar.f5525b;
        while (true) {
            i14--;
            if (-1 >= i14) {
                break;
            }
            long j13 = ((long[]) iVar.f5526c)[i14];
            if (lVar.f4755f) {
                int i15 = lVar.f4758i;
                long[] jArr = lVar.f4756g;
                Object[] objArr = lVar.f4757h;
                int i16 = 0;
                for (int i17 = 0; i17 < i15; i17++) {
                    Object obj2 = objArr[i17];
                    if (obj2 != i.m.f4759a) {
                        if (i17 != i16) {
                            jArr[i16] = jArr[i17];
                            objArr[i16] = obj2;
                            objArr[i17] = null;
                        }
                        i16++;
                    }
                }
                lVar.f4755f = false;
                lVar.f4758i = i16;
            }
            if (j.a.b(lVar.f4756g, lVar.f4758i, j13) < 0) {
                iVar.f(i14);
            }
        }
        ArrayList arrayList2 = new ArrayList(lVar2.c());
        int c6 = lVar2.c();
        for (int i18 = 0; i18 < c6; i18++) {
            arrayList2.add(lVar2.d(i18));
        }
        j jVar2 = new j(arrayList2, cVar);
        int size2 = arrayList2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i19);
            if (cVar.k(((v) obj).f5830a)) {
                break;
            }
            i19++;
        }
        v vVar4 = (v) obj;
        if (vVar4 != null) {
            boolean z17 = vVar4.f5833d;
            if (z8) {
                z9 = false;
                if (!this.f5809h && (z17 || vVar4.f5837h)) {
                    r6.k.c(this.f5806e);
                    this.f5809h = !t.d(vVar4, r4.f7065h);
                }
            } else {
                z9 = false;
                this.f5809h = false;
            }
            boolean z18 = this.f5809h;
            boolean z19 = this.f5808g;
            if (z18 == z19 || !((i7 = jVar2.f5814c) == 3 || i7 == 4 || i7 == 5)) {
                int i20 = jVar2.f5814c;
                if (i20 == 4 && z19 && !this.f5810i) {
                    jVar2.f5814c = 3;
                } else if (i20 == 5 && z18 && z17) {
                    jVar2.f5814c = 3;
                }
            } else {
                jVar2.f5814c = z18 ? 4 : 5;
            }
        } else {
            z9 = false;
        }
        if (!z15 && jVar2.f5814c == 3 && (jVar = this.f5807f) != null) {
            ?? r12 = jVar.f5812a;
            int size3 = r12.size();
            ?? r42 = jVar2.f5812a;
            if (size3 == r42.size()) {
                int size4 = r42.size();
                for (?? r52 = z9; r52 < size4; r52++) {
                    if (y0.c.b(((v) r12.get(r52)).f5832c, ((v) r42.get(r52)).f5832c)) {
                    }
                }
                z10 = z9;
                this.f5807f = jVar2;
                return z10;
            }
        }
        z10 = z16;
        this.f5807f = jVar2;
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // l1.i
    public final void c(androidx.room.c cVar) {
        super.c(cVar);
        j jVar = this.f5807f;
        if (jVar == null) {
            return;
        }
        this.f5808g = this.f5809h;
        ?? r12 = jVar.f5812a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            v vVar = (v) r12.get(i7);
            boolean z8 = vVar.f5833d;
            long j8 = vVar.f5830a;
            boolean k8 = cVar.k(j8);
            boolean z9 = this.f5809h;
            if ((!z8 && !k8) || (!z8 && !z9)) {
                l.i iVar = this.f5804c;
                int i8 = iVar.f5525b;
                int i9 = 0;
                while (true) {
                    if (i9 >= i8) {
                        break;
                    }
                    if (j8 == ((long[]) iVar.f5526c)[i9]) {
                        iVar.f(i9);
                        break;
                    }
                    i9++;
                }
            }
        }
        this.f5809h = false;
        this.f5810i = jVar.f5814c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [s0.n] */
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
    /* JADX WARN: Type inference failed for: r4v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i0.d] */
    public final void f() {
        i0.d dVar = this.f5811a;
        int i7 = dVar.f4842h;
        if (i7 > 0) {
            Object[] objArr = dVar.f4840f;
            int i8 = 0;
            do {
                ((h) objArr[i8]).f();
                i8++;
            } while (i8 < i7);
        }
        r1.m mVar = this.f5803b;
        ?? r42 = 0;
        while (mVar != 0) {
            if (mVar instanceof l1) {
                ((l1) mVar).a0();
            } else if ((mVar.f8106h & 16) != 0 && (mVar instanceof r1.m)) {
                s0.n nVar = mVar.f7853t;
                int i9 = 0;
                mVar = mVar;
                r42 = r42;
                while (nVar != null) {
                    if ((nVar.f8106h & 16) != 0) {
                        i9++;
                        r42 = r42;
                        if (i9 == 1) {
                            mVar = nVar;
                        } else {
                            if (r42 == 0) {
                                r42 = new i0.d(new s0.n[16]);
                            }
                            if (mVar != 0) {
                                r42.b(mVar);
                                mVar = 0;
                            }
                            r42.b(nVar);
                        }
                    }
                    nVar = nVar.f8109k;
                    mVar = mVar;
                    r42 = r42;
                }
                if (i9 == 1) {
                }
            }
            mVar = r1.f.f(r42);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008d A[LOOP:0: B:5:0x008b->B:6:0x008d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [s0.n] */
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
    /* JADX WARN: Type inference failed for: r8v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(androidx.room.c cVar) {
        boolean z8;
        i0.d dVar;
        int i7;
        int i8;
        int i9;
        i.l lVar = this.f5805d;
        if (lVar.c() != 0) {
            s0.n nVar = this.f5803b;
            if (nVar.f8116r) {
                j jVar = this.f5807f;
                r6.k.c(jVar);
                a1 a1Var = this.f5806e;
                r6.k.c(a1Var);
                long j8 = a1Var.f7065h;
                r1.m mVar = nVar;
                ?? r8 = 0;
                while (true) {
                    z8 = true;
                    if (mVar == 0) {
                        break;
                    }
                    if (mVar instanceof l1) {
                        ((l1) mVar).A(jVar, k.f5817h, j8);
                    } else if ((mVar.f8106h & 16) != 0 && (mVar instanceof r1.m)) {
                        s0.n nVar2 = mVar.f7853t;
                        int i10 = 0;
                        mVar = mVar;
                        r8 = r8;
                        while (nVar2 != null) {
                            if ((nVar2.f8106h & 16) != 0) {
                                i10++;
                                r8 = r8;
                                if (i10 == 1) {
                                    mVar = nVar2;
                                } else {
                                    if (r8 == 0) {
                                        r8 = new i0.d(new s0.n[16]);
                                    }
                                    if (mVar != 0) {
                                        r8.b(mVar);
                                        mVar = 0;
                                    }
                                    r8.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f8109k;
                            mVar = mVar;
                            r8 = r8;
                        }
                        if (i10 == 1) {
                        }
                    }
                    mVar = r1.f.f(r8);
                }
                if (nVar.f8116r && (i7 = (dVar = this.f5811a).f4842h) > 0) {
                    Object[] objArr = dVar.f4840f;
                    int i11 = 0;
                    do {
                        ((h) objArr[i11]).g(cVar);
                        i11++;
                    } while (i11 < i7);
                }
                c(cVar);
                i8 = lVar.f4758i;
                Object[] objArr2 = lVar.f4757h;
                for (i9 = 0; i9 < i8; i9++) {
                    objArr2[i9] = null;
                }
                lVar.f4758i = 0;
                lVar.f4755f = false;
                this.f5806e = null;
                return z8;
            }
        }
        z8 = false;
        c(cVar);
        i8 = lVar.f4758i;
        Object[] objArr22 = lVar.f4757h;
        while (i9 < i8) {
        }
        lVar.f4758i = 0;
        lVar.f4755f = false;
        this.f5806e = null;
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r0v3, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [s0.n] */
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
    /* JADX WARN: Type inference failed for: r14v5, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean h(androidx.room.c cVar, boolean z8) {
        i0.d dVar;
        int i7;
        if (this.f5805d.c() == 0) {
            return false;
        }
        r1.m mVar = this.f5803b;
        if (!mVar.f8116r) {
            return false;
        }
        j jVar = this.f5807f;
        r6.k.c(jVar);
        a1 a1Var = this.f5806e;
        r6.k.c(a1Var);
        long j8 = a1Var.f7065h;
        r1.m mVar2 = mVar;
        ?? r72 = 0;
        while (mVar2 != 0) {
            if (mVar2 instanceof l1) {
                ((l1) mVar2).A(jVar, k.f5815f, j8);
            } else if ((mVar2.f8106h & 16) != 0 && (mVar2 instanceof r1.m)) {
                s0.n nVar = mVar2.f7853t;
                int i8 = 0;
                mVar2 = mVar2;
                r72 = r72;
                while (nVar != null) {
                    if ((nVar.f8106h & 16) != 0) {
                        i8++;
                        r72 = r72;
                        if (i8 == 1) {
                            mVar2 = nVar;
                        } else {
                            if (r72 == 0) {
                                r72 = new i0.d(new s0.n[16]);
                            }
                            if (mVar2 != 0) {
                                r72.b(mVar2);
                                mVar2 = 0;
                            }
                            r72.b(nVar);
                        }
                    }
                    nVar = nVar.f8109k;
                    mVar2 = mVar2;
                    r72 = r72;
                }
                if (i8 == 1) {
                }
            }
            mVar2 = r1.f.f(r72);
        }
        if (mVar.f8116r && (i7 = (dVar = this.f5811a).f4842h) > 0) {
            Object[] objArr = dVar.f4840f;
            int i9 = 0;
            do {
                h hVar = (h) objArr[i9];
                r6.k.c(this.f5806e);
                hVar.h(cVar, z8);
                i9++;
            } while (i9 < i7);
        }
        if (mVar.f8116r) {
            ?? r14 = 0;
            while (mVar != 0) {
                if (mVar instanceof l1) {
                    ((l1) mVar).A(jVar, k.f5816g, j8);
                } else if ((mVar.f8106h & 16) != 0 && (mVar instanceof r1.m)) {
                    s0.n nVar2 = mVar.f7853t;
                    int i10 = 0;
                    mVar = mVar;
                    r14 = r14;
                    while (nVar2 != null) {
                        if ((nVar2.f8106h & 16) != 0) {
                            i10++;
                            r14 = r14;
                            if (i10 == 1) {
                                mVar = nVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new i0.d(new s0.n[16]);
                                }
                                if (mVar != 0) {
                                    r14.b(mVar);
                                    mVar = 0;
                                }
                                r14.b(nVar2);
                            }
                        }
                        nVar2 = nVar2.f8109k;
                        mVar = mVar;
                        r14 = r14;
                    }
                    if (i10 == 1) {
                    }
                }
                mVar = r1.f.f(r14);
            }
        }
        return true;
    }

    public final void i(long j8, i.v vVar) {
        l.i iVar = this.f5804c;
        int i7 = 0;
        if (iVar.c(j8)) {
            Object[] objArr = vVar.f4804a;
            int i8 = vVar.f4805b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    i9 = -1;
                    break;
                } else if (equals(objArr[i9])) {
                    break;
                } else {
                    i9++;
                }
            }
            if (!(i9 >= 0)) {
                int i10 = iVar.f5525b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    if (j8 == ((long[]) iVar.f5526c)[i11]) {
                        iVar.f(i11);
                        break;
                    }
                    i11++;
                }
                i.l lVar = this.f5805d;
                int b9 = j.a.b(lVar.f4756g, lVar.f4758i, j8);
                if (b9 >= 0) {
                    Object[] objArr2 = lVar.f4757h;
                    Object obj = objArr2[b9];
                    Object obj2 = i.m.f4759a;
                    if (obj != obj2) {
                        objArr2[b9] = obj2;
                        lVar.f4755f = true;
                    }
                }
            }
        }
        i0.d dVar = this.f5811a;
        int i12 = dVar.f4842h;
        if (i12 > 0) {
            Object[] objArr3 = dVar.f4840f;
            do {
                ((h) objArr3[i7]).i(j8, vVar);
                i7++;
            } while (i7 < i12);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f5803b + ", children=" + this.f5811a + ", pointerIds=" + this.f5804c + ')';
    }
}
