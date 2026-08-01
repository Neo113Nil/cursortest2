package s4;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import je.l0;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f8445a;

    public k(j jVar) {
        this.f8445a = jVar;
    }

    public final void onBackCancelled() {
        j jVar = this.f8445a;
        c6.i iVar = jVar.f8425a;
        if (iVar == null) {
            i0.l("This input is not added to any dispatcher.");
            return;
        }
        if (!jVar.f8426b) {
            iVar.d(jVar, null);
        }
        g gVar = (g) iVar.f1821b;
        gVar.getClass();
        if (jVar.equals(gVar.f8433h) && -1 == gVar.g) {
            d dVar = gVar.f8432f;
            if (dVar == null) {
                dVar = gVar.c(-1);
            }
            gVar.f8432f = null;
            gVar.g = 0;
            gVar.f8433h = null;
            if (dVar != null) {
                dVar.a();
            }
            l0 l0Var = gVar.f8427a;
            l0Var.getClass();
            l0Var.k(null, h.f8439a);
        }
        jVar.f8426b = false;
    }

    public final void onBackInvoked() {
        this.f8445a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        b h10 = cf.c.h(backEvent);
        j jVar = this.f8445a;
        c6.i iVar = jVar.f8425a;
        if (iVar == null) {
            i0.l("This input is not added to any dispatcher.");
            return;
        }
        if (jVar.f8426b) {
            g gVar = (g) iVar.f1821b;
            gVar.getClass();
            if (jVar.equals(gVar.f8433h) && -1 == gVar.g) {
                d dVar = gVar.f8432f;
                if (dVar == null) {
                    dVar = gVar.c(-1);
                }
                if (dVar != null) {
                    dVar.c(h10);
                }
                l0 l0Var = gVar.f8427a;
                i iVar2 = new i(h10);
                l0Var.getClass();
                l0Var.k(null, iVar2);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        b h10 = cf.c.h(backEvent);
        j jVar = this.f8445a;
        c6.i iVar = jVar.f8425a;
        if (iVar == null) {
            i0.l("This input is not added to any dispatcher.");
        } else {
            if (jVar.f8426b) {
                return;
            }
            iVar.d(jVar, h10);
            jVar.f8426b = true;
        }
    }
}
