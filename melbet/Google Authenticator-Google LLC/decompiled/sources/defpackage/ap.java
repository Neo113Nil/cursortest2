package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ap implements DialogInterface.OnDismissListener {
    final /* synthetic */ ar a;

    public ap(ar arVar) {
        this.a = arVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ar arVar = this.a;
        Dialog dialog = arVar.e;
        if (dialog != null) {
            arVar.onDismiss(dialog);
        }
    }
}
