package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmf extends ar {
    public Dialog aj;
    public DialogInterface.OnCancelListener ak;
    private Dialog al;

    @Override // defpackage.ar
    public final Dialog a(Bundle bundle) {
        Dialog dialog = this.aj;
        if (dialog != null) {
            return dialog;
        }
        this.d = false;
        if (this.al == null) {
            Context x = x();
            oy.at(x);
            this.al = new AlertDialog.Builder(x).create();
        }
        return this.al;
    }

    @Override // defpackage.ar, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ak;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
