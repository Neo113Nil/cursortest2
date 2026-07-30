package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class q extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17167x;

    public q() {
        this.f17167x = b7.f.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.f.create();
        p.add(this.f17167x, ((q) fVar).f17167x, create);
        return new q(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.f.create();
        p.addOne(this.f17167x, create);
        return new q(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.f.create();
        p.inv(((q) fVar).f17167x, create);
        p.multiply(create, this.f17167x, create);
        return new q(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return b7.f.eq(this.f17167x, ((q) obj).f17167x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP192K1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17167x, 0, 6);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.f.create();
        p.inv(this.f17167x, create);
        return new q(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.f.isOne(this.f17167x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.f.isZero(this.f17167x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.f.create();
        p.multiply(this.f17167x, ((q) fVar).f17167x, create);
        return new q(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.f.create();
        p.negate(this.f17167x, create);
        return new q(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17167x;
        if (b7.f.isZero(iArr) || b7.f.isOne(iArr)) {
            return this;
        }
        int[] create = b7.f.create();
        p.square(iArr, create);
        p.multiply(create, iArr, create);
        int[] create2 = b7.f.create();
        p.square(create, create2);
        p.multiply(create2, iArr, create2);
        int[] create3 = b7.f.create();
        p.squareN(create2, 3, create3);
        p.multiply(create3, create2, create3);
        p.squareN(create3, 2, create3);
        p.multiply(create3, create, create3);
        p.squareN(create3, 8, create);
        p.multiply(create, create3, create);
        p.squareN(create, 3, create3);
        p.multiply(create3, create2, create3);
        int[] create4 = b7.f.create();
        p.squareN(create3, 16, create4);
        p.multiply(create4, create, create4);
        p.squareN(create4, 35, create);
        p.multiply(create, create4, create);
        p.squareN(create, 70, create4);
        p.multiply(create4, create, create4);
        p.squareN(create4, 19, create);
        p.multiply(create, create3, create);
        p.squareN(create, 20, create);
        p.multiply(create, create3, create);
        p.squareN(create, 4, create);
        p.multiply(create, create2, create);
        p.squareN(create, 6, create);
        p.multiply(create, create2, create);
        p.square(create, create);
        p.square(create, create2);
        if (b7.f.eq(iArr, create2)) {
            return new q(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.f.create();
        p.square(this.f17167x, create);
        return new q(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.f.create();
        p.subtract(this.f17167x, ((q) fVar).f17167x, create);
        return new q(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.f.getBit(this.f17167x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.f.toBigInteger(this.f17167x);
    }

    public q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f17167x = p.fromBigInteger(bigInteger);
    }

    protected q(int[] iArr) {
        this.f17167x = iArr;
    }
}
