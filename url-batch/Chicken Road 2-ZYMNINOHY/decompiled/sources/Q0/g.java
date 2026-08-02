package Q0;

import y0.o;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f2252d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2253a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f2254b;

    /* renamed from: c, reason: collision with root package name */
    public int f2255c;

    public static long a(int i4, byte[] bArr, boolean z) {
        long j4 = bArr[0] & 255;
        if (z) {
            j4 &= ~f2252d[i4 - 1];
        }
        for (int i5 = 1; i5 < i4; i5++) {
            j4 = (j4 << 8) | (bArr[i5] & 255);
        }
        return j4;
    }

    public final long b(o oVar, boolean z, boolean z4, int i4) {
        int i5;
        int i6 = this.f2254b;
        byte[] bArr = this.f2253a;
        if (i6 == 0) {
            if (!oVar.d(bArr, 0, 1, z)) {
                return -1L;
            }
            int i7 = bArr[0] & 255;
            int i8 = 0;
            while (true) {
                if (i8 >= 8) {
                    i5 = -1;
                    break;
                }
                if ((f2252d[i8] & i7) != 0) {
                    i5 = i8 + 1;
                    break;
                }
                i8++;
            }
            this.f2255c = i5;
            if (i5 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f2254b = 1;
        }
        int i9 = this.f2255c;
        if (i9 > i4) {
            this.f2254b = 0;
            return -2L;
        }
        if (i9 != 1) {
            oVar.readFully(bArr, 1, i9 - 1);
        }
        this.f2254b = 0;
        return a(this.f2255c, bArr, z4);
    }
}
