package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class be extends ae {
    public int A0;
    public fa[] B0;
    public fa[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final i8 L0;
    public ArrayList q0 = new ArrayList();
    public final k6 r0 = new k6(this);
    public final eh s0;
    public int t0;
    public qd u0;
    public boolean v0;
    public final ys w0;
    public int x0;
    public int y0;
    public int z0;

    public be() {
        eh ehVar = new eh();
        ehVar.b = true;
        ehVar.c = true;
        ehVar.e = new ArrayList();
        new ArrayList();
        ehVar.f = null;
        ehVar.g = new i8();
        ehVar.h = new ArrayList();
        ehVar.a = this;
        ehVar.d = this;
        this.s0 = ehVar;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new ys();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new fa[4];
        this.C0 = new fa[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new i8();
    }

    public static void V(ae aeVar, qd qdVar, i8 i8Var) {
        int i;
        int i2;
        if (qdVar == null) {
            return;
        }
        int i3 = aeVar.g0;
        int[] iArr = aeVar.t;
        if (i3 == 8 || (aeVar instanceof yo) || (aeVar instanceof s7)) {
            i8Var.e = 0;
            i8Var.f = 0;
            return;
        }
        int[] iArr2 = aeVar.p0;
        i8Var.a = iArr2[0];
        i8Var.b = iArr2[1];
        i8Var.c = aeVar.q();
        i8Var.d = aeVar.k();
        i8Var.i = false;
        i8Var.j = 0;
        boolean z = i8Var.a == 3;
        boolean z2 = i8Var.b == 3;
        boolean z3 = z && aeVar.W > 0.0f;
        boolean z4 = z2 && aeVar.W > 0.0f;
        if (z && aeVar.t(0) && aeVar.r == 0 && !z3) {
            i8Var.a = 2;
            if (z2 && aeVar.s == 0) {
                i8Var.a = 1;
            }
            z = false;
        }
        if (z2 && aeVar.t(1) && aeVar.s == 0 && !z4) {
            i8Var.b = 2;
            if (z && aeVar.r == 0) {
                i8Var.b = 1;
            }
            z2 = false;
        }
        if (aeVar.A()) {
            i8Var.a = 1;
            z = false;
        }
        if (aeVar.B()) {
            i8Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                i8Var.a = 1;
            } else if (!z2) {
                if (i8Var.b == 1) {
                    i2 = i8Var.d;
                } else {
                    i8Var.a = 2;
                    qdVar.b(aeVar, i8Var);
                    i2 = i8Var.f;
                }
                i8Var.a = 1;
                i8Var.c = (int) (aeVar.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                i8Var.b = 1;
            } else if (!z) {
                if (i8Var.a == 1) {
                    i = i8Var.c;
                } else {
                    i8Var.b = 2;
                    qdVar.b(aeVar, i8Var);
                    i = i8Var.e;
                }
                i8Var.b = 1;
                int i4 = aeVar.X;
                float f = aeVar.W;
                if (i4 == -1) {
                    i8Var.d = (int) (i / f);
                } else {
                    i8Var.d = (int) (f * i);
                }
            }
        }
        qdVar.b(aeVar, i8Var);
        aeVar.O(i8Var.e);
        aeVar.L(i8Var.f);
        aeVar.E = i8Var.h;
        aeVar.I(i8Var.g);
        i8Var.j = 0;
    }

    @Override // defpackage.ae
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.ae
    public final void F(k6 k6Var) {
        super.F(k6Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ae) this.q0.get(i)).F(k6Var);
        }
    }

    @Override // defpackage.ae
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ae) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(ae aeVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            fa[] faVarArr = this.C0;
            if (i2 >= faVarArr.length) {
                this.C0 = (fa[]) Arrays.copyOf(faVarArr, faVarArr.length * 2);
            }
            fa[] faVarArr2 = this.C0;
            int i3 = this.z0;
            faVarArr2[i3] = new fa(aeVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            fa[] faVarArr3 = this.B0;
            if (i4 >= faVarArr3.length) {
                this.B0 = (fa[]) Arrays.copyOf(faVarArr3, faVarArr3.length * 2);
            }
            fa[] faVarArr4 = this.B0;
            int i5 = this.A0;
            faVarArr4[i5] = new fa(aeVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(ys ysVar) {
        be beVar;
        ys ysVar2;
        boolean W = W(64);
        b(ysVar, W);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ae aeVar = (ae) this.q0.get(i);
            boolean[] zArr = aeVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (aeVar instanceof s7) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ae aeVar2 = (ae) this.q0.get(i2);
                if (aeVar2 instanceof s7) {
                    s7 s7Var = (s7) aeVar2;
                    for (int i3 = 0; i3 < s7Var.r0; i3++) {
                        ae aeVar3 = s7Var.q0[i3];
                        if (s7Var.t0 || aeVar3.c()) {
                            int i4 = s7Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                aeVar3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                aeVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ae aeVar4 = (ae) this.q0.get(i5);
            aeVar4.getClass();
            boolean z2 = aeVar4 instanceof ol;
            if (z2 || (aeVar4 instanceof yo)) {
                if (z2) {
                    hashSet.add(aeVar4);
                } else {
                    aeVar4.b(ysVar, W);
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
                ol olVar = (ol) ((ae) it.next());
                for (int i6 = 0; i6 < olVar.r0; i6++) {
                    if (hashSet.contains(olVar.q0[i6])) {
                        olVar.b(ysVar, W);
                        hashSet.remove(olVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ae) it2.next()).b(ysVar, W);
                }
                hashSet.clear();
            }
        }
        if (ys.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ae aeVar5 = (ae) this.q0.get(i7);
                aeVar5.getClass();
                if (!(aeVar5 instanceof ol) && !(aeVar5 instanceof yo)) {
                    hashSet2.add(aeVar5);
                }
            }
            beVar = this;
            ysVar2 = ysVar;
            beVar.a(this, ysVar2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ae aeVar6 = (ae) it3.next();
                kr.g(beVar, ysVar2, aeVar6);
                aeVar6.b(ysVar2, W);
            }
        } else {
            beVar = this;
            ysVar2 = ysVar;
            for (int i8 = 0; i8 < size; i8++) {
                ae aeVar7 = (ae) beVar.q0.get(i8);
                if (aeVar7 instanceof be) {
                    int[] iArr = aeVar7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        aeVar7.M(1);
                    }
                    if (i10 == 2) {
                        aeVar7.N(1);
                    }
                    aeVar7.b(ysVar2, W);
                    if (i9 == 2) {
                        aeVar7.M(i9);
                    }
                    if (i10 == 2) {
                        aeVar7.N(i10);
                    }
                } else {
                    kr.g(beVar, ysVar2, aeVar7);
                    if (!(aeVar7 instanceof ol) && !(aeVar7 instanceof yo)) {
                        aeVar7.b(ysVar2, W);
                    }
                }
            }
        }
        if (beVar.z0 > 0) {
            mz.e(beVar, ysVar2, null, 0);
        }
        if (beVar.A0 > 0) {
            mz.e(beVar, ysVar2, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        eh ehVar = this.s0;
        ArrayList arrayList = ehVar.e;
        be beVar = ehVar.a;
        boolean z3 = false;
        int j = beVar.j(0);
        int j2 = beVar.j(1);
        int r = beVar.r();
        int s = beVar.s();
        if (z && (j == 2 || j2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                rd0 rd0Var = (rd0) obj;
                if (rd0Var.f == i && !rd0Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j == 2) {
                    beVar.M(1);
                    beVar.O(ehVar.d(beVar, 0));
                    beVar.d.e.d(beVar.q());
                }
            } else if (z && j2 == 2) {
                beVar.N(1);
                beVar.L(ehVar.d(beVar, 1));
                beVar.e.e.d(beVar.k());
            }
        }
        int[] iArr = beVar.p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int q = beVar.q() + r;
                beVar.d.i.d(q);
                beVar.d.e.d(q - r);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int k = beVar.k() + s;
                beVar.e.i.d(k);
                beVar.e.e.d(k - s);
                z2 = true;
            }
            z2 = false;
        }
        ehVar.g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            rd0 rd0Var2 = (rd0) obj2;
            if (rd0Var2.f == i && (rd0Var2.b != beVar || rd0Var2.g)) {
                rd0Var2.e();
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
            rd0 rd0Var3 = (rd0) obj3;
            if (rd0Var3.f == i && (z2 || rd0Var3.b != beVar)) {
                if (!rd0Var3.h.j) {
                    break;
                }
                if (!rd0Var3.i.j) {
                    break;
                }
                if (!(rd0Var3 instanceof ga) && !rd0Var3.e.j) {
                    break;
                }
            }
        }
        beVar.M(j);
        beVar.N(j2);
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
        ld ldVar;
        ld ldVar2;
        boolean z;
        char c;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        ld ldVar3;
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
        ld ldVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        qd0 qd0Var;
        qd0 qd0Var2;
        int i13;
        int i14;
        int b;
        int b2;
        qd0 qd0Var3;
        qd0 qd0Var4;
        int i15;
        boolean z8;
        boolean[] zArr2 = kr.j;
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
        ld ldVar5 = this.J;
        ld ldVar6 = this.I;
        if (i18 == 0 && kr.s(this.D0, 1)) {
            qd qdVar = this.u0;
            int i19 = iArr[0];
            int i20 = iArr[1];
            E();
            ArrayList arrayList = this.q0;
            int size2 = arrayList.size();
            for (int i21 = 0; i21 < size2; i21++) {
                ((ae) arrayList.get(i21)).E();
            }
            boolean z9 = this.v0;
            zArr = zArr2;
            if (i19 == 1) {
                J(0, q());
            } else {
                ldVar6.l(0);
                this.Y = 0;
            }
            int i22 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i22 < size2) {
                int i23 = i22;
                ae aeVar = (ae) arrayList.get(i22);
                int[] iArr2 = iArr;
                if (aeVar instanceof yo) {
                    yo yoVar = (yo) aeVar;
                    z8 = z10;
                    if (yoVar.u0 == 1) {
                        int i24 = yoVar.r0;
                        if (i24 != -1) {
                            yoVar.R(i24);
                        } else if (yoVar.s0 != -1 && A()) {
                            yoVar.R(q() - yoVar.s0);
                        } else if (A()) {
                            yoVar.R((int) ((yoVar.q0 * q()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else {
                    z8 = z10;
                    if ((aeVar instanceof s7) && ((s7) aeVar).U() == 0) {
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
                    ae aeVar2 = (ae) arrayList.get(i25);
                    if (aeVar2 instanceof yo) {
                        yo yoVar2 = (yo) aeVar2;
                        i15 = i25;
                        if (yoVar2.u0 == 1) {
                            mz.u(0, qdVar, yoVar2, z9);
                        }
                    } else {
                        i15 = i25;
                    }
                }
            }
            mz.u(0, qdVar, this, z9);
            if (z11) {
                for (int i26 = 0; i26 < size2; i26++) {
                    ae aeVar3 = (ae) arrayList.get(i26);
                    if (aeVar3 instanceof s7) {
                        s7 s7Var = (s7) aeVar3;
                        if (s7Var.U() == 0 && s7Var.T()) {
                            mz.u(1, qdVar, s7Var, z9);
                        }
                    }
                }
            }
            if (i20 == 1) {
                K(0, k());
            } else {
                ldVar5.l(0);
                this.Z = 0;
            }
            int i27 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i27 < size2) {
                ae aeVar4 = (ae) arrayList.get(i27);
                int i28 = i27;
                if (aeVar4 instanceof yo) {
                    yo yoVar3 = (yo) aeVar4;
                    if (yoVar3.u0 == 0) {
                        int i29 = yoVar3.r0;
                        if (i29 != -1) {
                            yoVar3.R(i29);
                        } else if (yoVar3.s0 != -1 && B()) {
                            yoVar3.R(k() - yoVar3.s0);
                        } else if (B()) {
                            yoVar3.R((int) ((yoVar3.q0 * k()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else if ((aeVar4 instanceof s7) && ((s7) aeVar4).U() == 1) {
                    z13 = true;
                }
                i27 = i28 + 1;
            }
            if (z12) {
                for (int i30 = 0; i30 < size2; i30++) {
                    ae aeVar5 = (ae) arrayList.get(i30);
                    if (aeVar5 instanceof yo) {
                        yo yoVar4 = (yo) aeVar5;
                        if (yoVar4.u0 == 0) {
                            mz.R(1, qdVar, yoVar4);
                        }
                    }
                }
            }
            mz.R(0, qdVar, this);
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    ae aeVar6 = (ae) arrayList.get(i31);
                    if (aeVar6 instanceof s7) {
                        s7 s7Var2 = (s7) aeVar6;
                        if (s7Var2.U() == 1 && s7Var2.T()) {
                            mz.R(1, qdVar, s7Var2);
                        }
                    }
                }
            }
            for (int i32 = 0; i32 < size2; i32++) {
                ae aeVar7 = (ae) arrayList.get(i32);
                if (aeVar7.z() && mz.g(aeVar7)) {
                    V(aeVar7, qdVar, mz.c);
                    if (!(aeVar7 instanceof yo)) {
                        mz.u(0, qdVar, aeVar7, z9);
                        mz.R(0, qdVar, aeVar7);
                    } else if (((yo) aeVar7).u0 == 0) {
                        mz.R(0, qdVar, aeVar7);
                    } else {
                        mz.u(0, qdVar, aeVar7, z9);
                    }
                }
            }
            for (int i33 = 0; i33 < size; i33++) {
                ae aeVar8 = (ae) this.q0.get(i33);
                if (aeVar8.z() && !(aeVar8 instanceof yo) && !(aeVar8 instanceof s7) && !(aeVar8 instanceof ol) && !aeVar8.F) {
                    int j = aeVar8.j(0);
                    int j2 = aeVar8.j(1);
                    if (j != 3 || aeVar8.r == 1 || j2 != 3 || aeVar8.s == 1) {
                        V(aeVar8, this.u0, new i8());
                    }
                }
            }
        } else {
            zArr = zArr2;
            objArr = iArr;
        }
        ys ysVar = this.w0;
        if (size <= 2 || !((i17 == 2 || i16 == 2) && kr.s(this.D0, 1024))) {
            i = max5;
            i2 = size;
            i3 = i16;
            i4 = i17;
            ldVar = ldVar5;
            ldVar2 = ldVar6;
        } else {
            qd qdVar2 = this.u0;
            ArrayList arrayList2 = this.q0;
            int size3 = arrayList2.size();
            int i34 = 0;
            while (i34 < size3) {
                ae aeVar9 = (ae) arrayList2.get(i34);
                char c3 = objArr[0];
                char c4 = objArr[1];
                int i35 = i34;
                int[] iArr3 = aeVar9.p0;
                ldVar2 = ldVar6;
                if (!b9.W(c3, c4, iArr3[0], iArr3[1]) || (aeVar9 instanceof ol)) {
                    i9 = max5;
                    i2 = size;
                    i10 = max6;
                    i11 = i16;
                    i12 = i17;
                    ldVar = ldVar5;
                    break;
                }
                i34 = i35 + 1;
                ldVar6 = ldVar2;
            }
            ldVar2 = ldVar6;
            i2 = size;
            ldVar = ldVar5;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = i36;
                ae aeVar10 = (ae) arrayList2.get(i36);
                int i38 = max6;
                char c5 = objArr[0];
                int i39 = i16;
                char c6 = objArr[1];
                int i40 = max5;
                int[] iArr4 = aeVar10.p0;
                int i41 = i17;
                if (!b9.W(c5, c6, iArr4[0], iArr4[1])) {
                    V(aeVar10, qdVar2, this.L0);
                }
                boolean z14 = aeVar10 instanceof yo;
                if (z14) {
                    yo yoVar5 = (yo) aeVar10;
                    if (yoVar5.u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(yoVar5);
                    }
                    if (yoVar5.u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(yoVar5);
                    }
                }
                if (aeVar10 instanceof mp) {
                    if (aeVar10 instanceof s7) {
                        s7 s7Var3 = (s7) aeVar10;
                        if (s7Var3.U() == 0) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(s7Var3);
                        }
                        if (s7Var3.U() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(s7Var3);
                        }
                    } else {
                        mp mpVar = (mp) aeVar10;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(mpVar);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(mpVar);
                    }
                }
                if (aeVar10.I.f == null && aeVar10.K.f == null && !z14 && !(aeVar10 instanceof s7)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(aeVar10);
                }
                if (aeVar10.J.f == null && aeVar10.L.f == null && aeVar10.M.f == null && !z14 && !(aeVar10 instanceof s7)) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(aeVar10);
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
                    b9.n((yo) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i43 = 0;
                while (i43 < size5) {
                    Object obj2 = arrayList5.get(i43);
                    i43++;
                    mp mpVar2 = (mp) obj2;
                    qd0 n = b9.n(mpVar2, 0, arrayList9, null);
                    mpVar2.R(0, n, arrayList9);
                    n.a(arrayList9);
                }
            }
            HashSet hashSet = i(2).a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    b9.n(((ld) it.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    b9.n(((ld) it2.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    b9.n(((ld) it3.next()).d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i44 = 0;
                while (i44 < size6) {
                    Object obj3 = arrayList6.get(i44);
                    i44++;
                    b9.n((ae) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i45 = 0;
                while (i45 < size7) {
                    Object obj4 = arrayList7.get(i45);
                    i45++;
                    b9.n((yo) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i46 = 0;
                while (i46 < size8) {
                    Object obj5 = arrayList8.get(i46);
                    i46++;
                    mp mpVar3 = (mp) obj5;
                    qd0 n2 = b9.n(mpVar3, 1, arrayList9, null);
                    mpVar3.R(1, n2, arrayList9);
                    n2.a(arrayList9);
                }
            }
            HashSet hashSet4 = i(3).a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    b9.n(((ld) it4.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    b9.n(((ld) it5.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    b9.n(((ld) it6.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    b9.n(((ld) it7.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList4 != null) {
                int size9 = arrayList4.size();
                int i47 = 0;
                while (i47 < size9) {
                    Object obj6 = arrayList4.get(i47);
                    i47++;
                    b9.n((ae) obj6, 1, arrayList9, null);
                }
            }
            char c7 = 1;
            int i48 = 0;
            while (i48 < size3) {
                ae aeVar11 = (ae) arrayList2.get(i48);
                int[] iArr5 = aeVar11.p0;
                if (iArr5[0] == 3 && iArr5[c7] == 3) {
                    int i49 = aeVar11.n0;
                    int size10 = arrayList9.size();
                    int i50 = 0;
                    while (true) {
                        if (i50 >= size10) {
                            qd0Var3 = null;
                            break;
                        }
                        qd0Var3 = (qd0) arrayList9.get(i50);
                        if (i49 == qd0Var3.b) {
                            break;
                        } else {
                            i50++;
                        }
                    }
                    int i51 = aeVar11.o0;
                    int size11 = arrayList9.size();
                    int i52 = 0;
                    while (true) {
                        if (i52 >= size11) {
                            qd0Var4 = null;
                            break;
                        }
                        qd0Var4 = (qd0) arrayList9.get(i52);
                        if (i51 == qd0Var4.b) {
                            break;
                        } else {
                            i52++;
                        }
                    }
                    if (qd0Var3 != null && qd0Var4 != null) {
                        qd0Var3.c(0, qd0Var4);
                        qd0Var4.c = 2;
                        arrayList9.remove(qd0Var3);
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
                    qd0Var = null;
                    while (i54 < size12) {
                        Object obj7 = arrayList9.get(i54);
                        i54++;
                        qd0 qd0Var5 = (qd0) obj7;
                        if (qd0Var5.c != 1 && (b2 = qd0Var5.b(ysVar, 0)) > i53) {
                            qd0Var = qd0Var5;
                            i53 = b2;
                        }
                    }
                    c2 = 1;
                    if (qd0Var != null) {
                        M(1);
                        O(i53);
                        if (objArr[c2] == 2) {
                            int size13 = arrayList9.size();
                            int i55 = 0;
                            int i56 = 0;
                            qd0Var2 = null;
                            while (i56 < size13) {
                                Object obj8 = arrayList9.get(i56);
                                i56++;
                                qd0 qd0Var6 = (qd0) obj8;
                                if (qd0Var6.c != 0 && (b = qd0Var6.b(ysVar, 1)) > i55) {
                                    qd0Var2 = qd0Var6;
                                    i55 = b;
                                }
                            }
                            if (qd0Var2 != null) {
                                N(1);
                                L(i55);
                                if (qd0Var == null || qd0Var2 != null) {
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
                                            ysVar.getClass();
                                            ysVar.h = false;
                                            if (this.D0 == 0 && z15) {
                                                c = 1;
                                                ysVar.h = true;
                                            } else {
                                                c = 1;
                                            }
                                            ArrayList arrayList10 = this.q0;
                                            boolean z16 = objArr[0] != 2 || objArr[c] == 2;
                                            this.z0 = 0;
                                            this.A0 = 0;
                                            i5 = i2;
                                            for (i6 = 0; i6 < i5; i6++) {
                                                ae aeVar12 = (ae) this.q0.get(i6);
                                                if (aeVar12 instanceof be) {
                                                    ((be) aeVar12).U();
                                                }
                                            }
                                            boolean W = W(64);
                                            boolean z17 = z;
                                            int i57 = 0;
                                            z2 = true;
                                            while (z2) {
                                                int i58 = i57 + 1;
                                                try {
                                                    ysVar.t();
                                                    this.z0 = 0;
                                                    this.A0 = 0;
                                                    g(ysVar);
                                                    for (int i59 = 0; i59 < i5; i59++) {
                                                        ((ae) this.q0.get(i59)).g(ysVar);
                                                    }
                                                    S(ysVar);
                                                    try {
                                                        weakReference = this.G0;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        ldVar3 = ldVar;
                                                        z4 = z16;
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    ldVar3 = ldVar;
                                                    z4 = z16;
                                                }
                                                if (weakReference != null) {
                                                    try {
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        ldVar3 = ldVar;
                                                    }
                                                    if (weakReference.get() != null) {
                                                        ldVar3 = ldVar;
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
                                                            ldVar = ldVar3;
                                                        }
                                                        try {
                                                            ysVar.f(ysVar.k((ld) this.G0.get()), ysVar.k(ldVar3), 0, 5);
                                                            this.G0 = null;
                                                            weakReference2 = this.I0;
                                                            if (weakReference2 != null && weakReference2.get() != null) {
                                                                ysVar.f(ysVar.k(this.L), ysVar.k((ld) this.I0.get()), 0, 5);
                                                                this.I0 = null;
                                                            }
                                                            weakReference3 = this.H0;
                                                            if (weakReference3 != null && weakReference3.get() != null) {
                                                                ldVar4 = ldVar2;
                                                                try {
                                                                    ldVar2 = ldVar4;
                                                                    ysVar.f(ysVar.k((ld) this.H0.get()), ysVar.k(ldVar4), 0, 5);
                                                                    this.H0 = null;
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    ldVar2 = ldVar4;
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
                                                                    ldVar = ldVar3;
                                                                }
                                                            }
                                                            weakReference4 = this.J0;
                                                            if (weakReference4 == null && weakReference4.get() != null) {
                                                                try {
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                }
                                                                try {
                                                                    ysVar.f(ysVar.k(this.K), ysVar.k((ld) this.J0.get()), 0, 5);
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
                                                                        ldVar = ldVar3;
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
                                                                    ldVar = ldVar3;
                                                                }
                                                            }
                                                            ysVar.p();
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
                                                            ldVar = ldVar3;
                                                        }
                                                        if (z2) {
                                                            zArr[2] = false;
                                                            boolean W2 = W(64);
                                                            Q(ysVar, W2);
                                                            int size14 = this.q0.size();
                                                            int i60 = 0;
                                                            z2 = false;
                                                            while (i60 < size14) {
                                                                ae aeVar13 = (ae) this.q0.get(i60);
                                                                aeVar13.Q(ysVar, W2);
                                                                boolean z18 = W2;
                                                                int i61 = size14;
                                                                if (aeVar13.h != -1 || aeVar13.i != -1) {
                                                                    z2 = true;
                                                                }
                                                                i60++;
                                                                W2 = z18;
                                                                size14 = i61;
                                                            }
                                                        } else {
                                                            Q(ysVar, W);
                                                            for (int i62 = 0; i62 < i5; i62++) {
                                                                ((ae) this.q0.get(i62)).Q(ysVar, W);
                                                            }
                                                            z2 = false;
                                                        }
                                                        if (z4 && i58 < 8 && zArr[2]) {
                                                            int i63 = 0;
                                                            int i64 = 0;
                                                            for (i8 = 0; i8 < i5; i8++) {
                                                                ae aeVar14 = (ae) this.q0.get(i8);
                                                                i64 = Math.max(i64, aeVar14.q() + aeVar14.Y);
                                                                i63 = Math.max(i63, aeVar14.k() + aeVar14.Z);
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
                                                                ldVar = ldVar3;
                                                            }
                                                        }
                                                        i7 = 8;
                                                        if (i58 <= i7) {
                                                        }
                                                        z17 = z7;
                                                        i57 = i58;
                                                        z16 = z4;
                                                        ldVar = ldVar3;
                                                    }
                                                }
                                                ldVar3 = ldVar;
                                                z4 = z16;
                                                weakReference2 = this.I0;
                                                if (weakReference2 != null) {
                                                    ysVar.f(ysVar.k(this.L), ysVar.k((ld) this.I0.get()), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference3 = this.H0;
                                                if (weakReference3 != null) {
                                                    ldVar4 = ldVar2;
                                                    ldVar2 = ldVar4;
                                                    ysVar.f(ysVar.k((ld) this.H0.get()), ysVar.k(ldVar4), 0, 5);
                                                    this.H0 = null;
                                                }
                                                weakReference4 = this.J0;
                                                if (weakReference4 == null) {
                                                }
                                                ysVar.p();
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
                                                ldVar = ldVar3;
                                            }
                                            z3 = z17;
                                            this.q0 = arrayList10;
                                            if (z3) {
                                                objArr[0] = i4;
                                                objArr[1] = i3;
                                            }
                                            F(ysVar.m);
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
                                    ysVar.getClass();
                                    ysVar.h = false;
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
                                    F(ysVar.m);
                                }
                            }
                        }
                        qd0Var2 = null;
                        if (qd0Var == null) {
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
                        ysVar.getClass();
                        ysVar.h = false;
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
                        F(ysVar.m);
                    }
                } else {
                    c2 = 1;
                }
                qd0Var = null;
                if (objArr[c2] == 2) {
                }
                qd0Var2 = null;
                if (qd0Var == null) {
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
                ysVar.getClass();
                ysVar.h = false;
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
                F(ysVar.m);
            }
            max6 = i10;
            i3 = i11;
            i = i9;
            i4 = i12;
        }
        z = false;
        if (W(64)) {
        }
        ysVar.getClass();
        ysVar.h = false;
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
        F(ysVar.m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.ae
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
            ((ae) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
