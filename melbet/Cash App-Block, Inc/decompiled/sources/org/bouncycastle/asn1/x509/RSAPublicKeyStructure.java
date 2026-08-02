package org.bouncycastle.asn1.x509;

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
public class RSAPublicKeyStructure extends ASN1Object {
    private BigInteger modulus;
    private BigInteger publicExponent;

    public RSAPublicKeyStructure(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.modulus = ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
        this.publicExponent = ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
    }

    public static RSAPublicKeyStructure getInstance(Object obj) {
        if (obj == null || (obj instanceof RSAPublicKeyStructure)) {
            return (RSAPublicKeyStructure) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new RSAPublicKeyStructure((ASN1Sequence) obj);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "Invalid RSAPublicKeyStructure: "));
        return null;
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(getModulus()));
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new ASN1Integer(getPublicExponent()), aSN1EncodableVector);
    }

    public static RSAPublicKeyStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public RSAPublicKeyStructure(BigInteger bigInteger, BigInteger bigInteger2) {
        this.modulus = bigInteger;
        this.publicExponent = bigInteger2;
    }
}
