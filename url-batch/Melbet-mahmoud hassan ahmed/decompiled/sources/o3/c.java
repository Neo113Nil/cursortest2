package o3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: f, reason: collision with root package name */
    private Dialog f19847f;

    /* renamed from: g, reason: collision with root package name */
    private DialogInterface.OnCancelListener f19848g;

    /* renamed from: h, reason: collision with root package name */
    private Dialog f19849h;

    public static c a(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) r3.o.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f19847f = dialog2;
        if (onCancelListener != null) {
            cVar.f19848g = onCancelListener;
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f19848g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f19847f;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f19849h == null) {
            this.f19849h = new AlertDialog.Builder(getActivity()).create();
        }
        return this.f19849h;
    }

    @Override // android.app.DialogFragment
    public void show(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
