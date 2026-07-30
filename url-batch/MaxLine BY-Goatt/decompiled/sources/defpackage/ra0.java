package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ra0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ ta0 m;

    public ra0(ta0 ta0Var) {
        this.m = ta0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        ta0 ta0Var = this.m;
        dialog = ta0Var.mDialog;
        if (dialog != null) {
            dialog2 = ta0Var.mDialog;
            ta0Var.onDismiss(dialog2);
        }
    }
}
