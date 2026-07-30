package org.bouncycastle.math.ec.custom.gm;

import b7.h;
import b7.n;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class d extends i.c {
    d(e eVar, f fVar, f fVar2) {
        super(eVar, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.i
    public i add(i iVar) {
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
        e curve = getCurve();
        c cVar = (c) this.f17192x;
        c cVar2 = (c) this.f17193y;
        c cVar3 = (c) iVar.getXCoord();
        c cVar4 = (c) iVar.getYCoord();
        c cVar5 = (c) this.zs[0];
        c cVar6 = (c) iVar.getZCoord(0);
        int[] createExt = h.createExt();
        int[] create = h.create();
        int[] create2 = h.create();
        int[] create3 = h.create();
        boolean isOne = cVar5.isOne();
        if (isOne) {
            iArr = cVar3.f17144x;
            iArr2 = cVar4.f17144x;
        } else {
            b.square(cVar5.f17144x, create2);
            b.multiply(create2, cVar3.f17144x, create);
            b.multiply(create2, cVar5.f17144x, create2);
            b.multiply(create2, cVar4.f17144x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = cVar6.isOne();
        if (isOne2) {
            iArr3 = cVar.f17144x;
            iArr4 = cVar2.f17144x;
        } else {
            b.square(cVar6.f17144x, create3);
            b.multiply(create3, cVar.f17144x, createExt);
            b.multiply(create3, cVar6.f17144x, create3);
            b.multiply(create3, cVar2.f17144x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = h.create();
        b.subtract(iArr3, iArr, create4);
        b.subtract(iArr4, iArr2, create);
        if (h.isZero(create4)) {
            return h.isZero(create) ? twice() : curve.getInfinity();
        }
        b.square(create4, create2);
        int[] create5 = h.create();
        b.multiply(create2, create4, create5);
        b.multiply(create2, iArr3, create2);
        b.negate(create5, create5);
        h.mul(iArr4, create5, createExt);
        b.reduce32(h.addBothTo(create2, create2, create5), create5);
        c cVar7 = new c(create3);
        b.square(create, cVar7.f17144x);
        int[] iArr5 = cVar7.f17144x;
        b.subtract(iArr5, create5, iArr5);
        c cVar8 = new c(create5);
        b.subtract(create2, cVar7.f17144x, cVar8.f17144x);
        b.multiplyAddToExt(cVar8.f17144x, create, createExt);
        b.reduce(createExt, cVar8.f17144x);
        c cVar9 = new c(create4);
        if (!isOne) {
            int[] iArr6 = cVar9.f17144x;
            b.multiply(iArr6, cVar5.f17144x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = cVar9.f17144x;
            b.multiply(iArr7, cVar6.f17144x, iArr7);
        }
        return new d(curve, cVar7, cVar8, new f[]{cVar9});
    }

    @Override // org.bouncycastle.math.ec.i
    protected i detach() {
        return new d(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.i
    public i negate() {
        return isInfinity() ? this : new d(this.curve, this.f17192x, this.f17193y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.i
    public i threeTimes() {
        return (isInfinity() || this.f17193y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.i
    public i twice() {
        if (isInfinity()) {
            return this;
        }
        e curve = getCurve();
        c cVar = (c) this.f17193y;
        if (cVar.isZero()) {
            return curve.getInfinity();
        }
        c cVar2 = (c) this.f17192x;
        c cVar3 = (c) this.zs[0];
        int[] create = h.create();
        int[] create2 = h.create();
        int[] create3 = h.create();
        b.square(cVar.f17144x, create3);
        int[] create4 = h.create();
        b.square(create3, create4);
        boolean isOne = cVar3.isOne();
        int[] iArr = cVar3.f17144x;
        if (!isOne) {
            b.square(iArr, create2);
            iArr = create2;
        }
        b.subtract(cVar2.f17144x, iArr, create);
        b.add(cVar2.f17144x, iArr, create2);
        b.multiply(create2, create, create2);
        b.reduce32(h.addBothTo(create2, create2, create2), create2);
        b.multiply(create3, cVar2.f17144x, create3);
        b.reduce32(n.shiftUpBits(8, create3, 2, 0), create3);
        b.reduce32(n.shiftUpBits(8, create4, 3, 0, create), create);
        c cVar4 = new c(create4);
        b.square(create2, cVar4.f17144x);
        int[] iArr2 = cVar4.f17144x;
        b.subtract(iArr2, create3, iArr2);
        int[] iArr3 = cVar4.f17144x;
        b.subtract(iArr3, create3, iArr3);
        c cVar5 = new c(create3);
        b.subtract(create3, cVar4.f17144x, cVar5.f17144x);
        int[] iArr4 = cVar5.f17144x;
        b.multiply(iArr4, create2, iArr4);
        int[] iArr5 = cVar5.f17144x;
        b.subtract(iArr5, create, iArr5);
        c cVar6 = new c(create2);
        b.twice(cVar.f17144x, cVar6.f17144x);
        if (!isOne) {
            int[] iArr6 = cVar6.f17144x;
            b.multiply(iArr6, cVar3.f17144x, iArr6);
        }
        return new d(curve, cVar4, cVar5, new f[]{cVar6});
    }

    @Override // org.bouncycastle.math.ec.i
    public i twicePlus(i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twice().add(iVar);
    }

    d(e eVar, f fVar, f fVar2, f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
