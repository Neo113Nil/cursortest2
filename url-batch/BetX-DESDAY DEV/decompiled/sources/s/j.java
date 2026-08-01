package s;

import java.util.ArrayList;
import q.C0316b;
import q.C0317c;
import q.C0320f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f4148a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.f4005d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.f4005d == r13) goto L73;
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
    public static void a(C0328e c0328e, C0317c c0317c, ArrayList arrayList, int i) {
        int i2;
        C0325b[] c0325bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0327d c0327d;
        boolean z4;
        boolean z5;
        C0326c[] c0326cArr;
        int i5;
        C0325b[] c0325bArr2;
        ArrayList arrayList2;
        C0327d c0327d2;
        int i6;
        C0327d c0327d3;
        int i7;
        C0326c c0326c;
        C0326c c0326c2;
        int i8;
        C0327d c0327d4;
        int i9;
        int i10;
        C0327d c0327d5;
        C0320f c0320f;
        C0320f c0320f2;
        C0326c c0326c3;
        C0326c c0326c4;
        C0320f c0320f3;
        C0327d c0327d6;
        C0327d c0327d7;
        C0327d c0327d8;
        C0326c c0326c5;
        C0327d c0327d9;
        int i11;
        C0326c[] c0326cArr2;
        C0326c c0326c6;
        C0320f c0320f4;
        C0320f c0320f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0327d c0327d10;
        boolean z6;
        C0327d c0327d11;
        C0325b c0325b;
        C0327d c0327d12;
        C0327d c0327d13;
        int i14;
        int i15;
        C0327d c0327d14;
        C0326c c0326c7;
        C0327d c0327d15;
        C0328e c0328e2 = c0328e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0328e2.f4091z0;
            c0325bArr = c0328e2.C0;
            i3 = 0;
        } else {
            i2 = c0328e2.f4072A0;
            c0325bArr = c0328e2.f4073B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0325b c0325b2 = c0325bArr[i17];
            boolean z7 = c0325b2.f4001q;
            C0327d c0327d16 = c0325b2.f3987a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0325b2.f3996l;
                int i22 = i21 * 2;
                C0327d c0327d17 = c0327d16;
                C0327d c0327d18 = c0327d17;
                boolean z8 = false;
                while (!z8) {
                    c0325b2.i += i19;
                    c0327d17.m0[i21] = null;
                    c0327d17.f4054l0[i21] = null;
                    int i23 = c0327d17.f4047g0;
                    C0326c[] c0326cArr3 = c0327d17.f4024Q;
                    if (i23 != i20) {
                        c0327d17.j(i21);
                        c0326cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0326cArr3[i24].e();
                        c0326cArr3[i22].e();
                        c0326cArr3[i24].e();
                        if (c0325b2.f3988b == null) {
                            c0325b2.f3988b = c0327d17;
                        }
                        c0325b2.f3990d = c0327d17;
                        int i25 = c0327d17.f4061p0[i21];
                        if (i25 == i18) {
                            int i26 = c0327d17.f4065t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0325b2.f3994j++;
                                float f4 = c0327d17.f4052k0[i21];
                                if (f4 > 0.0f) {
                                    c0325b2.f3995k += f4;
                                }
                                i15 = i17;
                                if (c0327d17.f4047g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0325b2.f3998n = true;
                                    } else {
                                        c0325b2.f3999o = true;
                                    }
                                    if (c0325b2.h == null) {
                                        c0325b2.h = new ArrayList();
                                    }
                                    c0325b2.h.add(c0327d17);
                                }
                                if (c0325b2.f3992f == null) {
                                    c0325b2.f3992f = c0327d17;
                                }
                                C0327d c0327d19 = c0325b2.f3993g;
                                if (c0327d19 != null) {
                                    c0327d19.f4054l0[i21] = c0327d17;
                                }
                                c0325b2.f3993g = c0327d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0327d17.f4063r == 0 && c0327d17.f4066u == 0) {
                                    int i27 = c0327d17.f4067v;
                                }
                            } else if (c0327d17.f4064s == 0 && c0327d17.f4069x == 0) {
                                int i28 = c0327d17.f4070y;
                            }
                            c0327d14 = c0327d18;
                            if (c0327d14 != c0327d17) {
                                c0327d14.m0[i21] = c0327d17;
                            }
                            c0326c7 = c0326cArr3[i22 + 1].f4007f;
                            if (c0326c7 != null) {
                                c0327d15 = c0326c7.f4005d;
                                C0326c c0326c8 = c0327d15.f4024Q[i22].f4007f;
                                if (c0326c8 != null) {
                                }
                            }
                            c0327d15 = null;
                            if (c0327d15 != null) {
                                c0327d15 = c0327d17;
                                z8 = true;
                            }
                            c0327d18 = c0327d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0327d17 = c0327d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0327d14 = c0327d18;
                    if (c0327d14 != c0327d17) {
                    }
                    c0326c7 = c0326cArr3[i22 + 1].f4007f;
                    if (c0326c7 != null) {
                    }
                    c0327d15 = null;
                    if (c0327d15 != null) {
                    }
                    c0327d18 = c0327d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0327d17 = c0327d15;
                    i18 = 3;
                }
                i4 = i17;
                C0327d c0327d20 = c0325b2.f3988b;
                if (c0327d20 != null) {
                    c0327d20.f4024Q[i22].e();
                }
                C0327d c0327d21 = c0325b2.f3990d;
                if (c0327d21 != null) {
                    c0327d21.f4024Q[i22 + 1].e();
                }
                c0325b2.f3989c = c0327d17;
                if (i21 == 0 && c0325b2.f3997m) {
                    c0325b2.f3991e = c0327d17;
                } else {
                    c0325b2.f3991e = c0327d16;
                }
                c0325b2.f4000p = c0325b2.f3999o && c0325b2.f3998n;
                z2 = true;
            }
            c0325b2.f4001q = z2;
            if (arrayList4 == null || arrayList4.contains(c0327d16)) {
                C0327d c0327d22 = c0325b2.f3989c;
                C0327d c0327d23 = c0325b2.f3988b;
                C0327d c0327d24 = c0325b2.f3990d;
                C0327d c0327d25 = c0325b2.f3991e;
                float f5 = c0325b2.f3995k;
                boolean z9 = c0328e2.f4061p0[i] == 2;
                if (i == 0) {
                    int i29 = c0327d25.i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0327d = c0327d16;
                    z4 = z10;
                } else {
                    int i30 = c0327d25.f4050j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0327d = c0327d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0326cArr = c0328e2.f4024Q;
                    if (z13) {
                        break;
                    }
                    C0326c c0326c9 = c0327d.f4024Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0326c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0327d.f4061p0;
                    int i32 = i2;
                    C0325b[] c0325bArr3 = c0325bArr;
                    boolean z15 = iArr[i] == 3 && c0327d.f4065t[i] == 0;
                    C0326c c0326c10 = c0326c9.f4007f;
                    if (c0326c10 != null && c0327d != c0327d16) {
                        e2 = c0326c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0327d == c0327d16 || c0327d == c0327d23) {
                        c0327d11 = c0327d25;
                    } else {
                        c0327d11 = c0327d25;
                        i31 = 8;
                    }
                    C0326c c0326c11 = c0326c9.f4007f;
                    if (c0326c11 != null) {
                        if (c0327d == c0327d23) {
                            c0327d12 = c0327d16;
                            c0325b = c0325b2;
                            c0317c.f(c0326c9.i, c0326c11.i, i33, 6);
                        } else {
                            c0325b = c0325b2;
                            c0327d12 = c0327d16;
                            c0317c.f(c0326c9.i, c0326c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0317c.e(c0326c9.i, c0326c9.f4007f.i, i33, (c0327d == c0327d23 && z3 && c0327d.f4026S[i]) ? 5 : i31);
                    } else {
                        c0325b = c0325b2;
                        c0327d12 = c0327d16;
                    }
                    C0326c[] c0326cArr4 = c0327d.f4024Q;
                    if (z9) {
                        if (c0327d.f4047g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0317c.f(c0326cArr4[i3 + 1].i, c0326cArr4[i3].i, 0, 5);
                        }
                        c0317c.f(c0326cArr4[i3].i, c0326cArr[i3].i, i14, 8);
                    }
                    C0326c c0326c12 = c0326cArr4[i3 + 1].f4007f;
                    if (c0326c12 != null) {
                        c0327d13 = c0326c12.f4005d;
                        C0326c c0326c13 = c0327d13.f4024Q[i3].f4007f;
                        if (c0326c13 != null) {
                        }
                    }
                    c0327d13 = null;
                    if (c0327d13 != null) {
                        c0327d = c0327d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0327d25 = c0327d11;
                    i2 = i32;
                    c0325bArr = c0325bArr3;
                    c0327d16 = c0327d12;
                    c0325b2 = c0325b;
                }
                C0325b c0325b3 = c0325b2;
                C0327d c0327d26 = c0327d25;
                C0327d c0327d27 = c0327d16;
                i5 = i2;
                c0325bArr2 = c0325bArr;
                if (c0327d24 != null) {
                    int i34 = i3 + 1;
                    if (c0327d22.f4024Q[i34].f4007f != null) {
                        C0326c c0326c14 = c0327d24.f4024Q[i34];
                        if (c0327d24.f4061p0[i] == 3 && c0327d24.f4065t[i] == 0 && !z3) {
                            C0326c c0326c15 = c0326c14.f4007f;
                            if (c0326c15.f4005d == c0328e2) {
                                c0317c.e(c0326c14.i, c0326c15.i, -c0326c14.e(), 5);
                                c0317c.g(c0326c14.i, c0327d22.f4024Q[i34].f4007f.i, -c0326c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0320f c0320f6 = c0326cArr[i35].i;
                                    C0326c c0326c16 = c0327d22.f4024Q[i35];
                                    c0317c.f(c0320f6, c0326c16.i, c0326c16.e(), 8);
                                }
                                arrayList2 = c0325b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0325b3.f3998n || c0325b3.f4000p) ? f2 : c0325b3.f3994j;
                                    C0327d c0327d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0327d c0327d29 = (C0327d) arrayList2.get(i12);
                                        float f8 = c0327d29.f4052k0[i];
                                        C0326c[] c0326cArr5 = c0327d29.f4024Q;
                                        if (f8 < 0.0f) {
                                            if (c0325b3.f4000p) {
                                                C0320f c0320f7 = c0326cArr5[i3 + 1].i;
                                                C0320f c0320f8 = c0326cArr5[i3].i;
                                                z6 = false;
                                                c0317c.e(c0320f7, c0320f8, 0, 4);
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
                                            C0320f c0320f9 = c0326cArr5[i3 + 1].i;
                                            C0320f c0320f10 = c0326cArr5[i3].i;
                                            z6 = false;
                                            c0317c.e(c0320f9, c0320f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0327d28 != null) {
                                                C0326c[] c0326cArr6 = c0327d28.f4024Q;
                                                C0320f c0320f11 = c0326cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0320f c0320f12 = c0326cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0320f c0320f13 = c0326cArr5[i3].i;
                                                C0320f c0320f14 = c0326cArr5[i36].i;
                                                i13 = size;
                                                C0316b l2 = c0317c.l();
                                                c0327d10 = c0327d29;
                                                l2.f3902b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.f3904d.g(c0320f11, 1.0f);
                                                    l2.f3904d.g(c0320f12, -1.0f);
                                                    l2.f3904d.g(c0320f14, 1.0f);
                                                    l2.f3904d.g(c0320f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.f3904d.g(c0320f11, 1.0f);
                                                        l2.f3904d.g(c0320f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.f3904d.g(c0320f13, 1.0f);
                                                        l2.f3904d.g(c0320f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.f3904d.g(c0320f11, 1.0f);
                                                        l2.f3904d.g(c0320f12, -1.0f);
                                                        l2.f3904d.g(c0320f14, f9);
                                                        l2.f3904d.g(c0320f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0317c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0327d10 = c0327d29;
                                            }
                                            f7 = f3;
                                            c0327d28 = c0327d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0327d23 == null && (c0327d23 == c0327d24 || z3)) {
                                    C0326c c0326c17 = c0327d27.f4024Q[i3];
                                    int i37 = i3 + 1;
                                    C0326c c0326c18 = c0327d22.f4024Q[i37];
                                    C0326c c0326c19 = c0326c17.f4007f;
                                    C0320f c0320f15 = c0326c19 != null ? c0326c19.i : null;
                                    C0326c c0326c20 = c0326c18.f4007f;
                                    C0320f c0320f16 = c0326c20 != null ? c0326c20.i : null;
                                    C0326c c0326c21 = c0327d23.f4024Q[i3];
                                    if (c0327d24 != null) {
                                        c0326c18 = c0327d24.f4024Q[i37];
                                    }
                                    if (c0320f15 == null || c0320f16 == null) {
                                        c0327d2 = c0327d24;
                                        i6 = i4;
                                    } else {
                                        c0327d2 = c0327d24;
                                        i6 = i4;
                                        c0317c.b(c0326c21.i, c0320f15, c0326c21.e(), i == 0 ? c0327d26.f4041d0 : c0327d26.f4043e0, c0320f16, c0326c18.i, c0326c18.e(), 7);
                                    }
                                } else {
                                    c0327d2 = c0327d24;
                                    i6 = i4;
                                    if (z4 || c0327d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0327d23 != null) {
                                            int i39 = c0325b3.f3994j;
                                            boolean z16 = i39 <= 0 && c0325b3.i == i39;
                                            C0327d c0327d30 = c0327d23;
                                            c0327d3 = c0327d30;
                                            while (c0327d3 != null) {
                                                C0327d c0327d31 = c0327d3.m0[i];
                                                while (c0327d31 != null && c0327d31.f4047g0 == i38) {
                                                    c0327d31 = c0327d31.m0[i];
                                                }
                                                if (c0327d3 == c0327d23 || c0327d3 == c0327d2 || c0327d31 == null) {
                                                    c0327d4 = c0327d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0327d c0327d32 = c0327d31 == c0327d2 ? null : c0327d31;
                                                    C0326c[] c0326cArr7 = c0327d3.f4024Q;
                                                    C0326c c0326c22 = c0326cArr7[i3];
                                                    C0320f c0320f17 = c0326c22.i;
                                                    int i40 = i3 + 1;
                                                    C0320f c0320f18 = c0327d30.f4024Q[i40].i;
                                                    int e3 = c0326c22.e();
                                                    int e4 = c0326cArr7[i40].e();
                                                    if (c0327d32 != null) {
                                                        c0326c3 = c0327d32.f4024Q[i3];
                                                        c0320f = c0326c3.i;
                                                        c0327d5 = c0327d32;
                                                        C0326c c0326c23 = c0326c3.f4007f;
                                                        c0320f2 = c0326c23 != null ? c0326c23.i : null;
                                                    } else {
                                                        c0327d5 = c0327d32;
                                                        C0326c c0326c24 = c0327d2.f4024Q[i3];
                                                        c0320f = c0326c24 != null ? c0326c24.i : null;
                                                        c0320f2 = c0326cArr7[i40].i;
                                                        c0326c3 = c0326c24;
                                                    }
                                                    int e5 = c0326c3 != null ? c0326c3.e() + e4 : e4;
                                                    int e6 = c0327d30.f4024Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0320f17 == null || c0320f18 == null || c0320f == null || c0320f2 == null) {
                                                        c0327d4 = c0327d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0327d4 = c0327d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0317c.b(c0320f17, c0320f18, e6, 0.5f, c0320f, c0320f2, i42, i41);
                                                    }
                                                    c0327d31 = c0327d5;
                                                }
                                                c0327d30 = c0327d3.f4047g0 != i10 ? c0327d3 : c0327d4;
                                                c0327d3 = c0327d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0326c c0326c25 = c0327d23.f4024Q[i3];
                                            c0326c = c0327d27.f4024Q[i3].f4007f;
                                            int i43 = i3 + 1;
                                            C0326c c0326c26 = c0327d2.f4024Q[i43];
                                            c0326c2 = c0327d22.f4024Q[i43].f4007f;
                                            if (c0326c != null) {
                                                if (c0327d23 != c0327d2) {
                                                    c0317c.e(c0326c25.i, c0326c.i, c0326c25.e(), 5);
                                                } else if (c0326c2 != null) {
                                                    i8 = 5;
                                                    c0317c.b(c0326c25.i, c0326c.i, c0326c25.e(), 0.5f, c0326c26.i, c0326c2.i, c0326c26.e(), 5);
                                                    if (c0326c2 != null && c0327d23 != c0327d2) {
                                                        c0317c.e(c0326c26.i, c0326c2.i, -c0326c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0327d23 != null && c0327d23 != c0327d2) {
                                                        C0326c[] c0326cArr8 = c0327d23.f4024Q;
                                                        c0326c5 = c0326cArr8[i3];
                                                        c0327d9 = c0327d2 != null ? c0327d23 : c0327d2;
                                                        i11 = i3 + 1;
                                                        c0326cArr2 = c0327d9.f4024Q;
                                                        c0326c6 = c0326cArr2[i11];
                                                        C0326c c0326c27 = c0326c5.f4007f;
                                                        c0320f4 = c0326c27 == null ? c0326c27.i : null;
                                                        C0326c c0326c28 = c0326c6.f4007f;
                                                        c0320f5 = c0326c28 == null ? c0326c28.i : null;
                                                        if (c0327d22 != c0327d9) {
                                                            C0326c c0326c29 = c0327d22.f4024Q[i11].f4007f;
                                                            c0320f5 = c0326c29 != null ? c0326c29.i : null;
                                                        }
                                                        if (c0327d23 == c0327d9) {
                                                            c0326c6 = c0326cArr8[i11];
                                                        }
                                                        if (c0320f4 != null && c0320f5 != null) {
                                                            c0317c.b(c0326c5.i, c0320f4, c0326c5.e(), 0.5f, c0320f5, c0326c6.i, c0326cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0326c2 != null) {
                                                c0317c.e(c0326c26.i, c0326c2.i, -c0326c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0326c[] c0326cArr82 = c0327d23.f4024Q;
                                            c0326c5 = c0326cArr82[i3];
                                            if (c0327d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0326cArr2 = c0327d9.f4024Q;
                                            c0326c6 = c0326cArr2[i11];
                                            C0326c c0326c272 = c0326c5.f4007f;
                                            if (c0326c272 == null) {
                                            }
                                            C0326c c0326c282 = c0326c6.f4007f;
                                            if (c0326c282 == null) {
                                            }
                                            if (c0327d22 != c0327d9) {
                                            }
                                            if (c0327d23 == c0327d9) {
                                            }
                                            if (c0320f4 != null) {
                                                c0317c.b(c0326c5.i, c0320f4, c0326c5.e(), 0.5f, c0320f5, c0326c6.i, c0326cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0325b3.f3994j;
                                        boolean z17 = i44 > 0 && c0325b3.i == i44;
                                        C0327d c0327d33 = c0327d23;
                                        for (C0327d c0327d34 = c0327d33; c0327d34 != null; c0327d34 = c0327d7) {
                                            C0327d c0327d35 = c0327d34.m0[i];
                                            while (c0327d35 != null && c0327d35.f4047g0 == 8) {
                                                c0327d35 = c0327d35.m0[i];
                                            }
                                            if (c0327d35 != null || c0327d34 == c0327d2) {
                                                C0326c[] c0326cArr9 = c0327d34.f4024Q;
                                                C0326c c0326c30 = c0326cArr9[i3];
                                                C0320f c0320f19 = c0326c30.i;
                                                C0326c c0326c31 = c0326c30.f4007f;
                                                C0320f c0320f20 = c0326c31 != null ? c0326c31.i : null;
                                                if (c0327d33 != c0327d34) {
                                                    c0320f20 = c0327d33.f4024Q[i3 + 1].i;
                                                } else if (c0327d34 == c0327d23) {
                                                    C0326c c0326c32 = c0327d27.f4024Q[i3].f4007f;
                                                    c0320f20 = c0326c32 != null ? c0326c32.i : null;
                                                }
                                                int e7 = c0326c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0326cArr9[i45].e();
                                                if (c0327d35 != null) {
                                                    c0326c4 = c0327d35.f4024Q[i3];
                                                    c0320f3 = c0326c4.i;
                                                } else {
                                                    c0326c4 = c0327d22.f4024Q[i45].f4007f;
                                                    c0320f3 = c0326c4 != null ? c0326c4.i : null;
                                                }
                                                C0320f c0320f21 = c0326cArr9[i45].i;
                                                if (c0326c4 != null) {
                                                    e8 = c0326c4.e() + e8;
                                                }
                                                int e9 = c0327d33.f4024Q[i45].e() + e7;
                                                if (c0320f19 != null && c0320f20 != null && c0320f3 != null && c0320f21 != null) {
                                                    if (c0327d34 == c0327d23) {
                                                        e9 = c0327d23.f4024Q[i3].e();
                                                    }
                                                    if (c0327d34 == c0327d2) {
                                                        e8 = c0327d2.f4024Q[i45].e();
                                                    }
                                                    C0320f c0320f22 = c0320f20;
                                                    int i46 = e9;
                                                    C0320f c0320f23 = c0320f3;
                                                    c0327d6 = c0327d33;
                                                    int i47 = e8;
                                                    c0327d7 = c0327d35;
                                                    c0327d8 = c0327d34;
                                                    c0317c.b(c0320f19, c0320f22, i46, 0.5f, c0320f23, c0320f21, i47, z17 ? 8 : 5);
                                                    c0327d33 = c0327d8.f4047g0 == 8 ? c0327d8 : c0327d6;
                                                }
                                            }
                                            c0327d7 = c0327d35;
                                            c0327d6 = c0327d33;
                                            c0327d8 = c0327d34;
                                            if (c0327d8.f4047g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0326c[] c0326cArr822 = c0327d23.f4024Q;
                                c0326c5 = c0326cArr822[i3];
                                if (c0327d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0326cArr2 = c0327d9.f4024Q;
                                c0326c6 = c0326cArr2[i11];
                                C0326c c0326c2722 = c0326c5.f4007f;
                                if (c0326c2722 == null) {
                                }
                                C0326c c0326c2822 = c0326c6.f4007f;
                                if (c0326c2822 == null) {
                                }
                                if (c0327d22 != c0327d9) {
                                }
                                if (c0327d23 == c0327d9) {
                                }
                                if (c0320f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0326c c0326c33 = c0326c14.f4007f;
                            if (c0326c33.f4005d == c0328e2) {
                                c0317c.e(c0326c14.i, c0326c33.i, -c0326c14.e(), 4);
                            }
                        }
                        c0317c.g(c0326c14.i, c0327d22.f4024Q[i34].f4007f.i, -c0326c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0325b3.h;
                        if (arrayList2 != null) {
                            if (c0325b3.f3998n) {
                            }
                            C0327d c0327d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0327d23 == null) {
                        }
                        c0327d2 = c0327d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0325b3.f3994j;
                            if (i392 <= 0) {
                            }
                            C0327d c0327d302 = c0327d23;
                            c0327d3 = c0327d302;
                            while (c0327d3 != null) {
                            }
                            i7 = i6;
                            C0326c c0326c252 = c0327d23.f4024Q[i3];
                            c0326c = c0327d27.f4024Q[i3].f4007f;
                            int i432 = i3 + 1;
                            C0326c c0326c262 = c0327d2.f4024Q[i432];
                            c0326c2 = c0327d22.f4024Q[i432].f4007f;
                            if (c0326c != null) {
                            }
                            i8 = 5;
                            if (c0326c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0326c[] c0326cArr8222 = c0327d23.f4024Q;
                            c0326c5 = c0326cArr8222[i3];
                            if (c0327d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0326cArr2 = c0327d9.f4024Q;
                            c0326c6 = c0326cArr2[i11];
                            C0326c c0326c27222 = c0326c5.f4007f;
                            if (c0326c27222 == null) {
                            }
                            C0326c c0326c28222 = c0326c6.f4007f;
                            if (c0326c28222 == null) {
                            }
                            if (c0327d22 != c0327d9) {
                            }
                            if (c0327d23 == c0327d9) {
                            }
                            if (c0320f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0326c[] c0326cArr82222 = c0327d23.f4024Q;
                        c0326c5 = c0326cArr82222[i3];
                        if (c0327d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0326cArr2 = c0327d9.f4024Q;
                        c0326c6 = c0326cArr2[i11];
                        C0326c c0326c272222 = c0326c5.f4007f;
                        if (c0326c272222 == null) {
                        }
                        C0326c c0326c282222 = c0326c6.f4007f;
                        if (c0326c282222 == null) {
                        }
                        if (c0327d22 != c0327d9) {
                        }
                        if (c0327d23 == c0327d9) {
                        }
                        if (c0320f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0325b3.h;
                if (arrayList2 != null) {
                }
                if (c0327d23 == null) {
                }
                c0327d2 = c0327d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0326c[] c0326cArr822222 = c0327d23.f4024Q;
                c0326c5 = c0326cArr822222[i3];
                if (c0327d2 != null) {
                }
                i11 = i3 + 1;
                c0326cArr2 = c0327d9.f4024Q;
                c0326c6 = c0326cArr2[i11];
                C0326c c0326c2722222 = c0326c5.f4007f;
                if (c0326c2722222 == null) {
                }
                C0326c c0326c2822222 = c0326c6.f4007f;
                if (c0326c2822222 == null) {
                }
                if (c0327d22 != c0327d9) {
                }
                if (c0327d23 == c0327d9) {
                }
                if (c0320f4 != null) {
                }
            } else {
                i5 = i2;
                c0325bArr2 = c0325bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0328e2 = c0328e;
            arrayList4 = arrayList;
            i2 = i5;
            c0325bArr = c0325bArr2;
        }
    }

    public static void b(C0328e c0328e, C0317c c0317c, C0327d c0327d) {
        c0327d.f4058o = -1;
        c0327d.f4060p = -1;
        int i = c0328e.f4061p0[0];
        int[] iArr = c0327d.f4061p0;
        if (i != 2 && iArr[0] == 4) {
            C0326c c0326c = c0327d.f4016I;
            int i2 = c0326c.f4008g;
            int q2 = c0328e.q();
            C0326c c0326c2 = c0327d.f4018K;
            int i3 = q2 - c0326c2.f4008g;
            c0326c.i = c0317c.k(c0326c);
            c0326c2.i = c0317c.k(c0326c2);
            c0317c.d(c0326c.i, i2);
            c0317c.d(c0326c2.i, i3);
            c0327d.f4058o = 2;
            c0327d.f4032Y = i2;
            int i4 = i3 - i2;
            c0327d.f4028U = i4;
            int i5 = c0327d.f4037b0;
            if (i4 < i5) {
                c0327d.f4028U = i5;
            }
        }
        if (c0328e.f4061p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0326c c0326c3 = c0327d.f4017J;
        int i6 = c0326c3.f4008g;
        int k2 = c0328e.k();
        C0326c c0326c4 = c0327d.f4019L;
        int i7 = k2 - c0326c4.f4008g;
        c0326c3.i = c0317c.k(c0326c3);
        c0326c4.i = c0317c.k(c0326c4);
        c0317c.d(c0326c3.i, i6);
        c0317c.d(c0326c4.i, i7);
        if (c0327d.f4035a0 > 0 || c0327d.f4047g0 == 8) {
            C0326c c0326c5 = c0327d.f4020M;
            C0320f k3 = c0317c.k(c0326c5);
            c0326c5.i = k3;
            c0317c.d(k3, c0327d.f4035a0 + i6);
        }
        c0327d.f4060p = 2;
        c0327d.f4033Z = i6;
        int i8 = i7 - i6;
        c0327d.f4029V = i8;
        int i9 = c0327d.f4039c0;
        if (i8 < i9) {
            c0327d.f4029V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
