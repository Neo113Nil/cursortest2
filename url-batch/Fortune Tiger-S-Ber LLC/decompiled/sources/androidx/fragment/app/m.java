package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m implements DialogInterface.OnCancelListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f468f;

    public m(p pVar) {
        this.f468f = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        p pVar = this.f468f;
        Dialog dialog = pVar.f492h0;
        if (dialog != null) {
            pVar.onCancel(dialog);
        }
    }
}
