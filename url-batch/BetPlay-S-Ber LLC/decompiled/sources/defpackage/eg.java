package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class eg implements i20 {
    public final i20 a;
    public final int b;

    public eg(i20 i20Var, int i) {
        this.a = i20Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.i20
    public final Iterator iterator() {
        return new h(this);
    }
}
