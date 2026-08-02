package org.bouncycastle.asn1.isismtt.ocsp;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class CertHash extends ASN1Object {
    private byte[] certificateHash;
    private AlgorithmIdentifier hashAlgorithm;

    private CertHash(ASN1Sequence aSN1Sequence) {
        byte[] octets;
        if (aSN1Sequence.size() != 2) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        this.hashAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        octets = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        this.certificateHash = octets;
    }

    public static CertHash getInstance(Object obj) {
        if (obj == null || (obj instanceof CertHash)) {
            return (CertHash) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new CertHash((ASN1Sequence) obj);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: "));
        return null;
    }

    public byte[] getCertificateHash() {
        return Arrays.clone(this.certificateHash);
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.hashAlgorithm);
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.certificateHash), aSN1EncodableVector);
    }

    public CertHash(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.hashAlgorithm = algorithmIdentifier;
        byte[] bArr2 = new byte[bArr.length];
        this.certificateHash = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
