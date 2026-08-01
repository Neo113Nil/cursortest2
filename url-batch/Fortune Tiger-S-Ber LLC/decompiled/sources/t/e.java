package t;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f3328a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3329b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public s.e f3330d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3331e;

    /* renamed from: f, reason: collision with root package name */
    public v.f f3332f;
    public b g;
    public ArrayList h;

    public final void a(f fVar, int i4, ArrayList arrayList, l lVar) {
        o oVar = fVar.f3335d;
        l lVar2 = oVar.c;
        f fVar2 = oVar.f3359i;
        f fVar3 = oVar.h;
        if (lVar2 == null) {
            s.e eVar = this.f3328a;
            if (oVar == eVar.f3237d || oVar == eVar.f3239e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f3345a = null;
                lVar.f3346b = new ArrayList();
                lVar.f3345a = oVar;
                arrayList.add(lVar);
            }
            oVar.c = lVar;
            lVar.f3346b.add(oVar);
            ArrayList arrayList2 = fVar3.f3340k;
            int size = arrayList2.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i4, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.f3340k;
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i4, arrayList, lVar);
                }
            }
            if (i4 == 1 && (oVar instanceof m)) {
                ArrayList arrayList4 = ((m) oVar).f3347k.f3340k;
                int size3 = arrayList4.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj3 = arrayList4.get(i8);
                    i8++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i4, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f3341l;
            int size4 = arrayList5.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj4 = arrayList5.get(i9);
                i9++;
                a((f) obj4, i4, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.f3341l;
            int size5 = arrayList6.size();
            int i10 = 0;
            while (i10 < size5) {
                Object obj5 = arrayList6.get(i10);
                i10++;
                a((f) obj5, i4, arrayList, lVar);
            }
            if (i4 == 1 && (oVar instanceof m)) {
                ArrayList arrayList7 = ((m) oVar).f3347k.f3341l;
                int size6 = arrayList7.size();
                while (i5 < size6) {
                    Object obj6 = arrayList7.get(i5);
                    i5++;
                    a((f) obj6, i4, arrayList, lVar);
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
        r12.f3237d.f3357e.d(r12.q());
        r12.f3239e.f3357e.d(r12.k());
        r12.f3233a = true;
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
        r12.f3237d.f3357e.d(r12.q());
        r12.f3239e.f3357e.d(r12.k());
        r12.f3233a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        f(r8, 0, r6, 0, r12);
        r12.f3237d.f3357e.f3342m = r12.q();
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
        r12.f3237d.f3357e.d(r12.q());
        r12.f3239e.f3357e.d(r12.k());
        r12.f3233a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].f3231f == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].f3231f != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        f(r8, 0, r10, 0, r12);
        r12.f3237d.f3357e.d(r12.q());
        r12.f3239e.f3357e.d(r12.k());
        r12.f3233a = true;
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
        r12.f3237d.f3357e.d(r12.q());
        r12.f3239e.f3357e.d(r12.k());
        r12.f3233a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        f(r10, 0, r10, 0, r12);
        r12.f3237d.f3357e.f3342m = r12.q();
        r12.f3239e.f3357e.f3342m = r12.k();
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
        r12.f3237d.f3357e.d(r12.q());
        r12.f3239e.f3357e.d(r12.k());
        r12.f3233a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        f(r13, 0, r8, 0, r12);
        r12.f3239e.f3357e.f3342m = r12.k();
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
        r12.f3237d.f3357e.d(r12.q());
        r12.f3239e.f3357e.d(r12.k());
        r12.f3233a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].f3231f == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].f3231f != null) goto L131;
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
    public final void b(s.e eVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        e eVar2;
        int i12;
        ArrayList arrayList = eVar.f3270q0;
        int[] iArr = eVar.f3259p0;
        int size = arrayList.size();
        char c = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            s.d dVar = (s.d) obj;
            int[] iArr2 = dVar.f3259p0;
            s.c[] cVarArr = dVar.Q;
            s.c cVar = dVar.L;
            s.c cVar2 = dVar.J;
            s.c cVar3 = dVar.K;
            s.c cVar4 = dVar.I;
            int i14 = iArr2[c];
            int i15 = iArr2[1];
            char c4 = c;
            if (dVar.f3242g0 == 8) {
                dVar.f3233a = true;
                c = c4;
            } else {
                float f4 = dVar.f3266w;
                if (f4 < 1.0f && i14 == 3) {
                    dVar.f3261r = 2;
                }
                float f5 = dVar.f3269z;
                if (f5 < 1.0f && i15 == 3) {
                    dVar.f3262s = 2;
                }
                if (dVar.W > 0.0f) {
                    if (i14 == 3) {
                        i12 = 2;
                        if (i15 == 2 || i15 == 1) {
                            i4 = 3;
                            dVar.f3261r = 3;
                        } else {
                            i4 = 3;
                        }
                    } else {
                        i4 = 3;
                        i12 = 2;
                    }
                    if (i15 == i4 && (i14 == i12 || i14 == 1)) {
                        dVar.f3262s = i4;
                    } else if (i14 == i4 && i15 == i4) {
                        if (dVar.f3261r == 0) {
                            dVar.f3261r = i4;
                        }
                        if (dVar.f3262s == 0) {
                            dVar.f3262s = i4;
                        }
                    }
                } else {
                    i4 = 3;
                }
                if (i14 == i4 && dVar.f3261r == 1 && (cVar4.f3231f == null || cVar3.f3231f == null)) {
                    i14 = 2;
                }
                if (i15 == 3 && dVar.f3262s == 1 && (cVar2.f3231f == null || cVar.f3231f == null)) {
                    i15 = 2;
                }
                k kVar = dVar.f3237d;
                kVar.f3356d = i14;
                int i16 = dVar.f3261r;
                kVar.f3354a = i16;
                m mVar = dVar.f3239e;
                mVar.f3356d = i15;
                ArrayList arrayList2 = arrayList;
                int i17 = dVar.f3262s;
                mVar.f3354a = i17;
                int i18 = (i14 == 4 || i14 == 1) ? 2 : 2;
                if (i15 != 4) {
                    if (i15 == 1) {
                        i7 = 1;
                        i5 = i15;
                        i6 = i14;
                        int q4 = dVar.q();
                        if (i6 == 4) {
                            q4 = (eVar.q() - cVar4.g) - cVar3.g;
                            i6 = i7;
                        }
                        int k4 = dVar.k();
                        if (i5 != 4) {
                            int k5 = (eVar.k() - cVar2.g) - cVar.g;
                            i8 = i7;
                            eVar2 = this;
                            i9 = i6;
                            i10 = q4;
                            i11 = k5;
                        } else {
                            i8 = i5;
                            i9 = i6;
                            i10 = q4;
                            i11 = k4;
                            eVar2 = this;
                        }
                        eVar2.f(i9, i10, i8, i11, dVar);
                        dVar.f3237d.f3357e.d(dVar.q());
                        dVar.f3239e.f3357e.d(dVar.k());
                        dVar.f3233a = true;
                        c = c4;
                        arrayList = arrayList2;
                    }
                }
                i5 = i15;
                i6 = i14;
                i7 = 1;
                int q42 = dVar.q();
                if (i6 == 4) {
                }
                int k42 = dVar.k();
                if (i5 != 4) {
                }
                eVar2.f(i9, i10, i8, i11, dVar);
                dVar.f3237d.f3357e.d(dVar.q());
                dVar.f3239e.f3357e.d(dVar.k());
                dVar.f3233a = true;
                c = c4;
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        s.e eVar = this.f3328a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.f3331e;
        arrayList2.clear();
        s.e eVar2 = this.f3330d;
        eVar2.f3237d.f();
        eVar2.f3239e.f();
        arrayList2.add(eVar2.f3237d);
        arrayList2.add(eVar2.f3239e);
        ArrayList arrayList3 = eVar2.f3270q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            s.d dVar = (s.d) obj;
            if (dVar instanceof s.h) {
                i iVar = new i(dVar);
                dVar.f3237d.f();
                dVar.f3239e.f();
                iVar.f3358f = ((s.h) dVar).f3309u0;
                arrayList2.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3234b == null) {
                        dVar.f3234b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3234b);
                } else {
                    arrayList2.add(dVar.f3237d);
                }
                if (dVar.y()) {
                    if (dVar.c == null) {
                        dVar.c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.c);
                } else {
                    arrayList2.add(dVar.f3239e);
                }
                if (dVar instanceof s.i) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList2.get(i6);
            i6++;
            o oVar = (o) obj3;
            if (oVar.f3355b != eVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        e(eVar.f3237d, 0, arrayList);
        e(eVar.f3239e, 1, arrayList);
        this.f3329b = false;
    }

    public final int d(s.e eVar, int i4) {
        ArrayList arrayList;
        int i5;
        long max;
        float f4;
        s.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j4 = 0;
        int i6 = 0;
        long j5 = 0;
        while (i6 < size) {
            o oVar = ((l) arrayList2.get(i6)).f3345a;
            if (!(oVar instanceof c) ? !(i4 != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f3358f != i4) {
                f fVar = (i4 == 0 ? eVar2.f3237d : eVar2.f3239e).h;
                f fVar2 = (i4 == 0 ? eVar2.f3237d : eVar2.f3239e).f3359i;
                f fVar3 = oVar.h;
                f fVar4 = oVar.f3359i;
                boolean contains = fVar3.f3341l.contains(fVar);
                boolean contains2 = fVar4.f3341l.contains(fVar2);
                long j6 = oVar.j();
                if (contains && contains2) {
                    long b2 = l.b(fVar3, j4);
                    long a4 = l.a(fVar4, j4);
                    long j7 = b2 - j6;
                    int i7 = fVar4.f3337f;
                    arrayList = arrayList2;
                    i5 = size;
                    if (j7 >= (-i7)) {
                        j7 += i7;
                    }
                    long j8 = fVar3.f3337f;
                    long j9 = ((-a4) - j6) - j8;
                    if (j9 >= j8) {
                        j9 -= j8;
                    }
                    s.d dVar = oVar.f3355b;
                    if (i4 == 0) {
                        f4 = dVar.f3238d0;
                    } else if (i4 == 1) {
                        f4 = dVar.f3240e0;
                    } else {
                        dVar.getClass();
                        f4 = -1.0f;
                    }
                    float f5 = f4 > 0.0f ? (long) ((j7 / (1.0f - f4)) + (j9 / f4)) : 0L;
                    max = (fVar3.f3337f + ((((long) ((f5 * f4) + 0.5f)) + j6) + ((long) (((1.0f - f4) * f5) + 0.5f)))) - fVar4.f3337f;
                } else {
                    arrayList = arrayList2;
                    i5 = size;
                    max = contains ? Math.max(l.b(fVar3, fVar3.f3337f), fVar3.f3337f + j6) : contains2 ? Math.max(-l.a(fVar4, fVar4.f3337f), (-fVar4.f3337f) + j6) : (oVar.j() + fVar3.f3337f) - fVar4.f3337f;
                }
            } else {
                arrayList = arrayList2;
                i5 = size;
                max = j4;
            }
            j5 = Math.max(j5, max);
            i6++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i5;
            j4 = 0;
        }
        return (int) j5;
    }

    public final void e(o oVar, int i4, ArrayList arrayList) {
        f fVar = oVar.h;
        f fVar2 = oVar.f3359i;
        ArrayList arrayList2 = fVar.f3340k;
        int size = arrayList2.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i4, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).h, i4, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f3340k;
        int size2 = arrayList3.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i4, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f3359i, i4, arrayList, null);
            }
        }
        if (i4 == 1) {
            ArrayList arrayList4 = ((m) oVar).f3347k.f3340k;
            int size3 = arrayList4.size();
            while (i5 < size3) {
                Object obj3 = arrayList4.get(i5);
                i5++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i4, arrayList, null);
                }
            }
        }
    }

    public final void f(int i4, int i5, int i6, int i7, s.d dVar) {
        b bVar = this.g;
        bVar.f3319a = i4;
        bVar.f3320b = i6;
        bVar.c = i5;
        bVar.f3321d = i7;
        this.f3332f.b(dVar, bVar);
        dVar.O(bVar.f3322e);
        dVar.L(bVar.f3323f);
        dVar.E = bVar.h;
        dVar.I(bVar.g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f3328a.f3270q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            s.d dVar = (s.d) arrayList.get(i4);
            if (!dVar.f3233a) {
                int[] iArr = dVar.f3259p0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                int i8 = dVar.f3261r;
                int i9 = dVar.f3262s;
                boolean z3 = i6 == 2 || (i6 == 3 && i8 == 1);
                boolean z4 = i7 == 2 || (i7 == 3 && i9 == 1);
                g gVar = dVar.f3237d.f3357e;
                boolean z5 = gVar.f3339j;
                g gVar2 = dVar.f3239e.f3357e;
                boolean z6 = gVar2.f3339j;
                boolean z7 = z3;
                if (z5 && z6) {
                    eVar.f(1, gVar.g, 1, gVar2.g, dVar);
                    dVar.f3233a = true;
                } else if (z5 && z4) {
                    f(1, gVar.g, 2, gVar2.g, dVar);
                    if (i7 == 3) {
                        dVar.f3239e.f3357e.f3342m = dVar.k();
                    } else {
                        dVar.f3239e.f3357e.d(dVar.k());
                        dVar.f3233a = true;
                    }
                } else if (z6 && z7) {
                    f(2, gVar.g, 1, gVar2.g, dVar);
                    if (i6 == 3) {
                        dVar.f3237d.f3357e.f3342m = dVar.q();
                    } else {
                        dVar.f3237d.f3357e.d(dVar.q());
                        dVar.f3233a = true;
                    }
                }
                if (dVar.f3233a && (aVar = dVar.f3239e.f3348l) != null) {
                    aVar.d(dVar.a0);
                }
                eVar = this;
            }
            i4 = i5;
        }
    }
}
