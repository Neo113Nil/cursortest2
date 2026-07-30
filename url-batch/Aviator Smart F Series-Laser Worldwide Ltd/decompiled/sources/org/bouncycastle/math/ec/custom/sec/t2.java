package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class t2 extends i.b {
    t2(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i add(org.bouncycastle.math.ec.i iVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        r2 r2Var;
        r2 r2Var2;
        r2 r2Var3;
        if (isInfinity()) {
            return iVar;
        }
        if (iVar.isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.e curve = getCurve();
        r2 r2Var4 = (r2) this.f17192x;
        r2 r2Var5 = (r2) iVar.getRawXCoord();
        if (r2Var4.isZero()) {
            return r2Var5.isZero() ? curve.getInfinity() : iVar.add(this);
        }
        r2 r2Var6 = (r2) this.f17193y;
        r2 r2Var7 = (r2) this.zs[0];
        r2 r2Var8 = (r2) iVar.getRawYCoord();
        r2 r2Var9 = (r2) iVar.getZCoord(0);
        long[] create64 = b7.m.create64();
        long[] create642 = b7.m.create64();
        long[] create643 = b7.m.create64();
        long[] create644 = b7.m.create64();
        long[] precompMultiplicand = r2Var7.isOne() ? null : q2.precompMultiplicand(r2Var7.f17169x);
        if (precompMultiplicand == null) {
            jArr = r2Var5.f17169x;
            jArr2 = r2Var8.f17169x;
        } else {
            q2.multiplyPrecomp(r2Var5.f17169x, precompMultiplicand, create642);
            q2.multiplyPrecomp(r2Var8.f17169x, precompMultiplicand, create644);
            jArr = create642;
            jArr2 = create644;
        }
        long[] precompMultiplicand2 = r2Var9.isOne() ? null : q2.precompMultiplicand(r2Var9.f17169x);
        long[] jArr4 = r2Var4.f17169x;
        if (precompMultiplicand2 == null) {
            jArr3 = r2Var6.f17169x;
        } else {
            q2.multiplyPrecomp(jArr4, precompMultiplicand2, create64);
            q2.multiplyPrecomp(r2Var6.f17169x, precompMultiplicand2, create643);
            jArr4 = create64;
            jArr3 = create643;
        }
        q2.add(jArr3, jArr2, create643);
        q2.add(jArr4, jArr, create644);
        if (b7.m.isZero64(create644)) {
            return b7.m.isZero64(create643) ? twice() : curve.getInfinity();
        }
        if (r2Var5.isZero()) {
            org.bouncycastle.math.ec.i normalize = normalize();
            r2 r2Var10 = (r2) normalize.getXCoord();
            org.bouncycastle.math.ec.f yCoord = normalize.getYCoord();
            org.bouncycastle.math.ec.f divide = yCoord.add(r2Var8).divide(r2Var10);
            r2Var = (r2) divide.square().add(divide).add(r2Var10);
            if (r2Var.isZero()) {
                return new t2(curve, r2Var, curve.getB());
            }
            r2Var2 = (r2) divide.multiply(r2Var10.add(r2Var)).add(r2Var).add(yCoord).divide(r2Var).add(r2Var);
            r2Var3 = (r2) curve.fromBigInteger(org.bouncycastle.math.ec.d.ONE);
        } else {
            q2.square(create644, create644);
            long[] precompMultiplicand3 = q2.precompMultiplicand(create643);
            q2.multiplyPrecomp(jArr4, precompMultiplicand3, create64);
            q2.multiplyPrecomp(jArr, precompMultiplicand3, create642);
            r2 r2Var11 = new r2(create64);
            q2.multiply(create64, create642, r2Var11.f17169x);
            if (r2Var11.isZero()) {
                return new t2(curve, r2Var11, curve.getB());
            }
            r2 r2Var12 = new r2(create643);
            q2.multiplyPrecomp(create644, precompMultiplicand3, r2Var12.f17169x);
            if (precompMultiplicand2 != null) {
                long[] jArr5 = r2Var12.f17169x;
                q2.multiplyPrecomp(jArr5, precompMultiplicand2, jArr5);
            }
            long[] createExt64 = b7.m.createExt64();
            q2.add(create642, create644, create644);
            q2.squareAddToExt(create644, createExt64);
            q2.add(r2Var6.f17169x, r2Var7.f17169x, create644);
            q2.multiplyAddToExt(create644, r2Var12.f17169x, createExt64);
            r2 r2Var13 = new r2(create644);
            q2.reduce(createExt64, r2Var13.f17169x);
            if (precompMultiplicand != null) {
                long[] jArr6 = r2Var12.f17169x;
                q2.multiplyPrecomp(jArr6, precompMultiplicand, jArr6);
            }
            r2Var = r2Var11;
            r2Var2 = r2Var13;
            r2Var3 = r2Var12;
        }
        return new t2(curve, r2Var, r2Var2, new org.bouncycastle.math.ec.f[]{r2Var3});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new t2(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    protected boolean getCompressionYTilde() {
        org.bouncycastle.math.ec.f rawXCoord = getRawXCoord();
        return (rawXCoord.isZero() || getRawYCoord().testBitZero() == rawXCoord.testBitZero()) ? false : true;
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.f getYCoord() {
        org.bouncycastle.math.ec.f fVar = this.f17192x;
        org.bouncycastle.math.ec.f fVar2 = this.f17193y;
        if (isInfinity() || fVar.isZero()) {
            return fVar2;
        }
        org.bouncycastle.math.ec.f multiply = fVar2.add(fVar).multiply(fVar);
        org.bouncycastle.math.ec.f fVar3 = this.zs[0];
        return !fVar3.isOne() ? multiply.divide(fVar3) : multiply;
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        if (isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.f fVar = this.f17192x;
        if (fVar.isZero()) {
            return this;
        }
        org.bouncycastle.math.ec.f fVar2 = this.f17193y;
        org.bouncycastle.math.ec.f fVar3 = this.zs[0];
        return new t2(this.curve, fVar, fVar2.add(fVar3), new org.bouncycastle.math.ec.f[]{fVar3});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twice() {
        if (isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.e curve = getCurve();
        org.bouncycastle.math.ec.f fVar = this.f17192x;
        if (fVar.isZero()) {
            return curve.getInfinity();
        }
        org.bouncycastle.math.ec.f fVar2 = this.f17193y;
        org.bouncycastle.math.ec.f fVar3 = this.zs[0];
        boolean isOne = fVar3.isOne();
        org.bouncycastle.math.ec.f square = isOne ? fVar3 : fVar3.square();
        org.bouncycastle.math.ec.f add = isOne ? fVar2.square().add(fVar2) : fVar2.add(fVar3).multiply(fVar2);
        if (add.isZero()) {
            return new t2(curve, add, curve.getB());
        }
        org.bouncycastle.math.ec.f square2 = add.square();
        org.bouncycastle.math.ec.f multiply = isOne ? add : add.multiply(square);
        org.bouncycastle.math.ec.f square3 = fVar2.add(fVar).square();
        if (!isOne) {
            fVar3 = square.square();
        }
        return new t2(curve, square2, square3.add(add).add(square).multiply(square3).add(fVar3).add(square2).add(multiply), new org.bouncycastle.math.ec.f[]{multiply});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        if (isInfinity()) {
            return iVar;
        }
        if (iVar.isInfinity()) {
            return twice();
        }
        org.bouncycastle.math.ec.e curve = getCurve();
        org.bouncycastle.math.ec.f fVar = this.f17192x;
        if (fVar.isZero()) {
            return iVar;
        }
        org.bouncycastle.math.ec.f rawXCoord = iVar.getRawXCoord();
        org.bouncycastle.math.ec.f zCoord = iVar.getZCoord(0);
        if (rawXCoord.isZero() || !zCoord.isOne()) {
            return twice().add(iVar);
        }
        org.bouncycastle.math.ec.f fVar2 = this.f17193y;
        org.bouncycastle.math.ec.f fVar3 = this.zs[0];
        org.bouncycastle.math.ec.f rawYCoord = iVar.getRawYCoord();
        org.bouncycastle.math.ec.f square = fVar.square();
        org.bouncycastle.math.ec.f square2 = fVar2.square();
        org.bouncycastle.math.ec.f square3 = fVar3.square();
        org.bouncycastle.math.ec.f add = square2.add(fVar2.multiply(fVar3));
        org.bouncycastle.math.ec.f addOne = rawYCoord.addOne();
        org.bouncycastle.math.ec.f multiplyPlusProduct = addOne.multiply(square3).add(square2).multiplyPlusProduct(add, square, square3);
        org.bouncycastle.math.ec.f multiply = rawXCoord.multiply(square3);
        org.bouncycastle.math.ec.f square4 = multiply.add(add).square();
        if (square4.isZero()) {
            return multiplyPlusProduct.isZero() ? iVar.twice() : curve.getInfinity();
        }
        if (multiplyPlusProduct.isZero()) {
            return new t2(curve, multiplyPlusProduct, curve.getB());
        }
        org.bouncycastle.math.ec.f multiply2 = multiplyPlusProduct.square().multiply(multiply);
        org.bouncycastle.math.ec.f multiply3 = multiplyPlusProduct.multiply(square4).multiply(square3);
        return new t2(curve, multiply2, multiplyPlusProduct.add(square4).square().multiplyPlusProduct(add, addOne, multiply3), new org.bouncycastle.math.ec.f[]{multiply3});
    }

    t2(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
