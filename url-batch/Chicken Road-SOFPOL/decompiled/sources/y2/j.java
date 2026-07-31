package y2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f8833a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0290, code lost:
    
        if (r7.f8742d == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.f8742d == r12) goto L76;
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
    public static void a(e eVar, w2.c cVar, ArrayList arrayList, int i) {
        int i8;
        b[] bVarArr;
        int i9;
        int i10;
        c[] cVarArr;
        boolean z3;
        d dVar;
        float f6;
        boolean z7;
        boolean z8;
        int i11;
        d dVar2;
        w2.c cVar2;
        d dVar3;
        w2.f fVar;
        c cVar3;
        w2.f fVar2;
        d dVar4;
        int i12;
        c cVar4;
        w2.f fVar3;
        d dVar5;
        c[] cVarArr2;
        d dVar6;
        int i13;
        c cVar5;
        c[] cVarArr3;
        int i14;
        c cVar6;
        w2.f fVar4;
        w2.f fVar5;
        int size;
        ArrayList arrayList2;
        int i15;
        d dVar7;
        int i16;
        float f8;
        int i17;
        float f9;
        d dVar8;
        int i18;
        boolean z9;
        int i19;
        int i20;
        d dVar9;
        c cVar7;
        d dVar10;
        e eVar2 = eVar;
        w2.c cVar8 = cVar;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i8 = eVar2.f8797z0;
            bVarArr = eVar2.C0;
            i9 = 0;
        } else {
            i8 = eVar2.A0;
            bVarArr = eVar2.B0;
            i9 = 2;
        }
        int i21 = i8;
        b[] bVarArr2 = bVarArr;
        int i22 = 0;
        while (i22 < i21) {
            b bVar = bVarArr2[i22];
            boolean z10 = bVar.f8738q;
            d dVar11 = bVar.f8723a;
            c[] cVarArr4 = dVar11.Q;
            int i23 = 3;
            int i24 = 8;
            float f10 = 0.0f;
            if (z10) {
                i10 = i22;
            } else {
                int i25 = bVar.f8733l;
                int i26 = i25 * 2;
                d dVar12 = dVar11;
                d dVar13 = dVar12;
                boolean z11 = false;
                while (!z11) {
                    bVar.i++;
                    d[] dVarArr = dVar12.f8771m0;
                    c[] cVarArr5 = dVar12.Q;
                    dVarArr[i25] = null;
                    dVar12.f8769l0[i25] = null;
                    if (dVar12.f8760g0 != i24) {
                        dVar12.j(i25);
                        cVarArr5[i26].e();
                        int i27 = i26 + 1;
                        cVarArr5[i27].e();
                        cVarArr5[i26].e();
                        cVarArr5[i27].e();
                        if (bVar.f8724b == null) {
                            bVar.f8724b = dVar12;
                        }
                        bVar.f8726d = dVar12;
                        int i28 = dVar12.f8777p0[i25];
                        if (i28 == i23) {
                            int i29 = dVar12.f8781t[i25];
                            if (i29 == 0 || i29 == i23 || i29 == 2) {
                                bVar.f8731j++;
                                float f11 = dVar12.f8767k0[i25];
                                if (f11 > 0.0f) {
                                    i19 = i22;
                                    bVar.f8732k += f11;
                                } else {
                                    i19 = i22;
                                }
                                i20 = i25;
                                if (dVar12.f8760g0 != 8 && i28 == 3 && (i29 == 0 || i29 == 3)) {
                                    if (f11 < 0.0f) {
                                        bVar.f8735n = true;
                                    } else {
                                        bVar.f8736o = true;
                                    }
                                    if (bVar.f8730h == null) {
                                        bVar.f8730h = new ArrayList();
                                    }
                                    bVar.f8730h.add(dVar12);
                                }
                                if (bVar.f8728f == null) {
                                    bVar.f8728f = dVar12;
                                }
                                d dVar14 = bVar.f8729g;
                                if (dVar14 != null) {
                                    dVar14.f8769l0[i20] = dVar12;
                                }
                                bVar.f8729g = dVar12;
                            } else {
                                i19 = i22;
                                i20 = i25;
                            }
                            if (i20 == 0) {
                                if (dVar12.f8779r == 0 && dVar12.f8782u == 0) {
                                    int i30 = dVar12.f8783v;
                                }
                            } else if (dVar12.f8780s == 0 && dVar12.f8785x == 0) {
                                int i31 = dVar12.f8786y;
                            }
                            dVar9 = dVar13;
                            if (dVar9 != dVar12) {
                                dVar9.f8771m0[i20] = dVar12;
                            }
                            cVar7 = cVarArr5[i26 + 1].f8744f;
                            if (cVar7 != null) {
                                dVar10 = cVar7.f8742d;
                                c cVar9 = dVar10.Q[i26].f8744f;
                                if (cVar9 != null) {
                                }
                            }
                            dVar10 = null;
                            if (dVar10 != null) {
                                dVar10 = dVar12;
                                z11 = true;
                            }
                            dVar13 = dVar12;
                            i25 = i20;
                            i23 = 3;
                            i24 = 8;
                            dVar12 = dVar10;
                            i22 = i19;
                        }
                    }
                    i19 = i22;
                    i20 = i25;
                    dVar9 = dVar13;
                    if (dVar9 != dVar12) {
                    }
                    cVar7 = cVarArr5[i26 + 1].f8744f;
                    if (cVar7 != null) {
                    }
                    dVar10 = null;
                    if (dVar10 != null) {
                    }
                    dVar13 = dVar12;
                    i25 = i20;
                    i23 = 3;
                    i24 = 8;
                    dVar12 = dVar10;
                    i22 = i19;
                }
                i10 = i22;
                int i32 = i25;
                d dVar15 = bVar.f8724b;
                if (dVar15 != null) {
                    dVar15.Q[i26].e();
                }
                d dVar16 = bVar.f8726d;
                if (dVar16 != null) {
                    dVar16.Q[i26 + 1].e();
                }
                bVar.f8725c = dVar12;
                if (i32 == 0 && bVar.f8734m) {
                    bVar.f8727e = dVar12;
                } else {
                    bVar.f8727e = dVar11;
                }
                bVar.f8737p = bVar.f8736o && bVar.f8735n;
            }
            bVar.f8738q = true;
            if (arrayList3 == null || arrayList3.contains(dVar11)) {
                d dVar17 = bVar.f8725c;
                d dVar18 = bVar.f8724b;
                d dVar19 = bVar.f8726d;
                d dVar20 = bVar.f8727e;
                float f12 = bVar.f8732k;
                int[] iArr = eVar2.f8777p0;
                c[] cVarArr6 = eVar2.Q;
                boolean z12 = iArr[i] == 2;
                if (i == 0) {
                    int i33 = dVar20.f8763i0;
                    boolean z13 = i33 == 0;
                    cVarArr = cVarArr4;
                    boolean z14 = i33 == 1;
                    z3 = i33 == 2;
                    dVar = dVar11;
                    f6 = f12;
                    z8 = z14;
                    z7 = z13;
                } else {
                    cVarArr = cVarArr4;
                    int i34 = dVar20.f8765j0;
                    boolean z15 = i34 == 0;
                    boolean z16 = i34 == 1;
                    z3 = i34 == 2;
                    dVar = dVar11;
                    f6 = f12;
                    z7 = z15;
                    z8 = z16;
                }
                boolean z17 = false;
                while (!z17) {
                    c[] cVarArr7 = dVar.Q;
                    int[] iArr2 = dVar.f8777p0;
                    c cVar10 = cVarArr7[i9];
                    int i35 = z3 ? 1 : 4;
                    int e8 = cVar10.e();
                    boolean z18 = z12;
                    boolean z19 = z3;
                    boolean z20 = iArr2[i] == 3 && dVar.f8781t[i] == 0;
                    c cVar11 = cVar10.f8744f;
                    if (cVar11 != null && dVar != dVar11) {
                        e8 = cVar11.e() + e8;
                    }
                    int i36 = e8;
                    if (z19 && dVar != dVar11 && dVar != dVar18) {
                        i35 = 8;
                    }
                    d dVar21 = dVar11;
                    c cVar12 = cVar10.f8744f;
                    if (cVar12 != null) {
                        if (dVar == dVar18) {
                            z9 = z20;
                            cVar8.f(cVar10.i, cVar12.i, i36, 6);
                        } else {
                            z9 = z20;
                            cVar8.f(cVar10.i, cVar12.i, i36, 8);
                        }
                        if (z9 && !z19) {
                            i35 = 5;
                        }
                        cVar8.e(cVar10.i, cVar10.f8744f.i, i36, (dVar == dVar18 && z19 && dVar.S[i]) ? 5 : i35);
                    }
                    if (z18) {
                        if (dVar.f8760g0 == 8 || iArr2[i] != 3) {
                            i18 = 0;
                        } else {
                            i18 = 0;
                            cVar8.f(cVarArr7[i9 + 1].i, cVarArr7[i9].i, 0, 5);
                        }
                        cVar8.f(cVarArr7[i9].i, cVarArr6[i9].i, i18, 8);
                    }
                    c cVar13 = cVarArr7[i9 + 1].f8744f;
                    if (cVar13 != null) {
                        dVar8 = cVar13.f8742d;
                        c cVar14 = dVar8.Q[i9].f8744f;
                        if (cVar14 != null) {
                        }
                    }
                    dVar8 = null;
                    if (dVar8 != null) {
                        dVar = dVar8;
                    } else {
                        z17 = true;
                    }
                    dVar11 = dVar21;
                    z12 = z18;
                    z3 = z19;
                }
                boolean z21 = z12;
                boolean z22 = z3;
                if (dVar19 != null) {
                    int i37 = i9 + 1;
                    if (dVar17.Q[i37].f8744f != null) {
                        c cVar15 = dVar19.Q[i37];
                        if (dVar19.f8777p0[i] == 3 && dVar19.f8781t[i] == 0 && !z22) {
                            c cVar16 = cVar15.f8744f;
                            if (cVar16.f8742d == eVar2) {
                                cVar8.e(cVar15.i, cVar16.i, -cVar15.e(), 5);
                                cVar8.g(cVar15.i, dVar17.Q[i37].f8744f.i, -cVar15.e(), 6);
                            }
                        }
                        if (z22) {
                            c cVar17 = cVar15.f8744f;
                            if (cVar17.f8742d == eVar2) {
                                cVar8.e(cVar15.i, cVar17.i, -cVar15.e(), 4);
                            }
                        }
                        cVar8.g(cVar15.i, dVar17.Q[i37].f8744f.i, -cVar15.e(), 6);
                    }
                }
                if (z21) {
                    int i38 = i9 + 1;
                    w2.f fVar6 = cVarArr6[i38].i;
                    c cVar18 = dVar17.Q[i38];
                    cVar8.f(fVar6, cVar18.i, cVar18.e(), 8);
                }
                ArrayList arrayList4 = bVar.f8730h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (bVar.f8735n && !bVar.f8737p) {
                        f6 = bVar.f8731j;
                    }
                    d dVar22 = null;
                    float f13 = 0.0f;
                    int i39 = 0;
                    while (i39 < size) {
                        d dVar23 = (d) arrayList4.get(i39);
                        float[] fArr = dVar23.f8767k0;
                        c[] cVarArr8 = dVar23.Q;
                        float f14 = fArr[i];
                        if (f14 < f10) {
                            if (bVar.f8737p) {
                                arrayList2 = arrayList4;
                                i15 = size;
                                cVar8.e(cVarArr8[i9 + 1].i, cVarArr8[i9].i, 0, 4);
                                f9 = f13;
                                i16 = i39;
                                f8 = f10;
                                f13 = f9;
                                i17 = i21;
                                i39 = i16 + 1;
                                i21 = i17;
                                arrayList4 = arrayList2;
                                size = i15;
                                f10 = f8;
                            } else {
                                f14 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        i15 = size;
                        if (f14 == f10) {
                            f9 = f13;
                            cVar8.e(cVarArr8[i9 + 1].i, cVarArr8[i9].i, 0, 8);
                            i16 = i39;
                            f8 = f10;
                            f13 = f9;
                            i17 = i21;
                            i39 = i16 + 1;
                            i21 = i17;
                            arrayList4 = arrayList2;
                            size = i15;
                            f10 = f8;
                        } else {
                            float f15 = f13;
                            if (dVar22 != null) {
                                c[] cVarArr9 = dVar22.Q;
                                w2.f fVar7 = cVarArr9[i9].i;
                                int i40 = i9 + 1;
                                w2.f fVar8 = cVarArr9[i40].i;
                                w2.f fVar9 = cVarArr8[i9].i;
                                w2.f fVar10 = cVarArr8[i40].i;
                                w2.b l3 = cVar8.l();
                                dVar7 = dVar23;
                                float f16 = f10;
                                l3.f7841b = f16;
                                f8 = f16;
                                if (f6 == f16 || f15 == f14) {
                                    i16 = i39;
                                    i17 = i21;
                                    l3.f7843d.g(fVar7, 1.0f);
                                    l3.f7843d.g(fVar8, -1.0f);
                                    l3.f7843d.g(fVar10, 1.0f);
                                    l3.f7843d.g(fVar9, -1.0f);
                                } else {
                                    if (f15 == f8) {
                                        l3.f7843d.g(fVar7, 1.0f);
                                        l3.f7843d.g(fVar8, -1.0f);
                                    } else if (f14 == f10) {
                                        l3.f7843d.g(fVar9, 1.0f);
                                        l3.f7843d.g(fVar10, -1.0f);
                                    } else {
                                        i16 = i39;
                                        float f17 = (f15 / f6) / (f14 / f6);
                                        i17 = i21;
                                        l3.f7843d.g(fVar7, 1.0f);
                                        l3.f7843d.g(fVar8, -1.0f);
                                        l3.f7843d.g(fVar10, f17);
                                        l3.f7843d.g(fVar9, -f17);
                                    }
                                    i16 = i39;
                                    i17 = i21;
                                }
                                cVar8.c(l3);
                            } else {
                                dVar7 = dVar23;
                                i16 = i39;
                                f8 = f10;
                                i17 = i21;
                            }
                            f13 = f14;
                            dVar22 = dVar7;
                            i39 = i16 + 1;
                            i21 = i17;
                            arrayList4 = arrayList2;
                            size = i15;
                            f10 = f8;
                        }
                    }
                }
                i11 = i21;
                if (dVar18 == null || !(dVar18 == dVar19 || z22)) {
                    dVar2 = dVar19;
                    if (!z7 || dVar18 == null) {
                        c[] cVarArr10 = cVarArr;
                        int i41 = 8;
                        if (z8 && dVar18 != null) {
                            int i42 = bVar.f8731j;
                            boolean z23 = i42 > 0 && bVar.i == i42;
                            d dVar24 = dVar18;
                            d dVar25 = dVar24;
                            while (dVar25 != null) {
                                c[] cVarArr11 = dVar25.Q;
                                d dVar26 = dVar25.f8771m0[i];
                                while (dVar26 != null && dVar26.f8760g0 == i41) {
                                    dVar26 = dVar26.f8771m0[i];
                                }
                                if (dVar25 == dVar18 || dVar25 == dVar2 || dVar26 == null) {
                                    dVar3 = dVar24;
                                } else {
                                    if (dVar26 == dVar2) {
                                        dVar26 = null;
                                    }
                                    c cVar19 = cVarArr11[i9];
                                    w2.f fVar11 = cVar19.i;
                                    int i43 = i9 + 1;
                                    w2.f fVar12 = dVar24.Q[i43].i;
                                    int e9 = cVar19.e();
                                    int e10 = cVarArr11[i43].e();
                                    if (dVar26 != null) {
                                        cVar3 = dVar26.Q[i9];
                                        fVar2 = cVar3.i;
                                        c cVar20 = cVar3.f8744f;
                                        fVar = cVar20 != null ? cVar20.i : null;
                                    } else {
                                        c cVar21 = dVar2.Q[i9];
                                        w2.f fVar13 = cVar21 != null ? cVar21.i : null;
                                        fVar = cVarArr11[i43].i;
                                        cVar3 = cVar21;
                                        fVar2 = fVar13;
                                    }
                                    if (cVar3 != null) {
                                        e10 += cVar3.e();
                                    }
                                    int e11 = e9 + dVar24.Q[i43].e();
                                    d dVar27 = dVar26;
                                    w2.f fVar14 = fVar2;
                                    int i44 = z23 ? 8 : 4;
                                    if (fVar11 == null || fVar12 == null || fVar14 == null || fVar == null) {
                                        dVar3 = dVar24;
                                        dVar4 = dVar27;
                                    } else {
                                        dVar4 = dVar27;
                                        w2.f fVar15 = fVar;
                                        dVar3 = dVar24;
                                        cVar.b(fVar11, fVar12, e11, 0.5f, fVar14, fVar15, e10, i44);
                                    }
                                    dVar26 = dVar4;
                                }
                                if (dVar25.f8760g0 != 8) {
                                    dVar3 = dVar25;
                                }
                                dVar25 = dVar26;
                                dVar24 = dVar3;
                                i41 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = dVar18.Q[i9];
                            c cVar23 = cVarArr10[i9].f8744f;
                            int i45 = i9 + 1;
                            c cVar24 = dVar2.Q[i45];
                            c cVar25 = dVar17.Q[i45].f8744f;
                            if (cVar23 != null) {
                                if (dVar18 != dVar2) {
                                    cVar2.e(cVar22.i, cVar23.i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2.b(cVar22.i, cVar23.i, cVar22.e(), 0.5f, cVar24.i, cVar25.i, cVar24.e(), 5);
                                }
                            }
                            if (cVar25 != null && dVar18 != dVar2) {
                                cVar2.e(cVar24.i, cVar25.i, -cVar24.e(), 5);
                            }
                            if ((!z7 || z8) && dVar18 != null && dVar18 != dVar2) {
                                c[] cVarArr12 = dVar18.Q;
                                cVar5 = cVarArr12[i9];
                                if (dVar2 == null) {
                                    dVar2 = dVar18;
                                }
                                cVarArr3 = dVar2.Q;
                                i14 = i9 + 1;
                                cVar6 = cVarArr3[i14];
                                c cVar26 = cVar5.f8744f;
                                fVar4 = cVar26 == null ? cVar26.i : null;
                                c cVar27 = cVar6.f8744f;
                                fVar5 = cVar27 == null ? cVar27.i : null;
                                if (dVar17 != dVar2) {
                                    c cVar28 = dVar17.Q[i14].f8744f;
                                    fVar5 = cVar28 != null ? cVar28.i : null;
                                }
                                if (dVar18 == dVar2) {
                                    cVar6 = cVarArr12[i14];
                                }
                                if (fVar4 != null && fVar5 != null) {
                                    cVar2.b(cVar5.i, fVar4, cVar5.e(), 0.5f, fVar5, cVar6.i, cVarArr3[i14].e(), 5);
                                }
                            }
                        }
                    } else {
                        int i46 = bVar.f8731j;
                        boolean z24 = i46 > 0 && bVar.i == i46;
                        d dVar28 = dVar18;
                        d dVar29 = dVar28;
                        while (dVar28 != null) {
                            c[] cVarArr13 = dVar28.Q;
                            d dVar30 = dVar28.f8771m0[i];
                            while (true) {
                                if (dVar30 == null) {
                                    i12 = 8;
                                    break;
                                }
                                i12 = 8;
                                if (dVar30.f8760g0 != 8) {
                                    break;
                                } else {
                                    dVar30 = dVar30.f8771m0[i];
                                }
                            }
                            if (dVar30 != null || dVar28 == dVar2) {
                                c cVar29 = cVarArr13[i9];
                                w2.f fVar16 = cVar29.i;
                                c cVar30 = cVar29.f8744f;
                                w2.f fVar17 = cVar30 != null ? cVar30.i : null;
                                if (dVar29 != dVar28) {
                                    fVar17 = dVar29.Q[i9 + 1].i;
                                } else if (dVar28 == dVar18) {
                                    c cVar31 = cVarArr[i9].f8744f;
                                    fVar17 = cVar31 != null ? cVar31.i : null;
                                }
                                int e12 = cVar29.e();
                                int i47 = i9 + 1;
                                int e13 = cVarArr13[i47].e();
                                if (dVar30 != null) {
                                    cVar4 = dVar30.Q[i9];
                                    fVar3 = cVar4.i;
                                } else {
                                    cVar4 = dVar17.Q[i47].f8744f;
                                    fVar3 = cVar4 != null ? cVar4.i : null;
                                }
                                w2.f fVar18 = cVarArr13[i47].i;
                                if (cVar4 != null) {
                                    e13 += cVar4.e();
                                }
                                int e14 = dVar29.Q[i47].e() + e12;
                                if (fVar16 == null || fVar17 == null || fVar3 == null || fVar18 == null) {
                                    dVar5 = dVar30;
                                    cVarArr2 = cVarArr;
                                    dVar6 = dVar29;
                                    i13 = 8;
                                } else {
                                    if (dVar28 == dVar18) {
                                        e14 = dVar18.Q[i9].e();
                                    }
                                    if (dVar28 == dVar2) {
                                        e13 = dVar2.Q[i47].e();
                                    }
                                    dVar5 = dVar30;
                                    cVarArr2 = cVarArr;
                                    dVar6 = dVar29;
                                    i13 = 8;
                                    cVar.b(fVar16, fVar17, e14, 0.5f, fVar3, fVar18, e13, z24 ? 8 : 5);
                                }
                            } else {
                                dVar5 = dVar30;
                                cVarArr2 = cVarArr;
                                dVar6 = dVar29;
                                i13 = i12;
                            }
                            if (dVar28.f8760g0 != i13) {
                                dVar6 = dVar28;
                            }
                            dVar28 = dVar5;
                            dVar29 = dVar6;
                            cVarArr = cVarArr2;
                        }
                    }
                } else {
                    c cVar32 = cVarArr[i9];
                    int i48 = i9 + 1;
                    c cVar33 = dVar17.Q[i48];
                    c cVar34 = cVar32.f8744f;
                    w2.f fVar19 = cVar34 != null ? cVar34.i : null;
                    c cVar35 = cVar33.f8744f;
                    w2.f fVar20 = cVar35 != null ? cVar35.i : null;
                    c cVar36 = dVar18.Q[i9];
                    if (dVar19 != null) {
                        cVar33 = dVar19.Q[i48];
                    }
                    if (fVar19 == null || fVar20 == null) {
                        dVar2 = dVar19;
                    } else {
                        float f18 = i == 0 ? dVar20.f8754d0 : dVar20.f8756e0;
                        int e15 = cVar36.e();
                        int e16 = cVar33.e();
                        w2.f fVar21 = cVar36.i;
                        w2.f fVar22 = cVar33.i;
                        w2.f fVar23 = fVar19;
                        dVar2 = dVar19;
                        cVar8.b(fVar21, fVar23, e15, f18, fVar20, fVar22, e16, 7);
                    }
                }
                cVar2 = cVar;
                if (!z7) {
                }
                c[] cVarArr122 = dVar18.Q;
                cVar5 = cVarArr122[i9];
                if (dVar2 == null) {
                }
                cVarArr3 = dVar2.Q;
                i14 = i9 + 1;
                cVar6 = cVarArr3[i14];
                c cVar262 = cVar5.f8744f;
                if (cVar262 == null) {
                }
                c cVar272 = cVar6.f8744f;
                if (cVar272 == null) {
                }
                if (dVar17 != dVar2) {
                }
                if (dVar18 == dVar2) {
                }
                if (fVar4 != null) {
                    cVar2.b(cVar5.i, fVar4, cVar5.e(), 0.5f, fVar5, cVar6.i, cVarArr3[i14].e(), 5);
                }
            } else {
                i11 = i21;
            }
            i22 = i10 + 1;
            eVar2 = eVar;
            cVar8 = cVar;
            arrayList3 = arrayList;
            i21 = i11;
        }
    }

    public static void b(e eVar, w2.c cVar, d dVar) {
        dVar.f8774o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f8777p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f8776p = -1;
        int[] iArr2 = eVar.f8777p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = cVar6.f8745g;
            int q4 = eVar.q() - cVar5.f8745g;
            cVar6.i = cVar.k(cVar6);
            cVar5.i = cVar.k(cVar5);
            cVar.d(cVar6.i, i);
            cVar.d(cVar5.i, q4);
            dVar.f8774o = 2;
            dVar.Y = i;
            int i8 = q4 - i;
            dVar.U = i8;
            int i9 = dVar.f8750b0;
            if (i8 < i9) {
                dVar.U = i9;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i10 = cVar4.f8745g;
        int k3 = eVar.k() - cVar3.f8745g;
        cVar4.i = cVar.k(cVar4);
        cVar3.i = cVar.k(cVar3);
        cVar.d(cVar4.i, i10);
        cVar.d(cVar3.i, k3);
        if (dVar.f8748a0 > 0 || dVar.f8760g0 == 8) {
            w2.f k7 = cVar.k(cVar2);
            cVar2.i = k7;
            cVar.d(k7, dVar.f8748a0 + i10);
        }
        dVar.f8776p = 2;
        dVar.Z = i10;
        int i11 = k3 - i10;
        dVar.V = i11;
        int i12 = dVar.f8752c0;
        if (i11 < i12) {
            dVar.V = i12;
        }
    }

    public static final boolean c(int i, int i8) {
        return (i & i8) == i8;
    }
}
