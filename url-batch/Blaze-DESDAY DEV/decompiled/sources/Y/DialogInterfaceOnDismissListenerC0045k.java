package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0045k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0047m f1083a;

    public DialogInterfaceOnDismissListenerC0045k(DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m) {
        this.f1083a = dialogInterfaceOnCancelListenerC0047m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m = this.f1083a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0047m.f1095c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0047m.onDismiss(dialog);
        }
    }
}
