package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0043j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0046m f1414a;

    public DialogInterfaceOnCancelListenerC0043j(DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m) {
        this.f1414a = dialogInterfaceOnCancelListenerC0046m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m = this.f1414a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0046m.f1427c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0046m.onCancel(dialog);
        }
    }
}
