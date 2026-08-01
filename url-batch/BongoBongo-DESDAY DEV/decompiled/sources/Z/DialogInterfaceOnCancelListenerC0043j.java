package Z;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0043j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0046m f1133a;

    public DialogInterfaceOnCancelListenerC0043j(DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m) {
        this.f1133a = dialogInterfaceOnCancelListenerC0046m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m = this.f1133a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0046m.f1146c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0046m.onCancel(dialog);
        }
    }
}
