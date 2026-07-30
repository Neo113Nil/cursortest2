package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class b90 {
    public Object a;
    public Object b;

    public b90() {
        this.b = new int[2];
    }

    public void c() {
        nf nfVar = (nf) this.a;
        if (nfVar != null) {
            try {
                ((qf) this.b).w.unregisterReceiver(nfVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void d() {
        bo2 bo2Var = (bo2) this.a;
        is isVar = (is) this.b;
        HashSet hashSet = bo2Var.e;
        if (hashSet.remove(isVar) && hashSet.isEmpty()) {
            bo2Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i);

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof yq2)) {
            return menuItem;
        }
        yq2 yq2Var = (yq2) menuItem;
        if (((fl2) this.b) == null) {
            this.b = new fl2(0);
        }
        MenuItem menuItem2 = (MenuItem) ((fl2) this.b).get(yq2Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        qk1 qk1Var = new qk1((Context) this.a, yq2Var);
        ((fl2) this.b).put(yq2Var, qk1Var);
        return qk1Var;
    }

    public int[] i(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String j() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        Intrinsics.f("text");
        throw null;
    }

    public boolean k() {
        bo2 bo2Var = (bo2) this.a;
        int c = in1.c(bo2Var.c.mView);
        int i = bo2Var.a;
        if (c != i) {
            return (c == 2 || i == 2) ? false : true;
        }
        return true;
    }

    public abstract void l();

    public abstract int[] m(int i);

    public void n() {
        c();
        IntentFilter e = e();
        if (e.countActions() == 0) {
            return;
        }
        if (((nf) this.a) == null) {
            this.a = new nf(this);
        }
        ((qf) this.b).w.registerReceiver((nf) this.a, e);
    }

    public b90(Context context) {
        this.a = context;
    }

    public b90(bo2 bo2Var, is isVar) {
        this.a = bo2Var;
        this.b = isVar;
    }

    public b90(qf qfVar) {
        this.b = qfVar;
    }
}
