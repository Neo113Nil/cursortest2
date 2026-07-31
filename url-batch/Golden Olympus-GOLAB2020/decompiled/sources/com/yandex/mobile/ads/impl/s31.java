package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class s31 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f31556a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f31557b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f31558c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f31559d = new int[10];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f31560a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f31561b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31562c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31563d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f31564e;

        /* renamed from: f, reason: collision with root package name */
        public final int f31565f;

        /* renamed from: g, reason: collision with root package name */
        public final float f31566g;

        public a(int i4, boolean z4, int i5, int i6, int[] iArr, int i7, int i8, int i9, float f4) {
            this.f31560a = i4;
            this.f31561b = z4;
            this.f31562c = i5;
            this.f31563d = i6;
            this.f31564e = iArr;
            this.f31565f = i7;
            this.f31566g = f4;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f31567a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f31568b;

        public b(int i4, int i5, boolean z4) {
            this.f31567a = i5;
            this.f31568b = z4;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f31569a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31570b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31571c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31572d;

        /* renamed from: e, reason: collision with root package name */
        public final int f31573e;

        /* renamed from: f, reason: collision with root package name */
        public final int f31574f;

        /* renamed from: g, reason: collision with root package name */
        public final float f31575g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f31576h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f31577i;

        /* renamed from: j, reason: collision with root package name */
        public final int f31578j;

        /* renamed from: k, reason: collision with root package name */
        public final int f31579k;

        /* renamed from: l, reason: collision with root package name */
        public final int f31580l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f31581m;

        public c(int i4, int i5, int i6, int i7, int i8, int i9, float f4, boolean z4, boolean z5, int i10, int i11, int i12, boolean z6) {
            this.f31569a = i4;
            this.f31570b = i5;
            this.f31571c = i6;
            this.f31572d = i7;
            this.f31573e = i8;
            this.f31574f = i9;
            this.f31575g = f4;
            this.f31576h = z4;
            this.f31577i = z5;
            this.f31578j = i10;
            this.f31579k = i11;
            this.f31580l = i12;
            this.f31581m = z6;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c b(byte[] bArr, int i4, int i5) {
        int e4;
        boolean c4;
        tf1 tf1Var;
        int i6;
        int i7;
        boolean z4;
        boolean c5;
        float f4;
        int b4;
        tf1 tf1Var2 = new tf1(bArr, i4 + 1, i5);
        int i8 = 8;
        int b5 = tf1Var2.b(8);
        int b6 = tf1Var2.b(8);
        int b7 = tf1Var2.b(8);
        int e5 = tf1Var2.e();
        if (b5 == 100 || b5 == 110 || b5 == 122 || b5 == 244 || b5 == 44 || b5 == 83 || b5 == 86 || b5 == 118 || b5 == 128 || b5 == 138) {
            e4 = tf1Var2.e();
            c4 = e4 == 3 ? tf1Var2.c() : false;
            tf1Var2.e();
            tf1Var2.e();
            tf1Var2.f();
            if (tf1Var2.c()) {
                int i9 = e4 != 3 ? 8 : 12;
                int i10 = 0;
                while (i10 < i9) {
                    if (tf1Var2.c()) {
                        int i11 = i10 < 6 ? 16 : 64;
                        int i12 = 8;
                        int i13 = 8;
                        for (int i14 = 0; i14 < i11; i14++) {
                            if (i12 != 0) {
                                i12 = ((tf1Var2.d() + i13) + UserVerificationMethods.USER_VERIFY_HANDPRINT) % UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            if (i12 != 0) {
                                i13 = i12;
                            }
                        }
                    }
                    i10++;
                }
            }
        } else {
            e4 = 1;
            c4 = false;
        }
        int e6 = tf1Var2.e() + 4;
        int e7 = tf1Var2.e();
        if (e7 == 0) {
            i7 = tf1Var2.e() + 4;
            tf1Var = tf1Var2;
            i6 = 16;
        } else {
            if (e7 == 1) {
                boolean c6 = tf1Var2.c();
                tf1Var2.d();
                tf1Var2.d();
                i6 = 16;
                long e8 = tf1Var2.e();
                tf1Var = tf1Var2;
                for (int i15 = 0; i15 < e8; i15++) {
                    tf1Var.e();
                }
                z4 = c6;
                i8 = 8;
                i7 = 0;
                tf1Var.e();
                tf1Var.f();
                int e9 = tf1Var.e() + 1;
                int e10 = tf1Var.e() + 1;
                c5 = tf1Var.c();
                int i16 = 2 - (c5 ? 1 : 0);
                int i17 = e10 * i16;
                if (!c5) {
                    tf1Var.f();
                }
                tf1Var.f();
                int i18 = e9 * 16;
                int i19 = i17 * 16;
                if (tf1Var.c()) {
                    int e11 = tf1Var.e();
                    int e12 = tf1Var.e();
                    int e13 = tf1Var.e();
                    int e14 = tf1Var.e();
                    if (e4 != 0) {
                        int i20 = e4 == 3 ? 1 : 2;
                        i16 *= e4 == 1 ? 2 : 1;
                        r0 = i20;
                    }
                    i18 -= (e11 + e12) * r0;
                    i19 -= (e13 + e14) * i16;
                }
                int i21 = i18;
                if (tf1Var.c() && tf1Var.c()) {
                    b4 = tf1Var.b(i8);
                    if (b4 != 255) {
                        int i22 = i6;
                        int b8 = tf1Var.b(i22);
                        int b9 = tf1Var.b(i22);
                        if (b8 != 0 && b9 != 0) {
                            f4 = b8 / b9;
                        }
                    } else {
                        float[] fArr = f31557b;
                        if (b4 < 17) {
                            f4 = fArr[b4];
                        } else {
                            fr0.a("Unexpected aspect_ratio_idc value: ", b4, "NalUnitUtil");
                        }
                    }
                    return new c(b5, b6, b7, e5, i21, i19, f4, c4, c5, e6, e7, i7, z4);
                }
                f4 = 1.0f;
                return new c(b5, b6, b7, e5, i21, i19, f4, c4, c5, e6, e7, i7, z4);
            }
            tf1Var = tf1Var2;
            i6 = 16;
            i7 = 0;
        }
        z4 = false;
        tf1Var.e();
        tf1Var.f();
        int e92 = tf1Var.e() + 1;
        int e102 = tf1Var.e() + 1;
        c5 = tf1Var.c();
        int i162 = 2 - (c5 ? 1 : 0);
        int i172 = e102 * i162;
        if (!c5) {
        }
        tf1Var.f();
        int i182 = e92 * 16;
        int i192 = i172 * 16;
        if (tf1Var.c()) {
        }
        int i212 = i182;
        if (tf1Var.c()) {
            b4 = tf1Var.b(i8);
            if (b4 != 255) {
            }
            return new c(b5, b6, b7, e5, i212, i192, f4, c4, c5, e6, e7, i7, z4);
        }
        f4 = 1.0f;
        return new c(b5, b6, b7, e5, i212, i192, f4, c4, c5, e6, e7, i7, z4);
    }

    public static int a(byte[] bArr, int i4, int i5, boolean[] zArr) {
        int i6 = i5 - i4;
        if (i6 < 0) {
            throw new IllegalStateException();
        }
        if (i6 == 0) {
            return i5;
        }
        if (zArr[0]) {
            a(zArr);
            return i4 - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i4] == 1) {
            a(zArr);
            return i4 - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i4] == 0 && bArr[i4 + 1] == 1) {
            a(zArr);
            return i4 - 1;
        }
        int i7 = i5 - 1;
        int i8 = i4 + 2;
        while (i8 < i7) {
            byte b4 = bArr[i8];
            if ((b4 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b4 == 1) {
                    a(zArr);
                    return i9;
                }
                i8 -= 2;
            }
            i8 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i5 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i5 + (-3)] == 0 && bArr[i5 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i5 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i5;
    }

    public static a a(byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9 = 2;
        tf1 tf1Var = new tf1(bArr, i4 + 2, i5);
        int i10 = 4;
        tf1Var.d(4);
        int b4 = tf1Var.b(3);
        tf1Var.f();
        int b5 = tf1Var.b(2);
        boolean c4 = tf1Var.c();
        int b6 = tf1Var.b(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (tf1Var.c()) {
                i11 |= 1 << i12;
            }
        }
        int i13 = 6;
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = tf1Var.b(8);
        }
        int i15 = i11;
        int b7 = tf1Var.b(8);
        int i16 = 0;
        for (int i17 = 0; i17 < b4; i17++) {
            if (tf1Var.c()) {
                i16 += 89;
            }
            if (tf1Var.c()) {
                i16 += 8;
            }
        }
        tf1Var.d(i16);
        if (b4 > 0) {
            tf1Var.d((8 - b4) * 2);
        }
        tf1Var.e();
        int e4 = tf1Var.e();
        if (e4 == 3) {
            tf1Var.f();
        }
        int e5 = tf1Var.e();
        int e6 = tf1Var.e();
        if (tf1Var.c()) {
            int e7 = tf1Var.e();
            int e8 = tf1Var.e();
            int e9 = tf1Var.e();
            int e10 = tf1Var.e();
            e5 -= (e7 + e8) * ((e4 == 1 || e4 == 2) ? 2 : 1);
            e6 -= (e9 + e10) * (e4 == 1 ? 2 : 1);
        }
        tf1Var.e();
        tf1Var.e();
        int e11 = tf1Var.e();
        for (int i18 = tf1Var.c() ? 0 : b4; i18 <= b4; i18++) {
            tf1Var.e();
            tf1Var.e();
            tf1Var.e();
        }
        tf1Var.e();
        tf1Var.e();
        tf1Var.e();
        tf1Var.e();
        tf1Var.e();
        tf1Var.e();
        if (tf1Var.c() && tf1Var.c()) {
            int i19 = 0;
            while (i19 < i10) {
                int i20 = 0;
                while (i20 < i13) {
                    if (!tf1Var.c()) {
                        tf1Var.e();
                    } else {
                        int min = Math.min(64, 1 << ((i19 << 1) + 4));
                        if (i19 > 1) {
                            tf1Var.d();
                        }
                        for (int i21 = 0; i21 < min; i21++) {
                            tf1Var.d();
                        }
                    }
                    i20 += i19 == 3 ? 3 : 1;
                    i13 = 6;
                }
                i19++;
                i10 = 4;
                i13 = 6;
            }
        }
        tf1Var.d(2);
        if (tf1Var.c()) {
            tf1Var.d(8);
            tf1Var.e();
            tf1Var.e();
            tf1Var.f();
        }
        int e12 = tf1Var.e();
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i22 = -1;
        int i23 = 0;
        int i24 = -1;
        while (i23 < e12) {
            if (i23 != 0 && tf1Var.c()) {
                i6 = i9;
                int i25 = i22 + i24;
                int e13 = (1 - ((tf1Var.c() ? 1 : 0) * 2)) * (tf1Var.e() + 1);
                i7 = e12;
                int i26 = i25 + 1;
                int[] iArr4 = iArr2;
                boolean[] zArr = new boolean[i26];
                for (int i27 = 0; i27 <= i25; i27++) {
                    if (!tf1Var.c()) {
                        zArr[i27] = tf1Var.c();
                    } else {
                        zArr[i27] = true;
                    }
                }
                int[] iArr5 = new int[i26];
                int[] iArr6 = new int[i26];
                int i28 = 0;
                for (int i29 = i24 - 1; i29 >= 0; i29--) {
                    int i30 = iArr3[i29] + e13;
                    if (i30 < 0 && zArr[i22 + i29]) {
                        iArr5[i28] = i30;
                        i28++;
                    }
                }
                if (e13 < 0 && zArr[i25]) {
                    iArr5[i28] = e13;
                    i28++;
                }
                int i31 = i28;
                i8 = e11;
                for (int i32 = 0; i32 < i22; i32++) {
                    int i33 = iArr4[i32] + e13;
                    if (i33 < 0 && zArr[i32]) {
                        iArr5[i31] = i33;
                        i31++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr5, i31);
                int i34 = 0;
                for (int i35 = i22 - 1; i35 >= 0; i35--) {
                    int i36 = iArr4[i35] + e13;
                    if (i36 > 0 && zArr[i35]) {
                        iArr6[i34] = i36;
                        i34++;
                    }
                }
                if (e13 > 0 && zArr[i25]) {
                    iArr6[i34] = e13;
                    i34++;
                }
                int i37 = i31;
                int i38 = i34;
                for (int i39 = 0; i39 < i24; i39++) {
                    int i40 = iArr3[i39] + e13;
                    if (i40 > 0 && zArr[i22 + i39]) {
                        iArr6[i38] = i40;
                        i38++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr6, i38);
                i24 = i38;
                i22 = i37;
            } else {
                i6 = i9;
                i7 = e12;
                i8 = e11;
                int e14 = tf1Var.e();
                int e15 = tf1Var.e();
                int[] iArr7 = new int[e14];
                for (int i41 = 0; i41 < e14; i41++) {
                    iArr7[i41] = tf1Var.e() + 1;
                    tf1Var.f();
                }
                int[] iArr8 = new int[e15];
                for (int i42 = 0; i42 < e15; i42++) {
                    iArr8[i42] = tf1Var.e() + 1;
                    tf1Var.f();
                }
                i22 = e14;
                iArr3 = iArr8;
                iArr2 = iArr7;
                i24 = e15;
            }
            i23++;
            i9 = i6;
            e12 = i7;
            e11 = i8;
        }
        int i43 = i9;
        int i44 = e11;
        if (tf1Var.c()) {
            for (int i45 = 0; i45 < tf1Var.e(); i45++) {
                tf1Var.d(i44 + 5);
            }
        }
        tf1Var.d(i43);
        float f4 = 1.0f;
        if (tf1Var.c()) {
            if (tf1Var.c()) {
                int b8 = tf1Var.b(8);
                if (b8 == 255) {
                    int b9 = tf1Var.b(16);
                    int b10 = tf1Var.b(16);
                    if (b9 != 0 && b10 != 0) {
                        f4 = b9 / b10;
                    }
                } else {
                    float[] fArr = f31557b;
                    if (b8 < 17) {
                        f4 = fArr[b8];
                    } else {
                        fr0.a("Unexpected aspect_ratio_idc value: ", b8, "NalUnitUtil");
                    }
                }
            }
            if (tf1Var.c()) {
                tf1Var.f();
            }
            if (tf1Var.c()) {
                tf1Var.d(4);
                if (tf1Var.c()) {
                    tf1Var.d(24);
                }
            }
            if (tf1Var.c()) {
                tf1Var.e();
                tf1Var.e();
            }
            tf1Var.f();
            if (tf1Var.c()) {
                e6 *= 2;
            }
        }
        return new a(b5, c4, b6, i15, iArr, b7, e5, e6, f4);
    }

    public static int a(int i4, byte[] bArr) {
        int i5;
        synchronized (f31558c) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                while (true) {
                    if (i6 >= i4 - 2) {
                        i6 = i4;
                        break;
                    }
                    try {
                        if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 3) {
                            break;
                        }
                        i6++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i6 < i4) {
                    int[] iArr = f31559d;
                    if (iArr.length <= i7) {
                        f31559d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f31559d[i7] = i6;
                    i6 += 3;
                    i7++;
                }
            }
            i5 = i4 - i7;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = f31559d[i10] - i9;
                System.arraycopy(bArr, i9, bArr, i8, i11);
                int i12 = i8 + i11;
                int i13 = i12 + 1;
                bArr[i12] = 0;
                i8 = i12 + 2;
                bArr[i13] = 0;
                i9 += i11 + 3;
            }
            System.arraycopy(bArr, i9, bArr, i8, i5 - i8);
        }
        return i5;
    }
}
