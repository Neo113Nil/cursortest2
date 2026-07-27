package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1jSDK extends FilterInputStream {
    private static final short AFInAppEventParameterName = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private int AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger;
    private int afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private int f5963d;

    /* renamed from: e, reason: collision with root package name */
    private int f5964e;

    /* renamed from: i, reason: collision with root package name */
    private int f5965i;
    private int registerClient;
    private int unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private int f5966v;
    private byte[] valueOf;
    private byte[] values;

    public AFj1jSDK(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i4, int i5) {
        super(new BufferedInputStream(inputStream, 4096));
        this.AFLogger = Integer.MAX_VALUE;
        this.values = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.valueOf = new byte[8];
        this.AFInAppEventType = 8;
        this.f5964e = 8;
        this.registerClient = Math.min(Math.max(i4, 5), 16);
        this.f5963d = i5;
        if (i5 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j4 = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i2 != 0) {
            int i6 = (int) j4;
            this.unregisterClient = i6;
            this.f5965i = i6 * i2;
            this.f5966v = i6 ^ i2;
            this.afInfoLog = (int) (j4 >> 32);
            return;
        }
        this.unregisterClient = (int) j4;
        long j5 = j4 >> 3;
        short s4 = AFInAppEventParameterName;
        this.f5965i = (int) ((s4 * j5) >> 32);
        this.f5966v = (int) (j4 >> 32);
        this.afInfoLog = (int) (j5 + s4);
    }

    private int AFInAppEventType() {
        if (this.AFLogger == Integer.MAX_VALUE) {
            this.AFLogger = ((FilterInputStream) this).in.read();
        }
        if (this.AFInAppEventType == 8) {
            byte[] bArr = this.values;
            int i2 = this.AFLogger;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.values, i4, 8 - i4);
                if (read <= 0) {
                    break;
                }
                i4 += read;
            } while (i4 < 8);
            if (i4 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            valueOf();
            int read2 = ((FilterInputStream) this).in.read();
            this.AFLogger = read2;
            this.AFInAppEventType = 0;
            this.f5964e = read2 < 0 ? 8 - (this.values[7] & 255) : 8;
        }
        return this.f5964e;
    }

    private void valueOf() {
        if (this.f5963d == 3) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.valueOf, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i2 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i4 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i5 = 0;
        while (true) {
            int i6 = this.registerClient;
            if (i5 >= i6) {
                break;
            }
            short s4 = AFInAppEventParameterName;
            i4 -= ((((i6 - i5) * s4) + i2) ^ ((i2 << 4) + this.f5966v)) ^ ((i2 >>> 5) + this.afInfoLog);
            i2 -= (((i4 << 4) + this.unregisterClient) ^ (((i6 - i5) * s4) + i4)) ^ ((i4 >>> 5) + this.f5965i);
            i5++;
        }
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i2 >> 24);
        bArr3[1] = (byte) (i2 >> 16);
        bArr3[2] = (byte) (i2 >> 8);
        bArr3[3] = (byte) i2;
        bArr3[4] = (byte) (i4 >> 24);
        bArr3[5] = (byte) (i4 >> 16);
        bArr3[6] = (byte) (i4 >> 8);
        bArr3[7] = (byte) i4;
        if (this.f5963d == 3) {
            for (int i7 = 0; i7 < 8; i7++) {
                byte[] bArr4 = this.values;
                bArr4[i7] = (byte) (bArr4[i7] ^ this.AFKeystoreWrapper[i7]);
            }
            byte[] bArr5 = this.valueOf;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFInAppEventType();
        return this.f5964e - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFInAppEventType();
        int i2 = this.AFInAppEventType;
        if (i2 >= this.f5964e) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFInAppEventType = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) {
        long j5 = 0;
        while (j5 < j4 && read() != -1) {
            j5++;
        }
        return j5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i4) {
        int i5 = i2 + i4;
        for (int i6 = i2; i6 < i5; i6++) {
            AFInAppEventType();
            int i7 = this.AFInAppEventType;
            if (i7 >= this.f5964e) {
                if (i6 == i2) {
                    return -1;
                }
                return i4 - (i5 - i6);
            }
            byte[] bArr2 = this.values;
            this.AFInAppEventType = i7 + 1;
            bArr[i6] = bArr2[i7];
        }
        return i4;
    }
}
