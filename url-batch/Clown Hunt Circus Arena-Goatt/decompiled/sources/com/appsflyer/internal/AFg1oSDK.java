package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFg1oSDK extends FilterInputStream {
    private static final short AFInAppEventType = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFInAppEventParameterName;
    private int AFKeystoreWrapper;
    private int AFLogger;
    private int AFVersionDeclaration;
    private int afDebugLog;
    private int afErrorLog;
    private int afErrorLogForExcManagerOnly;
    private int afInfoLog;
    private int afRDLog;
    private int getLevel;
    private byte[] valueOf;
    private byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFg1oSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.afErrorLog = Integer.MAX_VALUE;
        this.valueOf = new byte[8];
        this.AFInAppEventParameterName = new byte[8];
        this.values = new byte[8];
        this.AFKeystoreWrapper = 8;
        this.afInfoLog = 8;
        this.afDebugLog = Math.min(Math.max(i2, 5), 16);
        this.afRDLog = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, 8);
        }
        long j = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i != 0) {
            int i4 = (int) j;
            this.AFLogger = i4;
            this.AFVersionDeclaration = i4 * i;
            this.afErrorLogForExcManagerOnly = i4 ^ i;
            this.getLevel = (int) (j >> 32);
            return;
        }
        this.AFLogger = (int) j;
        long j2 = j >> 3;
        short s = AFInAppEventType;
        this.AFVersionDeclaration = (int) ((s * j2) >> 32);
        this.afErrorLogForExcManagerOnly = (int) (j >> 32);
        this.getLevel = (int) (j2 + s);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        valueOf();
        int i = this.AFKeystoreWrapper;
        if (i >= this.afInfoLog) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.AFKeystoreWrapper = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            valueOf();
            int i5 = this.AFKeystoreWrapper;
            if (i5 >= this.afInfoLog) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.valueOf;
            this.AFKeystoreWrapper = i5 + 1;
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
        valueOf();
        return this.afInfoLog - this.AFKeystoreWrapper;
    }

    private void values() {
        if (this.afRDLog == 3) {
            byte[] bArr = this.valueOf;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.valueOf;
        boolean z = true;
        char c = 2;
        int i = ((bArr2[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << Ascii.DLE) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << Ascii.DLE)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.afDebugLog;
            if (i3 >= i4) {
                break;
            }
            short s = AFInAppEventType;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.afErrorLogForExcManagerOnly)) ^ ((i >>> 5) + this.getLevel);
            i -= (((i2 << 4) + this.AFLogger) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.AFVersionDeclaration);
            i3++;
            c = c;
            z = z;
        }
        byte[] bArr3 = this.valueOf;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z ? 1 : 0] = (byte) (i >> 16);
        bArr3[c] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.afRDLog == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.valueOf;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.AFInAppEventParameterName[i5]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.AFInAppEventParameterName, 0, bArr5.length);
        }
    }

    private int valueOf() throws IOException {
        if (this.afErrorLog == Integer.MAX_VALUE) {
            this.afErrorLog = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 8) {
            byte[] bArr = this.valueOf;
            int i = this.afErrorLog;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.valueOf, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            values();
            int read2 = ((FilterInputStream) this).in.read();
            this.afErrorLog = read2;
            this.AFKeystoreWrapper = 0;
            this.afInfoLog = read2 < 0 ? 8 - (this.valueOf[7] & 255) : 8;
        }
        return this.afInfoLog;
    }
}
