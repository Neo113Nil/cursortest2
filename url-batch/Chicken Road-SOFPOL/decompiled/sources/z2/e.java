package z2;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public y2.e f9129a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9130b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9131c;

    /* renamed from: d, reason: collision with root package name */
    public y2.e f9132d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f9133e;

    /* renamed from: f, reason: collision with root package name */
    public b3.f f9134f;

    /* renamed from: g, reason: collision with root package name */
    public b f9135g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f9136h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.f9140d;
        l lVar2 = oVar.f9163c;
        f fVar2 = oVar.i;
        f fVar3 = oVar.f9168h;
        if (lVar2 == null) {
            y2.e eVar = this.f9129a;
            if (oVar == eVar.f8753d || oVar == eVar.f8755e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f9151a = null;
                lVar.f9152b = new ArrayList();
                lVar.f9151a = oVar;
                arrayList.add(lVar);
            }
            oVar.f9163c = lVar;
            lVar.f9152b.add(oVar);
            ArrayList arrayList2 = fVar3.f9146k;
            int size = arrayList2.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.f9146k;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                ArrayList arrayList4 = ((m) oVar).f9153k.f9146k;
                int size3 = arrayList4.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f9147l;
            int size4 = arrayList5.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList5.get(i12);
                i12++;
                a((f) obj4, i, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.f9147l;
            int size5 = arrayList6.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList6.get(i13);
                i13++;
                a((f) obj5, i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                ArrayList arrayList7 = ((m) oVar).f9153k.f9147l;
                int size6 = arrayList7.size();
                while (i8 < size6) {
                    Object obj6 = arrayList7.get(i8);
                    i8++;
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
        r12.f8753d.f9165e.d(r12.q());
        r12.f8755e.f9165e.d(r12.k());
        r12.f8747a = true;
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
        r12.f8753d.f9165e.d(r12.q());
        r12.f8755e.f9165e.d(r12.k());
        r12.f8747a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        f(r8, 0, r6, 0, r12);
        r12.f8753d.f9165e.f9148m = r12.q();
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
        r12.f8753d.f9165e.d(r12.q());
        r12.f8755e.f9165e.d(r12.k());
        r12.f8747a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].f8744f == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].f8744f != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        f(r8, 0, r10, 0, r12);
        r12.f8753d.f9165e.d(r12.q());
        r12.f8755e.f9165e.d(r12.k());
        r12.f8747a = true;
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
        r12.f8753d.f9165e.d(r12.q());
        r12.f8755e.f9165e.d(r12.k());
        r12.f8747a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        f(r10, 0, r10, 0, r12);
        r12.f8753d.f9165e.f9148m = r12.q();
        r12.f8755e.f9165e.f9148m = r12.k();
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
        r12.f8753d.f9165e.d(r12.q());
        r12.f8755e.f9165e.d(r12.k());
        r12.f8747a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        f(r13, 0, r8, 0, r12);
        r12.f8755e.f9165e.f9148m = r12.k();
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
        r12.f8753d.f9165e.d(r12.q());
        r12.f8755e.f9165e.d(r12.k());
        r12.f8747a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].f8744f == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].f8744f != null) goto L131;
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
    public final void b(y2.e eVar) {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        e eVar2;
        int i15;
        ArrayList arrayList = eVar.f8788q0;
        int[] iArr = eVar.f8777p0;
        int size = arrayList.size();
        char c8 = 0;
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            y2.d dVar = (y2.d) obj;
            int[] iArr2 = dVar.f8777p0;
            y2.c[] cVarArr = dVar.Q;
            y2.c cVar = dVar.L;
            y2.c cVar2 = dVar.J;
            y2.c cVar3 = dVar.K;
            y2.c cVar4 = dVar.I;
            int i17 = iArr2[c8];
            int i18 = iArr2[1];
            char c9 = c8;
            if (dVar.f8760g0 == 8) {
                dVar.f8747a = true;
                c8 = c9;
            } else {
                float f6 = dVar.f8784w;
                if (f6 < 1.0f && i17 == 3) {
                    dVar.f8779r = 2;
                }
                float f8 = dVar.f8787z;
                if (f8 < 1.0f && i18 == 3) {
                    dVar.f8780s = 2;
                }
                if (dVar.W > 0.0f) {
                    if (i17 == 3) {
                        i15 = 2;
                        if (i18 == 2 || i18 == 1) {
                            i = 3;
                            dVar.f8779r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i15 = 2;
                    }
                    if (i18 == i && (i17 == i15 || i17 == 1)) {
                        dVar.f8780s = i;
                    } else if (i17 == i && i18 == i) {
                        if (dVar.f8779r == 0) {
                            dVar.f8779r = i;
                        }
                        if (dVar.f8780s == 0) {
                            dVar.f8780s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i17 == i && dVar.f8779r == 1 && (cVar4.f8744f == null || cVar3.f8744f == null)) {
                    i17 = 2;
                }
                if (i18 == 3 && dVar.f8780s == 1 && (cVar2.f8744f == null || cVar.f8744f == null)) {
                    i18 = 2;
                }
                k kVar = dVar.f8753d;
                kVar.f9164d = i17;
                int i19 = dVar.f8779r;
                kVar.f9161a = i19;
                m mVar = dVar.f8755e;
                mVar.f9164d = i18;
                ArrayList arrayList2 = arrayList;
                int i20 = dVar.f8780s;
                mVar.f9161a = i20;
                int i21 = (i17 == 4 || i17 == 1) ? 2 : 2;
                if (i18 != 4) {
                    if (i18 == 1) {
                        i10 = 1;
                        i8 = i18;
                        i9 = i17;
                        int q4 = dVar.q();
                        if (i9 == 4) {
                            q4 = (eVar.q() - cVar4.f8745g) - cVar3.f8745g;
                            i9 = i10;
                        }
                        int k3 = dVar.k();
                        if (i8 != 4) {
                            int k7 = (eVar.k() - cVar2.f8745g) - cVar.f8745g;
                            i11 = i10;
                            eVar2 = this;
                            i12 = i9;
                            i13 = q4;
                            i14 = k7;
                        } else {
                            i11 = i8;
                            i12 = i9;
                            i13 = q4;
                            i14 = k3;
                            eVar2 = this;
                        }
                        eVar2.f(i12, i13, i11, i14, dVar);
                        dVar.f8753d.f9165e.d(dVar.q());
                        dVar.f8755e.f9165e.d(dVar.k());
                        dVar.f8747a = true;
                        c8 = c9;
                        arrayList = arrayList2;
                    }
                }
                i8 = i18;
                i9 = i17;
                i10 = 1;
                int q42 = dVar.q();
                if (i9 == 4) {
                }
                int k32 = dVar.k();
                if (i8 != 4) {
                }
                eVar2.f(i12, i13, i11, i14, dVar);
                dVar.f8753d.f9165e.d(dVar.q());
                dVar.f8755e.f9165e.d(dVar.k());
                dVar.f8747a = true;
                c8 = c9;
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        y2.e eVar = this.f9129a;
        ArrayList arrayList = this.f9136h;
        ArrayList arrayList2 = this.f9133e;
        arrayList2.clear();
        y2.e eVar2 = this.f9132d;
        eVar2.f8753d.f();
        eVar2.f8755e.f();
        arrayList2.add(eVar2.f8753d);
        arrayList2.add(eVar2.f8755e);
        ArrayList arrayList3 = eVar2.f8788q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            y2.d dVar = (y2.d) obj;
            if (dVar instanceof y2.h) {
                i iVar = new i(dVar);
                dVar.f8753d.f();
                dVar.f8755e.f();
                iVar.f9166f = ((y2.h) dVar).f8829u0;
                arrayList2.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f8749b == null) {
                        dVar.f8749b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f8749b);
                } else {
                    arrayList2.add(dVar.f8753d);
                }
                if (dVar.y()) {
                    if (dVar.f8751c == null) {
                        dVar.f8751c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f8751c);
                } else {
                    arrayList2.add(dVar.f8755e);
                }
                if (dVar instanceof y2.i) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj3 = arrayList2.get(i9);
            i9++;
            o oVar = (o) obj3;
            if (oVar.f9162b != eVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        e(eVar.f8753d, 0, arrayList);
        e(eVar.f8755e, 1, arrayList);
        this.f9130b = false;
    }

    public final int d(y2.e eVar, int i) {
        ArrayList arrayList;
        int i8;
        long max;
        float f6;
        y2.e eVar2 = eVar;
        ArrayList arrayList2 = this.f9136h;
        int size = arrayList2.size();
        long j7 = 0;
        int i9 = 0;
        long j8 = 0;
        while (i9 < size) {
            o oVar = ((l) arrayList2.get(i9)).f9151a;
            if (!(oVar instanceof c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f9166f != i) {
                f fVar = (i == 0 ? eVar2.f8753d : eVar2.f8755e).f9168h;
                f fVar2 = (i == 0 ? eVar2.f8753d : eVar2.f8755e).i;
                f fVar3 = oVar.f9168h;
                f fVar4 = oVar.i;
                boolean contains = fVar3.f9147l.contains(fVar);
                boolean contains2 = fVar4.f9147l.contains(fVar2);
                long j9 = oVar.j();
                if (contains && contains2) {
                    long b8 = l.b(fVar3, j7);
                    long a8 = l.a(fVar4, j7);
                    long j10 = b8 - j9;
                    int i10 = fVar4.f9142f;
                    arrayList = arrayList2;
                    i8 = size;
                    if (j10 >= (-i10)) {
                        j10 += i10;
                    }
                    long j11 = fVar3.f9142f;
                    long j12 = ((-a8) - j9) - j11;
                    if (j12 >= j11) {
                        j12 -= j11;
                    }
                    y2.d dVar = oVar.f9162b;
                    if (i == 0) {
                        f6 = dVar.f8754d0;
                    } else if (i == 1) {
                        f6 = dVar.f8756e0;
                    } else {
                        dVar.getClass();
                        f6 = -1.0f;
                    }
                    float f8 = f6 > 0.0f ? (long) ((j10 / (1.0f - f6)) + (j12 / f6)) : 0L;
                    max = (fVar3.f9142f + ((((long) ((f8 * f6) + 0.5f)) + j9) + ((long) (((1.0f - f6) * f8) + 0.5f)))) - fVar4.f9142f;
                } else {
                    arrayList = arrayList2;
                    i8 = size;
                    max = contains ? Math.max(l.b(fVar3, fVar3.f9142f), fVar3.f9142f + j9) : contains2 ? Math.max(-l.a(fVar4, fVar4.f9142f), (-fVar4.f9142f) + j9) : (oVar.j() + fVar3.f9142f) - fVar4.f9142f;
                }
            } else {
                arrayList = arrayList2;
                i8 = size;
                max = j7;
            }
            j8 = Math.max(j8, max);
            i9++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i8;
            j7 = 0;
        }
        return (int) j8;
    }

    public final void e(o oVar, int i, ArrayList arrayList) {
        f fVar = oVar.f9168h;
        f fVar2 = oVar.i;
        ArrayList arrayList2 = fVar.f9146k;
        int size = arrayList2.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f9168h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f9146k;
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((m) oVar).f9153k.f9146k;
            int size3 = arrayList4.size();
            while (i8 < size3) {
                Object obj3 = arrayList4.get(i8);
                i8++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i8, int i9, int i10, y2.d dVar) {
        b bVar = this.f9135g;
        bVar.f9118a = i;
        bVar.f9119b = i9;
        bVar.f9120c = i8;
        bVar.f9121d = i10;
        this.f9134f.b(dVar, bVar);
        dVar.O(bVar.f9122e);
        dVar.L(bVar.f9123f);
        dVar.E = bVar.f9125h;
        dVar.I(bVar.f9124g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f9129a.f8788q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i8 = i + 1;
            y2.d dVar = (y2.d) arrayList.get(i);
            if (!dVar.f8747a) {
                int[] iArr = dVar.f8777p0;
                int i9 = iArr[0];
                int i10 = iArr[1];
                int i11 = dVar.f8779r;
                int i12 = dVar.f8780s;
                boolean z3 = i9 == 2 || (i9 == 3 && i11 == 1);
                boolean z7 = i10 == 2 || (i10 == 3 && i12 == 1);
                g gVar = dVar.f8753d.f9165e;
                boolean z8 = gVar.f9145j;
                g gVar2 = dVar.f8755e.f9165e;
                boolean z9 = gVar2.f9145j;
                boolean z10 = z3;
                if (z8 && z9) {
                    eVar.f(1, gVar.f9143g, 1, gVar2.f9143g, dVar);
                    dVar.f8747a = true;
                } else if (z8 && z7) {
                    f(1, gVar.f9143g, 2, gVar2.f9143g, dVar);
                    if (i10 == 3) {
                        dVar.f8755e.f9165e.f9148m = dVar.k();
                    } else {
                        dVar.f8755e.f9165e.d(dVar.k());
                        dVar.f8747a = true;
                    }
                } else if (z9 && z10) {
                    f(2, gVar.f9143g, 1, gVar2.f9143g, dVar);
                    if (i9 == 3) {
                        dVar.f8753d.f9165e.f9148m = dVar.q();
                    } else {
                        dVar.f8753d.f9165e.d(dVar.q());
                        dVar.f8747a = true;
                    }
                }
                if (dVar.f8747a && (aVar = dVar.f8755e.f9154l) != null) {
                    aVar.d(dVar.f8748a0);
                }
                eVar = this;
            }
            i = i8;
        }
    }
}
