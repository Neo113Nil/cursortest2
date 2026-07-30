package org.bouncycastle.math.ec.custom.djb;

import b7.h;
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
        c cVar3 = (c) this.zs[0];
        c cVar4 = (c) iVar.getXCoord();
        c cVar5 = (c) iVar.getYCoord();
        c cVar6 = (c) iVar.getZCoord(0);
        int[] createExt = h.createExt();
        int[] create = h.create();
        int[] create2 = h.create();
        int[] create3 = h.create();
        boolean isOne = cVar3.isOne();
        if (isOne) {
            iArr = cVar4.f17142x;
            iArr2 = cVar5.f17142x;
        } else {
            b.square(cVar3.f17142x, create2);
            b.multiply(create2, cVar4.f17142x, create);
            b.multiply(create2, cVar3.f17142x, create2);
            b.multiply(create2, cVar5.f17142x, create2);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = cVar6.isOne();
        if (isOne2) {
            iArr3 = cVar.f17142x;
            iArr4 = cVar2.f17142x;
        } else {
            b.square(cVar6.f17142x, create3);
            b.multiply(create3, cVar.f17142x, createExt);
            b.multiply(create3, cVar6.f17142x, create3);
            b.multiply(create3, cVar2.f17142x, create3);
            iArr3 = createExt;
            iArr4 = create3;
        }
        int[] create4 = h.create();
        b.subtract(iArr3, iArr, create4);
        b.subtract(iArr4, iArr2, create);
        if (h.isZero(create4)) {
            return h.isZero(create) ? twice() : curve.getInfinity();
        }
        int[] create5 = h.create();
        b.square(create4, create5);
        int[] create6 = h.create();
        b.multiply(create5, create4, create6);
        b.multiply(create5, iArr3, create2);
        b.negate(create6, create6);
        h.mul(iArr4, create6, createExt);
        b.reduce27(h.addBothTo(create2, create2, create6), create6);
        c cVar7 = new c(create3);
        b.square(create, cVar7.f17142x);
        int[] iArr5 = cVar7.f17142x;
        b.subtract(iArr5, create6, iArr5);
        c cVar8 = new c(create6);
        b.subtract(create2, cVar7.f17142x, cVar8.f17142x);
        b.multiplyAddToExt(cVar8.f17142x, create, createExt);
        b.reduce(createExt, cVar8.f17142x);
        c cVar9 = new c(create4);
        if (!isOne) {
            int[] iArr6 = cVar9.f17142x;
            b.multiply(iArr6, cVar3.f17142x, iArr6);
        }
        if (!isOne2) {
            int[] iArr7 = cVar9.f17142x;
            b.multiply(iArr7, cVar6.f17142x, iArr7);
        }
        if (!isOne || !isOne2) {
            create5 = null;
        }
        return new d(curve, cVar7, cVar8, new f[]{cVar9, calculateJacobianModifiedW(cVar9, create5)});
    }

    protected c calculateJacobianModifiedW(c cVar, int[] iArr) {
        c cVar2 = (c) getCurve().getA();
        if (cVar.isOne()) {
            return cVar2;
        }
        c cVar3 = new c();
        if (iArr == null) {
            iArr = cVar3.f17142x;
            b.square(cVar.f17142x, iArr);
        }
        b.square(iArr, cVar3.f17142x);
        int[] iArr2 = cVar3.f17142x;
        b.multiply(iArr2, cVar2.f17142x, iArr2);
        return cVar3;
    }

    @Override // org.bouncycastle.math.ec.i
    protected i detach() {
        return new d(null, getAffineXCoord(), getAffineYCoord());
    }

    protected c getJacobianModifiedW() {
        f[] fVarArr = this.zs;
        c cVar = (c) fVarArr[1];
        if (cVar != null) {
            return cVar;
        }
        c calculateJacobianModifiedW = calculateJacobianModifiedW((c) fVarArr[0], null);
        fVarArr[1] = calculateJacobianModifiedW;
        return calculateJacobianModifiedW;
    }

    @Override // org.bouncycastle.math.ec.i
    public f getZCoord(int i8) {
        return i8 == 1 ? getJacobianModifiedW() : super.getZCoord(i8);
    }

    @Override // org.bouncycastle.math.ec.i
    public i negate() {
        return isInfinity() ? this : new d(getCurve(), this.f17192x, this.f17193y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.i
    public i threeTimes() {
        return (isInfinity() || this.f17193y.isZero()) ? this : twiceJacobianModified(false).add(this);
    }

    @Override // org.bouncycastle.math.ec.i
    public i twice() {
        if (isInfinity()) {
            return this;
        }
        return this.f17193y.isZero() ? getCurve().getInfinity() : twiceJacobianModified(true);
    }

    protected d twiceJacobianModified(boolean z7) {
        c cVar;
        c cVar2 = (c) this.f17192x;
        c cVar3 = (c) this.f17193y;
        c cVar4 = (c) this.zs[0];
        c jacobianModifiedW = getJacobianModifiedW();
        int[] create = h.create();
        b.square(cVar2.f17142x, create);
        b.reduce27(h.addBothTo(create, create, create) + h.addTo(jacobianModifiedW.f17142x, create), create);
        int[] create2 = h.create();
        b.twice(cVar3.f17142x, create2);
        int[] create3 = h.create();
        b.multiply(create2, cVar3.f17142x, create3);
        int[] create4 = h.create();
        b.multiply(create3, cVar2.f17142x, create4);
        b.twice(create4, create4);
        int[] create5 = h.create();
        b.square(create3, create5);
        b.twice(create5, create5);
        c cVar5 = new c(create3);
        b.square(create, cVar5.f17142x);
        int[] iArr = cVar5.f17142x;
        b.subtract(iArr, create4, iArr);
        int[] iArr2 = cVar5.f17142x;
        b.subtract(iArr2, create4, iArr2);
        c cVar6 = new c(create4);
        b.subtract(create4, cVar5.f17142x, cVar6.f17142x);
        int[] iArr3 = cVar6.f17142x;
        b.multiply(iArr3, create, iArr3);
        int[] iArr4 = cVar6.f17142x;
        b.subtract(iArr4, create5, iArr4);
        c cVar7 = new c(create2);
        if (!h.isOne(cVar4.f17142x)) {
            int[] iArr5 = cVar7.f17142x;
            b.multiply(iArr5, cVar4.f17142x, iArr5);
        }
        if (z7) {
            cVar = new c(create5);
            int[] iArr6 = cVar.f17142x;
            b.multiply(iArr6, jacobianModifiedW.f17142x, iArr6);
            int[] iArr7 = cVar.f17142x;
            b.twice(iArr7, iArr7);
        } else {
            cVar = null;
        }
        return new d(getCurve(), cVar5, cVar6, new f[]{cVar7, cVar});
    }

    @Override // org.bouncycastle.math.ec.i
    public i twicePlus(i iVar) {
        return this == iVar ? threeTimes() : isInfinity() ? iVar : iVar.isInfinity() ? twice() : this.f17193y.isZero() ? iVar : twiceJacobianModified(false).add(iVar);
    }

    d(e eVar, f fVar, f fVar2, f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }
}
