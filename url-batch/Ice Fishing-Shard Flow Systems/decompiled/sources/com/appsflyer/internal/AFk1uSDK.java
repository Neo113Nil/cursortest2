package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1uSDK extends FilterInputStream {
    private long[] AFAdRevenueData;
    private int areAllFieldsValid;
    private byte[] component1;
    private int component2;
    private long[] component3;
    private short component4;
    private int copydefault;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private int getMonetizationNetwork;
    private final int getRevenue;

    public AFk1uSDK(InputStream inputStream, int i2, int i5, short s7, int i7, int i8) {
        this(inputStream, i2, i5, s7, i7, i8, (byte) 0);
    }

    private int getCurrencyIso4217Code() {
        int i2;
        if (this.areAllFieldsValid == Integer.MAX_VALUE) {
            this.areAllFieldsValid = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == this.getMediationNetwork) {
            byte[] bArr = this.component1;
            int i5 = this.areAllFieldsValid;
            bArr[0] = (byte) i5;
            if (i5 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i7 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component1, i7, this.getMediationNetwork - i7);
                if (read <= 0) {
                    break;
                }
                i7 += read;
            } while (i7 < this.getMediationNetwork);
            if (i7 < this.getMediationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i8 = this.getCurrencyIso4217Code;
            if (i8 == this.getRevenue) {
                getMediationNetwork();
            } else {
                if (this.getMonetizationNetwork <= i8) {
                    getMediationNetwork();
                }
                int i9 = this.getMonetizationNetwork;
                if (i9 < this.getRevenue) {
                    this.getMonetizationNetwork = i9 + 1;
                } else {
                    this.getMonetizationNetwork = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = read2;
            this.component2 = 0;
            if (read2 < 0) {
                int i10 = this.getMediationNetwork;
                i2 = i10 - (this.component1[i10 - 1] & 255);
            } else {
                i2 = this.getMediationNetwork;
            }
            this.copydefault = i2;
        }
        return this.copydefault;
    }

    private void getMediationNetwork() {
        long[] jArr = this.AFAdRevenueData;
        long[] jArr2 = this.component3;
        short s7 = this.component4;
        long j = jArr[s7 % 4] * 2147483085;
        long j7 = jArr2[(s7 + 2) % 4];
        int i2 = (s7 + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + j7) / 2147483647L;
        jArr[i2] = (j + j7) % 2147483647L;
        for (int i5 = 0; i5 < this.getMediationNetwork; i5++) {
            this.component1[i5] = (byte) (r1[i5] ^ ((this.AFAdRevenueData[this.component4] >> (i5 << 3)) & 255));
        }
        this.component4 = (short) ((this.component4 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getCurrencyIso4217Code();
        return this.copydefault - this.component2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        getCurrencyIso4217Code();
        int i2 = this.component2;
        if (i2 >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.component2 = i2 + 1;
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

    private AFk1uSDK(InputStream inputStream, int i2, int i5, short s7, int i7, int i8, byte b7) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMonetizationNetwork = 1;
        this.areAllFieldsValid = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s7, 4), 8);
        this.getMediationNetwork = min;
        this.component1 = new byte[min];
        this.AFAdRevenueData = new long[4];
        this.component3 = new long[4];
        this.component2 = min;
        this.copydefault = min;
        this.AFAdRevenueData = AFk1vSDK.getMediationNetwork(i2 ^ i8, min ^ i8);
        this.component3 = AFk1vSDK.getMediationNetwork(i5 ^ i8, i7 ^ i8);
        this.getCurrencyIso4217Code = 100;
        this.getRevenue = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i5) {
        int i7 = i2 + i5;
        for (int i8 = i2; i8 < i7; i8++) {
            getCurrencyIso4217Code();
            int i9 = this.component2;
            if (i9 >= this.copydefault) {
                if (i8 == i2) {
                    return -1;
                }
                return i5 - (i7 - i8);
            }
            byte[] bArr2 = this.component1;
            this.component2 = i9 + 1;
            bArr[i8] = bArr2[i9];
        }
        return i5;
    }
}
