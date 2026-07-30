package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class l0 extends i.c {
    l0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        k0 k0Var = (k0) this.f17192x;
        k0 k0Var2 = (k0) this.f17193y;
        k0 k0Var3 = (k0) iVar.getXCoord();
        k0 k0Var4 = (k0) iVar.getYCoord();
        k0 k0Var5 = (k0) this.zs[0];
        k0 k0Var6 = (k0) iVar.getZCoord(0);
        int[] createExt = b7.h.createExt();
        int[] create = b7.h.create();
        int[] create2 = b7.h.create();
        int[] create3 = b7.h.create();
        boolean isOne = k0Var5.isOne();
        if (isOne) {
            iArr = k0Var3.f17160x;
            iArr2 = k0Var4.f17160x;
        } else {
            j0.square(k0Var5.f17160x, create2);
            j0.multiply(create2, k0Var3.f17160x, create);
            j0.multiply(create2, k0Var5.f17160x, create2);
            j0.multiply(create2, k0Var4.f17160x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = k0Var6.isOne();
        if (isOne2) {
            iArr3 = k0Var.f17160x;
            iArr4 = k0Var2.f17160x;
        } else {
            j0.square(k0Var6.f17160x, create3);
            j0.multiply(create3, k0Var.f17160x, createExt);
            j0.multiply(create3, k0Var6.f17160x, create3);
            j0.multiply(create3, k0Var2.f17160x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = b7.h.create();
        j0.subtract(iArr3, iArr, create4);
        j0.subtract(iArr4, iArr2, create);
        if (b7.h.isZero(create4)) {
            return b7.h.isZero(create) ? twice() : curve.getInfinity();
        }
        j0.square(create4, create2);
        int[] create5 = b7.h.create();
        j0.multiply(create2, create4, create5);
        j0.multiply(create2, iArr3, create2);
        j0.negate(create5, create5);
        b7.h.mul(iArr4, create5, createExt);
        j0.reduce32(b7.h.addBothTo(create2, create2, create5), create5);
        k0 k0Var7 = new k0(create3);
        j0.square(create, k0Var7.f17160x);
        int[] iArr5 = k0Var7.f17160x;
        j0.subtract(iArr5, create5, iArr5);
        k0 k0Var8 = new k0(create5);
        j0.subtract(create2, k0Var7.f17160x, k0Var8.f17160x);
        j0.multiplyAddToExt(k0Var8.f17160x, create, createExt);
        j0.reduce(createExt, k0Var8.f17160x);
        k0 k0Var9 = new k0(create4);
        if (!isOne) {
            int[] iArr6 = k0Var9.f17160x;
            j0.multiply(iArr6, k0Var5.f17160x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = k0Var9.f17160x;
            j0.multiply(iArr7, k0Var6.f17160x, iArr7);
        }
        return new l0(curve, k0Var7, k0Var8, new org.bouncycastle.math.ec.f[]{k0Var9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new l0(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new l0(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
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
        k0 k0Var = (k0) this.f17193y;
        if (k0Var.isZero()) {
            return curve.getInfinity();
        }
        k0 k0Var2 = (k0) this.f17192x;
        k0 k0Var3 = (k0) this.zs[0];
        int[] create = b7.h.create();
        int[] create2 = b7.h.create();
        int[] create3 = b7.h.create();
        j0.square(k0Var.f17160x, create3);
        int[] create4 = b7.h.create();
        j0.square(create3, create4);
        boolean isOne = k0Var3.isOne();
        int[] iArr = k0Var3.f17160x;
        if (!isOne) {
            j0.square(iArr, create2);
            iArr = create2;
        }
        j0.subtract(k0Var2.f17160x, iArr, create);
        j0.add(k0Var2.f17160x, iArr, create2);
        j0.multiply(create2, create, create2);
        j0.reduce32(b7.h.addBothTo(create2, create2, create2), create2);
        j0.multiply(create3, k0Var2.f17160x, create3);
        j0.reduce32(b7.n.shiftUpBits(8, create3, 2, 0), create3);
        j0.reduce32(b7.n.shiftUpBits(8, create4, 3, 0, create), create);
        k0 k0Var4 = new k0(create4);
        j0.square(create2, k0Var4.f17160x);
        int[] iArr2 = k0Var4.f17160x;
        j0.subtract(iArr2, create3, iArr2);
        int[] iArr3 = k0Var4.f17160x;
        j0.subtract(iArr3, create3, iArr3);
        k0 k0Var5 = new k0(create3);
        j0.subtract(create3, k0Var4.f17160x, k0Var5.f17160x);
        int[] iArr4 = k0Var5.f17160x;
        j0.multiply(iArr4, create2, iArr4);
        int[] iArr5 = k0Var5.f17160x;
        j0.subtract(iArr5, create, iArr5);
        k0 k0Var6 = new k0(create2);
        j0.twice(k0Var.f17160x, k0Var6.f17160x);
        if (!isOne) {
            int[] iArr6 = k0Var6.f17160x;
            j0.multiply(iArr6, k0Var3.f17160x, iArr6);
        }
        return new l0(curve, k0Var4, k0Var5, new org.bouncycastle.math.ec.f[]{k0Var6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    l0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
