package c1;

import a.c0;
import a.e0;
import a.g0;
import androidx.fragment.app.k0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public a0.j f763a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f764b;

    public final void a() {
        a0.j jVar = this.f763a;
        if (jVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f764b) {
            jVar.e(this, null);
        }
        e eVar = (e) jVar.f101g;
        e0 e0Var = (e0) jVar.f100f;
        eVar.getClass();
        if (equals(eVar.f771h) && -1 == eVar.f770g) {
            c0 c0Var = eVar.f769f;
            if (c0Var == null) {
                c0Var = eVar.c(-1);
            }
            eVar.f769f = null;
            eVar.f770g = 0;
            eVar.f771h = null;
            if (c0Var == null) {
                ((g0) e0Var.f18g).f24a.run();
            } else {
                k0 k0Var = c0Var.d.d;
                k0Var.x(true);
                if (k0Var.f447h.f412b) {
                    k0Var.L();
                } else {
                    k0Var.f446g.f26c.a();
                }
            }
            eVar.f765a.b(f.f777n);
        }
        this.f764b = false;
    }

    public void b(boolean z3) {
    }
}
