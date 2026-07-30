package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private int AFAdRevenueData;
    private int[] areAllFieldsValid;
    private byte[] component1;
    private byte[] component2;
    private byte[] component3;
    private int component4;
    private int equals;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private AFk1xSDK getRevenue;
    private int hashCode;
    private int toString;

    public AFk1tSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z7, int i5) {
        this(inputStream, iArr, bArr, i2, false, i5, (byte) 0);
    }

    private int AFAdRevenueData() {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.component4 == 8) {
            byte[] bArr = this.component1;
            int i2 = this.hashCode;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component1, i5, 8 - i5);
                if (read <= 0) {
                    break;
                }
                i5 += read;
            } while (i5 < 8);
            if (i5 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i7 = this.getMonetizationNetwork;
            if (i7 == this.getMediationNetwork) {
                getMediationNetwork();
            } else {
                if (this.AFAdRevenueData <= i7) {
                    getMediationNetwork();
                }
                int i8 = this.AFAdRevenueData;
                if (i8 < this.getMediationNetwork) {
                    this.AFAdRevenueData = i8 + 1;
                } else {
                    this.AFAdRevenueData = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.hashCode = read2;
            this.component4 = 0;
            this.equals = read2 < 0 ? 8 - (this.component1[7] & 255) : 8;
        }
        return this.equals;
    }

    private void getMediationNetwork() {
        if (this.toString == 2) {
            byte[] bArr = this.component1;
            System.arraycopy(bArr, 0, this.component3, 0, bArr.length);
        }
        byte[] bArr2 = this.component1;
        int i2 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i5 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i7 = this.getCurrencyIso4217Code;
        AFk1xSDK aFk1xSDK = this.getRevenue;
        AFk1rSDK.getRevenue(i2, i5, false, i7, aFk1xSDK.getCurrencyIso4217Code, aFk1xSDK.AFAdRevenueData, this.areAllFieldsValid);
        int[] iArr = this.areAllFieldsValid;
        int i8 = iArr[0];
        int i9 = iArr[1];
        byte[] bArr3 = this.component1;
        bArr3[0] = (byte) (i8 >> 24);
        bArr3[1] = (byte) (i8 >> 16);
        bArr3[2] = (byte) (i8 >> 8);
        bArr3[3] = (byte) i8;
        bArr3[4] = (byte) (i9 >> 24);
        bArr3[5] = (byte) (i9 >> 16);
        bArr3[6] = (byte) (i9 >> 8);
        bArr3[7] = (byte) i9;
        if (this.toString == 2) {
            for (int i10 = 0; i10 < 8; i10++) {
                byte[] bArr4 = this.component1;
                bArr4[i10] = (byte) (bArr4[i10] ^ this.component2[i10]);
            }
            byte[] bArr5 = this.component3;
            System.arraycopy(bArr5, 0, this.component2, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFAdRevenueData();
        return this.equals - this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFAdRevenueData();
        int i2 = this.component4;
        if (i2 >= this.equals) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.component4 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j7 = 0;
        while (j7 < j && read() != -1) {
            j7++;
        }
        return j7;
    }

    private AFk1tSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z7, int i5, byte b7) {
        super(new BufferedInputStream(inputStream, 4096));
        this.AFAdRevenueData = 1;
        this.hashCode = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i2, 3), 16);
        this.getCurrencyIso4217Code = min;
        this.component1 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component2 = bArr2;
        this.component3 = new byte[8];
        this.areAllFieldsValid = new int[2];
        this.component4 = 8;
        this.equals = 8;
        this.toString = i5;
        if (i5 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getRevenue = new AFk1xSDK(iArr, min, true, false);
        this.getMonetizationNetwork = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i5) {
        int i7 = i2 + i5;
        for (int i8 = i2; i8 < i7; i8++) {
            AFAdRevenueData();
            int i9 = this.component4;
            if (i9 >= this.equals) {
                if (i8 == i2) {
                    return -1;
                }
                return i5 - (i7 - i8);
            }
            byte[] bArr2 = this.component1;
            this.component4 = i9 + 1;
            bArr[i8] = bArr2[i9];
        }
        return i5;
    }
}
