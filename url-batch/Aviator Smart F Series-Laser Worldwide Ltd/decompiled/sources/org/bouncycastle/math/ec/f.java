package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes5.dex */
public abstract class f implements org.bouncycastle.math.ec.d {

    public static abstract class a extends f {
        public f halfTrace() {
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) == 0) {
                throw new IllegalStateException("Half-trace only defined for odd m");
            }
            int i8 = (fieldSize + 1) >>> 1;
            int numberOfLeadingZeros = 31 - org.bouncycastle.util.e.numberOfLeadingZeros(i8);
            int i9 = 1;
            f fVar = this;
            while (numberOfLeadingZeros > 0) {
                fVar = fVar.squarePow(i9 << 1).add(fVar);
                numberOfLeadingZeros--;
                i9 = i8 >>> numberOfLeadingZeros;
                if ((i9 & 1) != 0) {
                    fVar = fVar.squarePow(2).add(this);
                }
            }
            return fVar;
        }

        public boolean hasFastTrace() {
            return false;
        }

        public int trace() {
            int fieldSize = getFieldSize();
            int numberOfLeadingZeros = 31 - org.bouncycastle.util.e.numberOfLeadingZeros(fieldSize);
            int i8 = 1;
            f fVar = this;
            while (numberOfLeadingZeros > 0) {
                fVar = fVar.squarePow(i8).add(fVar);
                numberOfLeadingZeros--;
                i8 = fieldSize >>> numberOfLeadingZeros;
                if ((i8 & 1) != 0) {
                    fVar = fVar.square().add(this);
                }
            }
            if (fVar.isZero()) {
                return 0;
            }
            if (fVar.isOne()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    public static abstract class b extends f {
    }

    public static class c extends a {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;
        private int[] ks;

        /* renamed from: m, reason: collision with root package name */
        private int f17187m;
        private int representation;

        /* renamed from: x, reason: collision with root package name */
        o f17188x;

        public c(int i8, int i9, int i10, int i11, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i8) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i10 == 0 && i11 == 0) {
                this.representation = 2;
                this.ks = new int[]{i9};
            } else {
                if (i10 >= i11) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i10 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.representation = 3;
                this.ks = new int[]{i9, i10, i11};
            }
            this.f17187m = i8;
            this.f17188x = new o(bigInteger);
        }

        @Override // org.bouncycastle.math.ec.f
        public f add(f fVar) {
            o oVar = (o) this.f17188x.clone();
            oVar.addShiftedByWords(((c) fVar).f17188x, 0);
            return new c(this.f17187m, this.ks, oVar);
        }

        @Override // org.bouncycastle.math.ec.f
        public f addOne() {
            return new c(this.f17187m, this.ks, this.f17188x.addOne());
        }

        @Override // org.bouncycastle.math.ec.f
        public int bitLength() {
            return this.f17188x.degree();
        }

        @Override // org.bouncycastle.math.ec.f
        public f divide(f fVar) {
            return multiply(fVar.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f17187m == cVar.f17187m && this.representation == cVar.representation && org.bouncycastle.util.a.areEqual(this.ks, cVar.ks) && this.f17188x.equals(cVar.f17188x);
        }

        @Override // org.bouncycastle.math.ec.f
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.bouncycastle.math.ec.f
        public int getFieldSize() {
            return this.f17187m;
        }

        public int getK1() {
            return this.ks[0];
        }

        public int getK2() {
            int[] iArr = this.ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f17187m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return (this.f17188x.hashCode() ^ this.f17187m) ^ org.bouncycastle.util.a.hashCode(this.ks);
        }

        @Override // org.bouncycastle.math.ec.f
        public f invert() {
            int i8 = this.f17187m;
            int[] iArr = this.ks;
            return new c(i8, iArr, this.f17188x.modInverse(i8, iArr));
        }

        @Override // org.bouncycastle.math.ec.f
        public boolean isOne() {
            return this.f17188x.isOne();
        }

        @Override // org.bouncycastle.math.ec.f
        public boolean isZero() {
            return this.f17188x.isZero();
        }

        @Override // org.bouncycastle.math.ec.f
        public f multiply(f fVar) {
            int i8 = this.f17187m;
            int[] iArr = this.ks;
            return new c(i8, iArr, this.f17188x.modMultiply(((c) fVar).f17188x, i8, iArr));
        }

        @Override // org.bouncycastle.math.ec.f
        public f multiplyMinusProduct(f fVar, f fVar2, f fVar3) {
            return multiplyPlusProduct(fVar, fVar2, fVar3);
        }

        @Override // org.bouncycastle.math.ec.f
        public f multiplyPlusProduct(f fVar, f fVar2, f fVar3) {
            o oVar = this.f17188x;
            o oVar2 = ((c) fVar).f17188x;
            o oVar3 = ((c) fVar2).f17188x;
            o oVar4 = ((c) fVar3).f17188x;
            o multiply = oVar.multiply(oVar2, this.f17187m, this.ks);
            o multiply2 = oVar3.multiply(oVar4, this.f17187m, this.ks);
            if (multiply == oVar || multiply == oVar2) {
                multiply = (o) multiply.clone();
            }
            multiply.addShiftedByWords(multiply2, 0);
            multiply.reduce(this.f17187m, this.ks);
            return new c(this.f17187m, this.ks, multiply);
        }

        @Override // org.bouncycastle.math.ec.f
        public f negate() {
            return this;
        }

        @Override // org.bouncycastle.math.ec.f
        public f sqrt() {
            return (this.f17188x.isZero() || this.f17188x.isOne()) ? this : squarePow(this.f17187m - 1);
        }

        @Override // org.bouncycastle.math.ec.f
        public f square() {
            int i8 = this.f17187m;
            int[] iArr = this.ks;
            return new c(i8, iArr, this.f17188x.modSquare(i8, iArr));
        }

        @Override // org.bouncycastle.math.ec.f
        public f squareMinusProduct(f fVar, f fVar2) {
            return squarePlusProduct(fVar, fVar2);
        }

        @Override // org.bouncycastle.math.ec.f
        public f squarePlusProduct(f fVar, f fVar2) {
            o oVar = this.f17188x;
            o oVar2 = ((c) fVar).f17188x;
            o oVar3 = ((c) fVar2).f17188x;
            o square = oVar.square(this.f17187m, this.ks);
            o multiply = oVar2.multiply(oVar3, this.f17187m, this.ks);
            if (square == oVar) {
                square = (o) square.clone();
            }
            square.addShiftedByWords(multiply, 0);
            square.reduce(this.f17187m, this.ks);
            return new c(this.f17187m, this.ks, square);
        }

        @Override // org.bouncycastle.math.ec.f
        public f squarePow(int i8) {
            if (i8 < 1) {
                return this;
            }
            int i9 = this.f17187m;
            int[] iArr = this.ks;
            return new c(i9, iArr, this.f17188x.modSquareN(i8, i9, iArr));
        }

        @Override // org.bouncycastle.math.ec.f
        public f subtract(f fVar) {
            return add(fVar);
        }

        @Override // org.bouncycastle.math.ec.f
        public boolean testBitZero() {
            return this.f17188x.testBitZero();
        }

        @Override // org.bouncycastle.math.ec.f
        public BigInteger toBigInteger() {
            return this.f17188x.toBigInteger();
        }

        c(int i8, int[] iArr, o oVar) {
            this.f17187m = i8;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.ks = iArr;
            this.f17188x = oVar;
        }
    }

    public static class d extends b {

        /* renamed from: q, reason: collision with root package name */
        BigInteger f17189q;

        /* renamed from: r, reason: collision with root package name */
        BigInteger f17190r;

        /* renamed from: x, reason: collision with root package name */
        BigInteger f17191x;

        public d(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, calculateResidue(bigInteger), bigInteger2);
        }

        static BigInteger calculateResidue(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return org.bouncycastle.math.ec.d.ONE.shiftLeft(bitLength).subtract(bigInteger);
        }

        private f checkSqrt(f fVar) {
            if (fVar.square().equals(this)) {
                return fVar;
            }
            return null;
        }

        private BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = org.bouncycastle.math.ec.d.ONE;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = org.bouncycastle.math.ec.d.TWO;
            BigInteger bigInteger8 = bigInteger6;
            for (int i8 = bitLength - 1; i8 >= lowestSetBit + 1; i8--) {
                bigInteger4 = modMult(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i8)) {
                    bigInteger8 = modMult(bigInteger4, bigInteger2);
                    bigInteger6 = modMult(bigInteger6, bigInteger5);
                    bigInteger7 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = modReduce(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger modReduce = modReduce(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger modReduce2 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = modReduce(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = modReduce2;
                    bigInteger6 = modReduce;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger modMult = modMult(bigInteger4, bigInteger8);
            BigInteger modMult2 = modMult(modMult, bigInteger2);
            BigInteger modReduce3 = modReduce(bigInteger6.multiply(bigInteger7).subtract(modMult));
            BigInteger modReduce4 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(modMult)));
            BigInteger modMult3 = modMult(modMult, modMult2);
            for (int i9 = 1; i9 <= lowestSetBit; i9++) {
                modReduce3 = modMult(modReduce3, modReduce4);
                modReduce4 = modReduce(modReduce4.multiply(modReduce4).subtract(modMult3.shiftLeft(1)));
                modMult3 = modMult(modMult3, modMult3);
            }
            return new BigInteger[]{modReduce3, modReduce4};
        }

        @Override // org.bouncycastle.math.ec.f
        public f add(f fVar) {
            return new d(this.f17189q, this.f17190r, modAdd(this.f17191x, fVar.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.f
        public f addOne() {
            BigInteger add = this.f17191x.add(org.bouncycastle.math.ec.d.ONE);
            if (add.compareTo(this.f17189q) == 0) {
                add = org.bouncycastle.math.ec.d.ZERO;
            }
            return new d(this.f17189q, this.f17190r, add);
        }

        @Override // org.bouncycastle.math.ec.f
        public f divide(f fVar) {
            return new d(this.f17189q, this.f17190r, modMult(this.f17191x, modInverse(fVar.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f17189q.equals(dVar.f17189q) && this.f17191x.equals(dVar.f17191x);
        }

        @Override // org.bouncycastle.math.ec.f
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.bouncycastle.math.ec.f
        public int getFieldSize() {
            return this.f17189q.bitLength();
        }

        public BigInteger getQ() {
            return this.f17189q;
        }

        public int hashCode() {
            return this.f17189q.hashCode() ^ this.f17191x.hashCode();
        }

        @Override // org.bouncycastle.math.ec.f
        public f invert() {
            return new d(this.f17189q, this.f17190r, modInverse(this.f17191x));
        }

        protected BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f17189q) >= 0 ? add.subtract(this.f17189q) : add;
        }

        protected BigInteger modDouble(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f17189q) >= 0 ? shiftLeft.subtract(this.f17189q) : shiftLeft;
        }

        protected BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f17189q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f17189q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected BigInteger modInverse(BigInteger bigInteger) {
            return org.bouncycastle.util.b.modOddInverse(this.f17189q, bigInteger);
        }

        protected BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        protected BigInteger modReduce(BigInteger bigInteger) {
            if (this.f17190r == null) {
                return bigInteger.mod(this.f17189q);
            }
            boolean z7 = bigInteger.signum() < 0;
            if (z7) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.f17189q.bitLength();
            boolean equals = this.f17190r.equals(org.bouncycastle.math.ec.d.ONE);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.f17190r);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.f17189q) >= 0) {
                bigInteger = bigInteger.subtract(this.f17189q);
            }
            return (!z7 || bigInteger.signum() == 0) ? bigInteger : this.f17189q.subtract(bigInteger);
        }

        protected BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f17189q) : subtract;
        }

        @Override // org.bouncycastle.math.ec.f
        public f multiply(f fVar) {
            return new d(this.f17189q, this.f17190r, modMult(this.f17191x, fVar.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.f
        public f multiplyMinusProduct(f fVar, f fVar2, f fVar3) {
            BigInteger bigInteger = this.f17191x;
            BigInteger bigInteger2 = fVar.toBigInteger();
            BigInteger bigInteger3 = fVar2.toBigInteger();
            BigInteger bigInteger4 = fVar3.toBigInteger();
            return new d(this.f17189q, this.f17190r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.f
        public f multiplyPlusProduct(f fVar, f fVar2, f fVar3) {
            BigInteger bigInteger = this.f17191x;
            BigInteger bigInteger2 = fVar.toBigInteger();
            BigInteger bigInteger3 = fVar2.toBigInteger();
            BigInteger bigInteger4 = fVar3.toBigInteger();
            return new d(this.f17189q, this.f17190r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.ec.f
        public f negate() {
            if (this.f17191x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f17189q;
            return new d(bigInteger, this.f17190r, bigInteger.subtract(this.f17191x));
        }

        @Override // org.bouncycastle.math.ec.f
        public f sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.f17189q.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f17189q.testBit(1)) {
                BigInteger add = this.f17189q.shiftRight(2).add(org.bouncycastle.math.ec.d.ONE);
                BigInteger bigInteger = this.f17189q;
                return checkSqrt(new d(bigInteger, this.f17190r, this.f17191x.modPow(add, bigInteger)));
            }
            if (this.f17189q.testBit(2)) {
                BigInteger modPow = this.f17191x.modPow(this.f17189q.shiftRight(3), this.f17189q);
                BigInteger modMult = modMult(modPow, this.f17191x);
                if (modMult(modMult, modPow).equals(org.bouncycastle.math.ec.d.ONE)) {
                    return checkSqrt(new d(this.f17189q, this.f17190r, modMult));
                }
                return checkSqrt(new d(this.f17189q, this.f17190r, modMult(modMult, org.bouncycastle.math.ec.d.TWO.modPow(this.f17189q.shiftRight(2), this.f17189q))));
            }
            BigInteger shiftRight = this.f17189q.shiftRight(1);
            BigInteger modPow2 = this.f17191x.modPow(shiftRight, this.f17189q);
            BigInteger bigInteger2 = org.bouncycastle.math.ec.d.ONE;
            if (!modPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.f17191x;
            BigInteger modDouble = modDouble(modDouble(bigInteger3));
            BigInteger add2 = shiftRight.add(bigInteger2);
            BigInteger subtract = this.f17189q.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.f17189q.bitLength(), random);
                if (bigInteger4.compareTo(this.f17189q) < 0 && modReduce(bigInteger4.multiply(bigInteger4).subtract(modDouble)).modPow(shiftRight, this.f17189q).equals(subtract)) {
                    BigInteger[] lucasSequence = lucasSequence(bigInteger4, bigInteger3, add2);
                    BigInteger bigInteger5 = lucasSequence[0];
                    BigInteger bigInteger6 = lucasSequence[1];
                    if (modMult(bigInteger6, bigInteger6).equals(modDouble)) {
                        return new d(this.f17189q, this.f17190r, modHalfAbs(bigInteger6));
                    }
                    if (!bigInteger5.equals(org.bouncycastle.math.ec.d.ONE) && !bigInteger5.equals(subtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // org.bouncycastle.math.ec.f
        public f square() {
            BigInteger bigInteger = this.f17189q;
            BigInteger bigInteger2 = this.f17190r;
            BigInteger bigInteger3 = this.f17191x;
            return new d(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.bouncycastle.math.ec.f
        public f squareMinusProduct(f fVar, f fVar2) {
            BigInteger bigInteger = this.f17191x;
            BigInteger bigInteger2 = fVar.toBigInteger();
            BigInteger bigInteger3 = fVar2.toBigInteger();
            return new d(this.f17189q, this.f17190r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.f
        public f squarePlusProduct(f fVar, f fVar2) {
            BigInteger bigInteger = this.f17191x;
            BigInteger bigInteger2 = fVar.toBigInteger();
            BigInteger bigInteger3 = fVar2.toBigInteger();
            return new d(this.f17189q, this.f17190r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.ec.f
        public f subtract(f fVar) {
            return new d(this.f17189q, this.f17190r, modSubtract(this.f17191x, fVar.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.f
        public BigInteger toBigInteger() {
            return this.f17191x;
        }

        d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f17189q = bigInteger;
            this.f17190r = bigInteger2;
            this.f17191x = bigInteger3;
        }
    }

    public abstract f add(f fVar);

    public abstract f addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract f divide(f fVar);

    public byte[] getEncoded() {
        return org.bouncycastle.util.b.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract f invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract f multiply(f fVar);

    public f multiplyMinusProduct(f fVar, f fVar2, f fVar3) {
        return multiply(fVar).subtract(fVar2.multiply(fVar3));
    }

    public f multiplyPlusProduct(f fVar, f fVar2, f fVar3) {
        return multiply(fVar).add(fVar2.multiply(fVar3));
    }

    public abstract f negate();

    public abstract f sqrt();

    public abstract f square();

    public f squareMinusProduct(f fVar, f fVar2) {
        return square().subtract(fVar.multiply(fVar2));
    }

    public f squarePlusProduct(f fVar, f fVar2) {
        return square().add(fVar.multiply(fVar2));
    }

    public f squarePow(int i8) {
        f fVar = this;
        for (int i9 = 0; i9 < i8; i9++) {
            fVar = fVar.square();
        }
        return fVar;
    }

    public abstract f subtract(f fVar);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }
}
