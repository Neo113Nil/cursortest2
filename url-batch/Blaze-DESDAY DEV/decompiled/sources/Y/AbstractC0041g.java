package Y;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0092A;
import java.util.HashSet;
import k.MenuItemC0173t;

/* renamed from: Y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0041g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1076a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1077b;

    public AbstractC0041g(Context context) {
        this.f1076a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f1076a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0092A) this.f1077b).f2159k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1076a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1076a;
        HashSet hashSet = u2.f1036e;
        if (hashSet.remove((G.c) this.f1077b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f1077b) == null) {
            this.f1077b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1077b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0173t menuItemC0173t = new MenuItemC0173t((Context) this.f1076a, aVar);
        ((o.k) this.f1077b).put(aVar, menuItemC0173t);
        return menuItemC0173t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f1076a) == null) {
            this.f1076a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0092A) this.f1077b).f2159k.registerReceiver((g.x) this.f1076a, e2);
    }

    public AbstractC0041g(U u2, G.c cVar) {
        this.f1076a = u2;
        this.f1077b = cVar;
    }

    public AbstractC0041g(LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A) {
        this.f1077b = layoutInflaterFactory2C0092A;
    }
}
