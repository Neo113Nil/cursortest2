package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFg1uSDK extends FilterInputStream {
    private AFg1sSDK AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger;
    private int afDebugLog;
    private int[] afErrorLog;
    private int afInfoLog;
    private int afRDLog;
    private final int valueOf;
    private byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFg1uSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        this.afInfoLog = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.valueOf = min;
        this.AFInAppEventType = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFKeystoreWrapper = bArr2;
        this.values = new byte[8];
        this.afErrorLog = new int[2];
        this.AFLogger = 8;
        this.afRDLog = 8;
        this.afDebugLog = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.AFInAppEventParameterName = new AFg1sSDK(iArr, min, true, false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i = this.AFLogger;
        if (i >= this.afRDLog) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventType;
        this.AFLogger = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFKeystoreWrapper();
            int i5 = this.AFLogger;
            if (i5 >= this.afRDLog) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFInAppEventType;
            this.AFLogger = i5 + 1;
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
        AFKeystoreWrapper();
        return this.afRDLog - this.AFLogger;
    }

    private void AFInAppEventParameterName() {
        if (this.afDebugLog == 2) {
            byte[] bArr = this.AFInAppEventType;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.AFInAppEventType;
        AFg1tSDK.AFInAppEventParameterName(((bArr2[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << Ascii.DLE) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255), ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << Ascii.DLE)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.valueOf, this.AFInAppEventParameterName.valueOf, this.AFInAppEventParameterName.AFKeystoreWrapper, this.afErrorLog);
        int[] iArr = this.afErrorLog;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.AFInAppEventType;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.afDebugLog == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.AFInAppEventType;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.AFKeystoreWrapper[i3]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    private int AFKeystoreWrapper() throws IOException {
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == 8) {
            byte[] bArr = this.AFInAppEventType;
            int i = this.afInfoLog;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFInAppEventType, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventParameterName();
            int read2 = ((FilterInputStream) this).in.read();
            this.afInfoLog = read2;
            this.AFLogger = 0;
            this.afRDLog = read2 < 0 ? 8 - (this.AFInAppEventType[7] & 255) : 8;
        }
        return this.afRDLog;
    }
}
