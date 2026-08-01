package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class a4 {
    public Object a;
    public Object b;

    public a4(k30 k30Var, h9 h9Var) {
        this.a = k30Var;
        this.b = h9Var;
    }

    public void c() {
        z3 z3Var = (z3) this.a;
        if (z3Var != null) {
            try {
                ((d4) this.b).p.unregisterReceiver(z3Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void d() {
        k30 k30Var = (k30) this.a;
        h9 h9Var = (h9) this.b;
        HashSet hashSet = k30Var.e;
        if (hashSet.remove(h9Var) && hashSet.isEmpty()) {
            k30Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof u40)) {
            return menuItem;
        }
        u40 u40Var = (u40) menuItem;
        if (((u20) this.b) == null) {
            this.b = new u20(0);
        }
        MenuItem menuItem2 = (MenuItem) ((u20) this.b).get(u40Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        tt ttVar = new tt((Context) this.a, u40Var);
        ((u20) this.b).put(u40Var, ttVar);
        return ttVar;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e = e();
        if (e.countActions() == 0) {
            return;
        }
        if (((z3) this.a) == null) {
            this.a = new z3(this);
        }
        ((d4) this.b).p.registerReceiver((z3) this.a, e);
    }

    public a4(Context context) {
        this.a = context;
    }

    public a4(d4 d4Var) {
        this.b = d4Var;
    }
}
