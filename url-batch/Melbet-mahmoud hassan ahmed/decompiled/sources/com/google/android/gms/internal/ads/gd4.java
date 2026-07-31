package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class gd4 {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f5562a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5563b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5564c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5565d;

    private gd4(List<byte[]> list, int i7, int i8, int i9, float f7, String str) {
        this.f5562a = list;
        this.f5563b = i7;
        this.f5564c = f7;
        this.f5565d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0297 A[Catch: ArrayIndexOutOfBoundsException -> 0x030b, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x030b, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0046, B:16:0x0053, B:19:0x0070, B:22:0x0099, B:24:0x009f, B:26:0x00a4, B:29:0x00a7, B:32:0x00af, B:34:0x00b8, B:36:0x00c0, B:38:0x00c6, B:39:0x00c8, B:41:0x00ce, B:43:0x00d0, B:46:0x00d3, B:48:0x00d8, B:49:0x00de, B:51:0x00e8, B:52:0x00ec, B:54:0x00fa, B:62:0x0120, B:63:0x012e, B:68:0x0145, B:70:0x0151, B:72:0x0169, B:80:0x0177, B:82:0x017d, B:87:0x01ac, B:90:0x0186, B:92:0x019b, B:95:0x01a1, B:98:0x01b2, B:100:0x01ba, B:102:0x01c9, B:103:0x01d7, B:106:0x01e2, B:108:0x01e8, B:110:0x01f1, B:112:0x01f7, B:114:0x01fa, B:119:0x0226, B:120:0x0200, B:122:0x020f, B:126:0x021b, B:131:0x022c, B:134:0x0233, B:136:0x0239, B:138:0x0242, B:140:0x024c, B:142:0x0252, B:144:0x025c, B:147:0x026a, B:148:0x0291, B:150:0x0297, B:151:0x029a, B:153:0x02a0, B:155:0x02aa, B:156:0x02af, B:158:0x02b5, B:159:0x02bb, B:161:0x02c4, B:162:0x02c9, B:164:0x02db, B:167:0x0272, B:168:0x0277, B:179:0x02ec, B:182:0x02f7, B:183:0x0300, B:187:0x02fc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a0 A[Catch: ArrayIndexOutOfBoundsException -> 0x030b, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x030b, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0046, B:16:0x0053, B:19:0x0070, B:22:0x0099, B:24:0x009f, B:26:0x00a4, B:29:0x00a7, B:32:0x00af, B:34:0x00b8, B:36:0x00c0, B:38:0x00c6, B:39:0x00c8, B:41:0x00ce, B:43:0x00d0, B:46:0x00d3, B:48:0x00d8, B:49:0x00de, B:51:0x00e8, B:52:0x00ec, B:54:0x00fa, B:62:0x0120, B:63:0x012e, B:68:0x0145, B:70:0x0151, B:72:0x0169, B:80:0x0177, B:82:0x017d, B:87:0x01ac, B:90:0x0186, B:92:0x019b, B:95:0x01a1, B:98:0x01b2, B:100:0x01ba, B:102:0x01c9, B:103:0x01d7, B:106:0x01e2, B:108:0x01e8, B:110:0x01f1, B:112:0x01f7, B:114:0x01fa, B:119:0x0226, B:120:0x0200, B:122:0x020f, B:126:0x021b, B:131:0x022c, B:134:0x0233, B:136:0x0239, B:138:0x0242, B:140:0x024c, B:142:0x0252, B:144:0x025c, B:147:0x026a, B:148:0x0291, B:150:0x0297, B:151:0x029a, B:153:0x02a0, B:155:0x02aa, B:156:0x02af, B:158:0x02b5, B:159:0x02bb, B:161:0x02c4, B:162:0x02c9, B:164:0x02db, B:167:0x0272, B:168:0x0277, B:179:0x02ec, B:182:0x02f7, B:183:0x0300, B:187:0x02fc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b5 A[Catch: ArrayIndexOutOfBoundsException -> 0x030b, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x030b, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0046, B:16:0x0053, B:19:0x0070, B:22:0x0099, B:24:0x009f, B:26:0x00a4, B:29:0x00a7, B:32:0x00af, B:34:0x00b8, B:36:0x00c0, B:38:0x00c6, B:39:0x00c8, B:41:0x00ce, B:43:0x00d0, B:46:0x00d3, B:48:0x00d8, B:49:0x00de, B:51:0x00e8, B:52:0x00ec, B:54:0x00fa, B:62:0x0120, B:63:0x012e, B:68:0x0145, B:70:0x0151, B:72:0x0169, B:80:0x0177, B:82:0x017d, B:87:0x01ac, B:90:0x0186, B:92:0x019b, B:95:0x01a1, B:98:0x01b2, B:100:0x01ba, B:102:0x01c9, B:103:0x01d7, B:106:0x01e2, B:108:0x01e8, B:110:0x01f1, B:112:0x01f7, B:114:0x01fa, B:119:0x0226, B:120:0x0200, B:122:0x020f, B:126:0x021b, B:131:0x022c, B:134:0x0233, B:136:0x0239, B:138:0x0242, B:140:0x024c, B:142:0x0252, B:144:0x025c, B:147:0x026a, B:148:0x0291, B:150:0x0297, B:151:0x029a, B:153:0x02a0, B:155:0x02aa, B:156:0x02af, B:158:0x02b5, B:159:0x02bb, B:161:0x02c4, B:162:0x02c9, B:164:0x02db, B:167:0x0272, B:168:0x0277, B:179:0x02ec, B:182:0x02f7, B:183:0x0300, B:187:0x02fc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c4 A[Catch: ArrayIndexOutOfBoundsException -> 0x030b, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x030b, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0046, B:16:0x0053, B:19:0x0070, B:22:0x0099, B:24:0x009f, B:26:0x00a4, B:29:0x00a7, B:32:0x00af, B:34:0x00b8, B:36:0x00c0, B:38:0x00c6, B:39:0x00c8, B:41:0x00ce, B:43:0x00d0, B:46:0x00d3, B:48:0x00d8, B:49:0x00de, B:51:0x00e8, B:52:0x00ec, B:54:0x00fa, B:62:0x0120, B:63:0x012e, B:68:0x0145, B:70:0x0151, B:72:0x0169, B:80:0x0177, B:82:0x017d, B:87:0x01ac, B:90:0x0186, B:92:0x019b, B:95:0x01a1, B:98:0x01b2, B:100:0x01ba, B:102:0x01c9, B:103:0x01d7, B:106:0x01e2, B:108:0x01e8, B:110:0x01f1, B:112:0x01f7, B:114:0x01fa, B:119:0x0226, B:120:0x0200, B:122:0x020f, B:126:0x021b, B:131:0x022c, B:134:0x0233, B:136:0x0239, B:138:0x0242, B:140:0x024c, B:142:0x0252, B:144:0x025c, B:147:0x026a, B:148:0x0291, B:150:0x0297, B:151:0x029a, B:153:0x02a0, B:155:0x02aa, B:156:0x02af, B:158:0x02b5, B:159:0x02bb, B:161:0x02c4, B:162:0x02c9, B:164:0x02db, B:167:0x0272, B:168:0x0277, B:179:0x02ec, B:182:0x02f7, B:183:0x0300, B:187:0x02fc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gd4 a(dr2 dr2Var) {
        int i7;
        int i8;
        int i9;
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        try {
            dr2Var.g(21);
            int s7 = dr2Var.s() & 3;
            int s8 = dr2Var.s();
            int k7 = dr2Var.k();
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < s8; i17++) {
                dr2Var.g(1);
                int w6 = dr2Var.w();
                for (int i18 = 0; i18 < w6; i18++) {
                    int w7 = dr2Var.w();
                    i16 += w7 + 4;
                    dr2Var.g(w7);
                }
            }
            dr2Var.f(k7);
            byte[] bArr = new byte[i16];
            String str = null;
            int i19 = 0;
            int i20 = 0;
            int i21 = -1;
            int i22 = -1;
            float f8 = 1.0f;
            while (i19 < s8) {
                int s9 = dr2Var.s() & 127;
                int w8 = dr2Var.w();
                int i23 = 0;
                while (i23 < w8) {
                    int w9 = dr2Var.w();
                    System.arraycopy(th2.f12217a, i15, bArr, i20, 4);
                    int i24 = i20 + 4;
                    System.arraycopy(dr2Var.h(), dr2Var.k(), bArr, i24, w9);
                    if (s9 == 33 && i23 == 0) {
                        es2 es2Var = new es2(bArr, i24 + 2, i24 + w9);
                        es2Var.e(4);
                        int a7 = es2Var.a(3);
                        es2Var.d();
                        int a8 = es2Var.a(2);
                        boolean f9 = es2Var.f();
                        int a9 = es2Var.a(5);
                        int i25 = 0;
                        for (int i26 = 0; i26 < 32; i26++) {
                            if (es2Var.f()) {
                                i25 |= 1 << i26;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i27 = 0; i27 < 6; i27++) {
                            iArr[i27] = es2Var.a(8);
                        }
                        int a10 = es2Var.a(8);
                        int i28 = 0;
                        for (int i29 = 0; i29 < a7; i29++) {
                            if (es2Var.f()) {
                                i28 += 89;
                            }
                            if (es2Var.f()) {
                                i28 += 8;
                            }
                        }
                        es2Var.e(i28);
                        if (a7 > 0) {
                            int i30 = 8 - a7;
                            es2Var.e(i30 + i30);
                        }
                        es2Var.c();
                        int c7 = es2Var.c();
                        if (c7 == 3) {
                            es2Var.d();
                            c7 = 3;
                        }
                        int c8 = es2Var.c();
                        int c9 = es2Var.c();
                        if (es2Var.f()) {
                            int c10 = es2Var.c();
                            int c11 = es2Var.c();
                            int c12 = es2Var.c();
                            int c13 = es2Var.c();
                            if (c7 != 1) {
                                i7 = s8;
                                i13 = 1;
                                if (c7 == 2) {
                                    c7 = 2;
                                } else {
                                    i14 = 1;
                                    c8 -= i14 * (c10 + c11);
                                    c9 -= (c7 != i13 ? 2 : 1) * (c12 + c13);
                                }
                            } else {
                                i7 = s8;
                                i13 = 1;
                            }
                            i14 = 2;
                            c8 -= i14 * (c10 + c11);
                            c9 -= (c7 != i13 ? 2 : 1) * (c12 + c13);
                        } else {
                            i7 = s8;
                        }
                        i21 = c8;
                        es2Var.c();
                        es2Var.c();
                        int c14 = es2Var.c();
                        for (int i31 = true != es2Var.f() ? a7 : 0; i31 <= a7; i31++) {
                            es2Var.c();
                            es2Var.c();
                            es2Var.c();
                        }
                        es2Var.c();
                        es2Var.c();
                        es2Var.c();
                        es2Var.c();
                        es2Var.c();
                        es2Var.c();
                        if (es2Var.f() && es2Var.f()) {
                            int i32 = 0;
                            while (i32 < 4) {
                                int i33 = 0;
                                while (i33 < 6) {
                                    if (es2Var.f()) {
                                        i11 = s9;
                                        i12 = w8;
                                        int min = Math.min(64, 1 << ((i32 + i32) + 4));
                                        if (i32 > 1) {
                                            es2Var.b();
                                        }
                                        for (int i34 = 0; i34 < min; i34++) {
                                            es2Var.b();
                                        }
                                    } else {
                                        es2Var.c();
                                        i11 = s9;
                                        i12 = w8;
                                    }
                                    i33 += i32 == 3 ? 3 : 1;
                                    s9 = i11;
                                    w8 = i12;
                                }
                                i32++;
                            }
                        }
                        i8 = s9;
                        i9 = w8;
                        es2Var.e(2);
                        if (es2Var.f()) {
                            es2Var.e(8);
                            es2Var.c();
                            es2Var.c();
                            es2Var.d();
                        }
                        int c15 = es2Var.c();
                        int i35 = 0;
                        boolean z6 = false;
                        int i36 = 0;
                        while (i35 < c15) {
                            if (i35 != 0) {
                                z6 = es2Var.f();
                            }
                            if (z6) {
                                es2Var.d();
                                es2Var.c();
                                for (int i37 = 0; i37 <= i36; i37++) {
                                    if (es2Var.f()) {
                                        es2Var.d();
                                    }
                                }
                                i10 = c15;
                            } else {
                                int c16 = es2Var.c();
                                int c17 = es2Var.c();
                                int i38 = c16 + c17;
                                i10 = c15;
                                for (int i39 = 0; i39 < c16; i39++) {
                                    es2Var.c();
                                    es2Var.d();
                                }
                                for (int i40 = 0; i40 < c17; i40++) {
                                    es2Var.c();
                                    es2Var.d();
                                }
                                i36 = i38;
                            }
                            i35++;
                            c15 = i10;
                        }
                        if (es2Var.f()) {
                            for (int i41 = 0; i41 < es2Var.c(); i41++) {
                                es2Var.e(c14 + 5);
                            }
                        }
                        es2Var.e(2);
                        if (es2Var.f()) {
                            if (es2Var.f()) {
                                int a11 = es2Var.a(8);
                                if (a11 == 255) {
                                    int a12 = es2Var.a(16);
                                    int a13 = es2Var.a(16);
                                    if (a12 != 0 && a13 != 0) {
                                        f7 = a12 / a13;
                                        if (es2Var.f()) {
                                            es2Var.d();
                                        }
                                        if (es2Var.f()) {
                                            es2Var.e(4);
                                            if (es2Var.f()) {
                                                es2Var.e(24);
                                            }
                                        }
                                        if (es2Var.f()) {
                                            es2Var.c();
                                            es2Var.c();
                                        }
                                        es2Var.d();
                                        if (es2Var.f()) {
                                            c9 += c9;
                                        }
                                    }
                                } else if (a11 < 17) {
                                    f7 = th2.f12218b[a11];
                                    if (es2Var.f()) {
                                    }
                                    if (es2Var.f()) {
                                    }
                                    if (es2Var.f()) {
                                    }
                                    es2Var.d();
                                    if (es2Var.f()) {
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder(46);
                                    sb.append("Unexpected aspect_ratio_idc value: ");
                                    sb.append(a11);
                                    Log.w("NalUnitUtil", sb.toString());
                                }
                            }
                            f7 = 1.0f;
                            if (es2Var.f()) {
                            }
                            if (es2Var.f()) {
                            }
                            if (es2Var.f()) {
                            }
                            es2Var.d();
                            if (es2Var.f()) {
                            }
                        } else {
                            f7 = 1.0f;
                        }
                        str = zw1.b(a8, f9, a9, i25, iArr, a10);
                        f8 = f7;
                        i22 = c9;
                        i23 = 0;
                    } else {
                        i7 = s8;
                        i8 = s9;
                        i9 = w8;
                    }
                    i20 = i24 + w9;
                    dr2Var.g(w9);
                    i23++;
                    s9 = i8;
                    w8 = i9;
                    s8 = i7;
                    i15 = 0;
                }
                i19++;
                i15 = 0;
            }
            return new gd4(i16 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), s7 + 1, i21, i22, f8, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw dz.a("Error parsing HEVC config", e7);
        }
    }
}
