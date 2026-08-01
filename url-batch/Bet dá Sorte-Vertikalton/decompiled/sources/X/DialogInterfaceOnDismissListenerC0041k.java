package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0041k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0043m f1010a;

    public DialogInterfaceOnDismissListenerC0041k(DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m) {
        this.f1010a = dialogInterfaceOnCancelListenerC0043m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m = this.f1010a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0043m.f1022c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0043m.onDismiss(dialog);
        }
    }
}
