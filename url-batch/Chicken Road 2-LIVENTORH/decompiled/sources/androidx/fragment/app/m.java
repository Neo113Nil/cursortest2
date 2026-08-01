package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m implements DialogInterface.OnCancelListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f476f;

    public m(p pVar) {
        this.f476f = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        p pVar = this.f476f;
        Dialog dialog = pVar.f503h0;
        if (dialog != null) {
            pVar.onCancel(dialog);
        }
    }
}
