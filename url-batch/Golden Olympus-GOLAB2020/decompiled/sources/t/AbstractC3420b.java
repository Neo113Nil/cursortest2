package t;

import java.util.ArrayList;
import s.C3402b;
import s.C3404d;
import t.C3423e;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3420b {
    static void a(f fVar, C3404d c3404d, int i4) {
        int i5;
        C3421c[] c3421cArr;
        int i6;
        if (i4 == 0) {
            i5 = fVar.f46170G0;
            c3421cArr = fVar.f46173J0;
            i6 = 0;
        } else {
            i5 = fVar.f46171H0;
            c3421cArr = fVar.f46172I0;
            i6 = 2;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            C3421c c3421c = c3421cArr[i7];
            c3421c.a();
            b(fVar, c3404d, i4, i6, c3421c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0031, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0041, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [t.e] */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r4v45, types: [t.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void b(f fVar, C3404d c3404d, int i4, int i5, C3421c c3421c) {
        boolean z4;
        boolean z5;
        boolean z6;
        float f4;
        ArrayList arrayList;
        C3423e c3423e;
        C3404d c3404d2;
        C3422d c3422d;
        C3422d c3422d2;
        C3422d c3422d3;
        C3423e c3423e2;
        C3422d c3422d4;
        s.i iVar;
        s.i iVar2;
        C3423e c3423e3;
        int i6;
        C3422d c3422d5;
        s.i iVar3;
        s.i iVar4;
        C3423e c3423e4;
        C3423e c3423e5;
        int i7;
        s.i iVar5;
        int size;
        int i8;
        float f5;
        ArrayList arrayList2;
        boolean z7;
        boolean z8;
        int i9;
        C3423e c3423e6 = c3421c.f46043a;
        C3423e c3423e7 = c3421c.f46045c;
        C3423e c3423e8 = c3421c.f46044b;
        C3423e c3423e9 = c3421c.f46046d;
        C3423e c3423e10 = c3421c.f46047e;
        float f6 = c3421c.f46053k;
        boolean z9 = fVar.f46096M[i4] == C3423e.b.WRAP_CONTENT;
        if (i4 == 0) {
            int i10 = c3423e10.f46135m0;
            z4 = i10 == 0;
            z5 = i10 == 1;
        } else {
            int i11 = c3423e10.f46137n0;
            z4 = i11 == 0;
            z5 = i11 == 1;
        }
        ?? r13 = c3423e6;
        boolean z10 = false;
        while (true) {
            f4 = f6;
            if (z10) {
                break;
            }
            C3422d c3422d6 = r13.f46093J[i5];
            int i12 = z6 ? 1 : 4;
            int b4 = c3422d6.b();
            C3423e.b bVar = r13.f46096M[i4];
            boolean z11 = z9;
            C3423e.b bVar2 = C3423e.b.MATCH_CONSTRAINT;
            boolean z12 = bVar == bVar2 && r13.f46136n[i4] == 0;
            boolean z13 = z6;
            C3422d c3422d7 = c3422d6.f46068d;
            if (c3422d7 != null && r13 != c3423e6) {
                b4 += c3422d7.b();
            }
            int i13 = b4;
            if (z13 && r13 != c3423e6 && r13 != c3423e8) {
                i12 = 5;
            }
            boolean z14 = z12;
            C3422d c3422d8 = c3422d6.f46068d;
            if (c3422d8 != null) {
                if (r13 == c3423e8) {
                    z7 = z10;
                    z8 = z4;
                    c3404d.h(c3422d6.f46071g, c3422d8.f46071g, i13, 6);
                } else {
                    z7 = z10;
                    z8 = z4;
                    c3404d.h(c3422d6.f46071g, c3422d8.f46071g, i13, 8);
                }
                c3404d.e(c3422d6.f46071g, c3422d6.f46068d.f46071g, i13, (!z14 || z13) ? i12 : 5);
            } else {
                z7 = z10;
                z8 = z4;
            }
            if (z11) {
                if (r13.M() == 8 || r13.f46096M[i4] != bVar2) {
                    i9 = 0;
                } else {
                    C3422d[] c3422dArr = r13.f46093J;
                    i9 = 0;
                    c3404d.h(c3422dArr[i5 + 1].f46071g, c3422dArr[i5].f46071g, 0, 5);
                }
                c3404d.h(r13.f46093J[i5].f46071g, fVar.f46093J[i5].f46071g, i9, 8);
            }
            C3422d c3422d9 = r13.f46093J[i5 + 1].f46068d;
            if (c3422d9 != null) {
                ?? r4 = c3422d9.f46066b;
                C3422d c3422d10 = r4.f46093J[i5].f46068d;
                if (c3422d10 != null && c3422d10.f46066b == r13) {
                    r21 = r4;
                }
            }
            if (r21 != null) {
                r13 = r21;
                z10 = z7;
            } else {
                z10 = true;
            }
            f6 = f4;
            z9 = z11;
            z6 = z13;
            z4 = z8;
            r13 = r13;
        }
        boolean z15 = z9;
        boolean z16 = z6;
        boolean z17 = z4;
        if (c3423e9 != null) {
            int i14 = i5 + 1;
            if (c3423e7.f46093J[i14].f46068d != null) {
                C3422d c3422d11 = c3423e9.f46093J[i14];
                if (c3423e9.f46096M[i4] == C3423e.b.MATCH_CONSTRAINT && c3423e9.f46136n[i4] == 0 && !z16) {
                    C3422d c3422d12 = c3422d11.f46068d;
                    if (c3422d12.f46066b == fVar) {
                        c3404d.e(c3422d11.f46071g, c3422d12.f46071g, -c3422d11.b(), 5);
                        c3404d.j(c3422d11.f46071g, c3423e7.f46093J[i14].f46068d.f46071g, -c3422d11.b(), 6);
                        if (z15) {
                            int i15 = i5 + 1;
                            s.i iVar6 = fVar.f46093J[i15].f46071g;
                            C3422d c3422d13 = c3423e7.f46093J[i15];
                            c3404d.h(iVar6, c3422d13.f46071g, c3422d13.b(), 8);
                        }
                        arrayList = c3421c.f46050h;
                        if (arrayList != null && (size = arrayList.size()) > 1) {
                            float f7 = (c3421c.f46060r || c3421c.f46062t) ? f4 : c3421c.f46052j;
                            float f8 = 0.0f;
                            float f9 = 0.0f;
                            C3423e c3423e11 = null;
                            i8 = 0;
                            while (i8 < size) {
                                C3423e c3423e12 = (C3423e) arrayList.get(i8);
                                float f10 = c3423e12.f46143q0[i4];
                                if (f10 >= f8) {
                                    f5 = f8;
                                } else if (c3421c.f46062t) {
                                    C3422d[] c3422dArr2 = c3423e12.f46093J;
                                    f5 = f8;
                                    c3404d.e(c3422dArr2[i5 + 1].f46071g, c3422dArr2[i5].f46071g, 0, 4);
                                    arrayList2 = arrayList;
                                    i8++;
                                    f8 = f5;
                                    arrayList = arrayList2;
                                } else {
                                    f5 = f8;
                                    f10 = 1.0f;
                                }
                                float f11 = f10;
                                if (f11 == f5) {
                                    C3422d[] c3422dArr3 = c3423e12.f46093J;
                                    c3404d.e(c3422dArr3[i5 + 1].f46071g, c3422dArr3[i5].f46071g, 0, 8);
                                    arrayList2 = arrayList;
                                    i8++;
                                    f8 = f5;
                                    arrayList = arrayList2;
                                } else {
                                    if (c3423e11 != null) {
                                        C3422d[] c3422dArr4 = c3423e11.f46093J;
                                        s.i iVar7 = c3422dArr4[i5].f46071g;
                                        int i16 = i5 + 1;
                                        s.i iVar8 = c3422dArr4[i16].f46071g;
                                        C3422d[] c3422dArr5 = c3423e12.f46093J;
                                        arrayList2 = arrayList;
                                        s.i iVar9 = c3422dArr5[i5].f46071g;
                                        s.i iVar10 = c3422dArr5[i16].f46071g;
                                        C3402b r5 = c3404d.r();
                                        r5.l(f9, f7, f11, iVar7, iVar8, iVar9, iVar10);
                                        c3404d.d(r5);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                    c3423e11 = c3423e12;
                                    f9 = f11;
                                    i8++;
                                    f8 = f5;
                                    arrayList = arrayList2;
                                }
                            }
                        }
                        if (c3423e8 == null && (c3423e8 == c3423e9 || z16)) {
                            C3422d c3422d14 = c3423e6.f46093J[i5];
                            int i17 = i5 + 1;
                            C3422d c3422d15 = c3423e7.f46093J[i17];
                            C3422d c3422d16 = c3422d14.f46068d;
                            s.i iVar11 = c3422d16 != null ? c3422d16.f46071g : null;
                            C3422d c3422d17 = c3422d15.f46068d;
                            s.i iVar12 = c3422d17 != null ? c3422d17.f46071g : null;
                            C3422d c3422d18 = c3423e8.f46093J[i5];
                            C3422d c3422d19 = c3423e9.f46093J[i17];
                            if (iVar11 != null && iVar12 != null) {
                                c3404d.c(c3422d18.f46071g, iVar11, c3422d18.b(), i4 == 0 ? c3423e10.f46113b0 : c3423e10.f46115c0, iVar12, c3422d19.f46071g, c3422d19.b(), 7);
                            }
                        } else if (z17 || c3423e8 == null) {
                            int i18 = 8;
                            if (z5 && c3423e8 != null) {
                                int i19 = c3421c.f46052j;
                                boolean z18 = i19 <= 0 && c3421c.f46051i == i19;
                                C3423e c3423e13 = c3423e8;
                                c3423e = c3423e13;
                                while (c3423e != null) {
                                    C3423e c3423e14 = c3423e.f46147s0[i4];
                                    while (c3423e14 != null && c3423e14.M() == i18) {
                                        c3423e14 = c3423e14.f46147s0[i4];
                                    }
                                    if (c3423e == c3423e8 || c3423e == c3423e9 || c3423e14 == null) {
                                        c3423e2 = c3423e13;
                                    } else {
                                        if (c3423e14 == c3423e9) {
                                            c3423e14 = null;
                                        }
                                        C3422d c3422d20 = c3423e.f46093J[i5];
                                        s.i iVar13 = c3422d20.f46071g;
                                        C3422d c3422d21 = c3422d20.f46068d;
                                        if (c3422d21 != null) {
                                            s.i iVar14 = c3422d21.f46071g;
                                        }
                                        int i20 = i5 + 1;
                                        s.i iVar15 = c3423e13.f46093J[i20].f46071g;
                                        int b5 = c3422d20.b();
                                        int b6 = c3423e.f46093J[i20].b();
                                        if (c3423e14 != null) {
                                            c3422d4 = c3423e14.f46093J[i5];
                                            iVar = c3422d4.f46071g;
                                            C3422d c3422d22 = c3422d4.f46068d;
                                            iVar2 = c3422d22 != null ? c3422d22.f46071g : null;
                                        } else {
                                            c3422d4 = c3423e9.f46093J[i5];
                                            iVar = c3422d4 != null ? c3422d4.f46071g : null;
                                            iVar2 = c3423e.f46093J[i20].f46071g;
                                        }
                                        if (c3422d4 != null) {
                                            b6 += c3422d4.b();
                                        }
                                        int i21 = b6;
                                        int b7 = b5 + c3423e13.f46093J[i20].b();
                                        s.i iVar16 = iVar;
                                        int i22 = z18 ? 8 : 4;
                                        if (iVar13 == null || iVar15 == null || iVar16 == null || iVar2 == null) {
                                            c3423e2 = c3423e13;
                                            c3423e3 = c3423e14;
                                        } else {
                                            c3423e3 = c3423e14;
                                            s.i iVar17 = iVar2;
                                            c3423e2 = c3423e13;
                                            c3404d.c(iVar13, iVar15, b7, 0.5f, iVar16, iVar17, i21, i22);
                                        }
                                        c3423e14 = c3423e3;
                                    }
                                    if (c3423e.M() != 8) {
                                        c3423e2 = c3423e;
                                    }
                                    c3423e = c3423e14;
                                    c3423e13 = c3423e2;
                                    i18 = 8;
                                }
                                c3404d2 = c3404d;
                                C3422d c3422d23 = c3423e8.f46093J[i5];
                                c3422d = c3423e6.f46093J[i5].f46068d;
                                int i23 = i5 + 1;
                                c3422d2 = c3423e9.f46093J[i23];
                                c3422d3 = c3423e7.f46093J[i23].f46068d;
                                if (c3422d != null) {
                                    if (c3423e8 != c3423e9) {
                                        c3404d2.e(c3422d23.f46071g, c3422d.f46071g, c3422d23.b(), 5);
                                    } else if (c3422d3 != null) {
                                        c3404d2.c(c3422d23.f46071g, c3422d.f46071g, c3422d23.b(), 0.5f, c3422d2.f46071g, c3422d3.f46071g, c3422d2.b(), 5);
                                    }
                                }
                                if (c3422d3 != null && c3423e8 != c3423e9) {
                                    c3404d2.e(c3422d2.f46071g, c3422d3.f46071g, -c3422d2.b(), 5);
                                }
                                if ((z17 && !z5) || c3423e8 == null || c3423e8 == c3423e9) {
                                    return;
                                }
                                C3422d[] c3422dArr6 = c3423e8.f46093J;
                                C3422d c3422d24 = c3422dArr6[i5];
                                int i24 = i5 + 1;
                                C3422d c3422d25 = c3423e9.f46093J[i24];
                                C3422d c3422d26 = c3422d24.f46068d;
                                iVar5 = c3422d26 != null ? c3422d26.f46071g : null;
                                C3422d c3422d27 = c3422d25.f46068d;
                                s.i iVar18 = c3422d27 != null ? c3422d27.f46071g : null;
                                if (c3423e7 != c3423e9) {
                                    C3422d c3422d28 = c3423e7.f46093J[i24].f46068d;
                                    iVar18 = c3422d28 != null ? c3422d28.f46071g : null;
                                }
                                if (c3423e8 == c3423e9) {
                                    c3422d25 = c3422dArr6[i24];
                                }
                                if (iVar5 == null || iVar18 == null) {
                                    return;
                                }
                                c3404d2.c(c3422d24.f46071g, iVar5, c3422d24.b(), 0.5f, iVar18, c3422d25.f46071g, c3423e9.f46093J[i24].b(), 5);
                                return;
                            }
                        } else {
                            int i25 = c3421c.f46052j;
                            boolean z19 = i25 > 0 && c3421c.f46051i == i25;
                            C3423e c3423e15 = c3423e8;
                            C3423e c3423e16 = c3423e15;
                            while (c3423e15 != null) {
                                C3423e c3423e17 = c3423e15.f46147s0[i4];
                                while (true) {
                                    if (c3423e17 == null) {
                                        i6 = 8;
                                        break;
                                    }
                                    i6 = 8;
                                    if (c3423e17.M() != 8) {
                                        break;
                                    } else {
                                        c3423e17 = c3423e17.f46147s0[i4];
                                    }
                                }
                                if (c3423e17 != null || c3423e15 == c3423e9) {
                                    C3422d c3422d29 = c3423e15.f46093J[i5];
                                    s.i iVar19 = c3422d29.f46071g;
                                    C3422d c3422d30 = c3422d29.f46068d;
                                    s.i iVar20 = c3422d30 != null ? c3422d30.f46071g : null;
                                    if (c3423e16 != c3423e15) {
                                        iVar20 = c3423e16.f46093J[i5 + 1].f46071g;
                                    } else if (c3423e15 == c3423e8 && c3423e16 == c3423e15) {
                                        C3422d c3422d31 = c3423e6.f46093J[i5].f46068d;
                                        iVar20 = c3422d31 != null ? c3422d31.f46071g : null;
                                    }
                                    int b8 = c3422d29.b();
                                    int i26 = i5 + 1;
                                    int b9 = c3423e15.f46093J[i26].b();
                                    if (c3423e17 != null) {
                                        c3422d5 = c3423e17.f46093J[i5];
                                        iVar3 = c3422d5.f46071g;
                                        iVar4 = c3423e15.f46093J[i26].f46071g;
                                    } else {
                                        c3422d5 = c3423e7.f46093J[i26].f46068d;
                                        iVar3 = c3422d5 != null ? c3422d5.f46071g : null;
                                        iVar4 = c3423e15.f46093J[i26].f46071g;
                                    }
                                    if (c3422d5 != null) {
                                        b9 += c3422d5.b();
                                    }
                                    if (c3423e16 != null) {
                                        b8 += c3423e16.f46093J[i26].b();
                                    }
                                    if (iVar19 == null || iVar20 == null || iVar3 == null || iVar4 == null) {
                                        c3423e4 = c3423e17;
                                        c3423e5 = c3423e15;
                                        i7 = 8;
                                    } else {
                                        if (c3423e15 == c3423e8) {
                                            b8 = c3423e8.f46093J[i5].b();
                                        }
                                        if (c3423e15 == c3423e9) {
                                            b9 = c3423e9.f46093J[i26].b();
                                        }
                                        c3423e4 = c3423e17;
                                        c3423e5 = c3423e15;
                                        i7 = 8;
                                        c3404d.c(iVar19, iVar20, b8, 0.5f, iVar3, iVar4, b9, z19 ? 8 : 5);
                                    }
                                } else {
                                    c3423e4 = c3423e17;
                                    c3423e5 = c3423e15;
                                    i7 = i6;
                                }
                                if (c3423e5.M() != i7) {
                                    c3423e16 = c3423e5;
                                }
                                c3423e15 = c3423e4;
                            }
                        }
                        c3404d2 = c3404d;
                        if (z17) {
                        }
                        C3422d[] c3422dArr62 = c3423e8.f46093J;
                        C3422d c3422d242 = c3422dArr62[i5];
                        int i242 = i5 + 1;
                        C3422d c3422d252 = c3423e9.f46093J[i242];
                        C3422d c3422d262 = c3422d242.f46068d;
                        if (c3422d262 != null) {
                        }
                        C3422d c3422d272 = c3422d252.f46068d;
                        if (c3422d272 != null) {
                        }
                        if (c3423e7 != c3423e9) {
                        }
                        if (c3423e8 == c3423e9) {
                        }
                        if (iVar5 == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (z16) {
                    C3422d c3422d32 = c3422d11.f46068d;
                    if (c3422d32.f46066b == fVar) {
                        c3404d.e(c3422d11.f46071g, c3422d32.f46071g, -c3422d11.b(), 4);
                    }
                }
                c3404d.j(c3422d11.f46071g, c3423e7.f46093J[i14].f46068d.f46071g, -c3422d11.b(), 6);
                if (z15) {
                }
                arrayList = c3421c.f46050h;
                if (arrayList != null) {
                    if (c3421c.f46060r) {
                    }
                    float f82 = 0.0f;
                    float f92 = 0.0f;
                    C3423e c3423e112 = null;
                    i8 = 0;
                    while (i8 < size) {
                    }
                }
                if (c3423e8 == null) {
                }
                if (z17) {
                }
                int i182 = 8;
                if (z5) {
                    int i192 = c3421c.f46052j;
                    if (i192 <= 0) {
                    }
                    C3423e c3423e132 = c3423e8;
                    c3423e = c3423e132;
                    while (c3423e != null) {
                    }
                    c3404d2 = c3404d;
                    C3422d c3422d232 = c3423e8.f46093J[i5];
                    c3422d = c3423e6.f46093J[i5].f46068d;
                    int i232 = i5 + 1;
                    c3422d2 = c3423e9.f46093J[i232];
                    c3422d3 = c3423e7.f46093J[i232].f46068d;
                    if (c3422d != null) {
                    }
                    if (c3422d3 != null) {
                        c3404d2.e(c3422d2.f46071g, c3422d3.f46071g, -c3422d2.b(), 5);
                    }
                    if (z17) {
                    }
                    C3422d[] c3422dArr622 = c3423e8.f46093J;
                    C3422d c3422d2422 = c3422dArr622[i5];
                    int i2422 = i5 + 1;
                    C3422d c3422d2522 = c3423e9.f46093J[i2422];
                    C3422d c3422d2622 = c3422d2422.f46068d;
                    if (c3422d2622 != null) {
                    }
                    C3422d c3422d2722 = c3422d2522.f46068d;
                    if (c3422d2722 != null) {
                    }
                    if (c3423e7 != c3423e9) {
                    }
                    if (c3423e8 == c3423e9) {
                    }
                    if (iVar5 == null) {
                    }
                }
                c3404d2 = c3404d;
                if (z17) {
                }
                C3422d[] c3422dArr6222 = c3423e8.f46093J;
                C3422d c3422d24222 = c3422dArr6222[i5];
                int i24222 = i5 + 1;
                C3422d c3422d25222 = c3423e9.f46093J[i24222];
                C3422d c3422d26222 = c3422d24222.f46068d;
                if (c3422d26222 != null) {
                }
                C3422d c3422d27222 = c3422d25222.f46068d;
                if (c3422d27222 != null) {
                }
                if (c3423e7 != c3423e9) {
                }
                if (c3423e8 == c3423e9) {
                }
                if (iVar5 == null) {
                }
            }
        }
        if (z15) {
        }
        arrayList = c3421c.f46050h;
        if (arrayList != null) {
        }
        if (c3423e8 == null) {
        }
        if (z17) {
        }
        int i1822 = 8;
        if (z5) {
        }
        c3404d2 = c3404d;
        if (z17) {
        }
        C3422d[] c3422dArr62222 = c3423e8.f46093J;
        C3422d c3422d242222 = c3422dArr62222[i5];
        int i242222 = i5 + 1;
        C3422d c3422d252222 = c3423e9.f46093J[i242222];
        C3422d c3422d262222 = c3422d242222.f46068d;
        if (c3422d262222 != null) {
        }
        C3422d c3422d272222 = c3422d252222.f46068d;
        if (c3422d272222 != null) {
        }
        if (c3423e7 != c3423e9) {
        }
        if (c3423e8 == c3423e9) {
        }
        if (iVar5 == null) {
        }
    }
}
