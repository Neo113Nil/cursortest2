package org.bouncycastle.asn1.cmp;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;

/* loaded from: classes9.dex */
public class CMPCertificate extends ASN1Object implements ASN1Choice {
    private ASN1Object otherCert;
    private int otherTagValue;
    private Certificate x509v3PKCert;

    public CMPCertificate(Certificate certificate) {
        if (certificate.getVersionNumber() == 3) {
            this.x509v3PKCert = certificate;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("only version 3 certificates allowed");
            throw null;
        }
    }

    public static CMPCertificate getInstance(Object obj) {
        if (obj == null || (obj instanceof CMPCertificate)) {
            return (CMPCertificate) obj;
        }
        if (obj instanceof byte[]) {
            try {
                obj = ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (IOException unused) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid encoding in CMPCertificate");
                return null;
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new CMPCertificate(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj, 128);
            return new CMPCertificate(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getBaseObject());
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "Invalid object: "));
        return null;
    }

    public ASN1Object getOtherCert() {
        return this.otherCert;
    }

    public int getOtherCertTag() {
        return this.otherTagValue;
    }

    public AttributeCertificate getX509v2AttrCert() {
        return AttributeCertificate.getInstance(this.otherCert);
    }

    public Certificate getX509v3PKCert() {
        return this.x509v3PKCert;
    }

    public boolean isX509v3PKCert() {
        return this.x509v3PKCert != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Object aSN1Object = this.otherCert;
        return aSN1Object != null ? new DERTaggedObject(true, this.otherTagValue, (ASN1Encodable) aSN1Object) : this.x509v3PKCert.toASN1Primitive();
    }

    public CMPCertificate(AttributeCertificate attributeCertificate) {
        this(1, attributeCertificate);
    }

    public CMPCertificate(int i, ASN1Object aSN1Object) {
        this.otherTagValue = i;
        this.otherCert = aSN1Object;
    }

    public static CMPCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (aSN1TaggedObject != null) {
            if (z) {
                return getInstance(aSN1TaggedObject.getExplicitBaseObject());
            }
            a$$ExternalSyntheticBUOutline0.m$3("tag must be explicit");
        }
        return null;
    }
}
