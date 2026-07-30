package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class l2 extends f.a {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f17161x;

    public l2() {
        this.f17161x = b7.k.create64();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.k.create64();
        k2.add(this.f17161x, ((l2) fVar).f17161x, create64);
        return new l2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        long[] create64 = b7.k.create64();
        k2.addOne(this.f17161x, create64);
        return new l2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        return multiply(fVar.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            return b7.k.eq64(this.f17161x, ((l2) obj).f17161x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecT409Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return 409;
    }

    public int getK1() {
        return 87;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 409;
    }

    public int getRepresentation() {
        return 2;
    }

    @Override // org.bouncycastle.math.ec.f.a
    public org.bouncycastle.math.ec.f halfTrace() {
        long[] create64 = b7.k.create64();
        k2.halfTrace(this.f17161x, create64);
        return new l2(create64);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.f17161x, 0, 7) ^ 4090087;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        long[] create64 = b7.k.create64();
        k2.invert(this.f17161x, create64);
        return new l2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.k.isOne64(this.f17161x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.k.isZero64(this.f17161x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.k.create64();
        k2.multiply(this.f17161x, ((l2) fVar).f17161x, create64);
        return new l2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        return multiplyPlusProduct(fVar, fVar2, fVar3);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyPlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        long[] jArr = this.f17161x;
        long[] jArr2 = ((l2) fVar).f17161x;
        long[] jArr3 = ((l2) fVar2).f17161x;
        long[] jArr4 = ((l2) fVar3).f17161x;
        long[] create64 = b7.n.create64(13);
        k2.multiplyAddToExt(jArr, jArr2, create64);
        k2.multiplyAddToExt(jArr3, jArr4, create64);
        long[] create642 = b7.k.create64();
        k2.reduce(create64, create642);
        return new l2(create642);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        long[] create64 = b7.k.create64();
        k2.sqrt(this.f17161x, create64);
        return new l2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        long[] create64 = b7.k.create64();
        k2.square(this.f17161x, create64);
        return new l2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squareMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return squarePlusProduct(fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        long[] jArr = this.f17161x;
        long[] jArr2 = ((l2) fVar).f17161x;
        long[] jArr3 = ((l2) fVar2).f17161x;
        long[] create64 = b7.n.create64(13);
        k2.squareAddToExt(jArr, create64);
        k2.multiplyAddToExt(jArr2, jArr3, create64);
        long[] create642 = b7.k.create64();
        k2.reduce(create64, create642);
        return new l2(create642);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePow(int i8) {
        if (i8 < 1) {
            return this;
        }
        long[] create64 = b7.k.create64();
        k2.squareN(this.f17161x, i8, create64);
        return new l2(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        return add(fVar);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return (this.f17161x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.k.toBigInteger64(this.f17161x);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public int trace() {
        return k2.trace(this.f17161x);
    }

    public l2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f17161x = k2.fromBigInteger(bigInteger);
    }

    protected l2(long[] jArr) {
        this.f17161x = jArr;
    }
}
