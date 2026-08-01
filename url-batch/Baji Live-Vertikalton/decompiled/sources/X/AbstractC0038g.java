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
    public Object f911a;

    /* renamed from: b, reason: collision with root package name */
    public Object f912b;

    public AbstractC0038g(Context context) {
        this.f911a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f911a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0109A) this.f912b).f2222k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f911a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f911a;
        HashSet hashSet = u2.f871e;
        if (hashSet.remove((G.c) this.f912b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f912b) == null) {
            this.f912b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f912b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0164t menuItemC0164t = new MenuItemC0164t((Context) this.f911a, aVar);
        ((o.k) this.f912b).put(aVar, menuItemC0164t);
        return menuItemC0164t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f911a) == null) {
            this.f911a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0109A) this.f912b).f2222k.registerReceiver((g.x) this.f911a, e2);
    }

    public AbstractC0038g(U u2, G.c cVar) {
        this.f911a = u2;
        this.f912b = cVar;
    }

    public AbstractC0038g(LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A) {
        this.f912b = layoutInflaterFactory2C0109A;
    }
}
