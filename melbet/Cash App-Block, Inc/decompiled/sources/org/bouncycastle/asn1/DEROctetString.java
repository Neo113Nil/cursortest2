package org.bouncycastle.asn1;

/* loaded from: classes9.dex */
public class DEROctetString extends ASN1OctetString {
    public DEROctetString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z, byte[] bArr, int i, int i2) {
        aSN1OutputStream.writeEncodingDL(z, 4, bArr, i, i2);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.f1561string.length);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public static int encodedLength(boolean z, int i) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, i);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 4, this.f1561string);
    }

    public DEROctetString(byte[] bArr) {
        super(bArr);
    }
}
