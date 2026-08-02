package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes8.dex */
public class UINT3 extends UintBase {
    private static final BigInteger MAX = BigInteger.valueOf(7);

    public UINT3(int i) {
        super(i);
    }

    public static UINT3 getInstance(Object obj) {
        if (obj instanceof UINT3) {
            return (UINT3) obj;
        }
        if (obj != null) {
            return new UINT3(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.oer.its.ieee1609dot2.basetypes.UintBase
    public void assertLimit() {
        if (this.value.signum() < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("value must not be negative");
            return;
        }
        BigInteger bigInteger = this.value;
        BigInteger bigInteger2 = MAX;
        if (bigInteger.compareTo(bigInteger2) <= 0) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m(bigInteger2.toString(16), "value must not exceed ");
    }

    public UINT3(long j) {
        super(j);
    }

    public UINT3(BigInteger bigInteger) {
        super(bigInteger);
    }

    public UINT3(ASN1Integer aSN1Integer) {
        super(aSN1Integer);
    }
}
