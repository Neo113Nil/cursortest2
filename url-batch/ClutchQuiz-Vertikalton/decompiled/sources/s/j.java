package s;

import java.util.ArrayList;
import q.C0314b;
import q.C0315c;
import q.C0318f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f3634a = new boolean[3];

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
    public static void a(C0341e c0341e, C0315c c0315c, ArrayList arrayList, int i) {
        int i2;
        C0338b[] c0338bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        C0340d c0340d;
        boolean z4;
        boolean z5;
        C0339c[] c0339cArr;
        int i5;
        C0338b[] c0338bArr2;
        ArrayList arrayList2;
        C0340d c0340d2;
        int i6;
        C0340d c0340d3;
        int i7;
        C0339c c0339c;
        C0339c c0339c2;
        int i8;
        C0340d c0340d4;
        int i9;
        int i10;
        C0340d c0340d5;
        C0318f c0318f;
        C0318f c0318f2;
        C0339c c0339c3;
        C0339c c0339c4;
        C0318f c0318f3;
        C0340d c0340d6;
        C0340d c0340d7;
        C0340d c0340d8;
        C0339c c0339c5;
        C0340d c0340d9;
        int i11;
        C0339c[] c0339cArr2;
        C0339c c0339c6;
        C0318f c0318f4;
        C0318f c0318f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        C0340d c0340d10;
        boolean z6;
        C0340d c0340d11;
        C0338b c0338b;
        C0340d c0340d12;
        C0340d c0340d13;
        int i14;
        int i15;
        C0340d c0340d14;
        C0339c c0339c7;
        C0340d c0340d15;
        C0341e c0341e2 = c0341e;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = c0341e2.f3578z0;
            c0338bArr = c0341e2.f3562C0;
            i3 = 0;
        } else {
            i2 = c0341e2.f3560A0;
            c0338bArr = c0341e2.f3561B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0338b c0338b2 = c0338bArr[i17];
            boolean z7 = c0338b2.f3490q;
            C0340d c0340d16 = c0338b2.f3477a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0338b2.f3485l;
                int i22 = i21 * 2;
                C0340d c0340d17 = c0340d16;
                C0340d c0340d18 = c0340d17;
                boolean z8 = false;
                while (!z8) {
                    c0338b2.i += i19;
                    c0340d17.m0[i21] = null;
                    c0340d17.f3542l0[i21] = null;
                    int i23 = c0340d17.f3534g0;
                    C0339c[] c0339cArr3 = c0340d17.f3512Q;
                    if (i23 != i20) {
                        c0340d17.j(i21);
                        c0339cArr3[i22].e();
                        int i24 = i22 + 1;
                        c0339cArr3[i24].e();
                        c0339cArr3[i22].e();
                        c0339cArr3[i24].e();
                        if (c0338b2.f3478b == null) {
                            c0338b2.f3478b = c0340d17;
                        }
                        c0338b2.d = c0340d17;
                        int i25 = c0340d17.f3549p0[i21];
                        if (i25 == i18) {
                            int i26 = c0340d17.f3553t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0338b2.f3483j++;
                                float f4 = c0340d17.f3540k0[i21];
                                if (f4 > 0.0f) {
                                    c0338b2.f3484k += f4;
                                }
                                i15 = i17;
                                if (c0340d17.f3534g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0338b2.f3487n = true;
                                    } else {
                                        c0338b2.f3488o = true;
                                    }
                                    if (c0338b2.h == null) {
                                        c0338b2.h = new ArrayList();
                                    }
                                    c0338b2.h.add(c0340d17);
                                }
                                if (c0338b2.f3481f == null) {
                                    c0338b2.f3481f = c0340d17;
                                }
                                C0340d c0340d19 = c0338b2.f3482g;
                                if (c0340d19 != null) {
                                    c0340d19.f3542l0[i21] = c0340d17;
                                }
                                c0338b2.f3482g = c0340d17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (c0340d17.f3551r == 0 && c0340d17.f3554u == 0) {
                                    int i27 = c0340d17.f3555v;
                                }
                            } else if (c0340d17.f3552s == 0 && c0340d17.f3557x == 0) {
                                int i28 = c0340d17.f3558y;
                            }
                            c0340d14 = c0340d18;
                            if (c0340d14 != c0340d17) {
                                c0340d14.m0[i21] = c0340d17;
                            }
                            c0339c7 = c0339cArr3[i22 + 1].f3495f;
                            if (c0339c7 != null) {
                                c0340d15 = c0339c7.d;
                                C0339c c0339c8 = c0340d15.f3512Q[i22].f3495f;
                                if (c0339c8 != null) {
                                }
                            }
                            c0340d15 = null;
                            if (c0340d15 != null) {
                                c0340d15 = c0340d17;
                                z8 = true;
                            }
                            c0340d18 = c0340d17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            c0340d17 = c0340d15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    c0340d14 = c0340d18;
                    if (c0340d14 != c0340d17) {
                    }
                    c0339c7 = c0339cArr3[i22 + 1].f3495f;
                    if (c0339c7 != null) {
                    }
                    c0340d15 = null;
                    if (c0340d15 != null) {
                    }
                    c0340d18 = c0340d17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    c0340d17 = c0340d15;
                    i18 = 3;
                }
                i4 = i17;
                C0340d c0340d20 = c0338b2.f3478b;
                if (c0340d20 != null) {
                    c0340d20.f3512Q[i22].e();
                }
                C0340d c0340d21 = c0338b2.d;
                if (c0340d21 != null) {
                    c0340d21.f3512Q[i22 + 1].e();
                }
                c0338b2.f3479c = c0340d17;
                if (i21 == 0 && c0338b2.f3486m) {
                    c0338b2.f3480e = c0340d17;
                } else {
                    c0338b2.f3480e = c0340d16;
                }
                c0338b2.f3489p = c0338b2.f3488o && c0338b2.f3487n;
                z2 = true;
            }
            c0338b2.f3490q = z2;
            if (arrayList4 == null || arrayList4.contains(c0340d16)) {
                C0340d c0340d22 = c0338b2.f3479c;
                C0340d c0340d23 = c0338b2.f3478b;
                C0340d c0340d24 = c0338b2.d;
                C0340d c0340d25 = c0338b2.f3480e;
                float f5 = c0338b2.f3484k;
                boolean z9 = c0341e2.f3549p0[i] == 2;
                if (i == 0) {
                    int i29 = c0340d25.f3536i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0340d = c0340d16;
                    z4 = z10;
                } else {
                    int i30 = c0340d25.f3538j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    c0340d = c0340d16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0339cArr = c0341e2.f3512Q;
                    if (z13) {
                        break;
                    }
                    C0339c c0339c9 = c0340d.f3512Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = c0339c9.e();
                    boolean z14 = z13;
                    int[] iArr = c0340d.f3549p0;
                    int i32 = i2;
                    C0338b[] c0338bArr3 = c0338bArr;
                    boolean z15 = iArr[i] == 3 && c0340d.f3553t[i] == 0;
                    C0339c c0339c10 = c0339c9.f3495f;
                    if (c0339c10 != null && c0340d != c0340d16) {
                        e2 = c0339c10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || c0340d == c0340d16 || c0340d == c0340d23) {
                        c0340d11 = c0340d25;
                    } else {
                        c0340d11 = c0340d25;
                        i31 = 8;
                    }
                    C0339c c0339c11 = c0339c9.f3495f;
                    if (c0339c11 != null) {
                        if (c0340d == c0340d23) {
                            c0340d12 = c0340d16;
                            c0338b = c0338b2;
                            c0315c.f(c0339c9.i, c0339c11.i, i33, 6);
                        } else {
                            c0338b = c0338b2;
                            c0340d12 = c0340d16;
                            c0315c.f(c0339c9.i, c0339c11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0315c.e(c0339c9.i, c0339c9.f3495f.i, i33, (c0340d == c0340d23 && z3 && c0340d.f3514S[i]) ? 5 : i31);
                    } else {
                        c0338b = c0338b2;
                        c0340d12 = c0340d16;
                    }
                    C0339c[] c0339cArr4 = c0340d.f3512Q;
                    if (z9) {
                        if (c0340d.f3534g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0315c.f(c0339cArr4[i3 + 1].i, c0339cArr4[i3].i, 0, 5);
                        }
                        c0315c.f(c0339cArr4[i3].i, c0339cArr[i3].i, i14, 8);
                    }
                    C0339c c0339c12 = c0339cArr4[i3 + 1].f3495f;
                    if (c0339c12 != null) {
                        c0340d13 = c0339c12.d;
                        C0339c c0339c13 = c0340d13.f3512Q[i3].f3495f;
                        if (c0339c13 != null) {
                        }
                    }
                    c0340d13 = null;
                    if (c0340d13 != null) {
                        c0340d = c0340d13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0340d25 = c0340d11;
                    i2 = i32;
                    c0338bArr = c0338bArr3;
                    c0340d16 = c0340d12;
                    c0338b2 = c0338b;
                }
                C0338b c0338b3 = c0338b2;
                C0340d c0340d26 = c0340d25;
                C0340d c0340d27 = c0340d16;
                i5 = i2;
                c0338bArr2 = c0338bArr;
                if (c0340d24 != null) {
                    int i34 = i3 + 1;
                    if (c0340d22.f3512Q[i34].f3495f != null) {
                        C0339c c0339c14 = c0340d24.f3512Q[i34];
                        if (c0340d24.f3549p0[i] == 3 && c0340d24.f3553t[i] == 0 && !z3) {
                            C0339c c0339c15 = c0339c14.f3495f;
                            if (c0339c15.d == c0341e2) {
                                c0315c.e(c0339c14.i, c0339c15.i, -c0339c14.e(), 5);
                                c0315c.g(c0339c14.i, c0340d22.f3512Q[i34].f3495f.i, -c0339c14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0318f c0318f6 = c0339cArr[i35].i;
                                    C0339c c0339c16 = c0340d22.f3512Q[i35];
                                    c0315c.f(c0318f6, c0339c16.i, c0339c16.e(), 8);
                                }
                                arrayList2 = c0338b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0338b3.f3487n || c0338b3.f3489p) ? f2 : c0338b3.f3483j;
                                    C0340d c0340d28 = null;
                                    float f7 = 0.0f;
                                    i12 = 0;
                                    while (i12 < size) {
                                        C0340d c0340d29 = (C0340d) arrayList2.get(i12);
                                        float f8 = c0340d29.f3540k0[i];
                                        C0339c[] c0339cArr5 = c0340d29.f3512Q;
                                        if (f8 < 0.0f) {
                                            if (c0338b3.f3489p) {
                                                C0318f c0318f7 = c0339cArr5[i3 + 1].i;
                                                C0318f c0318f8 = c0339cArr5[i3].i;
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
                                            C0318f c0318f9 = c0339cArr5[i3 + 1].i;
                                            C0318f c0318f10 = c0339cArr5[i3].i;
                                            z6 = false;
                                            c0315c.e(c0318f9, c0318f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c0340d28 != null) {
                                                C0339c[] c0339cArr6 = c0340d28.f3512Q;
                                                C0318f c0318f11 = c0339cArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0318f c0318f12 = c0339cArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0318f c0318f13 = c0339cArr5[i3].i;
                                                C0318f c0318f14 = c0339cArr5[i36].i;
                                                i13 = size;
                                                C0314b l2 = c0315c.l();
                                                c0340d10 = c0340d29;
                                                l2.f3407b = 0.0f;
                                                if (f6 == 0.0f || f7 == f8) {
                                                    f3 = f8;
                                                    l2.d.g(c0318f11, 1.0f);
                                                    l2.d.g(c0318f12, -1.0f);
                                                    l2.d.g(c0318f14, 1.0f);
                                                    l2.d.g(c0318f13, -1.0f);
                                                } else {
                                                    if (f7 == 0.0f) {
                                                        l2.d.g(c0318f11, 1.0f);
                                                        l2.d.g(c0318f12, -1.0f);
                                                    } else if (f8 == 0.0f) {
                                                        l2.d.g(c0318f13, 1.0f);
                                                        l2.d.g(c0318f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.d.g(c0318f11, 1.0f);
                                                        l2.d.g(c0318f12, -1.0f);
                                                        l2.d.g(c0318f14, f9);
                                                        l2.d.g(c0318f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0315c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                c0340d10 = c0340d29;
                                            }
                                            f7 = f3;
                                            c0340d28 = c0340d10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c0340d23 == null && (c0340d23 == c0340d24 || z3)) {
                                    C0339c c0339c17 = c0340d27.f3512Q[i3];
                                    int i37 = i3 + 1;
                                    C0339c c0339c18 = c0340d22.f3512Q[i37];
                                    C0339c c0339c19 = c0339c17.f3495f;
                                    C0318f c0318f15 = c0339c19 != null ? c0339c19.i : null;
                                    C0339c c0339c20 = c0339c18.f3495f;
                                    C0318f c0318f16 = c0339c20 != null ? c0339c20.i : null;
                                    C0339c c0339c21 = c0340d23.f3512Q[i3];
                                    if (c0340d24 != null) {
                                        c0339c18 = c0340d24.f3512Q[i37];
                                    }
                                    if (c0318f15 == null || c0318f16 == null) {
                                        c0340d2 = c0340d24;
                                        i6 = i4;
                                    } else {
                                        c0340d2 = c0340d24;
                                        i6 = i4;
                                        c0315c.b(c0339c21.i, c0318f15, c0339c21.e(), i == 0 ? c0340d26.f3528d0 : c0340d26.f3530e0, c0318f16, c0339c18.i, c0339c18.e(), 7);
                                    }
                                } else {
                                    c0340d2 = c0340d24;
                                    i6 = i4;
                                    if (z4 || c0340d23 == null) {
                                        int i38 = 8;
                                        if (z5 && c0340d23 != null) {
                                            int i39 = c0338b3.f3483j;
                                            boolean z16 = i39 <= 0 && c0338b3.i == i39;
                                            C0340d c0340d30 = c0340d23;
                                            c0340d3 = c0340d30;
                                            while (c0340d3 != null) {
                                                C0340d c0340d31 = c0340d3.m0[i];
                                                while (c0340d31 != null && c0340d31.f3534g0 == i38) {
                                                    c0340d31 = c0340d31.m0[i];
                                                }
                                                if (c0340d3 == c0340d23 || c0340d3 == c0340d2 || c0340d31 == null) {
                                                    c0340d4 = c0340d30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    C0340d c0340d32 = c0340d31 == c0340d2 ? null : c0340d31;
                                                    C0339c[] c0339cArr7 = c0340d3.f3512Q;
                                                    C0339c c0339c22 = c0339cArr7[i3];
                                                    C0318f c0318f17 = c0339c22.i;
                                                    int i40 = i3 + 1;
                                                    C0318f c0318f18 = c0340d30.f3512Q[i40].i;
                                                    int e3 = c0339c22.e();
                                                    int e4 = c0339cArr7[i40].e();
                                                    if (c0340d32 != null) {
                                                        c0339c3 = c0340d32.f3512Q[i3];
                                                        c0318f = c0339c3.i;
                                                        c0340d5 = c0340d32;
                                                        C0339c c0339c23 = c0339c3.f3495f;
                                                        c0318f2 = c0339c23 != null ? c0339c23.i : null;
                                                    } else {
                                                        c0340d5 = c0340d32;
                                                        C0339c c0339c24 = c0340d2.f3512Q[i3];
                                                        c0318f = c0339c24 != null ? c0339c24.i : null;
                                                        c0318f2 = c0339cArr7[i40].i;
                                                        c0339c3 = c0339c24;
                                                    }
                                                    int e5 = c0339c3 != null ? c0339c3.e() + e4 : e4;
                                                    int e6 = c0340d30.f3512Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0318f17 == null || c0318f18 == null || c0318f == null || c0318f2 == null) {
                                                        c0340d4 = c0340d30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        c0340d4 = c0340d30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0315c.b(c0318f17, c0318f18, e6, 0.5f, c0318f, c0318f2, i42, i41);
                                                    }
                                                    c0340d31 = c0340d5;
                                                }
                                                c0340d30 = c0340d3.f3534g0 != i10 ? c0340d3 : c0340d4;
                                                c0340d3 = c0340d31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            C0339c c0339c25 = c0340d23.f3512Q[i3];
                                            c0339c = c0340d27.f3512Q[i3].f3495f;
                                            int i43 = i3 + 1;
                                            C0339c c0339c26 = c0340d2.f3512Q[i43];
                                            c0339c2 = c0340d22.f3512Q[i43].f3495f;
                                            if (c0339c != null) {
                                                if (c0340d23 != c0340d2) {
                                                    c0315c.e(c0339c25.i, c0339c.i, c0339c25.e(), 5);
                                                } else if (c0339c2 != null) {
                                                    i8 = 5;
                                                    c0315c.b(c0339c25.i, c0339c.i, c0339c25.e(), 0.5f, c0339c26.i, c0339c2.i, c0339c26.e(), 5);
                                                    if (c0339c2 != null && c0340d23 != c0340d2) {
                                                        c0315c.e(c0339c26.i, c0339c2.i, -c0339c26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && c0340d23 != null && c0340d23 != c0340d2) {
                                                        C0339c[] c0339cArr8 = c0340d23.f3512Q;
                                                        c0339c5 = c0339cArr8[i3];
                                                        c0340d9 = c0340d2 != null ? c0340d23 : c0340d2;
                                                        i11 = i3 + 1;
                                                        c0339cArr2 = c0340d9.f3512Q;
                                                        c0339c6 = c0339cArr2[i11];
                                                        C0339c c0339c27 = c0339c5.f3495f;
                                                        c0318f4 = c0339c27 == null ? c0339c27.i : null;
                                                        C0339c c0339c28 = c0339c6.f3495f;
                                                        c0318f5 = c0339c28 == null ? c0339c28.i : null;
                                                        if (c0340d22 != c0340d9) {
                                                            C0339c c0339c29 = c0340d22.f3512Q[i11].f3495f;
                                                            c0318f5 = c0339c29 != null ? c0339c29.i : null;
                                                        }
                                                        if (c0340d23 == c0340d9) {
                                                            c0339c6 = c0339cArr8[i11];
                                                        }
                                                        if (c0318f4 != null && c0318f5 != null) {
                                                            c0315c.b(c0339c5.i, c0318f4, c0339c5.e(), 0.5f, c0318f5, c0339c6.i, c0339cArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (c0339c2 != null) {
                                                c0315c.e(c0339c26.i, c0339c2.i, -c0339c26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            C0339c[] c0339cArr82 = c0340d23.f3512Q;
                                            c0339c5 = c0339cArr82[i3];
                                            if (c0340d2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            c0339cArr2 = c0340d9.f3512Q;
                                            c0339c6 = c0339cArr2[i11];
                                            C0339c c0339c272 = c0339c5.f3495f;
                                            if (c0339c272 == null) {
                                            }
                                            C0339c c0339c282 = c0339c6.f3495f;
                                            if (c0339c282 == null) {
                                            }
                                            if (c0340d22 != c0340d9) {
                                            }
                                            if (c0340d23 == c0340d9) {
                                            }
                                            if (c0318f4 != null) {
                                                c0315c.b(c0339c5.i, c0318f4, c0339c5.e(), 0.5f, c0318f5, c0339c6.i, c0339cArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0338b3.f3483j;
                                        boolean z17 = i44 > 0 && c0338b3.i == i44;
                                        C0340d c0340d33 = c0340d23;
                                        for (C0340d c0340d34 = c0340d33; c0340d34 != null; c0340d34 = c0340d7) {
                                            C0340d c0340d35 = c0340d34.m0[i];
                                            while (c0340d35 != null && c0340d35.f3534g0 == 8) {
                                                c0340d35 = c0340d35.m0[i];
                                            }
                                            if (c0340d35 != null || c0340d34 == c0340d2) {
                                                C0339c[] c0339cArr9 = c0340d34.f3512Q;
                                                C0339c c0339c30 = c0339cArr9[i3];
                                                C0318f c0318f19 = c0339c30.i;
                                                C0339c c0339c31 = c0339c30.f3495f;
                                                C0318f c0318f20 = c0339c31 != null ? c0339c31.i : null;
                                                if (c0340d33 != c0340d34) {
                                                    c0318f20 = c0340d33.f3512Q[i3 + 1].i;
                                                } else if (c0340d34 == c0340d23) {
                                                    C0339c c0339c32 = c0340d27.f3512Q[i3].f3495f;
                                                    c0318f20 = c0339c32 != null ? c0339c32.i : null;
                                                }
                                                int e7 = c0339c30.e();
                                                int i45 = i3 + 1;
                                                int e8 = c0339cArr9[i45].e();
                                                if (c0340d35 != null) {
                                                    c0339c4 = c0340d35.f3512Q[i3];
                                                    c0318f3 = c0339c4.i;
                                                } else {
                                                    c0339c4 = c0340d22.f3512Q[i45].f3495f;
                                                    c0318f3 = c0339c4 != null ? c0339c4.i : null;
                                                }
                                                C0318f c0318f21 = c0339cArr9[i45].i;
                                                if (c0339c4 != null) {
                                                    e8 = c0339c4.e() + e8;
                                                }
                                                int e9 = c0340d33.f3512Q[i45].e() + e7;
                                                if (c0318f19 != null && c0318f20 != null && c0318f3 != null && c0318f21 != null) {
                                                    if (c0340d34 == c0340d23) {
                                                        e9 = c0340d23.f3512Q[i3].e();
                                                    }
                                                    if (c0340d34 == c0340d2) {
                                                        e8 = c0340d2.f3512Q[i45].e();
                                                    }
                                                    C0318f c0318f22 = c0318f20;
                                                    int i46 = e9;
                                                    C0318f c0318f23 = c0318f3;
                                                    c0340d6 = c0340d33;
                                                    int i47 = e8;
                                                    c0340d7 = c0340d35;
                                                    c0340d8 = c0340d34;
                                                    c0315c.b(c0318f19, c0318f22, i46, 0.5f, c0318f23, c0318f21, i47, z17 ? 8 : 5);
                                                    c0340d33 = c0340d8.f3534g0 == 8 ? c0340d8 : c0340d6;
                                                }
                                            }
                                            c0340d7 = c0340d35;
                                            c0340d6 = c0340d33;
                                            c0340d8 = c0340d34;
                                            if (c0340d8.f3534g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                C0339c[] c0339cArr822 = c0340d23.f3512Q;
                                c0339c5 = c0339cArr822[i3];
                                if (c0340d2 != null) {
                                }
                                i11 = i3 + 1;
                                c0339cArr2 = c0340d9.f3512Q;
                                c0339c6 = c0339cArr2[i11];
                                C0339c c0339c2722 = c0339c5.f3495f;
                                if (c0339c2722 == null) {
                                }
                                C0339c c0339c2822 = c0339c6.f3495f;
                                if (c0339c2822 == null) {
                                }
                                if (c0340d22 != c0340d9) {
                                }
                                if (c0340d23 == c0340d9) {
                                }
                                if (c0318f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            C0339c c0339c33 = c0339c14.f3495f;
                            if (c0339c33.d == c0341e2) {
                                c0315c.e(c0339c14.i, c0339c33.i, -c0339c14.e(), 4);
                            }
                        }
                        c0315c.g(c0339c14.i, c0340d22.f3512Q[i34].f3495f.i, -c0339c14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0338b3.h;
                        if (arrayList2 != null) {
                            if (c0338b3.f3487n) {
                            }
                            C0340d c0340d282 = null;
                            float f72 = 0.0f;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (c0340d23 == null) {
                        }
                        c0340d2 = c0340d24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0338b3.f3483j;
                            if (i392 <= 0) {
                            }
                            C0340d c0340d302 = c0340d23;
                            c0340d3 = c0340d302;
                            while (c0340d3 != null) {
                            }
                            i7 = i6;
                            C0339c c0339c252 = c0340d23.f3512Q[i3];
                            c0339c = c0340d27.f3512Q[i3].f3495f;
                            int i432 = i3 + 1;
                            C0339c c0339c262 = c0340d2.f3512Q[i432];
                            c0339c2 = c0340d22.f3512Q[i432].f3495f;
                            if (c0339c != null) {
                            }
                            i8 = 5;
                            if (c0339c2 != null) {
                            }
                            if (!z4) {
                            }
                            C0339c[] c0339cArr8222 = c0340d23.f3512Q;
                            c0339c5 = c0339cArr8222[i3];
                            if (c0340d2 != null) {
                            }
                            i11 = i3 + 1;
                            c0339cArr2 = c0340d9.f3512Q;
                            c0339c6 = c0339cArr2[i11];
                            C0339c c0339c27222 = c0339c5.f3495f;
                            if (c0339c27222 == null) {
                            }
                            C0339c c0339c28222 = c0339c6.f3495f;
                            if (c0339c28222 == null) {
                            }
                            if (c0340d22 != c0340d9) {
                            }
                            if (c0340d23 == c0340d9) {
                            }
                            if (c0318f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        C0339c[] c0339cArr82222 = c0340d23.f3512Q;
                        c0339c5 = c0339cArr82222[i3];
                        if (c0340d2 != null) {
                        }
                        i11 = i3 + 1;
                        c0339cArr2 = c0340d9.f3512Q;
                        c0339c6 = c0339cArr2[i11];
                        C0339c c0339c272222 = c0339c5.f3495f;
                        if (c0339c272222 == null) {
                        }
                        C0339c c0339c282222 = c0339c6.f3495f;
                        if (c0339c282222 == null) {
                        }
                        if (c0340d22 != c0340d9) {
                        }
                        if (c0340d23 == c0340d9) {
                        }
                        if (c0318f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0338b3.h;
                if (arrayList2 != null) {
                }
                if (c0340d23 == null) {
                }
                c0340d2 = c0340d24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                C0339c[] c0339cArr822222 = c0340d23.f3512Q;
                c0339c5 = c0339cArr822222[i3];
                if (c0340d2 != null) {
                }
                i11 = i3 + 1;
                c0339cArr2 = c0340d9.f3512Q;
                c0339c6 = c0339cArr2[i11];
                C0339c c0339c2722222 = c0339c5.f3495f;
                if (c0339c2722222 == null) {
                }
                C0339c c0339c2822222 = c0339c6.f3495f;
                if (c0339c2822222 == null) {
                }
                if (c0340d22 != c0340d9) {
                }
                if (c0340d23 == c0340d9) {
                }
                if (c0318f4 != null) {
                }
            } else {
                i5 = i2;
                c0338bArr2 = c0338bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            c0341e2 = c0341e;
            arrayList4 = arrayList;
            i2 = i5;
            c0338bArr = c0338bArr2;
        }
    }

    public static void b(C0341e c0341e, C0315c c0315c, C0340d c0340d) {
        c0340d.f3546o = -1;
        c0340d.f3548p = -1;
        int i = c0341e.f3549p0[0];
        int[] iArr = c0340d.f3549p0;
        if (i != 2 && iArr[0] == 4) {
            C0339c c0339c = c0340d.f3504I;
            int i2 = c0339c.f3496g;
            int q2 = c0341e.q();
            C0339c c0339c2 = c0340d.f3506K;
            int i3 = q2 - c0339c2.f3496g;
            c0339c.i = c0315c.k(c0339c);
            c0339c2.i = c0315c.k(c0339c2);
            c0315c.d(c0339c.i, i2);
            c0315c.d(c0339c2.i, i3);
            c0340d.f3546o = 2;
            c0340d.f3520Y = i2;
            int i4 = i3 - i2;
            c0340d.f3516U = i4;
            int i5 = c0340d.f3525b0;
            if (i4 < i5) {
                c0340d.f3516U = i5;
            }
        }
        if (c0341e.f3549p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0339c c0339c3 = c0340d.f3505J;
        int i6 = c0339c3.f3496g;
        int k2 = c0341e.k();
        C0339c c0339c4 = c0340d.f3507L;
        int i7 = k2 - c0339c4.f3496g;
        c0339c3.i = c0315c.k(c0339c3);
        c0339c4.i = c0315c.k(c0339c4);
        c0315c.d(c0339c3.i, i6);
        c0315c.d(c0339c4.i, i7);
        if (c0340d.f3523a0 > 0 || c0340d.f3534g0 == 8) {
            C0339c c0339c5 = c0340d.f3508M;
            C0318f k3 = c0315c.k(c0339c5);
            c0339c5.i = k3;
            c0315c.d(k3, c0340d.f3523a0 + i6);
        }
        c0340d.f3548p = 2;
        c0340d.f3521Z = i6;
        int i8 = i7 - i6;
        c0340d.f3517V = i8;
        int i9 = c0340d.f3527c0;
        if (i8 < i9) {
            c0340d.f3517V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
