package org.bouncycastle.asn1;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class z {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    public z(InputStream inputStream) {
        this(inputStream, h2.findLimit(inputStream));
    }

    private void set00Check(boolean z7) {
        InputStream inputStream = this._in;
        if (inputStream instanceof c2) {
            ((c2) inputStream).setEofOn00(z7);
        }
    }

    f readImplicit(boolean z7, int i8) {
        InputStream inputStream = this._in;
        if (inputStream instanceof c2) {
            if (z7) {
                return readIndef(i8);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        if (z7) {
            if (i8 == 4) {
                return new i0(this);
            }
            if (i8 == 16) {
                return new v1(this);
            }
            if (i8 == 17) {
                return new x1(this);
            }
        } else {
            if (i8 == 4) {
                return new d1((a2) inputStream);
            }
            if (i8 == 16) {
                throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (i8 == 17) {
                throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
        }
        throw new ASN1Exception("implicit tagging not implemented");
    }

    f readIndef(int i8) {
        if (i8 == 4) {
            return new i0(this);
        }
        if (i8 == 8) {
            return new v0(this);
        }
        if (i8 == 16) {
            return new m0(this);
        }
        if (i8 == 17) {
            return new o0(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i8));
    }

    public f readObject() {
        int read = this._in.read();
        if (read == -1) {
            return null;
        }
        set00Check(false);
        int readTagNumber = k.readTagNumber(this._in, read);
        boolean z7 = (read & 32) != 0;
        int readLength = k.readLength(this._in, this._limit, readTagNumber == 4 || readTagNumber == 16 || readTagNumber == 17 || readTagNumber == 8);
        if (readLength < 0) {
            if (!z7) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            z zVar = new z(new c2(this._in, this._limit), this._limit);
            return (read & PsExtractor.AUDIO_STREAM) == 192 ? new k0(readTagNumber, zVar) : (read & 64) != 0 ? new f0(readTagNumber, zVar) : (read & 128) != 0 ? new q0(true, readTagNumber, zVar) : zVar.readIndef(readTagNumber);
        }
        a2 a2Var = new a2(this._in, readLength, this._limit);
        if ((read & PsExtractor.AUDIO_STREAM) == 192) {
            return new t1(z7, readTagNumber, a2Var.toByteArray());
        }
        if ((read & 64) != 0) {
            return new o1(z7, readTagNumber, a2Var.toByteArray());
        }
        if ((read & 128) != 0) {
            return new q0(z7, readTagNumber, new z(a2Var));
        }
        if (!z7) {
            if (readTagNumber == 4) {
                return new d1(a2Var);
            }
            try {
                return k.createPrimitiveDERObject(readTagNumber, a2Var, this.tmpBuffers);
            } catch (IllegalArgumentException e8) {
                throw new ASN1Exception("corrupted stream detected", e8);
            }
        }
        if (readTagNumber == 4) {
            return new i0(new z(a2Var));
        }
        if (readTagNumber == 8) {
            return new v0(new z(a2Var));
        }
        if (readTagNumber == 16) {
            return new v1(new z(a2Var));
        }
        if (readTagNumber == 17) {
            return new x1(new z(a2Var));
        }
        throw new IOException("unknown tag " + readTagNumber + " encountered");
    }

    s readTaggedObject(boolean z7, int i8) {
        if (!z7) {
            return new y1(false, i8, new c1(((a2) this._in).toByteArray()));
        }
        g readVector = readVector();
        return this._in instanceof c2 ? readVector.size() == 1 ? new p0(true, i8, readVector.get(0)) : new p0(false, i8, g0.createSequence(readVector)) : readVector.size() == 1 ? new y1(true, i8, readVector.get(0)) : new y1(false, i8, r1.createSequence(readVector));
    }

    g readVector() {
        f readObject = readObject();
        if (readObject == null) {
            return new g(0);
        }
        g gVar = new g();
        do {
            gVar.add(readObject instanceof b2 ? ((b2) readObject).getLoadedObject() : readObject.toASN1Primitive());
            readObject = readObject();
        } while (readObject != null);
        return gVar;
    }

    public z(InputStream inputStream, int i8) {
        this._in = inputStream;
        this._limit = i8;
        this.tmpBuffers = new byte[11][];
    }

    public z(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
