package defpackage;

import java.util.ArrayDeque;
import java.util.Set;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kks {
    final Object a;
    public boolean b;
    Object c;

    public kks(gzf gzfVar) {
        this.c = hjb.a;
        this.b = false;
        this.a = gzfVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    final Future a() {
        this.b = true;
        return this.c;
    }

    final void b(Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.b;
            if (!z) {
                this.c = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [gzf, java.lang.Object] */
    public final evj c() {
        return new evj(new evd(this.a, this.b, (hfm) this.c));
    }

    public final void d(Set set) {
        this.c = hfm.n(set);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Queue] */
    public final void e(ddj ddjVar) {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = new ArrayDeque();
            }
            this.c.add(ddjVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Queue] */
    public final void f(ddi ddiVar) {
        ddj ddjVar;
        Object obj = this.a;
        synchronized (obj) {
            if (this.c != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (obj) {
                        ddjVar = (ddj) this.c.poll();
                        if (ddjVar == null) {
                            this.b = false;
                            return;
                        }
                    }
                    ddjVar.b(ddiVar);
                }
            }
        }
    }

    public kks(Object obj) {
        this.a = obj;
    }

    public kks() {
        this.a = new Object();
    }
}
