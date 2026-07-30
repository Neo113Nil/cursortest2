package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class r extends i.c {
    r(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
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
        q qVar = (q) this.f17192x;
        q qVar2 = (q) this.f17193y;
        q qVar3 = (q) iVar.getXCoord();
        q qVar4 = (q) iVar.getYCoord();
        q qVar5 = (q) this.zs[0];
        q qVar6 = (q) iVar.getZCoord(0);
        int[] createExt = b7.f.createExt();
        int[] create = b7.f.create();
        int[] create2 = b7.f.create();
        int[] create3 = b7.f.create();
        boolean isOne = qVar5.isOne();
        if (isOne) {
            iArr = qVar3.f17167x;
            iArr2 = qVar4.f17167x;
        } else {
            p.square(qVar5.f17167x, create2);
            p.multiply(create2, qVar3.f17167x, create);
            p.multiply(create2, qVar5.f17167x, create2);
            p.multiply(create2, qVar4.f17167x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = qVar6.isOne();
        if (isOne2) {
            iArr3 = qVar.f17167x;
            iArr4 = qVar2.f17167x;
        } else {
            p.square(qVar6.f17167x, create3);
            p.multiply(create3, qVar.f17167x, createExt);
            p.multiply(create3, qVar6.f17167x, create3);
            p.multiply(create3, qVar2.f17167x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = b7.f.create();
        p.subtract(iArr3, iArr, create4);
        p.subtract(iArr4, iArr2, create);
        if (b7.f.isZero(create4)) {
            return b7.f.isZero(create) ? twice() : curve.getInfinity();
        }
        p.square(create4, create2);
        int[] create5 = b7.f.create();
        p.multiply(create2, create4, create5);
        p.multiply(create2, iArr3, create2);
        p.negate(create5, create5);
        b7.f.mul(iArr4, create5, createExt);
        p.reduce32(b7.f.addBothTo(create2, create2, create5), create5);
        q qVar7 = new q(create3);
        p.square(create, qVar7.f17167x);
        int[] iArr5 = qVar7.f17167x;
        p.subtract(iArr5, create5, iArr5);
        q qVar8 = new q(create5);
        p.subtract(create2, qVar7.f17167x, qVar8.f17167x);
        p.multiplyAddToExt(qVar8.f17167x, create, createExt);
        p.reduce(createExt, qVar8.f17167x);
        q qVar9 = new q(create4);
        if (!isOne) {
            int[] iArr6 = qVar9.f17167x;
            p.multiply(iArr6, qVar5.f17167x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = qVar9.f17167x;
            p.multiply(iArr7, qVar6.f17167x, iArr7);
        }
        return new r(curve, qVar7, qVar8, new org.bouncycastle.math.ec.f[]{qVar9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected org.bouncycastle.math.ec.i detach() {
        return new r(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i negate() {
        return isInfinity() ? this : new r(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
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
        q qVar = (q) this.f17193y;
        if (qVar.isZero()) {
            return curve.getInfinity();
        }
        q qVar2 = (q) this.f17192x;
        q qVar3 = (q) this.zs[0];
        int[] create = b7.f.create();
        p.square(qVar.f17167x, create);
        int[] create2 = b7.f.create();
        p.square(create, create2);
        int[] create3 = b7.f.create();
        p.square(qVar2.f17167x, create3);
        p.reduce32(b7.f.addBothTo(create3, create3, create3), create3);
        p.multiply(create, qVar2.f17167x, create);
        p.reduce32(b7.n.shiftUpBits(6, create, 2, 0), create);
        int[] create4 = b7.f.create();
        p.reduce32(b7.n.shiftUpBits(6, create2, 3, 0, create4), create4);
        q qVar4 = new q(create2);
        p.square(create3, qVar4.f17167x);
        int[] iArr = qVar4.f17167x;
        p.subtract(iArr, create, iArr);
        int[] iArr2 = qVar4.f17167x;
        p.subtract(iArr2, create, iArr2);
        q qVar5 = new q(create);
        p.subtract(create, qVar4.f17167x, qVar5.f17167x);
        int[] iArr3 = qVar5.f17167x;
        p.multiply(iArr3, create3, iArr3);
        int[] iArr4 = qVar5.f17167x;
        p.subtract(iArr4, create4, iArr4);
        q qVar6 = new q(create3);
        p.twice(qVar.f17167x, qVar6.f17167x);
        if (!qVar3.isOne()) {
            int[] iArr5 = qVar6.f17167x;
            p.multiply(iArr5, qVar3.f17167x, iArr5);
        }
        return new r(curve, qVar4, qVar5, new org.bouncycastle.math.ec.f[]{qVar6});
    }

    @Override // org.bouncycastle.math.ec.i
    public org.bouncycastle.math.ec.i twicePlus(org.bouncycastle.math.ec.i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    r(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
