package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f473f;

    public n(p pVar) {
        this.f473f = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p pVar = this.f473f;
        Dialog dialog = pVar.f492h0;
        if (dialog != null) {
            pVar.onDismiss(dialog);
        }
    }
}
