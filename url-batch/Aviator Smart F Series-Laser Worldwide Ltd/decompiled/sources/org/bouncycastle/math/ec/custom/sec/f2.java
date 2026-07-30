package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class f2 extends f.a {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f17153x;

    public f2() {
        this.f17153x = b7.i.create64();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.i.create64();
        e2.add(this.f17153x, ((f2) fVar).f17153x, create64);
        return new f2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        long[] create64 = b7.i.create64();
        e2.addOne(this.f17153x, create64);
        return new f2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        return multiply(fVar.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            return b7.i.eq64(this.f17153x, ((f2) obj).f17153x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecT283Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return 283;
    }

    public int getK1() {
        return 5;
    }

    public int getK2() {
        return 7;
    }

    public int getK3() {
        return 12;
    }

    public int getM() {
        return 283;
    }

    public int getRepresentation() {
        return 3;
    }

    @Override // org.bouncycastle.math.ec.f.a
    public org.bouncycastle.math.ec.f halfTrace() {
        long[] create64 = b7.i.create64();
        e2.halfTrace(this.f17153x, create64);
        return new f2(create64);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.f17153x, 0, 5) ^ 2831275;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        long[] create64 = b7.i.create64();
        e2.invert(this.f17153x, create64);
        return new f2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.i.isOne64(this.f17153x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.i.isZero64(this.f17153x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.i.create64();
        e2.multiply(this.f17153x, ((f2) fVar).f17153x, create64);
        return new f2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        return multiplyPlusProduct(fVar, fVar2, fVar3);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyPlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        long[] jArr = this.f17153x;
        long[] jArr2 = ((f2) fVar).f17153x;
        long[] jArr3 = ((f2) fVar2).f17153x;
        long[] jArr4 = ((f2) fVar3).f17153x;
        long[] create64 = b7.n.create64(9);
        e2.multiplyAddToExt(jArr, jArr2, create64);
        e2.multiplyAddToExt(jArr3, jArr4, create64);
        long[] create642 = b7.i.create64();
        e2.reduce(create64, create642);
        return new f2(create642);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        long[] create64 = b7.i.create64();
        e2.sqrt(this.f17153x, create64);
        return new f2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        long[] create64 = b7.i.create64();
        e2.square(this.f17153x, create64);
        return new f2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squareMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return squarePlusProduct(fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        long[] jArr = this.f17153x;
        long[] jArr2 = ((f2) fVar).f17153x;
        long[] jArr3 = ((f2) fVar2).f17153x;
        long[] create64 = b7.n.create64(9);
        e2.squareAddToExt(jArr, create64);
        e2.multiplyAddToExt(jArr2, jArr3, create64);
        long[] create642 = b7.i.create64();
        e2.reduce(create64, create642);
        return new f2(create642);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePow(int i8) {
        if (i8 < 1) {
            return this;
        }
        long[] create64 = b7.i.create64();
        e2.squareN(this.f17153x, i8, create64);
        return new f2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        return add(fVar);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return (this.f17153x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.i.toBigInteger64(this.f17153x);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public int trace() {
        return e2.trace(this.f17153x);
    }

    public f2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f17153x = e2.fromBigInteger(bigInteger);
    }

    protected f2(long[] jArr) {
        this.f17153x = jArr;
    }
}
