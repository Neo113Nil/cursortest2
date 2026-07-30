package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class k extends b {
    @Override // org.bouncycastle.math.ec.b
    protected i multiplyPositive(i iVar, BigInteger bigInteger) {
        e curve = iVar.getCurve();
        if (bigInteger.bitLength() > m.getCombSize(curve)) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        l precompute = m.precompute(iVar);
        g lookupTable = precompute.getLookupTable();
        int width = precompute.getWidth();
        int i8 = ((r1 + width) - 1) / width;
        i infinity = curve.getInfinity();
        int i9 = width * i8;
        int[] fromBigInteger = b7.n.fromBigInteger(i9, bigInteger);
        int i10 = i9 - 1;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = 0;
            for (int i13 = i10 - i11; i13 >= 0; i13 -= i8) {
                int i14 = fromBigInteger[i13 >>> 5] >>> (i13 & 31);
                i12 = ((i12 ^ (i14 >>> 1)) << 1) ^ i14;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i12));
        }
        return infinity.add(precompute.getOffset());
    }
}
