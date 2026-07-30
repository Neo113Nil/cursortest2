package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class r0 extends InputStream {
    private InputStream _currentStream;
    private boolean _first = true;
    private final z _parser;

    r0(z zVar) {
        this._parser = zVar;
    }

    private q getNextParser() {
        f readObject = this._parser.readObject();
        if (readObject == null) {
            return null;
        }
        if (readObject instanceof q) {
            return (q) readObject;
        }
        throw new IOException("unknown object encountered: " + readObject.getClass());
    }

    @Override // java.io.InputStream
    public int read() {
        q nextParser;
        if (this._currentStream == null) {
            if (!this._first || (nextParser = getNextParser()) == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = nextParser.getOctetStream();
        }
        while (true) {
            int read = this._currentStream.read();
            if (read >= 0) {
                return read;
            }
            q nextParser2 = getNextParser();
            if (nextParser2 == null) {
                this._currentStream = null;
                return -1;
            }
            this._currentStream = nextParser2.getOctetStream();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        q nextParser;
        int i10 = 0;
        if (this._currentStream == null) {
            if (!this._first || (nextParser = getNextParser()) == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = nextParser.getOctetStream();
        }
        while (true) {
            int read = this._currentStream.read(bArr, i8 + i10, i9 - i10);
            if (read >= 0) {
                i10 += read;
                if (i10 == i9) {
                    return i10;
                }
            } else {
                q nextParser2 = getNextParser();
                if (nextParser2 == null) {
                    this._currentStream = null;
                    if (i10 < 1) {
                        return -1;
                    }
                    return i10;
                }
                this._currentStream = nextParser2.getOctetStream();
            }
        }
    }
}
