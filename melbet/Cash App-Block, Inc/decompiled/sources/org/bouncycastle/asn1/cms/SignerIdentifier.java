package org.bouncycastle.asn1.cms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes9.dex */
public class SignerIdentifier extends ASN1Object implements ASN1Choice {
    private ASN1Encodable id;

    public SignerIdentifier(ASN1OctetString aSN1OctetString) {
        this.id = new DERTaggedObject(false, 0, (ASN1Encodable) aSN1OctetString);
    }

    public static SignerIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof SignerIdentifier)) {
            return (SignerIdentifier) obj;
        }
        if (obj instanceof IssuerAndSerialNumber) {
            return new SignerIdentifier((IssuerAndSerialNumber) obj);
        }
        if (obj instanceof ASN1OctetString) {
            return new SignerIdentifier((ASN1OctetString) obj);
        }
        if (obj instanceof ASN1Primitive) {
            return new SignerIdentifier((ASN1Primitive) obj);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "Illegal object in SignerIdentifier: "));
        return null;
    }

    public ASN1Encodable getId() {
        ASN1Encodable aSN1Encodable = this.id;
        return aSN1Encodable instanceof ASN1TaggedObject ? ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Encodable, false) : aSN1Encodable;
    }

    public boolean isTagged() {
        return this.id instanceof ASN1TaggedObject;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.id.toASN1Primitive();
    }

    public SignerIdentifier(ASN1Primitive aSN1Primitive) {
        this.id = aSN1Primitive;
    }

    public SignerIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.id = issuerAndSerialNumber;
    }
}
