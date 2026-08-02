package org.bouncycastle.mime.encoding;

import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public class Base64InputStream extends InputStream {
    private static final byte[] decodingTable = new byte[128];
    InputStream in;
    int[] outBuf = new int[3];
    int bufPtr = 3;

    static {
        for (int i = 65; i <= 90; i++) {
            decodingTable[i] = (byte) (i - 65);
        }
        for (int i2 = 97; i2 <= 122; i2++) {
            decodingTable[i2] = (byte) (i2 - 71);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            decodingTable[i3] = (byte) (i3 + 4);
        }
        byte[] bArr = decodingTable;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public Base64InputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    private int decode(int i, int i2, int i3, int i4, int[] iArr) {
        if (i4 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1("unexpected end of file in armored stream.");
            return 0;
        }
        if (i3 == 61) {
            byte[] bArr = decodingTable;
            int i5 = bArr[i] & 255;
            iArr[2] = (((bArr[i2] & 255) >> 4) | (i5 << 2)) & 255;
            return 2;
        }
        if (i4 == 61) {
            byte[] bArr2 = decodingTable;
            byte b = bArr2[i];
            byte b2 = bArr2[i2];
            byte b3 = bArr2[i3];
            iArr[1] = ((b << 2) | (b2 >> 4)) & 255;
            iArr[2] = ((b3 >> 2) | (b2 << 4)) & 255;
            return 1;
        }
        byte[] bArr3 = decodingTable;
        byte b4 = bArr3[i];
        byte b5 = bArr3[i2];
        byte b6 = bArr3[i3];
        byte b7 = bArr3[i4];
        iArr[0] = ((b4 << 2) | (b5 >> 4)) & 255;
        iArr[1] = ((b5 << 4) | (b6 >> 2)) & 255;
        iArr[2] = ((b6 << 6) | b7) & 255;
        return 0;
    }

    private int readIgnoreSpace() {
        while (true) {
            int read = this.in.read();
            if (read != 9 && read != 32) {
                return read;
            }
        }
    }

    private int readIgnoreSpaceFirst() {
        while (true) {
            int read = this.in.read();
            if (read != 9 && read != 10 && read != 13 && read != 32) {
                return read;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in.close();
    }

    @Override // java.io.InputStream
    public int read() {
        Base64InputStream base64InputStream;
        if (this.bufPtr > 2) {
            int readIgnoreSpaceFirst = readIgnoreSpaceFirst();
            if (readIgnoreSpaceFirst < 0) {
                return -1;
            }
            base64InputStream = this;
            base64InputStream.bufPtr = base64InputStream.decode(readIgnoreSpaceFirst, readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
        } else {
            base64InputStream = this;
        }
        int[] iArr = base64InputStream.outBuf;
        int i = base64InputStream.bufPtr;
        base64InputStream.bufPtr = i + 1;
        return iArr[i];
    }
}
