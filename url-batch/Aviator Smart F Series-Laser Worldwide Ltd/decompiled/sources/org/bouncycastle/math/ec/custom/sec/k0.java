package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class k0 extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17160x;

    public k0() {
        this.f17160x = b7.h.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.h.create();
        j0.add(this.f17160x, ((k0) fVar).f17160x, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.h.create();
        j0.addOne(this.f17160x, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.h.create();
        j0.inv(((k0) fVar).f17160x, create);
        j0.multiply(create, this.f17160x, create);
        return new k0(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            return b7.h.eq(this.f17160x, ((k0) obj).f17160x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP256R1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17160x, 0, 8);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.h.create();
        j0.inv(this.f17160x, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.h.isOne(this.f17160x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.h.isZero(this.f17160x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.h.create();
        j0.multiply(this.f17160x, ((k0) fVar).f17160x, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.h.create();
        j0.negate(this.f17160x, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17160x;
        if (b7.h.isZero(iArr) || b7.h.isOne(iArr)) {
            return this;
        }
        int[] create = b7.h.create();
        int[] create2 = b7.h.create();
        j0.square(iArr, create);
        j0.multiply(create, iArr, create);
        j0.squareN(create, 2, create2);
        j0.multiply(create2, create, create2);
        j0.squareN(create2, 4, create);
        j0.multiply(create, create2, create);
        j0.squareN(create, 8, create2);
        j0.multiply(create2, create, create2);
        j0.squareN(create2, 16, create);
        j0.multiply(create, create2, create);
        j0.squareN(create, 32, create);
        j0.multiply(create, iArr, create);
        j0.squareN(create, 96, create);
        j0.multiply(create, iArr, create);
        j0.squareN(create, 94, create);
        j0.square(create, create2);
        if (b7.h.eq(iArr, create2)) {
            return new k0(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.h.create();
        j0.square(this.f17160x, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.h.create();
        j0.subtract(this.f17160x, ((k0) fVar).f17160x, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.h.getBit(this.f17160x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.h.toBigInteger(this.f17160x);
    }

    public k0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f17160x = j0.fromBigInteger(bigInteger);
    }

    protected k0(int[] iArr) {
        this.f17160x = iArr;
    }
}
