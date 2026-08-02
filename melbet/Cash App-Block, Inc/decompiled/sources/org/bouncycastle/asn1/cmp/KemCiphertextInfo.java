package org.bouncycastle.asn1.cmp;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes9.dex */
public class KemCiphertextInfo extends ASN1Object {
    private final ASN1OctetString ct;
    private final AlgorithmIdentifier kem;

    private KemCiphertextInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            a$$ExternalSyntheticBUOutline0.m$3("sequence size should 2");
            throw null;
        }
        this.kem = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.ct = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static KemCiphertextInfo getInstance(Object obj) {
        if (obj instanceof KemCiphertextInfo) {
            return (KemCiphertextInfo) obj;
        }
        if (obj != null) {
            return new KemCiphertextInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getCt() {
        return this.ct;
    }

    public AlgorithmIdentifier getKem() {
        return this.kem;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.kem);
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, this.ct, aSN1EncodableVector);
    }

    public KemCiphertextInfo(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.kem = algorithmIdentifier;
        this.ct = aSN1OctetString;
    }
}
