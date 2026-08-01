package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private long[] AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private int component1;
    private short component2;
    private int component3;
    private long[] component4;
    private int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private int hashCode;

    private AFk1tSDK(InputStream inputStream, int i3, int i10, short s3, int i11, int i12, byte b10) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getCurrencyIso4217Code = 1;
        this.component1 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s3, 4), 8);
        this.getMonetizationNetwork = min;
        this.areAllFieldsValid = new byte[min];
        this.AFAdRevenueData = new long[4];
        this.component4 = new long[4];
        this.component3 = min;
        this.hashCode = min;
        this.AFAdRevenueData = AFk1sSDK.getCurrencyIso4217Code(i3 ^ i12, min ^ i12);
        this.component4 = AFk1sSDK.getCurrencyIso4217Code(i10 ^ i12, i11 ^ i12);
        this.getRevenue = 100;
        this.getMediationNetwork = 100;
    }

    private int AFAdRevenueData() {
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.component3 == this.getMonetizationNetwork) {
            byte[] bArr = this.areAllFieldsValid;
            int i3 = this.component1;
            bArr[0] = (byte) i3;
            if (i3 < 0) {
                i0.l("unexpected block size");
                return 0;
            }
            int i10 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i10, this.getMonetizationNetwork - i10);
                if (read <= 0) {
                    break;
                }
                i10 += read;
            } while (i10 < this.getMonetizationNetwork);
            if (i10 < this.getMonetizationNetwork) {
                i0.l("unexpected block size");
                return 0;
            }
            int i11 = this.getRevenue;
            if (i11 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getCurrencyIso4217Code <= i11) {
                    getMonetizationNetwork();
                }
                int i12 = this.getCurrencyIso4217Code;
                if (i12 < this.getMediationNetwork) {
                    this.getCurrencyIso4217Code = i12 + 1;
                } else {
                    this.getCurrencyIso4217Code = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.component3 = 0;
            int i13 = this.getMonetizationNetwork;
            if (read2 < 0) {
                i13 -= this.areAllFieldsValid[i13 - 1] & 255;
            }
            this.hashCode = i13;
        }
        return this.hashCode;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.AFAdRevenueData;
        long[] jArr2 = this.component4;
        short s3 = this.component2;
        long j = jArr[s3 % 4] * 2147483085;
        long j3 = jArr2[(s3 + 2) % 4];
        int i3 = (s3 + 3) % 4;
        jArr2[i3] = ((jArr[i3] * 2147483085) + j3) / 2147483647L;
        jArr[i3] = (j + j3) % 2147483647L;
        for (int i10 = 0; i10 < this.getMonetizationNetwork; i10++) {
            this.areAllFieldsValid[i10] = (byte) (r1[i10] ^ ((this.AFAdRevenueData[this.component2] >> (i10 << 3)) & 255));
        }
        this.component2 = (short) ((this.component2 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFAdRevenueData();
        return this.hashCode - this.component3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        int i11 = i3 + i10;
        for (int i12 = i3; i12 < i11; i12++) {
            AFAdRevenueData();
            int i13 = this.component3;
            if (i13 >= this.hashCode) {
                if (i12 == i3) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component3 = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j3 = 0;
        while (j3 < j && read() != -1) {
            j3++;
        }
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFAdRevenueData();
        int i3 = this.component3;
        if (i3 >= this.hashCode) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component3 = i3 + 1;
        return bArr[i3] & 255;
    }

    public AFk1tSDK(InputStream inputStream, int i3, int i10, short s3, int i11, int i12) {
        this(inputStream, i3, i10, s3, i11, i12, (byte) 0);
    }
}
