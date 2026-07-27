package l1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import o1.u;

/* loaded from: classes.dex */
public final class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f11003a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f11004b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f11005c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11004b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f11003a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f11005c == null) {
            Activity activity = getActivity();
            u.g(activity);
            this.f11005c = new AlertDialog.Builder(activity).create();
        }
        return this.f11005c;
    }
}
