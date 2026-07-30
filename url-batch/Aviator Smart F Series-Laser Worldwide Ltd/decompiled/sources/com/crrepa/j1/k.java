package com.crrepa.j1;

import com.baidu.mapauto.auth.constant.ErrorCode;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes3.dex */
public class k {
    private static int N = 0;
    private static int O = 0;
    private static int P = 0;
    private static int Q = 0;
    private static final int R = 16;
    private static final int S = 240;
    private static final int T = 16;
    private int M;

    /* renamed from: a, reason: collision with root package name */
    final int f13094a = 16;

    /* renamed from: b, reason: collision with root package name */
    final int f13095b = 2;

    /* renamed from: c, reason: collision with root package name */
    final int f13096c = 3;

    /* renamed from: d, reason: collision with root package name */
    final int f13097d = PsExtractor.AUDIO_STREAM;

    /* renamed from: e, reason: collision with root package name */
    final int f13098e = 7;

    /* renamed from: f, reason: collision with root package name */
    final int f13099f = 56;

    /* renamed from: g, reason: collision with root package name */
    final int f13100g = 0;

    /* renamed from: h, reason: collision with root package name */
    final int f13101h = 8;

    /* renamed from: i, reason: collision with root package name */
    final int f13102i = 16;

    /* renamed from: j, reason: collision with root package name */
    final int f13103j = 1;

    /* renamed from: k, reason: collision with root package name */
    final int f13104k = 2;

    /* renamed from: l, reason: collision with root package name */
    final int f13105l = 3;

    /* renamed from: m, reason: collision with root package name */
    final int f13106m = 1500;

    /* renamed from: n, reason: collision with root package name */
    final int f13107n = -1001;

    /* renamed from: o, reason: collision with root package name */
    final int f13108o = -1002;

    /* renamed from: p, reason: collision with root package name */
    final int f13109p = -1003;

    /* renamed from: q, reason: collision with root package name */
    final int f13110q = -1004;

    /* renamed from: r, reason: collision with root package name */
    final int f13111r = ErrorCode.CODE_SERVER_ERROR;

    /* renamed from: s, reason: collision with root package name */
    final int f13112s = ErrorCode.CODE_CHECK_SIGN_ERROR;

    /* renamed from: t, reason: collision with root package name */
    final int f13113t = ErrorCode.CODE_MULTI_FUNC_ERROR;

    /* renamed from: u, reason: collision with root package name */
    final int f13114u = b.f12996n;

    /* renamed from: v, reason: collision with root package name */
    final int f13115v = b.f12997o;

    /* renamed from: w, reason: collision with root package name */
    final int f13116w = b.f12998p;

    /* renamed from: x, reason: collision with root package name */
    final int f13117x = -1204;

    /* renamed from: y, reason: collision with root package name */
    final int f13118y = -1205;

    /* renamed from: z, reason: collision with root package name */
    final int f13119z = -1206;
    final int A = -1207;
    final int B = -1212;
    final int C = -1302;
    final int D = PsExtractor.AUDIO_STREAM;
    final int E = 219;
    final int F = 220;
    final int G = 221;
    final int H = 222;
    private byte[] I = new byte[1500];
    private byte[] J = new byte[1500];
    private int K = 0;
    private boolean L = false;

    private int a() {
        int i8 = N;
        if (i8 == 33) {
            return 34;
        }
        if (i8 == 38) {
            N = 0;
            return 0;
        }
        if (i8 != 35) {
            if (i8 != 36) {
                return 32;
            }
            if (O >= P) {
                P = 0;
                return 37;
            }
        }
        return 47;
    }

    private int b(g gVar, int i8, byte[] bArr, int i9) {
        int i10 = Q;
        int i11 = i9 % i10;
        int i12 = i9 / i10;
        if (i11 != 0) {
            i12++;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = Q;
            if (i13 >= i9 / i16) {
                break;
            }
            int i17 = i16 + 4;
            byte[] bArr2 = new byte[i17];
            a(i14, i12, i16, bArr2);
            System.arraycopy(bArr, i15, bArr2, 4, Q);
            a(gVar, i17, bArr2);
            i14++;
            if (i14 == 15) {
                i14 = 0;
            }
            i15 += Q;
            i13++;
        }
        if (i11 != 0) {
            int i18 = i11 + 4;
            byte[] bArr3 = new byte[i18];
            a(i14, i12, i11, bArr3);
            System.arraycopy(bArr, i15, bArr3, 4, i11);
            a(gVar, i18, bArr3);
        }
        return 1;
    }

    private int c(g gVar, int i8, byte[] bArr, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = this.I;
        int i11 = 2;
        if (i8 > bArr3.length - 2) {
            return b.f12997o;
        }
        int i12 = i8 + 2;
        int i13 = this.K;
        byte b8 = (byte) (((byte) ((i8 >> 8) | 16)) | (i13 << 6));
        this.K = i13 + 1;
        int i14 = 0;
        bArr3[0] = b8;
        bArr3[1] = (byte) i8;
        int i15 = 2;
        int i16 = 0;
        while (i8 != 0) {
            bArr3[i15] = bArr[i16];
            i8--;
            i15++;
            i16++;
        }
        this.M = 0;
        while (this.M < 3 && !b.f13007y) {
            gVar.a();
            int a8 = a(gVar, i12, this.I);
            this.M++;
            if (a8 == 0) {
                byte[] bArr4 = this.J;
                int a9 = a(gVar, bArr4.length, bArr4, i10);
                if (a9 > 0) {
                    int i17 = a9 - 2;
                    byte[] bArr5 = this.J;
                    int i18 = ((bArr5[0] & 7) * 256) + bArr5[1];
                    if (i17 == i18) {
                        if (i17 > i9) {
                            return -1204;
                        }
                        while (i17 != 0) {
                            bArr2[i14] = this.J[i11];
                            i17--;
                            i14++;
                            i11++;
                        }
                        return i18;
                    }
                } else {
                    continue;
                }
            }
        }
        return b.f12996n;
    }

