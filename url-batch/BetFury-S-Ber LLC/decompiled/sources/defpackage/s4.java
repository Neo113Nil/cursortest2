package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class s4 {
    public Object a;
    public Object b;

    public s4(qe0 qe0Var, ma maVar) {
        this.a = qe0Var;
        this.b = maVar;
    }

    public void c() {
        r4 r4Var = (r4) this.a;
        if (r4Var != null) {
            try {
                ((v4) this.b).p.unregisterReceiver(r4Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void d() {
        qe0 qe0Var = (qe0) this.a;
        ma maVar = (ma) this.b;
        HashSet hashSet = qe0Var.e;
        if (hashSet.remove(maVar) && hashSet.isEmpty()) {
            qe0Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof fg0)) {
            return menuItem;
        }
        fg0 fg0Var = (fg0) menuItem;
        if (((zd0) this.b) == null) {
            this.b = new zd0(0);
        }
        MenuItem menuItem2 = (MenuItem) ((zd0) this.b).get(fg0Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        y10 y10Var = new y10((Context) this.a, fg0Var);
        ((zd0) this.b).put(fg0Var, y10Var);
        return y10Var;
    }

    public abstract void h();

    public void i() {
        c();
        IntentFilter e = e();
        if (e.countActions() == 0) {
            return;
        }
        if (((r4) this.a) == null) {
            this.a = new r4(this);
        }
        ((v4) this.b).p.registerReceiver((r4) this.a, e);
    }

    public s4(Context context) {
        this.a = context;
    }

    public s4(v4 v4Var) {
        this.b = v4Var;
    }
}
