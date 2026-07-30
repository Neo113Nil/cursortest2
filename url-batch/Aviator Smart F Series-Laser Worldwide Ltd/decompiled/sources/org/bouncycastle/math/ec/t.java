package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
class t {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte POW_2_WIDTH = 16;
    public static final byte WIDTH = 4;
    public static final a0[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final a0[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigInteger = d.ONE;
        BigInteger negate = bigInteger.negate();
        MINUS_ONE = negate;
        MINUS_TWO = d.TWO.negate();
        BigInteger negate2 = d.THREE.negate();
        MINUS_THREE = negate2;
        BigInteger bigInteger2 = d.ZERO;
        alpha0 = new a0[]{null, new a0(bigInteger, bigInteger2), null, new a0(negate2, negate), null, new a0(negate, negate), null, new a0(bigInteger, negate), null};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new a0[]{null, new a0(bigInteger, bigInteger2), null, new a0(negate2, bigInteger), null, new a0(negate, bigInteger), null, new a0(bigInteger, bigInteger), null};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    t() {
    }

    public static s approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b8, int i8, int i9) {
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i8 - r0) - 2) + b8));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i8)));
        int i10 = (((i8 + 5) / 2) + i9) - i9;
        BigInteger shiftRight = add.shiftRight(i10);
        if (add.testBit(i10 - 1)) {
            shiftRight = shiftRight.add(d.ONE);
        }
        return new s(shiftRight, i9);
    }

    public static BigInteger[] getLucas(byte b8, int i8, boolean z7) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b8 != 1 && b8 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z7) {
            bigInteger = d.TWO;
            bigInteger2 = BigInteger.valueOf(b8);
        } else {
            bigInteger = d.ZERO;
            bigInteger2 = d.ONE;
        }
        int i9 = 1;
        while (i9 < i8) {
            i9++;
            BigInteger bigInteger3 = bigInteger2;
            bigInteger2 = (b8 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger3;
        }
        return new BigInteger[]{bigInteger, bigInteger2};
    }

    public static byte getMu(int i8) {
        return (byte) (i8 == 0 ? -1 : 1);
    }

    public static i.b[] getPreComp(i.b bVar, byte b8) {
        byte[][] bArr = b8 == 0 ? alpha0Tnaf : alpha1Tnaf;
        i.b[] bVarArr = new i.b[(bArr.length + 1) >>> 1];
        bVarArr[0] = bVar;
        int length = bArr.length;
        for (int i8 = 3; i8 < length; i8 += 2) {
            bVarArr[i8 >>> 1] = multiplyFromTnaf(bVar, bArr[i8]);
        }
        bVar.getCurve().normalizeAll(bVarArr);
        return bVarArr;
    }

    protected static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(d.TWO)) {
                return 1;
            }
            if (bigInteger.equals(d.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] getSi(int i8, int i9, BigInteger bigInteger) {
        byte mu = getMu(i9);
        int shiftsForCofactor = getShiftsForCofactor(bigInteger);
        BigInteger[] lucas = getLucas(mu, (i8 + 3) - i9, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger2 = d.ONE;
        return new BigInteger[]{bigInteger2.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger2.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static BigInteger getTw(byte b8, int i8) {
        if (i8 == 4) {
            return b8 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b8, i8, false);
        BigInteger bit = d.ZERO.setBit(i8);
        return d.TWO.multiply(lucas[0]).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static i.b multiplyFromTnaf(i.b bVar, byte[] bArr) {
        i.b bVar2 = (i.b) bVar.getCurve().getInfinity();
        i.b bVar3 = (i.b) bVar.negate();
        int i8 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i8++;
            byte b8 = bArr[length];
            if (b8 != 0) {
                bVar2 = (i.b) bVar2.tauPow(i8).add(b8 > 0 ? bVar : bVar3);
                i8 = 0;
            }
        }
        return i8 > 0 ? bVar2.tauPow(i8) : bVar2;
    }

    public static i.b multiplyRTnaf(i.b bVar, BigInteger bigInteger) {
        e.b bVar2 = (e.b) bVar.getCurve();
        int fieldSize = bVar2.getFieldSize();
        int intValue = bVar2.getA().toBigInteger().intValue();
        return multiplyTnaf(bVar, partModReduction(bigInteger, fieldSize, (byte) intValue, bVar2.getSi(), getMu(intValue), (byte) 10));
    }

    public static i.b multiplyTnaf(i.b bVar, a0 a0Var) {
        return multiplyFromTnaf(bVar, tauAdicNaf(getMu(((e.b) bVar.getCurve()).getA()), a0Var));
    }

    public static BigInteger norm(byte b8, a0 a0Var) {
        BigInteger subtract;
        BigInteger bigInteger = a0Var.f17139u;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = a0Var.f17139u.multiply(a0Var.f17140v);
        BigInteger bigInteger2 = a0Var.f17140v;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b8 == 1) {
            subtract = multiply.add(multiply2);
        } else {
            if (b8 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            subtract = multiply.subtract(multiply2);
        }
        return subtract.add(shiftLeft);
    }

    public static a0 partModReduction(BigInteger bigInteger, int i8, byte b8, BigInteger[] bigIntegerArr, byte b9, byte b10) {
        BigInteger add = b9 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = getLucas(b9, i8, true)[1];
        a0 round = round(approximateDivisionByN(bigInteger, bigIntegerArr[0], bigInteger2, b8, i8, b10), approximateDivisionByN(bigInteger, bigIntegerArr[1], bigInteger2, b8, i8, b10), b9);
        return new a0(bigInteger.subtract(add.multiply(round.f17139u)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(round.f17140v)), bigIntegerArr[1].multiply(round.f17139u).subtract(bigIntegerArr[0].multiply(round.f17140v)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r5.compareTo(org.bouncycastle.math.ec.t.MINUS_ONE) < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r5.compareTo(r9) >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r8.compareTo(org.bouncycastle.math.ec.t.MINUS_TWO) < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r8.compareTo(org.bouncycastle.math.ec.d.TWO) >= 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a0 round(s sVar, s sVar2, byte b8) {
        s add;
        s subtract;
        if (sVar2.getScale() != sVar.getScale()) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        int i8 = -1;
        int i9 = 1;
        if (b8 != 1 && b8 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger round = sVar.round();
        BigInteger round2 = sVar2.round();
        s subtract2 = sVar.subtract(round);
        s subtract3 = sVar2.subtract(round2);
        s add2 = subtract2.add(subtract2);
        s add3 = b8 == 1 ? add2.add(subtract3) : add2.subtract(subtract3);
        s add4 = subtract3.add(subtract3).add(subtract3);
        s add5 = add4.add(subtract3);
        if (b8 == 1) {
            add = subtract2.subtract(add4);
            subtract = subtract2.add(add5);
        } else {
            add = subtract2.add(add4);
            subtract = subtract2.subtract(add5);
        }
        BigInteger bigInteger = d.ONE;
        byte b9 = 0;
        if (add3.compareTo(bigInteger) >= 0) {
        }
        b9 = b8;
        i9 = 0;
        if (add3.compareTo(MINUS_ONE) < 0) {
        }
        b9 = (byte) (-b8);
        i8 = i9;
        return new a0(round.add(BigInteger.valueOf(i8)), round2.add(BigInteger.valueOf(b9)));
    }

    public static i.b tau(i.b bVar) {
        return bVar.tau();
    }

    public static byte[] tauAdicNaf(byte b8, a0 a0Var) {
        if (b8 != 1 && b8 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = norm(b8, a0Var).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 : 34];
        BigInteger bigInteger = a0Var.f17139u;
        BigInteger bigInteger2 = a0Var.f17140v;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            BigInteger bigInteger3 = d.ZERO;
            if (bigInteger.equals(bigInteger3) && bigInteger2.equals(bigInteger3)) {
                int i10 = i8 + 1;
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                return bArr2;
            }
            if (bigInteger.testBit(0)) {
                byte intValue = (byte) d.TWO.subtract(bigInteger.subtract(bigInteger2.shiftLeft(1)).mod(d.FOUR)).intValue();
                bArr[i9] = intValue;
                bigInteger = intValue == 1 ? bigInteger.clearBit(0) : bigInteger.add(d.ONE);
                i8 = i9;
            } else {
                bArr[i9] = 0;
            }
            BigInteger shiftRight = bigInteger.shiftRight(1);
            BigInteger add = b8 == 1 ? bigInteger2.add(shiftRight) : bigInteger2.subtract(shiftRight);
            BigInteger negate = bigInteger.shiftRight(1).negate();
            i9++;
            bigInteger = add;
            bigInteger2 = negate;
        }
    }

    public static byte[] tauAdicWNaf(byte b8, a0 a0Var, byte b9, BigInteger bigInteger, BigInteger bigInteger2, a0[] a0VarArr) {
        boolean z7;
        if (b8 != 1 && b8 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = norm(b8, a0Var).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 + b9 : b9 + 34];
        BigInteger shiftRight = bigInteger.shiftRight(1);
        BigInteger bigInteger3 = a0Var.f17139u;
        BigInteger bigInteger4 = a0Var.f17140v;
        int i8 = 0;
        while (true) {
            BigInteger bigInteger5 = d.ZERO;
            if (bigInteger3.equals(bigInteger5) && bigInteger4.equals(bigInteger5)) {
                return bArr;
            }
            if (bigInteger3.testBit(0)) {
                BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                if (mod.compareTo(shiftRight) >= 0) {
                    mod = mod.subtract(bigInteger);
                }
                byte intValue = (byte) mod.intValue();
                bArr[i8] = intValue;
                if (intValue < 0) {
                    intValue = (byte) (-intValue);
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z7) {
                    bigInteger3 = bigInteger3.subtract(a0VarArr[intValue].f17139u);
                    bigInteger4 = bigInteger4.subtract(a0VarArr[intValue].f17140v);
                } else {
                    bigInteger3 = bigInteger3.add(a0VarArr[intValue].f17139u);
                    bigInteger4 = bigInteger4.add(a0VarArr[intValue].f17140v);
                }
            } else {
                bArr[i8] = 0;
            }
            BigInteger shiftRight2 = bigInteger3.shiftRight(1);
            BigInteger add = b8 == 1 ? bigInteger4.add(shiftRight2) : bigInteger4.subtract(shiftRight2);
            BigInteger negate = bigInteger3.shiftRight(1).negate();
            i8++;
            bigInteger3 = add;
            bigInteger4 = negate;
        }
    }

    public static byte getMu(e.b bVar) {
        if (bVar.isKoblitz()) {
            return bVar.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
    }

    public static BigInteger[] getSi(e.b bVar) {
        if (!bVar.isKoblitz()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int fieldSize = bVar.getFieldSize();
        int intValue = bVar.getA().toBigInteger().intValue();
        byte mu = getMu(intValue);
        int shiftsForCofactor = getShiftsForCofactor(bVar.getCofactor());
        BigInteger[] lucas = getLucas(mu, (fieldSize + 3) - intValue, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger = d.ONE;
        return new BigInteger[]{bigInteger.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static s norm(byte b8, s sVar, s sVar2) {
        s subtract;
        s multiply = sVar.multiply(sVar);
        s multiply2 = sVar.multiply(sVar2);
        s shiftLeft = sVar2.multiply(sVar2).shiftLeft(1);
        if (b8 == 1) {
            subtract = multiply.add(multiply2);
        } else {
            if (b8 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            subtract = multiply.subtract(multiply2);
        }
        return subtract.add(shiftLeft);
    }

    public static byte getMu(f fVar) {
        return (byte) (fVar.isZero() ? -1 : 1);
    }
}
