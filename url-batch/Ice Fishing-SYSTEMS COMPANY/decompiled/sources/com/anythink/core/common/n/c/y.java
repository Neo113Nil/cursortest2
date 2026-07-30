package com.anythink.core.common.n.c;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f16087a = Charset.forName("UTF-8");

    private y() {
    }

    public static int a(int i) {
        return ((i & com.anythink.basead.exoplayer.k.p.f8630b) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static long a(long j9) {
        return ((j9 & 255) << 56) | (((-72057594037927936L) & j9) >>> 56) | ((71776119061217280L & j9) >>> 40) | ((280375465082880L & j9) >>> 24) | ((1095216660480L & j9) >>> 8) | ((4278190080L & j9) << 8) | ((16711680 & j9) << 24) | ((65280 & j9) << 40);
    }

    public static short a(short s3) {
        return (short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8));
    }

    public static void a(long j9, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j9 || j9 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("size=" + j9 + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i4, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i] != bArr2[i10 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static void a(Throwable th) {
        throw th;
    }

    private static <T extends Throwable> void b(Throwable th) {
        throw th;
    }
}
