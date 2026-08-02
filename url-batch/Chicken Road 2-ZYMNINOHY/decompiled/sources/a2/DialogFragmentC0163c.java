package a2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import d2.s;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogFragmentC0163c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f4268a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f4269b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f4270c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4269b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f4268a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f4270c == null) {
            Activity activity = getActivity();
            s.c(activity);
            this.f4270c = new AlertDialog.Builder(activity).create();
        }
        return this.f4270c;
    }
}
