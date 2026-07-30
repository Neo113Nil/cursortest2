package com.google.zxing;

/* loaded from: classes4.dex */
public abstract class LuminanceSource {
    private final int height;
    private final int width;

    protected LuminanceSource(int i8, int i9) {
        this.width = i8;
        this.height = i9;
    }

    public LuminanceSource crop(int i8, int i9, int i10, int i11) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight() {
        return this.height;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i8, byte[] bArr);

    public final int getWidth() {
        return this.width;
    }

    public LuminanceSource invert() {
        return new InvertedLuminanceSource(this);
    }

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public LuminanceSource rotateCounterClockwise() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public LuminanceSource rotateCounterClockwise45() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        int i8 = this.width;
        byte[] bArr = new byte[i8];
        StringBuilder sb = new StringBuilder(this.height * (i8 + 1));
        for (int i9 = 0; i9 < this.height; i9++) {
            bArr = getRow(i9, bArr);
            for (int i10 = 0; i10 < this.width; i10++) {
                int i11 = bArr[i10] & 255;
                sb.append(i11 < 64 ? '#' : i11 < 128 ? '+' : i11 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
