package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mc4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f8493a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f8494b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f8495c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8496d = 0;

    public static c0 a(byte[] bArr, String str, String str2, u74 u74Var) {
        cq2 cq2Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            cq2Var = new cq2(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b7 = copyOf[0];
            if (b7 == -2 || b7 == -1) {
                for (int i7 = 0; i7 < copyOf.length - 1; i7 += 2) {
                    byte b8 = copyOf[i7];
                    int i8 = i7 + 1;
                    copyOf[i7] = copyOf[i8];
                    copyOf[i8] = b8;
                }
            }
            int length = copyOf.length;
            cq2Var = new cq2(copyOf, length);
            if (copyOf[0] == 31) {
                cq2 cq2Var2 = new cq2(copyOf, length);
                while (cq2Var2.a() >= 16) {
                    cq2Var2.j(2);
                    cq2Var.e(cq2Var2.c(14), 14);
                }
            }
            cq2Var.g(copyOf, copyOf.length);
        }
        cq2Var.j(60);
        int i9 = f8493a[cq2Var.c(6)];
        int i10 = f8494b[cq2Var.c(4)];
        int c7 = cq2Var.c(5);
        int i11 = c7 < 29 ? (f8495c[c7] * 1000) / 2 : -1;
        cq2Var.j(10);
        int i12 = cq2Var.c(2) > 0 ? 1 : 0;
        bf4 bf4Var = new bf4();
        bf4Var.h(str);
        bf4Var.s("audio/vnd.dts");
        bf4Var.d0(i11);
        bf4Var.e0(i9 + i12);
        bf4Var.t(i10);
        bf4Var.b(null);
        bf4Var.k(str2);
        return bf4Var.y();
    }
}
