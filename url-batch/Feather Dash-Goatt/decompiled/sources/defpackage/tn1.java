package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class tn1 {
    public final un1 a = new un1();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        un1 un1Var = this.a;
        if (un1Var != null) {
            if (un1Var.d) {
                un1.a(autoCloseable);
                return;
            }
            synchronized (un1Var.a) {
                autoCloseable2 = (AutoCloseable) un1Var.b.put(str, autoCloseable);
            }
            un1.a(autoCloseable2);
        }
    }

    public final void b() {
        un1 un1Var = this.a;
        if (un1Var != null && !un1Var.d) {
            un1Var.d = true;
            synchronized (un1Var.a) {
                try {
                    Iterator it = un1Var.b.values().iterator();
                    while (it.hasNext()) {
                        un1.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = un1Var.c.iterator();
                    while (it2.hasNext()) {
                        un1.a((AutoCloseable) it2.next());
                    }
                    un1Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        un1 un1Var = this.a;
        if (un1Var == null) {
            return null;
        }
        synchronized (un1Var.a) {
            autoCloseable = (AutoCloseable) un1Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
