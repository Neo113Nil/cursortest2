package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kj {
    public sf a;
    public boolean b;
    public boolean c;
    public sf d;
    public ArrayList e;
    public ef f;
    public t8 g;
    public ArrayList h;

    public final void a(mj mjVar, int i, ArrayList arrayList, bb0 bb0Var) {
        vn0 vn0Var = mjVar.d;
        bb0 bb0Var2 = vn0Var.c;
        mj mjVar2 = vn0Var.i;
        mj mjVar3 = vn0Var.h;
        if (bb0Var2 == null) {
            sf sfVar = this.a;
            if (vn0Var == sfVar.d || vn0Var == sfVar.e) {
                return;
            }
            if (bb0Var == null) {
                bb0Var = new bb0();
                bb0Var.a = null;
                bb0Var.b = new ArrayList();
                bb0Var.a = vn0Var;
                arrayList.add(bb0Var);
            }
            vn0Var.c = bb0Var;
            bb0Var.b.add(vn0Var);
            ArrayList arrayList2 = mjVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                jj jjVar = (jj) obj;
                if (jjVar instanceof mj) {
                    a((mj) jjVar, i, arrayList, bb0Var);
                }
            }
            ArrayList arrayList3 = mjVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                jj jjVar2 = (jj) obj2;
                if (jjVar2 instanceof mj) {
                    a((mj) jjVar2, i, arrayList, bb0Var);
                }
            }
            if (i == 1 && (vn0Var instanceof rl0)) {
                ArrayList arrayList4 = ((rl0) vn0Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    jj jjVar3 = (jj) obj3;
                    if (jjVar3 instanceof mj) {
                        a((mj) jjVar3, i, arrayList, bb0Var);
                    }
                }
            }
            ArrayList arrayList5 = mjVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((mj) obj4, i, arrayList, bb0Var);
            }
            ArrayList arrayList6 = mjVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((mj) obj5, i, arrayList, bb0Var);
            }
            if (i == 1 && (vn0Var instanceof rl0)) {
                ArrayList arrayList7 = ((rl0) vn0Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((mj) obj6, i, arrayList, bb0Var);
                }
            }
        }
    }

    public final void b(sf sfVar) {
        ArrayList arrayList;
        qf qfVar;
        int i;
        int i2;
        qf qfVar2;
        kj kjVar;
        qf qfVar3;
        qf qfVar4;
        qf qfVar5;
        qf qfVar6;
        ArrayList arrayList2 = sfVar.q0;
        qf[] qfVarArr = sfVar.T;
        int size = arrayList2.size();
        char c = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            rf rfVar = (rf) obj;
            qf[] qfVarArr2 = rfVar.T;
            xe[] xeVarArr = rfVar.Q;
            xe xeVar = rfVar.L;
            xe xeVar2 = rfVar.J;
            xe xeVar3 = rfVar.K;
            xe xeVar4 = rfVar.I;
            qf qfVar7 = qfVarArr2[c];
            qf qfVar8 = qfVarArr2[1];
            char c2 = c;
            if (rfVar.h0 == 8) {
                rfVar.a = true;
                c = c2;
            } else {
                float f = rfVar.w;
                if (f < 1.0f && qfVar7 == qf.MATCH_CONSTRAINT) {
                    rfVar.r = 2;
                }
                float f2 = rfVar.z;
                if (f2 < 1.0f && qfVar8 == qf.MATCH_CONSTRAINT) {
                    rfVar.s = 2;
                }
                if (rfVar.X > 0.0f) {
                    qf qfVar9 = qf.MATCH_CONSTRAINT;
                    if (qfVar7 == qfVar9 && (qfVar8 == qf.WRAP_CONTENT || qfVar8 == qf.FIXED)) {
                        rfVar.r = 3;
                    } else {
                        int i4 = 3;
                        if (qfVar8 == qfVar9) {
                            if (qfVar7 == qf.WRAP_CONTENT || qfVar7 == qf.FIXED) {
                                rfVar.s = 3;
                            } else {
                                i4 = 3;
                            }
                        }
                        if (qfVar7 == qfVar9 && qfVar8 == qfVar9) {
                            if (rfVar.r == 0) {
                                rfVar.r = i4;
                            }
                            if (rfVar.s == 0) {
                                rfVar.s = i4;
                            }
                        }
                    }
                }
                qf qfVar10 = qf.MATCH_CONSTRAINT;
                if (qfVar7 == qfVar10) {
                    arrayList = arrayList2;
                    if (rfVar.r == 1 && (xeVar4.f == null || xeVar3.f == null)) {
                        qfVar7 = qf.WRAP_CONTENT;
                    }
                } else {
                    arrayList = arrayList2;
                }
                if (qfVar8 == qfVar10 && rfVar.s == 1 && (xeVar2.f == null || xeVar.f == null)) {
                    qfVar8 = qf.WRAP_CONTENT;
                }
                jt jtVar = rfVar.d;
                jtVar.d = qfVar7;
                int i5 = rfVar.r;
                jtVar.a = i5;
                rl0 rl0Var = rfVar.e;
                rl0Var.d = qfVar8;
                qf[] qfVarArr3 = qfVarArr;
                int i6 = rfVar.s;
                rl0Var.a = i6;
                qf qfVar11 = qf.MATCH_PARENT;
                int i7 = size;
                if ((qfVar7 == qfVar11 || qfVar7 == qf.FIXED || qfVar7 == qf.WRAP_CONTENT) && (qfVar8 == qfVar11 || qfVar8 == qf.FIXED || qfVar8 == qf.WRAP_CONTENT)) {
                    qf qfVar12 = qfVar8;
                    int q = rfVar.q();
                    if (qfVar7 == qfVar11) {
                        q = (sfVar.q() - xeVar4.g) - xeVar3.g;
                        qfVar7 = qf.FIXED;
                    }
                    int k = rfVar.k();
                    if (qfVar12 == qfVar11) {
                        int k2 = (sfVar.k() - xeVar2.g) - xeVar.g;
                        qfVar = qf.FIXED;
                        kjVar = this;
                        i = q;
                        i2 = k2;
                        qfVar2 = qfVar7;
                    } else {
                        qfVar = qfVar12;
                        i = q;
                        i2 = k;
                        qfVar2 = qfVar7;
                        kjVar = this;
                    }
                    kjVar.f(rfVar, qfVar2, i, qfVar, i2);
                    rfVar.d.e.d(rfVar.q());
                    rfVar.e.e.d(rfVar.k());
                    rfVar.a = true;
                } else {
                    if (qfVar7 != qfVar10 || (qfVar8 != (qfVar6 = qf.WRAP_CONTENT) && qfVar8 != qf.FIXED)) {
                        qfVar3 = qfVar8;
                    } else if (i5 == 3) {
                        if (qfVar8 == qfVar6) {
                            f(rfVar, qfVar6, 0, qfVar6, 0);
                        }
                        int k3 = rfVar.k();
                        int i8 = (int) ((k3 * rfVar.X) + 0.5f);
                        qf qfVar13 = qf.FIXED;
                        f(rfVar, qfVar13, i8, qfVar13, k3);
                        rfVar.d.e.d(rfVar.q());
                        rfVar.e.e.d(rfVar.k());
                        rfVar.a = true;
                    } else if (i5 == 1) {
                        f(rfVar, qfVar6, 0, qfVar8, 0);
                        rfVar.d.e.m = rfVar.q();
                    } else {
                        qfVar3 = qfVar8;
                        if (i5 == 2) {
                            qf qfVar14 = qfVarArr3[c2];
                            qf qfVar15 = qf.FIXED;
                            if (qfVar14 == qfVar15 || qfVar14 == qfVar11) {
                                f(rfVar, qfVar15, (int) ((f * sfVar.q()) + 0.5f), qfVar3, rfVar.k());
                                rfVar.d.e.d(rfVar.q());
                                rfVar.e.e.d(rfVar.k());
                                rfVar.a = true;
                            }
                        } else if (xeVarArr[c2].f == null || xeVarArr[1].f == null) {
                            f(rfVar, qfVar6, 0, qfVar3, 0);
                            rfVar.d.e.d(rfVar.q());
                            rfVar.e.e.d(rfVar.k());
                            rfVar.a = true;
                        }
                    }
                    if (qfVar3 != qfVar10 || (qfVar7 != (qfVar5 = qf.WRAP_CONTENT) && qfVar7 != qf.FIXED)) {
                        qfVar4 = qfVar3;
                    } else if (i6 == 3) {
                        if (qfVar7 == qfVar5) {
                            f(rfVar, qfVar5, 0, qfVar5, 0);
                        }
                        int q2 = rfVar.q();
                        float f3 = rfVar.X;
                        if (rfVar.Y == -1) {
                            f3 = 1.0f / f3;
                        }
                        qf qfVar16 = qf.FIXED;
                        f(rfVar, qfVar16, q2, qfVar16, (int) ((q2 * f3) + 0.5f));
                        rfVar.d.e.d(rfVar.q());
                        rfVar.e.e.d(rfVar.k());
                        rfVar.a = true;
                    } else if (i6 == 1) {
                        f(rfVar, qfVar7, 0, qfVar5, 0);
                        rfVar.e.e.m = rfVar.k();
                    } else {
                        qf qfVar17 = qfVar7;
                        if (i6 == 2) {
                            qf qfVar18 = qfVarArr3[1];
                            qf qfVar19 = qfVar3;
                            qf qfVar20 = qf.FIXED;
                            if (qfVar18 == qfVar20 || qfVar18 == qfVar11) {
                                f(rfVar, qfVar17, rfVar.q(), qfVar20, (int) ((f2 * sfVar.k()) + 0.5f));
                                rfVar.d.e.d(rfVar.q());
                                rfVar.e.e.d(rfVar.k());
                                rfVar.a = true;
                            } else {
                                qfVar4 = qfVar19;
                                qfVar7 = qfVar17;
                            }
                        } else {
                            qfVar7 = qfVar17;
                            qf qfVar21 = qfVar3;
                            if (xeVarArr[2].f == null || xeVarArr[3].f == null) {
                                f(rfVar, qfVar5, 0, qfVar21, 0);
                                rfVar.d.e.d(rfVar.q());
                                rfVar.e.e.d(rfVar.k());
                                rfVar.a = true;
                            } else {
                                qfVar4 = qfVar21;
                            }
                        }
                    }
                    if (qfVar7 == qfVar10 && qfVar4 == qfVar10) {
                        if (i5 == 1 || i6 == 1) {
                            qf qfVar22 = qf.WRAP_CONTENT;
                            f(rfVar, qfVar22, 0, qfVar22, 0);
                            rfVar.d.e.m = rfVar.q();
                            rfVar.e.e.m = rfVar.k();
                        } else if (i6 == 2 && i5 == 2) {
                            qf qfVar23 = qfVarArr3[c2];
                            qf qfVar24 = qf.FIXED;
                            if (qfVar23 == qfVar24 && qfVarArr3[1] == qfVar24) {
                                f(rfVar, qfVar24, (int) ((f * sfVar.q()) + 0.5f), qfVar24, (int) ((f2 * sfVar.k()) + 0.5f));
                                rfVar.d.e.d(rfVar.q());
                                rfVar.e.e.d(rfVar.k());
                                rfVar.a = true;
                            }
                        }
                    }
                }
                c = c2;
                arrayList2 = arrayList;
                qfVarArr = qfVarArr3;
                size = i7;
            }
        }
    }

    public final void c() {
        sf sfVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        sf sfVar2 = this.d;
        sfVar2.d.f();
        sfVar2.e.f();
        arrayList2.add(sfVar2.d);
        arrayList2.add(sfVar2.e);
        ArrayList arrayList3 = sfVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            rf rfVar = (rf) obj;
            if (rfVar instanceof os) {
                ps psVar = new ps(rfVar);
                rfVar.d.f();
                rfVar.e.f();
                psVar.f = ((os) rfVar).u0;
                arrayList2.add(psVar);
            } else {
                if (rfVar.x()) {
                    if (rfVar.b == null) {
                        rfVar.b = new za(rfVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(rfVar.b);
                } else {
                    arrayList2.add(rfVar.d);
                }
                if (rfVar.y()) {
                    if (rfVar.c == null) {
                        rfVar.c = new za(rfVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(rfVar.c);
                } else {
                    arrayList2.add(rfVar.e);
                }
                if (rfVar instanceof dt) {
                    arrayList2.add(new ct(rfVar));
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
            ((vn0) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            vn0 vn0Var = (vn0) obj3;
            if (vn0Var.b != sfVar2) {
                vn0Var.d();
            }
        }
        arrayList.clear();
        e(sfVar.d, 0, arrayList);
        e(sfVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(sf sfVar, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        sf sfVar2 = sfVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            vn0 vn0Var = ((bb0) arrayList2.get(i3)).a;
            if (!(vn0Var instanceof za) ? !(i != 0 ? (vn0Var instanceof rl0) : (vn0Var instanceof jt)) : ((za) vn0Var).f != i) {
                mj mjVar = (i == 0 ? sfVar2.d : sfVar2.e).h;
                mj mjVar2 = (i == 0 ? sfVar2.d : sfVar2.e).i;
                mj mjVar3 = vn0Var.h;
                mj mjVar4 = vn0Var.i;
                boolean contains = mjVar3.l.contains(mjVar);
                boolean contains2 = mjVar4.l.contains(mjVar2);
                long j3 = vn0Var.j();
                if (contains && contains2) {
                    long b = bb0.b(mjVar3, j);
                    arrayList = arrayList2;
                    long a = bb0.a(mjVar4, j);
                    long j4 = b - j3;
                    int i4 = mjVar4.f;
                    i2 = i3;
                    if (j4 >= (-i4)) {
                        j4 += i4;
                    }
                    long j5 = mjVar3.f;
                    long j6 = ((-a) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    rf rfVar = vn0Var.b;
                    if (i == 0) {
                        f = rfVar.e0;
                    } else if (i == 1) {
                        f = rfVar.f0;
                    } else {
                        rfVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j4 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (mjVar3.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - mjVar4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(bb0.b(mjVar3, mjVar3.f), mjVar3.f + j3) : contains2 ? Math.max(-bb0.a(mjVar4, mjVar4.f), (-mjVar4.f) + j3) : (vn0Var.j() + mjVar3.f) - mjVar4.f;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            sfVar2 = sfVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void e(vn0 vn0Var, int i, ArrayList arrayList) {
        mj mjVar = vn0Var.h;
        mj mjVar2 = vn0Var.i;
        ArrayList arrayList2 = mjVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            jj jjVar = (jj) obj;
            if (jjVar instanceof mj) {
                a((mj) jjVar, i, arrayList, null);
            } else if (jjVar instanceof vn0) {
                a(((vn0) jjVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = mjVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            jj jjVar2 = (jj) obj2;
            if (jjVar2 instanceof mj) {
                a((mj) jjVar2, i, arrayList, null);
            } else if (jjVar2 instanceof vn0) {
                a(((vn0) jjVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((rl0) vn0Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                jj jjVar3 = (jj) obj3;
                if (jjVar3 instanceof mj) {
                    a((mj) jjVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(rf rfVar, qf qfVar, int i, qf qfVar2, int i2) {
        t8 t8Var = this.g;
        t8Var.a = qfVar;
        t8Var.b = qfVar2;
        t8Var.c = i;
        t8Var.d = i2;
        this.f.b(rfVar, t8Var);
        rfVar.O(t8Var.e);
        rfVar.L(t8Var.f);
        rfVar.E = t8Var.h;
        rfVar.I(t8Var.g);
    }

    public final void g() {
        kj kjVar;
        r8 r8Var;
        ArrayList arrayList = this.a.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rf rfVar = (rf) obj;
            if (!rfVar.a) {
                qf[] qfVarArr = rfVar.T;
                qf qfVar = qfVarArr[0];
                qf qfVar2 = qfVarArr[1];
                int i2 = rfVar.r;
                int i3 = rfVar.s;
                qf qfVar3 = qf.WRAP_CONTENT;
                boolean z = qfVar == qfVar3 || (qfVar == qf.MATCH_CONSTRAINT && i2 == 1);
                boolean z2 = qfVar2 == qfVar3 || (qfVar2 == qf.MATCH_CONSTRAINT && i3 == 1);
                ck ckVar = rfVar.d.e;
                boolean z3 = ckVar.j;
                ck ckVar2 = rfVar.e.e;
                boolean z4 = ckVar2.j;
                if (z3 && z4) {
                    qf qfVar4 = qf.FIXED;
                    kjVar = this;
                    kjVar.f(rfVar, qfVar4, ckVar.g, qfVar4, ckVar2.g);
                    rfVar.a = true;
                } else {
                    if (z3 && z2) {
                        this.f(rfVar, qf.FIXED, ckVar.g, qfVar3, ckVar2.g);
                        qf qfVar5 = qf.MATCH_CONSTRAINT;
                        rl0 rl0Var = rfVar.e;
                        if (qfVar2 == qfVar5) {
                            rl0Var.e.m = rfVar.k();
                        } else {
                            rl0Var.e.d(rfVar.k());
                            rfVar.a = true;
                        }
                    } else if (z4 && z) {
                        kjVar = this;
                        kjVar.f(rfVar, qfVar3, ckVar.g, qf.FIXED, ckVar2.g);
                        qf qfVar6 = qf.MATCH_CONSTRAINT;
                        jt jtVar = rfVar.d;
                        if (qfVar == qfVar6) {
                            jtVar.e.m = rfVar.q();
                        } else {
                            jtVar.e.d(rfVar.q());
                            rfVar.a = true;
                        }
                    }
                    kjVar = this;
                }
                if (rfVar.a && (r8Var = rfVar.e.l) != null) {
                    r8Var.d(rfVar.b0);
                }
                this = kjVar;
            }
        }
    }
}
