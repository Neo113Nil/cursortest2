package defpackage;

import java.io.Closeable;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gze implements Closeable {
    public static final Logger a = Logger.getLogger(gze.class.getName());
    private static final gzb e;
    final ReferenceQueue b;
    final PhantomReference c;
    final boolean d;

    static {
        Class cls;
        gzb gyzVar;
        gza[] gzaVarArr = {new gzd(0), new gzd(1)};
        int i = 0;
        while (true) {
            if (i >= 2) {
                cls = null;
                break;
            }
            cls = gzaVarArr[i].a();
            if (cls != null) {
                break;
            } else {
                i++;
            }
        }
        if (cls != null) {
            try {
                gyzVar = new gzc(cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class));
            } catch (NoSuchMethodException e2) {
                throw new AssertionError(e2);
            }
        } else {
            gyzVar = new gyz();
        }
        e = gyzVar;
    }

    public gze() {
        boolean z;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.b = referenceQueue;
        PhantomReference phantomReference = new PhantomReference(this, referenceQueue);
        this.c = phantomReference;
        try {
            e.a(gyy.class, referenceQueue, phantomReference);
            z = true;
        } catch (Throwable th) {
            a.logp(Level.INFO, "com.google.common.base.FinalizableReferenceQueue", "<init>", "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z = false;
        }
        this.d = z;
    }

    public static boolean b() {
        String property = System.getProperty("java.runtime.name", "");
        property.getClass();
        return property.contains("Android");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void a() {
        if (this.d) {
            return;
        }
        while (true) {
            Reference poll = this.b.poll();
            if (poll == 0) {
                return;
            }
            poll.clear();
            try {
                ((gyy) poll).finalizeReferent();
            } catch (Throwable th) {
                a.logp(Level.SEVERE, "com.google.common.base.FinalizableReferenceQueue", "cleanUp", "Error cleaning up after reference.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.enqueue();
        a();
    }
}
