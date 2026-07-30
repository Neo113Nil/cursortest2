package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class a2 extends f2 {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    a2(InputStream inputStream, int i8, int i9) {
        super(inputStream, i9);
        if (i8 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this._originalLength = i8;
        this._remaining = i8;
        if (i8 == 0) {
            setParentEofDetect(true);
        }
    }

    int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this._remaining == 0) {
            return -1;
        }
        int read = this._in.read();
        if (read >= 0) {
            int i8 = this._remaining - 1;
            this._remaining = i8;
            if (i8 == 0) {
                setParentEofDetect(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    void readAllIntoByteArray(byte[] bArr) {
        int i8 = this._remaining;
        if (i8 != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i8 == 0) {
            return;
        }
        int limit = getLimit();
        int i9 = this._remaining;
        if (i9 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        int readFully = i9 - j7.a.readFully(this._in, bArr);
        this._remaining = readFully;
        if (readFully == 0) {
            setParentEofDetect(true);
            return;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    byte[] toByteArray() {
        if (this._remaining == 0) {
            return EMPTY_BYTES;
        }
        int limit = getLimit();
        int i8 = this._remaining;
        if (i8 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        byte[] bArr = new byte[i8];
        int readFully = i8 - j7.a.readFully(this._in, bArr);
        this._remaining = readFully;
        if (readFully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        int i10 = this._remaining;
        if (i10 == 0) {
            return -1;
        }
        int read = this._in.read(bArr, i8, Math.min(i9, i10));
        if (read >= 0) {
            int i11 = this._remaining - read;
            this._remaining = i11;
            if (i11 == 0) {
                setParentEofDetect(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }
}
