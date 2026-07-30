package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r30 implements x32, s30 {
    public final x32 PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public r30(x32 x32Var, int i) {
        x32Var.getClass();
        this.PxuCJdSBwIXG = x32Var;
        this.lS5Rgt96tfkO = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.s30
    public final x32 PxuCJdSBwIXG(int i) {
        int i2 = this.lS5Rgt96tfkO + i;
        return i2 < 0 ? new r30(this, i) : new r30(this.PxuCJdSBwIXG, i2);
    }

    @Override // defpackage.x32
    public final Iterator iterator() {
        return new q30(this);
    }
}
