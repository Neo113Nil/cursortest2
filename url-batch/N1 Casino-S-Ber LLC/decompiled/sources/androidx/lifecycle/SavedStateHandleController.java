package androidx.lifecycle;

import defpackage.aq;
import defpackage.up;
import defpackage.yp;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements yp {
    public boolean a;

    @Override // defpackage.yp
    public final void b(aq aqVar, up upVar) {
        if (upVar == up.ON_DESTROY) {
            this.a = false;
            aqVar.e().f(this);
        }
    }
}
