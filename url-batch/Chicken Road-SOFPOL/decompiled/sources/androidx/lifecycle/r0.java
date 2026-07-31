package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final n4.c f860a = new n4.c();

    public final void a() {
        n4.c cVar = this.f860a;
        if (cVar != null && !cVar.f5374d) {
            cVar.f5374d = true;
            synchronized (cVar.f5371a) {
                try {
                    Iterator it = cVar.f5372b.values().iterator();
                    while (it.hasNext()) {
                        n4.c.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = cVar.f5373c.iterator();
                    while (it2.hasNext()) {
                        n4.c.a((AutoCloseable) it2.next());
                    }
                    cVar.f5373c.clear();
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
