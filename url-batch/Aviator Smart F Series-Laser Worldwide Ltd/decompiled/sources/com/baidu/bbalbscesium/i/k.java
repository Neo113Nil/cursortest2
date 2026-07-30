package com.baidu.bbalbscesium.i;

/* loaded from: classes.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3959a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f3960b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f3961c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3962d;

    /* renamed from: e, reason: collision with root package name */
    private int f3963e;

    /* renamed from: f, reason: collision with root package name */
    private int f3964f;

    protected k() {
        this(0);
    }

    private static int a(byte[] bArr, int i8) {
        return (int) (b(bArr, i8, 4) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32);
    }

    private static long b(byte[] bArr, int i8, int i9) {
        if (i9 > 8) {
            throw new IllegalArgumentException("can't read more than eight bytes into a long value");
        }
        long j8 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j8 |= (bArr[i8 + i10] & 255) << (i10 * 8);
        }
        return j8;
    }

    protected k(int i8) {
        this.f3959a = new byte[1];
        this.f3960b = new int[4];
        this.f3961c = new byte[16];
        this.f3962d = i8;
        b();
    }

    private void b() {
        int[] iArr = this.f3960b;
        int i8 = this.f3962d;
        iArr[0] = 606290984 + i8;
        iArr[1] = (-2048144777) + i8;
        iArr[2] = i8;
        iArr[3] = i8 - (-1640531535);
    }

    protected long a() {
        int i8 = 0;
        int rotateLeft = (this.f3963e > 16 ? Integer.rotateLeft(this.f3960b[0], 1) + Integer.rotateLeft(this.f3960b[1], 7) + Integer.rotateLeft(this.f3960b[2], 12) + Integer.rotateLeft(this.f3960b[3], 18) : this.f3960b[2] + 374761393) + this.f3963e;
        int i9 = this.f3964f - 4;
        while (i8 <= i9) {
            rotateLeft = Integer.rotateLeft(rotateLeft + (a(this.f3961c, i8) * (-1028477379)), 17) * 668265263;
            i8 += 4;
        }
        while (i8 < this.f3964f) {
            rotateLeft = Integer.rotateLeft(rotateLeft + ((this.f3961c[i8] & 255) * 374761393), 11) * (-1640531535);
            i8++;
        }
        int i10 = (rotateLeft ^ (rotateLeft >>> 15)) * (-2048144777);
        int i11 = (i10 ^ (i10 >>> 13)) * (-1028477379);
        return (i11 ^ (i11 >>> 16)) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
    }

    private void b(byte[] bArr, int i8) {
        int[] iArr = this.f3960b;
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int rotateLeft = Integer.rotateLeft(i9 + (a(bArr, i8) * (-2048144777)), 13) * (-1640531535);
        int rotateLeft2 = Integer.rotateLeft(i10 + (a(bArr, i8 + 4) * (-2048144777)), 13) * (-1640531535);
        int rotateLeft3 = Integer.rotateLeft(i11 + (a(bArr, i8 + 8) * (-2048144777)), 13) * (-1640531535);
        int rotateLeft4 = Integer.rotateLeft(i12 + (a(bArr, i8 + 12) * (-2048144777)), 13) * (-1640531535);
        int[] iArr2 = this.f3960b;
        iArr2[0] = rotateLeft;
        iArr2[1] = rotateLeft2;
        iArr2[2] = rotateLeft3;
        iArr2[3] = rotateLeft4;
        this.f3964f = 0;
    }

    protected void a(byte[] bArr, int i8, int i9) {
        if (i9 <= 0) {
            return;
        }
        this.f3963e += i9;
        int i10 = i8 + i9;
        int i11 = this.f3964f;
        if (i11 + i9 < 16) {
            System.arraycopy(bArr, i8, this.f3961c, i11, i9);
            this.f3964f += i9;
            return;
        }
        if (i11 > 0) {
            int i12 = 16 - i11;
            System.arraycopy(bArr, i8, this.f3961c, i11, i12);
            b(this.f3961c, 0);
            i8 += i12;
        }
        int i13 = i10 - 16;
        while (i8 <= i13) {
            b(bArr, i8);
            i8 += 16;
        }
        if (i8 < i10) {
            int i14 = i10 - i8;
            this.f3964f = i14;
            System.arraycopy(bArr, i8, this.f3961c, 0, i14);
        }
    }
}
