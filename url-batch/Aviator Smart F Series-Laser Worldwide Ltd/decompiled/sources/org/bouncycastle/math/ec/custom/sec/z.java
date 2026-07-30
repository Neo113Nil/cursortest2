package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class z extends i.c {
    z(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        y yVar = (y) this.f17192x;
        y yVar2 = (y) this.f17193y;
        y yVar3 = (y) iVar.getXCoord();
        y yVar4 = (y) iVar.getYCoord();
        y yVar5 = (y) this.zs[0];
        y yVar6 = (y) iVar.getZCoord(0);
        int[] createExt = b7.g.createExt();
        int[] create = b7.g.create();
        int[] create2 = b7.g.create();
        int[] create3 = b7.g.create();
        boolean isOne = yVar5.isOne();
        if (isOne) {
            iArr = yVar3.f17176x;
            iArr2 = yVar4.f17176x;
        } else {
            x.square(yVar5.f17176x, create2);
            x.multiply(create2, yVar3.f17176x, create);
            x.multiply(create2, yVar5.f17176x, create2);
            x.multiply(create2, yVar4.f17176x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = yVar6.isOne();
        if (isOne2) {
            iArr3 = yVar.f17176x;
            iArr4 = yVar2.f17176x;
        } else {
            x.square(yVar6.f17176x, create3);
            x.multiply(create3, yVar.f17176x, createExt);
            x.multiply(create3, yVar6.f17176x, create3);
            x.multiply(create3, yVar2.f17176x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = b7.g.create();
        x.subtract(iArr3, iArr, create4);
        x.subtract(iArr4, iArr2, create);
        if (b7.g.isZero(create4)) {
            return b7.g.isZero(create) ? twice() : curve.getInfinity();
        }
        x.square(create4, create2);
        int[] create5 = b7.g.create();
        x.multiply(create2, create4, create5);
        x.multiply(create2, iArr3, create2);
        x.negate(create5, create5);
        b7.g.mul(iArr4, create5, createExt);
        x.reduce32(b7.g.addBothTo(create2, create2, create5), create5);
        y yVar7 = new y(create3);
        x.square(create, yVar7.f17176x);
        int[] iArr5 = yVar7.f17176x;
        x.subtract(iArr5, create5, iArr5);
        y yVar8 = new y(create5);
        x.subtract(create2, yVar7.f17176x, yVar8.f17176x);
        x.multiplyAddToExt(yVar8.f17176x, create, createExt);
        x.reduce(createExt, yVar8.f17176x);
        y yVar9 = new y(create4);
        if (!isOne) {
            int[] iArr6 = yVar9.f17176x;
            x.multiply(iArr6, yVar5.f17176x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = yVar9.f17176x;
            x.multiply(iArr7, yVar6.f17176x, iArr7);
        }
        return new z(curve, yVar7, yVar8, new org.bouncycastle.math.ec.f[]{yVar9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new z(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new z(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
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
        y yVar = (y) this.f17193y;
        if (yVar.isZero()) {
            return curve.getInfinity();
        }
        y yVar2 = (y) this.f17192x;
        y yVar3 = (y) this.zs[0];
        int[] create = b7.g.create();
        x.square(yVar.f17176x, create);
        int[] create2 = b7.g.create();
        x.square(create, create2);
        int[] create3 = b7.g.create();
        x.square(yVar2.f17176x, create3);
        x.reduce32(b7.g.addBothTo(create3, create3, create3), create3);
        x.multiply(create, yVar2.f17176x, create);
        x.reduce32(b7.n.shiftUpBits(7, create, 2, 0), create);
        int[] create4 = b7.g.create();
        x.reduce32(b7.n.shiftUpBits(7, create2, 3, 0, create4), create4);
        y yVar4 = new y(create2);
        x.square(create3, yVar4.f17176x);
        int[] iArr = yVar4.f17176x;
        x.subtract(iArr, create, iArr);
        int[] iArr2 = yVar4.f17176x;
        x.subtract(iArr2, create, iArr2);
        y yVar5 = new y(create);
        x.subtract(create, yVar4.f17176x, yVar5.f17176x);
        int[] iArr3 = yVar5.f17176x;
        x.multiply(iArr3, create3, iArr3);
        int[] iArr4 = yVar5.f17176x;
        x.subtract(iArr4, create4, iArr4);
        y yVar6 = new y(create3);
        x.twice(yVar.f17176x, yVar6.f17176x);
        if (!yVar3.isOne()) {
            int[] iArr5 = yVar6.f17176x;
            x.multiply(iArr5, yVar3.f17176x, iArr5);
        }
        return new z(curve, yVar4, yVar5, new org.bouncycastle.math.ec.f[]{yVar6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    z(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
