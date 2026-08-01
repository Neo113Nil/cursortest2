package s;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3313a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0290, code lost:
    
        if (r7.f3229d == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.f3229d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(e eVar, q.c cVar, ArrayList arrayList, int i4) {
        int i5;
        b[] bVarArr;
        int i6;
        int i7;
        c[] cVarArr;
        boolean z3;
        d dVar;
        float f4;
        boolean z4;
        boolean z5;
        int i8;
        d dVar2;
        q.c cVar2;
        d dVar3;
        q.f fVar;
        c cVar3;
        q.f fVar2;
        d dVar4;
        int i9;
        c cVar4;
        q.f fVar3;
        d dVar5;
        c[] cVarArr2;
        d dVar6;
        int i10;
        c cVar5;
        c[] cVarArr3;
        int i11;
        c cVar6;
        q.f fVar4;
        q.f fVar5;
        int size;
        ArrayList arrayList2;
        int i12;
        d dVar7;
        int i13;
        float f5;
        int i14;
        float f6;
        d dVar8;
        int i15;
        boolean z6;
        int i16;
        int i17;
        d dVar9;
        c cVar7;
        d dVar10;
        e eVar2 = eVar;
        q.c cVar8 = cVar;
        ArrayList arrayList3 = arrayList;
        if (i4 == 0) {
            i5 = eVar2.f3279z0;
            bVarArr = eVar2.C0;
            i6 = 0;
        } else {
            i5 = eVar2.A0;
            bVarArr = eVar2.B0;
            i6 = 2;
        }
        int i18 = i5;
        b[] bVarArr2 = bVarArr;
        int i19 = 0;
        while (i19 < i18) {
            b bVar = bVarArr2[i19];
            boolean z7 = bVar.f3226q;
            d dVar11 = bVar.f3213a;
            c[] cVarArr4 = dVar11.Q;
            int i20 = 3;
            int i21 = 8;
            float f7 = 0.0f;
            if (z7) {
                i7 = i19;
            } else {
                int i22 = bVar.f3221l;
                int i23 = i22 * 2;
                d dVar12 = dVar11;
                d dVar13 = dVar12;
                boolean z8 = false;
                while (!z8) {
                    bVar.f3218i++;
                    d[] dVarArr = dVar12.f3253m0;
                    c[] cVarArr5 = dVar12.Q;
                    dVarArr[i22] = null;
                    dVar12.f3251l0[i22] = null;
                    if (dVar12.f3242g0 != i21) {
                        dVar12.j(i22);
                        cVarArr5[i23].e();
                        int i24 = i23 + 1;
                        cVarArr5[i24].e();
                        cVarArr5[i23].e();
                        cVarArr5[i24].e();
                        if (bVar.f3214b == null) {
                            bVar.f3214b = dVar12;
                        }
                        bVar.f3215d = dVar12;
                        int i25 = dVar12.f3259p0[i22];
                        if (i25 == i20) {
                            int i26 = dVar12.f3263t[i22];
                            if (i26 == 0 || i26 == i20 || i26 == 2) {
                                bVar.f3219j++;
                                float f8 = dVar12.f3249k0[i22];
                                if (f8 > 0.0f) {
                                    i16 = i19;
                                    bVar.f3220k += f8;
                                } else {
                                    i16 = i19;
                                }
                                i17 = i22;
                                if (dVar12.f3242g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f8 < 0.0f) {
                                        bVar.f3223n = true;
                                    } else {
                                        bVar.f3224o = true;
                                    }
                                    if (bVar.h == null) {
                                        bVar.h = new ArrayList();
                                    }
                                    bVar.h.add(dVar12);
                                }
                                if (bVar.f3217f == null) {
                                    bVar.f3217f = dVar12;
                                }
                                d dVar14 = bVar.g;
                                if (dVar14 != null) {
                                    dVar14.f3251l0[i17] = dVar12;
                                }
                                bVar.g = dVar12;
                            } else {
                                i16 = i19;
                                i17 = i22;
                            }
                            if (i17 == 0) {
                                if (dVar12.f3261r == 0 && dVar12.f3264u == 0) {
                                    int i27 = dVar12.f3265v;
                                }
                            } else if (dVar12.f3262s == 0 && dVar12.f3267x == 0) {
                                int i28 = dVar12.f3268y;
                            }
                            dVar9 = dVar13;
                            if (dVar9 != dVar12) {
                                dVar9.f3253m0[i17] = dVar12;
                            }
                            cVar7 = cVarArr5[i23 + 1].f3231f;
                            if (cVar7 != null) {
                                dVar10 = cVar7.f3229d;
                                c cVar9 = dVar10.Q[i23].f3231f;
                                if (cVar9 != null) {
                                }
                            }
                            dVar10 = null;
                            if (dVar10 != null) {
                                dVar10 = dVar12;
                                z8 = true;
                            }
                            dVar13 = dVar12;
                            i22 = i17;
                            i20 = 3;
                            i21 = 8;
                            dVar12 = dVar10;
                            i19 = i16;
                        }
                    }
                    i16 = i19;
                    i17 = i22;
                    dVar9 = dVar13;
                    if (dVar9 != dVar12) {
                    }
                    cVar7 = cVarArr5[i23 + 1].f3231f;
                    if (cVar7 != null) {
                    }
                    dVar10 = null;
                    if (dVar10 != null) {
                    }
                    dVar13 = dVar12;
                    i22 = i17;
                    i20 = 3;
                    i21 = 8;
                    dVar12 = dVar10;
                    i19 = i16;
                }
                i7 = i19;
                int i29 = i22;
                d dVar15 = bVar.f3214b;
                if (dVar15 != null) {
                    dVar15.Q[i23].e();
                }
                d dVar16 = bVar.f3215d;
                if (dVar16 != null) {
                    dVar16.Q[i23 + 1].e();
                }
                bVar.c = dVar12;
                if (i29 == 0 && bVar.f3222m) {
                    bVar.f3216e = dVar12;
                } else {
                    bVar.f3216e = dVar11;
                }
                bVar.f3225p = bVar.f3224o && bVar.f3223n;
            }
            bVar.f3226q = true;
            if (arrayList3 == null || arrayList3.contains(dVar11)) {
                d dVar17 = bVar.c;
                d dVar18 = bVar.f3214b;
                d dVar19 = bVar.f3215d;
                d dVar20 = bVar.f3216e;
                float f9 = bVar.f3220k;
                int[] iArr = eVar2.f3259p0;
                c[] cVarArr6 = eVar2.Q;
                boolean z9 = iArr[i4] == 2;
                if (i4 == 0) {
                    int i30 = dVar20.f3245i0;
                    boolean z10 = i30 == 0;
                    cVarArr = cVarArr4;
                    boolean z11 = i30 == 1;
                    z3 = i30 == 2;
                    dVar = dVar11;
                    f4 = f9;
                    z5 = z11;
                    z4 = z10;
                } else {
                    cVarArr = cVarArr4;
                    int i31 = dVar20.f3247j0;
                    boolean z12 = i31 == 0;
                    boolean z13 = i31 == 1;
                    z3 = i31 == 2;
                    dVar = dVar11;
                    f4 = f9;
                    z4 = z12;
                    z5 = z13;
                }
                boolean z14 = false;
                while (!z14) {
                    c[] cVarArr7 = dVar.Q;
                    int[] iArr2 = dVar.f3259p0;
                    c cVar10 = cVarArr7[i6];
                    int i32 = z3 ? 1 : 4;
                    int e4 = cVar10.e();
                    boolean z15 = z9;
                    boolean z16 = z3;
                    boolean z17 = iArr2[i4] == 3 && dVar.f3263t[i4] == 0;
                    c cVar11 = cVar10.f3231f;
                    if (cVar11 != null && dVar != dVar11) {
                        e4 = cVar11.e() + e4;
                    }
                    int i33 = e4;
                    if (z16 && dVar != dVar11 && dVar != dVar18) {
                        i32 = 8;
                    }
                    d dVar21 = dVar11;
                    c cVar12 = cVar10.f3231f;
                    if (cVar12 != null) {
                        if (dVar == dVar18) {
                            z6 = z17;
                            cVar8.f(cVar10.f3232i, cVar12.f3232i, i33, 6);
                        } else {
                            z6 = z17;
                            cVar8.f(cVar10.f3232i, cVar12.f3232i, i33, 8);
                        }
                        if (z6 && !z16) {
                            i32 = 5;
                        }
                        cVar8.e(cVar10.f3232i, cVar10.f3231f.f3232i, i33, (dVar == dVar18 && z16 && dVar.S[i4]) ? 5 : i32);
                    }
                    if (z15) {
                        if (dVar.f3242g0 == 8 || iArr2[i4] != 3) {
                            i15 = 0;
                        } else {
                            i15 = 0;
                            cVar8.f(cVarArr7[i6 + 1].f3232i, cVarArr7[i6].f3232i, 0, 5);
                        }
                        cVar8.f(cVarArr7[i6].f3232i, cVarArr6[i6].f3232i, i15, 8);
                    }
                    c cVar13 = cVarArr7[i6 + 1].f3231f;
                    if (cVar13 != null) {
                        dVar8 = cVar13.f3229d;
                        c cVar14 = dVar8.Q[i6].f3231f;
                        if (cVar14 != null) {
                        }
                    }
                    dVar8 = null;
                    if (dVar8 != null) {
                        dVar = dVar8;
                    } else {
                        z14 = true;
                    }
                    dVar11 = dVar21;
                    z9 = z15;
                    z3 = z16;
                }
                boolean z18 = z9;
                boolean z19 = z3;
                if (dVar19 != null) {
                    int i34 = i6 + 1;
                    if (dVar17.Q[i34].f3231f != null) {
                        c cVar15 = dVar19.Q[i34];
                        if (dVar19.f3259p0[i4] == 3 && dVar19.f3263t[i4] == 0 && !z19) {
                            c cVar16 = cVar15.f3231f;
                            if (cVar16.f3229d == eVar2) {
                                cVar8.e(cVar15.f3232i, cVar16.f3232i, -cVar15.e(), 5);
                                cVar8.g(cVar15.f3232i, dVar17.Q[i34].f3231f.f3232i, -cVar15.e(), 6);
                            }
                        }
                        if (z19) {
                            c cVar17 = cVar15.f3231f;
                            if (cVar17.f3229d == eVar2) {
                                cVar8.e(cVar15.f3232i, cVar17.f3232i, -cVar15.e(), 4);
                            }
                        }
                        cVar8.g(cVar15.f3232i, dVar17.Q[i34].f3231f.f3232i, -cVar15.e(), 6);
                    }
                }
                if (z18) {
                    int i35 = i6 + 1;
                    q.f fVar6 = cVarArr6[i35].f3232i;
                    c cVar18 = dVar17.Q[i35];
                    cVar8.f(fVar6, cVar18.f3232i, cVar18.e(), 8);
                }
                ArrayList arrayList4 = bVar.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (bVar.f3223n && !bVar.f3225p) {
                        f4 = bVar.f3219j;
                    }
                    d dVar22 = null;
                    float f10 = 0.0f;
                    int i36 = 0;
                    while (i36 < size) {
                        d dVar23 = (d) arrayList4.get(i36);
                        float[] fArr = dVar23.f3249k0;
                        c[] cVarArr8 = dVar23.Q;
                        float f11 = fArr[i4];
                        if (f11 < f7) {
                            if (bVar.f3225p) {
                                arrayList2 = arrayList4;
                                i12 = size;
                                cVar8.e(cVarArr8[i6 + 1].f3232i, cVarArr8[i6].f3232i, 0, 4);
                                f6 = f10;
                                i13 = i36;
                                f5 = f7;
                                f10 = f6;
                                i14 = i18;
                                i36 = i13 + 1;
                                i18 = i14;
                                arrayList4 = arrayList2;
                                size = i12;
                                f7 = f5;
                            } else {
                                f11 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        i12 = size;
                        if (f11 == f7) {
                            f6 = f10;
                            cVar8.e(cVarArr8[i6 + 1].f3232i, cVarArr8[i6].f3232i, 0, 8);
                            i13 = i36;
                            f5 = f7;
                            f10 = f6;
                            i14 = i18;
                            i36 = i13 + 1;
                            i18 = i14;
                            arrayList4 = arrayList2;
                            size = i12;
                            f7 = f5;
                        } else {
                            float f12 = f10;
                            if (dVar22 != null) {
                                c[] cVarArr9 = dVar22.Q;
                                q.f fVar7 = cVarArr9[i6].f3232i;
                                int i37 = i6 + 1;
                                q.f fVar8 = cVarArr9[i37].f3232i;
                                q.f fVar9 = cVarArr8[i6].f3232i;
                                q.f fVar10 = cVarArr8[i37].f3232i;
                                q.b l4 = cVar8.l();
                                dVar7 = dVar23;
                                float f13 = f7;
                                l4.f3062b = f13;
                                f5 = f13;
                                if (f4 == f13 || f12 == f11) {
                                    i13 = i36;
                                    i14 = i18;
                                    l4.f3063d.g(fVar7, 1.0f);
                                    l4.f3063d.g(fVar8, -1.0f);
                                    l4.f3063d.g(fVar10, 1.0f);
                                    l4.f3063d.g(fVar9, -1.0f);
                                } else {
                                    if (f12 == f5) {
                                        l4.f3063d.g(fVar7, 1.0f);
                                        l4.f3063d.g(fVar8, -1.0f);
                                    } else if (f11 == f7) {
                                        l4.f3063d.g(fVar9, 1.0f);
                                        l4.f3063d.g(fVar10, -1.0f);
                                    } else {
                                        i13 = i36;
                                        float f14 = (f12 / f4) / (f11 / f4);
                                        i14 = i18;
                                        l4.f3063d.g(fVar7, 1.0f);
                                        l4.f3063d.g(fVar8, -1.0f);
                                        l4.f3063d.g(fVar10, f14);
                                        l4.f3063d.g(fVar9, -f14);
                                    }
                                    i13 = i36;
                                    i14 = i18;
                                }
                                cVar8.c(l4);
                            } else {
                                dVar7 = dVar23;
                                i13 = i36;
                                f5 = f7;
                                i14 = i18;
                            }
                            f10 = f11;
                            dVar22 = dVar7;
                            i36 = i13 + 1;
                            i18 = i14;
                            arrayList4 = arrayList2;
                            size = i12;
                            f7 = f5;
                        }
                    }
                }
                i8 = i18;
                if (dVar18 == null || !(dVar18 == dVar19 || z19)) {
                    dVar2 = dVar19;
                    if (!z4 || dVar18 == null) {
                        c[] cVarArr10 = cVarArr;
                        int i38 = 8;
                        if (z5 && dVar18 != null) {
                            int i39 = bVar.f3219j;
                            boolean z20 = i39 > 0 && bVar.f3218i == i39;
                            d dVar24 = dVar18;
                            d dVar25 = dVar24;
                            while (dVar25 != null) {
                                c[] cVarArr11 = dVar25.Q;
                                d dVar26 = dVar25.f3253m0[i4];
                                while (dVar26 != null && dVar26.f3242g0 == i38) {
                                    dVar26 = dVar26.f3253m0[i4];
                                }
                                if (dVar25 == dVar18 || dVar25 == dVar2 || dVar26 == null) {
                                    dVar3 = dVar24;
                                } else {
                                    if (dVar26 == dVar2) {
                                        dVar26 = null;
                                    }
                                    c cVar19 = cVarArr11[i6];
                                    q.f fVar11 = cVar19.f3232i;
                                    int i40 = i6 + 1;
                                    q.f fVar12 = dVar24.Q[i40].f3232i;
                                    int e5 = cVar19.e();
                                    int e6 = cVarArr11[i40].e();
                                    if (dVar26 != null) {
                                        cVar3 = dVar26.Q[i6];
                                        fVar2 = cVar3.f3232i;
                                        c cVar20 = cVar3.f3231f;
                                        fVar = cVar20 != null ? cVar20.f3232i : null;
                                    } else {
                                        c cVar21 = dVar2.Q[i6];
                                        q.f fVar13 = cVar21 != null ? cVar21.f3232i : null;
                                        fVar = cVarArr11[i40].f3232i;
                                        cVar3 = cVar21;
                                        fVar2 = fVar13;
                                    }
                                    if (cVar3 != null) {
                                        e6 += cVar3.e();
                                    }
                                    int e7 = e5 + dVar24.Q[i40].e();
                                    d dVar27 = dVar26;
                                    q.f fVar14 = fVar2;
                                    int i41 = z20 ? 8 : 4;
                                    if (fVar11 == null || fVar12 == null || fVar14 == null || fVar == null) {
                                        dVar3 = dVar24;
                                        dVar4 = dVar27;
                                    } else {
                                        dVar4 = dVar27;
                                        q.f fVar15 = fVar;
                                        dVar3 = dVar24;
                                        cVar.b(fVar11, fVar12, e7, 0.5f, fVar14, fVar15, e6, i41);
                                    }
                                    dVar26 = dVar4;
                                }
                                if (dVar25.f3242g0 != 8) {
                                    dVar3 = dVar25;
                                }
                                dVar25 = dVar26;
                                dVar24 = dVar3;
                                i38 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = dVar18.Q[i6];
                            c cVar23 = cVarArr10[i6].f3231f;
                            int i42 = i6 + 1;
                            c cVar24 = dVar2.Q[i42];
                            c cVar25 = dVar17.Q[i42].f3231f;
                            if (cVar23 != null) {
                                if (dVar18 != dVar2) {
                                    cVar2.e(cVar22.f3232i, cVar23.f3232i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2.b(cVar22.f3232i, cVar23.f3232i, cVar22.e(), 0.5f, cVar24.f3232i, cVar25.f3232i, cVar24.e(), 5);
                                }
                            }
                            if (cVar25 != null && dVar18 != dVar2) {
                                cVar2.e(cVar24.f3232i, cVar25.f3232i, -cVar24.e(), 5);
                            }
                            if ((!z4 || z5) && dVar18 != null && dVar18 != dVar2) {
                                c[] cVarArr12 = dVar18.Q;
                                cVar5 = cVarArr12[i6];
                                if (dVar2 == null) {
                                    dVar2 = dVar18;
                                }
                                cVarArr3 = dVar2.Q;
                                i11 = i6 + 1;
                                cVar6 = cVarArr3[i11];
                                c cVar26 = cVar5.f3231f;
                                fVar4 = cVar26 == null ? cVar26.f3232i : null;
                                c cVar27 = cVar6.f3231f;
                                fVar5 = cVar27 == null ? cVar27.f3232i : null;
                                if (dVar17 != dVar2) {
                                    c cVar28 = dVar17.Q[i11].f3231f;
                                    fVar5 = cVar28 != null ? cVar28.f3232i : null;
                                }
                                if (dVar18 == dVar2) {
                                    cVar6 = cVarArr12[i11];
                                }
                                if (fVar4 != null && fVar5 != null) {
                                    cVar2.b(cVar5.f3232i, fVar4, cVar5.e(), 0.5f, fVar5, cVar6.f3232i, cVarArr3[i11].e(), 5);
                                }
                            }
                        }
                    } else {
                        int i43 = bVar.f3219j;
                        boolean z21 = i43 > 0 && bVar.f3218i == i43;
                        d dVar28 = dVar18;
                        d dVar29 = dVar28;
                        while (dVar28 != null) {
                            c[] cVarArr13 = dVar28.Q;
                            d dVar30 = dVar28.f3253m0[i4];
                            while (true) {
                                if (dVar30 == null) {
                                    i9 = 8;
                                    break;
                                }
                                i9 = 8;
                                if (dVar30.f3242g0 != 8) {
                                    break;
                                } else {
                                    dVar30 = dVar30.f3253m0[i4];
                                }
                            }
                            if (dVar30 != null || dVar28 == dVar2) {
                                c cVar29 = cVarArr13[i6];
                                q.f fVar16 = cVar29.f3232i;
                                c cVar30 = cVar29.f3231f;
                                q.f fVar17 = cVar30 != null ? cVar30.f3232i : null;
                                if (dVar29 != dVar28) {
                                    fVar17 = dVar29.Q[i6 + 1].f3232i;
                                } else if (dVar28 == dVar18) {
                                    c cVar31 = cVarArr[i6].f3231f;
                                    fVar17 = cVar31 != null ? cVar31.f3232i : null;
                                }
                                int e8 = cVar29.e();
                                int i44 = i6 + 1;
                                int e9 = cVarArr13[i44].e();
                                if (dVar30 != null) {
                                    cVar4 = dVar30.Q[i6];
                                    fVar3 = cVar4.f3232i;
                                } else {
                                    cVar4 = dVar17.Q[i44].f3231f;
                                    fVar3 = cVar4 != null ? cVar4.f3232i : null;
                                }
                                q.f fVar18 = cVarArr13[i44].f3232i;
                                if (cVar4 != null) {
                                    e9 += cVar4.e();
                                }
                                int e10 = dVar29.Q[i44].e() + e8;
                                if (fVar16 == null || fVar17 == null || fVar3 == null || fVar18 == null) {
                                    dVar5 = dVar30;
                                    cVarArr2 = cVarArr;
                                    dVar6 = dVar29;
                                    i10 = 8;
                                } else {
                                    if (dVar28 == dVar18) {
                                        e10 = dVar18.Q[i6].e();
                                    }
                                    if (dVar28 == dVar2) {
                                        e9 = dVar2.Q[i44].e();
                                    }
                                    dVar5 = dVar30;
                                    cVarArr2 = cVarArr;
                                    dVar6 = dVar29;
                                    i10 = 8;
                                    cVar.b(fVar16, fVar17, e10, 0.5f, fVar3, fVar18, e9, z21 ? 8 : 5);
                                }
                            } else {
                                dVar5 = dVar30;
                                cVarArr2 = cVarArr;
                                dVar6 = dVar29;
                                i10 = i9;
                            }
                            if (dVar28.f3242g0 != i10) {
                                dVar6 = dVar28;
                            }
                            dVar28 = dVar5;
                            dVar29 = dVar6;
                            cVarArr = cVarArr2;
                        }
                    }
                } else {
                    c cVar32 = cVarArr[i6];
                    int i45 = i6 + 1;
                    c cVar33 = dVar17.Q[i45];
                    c cVar34 = cVar32.f3231f;
                    q.f fVar19 = cVar34 != null ? cVar34.f3232i : null;
                    c cVar35 = cVar33.f3231f;
                    q.f fVar20 = cVar35 != null ? cVar35.f3232i : null;
                    c cVar36 = dVar18.Q[i6];
                    if (dVar19 != null) {
                        cVar33 = dVar19.Q[i45];
                    }
                    if (fVar19 == null || fVar20 == null) {
                        dVar2 = dVar19;
                    } else {
                        float f15 = i4 == 0 ? dVar20.f3238d0 : dVar20.f3240e0;
                        int e11 = cVar36.e();
                        int e12 = cVar33.e();
                        q.f fVar21 = cVar36.f3232i;
                        q.f fVar22 = cVar33.f3232i;
                        q.f fVar23 = fVar19;
                        dVar2 = dVar19;
                        cVar8.b(fVar21, fVar23, e11, f15, fVar20, fVar22, e12, 7);
                    }
                }
                cVar2 = cVar;
                if (!z4) {
                }
                c[] cVarArr122 = dVar18.Q;
                cVar5 = cVarArr122[i6];
                if (dVar2 == null) {
                }
                cVarArr3 = dVar2.Q;
                i11 = i6 + 1;
                cVar6 = cVarArr3[i11];
                c cVar262 = cVar5.f3231f;
                if (cVar262 == null) {
                }
                c cVar272 = cVar6.f3231f;
                if (cVar272 == null) {
                }
                if (dVar17 != dVar2) {
                }
                if (dVar18 == dVar2) {
                }
                if (fVar4 != null) {
                    cVar2.b(cVar5.f3232i, fVar4, cVar5.e(), 0.5f, fVar5, cVar6.f3232i, cVarArr3[i11].e(), 5);
                }
            } else {
                i8 = i18;
            }
            i19 = i7 + 1;
            eVar2 = eVar;
            cVar8 = cVar;
            arrayList3 = arrayList;
            i18 = i8;
        }
    }

    public static void b(e eVar, q.c cVar, d dVar) {
        dVar.f3256o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f3259p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f3258p = -1;
        int[] iArr2 = eVar.f3259p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i4 = cVar6.g;
            int q4 = eVar.q() - cVar5.g;
            cVar6.f3232i = cVar.k(cVar6);
            cVar5.f3232i = cVar.k(cVar5);
            cVar.d(cVar6.f3232i, i4);
            cVar.d(cVar5.f3232i, q4);
            dVar.f3256o = 2;
            dVar.Y = i4;
            int i5 = q4 - i4;
            dVar.U = i5;
            int i6 = dVar.f3235b0;
            if (i5 < i6) {
                dVar.U = i6;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i7 = cVar4.g;
        int k4 = eVar.k() - cVar3.g;
        cVar4.f3232i = cVar.k(cVar4);
        cVar3.f3232i = cVar.k(cVar3);
        cVar.d(cVar4.f3232i, i7);
        cVar.d(cVar3.f3232i, k4);
        if (dVar.a0 > 0 || dVar.f3242g0 == 8) {
            q.f k5 = cVar.k(cVar2);
            cVar2.f3232i = k5;
            cVar.d(k5, dVar.a0 + i7);
        }
        dVar.f3258p = 2;
        dVar.Z = i7;
        int i8 = k4 - i7;
        dVar.V = i8;
        int i9 = dVar.f3236c0;
        if (i8 < i9) {
            dVar.V = i9;
        }
    }

    public static final boolean c(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
