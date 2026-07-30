package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class c extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17149x;

    public c() {
        this.f17149x = b7.d.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.d.create();
        b.add(this.f17149x, ((c) fVar).f17149x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.d.create();
        b.addOne(this.f17149x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.d.create();
        b.inv(((c) fVar).f17149x, create);
        b.multiply(create, this.f17149x, create);
        return new c(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return b7.d.eq(this.f17149x, ((c) obj).f17149x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP128R1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17149x, 0, 4);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.d.create();
        b.inv(this.f17149x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.d.isOne(this.f17149x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.d.isZero(this.f17149x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.d.create();
        b.multiply(this.f17149x, ((c) fVar).f17149x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.d.create();
        b.negate(this.f17149x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17149x;
        if (b7.d.isZero(iArr) || b7.d.isOne(iArr)) {
            return this;
        }
        int[] create = b7.d.create();
        b.square(iArr, create);
        b.multiply(create, iArr, create);
        int[] create2 = b7.d.create();
        b.squareN(create, 2, create2);
        b.multiply(create2, create, create2);
        int[] create3 = b7.d.create();
        b.squareN(create2, 4, create3);
        b.multiply(create3, create2, create3);
        b.squareN(create3, 2, create2);
        b.multiply(create2, create, create2);
        b.squareN(create2, 10, create);
        b.multiply(create, create2, create);
        b.squareN(create, 10, create3);
        b.multiply(create3, create2, create3);
        b.square(create3, create2);
        b.multiply(create2, iArr, create2);
        b.squareN(create2, 95, create2);
        b.square(create2, create3);
        if (b7.d.eq(iArr, create3)) {
            return new c(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.d.create();
        b.square(this.f17149x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.d.create();
        b.subtract(this.f17149x, ((c) fVar).f17149x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.d.getBit(this.f17149x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.d.toBigInteger(this.f17149x);
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f17149x = b.fromBigInteger(bigInteger);
    }

    protected c(int[] iArr) {
        this.f17149x = iArr;
    }
}
