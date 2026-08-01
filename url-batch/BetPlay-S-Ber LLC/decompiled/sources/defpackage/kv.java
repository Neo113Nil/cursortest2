package defpackage;

import androidx.fragment.app.n;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class kv {
    public iv a;
    public boolean b;

    public final void a() {
        iv ivVar = this.a;
        if (ivVar == null) {
            o8.t("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            ivVar.c(this, null);
        }
        lv lvVar = ivVar.b;
        u40 u40Var = ivVar.a;
        lvVar.getClass();
        if (equals(lvVar.h) && -1 == lvVar.g) {
            gw gwVar = lvVar.f;
            if (gwVar == null) {
                gwVar = lvVar.c(-1);
            }
            lvVar.f = null;
            lvVar.g = 0;
            lvVar.h = null;
            if (gwVar == null) {
                ((lw) u40Var.g).a.run();
            } else {
                n nVar = gwVar.d.d;
                nVar.x(true);
                if (nVar.h.b) {
                    nVar.M();
                } else {
                    nVar.g.a().a();
                }
            }
            lvVar.a.b(mv.k);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
