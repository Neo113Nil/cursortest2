package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class p0 extends i.c {
    p0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        o0 o0Var = (o0) this.f17192x;
        o0 o0Var2 = (o0) this.f17193y;
        o0 o0Var3 = (o0) iVar.getXCoord();
        o0 o0Var4 = (o0) iVar.getYCoord();
        o0 o0Var5 = (o0) this.zs[0];
        o0 o0Var6 = (o0) iVar.getZCoord(0);
        int[] create = b7.n.create(24);
        int[] create2 = b7.n.create(24);
        int[] create3 = b7.n.create(12);
        int[] create4 = b7.n.create(12);
        boolean isOne = o0Var5.isOne();
        if (isOne) {
            iArr = o0Var3.f17165x;
            iArr2 = o0Var4.f17165x;
        } else {
            n0.square(o0Var5.f17165x, create3);
            n0.multiply(create3, o0Var3.f17165x, create2);
            n0.multiply(create3, o0Var5.f17165x, create3);
            n0.multiply(create3, o0Var4.f17165x, create3);
            iArr = create2;
            iArr2 = create3;
        }
        boolean isOne2 = o0Var6.isOne();
        if (isOne2) {
            iArr3 = o0Var.f17165x;
            iArr4 = o0Var2.f17165x;
        } else {
            n0.square(o0Var6.f17165x, create4);
            n0.multiply(create4, o0Var.f17165x, create);
            n0.multiply(create4, o0Var6.f17165x, create4);
            n0.multiply(create4, o0Var2.f17165x, create4);
            iArr3 = create;
            iArr4 = create4;
        }
        int[] create5 = b7.n.create(12);
        n0.subtract(iArr3, iArr, create5);
        int[] create6 = b7.n.create(12);
        n0.subtract(iArr4, iArr2, create6);
        if (b7.n.isZero(12, create5)) {
            return b7.n.isZero(12, create6) ? twice() : curve.getInfinity();
        }
        n0.square(create5, create3);
        int[] create7 = b7.n.create(12);
        n0.multiply(create3, create5, create7);
        n0.multiply(create3, iArr3, create3);
        n0.negate(create7, create7);
        b7.j.mul(iArr4, create7, create);
        n0.reduce32(b7.n.addBothTo(12, create3, create3, create7), create7);
        o0 o0Var7 = new o0(create4);
        n0.square(create6, o0Var7.f17165x);
        int[] iArr5 = o0Var7.f17165x;
        n0.subtract(iArr5, create7, iArr5);
        o0 o0Var8 = new o0(create7);
        n0.subtract(create3, o0Var7.f17165x, o0Var8.f17165x);
        b7.j.mul(o0Var8.f17165x, create6, create2);
        n0.addExt(create, create2, create);
        n0.reduce(create, o0Var8.f17165x);
        o0 o0Var9 = new o0(create5);
        if (!isOne) {
            int[] iArr6 = o0Var9.f17165x;
            n0.multiply(iArr6, o0Var5.f17165x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = o0Var9.f17165x;
            n0.multiply(iArr7, o0Var6.f17165x, iArr7);
        }
        return new p0(curve, o0Var7, o0Var8, new org.bouncycastle.math.ec.f[]{o0Var9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new p0(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new p0(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
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
        o0 o0Var = (o0) this.f17193y;
        if (o0Var.isZero()) {
            return curve.getInfinity();
        }
        o0 o0Var2 = (o0) this.f17192x;
        o0 o0Var3 = (o0) this.zs[0];
        int[] create = b7.n.create(12);
        int[] create2 = b7.n.create(12);
        int[] create3 = b7.n.create(12);
        n0.square(o0Var.f17165x, create3);
        int[] create4 = b7.n.create(12);
        n0.square(create3, create4);
        boolean isOne = o0Var3.isOne();
        int[] iArr = o0Var3.f17165x;
        if (!isOne) {
            n0.square(iArr, create2);
            iArr = create2;
        }
        n0.subtract(o0Var2.f17165x, iArr, create);
        n0.add(o0Var2.f17165x, iArr, create2);
        n0.multiply(create2, create, create2);
        n0.reduce32(b7.n.addBothTo(12, create2, create2, create2), create2);
        n0.multiply(create3, o0Var2.f17165x, create3);
        n0.reduce32(b7.n.shiftUpBits(12, create3, 2, 0), create3);
        n0.reduce32(b7.n.shiftUpBits(12, create4, 3, 0, create), create);
        o0 o0Var4 = new o0(create4);
        n0.square(create2, o0Var4.f17165x);
        int[] iArr2 = o0Var4.f17165x;
        n0.subtract(iArr2, create3, iArr2);
        int[] iArr3 = o0Var4.f17165x;
        n0.subtract(iArr3, create3, iArr3);
        o0 o0Var5 = new o0(create3);
        n0.subtract(create3, o0Var4.f17165x, o0Var5.f17165x);
        int[] iArr4 = o0Var5.f17165x;
        n0.multiply(iArr4, create2, iArr4);
        int[] iArr5 = o0Var5.f17165x;
        n0.subtract(iArr5, create, iArr5);
        o0 o0Var6 = new o0(create2);
        n0.twice(o0Var.f17165x, o0Var6.f17165x);
        if (!isOne) {
            int[] iArr6 = o0Var6.f17165x;
            n0.multiply(iArr6, o0Var3.f17165x, iArr6);
        }
        return new p0(curve, o0Var4, o0Var5, new org.bouncycastle.math.ec.f[]{o0Var6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    p0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
