package androidx.lifecycle;

import c0.C0086a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public final C0086a f1870a = new C0086a();

    public final void a() {
        C0086a c0086a = this.f1870a;
        if (c0086a != null && !c0086a.d) {
            c0086a.d = true;
            synchronized (c0086a.f2056a) {
                try {
                    Iterator it = c0086a.f2057b.values().iterator();
                    while (it.hasNext()) {
                        C0086a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0086a.f2058c.iterator();
                    while (it2.hasNext()) {
                        C0086a.a((AutoCloseable) it2.next());
                    }
                    c0086a.f2058c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
