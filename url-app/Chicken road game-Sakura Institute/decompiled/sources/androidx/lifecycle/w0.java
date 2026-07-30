package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final s3.c f1042a = new s3.c();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        s3.c cVar = this.f1042a;
        if (cVar != null) {
            if (cVar.f8526d) {
                s3.c.a(autoCloseable);
                return;
            }
            synchronized (cVar.f8523a) {
                autoCloseable2 = (AutoCloseable) cVar.f8524b.put(str, autoCloseable);
            }
            s3.c.a(autoCloseable2);
        }
    }

    public final void b() {
        s3.c cVar = this.f1042a;
        if (cVar != null && !cVar.f8526d) {
            cVar.f8526d = true;
            synchronized (cVar.f8523a) {
                try {
                    Iterator it = cVar.f8524b.values().iterator();
                    while (it.hasNext()) {
                        s3.c.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = cVar.f8525c.iterator();
                    while (it2.hasNext()) {
                        s3.c.a((AutoCloseable) it2.next());
                    }
                    cVar.f8525c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        s3.c cVar = this.f1042a;
        if (cVar == null) {
            return null;
        }
        synchronized (cVar.f8523a) {
            autoCloseable = (AutoCloseable) cVar.f8524b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
