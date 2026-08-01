package w5;

import android.os.Handler;
import c6.j;
import d6.v;
import d6.w;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f10092e;

    public /* synthetic */ f(g gVar, int i3) {
        this.f10091d = i3;
        this.f10092e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10091d) {
            case 0:
                g.a(this.f10092e);
                return;
            default:
                g gVar = this.f10092e;
                if (gVar.f10099u != 0) {
                    o.d().a(g.A, "Already started work for " + gVar.f10095i);
                    return;
                }
                gVar.f10099u = 1;
                o.d().a(g.A, "onAllConstraintsMet for " + gVar.f10095i);
                if (!gVar.f10096r.f10111r.h(gVar.f10104z, null)) {
                    gVar.d();
                    return;
                }
                w wVar = gVar.f10096r.f10110i;
                j jVar = gVar.f10095i;
                synchronized (wVar.f3684d) {
                    o.d().a(w.f3680e, "Starting timer for " + jVar);
                    wVar.a(jVar);
                    v vVar = new v(wVar, jVar);
                    wVar.f3682b.put(jVar, vVar);
                    wVar.f3683c.put(jVar, gVar);
                    ((Handler) wVar.f3681a.f5643e).postDelayed(vVar, 600000L);
                }
                return;
        }
    }
}
