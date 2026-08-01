package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final m4.d f729a = new m4.d();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        m4.d dVar = this.f729a;
        if (dVar != null) {
            if (dVar.f6558d) {
                m4.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f6555a) {
                autoCloseable2 = (AutoCloseable) dVar.f6556b.put(str, autoCloseable);
            }
            m4.d.a(autoCloseable2);
        }
    }

    public final void b() {
        m4.d dVar = this.f729a;
        if (dVar != null && !dVar.f6558d) {
            dVar.f6558d = true;
            synchronized (dVar.f6555a) {
                try {
                    Iterator it = dVar.f6556b.values().iterator();
                    while (it.hasNext()) {
                        m4.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f6557c.iterator();
                    while (it2.hasNext()) {
                        m4.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f6557c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        m4.d dVar = this.f729a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f6555a) {
            autoCloseable = (AutoCloseable) dVar.f6556b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
