package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class uj extends bi {
    public final /* synthetic */ up o;
    public final /* synthetic */ vj p;

    public uj(vj vjVar, up upVar) {
        this.p = vjVar;
        this.o = upVar;
    }

    @Override // defpackage.bi
    public final View M(int i) {
        up upVar = this.o;
        if (upVar.P()) {
            return upVar.M(i);
        }
        Dialog dialog = this.p.j0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.bi
    public final boolean P() {
        return this.o.P() || this.p.n0;
    }
}
