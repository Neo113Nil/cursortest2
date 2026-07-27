package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFj1pSDK extends FilterInputStream {
    private final int AFLogger;
    private int afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f5969d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[][] f5970e;
    private final byte[] force;

    /* renamed from: i, reason: collision with root package name */
    private int f5971i;
    private final int[] registerClient;
    private final byte[] unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private int f5972v;
    private static final byte[] AFInAppEventParameterName = AFj1hSDK.AFKeystoreWrapper;
    private static final int[] valueOf = AFj1hSDK.AFInAppEventType;
    private static final int[] AFInAppEventType = AFj1hSDK.valueOf;
    private static final int[] AFKeystoreWrapper = AFj1hSDK.AFInAppEventParameterName;
    private static final int[] values = AFj1hSDK.values;

    public AFj1pSDK(InputStream inputStream, int i2, byte[] bArr, byte[][] bArr2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.registerClient = new int[4];
        this.unregisterClient = new byte[16];
        this.force = new byte[16];
        this.afInfoLog = Integer.MAX_VALUE;
        this.f5972v = 16;
        this.f5971i = 16;
        this.AFLogger = i2;
        this.f5969d = AFj1hSDK.values(bArr, i2);
        this.f5970e = valueOf(bArr2);
    }

    private void AFInAppEventParameterName(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.registerClient;
        char c4 = 1;
        int i2 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.f5969d;
        iArr[0] = i2 ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i4 = 4;
        int i5 = 1;
        while (i5 < this.AFLogger) {
            int[] iArr3 = valueOf;
            int[] iArr4 = this.registerClient;
            byte[][] bArr3 = this.f5970e;
            byte[] bArr4 = bArr3[0];
            int i6 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFInAppEventType;
            byte[] bArr5 = bArr3[c4];
            int i7 = i6 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFKeystoreWrapper;
            byte[] bArr6 = bArr3[2];
            int i8 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i7;
            int[] iArr7 = values;
            byte[] bArr7 = bArr3[3];
            int i9 = iArr7[iArr4[bArr7[0]] & 255] ^ i8;
            int[] iArr8 = this.f5969d;
            int i10 = i9 ^ iArr8[i4];
            int i11 = ((iArr6[(iArr4[bArr6[c4]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c4]] >>> 24] ^ iArr5[(iArr4[bArr5[c4]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c4]] & 255]) ^ iArr8[i4 + 1];
            int i12 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i4 + 2];
            int i13 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i4 + 3];
            iArr4[0] = i10;
            iArr4[1] = i11;
            iArr4[2] = i12;
            iArr4[3] = i13;
            i5++;
            i4 += 4;
            c4 = 1;
        }
        int[] iArr9 = this.f5969d;
        int i14 = iArr9[i4];
        byte[] bArr8 = AFInAppEventParameterName;
        int[] iArr10 = this.registerClient;
        byte[][] bArr9 = this.f5970e;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i14 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i14 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i14 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i14);
        int i15 = iArr9[i4 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i15 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[7] = (byte) (i15 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i16 = iArr9[i4 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i16 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i16 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i16 >>> 8));
        bArr2[11] = (byte) (i16 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i17 = iArr9[i4 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i17 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i17 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i17 >>> 8));
        bArr2[15] = (byte) (i17 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private int AFKeystoreWrapper() {
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.f5972v == 16) {
            byte[] bArr = this.unregisterClient;
            int i2 = this.afInfoLog;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.unregisterClient, i4, 16 - i4);
                if (read <= 0) {
                    break;
                }
                i4 += read;
            } while (i4 < 16);
            if (i4 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventParameterName(this.unregisterClient, this.force);
            int read2 = ((FilterInputStream) this).in.read();
            this.afInfoLog = read2;
            this.f5972v = 0;
            this.f5971i = read2 < 0 ? 16 - (this.force[15] & 255) : 16;
        }
        return this.f5971i;
    }

    private static byte[][] valueOf(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = new byte[bArr[i2].length];
            int i4 = 0;
            while (true) {
                byte[] bArr3 = bArr[i2];
                if (i4 < bArr3.length) {
                    bArr2[i2][bArr3[i4]] = (byte) i4;
                    i4++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFKeystoreWrapper();
        return this.f5971i - this.f5972v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFKeystoreWrapper();
        int i2 = this.f5972v;
        if (i2 >= this.f5971i) {
            return -1;
        }
        byte[] bArr = this.force;
        this.f5972v = i2 + 1;
        return bArr[i2] & 255;
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i4) {
        int i5 = i2 + i4;
        for (int i6 = i2; i6 < i5; i6++) {
            AFKeystoreWrapper();
            int i7 = this.f5972v;
            if (i7 >= this.f5971i) {
                if (i6 == i2) {
                    return -1;
                }
                return i4 - (i5 - i6);
            }
            byte[] bArr2 = this.force;
            this.f5972v = i7 + 1;
            bArr[i6] = bArr2[i7];
        }
        return i4;
    }
}
