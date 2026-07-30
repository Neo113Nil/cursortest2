package com.appsflyer.internal;

import defpackage.dd0;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
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

    private AFk1nSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.areAllFieldsValid = new int[4];
        this.component4 = new byte[16];
        this.toString = new byte[16];
        this.equals = 1;
        this.hashCode = Integer.MAX_VALUE;
        this.AFKeystoreWrapper = 16;
        this.registerClient = 16;
        this.component2 = i;
        this.component1 = AFk1sSDK.getCurrencyIso4217Code(bArr, i);
        this.component3 = getMonetizationNetwork(bArr2);
        this.copydefault = 100;
        this.copy = 100;
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.areAllFieldsValid;
        boolean z = true;
        char c = 2;
        char c2 = '\b';
        char c3 = 3;
        int i = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component1;
        iArr[0] = i ^ iArr2[0];
        char c4 = 5;
        char c5 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c6 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i2 = 1;
        int i3 = 4;
        while (i2 < this.component2) {
            int[] iArr3 = getCurrencyIso4217Code;
            int[] iArr4 = this.areAllFieldsValid;
            boolean z2 = z;
            byte[][] bArr3 = this.component3;
            byte[] bArr4 = bArr3[0];
            int i4 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFAdRevenueData;
            byte[] bArr5 = bArr3[z2 ? 1 : 0];
            char c7 = c;
            int i5 = i4 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getMonetizationNetwork;
            byte[] bArr6 = bArr3[c7];
            char c8 = c3;
            int i6 = i5 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getRevenue;
            byte[] bArr7 = bArr3[c8];
            char c9 = c2;
            int i7 = i6 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component1;
            int i8 = i7 ^ iArr8[i3];
            char c10 = c6;
            char c11 = c4;
            int i9 = (((iArr3[iArr4[bArr4[z2 ? 1 : 0]] >>> 24] ^ iArr5[(iArr4[bArr5[z2 ? 1 : 0]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[z2 ? 1 : 0]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[z2 ? 1 : 0]] & 255]) ^ iArr8[i3 + 1];
            int i10 = (((iArr3[iArr4[bArr4[c7]] >>> 24] ^ iArr5[(iArr4[bArr5[c7]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c7]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c7]] & 255]) ^ iArr8[i3 + 2];
            int i11 = (((iArr3[iArr4[bArr4[c8]] >>> 24] ^ iArr5[(iArr4[bArr5[c8]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c8]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c8]] & 255]) ^ iArr8[i3 + 3];
            iArr4[0] = i8;
            iArr4[z2 ? 1 : 0] = i9;
            iArr4[c7] = i10;
            iArr4[c8] = i11;
            i2++;
            i3 += 4;
            z = z2 ? 1 : 0;
            c = c7;
            c3 = c8;
            c2 = c9;
            c4 = c11;
            c6 = c10;
            c5 = c5;
        }
        boolean z3 = z;
        char c12 = c;
        char c13 = c3;
        char c14 = c2;
        int[] iArr9 = this.component1;
        int i12 = iArr9[i3];
        byte[] bArr8 = getMediationNetwork;
        int[] iArr10 = this.areAllFieldsValid;
        byte[][] bArr9 = this.component3;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i12 >>> 24));
        byte[] bArr11 = bArr9[z3 ? 1 : 0];
        bArr2[z3 ? 1 : 0] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i12 >>> 16));
        byte[] bArr12 = bArr9[c12];
        bArr2[c12] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i12 >>> 8));
        byte[] bArr13 = bArr9[c13];
        bArr2[c13] = (byte) (i12 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i13 = iArr9[i3 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[z3 ? 1 : 0]] >>> 24] ^ (i13 >>> 24));
        bArr2[c4] = (byte) (bArr8[(iArr10[bArr11[z3 ? 1 : 0]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[c5] = (byte) (bArr8[(iArr10[bArr12[z3 ? 1 : 0]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[7] = (byte) (i13 ^ bArr8[iArr10[bArr13[z3 ? 1 : 0]] & 255]);
        int i14 = iArr9[i3 + 2];
        bArr2[c14] = (byte) (bArr8[iArr10[bArr10[c12]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c12]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c12]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[11] = (byte) (i14 ^ bArr8[iArr10[bArr13[c12]] & 255]);
        int i15 = iArr9[i3 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c13]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c13]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[c6] = (byte) (bArr8[(iArr10[bArr12[c13]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (bArr8[iArr10[bArr13[c13]] & 255] ^ i15);
    }

    private int getMonetizationNetwork() {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 16) {
            byte[] bArr = this.component4;
            int i = this.hashCode;
            bArr[0] = (byte) i;
            if (i < 0) {
                dd0.j("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component4, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 < 16) {
                dd0.j("unexpected block size");
                return 0;
            }
            int i3 = this.copydefault;
            if (i3 == this.copy) {
                AFAdRevenueData(this.component4, this.toString);
            } else {
                int i4 = this.equals;
                byte[] bArr2 = this.component4;
                if (i4 <= i3) {
                    AFAdRevenueData(bArr2, this.toString);
                } else {
                    System.arraycopy(bArr2, 0, this.toString, 0, bArr2.length);
                }
                int i5 = this.equals;
                if (i5 < this.copy) {
                    this.equals = i5 + 1;
                } else {
                    this.equals = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.hashCode = read2;
            this.AFKeystoreWrapper = 0;
            this.registerClient = read2 < 0 ? 16 - (this.toString[15] & 255) : 16;
        }
        return this.registerClient;
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
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getMonetizationNetwork();
            int i5 = this.AFKeystoreWrapper;
            if (i5 >= this.registerClient) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.toString;
            this.AFKeystoreWrapper = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getMonetizationNetwork();
        int i = this.AFKeystoreWrapper;
        if (i >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.toString;
        this.AFKeystoreWrapper = i + 1;
        return bArr[i] & 255;
    }

    public AFk1nSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private static byte[][] getMonetizationNetwork(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }
}
