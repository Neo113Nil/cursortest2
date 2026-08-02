package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0213q implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0215t f4953a;

    public DialogInterfaceOnCancelListenerC0213q(DialogInterfaceOnCancelListenerC0215t dialogInterfaceOnCancelListenerC0215t) {
        this.f4953a = dialogInterfaceOnCancelListenerC0215t;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0215t dialogInterfaceOnCancelListenerC0215t = this.f4953a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0215t.f4975j;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0215t.onCancel(dialog);
        }
    }
}
