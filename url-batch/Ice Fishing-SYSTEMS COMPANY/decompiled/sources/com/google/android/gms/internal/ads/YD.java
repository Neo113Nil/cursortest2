package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public abstract class YD {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f28812a;

    public static boolean b(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            int i4 = i + 1;
            if (!Character.isSurrogate(charAt)) {
                i = i4;
            } else {
                if (Character.isLowSurrogate(charAt) || i4 == length || !Character.isLowSurrogate(str.charAt(i4))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        long d2 = d(0, bArr) & 67108863;
        int i = 3;
        long d3 = (d(3, bArr) >> 2) & 67108611;
        long d9 = (d(6, bArr) >> 4) & 67092735;
        long d10 = (d(9, bArr) >> 6) & 66076671;
        long d11 = (d(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        int i4 = 0;
        while (true) {
            int length = bArr2.length;
            if (i4 >= length) {
                long j14 = j9 + (j10 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j11 + (j14 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j12 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j20 = ((j18 >> 26) * 5) + j13;
                long j21 = j20 >> 26;
                long j22 = j20 & 67108863;
                long j23 = j22 + 5;
                long j24 = (j10 & 67108863) + j21;
                long j25 = j24 + (j23 >> 26);
                long j26 = j15 + (j25 >> 26);
                long j27 = j17 + (j26 >> 26);
                long j28 = (j19 + (j27 >> 26)) - 67108864;
                long j29 = j28 >> 63;
                long j30 = ~j29;
                long j31 = (j24 & j29) | (j25 & 67108863 & j30);
                long j32 = (j15 & j29) | (j26 & 67108863 & j30);
                long j33 = (j17 & j29) | (j27 & 67108863 & j30);
                long j34 = (j19 & j29) | (j28 & j30);
                long d12 = d(16, bArr) + (((j22 & j29) | (j23 & 67108863 & j30) | (j31 << 26)) & 4294967295L);
                long d13 = d(20, bArr) + (((j31 >> 6) | (j32 << 20)) & 4294967295L);
                long d14 = d(24, bArr);
                long d15 = d(28, bArr) + (((j33 >> 18) | (j34 << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                i(d12 & 4294967295L, bArr4, 0);
                long j35 = d13 + (d12 >> 32);
                i(j35 & 4294967295L, bArr4, 4);
                long j36 = d14 + (((j32 >> 12) | (j33 << 14)) & 4294967295L) + (j35 >> 32);
                i(j36 & 4294967295L, bArr4, 8);
                i((d15 + (j36 >> 32)) & 4294967295L, bArr4, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i4);
            System.arraycopy(bArr2, i4, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long j37 = d11 * 5;
            long j38 = d10 * 5;
            long j39 = d9 * 5;
            long d16 = j13 + (d(0, bArr3) & 67108863);
            long d17 = j10 + ((d(i, bArr3) >> 2) & 67108863);
            long d18 = j9 + ((d(6, bArr3) >> 4) & 67108863);
            long d19 = j11 + ((d(9, bArr3) >> 6) & 67108863);
            long j40 = d3;
            long d20 = j12 + (((d(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j41 = d17 * d2;
            long j42 = d17 * j40;
            long j43 = d18 * d2;
            long j44 = d17 * d9;
            long j45 = d18 * j40;
            long j46 = d19 * d2;
            long j47 = d17 * d10;
            long j48 = d18 * d9;
            long j49 = d19 * j40;
            long j50 = d20 * d2;
            long j51 = (d3 * 5 * d20) + (d19 * j39) + (d18 * j38) + (d17 * j37) + (d16 * d2);
            long j52 = j51 & 67108863;
            long j53 = d19 * j38;
            long j54 = j39 * d20;
            long j55 = j54 + j53 + (d18 * j37) + (d16 * j40) + j41 + (j51 >> 26);
            long j56 = j38 * d20;
            long j57 = j56 + (d19 * j37) + (d16 * d9) + j42 + j43 + (j55 >> 26);
            long j58 = (d20 * j37) + (d16 * d10) + j44 + j45 + j46 + (j57 >> 26);
            long j59 = (d16 * d11) + j47 + j48 + j49 + j50 + (j58 >> 26);
            long j60 = ((j59 >> 26) * 5) + j52;
            j10 = (j55 & 67108863) + (j60 >> 26);
            i4 += 16;
            j9 = j57 & 67108863;
            j11 = j58 & 67108863;
            j12 = j59 & 67108863;
            j13 = j60 & 67108863;
            d3 = j40;
            i = 3;
        }
    }

    public static long d(int i, byte[] bArr) {
        int i4 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i9 << 8) | i4 | (i10 << 16)) & 4294967295L;
    }

    public static AbstractC4006uK e(String str) {
        try {
            return QF.j(new GK(new StringReader(str)));
        } catch (NumberFormatException e6) {
            throw new IOException(e6);
        }
    }

    public static String f(EnumC3413jK enumC3413jK) {
        int ordinal = enumC3413jK.ordinal();
        if (ordinal == 0) {
            return "SHA-1";
        }
        if (ordinal == 1) {
            return "SHA-224";
        }
        if (ordinal == 2) {
            return "SHA-256";
        }
        if (ordinal == 3) {
            return "SHA-384";
        }
        if (ordinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(enumC3413jK.toString()));
    }

    public static LinkedHashMap g(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static Executor h(final Executor executor, final ID id) {
        executor.getClass();
        return executor == HD.f25326n ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.UD
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e6) {
                    id.e(e6);
                }
            }
        };
    }

    public static void i(long j9, byte[] bArr, int i) {
        for (int i4 = 0; i4 < 4; i4++) {
            bArr[i + i4] = (byte) (255 & j9);
            j9 >>= 8;
        }
    }

    public abstract void a(byte[] bArr, int i, int i4);
}
