package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class gf {
    public bd a;
    public boolean b;
    public boolean c;
    public bd d;
    public ArrayList e;
    public qc f;
    public v7 g;
    public ArrayList h;

    public final void a(hf hfVar, int i, ArrayList arrayList, u00 u00Var) {
        ka0 ka0Var = hfVar.d;
        u00 u00Var2 = ka0Var.c;
        hf hfVar2 = ka0Var.i;
        hf hfVar3 = ka0Var.h;
        if (u00Var2 == null) {
            bd bdVar = this.a;
            if (ka0Var == bdVar.d || ka0Var == bdVar.e) {
                return;
            }
            if (u00Var == null) {
                u00Var = new u00();
                u00Var.a = null;
                u00Var.b = new ArrayList();
                u00Var.a = ka0Var;
                arrayList.add(u00Var);
            }
            ka0Var.c = u00Var;
            u00Var.b.add(ka0Var);
            ArrayList arrayList2 = hfVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ff ffVar = (ff) obj;
                if (ffVar instanceof hf) {
                    a((hf) ffVar, i, arrayList, u00Var);
                }
            }
            ArrayList arrayList3 = hfVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                ff ffVar2 = (ff) obj2;
                if (ffVar2 instanceof hf) {
                    a((hf) ffVar2, i, arrayList, u00Var);
                }
            }
            if (i == 1 && (ka0Var instanceof i80)) {
                ArrayList arrayList4 = ((i80) ka0Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    ff ffVar3 = (ff) obj3;
                    if (ffVar3 instanceof hf) {
                        a((hf) ffVar3, i, arrayList, u00Var);
                    }
                }
            }
            ArrayList arrayList5 = hfVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((hf) obj4, i, arrayList, u00Var);
            }
            ArrayList arrayList6 = hfVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((hf) obj5, i, arrayList, u00Var);
            }
            if (i == 1 && (ka0Var instanceof i80)) {
                ArrayList arrayList7 = ((i80) ka0Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((hf) obj6, i, arrayList, u00Var);
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
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
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
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        f(r8, 0, r6, 0, r12);
        r12.d.e.m = r12.q();
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
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].f == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].f != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        f(r8, 0, r10, 0, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
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
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        f(r10, 0, r10, 0, r12);
        r12.d.e.m = r12.q();
        r12.e.e.m = r12.k();
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
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        f(r13, 0, r8, 0, r12);
        r12.e.e.m = r12.k();
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
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].f == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].f != null) goto L131;
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
    public final void b(bd bdVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        gf gfVar;
        int i9;
        ArrayList arrayList = bdVar.q0;
        int[] iArr = bdVar.p0;
        int size = arrayList.size();
        char c = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ad adVar = (ad) obj;
            int[] iArr2 = adVar.p0;
            lc[] lcVarArr = adVar.Q;
            lc lcVar = adVar.L;
            lc lcVar2 = adVar.J;
            lc lcVar3 = adVar.K;
            lc lcVar4 = adVar.I;
            int i11 = iArr2[c];
            int i12 = iArr2[1];
            char c2 = c;
            if (adVar.g0 == 8) {
                adVar.a = true;
                c = c2;
            } else {
                float f = adVar.w;
                if (f < 1.0f && i11 == 3) {
                    adVar.r = 2;
                }
                float f2 = adVar.z;
                if (f2 < 1.0f && i12 == 3) {
                    adVar.s = 2;
                }
                if (adVar.W > 0.0f) {
                    if (i11 == 3) {
                        i9 = 2;
                        if (i12 == 2 || i12 == 1) {
                            i = 3;
                            adVar.r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i9 = 2;
                    }
                    if (i12 == i && (i11 == i9 || i11 == 1)) {
                        adVar.s = i;
                    } else if (i11 == i && i12 == i) {
                        if (adVar.r == 0) {
                            adVar.r = i;
                        }
                        if (adVar.s == 0) {
                            adVar.s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i11 == i && adVar.r == 1 && (lcVar4.f == null || lcVar3.f == null)) {
                    i11 = 2;
                }
                if (i12 == 3 && adVar.s == 1 && (lcVar2.f == null || lcVar.f == null)) {
                    i12 = 2;
                }
                en enVar = adVar.d;
                enVar.d = i11;
                int i13 = adVar.r;
                enVar.a = i13;
                i80 i80Var = adVar.e;
                i80Var.d = i12;
                ArrayList arrayList2 = arrayList;
                int i14 = adVar.s;
                i80Var.a = i14;
                int i15 = (i11 == 4 || i11 == 1) ? 2 : 2;
                if (i12 != 4) {
                    if (i12 == 1) {
                        i4 = 1;
                        i2 = i12;
                        i3 = i11;
                        int q = adVar.q();
                        if (i3 == 4) {
                            q = (bdVar.q() - lcVar4.g) - lcVar3.g;
                            i3 = i4;
                        }
                        int k = adVar.k();
                        if (i2 != 4) {
                            int k2 = (bdVar.k() - lcVar2.g) - lcVar.g;
                            i5 = i4;
                            gfVar = this;
                            i6 = i3;
                            i7 = q;
                            i8 = k2;
                        } else {
                            i5 = i2;
                            i6 = i3;
                            i7 = q;
                            i8 = k;
                            gfVar = this;
                        }
                        gfVar.f(i6, i7, i5, i8, adVar);
                        adVar.d.e.d(adVar.q());
                        adVar.e.e.d(adVar.k());
                        adVar.a = true;
                        c = c2;
                        arrayList = arrayList2;
                    }
                }
                i2 = i12;
                i3 = i11;
                i4 = 1;
                int q2 = adVar.q();
                if (i3 == 4) {
                }
                int k3 = adVar.k();
                if (i2 != 4) {
                }
                gfVar.f(i6, i7, i5, i8, adVar);
                adVar.d.e.d(adVar.q());
                adVar.e.e.d(adVar.k());
                adVar.a = true;
                c = c2;
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        bd bdVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        bd bdVar2 = this.d;
        bdVar2.d.f();
        bdVar2.e.f();
        arrayList2.add(bdVar2.d);
        arrayList2.add(bdVar2.e);
        ArrayList arrayList3 = bdVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            ad adVar = (ad) obj;
            if (adVar instanceof om) {
                pm pmVar = new pm(adVar);
                adVar.d.f();
                adVar.e.f();
                pmVar.f = ((om) adVar).u0;
                arrayList2.add(pmVar);
            } else {
                if (adVar.x()) {
                    if (adVar.b == null) {
                        adVar.b = new t9(adVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(adVar.b);
                } else {
                    arrayList2.add(adVar.d);
                }
                if (adVar.y()) {
                    if (adVar.c == null) {
                        adVar.c = new t9(adVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(adVar.c);
                } else {
                    arrayList2.add(adVar.e);
                }
                if (adVar instanceof an) {
                    arrayList2.add(new zm(adVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((ka0) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            ka0 ka0Var = (ka0) obj3;
            if (ka0Var.b != bdVar2) {
                ka0Var.d();
            }
        }
        arrayList.clear();
        e(bdVar.d, 0, arrayList);
        e(bdVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(bd bdVar, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        bd bdVar2 = bdVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            ka0 ka0Var = ((u00) arrayList2.get(i3)).a;
            if (!(ka0Var instanceof t9) ? !(i != 0 ? (ka0Var instanceof i80) : (ka0Var instanceof en)) : ((t9) ka0Var).f != i) {
                hf hfVar = (i == 0 ? bdVar2.d : bdVar2.e).h;
                hf hfVar2 = (i == 0 ? bdVar2.d : bdVar2.e).i;
                hf hfVar3 = ka0Var.h;
                hf hfVar4 = ka0Var.i;
                boolean contains = hfVar3.l.contains(hfVar);
                boolean contains2 = hfVar4.l.contains(hfVar2);
                long j3 = ka0Var.j();
                if (contains && contains2) {
                    long b = u00.b(hfVar3, j);
                    arrayList = arrayList2;
                    long a = u00.a(hfVar4, j);
                    long j4 = b - j3;
                    int i4 = hfVar4.f;
                    i2 = i3;
                    if (j4 >= (-i4)) {
                        j4 += i4;
                    }
                    long j5 = hfVar3.f;
                    long j6 = ((-a) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    ad adVar = ka0Var.b;
                    if (i == 0) {
                        f = adVar.d0;
                    } else if (i == 1) {
                        f = adVar.e0;
                    } else {
                        adVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j4 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (hfVar3.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - hfVar4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(u00.b(hfVar3, hfVar3.f), hfVar3.f + j3) : contains2 ? Math.max(-u00.a(hfVar4, hfVar4.f), (-hfVar4.f) + j3) : (ka0Var.j() + hfVar3.f) - hfVar4.f;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            bdVar2 = bdVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void e(ka0 ka0Var, int i, ArrayList arrayList) {
        hf hfVar = ka0Var.h;
        hf hfVar2 = ka0Var.i;
        ArrayList arrayList2 = hfVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ff ffVar = (ff) obj;
            if (ffVar instanceof hf) {
                a((hf) ffVar, i, arrayList, null);
            } else if (ffVar instanceof ka0) {
                a(((ka0) ffVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = hfVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ff ffVar2 = (ff) obj2;
            if (ffVar2 instanceof hf) {
                a((hf) ffVar2, i, arrayList, null);
            } else if (ffVar2 instanceof ka0) {
                a(((ka0) ffVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((i80) ka0Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                ff ffVar3 = (ff) obj3;
                if (ffVar3 instanceof hf) {
                    a((hf) ffVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, ad adVar) {
        v7 v7Var = this.g;
        v7Var.a = i;
        v7Var.b = i3;
        v7Var.c = i2;
        v7Var.d = i4;
        this.f.b(adVar, v7Var);
        adVar.O(v7Var.e);
        adVar.L(v7Var.f);
        adVar.E = v7Var.h;
        adVar.I(v7Var.g);
    }

    public final void g() {
        t7 t7Var;
        gf gfVar = this;
        ArrayList arrayList = gfVar.a.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ad adVar = (ad) arrayList.get(i);
            if (!adVar.a) {
                int[] iArr = adVar.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = adVar.r;
                int i6 = adVar.s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                xf xfVar = adVar.d.e;
                boolean z3 = xfVar.j;
                xf xfVar2 = adVar.e.e;
                boolean z4 = xfVar2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    gfVar.f(1, xfVar.g, 1, xfVar2.g, adVar);
                    adVar.a = true;
                } else if (z3 && z2) {
                    f(1, xfVar.g, 2, xfVar2.g, adVar);
                    i80 i80Var = adVar.e;
                    if (i4 == 3) {
                        i80Var.e.m = adVar.k();
                    } else {
                        i80Var.e.d(adVar.k());
                        adVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, xfVar.g, 1, xfVar2.g, adVar);
                    en enVar = adVar.d;
                    if (i3 == 3) {
                        enVar.e.m = adVar.q();
                    } else {
                        enVar.e.d(adVar.q());
                        adVar.a = true;
                    }
                }
                if (adVar.a && (t7Var = adVar.e.l) != null) {
                    t7Var.d(adVar.a0);
                }
                gfVar = this;
            }
            i = i2;
        }
    }
}
