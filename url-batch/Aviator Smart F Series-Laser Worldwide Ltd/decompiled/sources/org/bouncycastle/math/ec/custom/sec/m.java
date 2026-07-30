package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class m extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17162x;

    public m() {
        this.f17162x = b7.e.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.e.create();
        l.add(this.f17162x, ((m) fVar).f17162x, create);
        return new m(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.e.create();
        l.addOne(this.f17162x, create);
        return new m(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.e.create();
        l.inv(((m) fVar).f17162x, create);
        l.multiply(create, this.f17162x, create);
        return new m(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return b7.e.eq(this.f17162x, ((m) obj).f17162x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP160R2Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17162x, 0, 5);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.e.create();
        l.inv(this.f17162x, create);
        return new m(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.e.isOne(this.f17162x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.e.isZero(this.f17162x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.e.create();
        l.multiply(this.f17162x, ((m) fVar).f17162x, create);
        return new m(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.e.create();
        l.negate(this.f17162x, create);
        return new m(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17162x;
        if (b7.e.isZero(iArr) || b7.e.isOne(iArr)) {
            return this;
        }
        int[] create = b7.e.create();
        l.square(iArr, create);
        l.multiply(create, iArr, create);
        int[] create2 = b7.e.create();
        l.square(create, create2);
        l.multiply(create2, iArr, create2);
        int[] create3 = b7.e.create();
        l.square(create2, create3);
        l.multiply(create3, iArr, create3);
        int[] create4 = b7.e.create();
        l.squareN(create3, 3, create4);
        l.multiply(create4, create2, create4);
        l.squareN(create4, 7, create3);
        l.multiply(create3, create4, create3);
        l.squareN(create3, 3, create4);
        l.multiply(create4, create2, create4);
        int[] create5 = b7.e.create();
        l.squareN(create4, 14, create5);
        l.multiply(create5, create3, create5);
        l.squareN(create5, 31, create3);
        l.multiply(create3, create5, create3);
        l.squareN(create3, 62, create5);
        l.multiply(create5, create3, create5);
        l.squareN(create5, 3, create3);
        l.multiply(create3, create2, create3);
        l.squareN(create3, 18, create3);
        l.multiply(create3, create4, create3);
        l.squareN(create3, 2, create3);
        l.multiply(create3, iArr, create3);
        l.squareN(create3, 3, create3);
        l.multiply(create3, create, create3);
        l.squareN(create3, 6, create3);
        l.multiply(create3, create2, create3);
        l.squareN(create3, 2, create3);
        l.multiply(create3, iArr, create3);
        l.square(create3, create);
        if (b7.e.eq(iArr, create)) {
            return new m(create3);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.e.create();
        l.square(this.f17162x, create);
        return new m(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.e.create();
        l.subtract(this.f17162x, ((m) fVar).f17162x, create);
        return new m(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.e.getBit(this.f17162x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.e.toBigInteger(this.f17162x);
    }

    public m(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f17162x = l.fromBigInteger(bigInteger);
    }

    protected m(int[] iArr) {
        this.f17162x = iArr;
    }
}
