package c1;

import w0.m;

/* loaded from: classes.dex */
final class g {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f1817d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1818a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f1819b;

    /* renamed from: c, reason: collision with root package name */
    private int f1820c;

    public static long a(byte[] bArr, int i7, boolean z6) {
        long j7 = bArr[0] & 255;
        if (z6) {
            j7 &= f1817d[i7 - 1] ^ (-1);
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }

    public static int c(int i7) {
        long j7;
        int i8 = 0;
        do {
            long[] jArr = f1817d;
            if (i8 >= jArr.length) {
                return -1;
            }
            j7 = jArr[i8] & i7;
            i8++;
        } while (j7 == 0);
        return i8;
    }

    public int b() {
        return this.f1820c;
    }

    public long d(m mVar, boolean z6, boolean z7, int i7) {
        if (this.f1819b == 0) {
            if (!mVar.e(this.f1818a, 0, 1, z6)) {
                return -1L;
            }
            int c7 = c(this.f1818a[0] & 255);
            this.f1820c = c7;
            if (c7 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f1819b = 1;
        }
        int i8 = this.f1820c;
        if (i8 > i7) {
            this.f1819b = 0;
            return -2L;
        }
        if (i8 != 1) {
            mVar.readFully(this.f1818a, 1, i8 - 1);
        }
        this.f1819b = 0;
        return a(this.f1818a, this.f1820c, z7);
    }

    public void e() {
        this.f1819b = 0;
        this.f1820c = 0;
    }
}
