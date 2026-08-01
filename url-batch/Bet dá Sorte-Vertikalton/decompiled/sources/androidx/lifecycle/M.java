package androidx.lifecycle;

import b0.C0078a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0078a f1424a = new C0078a();

    public final void a() {
        C0078a c0078a = this.f1424a;
        if (c0078a != null && !c0078a.d) {
            c0078a.d = true;
            synchronized (c0078a.f1577a) {
                try {
                    Iterator it = c0078a.f1578b.values().iterator();
                    while (it.hasNext()) {
                        C0078a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0078a.f1579c.iterator();
                    while (it2.hasNext()) {
                        C0078a.a((AutoCloseable) it2.next());
                    }
                    c0078a.f1579c.clear();
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
