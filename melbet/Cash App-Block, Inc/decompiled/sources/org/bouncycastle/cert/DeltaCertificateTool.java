package org.bouncycastle.cert;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;

/* loaded from: classes9.dex */
public class DeltaCertificateTool {
    public static X509CertificateHolder extractDeltaCertificate(X509CertificateHolder x509CertificateHolder) {
        Extension extension = x509CertificateHolder.getExtension(Extension.deltaCertificateDescriptor);
        if (extension == null) {
            a$$ExternalSyntheticBUOutline0.m$1("no deltaCertificateDescriptor present");
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(extension.getParsedValue());
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(x509CertificateHolder.toASN1Structure().getTBSCertificate().toASN1Primitive());
        ASN1Encodable[] array2 = aSN1Sequence2.toArray();
        array2[0] = aSN1Sequence2.getObjectAt(0);
        array2[1] = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
        int i = 2;
        while (objectAt instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                array2[2] = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                array2[3] = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 2) {
                array2[4] = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 3) {
                array2[5] = ASN1Sequence.getInstance((ASN1TaggedObject) objectAt, true);
            }
            int i2 = i + 1;
            ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i);
            i = i2;
            objectAt = objectAt2;
        }
        array2[6] = objectAt;
        if (array2[2] == null) {
            array2[2] = aSN1Sequence2.getObjectAt(2);
        }
        if (array2[3] == null) {
            array2[3] = aSN1Sequence2.getObjectAt(3);
        }
        if (array2[4] == null) {
            array2[4] = aSN1Sequence2.getObjectAt(4);
        }
        if (array2[5] == null) {
            array2[5] = aSN1Sequence2.getObjectAt(5);
        }
        ExtensionsGenerator extractExtensions = extractExtensions(aSN1Sequence2);
        if (i < aSN1Sequence.size() - 1) {
            ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            if (aSN1TaggedObject2.getTagNo() != 4) {
                a$$ExternalSyntheticBUOutline0.m$3("malformed delta extension");
                return null;
            }
            ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(aSN1TaggedObject2, true);
            for (int i3 = 0; i3 != aSN1Sequence3.size(); i3++) {
                extractExtensions.replaceExtension(Extension.getInstance(aSN1Sequence3.getObjectAt(i3)));
            }
            array2[7] = new DERTaggedObject(3, extractExtensions.generate());
        } else if (extractExtensions.isEmpty()) {
            array2[7] = null;
        } else {
            array2[7] = new DERTaggedObject(3, extractExtensions.generate());
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        for (int i4 = 0; i4 != array2.length; i4++) {
            ASN1Encodable aSN1Encodable = array2[i4];
            if (aSN1Encodable != null) {
                aSN1EncodableVector.add(aSN1Encodable);
            }
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector2.add(ASN1Sequence.getInstance(array2[2]));
        aSN1EncodableVector2.add(ASN1BitString.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1)));
        return new X509CertificateHolder(Certificate.getInstance(new DERSequence(aSN1EncodableVector2)));
    }

    private static ExtensionsGenerator extractExtensions(ASN1Sequence aSN1Sequence) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.deltaCertificateDescriptor;
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1)), true);
        ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
        for (int i = 0; i != aSN1Sequence2.size(); i++) {
            Extension extension = Extension.getInstance(aSN1Sequence2.getObjectAt(i));
            if (!aSN1ObjectIdentifier.equals((ASN1Primitive) extension.getExtnId())) {
                extensionsGenerator.addExtension(extension);
            }
        }
        return extensionsGenerator;
    }

    public static Extension makeDeltaCertificateExtension(boolean z, X509CertificateHolder x509CertificateHolder) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(x509CertificateHolder.getSerialNumber()));
        aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) x509CertificateHolder.getSignatureAlgorithm()));
        aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) x509CertificateHolder.getIssuer()));
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
        aSN1EncodableVector2.add(x509CertificateHolder.toASN1Structure().getStartDate());
        aSN1EncodableVector2.add(x509CertificateHolder.toASN1Structure().getEndDate());
        aSN1EncodableVector.add(new DERTaggedObject(true, 2, (ASN1Encodable) new DERSequence(aSN1EncodableVector2)));
        aSN1EncodableVector.add(new DERTaggedObject(true, 3, (ASN1Encodable) x509CertificateHolder.getSubject()));
        aSN1EncodableVector.add(x509CertificateHolder.getSubjectPublicKeyInfo());
        if (x509CertificateHolder.getExtensions() != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 4, (ASN1Encodable) x509CertificateHolder.getExtensions()));
        }
        aSN1EncodableVector.add(new DERBitString(x509CertificateHolder.getSignature()));
        return new Extension(Extension.deltaCertificateDescriptor, z, new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER));
    }
}
