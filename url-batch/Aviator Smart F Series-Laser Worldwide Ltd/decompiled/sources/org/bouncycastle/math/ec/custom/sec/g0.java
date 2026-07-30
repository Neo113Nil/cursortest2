package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class g0 extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17155x;

    public g0() {
        this.f17155x = b7.h.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.h.create();
        f0.add(this.f17155x, ((g0) fVar).f17155x, create);
        return new g0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.h.create();
        f0.addOne(this.f17155x, create);
        return new g0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.h.create();
        f0.inv(((g0) fVar).f17155x, create);
        f0.multiply(create, this.f17155x, create);
        return new g0(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return b7.h.eq(this.f17155x, ((g0) obj).f17155x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP256K1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17155x, 0, 8);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.h.create();
        f0.inv(this.f17155x, create);
        return new g0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.h.isOne(this.f17155x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.h.isZero(this.f17155x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.h.create();
        f0.multiply(this.f17155x, ((g0) fVar).f17155x, create);
        return new g0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.h.create();
        f0.negate(this.f17155x, create);
        return new g0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17155x;
        if (b7.h.isZero(iArr) || b7.h.isOne(iArr)) {
            return this;
        }
        int[] create = b7.h.create();
        f0.square(iArr, create);
        f0.multiply(create, iArr, create);
        int[] create2 = b7.h.create();
        f0.square(create, create2);
        f0.multiply(create2, iArr, create2);
        int[] create3 = b7.h.create();
        f0.squareN(create2, 3, create3);
        f0.multiply(create3, create2, create3);
        f0.squareN(create3, 3, create3);
        f0.multiply(create3, create2, create3);
        f0.squareN(create3, 2, create3);
        f0.multiply(create3, create, create3);
        int[] create4 = b7.h.create();
        f0.squareN(create3, 11, create4);
        f0.multiply(create4, create3, create4);
        f0.squareN(create4, 22, create3);
        f0.multiply(create3, create4, create3);
        int[] create5 = b7.h.create();
        f0.squareN(create3, 44, create5);
        f0.multiply(create5, create3, create5);
        int[] create6 = b7.h.create();
        f0.squareN(create5, 88, create6);
        f0.multiply(create6, create5, create6);
        f0.squareN(create6, 44, create5);
        f0.multiply(create5, create3, create5);
        f0.squareN(create5, 3, create3);
        f0.multiply(create3, create2, create3);
        f0.squareN(create3, 23, create3);
        f0.multiply(create3, create4, create3);
        f0.squareN(create3, 6, create3);
        f0.multiply(create3, create, create3);
        f0.squareN(create3, 2, create3);
        f0.square(create3, create);
        if (b7.h.eq(iArr, create)) {
            return new g0(create3);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.h.create();
        f0.square(this.f17155x, create);
        return new g0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.h.create();
        f0.subtract(this.f17155x, ((g0) fVar).f17155x, create);
        return new g0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.h.getBit(this.f17155x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.h.toBigInteger(this.f17155x);
    }

    public g0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f17155x = f0.fromBigInteger(bigInteger);
    }

    protected g0(int[] iArr) {
        this.f17155x = iArr;
    }
}
