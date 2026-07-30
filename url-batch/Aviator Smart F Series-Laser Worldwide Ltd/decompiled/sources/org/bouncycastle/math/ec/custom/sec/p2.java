package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class p2 extends i.b {
    p2(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i add(org.bouncycastle.math.ec.i iVar) {
        org.bouncycastle.math.ec.f fVar;
        org.bouncycastle.math.ec.f fVar2;
        org.bouncycastle.math.ec.f fVar3;
        org.bouncycastle.math.ec.f fVar4;
        org.bouncycastle.math.ec.f fVar5;
        org.bouncycastle.math.ec.f fVar6;
        if (isInfinity()) {
            return iVar;
        }
        if (iVar.isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.e curve = getCurve();
        org.bouncycastle.math.ec.f fVar7 = this.f17192x;
        org.bouncycastle.math.ec.f rawXCoord = iVar.getRawXCoord();
        if (fVar7.isZero()) {
            return rawXCoord.isZero() ? curve.getInfinity() : iVar.add(this);
        }
        org.bouncycastle.math.ec.f fVar8 = this.f17193y;
        org.bouncycastle.math.ec.f fVar9 = this.zs[0];
        org.bouncycastle.math.ec.f rawYCoord = iVar.getRawYCoord();
        org.bouncycastle.math.ec.f zCoord = iVar.getZCoord(0);
        boolean isOne = fVar9.isOne();
        if (isOne) {
            fVar = rawXCoord;
            fVar2 = rawYCoord;
        } else {
            fVar = rawXCoord.multiply(fVar9);
            fVar2 = rawYCoord.multiply(fVar9);
        }
        boolean isOne2 = zCoord.isOne();
        if (isOne2) {
            fVar3 = fVar8;
        } else {
            fVar7 = fVar7.multiply(zCoord);
            fVar3 = fVar8.multiply(zCoord);
        }
        org.bouncycastle.math.ec.f add = fVar3.add(fVar2);
        org.bouncycastle.math.ec.f add2 = fVar7.add(fVar);
        if (add2.isZero()) {
            return add.isZero() ? twice() : curve.getInfinity();
        }
        if (rawXCoord.isZero()) {
            org.bouncycastle.math.ec.i normalize = normalize();
            org.bouncycastle.math.ec.f xCoord = normalize.getXCoord();
            org.bouncycastle.math.ec.f yCoord = normalize.getYCoord();
            org.bouncycastle.math.ec.f divide = yCoord.add(rawYCoord).divide(xCoord);
            fVar4 = divide.square().add(divide).add(xCoord).addOne();
            if (fVar4.isZero()) {
                return new p2(curve, fVar4, curve.getB().sqrt());
            }
            fVar6 = divide.multiply(xCoord.add(fVar4)).add(fVar4).add(yCoord).divide(fVar4).add(fVar4);
            fVar5 = curve.fromBigInteger(org.bouncycastle.math.ec.d.ONE);
        } else {
            org.bouncycastle.math.ec.f square = add2.square();
            org.bouncycastle.math.ec.f multiply = add.multiply(fVar7);
            org.bouncycastle.math.ec.f multiply2 = add.multiply(fVar);
            org.bouncycastle.math.ec.f multiply3 = multiply.multiply(multiply2);
            if (multiply3.isZero()) {
                return new p2(curve, multiply3, curve.getB().sqrt());
            }
            org.bouncycastle.math.ec.f multiply4 = add.multiply(square);
            org.bouncycastle.math.ec.f multiply5 = !isOne2 ? multiply4.multiply(zCoord) : multiply4;
            org.bouncycastle.math.ec.f squarePlusProduct = multiply2.add(square).squarePlusProduct(multiply5, fVar8.add(fVar9));
            if (!isOne) {
                multiply5 = multiply5.multiply(fVar9);
            }
            fVar4 = multiply3;
            fVar5 = multiply5;
            fVar6 = squarePlusProduct;
        }
        return new p2(curve, fVar4, fVar6, new org.bouncycastle.math.ec.f[]{fVar5});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new p2(null, getAffineXCoord(), getAffineYCoord());
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
        return new p2(this.curve, fVar, fVar2.add(fVar3), new org.bouncycastle.math.ec.f[]{fVar3});
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
        org.bouncycastle.math.ec.f multiply = isOne ? fVar2 : fVar2.multiply(fVar3);
        org.bouncycastle.math.ec.f square = isOne ? fVar3 : fVar3.square();
        org.bouncycastle.math.ec.f add = fVar2.square().add(multiply).add(square);
        if (add.isZero()) {
            return new p2(curve, add, curve.getB().sqrt());
        }
        org.bouncycastle.math.ec.f square2 = add.square();
        org.bouncycastle.math.ec.f multiply2 = isOne ? add : add.multiply(square);
        if (!isOne) {
            fVar = fVar.multiply(fVar3);
        }
        return new p2(curve, square2, fVar.squarePlusProduct(add, multiply).add(square2).add(multiply2), new org.bouncycastle.math.ec.f[]{multiply2});
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
        org.bouncycastle.math.ec.f add = square3.add(square2).add(fVar2.multiply(fVar3));
        org.bouncycastle.math.ec.f multiplyPlusProduct = rawYCoord.multiply(square3).add(square2).multiplyPlusProduct(add, square, square3);
        org.bouncycastle.math.ec.f multiply = rawXCoord.multiply(square3);
        org.bouncycastle.math.ec.f square4 = multiply.add(add).square();
        if (square4.isZero()) {
            return multiplyPlusProduct.isZero() ? iVar.twice() : curve.getInfinity();
        }
        if (multiplyPlusProduct.isZero()) {
            return new p2(curve, multiplyPlusProduct, curve.getB().sqrt());
        }
        org.bouncycastle.math.ec.f multiply2 = multiplyPlusProduct.square().multiply(multiply);
        org.bouncycastle.math.ec.f multiply3 = multiplyPlusProduct.multiply(square4).multiply(square3);
        return new p2(curve, multiply2, multiplyPlusProduct.add(square4).square().multiplyPlusProduct(add, rawYCoord.addOne(), multiply3), new org.bouncycastle.math.ec.f[]{multiply3});
    }

    p2(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
