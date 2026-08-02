package org.bouncycastle.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
class ConstructedBitStream extends InputStream {
    private ASN1BitStringParser _currentParser;
    private InputStream _currentStream;
    private final boolean _octetAligned;
    private final ASN1StreamParser _parser;
    private boolean _first = true;
    private int _padBits = 0;

    public ConstructedBitStream(ASN1StreamParser aSN1StreamParser, boolean z) {
        this._parser = aSN1StreamParser;
        this._octetAligned = z;
    }

    private ASN1BitStringParser getNextParser() {
        ASN1Encodable readObject = this._parser.readObject();
        if (readObject == null) {
            if (this._octetAligned && this._padBits != 0) {
                Path$$ExternalSyntheticBUOutline0.m$3(this._padBits, "expected octet-aligned bitstring, but found padBits: ");
            }
            return null;
        }
        if (!(readObject instanceof ASN1BitStringParser)) {
            a$$ExternalSyntheticBUOutline0.m$4(readObject.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this._padBits == 0) {
            return (ASN1BitStringParser) readObject;
        }
        a$$ExternalSyntheticBUOutline0.m$4("only the last nested bitstring can have padding");
        return null;
    }

    public int getPadBits() {
        return this._padBits;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (this._currentStream == null) {
            if (!this._first) {
                return -1;
            }
            ASN1BitStringParser nextParser = getNextParser();
            this._currentParser = nextParser;
            if (nextParser == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = nextParser.getBitStream();
        }
        while (true) {
            int read = this._currentStream.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this._padBits = this._currentParser.getPadBits();
                ASN1BitStringParser nextParser2 = getNextParser();
                this._currentParser = nextParser2;
                if (nextParser2 == null) {
                    this._currentStream = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this._currentStream = nextParser2.getBitStream();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this._currentStream == null) {
            if (!this._first) {
                return -1;
            }
            ASN1BitStringParser nextParser = getNextParser();
            this._currentParser = nextParser;
            if (nextParser == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = nextParser.getBitStream();
        }
        while (true) {
            int read = this._currentStream.read();
            if (read >= 0) {
                return read;
            }
            this._padBits = this._currentParser.getPadBits();
            ASN1BitStringParser nextParser2 = getNextParser();
            this._currentParser = nextParser2;
            if (nextParser2 == null) {
                this._currentStream = null;
                return -1;
            }
            this._currentStream = nextParser2.getBitStream();
        }
    }
}
