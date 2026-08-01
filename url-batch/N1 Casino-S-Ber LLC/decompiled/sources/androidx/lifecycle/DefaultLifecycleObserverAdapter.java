package androidx.lifecycle;

import defpackage.aq;
import defpackage.se;
import defpackage.t8;
import defpackage.te;
import defpackage.up;
import defpackage.yp;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements yp {
    public final se a;
    public final yp b;

    public DefaultLifecycleObserverAdapter(se seVar, yp ypVar) {
        this.a = seVar;
        this.b = ypVar;
    }

    @Override // defpackage.yp
    public final void b(aq aqVar, up upVar) {
        int i = te.a[upVar.ordinal()];
        if (i == 3) {
            this.a.a();
        } else if (i == 7) {
            t8.k("ON_ANY must not been send by anybody");
            return;
        }
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.b(aqVar, upVar);
        }
    }
}
