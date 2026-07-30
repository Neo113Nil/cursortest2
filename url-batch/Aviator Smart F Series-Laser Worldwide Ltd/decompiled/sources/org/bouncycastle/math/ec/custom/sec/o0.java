package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class o0 extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17165x;

    public o0() {
        this.f17165x = b7.n.create(12);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.n.create(12);
        n0.add(this.f17165x, ((o0) fVar).f17165x, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.n.create(12);
        n0.addOne(this.f17165x, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.n.create(12);
        n0.inv(((o0) fVar).f17165x, create);
        n0.multiply(create, this.f17165x, create);
        return new o0(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            return b7.n.eq(12, this.f17165x, ((o0) obj).f17165x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP384R1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17165x, 0, 12);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.n.create(12);
        n0.inv(this.f17165x, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.n.isOne(12, this.f17165x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.n.isZero(12, this.f17165x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.n.create(12);
        n0.multiply(this.f17165x, ((o0) fVar).f17165x, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.n.create(12);
        n0.negate(this.f17165x, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17165x;
        if (b7.n.isZero(12, iArr) || b7.n.isOne(12, iArr)) {
            return this;
        }
        int[] create = b7.n.create(12);
        int[] create2 = b7.n.create(12);
        int[] create3 = b7.n.create(12);
        int[] create4 = b7.n.create(12);
        n0.square(iArr, create);
        n0.multiply(create, iArr, create);
        n0.squareN(create, 2, create2);
        n0.multiply(create2, create, create2);
        n0.square(create2, create2);
        n0.multiply(create2, iArr, create2);
        n0.squareN(create2, 5, create3);
        n0.multiply(create3, create2, create3);
        n0.squareN(create3, 5, create4);
        n0.multiply(create4, create2, create4);
        n0.squareN(create4, 15, create2);
        n0.multiply(create2, create4, create2);
        n0.squareN(create2, 2, create3);
        n0.multiply(create, create3, create);
        n0.squareN(create3, 28, create3);
        n0.multiply(create2, create3, create2);
        n0.squareN(create2, 60, create3);
        n0.multiply(create3, create2, create3);
        n0.squareN(create3, 120, create2);
        n0.multiply(create2, create3, create2);
        n0.squareN(create2, 15, create2);
        n0.multiply(create2, create4, create2);
        n0.squareN(create2, 33, create2);
        n0.multiply(create2, create, create2);
        n0.squareN(create2, 64, create2);
        n0.multiply(create2, iArr, create2);
        n0.squareN(create2, 30, create);
        n0.square(create, create2);
        if (b7.n.eq(12, iArr, create2)) {
            return new o0(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.n.create(12);
        n0.square(this.f17165x, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.n.create(12);
        n0.subtract(this.f17165x, ((o0) fVar).f17165x, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.n.getBit(this.f17165x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.n.toBigInteger(12, this.f17165x);
    }

    public o0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f17165x = n0.fromBigInteger(bigInteger);
    }

    protected o0(int[] iArr) {
        this.f17165x = iArr;
    }
}
