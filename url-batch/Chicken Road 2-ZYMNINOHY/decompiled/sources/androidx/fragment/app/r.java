package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class r implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0215t f4956a;

    public r(DialogInterfaceOnCancelListenerC0215t dialogInterfaceOnCancelListenerC0215t) {
        this.f4956a = dialogInterfaceOnCancelListenerC0215t;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0215t dialogInterfaceOnCancelListenerC0215t = this.f4956a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0215t.f4975j;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0215t.onDismiss(dialog);
        }
    }
}
