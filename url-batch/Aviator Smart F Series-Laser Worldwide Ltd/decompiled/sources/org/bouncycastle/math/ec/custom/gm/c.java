package org.bouncycastle.math.ec.custom.gm;

import b7.h;
import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class c extends f.b {
    public static final BigInteger Q = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f17144x;

    public c() {
        this.f17144x = h.create();
    }

    @Override // org.bouncycastle.math.ec.f
    public f add(f fVar) {
        int[] create = h.create();
        b.add(this.f17144x, ((c) fVar).f17144x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public f addOne() {
        int[] create = h.create();
        b.addOne(this.f17144x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public f divide(f fVar) {
        int[] create = h.create();
        b.inv(((c) fVar).f17144x, create);
        b.multiply(create, this.f17144x, create);
        return new c(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return h.eq(this.f17144x, ((c) obj).f17144x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SM2P256V1Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.a.hashCode(this.f17144x, 0, 8);
    }

    @Override // org.bouncycastle.math.ec.f
    public f invert() {
        int[] create = h.create();
        b.inv(this.f17144x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return h.isOne(this.f17144x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return h.isZero(this.f17144x);
    }

    @Override // org.bouncycastle.math.ec.f
    public f multiply(f fVar) {
        int[] create = h.create();
        b.multiply(this.f17144x, ((c) fVar).f17144x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public f negate() {
        int[] create = h.create();
        b.negate(this.f17144x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public f sqrt() {
        int[] iArr = this.f17144x;
        if (h.isZero(iArr) || h.isOne(iArr)) {
            return this;
        }
        int[] create = h.create();
        b.square(iArr, create);
        b.multiply(create, iArr, create);
        int[] create2 = h.create();
        b.squareN(create, 2, create2);
        b.multiply(create2, create, create2);
        int[] create3 = h.create();
        b.squareN(create2, 2, create3);
        b.multiply(create3, create, create3);
        b.squareN(create3, 6, create);
        b.multiply(create, create3, create);
        int[] create4 = h.create();
        b.squareN(create, 12, create4);
        b.multiply(create4, create, create4);
        b.squareN(create4, 6, create);
        b.multiply(create, create3, create);
        b.square(create, create3);
        b.multiply(create3, iArr, create3);
        b.squareN(create3, 31, create4);
        b.multiply(create4, create3, create);
        b.squareN(create4, 32, create4);
        b.multiply(create4, create, create4);
        b.squareN(create4, 62, create4);
        b.multiply(create4, create, create4);
        b.squareN(create4, 4, create4);
        b.multiply(create4, create2, create4);
        b.squareN(create4, 32, create4);
        b.multiply(create4, iArr, create4);
        b.squareN(create4, 62, create4);
        b.square(create4, create2);
        if (h.eq(iArr, create2)) {
            return new c(create4);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.f
    public f square() {
        int[] create = h.create();
        b.square(this.f17144x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public f subtract(f fVar) {
        int[] create = h.create();
        b.subtract(this.f17144x, ((c) fVar).f17144x, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return h.getBit(this.f17144x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return h.toBigInteger(this.f17144x);
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f17144x = b.fromBigInteger(bigInteger);
    }

    protected c(int[] iArr) {
        this.f17144x = iArr;
    }
}
