package K0;

import N0.r;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog f839a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f840b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f841c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f840b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f839a;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f841c == null) {
            Activity activity = getActivity();
            r.c(activity);
            this.f841c = new AlertDialog.Builder(activity).create();
        }
        return this.f841c;
    }
}
