package org.bouncycastle.asn1.cmp;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class OOBCert extends CMPCertificate {
    public OOBCert(AttributeCertificate attributeCertificate) {
        super(1, attributeCertificate);
    }

    public static OOBCert getInstance(Object obj) {
        if (obj == null || (obj instanceof OOBCert)) {
            return (OOBCert) obj;
        }
        if (obj instanceof CMPCertificate) {
            try {
                return getInstance((Object) ((CMPCertificate) obj).getEncoded());
            } catch (IOException e) {
                Handlers$$ExternalSyntheticBUOutline0.m(e.getMessage(), e);
                return null;
            }
        }
        if (obj instanceof byte[]) {
            try {
                obj = ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (IOException unused) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid encoding in OOBCert");
                return null;
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new OOBCert(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj, 128);
            return new OOBCert(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getExplicitBaseObject());
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "Invalid object: "));
        return null;
    }

    public OOBCert(int i, ASN1Object aSN1Object) {
        super(i, aSN1Object);
    }

    public OOBCert(Certificate certificate) {
        super(certificate);
    }

    public static OOBCert getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (aSN1TaggedObject != null) {
            if (z) {
                return getInstance((Object) aSN1TaggedObject.getExplicitBaseObject());
            }
            a$$ExternalSyntheticBUOutline0.m$3("tag must be explicit");
        }
        return null;
    }
}
