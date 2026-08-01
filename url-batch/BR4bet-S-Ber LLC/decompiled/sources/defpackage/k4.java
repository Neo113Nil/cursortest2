package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class k4 {
    public Object a;
    public Object b;

    public k4(m60 m60Var, u9 u9Var) {
        this.a = m60Var;
        this.b = u9Var;
    }

    public void c() {
        j4 j4Var = (j4) this.a;
        if (j4Var != null) {
            try {
                ((n4) this.b).p.unregisterReceiver(j4Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void d() {
        m60 m60Var = (m60) this.a;
        u9 u9Var = (u9) this.b;
        HashSet hashSet = m60Var.e;
        if (hashSet.remove(u9Var) && hashSet.isEmpty()) {
            m60Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof w70)) {
            return menuItem;
        }
        w70 w70Var = (w70) menuItem;
        if (((w50) this.b) == null) {
            this.b = new w50(0);
        }
        MenuItem menuItem2 = (MenuItem) ((w50) this.b).get(w70Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        uw uwVar = new uw((Context) this.a, w70Var);
        ((w50) this.b).put(w70Var, uwVar);
        return uwVar;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e = e();
        if (e.countActions() == 0) {
            return;
        }
        if (((j4) this.a) == null) {
            this.a = new j4(this);
        }
        ((n4) this.b).p.registerReceiver((j4) this.a, e);
    }

    public k4(Context context) {
        this.a = context;
    }

    public k4(n4 n4Var) {
        this.b = n4Var;
    }
}
