package d1;

import a.c0;
import a.g0;
import a.h0;
import a.j0;
import androidx.fragment.app.k0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public a0.k f1285a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1286b;

    public final void a() {
        a0.k kVar = this.f1285a;
        if (kVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f1286b) {
            kVar.f(this, null);
        }
        e eVar = (e) kVar.f98g;
        g0 g0Var = (g0) kVar.f97f;
        eVar.getClass();
        if (equals(eVar.h) && -1 == eVar.f1292g) {
            c0 c0Var = eVar.f1291f;
            if (c0Var == null) {
                c0Var = eVar.c(-1);
            }
            eVar.f1291f = null;
            eVar.f1292g = 0;
            eVar.h = null;
            if (c0Var == null) {
                ((j0) g0Var.f25g).f33a.run();
            } else {
                k0 k0Var = c0Var.d.d;
                k0Var.y(true);
                if (k0Var.h.f526b) {
                    k0Var.O();
                } else {
                    ((h0) k0Var.f559g.f34b.a()).a();
                }
            }
            eVar.f1287a.b(f.f1298b);
        }
        this.f1286b = false;
    }

    public void b(boolean z4) {
    }
}
