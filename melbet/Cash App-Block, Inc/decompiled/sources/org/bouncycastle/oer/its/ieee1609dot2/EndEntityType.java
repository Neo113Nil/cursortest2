package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

/* loaded from: classes8.dex */
public class EndEntityType extends ASN1Object {

    /* renamed from: app, reason: collision with root package name */
    public static final int f1604app = 128;
    public static final int enrol = 64;

    /* renamed from: type, reason: collision with root package name */
    private final ASN1BitString f1605type;

    public EndEntityType(int i) {
        this(new DERBitString(i));
    }

    public static EndEntityType getInstance(Object obj) {
        if (obj instanceof EndEntityType) {
            return (EndEntityType) obj;
        }
        if (obj != null) {
            return new EndEntityType(ASN1BitString.getInstance(obj));
        }
        return null;
    }

    public ASN1BitString getType() {
        return this.f1605type;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f1605type;
    }

    private EndEntityType(ASN1BitString aSN1BitString) {
        this.f1605type = aSN1BitString;
    }
}
