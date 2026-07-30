package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
final class p extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_LIMIT_INCREMENT = 1024;
    private boolean allowExpire;
    private long defaultMark;
    private final InputStream in;
    private long limit;
    private int limitIncrement;
    private long offset;
    private long reset;

    p(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void setLimit(long j8) {
        try {
            long j9 = this.reset;
            long j10 = this.offset;
            if (j9 >= j10 || j10 > this.limit) {
                this.reset = j10;
                this.in.mark((int) (j8 - j10));
            } else {
                this.in.reset();
                this.in.mark((int) (j8 - this.reset));
                skip(this.reset, this.offset);
            }
            this.limit = j8;
        } catch (IOException e8) {
            throw new IllegalStateException("Unable to mark: " + e8);
        }
    }

    private void skip(long j8, long j9) {
        while (j8 < j9) {
            long skip = this.in.skip(j9 - j8);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j8 += skip;
        }
    }

    public void allowMarksToExpire(boolean z7) {
        this.allowExpire = z7;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in.close();
    }

    @Override // java.io.InputStream
    public void mark(int i8) {
        this.defaultMark = savePosition(i8);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.allowExpire) {
            long j8 = this.offset + 1;
            long j9 = this.limit;
            if (j8 > j9) {
                setLimit(j9 + this.limitIncrement);
            }
        }
        int read = this.in.read();
        if (read != -1) {
            this.offset++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        reset(this.defaultMark);
    }

    public long savePosition(int i8) {
        long j8 = this.offset + i8;
        if (this.limit < j8) {
            setLimit(j8);
        }
        return this.offset;
    }

    p(InputStream inputStream, int i8) {
        this(inputStream, i8, 1024);
    }

    public void reset(long j8) {
        if (this.offset > this.limit || j8 < this.reset) {
            throw new IOException("Cannot reset");
        }
        this.in.reset();
        skip(this.reset, j8);
        this.offset = j8;
    }

    private p(InputStream inputStream, int i8, int i9) {
        this.defaultMark = -1L;
        this.allowExpire = true;
        this.limitIncrement = -1;
        this.in = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i8);
        this.limitIncrement = i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.allowExpire) {
            long j8 = this.offset;
            if (bArr.length + j8 > this.limit) {
                setLimit(j8 + bArr.length + this.limitIncrement);
            }
        }
        int read = this.in.read(bArr);
        if (read != -1) {
            this.offset += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j8) {
        if (!this.allowExpire) {
            long j9 = this.offset;
            if (j9 + j8 > this.limit) {
                setLimit(j9 + j8 + this.limitIncrement);
            }
        }
        long skip = this.in.skip(j8);
        this.offset += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (!this.allowExpire) {
            long j8 = this.offset;
            long j9 = i9;
            if (j8 + j9 > this.limit) {
                setLimit(j8 + j9 + this.limitIncrement);
            }
        }
        int read = this.in.read(bArr, i8, i9);
        if (read != -1) {
            this.offset += read;
        }
        return read;
    }
}
