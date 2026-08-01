package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ff {
    public fd a;
    public boolean b;
    public boolean c;
    public fd d;
    public ArrayList e;
    public uc f;
    public b8 g;
    public ArrayList h;

    public final void a(gf gfVar, int i, ArrayList arrayList, k10 k10Var) {
        ra0 ra0Var = gfVar.d;
        k10 k10Var2 = ra0Var.c;
        gf gfVar2 = ra0Var.i;
        gf gfVar3 = ra0Var.h;
        if (k10Var2 == null) {
            fd fdVar = this.a;
            if (ra0Var == fdVar.d || ra0Var == fdVar.e) {
                return;
            }
            if (k10Var == null) {
                k10Var = new k10();
                k10Var.a = null;
                k10Var.b = new ArrayList();
                k10Var.a = ra0Var;
                arrayList.add(k10Var);
            }
            ra0Var.c = k10Var;
            k10Var.b.add(ra0Var);
            ArrayList arrayList2 = gfVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                ef efVar = (ef) obj;
                if (efVar instanceof gf) {
                    a((gf) efVar, i, arrayList, k10Var);
                }
            }
            ArrayList arrayList3 = gfVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                ef efVar2 = (ef) obj2;
                if (efVar2 instanceof gf) {
                    a((gf) efVar2, i, arrayList, k10Var);
                }
            }
            if (i == 1 && (ra0Var instanceof p80)) {
                ArrayList arrayList4 = ((p80) ra0Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    ef efVar3 = (ef) obj3;
                    if (efVar3 instanceof gf) {
                        a((gf) efVar3, i, arrayList, k10Var);
                    }
                }
            }
            ArrayList arrayList5 = gfVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((gf) obj4, i, arrayList, k10Var);
            }
            ArrayList arrayList6 = gfVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((gf) obj5, i, arrayList, k10Var);
            }
            if (i == 1 && (ra0Var instanceof p80)) {
                ArrayList arrayList7 = ((p80) ra0Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((gf) obj6, i, arrayList, k10Var);
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
    public final void b(fd fdVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ff ffVar;
        int i9;
        ArrayList arrayList = fdVar.q0;
        int[] iArr = fdVar.p0;
        int size = arrayList.size();
        char c = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ed edVar = (ed) obj;
            int[] iArr2 = edVar.p0;
            pc[] pcVarArr = edVar.Q;
            pc pcVar = edVar.L;
            pc pcVar2 = edVar.J;
            pc pcVar3 = edVar.K;
            pc pcVar4 = edVar.I;
            int i11 = iArr2[c];
            int i12 = iArr2[1];
            char c2 = c;
            if (edVar.g0 == 8) {
                edVar.a = true;
                c = c2;
            } else {
                float f = edVar.w;
                if (f < 1.0f && i11 == 3) {
                    edVar.r = 2;
                }
                float f2 = edVar.z;
                if (f2 < 1.0f && i12 == 3) {
                    edVar.s = 2;
                }
                if (edVar.W > 0.0f) {
                    if (i11 == 3) {
                        i9 = 2;
                        if (i12 == 2 || i12 == 1) {
                            i = 3;
                            edVar.r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i9 = 2;
                    }
                    if (i12 == i && (i11 == i9 || i11 == 1)) {
                        edVar.s = i;
                    } else if (i11 == i && i12 == i) {
                        if (edVar.r == 0) {
                            edVar.r = i;
                        }
                        if (edVar.s == 0) {
                            edVar.s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i11 == i && edVar.r == 1 && (pcVar4.f == null || pcVar3.f == null)) {
                    i11 = 2;
                }
                if (i12 == 3 && edVar.s == 1 && (pcVar2.f == null || pcVar.f == null)) {
                    i12 = 2;
                }
                tn tnVar = edVar.d;
                tnVar.d = i11;
                int i13 = edVar.r;
                tnVar.a = i13;
                p80 p80Var = edVar.e;
                p80Var.d = i12;
                ArrayList arrayList2 = arrayList;
                int i14 = edVar.s;
                p80Var.a = i14;
                int i15 = (i11 == 4 || i11 == 1) ? 2 : 2;
                if (i12 != 4) {
                    if (i12 == 1) {
                        i4 = 1;
                        i2 = i12;
                        i3 = i11;
                        int q = edVar.q();
                        if (i3 == 4) {
                            q = (fdVar.q() - pcVar4.g) - pcVar3.g;
                            i3 = i4;
                        }
                        int k = edVar.k();
                        if (i2 != 4) {
                            int k2 = (fdVar.k() - pcVar2.g) - pcVar.g;
                            i5 = i4;
                            ffVar = this;
                            i6 = i3;
                            i7 = q;
                            i8 = k2;
                        } else {
                            i5 = i2;
                            i6 = i3;
                            i7 = q;
                            i8 = k;
                            ffVar = this;
                        }
                        ffVar.f(i6, i7, i5, i8, edVar);
                        edVar.d.e.d(edVar.q());
                        edVar.e.e.d(edVar.k());
                        edVar.a = true;
                        c = c2;
                        arrayList = arrayList2;
                    }
                }
                i2 = i12;
                i3 = i11;
                i4 = 1;
                int q2 = edVar.q();
                if (i3 == 4) {
                }
                int k3 = edVar.k();
                if (i2 != 4) {
                }
                ffVar.f(i6, i7, i5, i8, edVar);
                edVar.d.e.d(edVar.q());
                edVar.e.e.d(edVar.k());
                edVar.a = true;
                c = c2;
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        fd fdVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        fd fdVar2 = this.d;
        fdVar2.d.f();
        fdVar2.e.f();
        arrayList2.add(fdVar2.d);
        arrayList2.add(fdVar2.e);
        ArrayList arrayList3 = fdVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            ed edVar = (ed) obj;
            if (edVar instanceof bn) {
                cn cnVar = new cn(edVar);
                edVar.d.f();
                edVar.e.f();
                cnVar.f = ((bn) edVar).u0;
                arrayList2.add(cnVar);
            } else {
                if (edVar.x()) {
                    if (edVar.b == null) {
                        edVar.b = new p9(edVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(edVar.b);
                } else {
                    arrayList2.add(edVar.d);
                }
                if (edVar.y()) {
                    if (edVar.c == null) {
                        edVar.c = new p9(edVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(edVar.c);
                } else {
                    arrayList2.add(edVar.e);
                }
                if (edVar instanceof pn) {
                    arrayList2.add(new on(edVar));
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
            ((ra0) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            ra0 ra0Var = (ra0) obj3;
            if (ra0Var.b != fdVar2) {
                ra0Var.d();
            }
        }
        arrayList.clear();
        e(fdVar.d, 0, arrayList);
        e(fdVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(fd fdVar, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        fd fdVar2 = fdVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            ra0 ra0Var = ((k10) arrayList2.get(i3)).a;
            if (!(ra0Var instanceof p9) ? !(i != 0 ? (ra0Var instanceof p80) : (ra0Var instanceof tn)) : ((p9) ra0Var).f != i) {
                gf gfVar = (i == 0 ? fdVar2.d : fdVar2.e).h;
                gf gfVar2 = (i == 0 ? fdVar2.d : fdVar2.e).i;
                gf gfVar3 = ra0Var.h;
                gf gfVar4 = ra0Var.i;
                boolean contains = gfVar3.l.contains(gfVar);
                boolean contains2 = gfVar4.l.contains(gfVar2);
                long j3 = ra0Var.j();
                if (contains && contains2) {
                    long b = k10.b(gfVar3, j);
                    arrayList = arrayList2;
                    long a = k10.a(gfVar4, j);
                    long j4 = b - j3;
                    int i4 = gfVar4.f;
                    i2 = i3;
                    if (j4 >= (-i4)) {
                        j4 += i4;
                    }
                    long j5 = gfVar3.f;
                    long j6 = ((-a) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    ed edVar = ra0Var.b;
                    if (i == 0) {
                        f = edVar.d0;
                    } else if (i == 1) {
                        f = edVar.e0;
                    } else {
                        edVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j4 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (gfVar3.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - gfVar4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(k10.b(gfVar3, gfVar3.f), gfVar3.f + j3) : contains2 ? Math.max(-k10.a(gfVar4, gfVar4.f), (-gfVar4.f) + j3) : (ra0Var.j() + gfVar3.f) - gfVar4.f;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            fdVar2 = fdVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void e(ra0 ra0Var, int i, ArrayList arrayList) {
        gf gfVar = ra0Var.h;
        gf gfVar2 = ra0Var.i;
        ArrayList arrayList2 = gfVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ef efVar = (ef) obj;
            if (efVar instanceof gf) {
                a((gf) efVar, i, arrayList, null);
            } else if (efVar instanceof ra0) {
                a(((ra0) efVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = gfVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ef efVar2 = (ef) obj2;
            if (efVar2 instanceof gf) {
                a((gf) efVar2, i, arrayList, null);
            } else if (efVar2 instanceof ra0) {
                a(((ra0) efVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((p80) ra0Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                ef efVar3 = (ef) obj3;
                if (efVar3 instanceof gf) {
                    a((gf) efVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, ed edVar) {
        b8 b8Var = this.g;
        b8Var.a = i;
        b8Var.b = i3;
        b8Var.c = i2;
        b8Var.d = i4;
        this.f.b(edVar, b8Var);
        edVar.O(b8Var.e);
        edVar.L(b8Var.f);
        edVar.E = b8Var.h;
        edVar.I(b8Var.g);
    }

    public final void g() {
        z7 z7Var;
        ff ffVar = this;
        ArrayList arrayList = ffVar.a.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ed edVar = (ed) arrayList.get(i);
            if (!edVar.a) {
                int[] iArr = edVar.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = edVar.r;
                int i6 = edVar.s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                pf pfVar = edVar.d.e;
                boolean z3 = pfVar.j;
                pf pfVar2 = edVar.e.e;
                boolean z4 = pfVar2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    ffVar.f(1, pfVar.g, 1, pfVar2.g, edVar);
                    edVar.a = true;
                } else if (z3 && z2) {
                    f(1, pfVar.g, 2, pfVar2.g, edVar);
                    p80 p80Var = edVar.e;
                    if (i4 == 3) {
                        p80Var.e.m = edVar.k();
                    } else {
                        p80Var.e.d(edVar.k());
                        edVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, pfVar.g, 1, pfVar2.g, edVar);
                    tn tnVar = edVar.d;
                    if (i3 == 3) {
                        tnVar.e.m = edVar.q();
                    } else {
                        tnVar.e.d(edVar.q());
                        edVar.a = true;
                    }
                }
                if (edVar.a && (z7Var = edVar.e.l) != null) {
                    z7Var.d(edVar.a0);
                }
                ffVar = this;
            }
            i = i2;
        }
    }
}
