package j4;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: f, reason: collision with root package name */
    public Dialog f5006f;

    /* renamed from: g, reason: collision with root package name */
    public DialogInterface.OnCancelListener f5007g;

    /* renamed from: h, reason: collision with root package name */
    public AlertDialog f5008h;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5007g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f5006f;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f5008h == null) {
            Activity activity = getActivity();
            m4.o.d(activity);
            this.f5008h = new AlertDialog.Builder(activity).create();
        }
        return this.f5008h;
    }
}
