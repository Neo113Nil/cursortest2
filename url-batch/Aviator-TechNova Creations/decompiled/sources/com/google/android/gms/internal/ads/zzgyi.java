package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.internal.ads.zzgyh;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
abstract class zzgyi<V> extends zzhaq implements ListenableFuture<V> {
    private static final zza zzbp;
    static final Object zze = new Object();
    static final zzgzw zzf = new zzgzw(zzgyh.class);
    static final boolean zzg;
    volatile zzgyh.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    abstract class zza {
        /* synthetic */ zza(byte[] bArr) {
        }

        abstract void zza(zze zzeVar, Thread thread);

        abstract void zzb(zze zzeVar, zze zzeVar2);

        abstract boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2);

        abstract boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2);

        abstract zze zze(zzgyi zzgyiVar, zze zzeVar);

        abstract zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar);

        abstract boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, zzgyh.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, zzgyh.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgyi<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgyi.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zzc, zzgyiVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zzd, zzgyiVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            return zzc.getAndSet(zzgyiVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            return zzd.getAndSet(zzgyiVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zze, zzgyiVar, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgyiVar) {
                if (zzgyiVar.waitersField != zzeVar) {
                    return false;
                }
                zzgyiVar.waitersField = zzeVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            synchronized (zzgyiVar) {
                if (zzgyiVar.listenersField != zzdVar) {
                    return false;
                }
                zzgyiVar.listenersField = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgyiVar) {
                zzeVar2 = zzgyiVar.waitersField;
                if (zzeVar2 != zzeVar) {
                    zzgyiVar.waitersField = zzeVar;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            zzgyh.zzd zzdVar2;
            synchronized (zzgyiVar) {
                zzdVar2 = zzgyiVar.listenersField;
                if (zzdVar2 != zzdVar) {
                    zzgyiVar.listenersField = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            synchronized (zzgyiVar) {
                if (zzgyiVar.valueField != obj) {
                    return false;
                }
                zzgyiVar.valueField = obj2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(zzgyj.zza);
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzgyi.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzc(zzgyi zzgyiVar, zze zzeVar, zze zzeVar2) {
            return zzer$$ExternalSyntheticBackport0.m(zza, zzgyiVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzd(zzgyi zzgyiVar, zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
            return zzer$$ExternalSyntheticBackport0.m(zza, zzgyiVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zze zze(zzgyi zzgyiVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgyiVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzgyiVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final zzgyh.zzd zzf(zzgyi zzgyiVar, zzgyh.zzd zzdVar) {
            zzgyh.zzd zzdVar2;
            do {
                zzdVar2 = zzgyiVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzgyiVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgyi.zza
        final boolean zzg(zzgyi zzgyiVar, Object obj, Object obj2) {
            return zzer$$ExternalSyntheticBackport0.m(zza, zzgyiVar, zzd, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze() {
            zzgyi.zzv(this, Thread.currentThread());
        }

        zze(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzg = z;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb(bArr);
                    th = null;
                    th2 = e;
                } catch (Error | Exception e2) {
                    th = e2;
                    th2 = e;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th = null;
        th2 = null;
        zzbp = zzcVar;
        if (th != null) {
            zzgzw zzgzwVar = zzf;
            zzgzwVar.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgzwVar.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    zzgyi() {
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbp.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static boolean zzr(zzgyi zzgyiVar, Object obj, Object obj2) {
        return zzbp.zzg(zzgyiVar, obj, obj2);
    }

    static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbp.zza(zzeVar, thread);
    }

    final boolean zzp(zzgyh.zzd zzdVar, zzgyh.zzd zzdVar2) {
        return zzbp.zzd(this, zzdVar, zzdVar2);
    }

    final zzgyh.zzd zzq(zzgyh.zzd zzdVar) {
        return zzbp.zzf(this, zzdVar);
    }

    final void zzs() {
        for (zze zze2 = zzbp.zze(this, zze.zza); zze2 != null; zze2 = zze2.next) {
            Thread thread = zze2.thread;
            if (thread != null) {
                zze2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object zzt(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzgyh.zzh(obj)) {
            return zzgyh.zzg(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbp;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzgyh.zzh(obj2)) {
                                return zzgyh.zzg(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            return zzgyh.zzg(Objects.requireNonNull(this.valueField));
        }
        while (nanos > 0) {
            Object obj3 = this.valueField;
            if ((obj3 != null) && zzgyh.zzh(obj3)) {
                return zzgyh.zzg(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj4 = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                StringBuilder sb3 = new StringBuilder(concat.length() + String.valueOf(convert).length() + 1 + String.valueOf(lowerCase).length());
                sb3.append(concat);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = sb4.concat(",");
                }
                concat = sb4.concat(" ");
            }
            if (z) {
                StringBuilder sb5 = new StringBuilder(concat.length() + String.valueOf(nanos2).length() + 13);
                sb5.append(concat);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(sb2.length() + 5 + String.valueOf(obj4).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(obj4);
        throw new TimeoutException(sb6.toString());
    }

    final Object zzu() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzgyh.zzh(obj2)) {
            return zzgyh.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbp;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzgyh.zzh(obj)));
                    return zzgyh.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        return zzgyh.zzg(Objects.requireNonNull(this.valueField));
    }
}
