package androidx.lifecycle;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public final d0.a f1920a = new d0.a();

    public final void a() {
        d0.a aVar = this.f1920a;
        if (aVar != null && !aVar.f2649d) {
            aVar.f2649d = true;
            synchronized (aVar.f2646a) {
                try {
                    Iterator it = aVar.f2647b.values().iterator();
                    while (it.hasNext()) {
                        d0.a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = aVar.f2648c.iterator();
                    while (it2.hasNext()) {
                        d0.a.a((AutoCloseable) it2.next());
                    }
                    aVar.f2648c.clear();
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
