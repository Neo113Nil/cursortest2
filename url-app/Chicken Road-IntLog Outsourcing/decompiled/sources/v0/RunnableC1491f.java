package v0;

import B0.j;
import C0.y;
import C0.z;
import android.os.Handler;
import s0.s;

/* renamed from: v0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1491f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1492g f12067b;

    public /* synthetic */ RunnableC1491f(C1492g c1492g, int i2) {
        this.f12066a = i2;
        this.f12067b = c1492g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12066a) {
            case 0:
                C1492g.a(this.f12067b);
                return;
            default:
                C1492g c1492g = this.f12067b;
                if (c1492g.f12075g != 0) {
                    s.d().a(C1492g.f12068m, "Already started work for " + c1492g.f12071c);
                    return;
                }
                c1492g.f12075g = 1;
                s.d().a(C1492g.f12068m, "onAllConstraintsMet for " + c1492g.f12071c);
                if (!c1492g.f12072d.f12087d.h(c1492g.f12080l, null)) {
                    c1492g.d();
                    return;
                }
                z zVar = c1492g.f12072d.f12086c;
                j jVar = c1492g.f12071c;
                synchronized (zVar.f384d) {
                    s.d().a(z.f380e, "Starting timer for " + jVar);
                    zVar.a(jVar);
                    y yVar = new y(zVar, jVar);
                    zVar.f382b.put(jVar, yVar);
                    zVar.f383c.put(jVar, c1492g);
                    ((Handler) zVar.f381a.f3053a).postDelayed(yVar, 600000L);
                }
                return;
        }
    }
}
