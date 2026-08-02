package org.bouncycastle.pkcs;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DeltaCertificateDescriptor;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* loaded from: classes9.dex */
public class DeltaCertificateRequestAttributeValue implements ASN1Encodable {
    private final ASN1Sequence attrSeq;
    private final Extensions extensions;
    private final AlgorithmIdentifier signatureAlgorithm;
    private final X500Name subject;
    private final SubjectPublicKeyInfo subjectPKInfo;

    public DeltaCertificateRequestAttributeValue(ASN1Sequence aSN1Sequence) {
        AlgorithmIdentifier algorithmIdentifier;
        this.attrSeq = aSN1Sequence;
        int i = 0;
        Extensions extensions = null;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            this.subject = X500Name.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(0)), true);
            i = 1;
        } else {
            this.subject = null;
        }
        this.subjectPKInfo = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i));
        int i2 = i + 1;
        if (i2 != aSN1Sequence.size()) {
            Extensions extensions2 = null;
            algorithmIdentifier = null;
            while (i2 < aSN1Sequence.size()) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i2));
                if (aSN1TaggedObject.getTagNo() == 1) {
                    extensions2 = Extensions.getInstance(aSN1TaggedObject, true);
                } else {
                    if (aSN1TaggedObject.getTagNo() != 2) {
                        a$$ExternalSyntheticBUOutline0.m$3("unknown tag");
                        throw null;
                    }
                    algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
                }
                i2++;
            }
            extensions = extensions2;
        } else {
            algorithmIdentifier = null;
        }
        this.extensions = extensions;
        this.signatureAlgorithm = algorithmIdentifier;
    }

    public static DeltaCertificateRequestAttributeValue getInstance(Object obj) {
        if (obj instanceof DeltaCertificateDescriptor) {
            return (DeltaCertificateRequestAttributeValue) obj;
        }
        if (obj == null) {
            return null;
        }
        new DeltaCertificateRequestAttributeValue(ASN1Sequence.getInstance(obj));
        return null;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public X500Name getSubject() {
        return this.subject;
    }

    public SubjectPublicKeyInfo getSubjectPKInfo() {
        return this.subjectPKInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.attrSeq;
    }

    public DeltaCertificateRequestAttributeValue(Attribute attribute) {
        this(ASN1Sequence.getInstance(attribute.getAttributeValues()[0]));
    }
}
