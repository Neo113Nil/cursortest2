package org.bouncycastle.asn1.cmc;

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
import org.bouncycastle.asn1.crmf.CertReqMsg;

/* loaded from: classes9.dex */
public class TaggedRequest extends ASN1Object implements ASN1Choice {
    public static final int CRM = 1;
    public static final int ORM = 2;
    public static final int TCR = 0;
    private final int tagNo = 2;
    private final ASN1Encodable value;

    private TaggedRequest(ASN1Sequence aSN1Sequence) {
        this.value = aSN1Sequence;
    }

    public static TaggedRequest getInstance(Object obj) {
        if (obj instanceof TaggedRequest) {
            return (TaggedRequest) obj;
        }
        if (obj != null) {
            if (obj instanceof ASN1Encodable) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(((ASN1Encodable) obj).toASN1Primitive());
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    return new TaggedRequest(TaggedCertificationRequest.getInstance(aSN1TaggedObject, false));
                }
                if (tagNo == 1) {
                    return new TaggedRequest(CertReqMsg.getInstance(aSN1TaggedObject, false));
                }
                if (tagNo == 2) {
                    return new TaggedRequest(ASN1Sequence.getInstance(aSN1TaggedObject, false));
                }
                a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1TaggedObject, new StringBuilder("unknown tag in getInstance(): ")));
                return null;
            }
            if (obj instanceof byte[]) {
                try {
                    return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
                } catch (IOException unused) {
                    a$$ExternalSyntheticBUOutline0.m$3("unknown encoding in getInstance()");
                    return null;
                }
            }
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "unknown object in getInstance(): "));
        }
        return null;
    }

    public int getTagNo() {
        return this.tagNo;
    }

    public ASN1Encodable getValue() {
        return this.value;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.tagNo, this.value);
    }

    public TaggedRequest(TaggedCertificationRequest taggedCertificationRequest) {
        this.value = taggedCertificationRequest;
    }

    public TaggedRequest(CertReqMsg certReqMsg) {
        this.value = certReqMsg;
    }
}
