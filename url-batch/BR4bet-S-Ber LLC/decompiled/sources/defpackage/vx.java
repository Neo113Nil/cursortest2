package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class vx {
    public rg a;
    public boolean b;

    public final void a() {
        rg rgVar = this.a;
        if (rgVar == null) {
            g9.s("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            rgVar.g(this, null);
        }
        wx wxVar = (wx) rgVar.g;
        c2 c2Var = (c2) rgVar.f;
        wxVar.getClass();
        if (equals(wxVar.h) && -1 == wxVar.g) {
            cz czVar = wxVar.f;
            if (czVar == null) {
                czVar = wxVar.c(-1);
            }
            wxVar.f = null;
            wxVar.g = 0;
            wxVar.h = null;
            if (czVar == null) {
                ((hz) c2Var.g).a.run();
            } else {
                en enVar = czVar.d.d;
                enVar.y(true);
                if (enVar.h.b) {
                    enVar.N();
                } else {
                    ((fz) enVar.g.b.a()).a();
                }
            }
            wxVar.a.b(xx.r);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
