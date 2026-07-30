package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class v0 extends f.a {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f17173x;

    public v0() {
        this.f17173x = b7.d.create64();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.d.create64();
        u0.add(this.f17173x, ((v0) fVar).f17173x, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        long[] create64 = b7.d.create64();
        u0.addOne(this.f17173x, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        return multiply(fVar.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            return b7.d.eq64(this.f17173x, ((v0) obj).f17173x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecT113Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return 113;
    }

    public int getK1() {
        return 9;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 113;
    }

    public int getRepresentation() {
        return 2;
    }

    @Override // org.bouncycastle.math.ec.f.a
    public org.bouncycastle.math.ec.f halfTrace() {
        long[] create64 = b7.d.create64();
        u0.halfTrace(this.f17173x, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.f17173x, 0, 2) ^ 113009;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        long[] create64 = b7.d.create64();
        u0.invert(this.f17173x, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.d.isOne64(this.f17173x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.d.isZero64(this.f17173x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.d.create64();
        u0.multiply(this.f17173x, ((v0) fVar).f17173x, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        return multiplyPlusProduct(fVar, fVar2, fVar3);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyPlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        long[] jArr = this.f17173x;
        long[] jArr2 = ((v0) fVar).f17173x;
        long[] jArr3 = ((v0) fVar2).f17173x;
        long[] jArr4 = ((v0) fVar3).f17173x;
        long[] createExt64 = b7.d.createExt64();
        u0.multiplyAddToExt(jArr, jArr2, createExt64);
        u0.multiplyAddToExt(jArr3, jArr4, createExt64);
        long[] create64 = b7.d.create64();
        u0.reduce(createExt64, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        long[] create64 = b7.d.create64();
        u0.sqrt(this.f17173x, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        long[] create64 = b7.d.create64();
        u0.square(this.f17173x, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squareMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return squarePlusProduct(fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        long[] jArr = this.f17173x;
        long[] jArr2 = ((v0) fVar).f17173x;
        long[] jArr3 = ((v0) fVar2).f17173x;
        long[] createExt64 = b7.d.createExt64();
        u0.squareAddToExt(jArr, createExt64);
        u0.multiplyAddToExt(jArr2, jArr3, createExt64);
        long[] create64 = b7.d.create64();
        u0.reduce(createExt64, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePow(int i8) {
        if (i8 < 1) {
            return this;
        }
        long[] create64 = b7.d.create64();
        u0.squareN(this.f17173x, i8, create64);
        return new v0(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        return add(fVar);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return (this.f17173x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.d.toBigInteger64(this.f17173x);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public int trace() {
        return u0.trace(this.f17173x);
    }

    public v0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f17173x = u0.fromBigInteger(bigInteger);
    }

    protected v0(long[] jArr) {
        this.f17173x = jArr;
    }
}
