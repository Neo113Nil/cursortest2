package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes8.dex */
public class SymmAlgorithm extends ASN1Enumerated {
    public static final SymmAlgorithm aes128Ccm = new SymmAlgorithm(BigInteger.ZERO);

    private SymmAlgorithm(ASN1Enumerated aSN1Enumerated) {
        super(aSN1Enumerated.getValue());
        assertValues();
    }

    public static SymmAlgorithm getInstance(Object obj) {
        if (obj instanceof SymmAlgorithm) {
            return (SymmAlgorithm) obj;
        }
        if (obj != null) {
            return new SymmAlgorithm(ASN1Enumerated.getInstance(obj));
        }
        return null;
    }

    public void assertValues() {
        if (BigIntegers.intValueExact(getValue()) == 0) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m(getValue(), "invalid enumeration value ");
    }

    public SymmAlgorithm(BigInteger bigInteger) {
        super(bigInteger);
        assertValues();
    }
}
