package androidx.lifecycle;

import android.os.Bundle;
import defpackage.aq;
import defpackage.b10;
import defpackage.t8;
import defpackage.up;
import defpackage.yp;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements yp {
    public final b10 a;

    public SavedStateHandleAttacher(b10 b10Var) {
        this.a = b10Var;
    }

    @Override // defpackage.yp
    public final void b(aq aqVar, up upVar) {
        if (upVar != up.ON_CREATE) {
            t8.s(upVar, "Next event must be ON_CREATE, it was ");
            return;
        }
        aqVar.e().f(this);
        b10 b10Var = this.a;
        if (b10Var.b) {
            return;
        }
        Bundle c = b10Var.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = b10Var.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c != null) {
            bundle.putAll(c);
        }
        b10Var.c = bundle;
        b10Var.b = true;
    }
}
