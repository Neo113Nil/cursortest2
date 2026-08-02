package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sd {
    public int A;
    public float B;
    int C;
    float D;
    public final int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final sc K;
    public final sc L;
    public final sc M;
    public final sc N;
    public final sc O;
    final sc P;
    final sc Q;
    public final sc R;
    public final sc[] S;
    protected final ArrayList T;
    public final boolean[] U;
    public sd V;
    int W;
    public int X;
    public float Y;
    public int Z;
    private boolean a;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public float af;
    public float ag;
    public Object ah;
    public int ai;
    public String aj;
    public int ak;
    public int al;
    public final float[] am;
    public final sd[] an;
    public final sd[] ao;
    public int ap;
    public int aq;
    public final int[] ar;
    public sn f;
    public sn g;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final int[] v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean e = false;
    public sv h = null;
    public sw i = null;
    public final boolean[] j = {true, true};
    public boolean k = true;
    public int l = -1;
    public int m = -1;

    public sd() {
        new HashMap();
        this.a = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = new int[2];
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.F = Float.NaN;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        sc scVar = new sc(this, 2);
        this.K = scVar;
        sc scVar2 = new sc(this, 3);
        this.L = scVar2;
        sc scVar3 = new sc(this, 4);
        this.M = scVar3;
        sc scVar4 = new sc(this, 5);
        this.N = scVar4;
        sc scVar5 = new sc(this, 6);
        this.O = scVar5;
        sc scVar6 = new sc(this, 8);
        this.P = scVar6;
        sc scVar7 = new sc(this, 9);
        this.Q = scVar7;
        sc scVar8 = new sc(this, 7);
        this.R = scVar8;
        this.S = new sc[]{scVar, scVar3, scVar2, scVar4, scVar5, scVar8};
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.U = new boolean[2];
        this.ar = new int[]{1, 1};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        this.ai = 0;
        this.aj = null;
        this.ak = 0;
        this.al = 0;
        this.am = new float[]{-1.0f, -1.0f};
        this.an = new sd[]{null, null};
        this.ao = new sd[]{null, null};
        this.ap = -1;
        this.aq = -1;
        arrayList.add(scVar);
        arrayList.add(scVar2);
        arrayList.add(scVar3);
        arrayList.add(scVar4);
        arrayList.add(scVar6);
        arrayList.add(scVar7);
        arrayList.add(scVar8);
        arrayList.add(scVar5);
    }

    private final boolean a(int i) {
        sc scVar;
        sc scVar2;
        sc[] scVarArr = this.S;
        int i2 = i + i;
        sc scVar3 = scVarArr[i2];
        sc scVar4 = scVar3.e;
        return (scVar4 == null || scVar4.e == scVar3 || (scVar2 = (scVar = scVarArr[i2 + 1]).e) == null || scVar2.e != scVar) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0464 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c(rv rvVar, boolean z, boolean z2, boolean z3, boolean z4, ry ryVar, ry ryVar2, int i, boolean z5, sc scVar, sc scVar2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        int i10;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        int i13;
        int i14;
        ry ryVar3;
        ry ryVar4;
        ry ryVar5;
        int i15;
        int i16;
        int i17;
        boolean z14;
        ry b;
        ry b2;
        int i18;
        int i19;
        sc scVar3;
        boolean z15;
        int i20;
        boolean z16;
        int i21;
        ry ryVar6;
        ry ryVar7;
        int i22;
        int i23;
        int i24;
        boolean z17;
        boolean z18;
        boolean z19;
        int i25;
        int i26;
        boolean z20;
        boolean z21;
        sd sdVar;
        ry ryVar8;
        sd sdVar2;
        boolean z22;
        boolean z23;
        int i27;
        int i28;
        boolean z24;
        int i29;
        sd sdVar3;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z25;
        boolean z26;
        ry ryVar9;
        rv rvVar2 = rvVar;
        ry b3 = rvVar2.b(scVar);
        ry b4 = rvVar2.b(scVar2);
        ry b5 = rvVar2.b(scVar.e);
        ry b6 = rvVar2.b(scVar2.e);
        boolean j = scVar.j();
        boolean j2 = scVar2.j();
        boolean j3 = this.R.j();
        int i36 = j2 ? (j ? 1 : 0) + 1 : j ? 1 : 0;
        if (j3) {
            i36++;
        }
        int i37 = true == z6 ? 3 : i6;
        int i38 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i38 == 0 || i38 == 1 || i38 != 2) {
            i10 = i37;
        } else {
            i10 = i37;
            if (i10 != 4) {
                z12 = true;
                i11 = this.l;
                if (i11 != -1 && z) {
                    this.l = -1;
                    i3 = i11;
                    z12 = false;
                }
                i12 = this.m;
                if (i12 != -1 || z) {
                    i12 = i3;
                } else {
                    this.m = -1;
                    z12 = false;
                }
                int i39 = this.ai;
                int i40 = i12;
                boolean z27 = i39 == 8;
                int i41 = i39 != 8 ? 0 : i40;
                if (z11) {
                    if (!j && !j2 && !j3) {
                        rvVar2.f(b3, i2);
                    } else if (j && !j2) {
                        rvVar2.m(b3, b5, scVar.b(), 8);
                    }
                }
                z13 = z27 & z12;
                if (z13) {
                    if (z5) {
                        ryVar9 = b5;
                        rvVar2.m(b4, b3, 0, 3);
                        if (i4 > 0) {
                            rvVar2.g(b4, b3, i4, 8);
                        }
                        if (i5 < Integer.MAX_VALUE) {
                            rvVar2.h(b4, b3, i5, 8);
                        }
                    } else {
                        ryVar9 = b5;
                        rvVar2.m(b4, b3, i41, 8);
                    }
                    i15 = i9;
                    ryVar3 = b4;
                    z14 = z4;
                    i16 = i8;
                    i17 = i10;
                    ryVar4 = b6;
                    ryVar5 = ryVar9;
                } else {
                    if (i36 != 2 && !z6) {
                        if (i10 != 1) {
                            i19 = i10 == 0 ? 0 : 1;
                        }
                        int max = Math.max(i8, i41);
                        if (i9 > 0) {
                            max = Math.min(i9, max);
                        }
                        rvVar2.m(b4, b3, max, 8);
                        i15 = i9;
                        ryVar3 = b4;
                        z14 = z4;
                        i17 = i19;
                        i16 = i8;
                        ryVar4 = b6;
                        ryVar5 = b5;
                        z13 = false;
                    }
                    int i42 = i8 == -2 ? i41 : i8;
                    int i43 = i9 == -2 ? i41 : i9;
                    if (i41 > 0 && i10 != 1) {
                        i41 = 0;
                    }
                    if (i42 > 0) {
                        rvVar2.g(b4, b3, i42, 8);
                        i41 = Math.max(i41, i42);
                    }
                    if (i43 > 0) {
                        i13 = 1;
                        if (z2 && i10 == 1) {
                            i18 = 1;
                        } else {
                            rvVar2.h(b4, b3, i43, 8);
                            i18 = i10;
                        }
                        i41 = Math.min(i41, i43);
                        i14 = i18;
                    } else {
                        i13 = 1;
                        i14 = i10;
                    }
                    if (i10 == i13) {
                        if (z2) {
                            rvVar2.m(b4, b3, i41, 8);
                        } else if (z8) {
                            rvVar2.m(b4, b3, i41, 5);
                            rvVar2.h(b4, b3, i41, 8);
                        } else {
                            rvVar2.m(b4, b3, i41, 5);
                            rvVar2.h(b4, b3, i41, 8);
                        }
                        ryVar3 = b4;
                        ryVar4 = b6;
                        ryVar5 = b5;
                        i17 = i14;
                        i15 = i43;
                        i16 = i42;
                        z14 = z4;
                    } else if (i10 == 2) {
                        int i44 = scVar.i;
                        if (i44 == 3 || i44 == 5) {
                            b = rvVar2.b(this.V.M(3));
                            b2 = rvVar2.b(this.V.M(5));
                        } else {
                            b = rvVar2.b(this.V.M(2));
                            b2 = rvVar2.b(this.V.M(4));
                        }
                        ry ryVar10 = b;
                        ru a = rvVar2.a();
                        ryVar3 = b4;
                        ryVar5 = b5;
                        a.g(ryVar3, b3, b2, ryVar10, f2);
                        rvVar2.e(a);
                        i15 = i43;
                        i16 = i42;
                        i36 = i36;
                        i17 = i14;
                        z14 = z4;
                        z13 = !z2;
                        ryVar4 = b6;
                    } else {
                        ryVar3 = b4;
                        ryVar4 = b6;
                        ryVar5 = b5;
                        i15 = i43;
                        i16 = i42;
                        i17 = i14;
                        z14 = true;
                    }
                }
                if (z11 || z8) {
                    boolean z28 = z14;
                    if (i36 >= 2 && z2 && z28) {
                        rvVar2.g(b3, ryVar, 0, 8);
                        boolean z29 = z || this.O.e == null;
                        if (!z && (scVar3 = this.O.e) != null) {
                            sd sdVar4 = scVar3.d;
                            if (sdVar4.Y == 0.0f) {
                                return;
                            }
                            int[] iArr = sdVar4.ar;
                            if (iArr[0] != 3 || iArr[1] != 3) {
                                return;
                            }
                        } else if (!z29) {
                            return;
                        }
                        rvVar2.g(ryVar2, ryVar3, 0, 8);
                        return;
                    }
                    return;
                }
                if (j || j2 || j3) {
                    if (j && !j2) {
                        sd sdVar5 = scVar.e.d;
                        if (z2 && (sdVar5 instanceof sa)) {
                            z16 = z2;
                            z15 = z14;
                            i21 = 8;
                            if (z16) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } else {
                        if (j || !j2) {
                            if (j && j2) {
                                sd sdVar6 = scVar.e.d;
                                int i45 = i16;
                                sd sdVar7 = scVar2.e.d;
                                sd sdVar8 = this.V;
                                int i46 = 6;
                                if (z13) {
                                    if (i17 == 0) {
                                        if (i15 != 0 || i45 != 0) {
                                            i33 = i45;
                                            i34 = 5;
                                            i35 = 5;
                                            z25 = true;
                                            z26 = false;
                                            z18 = true;
                                        } else {
                                            if (ryVar5.g && ryVar4.g) {
                                                rvVar2.m(b3, ryVar5, scVar.b(), 8);
                                                rvVar2.m(ryVar3, ryVar4, -scVar2.b(), 8);
                                                return;
                                            }
                                            i34 = 8;
                                            i35 = 8;
                                            z25 = false;
                                            z26 = true;
                                            z18 = false;
                                            i33 = 0;
                                        }
                                        if ((sdVar6 instanceof sa) || (sdVar7 instanceof sa)) {
                                            rvVar2 = rvVar;
                                            z15 = z14;
                                            i23 = 6;
                                            i22 = i33;
                                            i25 = i17;
                                            z19 = z26;
                                            i26 = i34;
                                            z17 = z25;
                                            i24 = 4;
                                            ryVar6 = ryVar5;
                                            ryVar7 = ryVar2;
                                            if (z18 || ryVar6 != ryVar4 || sdVar6 == sdVar8) {
                                                z20 = z18;
                                                z21 = true;
                                            } else {
                                                z21 = false;
                                                z20 = false;
                                            }
                                            if (z17) {
                                                sdVar = sdVar7;
                                                ryVar8 = ryVar6;
                                                sdVar2 = sdVar6;
                                                z22 = z13;
                                                z23 = z9;
                                                z16 = z2;
                                            } else {
                                                if (z13 || z7 || z9 || ryVar6 != ryVar || ryVar4 != ryVar7) {
                                                    i29 = i26;
                                                    sdVar3 = sdVar6;
                                                    i30 = i23;
                                                    z16 = z2;
                                                } else {
                                                    sdVar3 = sdVar6;
                                                    i30 = 8;
                                                    z16 = false;
                                                    i29 = 8;
                                                    z21 = false;
                                                }
                                                ry ryVar11 = ryVar4;
                                                ryVar8 = ryVar6;
                                                z22 = z13;
                                                sdVar = sdVar7;
                                                sdVar2 = sdVar3;
                                                z23 = z9;
                                                ry ryVar12 = ryVar3;
                                                rvVar2.d(b3, ryVar8, scVar.b(), f, ryVar11, ryVar12, scVar2.b(), i30);
                                                ryVar4 = ryVar11;
                                                ryVar3 = ryVar12;
                                                b3 = b3;
                                                i26 = i29;
                                            }
                                            if (this.ai != 8 && !scVar2.i()) {
                                                return;
                                            }
                                            if (z20) {
                                                if (z16 && ryVar8 != ryVar4 && !z22 && ((sdVar2 instanceof sa) || (sdVar instanceof sa))) {
                                                    i26 = 6;
                                                }
                                                rvVar2.g(b3, ryVar8, scVar.b(), i26);
                                                rvVar2.h(ryVar3, ryVar4, -scVar2.b(), i26);
                                            }
                                            if (z16 || !z10 || (sdVar2 instanceof sa) || (sdVar instanceof sa) || sdVar == sdVar8) {
                                                i27 = i24;
                                            } else {
                                                i27 = 6;
                                                i26 = 6;
                                                z21 = true;
                                            }
                                            if (z21) {
                                                if (z19 && (!z23 || z3)) {
                                                    if (sdVar2 != sdVar8 && sdVar != sdVar8) {
                                                        i46 = i27;
                                                    }
                                                    if ((sdVar2 instanceof sh) || (sdVar instanceof sh)) {
                                                        i46 = 5;
                                                    }
                                                    if ((sdVar2 instanceof sa) || (sdVar instanceof sa)) {
                                                        z24 = true;
                                                        i46 = 5;
                                                    } else {
                                                        z24 = true;
                                                    }
                                                    i27 = Math.max(z24 == z23 ? 5 : i46, i27);
                                                }
                                                if (z16) {
                                                    i27 = Math.min(i26, i27);
                                                    if (z6 && !z23 && (sdVar2 == sdVar8 || sdVar == sdVar8)) {
                                                        i28 = 4;
                                                        rvVar2.m(b3, ryVar8, scVar.b(), i28);
                                                        rvVar2.m(ryVar3, ryVar4, -scVar2.b(), i28);
                                                    }
                                                }
                                                i28 = i27;
                                                rvVar2.m(b3, ryVar8, scVar.b(), i28);
                                                rvVar2.m(ryVar3, ryVar4, -scVar2.b(), i28);
                                            }
                                            if (z16) {
                                                int b7 = ryVar8 == ryVar ? scVar.b() : 0;
                                                if (ryVar8 != ryVar) {
                                                    i20 = 5;
                                                    rvVar2.g(b3, ryVar, b7, 5);
                                                    if (z16 && z22 && i4 == 0 && i22 == 0) {
                                                        if (i25 != 3) {
                                                            rvVar2.g(ryVar3, b3, 0, 8);
                                                        } else {
                                                            rvVar2.g(ryVar3, b3, 0, i20);
                                                        }
                                                    }
                                                }
                                            }
                                            i20 = 5;
                                            if (z16) {
                                                if (i25 != 3) {
                                                }
                                            }
                                        } else {
                                            rvVar2 = rvVar;
                                            z15 = z14;
                                            i22 = i33;
                                            i25 = i17;
                                            z19 = z26;
                                            i26 = i34;
                                            z17 = z25;
                                            ryVar6 = ryVar5;
                                            i24 = i35;
                                            ryVar7 = ryVar2;
                                            i23 = 6;
                                            if (z18) {
                                            }
                                            z20 = z18;
                                            z21 = true;
                                            if (z17) {
                                            }
                                            if (this.ai != 8) {
                                            }
                                            if (z20) {
                                            }
                                            if (z16) {
                                            }
                                            i27 = i24;
                                            if (z21) {
                                            }
                                            if (z16) {
                                            }
                                            i20 = 5;
                                            if (z16) {
                                            }
                                        }
                                    } else {
                                        if (i17 == 2) {
                                            if ((sdVar6 instanceof sa) || (sdVar7 instanceof sa)) {
                                                rvVar2 = rvVar;
                                                i22 = i45;
                                                ryVar6 = ryVar5;
                                                z15 = z14;
                                                i23 = 6;
                                                i24 = 4;
                                            } else {
                                                rvVar2 = rvVar;
                                                i22 = i45;
                                                ryVar6 = ryVar5;
                                                z15 = z14;
                                                i23 = 6;
                                                i24 = 5;
                                            }
                                            z17 = true;
                                            z18 = true;
                                        } else if (i17 == 1) {
                                            rvVar2 = rvVar;
                                            i22 = i45;
                                            ryVar6 = ryVar5;
                                            z15 = z14;
                                            i23 = 6;
                                            i24 = 4;
                                            z17 = true;
                                            z18 = true;
                                            z19 = false;
                                            ryVar7 = ryVar2;
                                            i25 = i17;
                                            i26 = 8;
                                            if (z18) {
                                            }
                                            z20 = z18;
                                            z21 = true;
                                            if (z17) {
                                            }
                                            if (this.ai != 8) {
                                            }
                                            if (z20) {
                                            }
                                            if (z16) {
                                            }
                                            i27 = i24;
                                            if (z21) {
                                            }
                                            if (z16) {
                                            }
                                            i20 = 5;
                                            if (z16) {
                                            }
                                        } else if (i17 == 3) {
                                            if (this.C == -1) {
                                                rvVar2 = rvVar;
                                                i22 = i45;
                                                ryVar6 = ryVar5;
                                                z15 = z14;
                                                i26 = 8;
                                                i25 = 3;
                                                i23 = z9 ? z2 ? 5 : 4 : 8;
                                            } else if (z6) {
                                                if (i7 == 2 || i7 == 1) {
                                                    i31 = 5;
                                                    i32 = 4;
                                                } else {
                                                    i31 = 8;
                                                    i32 = 5;
                                                }
                                                i22 = i45;
                                                i26 = i31;
                                                i24 = i32;
                                                z15 = z14;
                                                i23 = 6;
                                                i25 = 3;
                                                z17 = true;
                                                z18 = true;
                                                z19 = true;
                                                rvVar2 = rvVar;
                                                ryVar6 = ryVar5;
                                                ryVar7 = ryVar2;
                                                if (z18) {
                                                }
                                                z20 = z18;
                                                z21 = true;
                                                if (z17) {
                                                }
                                                if (this.ai != 8) {
                                                }
                                                if (z20) {
                                                }
                                                if (z16) {
                                                }
                                                i27 = i24;
                                                if (z21) {
                                                }
                                                if (z16) {
                                                }
                                                i20 = 5;
                                                if (z16) {
                                                }
                                            } else if (i15 > 0) {
                                                rvVar2 = rvVar;
                                                i22 = i45;
                                                ryVar6 = ryVar5;
                                                z15 = z14;
                                                i23 = 6;
                                                i26 = 5;
                                                i25 = 3;
                                            } else if (i15 == 0 && i45 == 0) {
                                                if (z9) {
                                                    i26 = (sdVar6 == sdVar8 || sdVar7 == sdVar8) ? 5 : 4;
                                                    ryVar6 = ryVar5;
                                                    z15 = z14;
                                                    i23 = 6;
                                                    i25 = 3;
                                                    i24 = 4;
                                                    z17 = true;
                                                    z18 = true;
                                                    z19 = true;
                                                    i22 = 0;
                                                    rvVar2 = rvVar;
                                                } else {
                                                    rvVar2 = rvVar;
                                                    ryVar6 = ryVar5;
                                                    z15 = z14;
                                                    i23 = 6;
                                                    i26 = 5;
                                                    i25 = 3;
                                                    i24 = 8;
                                                    z17 = true;
                                                    z18 = true;
                                                    z19 = true;
                                                    i22 = 0;
                                                }
                                                ryVar7 = ryVar2;
                                                if (z18) {
                                                }
                                                z20 = z18;
                                                z21 = true;
                                                if (z17) {
                                                }
                                                if (this.ai != 8) {
                                                }
                                                if (z20) {
                                                }
                                                if (z16) {
                                                }
                                                i27 = i24;
                                                if (z21) {
                                                }
                                                if (z16) {
                                                }
                                                i20 = 5;
                                                if (z16) {
                                                }
                                            } else {
                                                rvVar2 = rvVar;
                                                i22 = i45;
                                                ryVar6 = ryVar5;
                                                z15 = z14;
                                                i23 = 6;
                                                i26 = 5;
                                                i25 = 3;
                                                i24 = 4;
                                                z17 = true;
                                                z18 = true;
                                                z19 = true;
                                                ryVar7 = ryVar2;
                                                if (z18) {
                                                }
                                                z20 = z18;
                                                z21 = true;
                                                if (z17) {
                                                }
                                                if (this.ai != 8) {
                                                }
                                                if (z20) {
                                                }
                                                if (z16) {
                                                }
                                                i27 = i24;
                                                if (z21) {
                                                }
                                                if (z16) {
                                                }
                                                i20 = 5;
                                                if (z16) {
                                                }
                                            }
                                            i24 = 5;
                                            z17 = true;
                                            z18 = true;
                                            z19 = true;
                                            ryVar7 = ryVar2;
                                            if (z18) {
                                            }
                                            z20 = z18;
                                            z21 = true;
                                            if (z17) {
                                            }
                                            if (this.ai != 8) {
                                            }
                                            if (z20) {
                                            }
                                            if (z16) {
                                            }
                                            i27 = i24;
                                            if (z21) {
                                            }
                                            if (z16) {
                                            }
                                            i20 = 5;
                                            if (z16) {
                                            }
                                        } else {
                                            rvVar2 = rvVar;
                                            i22 = i45;
                                            ryVar6 = ryVar5;
                                            z15 = z14;
                                            i23 = 6;
                                            i24 = 4;
                                            z17 = false;
                                            z18 = false;
                                        }
                                        z19 = false;
                                        ryVar7 = ryVar2;
                                    }
                                } else {
                                    if (ryVar5.g && ryVar4.g) {
                                        rvVar.d(b3, ryVar5, scVar.b(), f, ryVar4, ryVar3, scVar2.b(), 8);
                                        if (z2 && z14) {
                                            int b8 = scVar2.e != null ? scVar2.b() : 0;
                                            if (ryVar4 != ryVar2) {
                                                rvVar.g(ryVar2, ryVar3, b8, 5);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    rvVar2 = rvVar;
                                    ryVar6 = ryVar5;
                                    ryVar7 = ryVar2;
                                    i22 = i45;
                                    z15 = z14;
                                    i23 = 6;
                                    i24 = 4;
                                    z17 = true;
                                    z18 = true;
                                    z19 = false;
                                }
                                i25 = i17;
                                i26 = 5;
                                if (z18) {
                                }
                                z20 = z18;
                                z21 = true;
                                if (z17) {
                                }
                                if (this.ai != 8) {
                                }
                                if (z20) {
                                }
                                if (z16) {
                                }
                                i27 = i24;
                                if (z21) {
                                }
                                if (z16) {
                                }
                                i20 = 5;
                                if (z16) {
                                }
                            } else {
                                z15 = z14;
                                i20 = 5;
                                z16 = z2;
                            }
                            i21 = i20;
                            if (z16 || !z15) {
                                return;
                            }
                            int b9 = scVar2.e != null ? scVar2.b() : 0;
                            if (ryVar4 != ryVar2) {
                                rvVar2.g(ryVar2, ryVar3, b9, i21);
                                return;
                            }
                            return;
                        }
                        rvVar2.m(ryVar3, ryVar4, -scVar2.b(), 8);
                        if (z2) {
                            rvVar2.g(b3, ryVar, 0, 5);
                        }
                    }
                }
                z16 = z2;
                z15 = z14;
                i21 = 5;
                if (z16) {
                }
            }
        }
        z12 = false;
        i11 = this.l;
        if (i11 != -1) {
            this.l = -1;
            i3 = i11;
            z12 = false;
        }
        i12 = this.m;
        if (i12 != -1) {
        }
        i12 = i3;
        int i392 = this.ai;
        int i402 = i12;
        if (i392 == 8) {
        }
        if (i392 != 8) {
        }
        if (z11) {
        }
        z13 = z27 & z12;
        if (z13) {
        }
        if (z11) {
        }
        boolean z282 = z14;
        if (i36 >= 2) {
        }
    }

    protected final void A(int i, boolean z) {
        this.U[i] = z;
    }

    public final void B(int i, int i2) {
        this.I = i;
        this.J = i2;
        this.k = false;
    }

    public final void C(int i) {
        if (i < 0) {
            this.ae = 0;
        } else {
            this.ae = i;
        }
    }

    public final void D(int i) {
        if (i < 0) {
            this.ad = 0;
        } else {
            this.ad = i;
        }
    }

    public final void E(int i) {
        this.W = i;
        int i2 = this.ad;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void F(boolean z, boolean z2) {
        int i;
        int i2;
        sv svVar = this.h;
        boolean z3 = z & svVar.g;
        sw swVar = this.i;
        boolean z4 = z2 & swVar.g;
        int i3 = svVar.h.f;
        int i4 = swVar.h.f;
        int i5 = svVar.i.f;
        int i6 = swVar.i.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.aa = i3;
        }
        if (z4) {
            this.ab = i4;
        }
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.ar[0] == 1 && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i9 = this.ad;
            if (i8 < i9) {
                this.W = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.ar[1] == 1 && i10 < (i = this.X)) {
                i10 = i;
            }
            this.X = i10;
            int i11 = this.ae;
            if (i10 < i11) {
                this.X = i11;
            }
        }
    }

    final boolean G() {
        return (this instanceof sk) || (this instanceof sh);
    }

    public final boolean H(int i) {
        if (i == 0) {
            return (this.K.e != null ? 1 : 0) + (this.M.e != null ? 1 : 0) < 2;
        }
        return ((this.L.e != null ? 1 : 0) + (this.N.e != null ? 1 : 0)) + (this.O.e != null ? 1 : 0) < 2;
    }

    public final boolean I(int i, int i2) {
        sc scVar;
        sc scVar2;
        sc scVar3;
        sc scVar4;
        if (i == 0) {
            sc scVar5 = this.K;
            sc scVar6 = scVar5.e;
            return scVar6 != null && scVar6.c && (scVar4 = (scVar3 = this.M).e) != null && scVar4.c && (scVar4.a() - scVar3.b()) - (scVar5.e.a() + scVar5.b()) >= i2;
        }
        sc scVar7 = this.L;
        sc scVar8 = scVar7.e;
        if (scVar8 != null && scVar8.c && (scVar2 = (scVar = this.N).e) != null && scVar2.c && (scVar2.a() - scVar.b()) - (scVar7.e.a() + scVar7.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        sc scVar = this.K;
        sc scVar2 = scVar.e;
        if (scVar2 != null && scVar2.e == scVar) {
            return true;
        }
        sc scVar3 = this.M;
        sc scVar4 = scVar3.e;
        return scVar4 != null && scVar4.e == scVar3;
    }

    public final boolean K() {
        sc scVar = this.L;
        sc scVar2 = scVar.e;
        if (scVar2 != null && scVar2.e == scVar) {
            return true;
        }
        sc scVar3 = this.N;
        sc scVar4 = scVar3.e;
        return scVar4 != null && scVar4.e == scVar3;
    }

    public final boolean L() {
        return this.k && this.ai != 8;
    }

    public sc M(int i) {
        switch (i - 1) {
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            default:
                return this.Q;
        }
    }

    public final int N(int i) {
        return i == 0 ? O() : P();
    }

    public final int O() {
        return this.ar[0];
    }

    public final int P() {
        return this.ar[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
    
        if (r12 == 4) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(int i, sd sdVar, int i2, int i3) {
        int i4;
        boolean z;
        int i5 = 4;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2) {
                    i2 = 2;
                } else if (i2 != 4) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            return;
                        } else {
                            i2 = 5;
                        }
                    }
                    Q(3, sdVar, i2, 0);
                    Q(5, sdVar, i2, 0);
                    M(7).l(sdVar.M(i2), 0, Integer.MIN_VALUE, false);
                    return;
                }
                Q(2, sdVar, i2, 0);
                Q(4, sdVar, i2, 0);
                M(7).l(sdVar.M(i2), 0, Integer.MIN_VALUE, false);
                return;
            }
            sc M = M(2);
            sc M2 = M(4);
            sc M3 = M(3);
            sc M4 = M(5);
            boolean z2 = true;
            if ((M == null || !M.j()) && (M2 == null || !M2.j())) {
                Q(2, sdVar, 2, 0);
                Q(4, sdVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((M3 == null || !M3.j()) && (M4 == null || !M4.j())) {
                Q(3, sdVar, 3, 0);
                Q(5, sdVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                M(7).l(sdVar.M(7), 0, Integer.MIN_VALUE, false);
                return;
            } else if (z) {
                M(8).l(sdVar.M(8), 0, Integer.MIN_VALUE, false);
                return;
            } else {
                if (z2) {
                    M(9).l(sdVar.M(9), 0, Integer.MIN_VALUE, false);
                    return;
                }
                return;
            }
        }
        if (i == 8) {
            if (i2 == 2) {
                i4 = 2;
            } else if (i2 == 4) {
                i4 = 4;
            } else {
                i = 8;
            }
            sc M5 = M(2);
            sc M6 = sdVar.M(i4);
            sc M7 = M(4);
            M5.l(M6, 0, Integer.MIN_VALUE, false);
            M7.l(M6, 0, Integer.MIN_VALUE, false);
            M(8).l(M6, 0, Integer.MIN_VALUE, false);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            sc M8 = sdVar.M(i2);
            M(3).l(M8, 0, Integer.MIN_VALUE, false);
            M(5).l(M8, 0, Integer.MIN_VALUE, false);
            M(9).l(M8, 0, Integer.MIN_VALUE, false);
            return;
        }
        if (i == 8 && i2 == 8) {
            M(2).l(sdVar.M(2), 0, Integer.MIN_VALUE, false);
            M(4).l(sdVar.M(4), 0, Integer.MIN_VALUE, false);
            M(8).l(sdVar.M(8), 0, Integer.MIN_VALUE, false);
            return;
        }
        if (i == 9 && i2 == 9) {
            M(3).l(sdVar.M(3), 0, Integer.MIN_VALUE, false);
            M(5).l(sdVar.M(5), 0, Integer.MIN_VALUE, false);
            M(9).l(sdVar.M(9), 0, Integer.MIN_VALUE, false);
            return;
        }
        sc M9 = M(i);
        sc M10 = sdVar.M(i2);
        if (M9.k(M10)) {
            if (i == 6) {
                sc M11 = M(3);
                sc M12 = M(5);
                if (M11 != null) {
                    M11.e();
                }
                if (M12 != null) {
                    M12.e();
                }
            } else if (i == 3 || i == 5) {
                sc M13 = M(6);
                if (M13 != null) {
                    M13.e();
                }
                sc M14 = M(7);
                if (M14.e != M10) {
                    M14.e();
                }
                sc c = M(i).c();
                sc M15 = M(9);
                if (M15.j()) {
                    c.e();
                    M15.e();
                }
            } else {
                if (i == 2) {
                    i5 = i;
                }
                sc M16 = M(7);
                if (M16.e != M10) {
                    M16.e();
                }
                sc c2 = M(i5).c();
                sc M17 = M(8);
                if (M17.j()) {
                    c2.e();
                    M17.e();
                }
            }
            M9.l(M10, i3, Integer.MIN_VALUE, false);
        }
    }

    public final void R(int i, sd sdVar, int i2, int i3, int i4) {
        M(i).l(sdVar.M(i2), i3, i4, true);
    }

    public final void S(int i) {
        this.ar[0] = i;
    }

    public final void T(int i) {
        this.ar[1] = i;
    }

    public void U(boolean z) {
        int i;
        sw swVar;
        sv svVar;
        int o = rv.o(this.K);
        int o2 = rv.o(this.L);
        int o3 = rv.o(this.M);
        int o4 = rv.o(this.N);
        if (z && (svVar = this.h) != null) {
            sq sqVar = svVar.h;
            if (sqVar.i) {
                sq sqVar2 = svVar.i;
                if (sqVar2.i) {
                    o = sqVar.f;
                    o3 = sqVar2.f;
                }
            }
        }
        if (z && (swVar = this.i) != null) {
            sq sqVar3 = swVar.h;
            if (sqVar3.i) {
                sq sqVar4 = swVar.i;
                if (sqVar4.i) {
                    o2 = sqVar3.f;
                    o4 = sqVar4.f;
                }
            }
        }
        if (o3 - o < 0 || o4 - o2 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        this.aa = o;
        this.ab = o2;
        if (this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int i2 = o3 - o;
        int[] iArr = this.ar;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.W;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = o4 - o2;
        if (iArr[1] == 1 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i2;
        this.X = i5;
        int i6 = this.ae;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.ad;
        if (i2 < i7) {
            this.W = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.x;
        if (i8 > 0 && i3 == 3) {
            this.W = Math.min(i7, i8);
        }
        int i9 = this.A;
        if (i9 > 0 && iArr[1] == 3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i2 != i10) {
            this.l = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.m = i11;
        }
    }

    public void V(byo byoVar) {
        this.K.m();
        this.L.m();
        this.M.m();
        this.N.m();
        this.O.m();
        this.R.m();
        this.P.m();
        this.Q.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r8 != 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x043d, code lost:
    
        if (r5 == (-1)) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r52.n != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x030e, code lost:
    
        if (r5 == 0) goto L195;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0447 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x060a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a5  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v44, types: [se] */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(rv rvVar, boolean z) {
        sc scVar;
        int i;
        boolean z2;
        ?? r12;
        ?? r20;
        sd sdVar;
        sd sdVar2;
        ?? r5;
        sd sdVar3;
        boolean z3;
        ry ryVar;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        int[] iArr;
        float f;
        ry ryVar2;
        sc scVar2;
        int i4;
        ry ryVar3;
        int i5;
        int i6;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        char c;
        boolean z8;
        boolean z9;
        sc scVar3;
        sc scVar4;
        ry ryVar4;
        sc scVar5;
        ry ryVar5;
        sc scVar6;
        ry ryVar6;
        sc scVar7;
        ry ryVar7;
        int[] iArr2;
        ry ryVar8;
        boolean z10;
        int i9;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ry ryVar9;
        ry ryVar10;
        ry ryVar11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        sc scVar8;
        int i15;
        sc scVar9;
        ?? r27;
        ry ryVar12;
        ry ryVar13;
        rv rvVar2;
        sw swVar;
        sq sqVar;
        sd sdVar4;
        sc scVar10;
        boolean z17;
        sv svVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f2;
        boolean J;
        ?? r122;
        sv svVar2;
        sw swVar2;
        rv rvVar3 = rvVar;
        sc scVar11 = this.K;
        sc scVar12 = this.L;
        ry b = rvVar3.b(scVar11);
        sc scVar13 = this.M;
        ry b2 = rvVar3.b(scVar13);
        ry b3 = rvVar3.b(scVar12);
        sc scVar14 = this.N;
        ry b4 = rvVar3.b(scVar14);
        sc scVar15 = this.O;
        ry b5 = rvVar3.b(scVar15);
        sd sdVar5 = this.V;
        if (sdVar5 != null) {
            int[] iArr3 = sdVar5.ar;
            i = 0;
            z2 = iArr3[0] == 2;
            boolean z18 = iArr3[1] == 2;
            scVar = scVar15;
            int i22 = this.s;
            if (i22 == 1) {
                r12 = false;
            } else if (i22 != 2) {
                r12 = z18;
            } else {
                z2 = false;
                r12 = z18;
            }
            if (this.ai != 8) {
                ArrayList arrayList = this.T;
                r20 = 1;
                int size = arrayList.size();
                int i23 = i;
                while (true) {
                    if (i23 >= size) {
                        boolean[] zArr = this.U;
                        if (!zArr[i] && !zArr[1]) {
                            return;
                        }
                    } else if (((sc) arrayList.get(i23)).i()) {
                        break;
                    } else {
                        i23++;
                    }
                }
            } else {
                r20 = 1;
            }
            if (!this.a) {
                rvVar3.f(b, this.aa);
                rvVar3.f(b2, this.aa + this.W);
                if (z2 && (sdVar = this.V) != null) {
                    se seVar = (se) sdVar;
                    WeakReference weakReference = seVar.aC;
                    if (weakReference == null || weakReference.get() == null || scVar11.a() > ((sc) seVar.aC.get()).a()) {
                        seVar.aC = new WeakReference(scVar11);
                    }
                    WeakReference weakReference2 = seVar.aE;
                    if (weakReference2 == null || weakReference2.get() == null || scVar13.a() > ((sc) seVar.aE.get()).a()) {
                        seVar.aE = new WeakReference(scVar13);
                    }
                }
            }
            if (this.n) {
                rvVar3.f(b3, this.ab);
                rvVar3.f(b4, this.ab + this.X);
                if (scVar.i()) {
                    rvVar3.f(b5, this.ab + this.ac);
                }
                if (r12 != false && (sdVar3 = this.V) != null) {
                    se seVar2 = (se) sdVar3;
                    WeakReference weakReference3 = seVar2.aB;
                    if (weakReference3 == null || weakReference3.get() == null || scVar12.a() > ((sc) seVar2.aB.get()).a()) {
                        seVar2.aB = new WeakReference(scVar12);
                    }
                    WeakReference weakReference4 = seVar2.aD;
                    if (weakReference4 == null || weakReference4.get() == null || scVar14.a() > ((sc) seVar2.aD.get()).a()) {
                        seVar2.aD = new WeakReference(scVar14);
                    }
                }
            }
            if (this.a && this.n) {
                sdVar2 = this;
                r5 = i;
                sdVar2.a = r5;
                sdVar2.n = r5;
            }
            if (z || (svVar2 = this.h) == null || (swVar2 = this.i) == null) {
                z3 = r12;
            } else {
                sq sqVar2 = svVar2.h;
                z3 = r12;
                if (sqVar2.i && svVar2.i.i && swVar2.h.i && swVar2.i.i) {
                    rvVar3.f(b, sqVar2.f);
                    rvVar3.f(b2, this.h.i.f);
                    rvVar3.f(b3, this.i.h.f);
                    rvVar3.f(b4, this.i.i.f);
                    rvVar3.f(b5, this.i.a.f);
                    if (this.V != null) {
                        if (z2 && this.j[i] && !J()) {
                            rvVar3.g(rvVar3.b(this.V.M), b2, i, 8);
                        }
                        if (z3 && this.j[r20] && !K()) {
                            r5 = 0;
                            rvVar3.g(rvVar3.b(this.V.N), b4, 0, 8);
                            sdVar2 = this;
                            sdVar2.a = r5;
                            sdVar2.n = r5;
                        }
                    }
                    sdVar2 = this;
                    r5 = 0;
                    sdVar2.a = r5;
                    sdVar2.n = r5;
                }
            }
            if (this.V == null) {
                if (a(0)) {
                    ((se) this.V).a(this, 0);
                    J = r20;
                    r122 = J;
                } else {
                    J = J();
                    r122 = r20;
                }
                if (a(r122)) {
                    ((se) this.V).a(this, r122);
                    z5 = true;
                } else {
                    z5 = K();
                }
                if (!J && z2 && this.ai != 8 && scVar11.e == null && scVar13.e == null) {
                    ryVar = b3;
                    rvVar3.g(rvVar3.b(this.V.M), b2, 0, 1);
                } else {
                    ryVar = b3;
                }
                if (z5) {
                    z4 = J;
                } else if (z3) {
                    if (this.ai != 8 && scVar12.e == null && scVar14.e == null && scVar == null) {
                        rvVar3.g(rvVar3.b(this.V.N), b4, 0, 1);
                    }
                    z4 = J;
                    z3 = true;
                } else {
                    z4 = J;
                    z3 = false;
                }
            } else {
                ryVar = b3;
                z4 = false;
                z5 = false;
            }
            i2 = this.W;
            i3 = this.ad;
            if (i2 >= i3) {
                i3 = i2;
            }
            int i24 = this.X;
            int i25 = this.ae;
            int i26 = i24 < i25 ? i24 : i25;
            iArr = this.ar;
            int i27 = iArr[0];
            boolean z19 = z4;
            boolean z20 = i27 == 3;
            int i28 = iArr[1];
            boolean z21 = i28 == 3;
            int i29 = this.Z;
            this.C = i29;
            f = this.Y;
            this.D = f;
            int i30 = this.t;
            int i31 = this.u;
            if (f <= 0.0f) {
                ryVar2 = b5;
                if (this.ai != 8) {
                    if (i27 != 3) {
                        i16 = i27;
                    } else {
                        if (i30 == 0) {
                            i17 = 3;
                            i16 = 3;
                            if (i28 == 3) {
                                scVar2 = scVar11;
                                i18 = i28;
                                i19 = i31;
                            } else if (i31 == 0) {
                                i19 = 3;
                                scVar2 = scVar11;
                                i18 = 3;
                            } else {
                                scVar2 = scVar11;
                                i19 = i31;
                                i18 = 3;
                            }
                            if (i16 == 3 || i18 != 3 || i17 != 3) {
                                i20 = i17;
                                i21 = i20;
                            } else {
                                if (i19 == 3) {
                                    if (i29 == -1) {
                                        if (!z20 || z21) {
                                            if (!z20 && z21) {
                                                this.C = 1;
                                                this.D = 1.0f / f;
                                            }
                                            if (this.C == 1 && (!scVar2.j() || !scVar13.j())) {
                                                this.C = 0;
                                            }
                                        } else {
                                            this.C = 0;
                                            if (!scVar12.j() || !scVar14.j()) {
                                                this.C = 1;
                                            }
                                            if (this.C == 1) {
                                                this.C = 0;
                                            }
                                        }
                                    }
                                    if (this.C == -1 && (!scVar12.j() || !scVar14.j() || !scVar2.j() || !scVar13.j())) {
                                        if (scVar12.j() && scVar14.j()) {
                                            this.C = 0;
                                        } else if (scVar2.j() && scVar13.j()) {
                                            this.D = 1.0f / this.D;
                                            this.C = 1;
                                        }
                                    }
                                    i29 = this.C;
                                    if (i29 == -1) {
                                        int i32 = this.w;
                                        if (i32 > 0 && this.z == 0) {
                                            this.C = 0;
                                            ry ryVar14 = ryVar;
                                            i7 = i19;
                                            ryVar3 = ryVar14;
                                            i6 = i17;
                                            i5 = i26;
                                            i4 = 0;
                                            i29 = 0;
                                        } else if (i32 == 0 && this.z > 0) {
                                            this.D = 1.0f / this.D;
                                            this.C = 1;
                                            ry ryVar15 = ryVar;
                                            i7 = i19;
                                            ryVar3 = ryVar15;
                                            i6 = i17;
                                            i5 = i26;
                                            i4 = 1;
                                            i29 = 1;
                                        }
                                        z6 = true;
                                        int[] iArr4 = this.v;
                                        iArr4[0] = i6;
                                        iArr4[1] = i7;
                                        if (!z6) {
                                            if (i29 != 0) {
                                                i8 = -1;
                                            } else {
                                                i8 = -1;
                                            }
                                            z7 = true;
                                            if (z6 || !(i4 == 1 || i4 == i8)) {
                                                c = 0;
                                                z8 = false;
                                            } else {
                                                c = 0;
                                                z8 = true;
                                            }
                                            z9 = iArr[c] != 2 && (this instanceof se);
                                            if (true == z9) {
                                                i3 = 0;
                                            }
                                            scVar3 = this.R;
                                            boolean z22 = !scVar3.j();
                                            boolean[] zArr2 = this.U;
                                            boolean z23 = zArr2[0];
                                            boolean z24 = zArr2[1];
                                            if (this.q == 2 && !this.a) {
                                                if (!z || (svVar = this.h) == null) {
                                                    scVar4 = scVar3;
                                                } else {
                                                    sq sqVar3 = svVar.h;
                                                    scVar4 = scVar3;
                                                    if (sqVar3.i && svVar.i.i) {
                                                        rvVar3.f(b, sqVar3.f);
                                                        rvVar3.f(b2, this.h.i.f);
                                                        if (this.V != null) {
                                                            if (z2) {
                                                                if (this.j[0] && !J()) {
                                                                    rvVar3.g(rvVar3.b(this.V.M), b2, 0, 8);
                                                                }
                                                                ryVar7 = b;
                                                                ryVar6 = ryVar3;
                                                                z11 = z5;
                                                                scVar5 = scVar;
                                                                scVar7 = scVar12;
                                                                z12 = z19;
                                                                scVar6 = scVar14;
                                                                ryVar5 = b4;
                                                                ryVar4 = ryVar2;
                                                                z15 = true;
                                                            } else {
                                                                ryVar7 = b;
                                                                ryVar6 = ryVar3;
                                                                z11 = z5;
                                                                scVar5 = scVar;
                                                                scVar7 = scVar12;
                                                                z12 = z19;
                                                                scVar6 = scVar14;
                                                                ryVar5 = b4;
                                                                ryVar4 = ryVar2;
                                                                z15 = false;
                                                            }
                                                            ryVar8 = b2;
                                                            z16 = z22;
                                                            z13 = z3;
                                                            iArr2 = iArr;
                                                            i9 = i6;
                                                            if (z && (swVar = this.i) != null) {
                                                                sqVar = swVar.h;
                                                                if (sqVar.i && swVar.i.i) {
                                                                    int i33 = sqVar.f;
                                                                    ryVar9 = ryVar6;
                                                                    rvVar3.f(ryVar9, i33);
                                                                    ryVar10 = ryVar5;
                                                                    rvVar3.f(ryVar10, this.i.i.f);
                                                                    ryVar11 = ryVar4;
                                                                    rvVar3.f(ryVar11, this.i.a.f);
                                                                    sdVar4 = this.V;
                                                                    if (sdVar4 == null && !z11 && z13) {
                                                                        i11 = 1;
                                                                        i11 = 1;
                                                                        if (this.j[1]) {
                                                                            i10 = 0;
                                                                            i12 = 8;
                                                                            rvVar3.g(rvVar3.b(sdVar4.N), ryVar10, 0, 8);
                                                                            i13 = i10;
                                                                            if (this.r == 2 || i13 == 0 || this.n) {
                                                                                sdVar2 = this;
                                                                                ryVar12 = ryVar9;
                                                                                ryVar13 = ryVar10;
                                                                            } else {
                                                                                int i34 = (iArr2[i11] == 2 || !(this instanceof se)) ? i10 : i11;
                                                                                int i35 = i11 != i34 ? i10 : i5;
                                                                                sd sdVar6 = this.V;
                                                                                ry b6 = sdVar6 == null ? rvVar3.b(sdVar6.N) : null;
                                                                                sd sdVar7 = this.V;
                                                                                ry b7 = sdVar7 != null ? rvVar3.b(sdVar7.L) : null;
                                                                                i14 = this.ac;
                                                                                int i36 = i11;
                                                                                if (i14 <= 0 || this.ai == i12) {
                                                                                    scVar8 = scVar5;
                                                                                    if (scVar8.e == null) {
                                                                                        rvVar3.m(ryVar11, ryVar9, i14, i12);
                                                                                        rvVar3.m(ryVar11, rvVar3.b(scVar8.e), scVar8.b(), i12);
                                                                                        if (z13) {
                                                                                            scVar9 = scVar6;
                                                                                            rvVar3.g(b6, rvVar3.b(scVar9), i10, 5);
                                                                                        } else {
                                                                                            scVar9 = scVar6;
                                                                                        }
                                                                                        i15 = i10;
                                                                                        r27 = i15;
                                                                                    } else {
                                                                                        i15 = i10;
                                                                                        scVar9 = scVar6;
                                                                                        if (this.ai == i12) {
                                                                                            rvVar3.m(ryVar11, ryVar9, scVar8.b(), i12);
                                                                                            r27 = z16;
                                                                                        } else {
                                                                                            rvVar3.m(ryVar11, ryVar9, i14, i12);
                                                                                            r27 = z16;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i15 = i10;
                                                                                    scVar9 = scVar6;
                                                                                    r27 = z16;
                                                                                }
                                                                                boolean z25 = this.j[i36];
                                                                                int i37 = iArr2[i36];
                                                                                sc scVar16 = scVar9;
                                                                                int i38 = this.ab;
                                                                                int i39 = this.ae;
                                                                                int i40 = this.E[i36];
                                                                                float f3 = this.ag;
                                                                                ?? r16 = i34;
                                                                                ?? r18 = iArr2[i15] != 3 ? i36 : i15;
                                                                                ryVar12 = ryVar9;
                                                                                ryVar13 = ryVar10;
                                                                                c(rvVar, false, z13, z15, z25, b7, b6, i37, r16, scVar7, scVar16, i38, i35, i39, i40, f3, z8, r18, z11, z12, z24, i7, i9, this.z, this.A, this.B, r27);
                                                                                sdVar2 = this;
                                                                            }
                                                                            if (z6) {
                                                                                int i41 = sdVar2.C;
                                                                                float f4 = sdVar2.D;
                                                                                if (i41 != 1) {
                                                                                    rvVar.n(ryVar8, ryVar7, ryVar13, ryVar12, f4);
                                                                                    rvVar2 = rvVar;
                                                                                    if (scVar4.j()) {
                                                                                        sc scVar17 = scVar4;
                                                                                        sd sdVar8 = scVar17.e.d;
                                                                                        float radians = (float) Math.toRadians(sdVar2.F + 90.0f);
                                                                                        int b8 = scVar17.b();
                                                                                        ry b9 = rvVar2.b(sdVar2.M(2));
                                                                                        ry b10 = rvVar2.b(sdVar2.M(3));
                                                                                        ry b11 = rvVar2.b(sdVar2.M(4));
                                                                                        ry b12 = rvVar2.b(sdVar2.M(5));
                                                                                        ry b13 = rvVar2.b(sdVar8.M(2));
                                                                                        ry b14 = rvVar2.b(sdVar8.M(3));
                                                                                        ry b15 = rvVar2.b(sdVar8.M(4));
                                                                                        ry b16 = rvVar2.b(sdVar8.M(5));
                                                                                        ru a = rvVar2.a();
                                                                                        double d = b8;
                                                                                        double d2 = radians;
                                                                                        a.j(b10, b12, b14, b16, (float) (Math.sin(d2) * d));
                                                                                        rvVar2.e(a);
                                                                                        ru a2 = rvVar2.a();
                                                                                        a2.j(b9, b11, b13, b15, (float) (Math.cos(d2) * d));
                                                                                        rvVar2.e(a2);
                                                                                    }
                                                                                    r5 = 0;
                                                                                    sdVar2.a = r5;
                                                                                    sdVar2.n = r5;
                                                                                }
                                                                                rvVar.n(ryVar13, ryVar12, ryVar8, ryVar7, f4);
                                                                            }
                                                                            rvVar2 = rvVar;
                                                                            if (scVar4.j()) {
                                                                            }
                                                                            r5 = 0;
                                                                            sdVar2.a = r5;
                                                                            sdVar2.n = r5;
                                                                        }
                                                                        i10 = 0;
                                                                    } else {
                                                                        i10 = 0;
                                                                        i11 = 1;
                                                                    }
                                                                    i12 = 8;
                                                                    i13 = i10;
                                                                    if (this.r == 2) {
                                                                        if (iArr2[i11] == 2) {
                                                                        }
                                                                        if (i11 != i34) {
                                                                        }
                                                                        sd sdVar62 = this.V;
                                                                        if (sdVar62 == null) {
                                                                        }
                                                                        sd sdVar72 = this.V;
                                                                        if (sdVar72 != null) {
                                                                        }
                                                                        i14 = this.ac;
                                                                        int i362 = i11;
                                                                        if (i14 <= 0) {
                                                                        }
                                                                        scVar8 = scVar5;
                                                                        if (scVar8.e == null) {
                                                                        }
                                                                        boolean z252 = this.j[i362];
                                                                        int i372 = iArr2[i362];
                                                                        sc scVar162 = scVar9;
                                                                        int i382 = this.ab;
                                                                        int i392 = this.ae;
                                                                        int i402 = this.E[i362];
                                                                        float f32 = this.ag;
                                                                        ?? r162 = i34;
                                                                        if (iArr2[i15] != 3) {
                                                                        }
                                                                        ryVar12 = ryVar9;
                                                                        ryVar13 = ryVar10;
                                                                        c(rvVar, false, z13, z15, z252, b7, b6, i372, r162, scVar7, scVar162, i382, i35, i392, i402, f32, z8, r18, z11, z12, z24, i7, i9, this.z, this.A, this.B, r27);
                                                                        sdVar2 = this;
                                                                        if (z6) {
                                                                        }
                                                                        rvVar2 = rvVar;
                                                                        if (scVar4.j()) {
                                                                        }
                                                                        r5 = 0;
                                                                        sdVar2.a = r5;
                                                                        sdVar2.n = r5;
                                                                    }
                                                                    sdVar2 = this;
                                                                    ryVar12 = ryVar9;
                                                                    ryVar13 = ryVar10;
                                                                    if (z6) {
                                                                    }
                                                                    rvVar2 = rvVar;
                                                                    if (scVar4.j()) {
                                                                    }
                                                                    r5 = 0;
                                                                    sdVar2.a = r5;
                                                                    sdVar2.n = r5;
                                                                }
                                                            }
                                                            ryVar9 = ryVar6;
                                                            ryVar10 = ryVar5;
                                                            ryVar11 = ryVar4;
                                                            i10 = 0;
                                                            i11 = 1;
                                                            i12 = 8;
                                                            i13 = 1;
                                                            if (this.r == 2) {
                                                            }
                                                            sdVar2 = this;
                                                            ryVar12 = ryVar9;
                                                            ryVar13 = ryVar10;
                                                            if (z6) {
                                                            }
                                                            rvVar2 = rvVar;
                                                            if (scVar4.j()) {
                                                            }
                                                            r5 = 0;
                                                            sdVar2.a = r5;
                                                            sdVar2.n = r5;
                                                        }
                                                    }
                                                }
                                                sd sdVar9 = this.V;
                                                ry b17 = sdVar9 != null ? rvVar3.b(sdVar9.M) : null;
                                                sd sdVar10 = this.V;
                                                ry b18 = sdVar10 != null ? rvVar3.b(sdVar10.K) : null;
                                                boolean z26 = this.j[0];
                                                z12 = z19;
                                                boolean z27 = z22;
                                                int i42 = iArr[0];
                                                z11 = z5;
                                                int i43 = this.aa;
                                                ryVar7 = b;
                                                z14 = z2;
                                                int i44 = this.ad;
                                                int i45 = this.E[0];
                                                float f5 = this.af;
                                                ry ryVar16 = b17;
                                                if (iArr[1] == 3) {
                                                    scVar10 = scVar;
                                                    z17 = true;
                                                } else {
                                                    scVar10 = scVar;
                                                    z17 = false;
                                                }
                                                scVar7 = scVar12;
                                                ryVar6 = ryVar3;
                                                scVar6 = scVar14;
                                                ryVar5 = b4;
                                                ryVar4 = ryVar2;
                                                scVar5 = scVar10;
                                                ryVar8 = b2;
                                                z13 = z3;
                                                iArr2 = iArr;
                                                i9 = i6;
                                                rvVar3 = rvVar;
                                                c(rvVar3, true, z14, z13, z26, b18, ryVar16, i42, z9, scVar2, scVar13, i43, i3, i44, i45, f5, z7, z17, z12, z11, z23, i9, i7, this.w, this.x, this.y, z27);
                                                z10 = z27;
                                                z15 = z14;
                                                z16 = z10;
                                                if (z) {
                                                    sqVar = swVar.h;
                                                    if (sqVar.i) {
                                                        int i332 = sqVar.f;
                                                        ryVar9 = ryVar6;
                                                        rvVar3.f(ryVar9, i332);
                                                        ryVar10 = ryVar5;
                                                        rvVar3.f(ryVar10, this.i.i.f);
                                                        ryVar11 = ryVar4;
                                                        rvVar3.f(ryVar11, this.i.a.f);
                                                        sdVar4 = this.V;
                                                        if (sdVar4 == null) {
                                                        }
                                                        i10 = 0;
                                                        i11 = 1;
                                                        i12 = 8;
                                                        i13 = i10;
                                                        if (this.r == 2) {
                                                        }
                                                        sdVar2 = this;
                                                        ryVar12 = ryVar9;
                                                        ryVar13 = ryVar10;
                                                        if (z6) {
                                                        }
                                                        rvVar2 = rvVar;
                                                        if (scVar4.j()) {
                                                        }
                                                        r5 = 0;
                                                        sdVar2.a = r5;
                                                        sdVar2.n = r5;
                                                    }
                                                }
                                                ryVar9 = ryVar6;
                                                ryVar10 = ryVar5;
                                                ryVar11 = ryVar4;
                                                i10 = 0;
                                                i11 = 1;
                                                i12 = 8;
                                                i13 = 1;
                                                if (this.r == 2) {
                                                }
                                                sdVar2 = this;
                                                ryVar12 = ryVar9;
                                                ryVar13 = ryVar10;
                                                if (z6) {
                                                }
                                                rvVar2 = rvVar;
                                                if (scVar4.j()) {
                                                }
                                                r5 = 0;
                                                sdVar2.a = r5;
                                                sdVar2.n = r5;
                                            }
                                            scVar4 = scVar3;
                                            ryVar7 = b;
                                            ryVar6 = ryVar3;
                                            z11 = z5;
                                            z14 = z2;
                                            scVar5 = scVar;
                                            scVar7 = scVar12;
                                            z12 = z19;
                                            scVar6 = scVar14;
                                            ryVar5 = b4;
                                            ryVar4 = ryVar2;
                                            ryVar8 = b2;
                                            z10 = z22;
                                            z13 = z3;
                                            iArr2 = iArr;
                                            i9 = i6;
                                            z15 = z14;
                                            z16 = z10;
                                            if (z) {
                                            }
                                            ryVar9 = ryVar6;
                                            ryVar10 = ryVar5;
                                            ryVar11 = ryVar4;
                                            i10 = 0;
                                            i11 = 1;
                                            i12 = 8;
                                            i13 = 1;
                                            if (this.r == 2) {
                                            }
                                            sdVar2 = this;
                                            ryVar12 = ryVar9;
                                            ryVar13 = ryVar10;
                                            if (z6) {
                                            }
                                            rvVar2 = rvVar;
                                            if (scVar4.j()) {
                                            }
                                            r5 = 0;
                                            sdVar2.a = r5;
                                            sdVar2.n = r5;
                                        }
                                        i8 = -1;
                                        z7 = false;
                                        if (z6) {
                                        }
                                        c = 0;
                                        z8 = false;
                                        if (iArr[c] != 2) {
                                        }
                                        if (true == z9) {
                                        }
                                        scVar3 = this.R;
                                        boolean z222 = !scVar3.j();
                                        boolean[] zArr22 = this.U;
                                        boolean z232 = zArr22[0];
                                        boolean z242 = zArr22[1];
                                        if (this.q == 2) {
                                        }
                                        scVar4 = scVar3;
                                        ryVar7 = b;
                                        ryVar6 = ryVar3;
                                        z11 = z5;
                                        z14 = z2;
                                        scVar5 = scVar;
                                        scVar7 = scVar12;
                                        z12 = z19;
                                        scVar6 = scVar14;
                                        ryVar5 = b4;
                                        ryVar4 = ryVar2;
                                        ryVar8 = b2;
                                        z10 = z222;
                                        z13 = z3;
                                        iArr2 = iArr;
                                        i9 = i6;
                                        z15 = z14;
                                        z16 = z10;
                                        if (z) {
                                        }
                                        ryVar9 = ryVar6;
                                        ryVar10 = ryVar5;
                                        ryVar11 = ryVar4;
                                        i10 = 0;
                                        i11 = 1;
                                        i12 = 8;
                                        i13 = 1;
                                        if (this.r == 2) {
                                        }
                                        sdVar2 = this;
                                        ryVar12 = ryVar9;
                                        ryVar13 = ryVar10;
                                        if (z6) {
                                        }
                                        rvVar2 = rvVar;
                                        if (scVar4.j()) {
                                        }
                                        r5 = 0;
                                        sdVar2.a = r5;
                                        sdVar2.n = r5;
                                    }
                                    ry ryVar17 = ryVar;
                                    i7 = i19;
                                    ryVar3 = ryVar17;
                                    i6 = i17;
                                    i4 = i29;
                                    i5 = i26;
                                    z6 = true;
                                    int[] iArr42 = this.v;
                                    iArr42[0] = i6;
                                    iArr42[1] = i7;
                                    if (!z6) {
                                    }
                                    z7 = false;
                                    if (z6) {
                                    }
                                    c = 0;
                                    z8 = false;
                                    if (iArr[c] != 2) {
                                    }
                                    if (true == z9) {
                                    }
                                    scVar3 = this.R;
                                    boolean z2222 = !scVar3.j();
                                    boolean[] zArr222 = this.U;
                                    boolean z2322 = zArr222[0];
                                    boolean z2422 = zArr222[1];
                                    if (this.q == 2) {
                                    }
                                    scVar4 = scVar3;
                                    ryVar7 = b;
                                    ryVar6 = ryVar3;
                                    z11 = z5;
                                    z14 = z2;
                                    scVar5 = scVar;
                                    scVar7 = scVar12;
                                    z12 = z19;
                                    scVar6 = scVar14;
                                    ryVar5 = b4;
                                    ryVar4 = ryVar2;
                                    ryVar8 = b2;
                                    z10 = z2222;
                                    z13 = z3;
                                    iArr2 = iArr;
                                    i9 = i6;
                                    z15 = z14;
                                    z16 = z10;
                                    if (z) {
                                    }
                                    ryVar9 = ryVar6;
                                    ryVar10 = ryVar5;
                                    ryVar11 = ryVar4;
                                    i10 = 0;
                                    i11 = 1;
                                    i12 = 8;
                                    i13 = 1;
                                    if (this.r == 2) {
                                    }
                                    sdVar2 = this;
                                    ryVar12 = ryVar9;
                                    ryVar13 = ryVar10;
                                    if (z6) {
                                    }
                                    rvVar2 = rvVar;
                                    if (scVar4.j()) {
                                    }
                                    r5 = 0;
                                    sdVar2.a = r5;
                                    sdVar2.n = r5;
                                }
                                i21 = i17;
                                i20 = 3;
                            }
                            if (i16 != 3 && i20 == 3) {
                                this.C = 0;
                                int i46 = (int) (f * i24);
                                if (i18 != 3) {
                                    ry ryVar18 = ryVar;
                                    i7 = i19;
                                    ryVar3 = ryVar18;
                                    i3 = i46;
                                    i5 = i26;
                                    i4 = 0;
                                    i29 = 0;
                                    i6 = 4;
                                    z6 = false;
                                    int[] iArr422 = this.v;
                                    iArr422[0] = i6;
                                    iArr422[1] = i7;
                                    if (!z6) {
                                    }
                                    z7 = false;
                                    if (z6) {
                                    }
                                    c = 0;
                                    z8 = false;
                                    if (iArr[c] != 2) {
                                    }
                                    if (true == z9) {
                                    }
                                    scVar3 = this.R;
                                    boolean z22222 = !scVar3.j();
                                    boolean[] zArr2222 = this.U;
                                    boolean z23222 = zArr2222[0];
                                    boolean z24222 = zArr2222[1];
                                    if (this.q == 2) {
                                    }
                                    scVar4 = scVar3;
                                    ryVar7 = b;
                                    ryVar6 = ryVar3;
                                    z11 = z5;
                                    z14 = z2;
                                    scVar5 = scVar;
                                    scVar7 = scVar12;
                                    z12 = z19;
                                    scVar6 = scVar14;
                                    ryVar5 = b4;
                                    ryVar4 = ryVar2;
                                    ryVar8 = b2;
                                    z10 = z22222;
                                    z13 = z3;
                                    iArr2 = iArr;
                                    i9 = i6;
                                    z15 = z14;
                                    z16 = z10;
                                    if (z) {
                                    }
                                    ryVar9 = ryVar6;
                                    ryVar10 = ryVar5;
                                    ryVar11 = ryVar4;
                                    i10 = 0;
                                    i11 = 1;
                                    i12 = 8;
                                    i13 = 1;
                                    if (this.r == 2) {
                                    }
                                    sdVar2 = this;
                                    ryVar12 = ryVar9;
                                    ryVar13 = ryVar10;
                                    if (z6) {
                                    }
                                    rvVar2 = rvVar;
                                    if (scVar4.j()) {
                                    }
                                    r5 = 0;
                                    sdVar2.a = r5;
                                    sdVar2.n = r5;
                                }
                                ry ryVar19 = ryVar;
                                i7 = i19;
                                ryVar3 = ryVar19;
                                i3 = i46;
                                i6 = i21;
                                i4 = 0;
                                i29 = 0;
                            } else {
                                if (i18 != 3 && i19 == 3) {
                                    this.C = 1;
                                    if (i29 == -1) {
                                        f2 = 1.0f / f;
                                        this.D = f2;
                                    } else {
                                        f2 = f;
                                    }
                                    int i47 = (int) (f2 * i2);
                                    if (i16 != 3) {
                                        ryVar3 = ryVar;
                                        i6 = i21;
                                        i4 = 1;
                                        i7 = 4;
                                        z6 = false;
                                    } else {
                                        ry ryVar20 = ryVar;
                                        i7 = i19;
                                        ryVar3 = ryVar20;
                                        i6 = i21;
                                        i4 = 1;
                                        z6 = true;
                                    }
                                    i5 = i47;
                                    i29 = 1;
                                    int[] iArr4222 = this.v;
                                    iArr4222[0] = i6;
                                    iArr4222[1] = i7;
                                    if (!z6) {
                                    }
                                    z7 = false;
                                    if (z6) {
                                    }
                                    c = 0;
                                    z8 = false;
                                    if (iArr[c] != 2) {
                                    }
                                    if (true == z9) {
                                    }
                                    scVar3 = this.R;
                                    boolean z222222 = !scVar3.j();
                                    boolean[] zArr22222 = this.U;
                                    boolean z232222 = zArr22222[0];
                                    boolean z242222 = zArr22222[1];
                                    if (this.q == 2) {
                                    }
                                    scVar4 = scVar3;
                                    ryVar7 = b;
                                    ryVar6 = ryVar3;
                                    z11 = z5;
                                    z14 = z2;
                                    scVar5 = scVar;
                                    scVar7 = scVar12;
                                    z12 = z19;
                                    scVar6 = scVar14;
                                    ryVar5 = b4;
                                    ryVar4 = ryVar2;
                                    ryVar8 = b2;
                                    z10 = z222222;
                                    z13 = z3;
                                    iArr2 = iArr;
                                    i9 = i6;
                                    z15 = z14;
                                    z16 = z10;
                                    if (z) {
                                    }
                                    ryVar9 = ryVar6;
                                    ryVar10 = ryVar5;
                                    ryVar11 = ryVar4;
                                    i10 = 0;
                                    i11 = 1;
                                    i12 = 8;
                                    i13 = 1;
                                    if (this.r == 2) {
                                    }
                                    sdVar2 = this;
                                    ryVar12 = ryVar9;
                                    ryVar13 = ryVar10;
                                    if (z6) {
                                    }
                                    rvVar2 = rvVar;
                                    if (scVar4.j()) {
                                    }
                                    r5 = 0;
                                    sdVar2.a = r5;
                                    sdVar2.n = r5;
                                }
                                ry ryVar21 = ryVar;
                                i7 = i19;
                                ryVar3 = ryVar21;
                                i4 = i29;
                                i6 = i21;
                            }
                            z6 = true;
                            i5 = i26;
                            int[] iArr42222 = this.v;
                            iArr42222[0] = i6;
                            iArr42222[1] = i7;
                            if (!z6) {
                            }
                            z7 = false;
                            if (z6) {
                            }
                            c = 0;
                            z8 = false;
                            if (iArr[c] != 2) {
                            }
                            if (true == z9) {
                            }
                            scVar3 = this.R;
                            boolean z2222222 = !scVar3.j();
                            boolean[] zArr222222 = this.U;
                            boolean z2322222 = zArr222222[0];
                            boolean z2422222 = zArr222222[1];
                            if (this.q == 2) {
                            }
                            scVar4 = scVar3;
                            ryVar7 = b;
                            ryVar6 = ryVar3;
                            z11 = z5;
                            z14 = z2;
                            scVar5 = scVar;
                            scVar7 = scVar12;
                            z12 = z19;
                            scVar6 = scVar14;
                            ryVar5 = b4;
                            ryVar4 = ryVar2;
                            ryVar8 = b2;
                            z10 = z2222222;
                            z13 = z3;
                            iArr2 = iArr;
                            i9 = i6;
                            z15 = z14;
                            z16 = z10;
                            if (z) {
                            }
                            ryVar9 = ryVar6;
                            ryVar10 = ryVar5;
                            ryVar11 = ryVar4;
                            i10 = 0;
                            i11 = 1;
                            i12 = 8;
                            i13 = 1;
                            if (this.r == 2) {
                            }
                            sdVar2 = this;
                            ryVar12 = ryVar9;
                            ryVar13 = ryVar10;
                            if (z6) {
                            }
                            rvVar2 = rvVar;
                            if (scVar4.j()) {
                            }
                            r5 = 0;
                            sdVar2.a = r5;
                            sdVar2.n = r5;
                        }
                        i16 = 3;
                    }
                    i17 = i30;
                    if (i28 == 3) {
                    }
                    if (i16 == 3) {
                    }
                    i20 = i17;
                    i21 = i20;
                    if (i16 != 3) {
                    }
                    if (i18 != 3) {
                    }
                    ry ryVar212 = ryVar;
                    i7 = i19;
                    ryVar3 = ryVar212;
                    i4 = i29;
                    i6 = i21;
                    z6 = true;
                    i5 = i26;
                    int[] iArr422222 = this.v;
                    iArr422222[0] = i6;
                    iArr422222[1] = i7;
                    if (!z6) {
                    }
                    z7 = false;
                    if (z6) {
                    }
                    c = 0;
                    z8 = false;
                    if (iArr[c] != 2) {
                    }
                    if (true == z9) {
                    }
                    scVar3 = this.R;
                    boolean z22222222 = !scVar3.j();
                    boolean[] zArr2222222 = this.U;
                    boolean z23222222 = zArr2222222[0];
                    boolean z24222222 = zArr2222222[1];
                    if (this.q == 2) {
                    }
                    scVar4 = scVar3;
                    ryVar7 = b;
                    ryVar6 = ryVar3;
                    z11 = z5;
                    z14 = z2;
                    scVar5 = scVar;
                    scVar7 = scVar12;
                    z12 = z19;
                    scVar6 = scVar14;
                    ryVar5 = b4;
                    ryVar4 = ryVar2;
                    ryVar8 = b2;
                    z10 = z22222222;
                    z13 = z3;
                    iArr2 = iArr;
                    i9 = i6;
                    z15 = z14;
                    z16 = z10;
                    if (z) {
                    }
                    ryVar9 = ryVar6;
                    ryVar10 = ryVar5;
                    ryVar11 = ryVar4;
                    i10 = 0;
                    i11 = 1;
                    i12 = 8;
                    i13 = 1;
                    if (this.r == 2) {
                    }
                    sdVar2 = this;
                    ryVar12 = ryVar9;
                    ryVar13 = ryVar10;
                    if (z6) {
                    }
                    rvVar2 = rvVar;
                    if (scVar4.j()) {
                    }
                    r5 = 0;
                    sdVar2.a = r5;
                    sdVar2.n = r5;
                }
            } else {
                ryVar2 = b5;
            }
            scVar2 = scVar11;
            i4 = i29;
            ryVar3 = ryVar;
            i5 = i26;
            i6 = i30;
            i7 = i31;
            z6 = false;
            int[] iArr4222222 = this.v;
            iArr4222222[0] = i6;
            iArr4222222[1] = i7;
            if (!z6) {
            }
            z7 = false;
            if (z6) {
            }
            c = 0;
            z8 = false;
            if (iArr[c] != 2) {
            }
            if (true == z9) {
            }
            scVar3 = this.R;
            boolean z222222222 = !scVar3.j();
            boolean[] zArr22222222 = this.U;
            boolean z232222222 = zArr22222222[0];
            boolean z242222222 = zArr22222222[1];
            if (this.q == 2) {
            }
            scVar4 = scVar3;
            ryVar7 = b;
            ryVar6 = ryVar3;
            z11 = z5;
            z14 = z2;
            scVar5 = scVar;
            scVar7 = scVar12;
            z12 = z19;
            scVar6 = scVar14;
            ryVar5 = b4;
            ryVar4 = ryVar2;
            ryVar8 = b2;
            z10 = z222222222;
            z13 = z3;
            iArr2 = iArr;
            i9 = i6;
            z15 = z14;
            z16 = z10;
            if (z) {
            }
            ryVar9 = ryVar6;
            ryVar10 = ryVar5;
            ryVar11 = ryVar4;
            i10 = 0;
            i11 = 1;
            i12 = 8;
            i13 = 1;
            if (this.r == 2) {
            }
            sdVar2 = this;
            ryVar12 = ryVar9;
            ryVar13 = ryVar10;
            if (z6) {
            }
            rvVar2 = rvVar;
            if (scVar4.j()) {
            }
            r5 = 0;
            sdVar2.a = r5;
            sdVar2.n = r5;
        }
        scVar = scVar15;
        i = 0;
        int i48 = i;
        z2 = i48 == true ? 1 : 0;
        r12 = i48;
        if (this.ai != 8) {
        }
        if (!this.a) {
        }
        if (this.n) {
        }
        if (this.a) {
            sdVar2 = this;
            r5 = i;
            sdVar2.a = r5;
            sdVar2.n = r5;
        }
        if (z) {
        }
        z3 = r12;
        if (this.V == null) {
        }
        i2 = this.W;
        i3 = this.ad;
        if (i2 >= i3) {
        }
        int i242 = this.X;
        int i252 = this.ae;
        if (i242 < i252) {
        }
        iArr = this.ar;
        int i272 = iArr[0];
        boolean z192 = z4;
        if (i272 == 3) {
        }
        int i282 = iArr[1];
        if (i282 == 3) {
        }
        int i292 = this.Z;
        this.C = i292;
        f = this.Y;
        this.D = f;
        int i302 = this.t;
        int i312 = this.u;
        if (f <= 0.0f) {
        }
        scVar2 = scVar11;
        i4 = i292;
        ryVar3 = ryVar;
        i5 = i26;
        i6 = i302;
        i7 = i312;
        z6 = false;
        int[] iArr42222222 = this.v;
        iArr42222222[0] = i6;
        iArr42222222[1] = i7;
        if (!z6) {
        }
        z7 = false;
        if (z6) {
        }
        c = 0;
        z8 = false;
        if (iArr[c] != 2) {
        }
        if (true == z9) {
        }
        scVar3 = this.R;
        boolean z2222222222 = !scVar3.j();
        boolean[] zArr222222222 = this.U;
        boolean z2322222222 = zArr222222222[0];
        boolean z2422222222 = zArr222222222[1];
        if (this.q == 2) {
        }
        scVar4 = scVar3;
        ryVar7 = b;
        ryVar6 = ryVar3;
        z11 = z5;
        z14 = z2;
        scVar5 = scVar;
        scVar7 = scVar12;
        z12 = z192;
        scVar6 = scVar14;
        ryVar5 = b4;
        ryVar4 = ryVar2;
        ryVar8 = b2;
        z10 = z2222222222;
        z13 = z3;
        iArr2 = iArr;
        i9 = i6;
        z15 = z14;
        z16 = z10;
        if (z) {
        }
        ryVar9 = ryVar6;
        ryVar10 = ryVar5;
        ryVar11 = ryVar4;
        i10 = 0;
        i11 = 1;
        i12 = 8;
        i13 = 1;
        if (this.r == 2) {
        }
        sdVar2 = this;
        ryVar12 = ryVar9;
        ryVar13 = ryVar10;
        if (z6) {
        }
        rvVar2 = rvVar;
        if (scVar4.j()) {
        }
        r5 = 0;
        sdVar2.a = r5;
        sdVar2.n = r5;
    }

    public boolean d() {
        return this.ai != 8;
    }

    public boolean e() {
        if (this.a) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public boolean f() {
        if (this.n) {
            return true;
        }
        return this.L.c && this.N.c;
    }

    public final int g() {
        return l() + this.X;
    }

    public final int h() {
        if (this.ai == 8) {
            return 0;
        }
        return this.X;
    }

    public final int i() {
        return k() + this.W;
    }

    public final int j() {
        if (this.ai == 8) {
            return 0;
        }
        return this.W;
    }

    public final int k() {
        sd sdVar = this.V;
        return sdVar != null ? ((se) sdVar).as + this.aa : this.aa;
    }

    public final int l() {
        sd sdVar = this.V;
        return sdVar != null ? ((se) sdVar).at + this.ab : this.ab;
    }

    public final sd m(int i) {
        sc scVar;
        sc scVar2;
        if (i == 0) {
            sc scVar3 = this.M;
            scVar2 = scVar3.e;
            if (scVar2 == null || scVar2.e != scVar3) {
                return null;
            }
        } else if (i != 1 || (scVar2 = (scVar = this.N).e) == null || scVar2.e != scVar) {
            return null;
        }
        return scVar2.d;
    }

    public final sd n(int i) {
        sc scVar;
        sc scVar2;
        if (i == 0) {
            sc scVar3 = this.K;
            scVar2 = scVar3.e;
            if (scVar2 == null || scVar2.e != scVar3) {
                return null;
            }
        } else if (i != 1 || (scVar2 = (scVar = this.L).e) == null || scVar2.e != scVar) {
            return null;
        }
        return scVar2.d;
    }

    public final sy o(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public final void p(se seVar, rv rvVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            sj.a(seVar, rvVar, this);
            hashSet.remove(this);
            b(rvVar, seVar.Z(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((sc) it.next()).d.p(seVar, rvVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((sc) it2.next()).d.p(seVar, rvVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((sc) it3.next()).d.p(seVar, rvVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((sc) it4.next()).d.p(seVar, rvVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((sc) it5.next()).d.p(seVar, rvVar, hashSet, 1, true);
            }
        }
    }

    public final void q(sc scVar, sc scVar2, int i) {
        if (scVar.d == this) {
            Q(scVar.i, scVar2.d, scVar2.i, i);
        }
    }

    public final void r(rv rvVar) {
        rvVar.b(this.K);
        rvVar.b(this.L);
        rvVar.b(this.M);
        rvVar.b(this.N);
        if (this.ac > 0) {
            rvVar.b(this.O);
        }
    }

    public final void s() {
        if (this.h == null) {
            this.h = new sv(this);
        }
        if (this.i == null) {
            this.i = new sw(this);
        }
    }

    public void t() {
        this.K.e();
        this.L.e();
        this.M.e();
        this.N.e();
        this.O.e();
        this.P.e();
        this.Q.e();
        this.R.e();
        this.V = null;
        this.F = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        int[] iArr = this.ar;
        iArr[0] = 1;
        iArr[1] = 1;
        this.ah = null;
        this.ai = 0;
        this.ak = 0;
        this.al = 0;
        float[] fArr = this.am;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.q = -1;
        this.r = -1;
        int[] iArr2 = this.E;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.t = 0;
        this.u = 0;
        this.y = 1.0f;
        this.B = 1.0f;
        this.x = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.w = 0;
        this.z = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.j;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.k = true;
        int[] iArr3 = this.v;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public String toString() {
        String str = this.aj;
        return "" + (str != null ? a.Z(str, "id: ", " ") : "") + "(" + this.aa + ", " + this.ab + ") - (" + this.W + " x " + this.X + ")";
    }

    public final void u() {
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((sc) arrayList.get(i)).e();
        }
    }

    public final void v() {
        this.a = false;
        this.n = false;
        this.o = false;
        this.p = false;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sc scVar = (sc) arrayList.get(i);
            scVar.c = false;
            scVar.b = 0;
        }
    }

    public final void w(int i) {
        this.ac = i;
        this.G = i > 0;
    }

    public final void x(int i, int i2) {
        if (this.a) {
            return;
        }
        this.K.f(i);
        this.M.f(i2);
        this.aa = i;
        this.W = i2 - i;
        this.a = true;
    }

    public final void y(int i, int i2) {
        if (this.n) {
            return;
        }
        this.L.f(i);
        this.N.f(i2);
        this.ab = i;
        this.X = i2 - i;
        if (this.G) {
            this.O.f(i + this.ac);
        }
        this.n = true;
    }

    public final void z(int i) {
        this.X = i;
        int i2 = this.ae;
        if (i < i2) {
            this.X = i2;
        }
    }
}
