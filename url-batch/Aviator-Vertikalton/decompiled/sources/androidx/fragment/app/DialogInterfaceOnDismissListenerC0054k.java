package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0054k implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0056m f1350a;

    public DialogInterfaceOnDismissListenerC0054k(DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m) {
        this.f1350a = dialogInterfaceOnCancelListenerC0056m;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m = this.f1350a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0056m.f1361c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0056m.onDismiss(dialog);
        }
    }
}
