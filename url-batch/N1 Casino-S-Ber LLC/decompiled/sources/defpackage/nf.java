package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class nf implements DialogInterface.OnCancelListener {
    public final /* synthetic */ qf f;

    public nf(qf qfVar) {
        this.f = qfVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        qf qfVar = this.f;
        Dialog dialog = qfVar.j0;
        if (dialog != null) {
            qfVar.onCancel(dialog);
        }
    }
}
