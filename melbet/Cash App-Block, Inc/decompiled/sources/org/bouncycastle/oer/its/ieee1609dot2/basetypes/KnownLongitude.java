package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes8.dex */
public class KnownLongitude extends Longitude {
    private KnownLongitude(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }

    public static KnownLongitude getInstance(Object obj) {
        if (obj instanceof KnownLongitude) {
            return (KnownLongitude) obj;
        }
        if (obj != null) {
            return new KnownLongitude(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public KnownLongitude(BigInteger bigInteger) {
        super(bigInteger);
    }

    public KnownLongitude(long j) {
        super(j);
    }
}
