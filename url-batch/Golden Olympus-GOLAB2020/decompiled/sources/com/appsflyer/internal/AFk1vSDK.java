package com.appsflyer.internal;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1vSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private int areAllFieldsValid;
    private byte[] component1;
    private int[] component2;
    private byte[] component3;
    private byte[] component4;
    private int copydefault;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private AFk1sSDK getMonetizationNetwork;
    private int getRevenue;
    private int hashCode;
    private int toString;

    public AFk1vSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i4, boolean z4, int i5) {
        this(inputStream, iArr, bArr, i4, false, i5, (byte) 0);
    }

    private int AFAdRevenueData() {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.areAllFieldsValid == 8) {
            byte[] bArr = this.component4;
            int i4 = this.hashCode;
            bArr[0] = (byte) i4;
            if (i4 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.component4, i5, 8 - i5);
                if (read <= 0) {
                    break;
                }
                i5 += read;
            } while (i5 < 8);
            if (i5 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i6 = this.getMediationNetwork;
            if (i6 == this.AFAdRevenueData) {
                getCurrencyIso4217Code();
            } else {
                if (this.getRevenue <= i6) {
                    getCurrencyIso4217Code();
                }
                int i7 = this.getRevenue;
                if (i7 < this.AFAdRevenueData) {
                    this.getRevenue = i7 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.hashCode = read2;
            this.areAllFieldsValid = 0;
            this.toString = read2 < 0 ? 8 - (this.component4[7] & 255) : 8;
        }
        return this.toString;
    }

    private void getCurrencyIso4217Code() {
        if (this.copydefault == 2) {
            byte[] bArr = this.component4;
            System.arraycopy(bArr, 0, this.component3, 0, bArr.length);
        }
        byte[] bArr2 = this.component4;
        int i4 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i5 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i6 = this.getCurrencyIso4217Code;
        AFk1sSDK aFk1sSDK = this.getMonetizationNetwork;
        AFk1tSDK.AFAdRevenueData(i4, i5, false, i6, aFk1sSDK.getCurrencyIso4217Code, aFk1sSDK.getRevenue, this.component2);
        int[] iArr = this.component2;
        int i7 = iArr[0];
        int i8 = iArr[1];
        byte[] bArr3 = this.component4;
        bArr3[0] = (byte) (i7 >> 24);
        bArr3[1] = (byte) (i7 >> 16);
        bArr3[2] = (byte) (i7 >> 8);
        bArr3[3] = (byte) i7;
        bArr3[4] = (byte) (i8 >> 24);
        bArr3[5] = (byte) (i8 >> 16);
        bArr3[6] = (byte) (i8 >> 8);
        bArr3[7] = (byte) i8;
        if (this.copydefault == 2) {
            for (int i9 = 0; i9 < 8; i9++) {
                byte[] bArr4 = this.component4;
                bArr4[i9] = (byte) (bArr4[i9] ^ this.component1[i9]);
            }
            byte[] bArr5 = this.component3;
            System.arraycopy(bArr5, 0, this.component1, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFAdRevenueData();
        return this.toString - this.areAllFieldsValid;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFAdRevenueData();
        int i4 = this.areAllFieldsValid;
        if (i4 >= this.toString) {
            return -1;
        }
        byte[] bArr = this.component4;
        this.areAllFieldsValid = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) {
        long j5 = 0;
        while (j5 < j4 && read() != -1) {
            j5++;
        }
        return j5;
    }

    private AFk1vSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i4, boolean z4, int i5, byte b4) {
        super(new BufferedInputStream(inputStream, Base64Utils.IO_BUFFER_SIZE));
        this.getRevenue = 1;
        this.hashCode = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i4, 3), 16);
        this.getCurrencyIso4217Code = min;
        this.component4 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component1 = bArr2;
        this.component3 = new byte[8];
        this.component2 = new int[2];
        this.areAllFieldsValid = 8;
        this.toString = 8;
        this.copydefault = i5;
        if (i5 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getMonetizationNetwork = new AFk1sSDK(iArr, min, true, false);
        this.getMediationNetwork = 100;
        this.AFAdRevenueData = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            AFAdRevenueData();
            int i8 = this.areAllFieldsValid;
            if (i8 >= this.toString) {
                if (i7 == i4) {
                    return -1;
                }
                return i5 - (i6 - i7);
            }
            byte[] bArr2 = this.component4;
            this.areAllFieldsValid = i8 + 1;
            bArr[i7] = bArr2[i8];
        }
        return i5;
    }
}
