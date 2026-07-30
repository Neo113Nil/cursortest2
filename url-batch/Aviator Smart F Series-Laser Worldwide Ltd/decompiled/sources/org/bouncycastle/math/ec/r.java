package org.bouncycastle.math.ec;

/* loaded from: classes5.dex */
public class r implements j {
    protected final f scale;

    public r(f fVar) {
        this.scale = fVar;
    }

    @Override // org.bouncycastle.math.ec.j
    public i map(i iVar) {
        return iVar.scaleX(this.scale);
    }
}
