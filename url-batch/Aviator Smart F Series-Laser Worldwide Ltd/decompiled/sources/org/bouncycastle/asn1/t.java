package org.bouncycastle.asn1;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class t extends s {
    protected final boolean isConstructed;
    protected final byte[] octets;
    protected final int tag;

    t(boolean z7, int i8, byte[] bArr) {
        this.isConstructed = z7;
        this.tag = i8;
        this.octets = org.bouncycastle.util.a.clone(bArr);
    }

    public static t getInstance(Object obj) {
        if (obj == null || (obj instanceof t)) {
            return (t) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return getInstance(s.fromByteArray((byte[]) obj));
        } catch (IOException e8) {
            throw new IllegalArgumentException("Failed to construct object from byte[]: " + e8.getMessage());
        }
    }

    protected static int getLengthOfHeader(byte[] bArr) {
        byte b8 = bArr[1];
        int i8 = b8 & 255;
        if (i8 == 128 || i8 <= 127) {
            return 2;
        }
        int i9 = b8 & Byte.MAX_VALUE;
        if (i9 <= 4) {
            return i9 + 2;
        }
        throw new IllegalStateException("DER length more than 4 bytes: " + i9);
    }

    private byte[] replaceTagNumber(int i8, byte[] bArr) {
        int i9;
        if ((bArr[0] & 31) == 31) {
            byte b8 = bArr[1];
            int i10 = b8 & 255;
            if ((b8 & Byte.MAX_VALUE) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            i9 = 2;
            while ((i10 & 128) != 0) {
                i10 = bArr[i9] & 255;
                i9++;
            }
        } else {
            i9 = 1;
        }
        int length = bArr.length - i9;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, i9, bArr2, 1, length);
        bArr2[0] = (byte) i8;
        return bArr2;
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (!(sVar instanceof t)) {
            return false;
        }
        t tVar = (t) sVar;
        return this.isConstructed == tVar.isConstructed && this.tag == tVar.tag && org.bouncycastle.util.a.areEqual(this.octets, tVar.octets);
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, this.isConstructed ? 224 : PsExtractor.AUDIO_STREAM, this.tag, this.octets);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return h2.calculateTagLength(this.tag) + h2.calculateBodyLength(this.octets.length) + this.octets.length;
    }

    public byte[] getContents() {
        return org.bouncycastle.util.a.clone(this.octets);
    }

    public s getObject() {
        return s.fromByteArray(getContents());
    }

    public int getPrivateTag() {
        return this.tag;
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        boolean z7 = this.isConstructed;
        return ((z7 ? 1 : 0) ^ this.tag) ^ org.bouncycastle.util.a.hashCode(this.octets);
    }

    @Override // org.bouncycastle.asn1.s
    public boolean isConstructed() {
        return this.isConstructed;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (isConstructed()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("PRIVATE ");
        stringBuffer.append(Integer.toString(getPrivateTag()));
        stringBuffer.append("]");
        if (this.octets != null) {
            stringBuffer.append(" #");
            str = org.bouncycastle.util.encoders.d.toHexString(this.octets);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(cn.hutool.core.text.l.SPACE);
        return stringBuffer.toString();
    }

    public s getObject(int i8) {
        if (i8 >= 31) {
            throw new IOException("unsupported tag number");
        }
        byte[] encoded = getEncoded();
        byte[] replaceTagNumber = replaceTagNumber(i8, encoded);
        if ((encoded[0] & 32) != 0) {
            replaceTagNumber[0] = (byte) (replaceTagNumber[0] | 32);
        }
        return s.fromByteArray(replaceTagNumber);
    }
}
