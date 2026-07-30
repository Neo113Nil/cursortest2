package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class j extends i.c {
    j(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        i iVar2 = (i) this.f17192x;
        i iVar3 = (i) this.f17193y;
        i iVar4 = (i) iVar.getXCoord();
        i iVar5 = (i) iVar.getYCoord();
        i iVar6 = (i) this.zs[0];
        i iVar7 = (i) iVar.getZCoord(0);
        int[] createExt = b7.e.createExt();
        int[] create = b7.e.create();
        int[] create2 = b7.e.create();
        int[] create3 = b7.e.create();
        boolean isOne = iVar6.isOne();
        if (isOne) {
            iArr = iVar4.f17157x;
            iArr2 = iVar5.f17157x;
        } else {
            h.square(iVar6.f17157x, create2);
            h.multiply(create2, iVar4.f17157x, create);
            h.multiply(create2, iVar6.f17157x, create2);
            h.multiply(create2, iVar5.f17157x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = iVar7.isOne();
        if (isOne2) {
            iArr3 = iVar2.f17157x;
            iArr4 = iVar3.f17157x;
        } else {
            h.square(iVar7.f17157x, create3);
            h.multiply(create3, iVar2.f17157x, createExt);
            h.multiply(create3, iVar7.f17157x, create3);
            h.multiply(create3, iVar3.f17157x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = b7.e.create();
        h.subtract(iArr3, iArr, create4);
        h.subtract(iArr4, iArr2, create);
        if (b7.e.isZero(create4)) {
            return b7.e.isZero(create) ? twice() : curve.getInfinity();
        }
        h.square(create4, create2);
        int[] create5 = b7.e.create();
        h.multiply(create2, create4, create5);
        h.multiply(create2, iArr3, create2);
        h.negate(create5, create5);
        b7.e.mul(iArr4, create5, createExt);
        h.reduce32(b7.e.addBothTo(create2, create2, create5), create5);
        i iVar8 = new i(create3);
        h.square(create, iVar8.f17157x);
        int[] iArr5 = iVar8.f17157x;
        h.subtract(iArr5, create5, iArr5);
        i iVar9 = new i(create5);
        h.subtract(create2, iVar8.f17157x, iVar9.f17157x);
        h.multiplyAddToExt(iVar9.f17157x, create, createExt);
        h.reduce(createExt, iVar9.f17157x);
        i iVar10 = new i(create4);
        if (!isOne) {
            int[] iArr6 = iVar10.f17157x;
            h.multiply(iArr6, iVar6.f17157x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = iVar10.f17157x;
            h.multiply(iArr7, iVar7.f17157x, iArr7);
        }
        return new j(curve, iVar8, iVar9, new org.bouncycastle.math.ec.f[]{iVar10});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new j(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new j(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
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
        i iVar = (i) this.f17193y;
        if (iVar.isZero()) {
            return curve.getInfinity();
        }
        i iVar2 = (i) this.f17192x;
        i iVar3 = (i) this.zs[0];
        int[] create = b7.e.create();
        int[] create2 = b7.e.create();
        int[] create3 = b7.e.create();
        h.square(iVar.f17157x, create3);
        int[] create4 = b7.e.create();
        h.square(create3, create4);
        boolean isOne = iVar3.isOne();
        int[] iArr = iVar3.f17157x;
        if (!isOne) {
            h.square(iArr, create2);
            iArr = create2;
        }
        h.subtract(iVar2.f17157x, iArr, create);
        h.add(iVar2.f17157x, iArr, create2);
        h.multiply(create2, create, create2);
        h.reduce32(b7.e.addBothTo(create2, create2, create2), create2);
        h.multiply(create3, iVar2.f17157x, create3);
        h.reduce32(b7.n.shiftUpBits(5, create3, 2, 0), create3);
        h.reduce32(b7.n.shiftUpBits(5, create4, 3, 0, create), create);
        i iVar4 = new i(create4);
        h.square(create2, iVar4.f17157x);
        int[] iArr2 = iVar4.f17157x;
        h.subtract(iArr2, create3, iArr2);
        int[] iArr3 = iVar4.f17157x;
        h.subtract(iArr3, create3, iArr3);
        i iVar5 = new i(create3);
        h.subtract(create3, iVar4.f17157x, iVar5.f17157x);
        int[] iArr4 = iVar5.f17157x;
        h.multiply(iArr4, create2, iArr4);
        int[] iArr5 = iVar5.f17157x;
        h.subtract(iArr5, create, iArr5);
        i iVar6 = new i(create2);
        h.twice(iVar.f17157x, iVar6.f17157x);
        if (!isOne) {
            int[] iArr6 = iVar6.f17157x;
            h.multiply(iArr6, iVar3.f17157x, iArr6);
        }
        return new j(curve, iVar4, iVar5, new org.bouncycastle.math.ec.f[]{iVar6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    j(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
