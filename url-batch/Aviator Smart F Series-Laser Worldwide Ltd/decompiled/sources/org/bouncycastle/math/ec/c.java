package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.e;

/* loaded from: classes5.dex */
public class c {
    public static i cleanPoint(e eVar, i iVar) {
        if (eVar.equals(iVar.getCurve())) {
            return eVar.decodePoint(iVar.getEncoded(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    static i implCheckResult(i iVar) {
        if (iVar.isValidPartial()) {
            return iVar;
        }
        throw new IllegalStateException("Invalid result");
    }

    private static i implShamirsTrickFixedPoint(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        i add;
        i offset;
        e curve = iVar.getCurve();
        int combSize = m.getCombSize(curve);
        if (bigInteger.bitLength() > combSize || bigInteger2.bitLength() > combSize) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        l precompute = m.precompute(iVar);
        l precompute2 = m.precompute(iVar2);
        g lookupTable = precompute.getLookupTable();
        g lookupTable2 = precompute2.getLookupTable();
        int width = precompute.getWidth();
        if (width != precompute2.getWidth()) {
            k kVar = new k();
            add = kVar.multiply(iVar, bigInteger);
            offset = kVar.multiply(iVar2, bigInteger2);
        } else {
            int i8 = ((combSize + width) - 1) / width;
            i infinity = curve.getInfinity();
            int i9 = width * i8;
            int[] fromBigInteger = b7.n.fromBigInteger(i9, bigInteger);
            int[] fromBigInteger2 = b7.n.fromBigInteger(i9, bigInteger2);
            int i10 = i9 - 1;
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = i10 - i11; i14 >= 0; i14 -= i8) {
                    int i15 = i14 >>> 5;
                    int i16 = i14 & 31;
                    int i17 = fromBigInteger[i15] >>> i16;
                    i12 = ((i12 ^ (i17 >>> 1)) << 1) ^ i17;
                    int i18 = fromBigInteger2[i15] >>> i16;
                    i13 = ((i13 ^ (i18 >>> 1)) << 1) ^ i18;
                }
                infinity = infinity.twicePlus(lookupTable.lookupVar(i12).add(lookupTable2.lookupVar(i13)));
            }
            add = infinity.add(precompute.getOffset());
            offset = precompute2.getOffset();
        }
        return add.add(offset);
    }

    static i implShamirsTrickJsf(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        e curve = iVar.getCurve();
        i infinity = curve.getInfinity();
        i[] iVarArr = {iVar2, iVar.subtract(iVar2), iVar, iVar.add(iVar2)};
        curve.normalizeAll(iVarArr);
        i[] iVarArr2 = {iVarArr[3].negate(), iVarArr[2].negate(), iVarArr[1].negate(), iVarArr[0].negate(), infinity, iVarArr[0], iVarArr[1], iVarArr[2], iVarArr[3]};
        byte[] generateJSF = x.generateJSF(bigInteger, bigInteger2);
        int length = generateJSF.length;
        while (true) {
            length--;
            if (length < 0) {
                return infinity;
            }
            byte b8 = generateJSF[length];
            infinity = infinity.twicePlus(iVarArr2[(((b8 << 24) >> 28) * 3) + 4 + ((b8 << 28) >> 28)]);
        }
    }

    static i implShamirsTrickWNaf(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        boolean z7 = bigInteger.signum() < 0;
        boolean z8 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int windowSize = x.getWindowSize(abs.bitLength(), 8);
        int windowSize2 = x.getWindowSize(abs2.bitLength(), 8);
        w precompute = x.precompute(iVar, windowSize, true);
        w precompute2 = x.precompute(iVar2, windowSize2, true);
        int combSize = m.getCombSize(iVar.getCurve());
        if (!z7 && !z8 && bigInteger.bitLength() <= combSize && bigInteger2.bitLength() <= combSize && precompute.isPromoted() && precompute2.isPromoted()) {
            return implShamirsTrickFixedPoint(iVar, bigInteger, iVar2, bigInteger2);
        }
        int min = Math.min(8, precompute.getWidth());
        int min2 = Math.min(8, precompute2.getWidth());
        return implShamirsTrickWNaf(z7 ? precompute.getPreCompNeg() : precompute.getPreComp(), z7 ? precompute.getPreComp() : precompute.getPreCompNeg(), x.generateWindowNaf(min, abs), z8 ? precompute2.getPreCompNeg() : precompute2.getPreComp(), z8 ? precompute2.getPreComp() : precompute2.getPreCompNeg(), x.generateWindowNaf(min2, abs2));
    }

    static i implSumOfMultiplies(org.bouncycastle.math.ec.endo.a aVar, i[] iVarArr, BigInteger[] bigIntegerArr) {
        i[] iVarArr2 = iVarArr;
        int length = iVarArr2.length;
        int i8 = length << 1;
        boolean[] zArr = new boolean[i8];
        w[] wVarArr = new w[i8];
        byte[][] bArr = new byte[i8][];
        j pointMap = aVar.getPointMap();
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 << 1;
            int i11 = i10 + 1;
            BigInteger bigInteger = bigIntegerArr[i10];
            zArr[i10] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i11];
            zArr[i11] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int windowSize = x.getWindowSize(Math.max(abs.bitLength(), abs2.bitLength()), 8);
            i iVar = iVarArr2[i9];
            w precompute = x.precompute(iVar, windowSize, true);
            w precomputeWithPointMap = x.precomputeWithPointMap(org.bouncycastle.math.ec.endo.c.mapPoint(aVar, iVar), pointMap, precompute, true);
            int min = Math.min(8, precompute.getWidth());
            int min2 = Math.min(8, precomputeWithPointMap.getWidth());
            wVarArr[i10] = precompute;
            wVarArr[i11] = precomputeWithPointMap;
            bArr[i10] = x.generateWindowNaf(min, abs);
            bArr[i11] = x.generateWindowNaf(min2, abs2);
            i9++;
            iVarArr2 = iVarArr;
        }
        return implSumOfMultiplies(zArr, wVarArr, bArr);
    }

