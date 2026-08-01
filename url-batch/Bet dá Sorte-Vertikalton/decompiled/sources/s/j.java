package s;

import java.util.ArrayList;
import q.C0270b;
import q.C0271c;
import q.C0274f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3740a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.d == r13) goto L73;
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
    public static void a(C0282e c0282e, C0271c c0271c, ArrayList arrayList, int i) {
        int i2;
        C0279b[] c0279bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0281d c0281d;
        boolean z4;
        boolean z5;
        C0280c[] c0280cArr;
        int i5;
        C0279b[] c0279bArr2;
        ArrayList arrayList2;
        C0281d c0281d2;
        int i6;
        C0281d c0281d3;
        int i7;
        C0280c c0280c;
        C0280c c0280c2;
        int i8;
        C0281d c0281d4;
        int i9;
        int i10;
        C0281d c0281d5;
        C0274f c0274f;
        C0274f c0274f2;
        C0280c c0280c3;
        C0280c c0280c4;
        C0274f c0274f3;
        C0281d c0281d6;
        C0281d c0281d7;
        C0281d c0281d8;
        C0280c c0280c5;
        C0281d c0281d9;
        int i11;
        C0280c[] c0280cArr2;
        C0280c c0280c6;
        C0274f c0274f4;
        C0274f c0274f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0281d c0281d10;
        boolean z6;
        C0281d c0281d11;
        C0279b c0279b;
        C0281d c0281d12;
        C0281d c0281d13;
        int i14;
        int i15;
        C0281d c0281d14;
        C0280c c0280c7;
        C0281d c0281d15;
        C0282e c0282e2 = c0282e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0282e2.f3684z0;
            c0279bArr = c0282e2.C0;
            i3 = 0;
        } else {
            i2 = c0282e2.f3665A0;
            c0279bArr = c0282e2.f3666B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0279b c0279b2 = c0279bArr[i17];
            boolean z7 = c0279b2.f3596q;
            C0281d c0281d16 = c0279b2.f3583a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0279b2.f3591l;
                int i22 = i21 * 2;
                C0281d c0281d17 = c0281d16;
                C0281d c0281d18 = c0281d17;
                boolean z8 = false;
                while (!z8) {
                    c0279b2.i += i19;
                    c0281d17.f3649m0[i21] = null;
                    c0281d17.f3647l0[i21] = null;
                    int i23 = c0281d17.f3640g0;
                    C0280c[] c0280cArr3 = c0281d17.f3618Q;
                    if (i23 != i20) {
                        c0281d17.j(i21);
                        c0280cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0280cArr3[i24].e();
                        c0280cArr3[i22].e();
                        c0280cArr3[i24].e();
                        if (c0279b2.f3584b == null) {
                            c0279b2.f3584b = c0281d17;
                        }
                        c0279b2.d = c0281d17;
                        int i25 = c0281d17.f3654p0[i21];
                        if (i25 == i18) {
                            int i26 = c0281d17.f3658t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0279b2.f3589j++;
                                float f4 = c0281d17.f3645k0[i21];
                                if (f4 > 0.0f) {
                                    c0279b2.f3590k += f4;
                                }
                                i15 = i17;
                                if (c0281d17.f3640g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0279b2.f3593n = true;
                                    } else {
                                        c0279b2.f3594o = true;
                                    }
                                    if (c0279b2.h == null) {
                                        c0279b2.h = new ArrayList();
                                    }
                                    c0279b2.h.add(c0281d17);
                                }
                                if (c0279b2.f3587f == null) {
                                    c0279b2.f3587f = c0281d17;
                                }
                                C0281d c0281d19 = c0279b2.f3588g;
                                if (c0281d19 != null) {
                                    c0281d19.f3647l0[i21] = c0281d17;
                                }
                                c0279b2.f3588g = c0281d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0281d17.f3656r == 0 && c0281d17.f3659u == 0) {
                                    int i27 = c0281d17.f3660v;
                                }
                            } else if (c0281d17.f3657s == 0 && c0281d17.f3662x == 0) {
                                int i28 = c0281d17.f3663y;
                            }
                            c0281d14 = c0281d18;
                            if (c0281d14 != c0281d17) {
                                c0281d14.f3649m0[i21] = c0281d17;
                            }
                            c0280c7 = c0280cArr3[i22 + 1].f3601f;
                            if (c0280c7 != null) {
                                c0281d15 = c0280c7.d;
                                C0280c c0280c8 = c0281d15.f3618Q[i22].f3601f;
                                if (c0280c8 != null) {
                                }
                            }
                            c0281d15 = null;
                            if (c0281d15 != null) {
                                c0281d15 = c0281d17;
                                z8 = true;
                            }
                            c0281d18 = c0281d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0281d17 = c0281d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0281d14 = c0281d18;
                    if (c0281d14 != c0281d17) {
                    }
                    c0280c7 = c0280cArr3[i22 + 1].f3601f;
                    if (c0280c7 != null) {
                    }
                    c0281d15 = null;
                    if (c0281d15 != null) {
                    }
                    c0281d18 = c0281d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0281d17 = c0281d15;
                    i18 = 3;
                }
                i4 = i17;
                C0281d c0281d20 = c0279b2.f3584b;
                if (c0281d20 != null) {
                    c0281d20.f3618Q[i22].e();
                }
                C0281d c0281d21 = c0279b2.d;
                if (c0281d21 != null) {
                    c0281d21.f3618Q[i22 + 1].e();
                }
                c0279b2.f3585c = c0281d17;
                if (i21 == 0 && c0279b2.f3592m) {
                    c0279b2.f3586e = c0281d17;
                } else {
                    c0279b2.f3586e = c0281d16;
                }
                c0279b2.f3595p = c0279b2.f3594o && c0279b2.f3593n;
                z2 = true;
            }
            c0279b2.f3596q = z2;
            if (arrayList4 == null || arrayList4.contains(c0281d16)) {
                C0281d c0281d22 = c0279b2.f3585c;
                C0281d c0281d23 = c0279b2.f3584b;
                C0281d c0281d24 = c0279b2.d;
                C0281d c0281d25 = c0279b2.f3586e;
                float f5 = c0279b2.f3590k;
                boolean z9 = c0282e2.f3654p0[i] == 2;
                if (i == 0) {
                    int i29 = c0281d25.f3642i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0281d = c0281d16;
                    z4 = z10;
                } else {
                    int i30 = c0281d25.j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0281d = c0281d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0280cArr = c0282e2.f3618Q;
                    if (z13) {
                        break;
                    }
                    C0280c c0280c9 = c0281d.f3618Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0280c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0281d.f3654p0;
                    int i32 = i2;
                    C0279b[] c0279bArr3 = c0279bArr;
                    boolean z15 = iArr[i] == 3 && c0281d.f3658t[i] == 0;
                    C0280c c0280c10 = c0280c9.f3601f;
                    if (c0280c10 != null && c0281d != c0281d16) {
                        e2 = c0280c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0281d == c0281d16 || c0281d == c0281d23) {
                        c0281d11 = c0281d25;
                    } else {
                        c0281d11 = c0281d25;
                        i31 = 8;
                    }
                    C0280c c0280c11 = c0280c9.f3601f;
                    if (c0280c11 != null) {
                        if (c0281d == c0281d23) {
                            c0281d12 = c0281d16;
                            c0279b = c0279b2;
                            c0271c.f(c0280c9.i, c0280c11.i, i33, 6);
                        } else {
                            c0279b = c0279b2;
                            c0281d12 = c0281d16;
                            c0271c.f(c0280c9.i, c0280c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0271c.e(c0280c9.i, c0280c9.f3601f.i, i33, (c0281d == c0281d23 && z3 && c0281d.f3620S[i]) ? 5 : i31);
                    } else {
                        c0279b = c0279b2;
                        c0281d12 = c0281d16;
                    }
                    C0280c[] c0280cArr4 = c0281d.f3618Q;
                    if (z9) {
                        if (c0281d.f3640g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0271c.f(c0280cArr4[i3 + 1].i, c0280cArr4[i3].i, 0, 5);
                        }
                        c0271c.f(c0280cArr4[i3].i, c0280cArr[i3].i, i14, 8);
                    }
                    C0280c c0280c12 = c0280cArr4[i3 + 1].f3601f;
                    if (c0280c12 != null) {
                        c0281d13 = c0280c12.d;
                        C0280c c0280c13 = c0281d13.f3618Q[i3].f3601f;
                        if (c0280c13 != null) {
                        }
                    }
                    c0281d13 = null;
                    if (c0281d13 != null) {
                        c0281d = c0281d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0281d25 = c0281d11;
                    i2 = i32;
                    c0279bArr = c0279bArr3;
                    c0281d16 = c0281d12;
                    c0279b2 = c0279b;
                }
                C0279b c0279b3 = c0279b2;
                C0281d c0281d26 = c0281d25;
                C0281d c0281d27 = c0281d16;
                i5 = i2;
                c0279bArr2 = c0279bArr;
                if (c0281d24 != null) {
                    int i34 = i3 + 1;
                    if (c0281d22.f3618Q[i34].f3601f != null) {
                        C0280c c0280c14 = c0281d24.f3618Q[i34];
                        if (c0281d24.f3654p0[i] == 3 && c0281d24.f3658t[i] == 0 && !z3) {
                            C0280c c0280c15 = c0280c14.f3601f;
                            if (c0280c15.d == c0282e2) {
                                c0271c.e(c0280c14.i, c0280c15.i, -c0280c14.e(), 5);
                                c0271c.g(c0280c14.i, c0281d22.f3618Q[i34].f3601f.i, -c0280c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0274f c0274f6 = c0280cArr[i35].i;
                                    C0280c c0280c16 = c0281d22.f3618Q[i35];
                                    c0271c.f(c0274f6, c0280c16.i, c0280c16.e(), 8);
                                }
                                arrayList2 = c0279b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0279b3.f3593n || c0279b3.f3595p) ? f2 : c0279b3.f3589j;
                                    C0281d c0281d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0281d c0281d29 = (C0281d) arrayList2.get(i12);
                                        float f8 = c0281d29.f3645k0[i];
                                        C0280c[] c0280cArr5 = c0281d29.f3618Q;
                                        if (f8 < 0.0f) {
                                            if (c0279b3.f3595p) {
                                                C0274f c0274f7 = c0280cArr5[i3 + 1].i;
                                                C0274f c0274f8 = c0280cArr5[i3].i;
                                                z6 = false;
                                                c0271c.e(c0274f7, c0274f8, 0, 4);
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
                                            C0274f c0274f9 = c0280cArr5[i3 + 1].i;
                                            C0274f c0274f10 = c0280cArr5[i3].i;
                                            z6 = false;
                                            c0271c.e(c0274f9, c0274f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0281d28 != null) {
                                                C0280c[] c0280cArr6 = c0281d28.f3618Q;
                                                C0274f c0274f11 = c0280cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0274f c0274f12 = c0280cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0274f c0274f13 = c0280cArr5[i3].i;
                                                C0274f c0274f14 = c0280cArr5[i36].i;
                                                i13 = size;
                                                C0270b l2 = c0271c.l();
                                                c0281d10 = c0281d29;
                                                l2.f3446b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.d.g(c0274f11, 1.0f);
                                                    l2.d.g(c0274f12, -1.0f);
                                                    l2.d.g(c0274f14, 1.0f);
                                                    l2.d.g(c0274f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.d.g(c0274f11, 1.0f);
                                                        l2.d.g(c0274f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.d.g(c0274f13, 1.0f);
                                                        l2.d.g(c0274f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.d.g(c0274f11, 1.0f);
                                                        l2.d.g(c0274f12, -1.0f);
                                                        l2.d.g(c0274f14, f9);
                                                        l2.d.g(c0274f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0271c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0281d10 = c0281d29;
                                            }
                                            f7 = f3;
                                            c0281d28 = c0281d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0281d23 == null && (c0281d23 == c0281d24 || z3)) {
                                    C0280c c0280c17 = c0281d27.f3618Q[i3];
                                    int i37 = i3 + 1;
                                    C0280c c0280c18 = c0281d22.f3618Q[i37];
                                    C0280c c0280c19 = c0280c17.f3601f;
                                    C0274f c0274f15 = c0280c19 != null ? c0280c19.i : null;
                                    C0280c c0280c20 = c0280c18.f3601f;
                                    C0274f c0274f16 = c0280c20 != null ? c0280c20.i : null;
                                    C0280c c0280c21 = c0281d23.f3618Q[i3];
                                    if (c0281d24 != null) {
                                        c0280c18 = c0281d24.f3618Q[i37];
                                    }
                                    if (c0274f15 == null || c0274f16 == null) {
                                        c0281d2 = c0281d24;
                                        i6 = i4;
                                    } else {
                                        c0281d2 = c0281d24;
                                        i6 = i4;
                                        c0271c.b(c0280c21.i, c0274f15, c0280c21.e(), i == 0 ? c0281d26.f3634d0 : c0281d26.f3636e0, c0274f16, c0280c18.i, c0280c18.e(), 7);
                                    }
                                } else {
                                    c0281d2 = c0281d24;
                                    i6 = i4;
                                    if (z4 || c0281d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0281d23 != null) {
                                            int i39 = c0279b3.f3589j;
                                            boolean z16 = i39 <= 0 && c0279b3.i == i39;
                                            C0281d c0281d30 = c0281d23;
                                            c0281d3 = c0281d30;
                                            while (c0281d3 != null) {
                                                C0281d c0281d31 = c0281d3.f3649m0[i];
                                                while (c0281d31 != null && c0281d31.f3640g0 == i38) {
                                                    c0281d31 = c0281d31.f3649m0[i];
                                                }
                                                if (c0281d3 == c0281d23 || c0281d3 == c0281d2 || c0281d31 == null) {
                                                    c0281d4 = c0281d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0281d c0281d32 = c0281d31 == c0281d2 ? null : c0281d31;
                                                    C0280c[] c0280cArr7 = c0281d3.f3618Q;
                                                    C0280c c0280c22 = c0280cArr7[i3];
                                                    C0274f c0274f17 = c0280c22.i;
                                                    int i40 = i3 + 1;
                                                    C0274f c0274f18 = c0281d30.f3618Q[i40].i;
                                                    int e3 = c0280c22.e();
                                                    int e4 = c0280cArr7[i40].e();
                                                    if (c0281d32 != null) {
                                                        c0280c3 = c0281d32.f3618Q[i3];
                                                        c0274f = c0280c3.i;
                                                        c0281d5 = c0281d32;
                                                        C0280c c0280c23 = c0280c3.f3601f;
                                                        c0274f2 = c0280c23 != null ? c0280c23.i : null;
                                                    } else {
                                                        c0281d5 = c0281d32;
                                                        C0280c c0280c24 = c0281d2.f3618Q[i3];
                                                        c0274f = c0280c24 != null ? c0280c24.i : null;
                                                        c0274f2 = c0280cArr7[i40].i;
                                                        c0280c3 = c0280c24;
                                                    }
                                                    int e5 = c0280c3 != null ? c0280c3.e() + e4 : e4;
                                                    int e6 = c0281d30.f3618Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0274f17 == null || c0274f18 == null || c0274f == null || c0274f2 == null) {
                                                        c0281d4 = c0281d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0281d4 = c0281d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0271c.b(c0274f17, c0274f18, e6, 0.5f, c0274f, c0274f2, i42, i41);
                                                    }
                                                    c0281d31 = c0281d5;
                                                }
                                                c0281d30 = c0281d3.f3640g0 != i10 ? c0281d3 : c0281d4;
                                                c0281d3 = c0281d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0280c c0280c25 = c0281d23.f3618Q[i3];
                                            c0280c = c0281d27.f3618Q[i3].f3601f;
                                            int i43 = i3 + 1;
                                            C0280c c0280c26 = c0281d2.f3618Q[i43];
                                            c0280c2 = c0281d22.f3618Q[i43].f3601f;
                                            if (c0280c != null) {
                                                if (c0281d23 != c0281d2) {
                                                    c0271c.e(c0280c25.i, c0280c.i, c0280c25.e(), 5);
                                                } else if (c0280c2 != null) {
                                                    i8 = 5;
                                                    c0271c.b(c0280c25.i, c0280c.i, c0280c25.e(), 0.5f, c0280c26.i, c0280c2.i, c0280c26.e(), 5);
                                                    if (c0280c2 != null && c0281d23 != c0281d2) {
                                                        c0271c.e(c0280c26.i, c0280c2.i, -c0280c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0281d23 != null && c0281d23 != c0281d2) {
                                                        C0280c[] c0280cArr8 = c0281d23.f3618Q;
                                                        c0280c5 = c0280cArr8[i3];
                                                        c0281d9 = c0281d2 != null ? c0281d23 : c0281d2;
                                                        i11 = i3 + 1;
                                                        c0280cArr2 = c0281d9.f3618Q;
                                                        c0280c6 = c0280cArr2[i11];
                                                        C0280c c0280c27 = c0280c5.f3601f;
                                                        c0274f4 = c0280c27 == null ? c0280c27.i : null;
                                                        C0280c c0280c28 = c0280c6.f3601f;
                                                        c0274f5 = c0280c28 == null ? c0280c28.i : null;
                                                        if (c0281d22 != c0281d9) {
                                                            C0280c c0280c29 = c0281d22.f3618Q[i11].f3601f;
                                                            c0274f5 = c0280c29 != null ? c0280c29.i : null;
                                                        }
                                                        if (c0281d23 == c0281d9) {
                                                            c0280c6 = c0280cArr8[i11];
                                                        }
                                                        if (c0274f4 != null && c0274f5 != null) {
                                                            c0271c.b(c0280c5.i, c0274f4, c0280c5.e(), 0.5f, c0274f5, c0280c6.i, c0280cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0280c2 != null) {
                                                c0271c.e(c0280c26.i, c0280c2.i, -c0280c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0280c[] c0280cArr82 = c0281d23.f3618Q;
                                            c0280c5 = c0280cArr82[i3];
                                            if (c0281d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0280cArr2 = c0281d9.f3618Q;
                                            c0280c6 = c0280cArr2[i11];
                                            C0280c c0280c272 = c0280c5.f3601f;
                                            if (c0280c272 == null) {
                                            }
                                            C0280c c0280c282 = c0280c6.f3601f;
                                            if (c0280c282 == null) {
                                            }
                                            if (c0281d22 != c0281d9) {
                                            }
                                            if (c0281d23 == c0281d9) {
                                            }
                                            if (c0274f4 != null) {
                                                c0271c.b(c0280c5.i, c0274f4, c0280c5.e(), 0.5f, c0274f5, c0280c6.i, c0280cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0279b3.f3589j;
                                        boolean z17 = i44 > 0 && c0279b3.i == i44;
                                        C0281d c0281d33 = c0281d23;
                                        for (C0281d c0281d34 = c0281d33; c0281d34 != null; c0281d34 = c0281d7) {
                                            C0281d c0281d35 = c0281d34.f3649m0[i];
                                            while (c0281d35 != null && c0281d35.f3640g0 == 8) {
                                                c0281d35 = c0281d35.f3649m0[i];
                                            }
                                            if (c0281d35 != null || c0281d34 == c0281d2) {
                                                C0280c[] c0280cArr9 = c0281d34.f3618Q;
                                                C0280c c0280c30 = c0280cArr9[i3];
                                                C0274f c0274f19 = c0280c30.i;
                                                C0280c c0280c31 = c0280c30.f3601f;
                                                C0274f c0274f20 = c0280c31 != null ? c0280c31.i : null;
                                                if (c0281d33 != c0281d34) {
                                                    c0274f20 = c0281d33.f3618Q[i3 + 1].i;
                                                } else if (c0281d34 == c0281d23) {
                                                    C0280c c0280c32 = c0281d27.f3618Q[i3].f3601f;
                                                    c0274f20 = c0280c32 != null ? c0280c32.i : null;
                                                }
                                                int e7 = c0280c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0280cArr9[i45].e();
                                                if (c0281d35 != null) {
                                                    c0280c4 = c0281d35.f3618Q[i3];
                                                    c0274f3 = c0280c4.i;
                                                } else {
                                                    c0280c4 = c0281d22.f3618Q[i45].f3601f;
                                                    c0274f3 = c0280c4 != null ? c0280c4.i : null;
                                                }
                                                C0274f c0274f21 = c0280cArr9[i45].i;
                                                if (c0280c4 != null) {
                                                    e8 = c0280c4.e() + e8;
                                                }
                                                int e9 = c0281d33.f3618Q[i45].e() + e7;
                                                if (c0274f19 != null && c0274f20 != null && c0274f3 != null && c0274f21 != null) {
                                                    if (c0281d34 == c0281d23) {
                                                        e9 = c0281d23.f3618Q[i3].e();
                                                    }
                                                    if (c0281d34 == c0281d2) {
                                                        e8 = c0281d2.f3618Q[i45].e();
                                                    }
                                                    C0274f c0274f22 = c0274f20;
                                                    int i46 = e9;
                                                    C0274f c0274f23 = c0274f3;
                                                    c0281d6 = c0281d33;
                                                    int i47 = e8;
                                                    c0281d7 = c0281d35;
                                                    c0281d8 = c0281d34;
                                                    c0271c.b(c0274f19, c0274f22, i46, 0.5f, c0274f23, c0274f21, i47, z17 ? 8 : 5);
                                                    c0281d33 = c0281d8.f3640g0 == 8 ? c0281d8 : c0281d6;
                                                }
                                            }
                                            c0281d7 = c0281d35;
                                            c0281d6 = c0281d33;
                                            c0281d8 = c0281d34;
                                            if (c0281d8.f3640g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0280c[] c0280cArr822 = c0281d23.f3618Q;
                                c0280c5 = c0280cArr822[i3];
                                if (c0281d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0280cArr2 = c0281d9.f3618Q;
                                c0280c6 = c0280cArr2[i11];
                                C0280c c0280c2722 = c0280c5.f3601f;
                                if (c0280c2722 == null) {
                                }
                                C0280c c0280c2822 = c0280c6.f3601f;
                                if (c0280c2822 == null) {
                                }
                                if (c0281d22 != c0281d9) {
                                }
                                if (c0281d23 == c0281d9) {
                                }
                                if (c0274f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0280c c0280c33 = c0280c14.f3601f;
                            if (c0280c33.d == c0282e2) {
                                c0271c.e(c0280c14.i, c0280c33.i, -c0280c14.e(), 4);
                            }
                        }
                        c0271c.g(c0280c14.i, c0281d22.f3618Q[i34].f3601f.i, -c0280c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0279b3.h;
                        if (arrayList2 != null) {
                            if (c0279b3.f3593n) {
                            }
                            C0281d c0281d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0281d23 == null) {
                        }
                        c0281d2 = c0281d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0279b3.f3589j;
                            if (i392 <= 0) {
                            }
                            C0281d c0281d302 = c0281d23;
                            c0281d3 = c0281d302;
                            while (c0281d3 != null) {
                            }
                            i7 = i6;
                            C0280c c0280c252 = c0281d23.f3618Q[i3];
                            c0280c = c0281d27.f3618Q[i3].f3601f;
                            int i432 = i3 + 1;
                            C0280c c0280c262 = c0281d2.f3618Q[i432];
                            c0280c2 = c0281d22.f3618Q[i432].f3601f;
                            if (c0280c != null) {
                            }
                            i8 = 5;
                            if (c0280c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0280c[] c0280cArr8222 = c0281d23.f3618Q;
                            c0280c5 = c0280cArr8222[i3];
                            if (c0281d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0280cArr2 = c0281d9.f3618Q;
                            c0280c6 = c0280cArr2[i11];
                            C0280c c0280c27222 = c0280c5.f3601f;
                            if (c0280c27222 == null) {
                            }
                            C0280c c0280c28222 = c0280c6.f3601f;
                            if (c0280c28222 == null) {
                            }
                            if (c0281d22 != c0281d9) {
                            }
                            if (c0281d23 == c0281d9) {
                            }
                            if (c0274f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0280c[] c0280cArr82222 = c0281d23.f3618Q;
                        c0280c5 = c0280cArr82222[i3];
                        if (c0281d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0280cArr2 = c0281d9.f3618Q;
                        c0280c6 = c0280cArr2[i11];
                        C0280c c0280c272222 = c0280c5.f3601f;
                        if (c0280c272222 == null) {
                        }
                        C0280c c0280c282222 = c0280c6.f3601f;
                        if (c0280c282222 == null) {
                        }
                        if (c0281d22 != c0281d9) {
                        }
                        if (c0281d23 == c0281d9) {
                        }
                        if (c0274f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0279b3.h;
                if (arrayList2 != null) {
                }
                if (c0281d23 == null) {
                }
                c0281d2 = c0281d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0280c[] c0280cArr822222 = c0281d23.f3618Q;
                c0280c5 = c0280cArr822222[i3];
                if (c0281d2 != null) {
                }
                i11 = i3 + 1;
                c0280cArr2 = c0281d9.f3618Q;
                c0280c6 = c0280cArr2[i11];
                C0280c c0280c2722222 = c0280c5.f3601f;
                if (c0280c2722222 == null) {
                }
                C0280c c0280c2822222 = c0280c6.f3601f;
                if (c0280c2822222 == null) {
                }
                if (c0281d22 != c0281d9) {
                }
                if (c0281d23 == c0281d9) {
                }
                if (c0274f4 != null) {
                }
            } else {
                i5 = i2;
                c0279bArr2 = c0279bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0282e2 = c0282e;
            arrayList4 = arrayList;
            i2 = i5;
            c0279bArr = c0279bArr2;
        }
    }

    public static void b(C0282e c0282e, C0271c c0271c, C0281d c0281d) {
        c0281d.f3651o = -1;
        c0281d.f3653p = -1;
        int i = c0282e.f3654p0[0];
        int[] iArr = c0281d.f3654p0;
        if (i != 2 && iArr[0] == 4) {
            C0280c c0280c = c0281d.f3610I;
            int i2 = c0280c.f3602g;
            int q2 = c0282e.q();
            C0280c c0280c2 = c0281d.f3612K;
            int i3 = q2 - c0280c2.f3602g;
            c0280c.i = c0271c.k(c0280c);
            c0280c2.i = c0271c.k(c0280c2);
            c0271c.d(c0280c.i, i2);
            c0271c.d(c0280c2.i, i3);
            c0281d.f3651o = 2;
            c0281d.f3626Y = i2;
            int i4 = i3 - i2;
            c0281d.f3622U = i4;
            int i5 = c0281d.f3631b0;
            if (i4 < i5) {
                c0281d.f3622U = i5;
            }
        }
        if (c0282e.f3654p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0280c c0280c3 = c0281d.f3611J;
        int i6 = c0280c3.f3602g;
        int k2 = c0282e.k();
        C0280c c0280c4 = c0281d.f3613L;
        int i7 = k2 - c0280c4.f3602g;
        c0280c3.i = c0271c.k(c0280c3);
        c0280c4.i = c0271c.k(c0280c4);
        c0271c.d(c0280c3.i, i6);
        c0271c.d(c0280c4.i, i7);
        if (c0281d.f3629a0 > 0 || c0281d.f3640g0 == 8) {
            C0280c c0280c5 = c0281d.f3614M;
            C0274f k3 = c0271c.k(c0280c5);
            c0280c5.i = k3;
            c0271c.d(k3, c0281d.f3629a0 + i6);
        }
        c0281d.f3653p = 2;
        c0281d.f3627Z = i6;
        int i8 = i7 - i6;
        c0281d.f3623V = i8;
        int i9 = c0281d.f3633c0;
        if (i8 < i9) {
            c0281d.f3623V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
