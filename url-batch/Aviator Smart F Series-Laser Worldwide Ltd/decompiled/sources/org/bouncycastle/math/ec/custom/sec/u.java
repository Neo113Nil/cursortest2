package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class u extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17172x;

    public u() {
        this.f17172x = b7.f.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.f.create();
        t.add(this.f17172x, ((u) fVar).f17172x, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.f.create();
        t.addOne(this.f17172x, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.f.create();
        t.inv(((u) fVar).f17172x, create);
        t.multiply(create, this.f17172x, create);
        return new u(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return b7.f.eq(this.f17172x, ((u) obj).f17172x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP192R1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17172x, 0, 6);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.f.create();
        t.inv(this.f17172x, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.f.isOne(this.f17172x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.f.isZero(this.f17172x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.f.create();
        t.multiply(this.f17172x, ((u) fVar).f17172x, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.f.create();
        t.negate(this.f17172x, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17172x;
        if (b7.f.isZero(iArr) || b7.f.isOne(iArr)) {
            return this;
        }
        int[] create = b7.f.create();
        int[] create2 = b7.f.create();
        t.square(iArr, create);
        t.multiply(create, iArr, create);
        t.squareN(create, 2, create2);
        t.multiply(create2, create, create2);
        t.squareN(create2, 4, create);
        t.multiply(create, create2, create);
        t.squareN(create, 8, create2);
        t.multiply(create2, create, create2);
        t.squareN(create2, 16, create);
        t.multiply(create, create2, create);
        t.squareN(create, 32, create2);
        t.multiply(create2, create, create2);
        t.squareN(create2, 64, create);
        t.multiply(create, create2, create);
        t.squareN(create, 62, create);
        t.square(create, create2);
        if (b7.f.eq(iArr, create2)) {
            return new u(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.f.create();
        t.square(this.f17172x, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.f.create();
        t.subtract(this.f17172x, ((u) fVar).f17172x, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.f.getBit(this.f17172x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.f.toBigInteger(this.f17172x);
    }

    public u(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f17172x = t.fromBigInteger(bigInteger);
    }

    protected u(int[] iArr) {
        this.f17172x = iArr;
    }
}
