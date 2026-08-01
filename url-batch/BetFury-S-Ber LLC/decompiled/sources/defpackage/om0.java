package defpackage;

import java.io.Closeable;
import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class om0 {
    private final pm0 impl = new pm0();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        str.getClass();
        autoCloseable.getClass();
        pm0 pm0Var = this.impl;
        if (pm0Var != null) {
            if (pm0Var.d) {
                pm0.a(autoCloseable);
                return;
            }
            synchronized (pm0Var.a) {
                autoCloseable2 = (AutoCloseable) pm0Var.b.put(str, autoCloseable);
            }
            pm0.a(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        pm0 pm0Var = this.impl;
        if (pm0Var != null && !pm0Var.d) {
            pm0Var.d = true;
            synchronized (pm0Var.a) {
                try {
                    Iterator it = pm0Var.b.values().iterator();
                    while (it.hasNext()) {
                        pm0.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = pm0Var.c.iterator();
                    while (it2.hasNext()) {
                        pm0.a((AutoCloseable) it2.next());
                    }
                    pm0Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        str.getClass();
        pm0 pm0Var = this.impl;
        if (pm0Var == null) {
            return null;
        }
        synchronized (pm0Var.a) {
            t = (T) pm0Var.b.get(str);
        }
        return t;
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        pm0 pm0Var = this.impl;
        if (pm0Var != null) {
            if (pm0Var.d) {
                pm0.a(autoCloseable);
                return;
            }
            synchronized (pm0Var.a) {
                pm0Var.c.add(autoCloseable);
            }
        }
    }

    public void addCloseable(Closeable closeable) {
        closeable.getClass();
        pm0 pm0Var = this.impl;
        if (pm0Var != null) {
            if (pm0Var.d) {
                pm0.a(closeable);
                return;
            }
            synchronized (pm0Var.a) {
                pm0Var.c.add(closeable);
            }
        }
    }

    public void onCleared() {
    }
}
