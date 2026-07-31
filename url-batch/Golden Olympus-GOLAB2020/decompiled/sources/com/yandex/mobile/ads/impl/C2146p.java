package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.yb0;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2146p {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f30240a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f30241b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f30242c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f30243d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f30244e = {32, 40, 48, 56, 64, 80, 96, InterfaceC1490j3.d.b.f16818j, UserVerificationMethods.USER_VERIFY_PATTERN, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 320, 384, 448, UserVerificationMethods.USER_VERIFY_NONE, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f30245f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, IronSourceConstants.RV_CALLBACK_AD_CLICKED, 1253, 1393};

    /* renamed from: com.yandex.mobile.ads.impl.p$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f30246a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30247b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30248c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30249d;

        /* renamed from: e, reason: collision with root package name */
        public final int f30250e;

        private a(String str, int i4, int i5, int i6, int i7) {
            this.f30246a = str;
            this.f30248c = i4;
            this.f30247b = i5;
            this.f30249d = i6;
            this.f30250e = i7;
        }
    }

    private static int a(int i4, int i5) {
        int i6 = i5 / 2;
        if (i4 < 0) {
            return -1;
        }
        int[] iArr = f30241b;
        if (i4 >= 3 || i5 < 0) {
            return -1;
        }
        int[] iArr2 = f30245f;
        if (i6 >= 19) {
            return -1;
        }
        int i7 = iArr[i4];
        if (i7 == 44100) {
            return ((i5 % 2) + iArr2[i6]) * 2;
        }
        int i8 = f30244e[i6];
        return i7 == 32000 ? i8 * 6 : i8 * 4;
    }

    public static yb0 b(sf1 sf1Var, String str, String str2, u30 u30Var) {
        sf1Var.f(2);
        int i4 = f30241b[(sf1Var.t() & 192) >> 6];
        int t4 = sf1Var.t();
        int i5 = f30243d[(t4 & 14) >> 1];
        if ((t4 & 1) != 0) {
            i5++;
        }
        if (((sf1Var.t() & 30) >> 1) > 0 && (2 & sf1Var.t()) != 0) {
            i5 += 2;
        }
        return new yb0.a().b(str).e((sf1Var.a() <= 0 || (sf1Var.t() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").c(i5).l(i4).a(u30Var).d(str2).a();
    }

    public static yb0 a(sf1 sf1Var, String str, String str2, u30 u30Var) {
        int i4 = f30241b[(sf1Var.t() & 192) >> 6];
        int t4 = sf1Var.t();
        int i5 = f30243d[(t4 & 56) >> 3];
        if ((t4 & 4) != 0) {
            i5++;
        }
        return new yb0.a().b(str).e("audio/ac3").c(i5).l(i4).a(u30Var).d(str2).a();
    }

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f30240a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 1536;
    }

    public static a a(rf1 rf1Var) {
        int a4;
        int i4;
        int i5;
        int i6;
        String str;
        int b4;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int e4 = rf1Var.e();
        rf1Var.d(40);
        boolean z4 = rf1Var.b(5) > 10;
        rf1Var.c(e4);
        if (z4) {
            rf1Var.d(16);
            int b5 = rf1Var.b(2);
            if (b5 == 0) {
                r1 = 0;
            } else if (b5 == 1) {
                r1 = 1;
            } else if (b5 == 2) {
                r1 = 2;
            }
            rf1Var.d(3);
            a4 = (rf1Var.b(11) + 1) * 2;
            int b6 = rf1Var.b(2);
            if (b6 == 3) {
                i6 = f30242c[rf1Var.b(2)];
                i7 = 6;
                b4 = 3;
            } else {
                b4 = rf1Var.b(2);
                i7 = f30240a[b4];
                i6 = f30241b[b6];
            }
            i5 = i7 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
            int b7 = rf1Var.b(3);
            boolean f4 = rf1Var.f();
            i4 = f30243d[b7] + (f4 ? 1 : 0);
            rf1Var.d(10);
            if (rf1Var.f()) {
                rf1Var.d(8);
            }
            if (b7 == 0) {
                rf1Var.d(5);
                if (rf1Var.f()) {
                    rf1Var.d(8);
                }
            }
            if (r1 == 1 && rf1Var.f()) {
                rf1Var.d(16);
            }
            if (rf1Var.f()) {
                if (b7 > 2) {
                    rf1Var.d(2);
                }
                if ((b7 & 1) == 0 || b7 <= 2) {
                    i9 = 6;
                } else {
                    i9 = 6;
                    rf1Var.d(6);
                }
                if ((b7 & 4) != 0) {
                    rf1Var.d(i9);
                }
                if (f4 && rf1Var.f()) {
                    rf1Var.d(5);
                }
                if (r1 == 0) {
                    if (rf1Var.f()) {
                        i10 = 6;
                        rf1Var.d(6);
                    } else {
                        i10 = 6;
                    }
                    if (b7 == 0 && rf1Var.f()) {
                        rf1Var.d(i10);
                    }
                    if (rf1Var.f()) {
                        rf1Var.d(i10);
                    }
                    int b8 = rf1Var.b(2);
                    if (b8 == 1) {
                        rf1Var.d(5);
                    } else if (b8 == 2) {
                        rf1Var.d(12);
                    } else if (b8 == 3) {
                        int b9 = rf1Var.b(5);
                        if (rf1Var.f()) {
                            rf1Var.d(5);
                            if (rf1Var.f()) {
                                rf1Var.d(4);
                            }
                            if (rf1Var.f()) {
                                rf1Var.d(4);
                            }
                            if (rf1Var.f()) {
                                rf1Var.d(4);
                            }
                            if (rf1Var.f()) {
                                rf1Var.d(4);
                            }
                            if (rf1Var.f()) {
                                rf1Var.d(4);
                            }
                            if (rf1Var.f()) {
                                rf1Var.d(4);
                            }
                            if (rf1Var.f()) {
                                rf1Var.d(4);
                            }
                            if (rf1Var.f()) {
                                if (rf1Var.f()) {
                                    rf1Var.d(4);
                                }
                                if (rf1Var.f()) {
                                    rf1Var.d(4);
                                }
                            }
                        }
                        if (rf1Var.f()) {
                            rf1Var.d(5);
                            if (rf1Var.f()) {
                                rf1Var.d(7);
                                if (rf1Var.f()) {
                                    rf1Var.d(8);
                                }
                            }
                        }
                        rf1Var.d((b9 + 2) * 8);
                        rf1Var.c();
                    }
                    if (b7 < 2) {
                        if (rf1Var.f()) {
                            rf1Var.d(14);
                        }
                        if (b7 == 0 && rf1Var.f()) {
                            rf1Var.d(14);
                        }
                    }
                    if (rf1Var.f()) {
                        if (b4 == 0) {
                            rf1Var.d(5);
                        } else {
                            for (int i11 = 0; i11 < i7; i11++) {
                                if (rf1Var.f()) {
                                    rf1Var.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (rf1Var.f()) {
                rf1Var.d(5);
                if (b7 == 2) {
                    rf1Var.d(4);
                }
                if (b7 >= 6) {
                    rf1Var.d(2);
                }
                if (rf1Var.f()) {
                    rf1Var.d(8);
                }
                if (b7 == 0 && rf1Var.f()) {
                    rf1Var.d(8);
                }
                if (b6 < 3) {
                    rf1Var.h();
                }
            }
            if (r1 == 0 && b4 != 3) {
                rf1Var.h();
            }
            if (r1 == 2 && (b4 == 3 || rf1Var.f())) {
                i8 = 6;
                rf1Var.d(6);
            } else {
                i8 = 6;
            }
            if (rf1Var.f() && rf1Var.b(i8) == 1 && rf1Var.b(8) == 1) {
                str2 = "audio/eac3-joc";
            } else {
                str2 = "audio/eac3";
            }
            str = str2;
        } else {
            rf1Var.d(32);
            int b10 = rf1Var.b(2);
            String str3 = b10 == 3 ? null : "audio/ac3";
            a4 = a(b10, rf1Var.b(6));
            rf1Var.d(8);
            int b11 = rf1Var.b(3);
            if ((b11 & 1) != 0 && b11 != 1) {
                rf1Var.d(2);
            }
            if ((b11 & 4) != 0) {
                rf1Var.d(2);
            }
            if (b11 == 2) {
                rf1Var.d(2);
            }
            r1 = b10 < 3 ? f30241b[b10] : -1;
            i4 = f30243d[b11] + (rf1Var.f() ? 1 : 0);
            i5 = 1536;
            i6 = r1;
            str = str3;
        }
        return new a(str, i4, i6, a4, i5);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b4 = bArr[4];
        return a((b4 & 192) >> 6, b4 & 63);
    }
}
