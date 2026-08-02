package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class eb extends ar {
    @Override // defpackage.ar
    public Dialog a(Bundle bundle) {
        return new ea(x(), this.c);
    }

    @Override // defpackage.ar
    public final void n(Dialog dialog, int i) {
        if (!(dialog instanceof ea)) {
            super.n(dialog, i);
            return;
        }
        ea eaVar = (ea) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        eaVar.d();
    }
}
