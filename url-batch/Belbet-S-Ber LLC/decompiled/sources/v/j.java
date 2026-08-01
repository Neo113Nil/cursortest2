package v;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3691a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0290, code lost:
    
        if (r7.d == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.d == r12) goto L76;
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
    public static void a(e eVar, t.c cVar, ArrayList arrayList, int i) {
        int i4;
        b[] bVarArr;
        int i5;
        int i6;
        c[] cVarArr;
        boolean z4;
        d dVar;
        float f5;
        boolean z5;
        boolean z6;
        int i7;
        d dVar2;
        t.c cVar2;
        d dVar3;
        t.f fVar;
        c cVar3;
        t.f fVar2;
        d dVar4;
        int i8;
        c cVar4;
        t.f fVar3;
        d dVar5;
        c[] cVarArr2;
        d dVar6;
        int i9;
        c cVar5;
        c[] cVarArr3;
        int i10;
        c cVar6;
        t.f fVar4;
        t.f fVar5;
        int size;
        ArrayList arrayList2;
        int i11;
        d dVar7;
        int i12;
        float f6;
        int i13;
        float f7;
        d dVar8;
        int i14;
        boolean z7;
        int i15;
        int i16;
        d dVar9;
        c cVar7;
        d dVar10;
        e eVar2 = eVar;
        t.c cVar8 = cVar;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i4 = eVar2.f3657z0;
            bVarArr = eVar2.C0;
            i5 = 0;
        } else {
            i4 = eVar2.A0;
            bVarArr = eVar2.B0;
            i5 = 2;
        }
        int i17 = i4;
        b[] bVarArr2 = bVarArr;
        int i18 = 0;
        while (i18 < i17) {
            b bVar = bVarArr2[i18];
            boolean z8 = bVar.f3604q;
            d dVar11 = bVar.f3591a;
            c[] cVarArr4 = dVar11.Q;
            int i19 = 3;
            int i20 = 8;
            float f8 = 0.0f;
            if (z8) {
                i6 = i18;
            } else {
                int i21 = bVar.f3599l;
                int i22 = i21 * 2;
                d dVar12 = dVar11;
                d dVar13 = dVar12;
                boolean z9 = false;
                while (!z9) {
                    bVar.i++;
                    d[] dVarArr = dVar12.f3631m0;
                    c[] cVarArr5 = dVar12.Q;
                    dVarArr[i21] = null;
                    dVar12.f3629l0[i21] = null;
                    if (dVar12.f3622g0 != i20) {
                        dVar12.j(i21);
                        cVarArr5[i22].e();
                        int i23 = i22 + 1;
                        cVarArr5[i23].e();
                        cVarArr5[i22].e();
                        cVarArr5[i23].e();
                        if (bVar.f3592b == null) {
                            bVar.f3592b = dVar12;
                        }
                        bVar.d = dVar12;
                        int i24 = dVar12.f3637p0[i21];
                        if (i24 == i19) {
                            int i25 = dVar12.f3641t[i21];
                            if (i25 == 0 || i25 == i19 || i25 == 2) {
                                bVar.f3597j++;
                                float f9 = dVar12.f3627k0[i21];
                                if (f9 > 0.0f) {
                                    i15 = i18;
                                    bVar.f3598k += f9;
                                } else {
                                    i15 = i18;
                                }
                                i16 = i21;
                                if (dVar12.f3622g0 != 8 && i24 == 3 && (i25 == 0 || i25 == 3)) {
                                    if (f9 < 0.0f) {
                                        bVar.f3601n = true;
                                    } else {
                                        bVar.f3602o = true;
                                    }
                                    if (bVar.h == null) {
                                        bVar.h = new ArrayList();
                                    }
                                    bVar.h.add(dVar12);
                                }
                                if (bVar.f3595f == null) {
                                    bVar.f3595f = dVar12;
                                }
                                d dVar14 = bVar.f3596g;
                                if (dVar14 != null) {
                                    dVar14.f3629l0[i16] = dVar12;
                                }
                                bVar.f3596g = dVar12;
                            } else {
                                i15 = i18;
                                i16 = i21;
                            }
                            if (i16 == 0) {
                                if (dVar12.f3639r == 0 && dVar12.f3642u == 0) {
                                    int i26 = dVar12.f3643v;
                                }
                            } else if (dVar12.f3640s == 0 && dVar12.f3645x == 0) {
                                int i27 = dVar12.f3646y;
                            }
                            dVar9 = dVar13;
                            if (dVar9 != dVar12) {
                                dVar9.f3631m0[i16] = dVar12;
                            }
                            cVar7 = cVarArr5[i22 + 1].f3609f;
                            if (cVar7 != null) {
                                dVar10 = cVar7.d;
                                c cVar9 = dVar10.Q[i22].f3609f;
                                if (cVar9 != null) {
                                }
                            }
                            dVar10 = null;
                            if (dVar10 != null) {
                                dVar10 = dVar12;
                                z9 = true;
                            }
                            dVar13 = dVar12;
                            i21 = i16;
                            i19 = 3;
                            i20 = 8;
                            dVar12 = dVar10;
                            i18 = i15;
                        }
                    }
                    i15 = i18;
                    i16 = i21;
                    dVar9 = dVar13;
                    if (dVar9 != dVar12) {
                    }
                    cVar7 = cVarArr5[i22 + 1].f3609f;
                    if (cVar7 != null) {
                    }
                    dVar10 = null;
                    if (dVar10 != null) {
                    }
                    dVar13 = dVar12;
                    i21 = i16;
                    i19 = 3;
                    i20 = 8;
                    dVar12 = dVar10;
                    i18 = i15;
                }
                i6 = i18;
                int i28 = i21;
                d dVar15 = bVar.f3592b;
                if (dVar15 != null) {
                    dVar15.Q[i22].e();
                }
                d dVar16 = bVar.d;
                if (dVar16 != null) {
                    dVar16.Q[i22 + 1].e();
                }
                bVar.f3593c = dVar12;
                if (i28 == 0 && bVar.f3600m) {
                    bVar.f3594e = dVar12;
                } else {
                    bVar.f3594e = dVar11;
                }
                bVar.f3603p = bVar.f3602o && bVar.f3601n;
            }
            bVar.f3604q = true;
            if (arrayList3 == null || arrayList3.contains(dVar11)) {
                d dVar17 = bVar.f3593c;
                d dVar18 = bVar.f3592b;
                d dVar19 = bVar.d;
                d dVar20 = bVar.f3594e;
                float f10 = bVar.f3598k;
                int[] iArr = eVar2.f3637p0;
                c[] cVarArr6 = eVar2.Q;
                boolean z10 = iArr[i] == 2;
                if (i == 0) {
                    int i29 = dVar20.i0;
                    boolean z11 = i29 == 0;
                    cVarArr = cVarArr4;
                    boolean z12 = i29 == 1;
                    z4 = i29 == 2;
                    dVar = dVar11;
                    f5 = f10;
                    z6 = z12;
                    z5 = z11;
                } else {
                    cVarArr = cVarArr4;
                    int i30 = dVar20.f3625j0;
                    boolean z13 = i30 == 0;
                    boolean z14 = i30 == 1;
                    z4 = i30 == 2;
                    dVar = dVar11;
                    f5 = f10;
                    z5 = z13;
                    z6 = z14;
                }
                boolean z15 = false;
                while (!z15) {
                    c[] cVarArr7 = dVar.Q;
                    int[] iArr2 = dVar.f3637p0;
                    c cVar10 = cVarArr7[i5];
                    int i31 = z4 ? 1 : 4;
                    int e4 = cVar10.e();
                    boolean z16 = z10;
                    boolean z17 = z4;
                    boolean z18 = iArr2[i] == 3 && dVar.f3641t[i] == 0;
                    c cVar11 = cVar10.f3609f;
                    if (cVar11 != null && dVar != dVar11) {
                        e4 = cVar11.e() + e4;
                    }
                    int i32 = e4;
                    if (z17 && dVar != dVar11 && dVar != dVar18) {
                        i31 = 8;
                    }
                    d dVar21 = dVar11;
                    c cVar12 = cVar10.f3609f;
                    if (cVar12 != null) {
                        if (dVar == dVar18) {
                            z7 = z18;
                            cVar8.f(cVar10.i, cVar12.i, i32, 6);
                        } else {
                            z7 = z18;
                            cVar8.f(cVar10.i, cVar12.i, i32, 8);
                        }
                        if (z7 && !z17) {
                            i31 = 5;
                        }
                        cVar8.e(cVar10.i, cVar10.f3609f.i, i32, (dVar == dVar18 && z17 && dVar.S[i]) ? 5 : i31);
                    }
                    if (z16) {
                        if (dVar.f3622g0 == 8 || iArr2[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            cVar8.f(cVarArr7[i5 + 1].i, cVarArr7[i5].i, 0, 5);
                        }
                        cVar8.f(cVarArr7[i5].i, cVarArr6[i5].i, i14, 8);
                    }
                    c cVar13 = cVarArr7[i5 + 1].f3609f;
                    if (cVar13 != null) {
                        dVar8 = cVar13.d;
                        c cVar14 = dVar8.Q[i5].f3609f;
                        if (cVar14 != null) {
                        }
                    }
                    dVar8 = null;
                    if (dVar8 != null) {
                        dVar = dVar8;
                    } else {
                        z15 = true;
                    }
                    dVar11 = dVar21;
                    z10 = z16;
                    z4 = z17;
                }
                boolean z19 = z10;
                boolean z20 = z4;
                if (dVar19 != null) {
                    int i33 = i5 + 1;
                    if (dVar17.Q[i33].f3609f != null) {
                        c cVar15 = dVar19.Q[i33];
                        if (dVar19.f3637p0[i] == 3 && dVar19.f3641t[i] == 0 && !z20) {
                            c cVar16 = cVar15.f3609f;
                            if (cVar16.d == eVar2) {
                                cVar8.e(cVar15.i, cVar16.i, -cVar15.e(), 5);
                                cVar8.g(cVar15.i, dVar17.Q[i33].f3609f.i, -cVar15.e(), 6);
                            }
                        }
                        if (z20) {
                            c cVar17 = cVar15.f3609f;
                            if (cVar17.d == eVar2) {
                                cVar8.e(cVar15.i, cVar17.i, -cVar15.e(), 4);
                            }
                        }
                        cVar8.g(cVar15.i, dVar17.Q[i33].f3609f.i, -cVar15.e(), 6);
                    }
                }
                if (z19) {
                    int i34 = i5 + 1;
                    t.f fVar6 = cVarArr6[i34].i;
                    c cVar18 = dVar17.Q[i34];
                    cVar8.f(fVar6, cVar18.i, cVar18.e(), 8);
                }
                ArrayList arrayList4 = bVar.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (bVar.f3601n && !bVar.f3603p) {
                        f5 = bVar.f3597j;
                    }
                    d dVar22 = null;
                    float f11 = 0.0f;
                    int i35 = 0;
                    while (i35 < size) {
                        d dVar23 = (d) arrayList4.get(i35);
                        float[] fArr = dVar23.f3627k0;
                        c[] cVarArr8 = dVar23.Q;
                        float f12 = fArr[i];
                        if (f12 < f8) {
                            if (bVar.f3603p) {
                                arrayList2 = arrayList4;
                                i11 = size;
                                cVar8.e(cVarArr8[i5 + 1].i, cVarArr8[i5].i, 0, 4);
                                f7 = f11;
                                i12 = i35;
                                f6 = f8;
                                f11 = f7;
                                i13 = i17;
                                i35 = i12 + 1;
                                i17 = i13;
                                arrayList4 = arrayList2;
                                size = i11;
                                f8 = f6;
                            } else {
                                f12 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        i11 = size;
                        if (f12 == f8) {
                            f7 = f11;
                            cVar8.e(cVarArr8[i5 + 1].i, cVarArr8[i5].i, 0, 8);
                            i12 = i35;
                            f6 = f8;
                            f11 = f7;
                            i13 = i17;
                            i35 = i12 + 1;
                            i17 = i13;
                            arrayList4 = arrayList2;
                            size = i11;
                            f8 = f6;
                        } else {
                            float f13 = f11;
                            if (dVar22 != null) {
                                c[] cVarArr9 = dVar22.Q;
                                t.f fVar7 = cVarArr9[i5].i;
                                int i36 = i5 + 1;
                                t.f fVar8 = cVarArr9[i36].i;
                                t.f fVar9 = cVarArr8[i5].i;
                                t.f fVar10 = cVarArr8[i36].i;
                                t.b l4 = cVar8.l();
                                dVar7 = dVar23;
                                float f14 = f8;
                                l4.f3355b = f14;
                                f6 = f14;
                                if (f5 == f14 || f13 == f12) {
                                    i12 = i35;
                                    i13 = i17;
                                    l4.d.g(fVar7, 1.0f);
                                    l4.d.g(fVar8, -1.0f);
                                    l4.d.g(fVar10, 1.0f);
                                    l4.d.g(fVar9, -1.0f);
                                } else {
                                    if (f13 == f6) {
                                        l4.d.g(fVar7, 1.0f);
                                        l4.d.g(fVar8, -1.0f);
                                    } else if (f12 == f8) {
                                        l4.d.g(fVar9, 1.0f);
                                        l4.d.g(fVar10, -1.0f);
                                    } else {
                                        i12 = i35;
                                        float f15 = (f13 / f5) / (f12 / f5);
                                        i13 = i17;
                                        l4.d.g(fVar7, 1.0f);
                                        l4.d.g(fVar8, -1.0f);
                                        l4.d.g(fVar10, f15);
                                        l4.d.g(fVar9, -f15);
                                    }
                                    i12 = i35;
                                    i13 = i17;
                                }
                                cVar8.c(l4);
                            } else {
                                dVar7 = dVar23;
                                i12 = i35;
                                f6 = f8;
                                i13 = i17;
                            }
                            f11 = f12;
                            dVar22 = dVar7;
                            i35 = i12 + 1;
                            i17 = i13;
                            arrayList4 = arrayList2;
                            size = i11;
                            f8 = f6;
                        }
                    }
                }
                i7 = i17;
                if (dVar18 == null || !(dVar18 == dVar19 || z20)) {
                    dVar2 = dVar19;
                    if (!z5 || dVar18 == null) {
                        c[] cVarArr10 = cVarArr;
                        int i37 = 8;
                        if (z6 && dVar18 != null) {
                            int i38 = bVar.f3597j;
                            boolean z21 = i38 > 0 && bVar.i == i38;
                            d dVar24 = dVar18;
                            d dVar25 = dVar24;
                            while (dVar25 != null) {
                                c[] cVarArr11 = dVar25.Q;
                                d dVar26 = dVar25.f3631m0[i];
                                while (dVar26 != null && dVar26.f3622g0 == i37) {
                                    dVar26 = dVar26.f3631m0[i];
                                }
                                if (dVar25 == dVar18 || dVar25 == dVar2 || dVar26 == null) {
                                    dVar3 = dVar24;
                                } else {
                                    if (dVar26 == dVar2) {
                                        dVar26 = null;
                                    }
                                    c cVar19 = cVarArr11[i5];
                                    t.f fVar11 = cVar19.i;
                                    int i39 = i5 + 1;
                                    t.f fVar12 = dVar24.Q[i39].i;
                                    int e5 = cVar19.e();
                                    int e6 = cVarArr11[i39].e();
                                    if (dVar26 != null) {
                                        cVar3 = dVar26.Q[i5];
                                        fVar2 = cVar3.i;
                                        c cVar20 = cVar3.f3609f;
                                        fVar = cVar20 != null ? cVar20.i : null;
                                    } else {
                                        c cVar21 = dVar2.Q[i5];
                                        t.f fVar13 = cVar21 != null ? cVar21.i : null;
                                        fVar = cVarArr11[i39].i;
                                        cVar3 = cVar21;
                                        fVar2 = fVar13;
                                    }
                                    if (cVar3 != null) {
                                        e6 += cVar3.e();
                                    }
                                    int e7 = e5 + dVar24.Q[i39].e();
                                    d dVar27 = dVar26;
                                    t.f fVar14 = fVar2;
                                    int i40 = z21 ? 8 : 4;
                                    if (fVar11 == null || fVar12 == null || fVar14 == null || fVar == null) {
                                        dVar3 = dVar24;
                                        dVar4 = dVar27;
                                    } else {
                                        dVar4 = dVar27;
                                        t.f fVar15 = fVar;
                                        dVar3 = dVar24;
                                        cVar.b(fVar11, fVar12, e7, 0.5f, fVar14, fVar15, e6, i40);
                                    }
                                    dVar26 = dVar4;
                                }
                                if (dVar25.f3622g0 != 8) {
                                    dVar3 = dVar25;
                                }
                                dVar25 = dVar26;
                                dVar24 = dVar3;
                                i37 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = dVar18.Q[i5];
                            c cVar23 = cVarArr10[i5].f3609f;
                            int i41 = i5 + 1;
                            c cVar24 = dVar2.Q[i41];
                            c cVar25 = dVar17.Q[i41].f3609f;
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
                            if ((!z5 || z6) && dVar18 != null && dVar18 != dVar2) {
                                c[] cVarArr12 = dVar18.Q;
                                cVar5 = cVarArr12[i5];
                                if (dVar2 == null) {
                                    dVar2 = dVar18;
                                }
                                cVarArr3 = dVar2.Q;
                                i10 = i5 + 1;
                                cVar6 = cVarArr3[i10];
                                c cVar26 = cVar5.f3609f;
                                fVar4 = cVar26 == null ? cVar26.i : null;
                                c cVar27 = cVar6.f3609f;
                                fVar5 = cVar27 == null ? cVar27.i : null;
                                if (dVar17 != dVar2) {
                                    c cVar28 = dVar17.Q[i10].f3609f;
                                    fVar5 = cVar28 != null ? cVar28.i : null;
                                }
                                if (dVar18 == dVar2) {
                                    cVar6 = cVarArr12[i10];
                                }
                                if (fVar4 != null && fVar5 != null) {
                                    cVar2.b(cVar5.i, fVar4, cVar5.e(), 0.5f, fVar5, cVar6.i, cVarArr3[i10].e(), 5);
                                }
                            }
                        }
                    } else {
                        int i42 = bVar.f3597j;
                        boolean z22 = i42 > 0 && bVar.i == i42;
                        d dVar28 = dVar18;
                        d dVar29 = dVar28;
                        while (dVar28 != null) {
                            c[] cVarArr13 = dVar28.Q;
                            d dVar30 = dVar28.f3631m0[i];
                            while (true) {
                                if (dVar30 == null) {
                                    i8 = 8;
                                    break;
                                }
                                i8 = 8;
                                if (dVar30.f3622g0 != 8) {
                                    break;
                                } else {
                                    dVar30 = dVar30.f3631m0[i];
                                }
                            }
                            if (dVar30 != null || dVar28 == dVar2) {
                                c cVar29 = cVarArr13[i5];
                                t.f fVar16 = cVar29.i;
                                c cVar30 = cVar29.f3609f;
                                t.f fVar17 = cVar30 != null ? cVar30.i : null;
                                if (dVar29 != dVar28) {
                                    fVar17 = dVar29.Q[i5 + 1].i;
                                } else if (dVar28 == dVar18) {
                                    c cVar31 = cVarArr[i5].f3609f;
                                    fVar17 = cVar31 != null ? cVar31.i : null;
                                }
                                int e8 = cVar29.e();
                                int i43 = i5 + 1;
                                int e9 = cVarArr13[i43].e();
                                if (dVar30 != null) {
                                    cVar4 = dVar30.Q[i5];
                                    fVar3 = cVar4.i;
                                } else {
                                    cVar4 = dVar17.Q[i43].f3609f;
                                    fVar3 = cVar4 != null ? cVar4.i : null;
                                }
                                t.f fVar18 = cVarArr13[i43].i;
                                if (cVar4 != null) {
                                    e9 += cVar4.e();
                                }
                                int e10 = dVar29.Q[i43].e() + e8;
                                if (fVar16 == null || fVar17 == null || fVar3 == null || fVar18 == null) {
                                    dVar5 = dVar30;
                                    cVarArr2 = cVarArr;
                                    dVar6 = dVar29;
                                    i9 = 8;
                                } else {
                                    if (dVar28 == dVar18) {
                                        e10 = dVar18.Q[i5].e();
                                    }
                                    if (dVar28 == dVar2) {
                                        e9 = dVar2.Q[i43].e();
                                    }
                                    dVar5 = dVar30;
                                    cVarArr2 = cVarArr;
                                    dVar6 = dVar29;
                                    i9 = 8;
                                    cVar.b(fVar16, fVar17, e10, 0.5f, fVar3, fVar18, e9, z22 ? 8 : 5);
                                }
                            } else {
                                dVar5 = dVar30;
                                cVarArr2 = cVarArr;
                                dVar6 = dVar29;
                                i9 = i8;
                            }
                            if (dVar28.f3622g0 != i9) {
                                dVar6 = dVar28;
                            }
                            dVar28 = dVar5;
                            dVar29 = dVar6;
                            cVarArr = cVarArr2;
                        }
                    }
                } else {
                    c cVar32 = cVarArr[i5];
                    int i44 = i5 + 1;
                    c cVar33 = dVar17.Q[i44];
                    c cVar34 = cVar32.f3609f;
                    t.f fVar19 = cVar34 != null ? cVar34.i : null;
                    c cVar35 = cVar33.f3609f;
                    t.f fVar20 = cVar35 != null ? cVar35.i : null;
                    c cVar36 = dVar18.Q[i5];
                    if (dVar19 != null) {
                        cVar33 = dVar19.Q[i44];
                    }
                    if (fVar19 == null || fVar20 == null) {
                        dVar2 = dVar19;
                    } else {
                        float f16 = i == 0 ? dVar20.d0 : dVar20.f3618e0;
                        int e11 = cVar36.e();
                        int e12 = cVar33.e();
                        t.f fVar21 = cVar36.i;
                        t.f fVar22 = cVar33.i;
                        t.f fVar23 = fVar19;
                        dVar2 = dVar19;
                        cVar8.b(fVar21, fVar23, e11, f16, fVar20, fVar22, e12, 7);
                    }
                }
                cVar2 = cVar;
                if (!z5) {
                }
                c[] cVarArr122 = dVar18.Q;
                cVar5 = cVarArr122[i5];
                if (dVar2 == null) {
                }
                cVarArr3 = dVar2.Q;
                i10 = i5 + 1;
                cVar6 = cVarArr3[i10];
                c cVar262 = cVar5.f3609f;
                if (cVar262 == null) {
                }
                c cVar272 = cVar6.f3609f;
                if (cVar272 == null) {
                }
                if (dVar17 != dVar2) {
                }
                if (dVar18 == dVar2) {
                }
                if (fVar4 != null) {
                    cVar2.b(cVar5.i, fVar4, cVar5.e(), 0.5f, fVar5, cVar6.i, cVarArr3[i10].e(), 5);
                }
            } else {
                i7 = i17;
            }
            i18 = i6 + 1;
            eVar2 = eVar;
            cVar8 = cVar;
            arrayList3 = arrayList;
            i17 = i7;
        }
    }

    public static void b(e eVar, t.c cVar, d dVar) {
        dVar.f3634o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f3637p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f3636p = -1;
        int[] iArr2 = eVar.f3637p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = cVar6.f3610g;
            int q4 = eVar.q() - cVar5.f3610g;
            cVar6.i = cVar.k(cVar6);
            cVar5.i = cVar.k(cVar5);
            cVar.d(cVar6.i, i);
            cVar.d(cVar5.i, q4);
            dVar.f3634o = 2;
            dVar.Y = i;
            int i4 = q4 - i;
            dVar.U = i4;
            int i5 = dVar.f3614b0;
            if (i4 < i5) {
                dVar.U = i5;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i6 = cVar4.f3610g;
        int k4 = eVar.k() - cVar3.f3610g;
        cVar4.i = cVar.k(cVar4);
        cVar3.i = cVar.k(cVar3);
        cVar.d(cVar4.i, i6);
        cVar.d(cVar3.i, k4);
        if (dVar.f3612a0 > 0 || dVar.f3622g0 == 8) {
            t.f k5 = cVar.k(cVar2);
            cVar2.i = k5;
            cVar.d(k5, dVar.f3612a0 + i6);
        }
        dVar.f3636p = 2;
        dVar.Z = i6;
        int i7 = k4 - i6;
        dVar.V = i7;
        int i8 = dVar.f3616c0;
        if (i7 < i8) {
            dVar.V = i8;
        }
    }

    public static final boolean c(int i, int i4) {
        return (i & i4) == i4;
    }
}
