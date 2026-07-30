package J0;

import G0.s;
import Q0.w;
import Q0.x;
import android.os.Handler;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f1330e;

    public /* synthetic */ f(g gVar, int i2) {
        this.f1329d = i2;
        this.f1330e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1329d) {
            case 0:
                g.a(this.f1330e);
                return;
            default:
                g gVar = this.f1330e;
                if (gVar.f1338o != 0) {
                    s.d().a(g.f1331u, "Already started work for " + gVar.f1334i);
                    return;
                }
                gVar.f1338o = 1;
                s.d().a(g.f1331u, "onAllConstraintsMet for " + gVar.f1334i);
                if (!gVar.f1335l.f1354l.h(gVar.f1343t, null)) {
                    gVar.c();
                    return;
                }
                x xVar = gVar.f1335l.f1353i;
                P0.j jVar = gVar.f1334i;
                synchronized (xVar.f2351d) {
                    s.d().a(x.f2347e, "Starting timer for " + jVar);
                    xVar.a(jVar);
                    w wVar = new w(xVar, jVar);
                    xVar.f2349b.put(jVar, wVar);
                    xVar.f2350c.put(jVar, gVar);
                    ((Handler) xVar.f2348a.f6269d).postDelayed(wVar, 600000L);
                }
                return;
        }
    }
}
