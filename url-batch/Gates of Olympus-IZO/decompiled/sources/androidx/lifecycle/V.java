package androidx.lifecycle;

import java.util.Iterator;
import p1.C0764c;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0764c f4002a = new C0764c();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C0764c c0764c = this.f4002a;
        if (c0764c != null) {
            if (c0764c.f6759d) {
                C0764c.a(autoCloseable);
                return;
            }
            synchronized (c0764c.f6756a) {
                autoCloseable2 = (AutoCloseable) c0764c.f6757b.put(str, autoCloseable);
            }
            C0764c.a(autoCloseable2);
        }
    }

    public final void b() {
        C0764c c0764c = this.f4002a;
        if (c0764c != null && !c0764c.f6759d) {
            c0764c.f6759d = true;
            synchronized (c0764c.f6756a) {
                try {
                    Iterator it = c0764c.f6757b.values().iterator();
                    while (it.hasNext()) {
                        C0764c.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0764c.f6758c.iterator();
                    while (it2.hasNext()) {
                        C0764c.a((AutoCloseable) it2.next());
                    }
                    c0764c.f6758c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        C0764c c0764c = this.f4002a;
        if (c0764c == null) {
            return null;
        }
        synchronized (c0764c.f6756a) {
            autoCloseable = (AutoCloseable) c0764c.f6757b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
