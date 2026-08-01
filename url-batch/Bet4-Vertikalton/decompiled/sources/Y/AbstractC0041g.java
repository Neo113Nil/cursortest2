package Y;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0090A;
import java.util.HashSet;
import k.MenuItemC0171t;

/* renamed from: Y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0041g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1049a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1050b;

    public AbstractC0041g(Context context) {
        this.f1049a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f1049a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0090A) this.f1050b).f2119k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1049a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1049a;
        HashSet hashSet = u2.f1009e;
        if (hashSet.remove((G.c) this.f1050b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f1050b) == null) {
            this.f1050b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1050b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0171t menuItemC0171t = new MenuItemC0171t((Context) this.f1049a, aVar);
        ((o.k) this.f1050b).put(aVar, menuItemC0171t);
        return menuItemC0171t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f1049a) == null) {
            this.f1049a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0090A) this.f1050b).f2119k.registerReceiver((g.x) this.f1049a, e2);
    }

    public AbstractC0041g(U u2, G.c cVar) {
        this.f1049a = u2;
        this.f1050b = cVar;
    }

    public AbstractC0041g(LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A) {
        this.f1050b = layoutInflaterFactory2C0090A;
    }
}
