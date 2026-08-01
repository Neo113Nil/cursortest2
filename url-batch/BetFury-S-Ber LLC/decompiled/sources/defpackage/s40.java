package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class s40 implements OnBackAnimationCallback {
    public final /* synthetic */ r40 a;

    public s40(r40 r40Var) {
        this.a = r40Var;
    }

    public final void onBackCancelled() {
        r40 r40Var = this.a;
        wi wiVar = r40Var.a;
        if (wiVar == null) {
            s9.u("This input is not added to any dispatcher.");
            return;
        }
        if (!r40Var.b) {
            wiVar.f(r40Var, null);
        }
        j30 j30Var = (j30) wiVar.g;
        j30Var.getClass();
        if (r40Var.equals(j30Var.h) && -1 == j30Var.g) {
            t40 t40Var = j30Var.f;
            if (t40Var == null) {
                t40Var = j30Var.c(-1);
            }
            j30Var.f = null;
            j30Var.g = 0;
            j30Var.h = null;
            if (t40Var != null) {
                t40Var.d.getClass();
            }
            ef0 ef0Var = j30Var.a;
            k30 k30Var = k30.s;
            ef0Var.getClass();
            ef0Var.i0(null, k30Var);
        }
        r40Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        g30 c = bi.c(backEvent);
        r40 r40Var = this.a;
        wi wiVar = r40Var.a;
        if (wiVar == null) {
            s9.u("This input is not added to any dispatcher.");
            return;
        }
        if (r40Var.b) {
            j30 j30Var = (j30) wiVar.g;
            j30Var.getClass();
            if (r40Var.equals(j30Var.h) && -1 == j30Var.g) {
                t40 t40Var = j30Var.f;
                if (t40Var == null) {
                    t40Var = j30Var.c(-1);
                }
                if (t40Var != null) {
                    t40Var.d.getClass();
                }
                ef0 ef0Var = j30Var.a;
                l30 l30Var = new l30(c);
                ef0Var.getClass();
                ef0Var.i0(null, l30Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        g30 c = bi.c(backEvent);
        r40 r40Var = this.a;
        wi wiVar = r40Var.a;
        if (wiVar == null) {
            s9.u("This input is not added to any dispatcher.");
        } else {
            if (r40Var.b) {
                return;
            }
            wiVar.f(r40Var, c);
            r40Var.b = true;
        }
    }
}
