package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1nSDK extends FilterInputStream {
    private int AFKeystoreWrapper;
    private final int[] areAllFieldsValid;
    private final int[] component1;
    private final int component2;
    private final byte[][] component3;
    private final byte[] component4;
    private final int copy;
    private final int copydefault;
    private int equals;
    private int hashCode;
    private int registerClient;
    private final byte[] toString;
    private static final byte[] getMediationNetwork = AFk1sSDK.getCurrencyIso4217Code;
    private static final int[] getCurrencyIso4217Code = AFk1sSDK.AFAdRevenueData;
    private static final int[] AFAdRevenueData = AFk1sSDK.getMediationNetwork;
    private static final int[] getMonetizationNetwork = AFk1sSDK.getRevenue;
    private static final int[] getRevenue = AFk1sSDK.getMonetizationNetwork;

    public AFk1nSDK(InputStream inputStream, int i2, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i2, bArr, bArr2, (byte) 0);
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.areAllFieldsValid;
        boolean z7 = true;
        char c7 = 2;
        char c8 = '\b';
        char c9 = 3;
        int i2 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component1;
        iArr[0] = i2 ^ iArr2[0];
        char c10 = 5;
        char c11 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c12 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i5 = 1;
        int i7 = 4;
        while (i5 < this.component2) {
            int[] iArr3 = getCurrencyIso4217Code;
            int[] iArr4 = this.areAllFieldsValid;
            boolean z8 = z7;
            byte[][] bArr3 = this.component3;
            byte[] bArr4 = bArr3[0];
            int i8 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFAdRevenueData;
            byte[] bArr5 = bArr3[z8 ? 1 : 0];
            char c13 = c7;
            int i9 = i8 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getMonetizationNetwork;
            byte[] bArr6 = bArr3[c13];
            char c14 = c9;
            int i10 = i9 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getRevenue;
            byte[] bArr7 = bArr3[c14];
            char c15 = c8;
            int i11 = i10 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component1;
            int i12 = i11 ^ iArr8[i7];
            char c16 = c12;
            char c17 = c10;
            int i13 = (((iArr3[iArr4[bArr4[z8 ? 1 : 0]] >>> 24] ^ iArr5[(iArr4[bArr5[z8 ? 1 : 0]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[z8 ? 1 : 0]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[z8 ? 1 : 0]] & 255]) ^ iArr8[i7 + 1];
            int i14 = (((iArr3[iArr4[bArr4[c13]] >>> 24] ^ iArr5[(iArr4[bArr5[c13]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c13]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c13]] & 255]) ^ iArr8[i7 + 2];
            int i15 = (((iArr3[iArr4[bArr4[c14]] >>> 24] ^ iArr5[(iArr4[bArr5[c14]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c14]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c14]] & 255]) ^ iArr8[i7 + 3];
            iArr4[0] = i12;
            iArr4[z8 ? 1 : 0] = i13;
            iArr4[c13] = i14;
            iArr4[c14] = i15;
            i5++;
            i7 += 4;
            z7 = z8 ? 1 : 0;
            c7 = c13;
            c9 = c14;
            c8 = c15;
            c10 = c17;
            c12 = c16;
            c11 = c11;
        }
        boolean z9 = z7;
        char c18 = c7;
        char c19 = c9;
        char c20 = c8;
        char c21 = c12;
        int[] iArr9 = this.component1;
        int i16 = iArr9[i7];
        byte[] bArr8 = getMediationNetwork;
        int[] iArr10 = this.areAllFieldsValid;
        byte[][] bArr9 = this.component3;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i16 >>> 24));
        byte[] bArr11 = bArr9[z9 ? 1 : 0];
        bArr2[z9 ? 1 : 0] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i16 >>> 16));
        byte[] bArr12 = bArr9[c18];
        bArr2[c18] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i16 >>> 8));
        byte[] bArr13 = bArr9[c19];
        bArr2[c19] = (byte) (i16 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i17 = iArr9[i7 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[z9 ? 1 : 0]] >>> 24] ^ (i17 >>> 24));
        bArr2[c10] = (byte) (bArr8[(iArr10[bArr11[z9 ? 1 : 0]] >>> 16) & 255] ^ (i17 >>> 16));
        bArr2[c11] = (byte) (bArr8[(iArr10[bArr12[z9 ? 1 : 0]] >>> 8) & 255] ^ (i17 >>> 8));
        bArr2[7] = (byte) (i17 ^ bArr8[iArr10[bArr13[z9 ? 1 : 0]] & 255]);
        int i18 = iArr9[i7 + 2];
        bArr2[c20] = (byte) (bArr8[iArr10[bArr10[c18]] >>> 24] ^ (i18 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c18]] >>> 16) & 255] ^ (i18 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c18]] >>> 8) & 255] ^ (i18 >>> 8));
        bArr2[11] = (byte) (i18 ^ bArr8[iArr10[bArr13[c18]] & 255]);
        int i19 = iArr9[i7 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c19]] >>> 24] ^ (i19 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c19]] >>> 16) & 255] ^ (i19 >>> 16));
        bArr2[c21] = (byte) (bArr8[(iArr10[bArr12[c19]] >>> 8) & 255] ^ (i19 >>> 8));
        bArr2[15] = (byte) (i19 ^ bArr8[iArr10[bArr13[c19]] & 255]);
    }

    private static byte[][] getMonetizationNetwork(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = new byte[bArr[i2].length];
            int i5 = 0;
            while (true) {
                byte[] bArr3 = bArr[i2];
                if (i5 < bArr3.length) {
                    bArr2[i2][bArr3[i5]] = (byte) i5;
                    i5++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getMonetizationNetwork();
        return this.registerClient - this.AFKeystoreWrapper;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getMonetizationNetwork();
        int i2 = this.AFKeystoreWrapper;
        if (i2 >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.toString;
        this.AFKeystoreWrapper = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j7 = 0;
        while (j7 < j && read() != -1) {
            j7++;
        }
        return j7;
    }

    private AFk1nSDK(InputStream inputStream, int i2, byte[] bArr, byte[][] bArr2, byte b7) {
        super(new BufferedInputStream(inputStream, 4096));
        this.areAllFieldsValid = new int[4];
        this.component4 = new byte[16];
        this.toString = new byte[16];
        this.equals = 1;
        this.hashCode = Integer.MAX_VALUE;
        this.AFKeystoreWrapper = 16;
        this.registerClient = 16;
        this.component2 = i2;
        this.component1 = AFk1sSDK.getCurrencyIso4217Code(bArr, i2);
        this.component3 = getMonetizationNetwork(bArr2);
        this.copydefault = 100;
        this.copy = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i5) {
        int i7 = i2 + i5;
        for (int i8 = i2; i8 < i7; i8++) {
            getMonetizationNetwork();
            int i9 = this.AFKeystoreWrapper;
            if (i9 >= this.registerClient) {
                if (i8 == i2) {
                    return -1;
                }
                return i5 - (i7 - i8);
            }
            byte[] bArr2 = this.toString;
            this.AFKeystoreWrapper = i9 + 1;
            bArr[i8] = bArr2[i9];
        }
        return i5;
    }

    private int getMonetizationNetwork() {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 16) {
            byte[] bArr = this.component4;
            int i2 = this.hashCode;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component4, i5, 16 - i5);
                if (read <= 0) {
                    break;
                }
                i5 += read;
            } while (i5 < 16);
            if (i5 >= 16) {
                int i7 = this.copydefault;
                if (i7 == this.copy) {
                    AFAdRevenueData(this.component4, this.toString);
                } else {
                    if (this.equals <= i7) {
                        AFAdRevenueData(this.component4, this.toString);
                    } else {
                        byte[] bArr2 = this.component4;
                        System.arraycopy(bArr2, 0, this.toString, 0, bArr2.length);
                    }
                    int i8 = this.equals;
                    if (i8 < this.copy) {
                        this.equals = i8 + 1;
                    } else {
                        this.equals = 1;
                    }
                }
                int read2 = ((FilterInputStream) this).in.read();
                this.hashCode = read2;
                this.AFKeystoreWrapper = 0;
                this.registerClient = read2 < 0 ? 16 - (this.toString[15] & 255) : 16;
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.registerClient;
    }
}
