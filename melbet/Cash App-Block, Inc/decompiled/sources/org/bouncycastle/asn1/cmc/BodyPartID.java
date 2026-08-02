package org.bouncycastle.asn1.cmc;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: classes9.dex */
public class BodyPartID extends ASN1Object {
    public static final long bodyIdMax = 4294967295L;
    private final long id;

    public BodyPartID(long j) {
        if (j < 0 || j > bodyIdMax) {
            a$$ExternalSyntheticBUOutline0.m$3("id out of range");
            throw null;
        }
        this.id = j;
    }

    private static long convert(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 32) {
            return bigInteger.longValue();
        }
        a$$ExternalSyntheticBUOutline0.m$3("id out of range");
        return 0L;
    }

    public static BodyPartID getInstance(Object obj) {
        if (obj instanceof BodyPartID) {
            return (BodyPartID) obj;
        }
        if (obj != null) {
            return new BodyPartID(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public long getID() {
        return this.id;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.id);
    }

    private BodyPartID(ASN1Integer aSN1Integer) {
        this(convert(aSN1Integer.getValue()));
    }
}
