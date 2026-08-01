package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.c;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class tj implements k40 {
    public final /* synthetic */ vj a;

    public tj(vj vjVar) {
        this.a = vjVar;
    }

    @Override // defpackage.k40
    public final void a(Object obj) {
        if (((lx) obj) != null) {
            vj vjVar = this.a;
            if (vjVar.f0) {
                View F = vjVar.F();
                if (F.getParent() != null) {
                    s9.u("DialogFragment can not be attached to a container view");
                    return;
                }
                if (vjVar.j0 != null) {
                    if (c.G(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + vjVar.j0);
                    }
                    vjVar.j0.setContentView(F);
                }
            }
        }
    }
}
