package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes8.dex */
public class UINT8 extends UintBase {
    private static final BigInteger MAX = BigInteger.valueOf(255);

    public UINT8(int i) {
        super(i);
    }

    public static UINT8 getInstance(Object obj) {
        if (obj instanceof UINT8) {
            return (UINT8) obj;
        }
        if (obj != null) {
            return new UINT8(ASN1Integer.getInstance(obj));
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
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("value 0x", this.value.toString(16), "  must not exceed 0x", bigInteger2.toString(16));
    }

    public UINT8(long j) {
        super(j);
    }

    public UINT8(BigInteger bigInteger) {
        super(bigInteger);
    }

    public UINT8(ASN1Integer aSN1Integer) {
        super(aSN1Integer);
    }
}
