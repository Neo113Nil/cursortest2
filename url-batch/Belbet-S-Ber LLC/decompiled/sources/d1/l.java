package d1;

import a.c0;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f1305a;

    public l(j jVar) {
        this.f1305a = jVar;
    }

    public final void onBackCancelled() {
        j jVar = this.f1305a;
        a0.k kVar = jVar.f1285a;
        if (kVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!jVar.f1286b) {
            kVar.f(jVar, null);
        }
        e eVar = (e) kVar.f98g;
        eVar.getClass();
        if (jVar.equals(eVar.h) && -1 == eVar.f1292g) {
            c0 c0Var = eVar.f1291f;
            if (c0Var == null) {
                c0Var = eVar.c(-1);
            }
            eVar.f1291f = null;
            eVar.f1292g = 0;
            eVar.h = null;
            if (c0Var != null) {
                c0Var.d.getClass();
            }
            eVar.f1287a.b(f.f1298b);
        }
        jVar.f1286b = false;
    }

    public final void onBackInvoked() {
        this.f1305a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        i3.d.e(backEvent, "backEvent");
        b h = b4.d.h(backEvent);
        j jVar = this.f1305a;
        a0.k kVar = jVar.f1285a;
        if (kVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (jVar.f1286b) {
            e eVar = (e) kVar.f98g;
            eVar.getClass();
            if (jVar.equals(eVar.h) && -1 == eVar.f1292g) {
                c0 c0Var = eVar.f1291f;
                if (c0Var == null) {
                    c0Var = eVar.c(-1);
                }
                if (c0Var != null) {
                    c0Var.d.getClass();
                }
                eVar.f1287a.b(new g(h));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        i3.d.e(backEvent, "backEvent");
        b h = b4.d.h(backEvent);
        j jVar = this.f1305a;
        a0.k kVar = jVar.f1285a;
        if (kVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (jVar.f1286b) {
            return;
        }
        kVar.f(jVar, h);
        jVar.f1286b = true;
    }
}
