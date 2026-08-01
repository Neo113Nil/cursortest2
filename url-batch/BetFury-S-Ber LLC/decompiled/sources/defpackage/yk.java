package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class yk implements vc0 {
    public final vc0 a;
    public final int b;

    public yk(vc0 vc0Var, int i) {
        this.a = vc0Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.vc0
    public final Iterator iterator() {
        return new k(this);
    }
}
