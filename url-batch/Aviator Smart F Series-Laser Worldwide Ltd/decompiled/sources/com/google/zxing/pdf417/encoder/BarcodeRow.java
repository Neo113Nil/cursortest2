package com.google.zxing.pdf417.encoder;

/* loaded from: classes4.dex */
final class BarcodeRow {
    private int currentLocation = 0;
    private final byte[] row;

    BarcodeRow(int i8) {
        this.row = new byte[i8];
    }

    void addBar(boolean z7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.currentLocation;
            this.currentLocation = i10 + 1;
            set(i10, z7);
        }
    }

    byte[] getScaledRow(int i8) {
        int length = this.row.length * i8;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            bArr[i9] = this.row[i9 / i8];
        }
        return bArr;
    }

    void set(int i8, byte b8) {
        this.row[i8] = b8;
    }

    private void set(int i8, boolean z7) {
        this.row[i8] = z7 ? (byte) 1 : (byte) 0;
    }
}
