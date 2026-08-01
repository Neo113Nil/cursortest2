package X;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0117A;
import java.util.HashSet;
import k.MenuItemC0168t;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0038g {

    /* renamed from: a, reason: collision with root package name */
    public Object f989a;

    /* renamed from: b, reason: collision with root package name */
    public Object f990b;

    public AbstractC0038g(Context context) {
        this.f989a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f989a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0117A) this.f990b).f2297k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f989a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f989a;
        HashSet hashSet = u2.f949e;
        if (hashSet.remove((G.c) this.f990b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f990b) == null) {
            this.f990b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f990b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0168t menuItemC0168t = new MenuItemC0168t((Context) this.f989a, aVar);
        ((o.k) this.f990b).put(aVar, menuItemC0168t);
        return menuItemC0168t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f989a) == null) {
            this.f989a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0117A) this.f990b).f2297k.registerReceiver((g.x) this.f989a, e2);
    }

    public AbstractC0038g(U u2, G.c cVar) {
        this.f989a = u2;
        this.f990b = cVar;
    }

    public AbstractC0038g(LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A) {
        this.f990b = layoutInflaterFactory2C0117A;
    }
}
