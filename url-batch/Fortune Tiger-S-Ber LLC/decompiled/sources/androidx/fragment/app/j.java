package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f431a;

    /* renamed from: b, reason: collision with root package name */
    public Object f432b;

    public j(Context context) {
        this.f431a = context;
    }

    public void c() {
        f.y yVar = (f.y) this.f431a;
        if (yVar != null) {
            try {
                ((f.b0) this.f432b).f1556p.unregisterReceiver(yVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f431a = null;
        }
    }

    public void d() {
        v0 v0Var = (v0) this.f431a;
        g0.b bVar = (g0.b) this.f432b;
        HashSet hashSet = v0Var.f545e;
        if (hashSet.remove(bVar) && hashSet.isEmpty()) {
            v0Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof e0.a)) {
            return menuItem;
        }
        e0.a aVar = (e0.a) menuItem;
        if (((n.j) this.f432b) == null) {
            this.f432b = new n.j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((n.j) this.f432b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j.t tVar = new j.t((Context) this.f431a, aVar);
        ((n.j) this.f432b).put(aVar, tVar);
        return tVar;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e4 = e();
        if (e4.countActions() == 0) {
            return;
        }
        if (((f.y) this.f431a) == null) {
            this.f431a = new f.y(this);
        }
        ((f.b0) this.f432b).f1556p.registerReceiver((f.y) this.f431a, e4);
    }

    public j(v0 v0Var, g0.b bVar) {
        this.f431a = v0Var;
        this.f432b = bVar;
    }

    public j(f.b0 b0Var) {
        this.f432b = b0Var;
    }
}
