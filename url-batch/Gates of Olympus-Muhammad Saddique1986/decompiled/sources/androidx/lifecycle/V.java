package androidx.lifecycle;

import java.util.Iterator;
import s1.C0965c;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0965c f5203a = new C0965c();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C0965c c0965c = this.f5203a;
        if (c0965c != null) {
            if (c0965c.f8357d) {
                C0965c.a(autoCloseable);
                return;
            }
            synchronized (c0965c.f8354a) {
                autoCloseable2 = (AutoCloseable) c0965c.f8355b.put(str, autoCloseable);
            }
            C0965c.a(autoCloseable2);
        }
    }

    public final void b() {
        C0965c c0965c = this.f5203a;
        if (c0965c != null && !c0965c.f8357d) {
            c0965c.f8357d = true;
            synchronized (c0965c.f8354a) {
                try {
                    Iterator it = c0965c.f8355b.values().iterator();
                    while (it.hasNext()) {
                        C0965c.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0965c.f8356c.iterator();
                    while (it2.hasNext()) {
                        C0965c.a((AutoCloseable) it2.next());
                    }
                    c0965c.f8356c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        C0965c c0965c = this.f5203a;
        if (c0965c == null) {
            return null;
        }
        synchronized (c0965c.f8354a) {
            autoCloseable = (AutoCloseable) c0965c.f8355b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
