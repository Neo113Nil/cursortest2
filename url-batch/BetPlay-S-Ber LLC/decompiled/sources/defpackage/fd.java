package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class fd extends ed {
    public int A0;
    public o9[] B0;
    public o9[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final b8 L0;
    public ArrayList q0 = new ArrayList();
    public final r6 r0 = new r6(this);
    public final ff s0;
    public int t0;
    public uc u0;
    public boolean v0;
    public final xq w0;
    public int x0;
    public int y0;
    public int z0;

    public fd() {
        ff ffVar = new ff();
        ffVar.b = true;
        ffVar.c = true;
        ffVar.e = new ArrayList();
        new ArrayList();
        ffVar.f = null;
        ffVar.g = new b8();
        ffVar.h = new ArrayList();
        ffVar.a = this;
        ffVar.d = this;
        this.s0 = ffVar;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new xq();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new o9[4];
        this.C0 = new o9[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new b8();
    }

    public static void V(ed edVar, uc ucVar, b8 b8Var) {
        int i;
        int i2;
        if (ucVar == null) {
            return;
        }
        int i3 = edVar.g0;
        int[] iArr = edVar.t;
        if (i3 == 8 || (edVar instanceof bn) || (edVar instanceof u7)) {
            b8Var.e = 0;
            b8Var.f = 0;
            return;
        }
        int[] iArr2 = edVar.p0;
        b8Var.a = iArr2[0];
        b8Var.b = iArr2[1];
        b8Var.c = edVar.q();
        b8Var.d = edVar.k();
        b8Var.i = false;
        b8Var.j = 0;
        boolean z = b8Var.a == 3;
        boolean z2 = b8Var.b == 3;
        boolean z3 = z && edVar.W > 0.0f;
        boolean z4 = z2 && edVar.W > 0.0f;
        if (z && edVar.t(0) && edVar.r == 0 && !z3) {
            b8Var.a = 2;
            if (z2 && edVar.s == 0) {
                b8Var.a = 1;
            }
            z = false;
        }
        if (z2 && edVar.t(1) && edVar.s == 0 && !z4) {
            b8Var.b = 2;
            if (z && edVar.r == 0) {
                b8Var.b = 1;
            }
            z2 = false;
        }
        if (edVar.A()) {
            b8Var.a = 1;
            z = false;
        }
        if (edVar.B()) {
            b8Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                b8Var.a = 1;
            } else if (!z2) {
                if (b8Var.b == 1) {
                    i2 = b8Var.d;
                } else {
                    b8Var.a = 2;
                    ucVar.b(edVar, b8Var);
                    i2 = b8Var.f;
                }
                b8Var.a = 1;
                b8Var.c = (int) (edVar.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                b8Var.b = 1;
            } else if (!z) {
                if (b8Var.a == 1) {
                    i = b8Var.c;
                } else {
                    b8Var.b = 2;
                    ucVar.b(edVar, b8Var);
                    i = b8Var.e;
                }
                b8Var.b = 1;
                int i4 = edVar.X;
                float f = edVar.W;
                if (i4 == -1) {
                    b8Var.d = (int) (i / f);
                } else {
                    b8Var.d = (int) (f * i);
                }
            }
        }
        ucVar.b(edVar, b8Var);
        edVar.O(b8Var.e);
        edVar.L(b8Var.f);
        edVar.E = b8Var.h;
        edVar.I(b8Var.g);
        b8Var.j = 0;
    }

    @Override // defpackage.ed
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.ed
    public final void F(r6 r6Var) {
        super.F(r6Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ed) this.q0.get(i)).F(r6Var);
        }
    }

    @Override // defpackage.ed
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((ed) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(ed edVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            o9[] o9VarArr = this.C0;
            if (i2 >= o9VarArr.length) {
                this.C0 = (o9[]) Arrays.copyOf(o9VarArr, o9VarArr.length * 2);
            }
            o9[] o9VarArr2 = this.C0;
            int i3 = this.z0;
            o9VarArr2[i3] = new o9(edVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            o9[] o9VarArr3 = this.B0;
            if (i4 >= o9VarArr3.length) {
                this.B0 = (o9[]) Arrays.copyOf(o9VarArr3, o9VarArr3.length * 2);
            }
            o9[] o9VarArr4 = this.B0;
            int i5 = this.A0;
            o9VarArr4[i5] = new o9(edVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(xq xqVar) {
        fd fdVar;
        xq xqVar2;
        boolean W = W(64);
        b(xqVar, W);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ed edVar = (ed) this.q0.get(i);
            boolean[] zArr = edVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (edVar instanceof u7) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ed edVar2 = (ed) this.q0.get(i2);
                if (edVar2 instanceof u7) {
                    u7 u7Var = (u7) edVar2;
                    for (int i3 = 0; i3 < u7Var.r0; i3++) {
                        ed edVar3 = u7Var.q0[i3];
                        if (u7Var.t0 || edVar3.c()) {
                            int i4 = u7Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                edVar3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                edVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ed edVar4 = (ed) this.q0.get(i5);
            edVar4.getClass();
            boolean z2 = edVar4 instanceof fj;
            if (z2 || (edVar4 instanceof bn)) {
                if (z2) {
                    hashSet.add(edVar4);
                } else {
                    edVar4.b(xqVar, W);
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
                fj fjVar = (fj) ((ed) it.next());
                for (int i6 = 0; i6 < fjVar.r0; i6++) {
                    if (hashSet.contains(fjVar.q0[i6])) {
                        fjVar.b(xqVar, W);
                        hashSet.remove(fjVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ed) it2.next()).b(xqVar, W);
                }
                hashSet.clear();
            }
        }
        if (xq.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ed edVar5 = (ed) this.q0.get(i7);
                edVar5.getClass();
                if (!(edVar5 instanceof fj) && !(edVar5 instanceof bn)) {
                    hashSet2.add(edVar5);
                }
            }
            fdVar = this;
            xqVar2 = xqVar;
            fdVar.a(this, xqVar2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ed edVar6 = (ed) it3.next();
                l70.f(fdVar, xqVar2, edVar6);
                edVar6.b(xqVar2, W);
            }
        } else {
            fdVar = this;
            xqVar2 = xqVar;
            for (int i8 = 0; i8 < size; i8++) {
                ed edVar7 = (ed) fdVar.q0.get(i8);
                if (edVar7 instanceof fd) {
                    int[] iArr = edVar7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        edVar7.M(1);
                    }
                    if (i10 == 2) {
                        edVar7.N(1);
                    }
                    edVar7.b(xqVar2, W);
                    if (i9 == 2) {
                        edVar7.M(i9);
                    }
                    if (i10 == 2) {
                        edVar7.N(i10);
                    }
                } else {
                    l70.f(fdVar, xqVar2, edVar7);
                    if (!(edVar7 instanceof fj) && !(edVar7 instanceof bn)) {
                        edVar7.b(xqVar2, W);
                    }
                }
            }
        }
        if (fdVar.z0 > 0) {
            op.c(fdVar, xqVar2, null, 0);
        }
        if (fdVar.A0 > 0) {
            op.c(fdVar, xqVar2, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        ff ffVar = this.s0;
        ArrayList arrayList = ffVar.e;
        fd fdVar = ffVar.a;
        boolean z3 = false;
        int j = fdVar.j(0);
        int j2 = fdVar.j(1);
        int r = fdVar.r();
        int s = fdVar.s();
        if (z && (j == 2 || j2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                ra0 ra0Var = (ra0) obj;
                if (ra0Var.f == i && !ra0Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j == 2) {
                    fdVar.M(1);
                    fdVar.O(ffVar.d(fdVar, 0));
                    fdVar.d.e.d(fdVar.q());
                }
            } else if (z && j2 == 2) {
                fdVar.N(1);
                fdVar.L(ffVar.d(fdVar, 1));
                fdVar.e.e.d(fdVar.k());
            }
        }
        int[] iArr = fdVar.p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int q = fdVar.q() + r;
                fdVar.d.i.d(q);
                fdVar.d.e.d(q - r);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int k = fdVar.k() + s;
                fdVar.e.i.d(k);
                fdVar.e.e.d(k - s);
                z2 = true;
            }
            z2 = false;
        }
        ffVar.g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            ra0 ra0Var2 = (ra0) obj2;
            if (ra0Var2.f == i && (ra0Var2.b != fdVar || ra0Var2.g)) {
                ra0Var2.e();
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
            ra0 ra0Var3 = (ra0) obj3;
            if (ra0Var3.f == i && (z2 || ra0Var3.b != fdVar)) {
                if (!ra0Var3.h.j) {
                    break;
                }
                if (!ra0Var3.i.j) {
                    break;
                }
                if (!(ra0Var3 instanceof p9) && !ra0Var3.e.j) {
                    break;
                }
            }
        }
        fdVar.M(j);
        fdVar.N(j2);
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
        pc pcVar;
        pc pcVar2;
        boolean z;
        char c;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        pc pcVar3;
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
        pc pcVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        qa0 qa0Var;
        qa0 qa0Var2;
        int i13;
        int i14;
        int b;
        int b2;
        qa0 qa0Var3;
        qa0 qa0Var4;
        int i15;
        boolean z8;
        boolean[] zArr2 = l70.f;
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
        pc pcVar5 = this.J;
        pc pcVar6 = this.I;
        if (i18 == 0 && l70.o(this.D0, 1)) {
            uc ucVar = this.u0;
            int i19 = iArr[0];
            int i20 = iArr[1];
            E();
            ArrayList arrayList = this.q0;
            int size2 = arrayList.size();
            for (int i21 = 0; i21 < size2; i21++) {
                ((ed) arrayList.get(i21)).E();
            }
            boolean z9 = this.v0;
            zArr = zArr2;
            if (i19 == 1) {
                J(0, q());
            } else {
                pcVar6.l(0);
                this.Y = 0;
            }
            int i22 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i22 < size2) {
                int i23 = i22;
                ed edVar = (ed) arrayList.get(i22);
                int[] iArr2 = iArr;
                if (edVar instanceof bn) {
                    bn bnVar = (bn) edVar;
                    z8 = z10;
                    if (bnVar.u0 == 1) {
                        int i24 = bnVar.r0;
                        if (i24 != -1) {
                            bnVar.R(i24);
                        } else if (bnVar.s0 != -1 && A()) {
                            bnVar.R(q() - bnVar.s0);
                        } else if (A()) {
                            bnVar.R((int) ((bnVar.q0 * q()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else {
                    z8 = z10;
                    if ((edVar instanceof u7) && ((u7) edVar).U() == 0) {
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
                    ed edVar2 = (ed) arrayList.get(i25);
                    if (edVar2 instanceof bn) {
                        bn bnVar2 = (bn) edVar2;
                        i15 = i25;
                        if (bnVar2.u0 == 1) {
                            vw.L(0, ucVar, bnVar2, z9);
                        }
                    } else {
                        i15 = i25;
                    }
                }
            }
            vw.L(0, ucVar, this, z9);
            if (z11) {
                for (int i26 = 0; i26 < size2; i26++) {
                    ed edVar3 = (ed) arrayList.get(i26);
                    if (edVar3 instanceof u7) {
                        u7 u7Var = (u7) edVar3;
                        if (u7Var.U() == 0 && u7Var.T()) {
                            vw.L(1, ucVar, u7Var, z9);
                        }
                    }
                }
            }
            if (i20 == 1) {
                K(0, k());
            } else {
                pcVar5.l(0);
                this.Z = 0;
            }
            int i27 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i27 < size2) {
                ed edVar4 = (ed) arrayList.get(i27);
                int i28 = i27;
                if (edVar4 instanceof bn) {
                    bn bnVar3 = (bn) edVar4;
                    if (bnVar3.u0 == 0) {
                        int i29 = bnVar3.r0;
                        if (i29 != -1) {
                            bnVar3.R(i29);
                        } else if (bnVar3.s0 != -1 && B()) {
                            bnVar3.R(k() - bnVar3.s0);
                        } else if (B()) {
                            bnVar3.R((int) ((bnVar3.q0 * k()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else if ((edVar4 instanceof u7) && ((u7) edVar4).U() == 1) {
                    z13 = true;
                }
                i27 = i28 + 1;
            }
            if (z12) {
                for (int i30 = 0; i30 < size2; i30++) {
                    ed edVar5 = (ed) arrayList.get(i30);
                    if (edVar5 instanceof bn) {
                        bn bnVar4 = (bn) edVar5;
                        if (bnVar4.u0 == 0) {
                            vw.r0(1, ucVar, bnVar4);
                        }
                    }
                }
            }
            vw.r0(0, ucVar, this);
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    ed edVar6 = (ed) arrayList.get(i31);
                    if (edVar6 instanceof u7) {
                        u7 u7Var2 = (u7) edVar6;
                        if (u7Var2.U() == 1 && u7Var2.T()) {
                            vw.r0(1, ucVar, u7Var2);
                        }
                    }
                }
            }
            for (int i32 = 0; i32 < size2; i32++) {
                ed edVar7 = (ed) arrayList.get(i32);
                if (edVar7.z() && vw.k(edVar7)) {
                    V(edVar7, ucVar, vw.b);
                    if (!(edVar7 instanceof bn)) {
                        vw.L(0, ucVar, edVar7, z9);
                        vw.r0(0, ucVar, edVar7);
                    } else if (((bn) edVar7).u0 == 0) {
                        vw.r0(0, ucVar, edVar7);
                    } else {
                        vw.L(0, ucVar, edVar7, z9);
                    }
                }
            }
            for (int i33 = 0; i33 < size; i33++) {
                ed edVar8 = (ed) this.q0.get(i33);
                if (edVar8.z() && !(edVar8 instanceof bn) && !(edVar8 instanceof u7) && !(edVar8 instanceof fj) && !edVar8.F) {
                    int j = edVar8.j(0);
                    int j2 = edVar8.j(1);
                    if (j != 3 || edVar8.r == 1 || j2 != 3 || edVar8.s == 1) {
                        V(edVar8, this.u0, new b8());
                    }
                }
            }
        } else {
            zArr = zArr2;
            objArr = iArr;
        }
        xq xqVar = this.w0;
        if (size <= 2 || !((i17 == 2 || i16 == 2) && l70.o(this.D0, 1024))) {
            i = max5;
            i2 = size;
            i3 = i16;
            i4 = i17;
            pcVar = pcVar5;
            pcVar2 = pcVar6;
        } else {
            uc ucVar2 = this.u0;
            ArrayList arrayList2 = this.q0;
            int size3 = arrayList2.size();
            int i34 = 0;
            while (i34 < size3) {
                ed edVar9 = (ed) arrayList2.get(i34);
                char c3 = objArr[0];
                char c4 = objArr[1];
                int i35 = i34;
                int[] iArr3 = edVar9.p0;
                pcVar2 = pcVar6;
                if (!op.X(c3, c4, iArr3[0], iArr3[1]) || (edVar9 instanceof fj)) {
                    i9 = max5;
                    i2 = size;
                    i10 = max6;
                    i11 = i16;
                    i12 = i17;
                    pcVar = pcVar5;
                    break;
                }
                i34 = i35 + 1;
                pcVar6 = pcVar2;
            }
            pcVar2 = pcVar6;
            i2 = size;
            pcVar = pcVar5;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = i36;
                ed edVar10 = (ed) arrayList2.get(i36);
                int i38 = max6;
                char c5 = objArr[0];
                int i39 = i16;
                char c6 = objArr[1];
                int i40 = max5;
                int[] iArr4 = edVar10.p0;
                int i41 = i17;
                if (!op.X(c5, c6, iArr4[0], iArr4[1])) {
                    V(edVar10, ucVar2, this.L0);
                }
                boolean z14 = edVar10 instanceof bn;
                if (z14) {
                    bn bnVar5 = (bn) edVar10;
                    if (bnVar5.u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(bnVar5);
                    }
                    if (bnVar5.u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(bnVar5);
                    }
                }
                if (edVar10 instanceof pn) {
                    if (edVar10 instanceof u7) {
                        u7 u7Var3 = (u7) edVar10;
                        if (u7Var3.U() == 0) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(u7Var3);
                        }
                        if (u7Var3.U() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(u7Var3);
                        }
                    } else {
                        pn pnVar = (pn) edVar10;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(pnVar);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(pnVar);
                    }
                }
                if (edVar10.I.f == null && edVar10.K.f == null && !z14 && !(edVar10 instanceof u7)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(edVar10);
                }
                if (edVar10.J.f == null && edVar10.L.f == null && edVar10.M.f == null && !z14 && !(edVar10 instanceof u7)) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(edVar10);
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
                    op.t((bn) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i43 = 0;
                while (i43 < size5) {
                    Object obj2 = arrayList5.get(i43);
                    i43++;
                    pn pnVar2 = (pn) obj2;
                    qa0 t = op.t(pnVar2, 0, arrayList9, null);
                    pnVar2.R(0, t, arrayList9);
                    t.a(arrayList9);
                }
            }
            HashSet hashSet = i(2).a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    op.t(((pc) it.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    op.t(((pc) it2.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    op.t(((pc) it3.next()).d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i44 = 0;
                while (i44 < size6) {
                    Object obj3 = arrayList6.get(i44);
                    i44++;
                    op.t((ed) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i45 = 0;
                while (i45 < size7) {
                    Object obj4 = arrayList7.get(i45);
                    i45++;
                    op.t((bn) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i46 = 0;
                while (i46 < size8) {
                    Object obj5 = arrayList8.get(i46);
                    i46++;
                    pn pnVar3 = (pn) obj5;
                    qa0 t2 = op.t(pnVar3, 1, arrayList9, null);
                    pnVar3.R(1, t2, arrayList9);
                    t2.a(arrayList9);
                }
            }
            HashSet hashSet4 = i(3).a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    op.t(((pc) it4.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    op.t(((pc) it5.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    op.t(((pc) it6.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    op.t(((pc) it7.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList4 != null) {
                int size9 = arrayList4.size();
                int i47 = 0;
                while (i47 < size9) {
                    Object obj6 = arrayList4.get(i47);
                    i47++;
                    op.t((ed) obj6, 1, arrayList9, null);
                }
            }
            char c7 = 1;
            int i48 = 0;
            while (i48 < size3) {
                ed edVar11 = (ed) arrayList2.get(i48);
                int[] iArr5 = edVar11.p0;
                if (iArr5[0] == 3 && iArr5[c7] == 3) {
                    int i49 = edVar11.n0;
                    int size10 = arrayList9.size();
                    int i50 = 0;
                    while (true) {
                        if (i50 >= size10) {
                            qa0Var3 = null;
                            break;
                        }
                        qa0Var3 = (qa0) arrayList9.get(i50);
                        if (i49 == qa0Var3.b) {
                            break;
                        } else {
                            i50++;
                        }
                    }
                    int i51 = edVar11.o0;
                    int size11 = arrayList9.size();
                    int i52 = 0;
                    while (true) {
                        if (i52 >= size11) {
                            qa0Var4 = null;
                            break;
                        }
                        qa0Var4 = (qa0) arrayList9.get(i52);
                        if (i51 == qa0Var4.b) {
                            break;
                        } else {
                            i52++;
                        }
                    }
                    if (qa0Var3 != null && qa0Var4 != null) {
                        qa0Var3.c(0, qa0Var4);
                        qa0Var4.c = 2;
                        arrayList9.remove(qa0Var3);
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
                    qa0Var = null;
                    while (i54 < size12) {
                        Object obj7 = arrayList9.get(i54);
                        i54++;
                        qa0 qa0Var5 = (qa0) obj7;
                        if (qa0Var5.c != 1 && (b2 = qa0Var5.b(xqVar, 0)) > i53) {
                            qa0Var = qa0Var5;
                            i53 = b2;
                        }
                    }
                    c2 = 1;
                    if (qa0Var != null) {
                        M(1);
                        O(i53);
                        if (objArr[c2] == 2) {
                            int size13 = arrayList9.size();
                            int i55 = 0;
                            int i56 = 0;
                            qa0Var2 = null;
                            while (i56 < size13) {
                                Object obj8 = arrayList9.get(i56);
                                i56++;
                                qa0 qa0Var6 = (qa0) obj8;
                                if (qa0Var6.c != 0 && (b = qa0Var6.b(xqVar, 1)) > i55) {
                                    qa0Var2 = qa0Var6;
                                    i55 = b;
                                }
                            }
                            if (qa0Var2 != null) {
                                N(1);
                                L(i55);
                                if (qa0Var == null || qa0Var2 != null) {
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
                                            xqVar.getClass();
                                            xqVar.h = false;
                                            if (this.D0 == 0 && z15) {
                                                c = 1;
                                                xqVar.h = true;
                                            } else {
                                                c = 1;
                                            }
                                            ArrayList arrayList10 = this.q0;
                                            boolean z16 = objArr[0] != 2 || objArr[c] == 2;
                                            this.z0 = 0;
                                            this.A0 = 0;
                                            i5 = i2;
                                            for (i6 = 0; i6 < i5; i6++) {
                                                ed edVar12 = (ed) this.q0.get(i6);
                                                if (edVar12 instanceof fd) {
                                                    ((fd) edVar12).U();
                                                }
                                            }
                                            boolean W = W(64);
                                            boolean z17 = z;
                                            int i57 = 0;
                                            z2 = true;
                                            while (z2) {
                                                int i58 = i57 + 1;
                                                try {
                                                    xqVar.t();
                                                    this.z0 = 0;
                                                    this.A0 = 0;
                                                    g(xqVar);
                                                    for (int i59 = 0; i59 < i5; i59++) {
                                                        ((ed) this.q0.get(i59)).g(xqVar);
                                                    }
                                                    S(xqVar);
                                                    try {
                                                        weakReference = this.G0;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        pcVar3 = pcVar;
                                                        z4 = z16;
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    pcVar3 = pcVar;
                                                    z4 = z16;
                                                }
                                                if (weakReference != null) {
                                                    try {
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        pcVar3 = pcVar;
                                                    }
                                                    if (weakReference.get() != null) {
                                                        pcVar3 = pcVar;
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
                                                            pcVar = pcVar3;
                                                        }
                                                        try {
                                                            xqVar.f(xqVar.k((pc) this.G0.get()), xqVar.k(pcVar3), 0, 5);
                                                            this.G0 = null;
                                                            weakReference2 = this.I0;
                                                            if (weakReference2 != null && weakReference2.get() != null) {
                                                                xqVar.f(xqVar.k(this.L), xqVar.k((pc) this.I0.get()), 0, 5);
                                                                this.I0 = null;
                                                            }
                                                            weakReference3 = this.H0;
                                                            if (weakReference3 != null && weakReference3.get() != null) {
                                                                pcVar4 = pcVar2;
                                                                try {
                                                                    pcVar2 = pcVar4;
                                                                    xqVar.f(xqVar.k((pc) this.H0.get()), xqVar.k(pcVar4), 0, 5);
                                                                    this.H0 = null;
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    pcVar2 = pcVar4;
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
                                                                    pcVar = pcVar3;
                                                                }
                                                            }
                                                            weakReference4 = this.J0;
                                                            if (weakReference4 == null && weakReference4.get() != null) {
                                                                try {
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                }
                                                                try {
                                                                    xqVar.f(xqVar.k(this.K), xqVar.k((pc) this.J0.get()), 0, 5);
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
                                                                        pcVar = pcVar3;
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
                                                                    pcVar = pcVar3;
                                                                }
                                                            }
                                                            xqVar.p();
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
                                                            pcVar = pcVar3;
                                                        }
                                                        if (z2) {
                                                            zArr[2] = false;
                                                            boolean W2 = W(64);
                                                            Q(xqVar, W2);
                                                            int size14 = this.q0.size();
                                                            int i60 = 0;
                                                            z2 = false;
                                                            while (i60 < size14) {
                                                                ed edVar13 = (ed) this.q0.get(i60);
                                                                edVar13.Q(xqVar, W2);
                                                                boolean z18 = W2;
                                                                int i61 = size14;
                                                                if (edVar13.h != -1 || edVar13.i != -1) {
                                                                    z2 = true;
                                                                }
                                                                i60++;
                                                                W2 = z18;
                                                                size14 = i61;
                                                            }
                                                        } else {
                                                            Q(xqVar, W);
                                                            for (int i62 = 0; i62 < i5; i62++) {
                                                                ((ed) this.q0.get(i62)).Q(xqVar, W);
                                                            }
                                                            z2 = false;
                                                        }
                                                        if (z4 && i58 < 8 && zArr[2]) {
                                                            int i63 = 0;
                                                            int i64 = 0;
                                                            for (i8 = 0; i8 < i5; i8++) {
                                                                ed edVar14 = (ed) this.q0.get(i8);
                                                                i64 = Math.max(i64, edVar14.q() + edVar14.Y);
                                                                i63 = Math.max(i63, edVar14.k() + edVar14.Z);
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
                                                                pcVar = pcVar3;
                                                            }
                                                        }
                                                        i7 = 8;
                                                        if (i58 <= i7) {
                                                        }
                                                        z17 = z7;
                                                        i57 = i58;
                                                        z16 = z4;
                                                        pcVar = pcVar3;
                                                    }
                                                }
                                                pcVar3 = pcVar;
                                                z4 = z16;
                                                weakReference2 = this.I0;
                                                if (weakReference2 != null) {
                                                    xqVar.f(xqVar.k(this.L), xqVar.k((pc) this.I0.get()), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference3 = this.H0;
                                                if (weakReference3 != null) {
                                                    pcVar4 = pcVar2;
                                                    pcVar2 = pcVar4;
                                                    xqVar.f(xqVar.k((pc) this.H0.get()), xqVar.k(pcVar4), 0, 5);
                                                    this.H0 = null;
                                                }
                                                weakReference4 = this.J0;
                                                if (weakReference4 == null) {
                                                }
                                                xqVar.p();
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
                                                pcVar = pcVar3;
                                            }
                                            z3 = z17;
                                            this.q0 = arrayList10;
                                            if (z3) {
                                                objArr[0] = i4;
                                                objArr[1] = i3;
                                            }
                                            F(xqVar.m);
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
                                    xqVar.getClass();
                                    xqVar.h = false;
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
                                    F(xqVar.m);
                                }
                            }
                        }
                        qa0Var2 = null;
                        if (qa0Var == null) {
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
                        xqVar.getClass();
                        xqVar.h = false;
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
                        F(xqVar.m);
                    }
                } else {
                    c2 = 1;
                }
                qa0Var = null;
                if (objArr[c2] == 2) {
                }
                qa0Var2 = null;
                if (qa0Var == null) {
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
                xqVar.getClass();
                xqVar.h = false;
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
                F(xqVar.m);
            }
            max6 = i10;
            i3 = i11;
            i = i9;
            i4 = i12;
        }
        z = false;
        if (W(64)) {
        }
        xqVar.getClass();
        xqVar.h = false;
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
        F(xqVar.m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.ed
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
            ((ed) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
