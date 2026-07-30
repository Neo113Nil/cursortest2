package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class c2 extends f2 {
    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;

    c2(InputStream inputStream, int i8) {
        super(inputStream, i8);
        this._eofReached = false;
        this._eofOn00 = true;
        this._b1 = inputStream.read();
        int read = inputStream.read();
        this._b2 = read;
        if (read < 0) {
            throw new EOFException();
        }
        checkForEof();
    }

    private boolean checkForEof() {
        if (!this._eofReached && this._eofOn00 && this._b1 == 0 && this._b2 == 0) {
            this._eofReached = true;
            setParentEofDetect(true);
        }
        return this._eofReached;
    }

    @Override // java.io.InputStream
    public int read() {
        if (checkForEof()) {
            return -1;
        }
        int read = this._in.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i8 = this._b1;
        this._b1 = this._b2;
        this._b2 = read;
        return i8;
    }

    void setEofOn00(boolean z7) {
        this._eofOn00 = z7;
        checkForEof();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (this._eofOn00 || i9 < 3) {
            return super.read(bArr, i8, i9);
        }
        if (this._eofReached) {
            return -1;
        }
        int read = this._in.read(bArr, i8 + 2, i9 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i8] = (byte) this._b1;
        bArr[i8 + 1] = (byte) this._b2;
        this._b1 = this._in.read();
        int read2 = this._in.read();
        this._b2 = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
