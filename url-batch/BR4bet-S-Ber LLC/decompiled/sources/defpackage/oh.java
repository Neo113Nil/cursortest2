package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class oh extends la0 {
    public final /* synthetic */ nm r;
    public final /* synthetic */ ph s;

    public oh(ph phVar, nm nmVar) {
        this.s = phVar;
        this.r = nmVar;
    }

    @Override // defpackage.la0
    public final View P(int i) {
        nm nmVar = this.r;
        if (nmVar.Q()) {
            return nmVar.P(i);
        }
        Dialog dialog = this.s.j0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.la0
    public final boolean Q() {
        return this.r.Q() || this.s.n0;
    }
}
