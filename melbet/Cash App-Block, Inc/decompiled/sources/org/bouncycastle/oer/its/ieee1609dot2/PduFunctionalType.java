package org.bouncycastle.oer.its.ieee1609dot2;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: classes8.dex */
public class PduFunctionalType extends ASN1Object {
    private final BigInteger functionalType;
    private static final BigInteger MAX = BigInteger.valueOf(255);
    public static final PduFunctionalType tlsHandshake = new PduFunctionalType(1);
    public static final PduFunctionalType iso21177ExtendedAuth = new PduFunctionalType(2);

    public PduFunctionalType(BigInteger bigInteger) {
        this.functionalType = assertValue(bigInteger);
    }

    private static BigInteger assertValue(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("value less than 0");
            return null;
        }
        BigInteger bigInteger2 = MAX;
        if (bigInteger.compareTo(bigInteger2) <= 0) {
            return bigInteger;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) bigInteger2, "value exceeds ");
        return null;
    }

    public static PduFunctionalType getInstance(Object obj) {
        if (obj instanceof PduFunctionalType) {
            return (PduFunctionalType) obj;
        }
        if (obj != null) {
            return new PduFunctionalType(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public BigInteger getFunctionalType() {
        return this.functionalType;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.functionalType);
    }

    public PduFunctionalType(long j) {
        this(BigInteger.valueOf(j));
    }

    private PduFunctionalType(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }

    public PduFunctionalType(byte[] bArr) {
        this(new BigInteger(bArr));
    }
}
