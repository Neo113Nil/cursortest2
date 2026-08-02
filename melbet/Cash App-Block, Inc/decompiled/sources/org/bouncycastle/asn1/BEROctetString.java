package org.bouncycastle.asn1;

/* loaded from: classes9.dex */
public class BEROctetString extends ASN1OctetString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1OctetString[] elements;
    private final int segmentLimit;

    private BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr, int i) {
        super(bArr);
        this.elements = aSN1OctetStringArr;
        this.segmentLimit = i;
    }

    public static byte[] flattenOctetStrings(ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length == 0) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        if (length == 1) {
            return aSN1OctetStringArr[0].f1561string;
        }
        int i = 0;
        for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
            i += aSN1OctetString.f1561string.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
            byte[] bArr2 = aSN1OctetString2.f1561string;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeIdentifier(z, 36);
        aSN1OutputStream.write(128);
        ASN1OctetString[] aSN1OctetStringArr = this.elements;
        if (aSN1OctetStringArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f1561string;
                if (i >= bArr.length) {
                    break;
                }
                int min = Math.min(bArr.length - i, this.segmentLimit);
                DEROctetString.encode(aSN1OutputStream, true, this.f1561string, i, min);
                i += min;
            }
        } else {
            aSN1OutputStream.writePrimitives(aSN1OctetStringArr);
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        int i = z ? 4 : 3;
        if (this.elements == null) {
            int length = this.f1561string.length;
            int i2 = this.segmentLimit;
            int i3 = length / i2;
            int encodedLength = (DEROctetString.encodedLength(true, i2) * i3) + i;
            int length2 = this.f1561string.length - (i3 * this.segmentLimit);
            return length2 > 0 ? DEROctetString.encodedLength(true, length2) + encodedLength : encodedLength;
        }
        int i4 = 0;
        while (true) {
            ASN1OctetString[] aSN1OctetStringArr = this.elements;
            if (i4 >= aSN1OctetStringArr.length) {
                return i;
            }
            i += aSN1OctetStringArr[i4].encodedLength(true);
            i4++;
        }
    }

    public BEROctetString(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    public BEROctetString(byte[] bArr) {
        this(bArr, 1000);
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(aSN1OctetStringArr, 1000);
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr, int i) {
        this(flattenOctetStrings(aSN1OctetStringArr), aSN1OctetStringArr, i);
    }
}
