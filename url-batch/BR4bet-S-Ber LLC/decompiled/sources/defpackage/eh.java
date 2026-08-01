package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class eh {
    public be a;
    public boolean b;
    public boolean c;
    public be d;
    public ArrayList e;
    public qd f;
    public i8 g;
    public ArrayList h;

    public final void a(fh fhVar, int i, ArrayList arrayList, z30 z30Var) {
        rd0 rd0Var = fhVar.d;
        z30 z30Var2 = rd0Var.c;
        fh fhVar2 = rd0Var.i;
        fh fhVar3 = rd0Var.h;
        if (z30Var2 == null) {
            be beVar = this.a;
            if (rd0Var == beVar.d || rd0Var == beVar.e) {
                return;
            }
            if (z30Var == null) {
                z30Var = new z30();
                z30Var.a = null;
                z30Var.b = new ArrayList();
                z30Var.a = rd0Var;
                arrayList.add(z30Var);
            }
            rd0Var.c = z30Var;
            z30Var.b.add(rd0Var);
            ArrayList arrayList2 = fhVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                dh dhVar = (dh) obj;
                if (dhVar instanceof fh) {
                    a((fh) dhVar, i, arrayList, z30Var);
                }
            }
            ArrayList arrayList3 = fhVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                dh dhVar2 = (dh) obj2;
                if (dhVar2 instanceof fh) {
                    a((fh) dhVar2, i, arrayList, z30Var);
                }
            }
            if (i == 1 && (rd0Var instanceof tb0)) {
                ArrayList arrayList4 = ((tb0) rd0Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    dh dhVar3 = (dh) obj3;
                    if (dhVar3 instanceof fh) {
                        a((fh) dhVar3, i, arrayList, z30Var);
                    }
                }
            }
            ArrayList arrayList5 = fhVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((fh) obj4, i, arrayList, z30Var);
            }
            ArrayList arrayList6 = fhVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((fh) obj5, i, arrayList, z30Var);
            }
            if (i == 1 && (rd0Var instanceof tb0)) {
                ArrayList arrayList7 = ((tb0) rd0Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((fh) obj6, i, arrayList, z30Var);
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
    public final void b(be beVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        eh ehVar;
        int i9;
        ArrayList arrayList = beVar.q0;
        int[] iArr = beVar.p0;
        int size = arrayList.size();
        char c = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ae aeVar = (ae) obj;
            int[] iArr2 = aeVar.p0;
            ld[] ldVarArr = aeVar.Q;
            ld ldVar = aeVar.L;
            ld ldVar2 = aeVar.J;
            ld ldVar3 = aeVar.K;
            ld ldVar4 = aeVar.I;
            int i11 = iArr2[c];
            int i12 = iArr2[1];
            char c2 = c;
            if (aeVar.g0 == 8) {
                aeVar.a = true;
                c = c2;
            } else {
                float f = aeVar.w;
                if (f < 1.0f && i11 == 3) {
                    aeVar.r = 2;
                }
                float f2 = aeVar.z;
                if (f2 < 1.0f && i12 == 3) {
                    aeVar.s = 2;
                }
                if (aeVar.W > 0.0f) {
                    if (i11 == 3) {
                        i9 = 2;
                        if (i12 == 2 || i12 == 1) {
                            i = 3;
                            aeVar.r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i9 = 2;
                    }
                    if (i12 == i && (i11 == i9 || i11 == 1)) {
                        aeVar.s = i;
                    } else if (i11 == i && i12 == i) {
                        if (aeVar.r == 0) {
                            aeVar.r = i;
                        }
                        if (aeVar.s == 0) {
                            aeVar.s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i11 == i && aeVar.r == 1 && (ldVar4.f == null || ldVar3.f == null)) {
                    i11 = 2;
                }
                if (i12 == 3 && aeVar.s == 1 && (ldVar2.f == null || ldVar.f == null)) {
                    i12 = 2;
                }
                qp qpVar = aeVar.d;
                qpVar.d = i11;
                int i13 = aeVar.r;
                qpVar.a = i13;
                tb0 tb0Var = aeVar.e;
                tb0Var.d = i12;
                ArrayList arrayList2 = arrayList;
                int i14 = aeVar.s;
                tb0Var.a = i14;
                int i15 = (i11 == 4 || i11 == 1) ? 2 : 2;
                if (i12 != 4) {
                    if (i12 == 1) {
                        i4 = 1;
                        i2 = i12;
                        i3 = i11;
                        int q = aeVar.q();
                        if (i3 == 4) {
                            q = (beVar.q() - ldVar4.g) - ldVar3.g;
                            i3 = i4;
                        }
                        int k = aeVar.k();
                        if (i2 != 4) {
                            int k2 = (beVar.k() - ldVar2.g) - ldVar.g;
                            i5 = i4;
                            ehVar = this;
                            i6 = i3;
                            i7 = q;
                            i8 = k2;
                        } else {
                            i5 = i2;
                            i6 = i3;
                            i7 = q;
                            i8 = k;
                            ehVar = this;
                        }
                        ehVar.f(i6, i7, i5, i8, aeVar);
                        aeVar.d.e.d(aeVar.q());
                        aeVar.e.e.d(aeVar.k());
                        aeVar.a = true;
                        c = c2;
                        arrayList = arrayList2;
                    }
                }
                i2 = i12;
                i3 = i11;
                i4 = 1;
                int q2 = aeVar.q();
                if (i3 == 4) {
                }
                int k3 = aeVar.k();
                if (i2 != 4) {
                }
                ehVar.f(i6, i7, i5, i8, aeVar);
                aeVar.d.e.d(aeVar.q());
                aeVar.e.e.d(aeVar.k());
                aeVar.a = true;
                c = c2;
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        be beVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        be beVar2 = this.d;
        beVar2.d.f();
        beVar2.e.f();
        arrayList2.add(beVar2.d);
        arrayList2.add(beVar2.e);
        ArrayList arrayList3 = beVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            ae aeVar = (ae) obj;
            if (aeVar instanceof yo) {
                zo zoVar = new zo(aeVar);
                aeVar.d.f();
                aeVar.e.f();
                zoVar.f = ((yo) aeVar).u0;
                arrayList2.add(zoVar);
            } else {
                if (aeVar.x()) {
                    if (aeVar.b == null) {
                        aeVar.b = new ga(aeVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(aeVar.b);
                } else {
                    arrayList2.add(aeVar.d);
                }
                if (aeVar.y()) {
                    if (aeVar.c == null) {
                        aeVar.c = new ga(aeVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(aeVar.c);
                } else {
                    arrayList2.add(aeVar.e);
                }
                if (aeVar instanceof mp) {
                    arrayList2.add(new lp(aeVar));
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
            ((rd0) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            rd0 rd0Var = (rd0) obj3;
            if (rd0Var.b != beVar2) {
                rd0Var.d();
            }
        }
        arrayList.clear();
        e(beVar.d, 0, arrayList);
        e(beVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(be beVar, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        be beVar2 = beVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            rd0 rd0Var = ((z30) arrayList2.get(i3)).a;
            if (!(rd0Var instanceof ga) ? !(i != 0 ? (rd0Var instanceof tb0) : (rd0Var instanceof qp)) : ((ga) rd0Var).f != i) {
                fh fhVar = (i == 0 ? beVar2.d : beVar2.e).h;
                fh fhVar2 = (i == 0 ? beVar2.d : beVar2.e).i;
                fh fhVar3 = rd0Var.h;
                fh fhVar4 = rd0Var.i;
                boolean contains = fhVar3.l.contains(fhVar);
                boolean contains2 = fhVar4.l.contains(fhVar2);
                long j3 = rd0Var.j();
                if (contains && contains2) {
                    long b = z30.b(fhVar3, j);
                    arrayList = arrayList2;
                    long a = z30.a(fhVar4, j);
                    long j4 = b - j3;
                    int i4 = fhVar4.f;
                    i2 = i3;
                    if (j4 >= (-i4)) {
                        j4 += i4;
                    }
                    long j5 = fhVar3.f;
                    long j6 = ((-a) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    ae aeVar = rd0Var.b;
                    if (i == 0) {
                        f = aeVar.d0;
                    } else if (i == 1) {
                        f = aeVar.e0;
                    } else {
                        aeVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j4 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (fhVar3.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - fhVar4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(z30.b(fhVar3, fhVar3.f), fhVar3.f + j3) : contains2 ? Math.max(-z30.a(fhVar4, fhVar4.f), (-fhVar4.f) + j3) : (rd0Var.j() + fhVar3.f) - fhVar4.f;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            beVar2 = beVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void e(rd0 rd0Var, int i, ArrayList arrayList) {
        fh fhVar = rd0Var.h;
        fh fhVar2 = rd0Var.i;
        ArrayList arrayList2 = fhVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            dh dhVar = (dh) obj;
            if (dhVar instanceof fh) {
                a((fh) dhVar, i, arrayList, null);
            } else if (dhVar instanceof rd0) {
                a(((rd0) dhVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = fhVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            dh dhVar2 = (dh) obj2;
            if (dhVar2 instanceof fh) {
                a((fh) dhVar2, i, arrayList, null);
            } else if (dhVar2 instanceof rd0) {
                a(((rd0) dhVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((tb0) rd0Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                dh dhVar3 = (dh) obj3;
                if (dhVar3 instanceof fh) {
                    a((fh) dhVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, ae aeVar) {
        i8 i8Var = this.g;
        i8Var.a = i;
        i8Var.b = i3;
        i8Var.c = i2;
        i8Var.d = i4;
        this.f.b(aeVar, i8Var);
        aeVar.O(i8Var.e);
        aeVar.L(i8Var.f);
        aeVar.E = i8Var.h;
        aeVar.I(i8Var.g);
    }

    public final void g() {
        g8 g8Var;
        eh ehVar = this;
        ArrayList arrayList = ehVar.a.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ae aeVar = (ae) arrayList.get(i);
            if (!aeVar.a) {
                int[] iArr = aeVar.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = aeVar.r;
                int i6 = aeVar.s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                wh whVar = aeVar.d.e;
                boolean z3 = whVar.j;
                wh whVar2 = aeVar.e.e;
                boolean z4 = whVar2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    ehVar.f(1, whVar.g, 1, whVar2.g, aeVar);
                    aeVar.a = true;
                } else if (z3 && z2) {
                    f(1, whVar.g, 2, whVar2.g, aeVar);
                    tb0 tb0Var = aeVar.e;
                    if (i4 == 3) {
                        tb0Var.e.m = aeVar.k();
                    } else {
                        tb0Var.e.d(aeVar.k());
                        aeVar.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, whVar.g, 1, whVar2.g, aeVar);
                    qp qpVar = aeVar.d;
                    if (i3 == 3) {
                        qpVar.e.m = aeVar.q();
                    } else {
                        qpVar.e.d(aeVar.q());
                        aeVar.a = true;
                    }
                }
                if (aeVar.a && (g8Var = aeVar.e.l) != null) {
                    g8Var.d(aeVar.a0);
                }
                ehVar = this;
            }
            i = i2;
        }
    }
}
