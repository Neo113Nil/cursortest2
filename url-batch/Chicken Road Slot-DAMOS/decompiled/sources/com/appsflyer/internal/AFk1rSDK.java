package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFk1rSDK extends FilterInputStream {
    private static final short getMediationNetwork = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private int AFAdRevenueData;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMonetizationNetwork;
    private byte[] getRevenue;
    private int hashCode;
    private int registerClient;
    private int toString;

    private AFk1rSDK(InputStream inputStream, int[] iArr, int i3, byte[] bArr, int i10, int i11, byte b10) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component1 = Integer.MAX_VALUE;
        this.registerClient = 1;
        this.getMonetizationNetwork = new byte[8];
        this.getRevenue = new byte[8];
        this.getCurrencyIso4217Code = new byte[8];
        this.AFAdRevenueData = 8;
        this.component4 = 8;
        this.areAllFieldsValid = Math.min(Math.max(i10, 5), 16);
        this.component3 = i11;
        if (i11 == 3) {
            System.arraycopy(bArr, 0, this.getRevenue, 0, 8);
        }
        long j = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i3 == 0) {
            this.component2 = (int) j;
            long j3 = j >> 3;
            short s3 = getMediationNetwork;
            this.hashCode = (int) ((s3 * j3) >> 32);
            this.copy = (int) (j >> 32);
            this.toString = (int) (j3 + s3);
        } else {
            int i12 = (int) j;
            this.component2 = i12;
            this.hashCode = i12 * i3;
            this.copy = i3 ^ i12;
            this.toString = (int) (j >> 32);
        }
        this.equals = 100;
        this.copydefault = 100;
    }

    private int AFAdRevenueData() {
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.AFAdRevenueData == 8) {
            byte[] bArr = this.getMonetizationNetwork;
            int i3 = this.component1;
            bArr[0] = (byte) i3;
            if (i3 < 0) {
                i0.l("unexpected block size");
                return 0;
            }
            int i10 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.getMonetizationNetwork, i10, 8 - i10);
                if (read <= 0) {
                    break;
                }
                i10 += read;
            } while (i10 < 8);
            if (i10 < 8) {
                i0.l("unexpected block size");
                return 0;
            }
            int i11 = this.equals;
            if (i11 == this.copydefault) {
                getCurrencyIso4217Code();
            } else {
                if (this.registerClient <= i11) {
                    getCurrencyIso4217Code();
                }
                int i12 = this.registerClient;
                if (i12 < this.copydefault) {
                    this.registerClient = i12 + 1;
                } else {
                    this.registerClient = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.AFAdRevenueData = 0;
            this.component4 = read2 < 0 ? 8 - (this.getMonetizationNetwork[7] & 255) : 8;
        }
        return this.component4;
    }

    private void getCurrencyIso4217Code() {
        if (this.component3 == 3) {
            byte[] bArr = this.getMonetizationNetwork;
            System.arraycopy(bArr, 0, this.getCurrencyIso4217Code, 0, bArr.length);
        }
        byte[] bArr2 = this.getMonetizationNetwork;
        boolean z10 = true;
        char c10 = 2;
        int i3 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i10 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i11 = 0;
        while (true) {
            int i12 = this.areAllFieldsValid;
            if (i11 >= i12) {
                break;
            }
            short s3 = getMediationNetwork;
            i10 -= ((((i12 - i11) * s3) + i3) ^ ((i3 << 4) + this.copy)) ^ ((i3 >>> 5) + this.toString);
            i3 -= (((i10 << 4) + this.component2) ^ (((i12 - i11) * s3) + i10)) ^ ((i10 >>> 5) + this.hashCode);
            i11++;
            c10 = c10;
            z10 = z10;
        }
        byte[] bArr3 = this.getMonetizationNetwork;
        bArr3[0] = (byte) (i3 >> 24);
        bArr3[z10 ? 1 : 0] = (byte) (i3 >> 16);
        bArr3[c10] = (byte) (i3 >> 8);
        bArr3[3] = (byte) i3;
        bArr3[4] = (byte) (i10 >> 24);
        bArr3[5] = (byte) (i10 >> 16);
        bArr3[6] = (byte) (i10 >> 8);
        bArr3[7] = (byte) i10;
        if (this.component3 == 3) {
            for (int i13 = 0; i13 < 8; i13++) {
                byte[] bArr4 = this.getMonetizationNetwork;
                bArr4[i13] = (byte) (bArr4[i13] ^ this.getRevenue[i13]);
            }
            byte[] bArr5 = this.getCurrencyIso4217Code;
            System.arraycopy(bArr5, 0, this.getRevenue, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFAdRevenueData();
        return this.component4 - this.AFAdRevenueData;
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
            int i13 = this.AFAdRevenueData;
            if (i13 >= this.component4) {
                if (i12 == i3) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.getMonetizationNetwork;
            this.AFAdRevenueData = i13 + 1;
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
        int i3 = this.AFAdRevenueData;
        if (i3 >= this.component4) {
            return -1;
        }
        byte[] bArr = this.getMonetizationNetwork;
        this.AFAdRevenueData = i3 + 1;
        return bArr[i3] & 255;
    }

    public AFk1rSDK(InputStream inputStream, int[] iArr, int i3, byte[] bArr, int i10, int i11) {
        this(inputStream, iArr, i3, bArr, i10, i11, (byte) 0);
    }
}
