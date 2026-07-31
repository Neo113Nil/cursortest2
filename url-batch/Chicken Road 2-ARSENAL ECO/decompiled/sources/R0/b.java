package R0;

import U0.t;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: f, reason: collision with root package name */
    public Dialog f2056f;

    /* renamed from: g, reason: collision with root package name */
    public DialogInterface.OnCancelListener f2057g;

    /* renamed from: h, reason: collision with root package name */
    public AlertDialog f2058h;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2057g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f2056f;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f2058h == null) {
            Activity activity = getActivity();
            t.f(activity);
            this.f2058h = new AlertDialog.Builder(activity).create();
        }
        return this.f2058h;
    }
}
