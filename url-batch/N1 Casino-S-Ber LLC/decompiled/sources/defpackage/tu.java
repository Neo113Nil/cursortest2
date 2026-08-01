package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class tu {
    public we a;
    public boolean b;

    public final void a() {
        we weVar = this.a;
        if (weVar == null) {
            t8.t("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            weVar.g(this, null);
        }
        uu uuVar = (uu) weVar.g;
        l40 l40Var = (l40) weVar.f;
        uuVar.getClass();
        if (equals(uuVar.h) && -1 == uuVar.g) {
            zv zvVar = uuVar.f;
            if (zvVar == null) {
                zvVar = uuVar.c(-1);
            }
            uuVar.f = null;
            uuVar.g = 0;
            uuVar.h = null;
            if (zvVar == null) {
                ((ew) l40Var.g).a.run();
            } else {
                bl blVar = zvVar.d.d;
                blVar.y(true);
                if (blVar.h.b) {
                    blVar.N();
                } else {
                    ((cw) blVar.g.b.a()).a();
                }
            }
            uuVar.a.b(vu.o);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
