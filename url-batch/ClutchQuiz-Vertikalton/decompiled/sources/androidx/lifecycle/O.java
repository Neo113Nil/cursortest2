package androidx.lifecycle;

import b0.C0081a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public final C0081a f1489a = new C0081a();

    public final void a() {
        C0081a c0081a = this.f1489a;
        if (c0081a != null && !c0081a.d) {
            c0081a.d = true;
            synchronized (c0081a.f1698a) {
                try {
                    Iterator it = c0081a.f1699b.values().iterator();
                    while (it.hasNext()) {
                        C0081a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0081a.f1700c.iterator();
                    while (it2.hasNext()) {
                        C0081a.a((AutoCloseable) it2.next());
                    }
                    c0081a.f1700c.clear();
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
