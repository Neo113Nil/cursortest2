package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class p1 extends f.a {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f17166x;

    public p1() {
        this.f17166x = b7.h.create64();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.h.create64();
        o1.add(this.f17166x, ((p1) fVar).f17166x, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        long[] create64 = b7.h.create64();
        o1.addOne(this.f17166x, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        return multiply(fVar.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            return b7.h.eq64(this.f17166x, ((p1) obj).f17166x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecT193Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return 193;
    }

    public int getK1() {
        return 15;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 193;
    }

    public int getRepresentation() {
        return 2;
    }

    @Override // org.bouncycastle.math.ec.f.a
    public org.bouncycastle.math.ec.f halfTrace() {
        long[] create64 = b7.h.create64();
        o1.halfTrace(this.f17166x, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.f17166x, 0, 4) ^ 1930015;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        long[] create64 = b7.h.create64();
        o1.invert(this.f17166x, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.h.isOne64(this.f17166x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.h.isZero64(this.f17166x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.h.create64();
        o1.multiply(this.f17166x, ((p1) fVar).f17166x, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        return multiplyPlusProduct(fVar, fVar2, fVar3);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyPlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        long[] jArr = this.f17166x;
        long[] jArr2 = ((p1) fVar).f17166x;
        long[] jArr3 = ((p1) fVar2).f17166x;
        long[] jArr4 = ((p1) fVar3).f17166x;
        long[] createExt64 = b7.h.createExt64();
        o1.multiplyAddToExt(jArr, jArr2, createExt64);
        o1.multiplyAddToExt(jArr3, jArr4, createExt64);
        long[] create64 = b7.h.create64();
        o1.reduce(createExt64, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        long[] create64 = b7.h.create64();
        o1.sqrt(this.f17166x, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        long[] create64 = b7.h.create64();
        o1.square(this.f17166x, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squareMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return squarePlusProduct(fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        long[] jArr = this.f17166x;
        long[] jArr2 = ((p1) fVar).f17166x;
        long[] jArr3 = ((p1) fVar2).f17166x;
        long[] createExt64 = b7.h.createExt64();
        o1.squareAddToExt(jArr, createExt64);
        o1.multiplyAddToExt(jArr2, jArr3, createExt64);
        long[] create64 = b7.h.create64();
        o1.reduce(createExt64, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePow(int i8) {
        if (i8 < 1) {
            return this;
        }
        long[] create64 = b7.h.create64();
        o1.squareN(this.f17166x, i8, create64);
        return new p1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        return add(fVar);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return (this.f17166x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.h.toBigInteger64(this.f17166x);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public int trace() {
        return o1.trace(this.f17166x);
    }

    public p1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f17166x = o1.fromBigInteger(bigInteger);
    }

    protected p1(long[] jArr) {
        this.f17166x = jArr;
    }
}
