package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nh implements uy {
    public final /* synthetic */ ph a;

    public nh(ph phVar) {
        this.a = phVar;
    }

    @Override // defpackage.uy
    public final void a(Object obj) {
        if (((ms) obj) != null) {
            ph phVar = this.a;
            if (phVar.f0) {
                View F = phVar.F();
                if (F.getParent() != null) {
                    g9.s("DialogFragment can not be attached to a container view");
                    return;
                }
                if (phVar.j0 != null) {
                    if (en.G(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + phVar.j0);
                    }
                    phVar.j0.setContentView(F);
                }
            }
        }
    }
}
