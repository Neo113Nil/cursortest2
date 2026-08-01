package c1;

import a.c0;
import a.y;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f784a;

    public l(j jVar) {
        this.f784a = jVar;
    }

    public final void onBackCancelled() {
        j jVar = this.f784a;
        a0.j jVar2 = jVar.f763a;
        if (jVar2 == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!jVar.f764b) {
            jVar2.e(jVar, null);
        }
        e eVar = (e) jVar2.f101g;
        eVar.getClass();
        if (jVar.equals(eVar.f771h) && -1 == eVar.f770g) {
            c0 c0Var = eVar.f769f;
            if (c0Var == null) {
                c0Var = eVar.c(-1);
            }
            eVar.f769f = null;
            eVar.f770g = 0;
            eVar.f771h = null;
            if (c0Var != null) {
                c0Var.d.getClass();
            }
            eVar.f765a.b(f.f777n);
        }
        jVar.f764b = false;
    }

    public final void onBackInvoked() {
        this.f784a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        f3.d.e(backEvent, "backEvent");
        b c4 = y.c(backEvent);
        j jVar = this.f784a;
        a0.j jVar2 = jVar.f763a;
        if (jVar2 == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (jVar.f764b) {
            e eVar = (e) jVar2.f101g;
            eVar.getClass();
            if (jVar.equals(eVar.f771h) && -1 == eVar.f770g) {
                c0 c0Var = eVar.f769f;
                if (c0Var == null) {
                    c0Var = eVar.c(-1);
                }
                if (c0Var != null) {
                    c0Var.d.getClass();
                }
                eVar.f765a.b(new g(c4));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        f3.d.e(backEvent, "backEvent");
        b c4 = y.c(backEvent);
        j jVar = this.f784a;
        a0.j jVar2 = jVar.f763a;
        if (jVar2 == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (jVar.f764b) {
            return;
        }
        jVar2.e(jVar, c4);
        jVar.f764b = true;
    }
}
