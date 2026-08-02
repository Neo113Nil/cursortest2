package org.bouncycastle.asn1;

/* loaded from: classes9.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z, byte b, byte[] bArr, int i, int i2) {
        aSN1OutputStream.writeEncodingDL(z, 3, b, bArr, i, i2);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public static int encodedLength(boolean z, int i) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, i);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 3, this.contents);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z, byte[] bArr, int i, int i2) {
        aSN1OutputStream.writeEncodingDL(z, 3, bArr, i, i2);
    }

    public DLBitString(int i) {
        super(ASN1BitString.getBytes(i), ASN1BitString.getPadBits(i));
    }

    public DLBitString(byte b, int i) {
        super(b, i);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i) {
        super(bArr, i);
    }

    public DLBitString(byte[] bArr, boolean z) {
        super(bArr, z);
    }
}
