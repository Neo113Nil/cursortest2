package org.bouncycastle.asn1.x9;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class DomainParameters extends ASN1Object {
    private final ASN1Integer g;
    private final ASN1Integer j;
    private final ASN1Integer p;
    private final ASN1Integer q;
    private final ValidationParams validationParams;

    private DomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.p = ASN1Integer.getInstance(objects.nextElement());
        this.g = ASN1Integer.getInstance(objects.nextElement());
        this.q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next == null || !(next instanceof ASN1Integer)) {
            this.j = null;
        } else {
            this.j = ASN1Integer.getInstance(next);
            next = getNext(objects);
        }
        if (next != null) {
            this.validationParams = ValidationParams.getInstance(next.toASN1Primitive());
        } else {
            this.validationParams = null;
        }
    }

    public static DomainParameters getInstance(Object obj) {
        if (obj instanceof DomainParameters) {
            return (DomainParameters) obj;
        }
        if (obj != null) {
            return new DomainParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger getG() {
        return this.g.getPositiveValue();
    }

    public BigInteger getJ() {
        ASN1Integer aSN1Integer = this.j;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.q.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.validationParams;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.p);
        aSN1EncodableVector.add(this.g);
        aSN1EncodableVector.add(this.q);
        ASN1Integer aSN1Integer = this.j;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ValidationParams validationParams = this.validationParams;
        if (validationParams != null) {
            aSN1EncodableVector.add(validationParams);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static DomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public DomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ValidationParams validationParams) {
        if (bigInteger == null) {
            a$$ExternalSyntheticBUOutline0.m$3("'p' cannot be null");
            throw null;
        }
        if (bigInteger2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("'g' cannot be null");
            throw null;
        }
        if (bigInteger3 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("'q' cannot be null");
            throw null;
        }
        this.p = new ASN1Integer(bigInteger);
        this.g = new ASN1Integer(bigInteger2);
        this.q = new ASN1Integer(bigInteger3);
        if (bigInteger4 != null) {
            this.j = new ASN1Integer(bigInteger4);
        } else {
            this.j = null;
        }
        this.validationParams = validationParams;
    }
}
