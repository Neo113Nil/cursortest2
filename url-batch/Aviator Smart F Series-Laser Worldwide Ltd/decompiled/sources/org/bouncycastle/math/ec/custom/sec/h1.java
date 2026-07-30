package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public class h1 extends f.a {

    /* renamed from: x, reason: collision with root package name */
    protected long[] f17156x;

    public h1() {
        this.f17156x = b7.f.create64();
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f add(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.f.create64();
        g1.add(this.f17156x, ((h1) fVar).f17156x, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f addOne() {
        long[] create64 = b7.f.create64();
        g1.addOne(this.f17156x, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f divide(org.bouncycastle.math.ec.f fVar) {
        return multiply(fVar.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            return b7.f.eq64(this.f17156x, ((h1) obj).f17156x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.f
    public String getFieldName() {
        return "SecT163Field";
    }

    @Override // org.bouncycastle.math.ec.f
    public int getFieldSize() {
        return 163;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }

    public int getM() {
        return 163;
    }

    public int getRepresentation() {
        return 3;
    }

    @Override // org.bouncycastle.math.ec.f.a
    public org.bouncycastle.math.ec.f halfTrace() {
        long[] create64 = b7.f.create64();
        g1.halfTrace(this.f17156x, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.f17156x, 0, 3) ^ 163763;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f invert() {
        long[] create64 = b7.f.create64();
        g1.invert(this.f17156x, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isOne() {
        return b7.f.isOne64(this.f17156x);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean isZero() {
        return b7.f.isZero64(this.f17156x);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiply(org.bouncycastle.math.ec.f fVar) {
        long[] create64 = b7.f.create64();
        g1.multiply(this.f17156x, ((h1) fVar).f17156x, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        return multiplyPlusProduct(fVar, fVar2, fVar3);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f multiplyPlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3) {
        long[] jArr = this.f17156x;
        long[] jArr2 = ((h1) fVar).f17156x;
        long[] jArr3 = ((h1) fVar2).f17156x;
        long[] jArr4 = ((h1) fVar3).f17156x;
        long[] createExt64 = b7.f.createExt64();
        g1.multiplyAddToExt(jArr, jArr2, createExt64);
        g1.multiplyAddToExt(jArr3, jArr4, createExt64);
        long[] create64 = b7.f.create64();
        g1.reduce(createExt64, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f negate() {
        return this;
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f sqrt() {
        long[] create64 = b7.f.create64();
        g1.sqrt(this.f17156x, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f square() {
        long[] create64 = b7.f.create64();
        g1.square(this.f17156x, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squareMinusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return squarePlusProduct(fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePlusProduct(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        long[] jArr = this.f17156x;
        long[] jArr2 = ((h1) fVar).f17156x;
        long[] jArr3 = ((h1) fVar2).f17156x;
        long[] createExt64 = b7.f.createExt64();
        g1.squareAddToExt(jArr, createExt64);
        g1.multiplyAddToExt(jArr2, jArr3, createExt64);
        long[] create64 = b7.f.create64();
        g1.reduce(createExt64, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f squarePow(int i8) {
        if (i8 < 1) {
            return this;
        }
        long[] create64 = b7.f.create64();
        g1.squareN(this.f17156x, i8, create64);
        return new h1(create64);
    }

    @Override // org.bouncycastle.math.ec.f
    public org.bouncycastle.math.ec.f subtract(org.bouncycastle.math.ec.f fVar) {
        return add(fVar);
    }

    @Override // org.bouncycastle.math.ec.f
    public boolean testBitZero() {
        return (this.f17156x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.f
    public BigInteger toBigInteger() {
        return b7.f.toBigInteger64(this.f17156x);
    }

    @Override // org.bouncycastle.math.ec.f.a
    public int trace() {
        return g1.trace(this.f17156x);
    }

    public h1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f17156x = g1.fromBigInteger(bigInteger);
    }

    protected h1(long[] jArr) {
        this.f17156x = jArr;
    }
}
