package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agd {
    private final ags a = new ags();

    public final AutoCloseable s(String str) {
        AutoCloseable autoCloseable;
        ags agsVar = this.a;
        synchronized (agsVar.d) {
            autoCloseable = (AutoCloseable) agsVar.a.get(str);
        }
        return autoCloseable;
    }

    public final void t(AutoCloseable autoCloseable) {
        ags agsVar = this.a;
        if (agsVar.c) {
            ags.a(autoCloseable);
            return;
        }
        synchronized (agsVar.d) {
            agsVar.b.add(autoCloseable);
        }
    }

    public final void u(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        ags agsVar = this.a;
        if (agsVar.c) {
            ags.a(autoCloseable);
            return;
        }
        synchronized (agsVar.d) {
            autoCloseable2 = (AutoCloseable) agsVar.a.put(str, autoCloseable);
        }
        ags.a(autoCloseable2);
    }

    public final void v() {
        ags agsVar = this.a;
        if (!agsVar.c) {
            agsVar.c = true;
            synchronized (agsVar.d) {
                Iterator it = agsVar.a.values().iterator();
                while (it.hasNext()) {
                    ags.a((AutoCloseable) it.next());
                }
                Set set = agsVar.b;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ags.a((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        c();
    }

    protected void c() {
    }
}
