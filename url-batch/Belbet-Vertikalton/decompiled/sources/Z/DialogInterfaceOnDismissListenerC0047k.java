package Z;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0047k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0049m f1564a;

    public DialogInterfaceOnDismissListenerC0047k(DialogInterfaceOnCancelListenerC0049m dialogInterfaceOnCancelListenerC0049m) {
        this.f1564a = dialogInterfaceOnCancelListenerC0049m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0049m dialogInterfaceOnCancelListenerC0049m = this.f1564a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0049m.f1576c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0049m.onDismiss(dialog);
        }
    }
}
