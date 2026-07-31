package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ht3 {
    static /* bridge */ /* synthetic */ void a(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) {
        if (g(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || g(b9) || g(b10)) {
            throw mq3.d();
        }
        int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
        cArr[i7] = (char) ((i8 >>> 10) + 55232);
        cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
    }

    static /* bridge */ /* synthetic */ void b(byte b7, byte b8, byte b9, char[] cArr, int i7) {
        if (!g(b8)) {
            if (b7 == -32) {
                if (b8 >= -96) {
                    b7 = -32;
                }
            }
            if (b7 == -19) {
                if (b8 < -96) {
                    b7 = -19;
                }
            }
            if (!g(b9)) {
                cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                return;
            }
        }
        throw mq3.d();
    }

    static /* bridge */ /* synthetic */ void c(byte b7, byte b8, char[] cArr, int i7) {
        if (b7 < -62 || g(b8)) {
            throw mq3.d();
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b7) {
        return b7 >= 0;
    }

    static /* bridge */ /* synthetic */ boolean e(byte b7) {
        return b7 < -16;
    }

    static /* bridge */ /* synthetic */ boolean f(byte b7) {
        return b7 < -32;
    }

    private static boolean g(byte b7) {
        return b7 > -65;
    }
}
