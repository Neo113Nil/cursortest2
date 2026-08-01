package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0042k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m f1036a;

    public DialogInterfaceOnDismissListenerC0042k(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m) {
        this.f1036a = dialogInterfaceOnCancelListenerC0044m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = this.f1036a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0044m.f1048c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0044m.onDismiss(dialog);
        }
    }
}
