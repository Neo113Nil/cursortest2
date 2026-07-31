package t0;

import java.nio.ByteBuffer;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f21682a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f21683b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f21684c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f21685d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f21686e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f21687f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: t0.b$b, reason: collision with other inner class name */
    public static final class C0137b {

        /* renamed from: a, reason: collision with root package name */
        public final String f21688a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21689b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21690c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21691d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21692e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21693f;

        private C0137b(String str, int i7, int i8, int i9, int i10, int i11) {
            this.f21688a = str;
            this.f21689b = i7;
            this.f21691d = i8;
            this.f21690c = i9;
            this.f21692e = i10;
            this.f21693f = i11;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i7 = position; i7 <= limit; i7++) {
            if ((m0.I(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                return i7 - position;
            }
        }
        return -1;
    }

    private static int b(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 < 0) {
            return -1;
        }
        int[] iArr = f21683b;
        if (i7 >= iArr.length || i8 < 0) {
            return -1;
        }
        int[] iArr2 = f21687f;
        if (i9 >= iArr2.length) {
            return -1;
        }
        int i10 = iArr[i7];
        if (i10 == 44100) {
            return (iArr2[i9] + (i8 % 2)) * 2;
        }
        int i11 = f21686e[i9];
        return i10 == 32000 ? i11 * 6 : i11 * 4;
    }

    public static s1 c(o2.a0 a0Var, String str, String str2, v0.m mVar) {
        int i7 = f21683b[(a0Var.C() & 192) >> 6];
        int C = a0Var.C();
        int i8 = f21685d[(C & 56) >> 3];
        if ((C & 4) != 0) {
            i8++;
        }
        return new s1.b().S(str).e0("audio/ac3").H(i8).f0(i7).M(mVar).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f21682a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0137b e(o2.z zVar) {
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int h7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int e7 = zVar.e();
        zVar.r(40);
        boolean z6 = zVar.h(5) > 10;
        zVar.p(e7);
        int i17 = -1;
        if (z6) {
            zVar.r(16);
            int h8 = zVar.h(2);
            if (h8 == 0) {
                i17 = 0;
            } else if (h8 == 1) {
                i17 = 1;
            } else if (h8 == 2) {
                i17 = 2;
            }
            zVar.r(3);
            int h9 = (zVar.h(11) + 1) * 2;
            int h10 = zVar.h(2);
            if (h10 == 3) {
                i13 = f21684c[zVar.h(2)];
                h7 = 3;
                i12 = 6;
            } else {
                h7 = zVar.h(2);
                i12 = f21682a[h7];
                i13 = f21683b[h10];
            }
            int i18 = i12 * 256;
            int h11 = zVar.h(3);
            boolean g7 = zVar.g();
            int i19 = f21685d[h11] + (g7 ? 1 : 0);
            zVar.r(10);
            if (zVar.g()) {
                zVar.r(8);
            }
            if (h11 == 0) {
                zVar.r(5);
                if (zVar.g()) {
                    zVar.r(8);
                }
            }
            if (i17 == 1 && zVar.g()) {
                zVar.r(16);
            }
            if (zVar.g()) {
                if (h11 > 2) {
                    zVar.r(2);
                }
                if ((h11 & 1) == 0 || h11 <= 2) {
                    i15 = 6;
                } else {
                    i15 = 6;
                    zVar.r(6);
                }
                if ((h11 & 4) != 0) {
                    zVar.r(i15);
                }
                if (g7 && zVar.g()) {
                    zVar.r(5);
                }
                if (i17 == 0) {
                    if (zVar.g()) {
                        i16 = 6;
                        zVar.r(6);
                    } else {
                        i16 = 6;
                    }
                    if (h11 == 0 && zVar.g()) {
                        zVar.r(i16);
                    }
                    if (zVar.g()) {
                        zVar.r(i16);
                    }
                    int h12 = zVar.h(2);
                    if (h12 == 1) {
                        zVar.r(5);
                    } else if (h12 == 2) {
                        zVar.r(12);
                    } else if (h12 == 3) {
                        int h13 = zVar.h(5);
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                            }
                        }
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(7);
                                if (zVar.g()) {
                                    zVar.r(8);
                                }
                            }
                        }
                        zVar.r((h13 + 2) * 8);
                        zVar.c();
                    }
                    if (h11 < 2) {
                        if (zVar.g()) {
                            zVar.r(14);
                        }
                        if (h11 == 0 && zVar.g()) {
                            zVar.r(14);
                        }
                    }
                    if (zVar.g()) {
                        if (h7 == 0) {
                            zVar.r(5);
                        } else {
                            for (int i20 = 0; i20 < i12; i20++) {
                                if (zVar.g()) {
                                    zVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.g()) {
                zVar.r(5);
                if (h11 == 2) {
                    zVar.r(4);
                }
                if (h11 >= 6) {
                    zVar.r(2);
                }
                if (zVar.g()) {
                    zVar.r(8);
                }
                if (h11 == 0 && zVar.g()) {
                    zVar.r(8);
                }
                if (h10 < 3) {
                    zVar.q();
                }
            }
            if (i17 == 0 && h7 != 3) {
                zVar.q();
            }
            if (i17 == 2 && (h7 == 3 || zVar.g())) {
                i14 = 6;
                zVar.r(6);
            } else {
                i14 = 6;
            }
            str = (zVar.g() && zVar.h(i14) == 1 && zVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i10 = i17;
            i11 = i18;
            i7 = h9;
            i8 = i13;
            i9 = i19;
        } else {
            zVar.r(32);
            int h14 = zVar.h(2);
            String str2 = h14 == 3 ? null : "audio/ac3";
            int b7 = b(h14, zVar.h(6));
            zVar.r(8);
            int h15 = zVar.h(3);
            if ((h15 & 1) != 0 && h15 != 1) {
                zVar.r(2);
            }
            if ((h15 & 4) != 0) {
                zVar.r(2);
            }
            if (h15 == 2) {
                zVar.r(2);
            }
            int[] iArr = f21683b;
            str = str2;
            i7 = b7;
            i8 = h14 < iArr.length ? iArr[h14] : -1;
            i9 = f21685d[h15] + (zVar.g() ? 1 : 0);
            i10 = -1;
            i11 = 1536;
        }
        return new C0137b(str, i10, i9, i8, i7, i11);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return b((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static s1 g(o2.a0 a0Var, String str, String str2, v0.m mVar) {
        a0Var.P(2);
        int i7 = f21683b[(a0Var.C() & 192) >> 6];
        int C = a0Var.C();
        int i8 = f21685d[(C & 14) >> 1];
        if ((C & 1) != 0) {
            i8++;
        }
        if (((a0Var.C() & 30) >> 1) > 0 && (2 & a0Var.C()) != 0) {
            i8 += 2;
        }
        return new s1.b().S(str).e0((a0Var.a() <= 0 || (a0Var.C() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i8).f0(i7).M(mVar).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i7) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i7) + ((byteBuffer.get((byteBuffer.position() + i7) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
