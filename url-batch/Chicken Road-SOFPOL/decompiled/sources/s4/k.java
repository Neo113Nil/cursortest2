package s4;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import b.o;
import b.u;
import c5.x;
import d7.n0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f6728a;

    public k(j jVar) {
        this.f6728a = jVar;
    }

    public final void onBackCancelled() {
        j jVar = this.f6728a;
        x xVar = jVar.f6707a;
        if (xVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!jVar.f6708b) {
            xVar.f(jVar, null);
        }
        f fVar = (f) xVar.f1738e;
        fVar.getClass();
        if (jVar.equals(fVar.f6716h) && -1 == fVar.f6715g) {
            o oVar = fVar.f6714f;
            if (oVar == null) {
                oVar = fVar.c(-1);
            }
            fVar.f6714f = null;
            fVar.f6715g = 0;
            fVar.f6716h = null;
            if (oVar != null) {
                oVar.a();
            }
            n0 n0Var = fVar.f6709a;
            n0Var.getClass();
            n0Var.j(null, g.f6722a);
        }
        jVar.f6708b = false;
    }

    public final void onBackInvoked() {
        this.f6728a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        q6.i.e(backEvent, "backEvent");
        b d8 = r2.o.d(backEvent);
        j jVar = this.f6728a;
        x xVar = jVar.f6707a;
        if (xVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (jVar.f6708b) {
            f fVar = (f) xVar.f1738e;
            fVar.getClass();
            if (jVar.equals(fVar.f6716h) && -1 == fVar.f6715g) {
                o oVar = fVar.f6714f;
                if (oVar == null) {
                    oVar = fVar.c(-1);
                }
                if (oVar != null) {
                    switch (oVar.f1011d) {
                        case 0:
                            u uVar = (u) oVar.f1012e;
                            b.a aVar = new b.a(d8);
                            switch (uVar.f1024d) {
                                case 1:
                                    c7.c cVar = ((c.d) uVar.f1025e).f1544e;
                                    if (cVar != null) {
                                        cVar.t(aVar);
                                        break;
                                    }
                                    break;
                            }
                        default:
                            c.d dVar = (c.d) oVar.f1012e;
                            b.a aVar2 = new b.a(d8);
                            c7.c cVar2 = dVar.f1544e;
                            if (cVar2 != null) {
                                cVar2.t(aVar2);
                                break;
                            }
                            break;
                    }
                }
                n0 n0Var = fVar.f6709a;
                h hVar = new h(d8);
                n0Var.getClass();
                n0Var.j(null, hVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        q6.i.e(backEvent, "backEvent");
        b d8 = r2.o.d(backEvent);
        j jVar = this.f6728a;
        x xVar = jVar.f6707a;
        if (xVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (jVar.f6708b) {
            return;
        }
        xVar.f(jVar, d8);
        jVar.f6708b = true;
    }
}
