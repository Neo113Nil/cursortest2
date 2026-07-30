package com.google.zxing;

/* loaded from: classes4.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {
    private static final int THUMBNAIL_SCALE_FACTOR = 2;
    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final int top;
    private final byte[] yuvData;

    public PlanarYUVLuminanceSource(byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, boolean z7) {
        super(i12, i13);
        if (i10 + i12 > i8 || i11 + i13 > i9) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.yuvData = bArr;
        this.dataWidth = i8;
        this.dataHeight = i9;
        this.left = i10;
        this.top = i11;
        if (z7) {
            reverseHorizontal(i12, i13);
        }
    }

    private void reverseHorizontal(int i8, int i9) {
        byte[] bArr = this.yuvData;
        int i10 = (this.top * this.dataWidth) + this.left;
        int i11 = 0;
        while (i11 < i9) {
            int i12 = (i8 / 2) + i10;
            int i13 = (i10 + i8) - 1;
            int i14 = i10;
            while (i14 < i12) {
                byte b8 = bArr[i14];
                bArr[i14] = bArr[i13];
                bArr[i13] = b8;
                i14++;
                i13--;
            }
            i11++;
            i10 += this.dataWidth;
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i8, int i9, int i10, int i11) {
        return new PlanarYUVLuminanceSource(this.yuvData, this.dataWidth, this.dataHeight, this.left + i8, this.top + i9, i10, i11, false);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i8 = this.dataWidth;
        if (width == i8 && height == this.dataHeight) {
            return this.yuvData;
        }
        int i9 = width * height;
        byte[] bArr = new byte[i9];
        int i10 = (this.top * i8) + this.left;
        if (width == i8) {
            System.arraycopy(this.yuvData, i10, bArr, 0, i9);
            return bArr;
        }
        for (int i11 = 0; i11 < height; i11++) {
            System.arraycopy(this.yuvData, i10, bArr, i11 * width, width);
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
        System.arraycopy(this.yuvData, ((i8 + this.top) * this.dataWidth) + this.left, bArr, 0, width);
        return bArr;
    }

    public int getThumbnailHeight() {
        return getHeight() / 2;
    }

    public int getThumbnailWidth() {
        return getWidth() / 2;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    public int[] renderThumbnail() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int[] iArr = new int[width * height];
        byte[] bArr = this.yuvData;
        int i8 = (this.top * this.dataWidth) + this.left;
        for (int i9 = 0; i9 < height; i9++) {
            int i10 = i9 * width;
            for (int i11 = 0; i11 < width; i11++) {
                iArr[i10 + i11] = ((bArr[(i11 << 1) + i8] & 255) * 65793) | (-16777216);
            }
            i8 += this.dataWidth << 1;
        }
        return iArr;
    }
}
