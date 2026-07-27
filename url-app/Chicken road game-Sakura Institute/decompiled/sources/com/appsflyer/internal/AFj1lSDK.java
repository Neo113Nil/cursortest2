package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1lSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private final int AFKeystoreWrapper;
    private int AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private int f5967d;

    /* renamed from: e, reason: collision with root package name */
    private int f5968e;
    private int registerClient;
    private int[] unregisterClient;
    private AFj1nSDK valueOf;
    private byte[] values;

    public AFj1lSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z4, int i4) {
        super(new BufferedInputStream(inputStream, 4096));
        this.f5967d = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i2, 3), 16);
        this.AFKeystoreWrapper = min;
        this.values = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFInAppEventType = bArr2;
        this.AFInAppEventParameterName = new byte[8];
        this.unregisterClient = new int[2];
        this.AFLogger = 8;
        this.f5968e = 8;
        this.registerClient = i4;
        if (i4 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.valueOf = new AFj1nSDK(iArr, min, true, false);
    }

    private int AFInAppEventParameterName() {
        if (this.f5967d == Integer.MAX_VALUE) {
            this.f5967d = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == 8) {
            byte[] bArr = this.values;
            int i2 = this.f5967d;
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
            values();
            int read2 = ((FilterInputStream) this).in.read();
            this.f5967d = read2;
            this.AFLogger = 0;
            this.f5968e = read2 < 0 ? 8 - (this.values[7] & 255) : 8;
        }
        return this.f5968e;
    }

    private void values() {
        if (this.registerClient == 2) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i2 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i4 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i5 = this.AFKeystoreWrapper;
        AFj1nSDK aFj1nSDK = this.valueOf;
        AFj1oSDK.values(i2, i4, false, i5, aFj1nSDK.values, aFj1nSDK.valueOf, this.unregisterClient);
        int[] iArr = this.unregisterClient;
        int i6 = iArr[0];
        int i7 = iArr[1];
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i6 >> 24);
        bArr3[1] = (byte) (i6 >> 16);
        bArr3[2] = (byte) (i6 >> 8);
        bArr3[3] = (byte) i6;
        bArr3[4] = (byte) (i7 >> 24);
        bArr3[5] = (byte) (i7 >> 16);
        bArr3[6] = (byte) (i7 >> 8);
        bArr3[7] = (byte) i7;
        if (this.registerClient == 2) {
            for (int i8 = 0; i8 < 8; i8++) {
                byte[] bArr4 = this.values;
                bArr4[i8] = (byte) (bArr4[i8] ^ this.AFInAppEventType[i8]);
            }
            byte[] bArr5 = this.AFInAppEventParameterName;
            System.arraycopy(bArr5, 0, this.AFInAppEventType, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFInAppEventParameterName();
        return this.f5968e - this.AFLogger;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFInAppEventParameterName();
        int i2 = this.AFLogger;
        if (i2 >= this.f5968e) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFLogger = i2 + 1;
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
            AFInAppEventParameterName();
            int i7 = this.AFLogger;
            if (i7 >= this.f5968e) {
                if (i6 == i2) {
                    return -1;
                }
                return i4 - (i5 - i6);
            }
            byte[] bArr2 = this.values;
            this.AFLogger = i7 + 1;
            bArr[i6] = bArr2[i7];
        }
        return i4;
    }
}
