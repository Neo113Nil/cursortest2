package com.appsflyer.internal;

import androidx.collection.SieveCacheKt;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class AFi1dSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private short AFInAppEventType;
    private final int AFKeystoreWrapper;
    private int AFLogger;
    private int d;
    private int unregisterClient;
    private long[] valueOf;
    private long[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public AFi1dSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.AFLogger = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.AFKeystoreWrapper = min;
        this.AFInAppEventParameterName = new byte[min];
        this.valueOf = new long[4];
        this.values = new long[4];
        this.d = min;
        this.unregisterClient = min;
        this.valueOf = AFj1wSDK.AFInAppEventType(i ^ i4, min ^ i4);
        this.values = AFj1wSDK.AFInAppEventType(i2 ^ i4, i3 ^ i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventParameterName();
        int i = this.d;
        if (i >= this.unregisterClient) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventParameterName;
        this.d = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventParameterName();
            int i5 = this.d;
            if (i5 >= this.unregisterClient) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFInAppEventParameterName;
            this.d = i5 + 1;
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
        return this.unregisterClient - this.d;
    }

    private void AFKeystoreWrapper() {
        long[] jArr = this.valueOf;
        long[] jArr2 = this.values;
        short s = this.AFInAppEventType;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        long j3 = (j + j2) % SieveCacheKt.NodeLinkMask;
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / SieveCacheKt.NodeLinkMask;
        jArr[i] = j3;
        for (int i2 = 0; i2 < this.AFKeystoreWrapper; i2++) {
            this.AFInAppEventParameterName[i2] = (byte) (r1[i2] ^ ((this.valueOf[this.AFInAppEventType] >> (i2 << 3)) & 255));
        }
        this.AFInAppEventType = (short) ((this.AFInAppEventType + 1) % 4);
    }

    private int AFInAppEventParameterName() throws IOException {
        int i;
        if (this.AFLogger == Integer.MAX_VALUE) {
            this.AFLogger = ((FilterInputStream) this).in.read();
        }
        if (this.d == this.AFKeystoreWrapper) {
            byte[] bArr = this.AFInAppEventParameterName;
            int i2 = this.AFLogger;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFInAppEventParameterName, i3, this.AFKeystoreWrapper - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.AFKeystoreWrapper);
            if (i3 < this.AFKeystoreWrapper) {
                throw new IllegalStateException("unexpected block size");
            }
            AFKeystoreWrapper();
            int read2 = ((FilterInputStream) this).in.read();
            this.AFLogger = read2;
            this.d = 0;
            if (read2 < 0) {
                int i4 = this.AFKeystoreWrapper;
                i = i4 - (this.AFInAppEventParameterName[i4 - 1] & 255);
            } else {
                i = this.AFKeystoreWrapper;
            }
            this.unregisterClient = i;
        }
        return this.unregisterClient;
    }
}
