package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class c0 extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17150x;

    public c0() {
        this.f17150x = b7.g.create();
    }

    private static void RM(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        b0.multiply(iArr5, iArr3, iArr7);
        b0.multiply(iArr7, iArr, iArr7);
        b0.multiply(iArr4, iArr2, iArr6);
        b0.add(iArr6, iArr7, iArr6);
        b0.multiply(iArr4, iArr3, iArr7);
        b7.g.copy(iArr6, iArr4);
        b0.multiply(iArr5, iArr2, iArr5);
        b0.add(iArr5, iArr7, iArr5);
        b0.square(iArr5, iArr6);
        b0.multiply(iArr6, iArr, iArr6);
    }

    private static void RP(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        b7.g.copy(iArr, iArr4);
        int[] create = b7.g.create();
        int[] create2 = b7.g.create();
        for (int i8 = 0; i8 < 7; i8++) {
            b7.g.copy(iArr2, create);
            b7.g.copy(iArr3, create2);
            int i9 = 1 << i8;
            while (true) {
                i9--;
                if (i9 >= 0) {
                    RS(iArr2, iArr3, iArr4, iArr5);
                }
            }
            RM(iArr, create, create2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    private static void RS(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        b0.multiply(iArr2, iArr, iArr2);
        b0.twice(iArr2, iArr2);
        b0.square(iArr, iArr4);
        b0.add(iArr3, iArr4, iArr);
        b0.multiply(iArr3, iArr4, iArr3);
        b0.reduce32(b7.n.shiftUpBits(7, iArr3, 2, 0), iArr3);
    }

    private static boolean isSquare(int[] iArr) {
        int[] create = b7.g.create();
        int[] create2 = b7.g.create();
        b7.g.copy(iArr, create);
        for (int i8 = 0; i8 < 7; i8++) {
            b7.g.copy(create, create2);
            b0.squareN(create, 1 << i8, create);
            b0.multiply(create, create2, create);
        }
        b0.squareN(create, 95, create);
        return b7.g.isOne(create);
    }

    private static boolean trySqrt(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = b7.g.create();
        b7.g.copy(iArr2, create);
        int[] create2 = b7.g.create();
        create2[0] = 1;
        int[] create3 = b7.g.create();
        RP(iArr, create, create2, create3, iArr3);
        int[] create4 = b7.g.create();
        int[] create5 = b7.g.create();
        for (int i8 = 1; i8 < 96; i8++) {
            b7.g.copy(create, create4);
            b7.g.copy(create2, create5);
            RS(create, create2, create3, iArr3);
            if (b7.g.isZero(create)) {
                b0.inv(create5, iArr3);
                b0.multiply(iArr3, create4, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.g.create();
        b0.add(this.f17150x, ((c0) fVar).f17150x, create);
        return new c0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.g.create();
        b0.addOne(this.f17150x, create);
        return new c0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.g.create();
        b0.inv(((c0) fVar).f17150x, create);
        b0.multiply(create, this.f17150x, create);
        return new c0(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return b7.g.eq(this.f17150x, ((c0) obj).f17150x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP224R1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17150x, 0, 7);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.g.create();
        b0.inv(this.f17150x, create);
        return new c0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.g.isOne(this.f17150x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.g.isZero(this.f17150x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.g.create();
        b0.multiply(this.f17150x, ((c0) fVar).f17150x, create);
        return new c0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.g.create();
        b0.negate(this.f17150x, create);
        return new c0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17150x;
        if (b7.g.isZero(iArr) || b7.g.isOne(iArr)) {
            return this;
        }
        int[] create = b7.g.create();
        b0.negate(iArr, create);
        int[] random = b7.c.random(b0.P);
        int[] create2 = b7.g.create();
        if (!isSquare(iArr)) {
            return null;
        }
        while (!trySqrt(create, random, create2)) {
            b0.addOne(random, random);
        }
        b0.square(create2, random);
        if (b7.g.eq(iArr, random)) {
            return new c0(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.g.create();
        b0.square(this.f17150x, create);
        return new c0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.g.create();
        b0.subtract(this.f17150x, ((c0) fVar).f17150x, create);
        return new c0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.g.getBit(this.f17150x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.g.toBigInteger(this.f17150x);
    }

    public c0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f17150x = b0.fromBigInteger(bigInteger);
    }

    protected c0(int[] iArr) {
        this.f17150x = iArr;
    }
}
