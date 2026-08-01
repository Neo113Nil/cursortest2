package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0142C;
import java.util.HashSet;
import k.MenuItemC0209t;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0050g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1343a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1344b;

    public AbstractC0050g(Context context) {
        this.f1343a = context;
    }

    public void c() {
        g.z zVar = (g.z) this.f1343a;
        if (zVar != null) {
            try {
                ((LayoutInflaterFactory2C0142C) this.f1344b).f2471k.unregisterReceiver(zVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1343a = null;
        }
    }

    public void d() {
        X x2 = (X) this.f1343a;
        HashSet hashSet = x2.f1298e;
        if (hashSet.remove((G.d) this.f1344b) && hashSet.isEmpty()) {
            x2.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof E.a)) {
            return menuItem;
        }
        E.a aVar = (E.a) menuItem;
        if (((o.k) this.f1344b) == null) {
            this.f1344b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1344b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0209t menuItemC0209t = new MenuItemC0209t((Context) this.f1343a, aVar);
        ((o.k) this.f1344b).put(aVar, menuItemC0209t);
        return menuItemC0209t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.z) this.f1343a) == null) {
            this.f1343a = new g.z(this);
        }
        ((LayoutInflaterFactory2C0142C) this.f1344b).f2471k.registerReceiver((g.z) this.f1343a, e2);
    }

    public AbstractC0050g(X x2, G.d dVar) {
        this.f1343a = x2;
        this.f1344b = dVar;
    }

    public AbstractC0050g(LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C) {
        this.f1344b = layoutInflaterFactory2C0142C;
    }
}
