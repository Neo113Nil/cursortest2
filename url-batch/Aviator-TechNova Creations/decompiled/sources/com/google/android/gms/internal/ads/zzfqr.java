package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfqr {
    private final int zzc;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzfrf zzg;
    private final Clock zzh;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    final Map zza = new LinkedHashMap();
    final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzfqr(int i, ScheduledExecutorService scheduledExecutorService, zzfrf zzfrfVar, Clock clock) {
        this.zzc = i;
        this.zzf = scheduledExecutorService;
        this.zzg = zzfrfVar;
        this.zzh = clock;
    }

    private static String zzl(String str, AdFormat adFormat) {
        return String.format("%s:%s", str, adFormat);
    }

    private final boolean zzm(zzfsa zzfsaVar) {
        AdFormat zzo = zzfsaVar.zzo();
        if (zzo == null) {
            return true;
        }
        Map map = this.zza;
        synchronized (map) {
            return !map.containsKey(zzl(zzfsaVar.zzn(), zzo));
        }
    }

    private final boolean zzn() {
        Map map = this.zza;
        synchronized (map) {
            for (zzfsa zzfsaVar : map.values()) {
                if (zzfsaVar.zzp() == 0 && zzfsaVar.zzq()) {
                    return true;
                }
            }
            return false;
        }
    }

    private final synchronized void zzo(long j) {
        if (this.zzb.compareAndSet(false, true)) {
            if (j > 0) {
                this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfqr.this.zzi();
                    }
                }, j, TimeUnit.MILLISECONDS);
            } else {
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfqr.this.zzh();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzk() {
        zzguf zzq;
        if (this.zzd.get()) {
            return;
        }
        zzfsa zzfsaVar = null;
        this.zze = null;
        if (zzf() < this.zzc || zzn()) {
            Map map = this.zza;
            synchronized (map) {
                zzq = zzguf.zzq(map.values());
            }
            int size = zzq.size();
            double d = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                zzfsa zzfsaVar2 = (zzfsa) zzq.get(i);
                if (zzfsaVar2.zzq()) {
                    double zzp = zzfsaVar2.zzp() / zzfsaVar2.zze.zzd;
                    if (zzp < d) {
                        d = zzp;
                    }
                    if (zzp < d) {
                        zzfsaVar = zzfsaVar2;
                    }
                }
            }
            if (zzfsaVar != null) {
                zzfsaVar.zze();
                if (zzfsaVar.zzp() > 0) {
                    this.zzg.zzq(this.zzh.currentTimeMillis(), zzfsaVar.zzn(), zzfsaVar.zze.zza, zzfsaVar.zzo(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzf(), this.zzc);
                }
            }
            int zzf = zzf();
            int i2 = this.zzc;
            if (zzf >= i2) {
                zzr();
            }
            if (zzf() >= i2) {
                if (zzn()) {
                }
            }
            if (zzn()) {
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfqr.this.zzk();
                    }
                });
                return;
            }
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfqr.this.zzj();
                }
            }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzV)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        zzr();
        this.zzb.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg() {
        this.zzd.set(false);
        zzk();
    }

    private final void zzr() {
        int size;
        Map map = this.zza;
        synchronized (map) {
            size = map.size();
        }
        zzfrf zzfrfVar = this.zzg;
        Clock clock = this.zzh;
        zzfrfVar.zzs(clock.currentTimeMillis(), this.zzc, size);
    }

    private final void zzs(zzfsa zzfsaVar, int i) {
        this.zzg.zzr(this.zzh.currentTimeMillis(), zzfsaVar.zzn(), zzfsaVar.zze.zza, zzfsaVar.zzo(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), i, zzf(), this.zzc);
    }

    private final synchronized boolean zzt(zzfsa zzfsaVar) {
        if (!this.zzd.get() && zzfsaVar.zzp() == 0 && zzfsaVar.zzq()) {
            zzfsaVar.zze();
            return true;
        }
        return false;
    }

    private static final int zzu(zzfsa zzfsaVar) {
        int zzp = zzfsaVar.zzp();
        int i = zzp - 1;
        if (!zzfsaVar.zzt()) {
            zzp = i;
        }
        return Math.max(zzp, 0);
    }

    public final void zza(zzfsa zzfsaVar) {
        int i = 1;
        if (zzfsaVar.zzp() <= 0 && !zzfsaVar.zzt()) {
            i = 0;
        }
        zzc(zzfsaVar, i);
    }

    public final synchronized void zzb(zzfsa zzfsaVar) {
        if (zzm(zzfsaVar)) {
            return;
        }
        long zzy = zzfsaVar.zzy();
        if (zzy <= 0) {
            zza(zzfsaVar);
            return;
        }
        if (zzfsaVar.zzp() > 0 || zzfsaVar.zzt()) {
            zzs(zzfsaVar, 1);
        }
        this.zzd.set(true);
        ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zze = null;
        this.zzb.set(true);
        this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfqr.this.zzg();
            }
        }, zzy, TimeUnit.MILLISECONDS);
    }

    public final void zzc(zzfsa zzfsaVar, int i) {
        if (zzm(zzfsaVar)) {
            return;
        }
        if (i > 0) {
            zzs(zzfsaVar, i);
        }
        if (!zzt(zzfsaVar)) {
            zzo(0L);
        } else {
            zzo(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzU)).longValue());
        }
    }

    public final void zzd(String str, AdFormat adFormat, zzfsa zzfsaVar) {
        Map map = this.zza;
        String zzl = zzl(str, adFormat);
        synchronized (map) {
            if (!map.containsKey(zzl)) {
                map.put(zzl, zzfsaVar);
                zzt(zzfsaVar);
                zzo(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzU)).longValue());
            }
        }
    }

    public final void zze(String str, AdFormat adFormat) {
        zzfsa zzfsaVar;
        Map map = this.zza;
        String zzl = zzl(str, adFormat);
        synchronized (map) {
            zzfsaVar = (zzfsa) map.remove(zzl);
        }
        if (zzfsaVar == null) {
            return;
        }
        int zzu = zzu(zzfsaVar);
        if (zzu > 0) {
            zzs(zzfsaVar, zzu);
        }
        if (zzfsaVar.zzp() > 0 || zzfsaVar.zzt()) {
            zzo(0L);
        }
    }

    final int zzf() {
        int i;
        Map map = this.zza;
        synchronized (map) {
            Iterator it = map.values().iterator();
            i = 0;
            while (it.hasNext()) {
                i += zzu((zzfsa) it.next());
            }
        }
        return i;
    }
}
