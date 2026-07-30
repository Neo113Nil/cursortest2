package q1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.C0232x;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0226q;
import i.AbstractActivityC0525l;
import t1.u;

/* loaded from: classes.dex */
public class i extends DialogInterfaceOnCancelListenerC0226q {

    /* renamed from: o0, reason: collision with root package name */
    public Dialog f7335o0;

    /* renamed from: p0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f7336p0;

    /* renamed from: q0, reason: collision with root package name */
    public AlertDialog f7337q0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0226q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7336p0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0226q
    public final Dialog x() {
        Dialog dialog = this.f7335o0;
        if (dialog != null) {
            return dialog;
        }
        this.f3755f0 = false;
        if (this.f7337q0 == null) {
            C0232x c0232x = this.f3776B;
            AbstractActivityC0525l abstractActivityC0525l = c0232x == null ? null : c0232x.f3823e;
            u.f(abstractActivityC0525l);
            this.f7337q0 = new AlertDialog.Builder(abstractActivityC0525l).create();
        }
        return this.f7337q0;
    }
}
