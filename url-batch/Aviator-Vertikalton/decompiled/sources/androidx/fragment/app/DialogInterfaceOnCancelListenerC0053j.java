package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0053j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0056m f1349a;

    public DialogInterfaceOnCancelListenerC0053j(DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m) {
        this.f1349a = dialogInterfaceOnCancelListenerC0056m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m = this.f1349a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0056m.f1361c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0056m.onCancel(dialog);
        }
    }
}
