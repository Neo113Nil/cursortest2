package defpackage;

import androidx.fragment.app.c;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class i30 {
    public wi a;
    public boolean b;

    public final void a() {
        wi wiVar = this.a;
        if (wiVar == null) {
            s9.u("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            wiVar.f(this, null);
        }
        j30 j30Var = (j30) wiVar.g;
        cv cvVar = (cv) wiVar.f;
        j30Var.getClass();
        if (equals(j30Var.h) && -1 == j30Var.g) {
            t40 t40Var = j30Var.f;
            if (t40Var == null) {
                t40Var = j30Var.c(-1);
            }
            j30Var.f = null;
            j30Var.g = 0;
            j30Var.h = null;
            if (t40Var == null) {
                ((y40) cvVar.f).a.run();
            } else {
                c cVar = (c) t40Var.d.d;
                cVar.y(true);
                if (cVar.h.a) {
                    cVar.N();
                } else {
                    cVar.g.a().a();
                }
            }
            ef0 ef0Var = j30Var.a;
            k30 k30Var = k30.s;
            ef0Var.getClass();
            ef0Var.i0(null, k30Var);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
