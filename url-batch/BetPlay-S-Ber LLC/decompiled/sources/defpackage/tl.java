package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class tl implements ln, x10, r90 {
    public final Fragment f;
    public final q90 g;
    public a h = null;
    public w10 i = null;

    public tl(Fragment fragment, q90 q90Var) {
        this.f = fragment;
        this.g = q90Var;
    }

    public final void a(gq gqVar) {
        this.h.e(gqVar);
    }

    public final void b() {
        if (this.h == null) {
            this.h = new a(this);
            w10 w10Var = new w10(this);
            this.i = w10Var;
            w10Var.a();
            j8.l(this);
        }
    }

    @Override // defpackage.ln
    public final zd getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        ev evVar = new ev(0);
        LinkedHashMap linkedHashMap = evVar.a;
        if (application != null) {
            linkedHashMap.put(vg.n, application);
        }
        linkedHashMap.put(j8.e, this);
        linkedHashMap.put(j8.f, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(j8.g, fragment.getArguments());
        }
        return evVar;
    }

    @Override // defpackage.nq
    public final iq getLifecycle() {
        b();
        return this.h;
    }

    @Override // defpackage.x10
    public final v10 getSavedStateRegistry() {
        b();
        return this.i.b;
    }

    @Override // defpackage.r90
    public final q90 getViewModelStore() {
        b();
        return this.g;
    }
}
