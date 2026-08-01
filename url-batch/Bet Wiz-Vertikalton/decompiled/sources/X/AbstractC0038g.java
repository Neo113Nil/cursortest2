package X;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0116A;
import java.util.HashSet;
import k.MenuItemC0167t;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0038g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1029a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1030b;

    public AbstractC0038g(Context context) {
        this.f1029a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f1029a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0116A) this.f1030b).f2358k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1029a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1029a;
        HashSet hashSet = u2.f989e;
        if (hashSet.remove((G.c) this.f1030b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f1030b) == null) {
            this.f1030b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1030b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0167t menuItemC0167t = new MenuItemC0167t((Context) this.f1029a, aVar);
        ((o.k) this.f1030b).put(aVar, menuItemC0167t);
        return menuItemC0167t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f1029a) == null) {
            this.f1029a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0116A) this.f1030b).f2358k.registerReceiver((g.x) this.f1029a, e2);
    }

    public AbstractC0038g(U u2, G.c cVar) {
        this.f1029a = u2;
        this.f1030b = cVar;
    }

    public AbstractC0038g(LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A) {
        this.f1030b = layoutInflaterFactory2C0116A;
    }
}
