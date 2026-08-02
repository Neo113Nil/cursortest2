package org.bouncycastle.math.ec;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.EndoUtil;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.math.raw.Nat;

/* loaded from: classes8.dex */
public class ECAlgorithms {
    public static ECPoint cleanPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.decodePoint(eCPoint.getEncoded(false));
        }
        a$$ExternalSyntheticBUOutline0.m$3("Point must be on the same curve");
        return null;
    }

    public static ECPoint implCheckResult(ECPoint eCPoint) {
        if (eCPoint.isValidPartial()) {
            return eCPoint;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Invalid result");
        return null;
    }

    private static ECPoint implShamirsTrickFixedPoint(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize || bigInteger2.bitLength() > combSize) {
            a$$ExternalSyntheticBUOutline0.m$1("fixed-point comb doesn't support scalars larger than the curve order");
            return null;
        }
        FixedPointPreCompInfo precompute = FixedPointUtil.precompute(eCPoint);
        FixedPointPreCompInfo precompute2 = FixedPointUtil.precompute(eCPoint2);
        ECLookupTable lookupTable = precompute.getLookupTable();
        ECLookupTable lookupTable2 = precompute2.getLookupTable();
        int width = precompute.getWidth();
        if (width != precompute2.getWidth()) {
            FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
            return fixedPointCombMultiplier.multiply(eCPoint, bigInteger).add(fixedPointCombMultiplier.multiply(eCPoint2, bigInteger2));
        }
        int m = Fragment$5$$ExternalSyntheticOutline0.m(combSize, width, 1, width);
        ECPoint infinity = curve.getInfinity();
        int i = width * m;
        int[] fromBigInteger = Nat.fromBigInteger(i, bigInteger);
        int[] fromBigInteger2 = Nat.fromBigInteger(i, bigInteger2);
        int i2 = i - 1;
        for (int i3 = 0; i3 < m; i3++) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = i2 - i3; i6 >= 0; i6 -= m) {
                int i7 = i6 >>> 5;
                int i8 = i6 & 31;
                int i9 = fromBigInteger[i7] >>> i8;
                i4 = ((i4 ^ (i9 >>> 1)) << 1) ^ i9;
                int i10 = fromBigInteger2[i7] >>> i8;
                i5 = ((i5 ^ (i10 >>> 1)) << 1) ^ i10;
            }
            infinity = infinity.twicePlus(lookupTable.lookupVar(i4).add(lookupTable2.lookupVar(i5)));
        }
        return infinity.add(precompute.getOffset()).add(precompute2.getOffset());
    }

    public static ECPoint implShamirsTrickJsf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        ECPoint infinity = curve.getInfinity();
        ECPoint[] eCPointArr = {eCPoint2, eCPoint.subtract(eCPoint2), eCPoint, eCPoint.add(eCPoint2)};
        curve.normalizeAll(eCPointArr);
        ECPoint[] eCPointArr2 = {eCPointArr[3].negate(), eCPointArr[2].negate(), eCPointArr[1].negate(), eCPointArr[0].negate(), infinity, eCPointArr[0], eCPointArr[1], eCPointArr[2], eCPointArr[3]};
        byte[] generateJSF = WNafUtil.generateJSF(bigInteger, bigInteger2);
        int length = generateJSF.length;
        while (true) {
            length--;
            if (length < 0) {
                return infinity;
            }
            byte b = generateJSF[length];
            infinity = infinity.twicePlus(eCPointArr2[Boxes$$ExternalSyntheticOutline1.m((b << 24) >> 28, 3, 4, (b << 28) >> 28)]);
        }
    }

    public static ECPoint implShamirsTrickWNaf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int windowSize = WNafUtil.getWindowSize(abs.bitLength(), 8);
        int windowSize2 = WNafUtil.getWindowSize(abs2.bitLength(), 8);
        WNafPreCompInfo precompute = WNafUtil.precompute(eCPoint, windowSize, true);
        WNafPreCompInfo precompute2 = WNafUtil.precompute(eCPoint2, windowSize2, true);
        int combSize = FixedPointUtil.getCombSize(eCPoint.getCurve());
        if (!z && !z2 && bigInteger.bitLength() <= combSize && bigInteger2.bitLength() <= combSize && precompute.isPromoted() && precompute2.isPromoted()) {
            return implShamirsTrickFixedPoint(eCPoint, bigInteger, eCPoint2, bigInteger2);
        }
        int min = Math.min(8, precompute.getWidth());
        int min2 = Math.min(8, precompute2.getWidth());
        return implShamirsTrickWNaf(z ? precompute.getPreCompNeg() : precompute.getPreComp(), z ? precompute.getPreComp() : precompute.getPreCompNeg(), WNafUtil.generateWindowNaf(min, abs), z2 ? precompute2.getPreCompNeg() : precompute2.getPreComp(), z2 ? precompute2.getPreComp() : precompute2.getPreCompNeg(), WNafUtil.generateWindowNaf(min2, abs2));
    }

    public static ECPoint implSumOfMultiplies(ECEndomorphism eCEndomorphism, ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        ECPoint[] eCPointArr2 = eCPointArr;
        int length = eCPointArr2.length;
        int i = length << 1;
        boolean[] zArr = new boolean[i];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[i];
        byte[][] bArr = new byte[i][];
        ECPointMap pointMap = eCEndomorphism.getPointMap();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            BigInteger bigInteger = bigIntegerArr[i3];
            zArr[i3] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i4];
            zArr[i4] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int windowSize = WNafUtil.getWindowSize(Math.max(abs.bitLength(), abs2.bitLength()), 8);
            ECPoint eCPoint = eCPointArr2[i2];
            WNafPreCompInfo precompute = WNafUtil.precompute(eCPoint, windowSize, true);
            WNafPreCompInfo precomputeWithPointMap = WNafUtil.precomputeWithPointMap(EndoUtil.mapPoint(eCEndomorphism, eCPoint), pointMap, precompute, true);
            int min = Math.min(8, precompute.getWidth());
            int min2 = Math.min(8, precomputeWithPointMap.getWidth());
            wNafPreCompInfoArr[i3] = precompute;
            wNafPreCompInfoArr[i4] = precomputeWithPointMap;
            bArr[i3] = WNafUtil.generateWindowNaf(min, abs);
            bArr[i4] = WNafUtil.generateWindowNaf(min2, abs2);
            i2++;
            eCPointArr2 = eCPointArr;
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    public static ECPoint implSumOfMultipliesGLV(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr, GLVEndomorphism gLVEndomorphism) {
        BigInteger order = eCPointArr[0].getCurve().getOrder();
        int length = eCPointArr.length;
        int i = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            BigInteger[] decomposeScalar = gLVEndomorphism.decomposeScalar(bigIntegerArr[i3].mod(order));
            int i4 = i2 + 1;
            bigIntegerArr2[i2] = decomposeScalar[0];
            i2 += 2;
            bigIntegerArr2[i4] = decomposeScalar[1];
        }
        if (gLVEndomorphism.hasEfficientPointMap()) {
            return implSumOfMultiplies(gLVEndomorphism, eCPointArr, bigIntegerArr2);
        }
        ECPoint[] eCPointArr2 = new ECPoint[i];
        int i5 = 0;
        for (ECPoint eCPoint : eCPointArr) {
            ECPoint mapPoint = EndoUtil.mapPoint(gLVEndomorphism, eCPoint);
            int i6 = i5 + 1;
            eCPointArr2[i5] = eCPoint;
            i5 += 2;
            eCPointArr2[i6] = mapPoint;
        }
        return implSumOfMultiplies(eCPointArr2, bigIntegerArr2);
    }

    public static ECPoint importPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.importPoint(eCPoint);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Point must be on the same curve");
        return null;
    }

    public static boolean isF2mCurve(ECCurve eCCurve) {
        return isF2mField(eCCurve.getField());
    }

    public static boolean isF2mField(FiniteField finiteField) {
        return finiteField.getDimension() > 1 && finiteField.getCharacteristic().equals(ECConstants.TWO) && (finiteField instanceof PolynomialExtensionField);
    }

    public static boolean isFpCurve(ECCurve eCCurve) {
        return isFpField(eCCurve.getField());
    }

    public static boolean isFpField(FiniteField finiteField) {
        return finiteField.getDimension() == 1;
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i, int i2, ECFieldElement eCFieldElement) {
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[i2];
        int i3 = 0;
        eCFieldElementArr2[0] = eCFieldElementArr[i];
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2) {
                break;
            }
            eCFieldElementArr2[i4] = eCFieldElementArr2[i3].multiply(eCFieldElementArr[i + i4]);
            i3 = i4;
        }
        if (eCFieldElement != null) {
            eCFieldElementArr2[i3] = eCFieldElementArr2[i3].multiply(eCFieldElement);
        }
        ECFieldElement invert = eCFieldElementArr2[i3].invert();
        while (i3 > 0) {
            int i5 = i3 - 1;
            int i6 = i3 + i;
            ECFieldElement eCFieldElement2 = eCFieldElementArr[i6];
            eCFieldElementArr[i6] = eCFieldElementArr2[i5].multiply(invert);
            invert = invert.multiply(eCFieldElement2);
            i3 = i5;
        }
        eCFieldElementArr[i] = invert;
    }

    public static ECPoint referenceMultiply(ECPoint eCPoint, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                infinity = eCPoint;
            }
            for (int i = 1; i < bitLength; i++) {
                eCPoint = eCPoint.twice();
                if (abs.testBit(i)) {
                    infinity = infinity.add(eCPoint);
                }
            }
        }
        return bigInteger.signum() < 0 ? infinity.negate() : infinity;
    }

    public static ECPoint shamirsTrick(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        return implCheckResult(implShamirsTrickJsf(eCPoint, bigInteger, importPoint(eCPoint.getCurve(), eCPoint2), bigInteger2));
    }

    public static ECPoint sumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        if (eCPointArr != null && bigIntegerArr != null && eCPointArr.length == bigIntegerArr.length) {
            if (eCPointArr.length >= 1) {
                int length = eCPointArr.length;
                if (length == 1) {
                    return eCPointArr[0].multiply(bigIntegerArr[0]);
                }
                if (length == 2) {
                    return sumOfTwoMultiplies(eCPointArr[0], bigIntegerArr[0], eCPointArr[1], bigIntegerArr[1]);
                }
                ECPoint eCPoint = eCPointArr[0];
                ECCurve curve = eCPoint.getCurve();
                ECPoint[] eCPointArr2 = new ECPoint[length];
                eCPointArr2[0] = eCPoint;
                for (int i = 1; i < length; i++) {
                    eCPointArr2[i] = importPoint(curve, eCPointArr[i]);
                }
                ECEndomorphism endomorphism = curve.getEndomorphism();
                return endomorphism instanceof GLVEndomorphism ? implCheckResult(implSumOfMultipliesGLV(eCPointArr2, bigIntegerArr, (GLVEndomorphism) endomorphism)) : implCheckResult(implSumOfMultiplies(eCPointArr2, bigIntegerArr));
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("point and scalar arrays should be non-null, and of equal, non-zero, length");
        return null;
    }

    public static ECPoint sumOfTwoMultiplies(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECPoint implSumOfMultipliesGLV;
        ECCurve curve = eCPoint.getCurve();
        ECPoint importPoint = importPoint(curve, eCPoint2);
        if ((curve instanceof ECCurve.AbstractF2m) && ((ECCurve.AbstractF2m) curve).isKoblitz()) {
            implSumOfMultipliesGLV = eCPoint.multiply(bigInteger).add(importPoint.multiply(bigInteger2));
        } else {
            ECEndomorphism endomorphism = curve.getEndomorphism();
            implSumOfMultipliesGLV = endomorphism instanceof GLVEndomorphism ? implSumOfMultipliesGLV(new ECPoint[]{eCPoint, importPoint}, new BigInteger[]{bigInteger, bigInteger2}, (GLVEndomorphism) endomorphism) : implShamirsTrickWNaf(eCPoint, bigInteger, importPoint, bigInteger2);
        }
        return implCheckResult(implSumOfMultipliesGLV);
    }

    public static ECPoint validatePoint(ECPoint eCPoint) {
        if (eCPoint.isValid()) {
            return eCPoint;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Invalid point");
        return null;
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i, int i2) {
        montgomeryTrick(eCFieldElementArr, i, i2, null);
    }

    public static ECPoint implSumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        boolean[] zArr = new boolean[length];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[length];
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < length; i++) {
            BigInteger bigInteger = bigIntegerArr[i];
            zArr[i] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            WNafPreCompInfo precompute = WNafUtil.precompute(eCPointArr[i], WNafUtil.getWindowSize(abs.bitLength(), 8), true);
            int min = Math.min(8, precompute.getWidth());
            wNafPreCompInfoArr[i] = precompute;
            bArr[i] = WNafUtil.generateWindowNaf(min, abs);
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    private static ECPoint implSumOfMultiplies(boolean[] zArr, WNafPreCompInfo[] wNafPreCompInfoArr, byte[][] bArr) {
        int length = bArr.length;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i = Math.max(i, bArr2.length);
        }
        ECPoint infinity = wNafPreCompInfoArr[0].getPreComp()[0].getCurve().getInfinity();
        int i2 = i - 1;
        int i3 = 0;
        ECPoint eCPoint = infinity;
        while (i2 >= 0) {
            ECPoint eCPoint2 = infinity;
            for (int i4 = 0; i4 < length; i4++) {
                byte[] bArr3 = bArr[i4];
                byte b = i2 < bArr3.length ? bArr3[i2] : (byte) 0;
                if (b != 0) {
                    int abs = Math.abs((int) b);
                    WNafPreCompInfo wNafPreCompInfo = wNafPreCompInfoArr[i4];
                    eCPoint2 = eCPoint2.add(((b < 0) == zArr[i4] ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg())[abs >>> 1]);
                }
            }
            if (eCPoint2 == infinity) {
                i3++;
            } else {
                if (i3 > 0) {
                    eCPoint = eCPoint.timesPow2(i3);
                    i3 = 0;
                }
                eCPoint = eCPoint.twicePlus(eCPoint2);
            }
            i2--;
        }
        return i3 > 0 ? eCPoint.timesPow2(i3) : eCPoint;
    }

    public static ECPoint implShamirsTrickWNaf(ECEndomorphism eCEndomorphism, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        WNafPreCompInfo precompute = WNafUtil.precompute(eCPoint, WNafUtil.getWindowSize(Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
        WNafPreCompInfo precomputeWithPointMap = WNafUtil.precomputeWithPointMap(EndoUtil.mapPoint(eCEndomorphism, eCPoint), eCEndomorphism.getPointMap(), precompute, true);
        int min = Math.min(8, precompute.getWidth());
        int min2 = Math.min(8, precomputeWithPointMap.getWidth());
        return implShamirsTrickWNaf(z ? precompute.getPreCompNeg() : precompute.getPreComp(), z ? precompute.getPreComp() : precompute.getPreCompNeg(), WNafUtil.generateWindowNaf(min, abs), z2 ? precomputeWithPointMap.getPreCompNeg() : precomputeWithPointMap.getPreComp(), z2 ? precomputeWithPointMap.getPreComp() : precomputeWithPointMap.getPreCompNeg(), WNafUtil.generateWindowNaf(min2, abs2));
    }

    private static ECPoint implShamirsTrickWNaf(ECPoint[] eCPointArr, ECPoint[] eCPointArr2, byte[] bArr, ECPoint[] eCPointArr3, ECPoint[] eCPointArr4, byte[] bArr2) {
        ECPoint eCPoint;
        int max = Math.max(bArr.length, bArr2.length);
        ECPoint infinity = eCPointArr[0].getCurve().getInfinity();
        int i = max - 1;
        int i2 = 0;
        ECPoint eCPoint2 = infinity;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : (byte) 0;
            byte b2 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    eCPoint = infinity.add((b < 0 ? eCPointArr2 : eCPointArr)[Math.abs((int) b) >>> 1]);
                } else {
                    eCPoint = infinity;
                }
                if (b2 != 0) {
                    eCPoint = eCPoint.add((b2 < 0 ? eCPointArr4 : eCPointArr3)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    eCPoint2 = eCPoint2.timesPow2(i2);
                    i2 = 0;
                }
                eCPoint2 = eCPoint2.twicePlus(eCPoint);
            }
            i--;
        }
        return i2 > 0 ? eCPoint2.timesPow2(i2) : eCPoint2;
    }
}
