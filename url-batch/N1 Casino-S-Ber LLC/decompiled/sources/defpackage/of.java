package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class of implements DialogInterface.OnDismissListener {
    public final /* synthetic */ qf f;

    public of(qf qfVar) {
        this.f = qfVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        qf qfVar = this.f;
        Dialog dialog = qfVar.j0;
        if (dialog != null) {
            qfVar.onDismiss(dialog);
        }
    }
}
