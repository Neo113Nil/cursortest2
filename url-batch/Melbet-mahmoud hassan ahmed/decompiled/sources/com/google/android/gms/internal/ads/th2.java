package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class th2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12217a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f12218b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12219c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f12220d = new int[10];

    public static int a(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        wu1.f(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            e(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            e(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            e(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b7 = bArr[i11];
            if ((b7 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b7 == 1) {
                    e(zArr);
                    return i12;
                }
                i11 = i12;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    public static int b(byte[] bArr, int i7) {
        int i8;
        synchronized (f12219c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    if (i9 >= i7 - 2) {
                        i9 = i7;
                        break;
                    }
                    try {
                        if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = f12220d;
                    if (iArr.length <= i10) {
                        int length = iArr.length;
                        f12220d = Arrays.copyOf(iArr, length + length);
                    }
                    f12220d[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f12220d[i13] - i11;
                System.arraycopy(bArr, i11, bArr, i12, i14);
                int i15 = i12 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i12 = i16 + 1;
                bArr[i16] = 0;
                i11 += i14 + 3;
            }
            System.arraycopy(bArr, i11, bArr, i12, i8 - i12);
        }
        return i8;
    }

    public static rf2 c(byte[] bArr, int i7, int i8) {
        es2 es2Var = new es2(bArr, 4, i8);
        int c7 = es2Var.c();
        int c8 = es2Var.c();
        es2Var.d();
        return new rf2(c7, c8, es2Var.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sg2 d(byte[] bArr, int i7, int i8) {
        int c7;
        int i9;
        boolean z6;
        int c8;
        int i10;
        int i11;
        int i12;
        boolean z7;
        boolean f7;
        float f8;
        int a7;
        es2 es2Var = new es2(bArr, i7, i8);
        int a8 = es2Var.a(8);
        int a9 = es2Var.a(8);
        int a10 = es2Var.a(8);
        int c9 = es2Var.c();
        if (a8 != 100 && a8 != 110 && a8 != 122 && a8 != 244 && a8 != 44 && a8 != 83 && a8 != 86 && a8 != 118 && a8 != 128) {
            if (a8 != 138) {
                c7 = 1;
                z6 = false;
                int c10 = es2Var.c() + 4;
                c8 = es2Var.c();
                if (c8 != 0) {
                    i10 = a8;
                    i11 = c8;
                    i12 = es2Var.c() + 4;
                } else {
                    if (c8 == 1) {
                        boolean f9 = es2Var.f();
                        es2Var.b();
                        es2Var.b();
                        long c11 = es2Var.c();
                        i10 = a8;
                        for (int i13 = 0; i13 < c11; i13++) {
                            es2Var.c();
                        }
                        z7 = f9;
                        i11 = 1;
                        i12 = 0;
                        es2Var.c();
                        es2Var.d();
                        int c12 = es2Var.c() + 1;
                        int c13 = es2Var.c();
                        f7 = es2Var.f();
                        int i14 = 2 - (f7 ? 1 : 0);
                        int i15 = (c13 + 1) * i14;
                        if (!f7) {
                            es2Var.d();
                        }
                        es2Var.d();
                        int i16 = c12 * 16;
                        int i17 = i15 * 16;
                        if (es2Var.f()) {
                            int c14 = es2Var.c();
                            int c15 = es2Var.c();
                            int c16 = es2Var.c();
                            int c17 = es2Var.c();
                            if (c7 != 0) {
                                int i18 = c7 == 3 ? 1 : 2;
                                i14 *= c7 == 1 ? 2 : 1;
                                r10 = i18;
                            }
                            i16 -= (c14 + c15) * r10;
                            i17 -= (c16 + c17) * i14;
                        }
                        int i19 = i17;
                        if (es2Var.f() && es2Var.f()) {
                            a7 = es2Var.a(8);
                            if (a7 != 255) {
                                int a11 = es2Var.a(16);
                                int a12 = es2Var.a(16);
                                if (a11 != 0 && a12 != 0) {
                                    f8 = a11 / a12;
                                }
                            } else if (a7 < 17) {
                                f8 = f12218b[a7];
                            } else {
                                StringBuilder sb = new StringBuilder(46);
                                sb.append("Unexpected aspect_ratio_idc value: ");
                                sb.append(a7);
                                Log.w("NalUnitUtil", sb.toString());
                            }
                            return new sg2(i10, a9, a10, c9, i16, i19, f8, z6, f7, c10, i11, i12, z7);
                        }
                        f8 = 1.0f;
                        return new sg2(i10, a9, a10, c9, i16, i19, f8, z6, f7, c10, i11, i12, z7);
                    }
                    i10 = a8;
                    i11 = c8;
                    i12 = 0;
                }
                z7 = false;
                es2Var.c();
                es2Var.d();
                int c122 = es2Var.c() + 1;
                int c132 = es2Var.c();
                f7 = es2Var.f();
                int i142 = 2 - (f7 ? 1 : 0);
                int i152 = (c132 + 1) * i142;
                if (!f7) {
                }
                es2Var.d();
                int i162 = c122 * 16;
                int i172 = i152 * 16;
                if (es2Var.f()) {
                }
                int i192 = i172;
                if (es2Var.f()) {
                    a7 = es2Var.a(8);
                    if (a7 != 255) {
                    }
                    return new sg2(i10, a9, a10, c9, i162, i192, f8, z6, f7, c10, i11, i12, z7);
                }
                f8 = 1.0f;
                return new sg2(i10, a9, a10, c9, i162, i192, f8, z6, f7, c10, i11, i12, z7);
            }
            a8 = 138;
        }
        c7 = es2Var.c();
        if (c7 == 3) {
            z6 = es2Var.f();
            i9 = 3;
        } else {
            i9 = c7;
            z6 = false;
        }
        es2Var.c();
        es2Var.c();
        es2Var.d();
        if (es2Var.f()) {
            int i20 = i9 != 3 ? 8 : 12;
            int i21 = 0;
            while (i21 < i20) {
                if (es2Var.f()) {
                    int i22 = i21 < 6 ? 16 : 64;
                    int i23 = 8;
                    int i24 = 8;
                    for (int i25 = 0; i25 < i22; i25++) {
                        if (i23 != 0) {
                            i23 = ((i24 + es2Var.b()) + 256) % 256;
                        }
                        if (i23 != 0) {
                            i24 = i23;
                        }
                    }
                }
                i21++;
            }
        }
        int c102 = es2Var.c() + 4;
        c8 = es2Var.c();
        if (c8 != 0) {
        }
        z7 = false;
        es2Var.c();
        es2Var.d();
        int c1222 = es2Var.c() + 1;
        int c1322 = es2Var.c();
        f7 = es2Var.f();
        int i1422 = 2 - (f7 ? 1 : 0);
        int i1522 = (c1322 + 1) * i1422;
        if (!f7) {
        }
        es2Var.d();
        int i1622 = c1222 * 16;
        int i1722 = i1522 * 16;
        if (es2Var.f()) {
        }
        int i1922 = i1722;
        if (es2Var.f()) {
        }
        f8 = 1.0f;
        return new sg2(i10, a9, a10, c9, i1622, i1922, f8, z6, f7, c102, i11, i12, z7);
    }

    public static void e(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
