package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n53 {
    public final o53 a = new o53();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        o53 o53Var = this.a;
        if (o53Var != null) {
            if (o53Var.d) {
                o53.a(autoCloseable);
                return;
            }
            synchronized (o53Var.a) {
                autoCloseable2 = (AutoCloseable) o53Var.b.put(str, autoCloseable);
            }
            o53.a(autoCloseable2);
        }
    }

    public final void b() {
        o53 o53Var = this.a;
        if (o53Var != null && !o53Var.d) {
            o53Var.d = true;
            synchronized (o53Var.a) {
                try {
                    Iterator it = o53Var.b.values().iterator();
                    while (it.hasNext()) {
                        o53.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = o53Var.c.iterator();
                    while (it2.hasNext()) {
                        o53.a((AutoCloseable) it2.next());
                    }
                    o53Var.c.clear();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        o53 o53Var = this.a;
        if (o53Var == null) {
            return null;
        }
        synchronized (o53Var.a) {
            autoCloseable = (AutoCloseable) o53Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
