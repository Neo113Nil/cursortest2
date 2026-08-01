package androidx.lifecycle;

import d0.C0094a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0094a f1558a = new C0094a();

    public final void a() {
        C0094a c0094a = this.f1558a;
        if (c0094a != null && !c0094a.d) {
            c0094a.d = true;
            synchronized (c0094a.f2128a) {
                try {
                    Iterator it = c0094a.f2129b.values().iterator();
                    while (it.hasNext()) {
                        C0094a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0094a.f2130c.iterator();
                    while (it2.hasNext()) {
                        C0094a.a((AutoCloseable) it2.next());
                    }
                    c0094a.f2130c.clear();
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
