package X;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import k.MenuItemC0174t;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0038g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1055a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1056b;

    public AbstractC0038g(Context context) {
        this.f1055a = context;
    }

    public void c() {
        g.w wVar = (g.w) this.f1055a;
        if (wVar != null) {
            try {
                ((g.z) this.f1056b).f2524k.unregisterReceiver(wVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1055a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1055a;
        HashSet hashSet = u2.f1015e;
        if (hashSet.remove((G.c) this.f1056b) && hashSet.isEmpty()) {
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
        if (((o.k) this.f1056b) == null) {
            this.f1056b = new o.k();
        }
        MenuItem menuItem2 = (MenuItem) ((o.k) this.f1056b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0174t menuItemC0174t = new MenuItemC0174t((Context) this.f1055a, aVar);
        ((o.k) this.f1056b).put(aVar, menuItemC0174t);
        return menuItemC0174t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.w) this.f1055a) == null) {
            this.f1055a = new g.w(this);
        }
        ((g.z) this.f1056b).f2524k.registerReceiver((g.w) this.f1055a, e2);
    }

    public AbstractC0038g(U u2, G.c cVar) {
        this.f1055a = u2;
        this.f1056b = cVar;
    }

    public AbstractC0038g(g.z zVar) {
        this.f1056b = zVar;
    }
}
