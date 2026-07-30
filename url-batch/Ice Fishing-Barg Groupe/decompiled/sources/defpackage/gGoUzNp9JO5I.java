package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class gGoUzNp9JO5I implements Future {
    public static final f2 cpQdD2nAriOS;
    public static final Object r3s1LDPKFs1S;
    public volatile nLZGh9p8gVSu OPXfSBeufaJ8;
    public volatile Object rtx2ld2ELZv4;
    public volatile Pf0ThKz3j5YS wdg6QnbFHrFF;
    public static final boolean dgRBjINgWbAK = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger x50lh2ztY7Y5 = Logger.getLogger(gGoUzNp9JO5I.class.getName());

    static {
        f2 amuv7njvpxhu;
        try {
            amuv7njvpxhu = new ryVscX7ZL4Ux(AtomicReferenceFieldUpdater.newUpdater(Pf0ThKz3j5YS.class, Thread.class, "PxuCJdSBwIXG"), AtomicReferenceFieldUpdater.newUpdater(Pf0ThKz3j5YS.class, Pf0ThKz3j5YS.class, "lS5Rgt96tfkO"), AtomicReferenceFieldUpdater.newUpdater(gGoUzNp9JO5I.class, Pf0ThKz3j5YS.class, "wdg6QnbFHrFF"), AtomicReferenceFieldUpdater.newUpdater(gGoUzNp9JO5I.class, nLZGh9p8gVSu.class, "OPXfSBeufaJ8"), AtomicReferenceFieldUpdater.newUpdater(gGoUzNp9JO5I.class, Object.class, "rtx2ld2ELZv4"));
            th = null;
        } catch (Throwable th) {
            th = th;
            amuv7njvpxhu = new amuv7NJvPxHu();
        }
        cpQdD2nAriOS = amuv7njvpxhu;
        if (th != null) {
            x50lh2ztY7Y5.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        r3s1LDPKFs1S = new Object();
    }

    public static Object TSizfFm2Yiuu(Object obj) {
        if (obj instanceof EpkonXwzFgDB) {
            Throwable th = ((EpkonXwzFgDB) obj).PxuCJdSBwIXG;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof xfACYKDMU6Dj) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == r3s1LDPKFs1S) {
            return null;
        }
        return obj;
    }

    public static Object Y1f8riQaR6yg(gGoUzNp9JO5I ggouznp9jo5i) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = ggouznp9jo5i.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void lS5Rgt96tfkO(gGoUzNp9JO5I ggouznp9jo5i) {
        Pf0ThKz3j5YS pf0ThKz3j5YS;
        nLZGh9p8gVSu nlzgh9p8gvsu;
        do {
            pf0ThKz3j5YS = ggouznp9jo5i.wdg6QnbFHrFF;
        } while (!cpQdD2nAriOS.dgRBjINgWbAK(ggouznp9jo5i, pf0ThKz3j5YS, Pf0ThKz3j5YS.TSizfFm2Yiuu));
        while (pf0ThKz3j5YS != null) {
            Thread thread = pf0ThKz3j5YS.PxuCJdSBwIXG;
            if (thread != null) {
                pf0ThKz3j5YS.PxuCJdSBwIXG = null;
                LockSupport.unpark(thread);
            }
            pf0ThKz3j5YS = pf0ThKz3j5YS.lS5Rgt96tfkO;
        }
        do {
            nlzgh9p8gvsu = ggouznp9jo5i.OPXfSBeufaJ8;
        } while (!cpQdD2nAriOS.OPXfSBeufaJ8(ggouznp9jo5i, nlzgh9p8gvsu));
        nLZGh9p8gVSu nlzgh9p8gvsu2 = null;
        while (nlzgh9p8gvsu != null) {
            nLZGh9p8gVSu nlzgh9p8gvsu3 = nlzgh9p8gvsu.PxuCJdSBwIXG;
            nlzgh9p8gvsu.PxuCJdSBwIXG = nlzgh9p8gvsu2;
            nlzgh9p8gvsu2 = nlzgh9p8gvsu;
            nlzgh9p8gvsu = nlzgh9p8gvsu3;
        }
        while (nlzgh9p8gvsu2 != null) {
            nlzgh9p8gvsu2 = nlzgh9p8gvsu2.PxuCJdSBwIXG;
            try {
                throw null;
            } catch (RuntimeException e) {
                x50lh2ztY7Y5.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public final void PxuCJdSBwIXG(StringBuilder sb) {
        try {
            Object Y1f8riQaR6yg = Y1f8riQaR6yg(this);
            sb.append("SUCCESS, result=[");
            sb.append(Y1f8riQaR6yg == this ? "this future" : String.valueOf(Y1f8riQaR6yg));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.rtx2ld2ELZv4;
        if (obj != null) {
            return false;
        }
        if (!cpQdD2nAriOS.wdg6QnbFHrFF(this, obj, dgRBjINgWbAK ? new EpkonXwzFgDB(new CancellationException("Future.cancel() was called."), z) : z ? EpkonXwzFgDB.lS5Rgt96tfkO : EpkonXwzFgDB.TSizfFm2Yiuu)) {
            return false;
        }
        lS5Rgt96tfkO(this);
        return true;
    }

    public final void e9gEMXR7LXtO(Pf0ThKz3j5YS pf0ThKz3j5YS) {
        pf0ThKz3j5YS.PxuCJdSBwIXG = null;
        while (true) {
            Pf0ThKz3j5YS pf0ThKz3j5YS2 = this.wdg6QnbFHrFF;
            if (pf0ThKz3j5YS2 == Pf0ThKz3j5YS.TSizfFm2Yiuu) {
                return;
            }
            Pf0ThKz3j5YS pf0ThKz3j5YS3 = null;
            while (pf0ThKz3j5YS2 != null) {
                Pf0ThKz3j5YS pf0ThKz3j5YS4 = pf0ThKz3j5YS2.lS5Rgt96tfkO;
                if (pf0ThKz3j5YS2.PxuCJdSBwIXG != null) {
                    pf0ThKz3j5YS3 = pf0ThKz3j5YS2;
                } else if (pf0ThKz3j5YS3 != null) {
                    pf0ThKz3j5YS3.lS5Rgt96tfkO = pf0ThKz3j5YS4;
                    if (pf0ThKz3j5YS3.PxuCJdSBwIXG == null) {
                        break;
                    }
                } else if (!cpQdD2nAriOS.dgRBjINgWbAK(this, pf0ThKz3j5YS2, pf0ThKz3j5YS4)) {
                    break;
                }
                pf0ThKz3j5YS2 = pf0ThKz3j5YS4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Pf0ThKz3j5YS pf0ThKz3j5YS = Pf0ThKz3j5YS.TSizfFm2Yiuu;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.rtx2ld2ELZv4;
        if (obj != null) {
            return TSizfFm2Yiuu(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Pf0ThKz3j5YS pf0ThKz3j5YS2 = this.wdg6QnbFHrFF;
            if (pf0ThKz3j5YS2 != pf0ThKz3j5YS) {
                Pf0ThKz3j5YS pf0ThKz3j5YS3 = new Pf0ThKz3j5YS();
                do {
                    f2 f2Var = cpQdD2nAriOS;
                    f2Var.ryVscX7ZL4Ux(pf0ThKz3j5YS3, pf0ThKz3j5YS2);
                    if (f2Var.dgRBjINgWbAK(this, pf0ThKz3j5YS2, pf0ThKz3j5YS3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e9gEMXR7LXtO(pf0ThKz3j5YS3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.rtx2ld2ELZv4;
                            if (obj2 != null) {
                                return TSizfFm2Yiuu(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e9gEMXR7LXtO(pf0ThKz3j5YS3);
                    } else {
                        pf0ThKz3j5YS2 = this.wdg6QnbFHrFF;
                    }
                } while (pf0ThKz3j5YS2 != pf0ThKz3j5YS);
            }
            return TSizfFm2Yiuu(this.rtx2ld2ELZv4);
        }
        while (nanos > 0) {
            Object obj3 = this.rtx2ld2ELZv4;
            if (obj3 != null) {
                return TSizfFm2Yiuu(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String ggouznp9jo5i = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
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
        throw new TimeoutException(str + " for " + ggouznp9jo5i);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.rtx2ld2ELZv4 instanceof EpkonXwzFgDB;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.rtx2ld2ELZv4 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.rtx2ld2ELZv4 instanceof EpkonXwzFgDB) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            PxuCJdSBwIXG(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                PxuCJdSBwIXG(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        Pf0ThKz3j5YS pf0ThKz3j5YS = Pf0ThKz3j5YS.TSizfFm2Yiuu;
        if (!Thread.interrupted()) {
            Object obj2 = this.rtx2ld2ELZv4;
            if (obj2 != null) {
                return TSizfFm2Yiuu(obj2);
            }
            Pf0ThKz3j5YS pf0ThKz3j5YS2 = this.wdg6QnbFHrFF;
            if (pf0ThKz3j5YS2 != pf0ThKz3j5YS) {
                Pf0ThKz3j5YS pf0ThKz3j5YS3 = new Pf0ThKz3j5YS();
                do {
                    f2 f2Var = cpQdD2nAriOS;
                    f2Var.ryVscX7ZL4Ux(pf0ThKz3j5YS3, pf0ThKz3j5YS2);
                    if (f2Var.dgRBjINgWbAK(this, pf0ThKz3j5YS2, pf0ThKz3j5YS3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.rtx2ld2ELZv4;
                            } else {
                                e9gEMXR7LXtO(pf0ThKz3j5YS3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return TSizfFm2Yiuu(obj);
                    }
                    pf0ThKz3j5YS2 = this.wdg6QnbFHrFF;
                } while (pf0ThKz3j5YS2 != pf0ThKz3j5YS);
            }
            return TSizfFm2Yiuu(this.rtx2ld2ELZv4);
        }
        throw new InterruptedException();
    }
}
