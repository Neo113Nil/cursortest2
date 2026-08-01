package defpackage;

import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nm extends la0 {
    public final /* synthetic */ pm r;

    public nm(pm pmVar) {
        this.r = pmVar;
    }

    @Override // defpackage.la0
    public final View P(int i) {
        pm pmVar = this.r;
        View view = pmVar.J;
        if (view != null) {
            return view.findViewById(i);
        }
        g9.g(pmVar, " does not have a view", "Fragment ");
        return null;
    }

    @Override // defpackage.la0
    public final boolean Q() {
        return this.r.J != null;
    }
}
