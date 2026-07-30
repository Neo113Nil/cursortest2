package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class AFj1lSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private final int AFKeystoreWrapper;
    private int AFLogger;
    private int d;
    private int e;
    private int registerClient;
    private int[] unregisterClient;
    private AFj1nSDK valueOf;
    private byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFj1lSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.d = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.AFKeystoreWrapper = min;
        this.values = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFInAppEventType = bArr2;
        this.AFInAppEventParameterName = new byte[8];
        this.unregisterClient = new int[2];
        this.AFLogger = 8;
        this.e = 8;
        this.registerClient = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.valueOf = new AFj1nSDK(iArr, min, true, false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventParameterName();
        int i = this.AFLogger;
        if (i >= this.e) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFLogger = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventParameterName();
            int i5 = this.AFLogger;
            if (i5 >= this.e) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.values;
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
        AFInAppEventParameterName();
        return this.e - this.AFLogger;
    }

    private void values() {
        if (this.registerClient == 2) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        AFj1oSDK.values(((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & UByte.MAX_VALUE), ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UByte.MAX_VALUE), false, this.AFKeystoreWrapper, this.valueOf.values, this.valueOf.valueOf, this.unregisterClient);
        int[] iArr = this.unregisterClient;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.registerClient == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.values;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.AFInAppEventType[i3]);
            }
            byte[] bArr5 = this.AFInAppEventParameterName;
            System.arraycopy(bArr5, 0, this.AFInAppEventType, 0, bArr5.length);
        }
    }

    private int AFInAppEventParameterName() throws IOException {
        if (this.d == Integer.MAX_VALUE) {
            this.d = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == 8) {
            byte[] bArr = this.values;
            int i = this.d;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.values, i2, 8 - i2);
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
            this.d = read2;
            this.AFLogger = 0;
            this.e = read2 < 0 ? 8 - (this.values[7] & UByte.MAX_VALUE) : 8;
        }
        return this.e;
    }
}
