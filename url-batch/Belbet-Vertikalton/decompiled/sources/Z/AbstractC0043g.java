package Z;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import m.MenuItemC0236t;

/* renamed from: Z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0043g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1557a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1558b;

    public AbstractC0043g(Context context) {
        this.f1557a = context;
    }

    public void c() {
        h.w wVar = (h.w) this.f1557a;
        if (wVar != null) {
            try {
                ((h.z) this.f1558b).f2877k.unregisterReceiver(wVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1557a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1557a;
        HashSet hashSet = u2.e;
        if (hashSet.remove((I.c) this.f1558b) && hashSet.isEmpty()) {
            u2.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof G.a)) {
            return menuItem;
        }
        G.a aVar = (G.a) menuItem;
        if (((q.k) this.f1558b) == null) {
            this.f1558b = new q.k();
        }
        MenuItem menuItem2 = (MenuItem) ((q.k) this.f1558b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0236t menuItemC0236t = new MenuItemC0236t((Context) this.f1557a, aVar);
        ((q.k) this.f1558b).put(aVar, menuItemC0236t);
        return menuItemC0236t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e = e();
        if (e.countActions() == 0) {
            return;
        }
        if (((h.w) this.f1557a) == null) {
            this.f1557a = new h.w(this);
        }
        ((h.z) this.f1558b).f2877k.registerReceiver((h.w) this.f1557a, e);
    }

    public AbstractC0043g(U u2, I.c cVar) {
        this.f1557a = u2;
        this.f1558b = cVar;
    }

    public AbstractC0043g(h.z zVar) {
        this.f1558b = zVar;
    }
}
