package cn.hutool.core.io;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class o extends FilterInputStream {
    private long currentPos;
    private final long maxSize;

    public o(InputStream inputStream, long j8) {
        super(inputStream);
        this.maxSize = j8;
    }

    private void checkPos() {
        if (this.currentPos > this.maxSize) {
            throw new IllegalStateException("Read limit exceeded");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = super.read();
        if (read != -1) {
            this.currentPos++;
            checkPos();
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        long skip = super.skip(j8);
        if (skip != 0) {
            this.currentPos += skip;
            checkPos();
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        int read = super.read(bArr, i8, i9);
        if (read > 0) {
            this.currentPos += read;
            checkPos();
        }
        return read;
    }
}
