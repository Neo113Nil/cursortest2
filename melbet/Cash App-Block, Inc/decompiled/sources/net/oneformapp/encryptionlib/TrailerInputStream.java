package net.oneformapp.encryptionlib;

import com.miteksystems.misnap.core.DateUtil;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class TrailerInputStream extends InputStream {
    public final InputStream in;
    public byte[] trailerBuffer;
    public final int trailerSize;

    public TrailerInputStream(InputStream inputStream) {
        DateUtil.notNull(inputStream, "InputStream cannot be null.", new Object[0]);
        this.in = inputStream;
        this.trailerSize = 32;
    }

    @Override // java.io.InputStream
    public final int available() {
        byte[] bArr = this.trailerBuffer;
        InputStream inputStream = this.in;
        return bArr == null ? Math.max(0, inputStream.available() - this.trailerSize) : inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.in.close();
    }

    public final void fillTrailerBuffer() {
        int i = this.trailerSize;
        byte[] bArr = new byte[i];
        this.trailerBuffer = bArr;
        if (i == 0) {
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            int read = this.in.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            } else {
                i2 += read;
            }
        }
        if (i2 != this.trailerBuffer.length) {
            throw new EOFException(String.format("Trailer size was %d bytes but stream only contained %d bytes.", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            JWK$$ExternalSyntheticBUOutline0.m2173m();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.trailerBuffer == null) {
            fillTrailerBuffer();
        }
        byte[] bArr2 = new byte[i2];
        int read = this.in.read(bArr2);
        if (read == -1) {
            return read;
        }
        int i3 = this.trailerSize;
        if (i3 == 0) {
            System.arraycopy(bArr2, 0, bArr, i, read);
            return read;
        }
        byte[] bArr3 = this.trailerBuffer;
        if (read > i3) {
            System.arraycopy(bArr3, 0, bArr, i, i3);
            int i4 = read - i3;
            System.arraycopy(bArr2, 0, bArr, i + i3, i4);
            System.arraycopy(bArr2, i4, this.trailerBuffer, 0, i3);
            return read;
        }
        System.arraycopy(bArr3, 0, bArr, i, read);
        byte[] bArr4 = this.trailerBuffer;
        int i5 = i3 - read;
        System.arraycopy(bArr4, read, bArr4, 0, i5);
        System.arraycopy(bArr2, 0, this.trailerBuffer, i5, read);
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.trailerBuffer == null) {
            fillTrailerBuffer();
        }
        int read = this.in.read();
        if (read != -1) {
            byte[] bArr = this.trailerBuffer;
            if (bArr.length != 0) {
                int i = bArr[0] & 255;
                System.arraycopy(bArr, 1, bArr, 0, bArr.length - 1);
                byte[] bArr2 = this.trailerBuffer;
                bArr2[bArr2.length - 1] = (byte) read;
                return i;
            }
        }
        return read;
    }
}
