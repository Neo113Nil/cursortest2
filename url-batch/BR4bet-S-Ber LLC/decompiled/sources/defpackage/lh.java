package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class lh implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ph f;

    public lh(ph phVar) {
        this.f = phVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ph phVar = this.f;
        Dialog dialog = phVar.j0;
        if (dialog != null) {
            phVar.onCancel(dialog);
        }
    }
}