    static i implSumOfMultipliesGLV(i[] iVarArr, BigInteger[] bigIntegerArr, org.bouncycastle.math.ec.endo.d dVar) {
        BigInteger order = iVarArr[0].getCurve().getOrder();
        int length = iVarArr.length;
        int i8 = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            BigInteger[] decomposeScalar = dVar.decomposeScalar(bigIntegerArr[i10].mod(order));
            int i11 = i9 + 1;
            bigIntegerArr2[i9] = decomposeScalar[0];
            i9 += 2;
            bigIntegerArr2[i11] = decomposeScalar[1];
        }
        if (dVar.hasEfficientPointMap()) {
            return implSumOfMultiplies(dVar, iVarArr, bigIntegerArr2);
        }
        i[] iVarArr2 = new i[i8];
        int i12 = 0;
        for (i iVar : iVarArr) {
            i mapPoint = org.bouncycastle.math.ec.endo.c.mapPoint(dVar, iVar);
            int i13 = i12 + 1;
            iVarArr2[i12] = iVar;
            i12 += 2;
            iVarArr2[i13] = mapPoint;
        }
        return implSumOfMultiplies(iVarArr2, bigIntegerArr2);
    }

    public static i importPoint(e eVar, i iVar) {
        if (eVar.equals(iVar.getCurve())) {
            return eVar.importPoint(iVar);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean isF2mCurve(e eVar) {
        return isF2mField(eVar.getField());
    }

    public static boolean isF2mField(org.bouncycastle.math.field.b bVar) {
        return bVar.getDimension() > 1 && bVar.getCharacteristic().equals(d.TWO) && (bVar instanceof org.bouncycastle.math.field.g);
    }

    public static boolean isFpCurve(e eVar) {
        return isFpField(eVar.getField());
    }

    public static boolean isFpField(org.bouncycastle.math.field.b bVar) {
        return bVar.getDimension() == 1;
    }

    public static void montgomeryTrick(f[] fVarArr, int i8, int i9) {
        montgomeryTrick(fVarArr, i8, i9, null);
    }

    public static i referenceMultiply(i iVar, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        i infinity = iVar.getCurve().getInfinity();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                infinity = iVar;
            }
            for (int i8 = 1; i8 < bitLength; i8++) {
                iVar = iVar.twice();
                if (abs.testBit(i8)) {
                    infinity = infinity.add(iVar);
                }
            }
        }
        return bigInteger.signum() < 0 ? infinity.negate() : infinity;
    }

    public static i shamirsTrick(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        return implCheckResult(implShamirsTrickJsf(iVar, bigInteger, importPoint(iVar.getCurve(), iVar2), bigInteger2));
    }

    public static i sumOfMultiplies(i[] iVarArr, BigInteger[] bigIntegerArr) {
        if (iVarArr != null && bigIntegerArr != null && iVarArr.length == bigIntegerArr.length) {
            if (iVarArr.length >= 1) {
                int length = iVarArr.length;
                if (length == 1) {
                    return iVarArr[0].multiply(bigIntegerArr[0]);
                }
                if (length == 2) {
                    return sumOfTwoMultiplies(iVarArr[0], bigIntegerArr[0], iVarArr[1], bigIntegerArr[1]);
                }
                i iVar = iVarArr[0];
                e curve = iVar.getCurve();
                i[] iVarArr2 = new i[length];
                iVarArr2[0] = iVar;
                for (int i8 = 1; i8 < length; i8++) {
                    iVarArr2[i8] = importPoint(curve, iVarArr[i8]);
                }
                org.bouncycastle.math.ec.endo.a endomorphism = curve.getEndomorphism();
                return endomorphism instanceof org.bouncycastle.math.ec.endo.d ? implCheckResult(implSumOfMultipliesGLV(iVarArr2, bigIntegerArr, (org.bouncycastle.math.ec.endo.d) endomorphism)) : implCheckResult(implSumOfMultiplies(iVarArr2, bigIntegerArr));
            }
        }
        throw new IllegalArgumentException("point and scalar arrays should be non-null, and of equal, non-zero, length");
    }

    public static i sumOfTwoMultiplies(i iVar, BigInteger bigInteger, i iVar2, BigInteger bigInteger2) {
        i implSumOfMultipliesGLV;
        e curve = iVar.getCurve();
        i importPoint = importPoint(curve, iVar2);
        if ((curve instanceof e.b) && ((e.b) curve).isKoblitz()) {
            implSumOfMultipliesGLV = iVar.multiply(bigInteger).add(importPoint.multiply(bigInteger2));
        } else {
            org.bouncycastle.math.ec.endo.a endomorphism = curve.getEndomorphism();
            implSumOfMultipliesGLV = endomorphism instanceof org.bouncycastle.math.ec.endo.d ? implSumOfMultipliesGLV(new i[]{iVar, importPoint}, new BigInteger[]{bigInteger, bigInteger2}, (org.bouncycastle.math.ec.endo.d) endomorphism) : implShamirsTrickWNaf(iVar, bigInteger, importPoint, bigInteger2);
        }
        return implCheckResult(implSumOfMultipliesGLV);
    }

    public static i validatePoint(i iVar) {
        if (iVar.isValid()) {
            return iVar;
        }
        throw new IllegalStateException("Invalid point");
    }

    static i implShamirsTrickWNaf(org.bouncycastle.math.ec.endo.a aVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z7 = bigInteger.signum() < 0;
        boolean z8 = bigInteger2.signum() < 0;
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        w precompute = x.precompute(iVar, x.getWindowSize(Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
        w precomputeWithPointMap = x.precomputeWithPointMap(org.bouncycastle.math.ec.endo.c.mapPoint(aVar, iVar), aVar.getPointMap(), precompute, true);
        int min = Math.min(8, precompute.getWidth());
        int min2 = Math.min(8, precomputeWithPointMap.getWidth());
        return implShamirsTrickWNaf(z7 ? precompute.getPreCompNeg() : precompute.getPreComp(), z7 ? precompute.getPreComp() : precompute.getPreCompNeg(), x.generateWindowNaf(min, abs), z8 ? precomputeWithPointMap.getPreCompNeg() : precomputeWithPointMap.getPreComp(), z8 ? precomputeWithPointMap.getPreComp() : precomputeWithPointMap.getPreCompNeg(), x.generateWindowNaf(min2, abs2));
    }

    static i implSumOfMultiplies(i[] iVarArr, BigInteger[] bigIntegerArr) {
        int length = iVarArr.length;
        boolean[] zArr = new boolean[length];
        w[] wVarArr = new w[length];
        byte[][] bArr = new byte[length][];
        for (int i8 = 0; i8 < length; i8++) {
            BigInteger bigInteger = bigIntegerArr[i8];
            zArr[i8] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            w precompute = x.precompute(iVarArr[i8], x.getWindowSize(abs.bitLength(), 8), true);
            int min = Math.min(8, precompute.getWidth());
            wVarArr[i8] = precompute;
            bArr[i8] = x.generateWindowNaf(min, abs);
        }
        return implSumOfMultiplies(zArr, wVarArr, bArr);
    }

    public static void montgomeryTrick(f[] fVarArr, int i8, int i9, f fVar) {
        f[] fVarArr2 = new f[i9];
        int i10 = 0;
        fVarArr2[0] = fVarArr[i8];
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= i9) {
                break;
            }
            fVarArr2[i11] = fVarArr2[i10].multiply(fVarArr[i8 + i11]);
            i10 = i11;
        }
        if (fVar != null) {
            fVarArr2[i10] = fVarArr2[i10].multiply(fVar);
        }
        f invert = fVarArr2[i10].invert();
        while (i10 > 0) {
            int i12 = i10 - 1;
            int i13 = i10 + i8;
            f fVar2 = fVarArr[i13];
            fVarArr[i13] = fVarArr2[i12].multiply(invert);
            invert = invert.multiply(fVar2);
            i10 = i12;
        }
        fVarArr[i8] = invert;
    }

    private static i implShamirsTrickWNaf(i[] iVarArr, i[] iVarArr2, byte[] bArr, i[] iVarArr3, i[] iVarArr4, byte[] bArr2) {
        i iVar;
        int max = Math.max(bArr.length, bArr2.length);
        i infinity = iVarArr[0].getCurve().getInfinity();
        int i8 = max - 1;
        i iVar2 = infinity;
        int i9 = 0;
        while (i8 >= 0) {
            byte b8 = i8 < bArr.length ? bArr[i8] : (byte) 0;
            byte b9 = i8 < bArr2.length ? bArr2[i8] : (byte) 0;
            if ((b8 | b9) == 0) {
                i9++;
            } else {
                if (b8 != 0) {
                    iVar = infinity.add((b8 < 0 ? iVarArr2 : iVarArr)[Math.abs((int) b8) >>> 1]);
                } else {
                    iVar = infinity;
                }
                if (b9 != 0) {
                    iVar = iVar.add((b9 < 0 ? iVarArr4 : iVarArr3)[Math.abs((int) b9) >>> 1]);
                }
                if (i9 > 0) {
                    iVar2 = iVar2.timesPow2(i9);
                    i9 = 0;
                }
                iVar2 = iVar2.twicePlus(iVar);
            }
            i8--;
        }
        return i9 > 0 ? iVar2.timesPow2(i9) : iVar2;
    }

    private static i implSumOfMultiplies(boolean[] zArr, w[] wVarArr, byte[][] bArr) {
        int length = bArr.length;
        int i8 = 0;
        for (byte[] bArr2 : bArr) {
            i8 = Math.max(i8, bArr2.length);
        }
        i infinity = wVarArr[0].getPreComp()[0].getCurve().getInfinity();
        int i9 = i8 - 1;
        i iVar = infinity;
        int i10 = 0;
        while (i9 >= 0) {
            i iVar2 = infinity;
            for (int i11 = 0; i11 < length; i11++) {
                byte[] bArr3 = bArr[i11];
                byte b8 = i9 < bArr3.length ? bArr3[i9] : (byte) 0;
                if (b8 != 0) {
                    int abs = Math.abs((int) b8);
                    w wVar = wVarArr[i11];
                    iVar2 = iVar2.add(((b8 < 0) == zArr[i11] ? wVar.getPreComp() : wVar.getPreCompNeg())[abs >>> 1]);
                }
            }
            if (iVar2 == infinity) {
                i10++;
            } else {
                if (i10 > 0) {
                    iVar = iVar.timesPow2(i10);
                    i10 = 0;
                }
                iVar = iVar.twicePlus(iVar2);
            }
            i9--;
        }
        return i10 > 0 ? iVar.timesPow2(i10) : iVar;
    }
}
