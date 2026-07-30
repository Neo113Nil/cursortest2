package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0223n implements DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0226q f3746d;

    public DialogInterfaceOnCancelListenerC0223n(DialogInterfaceOnCancelListenerC0226q dialogInterfaceOnCancelListenerC0226q) {
        this.f3746d = dialogInterfaceOnCancelListenerC0226q;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0226q dialogInterfaceOnCancelListenerC0226q = this.f3746d;
        Dialog dialog = dialogInterfaceOnCancelListenerC0226q.f3759j0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0226q.onCancel(dialog);
        }
    }
}
