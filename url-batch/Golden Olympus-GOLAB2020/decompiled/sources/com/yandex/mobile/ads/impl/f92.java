package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class f92 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f25721d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25722a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f25723b;

    /* renamed from: c, reason: collision with root package name */
    private int f25724c;

    public static long a(byte[] bArr, int i4, boolean z4) {
        long j4 = bArr[0] & 255;
        if (z4) {
            j4 &= ~f25721d[i4 - 1];
        }
        for (int i5 = 1; i5 < i4; i5++) {
            j4 = (j4 << 8) | (bArr[i5] & 255);
        }
        return j4;
    }

    public final void b() {
        this.f25723b = 0;
        this.f25724c = 0;
    }

    public final int a() {
        return this.f25724c;
    }

    public static int a(int i4) {
        long j4;
        int i5 = 0;
        do {
            long[] jArr = f25721d;
            if (i5 >= 8) {
                return -1;
            }
            j4 = jArr[i5] & i4;
            i5++;
        } while (j4 == 0);
        return i5;
    }

    public final long a(lz lzVar, boolean z4, boolean z5, int i4) {
        if (this.f25723b == 0) {
            if (!lzVar.a(this.f25722a, 0, 1, z4)) {
                return -1L;
            }
            int a4 = a(this.f25722a[0] & 255);
            this.f25724c = a4;
            if (a4 != -1) {
                this.f25723b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i5 = this.f25724c;
        if (i5 > i4) {
            this.f25723b = 0;
            return -2L;
        }
        if (i5 != 1) {
            lzVar.a(this.f25722a, 1, i5 - 1, false);
        }
        this.f25723b = 0;
        return a(this.f25722a, this.f25724c, z5);
    }
}
