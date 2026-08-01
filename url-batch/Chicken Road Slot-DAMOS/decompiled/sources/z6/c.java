package z6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import c7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: d, reason: collision with root package name */
    public Dialog f10871d;

    /* renamed from: e, reason: collision with root package name */
    public DialogInterface.OnCancelListener f10872e;

    /* renamed from: i, reason: collision with root package name */
    public AlertDialog f10873i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10872e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f10871d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f10873i == null) {
            Activity activity = getActivity();
            c0.g(activity);
            this.f10873i = new AlertDialog.Builder(activity).create();
        }
        return this.f10873i;
    }
}
