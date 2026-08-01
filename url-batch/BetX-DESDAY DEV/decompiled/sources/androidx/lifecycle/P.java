package androidx.lifecycle;

import a0.C0043a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public final C0043a f1471a = new C0043a();

    public final void a() {
        C0043a c0043a = this.f1471a;
        if (c0043a != null && !c0043a.f952d) {
            c0043a.f952d = true;
            synchronized (c0043a.f949a) {
                try {
                    Iterator it = c0043a.f950b.values().iterator();
                    while (it.hasNext()) {
                        C0043a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0043a.f951c.iterator();
                    while (it2.hasNext()) {
                        C0043a.a((AutoCloseable) it2.next());
                    }
                    c0043a.f951c.clear();
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
