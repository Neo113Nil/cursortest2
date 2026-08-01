package androidx.lifecycle;

import c0.C0084a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0084a f1466a = new C0084a();

    public final void a() {
        C0084a c0084a = this.f1466a;
        if (c0084a != null && !c0084a.d) {
            c0084a.d = true;
            synchronized (c0084a.f1638a) {
                try {
                    Iterator it = c0084a.f1639b.values().iterator();
                    while (it.hasNext()) {
                        C0084a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0084a.f1640c.iterator();
                    while (it2.hasNext()) {
                        C0084a.a((AutoCloseable) it2.next());
                    }
                    c0084a.f1640c.clear();
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
