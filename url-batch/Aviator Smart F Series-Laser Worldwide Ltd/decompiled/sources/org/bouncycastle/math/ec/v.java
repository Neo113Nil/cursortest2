package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class v extends b {
    @Override // org.bouncycastle.math.ec.b
    protected i multiplyPositive(i iVar, BigInteger bigInteger) {
        i iVar2;
        w precompute = x.precompute(iVar, x.getWindowSize(bigInteger.bitLength()), true);
        i[] preComp = precompute.getPreComp();
        i[] preCompNeg = precompute.getPreCompNeg();
        int width = precompute.getWidth();
        int[] generateCompactWindowNaf = x.generateCompactWindowNaf(width, bigInteger);
        i infinity = iVar.getCurve().getInfinity();
        int length = generateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i8 = generateCompactWindowNaf[length];
            int i9 = i8 >> 16;
            int i10 = i8 & 65535;
            int abs = Math.abs(i9);
            i[] iVarArr = i9 < 0 ? preCompNeg : preComp;
            if ((abs << 2) < (1 << width)) {
                int numberOfLeadingZeros = org.bouncycastle.util.e.numberOfLeadingZeros(abs);
                int i11 = width - (32 - numberOfLeadingZeros);
                iVar2 = iVarArr[((1 << (width - 1)) - 1) >>> 1].add(iVarArr[(((abs ^ (1 << (31 - numberOfLeadingZeros))) << i11) + 1) >>> 1]);
                i10 -= i11;
            } else {
                iVar2 = iVarArr[abs >>> 1];
            }
            infinity = iVar2.timesPow2(i10);
        }
        while (length > 0) {
            length--;
            int i12 = generateCompactWindowNaf[length];
            int i13 = i12 >> 16;
            infinity = infinity.twicePlus((i13 < 0 ? preCompNeg : preComp)[Math.abs(i13) >>> 1]).timesPow2(i12 & 65535);
        }
        return infinity;
    }
}
