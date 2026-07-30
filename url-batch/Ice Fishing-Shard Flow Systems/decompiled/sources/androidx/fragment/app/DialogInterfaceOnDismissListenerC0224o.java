package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0224o implements DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0226q f3747d;

    public DialogInterfaceOnDismissListenerC0224o(DialogInterfaceOnCancelListenerC0226q dialogInterfaceOnCancelListenerC0226q) {
        this.f3747d = dialogInterfaceOnCancelListenerC0226q;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0226q dialogInterfaceOnCancelListenerC0226q = this.f3747d;
        Dialog dialog = dialogInterfaceOnCancelListenerC0226q.f3759j0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0226q.onDismiss(dialog);
        }
    }
}
