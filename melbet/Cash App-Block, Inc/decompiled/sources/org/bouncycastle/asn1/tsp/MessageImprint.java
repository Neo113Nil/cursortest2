package org.bouncycastle.asn1.tsp;

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
public class MessageImprint extends ASN1Object {
    AlgorithmIdentifier hashAlgorithm;
    byte[] hashedMessage;

    private MessageImprint(ASN1Sequence aSN1Sequence) {
        byte[] octets;
        if (aSN1Sequence.size() != 2) {
            a$$ExternalSyntheticBUOutline0.m$3("sequence has wrong number of elements");
            throw null;
        }
        this.hashAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        octets = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        this.hashedMessage = octets;
    }

    public static MessageImprint getInstance(Object obj) {
        if (obj instanceof MessageImprint) {
            return (MessageImprint) obj;
        }
        if (obj != null) {
            return new MessageImprint(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public byte[] getHashedMessage() {
        return Arrays.clone(this.hashedMessage);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.hashAlgorithm);
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.hashedMessage), aSN1EncodableVector);
    }

    public MessageImprint(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.hashAlgorithm = algorithmIdentifier;
        this.hashedMessage = Arrays.clone(bArr);
    }
}
