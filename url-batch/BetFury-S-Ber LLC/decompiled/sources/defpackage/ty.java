package defpackage;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ty {
    public static final Object k = new Object();
    public final Object a;
    public final jb0 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final v7 j;

    public ty() {
        this.a = new Object();
        this.b = new jb0();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new v7(8, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        x6.F().a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        s9.u(r7.c("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(sy syVar) {
        if (syVar.g) {
            if (!syVar.d()) {
                syVar.a(false);
                return;
            }
            int i = syVar.h;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            syVar.h = i2;
            syVar.f.a(this.e);
        }
    }

    public final void c(sy syVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (syVar != null) {
                b(syVar);
                syVar = null;
            } else {
                jb0 jb0Var = this.b;
                jb0Var.getClass();
                hb0 hb0Var = new hb0(jb0Var);
                jb0Var.h.put(hb0Var, Boolean.FALSE);
                while (hb0Var.hasNext()) {
                    b((sy) ((Map.Entry) hb0Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(k40 k40Var) {
        Object obj;
        a("observeForever");
        qy qyVar = new qy(this, k40Var);
        jb0 jb0Var = this.b;
        gb0 a = jb0Var.a(k40Var);
        if (a != null) {
            obj = a.g;
        } else {
            gb0 gb0Var = new gb0(k40Var, qyVar);
            jb0Var.i++;
            gb0 gb0Var2 = jb0Var.g;
            if (gb0Var2 == null) {
                jb0Var.f = gb0Var;
                jb0Var.g = gb0Var;
            } else {
                gb0Var2.h = gb0Var;
                gb0Var.i = gb0Var2;
                jb0Var.g = gb0Var;
            }
            obj = null;
        }
        sy syVar = (sy) obj;
        if (syVar instanceof ry) {
            s9.k("Cannot add the same observer with different lifecycles");
        } else {
            if (syVar != null) {
                return;
            }
            qyVar.a(true);
        }
    }

    public final void g(k40 k40Var) {
        a("removeObserver");
        sy syVar = (sy) this.b.b(k40Var);
        if (syVar == null) {
            return;
        }
        syVar.b();
        syVar.a(false);
    }

    public void h(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public ty(Object obj) {
        this.a = new Object();
        this.b = new jb0();
        this.c = 0;
        this.f = k;
        this.j = new v7(8, this);
        this.e = obj;
        this.g = 0;
    }

    public void e() {
    }

    public void f() {
    }
}
