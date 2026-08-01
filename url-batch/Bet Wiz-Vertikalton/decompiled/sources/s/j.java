package s;

import java.util.ArrayList;
import q.C0282b;
import q.C0283c;
import q.C0286f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3664a = new boolean[3];

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
    public static void a(C0294e c0294e, C0283c c0283c, ArrayList arrayList, int i) {
        int i2;
        C0291b[] c0291bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0293d c0293d;
        boolean z4;
        boolean z5;
        C0292c[] c0292cArr;
        int i5;
        C0291b[] c0291bArr2;
        ArrayList arrayList2;
        C0293d c0293d2;
        int i6;
        C0293d c0293d3;
        int i7;
        C0292c c0292c;
        C0292c c0292c2;
        int i8;
        C0293d c0293d4;
        int i9;
        int i10;
        C0293d c0293d5;
        C0286f c0286f;
        C0286f c0286f2;
        C0292c c0292c3;
        C0292c c0292c4;
        C0286f c0286f3;
        C0293d c0293d6;
        C0293d c0293d7;
        C0293d c0293d8;
        C0292c c0292c5;
        C0293d c0293d9;
        int i11;
        C0292c[] c0292cArr2;
        C0292c c0292c6;
        C0286f c0286f4;
        C0286f c0286f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0293d c0293d10;
        boolean z6;
        C0293d c0293d11;
        C0291b c0291b;
        C0293d c0293d12;
        C0293d c0293d13;
        int i14;
        int i15;
        C0293d c0293d14;
        C0292c c0292c7;
        C0293d c0293d15;
        C0294e c0294e2 = c0294e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0294e2.f3607z0;
            c0291bArr = c0294e2.f3590C0;
            i3 = 0;
        } else {
            i2 = c0294e2.f3588A0;
            c0291bArr = c0294e2.f3589B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0291b c0291b2 = c0291bArr[i17];
            boolean z7 = c0291b2.f3518q;
            C0293d c0293d16 = c0291b2.f3505a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0291b2.f3513l;
                int i22 = i21 * 2;
                C0293d c0293d17 = c0293d16;
                C0293d c0293d18 = c0293d17;
                boolean z8 = false;
                while (!z8) {
                    c0291b2.i += i19;
                    c0293d17.f3572m0[i21] = null;
                    c0293d17.f3570l0[i21] = null;
                    int i23 = c0293d17.f3562g0;
                    C0292c[] c0292cArr3 = c0293d17.f3540Q;
                    if (i23 != i20) {
                        c0293d17.j(i21);
                        c0292cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0292cArr3[i24].e();
                        c0292cArr3[i22].e();
                        c0292cArr3[i24].e();
                        if (c0291b2.f3506b == null) {
                            c0291b2.f3506b = c0293d17;
                        }
                        c0291b2.d = c0293d17;
                        int i25 = c0293d17.f3577p0[i21];
                        if (i25 == i18) {
                            int i26 = c0293d17.f3581t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0291b2.f3511j++;
                                float f4 = c0293d17.f3568k0[i21];
                                if (f4 > 0.0f) {
                                    c0291b2.f3512k += f4;
                                }
                                i15 = i17;
                                if (c0293d17.f3562g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0291b2.f3515n = true;
                                    } else {
                                        c0291b2.f3516o = true;
                                    }
                                    if (c0291b2.h == null) {
                                        c0291b2.h = new ArrayList();
                                    }
                                    c0291b2.h.add(c0293d17);
                                }
                                if (c0291b2.f3509f == null) {
                                    c0291b2.f3509f = c0293d17;
                                }
                                C0293d c0293d19 = c0291b2.f3510g;
                                if (c0293d19 != null) {
                                    c0293d19.f3570l0[i21] = c0293d17;
                                }
                                c0291b2.f3510g = c0293d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0293d17.f3579r == 0 && c0293d17.f3582u == 0) {
                                    int i27 = c0293d17.f3583v;
                                }
                            } else if (c0293d17.f3580s == 0 && c0293d17.f3585x == 0) {
                                int i28 = c0293d17.f3586y;
                            }
                            c0293d14 = c0293d18;
                            if (c0293d14 != c0293d17) {
                                c0293d14.f3572m0[i21] = c0293d17;
                            }
                            c0292c7 = c0292cArr3[i22 + 1].f3523f;
                            if (c0292c7 != null) {
                                c0293d15 = c0292c7.d;
                                C0292c c0292c8 = c0293d15.f3540Q[i22].f3523f;
                                if (c0292c8 != null) {
                                }
                            }
                            c0293d15 = null;
                            if (c0293d15 != null) {
                                c0293d15 = c0293d17;
                                z8 = true;
                            }
                            c0293d18 = c0293d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0293d17 = c0293d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0293d14 = c0293d18;
                    if (c0293d14 != c0293d17) {
                    }
                    c0292c7 = c0292cArr3[i22 + 1].f3523f;
                    if (c0292c7 != null) {
                    }
                    c0293d15 = null;
                    if (c0293d15 != null) {
                    }
                    c0293d18 = c0293d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0293d17 = c0293d15;
                    i18 = 3;
                }
                i4 = i17;
                C0293d c0293d20 = c0291b2.f3506b;
                if (c0293d20 != null) {
                    c0293d20.f3540Q[i22].e();
                }
                C0293d c0293d21 = c0291b2.d;
                if (c0293d21 != null) {
                    c0293d21.f3540Q[i22 + 1].e();
                }
                c0291b2.f3507c = c0293d17;
                if (i21 == 0 && c0291b2.f3514m) {
                    c0291b2.f3508e = c0293d17;
                } else {
                    c0291b2.f3508e = c0293d16;
                }
                c0291b2.f3517p = c0291b2.f3516o && c0291b2.f3515n;
                z2 = true;
            }
            c0291b2.f3518q = z2;
            if (arrayList4 == null || arrayList4.contains(c0293d16)) {
                C0293d c0293d22 = c0291b2.f3507c;
                C0293d c0293d23 = c0291b2.f3506b;
                C0293d c0293d24 = c0291b2.d;
                C0293d c0293d25 = c0291b2.f3508e;
                float f5 = c0291b2.f3512k;
                boolean z9 = c0294e2.f3577p0[i] == 2;
                if (i == 0) {
                    int i29 = c0293d25.f3564i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0293d = c0293d16;
                    z4 = z10;
                } else {
                    int i30 = c0293d25.f3566j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0293d = c0293d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0292cArr = c0294e2.f3540Q;
                    if (z13) {
                        break;
                    }
                    C0292c c0292c9 = c0293d.f3540Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0292c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0293d.f3577p0;
                    int i32 = i2;
                    C0291b[] c0291bArr3 = c0291bArr;
                    boolean z15 = iArr[i] == 3 && c0293d.f3581t[i] == 0;
                    C0292c c0292c10 = c0292c9.f3523f;
                    if (c0292c10 != null && c0293d != c0293d16) {
                        e2 = c0292c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0293d == c0293d16 || c0293d == c0293d23) {
                        c0293d11 = c0293d25;
                    } else {
                        c0293d11 = c0293d25;
                        i31 = 8;
                    }
                    C0292c c0292c11 = c0292c9.f3523f;
                    if (c0292c11 != null) {
                        if (c0293d == c0293d23) {
                            c0293d12 = c0293d16;
                            c0291b = c0291b2;
                            c0283c.f(c0292c9.i, c0292c11.i, i33, 6);
                        } else {
                            c0291b = c0291b2;
                            c0293d12 = c0293d16;
                            c0283c.f(c0292c9.i, c0292c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0283c.e(c0292c9.i, c0292c9.f3523f.i, i33, (c0293d == c0293d23 && z3 && c0293d.f3542S[i]) ? 5 : i31);
                    } else {
                        c0291b = c0291b2;
                        c0293d12 = c0293d16;
                    }
                    C0292c[] c0292cArr4 = c0293d.f3540Q;
                    if (z9) {
                        if (c0293d.f3562g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0283c.f(c0292cArr4[i3 + 1].i, c0292cArr4[i3].i, 0, 5);
                        }
                        c0283c.f(c0292cArr4[i3].i, c0292cArr[i3].i, i14, 8);
                    }
                    C0292c c0292c12 = c0292cArr4[i3 + 1].f3523f;
                    if (c0292c12 != null) {
                        c0293d13 = c0292c12.d;
                        C0292c c0292c13 = c0293d13.f3540Q[i3].f3523f;
                        if (c0292c13 != null) {
                        }
                    }
                    c0293d13 = null;
                    if (c0293d13 != null) {
                        c0293d = c0293d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0293d25 = c0293d11;
                    i2 = i32;
                    c0291bArr = c0291bArr3;
                    c0293d16 = c0293d12;
                    c0291b2 = c0291b;
                }
                C0291b c0291b3 = c0291b2;
                C0293d c0293d26 = c0293d25;
                C0293d c0293d27 = c0293d16;
                i5 = i2;
                c0291bArr2 = c0291bArr;
                if (c0293d24 != null) {
                    int i34 = i3 + 1;
                    if (c0293d22.f3540Q[i34].f3523f != null) {
                        C0292c c0292c14 = c0293d24.f3540Q[i34];
                        if (c0293d24.f3577p0[i] == 3 && c0293d24.f3581t[i] == 0 && !z3) {
                            C0292c c0292c15 = c0292c14.f3523f;
                            if (c0292c15.d == c0294e2) {
                                c0283c.e(c0292c14.i, c0292c15.i, -c0292c14.e(), 5);
                                c0283c.g(c0292c14.i, c0293d22.f3540Q[i34].f3523f.i, -c0292c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0286f c0286f6 = c0292cArr[i35].i;
                                    C0292c c0292c16 = c0293d22.f3540Q[i35];
                                    c0283c.f(c0286f6, c0292c16.i, c0292c16.e(), 8);
                                }
                                arrayList2 = c0291b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0291b3.f3515n || c0291b3.f3517p) ? f2 : c0291b3.f3511j;
                                    C0293d c0293d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0293d c0293d29 = (C0293d) arrayList2.get(i12);
                                        float f8 = c0293d29.f3568k0[i];
                                        C0292c[] c0292cArr5 = c0293d29.f3540Q;
                                        if (f8 < 0.0f) {
                                            if (c0291b3.f3517p) {
                                                C0286f c0286f7 = c0292cArr5[i3 + 1].i;
                                                C0286f c0286f8 = c0292cArr5[i3].i;
                                                z6 = false;
                                                c0283c.e(c0286f7, c0286f8, 0, 4);
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
                                            C0286f c0286f9 = c0292cArr5[i3 + 1].i;
                                            C0286f c0286f10 = c0292cArr5[i3].i;
                                            z6 = false;
                                            c0283c.e(c0286f9, c0286f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0293d28 != null) {
                                                C0292c[] c0292cArr6 = c0293d28.f3540Q;
                                                C0286f c0286f11 = c0292cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0286f c0286f12 = c0292cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0286f c0286f13 = c0292cArr5[i3].i;
                                                C0286f c0286f14 = c0292cArr5[i36].i;
                                                i13 = size;
                                                C0282b l2 = c0283c.l();
                                                c0293d10 = c0293d29;
                                                l2.f3459b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.d.g(c0286f11, 1.0f);
                                                    l2.d.g(c0286f12, -1.0f);
                                                    l2.d.g(c0286f14, 1.0f);
                                                    l2.d.g(c0286f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.d.g(c0286f11, 1.0f);
                                                        l2.d.g(c0286f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.d.g(c0286f13, 1.0f);
                                                        l2.d.g(c0286f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.d.g(c0286f11, 1.0f);
                                                        l2.d.g(c0286f12, -1.0f);
                                                        l2.d.g(c0286f14, f9);
                                                        l2.d.g(c0286f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0283c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0293d10 = c0293d29;
                                            }
                                            f7 = f3;
                                            c0293d28 = c0293d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0293d23 == null && (c0293d23 == c0293d24 || z3)) {
                                    C0292c c0292c17 = c0293d27.f3540Q[i3];
                                    int i37 = i3 + 1;
                                    C0292c c0292c18 = c0293d22.f3540Q[i37];
                                    C0292c c0292c19 = c0292c17.f3523f;
                                    C0286f c0286f15 = c0292c19 != null ? c0292c19.i : null;
                                    C0292c c0292c20 = c0292c18.f3523f;
                                    C0286f c0286f16 = c0292c20 != null ? c0292c20.i : null;
                                    C0292c c0292c21 = c0293d23.f3540Q[i3];
                                    if (c0293d24 != null) {
                                        c0292c18 = c0293d24.f3540Q[i37];
                                    }
                                    if (c0286f15 == null || c0286f16 == null) {
                                        c0293d2 = c0293d24;
                                        i6 = i4;
                                    } else {
                                        c0293d2 = c0293d24;
                                        i6 = i4;
                                        c0283c.b(c0292c21.i, c0286f15, c0292c21.e(), i == 0 ? c0293d26.f3556d0 : c0293d26.f3558e0, c0286f16, c0292c18.i, c0292c18.e(), 7);
                                    }
                                } else {
                                    c0293d2 = c0293d24;
                                    i6 = i4;
                                    if (z4 || c0293d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0293d23 != null) {
                                            int i39 = c0291b3.f3511j;
                                            boolean z16 = i39 <= 0 && c0291b3.i == i39;
                                            C0293d c0293d30 = c0293d23;
                                            c0293d3 = c0293d30;
                                            while (c0293d3 != null) {
                                                C0293d c0293d31 = c0293d3.f3572m0[i];
                                                while (c0293d31 != null && c0293d31.f3562g0 == i38) {
                                                    c0293d31 = c0293d31.f3572m0[i];
                                                }
                                                if (c0293d3 == c0293d23 || c0293d3 == c0293d2 || c0293d31 == null) {
                                                    c0293d4 = c0293d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0293d c0293d32 = c0293d31 == c0293d2 ? null : c0293d31;
                                                    C0292c[] c0292cArr7 = c0293d3.f3540Q;
                                                    C0292c c0292c22 = c0292cArr7[i3];
                                                    C0286f c0286f17 = c0292c22.i;
                                                    int i40 = i3 + 1;
                                                    C0286f c0286f18 = c0293d30.f3540Q[i40].i;
                                                    int e3 = c0292c22.e();
                                                    int e4 = c0292cArr7[i40].e();
                                                    if (c0293d32 != null) {
                                                        c0292c3 = c0293d32.f3540Q[i3];
                                                        c0286f = c0292c3.i;
                                                        c0293d5 = c0293d32;
                                                        C0292c c0292c23 = c0292c3.f3523f;
                                                        c0286f2 = c0292c23 != null ? c0292c23.i : null;
                                                    } else {
                                                        c0293d5 = c0293d32;
                                                        C0292c c0292c24 = c0293d2.f3540Q[i3];
                                                        c0286f = c0292c24 != null ? c0292c24.i : null;
                                                        c0286f2 = c0292cArr7[i40].i;
                                                        c0292c3 = c0292c24;
                                                    }
                                                    int e5 = c0292c3 != null ? c0292c3.e() + e4 : e4;
                                                    int e6 = c0293d30.f3540Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0286f17 == null || c0286f18 == null || c0286f == null || c0286f2 == null) {
                                                        c0293d4 = c0293d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0293d4 = c0293d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0283c.b(c0286f17, c0286f18, e6, 0.5f, c0286f, c0286f2, i42, i41);
                                                    }
                                                    c0293d31 = c0293d5;
                                                }
                                                c0293d30 = c0293d3.f3562g0 != i10 ? c0293d3 : c0293d4;
                                                c0293d3 = c0293d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0292c c0292c25 = c0293d23.f3540Q[i3];
                                            c0292c = c0293d27.f3540Q[i3].f3523f;
                                            int i43 = i3 + 1;
                                            C0292c c0292c26 = c0293d2.f3540Q[i43];
                                            c0292c2 = c0293d22.f3540Q[i43].f3523f;
                                            if (c0292c != null) {
                                                if (c0293d23 != c0293d2) {
                                                    c0283c.e(c0292c25.i, c0292c.i, c0292c25.e(), 5);
                                                } else if (c0292c2 != null) {
                                                    i8 = 5;
                                                    c0283c.b(c0292c25.i, c0292c.i, c0292c25.e(), 0.5f, c0292c26.i, c0292c2.i, c0292c26.e(), 5);
                                                    if (c0292c2 != null && c0293d23 != c0293d2) {
                                                        c0283c.e(c0292c26.i, c0292c2.i, -c0292c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0293d23 != null && c0293d23 != c0293d2) {
                                                        C0292c[] c0292cArr8 = c0293d23.f3540Q;
                                                        c0292c5 = c0292cArr8[i3];
                                                        c0293d9 = c0293d2 != null ? c0293d23 : c0293d2;
                                                        i11 = i3 + 1;
                                                        c0292cArr2 = c0293d9.f3540Q;
                                                        c0292c6 = c0292cArr2[i11];
                                                        C0292c c0292c27 = c0292c5.f3523f;
                                                        c0286f4 = c0292c27 == null ? c0292c27.i : null;
                                                        C0292c c0292c28 = c0292c6.f3523f;
                                                        c0286f5 = c0292c28 == null ? c0292c28.i : null;
                                                        if (c0293d22 != c0293d9) {
                                                            C0292c c0292c29 = c0293d22.f3540Q[i11].f3523f;
                                                            c0286f5 = c0292c29 != null ? c0292c29.i : null;
                                                        }
                                                        if (c0293d23 == c0293d9) {
                                                            c0292c6 = c0292cArr8[i11];
                                                        }
                                                        if (c0286f4 != null && c0286f5 != null) {
                                                            c0283c.b(c0292c5.i, c0286f4, c0292c5.e(), 0.5f, c0286f5, c0292c6.i, c0292cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0292c2 != null) {
                                                c0283c.e(c0292c26.i, c0292c2.i, -c0292c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0292c[] c0292cArr82 = c0293d23.f3540Q;
                                            c0292c5 = c0292cArr82[i3];
                                            if (c0293d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0292cArr2 = c0293d9.f3540Q;
                                            c0292c6 = c0292cArr2[i11];
                                            C0292c c0292c272 = c0292c5.f3523f;
                                            if (c0292c272 == null) {
                                            }
                                            C0292c c0292c282 = c0292c6.f3523f;
                                            if (c0292c282 == null) {
                                            }
                                            if (c0293d22 != c0293d9) {
                                            }
                                            if (c0293d23 == c0293d9) {
                                            }
                                            if (c0286f4 != null) {
                                                c0283c.b(c0292c5.i, c0286f4, c0292c5.e(), 0.5f, c0286f5, c0292c6.i, c0292cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0291b3.f3511j;
                                        boolean z17 = i44 > 0 && c0291b3.i == i44;
                                        C0293d c0293d33 = c0293d23;
                                        for (C0293d c0293d34 = c0293d33; c0293d34 != null; c0293d34 = c0293d7) {
                                            C0293d c0293d35 = c0293d34.f3572m0[i];
                                            while (c0293d35 != null && c0293d35.f3562g0 == 8) {
                                                c0293d35 = c0293d35.f3572m0[i];
                                            }
                                            if (c0293d35 != null || c0293d34 == c0293d2) {
                                                C0292c[] c0292cArr9 = c0293d34.f3540Q;
                                                C0292c c0292c30 = c0292cArr9[i3];
                                                C0286f c0286f19 = c0292c30.i;
                                                C0292c c0292c31 = c0292c30.f3523f;
                                                C0286f c0286f20 = c0292c31 != null ? c0292c31.i : null;
                                                if (c0293d33 != c0293d34) {
                                                    c0286f20 = c0293d33.f3540Q[i3 + 1].i;
                                                } else if (c0293d34 == c0293d23) {
                                                    C0292c c0292c32 = c0293d27.f3540Q[i3].f3523f;
                                                    c0286f20 = c0292c32 != null ? c0292c32.i : null;
                                                }
                                                int e7 = c0292c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0292cArr9[i45].e();
                                                if (c0293d35 != null) {
                                                    c0292c4 = c0293d35.f3540Q[i3];
                                                    c0286f3 = c0292c4.i;
                                                } else {
                                                    c0292c4 = c0293d22.f3540Q[i45].f3523f;
                                                    c0286f3 = c0292c4 != null ? c0292c4.i : null;
                                                }
                                                C0286f c0286f21 = c0292cArr9[i45].i;
                                                if (c0292c4 != null) {
                                                    e8 = c0292c4.e() + e8;
                                                }
                                                int e9 = c0293d33.f3540Q[i45].e() + e7;
                                                if (c0286f19 != null && c0286f20 != null && c0286f3 != null && c0286f21 != null) {
                                                    if (c0293d34 == c0293d23) {
                                                        e9 = c0293d23.f3540Q[i3].e();
                                                    }
                                                    if (c0293d34 == c0293d2) {
                                                        e8 = c0293d2.f3540Q[i45].e();
                                                    }
                                                    C0286f c0286f22 = c0286f20;
                                                    int i46 = e9;
                                                    C0286f c0286f23 = c0286f3;
                                                    c0293d6 = c0293d33;
                                                    int i47 = e8;
                                                    c0293d7 = c0293d35;
                                                    c0293d8 = c0293d34;
                                                    c0283c.b(c0286f19, c0286f22, i46, 0.5f, c0286f23, c0286f21, i47, z17 ? 8 : 5);
                                                    c0293d33 = c0293d8.f3562g0 == 8 ? c0293d8 : c0293d6;
                                                }
                                            }
                                            c0293d7 = c0293d35;
                                            c0293d6 = c0293d33;
                                            c0293d8 = c0293d34;
                                            if (c0293d8.f3562g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0292c[] c0292cArr822 = c0293d23.f3540Q;
                                c0292c5 = c0292cArr822[i3];
                                if (c0293d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0292cArr2 = c0293d9.f3540Q;
                                c0292c6 = c0292cArr2[i11];
                                C0292c c0292c2722 = c0292c5.f3523f;
                                if (c0292c2722 == null) {
                                }
                                C0292c c0292c2822 = c0292c6.f3523f;
                                if (c0292c2822 == null) {
                                }
                                if (c0293d22 != c0293d9) {
                                }
                                if (c0293d23 == c0293d9) {
                                }
                                if (c0286f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0292c c0292c33 = c0292c14.f3523f;
                            if (c0292c33.d == c0294e2) {
                                c0283c.e(c0292c14.i, c0292c33.i, -c0292c14.e(), 4);
                            }
                        }
                        c0283c.g(c0292c14.i, c0293d22.f3540Q[i34].f3523f.i, -c0292c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0291b3.h;
                        if (arrayList2 != null) {
                            if (c0291b3.f3515n) {
                            }
                            C0293d c0293d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0293d23 == null) {
                        }
                        c0293d2 = c0293d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0291b3.f3511j;
                            if (i392 <= 0) {
                            }
                            C0293d c0293d302 = c0293d23;
                            c0293d3 = c0293d302;
                            while (c0293d3 != null) {
                            }
                            i7 = i6;
                            C0292c c0292c252 = c0293d23.f3540Q[i3];
                            c0292c = c0293d27.f3540Q[i3].f3523f;
                            int i432 = i3 + 1;
                            C0292c c0292c262 = c0293d2.f3540Q[i432];
                            c0292c2 = c0293d22.f3540Q[i432].f3523f;
                            if (c0292c != null) {
                            }
                            i8 = 5;
                            if (c0292c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0292c[] c0292cArr8222 = c0293d23.f3540Q;
                            c0292c5 = c0292cArr8222[i3];
                            if (c0293d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0292cArr2 = c0293d9.f3540Q;
                            c0292c6 = c0292cArr2[i11];
                            C0292c c0292c27222 = c0292c5.f3523f;
                            if (c0292c27222 == null) {
                            }
                            C0292c c0292c28222 = c0292c6.f3523f;
                            if (c0292c28222 == null) {
                            }
                            if (c0293d22 != c0293d9) {
                            }
                            if (c0293d23 == c0293d9) {
                            }
                            if (c0286f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0292c[] c0292cArr82222 = c0293d23.f3540Q;
                        c0292c5 = c0292cArr82222[i3];
                        if (c0293d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0292cArr2 = c0293d9.f3540Q;
                        c0292c6 = c0292cArr2[i11];
                        C0292c c0292c272222 = c0292c5.f3523f;
                        if (c0292c272222 == null) {
                        }
                        C0292c c0292c282222 = c0292c6.f3523f;
                        if (c0292c282222 == null) {
                        }
                        if (c0293d22 != c0293d9) {
                        }
                        if (c0293d23 == c0293d9) {
                        }
                        if (c0286f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0291b3.h;
                if (arrayList2 != null) {
                }
                if (c0293d23 == null) {
                }
                c0293d2 = c0293d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0292c[] c0292cArr822222 = c0293d23.f3540Q;
                c0292c5 = c0292cArr822222[i3];
                if (c0293d2 != null) {
                }
                i11 = i3 + 1;
                c0292cArr2 = c0293d9.f3540Q;
                c0292c6 = c0292cArr2[i11];
                C0292c c0292c2722222 = c0292c5.f3523f;
                if (c0292c2722222 == null) {
                }
                C0292c c0292c2822222 = c0292c6.f3523f;
                if (c0292c2822222 == null) {
                }
                if (c0293d22 != c0293d9) {
                }
                if (c0293d23 == c0293d9) {
                }
                if (c0286f4 != null) {
                }
            } else {
                i5 = i2;
                c0291bArr2 = c0291bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0294e2 = c0294e;
            arrayList4 = arrayList;
            i2 = i5;
            c0291bArr = c0291bArr2;
        }
    }

    public static void b(C0294e c0294e, C0283c c0283c, C0293d c0293d) {
        c0293d.f3574o = -1;
        c0293d.f3576p = -1;
        int i = c0294e.f3577p0[0];
        int[] iArr = c0293d.f3577p0;
        if (i != 2 && iArr[0] == 4) {
            C0292c c0292c = c0293d.f3532I;
            int i2 = c0292c.f3524g;
            int q2 = c0294e.q();
            C0292c c0292c2 = c0293d.f3534K;
            int i3 = q2 - c0292c2.f3524g;
            c0292c.i = c0283c.k(c0292c);
            c0292c2.i = c0283c.k(c0292c2);
            c0283c.d(c0292c.i, i2);
            c0283c.d(c0292c2.i, i3);
            c0293d.f3574o = 2;
            c0293d.f3548Y = i2;
            int i4 = i3 - i2;
            c0293d.f3544U = i4;
            int i5 = c0293d.f3553b0;
            if (i4 < i5) {
                c0293d.f3544U = i5;
            }
        }
        if (c0294e.f3577p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0292c c0292c3 = c0293d.f3533J;
        int i6 = c0292c3.f3524g;
        int k2 = c0294e.k();
        C0292c c0292c4 = c0293d.f3535L;
        int i7 = k2 - c0292c4.f3524g;
        c0292c3.i = c0283c.k(c0292c3);
        c0292c4.i = c0283c.k(c0292c4);
        c0283c.d(c0292c3.i, i6);
        c0283c.d(c0292c4.i, i7);
        if (c0293d.f3551a0 > 0 || c0293d.f3562g0 == 8) {
            C0292c c0292c5 = c0293d.f3536M;
            C0286f k3 = c0283c.k(c0292c5);
            c0292c5.i = k3;
            c0283c.d(k3, c0293d.f3551a0 + i6);
        }
        c0293d.f3576p = 2;
        c0293d.f3549Z = i6;
        int i8 = i7 - i6;
        c0293d.f3545V = i8;
        int i9 = c0293d.f3555c0;
        if (i8 < i9) {
            c0293d.f3545V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
