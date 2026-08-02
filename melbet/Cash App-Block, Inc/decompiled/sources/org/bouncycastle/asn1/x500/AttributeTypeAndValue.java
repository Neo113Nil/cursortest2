package org.bouncycastle.asn1.x500;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes9.dex */
public class AttributeTypeAndValue extends ASN1Object {

    /* renamed from: type, reason: collision with root package name */
    private ASN1ObjectIdentifier f1565type;
    private ASN1Encodable value;

    private AttributeTypeAndValue(ASN1Sequence aSN1Sequence) {
        this.f1565type = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.value = aSN1Sequence.getObjectAt(1);
    }

    public static AttributeTypeAndValue getInstance(Object obj) {
        if (obj instanceof AttributeTypeAndValue) {
            return (AttributeTypeAndValue) obj;
        }
        if (obj != null) {
            return new AttributeTypeAndValue(ASN1Sequence.getInstance(obj));
        }
        a$$ExternalSyntheticBUOutline0.m$3("null value in getInstance()");
        return null;
    }

    public ASN1ObjectIdentifier getType() {
        return this.f1565type;
    }

    public ASN1Encodable getValue() {
        return this.value;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f1565type);
        aSN1EncodableVector.add(this.value);
        return new DERSequence(aSN1EncodableVector);
    }

    public AttributeTypeAndValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f1565type = aSN1ObjectIdentifier;
        this.value = aSN1Encodable;
    }
}
