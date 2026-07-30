package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class c extends s implements a0 {
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final byte[] data;
    protected final int padBits;

    protected c(byte b8, int i8) {
        if (i8 > 7 || i8 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.data = new byte[]{b8};
        this.padBits = i8;
    }

    static c fromInputStream(int i8, InputStream inputStream) {
        if (i8 < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int read = inputStream.read();
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        if (i9 != 0) {
            if (j7.a.readFully(inputStream, bArr) != i9) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (read > 0 && read < 8) {
                byte b8 = bArr[i8 - 2];
                if (b8 != ((byte) ((255 << read) & b8))) {
                    return new p1(bArr, read);
                }
            }
        }
        return new t0(bArr, read);
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (!(sVar instanceof c)) {
            return false;
        }
        c cVar = (c) sVar;
        if (this.padBits != cVar.padBits) {
            return false;
        }
        byte[] bArr = this.data;
        byte[] bArr2 = cVar.data;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i8 = length - 1;
        if (i8 < 0) {
            return true;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (bArr[i9] != bArr2[i9]) {
                return false;
            }
        }
        byte b8 = bArr[i8];
        int i10 = this.padBits;
        return ((byte) (b8 & (255 << i10))) == ((byte) (bArr2[i8] & (255 << i10)));
    }

    @Override // org.bouncycastle.asn1.s
    abstract void encode(r rVar, boolean z7);

    public byte[] getBytes() {
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] clone = org.bouncycastle.util.a.clone(bArr);
        int length = this.data.length - 1;
        clone[length] = (byte) (clone[length] & (255 << this.padBits));
        return clone;
    }

    public s getLoadedObject() {
        return toASN1Primitive();
    }

    public byte[] getOctets() {
        if (this.padBits == 0) {
            return org.bouncycastle.util.a.clone(this.data);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public int getPadBits() {
        return this.padBits;
    }

    @Override // org.bouncycastle.asn1.a0
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i8 = 0; i8 != encoded.length; i8++) {
                char[] cArr = table;
                stringBuffer.append(cArr[(encoded[i8] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i8] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e8) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e8.getMessage(), e8);
        }
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        byte[] bArr = this.data;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        return ((org.bouncycastle.util.a.hashCode(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << this.padBits)))) ^ this.padBits;
    }

    public int intValue() {
        int min = Math.min(4, this.data.length - 1);
        int i8 = 0;
        for (int i9 = 0; i9 < min; i9++) {
            i8 |= (255 & this.data[i9]) << (i9 * 8);
        }
        return (min < 0 || min >= 4) ? i8 : i8 | ((((byte) (this.data[min] & (255 << this.padBits))) & 255) << (min * 8));
    }

    @Override // org.bouncycastle.asn1.s
    s toDERObject() {
        return new t0(this.data, this.padBits);
    }

    @Override // org.bouncycastle.asn1.s
    s toDLObject() {
        return new p1(this.data, this.padBits);
    }

    public String toString() {
        return getString();
    }

    public c(byte[] bArr, int i8) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i8 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i8 > 7 || i8 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.data = org.bouncycastle.util.a.clone(bArr);
        this.padBits = i8;
    }

    protected static byte[] getBytes(int i8) {
        if (i8 == 0) {
            return new byte[0];
        }
        int i9 = 4;
        for (int i10 = 3; i10 >= 1 && ((255 << (i10 * 8)) & i8) == 0; i10--) {
            i9--;
        }
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) ((i8 >> (i11 * 8)) & 255);
        }
        return bArr;
    }

    protected static int getPadBits(int i8) {
        int i9;
        int i10 = 3;
        while (true) {
            if (i10 < 0) {
                i9 = 0;
                break;
            }
            if (i10 != 0) {
                int i11 = i8 >> (i10 * 8);
                if (i11 != 0) {
                    i9 = i11 & 255;
                    break;
                }
                i10--;
            } else {
                if (i8 != 0) {
                    i9 = i8 & 255;
                    break;
                }
                i10--;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        int i12 = 1;
        while (true) {
            i9 <<= 1;
            if ((i9 & 255) == 0) {
                return 8 - i12;
            }
            i12++;
        }
    }
}
