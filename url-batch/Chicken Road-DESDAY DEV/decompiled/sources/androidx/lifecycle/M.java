package androidx.lifecycle;

import b0.C0079a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0079a f1407a = new C0079a();

    public final void a() {
        C0079a c0079a = this.f1407a;
        if (c0079a != null && !c0079a.d) {
            c0079a.d = true;
            synchronized (c0079a.f1561a) {
                try {
                    Iterator it = c0079a.f1562b.values().iterator();
                    while (it.hasNext()) {
                        C0079a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0079a.f1563c.iterator();
                    while (it2.hasNext()) {
                        C0079a.a((AutoCloseable) it2.next());
                    }
                    c0079a.f1563c.clear();
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
