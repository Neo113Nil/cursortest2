package o0;

import l0.q;
import u0.C0680j;
import v0.t;
import v0.u;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f5578g;

    public /* synthetic */ f(g gVar, int i7) {
        this.f5577f = i7;
        this.f5578g = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5577f) {
            case 0:
                g.a(this.f5578g);
                return;
            default:
                g gVar = this.f5578g;
                if (gVar.f5586l != 0) {
                    q.d().a(g.f5579r, "Already started work for " + gVar.f5582h);
                    return;
                }
                gVar.f5586l = 1;
                q.d().a(g.f5579r, "onAllConstraintsMet for " + gVar.f5582h);
                if (!gVar.f5583i.f5598i.h(gVar.f5591q, null)) {
                    gVar.b();
                    return;
                }
                u uVar = gVar.f5583i.f5597h;
                C0680j c0680j = gVar.f5582h;
                synchronized (uVar.f6105d) {
                    q.d().a(u.f6101e, "Starting timer for " + c0680j);
                    uVar.a(c0680j);
                    t tVar = new t(uVar, c0680j);
                    uVar.f6103b.put(c0680j, tVar);
                    uVar.f6104c.put(c0680j, gVar);
                    uVar.f6102a.f741a.postDelayed(tVar, 600000L);
                }
                return;
        }
    }
}
