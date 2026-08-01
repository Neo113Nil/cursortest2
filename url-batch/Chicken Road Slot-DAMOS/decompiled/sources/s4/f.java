package s4;

import d.c0;
import je.l0;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public c6.i f8425a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8426b;

    public final void a() {
        c6.i iVar = this.f8425a;
        if (iVar == null) {
            i0.l("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f8426b) {
            iVar.d(this, null);
        }
        g gVar = (g) iVar.f1821b;
        b1.h hVar = (b1.h) iVar.f1820a;
        gVar.getClass();
        if (equals(gVar.f8433h) && -1 == gVar.g) {
            d dVar = gVar.f8432f;
            if (dVar == null) {
                dVar = gVar.c(-1);
            }
            gVar.f8432f = null;
            gVar.g = 0;
            gVar.f8433h = null;
            if (dVar == null) {
                ((c0) hVar.f980e).f3215a.run();
            } else {
                dVar.b();
            }
            l0 l0Var = gVar.f8427a;
            l0Var.getClass();
            l0Var.k(null, h.f8439a);
        }
        this.f8426b = false;
    }

    public void b(boolean z10) {
    }
}
