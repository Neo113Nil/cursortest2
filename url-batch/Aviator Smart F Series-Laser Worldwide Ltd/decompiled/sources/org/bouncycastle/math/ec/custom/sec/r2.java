package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class r2 extends f.a {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f17169x;

    public r2() {
        this.f17169x = b7.m.create64();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.m.create64();
        q2.add(this.f17169x, ((r2) fVar).f17169x, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        long[] create64 = b7.m.create64();
        q2.addOne(this.f17169x, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        return multiply(fVar.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r2) {
            return b7.m.eq64(this.f17169x, ((r2) obj).f17169x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecT571Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return 571;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 5;
    }

    public int getK3() {
        return 10;
    }

    public int getM() {
        return 571;
    }

    public int getRepresentation() {
        return 3;
    }

    @Override // org.bouncycastle.math.ec.f.a
    public org.bouncycastle.math.ec.f halfTrace() {
        long[] create64 = b7.m.create64();
        q2.halfTrace(this.f17169x, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.f17169x, 0, 9) ^ 5711052;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        long[] create64 = b7.m.create64();
        q2.invert(this.f17169x, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.m.isOne64(this.f17169x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.m.isZero64(this.f17169x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.m.create64();
        q2.multiply(this.f17169x, ((r2) fVar).f17169x, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        return multiplyPlusProduct(fVar, fVar2, fVar3);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyPlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        long[] jArr = this.f17169x;
        long[] jArr2 = ((r2) fVar).f17169x;
        long[] jArr3 = ((r2) fVar2).f17169x;
        long[] jArr4 = ((r2) fVar3).f17169x;
        long[] createExt64 = b7.m.createExt64();
        q2.multiplyAddToExt(jArr, jArr2, createExt64);
        q2.multiplyAddToExt(jArr3, jArr4, createExt64);
        long[] create64 = b7.m.create64();
        q2.reduce(createExt64, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        long[] create64 = b7.m.create64();
        q2.sqrt(this.f17169x, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        long[] create64 = b7.m.create64();
        q2.square(this.f17169x, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squareMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return squarePlusProduct(fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        long[] jArr = this.f17169x;
        long[] jArr2 = ((r2) fVar).f17169x;
        long[] jArr3 = ((r2) fVar2).f17169x;
        long[] createExt64 = b7.m.createExt64();
        q2.squareAddToExt(jArr, createExt64);
        q2.multiplyAddToExt(jArr2, jArr3, createExt64);
        long[] create64 = b7.m.create64();
        q2.reduce(createExt64, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePow(int i8) {
        if (i8 < 1) {
            return this;
        }
        long[] create64 = b7.m.create64();
        q2.squareN(this.f17169x, i8, create64);
        return new r2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        return add(fVar);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return (this.f17169x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.m.toBigInteger64(this.f17169x);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public int trace() {
        return q2.trace(this.f17169x);
    }

    public r2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f17169x = q2.fromBigInteger(bigInteger);
    }

    protected r2(long[] jArr) {
        this.f17169x = jArr;
    }
}
