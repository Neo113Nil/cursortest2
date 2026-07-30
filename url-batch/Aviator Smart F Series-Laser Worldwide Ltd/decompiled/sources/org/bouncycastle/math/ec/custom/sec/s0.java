package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class s0 extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17171x;

    public s0() {
        this.f17171x = b7.n.create(17);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.n.create(17);
        r0.add(this.f17171x, ((s0) fVar).f17171x, create);
        return new s0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.n.create(17);
        r0.addOne(this.f17171x, create);
        return new s0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.n.create(17);
        r0.inv(((s0) fVar).f17171x, create);
        r0.multiply(create, this.f17171x, create);
        return new s0(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return b7.n.eq(17, this.f17171x, ((s0) obj).f17171x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP521R1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17171x, 0, 17);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.n.create(17);
        r0.inv(this.f17171x, create);
        return new s0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.n.isOne(17, this.f17171x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.n.isZero(17, this.f17171x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.n.create(17);
        r0.multiply(this.f17171x, ((s0) fVar).f17171x, create);
        return new s0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.n.create(17);
        r0.negate(this.f17171x, create);
        return new s0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17171x;
        if (b7.n.isZero(17, iArr) || b7.n.isOne(17, iArr)) {
            return this;
        }
        int[] create = b7.n.create(17);
        int[] create2 = b7.n.create(17);
        r0.squareN(iArr, 519, create);
        r0.square(create, create2);
        if (b7.n.eq(17, iArr, create2)) {
            return new s0(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.n.create(17);
        r0.square(this.f17171x, create);
        return new s0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.n.create(17);
        r0.subtract(this.f17171x, ((s0) fVar).f17171x, create);
        return new s0(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.n.getBit(this.f17171x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.n.toBigInteger(17, this.f17171x);
    }

    public s0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f17171x = r0.fromBigInteger(bigInteger);
    }

    protected s0(int[] iArr) {
        this.f17171x = iArr;
    }
}
