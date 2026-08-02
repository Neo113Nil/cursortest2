package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sg extends sk {
    public sd[] aH;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int as = -1;
    public int at = -1;
    public float au = 0.5f;
    public float av = 0.5f;
    public float aw = 0.5f;
    public float ax = 0.5f;
    public float ay = 0.5f;
    public float az = 0.5f;
    public int aA = 0;
    public int aB = 0;
    public int aC = 2;
    public int aD = 2;
    public int aE = 0;
    public int aF = -1;
    public int aG = 0;
    private final ArrayList aW = new ArrayList();
    private sd[] aX = null;
    private sd[] aY = null;
    private int[] aZ = null;
    public int aI = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06d1  */
    @Override // defpackage.sk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        sf sfVar;
        char c;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        sd sdVar;
        int i15;
        int i16;
        int i17;
        Object obj;
        sd sdVar2;
        int i18;
        sc scVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        if (this.aK > 0) {
            sd sdVar3 = this.V;
            te teVar = sdVar3 != null ? ((se) sdVar3).aH : null;
            if (teVar == null) {
                Z(0, 0);
                this.aR = false;
                return;
            }
            for (int i27 = 0; i27 < this.aK; i27++) {
                sd sdVar4 = this.aJ[i27];
                if (sdVar4 != null && !(sdVar4 instanceof sh)) {
                    int N = sdVar4.N(0);
                    int N2 = sdVar4.N(1);
                    if (N != 3 || sdVar4.t == 1 || N2 != 3) {
                        i26 = N2;
                    } else if (sdVar4.u == 1) {
                        i26 = 3;
                    }
                    if (N == 3) {
                        N = 2;
                    }
                    if (N2 == 3) {
                        i26 = 2;
                    }
                    sm smVar = this.aU;
                    smVar.i = N;
                    smVar.j = i26;
                    smVar.a = sdVar4.j();
                    smVar.b = sdVar4.h();
                    teVar.a(sdVar4, smVar);
                    sdVar4.E(smVar.c);
                    sdVar4.z(smVar.d);
                    sdVar4.w(smVar.e);
                }
            }
        }
        int i28 = this.aP;
        int i29 = this.aQ;
        int i30 = this.aL;
        int i31 = this.aM;
        int[] iArr2 = new int[2];
        int i32 = (i2 - i28) - i29;
        int i33 = this.aG;
        if (i33 == 1) {
            i32 = (i4 - i30) - i31;
            i33 = 1;
        }
        int i34 = this.a;
        if (i33 == 0) {
            if (i34 == -1) {
                this.a = 0;
            }
            if (this.b == -1) {
                this.b = 0;
            }
        } else {
            if (i34 == -1) {
                this.a = 0;
            }
            if (this.b == -1) {
                this.b = 0;
            }
        }
        sd[] sdVarArr = this.aJ;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        while (true) {
            i5 = this.aK;
            if (i35 >= i5) {
                break;
            }
            if (this.aJ[i35].ai == 8) {
                i36++;
            }
            i35++;
        }
        if (i36 > 0) {
            sdVarArr = new sd[i5 - i36];
            int i38 = 0;
            int i39 = 0;
            while (i38 < this.aK) {
                sd sdVar5 = this.aJ[i38];
                int i40 = i28;
                if (sdVar5.ai != 8) {
                    sdVarArr[i39] = sdVar5;
                    i39++;
                }
                i38++;
                i28 = i40;
            }
            i5 = i39;
        }
        int i41 = i28;
        sd[] sdVarArr2 = sdVarArr;
        this.aH = sdVarArr2;
        this.aI = i5;
        int i42 = this.aE;
        if (i42 == 0) {
            i6 = i29;
            i7 = i30;
            i8 = i31;
            iArr = iArr2;
            i9 = i41;
            int i43 = this.aG;
            if (i5 != 0) {
                ArrayList arrayList = this.aW;
                if (arrayList.size() == 0) {
                    sfVar = new sf(this, i43, this.K, this.L, this.M, this.N, i32);
                    arrayList.add(sfVar);
                } else {
                    sf sfVar2 = (sf) arrayList.get(0);
                    sfVar2.b = 0;
                    sfVar2.a = null;
                    sfVar2.c = 0;
                    sfVar2.d = 0;
                    sfVar2.e = 0;
                    sfVar2.f = 0;
                    sfVar2.g = 0;
                    sfVar2.f(i43, this.K, this.L, this.M, this.N, this.aP, this.aL, this.aQ, this.aM, i32);
                    sfVar = sfVar2;
                }
                for (int i44 = 0; i44 < i5; i44++) {
                    sfVar.c(sdVarArr2[i44]);
                }
                i37 = 0;
                iArr[0] = sfVar.b();
                c = 1;
                iArr[1] = sfVar.a();
                int i45 = iArr[i37] + i9 + i6;
                int i46 = iArr[c] + i7 + i8;
                if (i != 1073741824) {
                }
                if (i3 != 1073741824) {
                }
                Z(i45, i46);
                E(i45);
                z(i46);
                this.aR = this.aK <= 0 ? c : i37;
            }
            c = 1;
            int i452 = iArr[i37] + i9 + i6;
            int i462 = iArr[c] + i7 + i8;
            if (i != 1073741824) {
            }
            if (i3 != 1073741824) {
            }
            Z(i452, i462);
            E(i452);
            z(i462);
            this.aR = this.aK <= 0 ? c : i37;
        }
        if (i42 == 1) {
            i6 = i29;
            i7 = i30;
            i8 = i31;
            iArr = iArr2;
            i9 = i41;
            int i47 = this.aG;
            if (i5 != 0) {
                ArrayList arrayList2 = this.aW;
                arrayList2.clear();
                sc scVar2 = this.K;
                sc scVar3 = this.L;
                sc scVar4 = this.M;
                sc scVar5 = this.N;
                sf sfVar3 = new sf(this, i47, scVar2, scVar3, scVar4, scVar5, i32);
                arrayList2.add(sfVar3);
                if (i47 == 0) {
                    i11 = 0;
                    int i48 = 0;
                    int i49 = 0;
                    while (i48 < i5) {
                        int i50 = i11;
                        sd sdVar6 = sdVarArr2[i48];
                        int c2 = c(sdVar6, i32);
                        sc scVar6 = scVar2;
                        if (sdVar6.O() == 3) {
                            i50++;
                        }
                        if (((i49 == i32 || this.aA + i49 + c2 > i32) && sfVar3.a != null) || (i48 > 0 && (i15 = this.aF) > 0 && i48 % i15 == 0)) {
                            scVar2 = scVar6;
                            sfVar3 = new sf(this, 0, scVar2, scVar3, scVar4, scVar5, i32);
                            sfVar3.e = i48;
                            arrayList2.add(sfVar3);
                            i49 = c2;
                            sdVar = sdVar6;
                        } else {
                            sdVar = sdVar6;
                            scVar2 = scVar6;
                            sf sfVar4 = sfVar3;
                            if (i48 > 0) {
                                i49 += this.aA + c2;
                                sfVar3 = sfVar4;
                            } else {
                                i49 = c2;
                            }
                        }
                        sfVar3.c(sdVar);
                        i48++;
                        i11 = i50;
                    }
                    i10 = 0;
                } else {
                    i10 = i47;
                    int i51 = 0;
                    int i52 = 0;
                    int i53 = 0;
                    while (i52 < i5) {
                        sd[] sdVarArr3 = sdVarArr2;
                        sd sdVar7 = sdVarArr3[i52];
                        int a = a(sdVar7, i32);
                        sc scVar7 = scVar2;
                        int i54 = i53;
                        if (sdVar7.P() == 3) {
                            i54++;
                        }
                        if (((i51 == i32 || this.aB + i51 + a > i32) && sfVar3.a != null) || (i52 > 0 && (i12 = this.aF) > 0 && i52 % i12 == 0)) {
                            scVar2 = scVar7;
                            sfVar3 = new sf(this, i10, scVar2, scVar3, scVar4, scVar5, i32);
                            sfVar3.e = i52;
                            arrayList2.add(sfVar3);
                        } else {
                            scVar2 = scVar7;
                            if (i52 > 0) {
                                i51 += this.aB + a;
                                sfVar3.c(sdVar7);
                                i52++;
                                i53 = i54;
                                sdVarArr2 = sdVarArr3;
                            }
                        }
                        i51 = a;
                        sfVar3.c(sdVar7);
                        i52++;
                        i53 = i54;
                        sdVarArr2 = sdVarArr3;
                    }
                    i11 = i53;
                }
                int size = arrayList2.size();
                int i55 = this.aP;
                int i56 = this.aL;
                int i57 = this.aQ;
                int i58 = this.aM;
                int i59 = i11;
                sc scVar8 = scVar2;
                boolean z = O() == 2 || P() == 2;
                if (i59 > 0 && z) {
                    int i60 = 0;
                    while (i60 < size) {
                        sf sfVar5 = (sf) arrayList2.get(i60);
                        if (i10 == 0) {
                            i14 = i60;
                            sfVar5.e(i32 - sfVar5.b());
                        } else {
                            i14 = i60;
                            sfVar5.e(i32 - sfVar5.a());
                        }
                        i60 = i14 + 1;
                    }
                }
                sc scVar9 = scVar3;
                sc scVar10 = scVar5;
                int i61 = i55;
                int i62 = i56;
                int i63 = i57;
                int i64 = i58;
                sc scVar11 = scVar8;
                int i65 = 0;
                int i66 = 0;
                int i67 = 0;
                sc scVar12 = scVar4;
                while (i65 < size) {
                    int i68 = size - 1;
                    sf sfVar6 = (sf) arrayList2.get(i65);
                    if (i10 == 0) {
                        if (i65 < i68) {
                            scVar10 = ((sf) arrayList2.get(i65 + 1)).a.L;
                            i64 = 0;
                        } else {
                            scVar10 = scVar5;
                            i64 = this.aM;
                        }
                        sc scVar13 = sfVar6.a.N;
                        sfVar6.f(0, scVar11, scVar9, scVar12, scVar10, i61, i62, i63, i64, i32);
                        i66 = Math.max(i66, sfVar6.b());
                        i67 += sfVar6.a();
                        if (i65 > 0) {
                            i67 += this.aB;
                        }
                        scVar9 = scVar13;
                        i13 = i10;
                        i62 = 0;
                    } else {
                        if (i65 < i68) {
                            scVar12 = ((sf) arrayList2.get(i65 + 1)).a.K;
                            i63 = 0;
                        } else {
                            scVar12 = scVar4;
                            i63 = this.aQ;
                        }
                        sc scVar14 = sfVar6.a.M;
                        i13 = i10;
                        sfVar6.f(i13, scVar11, scVar9, scVar12, scVar10, i61, i62, i63, i64, i32);
                        i66 += sfVar6.b();
                        i67 = Math.max(i67, sfVar6.a());
                        if (i65 > 0) {
                            i66 += this.aA;
                        }
                        scVar11 = scVar14;
                        i61 = 0;
                    }
                    i65++;
                    i10 = i13;
                }
                iArr[0] = i66;
                iArr[1] = i67;
            }
        } else {
            if (i42 == 2) {
                i6 = i29;
                i7 = i30;
                i8 = i31;
                iArr = iArr2;
                i9 = i41;
                int i69 = this.aG;
                int i70 = this.aF;
                if (i69 == 0) {
                    if (i70 <= 0) {
                        i17 = 0;
                        int i71 = 0;
                        for (int i72 = 0; i72 < i5; i72++) {
                            if (i72 > 0) {
                                i71 += this.aA;
                            }
                            sd sdVar8 = sdVarArr2[i72];
                            if (sdVar8 != null) {
                                i71 += c(sdVar8, i32);
                                if (i71 > i32) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                        }
                    } else {
                        i17 = i70;
                    }
                    i16 = 0;
                } else {
                    if (i70 <= 0) {
                        int i73 = 0;
                        i16 = 0;
                        for (int i74 = 0; i74 < i5; i74++) {
                            if (i74 > 0) {
                                i73 += this.aB;
                            }
                            sd sdVar9 = sdVarArr2[i74];
                            if (sdVar9 != null) {
                                i73 += a(sdVar9, i32);
                                if (i73 > i32) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                        }
                    } else {
                        i16 = i70;
                    }
                    i17 = 0;
                }
                if (this.aZ == null) {
                    this.aZ = new int[2];
                }
                boolean z2 = (i16 == 0 && i69 == 1) || (i17 == 0 && i69 == 0);
                while (!z2) {
                    float f = i5;
                    if (i69 == 0) {
                        i16 = (int) Math.ceil(f / i17);
                    } else {
                        i17 = (int) Math.ceil(f / i16);
                    }
                    sd[] sdVarArr4 = this.aY;
                    if (sdVarArr4 == null || sdVarArr4.length < i17) {
                        obj = null;
                        this.aY = new sd[i17];
                    } else {
                        obj = null;
                        Arrays.fill(sdVarArr4, (Object) null);
                    }
                    sd[] sdVarArr5 = this.aX;
                    if (sdVarArr5 == null || sdVarArr5.length < i16) {
                        this.aX = new sd[i16];
                    } else {
                        Arrays.fill(sdVarArr5, obj);
                    }
                    for (int i75 = 0; i75 < i17; i75++) {
                        int i76 = 0;
                        while (i76 < i16) {
                            int i77 = (i76 * i17) + i75;
                            if (i69 == 1) {
                                i77 = (i75 * i16) + i76;
                            }
                            if (i77 < sdVarArr2.length && (sdVar2 = sdVarArr2[i77]) != null) {
                                int c3 = c(sdVar2, i32);
                                sd[] sdVarArr6 = this.aY;
                                sd sdVar10 = sdVarArr6[i75];
                                i18 = i69;
                                if (sdVar10 == null || sdVar10.j() < c3) {
                                    sdVarArr6[i75] = sdVar2;
                                }
                                int a2 = a(sdVar2, i32);
                                sd[] sdVarArr7 = this.aX;
                                sd sdVar11 = sdVarArr7[i76];
                                if (sdVar11 == null || sdVar11.h() < a2) {
                                    sdVarArr7[i76] = sdVar2;
                                }
                            } else {
                                i18 = i69;
                            }
                            i76++;
                            i69 = i18;
                        }
                    }
                    int i78 = i69;
                    int i79 = 0;
                    for (int i80 = 0; i80 < i17; i80++) {
                        sd sdVar12 = this.aY[i80];
                        if (sdVar12 != null) {
                            if (i80 > 0) {
                                i79 += this.aA;
                            }
                            i79 += c(sdVar12, i32);
                        }
                    }
                    int i81 = 0;
                    for (int i82 = 0; i82 < i16; i82++) {
                        sd sdVar13 = this.aX[i82];
                        if (sdVar13 != null) {
                            if (i82 > 0) {
                                i81 += this.aB;
                            }
                            i81 += a(sdVar13, i32);
                        }
                    }
                    iArr[0] = i79;
                    iArr[1] = i81;
                    if (i78 == 0) {
                        if (i79 > i32 && i17 > 1) {
                            i17--;
                        }
                        z2 = true;
                    } else {
                        if (i81 > i32 && i16 > 1) {
                            i16--;
                        }
                        z2 = true;
                    }
                    i69 = i78;
                }
                int[] iArr3 = this.aZ;
                iArr3[0] = i17;
                iArr3[1] = i16;
                c = 1;
                int i4522 = iArr[i37] + i9 + i6;
                int i4622 = iArr[c] + i7 + i8;
                if (i != 1073741824) {
                    i4522 = i2;
                } else if (i == Integer.MIN_VALUE) {
                    i4522 = Math.min(i4522, i2);
                } else if (i != 0) {
                    i4522 = i37;
                }
                if (i3 != 1073741824) {
                    i4622 = i4;
                } else if (i3 == Integer.MIN_VALUE) {
                    i4622 = Math.min(i4622, i4);
                } else if (i3 != 0) {
                    i4622 = i37;
                }
                Z(i4522, i4622);
                E(i4522);
                z(i4622);
                this.aR = this.aK <= 0 ? c : i37;
            }
            if (i42 == 3) {
                int i83 = this.aG;
                if (i5 != 0) {
                    ArrayList arrayList3 = this.aW;
                    arrayList3.clear();
                    sc scVar15 = this.K;
                    sc scVar16 = this.L;
                    sc scVar17 = this.M;
                    sc scVar18 = this.N;
                    i7 = i30;
                    i8 = i31;
                    int i84 = i41;
                    iArr = iArr2;
                    i6 = i29;
                    sf sfVar7 = new sf(this, i83, scVar15, scVar16, scVar17, scVar18, i32);
                    arrayList3.add(sfVar7);
                    if (i83 == 0) {
                        scVar = scVar15;
                        int i85 = 0;
                        int i86 = 0;
                        int i87 = 0;
                        i20 = 0;
                        while (i85 < i5) {
                            int i88 = i85;
                            int i89 = i87 + 1;
                            int i90 = i84;
                            sd sdVar14 = sdVarArr2[i88];
                            int c4 = c(sdVar14, i32);
                            sc scVar19 = scVar16;
                            sc scVar20 = scVar17;
                            if (sdVar14.O() == 3) {
                                i20++;
                            }
                            if (((i86 == i32 || this.aA + i86 + c4 > i32) && sfVar7.a != null) || (i88 > 0 && (i25 = this.aF) > 0 && i89 > i25)) {
                                i24 = i88;
                                scVar16 = scVar19;
                                scVar17 = scVar20;
                                sfVar7 = new sf(this, 0, scVar, scVar16, scVar17, scVar18, i32);
                                sfVar7.e = i24;
                                arrayList3.add(sfVar7);
                                i86 = c4;
                                i87 = 1;
                            } else {
                                i24 = i88;
                                scVar16 = scVar19;
                                scVar17 = scVar20;
                                sf sfVar8 = sfVar7;
                                if (i24 > 0) {
                                    i86 += this.aA + c4;
                                    i87 = i89;
                                    sfVar7 = sfVar8;
                                } else {
                                    i86 = c4;
                                    i87 = i89;
                                }
                            }
                            sfVar7.c(sdVar14);
                            i85 = i24 + 1;
                            i84 = i90;
                        }
                        i9 = i84;
                        i19 = 0;
                    } else {
                        scVar = scVar15;
                        i9 = i84;
                        i19 = i83;
                        int i91 = 0;
                        int i92 = 0;
                        int i93 = 0;
                        int i94 = 0;
                        while (i93 < i5) {
                            i92++;
                            int i95 = i94;
                            sd sdVar15 = sdVarArr2[i93];
                            int a3 = a(sdVar15, i32);
                            sc scVar21 = scVar16;
                            sc scVar22 = scVar17;
                            if (sdVar15.P() == 3) {
                                i95++;
                            }
                            if (((i91 == i32 || this.aB + i91 + a3 > i32) && sfVar7.a != null) || (i93 > 0 && (i21 = this.aF) > 0 && i92 > i21)) {
                                scVar16 = scVar21;
                                scVar17 = scVar22;
                                sfVar7 = new sf(this, i19, scVar, scVar16, scVar17, scVar18, i32);
                                sfVar7.e = i93;
                                arrayList3.add(sfVar7);
                                i91 = a3;
                                i92 = 1;
                            } else {
                                scVar16 = scVar21;
                                scVar17 = scVar22;
                                sf sfVar9 = sfVar7;
                                if (i93 > 0) {
                                    i91 += this.aB + a3;
                                    sfVar7 = sfVar9;
                                } else {
                                    i91 = a3;
                                }
                            }
                            sfVar7.c(sdVar15);
                            i93++;
                            i94 = i95;
                        }
                        i20 = i94;
                    }
                    int size2 = arrayList3.size();
                    int i96 = this.aP;
                    int i97 = this.aL;
                    int i98 = this.aQ;
                    int i99 = this.aM;
                    boolean z3 = O() == 2 || P() == 2;
                    if (i20 > 0 && z3) {
                        int i100 = 0;
                        while (i100 < size2) {
                            sf sfVar10 = (sf) arrayList3.get(i100);
                            if (i19 == 0) {
                                i23 = i96;
                                sfVar10.e(i32 - sfVar10.b());
                            } else {
                                i23 = i96;
                                sfVar10.e(i32 - sfVar10.a());
                            }
                            i100++;
                            i96 = i23;
                        }
                    }
                    int i101 = i97;
                    sc scVar23 = scVar17;
                    sc scVar24 = scVar18;
                    int i102 = i98;
                    int i103 = i99;
                    int i104 = i96;
                    sc scVar25 = scVar;
                    int i105 = 0;
                    int i106 = 0;
                    sc scVar26 = scVar16;
                    int i107 = 0;
                    while (i105 < size2) {
                        int i108 = size2 - 1;
                        sf sfVar11 = (sf) arrayList3.get(i105);
                        if (i19 == 0) {
                            if (i105 < i108) {
                                scVar24 = ((sf) arrayList3.get(i105 + 1)).a.L;
                                i103 = 0;
                            } else {
                                scVar24 = scVar18;
                                i103 = this.aM;
                            }
                            sc scVar27 = sfVar11.a.N;
                            sfVar11.f(0, scVar25, scVar26, scVar23, scVar24, i104, i101, i102, i103, i32);
                            i106 = Math.max(i106, sfVar11.b());
                            i107 += sfVar11.a();
                            if (i105 > 0) {
                                i107 += this.aB;
                            }
                            scVar26 = scVar27;
                            i22 = i19;
                            i101 = 0;
                        } else {
                            if (i105 < i108) {
                                scVar23 = ((sf) arrayList3.get(i105 + 1)).a.K;
                                i102 = 0;
                            } else {
                                scVar23 = scVar17;
                                i102 = this.aQ;
                            }
                            sc scVar28 = sfVar11.a.M;
                            i22 = i19;
                            sfVar11.f(i22, scVar25, scVar26, scVar23, scVar24, i104, i101, i102, i103, i32);
                            i106 += sfVar11.b();
                            i107 = Math.max(i107, sfVar11.a());
                            if (i105 > 0) {
                                i106 += this.aA;
                            }
                            scVar25 = scVar28;
                            i104 = 0;
                        }
                        i105++;
                        i19 = i22;
                    }
                    iArr[0] = i106;
                    iArr[1] = i107;
                }
            }
            i6 = i29;
            i7 = i30;
            i8 = i31;
            iArr = iArr2;
            i9 = i41;
        }
        c = 1;
        int i45222 = iArr[i37] + i9 + i6;
        int i46222 = iArr[c] + i7 + i8;
        if (i != 1073741824) {
        }
        if (i3 != 1073741824) {
        }
        Z(i45222, i46222);
        E(i45222);
        z(i46222);
        this.aR = this.aK <= 0 ? c : i37;
    }

    public final int a(sd sdVar, int i) {
        sd sdVar2;
        if (sdVar == null) {
            return 0;
        }
        if (sdVar.P() == 3) {
            int i2 = sdVar.u;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (sdVar.B * i);
                if (i3 != sdVar.h()) {
                    sdVar.k = true;
                    aa(sdVar, sdVar.O(), sdVar.j(), 1, i3);
                }
                return i3;
            }
            sdVar2 = sdVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((sdVar2.j() * sdVar2.Y) + 0.5f);
            }
        } else {
            sdVar2 = sdVar;
        }
        return sdVar2.h();
    }

    @Override // defpackage.sd
    public final void b(rv rvVar, boolean z) {
        sd sdVar;
        float f;
        int i;
        super.b(rvVar, z);
        sd sdVar2 = this.V;
        boolean z2 = sdVar2 != null && ((se) sdVar2).c;
        int i2 = this.aE;
        if (i2 == 0) {
            ArrayList arrayList = this.aW;
            if (arrayList.size() > 0) {
                ((sf) arrayList.get(0)).d(z2, 0, true);
            }
        } else if (i2 == 1) {
            ArrayList arrayList2 = this.aW;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                ((sf) arrayList2.get(i3)).d(z2, i3, i3 == size + (-1));
                i3++;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                ArrayList arrayList3 = this.aW;
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    ((sf) arrayList3.get(i4)).d(z2, i4, i4 == size2 + (-1));
                    i4++;
                }
            }
        } else if (this.aZ != null && this.aY != null && this.aX != null) {
            for (int i5 = 0; i5 < this.aI; i5++) {
                this.aH[i5].u();
            }
            int[] iArr = this.aZ;
            int i6 = iArr[0];
            int i7 = iArr[1];
            float f2 = this.au;
            sd sdVar3 = null;
            int i8 = 0;
            while (i8 < i6) {
                if (z2) {
                    i = (i6 - i8) - 1;
                    f = 1.0f - this.au;
                } else {
                    f = f2;
                    i = i8;
                }
                sd sdVar4 = this.aY[i];
                if (sdVar4 != null && sdVar4.ai != 8) {
                    if (i8 == 0) {
                        sdVar4.q(sdVar4.K, this.K, this.aP);
                        sdVar4.ak = this.a;
                        sdVar4.af = f;
                        i8 = 0;
                    }
                    if (i8 == i6 - 1) {
                        sdVar4.q(sdVar4.M, this.M, this.aQ);
                    }
                    if (i8 > 0 && sdVar3 != null) {
                        sc scVar = sdVar4.K;
                        int i9 = this.aA;
                        sc scVar2 = sdVar3.M;
                        sdVar4.q(scVar, scVar2, i9);
                        sdVar3.q(scVar2, scVar, 0);
                    }
                    sdVar3 = sdVar4;
                }
                i8++;
                f2 = f;
            }
            int i10 = 0;
            while (i10 < i7) {
                sd sdVar5 = this.aX[i10];
                if (sdVar5 != null && sdVar5.ai != 8) {
                    if (i10 == 0) {
                        sdVar5.q(sdVar5.L, this.L, this.aL);
                        sdVar5.al = this.b;
                        sdVar5.ag = this.av;
                        i10 = 0;
                    }
                    if (i10 == i7 - 1) {
                        sdVar5.q(sdVar5.N, this.N, this.aM);
                    }
                    if (i10 > 0 && sdVar3 != null) {
                        sc scVar3 = sdVar5.L;
                        int i11 = this.aB;
                        sc scVar4 = sdVar3.N;
                        sdVar5.q(scVar3, scVar4, i11);
                        sdVar3.q(scVar4, scVar3, 0);
                    }
                    sdVar3 = sdVar5;
                }
                i10++;
            }
            for (int i12 = 0; i12 < i6; i12++) {
                for (int i13 = 0; i13 < i7; i13++) {
                    int i14 = (i13 * i6) + i12;
                    if (this.aG == 1) {
                        i14 = (i12 * i7) + i13;
                    }
                    sd[] sdVarArr = this.aH;
                    if (i14 < sdVarArr.length && (sdVar = sdVarArr[i14]) != null && sdVar.ai != 8) {
                        sd sdVar6 = this.aY[i12];
                        sd sdVar7 = this.aX[i13];
                        if (sdVar != sdVar6) {
                            sdVar.q(sdVar.K, sdVar6.K, 0);
                            sdVar.q(sdVar.M, sdVar6.M, 0);
                        }
                        if (sdVar != sdVar7) {
                            sdVar.q(sdVar.L, sdVar7.L, 0);
                            sdVar.q(sdVar.N, sdVar7.N, 0);
                        }
                    }
                }
            }
        }
        this.aR = false;
    }

    public final int c(sd sdVar, int i) {
        sd sdVar2;
        if (sdVar == null) {
            return 0;
        }
        if (sdVar.O() == 3) {
            int i2 = sdVar.t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (sdVar.y * i);
                if (i3 != sdVar.j()) {
                    sdVar.k = true;
                    aa(sdVar, 1, i3, sdVar.P(), sdVar.h());
                }
                return i3;
            }
            sdVar2 = sdVar;
            if (i2 != 1 && i2 == 3) {
                return (int) ((sdVar2.h() * sdVar2.Y) + 0.5f);
            }
        } else {
            sdVar2 = sdVar;
        }
        return sdVar2.j();
    }
}
