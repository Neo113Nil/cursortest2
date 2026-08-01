package Z;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import l.MenuItemC0176t;

/* renamed from: Z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0040g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1127a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1128b;

    public AbstractC0040g(Context context) {
        this.f1127a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f1127a;
        if (xVar != null) {
            try {
                ((g.A) this.f1128b).f2234k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1127a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1127a;
        HashSet hashSet = u2.f1084e;
        if (hashSet.remove((H.c) this.f1128b) && hashSet.isEmpty()) {
            u2.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof F.a)) {
            return menuItem;
        }
        F.a aVar = (F.a) menuItem;
        if (((p.k) this.f1128b) == null) {
            this.f1128b = new p.k();
        }
        MenuItem menuItem2 = (MenuItem) ((p.k) this.f1128b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0176t menuItemC0176t = new MenuItemC0176t((Context) this.f1127a, aVar);
        ((p.k) this.f1128b).put(aVar, menuItemC0176t);
        return menuItemC0176t;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f1127a) == null) {
            this.f1127a = new g.x(this);
        }
        ((g.A) this.f1128b).f2234k.registerReceiver((g.x) this.f1127a, e2);
    }

    public AbstractC0040g(U u2, H.c cVar) {
        this.f1127a = u2;
        this.f1128b = cVar;
    }

    public AbstractC0040g(g.A a2) {
        this.f1128b = a2;
    }
}
