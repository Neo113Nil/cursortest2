package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hal implements Runnable {
    private static final Logger a = Logger.getLogger(hal.class.getName());
    private static final Constructor b;
    private static final Field c;
    private final WeakReference d;
    private final PhantomReference e;
    private final ReferenceQueue f;

    static {
        Constructor constructor;
        Field field = null;
        try {
            constructor = Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            constructor = null;
        }
        b = constructor;
        if (constructor == null) {
            String property = System.getProperty("java.runtime.name", "");
            property.getClass();
            if (!property.contains("Android")) {
                try {
                    Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
                    declaredField.setAccessible(true);
                    field = declaredField;
                } catch (Throwable unused2) {
                    a.logp(Level.INFO, "com.google.common.base.internal.Finalizer", "getInheritableThreadLocalsField", "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
                }
            }
        }
        c = field;
    }

    private hal(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        this.f = referenceQueue;
        this.d = new WeakReference(cls);
        this.e = phantomReference;
    }

    private final boolean a(Reference reference, Method method) {
        reference.clear();
        if (reference == this.e) {
            return false;
        }
        try {
            method.invoke(reference, null);
            return true;
        } catch (Throwable th) {
            a.logp(Level.SEVERE, "com.google.common.base.internal.Finalizer", "finalizeReference", "Error cleaning up after reference.", th);
            return true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(10:3|4|5|(1:7)|8|9|10|(1:12)|14|15)|22|(0)|8|9|10|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        defpackage.hal.a.logp(java.util.logging.Level.INFO, "com.google.common.base.internal.Finalizer", "startFinalizer", "Failed to clear thread local values inherited by reference finalizer thread.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:10:0x004a, B:12:0x004e), top: B:9:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void startFinalizer(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        Thread thread;
        Field field;
        hal halVar = new hal(cls, referenceQueue, phantomReference);
        Constructor constructor = b;
        if (constructor != null) {
            try {
                thread = (Thread) constructor.newInstance(null, halVar, "com.google.common.base.internal.Finalizer", 0L, false);
            } catch (Throwable th) {
                a.logp(Level.INFO, "com.google.common.base.internal.Finalizer", "startFinalizer", "Failed to create a thread without inherited thread-local values", th);
            }
            if (thread == null) {
                thread = new Thread(null, halVar, "com.google.common.base.internal.Finalizer");
            }
            thread.setDaemon(true);
            field = c;
            if (field != null) {
                field.set(thread, null);
            }
            thread.start();
        }
        thread = null;
        if (thread == null) {
        }
        thread.setDaemon(true);
        field = c;
        if (field != null) {
        }
        thread.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Reference poll;
        while (true) {
            try {
                Reference remove = this.f.remove();
                Class cls = (Class) this.d.get();
                Method method = null;
                if (cls != null) {
                    try {
                        method = cls.getMethod("finalizeReferent", null);
                    } catch (NoSuchMethodException e) {
                        throw new AssertionError(e);
                    }
                }
                if (method != null && a(remove, method)) {
                    do {
                        poll = this.f.poll();
                        if (poll == null) {
                            break;
                        }
                    } while (a(poll, method));
                    return;
                }
                return;
            } catch (InterruptedException unused) {
            }
        }
    }
}
