package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class bd extends ad {
    public int A0;
    public s9[] B0;
    public s9[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final v7 L0;
    public ArrayList q0 = new ArrayList();
    public final a6 r0 = new a6(this);
    public final gf s0;
    public int t0;
    public qc u0;
    public boolean v0;
    public final kq w0;
    public int x0;
    public int y0;
    public int z0;

    public bd() {
        gf gfVar = new gf();
        gfVar.b = true;
        gfVar.c = true;
        gfVar.e = new ArrayList();
        new ArrayList();
        gfVar.f = null;
        gfVar.g = new v7();
        gfVar.h = new ArrayList();
        gfVar.a = this;
        gfVar.d = this;
        this.s0 = gfVar;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new kq();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new s9[4];
        this.C0 = new s9[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new v7();
    }

    public static void V(ad adVar, qc qcVar, v7 v7Var) {
        int i;
        int i2;
        if (qcVar == null) {
            return;
        }
        int i3 = adVar.g0;
        int[] iArr = adVar.t;
        if (i3 == 8 || (adVar instanceof om) || (adVar instanceof i7)) {
            v7Var.e = 0;
            v7Var.f = 0;
            return;
        }
        int[] iArr2 = adVar.p0;
        v7Var.a = iArr2[0];
        v7Var.b = iArr2[1];
        v7Var.c = adVar.q();
        v7Var.d = adVar.k();
        v7Var.i = false;
        v7Var.j = 0;
        boolean z = v7Var.a == 3;
        boolean z2 = v7Var.b == 3;
        boolean z3 = z && adVar.W > 0.0f;
        boolean z4 = z2 && adVar.W > 0.0f;
        if (z && adVar.t(0) && adVar.r == 0 && !z3) {
            v7Var.a = 2;
            if (z2 && adVar.s == 0) {
                v7Var.a = 1;
            }
            z = false;
        }
        if (z2 && adVar.t(1) && adVar.s == 0 && !z4) {
            v7Var.b = 2;
            if (z && adVar.r == 0) {
                v7Var.b = 1;
            }
            z2 = false;
        }
        if (adVar.A()) {
            v7Var.a = 1;
            z = false;
        }
        if (adVar.B()) {
            v7Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                v7Var.a = 1;
            } else if (!z2) {
                if (v7Var.b == 1) {
                    i2 = v7Var.d;
                } else {
                    v7Var.a = 2;
                    qcVar.b(adVar, v7Var);
                    i2 = v7Var.f;
                }
                v7Var.a = 1;
                v7Var.c = (int) (adVar.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                v7Var.b = 1;
            } else if (!z) {
                if (v7Var.a == 1) {
                    i = v7Var.c;
                } else {
                    v7Var.b = 2;
                    qcVar.b(adVar, v7Var);
                    i = v7Var.e;
                }
                v7Var.b = 1;
                int i4 = adVar.X;
                float f = adVar.W;
                if (i4 == -1) {
                    v7Var.d = (int) (i / f);
                } else {
                    v7Var.d = (int) (f * i);
                }
            }
        }
        qcVar.b(adVar, v7Var);
        adVar.O(v7Var.e);
        adVar.L(v7Var.f);
        adVar.E = v7Var.h;
        adVar.I(v7Var.g);
        v7Var.j = 0;
    }

    @Override // defpackage.ad
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.ad
    public final void F(a6 a6Var) {
        super.F(a6Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ad) this.q0.get(i)).F(a6Var);
        }
    }

    @Override // defpackage.ad
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ad) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(ad adVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            s9[] s9VarArr = this.C0;
            if (i2 >= s9VarArr.length) {
                this.C0 = (s9[]) Arrays.copyOf(s9VarArr, s9VarArr.length * 2);
            }
            s9[] s9VarArr2 = this.C0;
            int i3 = this.z0;
            s9VarArr2[i3] = new s9(adVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            s9[] s9VarArr3 = this.B0;
            if (i4 >= s9VarArr3.length) {
                this.B0 = (s9[]) Arrays.copyOf(s9VarArr3, s9VarArr3.length * 2);
            }
            s9[] s9VarArr4 = this.B0;
            int i5 = this.A0;
            s9VarArr4[i5] = new s9(adVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(kq kqVar) {
        bd bdVar;
        kq kqVar2;
        boolean W = W(64);
        b(kqVar, W);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ad adVar = (ad) this.q0.get(i);
            boolean[] zArr = adVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (adVar instanceof i7) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ad adVar2 = (ad) this.q0.get(i2);
                if (adVar2 instanceof i7) {
                    i7 i7Var = (i7) adVar2;
                    for (int i3 = 0; i3 < i7Var.r0; i3++) {
                        ad adVar3 = i7Var.q0[i3];
                        if (i7Var.t0 || adVar3.c()) {
                            int i4 = i7Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                adVar3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                adVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ad adVar4 = (ad) this.q0.get(i5);
            adVar4.getClass();
            boolean z2 = adVar4 instanceof lj;
            if (z2 || (adVar4 instanceof om)) {
                if (z2) {
                    hashSet.add(adVar4);
                } else {
                    adVar4.b(kqVar, W);
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
                lj ljVar = (lj) ((ad) it.next());
                for (int i6 = 0; i6 < ljVar.r0; i6++) {
                    if (hashSet.contains(ljVar.q0[i6])) {
                        ljVar.b(kqVar, W);
                        hashSet.remove(ljVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ad) it2.next()).b(kqVar, W);
                }
                hashSet.clear();
            }
        }
        if (kq.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ad adVar5 = (ad) this.q0.get(i7);
                adVar5.getClass();
                if (!(adVar5 instanceof lj) && !(adVar5 instanceof om)) {
                    hashSet2.add(adVar5);
                }
            }
            bdVar = this;
            kqVar2 = kqVar;
            bdVar.a(this, kqVar2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ad adVar6 = (ad) it3.next();
                zo.e(bdVar, kqVar2, adVar6);
                adVar6.b(kqVar2, W);
            }
        } else {
            bdVar = this;
            kqVar2 = kqVar;
            for (int i8 = 0; i8 < size; i8++) {
                ad adVar7 = (ad) bdVar.q0.get(i8);
                if (adVar7 instanceof bd) {
                    int[] iArr = adVar7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        adVar7.M(1);
                    }
                    if (i10 == 2) {
                        adVar7.N(1);
                    }
                    adVar7.b(kqVar2, W);
                    if (i9 == 2) {
                        adVar7.M(i9);
                    }
                    if (i10 == 2) {
                        adVar7.N(i10);
                    }
                } else {
                    zo.e(bdVar, kqVar2, adVar7);
                    if (!(adVar7 instanceof lj) && !(adVar7 instanceof om)) {
                        adVar7.b(kqVar2, W);
                    }
                }
            }
        }
        if (bdVar.z0 > 0) {
            jw.f(bdVar, kqVar2, null, 0);
        }
        if (bdVar.A0 > 0) {
            jw.f(bdVar, kqVar2, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        gf gfVar = this.s0;
        ArrayList arrayList = gfVar.e;
        bd bdVar = gfVar.a;
        boolean z3 = false;
        int j = bdVar.j(0);
        int j2 = bdVar.j(1);
        int r = bdVar.r();
        int s = bdVar.s();
        if (z && (j == 2 || j2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                ka0 ka0Var = (ka0) obj;
                if (ka0Var.f == i && !ka0Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j == 2) {
                    bdVar.M(1);
                    bdVar.O(gfVar.d(bdVar, 0));
                    bdVar.d.e.d(bdVar.q());
                }
            } else if (z && j2 == 2) {
                bdVar.N(1);
                bdVar.L(gfVar.d(bdVar, 1));
                bdVar.e.e.d(bdVar.k());
            }
        }
        int[] iArr = bdVar.p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int q = bdVar.q() + r;
                bdVar.d.i.d(q);
                bdVar.d.e.d(q - r);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int k = bdVar.k() + s;
                bdVar.e.i.d(k);
                bdVar.e.e.d(k - s);
                z2 = true;
            }
            z2 = false;
        }
        gfVar.g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            ka0 ka0Var2 = (ka0) obj2;
            if (ka0Var2.f == i && (ka0Var2.b != bdVar || ka0Var2.g)) {
                ka0Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z3 = true;
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            ka0 ka0Var3 = (ka0) obj3;
            if (ka0Var3.f == i && (z2 || ka0Var3.b != bdVar)) {
                if (!ka0Var3.h.j) {
                    break;
                }
                if (!ka0Var3.i.j) {
                    break;
                }
                if (!(ka0Var3 instanceof t9) && !ka0Var3.e.j) {
                    break;
                }
            }
        }
        bdVar.M(j);
        bdVar.N(j2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0827 A[LOOP:14: B:278:0x0825->B:279:0x0827, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x060d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0637  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        boolean[] zArr;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        int i4;
        lc lcVar;
        lc lcVar2;
        boolean z;
        char c;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        lc lcVar3;
        boolean z4;
        boolean z5;
        int max;
        ?? r8;
        boolean z6;
        int max2;
        boolean z7;
        int i7;
        int i8;
        int max3;
        int max4;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        lc lcVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        ja0 ja0Var;
        ja0 ja0Var2;
        int i13;
        int i14;
        int b;
        int b2;
        ja0 ja0Var3;
        ja0 ja0Var4;
        int i15;
        boolean z8;
        boolean[] zArr2 = zo.i;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size = this.q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.p0;
        int i16 = iArr[1];
        int i17 = iArr[0];
        int i18 = this.t0;
        lc lcVar5 = this.J;
        lc lcVar6 = this.I;
        if (i18 == 0 && zo.p(this.D0, 1)) {
            qc qcVar = this.u0;
            int i19 = iArr[0];
            int i20 = iArr[1];
            E();
            ArrayList arrayList = this.q0;
            int size2 = arrayList.size();
            for (int i21 = 0; i21 < size2; i21++) {
                ((ad) arrayList.get(i21)).E();
            }
            boolean z9 = this.v0;
            zArr = zArr2;
            if (i19 == 1) {
                J(0, q());
            } else {
                lcVar6.l(0);
                this.Y = 0;
            }
            int i22 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i22 < size2) {
                int i23 = i22;
                ad adVar = (ad) arrayList.get(i22);
                int[] iArr2 = iArr;
                if (adVar instanceof om) {
                    om omVar = (om) adVar;
                    z8 = z10;
                    if (omVar.u0 == 1) {
                        int i24 = omVar.r0;
                        if (i24 != -1) {
                            omVar.R(i24);
                        } else if (omVar.s0 != -1 && A()) {
                            omVar.R(q() - omVar.s0);
                        } else if (A()) {
                            omVar.R((int) ((omVar.q0 * q()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else {
                    z8 = z10;
                    if ((adVar instanceof i7) && ((i7) adVar).U() == 0) {
                        z10 = z8;
                        z11 = true;
                        i22 = i23 + 1;
                        iArr = iArr2;
                    }
                }
                z10 = z8;
                i22 = i23 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z10) {
                for (int i25 = 0; i25 < size2; i25 = i15 + 1) {
                    ad adVar2 = (ad) arrayList.get(i25);
                    if (adVar2 instanceof om) {
                        om omVar2 = (om) adVar2;
                        i15 = i25;
                        if (omVar2.u0 == 1) {
                            o8.K(0, qcVar, omVar2, z9);
                        }
                    } else {
                        i15 = i25;
                    }
                }
            }
            o8.K(0, qcVar, this, z9);
            if (z11) {
                for (int i26 = 0; i26 < size2; i26++) {
                    ad adVar3 = (ad) arrayList.get(i26);
                    if (adVar3 instanceof i7) {
                        i7 i7Var = (i7) adVar3;
                        if (i7Var.U() == 0 && i7Var.T()) {
                            o8.K(1, qcVar, i7Var, z9);
                        }
                    }
                }
            }
            if (i20 == 1) {
                K(0, k());
            } else {
                lcVar5.l(0);
                this.Z = 0;
            }
            int i27 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i27 < size2) {
                ad adVar4 = (ad) arrayList.get(i27);
                int i28 = i27;
                if (adVar4 instanceof om) {
                    om omVar3 = (om) adVar4;
                    if (omVar3.u0 == 0) {
                        int i29 = omVar3.r0;
                        if (i29 != -1) {
                            omVar3.R(i29);
                        } else if (omVar3.s0 != -1 && B()) {
                            omVar3.R(k() - omVar3.s0);
                        } else if (B()) {
                            omVar3.R((int) ((omVar3.q0 * k()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else if ((adVar4 instanceof i7) && ((i7) adVar4).U() == 1) {
                    z13 = true;
                }
                i27 = i28 + 1;
            }
            if (z12) {
                for (int i30 = 0; i30 < size2; i30++) {
                    ad adVar5 = (ad) arrayList.get(i30);
                    if (adVar5 instanceof om) {
                        om omVar4 = (om) adVar5;
                        if (omVar4.u0 == 0) {
                            o8.B0(1, qcVar, omVar4);
                        }
                    }
                }
            }
            o8.B0(0, qcVar, this);
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    ad adVar6 = (ad) arrayList.get(i31);
                    if (adVar6 instanceof i7) {
                        i7 i7Var2 = (i7) adVar6;
                        if (i7Var2.U() == 1 && i7Var2.T()) {
                            o8.B0(1, qcVar, i7Var2);
                        }
                    }
                }
            }
            for (int i32 = 0; i32 < size2; i32++) {
                ad adVar7 = (ad) arrayList.get(i32);
                if (adVar7.z() && o8.g(adVar7)) {
                    V(adVar7, qcVar, o8.f);
                    if (!(adVar7 instanceof om)) {
                        o8.K(0, qcVar, adVar7, z9);
                        o8.B0(0, qcVar, adVar7);
                    } else if (((om) adVar7).u0 == 0) {
                        o8.B0(0, qcVar, adVar7);
                    } else {
                        o8.K(0, qcVar, adVar7, z9);
                    }
                }
            }
            for (int i33 = 0; i33 < size; i33++) {
                ad adVar8 = (ad) this.q0.get(i33);
                if (adVar8.z() && !(adVar8 instanceof om) && !(adVar8 instanceof i7) && !(adVar8 instanceof lj) && !adVar8.F) {
                    int j = adVar8.j(0);
                    int j2 = adVar8.j(1);
                    if (j != 3 || adVar8.r == 1 || j2 != 3 || adVar8.s == 1) {
                        V(adVar8, this.u0, new v7());
                    }
                }
            }
        } else {
            zArr = zArr2;
            objArr = iArr;
        }
        kq kqVar = this.w0;
        if (size <= 2 || !((i17 == 2 || i16 == 2) && zo.p(this.D0, 1024))) {
            i = max5;
            i2 = size;
            i3 = i16;
            i4 = i17;
            lcVar = lcVar5;
            lcVar2 = lcVar6;
        } else {
            qc qcVar2 = this.u0;
            ArrayList arrayList2 = this.q0;
            int size3 = arrayList2.size();
            int i34 = 0;
            while (i34 < size3) {
                ad adVar9 = (ad) arrayList2.get(i34);
                char c3 = objArr[0];
                char c4 = objArr[1];
                int i35 = i34;
                int[] iArr3 = adVar9.p0;
                lcVar2 = lcVar6;
                if (!e70.U(c3, c4, iArr3[0], iArr3[1]) || (adVar9 instanceof lj)) {
                    i9 = max5;
                    i2 = size;
                    i10 = max6;
                    i11 = i16;
                    i12 = i17;
                    lcVar = lcVar5;
                    break;
                }
                i34 = i35 + 1;
                lcVar6 = lcVar2;
            }
            lcVar2 = lcVar6;
            i2 = size;
            lcVar = lcVar5;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = i36;
                ad adVar10 = (ad) arrayList2.get(i36);
                int i38 = max6;
                char c5 = objArr[0];
                int i39 = i16;
                char c6 = objArr[1];
                int i40 = max5;
                int[] iArr4 = adVar10.p0;
                int i41 = i17;
                if (!e70.U(c5, c6, iArr4[0], iArr4[1])) {
                    V(adVar10, qcVar2, this.L0);
                }
                boolean z14 = adVar10 instanceof om;
                if (z14) {
                    om omVar5 = (om) adVar10;
                    if (omVar5.u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(omVar5);
                    }
                    if (omVar5.u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(omVar5);
                    }
                }
                if (adVar10 instanceof an) {
                    if (adVar10 instanceof i7) {
                        i7 i7Var3 = (i7) adVar10;
                        if (i7Var3.U() == 0) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(i7Var3);
                        }
                        if (i7Var3.U() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(i7Var3);
                        }
                    } else {
                        an anVar = (an) adVar10;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(anVar);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(anVar);
                    }
                }
                if (adVar10.I.f == null && adVar10.K.f == null && !z14 && !(adVar10 instanceof i7)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(adVar10);
                }
                if (adVar10.J.f == null && adVar10.L.f == null && adVar10.M.f == null && !z14 && !(adVar10 instanceof i7)) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(adVar10);
                }
                i36 = i37 + 1;
                max6 = i38;
                i16 = i39;
                max5 = i40;
                i17 = i41;
            }
            i9 = max5;
            i10 = max6;
            i11 = i16;
            i12 = i17;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                int size4 = arrayList3.size();
                int i42 = 0;
                while (i42 < size4) {
                    Object obj = arrayList3.get(i42);
                    i42++;
                    e70.t((om) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i43 = 0;
                while (i43 < size5) {
                    Object obj2 = arrayList5.get(i43);
                    i43++;
                    an anVar2 = (an) obj2;
                    ja0 t = e70.t(anVar2, 0, arrayList9, null);
                    anVar2.R(0, t, arrayList9);
                    t.a(arrayList9);
                }
            }
            HashSet hashSet = i(2).a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    e70.t(((lc) it.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    e70.t(((lc) it2.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    e70.t(((lc) it3.next()).d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i44 = 0;
                while (i44 < size6) {
                    Object obj3 = arrayList6.get(i44);
                    i44++;
                    e70.t((ad) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i45 = 0;
                while (i45 < size7) {
                    Object obj4 = arrayList7.get(i45);
                    i45++;
                    e70.t((om) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i46 = 0;
                while (i46 < size8) {
                    Object obj5 = arrayList8.get(i46);
                    i46++;
                    an anVar3 = (an) obj5;
                    ja0 t2 = e70.t(anVar3, 1, arrayList9, null);
                    anVar3.R(1, t2, arrayList9);
                    t2.a(arrayList9);
                }
            }
            HashSet hashSet4 = i(3).a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    e70.t(((lc) it4.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    e70.t(((lc) it5.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    e70.t(((lc) it6.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    e70.t(((lc) it7.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList4 != null) {
                int size9 = arrayList4.size();
                int i47 = 0;
                while (i47 < size9) {
                    Object obj6 = arrayList4.get(i47);
                    i47++;
                    e70.t((ad) obj6, 1, arrayList9, null);
                }
            }
            char c7 = 1;
            int i48 = 0;
            while (i48 < size3) {
                ad adVar11 = (ad) arrayList2.get(i48);
                int[] iArr5 = adVar11.p0;
                if (iArr5[0] == 3 && iArr5[c7] == 3) {
                    int i49 = adVar11.n0;
                    int size10 = arrayList9.size();
                    int i50 = 0;
                    while (true) {
                        if (i50 >= size10) {
                            ja0Var3 = null;
                            break;
                        }
                        ja0Var3 = (ja0) arrayList9.get(i50);
                        if (i49 == ja0Var3.b) {
                            break;
                        } else {
                            i50++;
                        }
                    }
                    int i51 = adVar11.o0;
                    int size11 = arrayList9.size();
                    int i52 = 0;
                    while (true) {
                        if (i52 >= size11) {
                            ja0Var4 = null;
                            break;
                        }
                        ja0Var4 = (ja0) arrayList9.get(i52);
                        if (i51 == ja0Var4.b) {
                            break;
                        } else {
                            i52++;
                        }
                    }
                    if (ja0Var3 != null && ja0Var4 != null) {
                        ja0Var3.c(0, ja0Var4);
                        ja0Var4.c = 2;
                        arrayList9.remove(ja0Var3);
                    }
                }
                i48++;
                c7 = 1;
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    int size12 = arrayList9.size();
                    int i53 = 0;
                    int i54 = 0;
                    ja0Var = null;
                    while (i54 < size12) {
                        Object obj7 = arrayList9.get(i54);
                        i54++;
                        ja0 ja0Var5 = (ja0) obj7;
                        if (ja0Var5.c != 1 && (b2 = ja0Var5.b(kqVar, 0)) > i53) {
                            ja0Var = ja0Var5;
                            i53 = b2;
                        }
                    }
                    c2 = 1;
                    if (ja0Var != null) {
                        M(1);
                        O(i53);
                        if (objArr[c2] == 2) {
                            int size13 = arrayList9.size();
                            int i55 = 0;
                            int i56 = 0;
                            ja0Var2 = null;
                            while (i56 < size13) {
                                Object obj8 = arrayList9.get(i56);
                                i56++;
                                ja0 ja0Var6 = (ja0) obj8;
                                if (ja0Var6.c != 0 && (b = ja0Var6.b(kqVar, 1)) > i55) {
                                    ja0Var2 = ja0Var6;
                                    i55 = b;
                                }
                            }
                            if (ja0Var2 != null) {
                                N(1);
                                L(i55);
                                if (ja0Var == null || ja0Var2 != null) {
                                    i4 = i12;
                                    if (i4 == 2) {
                                        i13 = i9;
                                        if (i13 >= q() || i13 <= 0) {
                                            i14 = q();
                                            i3 = i11;
                                            if (i3 != 2) {
                                                max6 = i10;
                                                if (max6 >= k() || max6 <= 0) {
                                                    max6 = k();
                                                } else {
                                                    L(max6);
                                                    this.F0 = true;
                                                }
                                            } else {
                                                max6 = i10;
                                            }
                                            i = i14;
                                            z = true;
                                            boolean z15 = !W(64) || W(128);
                                            kqVar.getClass();
                                            kqVar.h = false;
                                            if (this.D0 == 0 && z15) {
                                                c = 1;
                                                kqVar.h = true;
                                            } else {
                                                c = 1;
                                            }
                                            ArrayList arrayList10 = this.q0;
                                            boolean z16 = objArr[0] != 2 || objArr[c] == 2;
                                            this.z0 = 0;
                                            this.A0 = 0;
                                            i5 = i2;
                                            for (i6 = 0; i6 < i5; i6++) {
                                                ad adVar12 = (ad) this.q0.get(i6);
                                                if (adVar12 instanceof bd) {
                                                    ((bd) adVar12).U();
                                                }
                                            }
                                            boolean W = W(64);
                                            boolean z17 = z;
                                            int i57 = 0;
                                            z2 = true;
                                            while (z2) {
                                                int i58 = i57 + 1;
                                                try {
                                                    kqVar.t();
                                                    this.z0 = 0;
                                                    this.A0 = 0;
                                                    g(kqVar);
                                                    for (int i59 = 0; i59 < i5; i59++) {
                                                        ((ad) this.q0.get(i59)).g(kqVar);
                                                    }
                                                    S(kqVar);
                                                    try {
                                                        weakReference = this.G0;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        lcVar3 = lcVar;
                                                        z4 = z16;
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    lcVar3 = lcVar;
                                                    z4 = z16;
                                                }
                                                if (weakReference != null) {
                                                    try {
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        lcVar3 = lcVar;
                                                    }
                                                    if (weakReference.get() != null) {
                                                        lcVar3 = lcVar;
                                                        try {
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                        }
                                                        try {
                                                            z4 = z16;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            z4 = z16;
                                                            z2 = true;
                                                            e.printStackTrace();
                                                            z5 = z17;
                                                            System.out.println("EXCEPTION : " + e);
                                                            if (z2) {
                                                            }
                                                            if (z4) {
                                                            }
                                                            max = Math.max(this.b0, q());
                                                            if (max > q()) {
                                                            }
                                                            max2 = Math.max(this.c0, k());
                                                            if (max2 > k()) {
                                                            }
                                                            if (!z7) {
                                                            }
                                                            i7 = 8;
                                                            if (i58 <= i7) {
                                                            }
                                                            z17 = z7;
                                                            i57 = i58;
                                                            z16 = z4;
                                                            lcVar = lcVar3;
                                                        }
                                                        try {
                                                            kqVar.f(kqVar.k((lc) this.G0.get()), kqVar.k(lcVar3), 0, 5);
                                                            this.G0 = null;
                                                            weakReference2 = this.I0;
                                                            if (weakReference2 != null && weakReference2.get() != null) {
                                                                kqVar.f(kqVar.k(this.L), kqVar.k((lc) this.I0.get()), 0, 5);
                                                                this.I0 = null;
                                                            }
                                                            weakReference3 = this.H0;
                                                            if (weakReference3 != null && weakReference3.get() != null) {
                                                                lcVar4 = lcVar2;
                                                                try {
                                                                    lcVar2 = lcVar4;
                                                                    kqVar.f(kqVar.k((lc) this.H0.get()), kqVar.k(lcVar4), 0, 5);
                                                                    this.H0 = null;
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    lcVar2 = lcVar4;
                                                                    z2 = true;
                                                                    e.printStackTrace();
                                                                    z5 = z17;
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    if (z2) {
                                                                    }
                                                                    if (z4) {
                                                                    }
                                                                    max = Math.max(this.b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z7) {
                                                                    }
                                                                    i7 = 8;
                                                                    if (i58 <= i7) {
                                                                    }
                                                                    z17 = z7;
                                                                    i57 = i58;
                                                                    z16 = z4;
                                                                    lcVar = lcVar3;
                                                                }
                                                            }
                                                            weakReference4 = this.J0;
                                                            if (weakReference4 == null && weakReference4.get() != null) {
                                                                try {
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                }
                                                                try {
                                                                    kqVar.f(kqVar.k(this.K), kqVar.k((lc) this.J0.get()), 0, 5);
                                                                    try {
                                                                        this.J0 = null;
                                                                    } catch (Exception e8) {
                                                                        e = e8;
                                                                        z2 = true;
                                                                        e.printStackTrace();
                                                                        z5 = z17;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (z2) {
                                                                        }
                                                                        if (z4) {
                                                                        }
                                                                        max = Math.max(this.b0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.c0, k());
                                                                        if (max2 > k()) {
                                                                        }
                                                                        if (!z7) {
                                                                        }
                                                                        i7 = 8;
                                                                        if (i58 <= i7) {
                                                                        }
                                                                        z17 = z7;
                                                                        i57 = i58;
                                                                        z16 = z4;
                                                                        lcVar = lcVar3;
                                                                    }
                                                                } catch (Exception e9) {
                                                                    e = e9;
                                                                    z2 = true;
                                                                    e.printStackTrace();
                                                                    z5 = z17;
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    if (z2) {
                                                                    }
                                                                    if (z4) {
                                                                    }
                                                                    max = Math.max(this.b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z7) {
                                                                    }
                                                                    i7 = 8;
                                                                    if (i58 <= i7) {
                                                                    }
                                                                    z17 = z7;
                                                                    i57 = i58;
                                                                    z16 = z4;
                                                                    lcVar = lcVar3;
                                                                }
                                                            }
                                                            kqVar.p();
                                                            z5 = z17;
                                                            z2 = true;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            z2 = true;
                                                            e.printStackTrace();
                                                            z5 = z17;
                                                            System.out.println("EXCEPTION : " + e);
                                                            if (z2) {
                                                            }
                                                            if (z4) {
                                                            }
                                                            max = Math.max(this.b0, q());
                                                            if (max > q()) {
                                                            }
                                                            max2 = Math.max(this.c0, k());
                                                            if (max2 > k()) {
                                                            }
                                                            if (!z7) {
                                                            }
                                                            i7 = 8;
                                                            if (i58 <= i7) {
                                                            }
                                                            z17 = z7;
                                                            i57 = i58;
                                                            z16 = z4;
                                                            lcVar = lcVar3;
                                                        }
                                                        if (z2) {
                                                            zArr[2] = false;
                                                            boolean W2 = W(64);
                                                            Q(kqVar, W2);
                                                            int size14 = this.q0.size();
                                                            int i60 = 0;
                                                            z2 = false;
                                                            while (i60 < size14) {
                                                                ad adVar13 = (ad) this.q0.get(i60);
                                                                adVar13.Q(kqVar, W2);
                                                                boolean z18 = W2;
                                                                int i61 = size14;
                                                                if (adVar13.h != -1 || adVar13.i != -1) {
                                                                    z2 = true;
                                                                }
                                                                i60++;
                                                                W2 = z18;
                                                                size14 = i61;
                                                            }
                                                        } else {
                                                            Q(kqVar, W);
                                                            for (int i62 = 0; i62 < i5; i62++) {
                                                                ((ad) this.q0.get(i62)).Q(kqVar, W);
                                                            }
                                                            z2 = false;
                                                        }
                                                        if (z4 && i58 < 8 && zArr[2]) {
                                                            int i63 = 0;
                                                            int i64 = 0;
                                                            for (i8 = 0; i8 < i5; i8++) {
                                                                ad adVar14 = (ad) this.q0.get(i8);
                                                                i64 = Math.max(i64, adVar14.q() + adVar14.Y);
                                                                i63 = Math.max(i63, adVar14.k() + adVar14.Z);
                                                            }
                                                            max3 = Math.max(this.b0, i64);
                                                            max4 = Math.max(this.c0, i63);
                                                            if (i4 == 2 && q() < max3) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z2 = true;
                                                                z5 = true;
                                                            }
                                                            if (i3 == 2 && k() < max4) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z2 = true;
                                                                z5 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.b0, q());
                                                        if (max > q()) {
                                                            O(max);
                                                            r8 = 1;
                                                            objArr[0] = 1;
                                                            z2 = true;
                                                            z6 = true;
                                                        } else {
                                                            r8 = 1;
                                                            z6 = z5;
                                                        }
                                                        max2 = Math.max(this.c0, k());
                                                        if (max2 > k()) {
                                                            L(max2);
                                                            objArr[r8] = r8;
                                                            z7 = r8;
                                                            z2 = z7;
                                                        } else {
                                                            z7 = z6;
                                                        }
                                                        if (!z7) {
                                                            if (objArr[0] == 2 && i > 0 && q() > i) {
                                                                this.E0 = r8;
                                                                objArr[0] = r8;
                                                                O(i);
                                                                z7 = r8;
                                                                z2 = z7;
                                                            }
                                                            if (objArr[r8] == 2 && max6 > 0 && k() > max6) {
                                                                this.F0 = r8;
                                                                objArr[r8] = r8;
                                                                L(max6);
                                                                z7 = true;
                                                                i7 = 8;
                                                                z2 = true;
                                                                if (i58 <= i7) {
                                                                    z2 = false;
                                                                }
                                                                z17 = z7;
                                                                i57 = i58;
                                                                z16 = z4;
                                                                lcVar = lcVar3;
                                                            }
                                                        }
                                                        i7 = 8;
                                                        if (i58 <= i7) {
                                                        }
                                                        z17 = z7;
                                                        i57 = i58;
                                                        z16 = z4;
                                                        lcVar = lcVar3;
                                                    }
                                                }
                                                lcVar3 = lcVar;
                                                z4 = z16;
                                                weakReference2 = this.I0;
                                                if (weakReference2 != null) {
                                                    kqVar.f(kqVar.k(this.L), kqVar.k((lc) this.I0.get()), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference3 = this.H0;
                                                if (weakReference3 != null) {
                                                    lcVar4 = lcVar2;
                                                    lcVar2 = lcVar4;
                                                    kqVar.f(kqVar.k((lc) this.H0.get()), kqVar.k(lcVar4), 0, 5);
                                                    this.H0 = null;
                                                }
                                                weakReference4 = this.J0;
                                                if (weakReference4 == null) {
                                                }
                                                kqVar.p();
                                                z5 = z17;
                                                z2 = true;
                                                if (z2) {
                                                }
                                                if (z4) {
                                                    int i632 = 0;
                                                    int i642 = 0;
                                                    while (i8 < i5) {
                                                    }
                                                    max3 = Math.max(this.b0, i642);
                                                    max4 = Math.max(this.c0, i632);
                                                    if (i4 == 2) {
                                                        O(max3);
                                                        objArr[0] = 2;
                                                        z2 = true;
                                                        z5 = true;
                                                    }
                                                    if (i3 == 2) {
                                                        L(max4);
                                                        objArr[1] = 2;
                                                        z2 = true;
                                                        z5 = true;
                                                    }
                                                }
                                                max = Math.max(this.b0, q());
                                                if (max > q()) {
                                                }
                                                max2 = Math.max(this.c0, k());
                                                if (max2 > k()) {
                                                }
                                                if (!z7) {
                                                }
                                                i7 = 8;
                                                if (i58 <= i7) {
                                                }
                                                z17 = z7;
                                                i57 = i58;
                                                z16 = z4;
                                                lcVar = lcVar3;
                                            }
                                            z3 = z17;
                                            this.q0 = arrayList10;
                                            if (z3) {
                                                objArr[0] = i4;
                                                objArr[1] = i3;
                                            }
                                            F(kqVar.m);
                                        }
                                        O(i13);
                                        this.E0 = true;
                                    } else {
                                        i13 = i9;
                                    }
                                    i14 = i13;
                                    i3 = i11;
                                    if (i3 != 2) {
                                    }
                                    i = i14;
                                    z = true;
                                    if (W(64)) {
                                    }
                                    kqVar.getClass();
                                    kqVar.h = false;
                                    if (this.D0 == 0) {
                                    }
                                    c = 1;
                                    ArrayList arrayList102 = this.q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.z0 = 0;
                                    this.A0 = 0;
                                    i5 = i2;
                                    while (i6 < i5) {
                                    }
                                    boolean W3 = W(64);
                                    boolean z172 = z;
                                    int i572 = 0;
                                    z2 = true;
                                    while (z2) {
                                    }
                                    z3 = z172;
                                    this.q0 = arrayList102;
                                    if (z3) {
                                    }
                                    F(kqVar.m);
                                }
                            }
                        }
                        ja0Var2 = null;
                        if (ja0Var == null) {
                        }
                        i4 = i12;
                        if (i4 == 2) {
                        }
                        i14 = i13;
                        i3 = i11;
                        if (i3 != 2) {
                        }
                        i = i14;
                        z = true;
                        if (W(64)) {
                        }
                        kqVar.getClass();
                        kqVar.h = false;
                        if (this.D0 == 0) {
                        }
                        c = 1;
                        ArrayList arrayList1022 = this.q0;
                        if (objArr[0] != 2) {
                        }
                        this.z0 = 0;
                        this.A0 = 0;
                        i5 = i2;
                        while (i6 < i5) {
                        }
                        boolean W32 = W(64);
                        boolean z1722 = z;
                        int i5722 = 0;
                        z2 = true;
                        while (z2) {
                        }
                        z3 = z1722;
                        this.q0 = arrayList1022;
                        if (z3) {
                        }
                        F(kqVar.m);
                    }
                } else {
                    c2 = 1;
                }
                ja0Var = null;
                if (objArr[c2] == 2) {
                }
                ja0Var2 = null;
                if (ja0Var == null) {
                }
                i4 = i12;
                if (i4 == 2) {
                }
                i14 = i13;
                i3 = i11;
                if (i3 != 2) {
                }
                i = i14;
                z = true;
                if (W(64)) {
                }
                kqVar.getClass();
                kqVar.h = false;
                if (this.D0 == 0) {
                }
                c = 1;
                ArrayList arrayList10222 = this.q0;
                if (objArr[0] != 2) {
                }
                this.z0 = 0;
                this.A0 = 0;
                i5 = i2;
                while (i6 < i5) {
                }
                boolean W322 = W(64);
                boolean z17222 = z;
                int i57222 = 0;
                z2 = true;
                while (z2) {
                }
                z3 = z17222;
                this.q0 = arrayList10222;
                if (z3) {
                }
                F(kqVar.m);
            }
            max6 = i10;
            i3 = i11;
            i = i9;
            i4 = i12;
        }
        z = false;
        if (W(64)) {
        }
        kqVar.getClass();
        kqVar.h = false;
        if (this.D0 == 0) {
        }
        c = 1;
        ArrayList arrayList102222 = this.q0;
        if (objArr[0] != 2) {
        }
        this.z0 = 0;
        this.A0 = 0;
        i5 = i2;
        while (i6 < i5) {
        }
        boolean W3222 = W(64);
        boolean z172222 = z;
        int i572222 = 0;
        z2 = true;
        while (z2) {
        }
        z3 = z172222;
        this.q0 = arrayList102222;
        if (z3) {
        }
        F(kqVar.m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.ad
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ad) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
