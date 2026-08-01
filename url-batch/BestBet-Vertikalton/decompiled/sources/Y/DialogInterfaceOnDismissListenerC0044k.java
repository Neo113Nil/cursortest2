package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0044k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0046m f1415a;

    public DialogInterfaceOnDismissListenerC0044k(DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m) {
        this.f1415a = dialogInterfaceOnCancelListenerC0046m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m = this.f1415a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0046m.f1427c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0046m.onDismiss(dialog);
        }
    }
}
