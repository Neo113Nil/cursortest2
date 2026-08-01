package androidx.lifecycle;

import defpackage.gq;
import defpackage.lq;
import defpackage.nq;
import defpackage.o8;
import defpackage.te;
import defpackage.ue;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements lq {
    public final te a;
    public final lq b;

    public DefaultLifecycleObserverAdapter(te teVar, lq lqVar) {
        this.a = teVar;
        this.b = lqVar;
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        int i = ue.a[gqVar.ordinal()];
        if (i == 3) {
            this.a.a();
        } else if (i == 7) {
            o8.j("ON_ANY must not been send by anybody");
            return;
        }
        lq lqVar = this.b;
        if (lqVar != null) {
            lqVar.b(nqVar, gqVar);
        }
    }
}
