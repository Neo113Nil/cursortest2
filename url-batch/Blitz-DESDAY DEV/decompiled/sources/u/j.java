package u;

import java.util.ArrayList;
import s.C0264b;
import s.C0265c;
import s.C0268f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3781a = new boolean[3];

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
    public static void a(C0276e c0276e, C0265c c0265c, ArrayList arrayList, int i) {
        int i2;
        C0273b[] c0273bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0275d c0275d;
        boolean z4;
        boolean z5;
        C0274c[] c0274cArr;
        int i5;
        C0273b[] c0273bArr2;
        ArrayList arrayList2;
        C0275d c0275d2;
        int i6;
        C0275d c0275d3;
        int i7;
        C0274c c0274c;
        C0274c c0274c2;
        int i8;
        C0275d c0275d4;
        int i9;
        int i10;
        C0275d c0275d5;
        C0268f c0268f;
        C0268f c0268f2;
        C0274c c0274c3;
        C0274c c0274c4;
        C0268f c0268f3;
        C0275d c0275d6;
        C0275d c0275d7;
        C0275d c0275d8;
        C0274c c0274c5;
        C0275d c0275d9;
        int i11;
        C0274c[] c0274cArr2;
        C0274c c0274c6;
        C0268f c0268f4;
        C0268f c0268f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0275d c0275d10;
        boolean z6;
        C0275d c0275d11;
        C0273b c0273b;
        C0275d c0275d12;
        C0275d c0275d13;
        int i14;
        int i15;
        C0275d c0275d14;
        C0274c c0274c7;
        C0275d c0275d15;
        C0276e c0276e2 = c0276e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0276e2.f3723z0;
            c0273bArr = c0276e2.f3705C0;
            i3 = 0;
        } else {
            i2 = c0276e2.f3704A0;
            c0273bArr = c0276e2.B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0273b c0273b2 = c0273bArr[i17];
            boolean z7 = c0273b2.f3634q;
            C0275d c0275d16 = c0273b2.f3621a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0273b2.f3629l;
                int i22 = i21 * 2;
                C0275d c0275d17 = c0275d16;
                C0275d c0275d18 = c0275d17;
                boolean z8 = false;
                while (!z8) {
                    c0273b2.i += i19;
                    c0275d17.f3688m0[i21] = null;
                    c0275d17.f3686l0[i21] = null;
                    int i23 = c0275d17.f3678g0;
                    C0274c[] c0274cArr3 = c0275d17.f3656Q;
                    if (i23 != i20) {
                        c0275d17.j(i21);
                        c0274cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0274cArr3[i24].e();
                        c0274cArr3[i22].e();
                        c0274cArr3[i24].e();
                        if (c0273b2.f3622b == null) {
                            c0273b2.f3622b = c0275d17;
                        }
                        c0273b2.d = c0275d17;
                        int i25 = c0275d17.p0[i21];
                        if (i25 == i18) {
                            int i26 = c0275d17.f3697t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0273b2.f3627j++;
                                float f4 = c0275d17.f3684k0[i21];
                                if (f4 > 0.0f) {
                                    c0273b2.f3628k += f4;
                                }
                                i15 = i17;
                                if (c0275d17.f3678g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0273b2.f3631n = true;
                                    } else {
                                        c0273b2.f3632o = true;
                                    }
                                    if (c0273b2.h == null) {
                                        c0273b2.h = new ArrayList();
                                    }
                                    c0273b2.h.add(c0275d17);
                                }
                                if (c0273b2.f3625f == null) {
                                    c0273b2.f3625f = c0275d17;
                                }
                                C0275d c0275d19 = c0273b2.f3626g;
                                if (c0275d19 != null) {
                                    c0275d19.f3686l0[i21] = c0275d17;
                                }
                                c0273b2.f3626g = c0275d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0275d17.f3695r == 0 && c0275d17.f3698u == 0) {
                                    int i27 = c0275d17.f3699v;
                                }
                            } else if (c0275d17.f3696s == 0 && c0275d17.f3701x == 0) {
                                int i28 = c0275d17.f3702y;
                            }
                            c0275d14 = c0275d18;
                            if (c0275d14 != c0275d17) {
                                c0275d14.f3688m0[i21] = c0275d17;
                            }
                            c0274c7 = c0274cArr3[i22 + 1].f3639f;
                            if (c0274c7 != null) {
                                c0275d15 = c0274c7.d;
                                C0274c c0274c8 = c0275d15.f3656Q[i22].f3639f;
                                if (c0274c8 != null) {
                                }
                            }
                            c0275d15 = null;
                            if (c0275d15 != null) {
                                c0275d15 = c0275d17;
                                z8 = true;
                            }
                            c0275d18 = c0275d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0275d17 = c0275d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0275d14 = c0275d18;
                    if (c0275d14 != c0275d17) {
                    }
                    c0274c7 = c0274cArr3[i22 + 1].f3639f;
                    if (c0274c7 != null) {
                    }
                    c0275d15 = null;
                    if (c0275d15 != null) {
                    }
                    c0275d18 = c0275d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0275d17 = c0275d15;
                    i18 = 3;
                }
                i4 = i17;
                C0275d c0275d20 = c0273b2.f3622b;
                if (c0275d20 != null) {
                    c0275d20.f3656Q[i22].e();
                }
                C0275d c0275d21 = c0273b2.d;
                if (c0275d21 != null) {
                    c0275d21.f3656Q[i22 + 1].e();
                }
                c0273b2.f3623c = c0275d17;
                if (i21 == 0 && c0273b2.f3630m) {
                    c0273b2.f3624e = c0275d17;
                } else {
                    c0273b2.f3624e = c0275d16;
                }
                c0273b2.f3633p = c0273b2.f3632o && c0273b2.f3631n;
                z2 = true;
            }
            c0273b2.f3634q = z2;
            if (arrayList4 == null || arrayList4.contains(c0275d16)) {
                C0275d c0275d22 = c0273b2.f3623c;
                C0275d c0275d23 = c0273b2.f3622b;
                C0275d c0275d24 = c0273b2.d;
                C0275d c0275d25 = c0273b2.f3624e;
                float f5 = c0273b2.f3628k;
                boolean z9 = c0276e2.p0[i] == 2;
                if (i == 0) {
                    int i29 = c0275d25.f3680i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0275d = c0275d16;
                    z4 = z10;
                } else {
                    int i30 = c0275d25.f3682j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0275d = c0275d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0274cArr = c0276e2.f3656Q;
                    if (z13) {
                        break;
                    }
                    C0274c c0274c9 = c0275d.f3656Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0274c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0275d.p0;
                    int i32 = i2;
                    C0273b[] c0273bArr3 = c0273bArr;
                    boolean z15 = iArr[i] == 3 && c0275d.f3697t[i] == 0;
                    C0274c c0274c10 = c0274c9.f3639f;
                    if (c0274c10 != null && c0275d != c0275d16) {
                        e2 = c0274c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0275d == c0275d16 || c0275d == c0275d23) {
                        c0275d11 = c0275d25;
                    } else {
                        c0275d11 = c0275d25;
                        i31 = 8;
                    }
                    C0274c c0274c11 = c0274c9.f3639f;
                    if (c0274c11 != null) {
                        if (c0275d == c0275d23) {
                            c0275d12 = c0275d16;
                            c0273b = c0273b2;
                            c0265c.f(c0274c9.i, c0274c11.i, i33, 6);
                        } else {
                            c0273b = c0273b2;
                            c0275d12 = c0275d16;
                            c0265c.f(c0274c9.i, c0274c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0265c.e(c0274c9.i, c0274c9.f3639f.i, i33, (c0275d == c0275d23 && z3 && c0275d.f3658S[i]) ? 5 : i31);
                    } else {
                        c0273b = c0273b2;
                        c0275d12 = c0275d16;
                    }
                    C0274c[] c0274cArr4 = c0275d.f3656Q;
                    if (z9) {
                        if (c0275d.f3678g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0265c.f(c0274cArr4[i3 + 1].i, c0274cArr4[i3].i, 0, 5);
                        }
                        c0265c.f(c0274cArr4[i3].i, c0274cArr[i3].i, i14, 8);
                    }
                    C0274c c0274c12 = c0274cArr4[i3 + 1].f3639f;
                    if (c0274c12 != null) {
                        c0275d13 = c0274c12.d;
                        C0274c c0274c13 = c0275d13.f3656Q[i3].f3639f;
                        if (c0274c13 != null) {
                        }
                    }
                    c0275d13 = null;
                    if (c0275d13 != null) {
                        c0275d = c0275d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0275d25 = c0275d11;
                    i2 = i32;
                    c0273bArr = c0273bArr3;
                    c0275d16 = c0275d12;
                    c0273b2 = c0273b;
                }
                C0273b c0273b3 = c0273b2;
                C0275d c0275d26 = c0275d25;
                C0275d c0275d27 = c0275d16;
                i5 = i2;
                c0273bArr2 = c0273bArr;
                if (c0275d24 != null) {
                    int i34 = i3 + 1;
                    if (c0275d22.f3656Q[i34].f3639f != null) {
                        C0274c c0274c14 = c0275d24.f3656Q[i34];
                        if (c0275d24.p0[i] == 3 && c0275d24.f3697t[i] == 0 && !z3) {
                            C0274c c0274c15 = c0274c14.f3639f;
                            if (c0274c15.d == c0276e2) {
                                c0265c.e(c0274c14.i, c0274c15.i, -c0274c14.e(), 5);
                                c0265c.g(c0274c14.i, c0275d22.f3656Q[i34].f3639f.i, -c0274c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0268f c0268f6 = c0274cArr[i35].i;
                                    C0274c c0274c16 = c0275d22.f3656Q[i35];
                                    c0265c.f(c0268f6, c0274c16.i, c0274c16.e(), 8);
                                }
                                arrayList2 = c0273b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0273b3.f3631n || c0273b3.f3633p) ? f2 : c0273b3.f3627j;
                                    C0275d c0275d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0275d c0275d29 = (C0275d) arrayList2.get(i12);
                                        float f8 = c0275d29.f3684k0[i];
                                        C0274c[] c0274cArr5 = c0275d29.f3656Q;
                                        if (f8 < 0.0f) {
                                            if (c0273b3.f3633p) {
                                                C0268f c0268f7 = c0274cArr5[i3 + 1].i;
                                                C0268f c0268f8 = c0274cArr5[i3].i;
                                                z6 = false;
                                                c0265c.e(c0268f7, c0268f8, 0, 4);
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
                                            C0268f c0268f9 = c0274cArr5[i3 + 1].i;
                                            C0268f c0268f10 = c0274cArr5[i3].i;
                                            z6 = false;
                                            c0265c.e(c0268f9, c0268f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0275d28 != null) {
                                                C0274c[] c0274cArr6 = c0275d28.f3656Q;
                                                C0268f c0268f11 = c0274cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0268f c0268f12 = c0274cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0268f c0268f13 = c0274cArr5[i3].i;
                                                C0268f c0268f14 = c0274cArr5[i36].i;
                                                i13 = size;
                                                C0264b l2 = c0265c.l();
                                                c0275d10 = c0275d29;
                                                l2.f3575b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.d.g(c0268f11, 1.0f);
                                                    l2.d.g(c0268f12, -1.0f);
                                                    l2.d.g(c0268f14, 1.0f);
                                                    l2.d.g(c0268f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.d.g(c0268f11, 1.0f);
                                                        l2.d.g(c0268f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.d.g(c0268f13, 1.0f);
                                                        l2.d.g(c0268f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.d.g(c0268f11, 1.0f);
                                                        l2.d.g(c0268f12, -1.0f);
                                                        l2.d.g(c0268f14, f9);
                                                        l2.d.g(c0268f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0265c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0275d10 = c0275d29;
                                            }
                                            f7 = f3;
                                            c0275d28 = c0275d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0275d23 == null && (c0275d23 == c0275d24 || z3)) {
                                    C0274c c0274c17 = c0275d27.f3656Q[i3];
                                    int i37 = i3 + 1;
                                    C0274c c0274c18 = c0275d22.f3656Q[i37];
                                    C0274c c0274c19 = c0274c17.f3639f;
                                    C0268f c0268f15 = c0274c19 != null ? c0274c19.i : null;
                                    C0274c c0274c20 = c0274c18.f3639f;
                                    C0268f c0268f16 = c0274c20 != null ? c0274c20.i : null;
                                    C0274c c0274c21 = c0275d23.f3656Q[i3];
                                    if (c0275d24 != null) {
                                        c0274c18 = c0275d24.f3656Q[i37];
                                    }
                                    if (c0268f15 == null || c0268f16 == null) {
                                        c0275d2 = c0275d24;
                                        i6 = i4;
                                    } else {
                                        c0275d2 = c0275d24;
                                        i6 = i4;
                                        c0265c.b(c0274c21.i, c0268f15, c0274c21.e(), i == 0 ? c0275d26.f3672d0 : c0275d26.f3674e0, c0268f16, c0274c18.i, c0274c18.e(), 7);
                                    }
                                } else {
                                    c0275d2 = c0275d24;
                                    i6 = i4;
                                    if (z4 || c0275d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0275d23 != null) {
                                            int i39 = c0273b3.f3627j;
                                            boolean z16 = i39 <= 0 && c0273b3.i == i39;
                                            C0275d c0275d30 = c0275d23;
                                            c0275d3 = c0275d30;
                                            while (c0275d3 != null) {
                                                C0275d c0275d31 = c0275d3.f3688m0[i];
                                                while (c0275d31 != null && c0275d31.f3678g0 == i38) {
                                                    c0275d31 = c0275d31.f3688m0[i];
                                                }
                                                if (c0275d3 == c0275d23 || c0275d3 == c0275d2 || c0275d31 == null) {
                                                    c0275d4 = c0275d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0275d c0275d32 = c0275d31 == c0275d2 ? null : c0275d31;
                                                    C0274c[] c0274cArr7 = c0275d3.f3656Q;
                                                    C0274c c0274c22 = c0274cArr7[i3];
                                                    C0268f c0268f17 = c0274c22.i;
                                                    int i40 = i3 + 1;
                                                    C0268f c0268f18 = c0275d30.f3656Q[i40].i;
                                                    int e3 = c0274c22.e();
                                                    int e4 = c0274cArr7[i40].e();
                                                    if (c0275d32 != null) {
                                                        c0274c3 = c0275d32.f3656Q[i3];
                                                        c0268f = c0274c3.i;
                                                        c0275d5 = c0275d32;
                                                        C0274c c0274c23 = c0274c3.f3639f;
                                                        c0268f2 = c0274c23 != null ? c0274c23.i : null;
                                                    } else {
                                                        c0275d5 = c0275d32;
                                                        C0274c c0274c24 = c0275d2.f3656Q[i3];
                                                        c0268f = c0274c24 != null ? c0274c24.i : null;
                                                        c0268f2 = c0274cArr7[i40].i;
                                                        c0274c3 = c0274c24;
                                                    }
                                                    int e5 = c0274c3 != null ? c0274c3.e() + e4 : e4;
                                                    int e6 = c0275d30.f3656Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0268f17 == null || c0268f18 == null || c0268f == null || c0268f2 == null) {
                                                        c0275d4 = c0275d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0275d4 = c0275d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0265c.b(c0268f17, c0268f18, e6, 0.5f, c0268f, c0268f2, i42, i41);
                                                    }
                                                    c0275d31 = c0275d5;
                                                }
                                                c0275d30 = c0275d3.f3678g0 != i10 ? c0275d3 : c0275d4;
                                                c0275d3 = c0275d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0274c c0274c25 = c0275d23.f3656Q[i3];
                                            c0274c = c0275d27.f3656Q[i3].f3639f;
                                            int i43 = i3 + 1;
                                            C0274c c0274c26 = c0275d2.f3656Q[i43];
                                            c0274c2 = c0275d22.f3656Q[i43].f3639f;
                                            if (c0274c != null) {
                                                if (c0275d23 != c0275d2) {
                                                    c0265c.e(c0274c25.i, c0274c.i, c0274c25.e(), 5);
                                                } else if (c0274c2 != null) {
                                                    i8 = 5;
                                                    c0265c.b(c0274c25.i, c0274c.i, c0274c25.e(), 0.5f, c0274c26.i, c0274c2.i, c0274c26.e(), 5);
                                                    if (c0274c2 != null && c0275d23 != c0275d2) {
                                                        c0265c.e(c0274c26.i, c0274c2.i, -c0274c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0275d23 != null && c0275d23 != c0275d2) {
                                                        C0274c[] c0274cArr8 = c0275d23.f3656Q;
                                                        c0274c5 = c0274cArr8[i3];
                                                        c0275d9 = c0275d2 != null ? c0275d23 : c0275d2;
                                                        i11 = i3 + 1;
                                                        c0274cArr2 = c0275d9.f3656Q;
                                                        c0274c6 = c0274cArr2[i11];
                                                        C0274c c0274c27 = c0274c5.f3639f;
                                                        c0268f4 = c0274c27 == null ? c0274c27.i : null;
                                                        C0274c c0274c28 = c0274c6.f3639f;
                                                        c0268f5 = c0274c28 == null ? c0274c28.i : null;
                                                        if (c0275d22 != c0275d9) {
                                                            C0274c c0274c29 = c0275d22.f3656Q[i11].f3639f;
                                                            c0268f5 = c0274c29 != null ? c0274c29.i : null;
                                                        }
                                                        if (c0275d23 == c0275d9) {
                                                            c0274c6 = c0274cArr8[i11];
                                                        }
                                                        if (c0268f4 != null && c0268f5 != null) {
                                                            c0265c.b(c0274c5.i, c0268f4, c0274c5.e(), 0.5f, c0268f5, c0274c6.i, c0274cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0274c2 != null) {
                                                c0265c.e(c0274c26.i, c0274c2.i, -c0274c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0274c[] c0274cArr82 = c0275d23.f3656Q;
                                            c0274c5 = c0274cArr82[i3];
                                            if (c0275d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0274cArr2 = c0275d9.f3656Q;
                                            c0274c6 = c0274cArr2[i11];
                                            C0274c c0274c272 = c0274c5.f3639f;
                                            if (c0274c272 == null) {
                                            }
                                            C0274c c0274c282 = c0274c6.f3639f;
                                            if (c0274c282 == null) {
                                            }
                                            if (c0275d22 != c0275d9) {
                                            }
                                            if (c0275d23 == c0275d9) {
                                            }
                                            if (c0268f4 != null) {
                                                c0265c.b(c0274c5.i, c0268f4, c0274c5.e(), 0.5f, c0268f5, c0274c6.i, c0274cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0273b3.f3627j;
                                        boolean z17 = i44 > 0 && c0273b3.i == i44;
                                        C0275d c0275d33 = c0275d23;
                                        for (C0275d c0275d34 = c0275d33; c0275d34 != null; c0275d34 = c0275d7) {
                                            C0275d c0275d35 = c0275d34.f3688m0[i];
                                            while (c0275d35 != null && c0275d35.f3678g0 == 8) {
                                                c0275d35 = c0275d35.f3688m0[i];
                                            }
                                            if (c0275d35 != null || c0275d34 == c0275d2) {
                                                C0274c[] c0274cArr9 = c0275d34.f3656Q;
                                                C0274c c0274c30 = c0274cArr9[i3];
                                                C0268f c0268f19 = c0274c30.i;
                                                C0274c c0274c31 = c0274c30.f3639f;
                                                C0268f c0268f20 = c0274c31 != null ? c0274c31.i : null;
                                                if (c0275d33 != c0275d34) {
                                                    c0268f20 = c0275d33.f3656Q[i3 + 1].i;
                                                } else if (c0275d34 == c0275d23) {
                                                    C0274c c0274c32 = c0275d27.f3656Q[i3].f3639f;
                                                    c0268f20 = c0274c32 != null ? c0274c32.i : null;
                                                }
                                                int e7 = c0274c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0274cArr9[i45].e();
                                                if (c0275d35 != null) {
                                                    c0274c4 = c0275d35.f3656Q[i3];
                                                    c0268f3 = c0274c4.i;
                                                } else {
                                                    c0274c4 = c0275d22.f3656Q[i45].f3639f;
                                                    c0268f3 = c0274c4 != null ? c0274c4.i : null;
                                                }
                                                C0268f c0268f21 = c0274cArr9[i45].i;
                                                if (c0274c4 != null) {
                                                    e8 = c0274c4.e() + e8;
                                                }
                                                int e9 = c0275d33.f3656Q[i45].e() + e7;
                                                if (c0268f19 != null && c0268f20 != null && c0268f3 != null && c0268f21 != null) {
                                                    if (c0275d34 == c0275d23) {
                                                        e9 = c0275d23.f3656Q[i3].e();
                                                    }
                                                    if (c0275d34 == c0275d2) {
                                                        e8 = c0275d2.f3656Q[i45].e();
                                                    }
                                                    C0268f c0268f22 = c0268f20;
                                                    int i46 = e9;
                                                    C0268f c0268f23 = c0268f3;
                                                    c0275d6 = c0275d33;
                                                    int i47 = e8;
                                                    c0275d7 = c0275d35;
                                                    c0275d8 = c0275d34;
                                                    c0265c.b(c0268f19, c0268f22, i46, 0.5f, c0268f23, c0268f21, i47, z17 ? 8 : 5);
                                                    c0275d33 = c0275d8.f3678g0 == 8 ? c0275d8 : c0275d6;
                                                }
                                            }
                                            c0275d7 = c0275d35;
                                            c0275d6 = c0275d33;
                                            c0275d8 = c0275d34;
                                            if (c0275d8.f3678g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0274c[] c0274cArr822 = c0275d23.f3656Q;
                                c0274c5 = c0274cArr822[i3];
                                if (c0275d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0274cArr2 = c0275d9.f3656Q;
                                c0274c6 = c0274cArr2[i11];
                                C0274c c0274c2722 = c0274c5.f3639f;
                                if (c0274c2722 == null) {
                                }
                                C0274c c0274c2822 = c0274c6.f3639f;
                                if (c0274c2822 == null) {
                                }
                                if (c0275d22 != c0275d9) {
                                }
                                if (c0275d23 == c0275d9) {
                                }
                                if (c0268f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0274c c0274c33 = c0274c14.f3639f;
                            if (c0274c33.d == c0276e2) {
                                c0265c.e(c0274c14.i, c0274c33.i, -c0274c14.e(), 4);
                            }
                        }
                        c0265c.g(c0274c14.i, c0275d22.f3656Q[i34].f3639f.i, -c0274c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0273b3.h;
                        if (arrayList2 != null) {
                            if (c0273b3.f3631n) {
                            }
                            C0275d c0275d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0275d23 == null) {
                        }
                        c0275d2 = c0275d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0273b3.f3627j;
                            if (i392 <= 0) {
                            }
                            C0275d c0275d302 = c0275d23;
                            c0275d3 = c0275d302;
                            while (c0275d3 != null) {
                            }
                            i7 = i6;
                            C0274c c0274c252 = c0275d23.f3656Q[i3];
                            c0274c = c0275d27.f3656Q[i3].f3639f;
                            int i432 = i3 + 1;
                            C0274c c0274c262 = c0275d2.f3656Q[i432];
                            c0274c2 = c0275d22.f3656Q[i432].f3639f;
                            if (c0274c != null) {
                            }
                            i8 = 5;
                            if (c0274c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0274c[] c0274cArr8222 = c0275d23.f3656Q;
                            c0274c5 = c0274cArr8222[i3];
                            if (c0275d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0274cArr2 = c0275d9.f3656Q;
                            c0274c6 = c0274cArr2[i11];
                            C0274c c0274c27222 = c0274c5.f3639f;
                            if (c0274c27222 == null) {
                            }
                            C0274c c0274c28222 = c0274c6.f3639f;
                            if (c0274c28222 == null) {
                            }
                            if (c0275d22 != c0275d9) {
                            }
                            if (c0275d23 == c0275d9) {
                            }
                            if (c0268f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0274c[] c0274cArr82222 = c0275d23.f3656Q;
                        c0274c5 = c0274cArr82222[i3];
                        if (c0275d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0274cArr2 = c0275d9.f3656Q;
                        c0274c6 = c0274cArr2[i11];
                        C0274c c0274c272222 = c0274c5.f3639f;
                        if (c0274c272222 == null) {
                        }
                        C0274c c0274c282222 = c0274c6.f3639f;
                        if (c0274c282222 == null) {
                        }
                        if (c0275d22 != c0275d9) {
                        }
                        if (c0275d23 == c0275d9) {
                        }
                        if (c0268f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0273b3.h;
                if (arrayList2 != null) {
                }
                if (c0275d23 == null) {
                }
                c0275d2 = c0275d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0274c[] c0274cArr822222 = c0275d23.f3656Q;
                c0274c5 = c0274cArr822222[i3];
                if (c0275d2 != null) {
                }
                i11 = i3 + 1;
                c0274cArr2 = c0275d9.f3656Q;
                c0274c6 = c0274cArr2[i11];
                C0274c c0274c2722222 = c0274c5.f3639f;
                if (c0274c2722222 == null) {
                }
                C0274c c0274c2822222 = c0274c6.f3639f;
                if (c0274c2822222 == null) {
                }
                if (c0275d22 != c0275d9) {
                }
                if (c0275d23 == c0275d9) {
                }
                if (c0268f4 != null) {
                }
            } else {
                i5 = i2;
                c0273bArr2 = c0273bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0276e2 = c0276e;
            arrayList4 = arrayList;
            i2 = i5;
            c0273bArr = c0273bArr2;
        }
    }

    public static void b(C0276e c0276e, C0265c c0265c, C0275d c0275d) {
        c0275d.f3691o = -1;
        c0275d.f3693p = -1;
        int i = c0276e.p0[0];
        int[] iArr = c0275d.p0;
        if (i != 2 && iArr[0] == 4) {
            C0274c c0274c = c0275d.f3648I;
            int i2 = c0274c.f3640g;
            int q2 = c0276e.q();
            C0274c c0274c2 = c0275d.f3650K;
            int i3 = q2 - c0274c2.f3640g;
            c0274c.i = c0265c.k(c0274c);
            c0274c2.i = c0265c.k(c0274c2);
            c0265c.d(c0274c.i, i2);
            c0265c.d(c0274c2.i, i3);
            c0275d.f3691o = 2;
            c0275d.f3664Y = i2;
            int i4 = i3 - i2;
            c0275d.f3660U = i4;
            int i5 = c0275d.f3669b0;
            if (i4 < i5) {
                c0275d.f3660U = i5;
            }
        }
        if (c0276e.p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0274c c0274c3 = c0275d.f3649J;
        int i6 = c0274c3.f3640g;
        int k2 = c0276e.k();
        C0274c c0274c4 = c0275d.f3651L;
        int i7 = k2 - c0274c4.f3640g;
        c0274c3.i = c0265c.k(c0274c3);
        c0274c4.i = c0265c.k(c0274c4);
        c0265c.d(c0274c3.i, i6);
        c0265c.d(c0274c4.i, i7);
        if (c0275d.f3667a0 > 0 || c0275d.f3678g0 == 8) {
            C0274c c0274c5 = c0275d.f3652M;
            C0268f k3 = c0265c.k(c0274c5);
            c0274c5.i = k3;
            c0265c.d(k3, c0275d.f3667a0 + i6);
        }
        c0275d.f3693p = 2;
        c0275d.f3665Z = i6;
        int i8 = i7 - i6;
        c0275d.f3661V = i8;
        int i9 = c0275d.f3671c0;
        if (i8 < i9) {
            c0275d.f3661V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
