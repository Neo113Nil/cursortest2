package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0141C;
import java.util.HashSet;
import k.MenuItemC0207t;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0050g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1342a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1343b;

    public AbstractC0050g(Context context) {
        this.f1342a = context;
    }

    public void c() {
        g.z zVar = (g.z) this.f1342a;
        if (zVar != null) {
            try {
                ((LayoutInflaterFactory2C0141C) this.f1343b).f2467k.unregisterReceiver(zVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1342a = null;
        }
    }

    public void d() {
        X x2 = (X) this.f1342a;
        HashSet hashSet = x2.f1297e;
        if (hashSet.remove((G.d) this.f1343b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f1343b) == null) {
            this.f1343b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1343b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0207t menuItemC0207t = new MenuItemC0207t((Context) this.f1342a, aVar);
        ((o.k) this.f1343b).put(aVar, menuItemC0207t);
        return menuItemC0207t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.z) this.f1342a) == null) {
            this.f1342a = new g.z(this);
        }
        ((LayoutInflaterFactory2C0141C) this.f1343b).f2467k.registerReceiver((g.z) this.f1342a, e2);
    }

    public AbstractC0050g(X x2, G.d dVar) {
        this.f1342a = x2;
        this.f1343b = dVar;
    }

    public AbstractC0050g(LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C) {
        this.f1343b = layoutInflaterFactory2C0141C;
    }
}
