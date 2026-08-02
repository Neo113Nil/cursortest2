package org.bouncycastle.math.ec;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.math.BigInteger;

/* loaded from: classes8.dex */
public class FixedPointUtil {
    public static final String PRECOMP_NAME = "bc_fixed_point";

    public static int getCombSize(ECCurve eCCurve) {
        BigInteger order = eCCurve.getOrder();
        return order == null ? eCCurve.getFieldSize() + 1 : order.bitLength();
    }

    public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof FixedPointPreCompInfo) {
            return (FixedPointPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static FixedPointPreCompInfo precompute(final ECPoint eCPoint) {
        final ECCurve curve = eCPoint.getCurve();
        return (FixedPointPreCompInfo) curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.FixedPointUtil.1
            private boolean checkExisting(FixedPointPreCompInfo fixedPointPreCompInfo, int i) {
                return fixedPointPreCompInfo != null && checkTable(fixedPointPreCompInfo.getLookupTable(), i);
            }

            private boolean checkTable(ECLookupTable eCLookupTable, int i) {
                return eCLookupTable != null && eCLookupTable.getSize() >= i;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                FixedPointPreCompInfo fixedPointPreCompInfo = preCompInfo instanceof FixedPointPreCompInfo ? (FixedPointPreCompInfo) preCompInfo : null;
                int combSize = FixedPointUtil.getCombSize(ECCurve.this);
                int i = combSize > 250 ? 6 : 5;
                int i2 = 1 << i;
                if (checkExisting(fixedPointPreCompInfo, i2)) {
                    return fixedPointPreCompInfo;
                }
                int m = Fragment$5$$ExternalSyntheticOutline0.m(combSize, i, 1, i);
                ECPoint[] eCPointArr = new ECPoint[i + 1];
                eCPointArr[0] = eCPoint;
                for (int i3 = 1; i3 < i; i3++) {
                    eCPointArr[i3] = eCPointArr[i3 - 1].timesPow2(m);
                }
                eCPointArr[i] = eCPointArr[0].subtract(eCPointArr[1]);
                ECCurve.this.normalizeAll(eCPointArr);
                ECPoint[] eCPointArr2 = new ECPoint[i2];
                eCPointArr2[0] = eCPointArr[0];
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    ECPoint eCPoint2 = eCPointArr[i4];
                    int i5 = 1 << i4;
                    for (int i6 = i5; i6 < i2; i6 += i5 << 1) {
                        eCPointArr2[i6] = eCPointArr2[i6 - i5].add(eCPoint2);
                    }
                }
                ECCurve.this.normalizeAll(eCPointArr2);
                FixedPointPreCompInfo fixedPointPreCompInfo2 = new FixedPointPreCompInfo();
                fixedPointPreCompInfo2.setLookupTable(ECCurve.this.createCacheSafeLookupTable(eCPointArr2, 0, i2));
                fixedPointPreCompInfo2.setOffset(eCPointArr[i]);
                fixedPointPreCompInfo2.setWidth(i);
                return fixedPointPreCompInfo2;
            }
        });
    }
}
