package Z;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: Z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0040j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0043m f1144a;

    public DialogInterfaceOnCancelListenerC0040j(DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m) {
        this.f1144a = dialogInterfaceOnCancelListenerC0043m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m = this.f1144a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0043m.f1157c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0043m.onCancel(dialog);
        }
    }
}
