package org.bouncycastle.asn1.x509;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class DSAParameter extends ASN1Object {
    ASN1Integer g;
    ASN1Integer p;
    ASN1Integer q;

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.p = ASN1Integer.getInstance(objects.nextElement());
        this.q = ASN1Integer.getInstance(objects.nextElement());
        this.g = ASN1Integer.getInstance(objects.nextElement());
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.p);
        aSN1EncodableVector.add(this.q);
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, this.g, aSN1EncodableVector);
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.p = new ASN1Integer(bigInteger);
        this.q = new ASN1Integer(bigInteger2);
        this.g = new ASN1Integer(bigInteger3);
    }
}
