package org.bouncycastle.math.ec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes8.dex */
class Tnaf {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger negate = bigInteger.negate();
        MINUS_ONE = negate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger bigInteger2 = ECConstants.THREE;
        BigInteger negate2 = bigInteger2.negate();
        MINUS_THREE = negate2;
        BigInteger bigInteger3 = ECConstants.ZERO;
        alpha0 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger3), null, new ZTauElement(negate2, negate), null, new ZTauElement(negate, negate), null, new ZTauElement(bigInteger, negate), null, new ZTauElement(negate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null, new ZTauElement(bigInteger2, bigInteger), null, new ZTauElement(negate, bigInteger3)};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger3), null, new ZTauElement(negate2, bigInteger), null, new ZTauElement(negate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null, new ZTauElement(negate, negate), null, new ZTauElement(bigInteger, negate), null, new ZTauElement(bigInteger2, negate), null, new ZTauElement(negate, bigInteger3)};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - r0) - 2) + b));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i3 = (((i + 5) / 2) + i2) - i2;
        BigInteger shiftRight = add.shiftRight(i3);
        if (add.testBit(i3 - 1)) {
            shiftRight = shiftRight.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(shiftRight, i2);
    }

    public static BigInteger[] getLucas(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b != 1 && b != -1) {
            a$$ExternalSyntheticBUOutline0.m$3("mu must be 1 or -1");
            return null;
        }
        if (z) {
            bigInteger = ECConstants.TWO;
            bigInteger2 = BigInteger.valueOf(b);
        } else {
            bigInteger = ECConstants.ZERO;
            bigInteger2 = ECConstants.ONE;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            BigInteger bigInteger3 = bigInteger2;
            bigInteger2 = (b < 0 ? bigInteger2.negate() : bigInteger2).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger3;
        }
        return new BigInteger[]{bigInteger, bigInteger2};
    }

    public static byte getMu(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return abstractF2m.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        a$$ExternalSyntheticBUOutline0.m$3("No Koblitz curve (ABC), TNAF multiplication not possible");
        return (byte) 0;
    }

    public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m abstractF2m, byte b) {
        ECPoint.AbstractF2m abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m.negate();
        byte[][] bArr = b == 0 ? alpha0Tnaf : alpha1Tnaf;
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            abstractF2mArr[i >>> 1] = multiplyFromTnaf(abstractF2m, abstractF2m2, bArr[i]);
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        return abstractF2mArr;
    }

    public static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(ECConstants.TWO)) {
                return 1;
            }
            if (bigInteger.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("h (Cofactor) must be 2 or 4");
        return 0;
    }

    public static BigInteger[] getSi(int i, int i2, BigInteger bigInteger) {
        byte mu = getMu(i2);
        int shiftsForCofactor = getShiftsForCofactor(bigInteger);
        BigInteger[] lucas = getLucas(mu, (i + 3) - i2, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger2 = ECConstants.ONE;
        return new BigInteger[]{bigInteger2.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger2.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static BigInteger getTw(byte b, int i) {
        if (i == 4) {
            return b == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b, i, false);
        BigInteger bit = ECConstants.ZERO.setBit(i);
        return lucas[0].shiftLeft(1).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m abstractF2m, ECPoint.AbstractF2m abstractF2m2, byte[] bArr) {
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b = bArr[length];
            if (b != 0) {
                abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m3.tauPow(i).add(b > 0 ? abstractF2m : abstractF2m2);
                i = 0;
            }
        }
        return i > 0 ? abstractF2m3.tauPow(i) : abstractF2m3;
    }

    public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m abstractF2m, BigInteger bigInteger) {
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int intValue = abstractF2m2.getA().toBigInteger().intValue();
        return multiplyTnaf(abstractF2m, partModReduction(abstractF2m2, bigInteger, (byte) intValue, getMu(intValue), (byte) 10));
    }

    public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement) {
        return multiplyFromTnaf(abstractF2m, (ECPoint.AbstractF2m) abstractF2m.negate(), tauAdicNaf(getMu(((ECCurve.AbstractF2m) abstractF2m.getCurve()).getA()), zTauElement));
    }

    public static BigInteger norm(byte b, ZTauElement zTauElement) {
        BigInteger bigInteger = zTauElement.u;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        if (b == 1) {
            return zTauElement.v.shiftLeft(1).add(zTauElement.u).multiply(zTauElement.v).add(multiply);
        }
        if (b == -1) {
            return zTauElement.v.shiftLeft(1).subtract(zTauElement.u).multiply(zTauElement.v).add(multiply);
        }
        a$$ExternalSyntheticBUOutline0.m$3("mu must be 1 or -1");
        return null;
    }

    public static ZTauElement partModReduction(ECCurve.AbstractF2m abstractF2m, BigInteger bigInteger, byte b, byte b2, byte b3) {
        BigInteger bigInteger2;
        int fieldSize = abstractF2m.getFieldSize();
        BigInteger[] si = abstractF2m.getSi();
        BigInteger add = b2 == 1 ? si[0].add(si[1]) : si[0].subtract(si[1]);
        if (abstractF2m.isKoblitz()) {
            BigInteger bigInteger3 = ECConstants.ONE;
            bigInteger2 = bigInteger3.shiftLeft(fieldSize).add(bigInteger3).subtract(abstractF2m.getOrder().multiply(abstractF2m.getCofactor()));
        } else {
            bigInteger2 = getLucas(b2, fieldSize, true)[1];
        }
        BigInteger bigInteger4 = bigInteger2;
        ZTauElement round = round(approximateDivisionByN(bigInteger, si[0], bigInteger4, b, fieldSize, b3), approximateDivisionByN(bigInteger, si[1], bigInteger4, b, fieldSize, b3), b2);
        return new ZTauElement(bigInteger.subtract(add.multiply(round.u)).subtract(si[1].multiply(round.v).shiftLeft(1)), si[1].multiply(round.u).subtract(si[0].multiply(round.v)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5.compareTo(org.bouncycastle.math.ec.Tnaf.MINUS_ONE) < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r5.compareTo(r9) >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r8.compareTo(org.bouncycastle.math.ec.Tnaf.MINUS_TWO) < 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZTauElement round(SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2, byte b) {
        String str;
        SimpleBigDecimal add;
        SimpleBigDecimal subtract;
        if (simpleBigDecimal2.getScale() == simpleBigDecimal.getScale()) {
            int i = -1;
            int i2 = 1;
            if (b == 1 || b == -1) {
                BigInteger round = simpleBigDecimal.round();
                BigInteger round2 = simpleBigDecimal2.round();
                SimpleBigDecimal subtract2 = simpleBigDecimal.subtract(round);
                SimpleBigDecimal subtract3 = simpleBigDecimal2.subtract(round2);
                SimpleBigDecimal add2 = subtract2.add(subtract2);
                SimpleBigDecimal add3 = b == 1 ? add2.add(subtract3) : add2.subtract(subtract3);
                SimpleBigDecimal add4 = subtract3.add(subtract3).add(subtract3);
                SimpleBigDecimal add5 = add4.add(subtract3);
                if (b == 1) {
                    add = subtract2.subtract(add4);
                    subtract = subtract2.add(add5);
                } else {
                    add = subtract2.add(add4);
                    subtract = subtract2.subtract(add5);
                }
                BigInteger bigInteger = ECConstants.ONE;
                byte b2 = 0;
                if (add3.compareTo(bigInteger) < 0) {
                    if (subtract.compareTo(ECConstants.TWO) < 0) {
                        i2 = 0;
                    }
                    i2 = 0;
                    b2 = b;
                }
                if (add3.compareTo(MINUS_ONE) < 0) {
                }
                b2 = (byte) (-b);
                i = i2;
                return new ZTauElement(round.add(BigInteger.valueOf(i)), round2.add(BigInteger.valueOf(b2)));
            }
            str = "mu must be 1 or -1";
        } else {
            str = "lambda0 and lambda1 do not have same scale";
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m abstractF2m) {
        return abstractF2m.tau();
    }

    public static byte[] tauAdicNaf(byte b, ZTauElement zTauElement) {
        if (b != 1 && b != -1) {
            a$$ExternalSyntheticBUOutline0.m$3("mu must be 1 or -1");
            return null;
        }
        int bitLength = norm(b, zTauElement).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 : 34];
        BigInteger bigInteger = zTauElement.u;
        BigInteger bigInteger2 = zTauElement.v;
        int i = 0;
        int i2 = 0;
        while (true) {
            BigInteger bigInteger3 = ECConstants.ZERO;
            if (bigInteger.equals(bigInteger3) && bigInteger2.equals(bigInteger3)) {
                int i3 = i + 1;
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, 0, bArr2, 0, i3);
                return bArr2;
            }
            if (bigInteger.testBit(0)) {
                byte intValue = (byte) ECConstants.TWO.subtract(bigInteger.subtract(bigInteger2.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                bArr[i2] = intValue;
                bigInteger = intValue == 1 ? bigInteger.clearBit(0) : bigInteger.add(ECConstants.ONE);
                i = i2;
            } else {
                bArr[i2] = 0;
            }
            BigInteger shiftRight = bigInteger.shiftRight(1);
            BigInteger add = b == 1 ? bigInteger2.add(shiftRight) : bigInteger2.subtract(shiftRight);
            BigInteger negate = bigInteger.shiftRight(1).negate();
            i2++;
            bigInteger = add;
            bigInteger2 = negate;
        }
    }

    public static byte[] tauAdicWNaf(byte b, ZTauElement zTauElement, int i, int i2, ZTauElement[] zTauElementArr) {
        if (b != 1 && b != -1) {
            a$$ExternalSyntheticBUOutline0.m$3("mu must be 1 or -1");
            return null;
        }
        int bitLength = norm(b, zTauElement).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 + i : i + 34];
        int i3 = (1 << i) - 1;
        int i4 = 32 - i;
        BigInteger bigInteger = zTauElement.u;
        BigInteger bigInteger2 = zTauElement.v;
        int i5 = 0;
        while (true) {
            if (bigInteger.bitLength() <= 62 && bigInteger2.bitLength() <= 62) {
                break;
            }
            if (bigInteger.testBit(0)) {
                int intValue = (bigInteger2.intValue() * i2) + bigInteger.intValue();
                int i6 = intValue & i3;
                bArr[i5] = (byte) ((intValue << i4) >> i4);
                bigInteger = bigInteger.subtract(zTauElementArr[i6].u);
                bigInteger2 = bigInteger2.subtract(zTauElementArr[i6].v);
            }
            i5++;
            BigInteger shiftRight = bigInteger.shiftRight(1);
            BigInteger add = b == 1 ? bigInteger2.add(shiftRight) : bigInteger2.subtract(shiftRight);
            BigInteger negate = shiftRight.negate();
            bigInteger = add;
            bigInteger2 = negate;
        }
        long longValueExact = BigIntegers.longValueExact(bigInteger);
        long longValueExact2 = BigIntegers.longValueExact(bigInteger2);
        while ((longValueExact | longValueExact2) != 0) {
            if ((1 & longValueExact) != 0) {
                int i7 = (((int) longValueExact2) * i2) + ((int) longValueExact);
                int i8 = i7 & i3;
                bArr[i5] = (byte) ((i7 << i4) >> i4);
                longValueExact -= zTauElementArr[i8].u.intValue();
                longValueExact2 -= zTauElementArr[i8].v.intValue();
            }
            i5++;
            long j = longValueExact >> 1;
            long j2 = b == 1 ? longValueExact2 + j : longValueExact2 - j;
            longValueExact2 = -j;
            longValueExact = j2;
        }
        return bArr;
    }

    public static byte getMu(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    public static byte getMu(ECFieldElement eCFieldElement) {
        return (byte) (eCFieldElement.isZero() ? -1 : 1);
    }

    public static SimpleBigDecimal norm(byte b, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        SimpleBigDecimal multiply = simpleBigDecimal.multiply(simpleBigDecimal);
        SimpleBigDecimal multiply2 = simpleBigDecimal.multiply(simpleBigDecimal2);
        SimpleBigDecimal shiftLeft = simpleBigDecimal2.multiply(simpleBigDecimal2).shiftLeft(1);
        if (b == 1) {
            return multiply.add(multiply2).add(shiftLeft);
        }
        if (b == -1) {
            return multiply.subtract(multiply2).add(shiftLeft);
        }
        a$$ExternalSyntheticBUOutline0.m$3("mu must be 1 or -1");
        return null;
    }

    public static BigInteger[] getSi(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return getSi(abstractF2m.getFieldSize(), abstractF2m.getA().toBigInteger().intValue(), abstractF2m.getCofactor());
        }
        a$$ExternalSyntheticBUOutline0.m$3("si is defined for Koblitz curves only");
        return null;
    }
}
