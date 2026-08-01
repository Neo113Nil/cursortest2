package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f482f;

    public n(p pVar) {
        this.f482f = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p pVar = this.f482f;
        Dialog dialog = pVar.f503h0;
        if (dialog != null) {
            pVar.onDismiss(dialog);
        }
    }
}
