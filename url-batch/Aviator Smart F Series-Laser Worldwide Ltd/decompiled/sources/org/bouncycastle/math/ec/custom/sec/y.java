package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class y extends f.b {

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17176x;
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    private static final int[] PRECOMP_POW2 = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public y() {
        this.f17176x = b7.g.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.g.create();
        x.add(this.f17176x, ((y) fVar).f17176x, create);
        return new y(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        int[] create = b7.g.create();
        x.addOne(this.f17176x, create);
        return new y(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.g.create();
        x.inv(((y) fVar).f17176x, create);
        x.multiply(create, this.f17176x, create);
        return new y(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return b7.g.eq(this.f17176x, ((y) obj).f17176x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecP224K1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17176x, 0, 7);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        int[] create = b7.g.create();
        x.inv(this.f17176x, create);
        return new y(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.g.isOne(this.f17176x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.g.isZero(this.f17176x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.g.create();
        x.multiply(this.f17176x, ((y) fVar).f17176x, create);
        return new y(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        int[] create = b7.g.create();
        x.negate(this.f17176x, create);
        return new y(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        int[] iArr = this.f17176x;
        if (b7.g.isZero(iArr) || b7.g.isOne(iArr)) {
            return this;
        }
        int[] create = b7.g.create();
        x.square(iArr, create);
        x.multiply(create, iArr, create);
        x.square(create, create);
        x.multiply(create, iArr, create);
        int[] create2 = b7.g.create();
        x.square(create, create2);
        x.multiply(create2, iArr, create2);
        int[] create3 = b7.g.create();
        x.squareN(create2, 4, create3);
        x.multiply(create3, create2, create3);
        int[] create4 = b7.g.create();
        x.squareN(create3, 3, create4);
        x.multiply(create4, create, create4);
        x.squareN(create4, 8, create4);
        x.multiply(create4, create3, create4);
        x.squareN(create4, 4, create3);
        x.multiply(create3, create2, create3);
        x.squareN(create3, 19, create2);
        x.multiply(create2, create4, create2);
        int[] create5 = b7.g.create();
        x.squareN(create2, 42, create5);
        x.multiply(create5, create2, create5);
        x.squareN(create5, 23, create2);
        x.multiply(create2, create3, create2);
        x.squareN(create2, 84, create3);
        x.multiply(create3, create5, create3);
        x.squareN(create3, 20, create3);
        x.multiply(create3, create4, create3);
        x.squareN(create3, 3, create3);
        x.multiply(create3, iArr, create3);
        x.squareN(create3, 2, create3);
        x.multiply(create3, iArr, create3);
        x.squareN(create3, 4, create3);
        x.multiply(create3, create, create3);
        x.square(create3, create3);
        x.square(create3, create5);
        if (b7.g.eq(iArr, create5)) {
            return new y(create3);
        }
        x.multiply(create3, PRECOMP_POW2, create3);
        x.square(create3, create5);
        if (b7.g.eq(iArr, create5)) {
            return new y(create3);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        int[] create = b7.g.create();
        x.square(this.f17176x, create);
        return new y(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        int[] create = b7.g.create();
        x.subtract(this.f17176x, ((y) fVar).f17176x, create);
        return new y(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return b7.g.getBit(this.f17176x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.g.toBigInteger(this.f17176x);
    }

    public y(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f17176x = x.fromBigInteger(bigInteger);
    }

    protected y(int[] iArr) {
        this.f17176x = iArr;
    }
}
