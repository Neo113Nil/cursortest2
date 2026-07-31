package com.appsflyer.internal;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class AFk1oSDK extends FilterInputStream implements AutoCloseable {
    private int AFInAppEventType;
    private int AFLogger;
    private final byte[][] areAllFieldsValid;
    private final byte[] component1;
    private final int[] component2;
    private final int component3;
    private final int[] component4;
    private int copy;
    private final int copydefault;
    private final byte[] equals;
    private final int hashCode;
    private int toString;
    private static final byte[] getMonetizationNetwork = AFk1uSDK.getMonetizationNetwork;
    private static final int[] getRevenue = AFk1uSDK.getMediationNetwork;
    private static final int[] getMediationNetwork = AFk1uSDK.AFAdRevenueData;
    private static final int[] getCurrencyIso4217Code = AFk1uSDK.getCurrencyIso4217Code;
    private static final int[] AFAdRevenueData = AFk1uSDK.getRevenue;

    public AFk1oSDK(InputStream inputStream, int i4, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i4, bArr, bArr2, (byte) 0);
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component4;
        boolean z4 = true;
        char c4 = 2;
        char c5 = '\b';
        char c6 = 3;
        int i4 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component2;
        iArr[0] = i4 ^ iArr2[0];
        char c7 = 5;
        char c8 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c9 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i5 = 1;
        int i6 = 4;
        while (i5 < this.component3) {
            int[] iArr3 = getRevenue;
            int[] iArr4 = this.component4;
            boolean z5 = z4;
            byte[][] bArr3 = this.areAllFieldsValid;
            byte[] bArr4 = bArr3[0];
            int i7 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getMediationNetwork;
            byte[] bArr5 = bArr3[z5 ? 1 : 0];
            char c10 = c4;
            int i8 = i7 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE];
            int[] iArr6 = getCurrencyIso4217Code;
            byte[] bArr6 = bArr3[c10];
            char c11 = c6;
            int i9 = i8 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE];
            int[] iArr7 = AFAdRevenueData;
            byte[] bArr7 = bArr3[c11];
            char c12 = c5;
            int i10 = i9 ^ iArr7[iArr4[bArr7[0]] & KotlinVersion.MAX_COMPONENT_VALUE];
            int[] iArr8 = this.component2;
            int i11 = i10 ^ iArr8[i6];
            char c13 = c9;
            char c14 = c7;
            int i12 = (((iArr3[iArr4[bArr4[z5 ? 1 : 0]] >>> 24] ^ iArr5[(iArr4[bArr5[z5 ? 1 : 0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr6[(iArr4[bArr6[z5 ? 1 : 0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr7[iArr4[bArr7[z5 ? 1 : 0]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i6 + 1];
            int i13 = (((iArr3[iArr4[bArr4[c10]] >>> 24] ^ iArr5[(iArr4[bArr5[c10]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr6[(iArr4[bArr6[c10]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr7[iArr4[bArr7[c10]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i6 + 2];
            int i14 = (((iArr3[iArr4[bArr4[c11]] >>> 24] ^ iArr5[(iArr4[bArr5[c11]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr6[(iArr4[bArr6[c11]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr7[iArr4[bArr7[c11]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i6 + 3];
            iArr4[0] = i11;
            iArr4[z5 ? 1 : 0] = i12;
            iArr4[c10] = i13;
            iArr4[c11] = i14;
            i5++;
            i6 += 4;
            z4 = z5 ? 1 : 0;
            c4 = c10;
            c6 = c11;
            c5 = c12;
            c7 = c14;
            c9 = c13;
            c8 = c8;
        }
        boolean z6 = z4;
        char c15 = c4;
        char c16 = c6;
        char c17 = c5;
        char c18 = c9;
        int[] iArr9 = this.component2;
        int i15 = iArr9[i6];
        byte[] bArr8 = getMonetizationNetwork;
        int[] iArr10 = this.component4;
        byte[][] bArr9 = this.areAllFieldsValid;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i15 >>> 24));
        byte[] bArr11 = bArr9[z6 ? 1 : 0];
        bArr2[z6 ? 1 : 0] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i15 >>> 16));
        byte[] bArr12 = bArr9[c15];
        bArr2[c15] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i15 >>> 8));
        byte[] bArr13 = bArr9[c16];
        bArr2[c16] = (byte) (i15 ^ bArr8[iArr10[bArr13[0]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i16 = iArr9[i6 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[z6 ? 1 : 0]] >>> 24] ^ (i16 >>> 24));
        bArr2[c7] = (byte) (bArr8[(iArr10[bArr11[z6 ? 1 : 0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i16 >>> 16));
        bArr2[c8] = (byte) (bArr8[(iArr10[bArr12[z6 ? 1 : 0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i16 >>> 8));
        bArr2[7] = (byte) (i16 ^ bArr8[iArr10[bArr13[z6 ? 1 : 0]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i17 = iArr9[i6 + 2];
        bArr2[c17] = (byte) (bArr8[iArr10[bArr10[c15]] >>> 24] ^ (i17 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c15]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i17 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c15]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i17 >>> 8));
        bArr2[11] = (byte) (i17 ^ bArr8[iArr10[bArr13[c15]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i18 = iArr9[i6 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c16]] >>> 24] ^ (i18 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c16]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i18 >>> 16));
        bArr2[c18] = (byte) (bArr8[(iArr10[bArr12[c16]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i18 >>> 8));
        bArr2[15] = (byte) (i18 ^ bArr8[iArr10[bArr13[c16]] & KotlinVersion.MAX_COMPONENT_VALUE]);
    }

    private int getMediationNetwork() {
        if (this.toString == Integer.MAX_VALUE) {
            this.toString = ((FilterInputStream) this).in.read();
        }
        if (this.AFInAppEventType == 16) {
            byte[] bArr = this.component1;
            int i4 = this.toString;
            bArr[0] = (byte) i4;
            if (i4 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component1, i5, 16 - i5);
                if (read <= 0) {
                    break;
                }
                i5 += read;
            } while (i5 < 16);
            if (i5 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i6 = this.copydefault;
            if (i6 == this.hashCode) {
                AFAdRevenueData(this.component1, this.equals);
            } else {
                if (this.copy <= i6) {
                    AFAdRevenueData(this.component1, this.equals);
                } else {
                    byte[] bArr2 = this.component1;
                    System.arraycopy(bArr2, 0, this.equals, 0, bArr2.length);
                }
                int i7 = this.copy;
                if (i7 < this.hashCode) {
                    this.copy = i7 + 1;
                } else {
                    this.copy = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.toString = read2;
            this.AFInAppEventType = 0;
            this.AFLogger = read2 < 0 ? 16 - (this.equals[15] & 255) : 16;
        }
        return this.AFLogger;
    }

    private static byte[][] getRevenue(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = new byte[bArr[i4].length];
            int i5 = 0;
            while (true) {
                byte[] bArr3 = bArr[i4];
                if (i5 < bArr3.length) {
                    bArr2[i4][bArr3[i5]] = (byte) i5;
                    i5++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getMediationNetwork();
        return this.AFLogger - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i4) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getMediationNetwork();
        int i4 = this.AFInAppEventType;
        if (i4 >= this.AFLogger) {
            return -1;
        }
        byte[] bArr = this.equals;
        this.AFInAppEventType = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) {
        long j5 = 0;
        while (j5 < j4 && read() != -1) {
            j5++;
        }
        return j5;
    }

    private AFk1oSDK(InputStream inputStream, int i4, byte[] bArr, byte[][] bArr2, byte b4) {
        super(new BufferedInputStream(inputStream, Base64Utils.IO_BUFFER_SIZE));
        this.component4 = new int[4];
        this.component1 = new byte[16];
        this.equals = new byte[16];
        this.copy = 1;
        this.toString = Integer.MAX_VALUE;
        this.AFInAppEventType = 16;
        this.AFLogger = 16;
        this.component3 = i4;
        this.component2 = AFk1uSDK.getCurrencyIso4217Code(bArr, i4);
        this.areAllFieldsValid = getRevenue(bArr2);
        this.copydefault = 100;
        this.hashCode = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            getMediationNetwork();
            int i8 = this.AFInAppEventType;
            if (i8 >= this.AFLogger) {
                if (i7 == i4) {
                    return -1;
                }
                return i5 - (i6 - i7);
            }
            byte[] bArr2 = this.equals;
            this.AFInAppEventType = i8 + 1;
            bArr[i7] = bArr2[i8];
        }
        return i5;
    }
}
