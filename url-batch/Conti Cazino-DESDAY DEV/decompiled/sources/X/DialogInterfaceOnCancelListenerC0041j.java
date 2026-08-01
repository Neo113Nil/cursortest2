package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0041j implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0044m f923a;

    public DialogInterfaceOnCancelListenerC0041j(DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m) {
        this.f923a = dialogInterfaceOnCancelListenerC0044m;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = this.f923a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0044m.f936c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0044m.onCancel(dialog);
        }
    }
}
