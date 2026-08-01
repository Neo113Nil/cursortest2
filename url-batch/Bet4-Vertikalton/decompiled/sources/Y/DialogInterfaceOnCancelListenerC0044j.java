package Y;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Y.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0044j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0047m f1055a;

    public DialogInterfaceOnCancelListenerC0044j(DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m) {
        this.f1055a = dialogInterfaceOnCancelListenerC0047m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m = this.f1055a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0047m.f1068c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0047m.onCancel(dialog);
        }
    }
}
