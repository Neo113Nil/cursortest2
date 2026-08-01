package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import io.ktor.http.LinkHeader;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfzp<V> extends zzgcd implements ListenableFuture<V> {
    private static final Logger zzaZ;
    private static final zza zzba;
    private static final Object zzbd;
    static final boolean zzd;

    @CheckForNull
    private volatile zzd listeners;

    @CheckForNull
    private volatile Object value;

    @CheckForNull
    private volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    abstract class zza {
        /* synthetic */ zza(zzfzo zzfzoVar) {
        }

        abstract zzd zza(zzfzp zzfzpVar, zzd zzdVar);

        abstract zzk zzb(zzfzp zzfzpVar, zzk zzkVar);

        abstract void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2);

        abstract void zzd(zzk zzkVar, Thread thread);

        abstract boolean zze(zzfzp zzfzpVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        abstract boolean zzf(zzfzp zzfzpVar, @CheckForNull Object obj, Object obj2);

        abstract boolean zzg(zzfzp zzfzpVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    final class zzb {

        @CheckForNull
        static final zzb zza;

        @CheckForNull
        static final zzb zzb;
        final boolean zzc;

        @CheckForNull
        final Throwable zzd;

        static {
            if (zzfzp.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfzp.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    final class zzd {
        static final zzd zza = new zzd();

        @CheckForNull
        zzd next;

        @CheckForNull
        final Runnable zzb;

        @CheckForNull
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzfzp, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzfzp, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzfzp, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final zzd zza(zzfzp zzfzpVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzfzpVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final zzk zzb(zzfzp zzfzpVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzfzpVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zze(zzfzp zzfzpVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfzq.zza(this.zzd, zzfzpVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zzf(zzfzp zzfzpVar, @CheckForNull Object obj, Object obj2) {
            return zzfzq.zza(this.zze, zzfzpVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zzg(zzfzp zzfzpVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfzq.zza(this.zzc, zzfzpVar, zzkVar, zzkVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    final class zzf<V> implements Runnable {
        final zzfzp<V> zza;
        final ListenableFuture<? extends V> zzb;

        zzf(zzfzp zzfzpVar, ListenableFuture listenableFuture) {
            this.zza = zzfzpVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfzp) this.zza).value != this) {
                return;
            }
            ListenableFuture<? extends V> listenableFuture = this.zzb;
            if (zzfzp.zzba.zzf(this.zza, this, zzfzp.zze(listenableFuture))) {
                zzfzp.zzx(this.zza, false);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        /* synthetic */ zzg(zzfzr zzfzrVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final zzd zza(zzfzp zzfzpVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzfzpVar) {
                zzdVar2 = zzfzpVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzfzpVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final zzk zzb(zzfzp zzfzpVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfzpVar) {
                zzkVar2 = zzfzpVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzfzpVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zze(zzfzp zzfzpVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfzpVar) {
                if (zzfzpVar.listeners != zzdVar) {
                    return false;
                }
                zzfzpVar.listeners = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zzf(zzfzp zzfzpVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzfzpVar) {
                if (zzfzpVar.value != obj) {
                    return false;
                }
                zzfzpVar.value = obj2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zzg(zzfzp zzfzpVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            synchronized (zzfzpVar) {
                if (zzfzpVar.waiters != zzkVar) {
                    return false;
                }
                zzfzpVar.waiters = zzkVar2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    interface zzh<V> extends ListenableFuture<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    abstract class zzi<V> extends zzfzp<V> implements zzh<V> {
        zzi() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfzp.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzfzp.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzfzp.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzfzp.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField(LinkHeader.Rel.Next));
                zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        }

        private zzj() {
            super(null);
        }

        /* synthetic */ zzj(zzfzt zzfztVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final zzd zza(zzfzp zzfzpVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzfzpVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzfzpVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final zzk zzb(zzfzp zzfzpVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfzpVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzfzpVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zze(zzfzp zzfzpVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfzs.zza(zza, zzfzpVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zzf(zzfzp zzfzpVar, @CheckForNull Object obj, Object obj2) {
            return zzfzs.zza(zza, zzfzpVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzp.zza
        final boolean zzg(zzfzp zzfzpVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfzs.zza(zza, zzfzpVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
    final class zzk {
        static final zzk zza = new zzk(false);

        @CheckForNull
        volatile zzk next;

        @CheckForNull
        volatile Thread thread;

        zzk() {
            zzfzp.zzba.zzd(this, Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaZ = Logger.getLogger(zzfzp.class.getName());
        Object[] objArr = 0;
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, LinkHeader.Rel.Next), AtomicReferenceFieldUpdater.newUpdater(zzfzp.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfzp.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfzp.class, Object.class, "value"));
                th = null;
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(objArr == true ? 1 : 0);
            }
        }
        zzba = zzgVar;
        if (th != null) {
            Logger logger = zzaZ;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbd = new Object();
    }

    protected zzfzp() {
    }

    private static final Object zzA(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzbd) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(ListenableFuture listenableFuture) {
        Throwable zzl;
        if (listenableFuture instanceof zzh) {
            Object obj = ((zzfzp) listenableFuture).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((listenableFuture instanceof zzgcd) && (zzl = ((zzgcd) listenableFuture).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!zzd) && isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            zzbVar2.getClass();
            return zzbVar2;
        }
        try {
            Object zzf2 = zzf(listenableFuture);
            if (!isCancelled) {
                return zzf2 == null ? zzbd : zzf2;
            }
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(listenableFuture)));
        } catch (Error e) {
            e = e;
            return new zzc(e);
        } catch (CancellationException e2) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(listenableFuture))), e2)) : new zzb(false, e2);
        } catch (RuntimeException e3) {
            e = e3;
            return new zzc(e);
        } catch (ExecutionException e4) {
            return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(listenableFuture))), e4)) : new zzc(e4.getCause());
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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

    private final void zzu(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
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

    private final void zzv(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzw(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzfun.zza(zza());
            } catch (RuntimeException | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e.getClass())));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzu(sb);
        }
    }

    private final void zzw(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzfzp zzfzpVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzba.zzb(zzfzpVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzfzpVar.zzq();
            }
            zzfzpVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzba.zza(zzfzpVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzfzpVar = zzfVar.zza;
                    if (zzfzpVar.value == zzfVar) {
                        if (zzba.zzf(zzfzpVar, zzfVar, zze(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzy(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            zzaZ.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    private final void zzz(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzba.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfty.zzc(runnable, "Runnable was null.");
        zzfty.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzba.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj instanceof zzf) && !(obj == null)) {
            return false;
        }
        if (zzd) {
            zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z ? zzb.zza : zzb.zzb;
            zzbVar.getClass();
        }
        zzfzp<V> zzfzpVar = this;
        boolean z2 = false;
        while (true) {
            if (zzba.zzf(zzfzpVar, obj, zzbVar)) {
                zzx(zzfzpVar, z);
                if (!(obj instanceof zzf)) {
                    break;
                }
                ListenableFuture<? extends V> listenableFuture = ((zzf) obj).zzb;
                if (!(listenableFuture instanceof zzh)) {
                    listenableFuture.cancel(z);
                    break;
                }
                zzfzpVar = (zzfzp) listenableFuture;
                obj = zzfzpVar.value;
                if (!(obj == null) && !(obj instanceof zzf)) {
                    break;
                }
                z2 = true;
            } else {
                obj = zzfzpVar.value;
                if (!(obj instanceof zzf)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzA(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzba;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzz(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzA(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return zzA(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb);
        } else {
            zzv(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    protected String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected void zzb() {
    }

    protected boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (!zzba.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    protected boolean zzd(Throwable th) {
        th.getClass();
        if (!zzba.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    @CheckForNull
    protected final Throwable zzl() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    protected void zzq() {
    }

    final void zzr(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzt());
        }
    }

    protected final boolean zzt() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    protected final boolean zzs(ListenableFuture listenableFuture) {
        zzc zzcVar;
        listenableFuture.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!zzba.zzf(this, null, zze(listenableFuture))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, listenableFuture);
            if (zzba.zzf(this, null, zzfVar)) {
                try {
                    listenableFuture.addListener(zzfVar, zzgap.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        zzcVar = new zzc(e);
                    } catch (Error | RuntimeException unused) {
                        zzcVar = zzc.zza;
                    }
                    zzba.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            listenableFuture.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzA(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zzba;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    zzz(zzkVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof zzf)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return zzA(obj2);
                                }
                            } while (nanos >= 1000);
                            zzz(zzkVar2);
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzA(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if (!((obj4 != null) & (!(obj4 instanceof zzf)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return zzA(obj4);
                }
            }
            String zzfzpVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
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
            throw new TimeoutException(str + " for " + zzfzpVar);
        }
        throw new InterruptedException();
    }
}
