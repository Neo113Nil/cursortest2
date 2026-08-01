package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f592f;

    public n(p pVar) {
        this.f592f = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p pVar = this.f592f;
        Dialog dialog = pVar.f613j0;
        if (dialog != null) {
            pVar.onDismiss(dialog);
        }
    }
}
