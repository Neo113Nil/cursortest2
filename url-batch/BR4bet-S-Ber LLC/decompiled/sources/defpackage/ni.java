package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ni implements x40 {
    public final x40 a;
    public final int b;

    public ni(x40 x40Var, int i) {
        this.a = x40Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.x40
    public final Iterator iterator() {
        return new j(this);
    }
}
