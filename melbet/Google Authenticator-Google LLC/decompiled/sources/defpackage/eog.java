package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eog {
    public static final hoq c = new hoq();
    public final Queue b;
    private final AtomicReference d = new AtomicReference();
    public final AtomicReference a = new AtomicReference();

    public eog() {
        new AtomicReference(null);
        this.b = new ConcurrentLinkedQueue();
    }

    public static eog b(hel helVar) {
        int i = 0;
        while (i < ((his) helVar).c) {
            eog c2 = c((guc) helVar.get(i), false);
            i++;
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    public static eog c(guc gucVar, boolean z) {
        if (z && !gta.u()) {
            return null;
        }
        gtz j = guc.j(c, gucVar);
        if (j.b()) {
            return (eog) j.a();
        }
        return null;
    }

    public final eoc a() {
        return (eoc) this.d.get();
    }

    public final boolean d() {
        return this.a.get() != null;
    }
}
