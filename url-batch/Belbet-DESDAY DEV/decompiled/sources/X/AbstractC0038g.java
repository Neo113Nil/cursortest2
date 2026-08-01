package X;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0109A;
import java.util.HashSet;
import k.MenuItemC0164t;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0038g {

    /* renamed from: a, reason: collision with root package name */
    public Object f918a;

    /* renamed from: b, reason: collision with root package name */
    public Object f919b;

    public AbstractC0038g(Context context) {
        this.f918a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f918a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0109A) this.f919b).f2226k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f918a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f918a;
        HashSet hashSet = u2.f878e;
        if (hashSet.remove((G.c) this.f919b) && hashSet.isEmpty()) {
            u2.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof E.a)) {
            return menuItem;
        }
        E.a aVar = (E.a) menuItem;
        if (((o.k) this.f919b) == null) {
            this.f919b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f919b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0164t menuItemC0164t = new MenuItemC0164t((Context) this.f918a, aVar);
        ((o.k) this.f919b).put(aVar, menuItemC0164t);
        return menuItemC0164t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f918a) == null) {
            this.f918a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0109A) this.f919b).f2226k.registerReceiver((g.x) this.f918a, e2);
    }

    public AbstractC0038g(U u2, G.c cVar) {
        this.f918a = u2;
        this.f919b = cVar;
    }

    public AbstractC0038g(LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A) {
        this.f919b = layoutInflaterFactory2C0109A;
    }
}
