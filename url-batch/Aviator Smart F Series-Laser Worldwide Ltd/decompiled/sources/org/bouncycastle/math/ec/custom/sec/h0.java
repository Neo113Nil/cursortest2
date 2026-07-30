package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class h0 extends i.c {
    h0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        g0 g0Var = (g0) this.f17192x;
        g0 g0Var2 = (g0) this.f17193y;
        g0 g0Var3 = (g0) iVar.getXCoord();
        g0 g0Var4 = (g0) iVar.getYCoord();
        g0 g0Var5 = (g0) this.zs[0];
        g0 g0Var6 = (g0) iVar.getZCoord(0);
        int[] createExt = b7.h.createExt();
        int[] create = b7.h.create();
        int[] create2 = b7.h.create();
        int[] create3 = b7.h.create();
        boolean isOne = g0Var5.isOne();
        if (isOne) {
            iArr = g0Var3.f17155x;
            iArr2 = g0Var4.f17155x;
        } else {
            f0.square(g0Var5.f17155x, create2);
            f0.multiply(create2, g0Var3.f17155x, create);
            f0.multiply(create2, g0Var5.f17155x, create2);
            f0.multiply(create2, g0Var4.f17155x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = g0Var6.isOne();
        if (isOne2) {
            iArr3 = g0Var.f17155x;
            iArr4 = g0Var2.f17155x;
        } else {
            f0.square(g0Var6.f17155x, create3);
            f0.multiply(create3, g0Var.f17155x, createExt);
            f0.multiply(create3, g0Var6.f17155x, create3);
            f0.multiply(create3, g0Var2.f17155x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = b7.h.create();
        f0.subtract(iArr3, iArr, create4);
        f0.subtract(iArr4, iArr2, create);
        if (b7.h.isZero(create4)) {
            return b7.h.isZero(create) ? twice() : curve.getInfinity();
        }
        f0.square(create4, create2);
        int[] create5 = b7.h.create();
        f0.multiply(create2, create4, create5);
        f0.multiply(create2, iArr3, create2);
        f0.negate(create5, create5);
        b7.h.mul(iArr4, create5, createExt);
        f0.reduce32(b7.h.addBothTo(create2, create2, create5), create5);
        g0 g0Var7 = new g0(create3);
        f0.square(create, g0Var7.f17155x);
        int[] iArr5 = g0Var7.f17155x;
        f0.subtract(iArr5, create5, iArr5);
        g0 g0Var8 = new g0(create5);
        f0.subtract(create2, g0Var7.f17155x, g0Var8.f17155x);
        f0.multiplyAddToExt(g0Var8.f17155x, create, createExt);
        f0.reduce(createExt, g0Var8.f17155x);
        g0 g0Var9 = new g0(create4);
        if (!isOne) {
            int[] iArr6 = g0Var9.f17155x;
            f0.multiply(iArr6, g0Var5.f17155x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = g0Var9.f17155x;
            f0.multiply(iArr7, g0Var6.f17155x, iArr7);
        }
        return new h0(curve, g0Var7, g0Var8, new org.bouncycastle.math.ec.f[]{g0Var9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new h0(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new h0(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
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
        g0 g0Var = (g0) this.f17193y;
        if (g0Var.isZero()) {
            return curve.getInfinity();
        }
        g0 g0Var2 = (g0) this.f17192x;
        g0 g0Var3 = (g0) this.zs[0];
        int[] create = b7.h.create();
        f0.square(g0Var.f17155x, create);
        int[] create2 = b7.h.create();
        f0.square(create, create2);
        int[] create3 = b7.h.create();
        f0.square(g0Var2.f17155x, create3);
        f0.reduce32(b7.h.addBothTo(create3, create3, create3), create3);
        f0.multiply(create, g0Var2.f17155x, create);
        f0.reduce32(b7.n.shiftUpBits(8, create, 2, 0), create);
        int[] create4 = b7.h.create();
        f0.reduce32(b7.n.shiftUpBits(8, create2, 3, 0, create4), create4);
        g0 g0Var4 = new g0(create2);
        f0.square(create3, g0Var4.f17155x);
        int[] iArr = g0Var4.f17155x;
        f0.subtract(iArr, create, iArr);
        int[] iArr2 = g0Var4.f17155x;
        f0.subtract(iArr2, create, iArr2);
        g0 g0Var5 = new g0(create);
        f0.subtract(create, g0Var4.f17155x, g0Var5.f17155x);
        int[] iArr3 = g0Var5.f17155x;
        f0.multiply(iArr3, create3, iArr3);
        int[] iArr4 = g0Var5.f17155x;
        f0.subtract(iArr4, create4, iArr4);
        g0 g0Var6 = new g0(create3);
        f0.twice(g0Var.f17155x, g0Var6.f17155x);
        if (!g0Var3.isOne()) {
            int[] iArr5 = g0Var6.f17155x;
            f0.multiply(iArr5, g0Var3.f17155x, iArr5);
        }
        return new h0(curve, g0Var4, g0Var5, new org.bouncycastle.math.ec.f[]{g0Var6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    h0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
