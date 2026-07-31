package o3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class m extends androidx.fragment.app.c {

    /* renamed from: o0, reason: collision with root package name */
    private Dialog f19867o0;

    /* renamed from: p0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f19868p0;

    /* renamed from: q0, reason: collision with root package name */
    private Dialog f19869q0;

    public static m p1(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) r3.o.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.f19867o0 = dialog2;
        if (onCancelListener != null) {
            mVar.f19868p0 = onCancelListener;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.c
    public Dialog l1(Bundle bundle) {
        Dialog dialog = this.f19867o0;
        if (dialog != null) {
            return dialog;
        }
        m1(false);
        if (this.f19869q0 == null) {
            this.f19869q0 = new AlertDialog.Builder(g()).create();
        }
        return this.f19869q0;
    }

    @Override // androidx.fragment.app.c
    public void o1(@RecentlyNonNull androidx.fragment.app.i iVar, String str) {
        super.o1(iVar, str);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f19868p0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
