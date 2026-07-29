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
    public Object f912a;

    /* renamed from: b, reason: collision with root package name */
    public Object f913b;

    public AbstractC0038g(Context context) {
        this.f912a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f912a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0109A) this.f913b).f2223k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f912a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f912a;
        HashSet hashSet = u2.f872e;
        if (hashSet.remove((G.c) this.f913b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f913b) == null) {
            this.f913b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f913b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0164t menuItemC0164t = new MenuItemC0164t((Context) this.f912a, aVar);
        ((o.k) this.f913b).put(aVar, menuItemC0164t);
        return menuItemC0164t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f912a) == null) {
            this.f912a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0109A) this.f913b).f2223k.registerReceiver((g.x) this.f912a, e2);
    }

    public AbstractC0038g(U u2, G.c cVar) {
        this.f912a = u2;
        this.f913b = cVar;
    }

    public AbstractC0038g(LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A) {
        this.f913b = layoutInflaterFactory2C0109A;
    }
}
