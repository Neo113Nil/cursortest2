package E1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: d, reason: collision with root package name */
    public AlertDialog f2281d;

    /* renamed from: e, reason: collision with root package name */
    public DialogInterface.OnCancelListener f2282e;

    /* renamed from: i, reason: collision with root package name */
    public AlertDialog f2283i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2282e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f2281d;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f2283i == null) {
            Activity activity = getActivity();
            H1.o.d(activity);
            this.f2283i = new AlertDialog.Builder(activity).create();
        }
        return this.f2283i;
    }
}
