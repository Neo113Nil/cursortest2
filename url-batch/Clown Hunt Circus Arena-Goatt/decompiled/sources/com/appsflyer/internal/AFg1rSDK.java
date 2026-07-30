package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFg1rSDK extends FilterInputStream {
    private long[] AFInAppEventParameterName;
    private final int AFInAppEventType;
    private long[] AFKeystoreWrapper;
    private int AFLogger;
    private int afErrorLog;
    private int afInfoLog;
    private short valueOf;
    private byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFg1rSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        this.afInfoLog = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.AFInAppEventType = min;
        this.values = new byte[min];
        this.AFKeystoreWrapper = new long[4];
        this.AFInAppEventParameterName = new long[4];
        this.AFLogger = min;
        this.afErrorLog = min;
        this.AFKeystoreWrapper = AFg1vSDK.AFInAppEventParameterName(i ^ i4, min ^ i4);
        this.AFInAppEventParameterName = AFg1vSDK.AFInAppEventParameterName(i2 ^ i4, i3 ^ i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.AFLogger;
        if (i >= this.afErrorLog) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFLogger = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventType();
            int i5 = this.AFLogger;
            if (i5 >= this.afErrorLog) {
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
        AFInAppEventType();
        return this.afErrorLog - this.AFLogger;
    }

    private void values() {
        long[] jArr = this.AFKeystoreWrapper;
        long[] jArr2 = this.AFInAppEventParameterName;
        short s = this.valueOf;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.AFInAppEventType; i2++) {
            this.values[i2] = (byte) (r1[i2] ^ ((this.AFKeystoreWrapper[this.valueOf] >> (i2 << 3)) & 255));
        }
        this.valueOf = (short) ((this.valueOf + 1) % 4);
    }

    private int AFInAppEventType() throws IOException {
        int i;
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == this.AFInAppEventType) {
            byte[] bArr = this.values;
            int i2 = this.afInfoLog;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.values, i3, this.AFInAppEventType - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.AFInAppEventType);
            if (i3 < this.AFInAppEventType) {
                throw new IllegalStateException("unexpected block size");
            }
            values();
            int read2 = ((FilterInputStream) this).in.read();
            this.afInfoLog = read2;
            this.AFLogger = 0;
            if (read2 < 0) {
                int i4 = this.AFInAppEventType;
                i = i4 - (this.values[i4 - 1] & 255);
            } else {
                i = this.AFInAppEventType;
            }
            this.afErrorLog = i;
        }
        return this.afErrorLog;
    }
}
