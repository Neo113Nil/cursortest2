package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hte extends hwf implements hvi {
    static final Object j = new Object();
    static final hvh k = new hvh(hsw.class);
    static final boolean l;
    public static final hsx m;
    volatile hst listenersField;
    volatile Object valueField;
    volatile htd waitersField;

    static {
        boolean z;
        hsx hszVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        l = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                hszVar = new htc();
            } catch (Error | Exception e) {
                try {
                    hszVar = new hsy();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    hszVar = new hsz();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                hszVar = new hsy();
            } catch (NoClassDefFoundError unused2) {
                hszVar = new hsz();
            }
        }
        th = null;
        th2 = null;
        m = hszVar;
        if (th != null) {
            hvh hvhVar = k;
            hvhVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            hvhVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private static void a(htd htdVar, htd htdVar2) {
        m.c(htdVar, htdVar2);
    }

    private final void b(htd htdVar) {
        htdVar.thread = null;
        while (true) {
            htd htdVar2 = this.waitersField;
            if (htdVar2 != htd.a) {
                htd htdVar3 = null;
                while (htdVar2 != null) {
                    htd htdVar4 = htdVar2.next;
                    if (htdVar2.thread != null) {
                        htdVar3 = htdVar2;
                    } else if (htdVar3 != null) {
                        htdVar3.next = htdVar4;
                        if (htdVar3.thread == null) {
                            break;
                        }
                    } else if (!bE(htdVar2, htdVar4)) {
                        break;
                    }
                    htdVar2 = htdVar4;
                }
                return;
            }
            return;
        }
    }

    private final boolean bE(htd htdVar, htd htdVar2) {
        return m.g(this, htdVar, htdVar2);
    }

    static boolean u(hte hteVar, Object obj, Object obj2) {
        return m.f(hteVar, obj, obj2);
    }

    public final Object s() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && hsw.n(obj2)) {
            return hsw.h(obj2);
        }
        htd htdVar = this.waitersField;
        if (htdVar != htd.a) {
            htd htdVar2 = new htd();
            do {
                a(htdVar2, htdVar);
                if (bE(htdVar, htdVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(htdVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & hsw.n(obj)));
                    return hsw.h(obj);
                }
                htdVar = this.waitersField;
            } while (htdVar != htd.a);
        }
        Object obj3 = this.valueField;
        obj3.getClass();
        return hsw.h(obj3);
    }

    public final Object t(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && hsw.n(obj)) {
            return hsw.h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            htd htdVar = this.waitersField;
            if (htdVar != htd.a) {
                htd htdVar2 = new htd();
                while (true) {
                    a(htdVar2, htdVar);
                    if (bE(htdVar, htdVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(htdVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && hsw.n(obj2)) {
                                return hsw.h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(htdVar2);
                    } else {
                        htd htdVar3 = this.waitersField;
                        if (htdVar3 == htd.a) {
                            break;
                        }
                        htdVar = htdVar3;
                    }
                }
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return hsw.h(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && hsw.n(obj4)) {
                return hsw.h(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj5 = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(a.ag(obj5, str, " for "));
    }
}
