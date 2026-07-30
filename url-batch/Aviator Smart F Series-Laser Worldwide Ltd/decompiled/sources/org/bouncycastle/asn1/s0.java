package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class s0 extends s implements a0 {
    private final char[] string;

    public s0(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = str.toCharArray();
    }

    public static s0 getInstance(Object obj) {
        if (obj == null || (obj instanceof s0)) {
            return (s0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (s0) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    @Override // org.bouncycastle.asn1.s
    protected boolean asn1Equals(s sVar) {
        if (sVar instanceof s0) {
            return org.bouncycastle.util.a.areEqual(this.string, ((s0) sVar).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        int length = this.string.length;
        if (z7) {
            rVar.write(30);
        }
        rVar.writeLength(length * 2);
        byte[] bArr = new byte[8];
        int i8 = length & (-4);
        int i9 = 0;
        while (i9 < i8) {
            char[] cArr = this.string;
            char c8 = cArr[i9];
            char c9 = cArr[i9 + 1];
            char c10 = cArr[i9 + 2];
            char c11 = cArr[i9 + 3];
            i9 += 4;
            bArr[0] = (byte) (c8 >> '\b');
            bArr[1] = (byte) c8;
            bArr[2] = (byte) (c9 >> '\b');
            bArr[3] = (byte) c9;
            bArr[4] = (byte) (c10 >> '\b');
            bArr[5] = (byte) c10;
            bArr[6] = (byte) (c11 >> '\b');
            bArr[7] = (byte) c11;
            rVar.write(bArr, 0, 8);
        }
        if (i9 < length) {
            int i10 = 0;
            do {
                char c12 = this.string[i9];
                i9++;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (c12 >> '\b');
                i10 += 2;
                bArr[i11] = (byte) c12;
            } while (i9 < length);
            rVar.write(bArr, 0, i10);
        }
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return h2.calculateBodyLength(this.string.length * 2) + 1 + (this.string.length * 2);
    }

    @Override // org.bouncycastle.asn1.a0
    public String getString() {
        return new String(this.string);
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.string);
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    s0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i8 = length / 2;
        char[] cArr = new char[i8];
        for (int i9 = 0; i9 != i8; i9++) {
            int i10 = i9 * 2;
            cArr[i9] = (char) ((bArr[i10 + 1] & 255) | (bArr[i10] << 8));
        }
        this.string = cArr;
    }

    public static s0 getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof s0)) ? getInstance(object) : new s0(p.getInstance(object).getOctets());
    }

    s0(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = cArr;
    }
}
