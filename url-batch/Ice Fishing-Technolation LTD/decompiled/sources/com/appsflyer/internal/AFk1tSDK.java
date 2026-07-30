package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private short component1;
    private int component2;
    private int component3;
    private long[] component4;
    private long[] getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private int getRevenue;
    private int toString;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFk1tSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }

    private AFk1tSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.component3 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.getMonetizationNetwork = min;
        this.areAllFieldsValid = new byte[min];
        this.getCurrencyIso4217Code = new long[4];
        this.component4 = new long[4];
        this.component2 = min;
        this.toString = min;
        this.getCurrencyIso4217Code = AFk1sSDK.getCurrencyIso4217Code(i ^ i4, min ^ i4);
        this.component4 = AFk1sSDK.getCurrencyIso4217Code(i2 ^ i4, i3 ^ i4);
        this.AFAdRevenueData = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i = this.component2;
        if (i >= this.toString) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component2 = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getCurrencyIso4217Code();
            int i5 = this.component2;
            if (i5 >= this.toString) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component2 = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.toString - this.component2;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.getCurrencyIso4217Code;
        long[] jArr2 = this.component4;
        short s = this.component1;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.getMonetizationNetwork; i2++) {
            this.areAllFieldsValid[i2] = (byte) (r1[i2] ^ ((this.getCurrencyIso4217Code[this.component1] >> (i2 << 3)) & 255));
        }
        this.component1 = (short) ((this.component1 + 1) % 4);
    }

    private int getCurrencyIso4217Code() throws IOException {
        int i;
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == this.getMonetizationNetwork) {
            byte[] bArr = this.areAllFieldsValid;
            int i2 = this.component3;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i3, this.getMonetizationNetwork - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.getMonetizationNetwork);
            if (i3 < this.getMonetizationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.AFAdRevenueData;
            if (i4 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getRevenue <= i4) {
                    getMonetizationNetwork();
                }
                int i5 = this.getRevenue;
                if (i5 < this.getMediationNetwork) {
                    this.getRevenue = i5 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component3 = read2;
            this.component2 = 0;
            if (read2 < 0) {
                int i6 = this.getMonetizationNetwork;
                i = i6 - (this.areAllFieldsValid[i6 - 1] & UByte.MAX_VALUE);
            } else {
                i = this.getMonetizationNetwork;
            }
            this.toString = i;
        }
        return this.toString;
    }
}
