package s;

import java.util.ArrayList;
import q.C0285b;
import q.C0286c;
import q.C0289f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3687a = new boolean[3];

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
    public static void a(C0297e c0297e, C0286c c0286c, ArrayList arrayList, int i) {
        int i2;
        C0294b[] c0294bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0296d c0296d;
        boolean z4;
        boolean z5;
        C0295c[] c0295cArr;
        int i5;
        C0294b[] c0294bArr2;
        ArrayList arrayList2;
        C0296d c0296d2;
        int i6;
        C0296d c0296d3;
        int i7;
        C0295c c0295c;
        C0295c c0295c2;
        int i8;
        C0296d c0296d4;
        int i9;
        int i10;
        C0296d c0296d5;
        C0289f c0289f;
        C0289f c0289f2;
        C0295c c0295c3;
        C0295c c0295c4;
        C0289f c0289f3;
        C0296d c0296d6;
        C0296d c0296d7;
        C0296d c0296d8;
        C0295c c0295c5;
        C0296d c0296d9;
        int i11;
        C0295c[] c0295cArr2;
        C0295c c0295c6;
        C0289f c0289f4;
        C0289f c0289f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0296d c0296d10;
        boolean z6;
        C0296d c0296d11;
        C0294b c0294b;
        C0296d c0296d12;
        C0296d c0296d13;
        int i14;
        int i15;
        C0296d c0296d14;
        C0295c c0295c7;
        C0296d c0296d15;
        C0297e c0297e2 = c0297e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0297e2.f3631z0;
            c0294bArr = c0297e2.f3614C0;
            i3 = 0;
        } else {
            i2 = c0297e2.f3612A0;
            c0294bArr = c0297e2.f3613B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0294b c0294b2 = c0294bArr[i17];
            boolean z7 = c0294b2.f3542q;
            C0296d c0296d16 = c0294b2.f3529a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0294b2.f3537l;
                int i22 = i21 * 2;
                C0296d c0296d17 = c0296d16;
                C0296d c0296d18 = c0296d17;
                boolean z8 = false;
                while (!z8) {
                    c0294b2.i += i19;
                    c0296d17.f3596m0[i21] = null;
                    c0296d17.f3594l0[i21] = null;
                    int i23 = c0296d17.f3586g0;
                    C0295c[] c0295cArr3 = c0296d17.f3564Q;
                    if (i23 != i20) {
                        c0296d17.j(i21);
                        c0295cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0295cArr3[i24].e();
                        c0295cArr3[i22].e();
                        c0295cArr3[i24].e();
                        if (c0294b2.f3530b == null) {
                            c0294b2.f3530b = c0296d17;
                        }
                        c0294b2.d = c0296d17;
                        int i25 = c0296d17.f3601p0[i21];
                        if (i25 == i18) {
                            int i26 = c0296d17.f3605t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0294b2.f3535j++;
                                float f4 = c0296d17.f3592k0[i21];
                                if (f4 > 0.0f) {
                                    c0294b2.f3536k += f4;
                                }
                                i15 = i17;
                                if (c0296d17.f3586g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0294b2.f3539n = true;
                                    } else {
                                        c0294b2.f3540o = true;
                                    }
                                    if (c0294b2.h == null) {
                                        c0294b2.h = new ArrayList();
                                    }
                                    c0294b2.h.add(c0296d17);
                                }
                                if (c0294b2.f3533f == null) {
                                    c0294b2.f3533f = c0296d17;
                                }
                                C0296d c0296d19 = c0294b2.f3534g;
                                if (c0296d19 != null) {
                                    c0296d19.f3594l0[i21] = c0296d17;
                                }
                                c0294b2.f3534g = c0296d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0296d17.f3603r == 0 && c0296d17.f3606u == 0) {
                                    int i27 = c0296d17.f3607v;
                                }
                            } else if (c0296d17.f3604s == 0 && c0296d17.f3609x == 0) {
                                int i28 = c0296d17.f3610y;
                            }
                            c0296d14 = c0296d18;
                            if (c0296d14 != c0296d17) {
                                c0296d14.f3596m0[i21] = c0296d17;
                            }
                            c0295c7 = c0295cArr3[i22 + 1].f3547f;
                            if (c0295c7 != null) {
                                c0296d15 = c0295c7.d;
                                C0295c c0295c8 = c0296d15.f3564Q[i22].f3547f;
                                if (c0295c8 != null) {
                                }
                            }
                            c0296d15 = null;
                            if (c0296d15 != null) {
                                c0296d15 = c0296d17;
                                z8 = true;
                            }
                            c0296d18 = c0296d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0296d17 = c0296d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0296d14 = c0296d18;
                    if (c0296d14 != c0296d17) {
                    }
                    c0295c7 = c0295cArr3[i22 + 1].f3547f;
                    if (c0295c7 != null) {
                    }
                    c0296d15 = null;
                    if (c0296d15 != null) {
                    }
                    c0296d18 = c0296d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0296d17 = c0296d15;
                    i18 = 3;
                }
                i4 = i17;
                C0296d c0296d20 = c0294b2.f3530b;
                if (c0296d20 != null) {
                    c0296d20.f3564Q[i22].e();
                }
                C0296d c0296d21 = c0294b2.d;
                if (c0296d21 != null) {
                    c0296d21.f3564Q[i22 + 1].e();
                }
                c0294b2.f3531c = c0296d17;
                if (i21 == 0 && c0294b2.f3538m) {
                    c0294b2.f3532e = c0296d17;
                } else {
                    c0294b2.f3532e = c0296d16;
                }
                c0294b2.f3541p = c0294b2.f3540o && c0294b2.f3539n;
                z2 = true;
            }
            c0294b2.f3542q = z2;
            if (arrayList4 == null || arrayList4.contains(c0296d16)) {
                C0296d c0296d22 = c0294b2.f3531c;
                C0296d c0296d23 = c0294b2.f3530b;
                C0296d c0296d24 = c0294b2.d;
                C0296d c0296d25 = c0294b2.f3532e;
                float f5 = c0294b2.f3536k;
                boolean z9 = c0297e2.f3601p0[i] == 2;
                if (i == 0) {
                    int i29 = c0296d25.f3588i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0296d = c0296d16;
                    z4 = z10;
                } else {
                    int i30 = c0296d25.f3590j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0296d = c0296d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0295cArr = c0297e2.f3564Q;
                    if (z13) {
                        break;
                    }
                    C0295c c0295c9 = c0296d.f3564Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0295c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0296d.f3601p0;
                    int i32 = i2;
                    C0294b[] c0294bArr3 = c0294bArr;
                    boolean z15 = iArr[i] == 3 && c0296d.f3605t[i] == 0;
                    C0295c c0295c10 = c0295c9.f3547f;
                    if (c0295c10 != null && c0296d != c0296d16) {
                        e2 = c0295c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0296d == c0296d16 || c0296d == c0296d23) {
                        c0296d11 = c0296d25;
                    } else {
                        c0296d11 = c0296d25;
                        i31 = 8;
                    }
                    C0295c c0295c11 = c0295c9.f3547f;
                    if (c0295c11 != null) {
                        if (c0296d == c0296d23) {
                            c0296d12 = c0296d16;
                            c0294b = c0294b2;
                            c0286c.f(c0295c9.i, c0295c11.i, i33, 6);
                        } else {
                            c0294b = c0294b2;
                            c0296d12 = c0296d16;
                            c0286c.f(c0295c9.i, c0295c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0286c.e(c0295c9.i, c0295c9.f3547f.i, i33, (c0296d == c0296d23 && z3 && c0296d.f3566S[i]) ? 5 : i31);
                    } else {
                        c0294b = c0294b2;
                        c0296d12 = c0296d16;
                    }
                    C0295c[] c0295cArr4 = c0296d.f3564Q;
                    if (z9) {
                        if (c0296d.f3586g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0286c.f(c0295cArr4[i3 + 1].i, c0295cArr4[i3].i, 0, 5);
                        }
                        c0286c.f(c0295cArr4[i3].i, c0295cArr[i3].i, i14, 8);
                    }
                    C0295c c0295c12 = c0295cArr4[i3 + 1].f3547f;
                    if (c0295c12 != null) {
                        c0296d13 = c0295c12.d;
                        C0295c c0295c13 = c0296d13.f3564Q[i3].f3547f;
                        if (c0295c13 != null) {
                        }
                    }
                    c0296d13 = null;
                    if (c0296d13 != null) {
                        c0296d = c0296d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0296d25 = c0296d11;
                    i2 = i32;
                    c0294bArr = c0294bArr3;
                    c0296d16 = c0296d12;
                    c0294b2 = c0294b;
                }
                C0294b c0294b3 = c0294b2;
                C0296d c0296d26 = c0296d25;
                C0296d c0296d27 = c0296d16;
                i5 = i2;
                c0294bArr2 = c0294bArr;
                if (c0296d24 != null) {
                    int i34 = i3 + 1;
                    if (c0296d22.f3564Q[i34].f3547f != null) {
                        C0295c c0295c14 = c0296d24.f3564Q[i34];
                        if (c0296d24.f3601p0[i] == 3 && c0296d24.f3605t[i] == 0 && !z3) {
                            C0295c c0295c15 = c0295c14.f3547f;
                            if (c0295c15.d == c0297e2) {
                                c0286c.e(c0295c14.i, c0295c15.i, -c0295c14.e(), 5);
                                c0286c.g(c0295c14.i, c0296d22.f3564Q[i34].f3547f.i, -c0295c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0289f c0289f6 = c0295cArr[i35].i;
                                    C0295c c0295c16 = c0296d22.f3564Q[i35];
                                    c0286c.f(c0289f6, c0295c16.i, c0295c16.e(), 8);
                                }
                                arrayList2 = c0294b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0294b3.f3539n || c0294b3.f3541p) ? f2 : c0294b3.f3535j;
                                    C0296d c0296d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0296d c0296d29 = (C0296d) arrayList2.get(i12);
                                        float f8 = c0296d29.f3592k0[i];
                                        C0295c[] c0295cArr5 = c0296d29.f3564Q;
                                        if (f8 < 0.0f) {
                                            if (c0294b3.f3541p) {
                                                C0289f c0289f7 = c0295cArr5[i3 + 1].i;
                                                C0289f c0289f8 = c0295cArr5[i3].i;
                                                z6 = false;
                                                c0286c.e(c0289f7, c0289f8, 0, 4);
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
                                            C0289f c0289f9 = c0295cArr5[i3 + 1].i;
                                            C0289f c0289f10 = c0295cArr5[i3].i;
                                            z6 = false;
                                            c0286c.e(c0289f9, c0289f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0296d28 != null) {
                                                C0295c[] c0295cArr6 = c0296d28.f3564Q;
                                                C0289f c0289f11 = c0295cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0289f c0289f12 = c0295cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0289f c0289f13 = c0295cArr5[i3].i;
                                                C0289f c0289f14 = c0295cArr5[i36].i;
                                                i13 = size;
                                                C0285b l2 = c0286c.l();
                                                c0296d10 = c0296d29;
                                                l2.f3413b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.d.g(c0289f11, 1.0f);
                                                    l2.d.g(c0289f12, -1.0f);
                                                    l2.d.g(c0289f14, 1.0f);
                                                    l2.d.g(c0289f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.d.g(c0289f11, 1.0f);
                                                        l2.d.g(c0289f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.d.g(c0289f13, 1.0f);
                                                        l2.d.g(c0289f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.d.g(c0289f11, 1.0f);
                                                        l2.d.g(c0289f12, -1.0f);
                                                        l2.d.g(c0289f14, f9);
                                                        l2.d.g(c0289f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0286c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0296d10 = c0296d29;
                                            }
                                            f7 = f3;
                                            c0296d28 = c0296d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0296d23 == null && (c0296d23 == c0296d24 || z3)) {
                                    C0295c c0295c17 = c0296d27.f3564Q[i3];
                                    int i37 = i3 + 1;
                                    C0295c c0295c18 = c0296d22.f3564Q[i37];
                                    C0295c c0295c19 = c0295c17.f3547f;
                                    C0289f c0289f15 = c0295c19 != null ? c0295c19.i : null;
                                    C0295c c0295c20 = c0295c18.f3547f;
                                    C0289f c0289f16 = c0295c20 != null ? c0295c20.i : null;
                                    C0295c c0295c21 = c0296d23.f3564Q[i3];
                                    if (c0296d24 != null) {
                                        c0295c18 = c0296d24.f3564Q[i37];
                                    }
                                    if (c0289f15 == null || c0289f16 == null) {
                                        c0296d2 = c0296d24;
                                        i6 = i4;
                                    } else {
                                        c0296d2 = c0296d24;
                                        i6 = i4;
                                        c0286c.b(c0295c21.i, c0289f15, c0295c21.e(), i == 0 ? c0296d26.f3580d0 : c0296d26.f3582e0, c0289f16, c0295c18.i, c0295c18.e(), 7);
                                    }
                                } else {
                                    c0296d2 = c0296d24;
                                    i6 = i4;
                                    if (z4 || c0296d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0296d23 != null) {
                                            int i39 = c0294b3.f3535j;
                                            boolean z16 = i39 <= 0 && c0294b3.i == i39;
                                            C0296d c0296d30 = c0296d23;
                                            c0296d3 = c0296d30;
                                            while (c0296d3 != null) {
                                                C0296d c0296d31 = c0296d3.f3596m0[i];
                                                while (c0296d31 != null && c0296d31.f3586g0 == i38) {
                                                    c0296d31 = c0296d31.f3596m0[i];
                                                }
                                                if (c0296d3 == c0296d23 || c0296d3 == c0296d2 || c0296d31 == null) {
                                                    c0296d4 = c0296d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0296d c0296d32 = c0296d31 == c0296d2 ? null : c0296d31;
                                                    C0295c[] c0295cArr7 = c0296d3.f3564Q;
                                                    C0295c c0295c22 = c0295cArr7[i3];
                                                    C0289f c0289f17 = c0295c22.i;
                                                    int i40 = i3 + 1;
                                                    C0289f c0289f18 = c0296d30.f3564Q[i40].i;
                                                    int e3 = c0295c22.e();
                                                    int e4 = c0295cArr7[i40].e();
                                                    if (c0296d32 != null) {
                                                        c0295c3 = c0296d32.f3564Q[i3];
                                                        c0289f = c0295c3.i;
                                                        c0296d5 = c0296d32;
                                                        C0295c c0295c23 = c0295c3.f3547f;
                                                        c0289f2 = c0295c23 != null ? c0295c23.i : null;
                                                    } else {
                                                        c0296d5 = c0296d32;
                                                        C0295c c0295c24 = c0296d2.f3564Q[i3];
                                                        c0289f = c0295c24 != null ? c0295c24.i : null;
                                                        c0289f2 = c0295cArr7[i40].i;
                                                        c0295c3 = c0295c24;
                                                    }
                                                    int e5 = c0295c3 != null ? c0295c3.e() + e4 : e4;
                                                    int e6 = c0296d30.f3564Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0289f17 == null || c0289f18 == null || c0289f == null || c0289f2 == null) {
                                                        c0296d4 = c0296d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0296d4 = c0296d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0286c.b(c0289f17, c0289f18, e6, 0.5f, c0289f, c0289f2, i42, i41);
                                                    }
                                                    c0296d31 = c0296d5;
                                                }
                                                c0296d30 = c0296d3.f3586g0 != i10 ? c0296d3 : c0296d4;
                                                c0296d3 = c0296d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0295c c0295c25 = c0296d23.f3564Q[i3];
                                            c0295c = c0296d27.f3564Q[i3].f3547f;
                                            int i43 = i3 + 1;
                                            C0295c c0295c26 = c0296d2.f3564Q[i43];
                                            c0295c2 = c0296d22.f3564Q[i43].f3547f;
                                            if (c0295c != null) {
                                                if (c0296d23 != c0296d2) {
                                                    c0286c.e(c0295c25.i, c0295c.i, c0295c25.e(), 5);
                                                } else if (c0295c2 != null) {
                                                    i8 = 5;
                                                    c0286c.b(c0295c25.i, c0295c.i, c0295c25.e(), 0.5f, c0295c26.i, c0295c2.i, c0295c26.e(), 5);
                                                    if (c0295c2 != null && c0296d23 != c0296d2) {
                                                        c0286c.e(c0295c26.i, c0295c2.i, -c0295c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0296d23 != null && c0296d23 != c0296d2) {
                                                        C0295c[] c0295cArr8 = c0296d23.f3564Q;
                                                        c0295c5 = c0295cArr8[i3];
                                                        c0296d9 = c0296d2 != null ? c0296d23 : c0296d2;
                                                        i11 = i3 + 1;
                                                        c0295cArr2 = c0296d9.f3564Q;
                                                        c0295c6 = c0295cArr2[i11];
                                                        C0295c c0295c27 = c0295c5.f3547f;
                                                        c0289f4 = c0295c27 == null ? c0295c27.i : null;
                                                        C0295c c0295c28 = c0295c6.f3547f;
                                                        c0289f5 = c0295c28 == null ? c0295c28.i : null;
                                                        if (c0296d22 != c0296d9) {
                                                            C0295c c0295c29 = c0296d22.f3564Q[i11].f3547f;
                                                            c0289f5 = c0295c29 != null ? c0295c29.i : null;
                                                        }
                                                        if (c0296d23 == c0296d9) {
                                                            c0295c6 = c0295cArr8[i11];
                                                        }
                                                        if (c0289f4 != null && c0289f5 != null) {
                                                            c0286c.b(c0295c5.i, c0289f4, c0295c5.e(), 0.5f, c0289f5, c0295c6.i, c0295cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0295c2 != null) {
                                                c0286c.e(c0295c26.i, c0295c2.i, -c0295c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0295c[] c0295cArr82 = c0296d23.f3564Q;
                                            c0295c5 = c0295cArr82[i3];
                                            if (c0296d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0295cArr2 = c0296d9.f3564Q;
                                            c0295c6 = c0295cArr2[i11];
                                            C0295c c0295c272 = c0295c5.f3547f;
                                            if (c0295c272 == null) {
                                            }
                                            C0295c c0295c282 = c0295c6.f3547f;
                                            if (c0295c282 == null) {
                                            }
                                            if (c0296d22 != c0296d9) {
                                            }
                                            if (c0296d23 == c0296d9) {
                                            }
                                            if (c0289f4 != null) {
                                                c0286c.b(c0295c5.i, c0289f4, c0295c5.e(), 0.5f, c0289f5, c0295c6.i, c0295cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0294b3.f3535j;
                                        boolean z17 = i44 > 0 && c0294b3.i == i44;
                                        C0296d c0296d33 = c0296d23;
                                        for (C0296d c0296d34 = c0296d33; c0296d34 != null; c0296d34 = c0296d7) {
                                            C0296d c0296d35 = c0296d34.f3596m0[i];
                                            while (c0296d35 != null && c0296d35.f3586g0 == 8) {
                                                c0296d35 = c0296d35.f3596m0[i];
                                            }
                                            if (c0296d35 != null || c0296d34 == c0296d2) {
                                                C0295c[] c0295cArr9 = c0296d34.f3564Q;
                                                C0295c c0295c30 = c0295cArr9[i3];
                                                C0289f c0289f19 = c0295c30.i;
                                                C0295c c0295c31 = c0295c30.f3547f;
                                                C0289f c0289f20 = c0295c31 != null ? c0295c31.i : null;
                                                if (c0296d33 != c0296d34) {
                                                    c0289f20 = c0296d33.f3564Q[i3 + 1].i;
                                                } else if (c0296d34 == c0296d23) {
                                                    C0295c c0295c32 = c0296d27.f3564Q[i3].f3547f;
                                                    c0289f20 = c0295c32 != null ? c0295c32.i : null;
                                                }
                                                int e7 = c0295c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0295cArr9[i45].e();
                                                if (c0296d35 != null) {
                                                    c0295c4 = c0296d35.f3564Q[i3];
                                                    c0289f3 = c0295c4.i;
                                                } else {
                                                    c0295c4 = c0296d22.f3564Q[i45].f3547f;
                                                    c0289f3 = c0295c4 != null ? c0295c4.i : null;
                                                }
                                                C0289f c0289f21 = c0295cArr9[i45].i;
                                                if (c0295c4 != null) {
                                                    e8 = c0295c4.e() + e8;
                                                }
                                                int e9 = c0296d33.f3564Q[i45].e() + e7;
                                                if (c0289f19 != null && c0289f20 != null && c0289f3 != null && c0289f21 != null) {
                                                    if (c0296d34 == c0296d23) {
                                                        e9 = c0296d23.f3564Q[i3].e();
                                                    }
                                                    if (c0296d34 == c0296d2) {
                                                        e8 = c0296d2.f3564Q[i45].e();
                                                    }
                                                    C0289f c0289f22 = c0289f20;
                                                    int i46 = e9;
                                                    C0289f c0289f23 = c0289f3;
                                                    c0296d6 = c0296d33;
                                                    int i47 = e8;
                                                    c0296d7 = c0296d35;
                                                    c0296d8 = c0296d34;
                                                    c0286c.b(c0289f19, c0289f22, i46, 0.5f, c0289f23, c0289f21, i47, z17 ? 8 : 5);
                                                    c0296d33 = c0296d8.f3586g0 == 8 ? c0296d8 : c0296d6;
                                                }
                                            }
                                            c0296d7 = c0296d35;
                                            c0296d6 = c0296d33;
                                            c0296d8 = c0296d34;
                                            if (c0296d8.f3586g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0295c[] c0295cArr822 = c0296d23.f3564Q;
                                c0295c5 = c0295cArr822[i3];
                                if (c0296d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0295cArr2 = c0296d9.f3564Q;
                                c0295c6 = c0295cArr2[i11];
                                C0295c c0295c2722 = c0295c5.f3547f;
                                if (c0295c2722 == null) {
                                }
                                C0295c c0295c2822 = c0295c6.f3547f;
                                if (c0295c2822 == null) {
                                }
                                if (c0296d22 != c0296d9) {
                                }
                                if (c0296d23 == c0296d9) {
                                }
                                if (c0289f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0295c c0295c33 = c0295c14.f3547f;
                            if (c0295c33.d == c0297e2) {
                                c0286c.e(c0295c14.i, c0295c33.i, -c0295c14.e(), 4);
                            }
                        }
                        c0286c.g(c0295c14.i, c0296d22.f3564Q[i34].f3547f.i, -c0295c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0294b3.h;
                        if (arrayList2 != null) {
                            if (c0294b3.f3539n) {
                            }
                            C0296d c0296d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0296d23 == null) {
                        }
                        c0296d2 = c0296d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0294b3.f3535j;
                            if (i392 <= 0) {
                            }
                            C0296d c0296d302 = c0296d23;
                            c0296d3 = c0296d302;
                            while (c0296d3 != null) {
                            }
                            i7 = i6;
                            C0295c c0295c252 = c0296d23.f3564Q[i3];
                            c0295c = c0296d27.f3564Q[i3].f3547f;
                            int i432 = i3 + 1;
                            C0295c c0295c262 = c0296d2.f3564Q[i432];
                            c0295c2 = c0296d22.f3564Q[i432].f3547f;
                            if (c0295c != null) {
                            }
                            i8 = 5;
                            if (c0295c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0295c[] c0295cArr8222 = c0296d23.f3564Q;
                            c0295c5 = c0295cArr8222[i3];
                            if (c0296d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0295cArr2 = c0296d9.f3564Q;
                            c0295c6 = c0295cArr2[i11];
                            C0295c c0295c27222 = c0295c5.f3547f;
                            if (c0295c27222 == null) {
                            }
                            C0295c c0295c28222 = c0295c6.f3547f;
                            if (c0295c28222 == null) {
                            }
                            if (c0296d22 != c0296d9) {
                            }
                            if (c0296d23 == c0296d9) {
                            }
                            if (c0289f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0295c[] c0295cArr82222 = c0296d23.f3564Q;
                        c0295c5 = c0295cArr82222[i3];
                        if (c0296d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0295cArr2 = c0296d9.f3564Q;
                        c0295c6 = c0295cArr2[i11];
                        C0295c c0295c272222 = c0295c5.f3547f;
                        if (c0295c272222 == null) {
                        }
                        C0295c c0295c282222 = c0295c6.f3547f;
                        if (c0295c282222 == null) {
                        }
                        if (c0296d22 != c0296d9) {
                        }
                        if (c0296d23 == c0296d9) {
                        }
                        if (c0289f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0294b3.h;
                if (arrayList2 != null) {
                }
                if (c0296d23 == null) {
                }
                c0296d2 = c0296d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0295c[] c0295cArr822222 = c0296d23.f3564Q;
                c0295c5 = c0295cArr822222[i3];
                if (c0296d2 != null) {
                }
                i11 = i3 + 1;
                c0295cArr2 = c0296d9.f3564Q;
                c0295c6 = c0295cArr2[i11];
                C0295c c0295c2722222 = c0295c5.f3547f;
                if (c0295c2722222 == null) {
                }
                C0295c c0295c2822222 = c0295c6.f3547f;
                if (c0295c2822222 == null) {
                }
                if (c0296d22 != c0296d9) {
                }
                if (c0296d23 == c0296d9) {
                }
                if (c0289f4 != null) {
                }
            } else {
                i5 = i2;
                c0294bArr2 = c0294bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0297e2 = c0297e;
            arrayList4 = arrayList;
            i2 = i5;
            c0294bArr = c0294bArr2;
        }
    }

    public static void b(C0297e c0297e, C0286c c0286c, C0296d c0296d) {
        c0296d.f3598o = -1;
        c0296d.f3600p = -1;
        int i = c0297e.f3601p0[0];
        int[] iArr = c0296d.f3601p0;
        if (i != 2 && iArr[0] == 4) {
            C0295c c0295c = c0296d.f3556I;
            int i2 = c0295c.f3548g;
            int q2 = c0297e.q();
            C0295c c0295c2 = c0296d.f3558K;
            int i3 = q2 - c0295c2.f3548g;
            c0295c.i = c0286c.k(c0295c);
            c0295c2.i = c0286c.k(c0295c2);
            c0286c.d(c0295c.i, i2);
            c0286c.d(c0295c2.i, i3);
            c0296d.f3598o = 2;
            c0296d.f3572Y = i2;
            int i4 = i3 - i2;
            c0296d.f3568U = i4;
            int i5 = c0296d.f3577b0;
            if (i4 < i5) {
                c0296d.f3568U = i5;
            }
        }
        if (c0297e.f3601p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0295c c0295c3 = c0296d.f3557J;
        int i6 = c0295c3.f3548g;
        int k2 = c0297e.k();
        C0295c c0295c4 = c0296d.f3559L;
        int i7 = k2 - c0295c4.f3548g;
        c0295c3.i = c0286c.k(c0295c3);
        c0295c4.i = c0286c.k(c0295c4);
        c0286c.d(c0295c3.i, i6);
        c0286c.d(c0295c4.i, i7);
        if (c0296d.f3575a0 > 0 || c0296d.f3586g0 == 8) {
            C0295c c0295c5 = c0296d.f3560M;
            C0289f k3 = c0286c.k(c0295c5);
            c0295c5.i = k3;
            c0286c.d(k3, c0296d.f3575a0 + i6);
        }
        c0296d.f3600p = 2;
        c0296d.f3573Z = i6;
        int i8 = i7 - i6;
        c0296d.f3569V = i8;
        int i9 = c0296d.f3579c0;
        if (i8 < i9) {
            c0296d.f3569V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
