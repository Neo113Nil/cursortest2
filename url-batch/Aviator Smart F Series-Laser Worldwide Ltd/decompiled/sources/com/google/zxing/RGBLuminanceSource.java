package com.google.zxing;

/* loaded from: classes4.dex */
public final class RGBLuminanceSource extends LuminanceSource {
    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final byte[] luminances;
    private final int top;

    public RGBLuminanceSource(int i8, int i9, int[] iArr) {
        super(i8, i9);
        this.dataWidth = i8;
        this.dataHeight = i9;
        this.left = 0;
        this.top = 0;
        int i10 = i8 * i9;
        this.luminances = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            this.luminances[i11] = (byte) (((((i12 >> 16) & 255) + ((i12 >> 7) & 510)) + (i12 & 255)) / 4);
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i8, int i9, int i10, int i11) {
        return new RGBLuminanceSource(this.luminances, this.dataWidth, this.dataHeight, this.left + i8, this.top + i9, i10, i11);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i8 = this.dataWidth;
        if (width == i8 && height == this.dataHeight) {
            return this.luminances;
        }
        int i9 = width * height;
        byte[] bArr = new byte[i9];
        int i10 = (this.top * i8) + this.left;
        if (width == i8) {
            System.arraycopy(this.luminances, i10, bArr, 0, i9);
            return bArr;
        }
        for (int i11 = 0; i11 < height; i11++) {
            System.arraycopy(this.luminances, i10, bArr, i11 * width, width);
            i10 += this.dataWidth;
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i8, byte[] bArr) {
        if (i8 < 0 || i8 >= getHeight()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i8)));
        }
        int width = getWidth();
        if (bArr == null || bArr.length < width) {
            bArr = new byte[width];
        }
        System.arraycopy(this.luminances, ((i8 + this.top) * this.dataWidth) + this.left, bArr, 0, width);
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    private RGBLuminanceSource(byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13) {
        super(i12, i13);
        if (i12 + i10 > i8 || i13 + i11 > i9) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.luminances = bArr;
        this.dataWidth = i8;
        this.dataHeight = i9;
        this.left = i10;
        this.top = i11;
    }
}
