package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0043k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0045m f927a;

    public DialogInterfaceOnDismissListenerC0043k(DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m) {
        this.f927a = dialogInterfaceOnCancelListenerC0045m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = this.f927a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0045m.f939c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0045m.onDismiss(dialog);
        }
    }
}