    int a(g gVar) {
        int c8 = gVar.c(new byte[]{-37, -34}, 2);
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException e8) {
            e8.printStackTrace();
        }
        byte[] bArr = this.I;
        bArr[0] = 0;
        bArr[1] = 1;
        bArr[2] = 1;
        if (c8 == 0) {
            c8 = a(gVar, 3, bArr);
        }
        if (c8 != 0) {
            return -1;
        }
        byte[] bArr2 = this.J;
        return a(gVar, bArr2.length, bArr2, 10000) == 3 ? 0 : -1;
    }

    int b(g gVar, int i8, byte[] bArr, int i9, byte[] bArr2, int i10) {
        return c(gVar, i8, bArr, i9, bArr2, i10);
    }

    private int a(g gVar, int i8, byte[] bArr) {
        byte[] bArr2 = new byte[1500];
        byte b8 = 0;
        bArr2[0] = 16;
        int i9 = 2;
        bArr2[1] = 2;
        int i10 = 0;
        while (i8 != 0) {
            i8--;
            int i11 = i10 + 1;
            byte b9 = bArr[i10];
            int i12 = i9 + 1;
            bArr2[i9] = b9;
            b8 = (byte) (b8 ^ b9);
            if (b9 == 16) {
                i9 += 2;
                bArr2[i12] = 16;
                i10 = i11;
            } else {
                i10 = i11;
                i9 = i12;
            }
        }
        bArr2[i9] = 16;
        bArr2[i9 + 1] = 3;
        int i13 = i9 + 3;
        bArr2[i9 + 2] = b8;
        if (b8 == 16) {
            bArr2[i13] = 16;
            i13 = i9 + 4;
        }
        return gVar.c(bArr2, i13);
    }

    private int a(g gVar, int i8, byte[] bArr, int i9) {
        while (true) {
            byte[] b8 = gVar.b(1, i9);
            if (b8 == null) {
                return -1002;
            }
            if (b8[0] == 16) {
                byte[] b9 = gVar.b(1, i9);
                if (b9 == null) {
                    return -1002;
                }
                if (b9[0] == 2) {
                    int i10 = 0;
                    byte b10 = 0;
                    int i11 = 0;
                    while (true) {
                        byte[] b11 = gVar.b(1, i9);
                        if (b11 == null) {
                            return -1;
                        }
                        byte b12 = b11[0];
                        if (b12 == 16) {
                            byte[] b13 = gVar.b(1, i9);
                            if (b13 == null) {
                                return -1;
                            }
                            b12 = b13[0];
                            if (b12 == 3) {
                                byte[] b14 = gVar.b(1, i9);
                                if (b14 == null) {
                                    return -1;
                                }
                                byte b15 = b14[0];
                                if (b15 == 16) {
                                    byte[] b16 = gVar.b(1, i9);
                                    if (b16 == null) {
                                        return -1;
                                    }
                                    b15 = b16[0];
                                    if (b15 != 16) {
                                        return -1004;
                                    }
                                }
                                return b15 == b10 ? i11 : ErrorCode.CODE_SERVER_ERROR;
                            }
                            if (b12 != 16) {
                                return -1004;
                            }
                        }
                        if (i11 >= i8) {
                            return ErrorCode.CODE_CHECK_SIGN_ERROR;
                        }
                        b10 = (byte) (b10 ^ b12);
                        bArr[i10] = b12;
                        i11++;
                        i10++;
                    }
                }
            }
        }
    }

    private int a(g gVar, int i8, byte[] bArr, int i9, byte[] bArr2, int i10) {
        int i11;
        if (b.a() == 1) {
            P = 256;
            i11 = 16;
        } else {
            if (b.a() < 2) {
                return -1;
            }
            P = 3840;
            i11 = 240;
        }
        Q = i11;
        int i12 = i8 % P;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = P;
            if (i13 >= i8 / i15) {
                break;
            }
            byte[] bArr3 = new byte[i15];
            System.arraycopy(bArr, i14, bArr3, 0, i15);
            b(gVar, i10, bArr3, P);
            i14 += P;
            i13++;
        }
        if (i12 != 0) {
            byte[] bArr4 = new byte[i12];
            System.arraycopy(bArr, i14, bArr4, 0, i12);
            b(gVar, i10, bArr4, i12);
        }
        return 0;
    }

    private void a(int i8, int i9, int i10, byte[] bArr) {
        bArr[0] = (byte) (h.a((h.a(h.a(0), 4) + h.a(String.valueOf(0), 1)) + h.a(String.valueOf(0), 3)) & 255);
        bArr[1] = (byte) (a() & 255);
        bArr[2] = (byte) (h.a(h.a(h.a(i8), 4) + h.a(h.a(i9), 4)) & 255);
        bArr[3] = (byte) (i10 & 255);
    }
}
