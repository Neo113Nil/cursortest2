package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class mg implements y10 {
    public final y10 a;
    public final int b;

    public mg(y10 y10Var, int i) {
        this.a = y10Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.y10
    public final Iterator iterator() {
        return new h(this);
    }
}
