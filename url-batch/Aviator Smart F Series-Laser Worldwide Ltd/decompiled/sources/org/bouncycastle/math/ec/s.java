package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
class s {
    private static final long serialVersionUID = 1;
    private final BigInteger bigInt;
    private final int scale;

    public s(BigInteger bigInteger, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.bigInt = bigInteger;
        this.scale = i8;
    }

    private void checkScale(s sVar) {
        if (this.scale != sVar.scale) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    public static s getInstance(BigInteger bigInteger, int i8) {
        return new s(bigInteger.shiftLeft(i8), i8);
    }

    public s add(BigInteger bigInteger) {
        return new s(this.bigInt.add(bigInteger.shiftLeft(this.scale)), this.scale);
    }

    public s adjustScale(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        int i9 = this.scale;
        return i8 == i9 ? this : new s(this.bigInt.shiftLeft(i8 - i9), i8);
    }

    public int compareTo(BigInteger bigInteger) {
        return this.bigInt.compareTo(bigInteger.shiftLeft(this.scale));
    }

    public s divide(BigInteger bigInteger) {
        return new s(this.bigInt.divide(bigInteger), this.scale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.bigInt.equals(sVar.bigInt) && this.scale == sVar.scale;
    }

    public BigInteger floor() {
        return this.bigInt.shiftRight(this.scale);
    }

    public int getScale() {
        return this.scale;
    }

    public int hashCode() {
        return this.bigInt.hashCode() ^ this.scale;
    }

    public int intValue() {
        return floor().intValue();
    }

    public long longValue() {
        return floor().longValue();
    }

    public s multiply(BigInteger bigInteger) {
        return new s(this.bigInt.multiply(bigInteger), this.scale);
    }

    public s negate() {
        return new s(this.bigInt.negate(), this.scale);
    }

    public BigInteger round() {
        return add(new s(d.ONE, 1).adjustScale(this.scale)).floor();
    }

    public s shiftLeft(int i8) {
        return new s(this.bigInt.shiftLeft(i8), this.scale);
    }

    public s subtract(BigInteger bigInteger) {
        return new s(this.bigInt.subtract(bigInteger.shiftLeft(this.scale)), this.scale);
    }

    public String toString() {
        if (this.scale == 0) {
            return this.bigInt.toString();
        }
        BigInteger floor = floor();
        BigInteger subtract = this.bigInt.subtract(floor.shiftLeft(this.scale));
        if (this.bigInt.signum() == -1) {
            subtract = d.ONE.shiftLeft(this.scale).subtract(subtract);
        }
        if (floor.signum() == -1 && !subtract.equals(d.ZERO)) {
            floor = floor.add(d.ONE);
        }
        String bigInteger = floor.toString();
        char[] cArr = new char[this.scale];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i8 = this.scale - length;
        for (int i9 = 0; i9 < i8; i9++) {
            cArr[i9] = '0';
        }
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i8 + i10] = bigInteger2.charAt(i10);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public s add(s sVar) {
        checkScale(sVar);
        return new s(this.bigInt.add(sVar.bigInt), this.scale);
    }

    public int compareTo(s sVar) {
        checkScale(sVar);
        return this.bigInt.compareTo(sVar.bigInt);
    }

    public s divide(s sVar) {
        checkScale(sVar);
        return new s(this.bigInt.shiftLeft(this.scale).divide(sVar.bigInt), this.scale);
    }

    public s multiply(s sVar) {
        checkScale(sVar);
        BigInteger multiply = this.bigInt.multiply(sVar.bigInt);
        int i8 = this.scale;
        return new s(multiply, i8 + i8);
    }

    public s subtract(s sVar) {
        return add(sVar.negate());
    }
}
