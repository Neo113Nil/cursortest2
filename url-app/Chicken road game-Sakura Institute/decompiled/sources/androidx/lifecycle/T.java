package androidx.lifecycle;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public final r1.b f5457a = new r1.b();

    public final void a(K closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        r1.b bVar = this.f5457a;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
            Intrinsics.checkNotNullParameter(closeable, "closeable");
            if (bVar.f9860d) {
                r1.b.a(closeable);
                return;
            }
            synchronized (bVar.f9857a) {
                autoCloseable = (AutoCloseable) bVar.f9858b.put("androidx.lifecycle.savedstate.vm.tag", closeable);
            }
            r1.b.a(autoCloseable);
        }
    }

    public final void b() {
        r1.b bVar = this.f5457a;
        if (bVar != null && !bVar.f9860d) {
            bVar.f9860d = true;
            synchronized (bVar.f9857a) {
                try {
                    Iterator it = bVar.f9858b.values().iterator();
                    while (it.hasNext()) {
                        r1.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f9859c.iterator();
                    while (it2.hasNext()) {
                        r1.b.a((AutoCloseable) it2.next());
                    }
                    bVar.f9859c.clear();
                    Unit unit = Unit.f7487a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c();
    }

    public void c() {
    }
}
