package org.bouncycastle.asn1.cmp;

import bo.app.a$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.EncryptedKey;
import org.bouncycastle.asn1.crmf.EncryptedValue;

/* loaded from: classes9.dex */
public class CertOrEncCert extends ASN1Object implements ASN1Choice {
    private CMPCertificate certificate;
    private EncryptedKey encryptedCert;

    private CertOrEncCert(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.hasContextTag(0)) {
            this.certificate = CMPCertificate.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else if (aSN1TaggedObject.hasContextTag(1)) {
            this.encryptedCert = EncryptedKey.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else {
            Path$$ExternalSyntheticBUOutline0.m(ASN1Util.getTagText(aSN1TaggedObject), "unknown tag: ");
            throw null;
        }
    }

    public static CertOrEncCert getInstance(Object obj) {
        if (obj instanceof CertOrEncCert) {
            return (CertOrEncCert) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new CertOrEncCert(ASN1TaggedObject.getInstance(obj, 128));
        }
        return null;
    }

    public CMPCertificate getCertificate() {
        return this.certificate;
    }

    public EncryptedKey getEncryptedCert() {
        return this.encryptedCert;
    }

    public boolean hasEncryptedCertificate() {
        return this.encryptedCert != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        CMPCertificate cMPCertificate = this.certificate;
        return cMPCertificate != null ? new DERTaggedObject(true, 0, (ASN1Encodable) cMPCertificate) : new DERTaggedObject(true, 1, (ASN1Encodable) this.encryptedCert);
    }

    public CertOrEncCert(CMPCertificate cMPCertificate) {
        if (cMPCertificate != null) {
            this.certificate = cMPCertificate;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("'certificate' cannot be null");
            throw null;
        }
    }

    public CertOrEncCert(EncryptedKey encryptedKey) {
        if (encryptedKey != null) {
            this.encryptedCert = encryptedKey;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("'encryptedCert' cannot be null");
            throw null;
        }
    }

    public CertOrEncCert(EncryptedValue encryptedValue) {
        if (encryptedValue != null) {
            this.encryptedCert = new EncryptedKey(encryptedValue);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("'encryptedCert' cannot be null");
            throw null;
        }
    }
}
