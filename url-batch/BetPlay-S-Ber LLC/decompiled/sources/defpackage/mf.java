package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.g;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class mf implements DialogInterface.OnDismissListener {
    public final /* synthetic */ g f;

    public mf(g gVar) {
        this.f = gVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        g gVar = this.f;
        dialog = gVar.mDialog;
        if (dialog != null) {
            dialog2 = gVar.mDialog;
            gVar.onDismiss(dialog2);
        }
    }
}
