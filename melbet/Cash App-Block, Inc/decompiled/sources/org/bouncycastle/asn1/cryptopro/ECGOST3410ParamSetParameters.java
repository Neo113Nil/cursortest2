package org.bouncycastle.asn1.cryptopro;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public class ECGOST3410ParamSetParameters extends ASN1Object {
    ASN1Integer a;
    ASN1Integer b;
    ASN1Integer p;
    ASN1Integer q;
    ASN1Integer x;
    ASN1Integer y;

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.a = (ASN1Integer) objects.nextElement();
        this.b = (ASN1Integer) objects.nextElement();
        this.p = (ASN1Integer) objects.nextElement();
        this.q = (ASN1Integer) objects.nextElement();
        this.x = (ASN1Integer) objects.nextElement();
        this.y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "Invalid GOST3410Parameter: "));
        return null;
    }

    public BigInteger getA() {
        return this.a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.a);
        aSN1EncodableVector.add(this.b);
        aSN1EncodableVector.add(this.p);
        aSN1EncodableVector.add(this.q);
        aSN1EncodableVector.add(this.x);
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, this.y, aSN1EncodableVector);
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.a = new ASN1Integer(bigInteger);
        this.b = new ASN1Integer(bigInteger2);
        this.p = new ASN1Integer(bigInteger3);
        this.q = new ASN1Integer(bigInteger4);
        this.x = new ASN1Integer(i);
        this.y = new ASN1Integer(bigInteger5);
    }
}
