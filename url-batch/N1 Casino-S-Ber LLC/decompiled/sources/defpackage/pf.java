package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class pf extends jw {
    public final /* synthetic */ jk o;
    public final /* synthetic */ qf p;

    public pf(qf qfVar, jk jkVar) {
        this.p = qfVar;
        this.o = jkVar;
    }

    @Override // defpackage.jw
    public final View L(int i) {
        jk jkVar = this.o;
        if (jkVar.O()) {
            return jkVar.L(i);
        }
        Dialog dialog = this.p.j0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.jw
    public final boolean O() {
        return this.o.O() || this.p.n0;
    }
}
