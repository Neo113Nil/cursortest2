package org.bouncycastle.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class BERBitString extends ASN1BitString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1BitString[] elements;
    private final int segmentLimit;

    public BERBitString(ASN1Encodable aSN1Encodable) {
        this(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static byte[] flattenBitStrings(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return aSN1BitStringArr[0].contents;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = aSN1BitStringArr[i3].contents;
            if (bArr[0] != 0) {
                a$$ExternalSyntheticBUOutline0.m$3("only the last nested bitstring can have padding");
                return null;
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = aSN1BitStringArr[i].contents;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
            byte[] bArr4 = aSN1BitString.contents;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        byte[] bArr;
        ASN1OutputStream aSN1OutputStream2;
        if (!encodeConstructed()) {
            byte[] bArr2 = this.contents;
            DLBitString.encode(aSN1OutputStream, z, bArr2, 0, bArr2.length);
            return;
        }
        aSN1OutputStream.writeIdentifier(z, 35);
        aSN1OutputStream.write(128);
        ASN1BitString[] aSN1BitStringArr = this.elements;
        if (aSN1BitStringArr != null) {
            aSN1OutputStream.writePrimitives(aSN1BitStringArr);
        } else {
            byte[] bArr3 = this.contents;
            if (bArr3.length >= 2) {
                byte b = bArr3[0];
                int length = bArr3.length;
                int i = length - 1;
                int i2 = this.segmentLimit - 1;
                while (true) {
                    bArr = this.contents;
                    if (i <= i2) {
                        break;
                    }
                    ASN1OutputStream aSN1OutputStream3 = aSN1OutputStream;
                    DLBitString.encode(aSN1OutputStream3, true, (byte) 0, bArr, length - i, i2);
                    i -= i2;
                    aSN1OutputStream = aSN1OutputStream3;
                }
                aSN1OutputStream2 = aSN1OutputStream;
                DLBitString.encode(aSN1OutputStream2, true, b, bArr, length - i, i);
                aSN1OutputStream2.write(0);
                aSN1OutputStream2.write(0);
            }
        }
        aSN1OutputStream2 = aSN1OutputStream;
        aSN1OutputStream2.write(0);
        aSN1OutputStream2.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.elements != null || this.contents.length > this.segmentLimit;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        if (!encodeConstructed()) {
            return DLBitString.encodedLength(z, this.contents.length);
        }
        int i = z ? 4 : 3;
        if (this.elements == null) {
            byte[] bArr = this.contents;
            if (bArr.length < 2) {
                return i;
            }
            int length = bArr.length - 2;
            int i2 = this.segmentLimit;
            int i3 = length / (i2 - 1);
            return DLBitString.encodedLength(true, this.contents.length - ((this.segmentLimit - 1) * i3)) + (DLBitString.encodedLength(true, i2) * i3) + i;
        }
        int i4 = 0;
        while (true) {
            ASN1BitString[] aSN1BitStringArr = this.elements;
            if (i4 >= aSN1BitStringArr.length) {
                return i;
            }
            i += aSN1BitStringArr[i4].encodedLength(true);
            i4++;
        }
    }

    public BERBitString(byte b, int i) {
        super(b, i);
        this.elements = null;
        this.segmentLimit = 1000;
    }

    public BERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public BERBitString(byte[] bArr, int i) {
        this(bArr, i, 1000);
    }

    public BERBitString(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.elements = null;
        this.segmentLimit = i2;
    }

    public BERBitString(byte[] bArr, boolean z) {
        super(bArr, z);
        this.elements = null;
        this.segmentLimit = 1000;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        this(aSN1BitStringArr, 1000);
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr, int i) {
        super(flattenBitStrings(aSN1BitStringArr), false);
        this.elements = aSN1BitStringArr;
        this.segmentLimit = i;
    }
}
