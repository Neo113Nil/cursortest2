package androidx.lifecycle;

import d0.C0080a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0080a f1554a = new C0080a();

    public final void a() {
        C0080a c0080a = this.f1554a;
        if (c0080a != null && !c0080a.d) {
            c0080a.d = true;
            synchronized (c0080a.f2121a) {
                try {
                    Iterator it = c0080a.f2122b.values().iterator();
                    while (it.hasNext()) {
                        C0080a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0080a.f2123c.iterator();
                    while (it2.hasNext()) {
                        C0080a.a((AutoCloseable) it2.next());
                    }
                    c0080a.f2123c.clear();
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
