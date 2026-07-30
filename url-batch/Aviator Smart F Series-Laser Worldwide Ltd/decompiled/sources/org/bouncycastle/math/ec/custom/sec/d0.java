package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class d0 extends i.c {
    d0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i add(org.bouncycastle.math.ec.i iVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return iVar;
        }
        if (iVar.isInfinity()) {
            return this;
        }
        if (this == iVar) {
            return twice();
        }
        org.bouncycastle.math.ec.e curve = getCurve();
        c0 c0Var = (c0) this.f17192x;
        c0 c0Var2 = (c0) this.f17193y;
        c0 c0Var3 = (c0) iVar.getXCoord();
        c0 c0Var4 = (c0) iVar.getYCoord();
        c0 c0Var5 = (c0) this.zs[0];
        c0 c0Var6 = (c0) iVar.getZCoord(0);
        int[] createExt = b7.g.createExt();
        int[] create = b7.g.create();
        int[] create2 = b7.g.create();
        int[] create3 = b7.g.create();
        boolean isOne = c0Var5.isOne();
        if (isOne) {
            iArr = c0Var3.f17150x;
            iArr2 = c0Var4.f17150x;
        } else {
            b0.square(c0Var5.f17150x, create2);
            b0.multiply(create2, c0Var3.f17150x, create);
            b0.multiply(create2, c0Var5.f17150x, create2);
            b0.multiply(create2, c0Var4.f17150x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = c0Var6.isOne();
        if (isOne2) {
            iArr3 = c0Var.f17150x;
            iArr4 = c0Var2.f17150x;
        } else {
            b0.square(c0Var6.f17150x, create3);
            b0.multiply(create3, c0Var.f17150x, createExt);
            b0.multiply(create3, c0Var6.f17150x, create3);
            b0.multiply(create3, c0Var2.f17150x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = b7.g.create();
        b0.subtract(iArr3, iArr, create4);
        b0.subtract(iArr4, iArr2, create);
        if (b7.g.isZero(create4)) {
            return b7.g.isZero(create) ? twice() : curve.getInfinity();
        }
        b0.square(create4, create2);
        int[] create5 = b7.g.create();
        b0.multiply(create2, create4, create5);
        b0.multiply(create2, iArr3, create2);
        b0.negate(create5, create5);
        b7.g.mul(iArr4, create5, createExt);
        b0.reduce32(b7.g.addBothTo(create2, create2, create5), create5);
        c0 c0Var7 = new c0(create3);
        b0.square(create, c0Var7.f17150x);
        int[] iArr5 = c0Var7.f17150x;
        b0.subtract(iArr5, create5, iArr5);
        c0 c0Var8 = new c0(create5);
        b0.subtract(create2, c0Var7.f17150x, c0Var8.f17150x);
        b0.multiplyAddToExt(c0Var8.f17150x, create, createExt);
        b0.reduce(createExt, c0Var8.f17150x);
        c0 c0Var9 = new c0(create4);
        if (!isOne) {
            int[] iArr6 = c0Var9.f17150x;
            b0.multiply(iArr6, c0Var5.f17150x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = c0Var9.f17150x;
            b0.multiply(iArr7, c0Var6.f17150x, iArr7);
        }
        return new d0(curve, c0Var7, c0Var8, new org.bouncycastle.math.ec.f[]{c0Var9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new d0(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new d0(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i threeTimes() {
        return (isInfinity() || this.f17193y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twice() {
        if (isInfinity()) {
            return this;
        }
        org.bouncycastle.math.ec.e curve = getCurve();
        c0 c0Var = (c0) this.f17193y;
        if (c0Var.isZero()) {
            return curve.getInfinity();
        }
        c0 c0Var2 = (c0) this.f17192x;
        c0 c0Var3 = (c0) this.zs[0];
        int[] create = b7.g.create();
        int[] create2 = b7.g.create();
        int[] create3 = b7.g.create();
        b0.square(c0Var.f17150x, create3);
        int[] create4 = b7.g.create();
        b0.square(create3, create4);
        boolean isOne = c0Var3.isOne();
        int[] iArr = c0Var3.f17150x;
        if (!isOne) {
            b0.square(iArr, create2);
            iArr = create2;
        }
        b0.subtract(c0Var2.f17150x, iArr, create);
        b0.add(c0Var2.f17150x, iArr, create2);
        b0.multiply(create2, create, create2);
        b0.reduce32(b7.g.addBothTo(create2, create2, create2), create2);
        b0.multiply(create3, c0Var2.f17150x, create3);
        b0.reduce32(b7.n.shiftUpBits(7, create3, 2, 0), create3);
        b0.reduce32(b7.n.shiftUpBits(7, create4, 3, 0, create), create);
        c0 c0Var4 = new c0(create4);
        b0.square(create2, c0Var4.f17150x);
        int[] iArr2 = c0Var4.f17150x;
        b0.subtract(iArr2, create3, iArr2);
        int[] iArr3 = c0Var4.f17150x;
        b0.subtract(iArr3, create3, iArr3);
        c0 c0Var5 = new c0(create3);
        b0.subtract(create3, c0Var4.f17150x, c0Var5.f17150x);
        int[] iArr4 = c0Var5.f17150x;
        b0.multiply(iArr4, create2, iArr4);
        int[] iArr5 = c0Var5.f17150x;
        b0.subtract(iArr5, create, iArr5);
        c0 c0Var6 = new c0(create2);
        b0.twice(c0Var.f17150x, c0Var6.f17150x);
        if (!isOne) {
            int[] iArr6 = c0Var6.f17150x;
            b0.multiply(iArr6, c0Var3.f17150x, iArr6);
        }
        return new d0(curve, c0Var4, c0Var5, new org.bouncycastle.math.ec.f[]{c0Var6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    d0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
