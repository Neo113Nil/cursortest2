package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class cw extends DialogFragment {
    public Dialog d;
    public DialogInterface.OnCancelListener e;
    public AlertDialog g;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.g == null) {
            Activity activity = getActivity();
            y90.i(activity);
            this.g = new AlertDialog.Builder(activity).create();
        }
        return this.g;
    }
}
