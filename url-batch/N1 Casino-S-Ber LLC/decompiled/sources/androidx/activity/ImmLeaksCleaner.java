package androidx.activity;

import defpackage.aq;
import defpackage.u1;
import defpackage.up;
import defpackage.x40;
import defpackage.yp;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements yp {
    public static final /* synthetic */ int a = 0;

    static {
        new x40(new u1(1));
    }

    @Override // defpackage.yp
    public final void b(aq aqVar, up upVar) {
        if (upVar == up.ON_DESTROY) {
            throw null;
        }
    }
}
