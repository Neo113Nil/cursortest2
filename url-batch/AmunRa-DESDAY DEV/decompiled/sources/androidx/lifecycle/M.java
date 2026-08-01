package androidx.lifecycle;

import b0.C0077a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0077a f1382a = new C0077a();

    public final void a() {
        C0077a c0077a = this.f1382a;
        if (c0077a != null && !c0077a.d) {
            c0077a.d = true;
            synchronized (c0077a.f1535a) {
                try {
                    Iterator it = c0077a.f1536b.values().iterator();
                    while (it.hasNext()) {
                        C0077a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0077a.f1537c.iterator();
                    while (it2.hasNext()) {
                        C0077a.a((AutoCloseable) it2.next());
                    }
                    c0077a.f1537c.clear();
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
