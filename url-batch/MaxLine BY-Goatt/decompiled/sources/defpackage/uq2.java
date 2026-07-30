package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class uq2 extends ta0 {
    public Dialog m;
    public DialogInterface.OnCancelListener n;
    public AlertDialog o;

    @Override // defpackage.ta0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.n;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // defpackage.ta0
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.m;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.o == null) {
            Context context = getContext();
            ll3.v(context);
            this.o = new AlertDialog.Builder(context).create();
        }
        return this.o;
    }
}
