package Y;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0112A;
import java.util.HashSet;
import k.MenuItemC0197u;

/* renamed from: Y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0040g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1408a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1409b;

    public AbstractC0040g(Context context) {
        this.f1408a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f1408a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0112A) this.f1409b).f2576k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1408a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1408a;
        HashSet hashSet = u2.f1368e;
        if (hashSet.remove((G.c) this.f1409b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f1409b) == null) {
            this.f1409b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1409b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0197u menuItemC0197u = new MenuItemC0197u((Context) this.f1408a, aVar);
        ((o.k) this.f1409b).put(aVar, menuItemC0197u);
        return menuItemC0197u;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f1408a) == null) {
            this.f1408a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0112A) this.f1409b).f2576k.registerReceiver((g.x) this.f1408a, e2);
    }

    public AbstractC0040g(U u2, G.c cVar) {
        this.f1408a = u2;
        this.f1409b = cVar;
    }

    public AbstractC0040g(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A) {
        this.f1409b = layoutInflaterFactory2C0112A;
    }
}
