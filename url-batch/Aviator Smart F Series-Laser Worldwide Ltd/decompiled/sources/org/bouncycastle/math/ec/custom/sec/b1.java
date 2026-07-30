package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class b1 extends f.a {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f17147x;

    public b1() {
        this.f17147x = b7.f.create64();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.f.create64();
        a1.add(this.f17147x, ((b1) fVar).f17147x, create64);
        return new b1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        long[] create64 = b7.f.create64();
        a1.addOne(this.f17147x, create64);
        return new b1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        return multiply(fVar.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            return b7.f.eq64(this.f17147x, ((b1) obj).f17147x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecT131Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return 131;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 3;
    }

    public int getK3() {
        return 8;
    }

    public int getM() {
        return 131;
    }

    public int getRepresentation() {
        return 3;
    }

    @Override // org.bouncycastle.math.ec.f.a
    public org.bouncycastle.math.ec.f halfTrace() {
        long[] create64 = b7.f.create64();
        a1.halfTrace(this.f17147x, create64);
        return new b1(create64);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.f17147x, 0, 3) ^ 131832;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        long[] create64 = b7.f.create64();
        a1.invert(this.f17147x, create64);
        return new b1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.f.isOne64(this.f17147x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.f.isZero64(this.f17147x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.f.create64();
        a1.multiply(this.f17147x, ((b1) fVar).f17147x, create64);
        return new b1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        return multiplyPlusProduct(fVar, fVar2, fVar3);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyPlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        long[] jArr = this.f17147x;
        long[] jArr2 = ((b1) fVar).f17147x;
        long[] jArr3 = ((b1) fVar2).f17147x;
        long[] jArr4 = ((b1) fVar3).f17147x;
        long[] create64 = b7.n.create64(5);
        a1.multiplyAddToExt(jArr, jArr2, create64);
        a1.multiplyAddToExt(jArr3, jArr4, create64);
        long[] create642 = b7.f.create64();
        a1.reduce(create64, create642);
        return new b1(create642);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        long[] create64 = b7.f.create64();
        a1.sqrt(this.f17147x, create64);
        return new b1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        long[] create64 = b7.f.create64();
        a1.square(this.f17147x, create64);
        return new b1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squareMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return squarePlusProduct(fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        long[] jArr = this.f17147x;
        long[] jArr2 = ((b1) fVar).f17147x;
        long[] jArr3 = ((b1) fVar2).f17147x;
        long[] create64 = b7.n.create64(5);
        a1.squareAddToExt(jArr, create64);
        a1.multiplyAddToExt(jArr2, jArr3, create64);
        long[] create642 = b7.f.create64();
        a1.reduce(create64, create642);
        return new b1(create642);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePow(int i8) {
        if (i8 < 1) {
            return this;
        }
        long[] create64 = b7.f.create64();
        a1.squareN(this.f17147x, i8, create64);
        return new b1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        return add(fVar);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return (this.f17147x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.f.toBigInteger64(this.f17147x);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public int trace() {
        return a1.trace(this.f17147x);
    }

    public b1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f17147x = a1.fromBigInteger(bigInteger);
    }

    protected b1(long[] jArr) {
        this.f17147x = jArr;
    }
}
