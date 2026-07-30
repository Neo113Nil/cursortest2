package com.google.android.gms.internal.ads;

import O7.AbstractC0399y;
import O7.EnumC0398x;
import O7.InterfaceC0397w;
import android.content.Context;
import com.anythink.expressad.foundation.h.p;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class PA implements R0 {

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ int f26867S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f26868T = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26875n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f26869u = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f26870v = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f26871w = {64, 112, 128, 192, 224, 256, 384, p.a.f19833a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f26872x = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f26873y = {5, 8, 10, 12};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f26874z = {6, 9, 12, 15};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f26850A = {2, 4, 6, 8};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f26851B = {9, 11, 13, 16};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f26852C = {5, 8, 10, 12};

    /* renamed from: D, reason: collision with root package name */
    public static final C3398j5 f26853D = new C3398j5("gads:sdk_csi_server", "https://csi.gstatic.com/csi", 4);

    /* renamed from: E, reason: collision with root package name */
    public static final C3940t8 f26854E = new C3940t8(6);

    /* renamed from: F, reason: collision with root package name */
    public static final C3940t8 f26855F = new C3940t8(16);

    /* renamed from: G, reason: collision with root package name */
    public static final C2945am f26856G = new C2945am(0);

    /* renamed from: H, reason: collision with root package name */
    public static final C2945am f26857H = new C2945am(11);

    /* renamed from: I, reason: collision with root package name */
    public static final C2945am f26858I = new C2945am(17);
    public static final C2945am J = new C2945am(22);

    /* renamed from: K, reason: collision with root package name */
    public static final C3225ft f26859K = new C3225ft(3);

    /* renamed from: L, reason: collision with root package name */
    public static final C3225ft f26860L = new C3225ft(9);

    /* renamed from: M, reason: collision with root package name */
    public static final C3225ft f26861M = new C3225ft(14);

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f26862N = {0, 0, 0, 1};

    /* renamed from: O, reason: collision with root package name */
    public static final float[] f26863O = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: P, reason: collision with root package name */
    public static final Object f26864P = new Object();

    /* renamed from: Q, reason: collision with root package name */
    public static int[] f26865Q = new int[10];

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f26866R = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public /* synthetic */ PA(int i) {
        this.f26875n = i;
    }

    public static String B(String[] strArr, int i, int i4) {
        int i9 = i4 + i;
        if (strArr.length < i9) {
            int i10 = t2.C.f40822b;
            u2.i.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i11 = i9 - 1;
            if (i >= i11) {
                sb.append(strArr[i11]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static long C(int i, long j9) {
        if (i == 1) {
            return j9;
        }
        int i4 = i >> 1;
        long j10 = (j9 * j9) % 1073807359;
        return (i & 1) == 0 ? C(i4, j10) % 1073807359 : ((C(i4, j10) % 1073807359) * j9) % 1073807359;
    }

    public static long D(ByteBuffer byteBuffer) {
        long g9 = g(byteBuffer) << 32;
        if (g9 >= 0) {
            return g(byteBuffer) + g9;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static void E(int i, String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC3194fG.u(str, Integer.valueOf(i)));
        }
    }

    public static boolean F(byte[] bArr, int i, TP tp) {
        int i4;
        String str = tp.f27776o;
        if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8608h)) {
            byte b9 = bArr[4];
            if (((b9 & 96) >> 5) == 0 && ((i4 = b9 & 31) == 1 || i4 == 9 || i4 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, com.anythink.basead.exoplayer.k.o.i)) {
            W2.b Y = Y(new B0(bArr, 4, i + 4));
            int i9 = Y.f3423a;
            if (i9 == 35) {
                return false;
            }
            if (i9 <= 14 && i9 % 2 == 0) {
                if (Y.f3425c == tp.f27753F - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static double G(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static long H(String[] strArr, int i) {
        long c4 = (AbstractC3217fl.c(strArr[0]) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i; i4++) {
            c4 = (((AbstractC3217fl.c(strArr[i4]) + 2147483647L) % 1073807359) + ((c4 * 16785407) % 1073807359)) % 1073807359;
        }
        return c4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3834rA I(byte[] bArr, int i, int i4) {
        int n9;
        int i9;
        int i10;
        int n10;
        int i11;
        int n11;
        boolean k6;
        int i12;
        int i13;
        int i14;
        float f6;
        int i15;
        int i16;
        int i17;
        float f9;
        int i18;
        int i19;
        int i20;
        boolean k9;
        boolean k10;
        int i21;
        B0 b02 = new B0(bArr, i, i4);
        int l9 = b02.l(8);
        int l10 = b02.l(8);
        int l11 = b02.l(8);
        int n12 = b02.n();
        if (l9 != 100 && l9 != 110 && l9 != 122 && l9 != 244 && l9 != 44 && l9 != 83 && l9 != 86 && l9 != 118 && l9 != 128) {
            if (l9 != 138) {
                n9 = 1;
                i10 = 16;
                i11 = 0;
                n10 = 0;
                b02.n();
                n11 = b02.n();
                if (n11 != 0) {
                    b02.n();
                } else if (n11 == 1) {
                    b02.k();
                    b02.m();
                    b02.m();
                    long n13 = b02.n();
                    for (int i22 = 0; i22 < n13; i22++) {
                        b02.n();
                    }
                }
                b02.n();
                b02.f();
                int n14 = b02.n() + 1;
                int n15 = b02.n() + 1;
                k6 = b02.k();
                int i23 = 2 - (k6 ? 1 : 0);
                if (!k6) {
                    b02.f();
                }
                b02.f();
                int i24 = n14 * 16;
                int i25 = n15 * i23 * 16;
                if (b02.k()) {
                    int n16 = b02.n();
                    int n17 = b02.n();
                    int n18 = b02.n();
                    int n19 = b02.n();
                    if (n9 == 0) {
                        i21 = 1;
                    } else {
                        i21 = n9 == 3 ? 1 : 2;
                        i23 *= n9 == 1 ? 2 : 1;
                    }
                    i24 -= (n16 + n17) * i21;
                    i25 -= (n18 + n19) * i23;
                }
                int i26 = i25;
                int i27 = i24;
                if (l9 != 44 || l9 == 86 || l9 == 100 || l9 == 110 || l9 == 122) {
                    i12 = l9;
                } else {
                    i12 = 244;
                    if (l9 != 244) {
                        i13 = i10;
                        if (b02.k()) {
                            if (b02.k()) {
                                int l12 = b02.l(8);
                                if (l12 == 255) {
                                    int i28 = i10;
                                    int l13 = b02.l(i28);
                                    int l14 = b02.l(i28);
                                    if (l13 != 0 && l14 != 0) {
                                        f9 = l13 / l14;
                                        if (b02.k()) {
                                            b02.f();
                                        }
                                        if (b02.k()) {
                                            b02.h(3);
                                            int i29 = true != b02.k() ? 2 : 1;
                                            if (b02.k()) {
                                                int l15 = b02.l(8);
                                                int l16 = b02.l(8);
                                                b02.h(8);
                                                int b9 = C2980bK.b(l15);
                                                int i30 = i29;
                                                i19 = C2980bK.c(l16);
                                                i18 = b9;
                                                i20 = i30;
                                            } else {
                                                i20 = i29;
                                                i18 = -1;
                                                i19 = -1;
                                            }
                                        } else {
                                            i18 = -1;
                                            i19 = -1;
                                            i20 = -1;
                                        }
                                        if (b02.k()) {
                                            b02.n();
                                            b02.n();
                                        }
                                        if (b02.k()) {
                                            b02.h(65);
                                        }
                                        k9 = b02.k();
                                        if (k9) {
                                            e0(b02);
                                        }
                                        k10 = b02.k();
                                        if (k10) {
                                            e0(b02);
                                        }
                                        if (!k9 || k10) {
                                            b02.f();
                                        }
                                        b02.f();
                                        if (b02.k()) {
                                            b02.f();
                                            b02.n();
                                            b02.n();
                                            b02.n();
                                            b02.n();
                                            i13 = b02.n();
                                            b02.n();
                                        }
                                        i15 = i18;
                                        i16 = i20;
                                        i14 = i13;
                                        f6 = f9;
                                        i17 = i19;
                                    }
                                } else if (l12 < 17) {
                                    f9 = f26863O[l12];
                                    if (b02.k()) {
                                    }
                                    if (b02.k()) {
                                    }
                                    if (b02.k()) {
                                    }
                                    if (b02.k()) {
                                    }
                                    k9 = b02.k();
                                    if (k9) {
                                    }
                                    k10 = b02.k();
                                    if (k10) {
                                    }
                                    if (!k9) {
                                    }
                                    b02.f();
                                    b02.f();
                                    if (b02.k()) {
                                    }
                                    i15 = i18;
                                    i16 = i20;
                                    i14 = i13;
                                    f6 = f9;
                                    i17 = i19;
                                } else {
                                    com.anythink.basead.b.c.i.s(l12, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil", new StringBuilder(String.valueOf(l12).length() + 35));
                                }
                            }
                            f9 = 1.0f;
                            if (b02.k()) {
                            }
                            if (b02.k()) {
                            }
                            if (b02.k()) {
                            }
                            if (b02.k()) {
                            }
                            k9 = b02.k();
                            if (k9) {
                            }
                            k10 = b02.k();
                            if (k10) {
                            }
                            if (!k9) {
                            }
                            b02.f();
                            b02.f();
                            if (b02.k()) {
                            }
                            i15 = i18;
                            i16 = i20;
                            i14 = i13;
                            f6 = f9;
                            i17 = i19;
                        } else {
                            i14 = i13;
                            f6 = 1.0f;
                            i15 = -1;
                            i16 = -1;
                            i17 = -1;
                        }
                        return new C3834rA(l9, l10, l11, n12, i27, i26, f6, i11, n10, i15, i16, i17, i14);
                    }
                }
                if ((l10 & 16) == 0) {
                    l9 = i12;
                    i13 = 0;
                } else {
                    i13 = i10;
                    l9 = i12;
                }
                if (b02.k()) {
                }
                return new C3834rA(l9, l10, l11, n12, i27, i26, f6, i11, n10, i15, i16, i17, i14);
            }
            l9 = 138;
        }
        n9 = b02.n();
        if (n9 == 3) {
            b02.k();
            i9 = 3;
        } else {
            i9 = n9;
        }
        i10 = 16;
        int n20 = b02.n();
        n10 = b02.n();
        b02.f();
        if (b02.k()) {
            int i31 = i9 != 3 ? 8 : 12;
            int i32 = 0;
            while (i32 < i31) {
                if (b02.k()) {
                    int i33 = i32 < 6 ? 16 : 64;
                    int i34 = 8;
                    int i35 = 8;
                    for (int i36 = 0; i36 < i33; i36++) {
                        if (i34 != 0) {
                            i34 = ((b02.m() + i35) + 256) % 256;
                        }
                        if (i34 != 0) {
                            i35 = i34;
                        }
                    }
                }
                i32++;
            }
        }
        i11 = n20;
        b02.n();
        n11 = b02.n();
        if (n11 != 0) {
        }
        b02.n();
        b02.f();
        int n142 = b02.n() + 1;
        int n152 = b02.n() + 1;
        k6 = b02.k();
        int i232 = 2 - (k6 ? 1 : 0);
        if (!k6) {
        }
        b02.f();
        int i242 = n142 * 16;
        int i252 = n152 * i232 * 16;
        if (b02.k()) {
        }
        int i262 = i252;
        int i272 = i242;
        if (l9 != 44) {
        }
        i12 = l9;
        if ((l10 & 16) == 0) {
        }
        if (b02.k()) {
        }
        return new C3834rA(l9, l10, l11, n12, i272, i262, f6, i11, n10, i15, i16, i17, i14);
    }

    public static void J(boolean z8, String str, long j9) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC3194fG.u(str, Long.valueOf(j9)));
        }
    }

    public static double K(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2518Df L(byte[] bArr, int i, int i4) {
        int[] iArr;
        Vy vy;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z8;
        boolean z9;
        int i13;
        int[] iArr2;
        boolean[][] zArr;
        int i14;
        C3675oC c3675oC;
        boolean[][] zArr2;
        int[] iArr3;
        int i15;
        int i16;
        int i17;
        boolean k6;
        int i18;
        int i19;
        int i20;
        int i21;
        int n9;
        int i22;
        int i23;
        boolean z10;
        boolean z11;
        B0 b02 = new B0(bArr, i, i4);
        Y(b02);
        b02.h(4);
        boolean k9 = b02.k();
        boolean k10 = b02.k();
        int l9 = b02.l(6);
        int i24 = l9 + 1;
        int l10 = b02.l(3);
        b02.h(17);
        Ky Z8 = Z(b02, true, l10, null);
        for (int i25 = true != b02.k() ? l10 : 0; i25 <= l10; i25++) {
            b02.n();
            b02.n();
            b02.n();
        }
        int l11 = b02.l(6);
        int n10 = b02.n() + 1;
        int i26 = 6;
        int i27 = 1;
        Vy vy2 = new Vy(UB.j(Z8), new int[1], 0);
        boolean z12 = i24 >= 2 && n10 >= 2;
        boolean z13 = k9 && k10;
        int i28 = l11 + 1;
        if (!z12 || !z13 || i28 < i24) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, n10, i28);
        int[] iArr5 = new int[n10];
        int[] iArr6 = new int[n10];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i29 = 1; i29 < n10; i29++) {
            int i30 = 0;
            for (int i31 = 0; i31 <= l11; i31++) {
                if (b02.k()) {
                    iArr4[i29][i30] = i31;
                    iArr6[i29] = i31;
                    i30++;
                }
                iArr5[i29] = i30;
            }
        }
        if (b02.k()) {
            b02.h(64);
            if (b02.k()) {
                b02.n();
            }
            int n11 = b02.n();
            int i32 = 0;
            while (i32 < n11) {
                b02.n();
                if (i32 == 0 || b02.k()) {
                    boolean k11 = b02.k();
                    boolean k12 = b02.k();
                    z11 = k11;
                    z10 = k12;
                    if (k11 || k12) {
                        k6 = b02.k();
                        if (k6) {
                            b02.h(19);
                        }
                        b02.h(8);
                        if (k6) {
                            b02.h(4);
                        }
                        b02.h(15);
                        i19 = k11;
                        i18 = k12;
                        i20 = 0;
                        while (i20 <= l10) {
                            if (b02.k() || b02.k()) {
                                b02.n();
                            } else if (b02.k()) {
                                i21 = i32;
                                n9 = 0;
                                int[][] iArr7 = iArr4;
                                i22 = i19 + i18;
                                int[] iArr8 = iArr6;
                                i23 = 0;
                                while (i23 < i22) {
                                    int i33 = i22;
                                    for (int i34 = 0; i34 <= n9; i34++) {
                                        b02.n();
                                        b02.n();
                                        if (k6) {
                                            b02.n();
                                            b02.n();
                                        }
                                        b02.f();
                                    }
                                    i23++;
                                    i22 = i33;
                                }
                                i20++;
                                iArr4 = iArr7;
                                i32 = i21;
                                iArr6 = iArr8;
                            }
                            i21 = i32;
                            n9 = b02.n();
                            int[][] iArr72 = iArr4;
                            i22 = i19 + i18;
                            int[] iArr82 = iArr6;
                            i23 = 0;
                            while (i23 < i22) {
                            }
                            i20++;
                            iArr4 = iArr72;
                            i32 = i21;
                            iArr6 = iArr82;
                        }
                        i32++;
                    }
                } else {
                    z11 = false;
                    z10 = false;
                }
                k6 = false;
                i19 = z11;
                i18 = z10;
                i20 = 0;
                while (i20 <= l10) {
                }
                i32++;
            }
        }
        int[][] iArr9 = iArr4;
        int[] iArr10 = iArr6;
        if (!b02.k()) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        int i35 = b02.f23941x;
        if (i35 > 0) {
            b02.h(8 - i35);
        }
        Ky Z9 = Z(b02, false, l10, Z8);
        boolean k13 = b02.k();
        boolean[] zArr3 = new boolean[16];
        int i36 = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            boolean k14 = b02.k();
            zArr3[i37] = k14;
            if (k14) {
                i36++;
            }
        }
        if (i36 == 0 || !zArr3[1]) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        int i38 = i36 + 1;
        int[] iArr11 = new int[i36];
        for (int i39 = 0; i39 < i36 - (k13 ? 1 : 0); i39++) {
            iArr11[i39] = b02.l(3);
        }
        int[] iArr12 = new int[i38];
        if (k13) {
            for (int i40 = 1; i40 < i36; i40++) {
                for (int i41 = 0; i41 < i40; i41++) {
                    iArr12[i40] = iArr11[i41] + 1 + iArr12[i40];
                }
            }
            iArr12[i36] = 6;
        }
        int[][] iArr13 = (int[][]) Array.newInstance((Class<?>) cls, i24, i36);
        int[] iArr14 = new int[i24];
        iArr14[0] = 0;
        boolean k15 = b02.k();
        int i42 = 1;
        while (i42 < i24) {
            if (k15) {
                iArr14[i42] = b02.l(i26);
            } else {
                iArr14[i42] = i42;
            }
            if (k13) {
                i17 = i42;
                for (int i43 = 0; i43 < i36; i43++) {
                    iArr13[i17][i43] = (iArr14[i17] & ((1 << iArr12[r32]) - 1)) >> iArr12[i43];
                }
            } else {
                int i44 = 0;
                while (i44 < i36) {
                    iArr13[i42][i44] = b02.l(iArr11[i44] + 1);
                    i44++;
                    i42 = i42;
                }
                i17 = i42;
            }
            i42 = i17 + 1;
            i26 = 6;
        }
        int[] iArr15 = new int[i28];
        int i45 = 1;
        int i46 = 0;
        while (i46 < i24) {
            iArr15[iArr14[i46]] = -1;
            int[] iArr16 = iArr15;
            int i47 = 0;
            int i48 = 0;
            while (i47 < 16) {
                if (zArr3[i47]) {
                    i16 = i27;
                    if (i47 == i16) {
                        iArr16[iArr14[i46]] = iArr13[i46][i48];
                        i47 = i16;
                    }
                    i48++;
                } else {
                    i16 = i27;
                }
                i47 += i16;
                i27 = i16;
            }
            if (i46 > 0) {
                int i49 = 0;
                while (true) {
                    if (i49 >= i46) {
                        i45++;
                        break;
                    }
                    int i50 = i49;
                    if (iArr16[iArr14[i46]] == iArr16[iArr14[i49]]) {
                        break;
                    }
                    i49 = i50 + 1;
                }
            }
            i46++;
            iArr15 = iArr16;
            i27 = 1;
        }
        int[] iArr17 = iArr15;
        int l12 = b02.l(4);
        if (i45 < 2 || l12 == 0) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        int[] iArr18 = new int[i45];
        for (int i51 = 0; i51 < i45; i51++) {
            iArr18[i51] = b02.l(l12);
        }
        int[] iArr19 = new int[i28];
        int i52 = 0;
        while (i52 < i24) {
            int[] iArr20 = iArr19;
            iArr20[Math.min(iArr14[i52], l11)] = i52;
            i52++;
            iArr19 = iArr20;
        }
        int[] iArr21 = iArr19;
        AbstractC2720Pd.p(4, "initialCapacity");
        int i53 = i45;
        Object[] objArr = new Object[4];
        int i54 = 0;
        int i55 = 0;
        while (i55 <= l11) {
            int[] iArr22 = iArr14;
            int i56 = i55;
            int min = Math.min(iArr17[i55], i53 - 1);
            int[] iArr23 = iArr5;
            C3230fy c3230fy = new C3230fy(iArr21[i56], min >= 0 ? iArr18[min] : -1);
            int length = objArr.length;
            int i57 = i54 + 1;
            int d2 = PB.d(length, i57);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i54] = c3230fy;
            i55 = i56 + 1;
            i54 = i57;
            iArr14 = iArr22;
            iArr5 = iArr23;
        }
        int[] iArr24 = iArr14;
        int[] iArr25 = iArr5;
        C3675oC p6 = UB.p(objArr, i54);
        if (((C3230fy) p6.get(0)).f30923b == -1) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        int i58 = 1;
        while (true) {
            if (i58 > l11) {
                i58 = -1;
                break;
            }
            if (((C3230fy) p6.get(i58)).f30923b != -1) {
                break;
            }
            i58++;
        }
        if (i58 == -1) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        int i59 = 1;
        while (i59 < i24) {
            boolean[][] zArr6 = zArr5;
            for (int i60 = 0; i60 < i59; i60++) {
                boolean[] zArr7 = zArr4[i59];
                boolean[] zArr8 = zArr6[i59];
                boolean k16 = b02.k();
                zArr8[i60] = k16;
                zArr7[i60] = k16;
            }
            i59++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i61 = 1; i61 < i24; i61++) {
            int i62 = 0;
            while (i62 < l9) {
                boolean[][] zArr10 = zArr4;
                int i63 = 0;
                while (true) {
                    if (i63 < i61) {
                        boolean[] zArr11 = zArr9[i61];
                        if (zArr11[i63] && zArr9[i63][i62]) {
                            zArr11[i62] = true;
                            break;
                        }
                        i63++;
                    }
                }
                i62++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = new int[i28];
        for (int i64 = 0; i64 < i24; i64++) {
            int i65 = 0;
            for (int i66 = 0; i66 < i64; i66++) {
                i65 += zArr12[i64][i66] ? 1 : 0;
            }
            iArr26[iArr24[i64]] = i65;
        }
        int i67 = 0;
        for (int i68 = 0; i68 < i24; i68++) {
            if (iArr26[iArr24[i68]] == 0) {
                i67++;
            }
        }
        if (i67 > 1) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        int[] iArr27 = new int[i24];
        int[] iArr28 = new int[n10];
        if (b02.k()) {
            iArr = iArr26;
            int i69 = 0;
            while (i69 < i24) {
                int i70 = i69;
                iArr27[i70] = b02.l(3);
                i69 = i70 + 1;
            }
        } else {
            iArr = iArr26;
            Arrays.fill(iArr27, 0, i24, l10);
        }
        int i71 = 0;
        while (i71 < n10) {
            int i72 = i71;
            int[] iArr29 = iArr27;
            int[] iArr30 = iArr28;
            int i73 = 0;
            for (int i74 = 0; i74 < iArr25[i72]; i74++) {
                i73 = Math.max(i73, iArr29[((C3230fy) p6.get(iArr9[i72][i74])).f30922a]);
            }
            iArr30[i72] = i73 + 1;
            i71 = i72 + 1;
            iArr27 = iArr29;
            iArr28 = iArr30;
        }
        int[] iArr31 = iArr28;
        if (b02.k()) {
            int i75 = 0;
            while (i75 < l9) {
                int i76 = i75 + 1;
                int i77 = i76;
                while (i77 < i24) {
                    if (zArr12[i77][i75]) {
                        i15 = l9;
                        b02.h(3);
                    } else {
                        i15 = l9;
                    }
                    i77++;
                    l9 = i15;
                }
                i75 = i76;
            }
        }
        b02.f();
        int n12 = b02.n() + 1;
        RB rb = new RB(4);
        rb.a(Z8);
        if (n12 > 1) {
            rb.a(Z9);
            for (int i78 = 2; i78 < n12; i78++) {
                Z9 = Z(b02, b02.k(), l10, Z9);
                rb.a(Z9);
            }
        }
        C3675oC f6 = rb.f();
        int n13 = b02.n() + n10;
        if (n13 > n10) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        int l13 = b02.l(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, n13, i28);
        int[] iArr32 = new int[n13];
        int i79 = 0;
        int[] iArr33 = new int[n13];
        int i80 = 0;
        while (i80 < n10) {
            iArr32[i80] = i79;
            int i81 = i80;
            int i82 = iArr10[i81];
            iArr33[i81] = i82;
            if (l13 == 0) {
                zArr2 = zArr13;
                c3675oC = f6;
                iArr3 = iArr32;
                Arrays.fill(zArr13[i81], i79, iArr25[i81], true);
                iArr3[i81] = iArr25[i81];
            } else {
                c3675oC = f6;
                zArr2 = zArr13;
                iArr3 = iArr32;
                if (l13 == 1) {
                    for (int i83 = 0; i83 < iArr25[i81]; i83++) {
                        zArr2[i81][i83] = iArr9[i81][i83] == i82;
                    }
                    iArr3[i81] = 1;
                } else {
                    i79 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i80 = i81 + 1;
                    zArr13 = zArr2;
                    iArr32 = iArr3;
                    f6 = c3675oC;
                }
            }
            i79 = 0;
            i80 = i81 + 1;
            zArr13 = zArr2;
            iArr32 = iArr3;
            f6 = c3675oC;
        }
        C3675oC c3675oC2 = f6;
        boolean[][] zArr14 = zArr13;
        int[] iArr34 = iArr32;
        int[] iArr35 = new int[i28];
        int i84 = 2;
        int[] iArr36 = new int[2];
        iArr36[1] = i28;
        iArr36[i79] = n13;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr36);
        int i85 = 1;
        int i86 = 0;
        while (i85 < n13) {
            if (l13 == i84) {
                for (int i87 = 0; i87 < iArr25[i85]; i87++) {
                    zArr14[i85][i87] = b02.k();
                    int i88 = iArr34[i85];
                    boolean z14 = zArr14[i85][i87];
                    iArr34[i85] = i88 + (z14 ? 1 : 0);
                    if (z14) {
                        iArr33[i85] = iArr9[i85][i87];
                    }
                }
            }
            if (i86 == 0) {
                i13 = 0;
                if (iArr9[i85][0] == 0 && zArr14[i85][0]) {
                    i86 = 0;
                    for (int i89 = 1; i89 < iArr25[i85]; i89++) {
                        if (iArr9[i85][i89] == i58 && zArr14[i85][i58]) {
                            i86 = i85;
                        }
                    }
                } else {
                    i86 = 0;
                }
            } else {
                i13 = 0;
            }
            int i90 = i13;
            while (i90 < iArr25[i85]) {
                if (n12 > 1) {
                    zArr15[i85][i90] = zArr14[i85][i90];
                    iArr2 = iArr35;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int b9 = QC.b(n12);
                    if (!zArr[i85][i90]) {
                        C3230fy c3230fy2 = (C3230fy) p6.get(iArr9[i85][i90]);
                        i14 = n12;
                        int i91 = i13;
                        while (true) {
                            if (i91 >= i90) {
                                break;
                            }
                            int i92 = i91;
                            if (zArr9[c3230fy2.f30922a][((C3230fy) p6.get(iArr9[i85][i92])).f30922a]) {
                                zArr[i85][i90] = true;
                                break;
                            }
                            i91 = i92 + 1;
                        }
                    } else {
                        i14 = n12;
                    }
                    if (zArr[i85][i90]) {
                        if (i86 <= 0 || i85 != i86) {
                            b02.h(b9);
                        } else {
                            iArr2[i90] = b02.l(b9);
                        }
                    }
                } else {
                    iArr2 = iArr35;
                    zArr = zArr15;
                    i14 = n12;
                }
                i90++;
                iArr35 = iArr2;
                zArr15 = zArr;
                n12 = i14;
            }
            int[] iArr37 = iArr35;
            boolean[][] zArr16 = zArr15;
            int i93 = n12;
            if (iArr34[i85] == 1 && iArr[iArr33[i85]] > 0) {
                b02.f();
            }
            i85++;
            iArr35 = iArr37;
            zArr15 = zArr16;
            n12 = i93;
            i84 = 2;
        }
        int[] iArr38 = iArr35;
        boolean[][] zArr17 = zArr15;
        if (i86 == 0) {
            return new C2518Df((C3675oC) null, vy2, (Vy) null, (Vy) null);
        }
        int n14 = b02.n();
        int i94 = n14 + 1;
        AbstractC2720Pd.p(i94, "expectedSize");
        AbstractC2720Pd.p(i94, "initialCapacity");
        int[] iArr39 = new int[i24];
        Object[] objArr2 = new Object[i94];
        int i95 = 0;
        int i96 = 0;
        boolean z15 = false;
        while (i95 < i94) {
            int l14 = b02.l(16);
            int l15 = b02.l(16);
            if (b02.k()) {
                i9 = i95;
                i10 = b02.l(2);
                if (i10 == 3) {
                    b02.f();
                }
                i11 = b02.l(4);
                i12 = b02.l(4);
            } else {
                i9 = i95;
                i10 = 0;
                i11 = 0;
                i12 = 0;
            }
            if (b02.k()) {
                int n15 = b02.n();
                int n16 = b02.n();
                int n17 = b02.n();
                int n18 = b02.n();
                z8 = z15;
                l14 -= (n15 + n16) * ((i10 == 1 || i10 == 2) ? 2 : 1);
                l15 -= (n17 + n18) * (i10 == 1 ? 2 : 1);
            } else {
                z8 = z15;
            }
            C3231fz c3231fz = new C3231fz(i10, i11, i12, l14, l15);
            int length2 = objArr2.length;
            int d3 = PB.d(length2, i96 + 1);
            if (d3 > length2 || z8) {
                objArr2 = Arrays.copyOf(objArr2, d3);
                z9 = false;
            } else {
                z9 = z8;
            }
            objArr2[i96] = c3231fz;
            i96++;
            i95 = i9 + 1;
            z15 = z9;
        }
        if (i94 <= 1 || !b02.k()) {
            for (int i97 = 1; i97 < i24; i97++) {
                iArr39[i97] = Math.min(i97, n14);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int b10 = QC.b(i94);
            for (int i98 = 1; i98 < i24; i98++) {
                iArr39[i98] = b02.l(b10);
            }
        }
        Vy vy3 = new Vy(UB.p(objArr2, i96), iArr39, 1);
        b02.h(2);
        for (int i99 = 1; i99 < i24; i99++) {
            if (iArr[iArr24[i99]] == 0) {
                b02.f();
            }
        }
        for (int i100 = 1; i100 < n13; i100++) {
            boolean k17 = b02.k();
            int i101 = 0;
            while (i101 < iArr31[i100]) {
                if ((i101 <= 0 || !k17) ? i101 == 0 : b02.k()) {
                    for (int i102 = 0; i102 < iArr25[i100]; i102++) {
                        if (zArr17[i100][i102]) {
                            b02.n();
                        }
                    }
                    b02.n();
                    b02.n();
                }
                i101++;
            }
        }
        int n19 = b02.n() + 2;
        if (b02.k()) {
            b02.h(n19);
        } else {
            for (int i103 = 1; i103 < i24; i103++) {
                for (int i104 = 0; i104 < i103; i104++) {
                    if (zArr12[i103][i104]) {
                        b02.h(n19);
                    }
                }
            }
        }
        int n20 = b02.n();
        for (int i105 = 1; i105 <= n20; i105++) {
            b02.h(8);
        }
        if (b02.k()) {
            int i106 = b02.f23941x;
            if (i106 > 0) {
                b02.h(8 - i106);
            }
            if (b02.k() || b02.k()) {
                b02.f();
            }
            boolean k18 = b02.k();
            boolean k19 = b02.k();
            if (k18 || k19) {
                for (int i107 = 0; i107 < n10; i107++) {
                    for (int i108 = 0; i108 < iArr31[i107]; i108++) {
                        boolean k20 = k18 ? b02.k() : false;
                        boolean k21 = k19 ? b02.k() : false;
                        if (k20) {
                            b02.h(32);
                        }
                        if (k21) {
                            b02.h(18);
                        }
                    }
                }
            }
            boolean k22 = b02.k();
            int l16 = k22 ? b02.l(4) + 1 : i24;
            AbstractC2720Pd.p(l16, "expectedSize");
            AbstractC2720Pd.p(l16, "initialCapacity");
            int[] iArr40 = new int[i24];
            Object[] objArr3 = new Object[l16];
            int i109 = 0;
            int i110 = 0;
            boolean z16 = false;
            while (i109 < l16) {
                b02.h(3);
                int i111 = true != b02.k() ? 2 : 1;
                int b11 = C2980bK.b(b02.l(8));
                int c4 = C2980bK.c(b02.l(8));
                b02.h(8);
                Pz pz = new Pz(b11, i111, c4);
                int length3 = objArr3.length;
                int d9 = PB.d(length3, i110 + 1);
                if (d9 > length3 || z16) {
                    objArr3 = Arrays.copyOf(objArr3, d9);
                    z16 = false;
                }
                objArr3[i110] = pz;
                i109++;
                i110++;
                z16 = z16;
            }
            if (k22 && l16 > 1) {
                for (int i112 = 0; i112 < i24; i112++) {
                    iArr40[i112] = b02.l(4);
                }
            }
            vy = new Vy(UB.p(objArr3, i110), iArr40, 2);
        } else {
            vy = null;
        }
        return new C2518Df(p6, new Vy(c3675oC2, iArr38, 0), vy3, vy);
    }

    public static void M(boolean z8, String str, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC3194fG.u(str, obj));
        }
    }

    public static int N(C3226fu c3226fu) {
        int M8 = K3.b.M(c3226fu) - 1;
        return (M8 == 0 || M8 == 1) ? 7 : 23;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Fz O(byte[] bArr, int i, int i4, C2518Df c2518Df) {
        int i9;
        boolean z8;
        int i10;
        int i11;
        int i12;
        int i13;
        int n9;
        int i14;
        int i15;
        int i16;
        int i17;
        int n10;
        int i18;
        float f6;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Vy vy;
        int i26;
        int i27;
        int i28;
        Vy vy2;
        W2.b Y = Y(new B0(bArr, i, i4));
        B0 b02 = new B0(bArr, i + 2, i4);
        int i29 = 4;
        b02.h(4);
        int l9 = b02.l(3);
        int i30 = Y.f3424b;
        if (i30 == 0 || l9 != 7) {
            i9 = l9;
            z8 = false;
        } else {
            z8 = true;
            i9 = 7;
        }
        if (c2518Df != null) {
            UB ub = (UB) c2518Df.f24453u;
            if (!ub.isEmpty()) {
                i10 = ((C3230fy) ub.get(Math.min(i30, ub.size() - 1))).f30922a;
                Ky ky = null;
                if (z8) {
                    b02.f();
                    ky = Z(b02, true, i9, null);
                } else if (c2518Df != null) {
                    Vy vy3 = (Vy) c2518Df.f24454v;
                    int i31 = vy3.f28331b[i10];
                    UB ub2 = vy3.f28330a;
                    if (ub2.size() > i31) {
                        ky = (Ky) ub2.get(i31);
                    }
                }
                Ky ky2 = ky;
                b02.n();
                if (z8) {
                    int n11 = b02.n();
                    if (n11 == 3) {
                        b02.f();
                        n11 = 3;
                    }
                    int n12 = b02.n();
                    int n13 = b02.n();
                    if (b02.k()) {
                        int n14 = b02.n();
                        int n15 = b02.n();
                        int n16 = b02.n();
                        int n17 = b02.n();
                        i11 = n12 - ((n14 + n15) * ((n11 == 1 || n11 == 2) ? 2 : 1));
                        i12 = n13 - ((n16 + n17) * (n11 == 1 ? 2 : 1));
                    } else {
                        i11 = n12;
                        i12 = n13;
                    }
                    int n18 = b02.n();
                    i13 = n12;
                    n9 = b02.n();
                    i14 = n13;
                    i15 = i11;
                    i16 = n18;
                } else {
                    int l10 = b02.k() ? b02.l(8) : -1;
                    if (c2518Df != null && (vy2 = (Vy) c2518Df.f24455w) != null) {
                        if (l10 == -1) {
                            l10 = vy2.f28331b[i10];
                        }
                        if (l10 != -1) {
                            UB ub3 = vy2.f28330a;
                            if (ub3.size() > l10) {
                                C3231fz c3231fz = (C3231fz) ub3.get(l10);
                                int i32 = c3231fz.f30924a;
                                int i33 = c3231fz.f30927d;
                                int i34 = c3231fz.f30928e;
                                int i35 = c3231fz.f30925b;
                                i13 = i33;
                                i14 = i34;
                                n9 = c3231fz.f30926c;
                                i15 = i13;
                                i16 = i35;
                                i12 = i14;
                            }
                        }
                    }
                    i12 = 0;
                    i16 = 0;
                    n9 = 0;
                    i15 = 0;
                    i13 = 0;
                    i14 = 0;
                }
                int n19 = b02.n();
                if (z8) {
                    int i36 = -1;
                    for (int i37 = true != b02.k() ? i9 : 0; i37 <= i9; i37++) {
                        b02.n();
                        i36 = Math.max(b02.n(), i36);
                        b02.n();
                    }
                    i17 = i36;
                } else {
                    i17 = -1;
                }
                b02.n();
                b02.n();
                b02.n();
                b02.n();
                b02.n();
                b02.n();
                if (b02.k()) {
                    if (z8 && b02.k()) {
                        b02.h(6);
                    } else if (b02.k()) {
                        int i38 = 0;
                        while (i38 < i29) {
                            int i39 = 0;
                            while (i39 < 6) {
                                if (b02.k()) {
                                    int min = Math.min(64, 1 << ((i38 + i38) + i29));
                                    if (i38 > 1) {
                                        b02.m();
                                    }
                                    for (int i40 = 0; i40 < min; i40++) {
                                        b02.m();
                                    }
                                } else {
                                    b02.n();
                                }
                                i39 += i38 == 3 ? 3 : 1;
                                i29 = 4;
                            }
                            i38++;
                            i29 = 4;
                        }
                    }
                }
                b02.h(2);
                if (b02.k()) {
                    b02.h(8);
                    b02.n();
                    b02.n();
                    b02.f();
                }
                n10 = b02.n();
                int[] iArr = new int[0];
                int[] iArr2 = new int[0];
                i18 = 0;
                int i41 = -1;
                int i42 = -1;
                while (i18 < n10) {
                    if (i18 == 0 || !b02.k()) {
                        i26 = n10;
                        i27 = i10;
                        int n20 = b02.n();
                        int n21 = b02.n();
                        int[] iArr3 = new int[n20];
                        int i43 = 0;
                        while (i43 < n20) {
                            iArr3[i43] = (i43 > 0 ? iArr3[i43 - 1] : 0) - (b02.n() + 1);
                            b02.f();
                            i43++;
                        }
                        int[] iArr4 = new int[n21];
                        int i44 = 0;
                        while (i44 < n21) {
                            iArr4[i44] = b02.n() + 1 + (i44 > 0 ? iArr4[i44 - 1] : 0);
                            b02.f();
                            i44++;
                        }
                        i42 = n21;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i41 = n20;
                    } else {
                        int i45 = i41 + i42;
                        boolean k6 = b02.k();
                        int n22 = b02.n() + 1;
                        int i46 = 1 - ((k6 ? 1 : 0) + (k6 ? 1 : 0));
                        i26 = n10;
                        int i47 = i45 + 1;
                        i27 = i10;
                        boolean[] zArr = new boolean[i47];
                        for (int i48 = 0; i48 <= i45; i48++) {
                            if (b02.k()) {
                                zArr[i48] = true;
                            } else {
                                zArr[i48] = b02.k();
                            }
                        }
                        int i49 = i42 - 1;
                        int[] iArr5 = new int[i47];
                        int[] iArr6 = new int[i47];
                        int i50 = 0;
                        while (true) {
                            i28 = i46 * n22;
                            if (i49 < 0) {
                                break;
                            }
                            int i51 = iArr2[i49] + i28;
                            if (i51 < 0 && zArr[i41 + i49]) {
                                iArr5[i50] = i51;
                                i50++;
                            }
                            i49--;
                        }
                        if (i28 < 0 && zArr[i45]) {
                            iArr5[i50] = i28;
                            i50++;
                        }
                        int[] iArr7 = iArr;
                        int i52 = i50;
                        for (int i53 = 0; i53 < i41; i53++) {
                            int i54 = iArr7[i53] + i28;
                            if (i54 < 0 && zArr[i53]) {
                                iArr5[i52] = i54;
                                i52++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr5, i52);
                        int i55 = 0;
                        for (int i56 = i41 - 1; i56 >= 0; i56--) {
                            int i57 = iArr7[i56] + i28;
                            if (i57 > 0 && zArr[i56]) {
                                iArr6[i55] = i57;
                                i55++;
                            }
                        }
                        if (i28 > 0 && zArr[i45]) {
                            iArr6[i55] = i28;
                            i55++;
                        }
                        int i58 = i55;
                        for (int i59 = 0; i59 < i42; i59++) {
                            int i60 = iArr2[i59] + i28;
                            if (i60 > 0 && zArr[i41 + i59]) {
                                iArr6[i58] = i60;
                                i58++;
                            }
                        }
                        iArr2 = Arrays.copyOf(iArr6, i58);
                        i41 = i52;
                        i42 = i58;
                        iArr = copyOf;
                    }
                    i18++;
                    n10 = i26;
                    i10 = i27;
                }
                int i61 = i10;
                if (b02.k()) {
                    int n23 = b02.n();
                    for (int i62 = 0; i62 < n23; i62++) {
                        b02.h(n19 + 5);
                    }
                }
                b02.h(2);
                float f9 = 1.0f;
                if (b02.k()) {
                    f6 = 1.0f;
                    i19 = i12;
                    i20 = -1;
                    i21 = -1;
                    i22 = -1;
                } else {
                    if (b02.k()) {
                        int l11 = b02.l(8);
                        if (l11 == 255) {
                            int l12 = b02.l(16);
                            int l13 = b02.l(16);
                            if (l12 != 0 && l13 != 0) {
                                f9 = l12 / l13;
                            }
                        } else if (l11 < 17) {
                            f9 = f26863O[l11];
                        } else {
                            com.anythink.basead.b.c.i.s(l11, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil", new StringBuilder(String.valueOf(l11).length() + 35));
                        }
                    }
                    if (b02.k()) {
                        b02.f();
                    }
                    if (b02.k()) {
                        b02.h(3);
                        i25 = true != b02.k() ? 2 : 1;
                        if (b02.k()) {
                            int l14 = b02.l(8);
                            int l15 = b02.l(8);
                            b02.h(8);
                            i23 = C2980bK.b(l14);
                            i24 = C2980bK.c(l15);
                        } else {
                            i23 = -1;
                            i24 = -1;
                        }
                    } else {
                        if (c2518Df != null && (vy = (Vy) c2518Df.f24456x) != null) {
                            int i63 = vy.f28331b[i61];
                            UB ub4 = vy.f28330a;
                            if (ub4.size() > i63) {
                                Pz pz = (Pz) ub4.get(i63);
                                int i64 = pz.f27087a;
                                int i65 = pz.f27088b;
                                i24 = pz.f27089c;
                                i23 = i64;
                                i25 = i65;
                            }
                        }
                        i23 = -1;
                        i24 = -1;
                        i25 = -1;
                    }
                    if (b02.k()) {
                        b02.n();
                        b02.n();
                    }
                    b02.f();
                    if (b02.k()) {
                        i12 += i12;
                    }
                    i20 = i23;
                    i22 = i24;
                    f6 = f9;
                    i21 = i25;
                    i19 = i12;
                }
                return new Fz(i9, ky2, i16, n9, i15, i19, i13, i14, f6, i17, i20, i21, i22);
            }
        }
        i10 = 0;
        Ky ky3 = null;
        if (z8) {
        }
        Ky ky22 = ky3;
        b02.n();
        if (z8) {
        }
        int n192 = b02.n();
        if (z8) {
        }
        b02.n();
        b02.n();
        b02.n();
        b02.n();
        b02.n();
        b02.n();
        if (b02.k()) {
        }
        b02.h(2);
        if (b02.k()) {
        }
        n10 = b02.n();
        int[] iArr8 = new int[0];
        int[] iArr22 = new int[0];
        i18 = 0;
        int i412 = -1;
        int i422 = -1;
        while (i18 < n10) {
        }
        int i612 = i10;
        if (b02.k()) {
        }
        b02.h(2);
        float f92 = 1.0f;
        if (b02.k()) {
        }
        return new Fz(i9, ky22, i16, n9, i15, i19, i13, i14, f6, i17, i20, i21, i22);
    }

    public static int P(Er er, int[] iArr) {
        int i = 0;
        for (int i4 = 0; i4 < 3 && er.g(); i4++) {
            i++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i9 += 1 << iArr[i10];
        }
        return er.h(iArr[i]) + i9;
    }

    public static void Q(J3.a aVar, Yu yu, Vu vu, boolean z8) {
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            JD s3 = JD.s(aVar);
            com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(yu, vu, z8);
            s3.c(new MD(0, s3, oVar), AbstractC3212fg.f30745h);
        }
    }

    public static int R(byte[] bArr, int i, int i4, boolean[] zArr) {
        int i9 = i4 - i;
        T(i9 >= 0);
        if (i9 == 0) {
            return i4;
        }
        if (zArr[0]) {
            V(zArr);
            return i - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i] == 1) {
            V(zArr);
            return i - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            V(zArr);
            return i - 1;
        }
        int i10 = i4 - 1;
        int i11 = i + 2;
        while (i11 < i10) {
            byte b9 = bArr[i11];
            if ((b9 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b9 == 1) {
                    V(zArr);
                    return i12;
                }
                i11 = i12;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i4 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i4 + (-3)] == 0 && bArr[i4 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i4 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i4;
    }

    public static Er S(byte[] bArr) {
        byte b9 = bArr[0];
        if (b9 == Byte.MAX_VALUE || b9 == 100 || b9 == 64 || b9 == 113) {
            return new Er(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = copyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b11 = copyOf[i];
                int i4 = i + 1;
                copyOf[i] = copyOf[i4];
                copyOf[i4] = b11;
            }
        }
        int length = copyOf.length;
        Er er = new Er(copyOf, length);
        if (copyOf[0] == 31) {
            Er er2 = new Er(copyOf, length);
            while (er2.b() >= 16) {
                er2.f(2);
                int h9 = er2.h(14);
                int min = Math.min(8 - er.f24831c, 14);
                int i9 = er.f24831c;
                int i10 = (8 - i9) - min;
                byte[] bArr2 = er.f24829a;
                int i11 = er.f24830b;
                byte b12 = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr2[i11]);
                bArr2[i11] = b12;
                int i12 = 14 - min;
                int i13 = h9 & 16383;
                bArr2[i11] = (byte) (b12 | ((i13 >>> i12) << i10));
                int i14 = i11 + 1;
                while (i12 > 8) {
                    i12 -= 8;
                    er.f24829a[i14] = (byte) (i13 >>> i12);
                    i14++;
                }
                byte[] bArr3 = er.f24829a;
                byte b13 = (byte) (bArr3[i14] & ((1 << r7) - 1));
                bArr3[i14] = b13;
                bArr3[i14] = (byte) (((i13 & ((1 << i12) - 1)) << (8 - i12)) | b13);
                er.f(14);
                er.m();
            }
        }
        int length2 = copyOf.length;
        er.f24829a = copyOf;
        er.f24830b = 0;
        er.f24831c = 0;
        er.f24832d = length2;
        return er;
    }

    public static void T(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void U(String str, boolean z8) {
        if (!z8) {
            throw new IllegalStateException(str);
        }
    }

    public static void V(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String W(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                SB sb = UB.f27942u;
                AbstractC2720Pd.p(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i4 = 0;
                int i9 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i4 >= length2) {
                        break;
                    }
                    int R8 = R(bArr, i4, length2, zArr);
                    if (R8 != length2) {
                        Integer valueOf = Integer.valueOf(R8);
                        int length3 = objArr.length;
                        int i10 = i9 + 1;
                        int d2 = PB.d(length3, i10);
                        if (d2 > length3) {
                            objArr = Arrays.copyOf(objArr, d2);
                        }
                        objArr[i9] = valueOf;
                        i9 = i10;
                    }
                    i4 = R8 + 3;
                }
                C3675oC p6 = UB.p(objArr, i9);
                for (int i11 = 0; i11 < p6.f33117w; i11++) {
                    if (((Integer) p6.get(i11)).intValue() + 3 < length) {
                        B0 b02 = new B0(bArr, ((Integer) p6.get(i11)).intValue() + 3, length);
                        W2.b Y = Y(b02);
                        if (Y.f3423a == 33 && Y.f3424b == 0) {
                            b02.h(4);
                            int l9 = b02.l(3);
                            b02.f();
                            Ky Z8 = Z(b02, true, l9, null);
                            return AbstractC4295zm.a(Z8.f26069a, Z8.f26070b, Z8.f26071c, Z8.f26072d, Z8.f26073e, Z8.f26074f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void X(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static W2.b Y(B0 b02) {
        b02.f();
        return new W2.b(b02.l(6), b02.l(6), b02.l(3) - 1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Ky Z(B0 b02, boolean z8, int i, Ky ky) {
        int[] iArr;
        int i4;
        boolean z9;
        int i9;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int[] iArr2 = new int[6];
        if (z8) {
            int l9 = b02.l(2);
            z10 = b02.k();
            i11 = b02.l(5);
            i12 = 0;
            for (int i13 = 0; i13 < 32; i13++) {
                if (b02.k()) {
                    i12 |= 1 << i13;
                }
            }
            for (int i14 = 0; i14 < 6; i14++) {
                iArr2[i14] = b02.l(8);
            }
            i4 = l9;
        } else {
            if (ky == null) {
                iArr = iArr2;
                i4 = 0;
                z9 = false;
                i9 = 0;
                i10 = 0;
                int l10 = b02.l(8);
                int i15 = 0;
                for (int i16 = 0; i16 < i; i16++) {
                    if (b02.k()) {
                        i15 += 88;
                    }
                    if (b02.k()) {
                        i15 += 8;
                    }
                }
                b02.h(i15);
                if (i > 0) {
                    int i17 = 8 - i;
                    b02.h(i17 + i17);
                }
                return new Ky(i4, z9, i9, i10, iArr, l10);
            }
            int i18 = ky.f26069a;
            z10 = ky.f26070b;
            i11 = ky.f26071c;
            i12 = ky.f26072d;
            iArr2 = ky.f26073e;
            i4 = i18;
        }
        iArr = iArr2;
        z9 = z10;
        i9 = i11;
        i10 = i12;
        int l102 = b02.l(8);
        int i152 = 0;
        while (i16 < i) {
        }
        b02.h(i152);
        if (i > 0) {
        }
        return new Ky(i4, z9, i9, i10, iArr, l102);
    }

    public static void a0(int i, int i4) {
        String u7;
        if (i < 0 || i >= i4) {
            if (i < 0) {
                u7 = AbstractC3194fG.u("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(D.y.j(i4, "negative size: ", new StringBuilder(String.valueOf(i4).length() + 15)));
                }
                u7 = AbstractC3194fG.u("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(u7);
        }
    }

    public static void b0(int i, int i4) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(d0(i, i4, "index"));
        }
    }

    public static void c0(int i, int i4, int i9) {
        if (i < 0 || i4 < i || i4 > i9) {
            throw new IndexOutOfBoundsException((i < 0 || i > i9) ? d0(i, i9, "start index") : (i4 < 0 || i4 > i9) ? d0(i4, i9, "end index") : AbstractC3194fG.u("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    public static String d0(int i, int i4, String str) {
        if (i < 0) {
            return AbstractC3194fG.u("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return AbstractC3194fG.u("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(D.y.j(i4, "negative size: ", new StringBuilder(String.valueOf(i4).length() + 15)));
    }

    public static int e(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static void e0(B0 b02) {
        int n9 = b02.n() + 1;
        b02.h(8);
        for (int i = 0; i < n9; i++) {
            b02.n();
            b02.n();
            b02.f();
        }
        b02.h(20);
    }

    public static int f(int i, byte[] bArr) {
        int i4;
        synchronized (f26864P) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i) {
                while (true) {
                    try {
                        if (i9 >= i - 2) {
                            i9 = i;
                            break;
                        }
                        int i11 = i9 + 1;
                        if (bArr[i9] == 0 && bArr[i11] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9 = i11;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i) {
                    int[] iArr = f26865Q;
                    int length = iArr.length;
                    if (length <= i10) {
                        f26865Q = Arrays.copyOf(iArr, length + length);
                    }
                    f26865Q[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i4 = i - i10;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = f26865Q[i14] - i12;
                System.arraycopy(bArr, i12, bArr, i13, i15);
                int i16 = i13 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i13 = i16 + 2;
                bArr[i17] = 0;
                i12 += i15 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i13, i4 - i13);
        }
        return i4;
    }

    public static String f0(TP tp) {
        String str;
        String str2 = tp.f27776o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = tp.f27772k) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return com.anythink.basead.exoplayer.k.o.f8608h;
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return com.anythink.basead.exoplayer.k.o.i;
            }
        }
        return str2;
    }

    public static long g(ByteBuffer byteBuffer) {
        long j9 = byteBuffer.getInt();
        return j9 < 0 ? j9 + 4294967296L : j9;
    }

    public static D6 h(Context context, String str, String str2) {
        D6 d62;
        try {
            d62 = (D6) ((LinkedBlockingQueue) new r(context, str, str2).f33922x).poll(com.anythink.basead.exoplayer.f.f7344a, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            d62 = null;
        }
        return d62 == null ? r.f() : d62;
    }

    public static String i(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = null;
        boolean z8 = false;
        while (it.hasNext()) {
            String str2 = ((C2908a3) it.next()).f29163a.f28593g.f27776o;
            if (K4.b(str2)) {
                return com.anythink.basead.exoplayer.k.o.f8605e;
            }
            if (K4.a(str2)) {
                z8 = true;
            } else if (K4.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z8 ? com.anythink.basead.exoplayer.k.o.f8616q : str != null ? str : com.anythink.basead.exoplayer.k.o.f8592Q;
    }

    public static String j(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (w(optJSONArray2, str) && !w(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static final void k(InterfaceC0397w interfaceC0397w, Mu coroutineSequence, E7.p pVar) {
        kotlin.jvm.internal.h.e(interfaceC0397w, "<this>");
        kotlin.jvm.internal.h.e(coroutineSequence, "coroutineSequence");
        EnumC0398x enumC0398x = EnumC0398x.f2637n;
        AbstractC0399y.c(interfaceC0397w, new OA(coroutineSequence, pVar, null), 1);
    }

    public static void l(V2.a aVar, Throwable th, String str) {
        C4287ze.a((Context) V2.b.A0(aVar)).f(th, str, ((Double) AbstractC2802Ua.f28040f.r()).floatValue());
    }

    public static void m(String str, long j9) {
        if (j9 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j9);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void n(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void o(Object[] objArr, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            s(i4, objArr[i4]);
        }
    }

    public static long p(Lr lr, int i, int i4) {
        lr.E(i);
        if (lr.B() < 5) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        int b9 = lr.b();
        if ((8388608 & b9) != 0 || ((b9 >> 8) & 8191) != i4 || (b9 & 32) == 0 || lr.K() < 7 || lr.B() < 7 || (lr.K() & 16) != 16) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        byte[] bArr = new byte[6];
        lr.H(bArr, 0, 6);
        long j9 = bArr[0];
        long j10 = bArr[1];
        long j11 = bArr[2];
        long j12 = bArr[3] & 255;
        return ((j9 & 255) << 25) | ((j10 & 255) << 17) | ((j11 & 255) << 9) | (j12 + j12) | ((bArr[4] & 255) >> 7);
    }

    public static void r(int i, long j9, String str, int i4, PriorityQueue priorityQueue) {
        D8 d82 = new D8(i4, j9, str);
        if ((priorityQueue.size() != i || (((D8) priorityQueue.peek()).f24346c <= i4 && ((D8) priorityQueue.peek()).f24344a <= j9)) && !priorityQueue.contains(d82)) {
            priorityQueue.add(d82);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void s(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(D.y.j(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
        }
    }

    public static void t(J3.a aVar, Vu vu) {
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            JD s3 = JD.s(aVar);
            C2478Aq c2478Aq = new C2478Aq(7, vu);
            s3.c(new MD(0, s3, c2478Aq), AbstractC3212fg.f30745h);
        }
    }

    public static void u(String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void v(boolean z8) {
        if (!z8) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static boolean w(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                try {
                } catch (PatternSyntaxException e6) {
                    p2.j.f39798C.f39808h.d("RtbAdapterMap.hasAtleastOneRegexMatch", e6);
                }
                if ((((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.pc)).booleanValue() ? Pattern.compile(optString, 2) : Pattern.compile(optString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] x(String str, boolean z8) {
        FC fc;
        if (z8) {
            fc = HC.f25321e;
            if (fc.f25324b != null) {
                fc = new FC(fc.f25323a, (Character) null);
            }
        } else {
            fc = HC.f25320d;
        }
        byte[] h9 = fc.h(str);
        if (h9.length != 0 || str.length() <= 0) {
            return h9;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static int y(TP tp) {
        String f02 = f0(tp);
        if (Objects.equals(f02, com.anythink.basead.exoplayer.k.o.f8608h)) {
            return 1;
        }
        return (Objects.equals(f02, com.anythink.basead.exoplayer.k.o.i) || Objects.equals(f02, "video/vvc")) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int z(byte[] bArr) {
        int i;
        int i4;
        byte b9;
        int i9;
        int i10;
        int i11;
        byte b10;
        boolean z8 = false;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i10 = (bArr[7] & 3) << 12;
                i11 = (bArr[6] & 255) << 4;
                b10 = bArr[9];
            } else if (b11 != 31) {
                i = (bArr[5] & 3) << 12;
                i4 = (bArr[6] & 255) << 4;
                b9 = bArr[7];
            } else {
                i10 = (bArr[6] & 3) << 12;
                i11 = (bArr[7] & 255) << 4;
                b10 = bArr[8];
            }
            i9 = (((b10 & 60) >> 2) | i10 | i11) + 1;
            z8 = true;
            return !z8 ? (i9 * 16) / 14 : i9;
        }
        i = (bArr[4] & 3) << 12;
        i4 = (bArr[7] & 255) << 4;
        b9 = bArr[6];
        i9 = (((b9 & 240) >> 4) | i | i4) + 1;
        if (!z8) {
        }
    }

    public abstract Object q();

    public String toString() {
        switch (this.f26875n) {
            case 27:
                return q().toString();
            default:
                return super.toString();
        }
    }
}
