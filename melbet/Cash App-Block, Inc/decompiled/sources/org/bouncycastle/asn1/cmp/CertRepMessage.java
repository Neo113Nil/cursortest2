package org.bouncycastle.asn1.cmp;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes9.dex */
public class CertRepMessage extends ASN1Object {
    private final ASN1Sequence caPubs;
    private final ASN1Sequence response;

    private CertRepMessage(ASN1Sequence aSN1Sequence) {
        int i = 0;
        if (aSN1Sequence.size() > 1) {
            this.caPubs = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i = 1;
        } else {
            this.caPubs = null;
        }
        this.response = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i));
    }

    public static CertRepMessage getInstance(Object obj) {
        if (obj instanceof CertRepMessage) {
            return (CertRepMessage) obj;
        }
        if (obj != null) {
            return new CertRepMessage(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CMPCertificate[] getCaPubs() {
        ASN1Sequence aSN1Sequence = this.caPubs;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i = 0; i != size; i++) {
            cMPCertificateArr[i] = CMPCertificate.getInstance(this.caPubs.getObjectAt(i));
        }
        return cMPCertificateArr;
    }

    public CertResponse[] getResponse() {
        int size = this.response.size();
        CertResponse[] certResponseArr = new CertResponse[size];
        for (int i = 0; i != size; i++) {
            certResponseArr[i] = CertResponse.getInstance(this.response.getObjectAt(i));
        }
        return certResponseArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Sequence aSN1Sequence = this.caPubs;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) aSN1Sequence));
        }
        aSN1EncodableVector.add(this.response);
        return new DERSequence(aSN1EncodableVector);
    }

    public CertRepMessage(CMPCertificate[] cMPCertificateArr, CertResponse[] certResponseArr) {
        DERSequence dERSequence = null;
        if (certResponseArr == null) {
            a$$ExternalSyntheticBUOutline0.m$3("'response' cannot be null");
            throw null;
        }
        if (cMPCertificateArr != null && cMPCertificateArr.length != 0) {
            dERSequence = new DERSequence(cMPCertificateArr);
        }
        this.caPubs = dERSequence;
        this.response = new DERSequence(certResponseArr);
    }
}
