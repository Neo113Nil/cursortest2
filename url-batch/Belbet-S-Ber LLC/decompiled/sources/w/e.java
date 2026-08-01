package w;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public v.e f3744a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3745b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3746c;
    public v.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3747e;

    /* renamed from: f, reason: collision with root package name */
    public y.f f3748f;

    /* renamed from: g, reason: collision with root package name */
    public b f3749g;
    public ArrayList h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.d;
        l lVar2 = oVar.f3773c;
        f fVar2 = oVar.i;
        f fVar3 = oVar.h;
        if (lVar2 == null) {
            v.e eVar = this.f3744a;
            if (oVar == eVar.d || oVar == eVar.f3617e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f3762a = null;
                lVar.f3763b = new ArrayList();
                lVar.f3762a = oVar;
                arrayList.add(lVar);
            }
            oVar.f3773c = lVar;
            lVar.f3763b.add(oVar);
            ArrayList arrayList2 = fVar3.f3757k;
            int size = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.f3757k;
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList3.get(i6);
                i6++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                ArrayList arrayList4 = ((m) oVar).f3764k.f3757k;
                int size3 = arrayList4.size();
                int i7 = 0;
                while (i7 < size3) {
                    Object obj3 = arrayList4.get(i7);
                    i7++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f3758l;
            int size4 = arrayList5.size();
            int i8 = 0;
            while (i8 < size4) {
                Object obj4 = arrayList5.get(i8);
                i8++;
                a((f) obj4, i, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.f3758l;
            int size5 = arrayList6.size();
            int i9 = 0;
            while (i9 < size5) {
                Object obj5 = arrayList6.get(i9);
                i9++;
                a((f) obj5, i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                ArrayList arrayList7 = ((m) oVar).f3764k.f3758l;
                int size6 = arrayList7.size();
                while (i4 < size6) {
                    Object obj6 = arrayList7.get(i4);
                    i4++;
                    a((f) obj6, i, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0274, code lost:
    
        r6 = 1;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0277, code lost:
    
        f(r11, 0, r10, 0, r12);
        r12.d.f3774e.d(r12.q());
        r12.f3617e.f3774e.d(r12.k());
        r12.f3611a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x029a, code lost:
    
        r7 = r10;
        r0 = r13;
        r10 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e8, code lost:
    
        if (r15 != 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ea, code lost:
    
        if (r6 != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ec, code lost:
    
        f(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f5, code lost:
    
        r11 = r12.k();
        f(1, (int) ((r11 * r12.W) + 0.5f), 1, r11, r12);
        r12.d.f3774e.d(r12.q());
        r12.f3617e.f3774e.d(r12.k());
        r12.f3611a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        f(r8, 0, r6, 0, r12);
        r12.d.f3774e.f3759m = r12.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r15 != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
    
        r0 = r2[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0149, code lost:
    
        if (r0 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014c, code lost:
    
        if (r0 != 4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014f, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0154, code lost:
    
        f(1, (int) ((r4 * r25.q()) + 0.5f), r6, r12.k(), r12);
        r12.d.f3774e.d(r12.q());
        r12.f3617e.f3774e.d(r12.k());
        r12.f3611a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].f3609f == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].f3609f != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        f(r8, 0, r10, 0, r12);
        r12.d.f3774e.d(r12.q());
        r12.f3617e.f3774e.d(r12.k());
        r12.f3611a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b4, code lost:
    
        r8 = r0;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r13 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r13 != 3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r6 == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r6 != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        r8 = r0;
        r0 = 3;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
    
        if (r10 != r0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
    
        if (r13 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bc, code lost:
    
        if (r13 != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        r9 = r0;
        r7 = r10;
        r0 = r13;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        r8 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029f, code lost:
    
        if (r0 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
    
        if (r7 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a3, code lost:
    
        if (r15 == r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a5, code lost:
    
        if (r1 != r6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a9, code lost:
    
        if (r1 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ab, code lost:
    
        if (r15 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02af, code lost:
    
        if (r2[r16] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b3, code lost:
    
        if (r2[r6] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b5, code lost:
    
        f(r8, (int) ((r4 * r25.q()) + 0.5f), r8, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.f3774e.d(r12.q());
        r12.f3617e.f3774e.d(r12.k());
        r12.f3611a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        f(r10, 0, r10, 0, r12);
        r12.d.f3774e.f3759m = r12.q();
        r12.f3617e.f3774e.f3759m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:
    
        if (r1 != r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        if (r13 != r8) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        f(r8, 0, r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
    
        r9 = r12.q();
        r0 = r12.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (r12.X != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01de, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        f(r6, r9, r6, (int) ((r9 * r0) + 0.5f), r12);
        r12.d.f3774e.d(r12.q());
        r12.f3617e.f3774e.d(r12.k());
        r12.f3611a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        f(r13, 0, r8, 0, r12);
        r12.f3617e.f3774e.f3759m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        r11 = r8;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        if (r1 != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0224, code lost:
    
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
    
        if (r7 == r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        if (r7 != 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022c, code lost:
    
        r0 = r8;
        r7 = r10;
        r10 = r11;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0231, code lost:
    
        f(r8, r12.q(), r6, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.f3774e.d(r12.q());
        r12.f3617e.f3774e.d(r12.k());
        r12.f3611a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].f3609f == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].f3609f != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0272, code lost:
    
        r7 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(v.e eVar) {
        int i;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        e eVar2;
        int i11;
        ArrayList arrayList = eVar.f3648q0;
        int[] iArr = eVar.f3637p0;
        int size = arrayList.size();
        char c5 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            v.d dVar = (v.d) obj;
            int[] iArr2 = dVar.f3637p0;
            v.c[] cVarArr = dVar.Q;
            v.c cVar = dVar.L;
            v.c cVar2 = dVar.J;
            v.c cVar3 = dVar.K;
            v.c cVar4 = dVar.I;
            int i13 = iArr2[c5];
            int i14 = iArr2[1];
            char c6 = c5;
            if (dVar.f3622g0 == 8) {
                dVar.f3611a = true;
                c5 = c6;
            } else {
                float f5 = dVar.f3644w;
                if (f5 < 1.0f && i13 == 3) {
                    dVar.f3639r = 2;
                }
                float f6 = dVar.f3647z;
                if (f6 < 1.0f && i14 == 3) {
                    dVar.f3640s = 2;
                }
                if (dVar.W > 0.0f) {
                    if (i13 == 3) {
                        i11 = 2;
                        if (i14 == 2 || i14 == 1) {
                            i = 3;
                            dVar.f3639r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i11 = 2;
                    }
                    if (i14 == i && (i13 == i11 || i13 == 1)) {
                        dVar.f3640s = i;
                    } else if (i13 == i && i14 == i) {
                        if (dVar.f3639r == 0) {
                            dVar.f3639r = i;
                        }
                        if (dVar.f3640s == 0) {
                            dVar.f3640s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i13 == i && dVar.f3639r == 1 && (cVar4.f3609f == null || cVar3.f3609f == null)) {
                    i13 = 2;
                }
                if (i14 == 3 && dVar.f3640s == 1 && (cVar2.f3609f == null || cVar.f3609f == null)) {
                    i14 = 2;
                }
                k kVar = dVar.d;
                kVar.d = i13;
                int i15 = dVar.f3639r;
                kVar.f3771a = i15;
                m mVar = dVar.f3617e;
                mVar.d = i14;
                ArrayList arrayList2 = arrayList;
                int i16 = dVar.f3640s;
                mVar.f3771a = i16;
                int i17 = (i13 == 4 || i13 == 1) ? 2 : 2;
                if (i14 != 4) {
                    if (i14 == 1) {
                        i6 = 1;
                        i4 = i14;
                        i5 = i13;
                        int q4 = dVar.q();
                        if (i5 == 4) {
                            q4 = (eVar.q() - cVar4.f3610g) - cVar3.f3610g;
                            i5 = i6;
                        }
                        int k4 = dVar.k();
                        if (i4 != 4) {
                            int k5 = (eVar.k() - cVar2.f3610g) - cVar.f3610g;
                            i7 = i6;
                            eVar2 = this;
                            i8 = i5;
                            i9 = q4;
                            i10 = k5;
                        } else {
                            i7 = i4;
                            i8 = i5;
                            i9 = q4;
                            i10 = k4;
                            eVar2 = this;
                        }
                        eVar2.f(i8, i9, i7, i10, dVar);
                        dVar.d.f3774e.d(dVar.q());
                        dVar.f3617e.f3774e.d(dVar.k());
                        dVar.f3611a = true;
                        c5 = c6;
                        arrayList = arrayList2;
                    }
                }
                i4 = i14;
                i5 = i13;
                i6 = 1;
                int q42 = dVar.q();
                if (i5 == 4) {
                }
                int k42 = dVar.k();
                if (i4 != 4) {
                }
                eVar2.f(i8, i9, i7, i10, dVar);
                dVar.d.f3774e.d(dVar.q());
                dVar.f3617e.f3774e.d(dVar.k());
                dVar.f3611a = true;
                c5 = c6;
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        v.e eVar = this.f3744a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f3747e;
        arrayList2.clear();
        v.e eVar2 = this.d;
        eVar2.d.f();
        eVar2.f3617e.f();
        arrayList2.add(eVar2.d);
        arrayList2.add(eVar2.f3617e);
        ArrayList arrayList3 = eVar2.f3648q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            v.d dVar = (v.d) obj;
            if (dVar instanceof v.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.f3617e.f();
                iVar.f3775f = ((v.h) dVar).f3687u0;
                arrayList2.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3613b == null) {
                        dVar.f3613b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3613b);
                } else {
                    arrayList2.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f3615c == null) {
                        dVar.f3615c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3615c);
                } else {
                    arrayList2.add(dVar.f3617e);
                }
                if (dVar instanceof v.i) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            o oVar = (o) obj3;
            if (oVar.f3772b != eVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        e(eVar.d, 0, arrayList);
        e(eVar.f3617e, 1, arrayList);
        this.f3745b = false;
    }

    public final int d(v.e eVar, int i) {
        ArrayList arrayList;
        int i4;
        long max;
        float f5;
        v.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j2 = 0;
        int i5 = 0;
        long j4 = 0;
        while (i5 < size) {
            o oVar = ((l) arrayList2.get(i5)).f3762a;
            if (!(oVar instanceof c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f3775f != i) {
                f fVar = (i == 0 ? eVar2.d : eVar2.f3617e).h;
                f fVar2 = (i == 0 ? eVar2.d : eVar2.f3617e).i;
                f fVar3 = oVar.h;
                f fVar4 = oVar.i;
                boolean contains = fVar3.f3758l.contains(fVar);
                boolean contains2 = fVar4.f3758l.contains(fVar2);
                long j5 = oVar.j();
                if (contains && contains2) {
                    long b2 = l.b(fVar3, j2);
                    long a5 = l.a(fVar4, j2);
                    long j6 = b2 - j5;
                    int i6 = fVar4.f3754f;
                    arrayList = arrayList2;
                    i4 = size;
                    if (j6 >= (-i6)) {
                        j6 += i6;
                    }
                    long j7 = fVar3.f3754f;
                    long j8 = ((-a5) - j5) - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    v.d dVar = oVar.f3772b;
                    if (i == 0) {
                        f5 = dVar.d0;
                    } else if (i == 1) {
                        f5 = dVar.f3618e0;
                    } else {
                        dVar.getClass();
                        f5 = -1.0f;
                    }
                    float f6 = f5 > 0.0f ? (long) ((j6 / (1.0f - f5)) + (j8 / f5)) : 0L;
                    max = (fVar3.f3754f + ((((long) ((f6 * f5) + 0.5f)) + j5) + ((long) (((1.0f - f5) * f6) + 0.5f)))) - fVar4.f3754f;
                } else {
                    arrayList = arrayList2;
                    i4 = size;
                    max = contains ? Math.max(l.b(fVar3, fVar3.f3754f), fVar3.f3754f + j5) : contains2 ? Math.max(-l.a(fVar4, fVar4.f3754f), (-fVar4.f3754f) + j5) : (oVar.j() + fVar3.f3754f) - fVar4.f3754f;
                }
            } else {
                arrayList = arrayList2;
                i4 = size;
                max = j2;
            }
            j4 = Math.max(j4, max);
            i5++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i4;
            j2 = 0;
        }
        return (int) j4;
    }

    public final void e(o oVar, int i, ArrayList arrayList) {
        f fVar = oVar.h;
        f fVar2 = oVar.i;
        ArrayList arrayList2 = fVar.f3757k;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f3757k;
        int size2 = arrayList3.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList3.get(i6);
            i6++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((m) oVar).f3764k.f3757k;
            int size3 = arrayList4.size();
            while (i4 < size3) {
                Object obj3 = arrayList4.get(i4);
                i4++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i4, int i5, int i6, v.d dVar) {
        b bVar = this.f3749g;
        bVar.f3735a = i;
        bVar.f3736b = i5;
        bVar.f3737c = i4;
        bVar.d = i6;
        this.f3748f.b(dVar, bVar);
        dVar.O(bVar.f3738e);
        dVar.L(bVar.f3739f);
        dVar.E = bVar.h;
        dVar.I(bVar.f3740g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f3744a.f3648q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i4 = i + 1;
            v.d dVar = (v.d) arrayList.get(i);
            if (!dVar.f3611a) {
                int[] iArr = dVar.f3637p0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = dVar.f3639r;
                int i8 = dVar.f3640s;
                boolean z4 = i5 == 2 || (i5 == 3 && i7 == 1);
                boolean z5 = i6 == 2 || (i6 == 3 && i8 == 1);
                g gVar = dVar.d.f3774e;
                boolean z6 = gVar.f3756j;
                g gVar2 = dVar.f3617e.f3774e;
                boolean z7 = gVar2.f3756j;
                boolean z8 = z4;
                if (z6 && z7) {
                    eVar.f(1, gVar.f3755g, 1, gVar2.f3755g, dVar);
                    dVar.f3611a = true;
                } else if (z6 && z5) {
                    f(1, gVar.f3755g, 2, gVar2.f3755g, dVar);
                    if (i6 == 3) {
                        dVar.f3617e.f3774e.f3759m = dVar.k();
                    } else {
                        dVar.f3617e.f3774e.d(dVar.k());
                        dVar.f3611a = true;
                    }
                } else if (z7 && z8) {
                    f(2, gVar.f3755g, 1, gVar2.f3755g, dVar);
                    if (i5 == 3) {
                        dVar.d.f3774e.f3759m = dVar.q();
                    } else {
                        dVar.d.f3774e.d(dVar.q());
                        dVar.f3611a = true;
                    }
                }
                if (dVar.f3611a && (aVar = dVar.f3617e.f3765l) != null) {
                    aVar.d(dVar.f3612a0);
                }
                eVar = this;
            }
            i = i4;
        }
    }
}
