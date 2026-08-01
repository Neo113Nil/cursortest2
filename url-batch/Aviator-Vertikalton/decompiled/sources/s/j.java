package s;

import java.util.ArrayList;
import q.C0314b;
import q.C0315c;
import q.C0318f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f4144a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.f4001d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.f4001d == r13) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0707 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C0326e c0326e, C0315c c0315c, ArrayList arrayList, int i) {
        int i2;
        C0323b[] c0323bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0325d c0325d;
        boolean z4;
        boolean z5;
        C0324c[] c0324cArr;
        int i5;
        C0323b[] c0323bArr2;
        ArrayList arrayList2;
        C0325d c0325d2;
        int i6;
        C0325d c0325d3;
        int i7;
        C0324c c0324c;
        C0324c c0324c2;
        int i8;
        C0325d c0325d4;
        int i9;
        int i10;
        C0325d c0325d5;
        C0318f c0318f;
        C0318f c0318f2;
        C0324c c0324c3;
        C0324c c0324c4;
        C0318f c0318f3;
        C0325d c0325d6;
        C0325d c0325d7;
        C0325d c0325d8;
        C0324c c0324c5;
        C0325d c0325d9;
        int i11;
        C0324c[] c0324cArr2;
        C0324c c0324c6;
        C0318f c0318f4;
        C0318f c0318f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0325d c0325d10;
        boolean z6;
        C0325d c0325d11;
        C0323b c0323b;
        C0325d c0325d12;
        C0325d c0325d13;
        int i14;
        int i15;
        C0325d c0325d14;
        C0324c c0324c7;
        C0325d c0325d15;
        C0326e c0326e2 = c0326e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0326e2.f4087z0;
            c0323bArr = c0326e2.C0;
            i3 = 0;
        } else {
            i2 = c0326e2.f4068A0;
            c0323bArr = c0326e2.f4069B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0323b c0323b2 = c0323bArr[i17];
            boolean z7 = c0323b2.f3997q;
            C0325d c0325d16 = c0323b2.f3983a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0323b2.f3992l;
                int i22 = i21 * 2;
                C0325d c0325d17 = c0325d16;
                C0325d c0325d18 = c0325d17;
                boolean z8 = false;
                while (!z8) {
                    c0323b2.i += i19;
                    c0325d17.m0[i21] = null;
                    c0325d17.f4050l0[i21] = null;
                    int i23 = c0325d17.f4043g0;
                    C0324c[] c0324cArr3 = c0325d17.f4020Q;
                    if (i23 != i20) {
                        c0325d17.j(i21);
                        c0324cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0324cArr3[i24].e();
                        c0324cArr3[i22].e();
                        c0324cArr3[i24].e();
                        if (c0323b2.f3984b == null) {
                            c0323b2.f3984b = c0325d17;
                        }
                        c0323b2.f3986d = c0325d17;
                        int i25 = c0325d17.f4057p0[i21];
                        if (i25 == i18) {
                            int i26 = c0325d17.f4061t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0323b2.f3990j++;
                                float f4 = c0325d17.f4048k0[i21];
                                if (f4 > 0.0f) {
                                    c0323b2.f3991k += f4;
                                }
                                i15 = i17;
                                if (c0325d17.f4043g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0323b2.f3994n = true;
                                    } else {
                                        c0323b2.f3995o = true;
                                    }
                                    if (c0323b2.h == null) {
                                        c0323b2.h = new ArrayList();
                                    }
                                    c0323b2.h.add(c0325d17);
                                }
                                if (c0323b2.f3988f == null) {
                                    c0323b2.f3988f = c0325d17;
                                }
                                C0325d c0325d19 = c0323b2.f3989g;
                                if (c0325d19 != null) {
                                    c0325d19.f4050l0[i21] = c0325d17;
                                }
                                c0323b2.f3989g = c0325d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0325d17.f4059r == 0 && c0325d17.f4062u == 0) {
                                    int i27 = c0325d17.f4063v;
                                }
                            } else if (c0325d17.f4060s == 0 && c0325d17.f4065x == 0) {
                                int i28 = c0325d17.f4066y;
                            }
                            c0325d14 = c0325d18;
                            if (c0325d14 != c0325d17) {
                                c0325d14.m0[i21] = c0325d17;
                            }
                            c0324c7 = c0324cArr3[i22 + 1].f4003f;
                            if (c0324c7 != null) {
                                c0325d15 = c0324c7.f4001d;
                                C0324c c0324c8 = c0325d15.f4020Q[i22].f4003f;
                                if (c0324c8 != null) {
                                }
                            }
                            c0325d15 = null;
                            if (c0325d15 != null) {
                                c0325d15 = c0325d17;
                                z8 = true;
                            }
                            c0325d18 = c0325d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0325d17 = c0325d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0325d14 = c0325d18;
                    if (c0325d14 != c0325d17) {
                    }
                    c0324c7 = c0324cArr3[i22 + 1].f4003f;
                    if (c0324c7 != null) {
                    }
                    c0325d15 = null;
                    if (c0325d15 != null) {
                    }
                    c0325d18 = c0325d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0325d17 = c0325d15;
                    i18 = 3;
                }
                i4 = i17;
                C0325d c0325d20 = c0323b2.f3984b;
                if (c0325d20 != null) {
                    c0325d20.f4020Q[i22].e();
                }
                C0325d c0325d21 = c0323b2.f3986d;
                if (c0325d21 != null) {
                    c0325d21.f4020Q[i22 + 1].e();
                }
                c0323b2.f3985c = c0325d17;
                if (i21 == 0 && c0323b2.f3993m) {
                    c0323b2.f3987e = c0325d17;
                } else {
                    c0323b2.f3987e = c0325d16;
                }
                c0323b2.f3996p = c0323b2.f3995o && c0323b2.f3994n;
                z2 = true;
            }
            c0323b2.f3997q = z2;
            if (arrayList4 == null || arrayList4.contains(c0325d16)) {
                C0325d c0325d22 = c0323b2.f3985c;
                C0325d c0325d23 = c0323b2.f3984b;
                C0325d c0325d24 = c0323b2.f3986d;
                C0325d c0325d25 = c0323b2.f3987e;
                float f5 = c0323b2.f3991k;
                boolean z9 = c0326e2.f4057p0[i] == 2;
                if (i == 0) {
                    int i29 = c0325d25.i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0325d = c0325d16;
                    z4 = z10;
                } else {
                    int i30 = c0325d25.f4046j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0325d = c0325d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0324cArr = c0326e2.f4020Q;
                    if (z13) {
                        break;
                    }
                    C0324c c0324c9 = c0325d.f4020Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0324c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0325d.f4057p0;
                    int i32 = i2;
                    C0323b[] c0323bArr3 = c0323bArr;
                    boolean z15 = iArr[i] == 3 && c0325d.f4061t[i] == 0;
                    C0324c c0324c10 = c0324c9.f4003f;
                    if (c0324c10 != null && c0325d != c0325d16) {
                        e2 = c0324c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0325d == c0325d16 || c0325d == c0325d23) {
                        c0325d11 = c0325d25;
                    } else {
                        c0325d11 = c0325d25;
                        i31 = 8;
                    }
                    C0324c c0324c11 = c0324c9.f4003f;
                    if (c0324c11 != null) {
                        if (c0325d == c0325d23) {
                            c0325d12 = c0325d16;
                            c0323b = c0323b2;
                            c0315c.f(c0324c9.i, c0324c11.i, i33, 6);
                        } else {
                            c0323b = c0323b2;
                            c0325d12 = c0325d16;
                            c0315c.f(c0324c9.i, c0324c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0315c.e(c0324c9.i, c0324c9.f4003f.i, i33, (c0325d == c0325d23 && z3 && c0325d.f4022S[i]) ? 5 : i31);
                    } else {
                        c0323b = c0323b2;
                        c0325d12 = c0325d16;
                    }
                    C0324c[] c0324cArr4 = c0325d.f4020Q;
                    if (z9) {
                        if (c0325d.f4043g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0315c.f(c0324cArr4[i3 + 1].i, c0324cArr4[i3].i, 0, 5);
                        }
                        c0315c.f(c0324cArr4[i3].i, c0324cArr[i3].i, i14, 8);
                    }
                    C0324c c0324c12 = c0324cArr4[i3 + 1].f4003f;
                    if (c0324c12 != null) {
                        c0325d13 = c0324c12.f4001d;
                        C0324c c0324c13 = c0325d13.f4020Q[i3].f4003f;
                        if (c0324c13 != null) {
                        }
                    }
                    c0325d13 = null;
                    if (c0325d13 != null) {
                        c0325d = c0325d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0325d25 = c0325d11;
                    i2 = i32;
                    c0323bArr = c0323bArr3;
                    c0325d16 = c0325d12;
                    c0323b2 = c0323b;
                }
                C0323b c0323b3 = c0323b2;
                C0325d c0325d26 = c0325d25;
                C0325d c0325d27 = c0325d16;
                i5 = i2;
                c0323bArr2 = c0323bArr;
                if (c0325d24 != null) {
                    int i34 = i3 + 1;
                    if (c0325d22.f4020Q[i34].f4003f != null) {
                        C0324c c0324c14 = c0325d24.f4020Q[i34];
                        if (c0325d24.f4057p0[i] == 3 && c0325d24.f4061t[i] == 0 && !z3) {
                            C0324c c0324c15 = c0324c14.f4003f;
                            if (c0324c15.f4001d == c0326e2) {
                                c0315c.e(c0324c14.i, c0324c15.i, -c0324c14.e(), 5);
                                c0315c.g(c0324c14.i, c0325d22.f4020Q[i34].f4003f.i, -c0324c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0318f c0318f6 = c0324cArr[i35].i;
                                    C0324c c0324c16 = c0325d22.f4020Q[i35];
                                    c0315c.f(c0318f6, c0324c16.i, c0324c16.e(), 8);
                                }
                                arrayList2 = c0323b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0323b3.f3994n || c0323b3.f3996p) ? f2 : c0323b3.f3990j;
                                    C0325d c0325d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0325d c0325d29 = (C0325d) arrayList2.get(i12);
                                        float f8 = c0325d29.f4048k0[i];
                                        C0324c[] c0324cArr5 = c0325d29.f4020Q;
                                        if (f8 < 0.0f) {
                                            if (c0323b3.f3996p) {
                                                C0318f c0318f7 = c0324cArr5[i3 + 1].i;
                                                C0318f c0318f8 = c0324cArr5[i3].i;
                                                z6 = false;
                                                c0315c.e(c0318f7, c0318f8, 0, 4);
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                i12++;
                                                size = i13;
                                                arrayList2 = arrayList3;
                                            } else {
                                                f8 = 1.0f;
                                            }
                                        }
                                        if (f8 == 0.0f) {
                                            C0318f c0318f9 = c0324cArr5[i3 + 1].i;
                                            C0318f c0318f10 = c0324cArr5[i3].i;
                                            z6 = false;
                                            c0315c.e(c0318f9, c0318f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0325d28 != null) {
                                                C0324c[] c0324cArr6 = c0325d28.f4020Q;
                                                C0318f c0318f11 = c0324cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0318f c0318f12 = c0324cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0318f c0318f13 = c0324cArr5[i3].i;
                                                C0318f c0318f14 = c0324cArr5[i36].i;
                                                i13 = size;
                                                C0314b l2 = c0315c.l();
                                                c0325d10 = c0325d29;
                                                l2.f3898b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.f3900d.g(c0318f11, 1.0f);
                                                    l2.f3900d.g(c0318f12, -1.0f);
                                                    l2.f3900d.g(c0318f14, 1.0f);
                                                    l2.f3900d.g(c0318f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.f3900d.g(c0318f11, 1.0f);
                                                        l2.f3900d.g(c0318f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.f3900d.g(c0318f13, 1.0f);
                                                        l2.f3900d.g(c0318f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.f3900d.g(c0318f11, 1.0f);
                                                        l2.f3900d.g(c0318f12, -1.0f);
                                                        l2.f3900d.g(c0318f14, f9);
                                                        l2.f3900d.g(c0318f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0315c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0325d10 = c0325d29;
                                            }
                                            f7 = f3;
                                            c0325d28 = c0325d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0325d23 == null && (c0325d23 == c0325d24 || z3)) {
                                    C0324c c0324c17 = c0325d27.f4020Q[i3];
                                    int i37 = i3 + 1;
                                    C0324c c0324c18 = c0325d22.f4020Q[i37];
                                    C0324c c0324c19 = c0324c17.f4003f;
                                    C0318f c0318f15 = c0324c19 != null ? c0324c19.i : null;
                                    C0324c c0324c20 = c0324c18.f4003f;
                                    C0318f c0318f16 = c0324c20 != null ? c0324c20.i : null;
                                    C0324c c0324c21 = c0325d23.f4020Q[i3];
                                    if (c0325d24 != null) {
                                        c0324c18 = c0325d24.f4020Q[i37];
                                    }
                                    if (c0318f15 == null || c0318f16 == null) {
                                        c0325d2 = c0325d24;
                                        i6 = i4;
                                    } else {
                                        c0325d2 = c0325d24;
                                        i6 = i4;
                                        c0315c.b(c0324c21.i, c0318f15, c0324c21.e(), i == 0 ? c0325d26.f4037d0 : c0325d26.f4039e0, c0318f16, c0324c18.i, c0324c18.e(), 7);
                                    }
                                } else {
                                    c0325d2 = c0325d24;
                                    i6 = i4;
                                    if (z4 || c0325d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0325d23 != null) {
                                            int i39 = c0323b3.f3990j;
                                            boolean z16 = i39 <= 0 && c0323b3.i == i39;
                                            C0325d c0325d30 = c0325d23;
                                            c0325d3 = c0325d30;
                                            while (c0325d3 != null) {
                                                C0325d c0325d31 = c0325d3.m0[i];
                                                while (c0325d31 != null && c0325d31.f4043g0 == i38) {
                                                    c0325d31 = c0325d31.m0[i];
                                                }
                                                if (c0325d3 == c0325d23 || c0325d3 == c0325d2 || c0325d31 == null) {
                                                    c0325d4 = c0325d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0325d c0325d32 = c0325d31 == c0325d2 ? null : c0325d31;
                                                    C0324c[] c0324cArr7 = c0325d3.f4020Q;
                                                    C0324c c0324c22 = c0324cArr7[i3];
                                                    C0318f c0318f17 = c0324c22.i;
                                                    int i40 = i3 + 1;
                                                    C0318f c0318f18 = c0325d30.f4020Q[i40].i;
                                                    int e3 = c0324c22.e();
                                                    int e4 = c0324cArr7[i40].e();
                                                    if (c0325d32 != null) {
                                                        c0324c3 = c0325d32.f4020Q[i3];
                                                        c0318f = c0324c3.i;
                                                        c0325d5 = c0325d32;
                                                        C0324c c0324c23 = c0324c3.f4003f;
                                                        c0318f2 = c0324c23 != null ? c0324c23.i : null;
                                                    } else {
                                                        c0325d5 = c0325d32;
                                                        C0324c c0324c24 = c0325d2.f4020Q[i3];
                                                        c0318f = c0324c24 != null ? c0324c24.i : null;
                                                        c0318f2 = c0324cArr7[i40].i;
                                                        c0324c3 = c0324c24;
                                                    }
                                                    int e5 = c0324c3 != null ? c0324c3.e() + e4 : e4;
                                                    int e6 = c0325d30.f4020Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0318f17 == null || c0318f18 == null || c0318f == null || c0318f2 == null) {
                                                        c0325d4 = c0325d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0325d4 = c0325d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0315c.b(c0318f17, c0318f18, e6, 0.5f, c0318f, c0318f2, i42, i41);
                                                    }
                                                    c0325d31 = c0325d5;
                                                }
                                                c0325d30 = c0325d3.f4043g0 != i10 ? c0325d3 : c0325d4;
                                                c0325d3 = c0325d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0324c c0324c25 = c0325d23.f4020Q[i3];
                                            c0324c = c0325d27.f4020Q[i3].f4003f;
                                            int i43 = i3 + 1;
                                            C0324c c0324c26 = c0325d2.f4020Q[i43];
                                            c0324c2 = c0325d22.f4020Q[i43].f4003f;
                                            if (c0324c != null) {
                                                if (c0325d23 != c0325d2) {
                                                    c0315c.e(c0324c25.i, c0324c.i, c0324c25.e(), 5);
                                                } else if (c0324c2 != null) {
                                                    i8 = 5;
                                                    c0315c.b(c0324c25.i, c0324c.i, c0324c25.e(), 0.5f, c0324c26.i, c0324c2.i, c0324c26.e(), 5);
                                                    if (c0324c2 != null && c0325d23 != c0325d2) {
                                                        c0315c.e(c0324c26.i, c0324c2.i, -c0324c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0325d23 != null && c0325d23 != c0325d2) {
                                                        C0324c[] c0324cArr8 = c0325d23.f4020Q;
                                                        c0324c5 = c0324cArr8[i3];
                                                        c0325d9 = c0325d2 != null ? c0325d23 : c0325d2;
                                                        i11 = i3 + 1;
                                                        c0324cArr2 = c0325d9.f4020Q;
                                                        c0324c6 = c0324cArr2[i11];
                                                        C0324c c0324c27 = c0324c5.f4003f;
                                                        c0318f4 = c0324c27 == null ? c0324c27.i : null;
                                                        C0324c c0324c28 = c0324c6.f4003f;
                                                        c0318f5 = c0324c28 == null ? c0324c28.i : null;
                                                        if (c0325d22 != c0325d9) {
                                                            C0324c c0324c29 = c0325d22.f4020Q[i11].f4003f;
                                                            c0318f5 = c0324c29 != null ? c0324c29.i : null;
                                                        }
                                                        if (c0325d23 == c0325d9) {
                                                            c0324c6 = c0324cArr8[i11];
                                                        }
                                                        if (c0318f4 != null && c0318f5 != null) {
                                                            c0315c.b(c0324c5.i, c0318f4, c0324c5.e(), 0.5f, c0318f5, c0324c6.i, c0324cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0324c2 != null) {
                                                c0315c.e(c0324c26.i, c0324c2.i, -c0324c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0324c[] c0324cArr82 = c0325d23.f4020Q;
                                            c0324c5 = c0324cArr82[i3];
                                            if (c0325d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0324cArr2 = c0325d9.f4020Q;
                                            c0324c6 = c0324cArr2[i11];
                                            C0324c c0324c272 = c0324c5.f4003f;
                                            if (c0324c272 == null) {
                                            }
                                            C0324c c0324c282 = c0324c6.f4003f;
                                            if (c0324c282 == null) {
                                            }
                                            if (c0325d22 != c0325d9) {
                                            }
                                            if (c0325d23 == c0325d9) {
                                            }
                                            if (c0318f4 != null) {
                                                c0315c.b(c0324c5.i, c0318f4, c0324c5.e(), 0.5f, c0318f5, c0324c6.i, c0324cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0323b3.f3990j;
                                        boolean z17 = i44 > 0 && c0323b3.i == i44;
                                        C0325d c0325d33 = c0325d23;
                                        for (C0325d c0325d34 = c0325d33; c0325d34 != null; c0325d34 = c0325d7) {
                                            C0325d c0325d35 = c0325d34.m0[i];
                                            while (c0325d35 != null && c0325d35.f4043g0 == 8) {
                                                c0325d35 = c0325d35.m0[i];
                                            }
                                            if (c0325d35 != null || c0325d34 == c0325d2) {
                                                C0324c[] c0324cArr9 = c0325d34.f4020Q;
                                                C0324c c0324c30 = c0324cArr9[i3];
                                                C0318f c0318f19 = c0324c30.i;
                                                C0324c c0324c31 = c0324c30.f4003f;
                                                C0318f c0318f20 = c0324c31 != null ? c0324c31.i : null;
                                                if (c0325d33 != c0325d34) {
                                                    c0318f20 = c0325d33.f4020Q[i3 + 1].i;
                                                } else if (c0325d34 == c0325d23) {
                                                    C0324c c0324c32 = c0325d27.f4020Q[i3].f4003f;
                                                    c0318f20 = c0324c32 != null ? c0324c32.i : null;
                                                }
                                                int e7 = c0324c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0324cArr9[i45].e();
                                                if (c0325d35 != null) {
                                                    c0324c4 = c0325d35.f4020Q[i3];
                                                    c0318f3 = c0324c4.i;
                                                } else {
                                                    c0324c4 = c0325d22.f4020Q[i45].f4003f;
                                                    c0318f3 = c0324c4 != null ? c0324c4.i : null;
                                                }
                                                C0318f c0318f21 = c0324cArr9[i45].i;
                                                if (c0324c4 != null) {
                                                    e8 = c0324c4.e() + e8;
                                                }
                                                int e9 = c0325d33.f4020Q[i45].e() + e7;
                                                if (c0318f19 != null && c0318f20 != null && c0318f3 != null && c0318f21 != null) {
                                                    if (c0325d34 == c0325d23) {
                                                        e9 = c0325d23.f4020Q[i3].e();
                                                    }
                                                    if (c0325d34 == c0325d2) {
                                                        e8 = c0325d2.f4020Q[i45].e();
                                                    }
                                                    C0318f c0318f22 = c0318f20;
                                                    int i46 = e9;
                                                    C0318f c0318f23 = c0318f3;
                                                    c0325d6 = c0325d33;
                                                    int i47 = e8;
                                                    c0325d7 = c0325d35;
                                                    c0325d8 = c0325d34;
                                                    c0315c.b(c0318f19, c0318f22, i46, 0.5f, c0318f23, c0318f21, i47, z17 ? 8 : 5);
                                                    c0325d33 = c0325d8.f4043g0 == 8 ? c0325d8 : c0325d6;
                                                }
                                            }
                                            c0325d7 = c0325d35;
                                            c0325d6 = c0325d33;
                                            c0325d8 = c0325d34;
                                            if (c0325d8.f4043g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0324c[] c0324cArr822 = c0325d23.f4020Q;
                                c0324c5 = c0324cArr822[i3];
                                if (c0325d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0324cArr2 = c0325d9.f4020Q;
                                c0324c6 = c0324cArr2[i11];
                                C0324c c0324c2722 = c0324c5.f4003f;
                                if (c0324c2722 == null) {
                                }
                                C0324c c0324c2822 = c0324c6.f4003f;
                                if (c0324c2822 == null) {
                                }
                                if (c0325d22 != c0325d9) {
                                }
                                if (c0325d23 == c0325d9) {
                                }
                                if (c0318f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0324c c0324c33 = c0324c14.f4003f;
                            if (c0324c33.f4001d == c0326e2) {
                                c0315c.e(c0324c14.i, c0324c33.i, -c0324c14.e(), 4);
                            }
                        }
                        c0315c.g(c0324c14.i, c0325d22.f4020Q[i34].f4003f.i, -c0324c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0323b3.h;
                        if (arrayList2 != null) {
                            if (c0323b3.f3994n) {
                            }
                            C0325d c0325d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0325d23 == null) {
                        }
                        c0325d2 = c0325d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0323b3.f3990j;
                            if (i392 <= 0) {
                            }
                            C0325d c0325d302 = c0325d23;
                            c0325d3 = c0325d302;
                            while (c0325d3 != null) {
                            }
                            i7 = i6;
                            C0324c c0324c252 = c0325d23.f4020Q[i3];
                            c0324c = c0325d27.f4020Q[i3].f4003f;
                            int i432 = i3 + 1;
                            C0324c c0324c262 = c0325d2.f4020Q[i432];
                            c0324c2 = c0325d22.f4020Q[i432].f4003f;
                            if (c0324c != null) {
                            }
                            i8 = 5;
                            if (c0324c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0324c[] c0324cArr8222 = c0325d23.f4020Q;
                            c0324c5 = c0324cArr8222[i3];
                            if (c0325d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0324cArr2 = c0325d9.f4020Q;
                            c0324c6 = c0324cArr2[i11];
                            C0324c c0324c27222 = c0324c5.f4003f;
                            if (c0324c27222 == null) {
                            }
                            C0324c c0324c28222 = c0324c6.f4003f;
                            if (c0324c28222 == null) {
                            }
                            if (c0325d22 != c0325d9) {
                            }
                            if (c0325d23 == c0325d9) {
                            }
                            if (c0318f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0324c[] c0324cArr82222 = c0325d23.f4020Q;
                        c0324c5 = c0324cArr82222[i3];
                        if (c0325d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0324cArr2 = c0325d9.f4020Q;
                        c0324c6 = c0324cArr2[i11];
                        C0324c c0324c272222 = c0324c5.f4003f;
                        if (c0324c272222 == null) {
                        }
                        C0324c c0324c282222 = c0324c6.f4003f;
                        if (c0324c282222 == null) {
                        }
                        if (c0325d22 != c0325d9) {
                        }
                        if (c0325d23 == c0325d9) {
                        }
                        if (c0318f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0323b3.h;
                if (arrayList2 != null) {
                }
                if (c0325d23 == null) {
                }
                c0325d2 = c0325d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0324c[] c0324cArr822222 = c0325d23.f4020Q;
                c0324c5 = c0324cArr822222[i3];
                if (c0325d2 != null) {
                }
                i11 = i3 + 1;
                c0324cArr2 = c0325d9.f4020Q;
                c0324c6 = c0324cArr2[i11];
                C0324c c0324c2722222 = c0324c5.f4003f;
                if (c0324c2722222 == null) {
                }
                C0324c c0324c2822222 = c0324c6.f4003f;
                if (c0324c2822222 == null) {
                }
                if (c0325d22 != c0325d9) {
                }
                if (c0325d23 == c0325d9) {
                }
                if (c0318f4 != null) {
                }
            } else {
                i5 = i2;
                c0323bArr2 = c0323bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0326e2 = c0326e;
            arrayList4 = arrayList;
            i2 = i5;
            c0323bArr = c0323bArr2;
        }
    }

    public static void b(C0326e c0326e, C0315c c0315c, C0325d c0325d) {
        c0325d.f4054o = -1;
        c0325d.f4056p = -1;
        int i = c0326e.f4057p0[0];
        int[] iArr = c0325d.f4057p0;
        if (i != 2 && iArr[0] == 4) {
            C0324c c0324c = c0325d.f4012I;
            int i2 = c0324c.f4004g;
            int q2 = c0326e.q();
            C0324c c0324c2 = c0325d.f4014K;
            int i3 = q2 - c0324c2.f4004g;
            c0324c.i = c0315c.k(c0324c);
            c0324c2.i = c0315c.k(c0324c2);
            c0315c.d(c0324c.i, i2);
            c0315c.d(c0324c2.i, i3);
            c0325d.f4054o = 2;
            c0325d.f4028Y = i2;
            int i4 = i3 - i2;
            c0325d.f4024U = i4;
            int i5 = c0325d.f4033b0;
            if (i4 < i5) {
                c0325d.f4024U = i5;
            }
        }
        if (c0326e.f4057p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0324c c0324c3 = c0325d.f4013J;
        int i6 = c0324c3.f4004g;
        int k2 = c0326e.k();
        C0324c c0324c4 = c0325d.f4015L;
        int i7 = k2 - c0324c4.f4004g;
        c0324c3.i = c0315c.k(c0324c3);
        c0324c4.i = c0315c.k(c0324c4);
        c0315c.d(c0324c3.i, i6);
        c0315c.d(c0324c4.i, i7);
        if (c0325d.f4031a0 > 0 || c0325d.f4043g0 == 8) {
            C0324c c0324c5 = c0325d.f4016M;
            C0318f k3 = c0315c.k(c0324c5);
            c0324c5.i = k3;
            c0315c.d(k3, c0325d.f4031a0 + i6);
        }
        c0325d.f4056p = 2;
        c0325d.f4029Z = i6;
        int i8 = i7 - i6;
        c0325d.f4025V = i8;
        int i9 = c0325d.f4035c0;
        if (i8 < i9) {
            c0325d.f4025V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
