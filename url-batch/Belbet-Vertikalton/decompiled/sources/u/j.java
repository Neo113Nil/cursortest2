package u;

import java.util.ArrayList;
import s.C0377b;
import s.C0378c;
import s.C0381f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f4368a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.f4225d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.f4225d == r13) goto L73;
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
    public static void a(C0388e c0388e, C0378c c0378c, ArrayList arrayList, int i) {
        int i2;
        C0385b[] c0385bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0387d c0387d;
        boolean z4;
        boolean z5;
        C0386c[] c0386cArr;
        int i5;
        C0385b[] c0385bArr2;
        ArrayList arrayList2;
        C0387d c0387d2;
        int i6;
        C0387d c0387d3;
        int i7;
        C0386c c0386c;
        C0386c c0386c2;
        int i8;
        C0387d c0387d4;
        int i9;
        int i10;
        C0387d c0387d5;
        C0381f c0381f;
        C0381f c0381f2;
        C0386c c0386c3;
        C0386c c0386c4;
        C0381f c0381f3;
        C0387d c0387d6;
        C0387d c0387d7;
        C0387d c0387d8;
        C0386c c0386c5;
        C0387d c0387d9;
        int i11;
        C0386c[] c0386cArr2;
        C0386c c0386c6;
        C0381f c0381f4;
        C0381f c0381f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0387d c0387d10;
        boolean z6;
        C0387d c0387d11;
        C0385b c0385b;
        C0387d c0387d12;
        C0387d c0387d13;
        int i14;
        int i15;
        C0387d c0387d14;
        C0386c c0386c7;
        C0387d c0387d15;
        C0388e c0388e2 = c0388e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0388e2.f4311z0;
            c0385bArr = c0388e2.f4294C0;
            i3 = 0;
        } else {
            i2 = c0388e2.f4292A0;
            c0385bArr = c0388e2.f4293B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0385b c0385b2 = c0385bArr[i17];
            boolean z7 = c0385b2.f4221q;
            C0387d c0387d16 = c0385b2.f4208a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0385b2.f4216l;
                int i22 = i21 * 2;
                C0387d c0387d17 = c0387d16;
                C0387d c0387d18 = c0387d17;
                boolean z8 = false;
                while (!z8) {
                    c0385b2.i += i19;
                    c0387d17.f4276m0[i21] = null;
                    c0387d17.f4274l0[i21] = null;
                    int i23 = c0387d17.f4266g0;
                    C0386c[] c0386cArr3 = c0387d17.f4244Q;
                    if (i23 != i20) {
                        c0387d17.j(i21);
                        c0386cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0386cArr3[i24].e();
                        c0386cArr3[i22].e();
                        c0386cArr3[i24].e();
                        if (c0385b2.f4209b == null) {
                            c0385b2.f4209b = c0387d17;
                        }
                        c0385b2.f4211d = c0387d17;
                        int i25 = c0387d17.f4281p0[i21];
                        if (i25 == i18) {
                            int i26 = c0387d17.f4285t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0385b2.j++;
                                float f4 = c0387d17.f4272k0[i21];
                                if (f4 > 0.0f) {
                                    c0385b2.f4215k += f4;
                                }
                                i15 = i17;
                                if (c0387d17.f4266g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0385b2.f4218n = true;
                                    } else {
                                        c0385b2.f4219o = true;
                                    }
                                    if (c0385b2.f4214h == null) {
                                        c0385b2.f4214h = new ArrayList();
                                    }
                                    c0385b2.f4214h.add(c0387d17);
                                }
                                if (c0385b2.f4212f == null) {
                                    c0385b2.f4212f = c0387d17;
                                }
                                C0387d c0387d19 = c0385b2.f4213g;
                                if (c0387d19 != null) {
                                    c0387d19.f4274l0[i21] = c0387d17;
                                }
                                c0385b2.f4213g = c0387d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0387d17.f4283r == 0 && c0387d17.f4286u == 0) {
                                    int i27 = c0387d17.f4287v;
                                }
                            } else if (c0387d17.f4284s == 0 && c0387d17.f4289x == 0) {
                                int i28 = c0387d17.f4290y;
                            }
                            c0387d14 = c0387d18;
                            if (c0387d14 != c0387d17) {
                                c0387d14.f4276m0[i21] = c0387d17;
                            }
                            c0386c7 = c0386cArr3[i22 + 1].f4226f;
                            if (c0386c7 != null) {
                                c0387d15 = c0386c7.f4225d;
                                C0386c c0386c8 = c0387d15.f4244Q[i22].f4226f;
                                if (c0386c8 != null) {
                                }
                            }
                            c0387d15 = null;
                            if (c0387d15 != null) {
                                c0387d15 = c0387d17;
                                z8 = true;
                            }
                            c0387d18 = c0387d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0387d17 = c0387d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0387d14 = c0387d18;
                    if (c0387d14 != c0387d17) {
                    }
                    c0386c7 = c0386cArr3[i22 + 1].f4226f;
                    if (c0386c7 != null) {
                    }
                    c0387d15 = null;
                    if (c0387d15 != null) {
                    }
                    c0387d18 = c0387d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0387d17 = c0387d15;
                    i18 = 3;
                }
                i4 = i17;
                C0387d c0387d20 = c0385b2.f4209b;
                if (c0387d20 != null) {
                    c0387d20.f4244Q[i22].e();
                }
                C0387d c0387d21 = c0385b2.f4211d;
                if (c0387d21 != null) {
                    c0387d21.f4244Q[i22 + 1].e();
                }
                c0385b2.f4210c = c0387d17;
                if (i21 == 0 && c0385b2.f4217m) {
                    c0385b2.e = c0387d17;
                } else {
                    c0385b2.e = c0387d16;
                }
                c0385b2.f4220p = c0385b2.f4219o && c0385b2.f4218n;
                z2 = true;
            }
            c0385b2.f4221q = z2;
            if (arrayList4 == null || arrayList4.contains(c0387d16)) {
                C0387d c0387d22 = c0385b2.f4210c;
                C0387d c0387d23 = c0385b2.f4209b;
                C0387d c0387d24 = c0385b2.f4211d;
                C0387d c0387d25 = c0385b2.e;
                float f5 = c0385b2.f4215k;
                boolean z9 = c0388e2.f4281p0[i] == 2;
                if (i == 0) {
                    int i29 = c0387d25.f4269i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0387d = c0387d16;
                    z4 = z10;
                } else {
                    int i30 = c0387d25.f4270j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0387d = c0387d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0386cArr = c0388e2.f4244Q;
                    if (z13) {
                        break;
                    }
                    C0386c c0386c9 = c0387d.f4244Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e = c0386c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0387d.f4281p0;
                    int i32 = i2;
                    C0385b[] c0385bArr3 = c0385bArr;
                    boolean z15 = iArr[i] == 3 && c0387d.f4285t[i] == 0;
                    C0386c c0386c10 = c0386c9.f4226f;
                    if (c0386c10 != null && c0387d != c0387d16) {
                        e = c0386c10.e() + e;
                    }
                    int i33 = e;
                    if (!z3 || c0387d == c0387d16 || c0387d == c0387d23) {
                        c0387d11 = c0387d25;
                    } else {
                        c0387d11 = c0387d25;
                        i31 = 8;
                    }
                    C0386c c0386c11 = c0386c9.f4226f;
                    if (c0386c11 != null) {
                        if (c0387d == c0387d23) {
                            c0387d12 = c0387d16;
                            c0385b = c0385b2;
                            c0378c.f(c0386c9.i, c0386c11.i, i33, 6);
                        } else {
                            c0385b = c0385b2;
                            c0387d12 = c0387d16;
                            c0378c.f(c0386c9.i, c0386c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0378c.e(c0386c9.i, c0386c9.f4226f.i, i33, (c0387d == c0387d23 && z3 && c0387d.f4246S[i]) ? 5 : i31);
                    } else {
                        c0385b = c0385b2;
                        c0387d12 = c0387d16;
                    }
                    C0386c[] c0386cArr4 = c0387d.f4244Q;
                    if (z9) {
                        if (c0387d.f4266g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0378c.f(c0386cArr4[i3 + 1].i, c0386cArr4[i3].i, 0, 5);
                        }
                        c0378c.f(c0386cArr4[i3].i, c0386cArr[i3].i, i14, 8);
                    }
                    C0386c c0386c12 = c0386cArr4[i3 + 1].f4226f;
                    if (c0386c12 != null) {
                        c0387d13 = c0386c12.f4225d;
                        C0386c c0386c13 = c0387d13.f4244Q[i3].f4226f;
                        if (c0386c13 != null) {
                        }
                    }
                    c0387d13 = null;
                    if (c0387d13 != null) {
                        c0387d = c0387d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0387d25 = c0387d11;
                    i2 = i32;
                    c0385bArr = c0385bArr3;
                    c0387d16 = c0387d12;
                    c0385b2 = c0385b;
                }
                C0385b c0385b3 = c0385b2;
                C0387d c0387d26 = c0387d25;
                C0387d c0387d27 = c0387d16;
                i5 = i2;
                c0385bArr2 = c0385bArr;
                if (c0387d24 != null) {
                    int i34 = i3 + 1;
                    if (c0387d22.f4244Q[i34].f4226f != null) {
                        C0386c c0386c14 = c0387d24.f4244Q[i34];
                        if (c0387d24.f4281p0[i] == 3 && c0387d24.f4285t[i] == 0 && !z3) {
                            C0386c c0386c15 = c0386c14.f4226f;
                            if (c0386c15.f4225d == c0388e2) {
                                c0378c.e(c0386c14.i, c0386c15.i, -c0386c14.e(), 5);
                                c0378c.g(c0386c14.i, c0387d22.f4244Q[i34].f4226f.i, -c0386c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0381f c0381f6 = c0386cArr[i35].i;
                                    C0386c c0386c16 = c0387d22.f4244Q[i35];
                                    c0378c.f(c0381f6, c0386c16.i, c0386c16.e(), 8);
                                }
                                arrayList2 = c0385b3.f4214h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0385b3.f4218n || c0385b3.f4220p) ? f2 : c0385b3.j;
                                    C0387d c0387d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0387d c0387d29 = (C0387d) arrayList2.get(i12);
                                        float f8 = c0387d29.f4272k0[i];
                                        C0386c[] c0386cArr5 = c0387d29.f4244Q;
                                        if (f8 < 0.0f) {
                                            if (c0385b3.f4220p) {
                                                C0381f c0381f7 = c0386cArr5[i3 + 1].i;
                                                C0381f c0381f8 = c0386cArr5[i3].i;
                                                z6 = false;
                                                c0378c.e(c0381f7, c0381f8, 0, 4);
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
                                            C0381f c0381f9 = c0386cArr5[i3 + 1].i;
                                            C0381f c0381f10 = c0386cArr5[i3].i;
                                            z6 = false;
                                            c0378c.e(c0381f9, c0381f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0387d28 != null) {
                                                C0386c[] c0386cArr6 = c0387d28.f4244Q;
                                                C0381f c0381f11 = c0386cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0381f c0381f12 = c0386cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0381f c0381f13 = c0386cArr5[i3].i;
                                                C0381f c0381f14 = c0386cArr5[i36].i;
                                                i13 = size;
                                                C0377b l2 = c0378c.l();
                                                c0387d10 = c0387d29;
                                                l2.f4110b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.f4112d.g(c0381f11, 1.0f);
                                                    l2.f4112d.g(c0381f12, -1.0f);
                                                    l2.f4112d.g(c0381f14, 1.0f);
                                                    l2.f4112d.g(c0381f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.f4112d.g(c0381f11, 1.0f);
                                                        l2.f4112d.g(c0381f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.f4112d.g(c0381f13, 1.0f);
                                                        l2.f4112d.g(c0381f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.f4112d.g(c0381f11, 1.0f);
                                                        l2.f4112d.g(c0381f12, -1.0f);
                                                        l2.f4112d.g(c0381f14, f9);
                                                        l2.f4112d.g(c0381f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0378c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0387d10 = c0387d29;
                                            }
                                            f7 = f3;
                                            c0387d28 = c0387d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0387d23 == null && (c0387d23 == c0387d24 || z3)) {
                                    C0386c c0386c17 = c0387d27.f4244Q[i3];
                                    int i37 = i3 + 1;
                                    C0386c c0386c18 = c0387d22.f4244Q[i37];
                                    C0386c c0386c19 = c0386c17.f4226f;
                                    C0381f c0381f15 = c0386c19 != null ? c0386c19.i : null;
                                    C0386c c0386c20 = c0386c18.f4226f;
                                    C0381f c0381f16 = c0386c20 != null ? c0386c20.i : null;
                                    C0386c c0386c21 = c0387d23.f4244Q[i3];
                                    if (c0387d24 != null) {
                                        c0386c18 = c0387d24.f4244Q[i37];
                                    }
                                    if (c0381f15 == null || c0381f16 == null) {
                                        c0387d2 = c0387d24;
                                        i6 = i4;
                                    } else {
                                        c0387d2 = c0387d24;
                                        i6 = i4;
                                        c0378c.b(c0386c21.i, c0381f15, c0386c21.e(), i == 0 ? c0387d26.f4261d0 : c0387d26.f4262e0, c0381f16, c0386c18.i, c0386c18.e(), 7);
                                    }
                                } else {
                                    c0387d2 = c0387d24;
                                    i6 = i4;
                                    if (z4 || c0387d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0387d23 != null) {
                                            int i39 = c0385b3.j;
                                            boolean z16 = i39 <= 0 && c0385b3.i == i39;
                                            C0387d c0387d30 = c0387d23;
                                            c0387d3 = c0387d30;
                                            while (c0387d3 != null) {
                                                C0387d c0387d31 = c0387d3.f4276m0[i];
                                                while (c0387d31 != null && c0387d31.f4266g0 == i38) {
                                                    c0387d31 = c0387d31.f4276m0[i];
                                                }
                                                if (c0387d3 == c0387d23 || c0387d3 == c0387d2 || c0387d31 == null) {
                                                    c0387d4 = c0387d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0387d c0387d32 = c0387d31 == c0387d2 ? null : c0387d31;
                                                    C0386c[] c0386cArr7 = c0387d3.f4244Q;
                                                    C0386c c0386c22 = c0386cArr7[i3];
                                                    C0381f c0381f17 = c0386c22.i;
                                                    int i40 = i3 + 1;
                                                    C0381f c0381f18 = c0387d30.f4244Q[i40].i;
                                                    int e2 = c0386c22.e();
                                                    int e3 = c0386cArr7[i40].e();
                                                    if (c0387d32 != null) {
                                                        c0386c3 = c0387d32.f4244Q[i3];
                                                        c0381f = c0386c3.i;
                                                        c0387d5 = c0387d32;
                                                        C0386c c0386c23 = c0386c3.f4226f;
                                                        c0381f2 = c0386c23 != null ? c0386c23.i : null;
                                                    } else {
                                                        c0387d5 = c0387d32;
                                                        C0386c c0386c24 = c0387d2.f4244Q[i3];
                                                        c0381f = c0386c24 != null ? c0386c24.i : null;
                                                        c0381f2 = c0386cArr7[i40].i;
                                                        c0386c3 = c0386c24;
                                                    }
                                                    int e4 = c0386c3 != null ? c0386c3.e() + e3 : e3;
                                                    int e5 = c0387d30.f4244Q[i40].e() + e2;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0381f17 == null || c0381f18 == null || c0381f == null || c0381f2 == null) {
                                                        c0387d4 = c0387d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0387d4 = c0387d30;
                                                        int i42 = e4;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0378c.b(c0381f17, c0381f18, e5, 0.5f, c0381f, c0381f2, i42, i41);
                                                    }
                                                    c0387d31 = c0387d5;
                                                }
                                                c0387d30 = c0387d3.f4266g0 != i10 ? c0387d3 : c0387d4;
                                                c0387d3 = c0387d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0386c c0386c25 = c0387d23.f4244Q[i3];
                                            c0386c = c0387d27.f4244Q[i3].f4226f;
                                            int i43 = i3 + 1;
                                            C0386c c0386c26 = c0387d2.f4244Q[i43];
                                            c0386c2 = c0387d22.f4244Q[i43].f4226f;
                                            if (c0386c != null) {
                                                if (c0387d23 != c0387d2) {
                                                    c0378c.e(c0386c25.i, c0386c.i, c0386c25.e(), 5);
                                                } else if (c0386c2 != null) {
                                                    i8 = 5;
                                                    c0378c.b(c0386c25.i, c0386c.i, c0386c25.e(), 0.5f, c0386c26.i, c0386c2.i, c0386c26.e(), 5);
                                                    if (c0386c2 != null && c0387d23 != c0387d2) {
                                                        c0378c.e(c0386c26.i, c0386c2.i, -c0386c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0387d23 != null && c0387d23 != c0387d2) {
                                                        C0386c[] c0386cArr8 = c0387d23.f4244Q;
                                                        c0386c5 = c0386cArr8[i3];
                                                        c0387d9 = c0387d2 != null ? c0387d23 : c0387d2;
                                                        i11 = i3 + 1;
                                                        c0386cArr2 = c0387d9.f4244Q;
                                                        c0386c6 = c0386cArr2[i11];
                                                        C0386c c0386c27 = c0386c5.f4226f;
                                                        c0381f4 = c0386c27 == null ? c0386c27.i : null;
                                                        C0386c c0386c28 = c0386c6.f4226f;
                                                        c0381f5 = c0386c28 == null ? c0386c28.i : null;
                                                        if (c0387d22 != c0387d9) {
                                                            C0386c c0386c29 = c0387d22.f4244Q[i11].f4226f;
                                                            c0381f5 = c0386c29 != null ? c0386c29.i : null;
                                                        }
                                                        if (c0387d23 == c0387d9) {
                                                            c0386c6 = c0386cArr8[i11];
                                                        }
                                                        if (c0381f4 != null && c0381f5 != null) {
                                                            c0378c.b(c0386c5.i, c0381f4, c0386c5.e(), 0.5f, c0381f5, c0386c6.i, c0386cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0386c2 != null) {
                                                c0378c.e(c0386c26.i, c0386c2.i, -c0386c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0386c[] c0386cArr82 = c0387d23.f4244Q;
                                            c0386c5 = c0386cArr82[i3];
                                            if (c0387d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0386cArr2 = c0387d9.f4244Q;
                                            c0386c6 = c0386cArr2[i11];
                                            C0386c c0386c272 = c0386c5.f4226f;
                                            if (c0386c272 == null) {
                                            }
                                            C0386c c0386c282 = c0386c6.f4226f;
                                            if (c0386c282 == null) {
                                            }
                                            if (c0387d22 != c0387d9) {
                                            }
                                            if (c0387d23 == c0387d9) {
                                            }
                                            if (c0381f4 != null) {
                                                c0378c.b(c0386c5.i, c0381f4, c0386c5.e(), 0.5f, c0381f5, c0386c6.i, c0386cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0385b3.j;
                                        boolean z17 = i44 > 0 && c0385b3.i == i44;
                                        C0387d c0387d33 = c0387d23;
                                        for (C0387d c0387d34 = c0387d33; c0387d34 != null; c0387d34 = c0387d7) {
                                            C0387d c0387d35 = c0387d34.f4276m0[i];
                                            while (c0387d35 != null && c0387d35.f4266g0 == 8) {
                                                c0387d35 = c0387d35.f4276m0[i];
                                            }
                                            if (c0387d35 != null || c0387d34 == c0387d2) {
                                                C0386c[] c0386cArr9 = c0387d34.f4244Q;
                                                C0386c c0386c30 = c0386cArr9[i3];
                                                C0381f c0381f19 = c0386c30.i;
                                                C0386c c0386c31 = c0386c30.f4226f;
                                                C0381f c0381f20 = c0386c31 != null ? c0386c31.i : null;
                                                if (c0387d33 != c0387d34) {
                                                    c0381f20 = c0387d33.f4244Q[i3 + 1].i;
                                                } else if (c0387d34 == c0387d23) {
                                                    C0386c c0386c32 = c0387d27.f4244Q[i3].f4226f;
                                                    c0381f20 = c0386c32 != null ? c0386c32.i : null;
                                                }
                                                int e6 = c0386c30.e();
                                                int i45 = i3 + 1;
                                                int e7 = c0386cArr9[i45].e();
                                                if (c0387d35 != null) {
                                                    c0386c4 = c0387d35.f4244Q[i3];
                                                    c0381f3 = c0386c4.i;
                                                } else {
                                                    c0386c4 = c0387d22.f4244Q[i45].f4226f;
                                                    c0381f3 = c0386c4 != null ? c0386c4.i : null;
                                                }
                                                C0381f c0381f21 = c0386cArr9[i45].i;
                                                if (c0386c4 != null) {
                                                    e7 = c0386c4.e() + e7;
                                                }
                                                int e8 = c0387d33.f4244Q[i45].e() + e6;
                                                if (c0381f19 != null && c0381f20 != null && c0381f3 != null && c0381f21 != null) {
                                                    if (c0387d34 == c0387d23) {
                                                        e8 = c0387d23.f4244Q[i3].e();
                                                    }
                                                    if (c0387d34 == c0387d2) {
                                                        e7 = c0387d2.f4244Q[i45].e();
                                                    }
                                                    C0381f c0381f22 = c0381f20;
                                                    int i46 = e8;
                                                    C0381f c0381f23 = c0381f3;
                                                    c0387d6 = c0387d33;
                                                    int i47 = e7;
                                                    c0387d7 = c0387d35;
                                                    c0387d8 = c0387d34;
                                                    c0378c.b(c0381f19, c0381f22, i46, 0.5f, c0381f23, c0381f21, i47, z17 ? 8 : 5);
                                                    c0387d33 = c0387d8.f4266g0 == 8 ? c0387d8 : c0387d6;
                                                }
                                            }
                                            c0387d7 = c0387d35;
                                            c0387d6 = c0387d33;
                                            c0387d8 = c0387d34;
                                            if (c0387d8.f4266g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0386c[] c0386cArr822 = c0387d23.f4244Q;
                                c0386c5 = c0386cArr822[i3];
                                if (c0387d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0386cArr2 = c0387d9.f4244Q;
                                c0386c6 = c0386cArr2[i11];
                                C0386c c0386c2722 = c0386c5.f4226f;
                                if (c0386c2722 == null) {
                                }
                                C0386c c0386c2822 = c0386c6.f4226f;
                                if (c0386c2822 == null) {
                                }
                                if (c0387d22 != c0387d9) {
                                }
                                if (c0387d23 == c0387d9) {
                                }
                                if (c0381f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0386c c0386c33 = c0386c14.f4226f;
                            if (c0386c33.f4225d == c0388e2) {
                                c0378c.e(c0386c14.i, c0386c33.i, -c0386c14.e(), 4);
                            }
                        }
                        c0378c.g(c0386c14.i, c0387d22.f4244Q[i34].f4226f.i, -c0386c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0385b3.f4214h;
                        if (arrayList2 != null) {
                            if (c0385b3.f4218n) {
                            }
                            C0387d c0387d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0387d23 == null) {
                        }
                        c0387d2 = c0387d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0385b3.j;
                            if (i392 <= 0) {
                            }
                            C0387d c0387d302 = c0387d23;
                            c0387d3 = c0387d302;
                            while (c0387d3 != null) {
                            }
                            i7 = i6;
                            C0386c c0386c252 = c0387d23.f4244Q[i3];
                            c0386c = c0387d27.f4244Q[i3].f4226f;
                            int i432 = i3 + 1;
                            C0386c c0386c262 = c0387d2.f4244Q[i432];
                            c0386c2 = c0387d22.f4244Q[i432].f4226f;
                            if (c0386c != null) {
                            }
                            i8 = 5;
                            if (c0386c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0386c[] c0386cArr8222 = c0387d23.f4244Q;
                            c0386c5 = c0386cArr8222[i3];
                            if (c0387d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0386cArr2 = c0387d9.f4244Q;
                            c0386c6 = c0386cArr2[i11];
                            C0386c c0386c27222 = c0386c5.f4226f;
                            if (c0386c27222 == null) {
                            }
                            C0386c c0386c28222 = c0386c6.f4226f;
                            if (c0386c28222 == null) {
                            }
                            if (c0387d22 != c0387d9) {
                            }
                            if (c0387d23 == c0387d9) {
                            }
                            if (c0381f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0386c[] c0386cArr82222 = c0387d23.f4244Q;
                        c0386c5 = c0386cArr82222[i3];
                        if (c0387d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0386cArr2 = c0387d9.f4244Q;
                        c0386c6 = c0386cArr2[i11];
                        C0386c c0386c272222 = c0386c5.f4226f;
                        if (c0386c272222 == null) {
                        }
                        C0386c c0386c282222 = c0386c6.f4226f;
                        if (c0386c282222 == null) {
                        }
                        if (c0387d22 != c0387d9) {
                        }
                        if (c0387d23 == c0387d9) {
                        }
                        if (c0381f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0385b3.f4214h;
                if (arrayList2 != null) {
                }
                if (c0387d23 == null) {
                }
                c0387d2 = c0387d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0386c[] c0386cArr822222 = c0387d23.f4244Q;
                c0386c5 = c0386cArr822222[i3];
                if (c0387d2 != null) {
                }
                i11 = i3 + 1;
                c0386cArr2 = c0387d9.f4244Q;
                c0386c6 = c0386cArr2[i11];
                C0386c c0386c2722222 = c0386c5.f4226f;
                if (c0386c2722222 == null) {
                }
                C0386c c0386c2822222 = c0386c6.f4226f;
                if (c0386c2822222 == null) {
                }
                if (c0387d22 != c0387d9) {
                }
                if (c0387d23 == c0387d9) {
                }
                if (c0381f4 != null) {
                }
            } else {
                i5 = i2;
                c0385bArr2 = c0385bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0388e2 = c0388e;
            arrayList4 = arrayList;
            i2 = i5;
            c0385bArr = c0385bArr2;
        }
    }

    public static void b(C0388e c0388e, C0378c c0378c, C0387d c0387d) {
        c0387d.f4279o = -1;
        c0387d.f4280p = -1;
        int i = c0388e.f4281p0[0];
        int[] iArr = c0387d.f4281p0;
        if (i != 2 && iArr[0] == 4) {
            C0386c c0386c = c0387d.f4236I;
            int i2 = c0386c.f4227g;
            int q2 = c0388e.q();
            C0386c c0386c2 = c0387d.f4238K;
            int i3 = q2 - c0386c2.f4227g;
            c0386c.i = c0378c.k(c0386c);
            c0386c2.i = c0378c.k(c0386c2);
            c0378c.d(c0386c.i, i2);
            c0378c.d(c0386c2.i, i3);
            c0387d.f4279o = 2;
            c0387d.f4252Y = i2;
            int i4 = i3 - i2;
            c0387d.f4248U = i4;
            int i5 = c0387d.f4257b0;
            if (i4 < i5) {
                c0387d.f4248U = i5;
            }
        }
        if (c0388e.f4281p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0386c c0386c3 = c0387d.f4237J;
        int i6 = c0386c3.f4227g;
        int k2 = c0388e.k();
        C0386c c0386c4 = c0387d.f4239L;
        int i7 = k2 - c0386c4.f4227g;
        c0386c3.i = c0378c.k(c0386c3);
        c0386c4.i = c0378c.k(c0386c4);
        c0378c.d(c0386c3.i, i6);
        c0378c.d(c0386c4.i, i7);
        if (c0387d.f4255a0 > 0 || c0387d.f4266g0 == 8) {
            C0386c c0386c5 = c0387d.f4240M;
            C0381f k3 = c0378c.k(c0386c5);
            c0386c5.i = k3;
            c0378c.d(k3, c0387d.f4255a0 + i6);
        }
        c0387d.f4280p = 2;
        c0387d.f4253Z = i6;
        int i8 = i7 - i6;
        c0387d.f4249V = i8;
        int i9 = c0387d.f4259c0;
        if (i8 < i9) {
            c0387d.f4249V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
