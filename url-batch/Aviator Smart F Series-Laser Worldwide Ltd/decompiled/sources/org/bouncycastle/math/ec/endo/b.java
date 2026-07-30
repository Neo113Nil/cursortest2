package org.bouncycastle.math.ec.endo;

import org.bouncycastle.math.ec.i;
import org.bouncycastle.math.ec.q;

/* loaded from: classes5.dex */
public class b implements q {
    protected a endomorphism;
    protected i mappedPoint;

    public a getEndomorphism() {
        return this.endomorphism;
    }

    public i getMappedPoint() {
        return this.mappedPoint;
    }

    public void setEndomorphism(a aVar) {
        this.endomorphism = aVar;
    }

    public void setMappedPoint(i iVar) {
        this.mappedPoint = iVar;
    }
}
