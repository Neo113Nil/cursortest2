package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.v;

/* loaded from: classes5.dex */
public class e implements a {
    public static final e INSTANCE = new e();

    protected BigInteger checkValue(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    @Override // org.bouncycastle.crypto.signers.a
    public BigInteger[] decode(BigInteger bigInteger, byte[] bArr) {
        v vVar = (v) s.fromByteArray(bArr);
        if (vVar.size() == 2) {
            BigInteger decodeValue = decodeValue(bigInteger, vVar, 0);
            BigInteger decodeValue2 = decodeValue(bigInteger, vVar, 1);
            if (org.bouncycastle.util.a.areEqual(encode(bigInteger, decodeValue, decodeValue2), bArr)) {
                return new BigInteger[]{decodeValue, decodeValue2};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }

    protected BigInteger decodeValue(BigInteger bigInteger, v vVar, int i8) {
        return checkValue(bigInteger, ((l) vVar.getObjectAt(i8)).getValue());
    }

    @Override // org.bouncycastle.crypto.signers.a
    public byte[] encode(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        g gVar = new g();
        encodeValue(bigInteger, gVar, bigInteger2);
        encodeValue(bigInteger, gVar, bigInteger3);
        return new g1(gVar).getEncoded("DER");
    }

    protected void encodeValue(BigInteger bigInteger, g gVar, BigInteger bigInteger2) {
        gVar.add(new l(checkValue(bigInteger, bigInteger2)));
    }
}
