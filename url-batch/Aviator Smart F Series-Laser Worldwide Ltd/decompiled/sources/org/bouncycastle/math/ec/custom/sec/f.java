package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class f extends i.c {
    f(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        m mVar = (m) this.f17192x;
        m mVar2 = (m) this.f17193y;
        m mVar3 = (m) iVar.getXCoord();
        m mVar4 = (m) iVar.getYCoord();
        m mVar5 = (m) this.zs[0];
        m mVar6 = (m) iVar.getZCoord(0);
        int[] createExt = b7.e.createExt();
        int[] create = b7.e.create();
        int[] create2 = b7.e.create();
        int[] create3 = b7.e.create();
        boolean isOne = mVar5.isOne();
        if (isOne) {
            iArr = mVar3.f17162x;
            iArr2 = mVar4.f17162x;
        } else {
            l.square(mVar5.f17162x, create2);
            l.multiply(create2, mVar3.f17162x, create);
            l.multiply(create2, mVar5.f17162x, create2);
            l.multiply(create2, mVar4.f17162x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = mVar6.isOne();
        if (isOne2) {
            iArr3 = mVar.f17162x;
            iArr4 = mVar2.f17162x;
        } else {
            l.square(mVar6.f17162x, create3);
            l.multiply(create3, mVar.f17162x, createExt);
            l.multiply(create3, mVar6.f17162x, create3);
            l.multiply(create3, mVar2.f17162x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = b7.e.create();
        l.subtract(iArr3, iArr, create4);
        l.subtract(iArr4, iArr2, create);
        if (b7.e.isZero(create4)) {
            return b7.e.isZero(create) ? twice() : curve.getInfinity();
        }
        l.square(create4, create2);
        int[] create5 = b7.e.create();
        l.multiply(create2, create4, create5);
        l.multiply(create2, iArr3, create2);
        l.negate(create5, create5);
        b7.e.mul(iArr4, create5, createExt);
        l.reduce32(b7.e.addBothTo(create2, create2, create5), create5);
        m mVar7 = new m(create3);
        l.square(create, mVar7.f17162x);
        int[] iArr5 = mVar7.f17162x;
        l.subtract(iArr5, create5, iArr5);
        m mVar8 = new m(create5);
        l.subtract(create2, mVar7.f17162x, mVar8.f17162x);
        l.multiplyAddToExt(mVar8.f17162x, create, createExt);
        l.reduce(createExt, mVar8.f17162x);
        m mVar9 = new m(create4);
        if (!isOne) {
            int[] iArr6 = mVar9.f17162x;
            l.multiply(iArr6, mVar5.f17162x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = mVar9.f17162x;
            l.multiply(iArr7, mVar6.f17162x, iArr7);
        }
        return new f(curve, mVar7, mVar8, new org.bouncycastle.math.ec.f[]{mVar9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new f(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new f(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
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
        m mVar = (m) this.f17193y;
        if (mVar.isZero()) {
            return curve.getInfinity();
        }
        m mVar2 = (m) this.f17192x;
        m mVar3 = (m) this.zs[0];
        int[] create = b7.e.create();
        l.square(mVar.f17162x, create);
        int[] create2 = b7.e.create();
        l.square(create, create2);
        int[] create3 = b7.e.create();
        l.square(mVar2.f17162x, create3);
        l.reduce32(b7.e.addBothTo(create3, create3, create3), create3);
        l.multiply(create, mVar2.f17162x, create);
        l.reduce32(b7.n.shiftUpBits(5, create, 2, 0), create);
        int[] create4 = b7.e.create();
        l.reduce32(b7.n.shiftUpBits(5, create2, 3, 0, create4), create4);
        m mVar4 = new m(create2);
        l.square(create3, mVar4.f17162x);
        int[] iArr = mVar4.f17162x;
        l.subtract(iArr, create, iArr);
        int[] iArr2 = mVar4.f17162x;
        l.subtract(iArr2, create, iArr2);
        m mVar5 = new m(create);
        l.subtract(create, mVar4.f17162x, mVar5.f17162x);
        int[] iArr3 = mVar5.f17162x;
        l.multiply(iArr3, create3, iArr3);
        int[] iArr4 = mVar5.f17162x;
        l.subtract(iArr4, create4, iArr4);
        m mVar6 = new m(create3);
        l.twice(mVar.f17162x, mVar6.f17162x);
        if (!mVar3.isOne()) {
            int[] iArr5 = mVar6.f17162x;
            l.multiply(iArr5, mVar3.f17162x, iArr5);
        }
        return new f(curve, mVar4, mVar5, new org.bouncycastle.math.ec.f[]{mVar6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    f(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
