package org.bouncycastle.asn1.x9;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class X9Curve extends ASN1Object implements X9ObjectIdentifiers {
    private ECCurve curve;
    private ASN1ObjectIdentifier fieldIdentifier;
    private byte[] seed;

    public X9Curve(X9FieldID x9FieldID, BigInteger bigInteger, BigInteger bigInteger2, ASN1Sequence aSN1Sequence) {
        int m;
        int i;
        int i2;
        byte[] octets;
        byte[] octets2;
        byte[] octets3;
        byte[] octets4;
        this.fieldIdentifier = null;
        ASN1ObjectIdentifier identifier = x9FieldID.getIdentifier();
        this.fieldIdentifier = identifier;
        if (identifier.equals((ASN1Primitive) X9ObjectIdentifiers.prime_field)) {
            BigInteger value = ((ASN1Integer) x9FieldID.getParameters()).getValue();
            octets3 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets();
            BigInteger bigInteger3 = new BigInteger(1, octets3);
            octets4 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
            this.curve = new ECCurve.Fp(value, bigInteger3, new BigInteger(1, octets4), bigInteger, bigInteger2);
        } else {
            if (!this.fieldIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.characteristic_two_field)) {
                a$$ExternalSyntheticBUOutline0.m$3("This type of ECCurve is not implemented");
                throw null;
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(x9FieldID.getParameters());
            int intValueExact = ((ASN1Integer) aSN1Sequence2.getObjectAt(0)).intValueExact();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(1);
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.tpBasis)) {
                i = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence2, 2);
                i2 = 0;
                m = 0;
            } else {
                if (!aSN1ObjectIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.ppBasis)) {
                    a$$ExternalSyntheticBUOutline0.m$3("This type of EC basis is not implemented");
                    throw null;
                }
                ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(aSN1Sequence2.getObjectAt(2));
                int m2 = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence3, 0);
                int m3 = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence3, 1);
                m = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence3, 2);
                i = m2;
                i2 = m3;
            }
            octets = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets();
            BigInteger bigInteger4 = new BigInteger(1, octets);
            octets2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
            this.curve = new ECCurve.F2m(intValueExact, i, i2, m, bigInteger4, new BigInteger(1, octets2), bigInteger, bigInteger2);
        }
        if (aSN1Sequence.size() == 3) {
            this.seed = ((DERBitString) aSN1Sequence.getObjectAt(2)).getBytes();
        }
    }

    private void setFieldIdentifier() {
        if (ECAlgorithms.isFpCurve(this.curve)) {
            this.fieldIdentifier = X9ObjectIdentifiers.prime_field;
        } else if (ECAlgorithms.isF2mCurve(this.curve)) {
            this.fieldIdentifier = X9ObjectIdentifiers.characteristic_two_field;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("This type of ECCurve is not implemented");
        }
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0061  */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ASN1Primitive toASN1Primitive() {
        X9FieldElement x9FieldElement;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        if (!this.fieldIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.prime_field)) {
            if (this.fieldIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.characteristic_two_field)) {
                aSN1EncodableVector.add(new X9FieldElement(this.curve.getA()).toASN1Primitive());
                x9FieldElement = new X9FieldElement(this.curve.getB());
            }
            if (this.seed != null) {
                aSN1EncodableVector.add(new DERBitString(this.seed));
            }
            return new DERSequence(aSN1EncodableVector);
        }
        aSN1EncodableVector.add(new X9FieldElement(this.curve.getA()).toASN1Primitive());
        x9FieldElement = new X9FieldElement(this.curve.getB());
        aSN1EncodableVector.add(x9FieldElement.toASN1Primitive());
        if (this.seed != null) {
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X9Curve(ECCurve eCCurve) {
        this(eCCurve, null);
    }

    public X9Curve(ECCurve eCCurve, byte[] bArr) {
        this.fieldIdentifier = null;
        this.curve = eCCurve;
        this.seed = Arrays.clone(bArr);
        setFieldIdentifier();
    }
}
