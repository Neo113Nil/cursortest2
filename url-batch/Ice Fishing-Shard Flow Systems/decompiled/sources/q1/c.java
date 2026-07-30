package q1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import t1.u;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: d, reason: collision with root package name */
    public Dialog f7315d;

    /* renamed from: e, reason: collision with root package name */
    public DialogInterface.OnCancelListener f7316e;

    /* renamed from: i, reason: collision with root package name */
    public AlertDialog f7317i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7316e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7315d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f7317i == null) {
            Activity activity = getActivity();
            u.f(activity);
            this.f7317i = new AlertDialog.Builder(activity).create();
        }
        return this.f7317i;
    }
}
