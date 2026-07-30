package w;

import java.util.ArrayList;
import u.C5085b;
import u.C5086c;
import u.C5089f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f41559a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:162:0x028e, code lost:
    
        if (r8.f41409d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (r4.f41409d == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06ec A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C5145e c5145e, C5086c c5086c, ArrayList arrayList, int i) {
        int i4;
        C5142b[] c5142bArr;
        int i9;
        int i10;
        float f6;
        float f9;
        boolean z8;
        C5144d c5144d;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C5143c[] c5143cArr;
        int i11;
        C5142b[] c5142bArr2;
        C5144d c5144d2;
        C5086c c5086c2;
        C5089f c5089f;
        C5143c c5143c;
        C5089f c5089f2;
        C5144d c5144d3;
        int i12;
        C5143c c5143c2;
        C5089f c5089f3;
        C5144d c5144d4;
        C5144d c5144d5;
        int i13;
        C5143c c5143c3;
        int i14;
        C5143c[] c5143cArr2;
        C5143c c5143c4;
        C5089f c5089f4;
        C5089f c5089f5;
        int size;
        float f10;
        ArrayList arrayList2;
        int i15;
        float f11;
        C5144d c5144d6;
        int i16;
        float f12;
        C5142b[] c5142bArr3;
        boolean z13;
        int i17;
        C5144d c5144d7;
        int i18;
        int i19;
        int i20;
        C5143c c5143c5;
        C5144d c5144d8;
        C5145e c5145e2 = c5145e;
        C5086c c5086c3 = c5086c;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i4 = c5145e2.f41498z0;
            c5142bArr = c5145e2.C0;
            i9 = 0;
        } else {
            i4 = c5145e2.f41478A0;
            c5142bArr = c5145e2.f41479B0;
            i9 = 2;
        }
        int i21 = i4;
        C5142b[] c5142bArr4 = c5142bArr;
        int i22 = 0;
        while (i22 < i21) {
            C5142b c5142b = c5142bArr4[i22];
            boolean z14 = c5142b.f41405q;
            C5144d c5144d9 = c5142b.f41390a;
            int i23 = 3;
            int i24 = 8;
            if (z14) {
                i10 = i22;
                f6 = 0.0f;
            } else {
                int i25 = c5142b.f41400l;
                int i26 = i25 * 2;
                C5144d c5144d10 = c5144d9;
                C5144d c5144d11 = c5144d10;
                boolean z15 = false;
                f6 = 0.0f;
                while (!z15) {
                    c5142b.i++;
                    c5144d10.m0[i25] = null;
                    c5144d10.f41460l0[i25] = null;
                    int i27 = c5144d10.f41451g0;
                    C5143c[] c5143cArr3 = c5144d10.f41429Q;
                    if (i27 != i24) {
                        c5144d10.j(i25);
                        c5143cArr3[i26].e();
                        int i28 = i26 + 1;
                        c5143cArr3[i28].e();
                        c5143cArr3[i26].e();
                        c5143cArr3[i28].e();
                        if (c5142b.f41391b == null) {
                            c5142b.f41391b = c5144d10;
                        }
                        c5142b.f41393d = c5144d10;
                        int i29 = c5144d10.f41467p0[i25];
                        if (i29 == i23) {
                            int i30 = c5144d10.f41471t[i25];
                            if (i30 == 0 || i30 == i23 || i30 == 2) {
                                c5142b.f41398j++;
                                float f13 = c5144d10.f41458k0[i25];
                                if (f13 > 0.0f) {
                                    i19 = i22;
                                    c5142b.f41399k += f13;
                                } else {
                                    i19 = i22;
                                }
                                i20 = i25;
                                if (c5144d10.f41451g0 != 8 && i29 == 3 && (i30 == 0 || i30 == 3)) {
                                    if (f13 < 0.0f) {
                                        c5142b.f41402n = true;
                                    } else {
                                        c5142b.f41403o = true;
                                    }
                                    if (c5142b.f41397h == null) {
                                        c5142b.f41397h = new ArrayList();
                                    }
                                    c5142b.f41397h.add(c5144d10);
                                }
                                if (c5142b.f41395f == null) {
                                    c5142b.f41395f = c5144d10;
                                }
                                C5144d c5144d12 = c5142b.f41396g;
                                if (c5144d12 != null) {
                                    c5144d12.f41460l0[i20] = c5144d10;
                                }
                                c5142b.f41396g = c5144d10;
                            } else {
                                i19 = i22;
                                i20 = i25;
                            }
                            if (i20 == 0) {
                                if (c5144d10.f41469r == 0 && c5144d10.f41472u == 0) {
                                    int i31 = c5144d10.f41473v;
                                }
                            } else if (c5144d10.f41470s == 0 && c5144d10.f41475x == 0) {
                                int i32 = c5144d10.f41476y;
                            }
                            if (c5144d11 != c5144d10) {
                                c5144d11.m0[i20] = c5144d10;
                            }
                            c5143c5 = c5143cArr3[i26 + 1].f41411f;
                            if (c5143c5 != null) {
                                c5144d8 = c5143c5.f41409d;
                                C5143c c5143c6 = c5144d8.f41429Q[i26].f41411f;
                                if (c5143c6 != null) {
                                }
                            }
                            c5144d8 = null;
                            if (c5144d8 != null) {
                                c5144d8 = c5144d10;
                                z15 = true;
                            }
                            c5144d11 = c5144d10;
                            i25 = i20;
                            i23 = 3;
                            i24 = 8;
                            c5144d10 = c5144d8;
                            i22 = i19;
                        }
                    }
                    i19 = i22;
                    i20 = i25;
                    if (c5144d11 != c5144d10) {
                    }
                    c5143c5 = c5143cArr3[i26 + 1].f41411f;
                    if (c5143c5 != null) {
                    }
                    c5144d8 = null;
                    if (c5144d8 != null) {
                    }
                    c5144d11 = c5144d10;
                    i25 = i20;
                    i23 = 3;
                    i24 = 8;
                    c5144d10 = c5144d8;
                    i22 = i19;
                }
                i10 = i22;
                int i33 = i25;
                C5144d c5144d13 = c5142b.f41391b;
                if (c5144d13 != null) {
                    c5144d13.f41429Q[i26].e();
                }
                C5144d c5144d14 = c5142b.f41393d;
                if (c5144d14 != null) {
                    c5144d14.f41429Q[i26 + 1].e();
                }
                c5142b.f41392c = c5144d10;
                if (i33 == 0 && c5142b.f41401m) {
                    c5142b.f41394e = c5144d10;
                } else {
                    c5142b.f41394e = c5144d9;
                }
                c5142b.f41404p = c5142b.f41403o && c5142b.f41402n;
            }
            c5142b.f41405q = true;
            if (arrayList3 == null || arrayList3.contains(c5144d9)) {
                C5144d c5144d15 = c5142b.f41392c;
                C5144d c5144d16 = c5142b.f41391b;
                C5144d c5144d17 = c5142b.f41393d;
                C5144d c5144d18 = c5142b.f41394e;
                float f14 = c5142b.f41399k;
                boolean z16 = c5145e2.f41467p0[i] == 2;
                if (i == 0) {
                    int i34 = c5144d18.f41454i0;
                    boolean z17 = i34 == 0;
                    boolean z18 = i34 == 1;
                    z8 = i34 == 2;
                    z9 = z16;
                    z11 = z18;
                    z10 = z17;
                    z12 = false;
                    f9 = f14;
                    c5144d = c5144d9;
                } else {
                    int i35 = c5144d18.f41456j0;
                    boolean z19 = i35 == 0;
                    boolean z20 = i35 == 1;
                    f9 = f14;
                    z8 = i35 == 2;
                    c5144d = c5144d9;
                    z9 = z16;
                    z10 = z19;
                    z11 = z20;
                    z12 = false;
                }
                while (true) {
                    c5143cArr = c5145e2.f41429Q;
                    if (z12) {
                        break;
                    }
                    C5143c c5143c7 = c5144d.f41429Q[i9];
                    int i36 = z8 ? 1 : 4;
                    int e6 = c5143c7.e();
                    boolean z21 = z12;
                    int[] iArr = c5144d.f41467p0;
                    boolean z22 = z8;
                    boolean z23 = iArr[i] == 3 && c5144d.f41471t[i] == 0;
                    C5143c c5143c8 = c5143c7.f41411f;
                    if (c5143c8 != null && c5144d != c5144d9) {
                        e6 = c5143c8.e() + e6;
                    }
                    int i37 = e6;
                    if (z22 && c5144d != c5144d9 && c5144d != c5144d16) {
                        i36 = 8;
                    }
                    boolean z24 = z23;
                    C5143c c5143c9 = c5143c7.f41411f;
                    if (c5143c9 != null) {
                        if (c5144d == c5144d16) {
                            i17 = i21;
                            c5086c3.f(c5143c7.i, c5143c9.i, i37, 6);
                        } else {
                            i17 = i21;
                            c5086c3.f(c5143c7.i, c5143c9.i, i37, 8);
                        }
                        if (z24 && !z22) {
                            i36 = 5;
                        }
                        c5086c3.e(c5143c7.i, c5143c7.f41411f.i, i37, (c5144d == c5144d16 && z22 && c5144d.f41431S[i]) ? 5 : i36);
                    } else {
                        i17 = i21;
                    }
                    C5143c[] c5143cArr4 = c5144d.f41429Q;
                    if (z9) {
                        if (c5144d.f41451g0 == 8 || iArr[i] != 3) {
                            i18 = 0;
                        } else {
                            i18 = 0;
                            c5086c3.f(c5143cArr4[i9 + 1].i, c5143cArr4[i9].i, 0, 5);
                        }
                        c5086c3.f(c5143cArr4[i9].i, c5143cArr[i9].i, i18, 8);
                    }
                    C5143c c5143c10 = c5143cArr4[i9 + 1].f41411f;
                    if (c5143c10 != null) {
                        c5144d7 = c5143c10.f41409d;
                        C5143c c5143c11 = c5144d7.f41429Q[i9].f41411f;
                        if (c5143c11 != null) {
                        }
                    }
                    c5144d7 = null;
                    if (c5144d7 != null) {
                        c5144d = c5144d7;
                        z12 = z21;
                    } else {
                        z12 = true;
                    }
                    z8 = z22;
                    i21 = i17;
                }
                boolean z25 = z8;
                i11 = i21;
                if (c5144d17 != null) {
                    int i38 = i9 + 1;
                    if (c5144d15.f41429Q[i38].f41411f != null) {
                        C5143c c5143c12 = c5144d17.f41429Q[i38];
                        if (c5144d17.f41467p0[i] == 3 && c5144d17.f41471t[i] == 0 && !z25) {
                            C5143c c5143c13 = c5143c12.f41411f;
                            if (c5143c13.f41409d == c5145e2) {
                                c5086c3.e(c5143c12.i, c5143c13.i, -c5143c12.e(), 5);
                                c5086c3.g(c5143c12.i, c5144d15.f41429Q[i38].f41411f.i, -c5143c12.e(), 6);
                            }
                        }
                        if (z25) {
                            C5143c c5143c14 = c5143c12.f41411f;
                            if (c5143c14.f41409d == c5145e2) {
                                c5086c3.e(c5143c12.i, c5143c14.i, -c5143c12.e(), 4);
                            }
                        }
                        c5086c3.g(c5143c12.i, c5144d15.f41429Q[i38].f41411f.i, -c5143c12.e(), 6);
                    }
                }
                if (z9) {
                    int i39 = i9 + 1;
                    C5089f c5089f6 = c5143cArr[i39].i;
                    C5143c c5143c15 = c5144d15.f41429Q[i39];
                    c5086c3.f(c5089f6, c5143c15.i, c5143c15.e(), 8);
                }
                ArrayList arrayList4 = c5142b.f41397h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (c5142b.f41402n && !c5142b.f41404p) {
                        f9 = c5142b.f41398j;
                    }
                    C5144d c5144d19 = null;
                    float f15 = f6;
                    int i40 = 0;
                    while (i40 < size) {
                        C5144d c5144d20 = (C5144d) arrayList4.get(i40);
                        float f16 = c5144d20.f41458k0[i];
                        C5143c[] c5143cArr5 = c5144d20.f41429Q;
                        if (f16 >= f6) {
                            f10 = f16;
                        } else if (c5142b.f41404p) {
                            arrayList2 = arrayList4;
                            i15 = size;
                            c5086c3.e(c5143cArr5[i9 + 1].i, c5143cArr5[i9].i, 0, 4);
                            z13 = false;
                            i16 = i40;
                            f12 = f6;
                            c5142bArr3 = c5142bArr4;
                            i40 = i16 + 1;
                            c5142bArr4 = c5142bArr3;
                            arrayList4 = arrayList2;
                            size = i15;
                            f6 = f12;
                        } else {
                            f10 = 1.0f;
                        }
                        arrayList2 = arrayList4;
                        i15 = size;
                        if (f10 == f6) {
                            z13 = false;
                            c5086c3.e(c5143cArr5[i9 + 1].i, c5143cArr5[i9].i, 0, 8);
                            i16 = i40;
                            f12 = f6;
                            c5142bArr3 = c5142bArr4;
                            i40 = i16 + 1;
                            c5142bArr4 = c5142bArr3;
                            arrayList4 = arrayList2;
                            size = i15;
                            f6 = f12;
                        } else {
                            if (c5144d19 != null) {
                                C5143c[] c5143cArr6 = c5144d19.f41429Q;
                                C5089f c5089f7 = c5143cArr6[i9].i;
                                int i41 = i9 + 1;
                                C5089f c5089f8 = c5143cArr6[i41].i;
                                f11 = f10;
                                C5089f c5089f9 = c5143cArr5[i9].i;
                                C5089f c5089f10 = c5143cArr5[i41].i;
                                c5144d6 = c5144d20;
                                C5085b l9 = c5086c3.l();
                                i16 = i40;
                                float f17 = f6;
                                l9.f40965b = f17;
                                f12 = f17;
                                if (f9 == f17 || f15 == f11) {
                                    c5142bArr3 = c5142bArr4;
                                    l9.f40967d.g(c5089f7, 1.0f);
                                    l9.f40967d.g(c5089f8, -1.0f);
                                    l9.f40967d.g(c5089f10, 1.0f);
                                    l9.f40967d.g(c5089f9, -1.0f);
                                } else {
                                    if (f15 == f12) {
                                        l9.f40967d.g(c5089f7, 1.0f);
                                        l9.f40967d.g(c5089f8, -1.0f);
                                    } else if (f10 == f6) {
                                        l9.f40967d.g(c5089f9, 1.0f);
                                        l9.f40967d.g(c5089f10, -1.0f);
                                    } else {
                                        float f18 = (f15 / f9) / (f11 / f9);
                                        c5142bArr3 = c5142bArr4;
                                        l9.f40967d.g(c5089f7, 1.0f);
                                        l9.f40967d.g(c5089f8, -1.0f);
                                        l9.f40967d.g(c5089f10, f18);
                                        l9.f40967d.g(c5089f9, -f18);
                                    }
                                    c5142bArr3 = c5142bArr4;
                                }
                                c5086c3.c(l9);
                            } else {
                                f11 = f10;
                                c5144d6 = c5144d20;
                                i16 = i40;
                                f12 = f6;
                                c5142bArr3 = c5142bArr4;
                            }
                            c5144d19 = c5144d6;
                            f15 = f11;
                            i40 = i16 + 1;
                            c5142bArr4 = c5142bArr3;
                            arrayList4 = arrayList2;
                            size = i15;
                            f6 = f12;
                        }
                    }
                }
                c5142bArr2 = c5142bArr4;
                if (c5144d16 == null || !(c5144d16 == c5144d17 || z25)) {
                    c5144d2 = c5144d17;
                    if (z10 && c5144d16 != null) {
                        int i42 = c5142b.f41398j;
                        boolean z26 = i42 > 0 && c5142b.i == i42;
                        C5144d c5144d21 = c5144d16;
                        C5144d c5144d22 = c5144d21;
                        while (c5144d21 != null) {
                            C5144d c5144d23 = c5144d21.m0[i];
                            while (true) {
                                if (c5144d23 == null) {
                                    i12 = 8;
                                    break;
                                }
                                i12 = 8;
                                if (c5144d23.f41451g0 != 8) {
                                    break;
                                } else {
                                    c5144d23 = c5144d23.m0[i];
                                }
                            }
                            if (c5144d23 != null || c5144d21 == c5144d2) {
                                C5143c[] c5143cArr7 = c5144d21.f41429Q;
                                C5143c c5143c16 = c5143cArr7[i9];
                                C5089f c5089f11 = c5143c16.i;
                                C5143c c5143c17 = c5143c16.f41411f;
                                C5089f c5089f12 = c5143c17 != null ? c5143c17.i : null;
                                if (c5144d22 != c5144d21) {
                                    c5089f12 = c5144d22.f41429Q[i9 + 1].i;
                                } else if (c5144d21 == c5144d16) {
                                    C5143c c5143c18 = c5144d9.f41429Q[i9].f41411f;
                                    c5089f12 = c5143c18 != null ? c5143c18.i : null;
                                }
                                int e9 = c5143c16.e();
                                int i43 = i9 + 1;
                                int e10 = c5143cArr7[i43].e();
                                if (c5144d23 != null) {
                                    c5143c2 = c5144d23.f41429Q[i9];
                                    c5089f3 = c5143c2.i;
                                } else {
                                    c5143c2 = c5144d15.f41429Q[i43].f41411f;
                                    c5089f3 = c5143c2 != null ? c5143c2.i : null;
                                }
                                C5089f c5089f13 = c5143cArr7[i43].i;
                                if (c5143c2 != null) {
                                    e10 += c5143c2.e();
                                }
                                int e11 = c5144d22.f41429Q[i43].e() + e9;
                                if (c5089f11 == null || c5089f12 == null || c5089f3 == null || c5089f13 == null) {
                                    c5144d4 = c5144d9;
                                    c5144d5 = c5144d22;
                                    i13 = 8;
                                } else {
                                    if (c5144d21 == c5144d16) {
                                        e11 = c5144d16.f41429Q[i9].e();
                                    }
                                    if (c5144d21 == c5144d2) {
                                        e10 = c5144d2.f41429Q[i43].e();
                                    }
                                    c5144d4 = c5144d9;
                                    c5144d5 = c5144d22;
                                    i13 = 8;
                                    c5086c.b(c5089f11, c5089f12, e11, 0.5f, c5089f3, c5089f13, e10, z26 ? 8 : 5);
                                }
                            } else {
                                c5144d4 = c5144d9;
                                c5144d5 = c5144d22;
                                i13 = i12;
                            }
                            if (c5144d21.f41451g0 != i13) {
                                c5144d5 = c5144d21;
                            }
                            c5144d21 = c5144d23;
                            c5144d22 = c5144d5;
                            c5144d9 = c5144d4;
                        }
                    } else if (z11 && c5144d16 != null) {
                        int i44 = c5142b.f41398j;
                        boolean z27 = i44 > 0 && c5142b.i == i44;
                        C5144d c5144d24 = c5144d16;
                        C5144d c5144d25 = c5144d24;
                        while (c5144d24 != null) {
                            C5144d c5144d26 = c5144d24.m0[i];
                            while (c5144d26 != null && c5144d26.f41451g0 == 8) {
                                c5144d26 = c5144d26.m0[i];
                            }
                            if (c5144d24 != c5144d16 && c5144d24 != c5144d2 && c5144d26 != null) {
                                if (c5144d26 == c5144d2) {
                                    c5144d26 = null;
                                }
                                C5143c[] c5143cArr8 = c5144d24.f41429Q;
                                C5143c c5143c19 = c5143cArr8[i9];
                                C5089f c5089f14 = c5143c19.i;
                                int i45 = i9 + 1;
                                C5089f c5089f15 = c5144d25.f41429Q[i45].i;
                                int e12 = c5143c19.e();
                                int e13 = c5143cArr8[i45].e();
                                if (c5144d26 != null) {
                                    c5143c = c5144d26.f41429Q[i9];
                                    c5089f2 = c5143c.i;
                                    C5143c c5143c20 = c5143c.f41411f;
                                    c5089f = c5143c20 != null ? c5143c20.i : null;
                                } else {
                                    C5143c c5143c21 = c5144d2.f41429Q[i9];
                                    C5089f c5089f16 = c5143c21 != null ? c5143c21.i : null;
                                    c5089f = c5143cArr8[i45].i;
                                    c5143c = c5143c21;
                                    c5089f2 = c5089f16;
                                }
                                if (c5143c != null) {
                                    e13 += c5143c.e();
                                }
                                int e14 = c5144d25.f41429Q[i45].e() + e12;
                                C5089f c5089f17 = c5089f2;
                                int i46 = e13;
                                C5089f c5089f18 = c5089f;
                                int i47 = z27 ? 8 : 4;
                                if (c5089f14 == null || c5089f15 == null || c5089f17 == null || c5089f18 == null) {
                                    c5144d3 = c5144d26;
                                } else {
                                    c5144d3 = c5144d26;
                                    c5086c.b(c5089f14, c5089f15, e14, 0.5f, c5089f17, c5089f18, i46, i47);
                                }
                                c5144d26 = c5144d3;
                            }
                            if (c5144d24.f41451g0 != 8) {
                                c5144d25 = c5144d24;
                            }
                            c5144d24 = c5144d26;
                        }
                        C5143c c5143c22 = c5144d16.f41429Q[i9];
                        C5143c c5143c23 = c5144d9.f41429Q[i9].f41411f;
                        int i48 = i9 + 1;
                        C5143c c5143c24 = c5144d2.f41429Q[i48];
                        C5143c c5143c25 = c5144d15.f41429Q[i48].f41411f;
                        if (c5143c23 != null) {
                            if (c5144d16 != c5144d2) {
                                c5086c.e(c5143c22.i, c5143c23.i, c5143c22.e(), 5);
                            } else if (c5143c25 != null) {
                                c5086c2 = c5086c;
                                c5086c2.b(c5143c22.i, c5143c23.i, c5143c22.e(), 0.5f, c5143c24.i, c5143c25.i, c5143c24.e(), 5);
                                if (c5143c25 != null && c5144d16 != c5144d2) {
                                    c5086c2.e(c5143c24.i, c5143c25.i, -c5143c24.e(), 5);
                                }
                                if ((!z10 || z11) && c5144d16 != null && c5144d16 != c5144d2) {
                                    C5143c[] c5143cArr9 = c5144d16.f41429Q;
                                    c5143c3 = c5143cArr9[i9];
                                    if (c5144d2 == null) {
                                        c5144d2 = c5144d16;
                                    }
                                    i14 = i9 + 1;
                                    c5143cArr2 = c5144d2.f41429Q;
                                    c5143c4 = c5143cArr2[i14];
                                    C5143c c5143c26 = c5143c3.f41411f;
                                    c5089f4 = c5143c26 != null ? c5143c26.i : null;
                                    C5143c c5143c27 = c5143c4.f41411f;
                                    c5089f5 = c5143c27 != null ? c5143c27.i : null;
                                    if (c5144d15 != c5144d2) {
                                        C5143c c5143c28 = c5144d15.f41429Q[i14].f41411f;
                                        c5089f5 = c5143c28 != null ? c5143c28.i : null;
                                    }
                                    if (c5144d16 == c5144d2) {
                                        c5143c4 = c5143cArr9[i14];
                                    }
                                    if (c5089f4 == null && c5089f5 != null) {
                                        c5086c2.b(c5143c3.i, c5089f4, c5143c3.e(), 0.5f, c5089f5, c5143c4.i, c5143cArr2[i14].e(), 5);
                                    }
                                }
                            }
                        }
                        c5086c2 = c5086c;
                        if (c5143c25 != null) {
                            c5086c2.e(c5143c24.i, c5143c25.i, -c5143c24.e(), 5);
                        }
                        if (!z10) {
                        }
                        C5143c[] c5143cArr92 = c5144d16.f41429Q;
                        c5143c3 = c5143cArr92[i9];
                        if (c5144d2 == null) {
                        }
                        i14 = i9 + 1;
                        c5143cArr2 = c5144d2.f41429Q;
                        c5143c4 = c5143cArr2[i14];
                        C5143c c5143c262 = c5143c3.f41411f;
                        if (c5143c262 != null) {
                        }
                        C5143c c5143c272 = c5143c4.f41411f;
                        if (c5143c272 != null) {
                        }
                        if (c5144d15 != c5144d2) {
                        }
                        if (c5144d16 == c5144d2) {
                        }
                        if (c5089f4 == null) {
                            c5086c2.b(c5143c3.i, c5089f4, c5143c3.e(), 0.5f, c5089f5, c5143c4.i, c5143cArr2[i14].e(), 5);
                        }
                    }
                } else {
                    C5143c c5143c29 = c5144d9.f41429Q[i9];
                    int i49 = i9 + 1;
                    C5143c c5143c30 = c5144d15.f41429Q[i49];
                    C5143c c5143c31 = c5143c29.f41411f;
                    C5089f c5089f19 = c5143c31 != null ? c5143c31.i : null;
                    C5143c c5143c32 = c5143c30.f41411f;
                    C5089f c5089f20 = c5143c32 != null ? c5143c32.i : null;
                    C5143c c5143c33 = c5144d16.f41429Q[i9];
                    if (c5144d17 != null) {
                        c5143c30 = c5144d17.f41429Q[i49];
                    }
                    if (c5089f19 == null || c5089f20 == null) {
                        c5144d2 = c5144d17;
                    } else {
                        float f19 = i == 0 ? c5144d18.f41445d0 : c5144d18.f41447e0;
                        int e15 = c5143c33.e();
                        int e16 = c5143c30.e();
                        C5089f c5089f21 = c5143c33.i;
                        C5089f c5089f22 = c5143c30.i;
                        C5089f c5089f23 = c5089f19;
                        c5144d2 = c5144d17;
                        c5086c3.b(c5089f21, c5089f23, e15, f19, c5089f20, c5089f22, e16, 7);
                    }
                }
                c5086c2 = c5086c;
                if (!z10) {
                }
                C5143c[] c5143cArr922 = c5144d16.f41429Q;
                c5143c3 = c5143cArr922[i9];
                if (c5144d2 == null) {
                }
                i14 = i9 + 1;
                c5143cArr2 = c5144d2.f41429Q;
                c5143c4 = c5143cArr2[i14];
                C5143c c5143c2622 = c5143c3.f41411f;
                if (c5143c2622 != null) {
                }
                C5143c c5143c2722 = c5143c4.f41411f;
                if (c5143c2722 != null) {
                }
                if (c5144d15 != c5144d2) {
                }
                if (c5144d16 == c5144d2) {
                }
                if (c5089f4 == null) {
                }
            } else {
                i11 = i21;
                c5142bArr2 = c5142bArr4;
            }
            i22 = i10 + 1;
            c5145e2 = c5145e;
            c5086c3 = c5086c;
            arrayList3 = arrayList;
            c5142bArr4 = c5142bArr2;
            i21 = i11;
        }
    }

    public static void b(C5145e c5145e, C5086c c5086c, C5144d c5144d) {
        c5144d.f41464o = -1;
        c5144d.f41466p = -1;
        int i = c5145e.f41467p0[0];
        int[] iArr = c5144d.f41467p0;
        if (i != 2 && iArr[0] == 4) {
            C5143c c5143c = c5144d.f41422I;
            int i4 = c5143c.f41412g;
            int q6 = c5145e.q();
            C5143c c5143c2 = c5144d.f41423K;
            int i9 = q6 - c5143c2.f41412g;
            c5143c.i = c5086c.k(c5143c);
            c5143c2.i = c5086c.k(c5143c2);
            c5086c.d(c5143c.i, i4);
            c5086c.d(c5143c2.i, i9);
            c5144d.f41464o = 2;
            c5144d.Y = i4;
            int i10 = i9 - i4;
            c5144d.f41433U = i10;
            int i11 = c5144d.f41441b0;
            if (i10 < i11) {
                c5144d.f41433U = i11;
            }
        }
        if (c5145e.f41467p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C5143c c5143c3 = c5144d.J;
        int i12 = c5143c3.f41412g;
        int k6 = c5145e.k();
        C5143c c5143c4 = c5144d.f41424L;
        int i13 = k6 - c5143c4.f41412g;
        c5143c3.i = c5086c.k(c5143c3);
        c5143c4.i = c5086c.k(c5143c4);
        c5086c.d(c5143c3.i, i12);
        c5086c.d(c5143c4.i, i13);
        if (c5144d.f41439a0 > 0 || c5144d.f41451g0 == 8) {
            C5143c c5143c5 = c5144d.f41425M;
            C5089f k9 = c5086c.k(c5143c5);
            c5143c5.i = k9;
            c5086c.d(k9, c5144d.f41439a0 + i12);
        }
        c5144d.f41466p = 2;
        c5144d.f41437Z = i12;
        int i14 = i13 - i12;
        c5144d.f41434V = i14;
        int i15 = c5144d.f41443c0;
        if (i14 < i15) {
            c5144d.f41434V = i15;
        }
    }

    public static final boolean c(int i, int i4) {
        return (i & i4) == i4;
    }
}
