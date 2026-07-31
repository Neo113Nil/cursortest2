package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class d0 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f4024d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4025a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f4026b;

    /* renamed from: c, reason: collision with root package name */
    private int f4027c;

    public static int b(int i7) {
        int i8 = 0;
        while (i8 < 8) {
            long j7 = f4024d[i8] & i7;
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
            j7 &= f4024d[i7 - 1] ^ (-1);
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }

    public final int a() {
        return this.f4027c;
    }

    public final long d(pc4 pc4Var, boolean z6, boolean z7, int i7) {
        if (this.f4026b == 0) {
            if (!pc4Var.m(this.f4025a, 0, 1, z6)) {
                return -1L;
            }
            int b7 = b(this.f4025a[0] & 255);
            this.f4027c = b7;
            if (b7 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f4026b = 1;
        }
        int i8 = this.f4027c;
        if (i8 > i7) {
            this.f4026b = 0;
            return -2L;
        }
        if (i8 != 1) {
            ((jc4) pc4Var).m(this.f4025a, 1, i8 - 1, false);
        }
        this.f4026b = 0;
        return c(this.f4025a, this.f4027c, z7);
    }

    public final void e() {
        this.f4026b = 0;
        this.f4027c = 0;
    }
}
