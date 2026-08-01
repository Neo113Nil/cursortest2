package X;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0115A;
import java.util.HashSet;
import k.MenuItemC0165t;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0038g {

    /* renamed from: a, reason: collision with root package name */
    public Object f960a;

    /* renamed from: b, reason: collision with root package name */
    public Object f961b;

    public AbstractC0038g(Context context) {
        this.f960a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f960a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0115A) this.f961b).f2296k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f960a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f960a;
        HashSet hashSet = u2.f920e;
        if (hashSet.remove((G.c) this.f961b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f961b) == null) {
            this.f961b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f961b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0165t menuItemC0165t = new MenuItemC0165t((Context) this.f960a, aVar);
        ((o.k) this.f961b).put(aVar, menuItemC0165t);
        return menuItemC0165t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f960a) == null) {
            this.f960a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0115A) this.f961b).f2296k.registerReceiver((g.x) this.f960a, e2);
    }

    public AbstractC0038g(U u2, G.c cVar) {
        this.f960a = u2;
        this.f961b = cVar;
    }

    public AbstractC0038g(LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A) {
        this.f961b = layoutInflaterFactory2C0115A;
    }
}
