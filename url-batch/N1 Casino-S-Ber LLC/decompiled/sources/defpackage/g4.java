package defpackage;

import android.app.Dialog;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class g4 extends qf {
    @Override // defpackage.qf
    public Dialog J() {
        return new f4(h(), this.d0);
    }

    @Override // defpackage.qf
    public final void K(Dialog dialog, int i) {
        if (!(dialog instanceof f4)) {
            super.K(dialog, i);
            return;
        }
        f4 f4Var = (f4) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        f4Var.f().g(1);
    }
}
