package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sj implements DialogInterface.OnDismissListener {
    public final /* synthetic */ vj f;

    public sj(vj vjVar) {
        this.f = vjVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        vj vjVar = this.f;
        Dialog dialog = vjVar.j0;
        if (dialog != null) {
            vjVar.onDismiss(dialog);
        }
    }
}
