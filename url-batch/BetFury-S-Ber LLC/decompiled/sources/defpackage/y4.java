package defpackage;

import android.app.Dialog;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class y4 extends vj {
    @Override // defpackage.vj
    public Dialog J() {
        return new x4(h(), this.d0);
    }

    @Override // defpackage.vj
    public final void K(Dialog dialog, int i) {
        if (!(dialog instanceof x4)) {
            super.K(dialog, i);
            return;
        }
        x4 x4Var = (x4) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        x4Var.f().h(1);
    }
}
