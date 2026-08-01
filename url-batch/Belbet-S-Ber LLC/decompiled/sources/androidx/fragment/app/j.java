package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f550a;

    /* renamed from: b, reason: collision with root package name */
    public Object f551b;

    public j(Context context) {
        this.f550a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f550a;
        if (xVar != null) {
            try {
                ((g.a0) this.f551b).f1459p.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f550a = null;
        }
    }

    public void d() {
        v0 v0Var = (v0) this.f550a;
        j0.e eVar = (j0.e) this.f551b;
        HashSet hashSet = v0Var.f670e;
        if (hashSet.remove(eVar) && hashSet.isEmpty()) {
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
        if (((q.j) this.f551b) == null) {
            this.f551b = new q.j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((q.j) this.f551b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k.t tVar = new k.t((Context) this.f550a, aVar);
        ((q.j) this.f551b).put(aVar, tVar);
        return tVar;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e4 = e();
        if (e4.countActions() == 0) {
            return;
        }
        if (((g.x) this.f550a) == null) {
            this.f550a = new g.x(this);
        }
        ((g.a0) this.f551b).f1459p.registerReceiver((g.x) this.f550a, e4);
    }

    public j(v0 v0Var, j0.e eVar) {
        this.f550a = v0Var;
        this.f551b = eVar;
    }

    public j(g.a0 a0Var) {
        this.f551b = a0Var;
    }
}
