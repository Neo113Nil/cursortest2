package Z;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import g.LayoutInflaterFactory2C0101A;
import java.util.HashSet;

/* renamed from: Z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0037g {

    /* renamed from: a, reason: collision with root package name */
    public Object f1138a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1139b;

    public AbstractC0037g(Context context) {
        this.f1138a = context;
    }

    public void c() {
        g.x xVar = (g.x) this.f1138a;
        if (xVar != null) {
            try {
                ((LayoutInflaterFactory2C0101A) this.f1139b).f2221k.unregisterReceiver(xVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1138a = null;
        }
    }

    public void d() {
        U u2 = (U) this.f1138a;
        HashSet hashSet = u2.f1098e;
        if (hashSet.remove((I.c) this.f1139b) && hashSet.isEmpty()) {
            u2.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof G.a)) {
            return menuItem;
        }
        G.a aVar = (G.a) menuItem;
        if (((q.k) this.f1139b) == null) {
            this.f1139b = new q.k();
        }
        MenuItem menuItem2 = (MenuItem) ((q.k) this.f1139b).getOrDefault(aVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k.t tVar = new k.t((Context) this.f1138a, aVar);
        ((q.k) this.f1139b).put(aVar, tVar);
        return tVar;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e2 = e();
        if (e2.countActions() == 0) {
            return;
        }
        if (((g.x) this.f1138a) == null) {
            this.f1138a = new g.x(this);
        }
        ((LayoutInflaterFactory2C0101A) this.f1139b).f2221k.registerReceiver((g.x) this.f1138a, e2);
    }

    public AbstractC0037g(U u2, I.c cVar) {
        this.f1138a = u2;
        this.f1139b = cVar;
    }

    public AbstractC0037g(LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A) {
        this.f1139b = layoutInflaterFactory2C0101A;
    }
}
