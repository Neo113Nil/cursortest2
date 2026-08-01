package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sf extends rf {
    public int A0;
    public ya[] B0;
    public ya[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final t8 L0;
    public ArrayList q0 = new ArrayList();
    public final s6 r0 = new s6(this);
    public final kj s0;
    public int t0;
    public ef u0;
    public boolean v0;
    public final xx w0;
    public int x0;
    public int y0;
    public int z0;

    public sf() {
        kj kjVar = new kj();
        kjVar.b = true;
        kjVar.c = true;
        kjVar.e = new ArrayList();
        new ArrayList();
        kjVar.f = null;
        kjVar.g = new t8();
        kjVar.h = new ArrayList();
        kjVar.a = this;
        kjVar.d = this;
        this.s0 = kjVar;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new xx();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new ya[4];
        this.C0 = new ya[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new t8();
    }

    public static void V(rf rfVar, ef efVar, t8 t8Var) {
        int i;
        int i2;
        if (efVar == null) {
            return;
        }
        int i3 = rfVar.h0;
        int[] iArr = rfVar.t;
        if (i3 == 8 || (rfVar instanceof os) || (rfVar instanceof e8)) {
            t8Var.e = 0;
            t8Var.f = 0;
            return;
        }
        qf[] qfVarArr = rfVar.T;
        t8Var.a = qfVarArr[0];
        t8Var.b = qfVarArr[1];
        t8Var.c = rfVar.q();
        t8Var.d = rfVar.k();
        t8Var.i = false;
        t8Var.j = 0;
        qf qfVar = t8Var.a;
        qf qfVar2 = qf.MATCH_CONSTRAINT;
        boolean z = qfVar == qfVar2;
        boolean z2 = t8Var.b == qfVar2;
        boolean z3 = z && rfVar.X > 0.0f;
        boolean z4 = z2 && rfVar.X > 0.0f;
        if (z && rfVar.t(0) && rfVar.r == 0 && !z3) {
            t8Var.a = qf.WRAP_CONTENT;
            if (z2 && rfVar.s == 0) {
                t8Var.a = qf.FIXED;
            }
            z = false;
        }
        if (z2 && rfVar.t(1) && rfVar.s == 0 && !z4) {
            t8Var.b = qf.WRAP_CONTENT;
            if (z && rfVar.r == 0) {
                t8Var.b = qf.FIXED;
            }
            z2 = false;
        }
        if (rfVar.A()) {
            t8Var.a = qf.FIXED;
            z = false;
        }
        if (rfVar.B()) {
            t8Var.b = qf.FIXED;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                t8Var.a = qf.FIXED;
            } else if (!z2) {
                qf qfVar3 = t8Var.b;
                qf qfVar4 = qf.FIXED;
                if (qfVar3 == qfVar4) {
                    i2 = t8Var.d;
                } else {
                    t8Var.a = qf.WRAP_CONTENT;
                    efVar.b(rfVar, t8Var);
                    i2 = t8Var.f;
                }
                t8Var.a = qfVar4;
                t8Var.c = (int) (rfVar.X * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                t8Var.b = qf.FIXED;
            } else if (!z) {
                qf qfVar5 = t8Var.a;
                qf qfVar6 = qf.FIXED;
                if (qfVar5 == qfVar6) {
                    i = t8Var.c;
                } else {
                    t8Var.b = qf.WRAP_CONTENT;
                    efVar.b(rfVar, t8Var);
                    i = t8Var.e;
                }
                t8Var.b = qfVar6;
                int i4 = rfVar.Y;
                float f = rfVar.X;
                if (i4 == -1) {
                    t8Var.d = (int) (i / f);
                } else {
                    t8Var.d = (int) (f * i);
                }
            }
        }
        efVar.b(rfVar, t8Var);
        rfVar.O(t8Var.e);
        rfVar.L(t8Var.f);
        rfVar.E = t8Var.h;
        rfVar.I(t8Var.g);
        t8Var.j = 0;
    }

    @Override // defpackage.rf
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.rf
    public final void F(s6 s6Var) {
        super.F(s6Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((rf) this.q0.get(i)).F(s6Var);
        }
    }

    @Override // defpackage.rf
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((rf) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(rf rfVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            ya[] yaVarArr = this.C0;
            if (i2 >= yaVarArr.length) {
                this.C0 = (ya[]) Arrays.copyOf(yaVarArr, yaVarArr.length * 2);
            }
            ya[] yaVarArr2 = this.C0;
            int i3 = this.z0;
            yaVarArr2[i3] = new ya(rfVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            ya[] yaVarArr3 = this.B0;
            if (i4 >= yaVarArr3.length) {
                this.B0 = (ya[]) Arrays.copyOf(yaVarArr3, yaVarArr3.length * 2);
            }
            ya[] yaVarArr4 = this.B0;
            int i5 = this.A0;
            yaVarArr4[i5] = new ya(rfVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(xx xxVar) {
        sf sfVar;
        xx xxVar2;
        boolean W = W(64);
        b(xxVar, W);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            rf rfVar = (rf) this.q0.get(i);
            boolean[] zArr = rfVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (rfVar instanceof e8) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                rf rfVar2 = (rf) this.q0.get(i2);
                if (rfVar2 instanceof e8) {
                    e8 e8Var = (e8) rfVar2;
                    for (int i3 = 0; i3 < e8Var.r0; i3++) {
                        rf rfVar3 = e8Var.q0[i3];
                        if (e8Var.t0 || rfVar3.c()) {
                            int i4 = e8Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                rfVar3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                rfVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            rf rfVar4 = (rf) this.q0.get(i5);
            rfVar4.getClass();
            boolean z2 = rfVar4 instanceof uo;
            if (z2 || (rfVar4 instanceof os)) {
                if (z2) {
                    hashSet.add(rfVar4);
                } else {
                    rfVar4.b(xxVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uo uoVar = (uo) ((rf) it.next());
                for (int i6 = 0; i6 < uoVar.r0; i6++) {
                    if (hashSet.contains(uoVar.q0[i6])) {
                        uoVar.b(xxVar, W);
                        hashSet.remove(uoVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((rf) it2.next()).b(xxVar, W);
                }
                hashSet.clear();
            }
        }
        if (xx.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                rf rfVar5 = (rf) this.q0.get(i7);
                rfVar5.getClass();
                if (!(rfVar5 instanceof uo) && !(rfVar5 instanceof os)) {
                    hashSet2.add(rfVar5);
                }
            }
            sfVar = this;
            xxVar2 = xxVar;
            sfVar.a(this, xxVar2, hashSet2, this.T[0] == qf.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                rf rfVar6 = (rf) it3.next();
                bi.p(sfVar, xxVar2, rfVar6);
                rfVar6.b(xxVar2, W);
            }
        } else {
            sfVar = this;
            xxVar2 = xxVar;
            for (int i8 = 0; i8 < size; i8++) {
                rf rfVar7 = (rf) sfVar.q0.get(i8);
                if (rfVar7 instanceof sf) {
                    qf[] qfVarArr = rfVar7.T;
                    qf qfVar = qfVarArr[0];
                    qf qfVar2 = qfVarArr[1];
                    qf qfVar3 = qf.WRAP_CONTENT;
                    if (qfVar == qfVar3) {
                        rfVar7.M(qf.FIXED);
                    }
                    if (qfVar2 == qfVar3) {
                        rfVar7.N(qf.FIXED);
                    }
                    rfVar7.b(xxVar2, W);
                    if (qfVar == qfVar3) {
                        rfVar7.M(qfVar);
                    }
                    if (qfVar2 == qfVar3) {
                        rfVar7.N(qfVar2);
                    }
                } else {
                    bi.p(sfVar, xxVar2, rfVar7);
                    if (!(rfVar7 instanceof uo) && !(rfVar7 instanceof os)) {
                        rfVar7.b(xxVar2, W);
                    }
                }
            }
        }
        if (sfVar.z0 > 0) {
            mv.b(sfVar, xxVar2, null, 0);
        }
        if (sfVar.A0 > 0) {
            mv.b(sfVar, xxVar2, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        qf qfVar;
        kj kjVar = this.s0;
        ArrayList arrayList = kjVar.e;
        sf sfVar = kjVar.a;
        boolean z3 = false;
        qf j = sfVar.j(0);
        qf j2 = sfVar.j(1);
        int r = sfVar.r();
        int s = sfVar.s();
        if (z && (j == (qfVar = qf.WRAP_CONTENT) || j2 == qfVar)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                vn0 vn0Var = (vn0) obj;
                if (vn0Var.f == i && !vn0Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j == qf.WRAP_CONTENT) {
                    sfVar.M(qf.FIXED);
                    sfVar.O(kjVar.d(sfVar, 0));
                    sfVar.d.e.d(sfVar.q());
                }
            } else if (z && j2 == qf.WRAP_CONTENT) {
                sfVar.N(qf.FIXED);
                sfVar.L(kjVar.d(sfVar, 1));
                sfVar.e.e.d(sfVar.k());
            }
        }
        qf[] qfVarArr = sfVar.T;
        if (i == 0) {
            qf qfVar2 = qfVarArr[0];
            if (qfVar2 == qf.FIXED || qfVar2 == qf.MATCH_PARENT) {
                int q = sfVar.q() + r;
                sfVar.d.i.d(q);
                sfVar.d.e.d(q - r);
                z2 = true;
            }
            z2 = false;
        } else {
            qf qfVar3 = qfVarArr[1];
            if (qfVar3 == qf.FIXED || qfVar3 == qf.MATCH_PARENT) {
                int k = sfVar.k() + s;
                sfVar.e.i.d(k);
                sfVar.e.e.d(k - s);
                z2 = true;
            }
            z2 = false;
        }
        kjVar.g();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            vn0 vn0Var2 = (vn0) obj2;
            if (vn0Var2.f == i && (vn0Var2.b != sfVar || vn0Var2.g)) {
                vn0Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z3 = true;
                break;
            }
            Object obj3 = arrayList.get(i4);
            i4++;
            vn0 vn0Var3 = (vn0) obj3;
            if (vn0Var3.f == i && (z2 || vn0Var3.b != sfVar)) {
                if (!vn0Var3.h.j) {
                    break;
                }
                if (!vn0Var3.i.j) {
                    break;
                }
                if (!(vn0Var3 instanceof za) && !vn0Var3.e.j) {
                    break;
                }
            }
        }
        sfVar.M(j);
        sfVar.N(j2);
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x068a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x081c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x090d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x061e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0648  */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        boolean[] zArr;
        qf[] qfVarArr;
        int i;
        int i2;
        qf qfVar;
        qf qfVar2;
        xe xeVar;
        xe xeVar2;
        int i3;
        int i4;
        boolean z;
        char c;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        xe xeVar3;
        boolean z5;
        boolean z6;
        int i7;
        int max;
        int max2;
        ?? r9;
        int i8;
        qf qfVar3;
        int i9;
        int i10;
        qf qfVar4;
        qf qfVar5;
        sn0 sn0Var;
        sn0 sn0Var2;
        qf qfVar6;
        int i11;
        int i12;
        int i13;
        int b;
        int b2;
        sn0 sn0Var3;
        sn0 sn0Var4;
        int i14;
        int i15;
        boolean[] zArr2 = bi.j;
        this.Z = 0;
        this.a0 = 0;
        this.E0 = false;
        this.F0 = false;
        int size = this.q0.size();
        int max3 = Math.max(0, q());
        int max4 = Math.max(0, k());
        qf[] qfVarArr2 = this.T;
        qf qfVar7 = qfVarArr2[1];
        qf qfVar8 = qfVarArr2[0];
        int i16 = this.t0;
        xe xeVar4 = this.J;
        xe xeVar5 = this.I;
        if (i16 == 0 && bi.y(this.D0, 1)) {
            ef efVar = this.u0;
            qf qfVar9 = qfVarArr2[0];
            qf qfVar10 = qfVarArr2[1];
            E();
            ArrayList arrayList = this.q0;
            int size2 = arrayList.size();
            for (int i17 = 0; i17 < size2; i17++) {
                ((rf) arrayList.get(i17)).E();
            }
            boolean z7 = this.v0;
            zArr = zArr2;
            if (qfVar9 == qf.FIXED) {
                J(0, q());
            } else {
                xeVar5.l(0);
                this.Z = 0;
            }
            boolean z8 = false;
            int i18 = 0;
            boolean z9 = false;
            while (i18 < size2) {
                boolean z10 = z8;
                rf rfVar = (rf) arrayList.get(i18);
                qf[] qfVarArr3 = qfVarArr2;
                if (rfVar instanceof os) {
                    os osVar = (os) rfVar;
                    i15 = i18;
                    if (osVar.u0 == 1) {
                        int i19 = osVar.r0;
                        if (i19 != -1) {
                            osVar.R(i19);
                        } else if (osVar.s0 != -1 && A()) {
                            osVar.R(q() - osVar.s0);
                        } else if (A()) {
                            osVar.R((int) ((osVar.q0 * q()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else {
                    i15 = i18;
                    if ((rfVar instanceof e8) && ((e8) rfVar).U() == 0) {
                        z8 = z10;
                        z9 = true;
                        i18 = i15 + 1;
                        qfVarArr2 = qfVarArr3;
                    }
                }
                z8 = z10;
                i18 = i15 + 1;
                qfVarArr2 = qfVarArr3;
            }
            qfVarArr = qfVarArr2;
            if (z8) {
                for (int i20 = 0; i20 < size2; i20 = i14 + 1) {
                    rf rfVar2 = (rf) arrayList.get(i20);
                    if (rfVar2 instanceof os) {
                        os osVar2 = (os) rfVar2;
                        i14 = i20;
                        if (osVar2.u0 == 1) {
                            bi.G(0, efVar, osVar2, z7);
                        }
                    } else {
                        i14 = i20;
                    }
                }
            }
            bi.G(0, efVar, this, z7);
            if (z9) {
                for (int i21 = 0; i21 < size2; i21++) {
                    rf rfVar3 = (rf) arrayList.get(i21);
                    if (rfVar3 instanceof e8) {
                        e8 e8Var = (e8) rfVar3;
                        if (e8Var.U() == 0 && e8Var.T()) {
                            bi.G(1, efVar, e8Var, z7);
                        }
                    }
                }
            }
            if (qfVar10 == qf.FIXED) {
                K(0, k());
            } else {
                xeVar4.l(0);
                this.a0 = 0;
            }
            int i22 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i22 < size2) {
                rf rfVar4 = (rf) arrayList.get(i22);
                int i23 = i22;
                if (rfVar4 instanceof os) {
                    os osVar3 = (os) rfVar4;
                    if (osVar3.u0 == 0) {
                        int i24 = osVar3.r0;
                        if (i24 != -1) {
                            osVar3.R(i24);
                        } else if (osVar3.s0 != -1 && B()) {
                            osVar3.R(k() - osVar3.s0);
                        } else if (B()) {
                            osVar3.R((int) ((osVar3.q0 * k()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else if ((rfVar4 instanceof e8) && ((e8) rfVar4).U() == 1) {
                    z12 = true;
                }
                i22 = i23 + 1;
            }
            if (z11) {
                for (int i25 = 0; i25 < size2; i25++) {
                    rf rfVar5 = (rf) arrayList.get(i25);
                    if (rfVar5 instanceof os) {
                        os osVar4 = (os) rfVar5;
                        if (osVar4.u0 == 0) {
                            bi.e0(1, efVar, osVar4);
                        }
                    }
                }
            }
            bi.e0(0, efVar, this);
            if (z12) {
                for (int i26 = 0; i26 < size2; i26++) {
                    rf rfVar6 = (rf) arrayList.get(i26);
                    if (rfVar6 instanceof e8) {
                        e8 e8Var2 = (e8) rfVar6;
                        if (e8Var2.U() == 1 && e8Var2.T()) {
                            bi.e0(1, efVar, e8Var2);
                        }
                    }
                }
            }
            for (int i27 = 0; i27 < size2; i27++) {
                rf rfVar7 = (rf) arrayList.get(i27);
                if (rfVar7.z() && bi.l(rfVar7)) {
                    V(rfVar7, efVar, bi.h);
                    if (!(rfVar7 instanceof os)) {
                        bi.G(0, efVar, rfVar7, z7);
                        bi.e0(0, efVar, rfVar7);
                    } else if (((os) rfVar7).u0 == 0) {
                        bi.e0(0, efVar, rfVar7);
                    } else {
                        bi.G(0, efVar, rfVar7, z7);
                    }
                }
            }
            for (int i28 = 0; i28 < size; i28++) {
                rf rfVar8 = (rf) this.q0.get(i28);
                if (rfVar8.z() && !(rfVar8 instanceof os) && !(rfVar8 instanceof e8) && !(rfVar8 instanceof uo) && !rfVar8.F) {
                    qf j = rfVar8.j(0);
                    qf j2 = rfVar8.j(1);
                    qf qfVar11 = qf.MATCH_CONSTRAINT;
                    if (j != qfVar11 || rfVar8.r == 1 || j2 != qfVar11 || rfVar8.s == 1) {
                        V(rfVar8, this.u0, new t8());
                    }
                }
            }
        } else {
            zArr = zArr2;
            qfVarArr = qfVarArr2;
        }
        xx xxVar = this.w0;
        if (size <= 2 || !((qfVar8 == (qfVar3 = qf.WRAP_CONTENT) || qfVar7 == qfVar3) && bi.y(this.D0, 1024))) {
            i = size;
            i2 = max4;
            qfVar = qfVar7;
            qfVar2 = qfVar8;
            xeVar = xeVar4;
            xeVar2 = xeVar5;
            i3 = max3;
        } else {
            ef efVar2 = this.u0;
            ArrayList arrayList2 = this.q0;
            int size3 = arrayList2.size();
            int i29 = 0;
            while (i29 < size3) {
                rf rfVar9 = (rf) arrayList2.get(i29);
                qf qfVar12 = qfVarArr[0];
                qf qfVar13 = qfVarArr[1];
                int i30 = i29;
                qf[] qfVarArr4 = rfVar9.T;
                xeVar2 = xeVar5;
                if (!mv.T(qfVar12, qfVar13, qfVarArr4[0], qfVarArr4[1]) || (rfVar9 instanceof uo)) {
                    i9 = max3;
                    i = size;
                    i10 = max4;
                    qfVar4 = qfVar7;
                    qfVar5 = qfVar8;
                    xeVar = xeVar4;
                    break;
                }
                i29 = i30 + 1;
                xeVar5 = xeVar2;
            }
            xeVar2 = xeVar5;
            i = size;
            xeVar = xeVar4;
            int i31 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i31 < size3) {
                int i32 = i31;
                rf rfVar10 = (rf) arrayList2.get(i31);
                int i33 = max4;
                qf qfVar14 = qfVarArr[0];
                qf qfVar15 = qfVar7;
                qf qfVar16 = qfVarArr[1];
                int i34 = max3;
                qf[] qfVarArr5 = rfVar10.T;
                qf qfVar17 = qfVar8;
                if (!mv.T(qfVar14, qfVar16, qfVarArr5[0], qfVarArr5[1])) {
                    V(rfVar10, efVar2, this.L0);
                }
                boolean z13 = rfVar10 instanceof os;
                if (z13) {
                    os osVar5 = (os) rfVar10;
                    if (osVar5.u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(osVar5);
                    }
                    if (osVar5.u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(osVar5);
                    }
                }
                if (rfVar10 instanceof dt) {
                    if (rfVar10 instanceof e8) {
                        e8 e8Var3 = (e8) rfVar10;
                        if (e8Var3.U() == 0) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(e8Var3);
                        }
                        if (e8Var3.U() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(e8Var3);
                        }
                    } else {
                        dt dtVar = (dt) rfVar10;
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(dtVar);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(dtVar);
                    }
                }
                if (rfVar10.I.f == null && rfVar10.K.f == null && !z13 && !(rfVar10 instanceof e8)) {
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(rfVar10);
                }
                if (rfVar10.J.f == null && rfVar10.L.f == null && rfVar10.M.f == null && !z13 && !(rfVar10 instanceof e8)) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(rfVar10);
                }
                i31 = i32 + 1;
                max4 = i33;
                qfVar7 = qfVar15;
                max3 = i34;
                qfVar8 = qfVar17;
            }
            i9 = max3;
            i10 = max4;
            qfVar4 = qfVar7;
            qfVar5 = qfVar8;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                int size4 = arrayList3.size();
                int i35 = 0;
                while (i35 < size4) {
                    Object obj = arrayList3.get(i35);
                    i35++;
                    mv.o((os) obj, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i36 = 0;
                while (i36 < size5) {
                    Object obj2 = arrayList6.get(i36);
                    i36++;
                    dt dtVar2 = (dt) obj2;
                    sn0 o = mv.o(dtVar2, 0, arrayList9, null);
                    dtVar2.R(0, o, arrayList9);
                    o.a(arrayList9);
                }
            }
            HashSet hashSet = i(we.LEFT).a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    mv.o(((xe) it.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(we.RIGHT).a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    mv.o(((xe) it2.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(we.CENTER).a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    mv.o(((xe) it3.next()).d, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size6 = arrayList5.size();
                int i37 = 0;
                while (i37 < size6) {
                    Object obj3 = arrayList5.get(i37);
                    i37++;
                    mv.o((rf) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i38 = 0;
                while (i38 < size7) {
                    Object obj4 = arrayList7.get(i38);
                    i38++;
                    mv.o((os) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i39 = 0;
                while (i39 < size8) {
                    Object obj5 = arrayList8.get(i39);
                    i39++;
                    dt dtVar3 = (dt) obj5;
                    sn0 o2 = mv.o(dtVar3, 1, arrayList9, null);
                    dtVar3.R(1, o2, arrayList9);
                    o2.a(arrayList9);
                }
            }
            HashSet hashSet4 = i(we.TOP).a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    mv.o(((xe) it4.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(we.BASELINE).a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    mv.o(((xe) it5.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(we.BOTTOM).a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    mv.o(((xe) it6.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(we.CENTER).a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    mv.o(((xe) it7.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList4 != null) {
                int size9 = arrayList4.size();
                int i40 = 0;
                while (i40 < size9) {
                    Object obj6 = arrayList4.get(i40);
                    i40++;
                    mv.o((rf) obj6, 1, arrayList9, null);
                }
            }
            for (int i41 = 0; i41 < size3; i41++) {
                rf rfVar11 = (rf) arrayList2.get(i41);
                qf[] qfVarArr6 = rfVar11.T;
                qf qfVar18 = qfVarArr6[0];
                qf qfVar19 = qf.MATCH_CONSTRAINT;
                if (qfVar18 == qfVar19 && qfVarArr6[1] == qfVar19) {
                    int i42 = rfVar11.o0;
                    int size10 = arrayList9.size();
                    int i43 = 0;
                    while (true) {
                        if (i43 >= size10) {
                            sn0Var3 = null;
                            break;
                        }
                        sn0Var3 = (sn0) arrayList9.get(i43);
                        if (i42 == sn0Var3.b) {
                            break;
                        } else {
                            i43++;
                        }
                    }
                    int i44 = rfVar11.p0;
                    int size11 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size11) {
                            sn0Var4 = null;
                            break;
                        }
                        sn0Var4 = (sn0) arrayList9.get(i45);
                        if (i44 == sn0Var4.b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    if (sn0Var3 != null && sn0Var4 != null) {
                        sn0Var3.c(0, sn0Var4);
                        sn0Var4.c = 2;
                        arrayList9.remove(sn0Var3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (qfVarArr[0] == qf.WRAP_CONTENT) {
                    int size12 = arrayList9.size();
                    int i46 = 0;
                    int i47 = 0;
                    sn0Var = null;
                    while (i47 < size12) {
                        Object obj7 = arrayList9.get(i47);
                        i47++;
                        sn0 sn0Var5 = (sn0) obj7;
                        if (sn0Var5.c != 1 && (b2 = sn0Var5.b(xxVar, 0)) > i46) {
                            sn0Var = sn0Var5;
                            i46 = b2;
                        }
                    }
                    if (sn0Var != null) {
                        M(qf.FIXED);
                        O(i46);
                        if (qfVarArr[1] == qf.WRAP_CONTENT) {
                            int size13 = arrayList9.size();
                            int i48 = 0;
                            int i49 = 0;
                            sn0Var2 = null;
                            while (i49 < size13) {
                                Object obj8 = arrayList9.get(i49);
                                i49++;
                                sn0 sn0Var6 = (sn0) obj8;
                                if (sn0Var6.c != 0 && (b = sn0Var6.b(xxVar, 1)) > i48) {
                                    sn0Var2 = sn0Var6;
                                    i48 = b;
                                }
                            }
                            if (sn0Var2 != null) {
                                N(qf.FIXED);
                                L(i48);
                                if (sn0Var == null || sn0Var2 != null) {
                                    qfVar6 = qf.WRAP_CONTENT;
                                    qfVar2 = qfVar5;
                                    if (qfVar2 == qfVar6) {
                                        i11 = i9;
                                        if (i11 >= q() || i11 <= 0) {
                                            i4 = q();
                                            qfVar = qfVar4;
                                            if (qfVar != qfVar6) {
                                                i12 = i10;
                                                if (i12 >= k() || i12 <= 0) {
                                                    i13 = k();
                                                    i2 = i13;
                                                    z = true;
                                                    boolean z14 = !W(64) || W(128);
                                                    xxVar.getClass();
                                                    xxVar.h = false;
                                                    if (this.D0 == 0 && z14) {
                                                        c = 1;
                                                        xxVar.h = true;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    ArrayList arrayList10 = this.q0;
                                                    qf qfVar20 = qfVarArr[0];
                                                    qf qfVar21 = qf.WRAP_CONTENT;
                                                    boolean z15 = qfVar20 != qfVar21 || qfVarArr[c] == qfVar21;
                                                    this.z0 = 0;
                                                    this.A0 = 0;
                                                    i5 = i;
                                                    for (i6 = 0; i6 < i5; i6++) {
                                                        rf rfVar12 = (rf) this.q0.get(i6);
                                                        if (rfVar12 instanceof sf) {
                                                            ((sf) rfVar12).U();
                                                        }
                                                    }
                                                    boolean W = W(64);
                                                    boolean z16 = z;
                                                    int i50 = 0;
                                                    z2 = true;
                                                    while (z2) {
                                                        int i51 = i50 + 1;
                                                        try {
                                                            xxVar.t();
                                                            this.z0 = 0;
                                                            this.A0 = 0;
                                                            g(xxVar);
                                                            for (int i52 = 0; i52 < i5; i52++) {
                                                                ((rf) this.q0.get(i52)).g(xxVar);
                                                            }
                                                            S(xxVar);
                                                            try {
                                                                WeakReference weakReference = this.G0;
                                                                if (weakReference == null || weakReference.get() == null) {
                                                                    z4 = z16;
                                                                    xeVar3 = xeVar;
                                                                } else {
                                                                    xeVar3 = xeVar;
                                                                    try {
                                                                        z4 = z16;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        z4 = z16;
                                                                        z2 = true;
                                                                        e.printStackTrace();
                                                                        z5 = z2;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (z5) {
                                                                        }
                                                                        if (z15) {
                                                                        }
                                                                        z6 = W;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, k());
                                                                        if (max2 <= k()) {
                                                                        }
                                                                        if (!z4) {
                                                                        }
                                                                        z16 = z4;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        xeVar = xeVar3;
                                                                        W = z6;
                                                                        i5 = i7;
                                                                    }
                                                                    try {
                                                                        xxVar.f(xxVar.k((xe) this.G0.get()), xxVar.k(xeVar3), 0, 5);
                                                                        this.G0 = null;
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        z2 = true;
                                                                        e.printStackTrace();
                                                                        z5 = z2;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (z5) {
                                                                        }
                                                                        if (z15) {
                                                                        }
                                                                        z6 = W;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, k());
                                                                        if (max2 <= k()) {
                                                                        }
                                                                        if (!z4) {
                                                                        }
                                                                        z16 = z4;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        xeVar = xeVar3;
                                                                        W = z6;
                                                                        i5 = i7;
                                                                    }
                                                                }
                                                                WeakReference weakReference2 = this.I0;
                                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                                    xxVar.f(xxVar.k(this.L), xxVar.k((xe) this.I0.get()), 0, 5);
                                                                    this.I0 = null;
                                                                }
                                                                WeakReference weakReference3 = this.H0;
                                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                                    xe xeVar6 = xeVar2;
                                                                    try {
                                                                        xeVar2 = xeVar6;
                                                                        xxVar.f(xxVar.k((xe) this.H0.get()), xxVar.k(xeVar6), 0, 5);
                                                                        this.H0 = null;
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        xeVar2 = xeVar6;
                                                                        z2 = true;
                                                                        e.printStackTrace();
                                                                        z5 = z2;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (z5) {
                                                                        }
                                                                        if (z15) {
                                                                        }
                                                                        z6 = W;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, k());
                                                                        if (max2 <= k()) {
                                                                        }
                                                                        if (!z4) {
                                                                        }
                                                                        z16 = z4;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        xeVar = xeVar3;
                                                                        W = z6;
                                                                        i5 = i7;
                                                                    }
                                                                }
                                                                WeakReference weakReference4 = this.J0;
                                                                if (weakReference4 != null && weakReference4.get() != null) {
                                                                    try {
                                                                        xxVar.f(xxVar.k(this.K), xxVar.k((xe) this.J0.get()), 0, 5);
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        z2 = true;
                                                                        e.printStackTrace();
                                                                        z5 = z2;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (z5) {
                                                                        }
                                                                        if (z15) {
                                                                        }
                                                                        z6 = W;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, k());
                                                                        if (max2 <= k()) {
                                                                        }
                                                                        if (!z4) {
                                                                        }
                                                                        z16 = z4;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        xeVar = xeVar3;
                                                                        W = z6;
                                                                        i5 = i7;
                                                                    }
                                                                    try {
                                                                        this.J0 = null;
                                                                    } catch (Exception e5) {
                                                                        e = e5;
                                                                        z2 = true;
                                                                        e.printStackTrace();
                                                                        z5 = z2;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (z5) {
                                                                        }
                                                                        if (z15) {
                                                                        }
                                                                        z6 = W;
                                                                        i7 = i5;
                                                                        max = Math.max(this.c0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.d0, k());
                                                                        if (max2 <= k()) {
                                                                        }
                                                                        if (!z4) {
                                                                        }
                                                                        z16 = z4;
                                                                        i8 = 8;
                                                                        if (i51 > i8) {
                                                                        }
                                                                        i50 = i51;
                                                                        xeVar = xeVar3;
                                                                        W = z6;
                                                                        i5 = i7;
                                                                    }
                                                                }
                                                                xxVar.p();
                                                                z5 = true;
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                z4 = z16;
                                                                xeVar3 = xeVar;
                                                            }
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            z4 = z16;
                                                            xeVar3 = xeVar;
                                                        }
                                                        if (z5) {
                                                            Q(xxVar, W);
                                                            for (int i53 = 0; i53 < i5; i53++) {
                                                                ((rf) this.q0.get(i53)).Q(xxVar, W);
                                                            }
                                                            z2 = false;
                                                        } else {
                                                            zArr[2] = false;
                                                            boolean W2 = W(64);
                                                            Q(xxVar, W2);
                                                            int size14 = this.q0.size();
                                                            int i54 = 0;
                                                            z2 = false;
                                                            while (i54 < size14) {
                                                                int i55 = size14;
                                                                rf rfVar13 = (rf) this.q0.get(i54);
                                                                rfVar13.Q(xxVar, W2);
                                                                boolean z17 = W2;
                                                                int i56 = i54;
                                                                if (rfVar13.h != -1 || rfVar13.i != -1) {
                                                                    z2 = true;
                                                                }
                                                                i54 = i56 + 1;
                                                                size14 = i55;
                                                                W2 = z17;
                                                            }
                                                        }
                                                        if (z15 || i51 >= 8) {
                                                            z6 = W;
                                                            i7 = i5;
                                                        } else if (zArr[2]) {
                                                            int i57 = 0;
                                                            int i58 = 0;
                                                            int i59 = 0;
                                                            while (i59 < i5) {
                                                                boolean z18 = W;
                                                                rf rfVar14 = (rf) this.q0.get(i59);
                                                                i58 = Math.max(i58, rfVar14.q() + rfVar14.Z);
                                                                i57 = Math.max(i57, rfVar14.k() + rfVar14.a0);
                                                                i59++;
                                                                W = z18;
                                                                i5 = i5;
                                                            }
                                                            z6 = W;
                                                            i7 = i5;
                                                            int max5 = Math.max(this.c0, i58);
                                                            int max6 = Math.max(this.d0, i57);
                                                            qf qfVar22 = qf.WRAP_CONTENT;
                                                            if (qfVar2 == qfVar22 && q() < max5) {
                                                                O(max5);
                                                                qfVarArr[0] = qfVar22;
                                                                z2 = true;
                                                                z4 = true;
                                                            }
                                                            if (qfVar == qfVar22 && k() < max6) {
                                                                L(max6);
                                                                qfVarArr[1] = qfVar22;
                                                                z2 = true;
                                                                z4 = true;
                                                            }
                                                        } else {
                                                            z6 = W;
                                                            i7 = i5;
                                                        }
                                                        max = Math.max(this.c0, q());
                                                        if (max > q()) {
                                                            O(max);
                                                            qfVarArr[0] = qf.FIXED;
                                                            z2 = true;
                                                            z4 = true;
                                                        }
                                                        max2 = Math.max(this.d0, k());
                                                        if (max2 <= k()) {
                                                            L(max2);
                                                            r9 = 1;
                                                            qfVarArr[1] = qf.FIXED;
                                                            z2 = true;
                                                            z4 = true;
                                                        } else {
                                                            r9 = 1;
                                                        }
                                                        if (!z4) {
                                                            qf qfVar23 = qfVarArr[0];
                                                            qf qfVar24 = qf.WRAP_CONTENT;
                                                            if (qfVar23 == qfVar24 && i4 > 0 && q() > i4) {
                                                                this.E0 = r9;
                                                                qfVarArr[0] = qf.FIXED;
                                                                O(i4);
                                                                z2 = r9;
                                                                z4 = z2;
                                                            }
                                                            if (qfVarArr[r9] == qfVar24 && i2 > 0 && k() > i2) {
                                                                this.F0 = r9;
                                                                qfVarArr[r9] = qf.FIXED;
                                                                L(i2);
                                                                i8 = 8;
                                                                z16 = true;
                                                                z2 = true;
                                                                if (i51 > i8) {
                                                                    z2 = false;
                                                                }
                                                                i50 = i51;
                                                                xeVar = xeVar3;
                                                                W = z6;
                                                                i5 = i7;
                                                            }
                                                        }
                                                        z16 = z4;
                                                        i8 = 8;
                                                        if (i51 > i8) {
                                                        }
                                                        i50 = i51;
                                                        xeVar = xeVar3;
                                                        W = z6;
                                                        i5 = i7;
                                                    }
                                                    z3 = z16;
                                                    this.q0 = arrayList10;
                                                    if (z3) {
                                                        qfVarArr[0] = qfVar2;
                                                        qfVarArr[1] = qfVar;
                                                    }
                                                    F(xxVar.m);
                                                }
                                                L(i12);
                                                this.F0 = true;
                                            } else {
                                                i12 = i10;
                                            }
                                            i13 = i12;
                                            i2 = i13;
                                            z = true;
                                            if (W(64)) {
                                            }
                                            xxVar.getClass();
                                            xxVar.h = false;
                                            if (this.D0 == 0) {
                                            }
                                            c = 1;
                                            ArrayList arrayList102 = this.q0;
                                            qf qfVar202 = qfVarArr[0];
                                            qf qfVar212 = qf.WRAP_CONTENT;
                                            if (qfVar202 != qfVar212) {
                                            }
                                            this.z0 = 0;
                                            this.A0 = 0;
                                            i5 = i;
                                            while (i6 < i5) {
                                            }
                                            boolean W3 = W(64);
                                            boolean z162 = z;
                                            int i502 = 0;
                                            z2 = true;
                                            while (z2) {
                                            }
                                            z3 = z162;
                                            this.q0 = arrayList102;
                                            if (z3) {
                                            }
                                            F(xxVar.m);
                                        }
                                        O(i11);
                                        this.E0 = true;
                                    } else {
                                        i11 = i9;
                                    }
                                    i4 = i11;
                                    qfVar = qfVar4;
                                    if (qfVar != qfVar6) {
                                    }
                                    i13 = i12;
                                    i2 = i13;
                                    z = true;
                                    if (W(64)) {
                                    }
                                    xxVar.getClass();
                                    xxVar.h = false;
                                    if (this.D0 == 0) {
                                    }
                                    c = 1;
                                    ArrayList arrayList1022 = this.q0;
                                    qf qfVar2022 = qfVarArr[0];
                                    qf qfVar2122 = qf.WRAP_CONTENT;
                                    if (qfVar2022 != qfVar2122) {
                                    }
                                    this.z0 = 0;
                                    this.A0 = 0;
                                    i5 = i;
                                    while (i6 < i5) {
                                    }
                                    boolean W32 = W(64);
                                    boolean z1622 = z;
                                    int i5022 = 0;
                                    z2 = true;
                                    while (z2) {
                                    }
                                    z3 = z1622;
                                    this.q0 = arrayList1022;
                                    if (z3) {
                                    }
                                    F(xxVar.m);
                                }
                            }
                        }
                        sn0Var2 = null;
                        if (sn0Var == null) {
                        }
                        qfVar6 = qf.WRAP_CONTENT;
                        qfVar2 = qfVar5;
                        if (qfVar2 == qfVar6) {
                        }
                        i4 = i11;
                        qfVar = qfVar4;
                        if (qfVar != qfVar6) {
                        }
                        i13 = i12;
                        i2 = i13;
                        z = true;
                        if (W(64)) {
                        }
                        xxVar.getClass();
                        xxVar.h = false;
                        if (this.D0 == 0) {
                        }
                        c = 1;
                        ArrayList arrayList10222 = this.q0;
                        qf qfVar20222 = qfVarArr[0];
                        qf qfVar21222 = qf.WRAP_CONTENT;
                        if (qfVar20222 != qfVar21222) {
                        }
                        this.z0 = 0;
                        this.A0 = 0;
                        i5 = i;
                        while (i6 < i5) {
                        }
                        boolean W322 = W(64);
                        boolean z16222 = z;
                        int i50222 = 0;
                        z2 = true;
                        while (z2) {
                        }
                        z3 = z16222;
                        this.q0 = arrayList10222;
                        if (z3) {
                        }
                        F(xxVar.m);
                    }
                }
                sn0Var = null;
                if (qfVarArr[1] == qf.WRAP_CONTENT) {
                }
                sn0Var2 = null;
                if (sn0Var == null) {
                }
                qfVar6 = qf.WRAP_CONTENT;
                qfVar2 = qfVar5;
                if (qfVar2 == qfVar6) {
                }
                i4 = i11;
                qfVar = qfVar4;
                if (qfVar != qfVar6) {
                }
                i13 = i12;
                i2 = i13;
                z = true;
                if (W(64)) {
                }
                xxVar.getClass();
                xxVar.h = false;
                if (this.D0 == 0) {
                }
                c = 1;
                ArrayList arrayList102222 = this.q0;
                qf qfVar202222 = qfVarArr[0];
                qf qfVar212222 = qf.WRAP_CONTENT;
                if (qfVar202222 != qfVar212222) {
                }
                this.z0 = 0;
                this.A0 = 0;
                i5 = i;
                while (i6 < i5) {
                }
                boolean W3222 = W(64);
                boolean z162222 = z;
                int i502222 = 0;
                z2 = true;
                while (z2) {
                }
                z3 = z162222;
                this.q0 = arrayList102222;
                if (z3) {
                }
                F(xxVar.m);
            }
            i2 = i10;
            qfVar = qfVar4;
            i3 = i9;
            qfVar2 = qfVar5;
        }
        i4 = i3;
        z = false;
        if (W(64)) {
        }
        xxVar.getClass();
        xxVar.h = false;
        if (this.D0 == 0) {
        }
        c = 1;
        ArrayList arrayList1022222 = this.q0;
        qf qfVar2022222 = qfVarArr[0];
        qf qfVar2122222 = qf.WRAP_CONTENT;
        if (qfVar2022222 != qfVar2122222) {
        }
        this.z0 = 0;
        this.A0 = 0;
        i5 = i;
        while (i6 < i5) {
        }
        boolean W32222 = W(64);
        boolean z1622222 = z;
        int i5022222 = 0;
        z2 = true;
        while (z2) {
        }
        z3 = z1622222;
        this.q0 = arrayList1022222;
        if (z3) {
        }
        F(xxVar.m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.rf
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.V);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.W);
        sb.append("\n");
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((rf) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
