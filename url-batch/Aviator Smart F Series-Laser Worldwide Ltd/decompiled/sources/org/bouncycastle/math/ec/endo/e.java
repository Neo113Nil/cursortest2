package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.r;

/* loaded from: classes5.dex */
public class e implements d {
    protected final f parameters;
    protected final j pointMap;

    public e(org.bouncycastle.math.ec.e eVar, f fVar) {
        this.parameters = fVar;
        this.pointMap = new r(eVar.fromBigInteger(fVar.getBeta()));
    }

    @Override // org.bouncycastle.math.ec.endo.d
    public BigInteger[] decomposeScalar(BigInteger bigInteger) {
        return c.decomposeScalar(this.parameters.getSplitParams(), bigInteger);
    }

    @Override // org.bouncycastle.math.ec.endo.d, org.bouncycastle.math.ec.endo.a
    public j getPointMap() {
        return this.pointMap;
    }

    @Override // org.bouncycastle.math.ec.endo.d, org.bouncycastle.math.ec.endo.a
    public boolean hasEfficientPointMap() {
        return true;
    }
}
