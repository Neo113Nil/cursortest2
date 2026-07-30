package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class t0 extends i.c {
    t0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        s0 s0Var = (s0) this.f17192x;
        s0 s0Var2 = (s0) this.f17193y;
        s0 s0Var3 = (s0) iVar.getXCoord();
        s0 s0Var4 = (s0) iVar.getYCoord();
        s0 s0Var5 = (s0) this.zs[0];
        s0 s0Var6 = (s0) iVar.getZCoord(0);
        int[] create = b7.n.create(17);
        int[] create2 = b7.n.create(17);
        int[] create3 = b7.n.create(17);
        int[] create4 = b7.n.create(17);
        boolean isOne = s0Var5.isOne();
        if (isOne) {
            iArr = s0Var3.f17171x;
            iArr2 = s0Var4.f17171x;
        } else {
            r0.square(s0Var5.f17171x, create3);
            r0.multiply(create3, s0Var3.f17171x, create2);
            r0.multiply(create3, s0Var5.f17171x, create3);
            r0.multiply(create3, s0Var4.f17171x, create3);
            iArr = create2;
            iArr2 = create3;
        }
        boolean isOne2 = s0Var6.isOne();
        if (isOne2) {
            iArr3 = s0Var.f17171x;
            iArr4 = s0Var2.f17171x;
        } else {
            r0.square(s0Var6.f17171x, create4);
            r0.multiply(create4, s0Var.f17171x, create);
            r0.multiply(create4, s0Var6.f17171x, create4);
            r0.multiply(create4, s0Var2.f17171x, create4);
            iArr3 = create;
            iArr4 = create4;
        }
        int[] create5 = b7.n.create(17);
        r0.subtract(iArr3, iArr, create5);
        r0.subtract(iArr4, iArr2, create2);
        if (b7.n.isZero(17, create5)) {
            return b7.n.isZero(17, create2) ? twice() : curve.getInfinity();
        }
        r0.square(create5, create3);
        int[] create6 = b7.n.create(17);
        r0.multiply(create3, create5, create6);
        r0.multiply(create3, iArr3, create3);
        r0.multiply(iArr4, create6, create);
        s0 s0Var7 = new s0(create4);
        r0.square(create2, s0Var7.f17171x);
        int[] iArr5 = s0Var7.f17171x;
        r0.add(iArr5, create6, iArr5);
        int[] iArr6 = s0Var7.f17171x;
        r0.subtract(iArr6, create3, iArr6);
        int[] iArr7 = s0Var7.f17171x;
        r0.subtract(iArr7, create3, iArr7);
        s0 s0Var8 = new s0(create6);
        r0.subtract(create3, s0Var7.f17171x, s0Var8.f17171x);
        r0.multiply(s0Var8.f17171x, create2, create2);
        r0.subtract(create2, create, s0Var8.f17171x);
        s0 s0Var9 = new s0(create5);
        if (!isOne) {
            int[] iArr8 = s0Var9.f17171x;
            r0.multiply(iArr8, s0Var5.f17171x, iArr8);
        }
        if (!isOne2) {
            int[] iArr9 = s0Var9.f17171x;
            r0.multiply(iArr9, s0Var6.f17171x, iArr9);
        }
        return new t0(curve, s0Var7, s0Var8, new org.bouncycastle.math.ec.f[]{s0Var9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new t0(null, getAffineXCoord(), getAffineYCoord());
    }

    protected org.bouncycastle.math.ec.f doubleProductFromSquares(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f fVar3, org.bouncycastle.math.ec.f fVar4) {
        return fVar.add(fVar2).square().subtract(fVar3).subtract(fVar4);
    }

    protected org.bouncycastle.math.ec.f eight(org.bouncycastle.math.ec.f fVar) {
        return four(two(fVar));
    }

    protected org.bouncycastle.math.ec.f four(org.bouncycastle.math.ec.f fVar) {
        return two(two(fVar));
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new t0(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
    }

    protected org.bouncycastle.math.ec.f three(org.bouncycastle.math.ec.f fVar) {
        return two(fVar).add(fVar);
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
        s0 s0Var = (s0) this.f17193y;
        if (s0Var.isZero()) {
            return curve.getInfinity();
        }
        s0 s0Var2 = (s0) this.f17192x;
        s0 s0Var3 = (s0) this.zs[0];
        int[] create = b7.n.create(17);
        int[] create2 = b7.n.create(17);
        int[] create3 = b7.n.create(17);
        r0.square(s0Var.f17171x, create3);
        int[] create4 = b7.n.create(17);
        r0.square(create3, create4);
        boolean isOne = s0Var3.isOne();
        int[] iArr = s0Var3.f17171x;
        if (!isOne) {
            r0.square(iArr, create2);
            iArr = create2;
        }
        r0.subtract(s0Var2.f17171x, iArr, create);
        r0.add(s0Var2.f17171x, iArr, create2);
        r0.multiply(create2, create, create2);
        b7.n.addBothTo(17, create2, create2, create2);
        r0.reduce23(create2);
        r0.multiply(create3, s0Var2.f17171x, create3);
        b7.n.shiftUpBits(17, create3, 2, 0);
        r0.reduce23(create3);
        b7.n.shiftUpBits(17, create4, 3, 0, create);
        r0.reduce23(create);
        s0 s0Var4 = new s0(create4);
        r0.square(create2, s0Var4.f17171x);
        int[] iArr2 = s0Var4.f17171x;
        r0.subtract(iArr2, create3, iArr2);
        int[] iArr3 = s0Var4.f17171x;
        r0.subtract(iArr3, create3, iArr3);
        s0 s0Var5 = new s0(create3);
        r0.subtract(create3, s0Var4.f17171x, s0Var5.f17171x);
        int[] iArr4 = s0Var5.f17171x;
        r0.multiply(iArr4, create2, iArr4);
        int[] iArr5 = s0Var5.f17171x;
        r0.subtract(iArr5, create, iArr5);
        s0 s0Var6 = new s0(create2);
        r0.twice(s0Var.f17171x, s0Var6.f17171x);
        if (!isOne) {
            int[] iArr6 = s0Var6.f17171x;
            r0.multiply(iArr6, s0Var3.f17171x, iArr6);
        }
        return new t0(curve, s0Var4, s0Var5, new org.bouncycastle.math.ec.f[]{s0Var6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    protected org.bouncycastle.math.ec.f two(org.bouncycastle.math.ec.f fVar) {
        return fVar.add(fVar);
    }

    t0(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
