package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class q4 {
    public Object a;
    public Object b;

    public q4(Context context) {
        this.a = context;
    }

    public void c() {
        p4 p4Var = (p4) this.a;
        if (p4Var != null) {
            try {
                ((t4) this.b).p.unregisterReceiver(p4Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof b50)) {
            return menuItem;
        }
        b50 b50Var = (b50) menuItem;
        if (((h30) this.b) == null) {
            this.b = new h30(0);
        }
        MenuItem menuItem2 = (MenuItem) ((h30) this.b).get(b50Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        iu iuVar = new iu((Context) this.a, b50Var);
        ((h30) this.b).put(b50Var, iuVar);
        return iuVar;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((p4) this.a) == null) {
            this.a = new p4(this);
        }
        ((t4) this.b).p.registerReceiver((p4) this.a, d);
    }

    public q4(t4 t4Var) {
        this.b = t4Var;
    }
}
