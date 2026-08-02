package org.bouncycastle.math.ec;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;

/* loaded from: classes8.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize) {
            a$$ExternalSyntheticBUOutline0.m$1("fixed-point comb doesn't support scalars larger than the curve order");
            return null;
        }
        FixedPointPreCompInfo precompute = FixedPointUtil.precompute(eCPoint);
        ECLookupTable lookupTable = precompute.getLookupTable();
        int width = precompute.getWidth();
        int m = Fragment$5$$ExternalSyntheticOutline0.m(combSize, width, 1, width);
        ECPoint infinity = curve.getInfinity();
        int i = width * m;
        int[] fromBigInteger = Nat.fromBigInteger(i, bigInteger);
        int i2 = i - 1;
        for (int i3 = 0; i3 < m; i3++) {
            int i4 = 0;
            for (int i5 = i2 - i3; i5 >= 0; i5 -= m) {
                int i6 = fromBigInteger[i5 >>> 5] >>> (i5 & 31);
                i4 = ((i4 ^ (i6 >>> 1)) << 1) ^ i6;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i4));
        }
        return infinity.add(precompute.getOffset());
    }
}
