package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ki0 extends DialogFragment {
    public Dialog m;
    public DialogInterface.OnCancelListener n;
    public AlertDialog o;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.n;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.m;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.o == null) {
            Activity activity = getActivity();
            ll3.v(activity);
            this.o = new AlertDialog.Builder(activity).create();
        }
        return this.o;
    }
}
