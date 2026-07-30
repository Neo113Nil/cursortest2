package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class v extends i.c {
    v(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        u uVar = (u) this.f17192x;
        u uVar2 = (u) this.f17193y;
        u uVar3 = (u) iVar.getXCoord();
        u uVar4 = (u) iVar.getYCoord();
        u uVar5 = (u) this.zs[0];
        u uVar6 = (u) iVar.getZCoord(0);
        int[] createExt = b7.f.createExt();
        int[] create = b7.f.create();
        int[] create2 = b7.f.create();
        int[] create3 = b7.f.create();
        boolean isOne = uVar5.isOne();
        if (isOne) {
            iArr = uVar3.f17172x;
            iArr2 = uVar4.f17172x;
        } else {
            t.square(uVar5.f17172x, create2);
            t.multiply(create2, uVar3.f17172x, create);
            t.multiply(create2, uVar5.f17172x, create2);
            t.multiply(create2, uVar4.f17172x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = uVar6.isOne();
        if (isOne2) {
            iArr3 = uVar.f17172x;
            iArr4 = uVar2.f17172x;
        } else {
            t.square(uVar6.f17172x, create3);
            t.multiply(create3, uVar.f17172x, createExt);
            t.multiply(create3, uVar6.f17172x, create3);
            t.multiply(create3, uVar2.f17172x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = b7.f.create();
        t.subtract(iArr3, iArr, create4);
        t.subtract(iArr4, iArr2, create);
        if (b7.f.isZero(create4)) {
            return b7.f.isZero(create) ? twice() : curve.getInfinity();
        }
        t.square(create4, create2);
        int[] create5 = b7.f.create();
        t.multiply(create2, create4, create5);
        t.multiply(create2, iArr3, create2);
        t.negate(create5, create5);
        b7.f.mul(iArr4, create5, createExt);
        t.reduce32(b7.f.addBothTo(create2, create2, create5), create5);
        u uVar7 = new u(create3);
        t.square(create, uVar7.f17172x);
        int[] iArr5 = uVar7.f17172x;
        t.subtract(iArr5, create5, iArr5);
        u uVar8 = new u(create5);
        t.subtract(create2, uVar7.f17172x, uVar8.f17172x);
        t.multiplyAddToExt(uVar8.f17172x, create, createExt);
        t.reduce(createExt, uVar8.f17172x);
        u uVar9 = new u(create4);
        if (!isOne) {
            int[] iArr6 = uVar9.f17172x;
            t.multiply(iArr6, uVar5.f17172x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = uVar9.f17172x;
            t.multiply(iArr7, uVar6.f17172x, iArr7);
        }
        return new v(curve, uVar7, uVar8, new org.bouncycastle.math.ec.f[]{uVar9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new v(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new v(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
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
        u uVar = (u) this.f17193y;
        if (uVar.isZero()) {
            return curve.getInfinity();
        }
        u uVar2 = (u) this.f17192x;
        u uVar3 = (u) this.zs[0];
        int[] create = b7.f.create();
        int[] create2 = b7.f.create();
        int[] create3 = b7.f.create();
        t.square(uVar.f17172x, create3);
        int[] create4 = b7.f.create();
        t.square(create3, create4);
        boolean isOne = uVar3.isOne();
        int[] iArr = uVar3.f17172x;
        if (!isOne) {
            t.square(iArr, create2);
            iArr = create2;
        }
        t.subtract(uVar2.f17172x, iArr, create);
        t.add(uVar2.f17172x, iArr, create2);
        t.multiply(create2, create, create2);
        t.reduce32(b7.f.addBothTo(create2, create2, create2), create2);
        t.multiply(create3, uVar2.f17172x, create3);
        t.reduce32(b7.n.shiftUpBits(6, create3, 2, 0), create3);
        t.reduce32(b7.n.shiftUpBits(6, create4, 3, 0, create), create);
        u uVar4 = new u(create4);
        t.square(create2, uVar4.f17172x);
        int[] iArr2 = uVar4.f17172x;
        t.subtract(iArr2, create3, iArr2);
        int[] iArr3 = uVar4.f17172x;
        t.subtract(iArr3, create3, iArr3);
        u uVar5 = new u(create3);
        t.subtract(create3, uVar4.f17172x, uVar5.f17172x);
        int[] iArr4 = uVar5.f17172x;
        t.multiply(iArr4, create2, iArr4);
        int[] iArr5 = uVar5.f17172x;
        t.subtract(iArr5, create, iArr5);
        u uVar6 = new u(create2);
        t.twice(uVar.f17172x, uVar6.f17172x);
        if (!isOne) {
            int[] iArr6 = uVar6.f17172x;
            t.multiply(iArr6, uVar3.f17172x, iArr6);
        }
        return new v(curve, uVar4, uVar5, new org.bouncycastle.math.ec.f[]{uVar6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    v(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
