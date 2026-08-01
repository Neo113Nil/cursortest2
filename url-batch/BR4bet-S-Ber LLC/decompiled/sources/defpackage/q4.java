package defpackage;

import android.app.Dialog;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class q4 extends ph {
    @Override // defpackage.ph
    public Dialog J() {
        return new p4(h(), this.d0);
    }

    @Override // defpackage.ph
    public final void K(Dialog dialog, int i) {
        if (!(dialog instanceof p4)) {
            super.K(dialog, i);
            return;
        }
        p4 p4Var = (p4) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        p4Var.f().f(1);
    }
}
