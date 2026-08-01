package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class pc0 {
    public final qc0 a = new qc0();

    public final void a() {
        qc0 qc0Var = this.a;
        if (qc0Var != null && !qc0Var.d) {
            qc0Var.d = true;
            synchronized (qc0Var.a) {
                try {
                    Iterator it = qc0Var.b.values().iterator();
                    while (it.hasNext()) {
                        qc0.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = qc0Var.c.iterator();
                    while (it2.hasNext()) {
                        qc0.a((AutoCloseable) it2.next());
                    }
                    qc0Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c();
    }

    public final AutoCloseable b(String str) {
        AutoCloseable autoCloseable;
        qc0 qc0Var = this.a;
        if (qc0Var == null) {
            return null;
        }
        synchronized (qc0Var.a) {
            autoCloseable = (AutoCloseable) qc0Var.b.get(str);
        }
        return autoCloseable;
    }

    public void c() {
    }
}
