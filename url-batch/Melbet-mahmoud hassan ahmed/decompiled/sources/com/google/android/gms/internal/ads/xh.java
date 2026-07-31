package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class xh {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f14201d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14202a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f14203b;

    /* renamed from: c, reason: collision with root package name */
    private int f14204c;

    public static int b(int i7) {
        int i8 = 0;
        while (i8 < 8) {
            long j7 = f14201d[i8] & i7;
            i8++;
            if (j7 != 0) {
                return i8;
            }
        }
        return -1;
    }

    public static long c(byte[] bArr, int i7, boolean z6) {
        long j7 = bArr[0] & 255;
        if (z6) {
            j7 &= f14201d[i7 - 1] ^ (-1);
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }

    public final int a() {
        return this.f14204c;
    }

    public final void d() {
        this.f14203b = 0;
        this.f14204c = 0;
    }

    public final long e(bh bhVar, boolean z6, boolean z7, int i7) {
        if (this.f14203b == 0) {
            if (!bhVar.h(this.f14202a, 0, 1, z6)) {
                return -1L;
            }
            int b7 = b(this.f14202a[0] & 255);
            this.f14204c = b7;
            if (b7 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f14203b = 1;
        }
        int i8 = this.f14204c;
        if (i8 > i7) {
            this.f14203b = 0;
            return -2L;
        }
        if (i8 != 1) {
            bhVar.h(this.f14202a, 1, i8 - 1, false);
        }
        this.f14203b = 0;
        return c(this.f14202a, this.f14204c, z7);
    }
}
