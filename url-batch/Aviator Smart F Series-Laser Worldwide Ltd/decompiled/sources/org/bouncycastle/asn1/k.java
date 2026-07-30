package org.bouncycastle.asn1;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class k extends FilterInputStream {
    private final boolean lazyEvaluate;
    private final int limit;
    private final byte[][] tmpBuffers;

    public k(InputStream inputStream) {
        this(inputStream, h2.findLimit(inputStream));
    }

    static s createPrimitiveDERObject(int i8, a2 a2Var, byte[][] bArr) {
        if (i8 == 10) {
            return h.fromOctetString(getBuffer(a2Var, bArr));
        }
        if (i8 == 12) {
            return new k1(a2Var.toByteArray());
        }
        if (i8 == 30) {
            return new s0(getBMPCharBuffer(a2Var));
        }
        switch (i8) {
            case 1:
                return d.fromOctetString(getBuffer(a2Var, bArr));
            case 2:
                return new l(a2Var.toByteArray(), false);
            case 3:
                return c.fromInputStream(a2Var.getRemaining(), a2Var);
            case 4:
                return new c1(a2Var.toByteArray());
            case 5:
                return a1.INSTANCE;
            case 6:
                return o.fromOctetString(getBuffer(a2Var, bArr));
            default:
                switch (i8) {
                    case 18:
                        return new b1(a2Var.toByteArray());
                    case 19:
                        return new f1(a2Var.toByteArray());
                    case 20:
                        return new i1(a2Var.toByteArray());
                    case 21:
                        return new m1(a2Var.toByteArray());
                    case 22:
                        return new z0(a2Var.toByteArray());
                    case 23:
                        return new d0(a2Var.toByteArray());
                    case 24:
                        return new j(a2Var.toByteArray());
                    case 25:
                        return new y0(a2Var.toByteArray());
                    case 26:
                        return new n1(a2Var.toByteArray());
                    case 27:
                        return new w0(a2Var.toByteArray());
                    case 28:
                        return new l1(a2Var.toByteArray());
                    default:
                        throw new IOException("unknown tag " + i8 + " encountered");
                }
        }
    }

    private static char[] getBMPCharBuffer(a2 a2Var) {
        int remaining = a2Var.getRemaining();
        if ((remaining & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i8 = remaining / 2;
        char[] cArr = new char[i8];
        byte[] bArr = new byte[8];
        int i9 = 0;
        int i10 = 0;
        while (remaining >= 8) {
            if (j7.a.readFully(a2Var, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i10] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i10 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i10 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i10 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i10 += 4;
            remaining -= 8;
        }
        if (remaining > 0) {
            if (j7.a.readFully(a2Var, bArr, 0, remaining) != remaining) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i11 = i9 + 1;
                int i12 = bArr[i9] << 8;
                i9 += 2;
                cArr[i10] = (char) ((bArr[i11] & 255) | i12);
                i10++;
            } while (i9 < remaining);
        }
        if (a2Var.getRemaining() == 0 && i8 == i10) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    private static byte[] getBuffer(a2 a2Var, byte[][] bArr) {
        int remaining = a2Var.getRemaining();
        if (remaining >= bArr.length) {
            return a2Var.toByteArray();
        }
        byte[] bArr2 = bArr[remaining];
        if (bArr2 == null) {
            bArr2 = new byte[remaining];
            bArr[remaining] = bArr2;
        }
        a2Var.readAllIntoByteArray(bArr2);
        return bArr2;
    }

    static int readTagNumber(InputStream inputStream, int i8) {
        int i9 = i8 & 31;
        if (i9 != 31) {
            return i9;
        }
        int read = inputStream.read();
        if ((read & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i10 = 0;
        while (read >= 0 && (read & 128) != 0) {
            i10 = ((read & 127) | i10) << 7;
            read = inputStream.read();
        }
        if (read >= 0) {
            return i10 | (read & 127);
        }
        throw new EOFException("EOF found inside tag value.");
    }

    protected s buildObject(int i8, int i9, int i10) {
        boolean z7 = (i8 & 32) != 0;
        a2 a2Var = new a2(this, i10, this.limit);
        if ((i8 & PsExtractor.AUDIO_STREAM) == 192) {
            return new t1(z7, i9, a2Var.toByteArray());
        }
        if ((i8 & 64) != 0) {
            return new o1(z7, i9, a2Var.toByteArray());
        }
        if ((i8 & 128) != 0) {
            return new z(a2Var).readTaggedObject(z7, i9);
        }
        if (!z7) {
            return createPrimitiveDERObject(i9, a2Var, this.tmpBuffers);
        }
        if (i9 != 4) {
            if (i9 == 8) {
                return new q1(readVector(a2Var));
            }
            if (i9 == 16) {
                return this.lazyEvaluate ? new e2(a2Var.toByteArray()) : r1.createSequence(readVector(a2Var));
            }
            if (i9 == 17) {
                return r1.createSet(readVector(a2Var));
            }
            throw new IOException("unknown tag " + i9 + " encountered");
        }
        g readVector = readVector(a2Var);
        int size = readVector.size();
        p[] pVarArr = new p[size];
        for (int i11 = 0; i11 != size; i11++) {
            f fVar = readVector.get(i11);
            if (!(fVar instanceof p)) {
                throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + fVar.getClass());
            }
            pVarArr[i11] = (p) fVar;
        }
        return new h0(pVarArr);
    }

    int getLimit() {
        return this.limit;
    }

    protected void readFully(byte[] bArr) {
        if (j7.a.readFully(this, bArr) != bArr.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    protected int readLength() {
        return readLength(this, this.limit, false);
    }

    public s readObject() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int readTagNumber = readTagNumber(this, read);
        boolean z7 = (read & 32) != 0;
        int readLength = readLength();
        if (readLength >= 0) {
            try {
                return buildObject(read, readTagNumber, readLength);
            } catch (IllegalArgumentException e8) {
                throw new ASN1Exception("corrupted stream detected", e8);
            }
        }
        if (!z7) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        z zVar = new z(new c2(this, this.limit), this.limit);
        if ((read & PsExtractor.AUDIO_STREAM) == 192) {
            return new k0(readTagNumber, zVar).getLoadedObject();
        }
        if ((read & 64) != 0) {
            return new f0(readTagNumber, zVar).getLoadedObject();
        }
        if ((read & 128) != 0) {
            return new q0(true, readTagNumber, zVar).getLoadedObject();
        }
        if (readTagNumber == 4) {
            return new i0(zVar).getLoadedObject();
        }
        if (readTagNumber == 8) {
            return new v0(zVar).getLoadedObject();
        }
        if (readTagNumber == 16) {
            return new m0(zVar).getLoadedObject();
        }
        if (readTagNumber == 17) {
            return new o0(zVar).getLoadedObject();
        }
        throw new IOException("unknown BER object encountered");
    }

    g readVector(a2 a2Var) {
        if (a2Var.getRemaining() < 1) {
            return new g(0);
        }
        k kVar = new k(a2Var);
        g gVar = new g();
        while (true) {
            s readObject = kVar.readObject();
            if (readObject == null) {
                return gVar;
            }
            gVar.add(readObject);
        }
    }

    public k(InputStream inputStream, int i8) {
        this(inputStream, i8, false);
    }

    static int readLength(InputStream inputStream, int i8, boolean z7) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (read == 128) {
            return -1;
        }
        if (read <= 127) {
            return read;
        }
        int i9 = read & 127;
        if (i9 > 4) {
            throw new IOException("DER length more than 4 bytes: " + i9);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i10 = (i10 << 8) + read2;
        }
        if (i10 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i10 < i8 || z7) {
            return i10;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i10 + " >= " + i8);
    }

    public k(InputStream inputStream, int i8, boolean z7) {
        super(inputStream);
        this.limit = i8;
        this.lazyEvaluate = z7;
        this.tmpBuffers = new byte[11][];
    }

    public k(InputStream inputStream, boolean z7) {
        this(inputStream, h2.findLimit(inputStream), z7);
    }

    public k(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public k(byte[] bArr, boolean z7) {
        this(new ByteArrayInputStream(bArr), bArr.length, z7);
    }
}
