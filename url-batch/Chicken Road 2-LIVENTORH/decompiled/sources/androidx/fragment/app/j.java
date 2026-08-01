package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f437a;

    /* renamed from: b, reason: collision with root package name */
    public Object f438b;

    public j(Context context) {
        this.f437a = context;
    }

    public void c() {
        g.z zVar = (g.z) this.f437a;
        if (zVar != null) {
            try {
                ((g.c0) this.f438b).f1595p.unregisterReceiver(zVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f437a = null;
        }
    }

    public void d() {
        v0 v0Var = (v0) this.f437a;
        j0.c cVar = (j0.c) this.f438b;
        HashSet hashSet = v0Var.f563e;
        if (hashSet.remove(cVar) && hashSet.isEmpty()) {
            v0Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof h0.a)) {
            return menuItem;
        }
        h0.a aVar = (h0.a) menuItem;
        if (((q.j) this.f438b) == null) {
            this.f438b = new q.j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((q.j) this.f438b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k.t tVar = new k.t((Context) this.f437a, aVar);
        ((q.j) this.f438b).put(aVar, tVar);
        return tVar;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e4 = e();
        if (e4.countActions() == 0) {
            return;
        }
        if (((g.z) this.f437a) == null) {
            this.f437a = new g.z(this);
        }
        ((g.c0) this.f438b).f1595p.registerReceiver((g.z) this.f437a, e4);
    }

    public j(v0 v0Var, j0.c cVar) {
        this.f437a = v0Var;
        this.f438b = cVar;
    }

    public j(g.c0 c0Var) {
        this.f438b = c0Var;
    }
}
