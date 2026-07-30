package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class i extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17157x;

    public i() {
        this.f17157x = b7.e.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.e.create();
        h.add(this.f17157x, ((i) fVar).f17157x, create);
        return new i(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.e.create();
        h.addOne(this.f17157x, create);
        return new i(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.e.create();
        h.inv(((i) fVar).f17157x, create);
        h.multiply(create, this.f17157x, create);
        return new i(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return b7.e.eq(this.f17157x, ((i) obj).f17157x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP160R1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17157x, 0, 5);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.e.create();
        h.inv(this.f17157x, create);
        return new i(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.e.isOne(this.f17157x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.e.isZero(this.f17157x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.e.create();
        h.multiply(this.f17157x, ((i) fVar).f17157x, create);
        return new i(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.e.create();
        h.negate(this.f17157x, create);
        return new i(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17157x;
        if (b7.e.isZero(iArr) || b7.e.isOne(iArr)) {
            return this;
        }
        int[] create = b7.e.create();
        h.square(iArr, create);
        h.multiply(create, iArr, create);
        int[] create2 = b7.e.create();
        h.squareN(create, 2, create2);
        h.multiply(create2, create, create2);
        h.squareN(create2, 4, create);
        h.multiply(create, create2, create);
        h.squareN(create, 8, create2);
        h.multiply(create2, create, create2);
        h.squareN(create2, 16, create);
        h.multiply(create, create2, create);
        h.squareN(create, 32, create2);
        h.multiply(create2, create, create2);
        h.squareN(create2, 64, create);
        h.multiply(create, create2, create);
        h.square(create, create2);
        h.multiply(create2, iArr, create2);
        h.squareN(create2, 29, create2);
        h.square(create2, create);
        if (b7.e.eq(iArr, create)) {
            return new i(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.e.create();
        h.square(this.f17157x, create);
        return new i(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.e.create();
        h.subtract(this.f17157x, ((i) fVar).f17157x, create);
        return new i(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.e.getBit(this.f17157x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.e.toBigInteger(this.f17157x);
    }

    public i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f17157x = h.fromBigInteger(bigInteger);
    }

    protected i(int[] iArr) {
        this.f17157x = iArr;
    }
}
