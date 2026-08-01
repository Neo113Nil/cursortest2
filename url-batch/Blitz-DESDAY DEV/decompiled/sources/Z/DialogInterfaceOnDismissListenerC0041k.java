package Z;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0041k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0043m f1145a;

    public DialogInterfaceOnDismissListenerC0041k(DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m) {
        this.f1145a = dialogInterfaceOnCancelListenerC0043m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m = this.f1145a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0043m.f1157c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0043m.onDismiss(dialog);
        }
    }
}
