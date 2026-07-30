package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class p60 extends DialogFragment {
    public DialogInterface.OnCancelListener OPXfSBeufaJ8;
    public Dialog rtx2ld2ELZv4;
    public AlertDialog wdg6QnbFHrFF;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.OPXfSBeufaJ8;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.rtx2ld2ELZv4;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.wdg6QnbFHrFF == null) {
            Activity activity = getActivity();
            jh0.x50lh2ztY7Y5(activity);
            this.wdg6QnbFHrFF = new AlertDialog.Builder(activity).create();
        }
        return this.wdg6QnbFHrFF;
    }
}
