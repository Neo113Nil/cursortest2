package X;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0112A;
import java.util.HashSet;
import k.MenuItemC0164t;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0037g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1003a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1004b;

    public AbstractC0037g(Context context) {
        this.f1003a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f1003a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0112A) this.f1004b).f2338k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1003a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1003a;
        HashSet hashSet = u2.f963e;
        if (hashSet.remove((G.c) this.f1004b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f1004b) == null) {
            this.f1004b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1004b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0164t menuItemC0164t = new MenuItemC0164t((Context) this.f1003a, aVar);
        ((o.k) this.f1004b).put(aVar, menuItemC0164t);
        return menuItemC0164t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f1003a) == null) {
            this.f1003a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0112A) this.f1004b).f2338k.registerReceiver((g.x) this.f1003a, e2);
    }

    public AbstractC0037g(U u2, G.c cVar) {
        this.f1003a = u2;
        this.f1004b = cVar;
    }

    public AbstractC0037g(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A) {
        this.f1004b = layoutInflaterFactory2C0112A;
    }
}
