package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class se extends sl {
    public int as;
    public int at;
    public int b;
    public final bvw aI = new bvw(this);
    public final sp a = new sp(this);
    public te aH = null;
    public boolean c = false;
    public final rv d = new rv();
    public int au = 0;
    public int av = 0;
    public sb[] aw = new sb[4];
    public sb[] ax = new sb[4];
    public int ay = 257;
    public boolean az = false;
    public boolean aA = false;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    public WeakReference aE = null;
    final HashSet aF = new HashSet();
    public final sm aG = new sm();

    public static void aa(sd sdVar, te teVar, sm smVar) {
        int i;
        int i2;
        if (teVar == null) {
            return;
        }
        if (sdVar.ai == 8 || (sdVar instanceof sh) || (sdVar instanceof sa)) {
            smVar.c = 0;
            smVar.d = 0;
            return;
        }
        smVar.i = sdVar.O();
        smVar.j = sdVar.P();
        smVar.a = sdVar.j();
        smVar.b = sdVar.h();
        smVar.g = false;
        smVar.h = 0;
        boolean z = smVar.i == 3;
        boolean z2 = smVar.j == 3;
        boolean z3 = z && sdVar.Y > 0.0f;
        boolean z4 = z2 && sdVar.Y > 0.0f;
        if (z && sdVar.H(0) && sdVar.t == 0 && !z3) {
            smVar.i = 2;
            if (z2 && sdVar.u == 0) {
                smVar.i = 1;
            }
            z = false;
        }
        if (z2 && sdVar.H(1) && sdVar.u == 0 && !z4) {
            smVar.j = 2;
            if (z && sdVar.t == 0) {
                smVar.j = 1;
            }
            z2 = false;
        }
        if (sdVar.e()) {
            smVar.i = 1;
            z = false;
        }
        if (sdVar.f()) {
            smVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (sdVar.v[0] == 4) {
                smVar.i = 1;
            } else if (!z2) {
                if (smVar.j == 1) {
                    i2 = smVar.b;
                } else {
                    smVar.i = 2;
                    teVar.a(sdVar, smVar);
                    i2 = smVar.d;
                }
                smVar.i = 1;
                smVar.a = (int) (sdVar.Y * i2);
            }
        }
        if (z4) {
            if (sdVar.v[1] == 4) {
                smVar.j = 1;
            } else if (!z) {
                if (smVar.i == 1) {
                    i = smVar.a;
                } else {
                    smVar.j = 2;
                    teVar.a(sdVar, smVar);
                    i = smVar.c;
                }
                smVar.j = 1;
                float f = i;
                if (sdVar.Z == -1) {
                    smVar.b = (int) (f / sdVar.Y);
                } else {
                    smVar.b = (int) (sdVar.Y * f);
                }
            }
        }
        teVar.a(sdVar, smVar);
        sdVar.E(smVar.c);
        sdVar.z(smVar.d);
        sdVar.G = smVar.f;
        sdVar.w(smVar.e);
        smVar.h = 0;
        boolean z5 = smVar.g;
    }

    private final void ac(sc scVar, ry ryVar) {
        rv rvVar = this.d;
        rvVar.g(ryVar, rvVar.b(scVar), 0, 5);
    }

    private final void ad(sc scVar, ry ryVar) {
        rv rvVar = this.d;
        rvVar.g(rvVar.b(scVar), ryVar, 0, 5);
    }

    private final void ae() {
        this.au = 0;
        this.av = 0;
    }

    @Override // defpackage.sd
    public final void F(boolean z, boolean z2) {
        super.F(z, z2);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((sd) this.aJ.get(i)).F(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0618 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x093f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x094c A[LOOP:14: B:250:0x094a->B:251:0x094c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x05a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x05c8  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.sl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        rv rvVar;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        int i8;
        boolean z4;
        int size;
        int i9;
        boolean z5;
        int max;
        ?? r5;
        boolean z6;
        int max2;
        boolean z7;
        int i10;
        int max3;
        int max4;
        int i11;
        HashSet hashSet;
        ArrayList arrayList;
        int i12;
        int i13;
        sa saVar;
        boolean z8;
        char c;
        sd sdVar;
        sx sxVar;
        sx sxVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z9;
        boolean z10;
        this.aa = 0;
        this.ab = 0;
        this.az = false;
        this.aA = false;
        int size2 = this.aJ.size();
        int max5 = Math.max(0, j());
        int max6 = Math.max(0, h());
        int[] iArr = this.ar;
        int i18 = iArr[1];
        int i19 = iArr[0];
        int i20 = -1;
        if (this.b == 0 && sj.b(this.ay, 1)) {
            te teVar = this.aH;
            int O = O();
            int P = P();
            ss.b = 0;
            ss.c = 0;
            v();
            ArrayList arrayList2 = this.aJ;
            int size3 = arrayList2.size();
            for (int i21 = 0; i21 < size3; i21++) {
                ((sd) arrayList2.get(i21)).v();
            }
            boolean z11 = this.c;
            if (O == 1) {
                x(0, j());
            } else {
                this.K.f(0);
                this.aa = 0;
            }
            int i22 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i22 < size3) {
                sd sdVar2 = (sd) arrayList2.get(i22);
                if (sdVar2 instanceof sh) {
                    sh shVar = (sh) sdVar2;
                    if (shVar.as == 1) {
                        int i23 = shVar.b;
                        if (i23 != i20) {
                            shVar.a(i23);
                        } else if (shVar.c != i20 && e()) {
                            shVar.a(j() - shVar.c);
                        } else if (e()) {
                            shVar.a((int) ((shVar.a * j()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else if ((sdVar2 instanceof sa) && ((sa) sdVar2).a() == 0) {
                    z13 = true;
                }
                i22++;
                i20 = -1;
            }
            if (z12) {
                for (int i24 = 0; i24 < size3; i24++) {
                    sd sdVar3 = (sd) arrayList2.get(i24);
                    if (sdVar3 instanceof sh) {
                        sh shVar2 = (sh) sdVar3;
                        if (shVar2.as == 1) {
                            ss.a(0, shVar2, teVar, z11);
                        }
                    }
                }
            }
            int i25 = 0;
            ss.a(0, this, teVar, z11);
            if (z13) {
                for (int i26 = 0; i26 < size3; i26++) {
                    sd sdVar4 = (sd) arrayList2.get(i26);
                    if (sdVar4 instanceof sa) {
                        sa saVar2 = (sa) sdVar4;
                        if (saVar2.a() == 0) {
                            ss.d(saVar2, teVar, 0, z11);
                        }
                    }
                }
            }
            if (P == 1) {
                y(0, h());
                z9 = false;
                z10 = false;
            } else {
                this.L.f(0);
                this.ab = 0;
                z9 = false;
                z10 = false;
                i25 = 0;
            }
            while (i25 < size3) {
                sd sdVar5 = (sd) arrayList2.get(i25);
                if (sdVar5 instanceof sh) {
                    sh shVar3 = (sh) sdVar5;
                    if (shVar3.as == 0) {
                        int i27 = shVar3.b;
                        if (i27 != -1) {
                            shVar3.a(i27);
                        } else if (shVar3.c != -1 && f()) {
                            shVar3.a(h() - shVar3.c);
                        } else if (f()) {
                            shVar3.a((int) ((shVar3.a * h()) + 0.5f));
                        }
                        z9 = true;
                    }
                } else if ((sdVar5 instanceof sa) && ((sa) sdVar5).a() == 1) {
                    z10 = true;
                }
                i25++;
            }
            if (z9) {
                for (int i28 = 0; i28 < size3; i28++) {
                    sd sdVar6 = (sd) arrayList2.get(i28);
                    if (sdVar6 instanceof sh) {
                        sh shVar4 = (sh) sdVar6;
                        if (shVar4.as == 0) {
                            ss.b(1, shVar4, teVar);
                        }
                    }
                }
            }
            ss.b(0, this, teVar);
            if (z10) {
                for (int i29 = 0; i29 < size3; i29++) {
                    sd sdVar7 = (sd) arrayList2.get(i29);
                    if (sdVar7 instanceof sa) {
                        sa saVar3 = (sa) sdVar7;
                        if (saVar3.a() == 1) {
                            ss.d(saVar3, teVar, 1, z11);
                        }
                    }
                }
            }
            for (int i30 = 0; i30 < size3; i30++) {
                sd sdVar8 = (sd) arrayList2.get(i30);
                if (sdVar8.L() && ss.c(sdVar8)) {
                    aa(sdVar8, teVar, ss.a);
                    if (!(sdVar8 instanceof sh)) {
                        ss.a(0, sdVar8, teVar, z11);
                        ss.b(0, sdVar8, teVar);
                    } else if (((sh) sdVar8).as == 0) {
                        ss.b(0, sdVar8, teVar);
                    } else {
                        ss.a(0, sdVar8, teVar, z11);
                    }
                }
            }
            for (int i31 = 0; i31 < size2; i31++) {
                sd sdVar9 = (sd) this.aJ.get(i31);
                if (sdVar9.L() && !(sdVar9 instanceof sh) && !(sdVar9 instanceof sa) && !(sdVar9 instanceof sk) && !sdVar9.H) {
                    int N = sdVar9.N(0);
                    int N2 = sdVar9.N(1);
                    if (N != 3 || sdVar9.t == 1 || N2 != 3 || sdVar9.u == 1) {
                        aa(sdVar9, this.aH, new sm());
                    }
                }
            }
        }
        if (size2 > 2) {
            if (i19 != 2) {
                if (i18 == 2) {
                    i18 = 2;
                }
                i2 = max5;
                i3 = i19;
                i4 = i18;
                i = size2;
                z = false;
                i5 = max6;
                int i32 = 64;
                boolean z14 = !Z(64) || Z(128);
                rvVar = this.d;
                rvVar.f = false;
                rvVar.g = false;
                if (this.ay != 0 && z14) {
                    rvVar.g = true;
                }
                ArrayList arrayList3 = this.aJ;
                boolean z15 = O() != 2 || P() == 2;
                ae();
                i6 = i;
                for (i7 = 0; i7 < i6; i7++) {
                    sd sdVar10 = (sd) this.aJ.get(i7);
                    if (sdVar10 instanceof sl) {
                        ((sl) sdVar10).W();
                    }
                }
                z2 = z;
                z3 = true;
                int i33 = 0;
                while (z3) {
                    int i34 = i33 + 1;
                    try {
                        rvVar.k();
                        ae();
                        r(rvVar);
                        for (int i35 = 0; i35 < i6; i35++) {
                            ((sd) this.aJ.get(i35)).r(rvVar);
                        }
                        boolean Z = Z(i32);
                        b(rvVar, Z);
                        int size4 = this.aJ.size();
                        int i36 = 0;
                        boolean z16 = false;
                        while (i36 < size4) {
                            try {
                                sdVar = (sd) this.aJ.get(i36);
                                i11 = i34;
                            } catch (Exception e) {
                                e = e;
                                i11 = i34;
                            }
                            try {
                                sdVar.A(0, false);
                                sdVar.A(1, false);
                                z16 |= sdVar instanceof sa;
                                i36++;
                                i34 = i11;
                            } catch (Exception e2) {
                                e = e2;
                                z4 = z15;
                                i8 = i11;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : ".concat(e.toString()));
                                boolean[] zArr = sj.a;
                                zArr[2] = false;
                                boolean Z2 = Z(64);
                                U(Z2);
                                size = this.aJ.size();
                                i9 = 0;
                                z5 = false;
                                while (i9 < size) {
                                }
                                rv rvVar2 = rvVar;
                                if (z4) {
                                }
                                max = Math.max(this.ad, j());
                                if (max > j()) {
                                }
                                max2 = Math.max(this.ae, h());
                                if (max2 > h()) {
                                }
                                if (!z2) {
                                }
                                z3 = z7 & (i8 <= 8);
                                i33 = i8;
                                rvVar = rvVar2;
                                z15 = z4;
                                i32 = 64;
                            }
                        }
                        i11 = i34;
                        if (z16) {
                            int i37 = 0;
                            while (i37 < size4) {
                                sd sdVar11 = (sd) this.aJ.get(i37);
                                if (sdVar11 instanceof sa) {
                                    sa saVar4 = (sa) sdVar11;
                                    int i38 = 0;
                                    while (i38 < saVar4.aK) {
                                        sd sdVar12 = saVar4.aJ[i38];
                                        int i39 = i37;
                                        if (saVar4.b || sdVar12.d()) {
                                            int i40 = saVar4.a;
                                            saVar = saVar4;
                                            if (i40 == 0) {
                                                z8 = true;
                                            } else if (i40 == 1) {
                                                z8 = true;
                                            } else {
                                                if (i40 != 2) {
                                                    c = 3;
                                                    if (i40 != 3) {
                                                        continue;
                                                    }
                                                } else {
                                                    c = 3;
                                                }
                                                try {
                                                    sdVar12.A(1, true);
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    z4 = z15;
                                                    i8 = i11;
                                                    e.printStackTrace();
                                                    System.out.println("EXCEPTION : ".concat(e.toString()));
                                                    boolean[] zArr2 = sj.a;
                                                    zArr2[2] = false;
                                                    boolean Z22 = Z(64);
                                                    U(Z22);
                                                    size = this.aJ.size();
                                                    i9 = 0;
                                                    z5 = false;
                                                    while (i9 < size) {
                                                    }
                                                    rv rvVar22 = rvVar;
                                                    if (z4) {
                                                        int i41 = 0;
                                                        int i42 = 0;
                                                        while (i10 < i6) {
                                                        }
                                                        max3 = Math.max(this.ad, i41);
                                                        max4 = Math.max(this.ae, i42);
                                                        if (i3 == 2) {
                                                            E(max3);
                                                            this.ar[0] = 2;
                                                            z2 = true;
                                                            z5 = true;
                                                        }
                                                        if (i4 == 2) {
                                                            z(max4);
                                                            this.ar[1] = 2;
                                                            z2 = true;
                                                            z5 = true;
                                                        }
                                                    }
                                                    max = Math.max(this.ad, j());
                                                    if (max > j()) {
                                                    }
                                                    max2 = Math.max(this.ae, h());
                                                    if (max2 > h()) {
                                                    }
                                                    if (!z2) {
                                                    }
                                                    z3 = z7 & (i8 <= 8);
                                                    i33 = i8;
                                                    rvVar = rvVar22;
                                                    z15 = z4;
                                                    i32 = 64;
                                                }
                                            }
                                            sdVar12.A(0, z8);
                                        } else {
                                            saVar = saVar4;
                                        }
                                        i38++;
                                        i37 = i39;
                                        saVar4 = saVar;
                                    }
                                }
                                i37++;
                            }
                        }
                        HashSet hashSet2 = this.aF;
                        hashSet2.clear();
                        int i43 = 0;
                        while (i43 < size4) {
                            int i44 = size4;
                            boolean z17 = z15;
                            int i45 = i11;
                            sd sdVar13 = (sd) this.aJ.get(i43);
                            if (sdVar13.G()) {
                                if (sdVar13 instanceof sk) {
                                    hashSet2.add(sdVar13);
                                } else {
                                    sdVar13.b(rvVar, Z);
                                }
                            }
                            i43++;
                            i11 = i45;
                            size4 = i44;
                            z15 = z17;
                        }
                        while (hashSet2.size() > 0) {
                            int size5 = hashSet2.size();
                            Iterator it = hashSet2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z4 = z15;
                                    break;
                                }
                                sk skVar = (sk) ((sd) it.next());
                                Iterator it2 = it;
                                z4 = z15;
                                for (int i46 = 0; i46 < skVar.aK; i46++) {
                                    try {
                                        if (hashSet2.contains(skVar.aJ[i46])) {
                                            skVar.b(rvVar, Z);
                                            hashSet2.remove(skVar);
                                            break;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        i8 = i11;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : ".concat(e.toString()));
                                        boolean[] zArr22 = sj.a;
                                        zArr22[2] = false;
                                        boolean Z222 = Z(64);
                                        U(Z222);
                                        size = this.aJ.size();
                                        i9 = 0;
                                        z5 = false;
                                        while (i9 < size) {
                                        }
                                        rv rvVar222 = rvVar;
                                        if (z4) {
                                        }
                                        max = Math.max(this.ad, j());
                                        if (max > j()) {
                                        }
                                        max2 = Math.max(this.ae, h());
                                        if (max2 > h()) {
                                        }
                                        if (!z2) {
                                        }
                                        z3 = z7 & (i8 <= 8);
                                        i33 = i8;
                                        rvVar = rvVar222;
                                        z15 = z4;
                                        i32 = 64;
                                    }
                                }
                                it = it2;
                                z15 = z4;
                            }
                            if (size5 == hashSet2.size()) {
                                Iterator it3 = hashSet2.iterator();
                                while (it3.hasNext()) {
                                    ((sd) it3.next()).b(rvVar, Z);
                                }
                                hashSet2.clear();
                            }
                            z15 = z4;
                        }
                        z4 = z15;
                        if (rv.a) {
                            try {
                                hashSet = new HashSet();
                                for (int i47 = 0; i47 < size4; i47++) {
                                    sd sdVar14 = (sd) this.aJ.get(i47);
                                    if (!sdVar14.G()) {
                                        hashSet.add(sdVar14);
                                    }
                                }
                                i8 = i11;
                            } catch (Exception e5) {
                                e = e5;
                                i8 = i11;
                            }
                            try {
                                p(this, rvVar, hashSet, O() == 2 ? 0 : 1, false);
                                Iterator it4 = hashSet.iterator();
                                while (it4.hasNext()) {
                                    sd sdVar15 = (sd) it4.next();
                                    sj.a(this, rvVar, sdVar15);
                                    sdVar15.b(rvVar, Z);
                                }
                            } catch (Exception e6) {
                                e = e6;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : ".concat(e.toString()));
                                boolean[] zArr222 = sj.a;
                                zArr222[2] = false;
                                boolean Z2222 = Z(64);
                                U(Z2222);
                                size = this.aJ.size();
                                i9 = 0;
                                z5 = false;
                                while (i9 < size) {
                                }
                                rv rvVar2222 = rvVar;
                                if (z4) {
                                }
                                max = Math.max(this.ad, j());
                                if (max > j()) {
                                }
                                max2 = Math.max(this.ae, h());
                                if (max2 > h()) {
                                }
                                if (!z2) {
                                }
                                z3 = z7 & (i8 <= 8);
                                i33 = i8;
                                rvVar = rvVar2222;
                                z15 = z4;
                                i32 = 64;
                            }
                        } else {
                            i8 = i11;
                            int i48 = 0;
                            while (i48 < size4) {
                                sd sdVar16 = (sd) this.aJ.get(i48);
                                if (sdVar16 instanceof se) {
                                    int[] iArr2 = sdVar16.ar;
                                    int i49 = iArr2[0];
                                    i12 = i48;
                                    int i50 = iArr2[1];
                                    i13 = size4;
                                    if (i49 == 2) {
                                        sdVar16.S(1);
                                        i49 = 2;
                                    }
                                    if (i50 == 2) {
                                        sdVar16.T(1);
                                        i50 = 2;
                                    }
                                    sdVar16.b(rvVar, Z);
                                    if (i49 == 2) {
                                        sdVar16.S(2);
                                    }
                                    if (i50 == 2) {
                                        sdVar16.T(2);
                                    }
                                } else {
                                    i12 = i48;
                                    i13 = size4;
                                    sj.a(this, rvVar, sdVar16);
                                    if (!sdVar16.G()) {
                                        sdVar16.b(rvVar, Z);
                                    }
                                }
                                i48 = i12 + 1;
                                size4 = i13;
                            }
                        }
                        if (this.au > 0) {
                            arrayList = null;
                            try {
                                ow.i(this, rvVar, null, 0);
                            } catch (Exception e7) {
                                e = e7;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : ".concat(e.toString()));
                                boolean[] zArr2222 = sj.a;
                                zArr2222[2] = false;
                                boolean Z22222 = Z(64);
                                U(Z22222);
                                size = this.aJ.size();
                                i9 = 0;
                                z5 = false;
                                while (i9 < size) {
                                }
                                rv rvVar22222 = rvVar;
                                if (z4) {
                                }
                                max = Math.max(this.ad, j());
                                if (max > j()) {
                                }
                                max2 = Math.max(this.ae, h());
                                if (max2 > h()) {
                                }
                                if (!z2) {
                                }
                                z3 = z7 & (i8 <= 8);
                                i33 = i8;
                                rvVar = rvVar22222;
                                z15 = z4;
                                i32 = 64;
                            }
                        } else {
                            arrayList = null;
                        }
                        if (this.av > 0) {
                            ow.i(this, rvVar, arrayList, 1);
                        }
                        WeakReference weakReference = this.aB;
                        if (weakReference != null && weakReference.get() != null) {
                            ad((sc) this.aB.get(), rvVar.b(this.L));
                            this.aB = null;
                        }
                        WeakReference weakReference2 = this.aD;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            ac((sc) this.aD.get(), rvVar.b(this.N));
                            this.aD = null;
                        }
                        WeakReference weakReference3 = this.aC;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            ad((sc) this.aC.get(), rvVar.b(this.K));
                            this.aC = null;
                        }
                        WeakReference weakReference4 = this.aE;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            ac((sc) this.aE.get(), rvVar.b(this.M));
                            try {
                                this.aE = null;
                            } catch (Exception e8) {
                                e = e8;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : ".concat(e.toString()));
                                boolean[] zArr22222 = sj.a;
                                zArr22222[2] = false;
                                boolean Z222222 = Z(64);
                                U(Z222222);
                                size = this.aJ.size();
                                i9 = 0;
                                z5 = false;
                                while (i9 < size) {
                                }
                                rv rvVar222222 = rvVar;
                                if (z4) {
                                }
                                max = Math.max(this.ad, j());
                                if (max > j()) {
                                }
                                max2 = Math.max(this.ae, h());
                                if (max2 > h()) {
                                }
                                if (!z2) {
                                }
                                z3 = z7 & (i8 <= 8);
                                i33 = i8;
                                rvVar = rvVar222222;
                                z15 = z4;
                                i32 = 64;
                            }
                        }
                        rvVar.j();
                    } catch (Exception e9) {
                        e = e9;
                        i8 = i34;
                        z4 = z15;
                    }
                    boolean[] zArr222222 = sj.a;
                    zArr222222[2] = false;
                    boolean Z2222222 = Z(64);
                    U(Z2222222);
                    size = this.aJ.size();
                    i9 = 0;
                    z5 = false;
                    while (i9 < size) {
                        sd sdVar17 = (sd) this.aJ.get(i9);
                        sdVar17.U(Z2222222);
                        rv rvVar3 = rvVar;
                        z5 = ((sdVar17.l == -1 && sdVar17.m == -1) ? false : true) | z5;
                        i9++;
                        rvVar = rvVar3;
                    }
                    rv rvVar2222222 = rvVar;
                    if (z4 && i8 < 8 && zArr222222[2]) {
                        int i412 = 0;
                        int i422 = 0;
                        for (i10 = 0; i10 < i6; i10++) {
                            sd sdVar18 = (sd) this.aJ.get(i10);
                            i412 = Math.max(i412, sdVar18.aa + sdVar18.j());
                            i422 = Math.max(i422, sdVar18.ab + sdVar18.h());
                        }
                        max3 = Math.max(this.ad, i412);
                        max4 = Math.max(this.ae, i422);
                        if (i3 == 2 && j() < max3) {
                            E(max3);
                            this.ar[0] = 2;
                            z2 = true;
                            z5 = true;
                        }
                        if (i4 == 2 && h() < max4) {
                            z(max4);
                            this.ar[1] = 2;
                            z2 = true;
                            z5 = true;
                        }
                    }
                    max = Math.max(this.ad, j());
                    if (max > j()) {
                        E(max);
                        r5 = 1;
                        this.ar[0] = 1;
                        z2 = true;
                        z6 = true;
                    } else {
                        r5 = 1;
                        z6 = z5;
                    }
                    max2 = Math.max(this.ae, h());
                    if (max2 > h()) {
                        z(max2);
                        this.ar[r5] = r5;
                        z7 = r5;
                        z2 = z7;
                    } else {
                        z7 = z6;
                    }
                    if (!z2) {
                        int[] iArr3 = this.ar;
                        if (iArr3[0] == 2 && i2 > 0 && j() > i2) {
                            this.az = r5;
                            iArr3[0] = r5;
                            E(i2);
                            z7 = r5;
                            z2 = z7;
                        }
                        if (iArr3[r5] == 2 && i5 > 0 && h() > i5) {
                            this.aA = r5;
                            iArr3[r5] = r5;
                            z(i5);
                            z7 = true;
                            z2 = true;
                        }
                    }
                    z3 = z7 & (i8 <= 8);
                    i33 = i8;
                    rvVar = rvVar2222222;
                    z15 = z4;
                    i32 = 64;
                }
                this.aJ = arrayList3;
                if (z2) {
                    int[] iArr4 = this.ar;
                    iArr4[0] = i3;
                    iArr4[1] = i4;
                }
                V(this.d.j);
            }
            if (sj.b(this.ay, 1024)) {
                te teVar2 = this.aH;
                ArrayList arrayList4 = this.aJ;
                int size6 = arrayList4.size();
                for (int i51 = 0; i51 < size6; i51++) {
                    sd sdVar19 = (sd) arrayList4.get(i51);
                    if (tw.D(O(), P(), sdVar19.O(), sdVar19.P()) && !(sdVar19 instanceof sg)) {
                    }
                    i2 = max5;
                    i3 = i19;
                    i4 = i18;
                    i = size2;
                    z = false;
                    i5 = max6;
                    break;
                }
                ArrayList arrayList5 = null;
                int i52 = 0;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                while (i52 < size6) {
                    int i53 = i52;
                    sd sdVar20 = (sd) arrayList4.get(i52);
                    int i54 = size2;
                    int i55 = max6;
                    int i56 = i18;
                    int i57 = max5;
                    if (!tw.D(O(), P(), sdVar20.O(), sdVar20.P())) {
                        aa(sdVar20, teVar2, this.aG);
                    }
                    boolean z18 = sdVar20 instanceof sh;
                    if (z18) {
                        sh shVar5 = (sh) sdVar20;
                        if (shVar5.as == 0) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(shVar5);
                        }
                        if (shVar5.as == 1) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(shVar5);
                        }
                    }
                    if (sdVar20 instanceof si) {
                        if (sdVar20 instanceof sa) {
                            sa saVar5 = (sa) sdVar20;
                            if (saVar5.a() == 0) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(saVar5);
                            }
                            if (saVar5.a() == 1) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(saVar5);
                            }
                        } else {
                            si siVar = (si) sdVar20;
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(siVar);
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(siVar);
                        }
                    }
                    if (sdVar20.K.e == null && sdVar20.M.e == null && !z18 && !(sdVar20 instanceof sa)) {
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                        }
                        arrayList9.add(sdVar20);
                    }
                    if (sdVar20.L.e == null && sdVar20.N.e == null && sdVar20.O.e == null && !z18 && !(sdVar20 instanceof sa)) {
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                        }
                        arrayList10.add(sdVar20);
                    }
                    i52 = i53 + 1;
                    size2 = i54;
                    max6 = i55;
                    i18 = i56;
                    max5 = i57;
                }
                int i58 = max5;
                int i59 = max6;
                int i60 = i18;
                i = size2;
                ArrayList arrayList11 = new ArrayList();
                if (arrayList5 != null) {
                    int size7 = arrayList5.size();
                    for (int i61 = 0; i61 < size7; i61++) {
                        tw.B((sh) arrayList5.get(i61), 0, arrayList11, null);
                    }
                }
                if (arrayList6 != null) {
                    int size8 = arrayList6.size();
                    for (int i62 = 0; i62 < size8; i62++) {
                        si siVar2 = (si) arrayList6.get(i62);
                        sx B = tw.B(siVar2, 0, arrayList11, null);
                        siVar2.X(arrayList11, 0, B);
                        B.b(arrayList11);
                    }
                }
                HashSet hashSet3 = M(2).a;
                if (hashSet3 != null) {
                    Iterator it5 = hashSet3.iterator();
                    while (it5.hasNext()) {
                        tw.B(((sc) it5.next()).d, 0, arrayList11, null);
                    }
                }
                HashSet hashSet4 = M(4).a;
                if (hashSet4 != null) {
                    Iterator it6 = hashSet4.iterator();
                    while (it6.hasNext()) {
                        tw.B(((sc) it6.next()).d, 0, arrayList11, null);
                    }
                }
                HashSet hashSet5 = M(7).a;
                if (hashSet5 != null) {
                    Iterator it7 = hashSet5.iterator();
                    while (it7.hasNext()) {
                        tw.B(((sc) it7.next()).d, 0, arrayList11, null);
                    }
                }
                sx sxVar3 = null;
                int i63 = 0;
                if (arrayList9 != null) {
                    int size9 = arrayList9.size();
                    int i64 = 0;
                    while (i64 < size9) {
                        tw.B((sd) arrayList9.get(i64), i63, arrayList11, sxVar3);
                        i64++;
                        sxVar3 = null;
                        i63 = 0;
                    }
                }
                if (arrayList7 != null) {
                    int size10 = arrayList7.size();
                    for (int i65 = 0; i65 < size10; i65++) {
                        tw.B((sh) arrayList7.get(i65), 1, arrayList11, null);
                    }
                }
                if (arrayList8 != null) {
                    int size11 = arrayList8.size();
                    for (int i66 = 0; i66 < size11; i66++) {
                        si siVar3 = (si) arrayList8.get(i66);
                        sx B2 = tw.B(siVar3, 1, arrayList11, null);
                        siVar3.X(arrayList11, 1, B2);
                        B2.b(arrayList11);
                    }
                }
                HashSet hashSet6 = M(3).a;
                if (hashSet6 != null) {
                    Iterator it8 = hashSet6.iterator();
                    while (it8.hasNext()) {
                        tw.B(((sc) it8.next()).d, 1, arrayList11, null);
                    }
                }
                HashSet hashSet7 = M(6).a;
                if (hashSet7 != null) {
                    Iterator it9 = hashSet7.iterator();
                    while (it9.hasNext()) {
                        tw.B(((sc) it9.next()).d, 1, arrayList11, null);
                    }
                }
                HashSet hashSet8 = M(5).a;
                if (hashSet8 != null) {
                    Iterator it10 = hashSet8.iterator();
                    while (it10.hasNext()) {
                        tw.B(((sc) it10.next()).d, 1, arrayList11, null);
                    }
                }
                HashSet hashSet9 = M(7).a;
                if (hashSet9 != null) {
                    Iterator it11 = hashSet9.iterator();
                    while (it11.hasNext()) {
                        tw.B(((sc) it11.next()).d, 1, arrayList11, null);
                    }
                }
                sx sxVar4 = null;
                int i67 = 1;
                if (arrayList10 != null) {
                    int size12 = arrayList10.size();
                    int i68 = 0;
                    while (i68 < size12) {
                        tw.B((sd) arrayList10.get(i68), i67, arrayList11, sxVar4);
                        i68++;
                        sxVar4 = null;
                        i67 = 1;
                    }
                }
                for (int i69 = 0; i69 < size6; i69++) {
                    sd sdVar21 = (sd) arrayList4.get(i69);
                    int[] iArr5 = sdVar21.ar;
                    if (iArr5[0] == 3 && iArr5[1] == 3) {
                        sx C = tw.C(arrayList11, sdVar21.ap);
                        sx C2 = tw.C(arrayList11, sdVar21.aq);
                        if (C != null && C2 != null) {
                            C.c(0, C2);
                            C2.d = 2;
                            arrayList11.remove(C);
                        }
                    }
                }
                int i70 = 1;
                if (arrayList11.size() > 1) {
                    if (O() == 2) {
                        int size13 = arrayList11.size();
                        sxVar = null;
                        int i71 = 0;
                        int i72 = 0;
                        while (i71 < size13) {
                            sx sxVar5 = (sx) arrayList11.get(i71);
                            if (sxVar5.d != i70) {
                                int a = sxVar5.a(this.d, 0);
                                if (a > i72) {
                                    sxVar = sxVar5;
                                }
                                if (a > i72) {
                                    i72 = a;
                                }
                            }
                            i71++;
                            i70 = 1;
                        }
                        if (sxVar != null) {
                            S(1);
                            E(i72);
                            if (P() == 2) {
                                int size14 = arrayList11.size();
                                sxVar2 = null;
                                int i73 = 0;
                                for (int i74 = 0; i74 < size14; i74++) {
                                    sx sxVar6 = (sx) arrayList11.get(i74);
                                    if (sxVar6.d != 0) {
                                        int a2 = sxVar6.a(this.d, 1);
                                        if (a2 > i73) {
                                            sxVar2 = sxVar6;
                                        }
                                        if (a2 > i73) {
                                            i73 = a2;
                                        }
                                    }
                                }
                                if (sxVar2 != null) {
                                    T(1);
                                    z(i73);
                                    if (sxVar == null || sxVar2 != null) {
                                        i14 = 2;
                                        if (i19 == 2) {
                                            if (i58 >= j() || i58 <= 0) {
                                                i15 = j();
                                            } else {
                                                E(i58);
                                                this.az = true;
                                                i15 = i58;
                                            }
                                            i16 = i60;
                                            i19 = 2;
                                            i14 = 2;
                                        } else {
                                            i15 = i58;
                                            i16 = i60;
                                        }
                                        if (i16 == i14) {
                                            if (i59 >= h() || i59 <= 0) {
                                                i17 = h();
                                            } else {
                                                z(i59);
                                                this.aA = true;
                                                i17 = i59;
                                            }
                                            i16 = 2;
                                        } else {
                                            i17 = i59;
                                        }
                                        i2 = i15;
                                        i5 = i17;
                                        i3 = i19;
                                        i4 = i16;
                                        z = true;
                                        int i322 = 64;
                                        if (Z(64)) {
                                        }
                                        rvVar = this.d;
                                        rvVar.f = false;
                                        rvVar.g = false;
                                        if (this.ay != 0) {
                                            rvVar.g = true;
                                        }
                                        ArrayList arrayList32 = this.aJ;
                                        if (O() != 2) {
                                        }
                                        ae();
                                        i6 = i;
                                        while (i7 < i6) {
                                        }
                                        z2 = z;
                                        z3 = true;
                                        int i332 = 0;
                                        while (z3) {
                                        }
                                        this.aJ = arrayList32;
                                        if (z2) {
                                        }
                                        V(this.d.j);
                                    }
                                }
                            }
                            sxVar2 = null;
                            if (sxVar == null) {
                            }
                            i14 = 2;
                            if (i19 == 2) {
                            }
                            if (i16 == i14) {
                            }
                            i2 = i15;
                            i5 = i17;
                            i3 = i19;
                            i4 = i16;
                            z = true;
                            int i3222 = 64;
                            if (Z(64)) {
                            }
                            rvVar = this.d;
                            rvVar.f = false;
                            rvVar.g = false;
                            if (this.ay != 0) {
                            }
                            ArrayList arrayList322 = this.aJ;
                            if (O() != 2) {
                            }
                            ae();
                            i6 = i;
                            while (i7 < i6) {
                            }
                            z2 = z;
                            z3 = true;
                            int i3322 = 0;
                            while (z3) {
                            }
                            this.aJ = arrayList322;
                            if (z2) {
                            }
                            V(this.d.j);
                        }
                    }
                    sxVar = null;
                    if (P() == 2) {
                    }
                    sxVar2 = null;
                    if (sxVar == null) {
                    }
                    i14 = 2;
                    if (i19 == 2) {
                    }
                    if (i16 == i14) {
                    }
                    i2 = i15;
                    i5 = i17;
                    i3 = i19;
                    i4 = i16;
                    z = true;
                    int i32222 = 64;
                    if (Z(64)) {
                    }
                    rvVar = this.d;
                    rvVar.f = false;
                    rvVar.g = false;
                    if (this.ay != 0) {
                    }
                    ArrayList arrayList3222 = this.aJ;
                    if (O() != 2) {
                    }
                    ae();
                    i6 = i;
                    while (i7 < i6) {
                    }
                    z2 = z;
                    z3 = true;
                    int i33222 = 0;
                    while (z3) {
                    }
                    this.aJ = arrayList3222;
                    if (z2) {
                    }
                    V(this.d.j);
                }
                i3 = i19;
                i5 = i59;
                i4 = i60;
                i2 = i58;
                z = false;
                int i322222 = 64;
                if (Z(64)) {
                }
                rvVar = this.d;
                rvVar.f = false;
                rvVar.g = false;
                if (this.ay != 0) {
                }
                ArrayList arrayList32222 = this.aJ;
                if (O() != 2) {
                }
                ae();
                i6 = i;
                while (i7 < i6) {
                }
                z2 = z;
                z3 = true;
                int i332222 = 0;
                while (z3) {
                }
                this.aJ = arrayList32222;
                if (z2) {
                }
                V(this.d.j);
            }
        }
        i = size2;
        i2 = max5;
        i3 = i19;
        i4 = i18;
        i5 = max6;
        z = false;
        int i3222222 = 64;
        if (Z(64)) {
        }
        rvVar = this.d;
        rvVar.f = false;
        rvVar.g = false;
        if (this.ay != 0) {
        }
        ArrayList arrayList322222 = this.aJ;
        if (O() != 2) {
        }
        ae();
        i6 = i;
        while (i7 < i6) {
        }
        z2 = z;
        z3 = true;
        int i3322222 = 0;
        while (z3) {
        }
        this.aJ = arrayList322222;
        if (z2) {
        }
        V(this.d.j);
    }

    public final void X(int i) {
        this.ay = i;
        rv.a = Z(512);
    }

    public final boolean Y(boolean z, int i) {
        boolean z2;
        boolean z3;
        sp spVar = this.a;
        se seVar = spVar.a;
        boolean z4 = false;
        int N = seVar.N(0);
        int N2 = seVar.N(1);
        int k = seVar.k();
        int l = seVar.l();
        if (z) {
            if (N != 2) {
                if (N2 == 2) {
                    N2 = 2;
                }
            }
            ArrayList arrayList = spVar.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = true;
                    break;
                }
                sy syVar = (sy) arrayList.get(i2);
                if (syVar.f == i && !syVar.e()) {
                    z3 = false;
                    break;
                }
                i2++;
            }
            if (i == 0) {
                if (z3 && N == 2) {
                    seVar.S(1);
                    seVar.E(spVar.a(seVar, 0));
                    seVar.h.e.c(seVar.j());
                }
            } else if (z3 && N2 == 2) {
                seVar.T(1);
                seVar.z(spVar.a(seVar, 1));
                seVar.i.e.c(seVar.h());
            }
        }
        if (i == 0) {
            int i3 = seVar.ar[0];
            if (i3 == 1 || i3 == 4) {
                int j = seVar.j() + k;
                seVar.h.i.c(j);
                seVar.h.e.c(j - k);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = seVar.ar[1];
            if (i4 == 1 || i4 == 4) {
                int h = seVar.h() + l;
                seVar.i.i.c(h);
                seVar.i.e.c(h - l);
                z2 = true;
            }
            z2 = false;
        }
        spVar.c();
        ArrayList arrayList2 = spVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            sy syVar2 = (sy) arrayList2.get(i5);
            if (syVar2.f == i && (syVar2.d != seVar || syVar2.g)) {
                syVar2.c();
            }
        }
        int size3 = arrayList2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z4 = true;
                break;
            }
            sy syVar3 = (sy) arrayList2.get(i6);
            if (syVar3.f == i && ((z2 || syVar3.d != seVar) && (!syVar3.h.i || !syVar3.i.i || (!(syVar3 instanceof sn) && !syVar3.e.i)))) {
                break;
            }
            i6++;
        }
        seVar.S(N);
        seVar.T(N2);
        return z4;
    }

    public final boolean Z(int i) {
        return (this.ay & i) == i;
    }

    final void a(sd sdVar, int i) {
        if (i == 0) {
            int i2 = this.au + 1;
            sb[] sbVarArr = this.ax;
            int length = sbVarArr.length;
            if (i2 >= length) {
                sbVarArr = (sb[]) Arrays.copyOf(sbVarArr, length + length);
                this.ax = sbVarArr;
            }
            int i3 = this.au;
            sbVarArr[i3] = new sb(sdVar, 0, this.c);
            this.au = i3 + 1;
            return;
        }
        int i4 = this.av + 1;
        sb[] sbVarArr2 = this.aw;
        int length2 = sbVarArr2.length;
        if (i4 >= length2) {
            sbVarArr2 = (sb[]) Arrays.copyOf(sbVarArr2, length2 + length2);
            this.aw = sbVarArr2;
        }
        int i5 = this.av;
        sbVarArr2[i5] = new sb(sdVar, 1, this.c);
        this.av = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.sl, defpackage.sd
    public final void t() {
        this.d.k();
        this.as = 0;
        this.at = 0;
        super.t();
    }
}
