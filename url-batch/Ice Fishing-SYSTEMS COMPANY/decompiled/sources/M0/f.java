package M0;

import J0.s;
import T0.u;
import T0.v;
import android.os.Handler;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1844n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f1845u;

    public /* synthetic */ f(g gVar, int i) {
        this.f1844n = i;
        this.f1845u = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1844n) {
            case 0:
                g.a(this.f1845u);
                return;
            default:
                g gVar = this.f1845u;
                if (gVar.f1858z != 0) {
                    s.d().a(g.f1846F, "Already started work for " + gVar.f1854v);
                    return;
                }
                gVar.f1858z = 1;
                s.d().a(g.f1846F, "onAllConstraintsMet for " + gVar.f1854v);
                if (!gVar.f1855w.f1871w.h(gVar.f1851E, null)) {
                    gVar.b();
                    return;
                }
                v vVar = gVar.f1855w.f1870v;
                S0.j jVar = gVar.f1854v;
                synchronized (vVar.f3090d) {
                    s.d().a(v.f3086e, "Starting timer for " + jVar);
                    vVar.a(jVar);
                    u uVar = new u(vVar, jVar);
                    vVar.f3088b.put(jVar, uVar);
                    vVar.f3089c.put(jVar, gVar);
                    ((Handler) vVar.f3087a.f37858u).postDelayed(uVar, 600000L);
                }
                return;
        }
    }
}
