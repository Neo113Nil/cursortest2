package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
final class CharSequenceReader extends Reader {
    private int mark;
    private int pos;

    @CheckForNull
    private CharSequence seq;

    public CharSequenceReader(CharSequence charSequence) {
        this.seq = (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    private void checkOpen() {
        if (this.seq == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean hasRemaining() {
        return remaining() > 0;
    }

    private int remaining() {
        Objects.requireNonNull(this.seq);
        return this.seq.length() - this.pos;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.seq = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i8) {
        Preconditions.checkArgument(i8 >= 0, "readAheadLimit (%s) may not be negative", i8);
        checkOpen();
        this.mark = this.pos;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) {
        Preconditions.checkNotNull(charBuffer);
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int min = Math.min(charBuffer.remaining(), remaining());
        for (int i8 = 0; i8 < min; i8++) {
            CharSequence charSequence = this.seq;
            int i9 = this.pos;
            this.pos = i9 + 1;
            charBuffer.put(charSequence.charAt(i9));
        }
        return min;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() {
        checkOpen();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() {
        checkOpen();
        this.pos = this.mark;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j8) {
        int min;
        Preconditions.checkArgument(j8 >= 0, "n (%s) may not be negative", j8);
        checkOpen();
        min = (int) Math.min(remaining(), j8);
        this.pos += min;
        return min;
    }

    @Override // java.io.Reader
    public synchronized int read() {
        char c8;
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (hasRemaining()) {
            CharSequence charSequence = this.seq;
            int i8 = this.pos;
            this.pos = i8 + 1;
            c8 = charSequence.charAt(i8);
        } else {
            c8 = 65535;
        }
        return c8;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i8, int i9) {
        Preconditions.checkPositionIndexes(i8, i8 + i9, cArr.length);
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int min = Math.min(i9, remaining());
        for (int i10 = 0; i10 < min; i10++) {
            CharSequence charSequence = this.seq;
            int i11 = this.pos;
            this.pos = i11 + 1;
            cArr[i8 + i10] = charSequence.charAt(i11);
        }
        return min;
    }
}
