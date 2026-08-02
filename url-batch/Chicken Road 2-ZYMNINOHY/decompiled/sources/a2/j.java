package a2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0215t;
import d2.s;

/* loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0215t {
    public Dialog o;

    /* renamed from: p, reason: collision with root package name */
    public DialogInterface.OnCancelListener f4283p;

    /* renamed from: q, reason: collision with root package name */
    public AlertDialog f4284q;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0215t
    public final Dialog f() {
        Dialog dialog = this.o;
        if (dialog != null) {
            return dialog;
        }
        this.f4971f = false;
        if (this.f4284q == null) {
            Context context = getContext();
            s.c(context);
            this.f4284q = new AlertDialog.Builder(context).create();
        }
        return this.f4284q;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0215t, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4283p;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
