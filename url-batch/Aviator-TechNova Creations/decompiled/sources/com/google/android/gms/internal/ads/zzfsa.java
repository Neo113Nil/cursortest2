package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzfsa {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfkg zzd;
    protected com.google.android.gms.ads.internal.client.zzft zze;
    protected final zzfqr zzf;
    protected AtomicBoolean zzg;
    protected com.google.android.gms.ads.internal.client.zzch zzh;
    private com.google.android.gms.ads.internal.client.zzce zzi;
    private final Queue zzj;
    private final zzfra zzk;
    private final String zzl;
    private AtomicBoolean zzm;
    private final ScheduledExecutorService zzn;
    private final zzfmy zzo;
    private AtomicBoolean zzp;
    private AtomicBoolean zzq;
    private zzfrf zzr;
    private final Clock zzs;
    private final zzfrm zzt;

    public zzfsa(ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        this(IntegrityManager.INTEGRITY_TYPE_NONE, clientApi, context, i, zzfkgVar, zzftVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, null);
        this.zzi = zzceVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzB(Object obj) {
        this.zzm.set(false);
        if (obj != null) {
            this.zzk.zza();
            this.zzq.set(true);
            zzP(obj);
        }
        if (obj == null || this.zzf == null) {
            zzQ(obj == null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzN, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzC(Throwable th) {
        this.zzm.set(false);
        if ((th instanceof zzfqs) && ((zzfqs) th).zza() == 0) {
            throw null;
        }
        zzQ(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfrt(this, zzeVar));
        }
        this.zzm.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            zzQ(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
        int i2 = zzftVar.zzb;
        String str = zzftVar.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26 + String.valueOf(str).length() + 61);
        sb.append("Preloading ");
        sb.append(i2);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String sb2 = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        this.zzg.set(false);
        zzfqr zzfqrVar = this.zzf;
        if (zzfqrVar != null) {
            zzfqrVar.zza(this);
        }
        zzfrl zzfrlVar = new zzfrl(this.zze.zza, zzo());
        zzfrlVar.zza(this.zzl);
        this.zzr.zzk(this.zzs.currentTimeMillis(), new zzfrm(zzfrlVar, null), zzeVar, this.zze.zzd, zzp(), zzH());
    }

    private final synchronized void zzP(Object obj) {
        com.google.android.gms.ads.internal.client.zzea zzc = zzc(obj);
        double zzl = !(zzc instanceof zzday) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((zzday) zzc).zzl();
        com.google.android.gms.ads.internal.client.zzea zzc2 = zzc(obj);
        int zzm = zzc2 instanceof zzday ? ((zzday) zzc2).zzm() : 2;
        Clock clock = this.zzs;
        zzfro zzfroVar = new zzfro(obj, clock, zzl, zzm);
        this.zzj.add(zzfroVar);
        com.google.android.gms.ads.internal.client.zzea zzc3 = zzc(obj);
        long currentTimeMillis = clock.currentTimeMillis();
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfrr(this, zzc3));
        }
        ScheduledExecutorService scheduledExecutorService = this.zzn;
        scheduledExecutorService.execute(new zzfrs(this, currentTimeMillis, zzc3));
        if (this.zzf != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzE)).booleanValue()) {
                this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfry
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfsa.this.zzA();
                    }
                }, zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                return;
            } else {
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfsa.this.zzz();
                    }
                }, zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzE)).booleanValue()) {
            this.zzo.zzb(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.schedule(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void zzQ(boolean z) {
        zzfqr zzfqrVar = this.zzf;
        if (zzfqrVar != null) {
            if (z) {
                this.zzk.zzc();
            }
            zzfqrVar.zza(this);
        } else {
            zzfra zzfraVar = this.zzk;
            if (zzfraVar.zze()) {
                return;
            }
            if (z) {
                zzfraVar.zzc();
            }
            this.zzn.schedule(new zzfrq(this), zzfraVar.zzb(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzR, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzz() {
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            if (((zzfro) it.next()).zzb()) {
                it.remove();
                zzfqr zzfqrVar = this.zzf;
                if (zzfqrVar != null) {
                    zzfqrVar.zza(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzE(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzg(this.zzl, zzeVar);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zze);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zze(this.zzl, zzeaVar);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    private final synchronized void zzU() {
        if (this.zzq.get() && this.zzj.isEmpty()) {
            this.zzq.set(false);
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfru(this));
            }
            this.zzn.execute(new zzfrv(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzG() {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zze);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzf(this.zzl);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public final String zzH() {
        return true != IntegrityManager.INTEGRITY_TYPE_NONE.equals(this.zzl) ? ExifInterface.GPS_MEASUREMENT_2D : AppEventsConstants.EVENT_PARAM_VALUE_YES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzX(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzday) {
            return ((zzday) zzeaVar).zzk();
        }
        return null;
    }

    final /* synthetic */ zzfrf zzI() {
        return this.zzr;
    }

    final /* synthetic */ Clock zzJ() {
        return this.zzs;
    }

    final /* synthetic */ zzfrm zzK() {
        return this.zzt;
    }

    protected abstract ListenableFuture zza(Context context);

    protected long zzb() {
        throw null;
    }

    protected abstract com.google.android.gms.ads.internal.client.zzea zzc(Object obj);

    public final synchronized zzfsa zzd() {
        this.zzn.submit(new zzfrq(this));
        return this;
    }

    public final synchronized void zze() {
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            this.zzn.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfsa.this.zzv();
                }
            });
        }
    }

    public final synchronized boolean zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzK)).booleanValue()) {
            this.zzk.zza();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzD)).booleanValue() && this.zzf == null) {
            zzu();
        } else {
            zzz();
        }
        return !this.zzj.isEmpty();
    }

    public final synchronized Object zzg() {
        boolean z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzN)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzL)).booleanValue()) {
                this.zzk.zza();
            } else if (this.zzj.size() == 1) {
                this.zzk.zza();
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzM)).booleanValue()) {
            zzz();
        }
        Queue queue = this.zzj;
        zzfro zzfroVar = (zzfro) queue.poll();
        AtomicBoolean atomicBoolean = this.zzq;
        if (zzfroVar == null) {
            z = false;
        }
        atomicBoolean.set(z);
        if (zzfroVar == null) {
            zzfroVar = null;
        } else if (!queue.isEmpty()) {
            zzfro zzfroVar2 = (zzfro) queue.peek();
            AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
            String zzX = zzX(zzc(zzfroVar.zza()));
            if (zzfroVar2 != null && adFormat != null && zzX != null && zzfroVar2.zzd() < zzfroVar.zzd()) {
                this.zzr.zzg(this.zzs.currentTimeMillis(), this.zze.zzd, zzp(), zzX, this.zzt, zzH());
            }
        }
        zzfqr zzfqrVar = this.zzf;
        if (zzfqrVar != null) {
            zzfqrVar.zzb(this);
        } else {
            long zzy = zzy();
            if (zzy > 0) {
                this.zzn.schedule(new zzfrq(this), zzy, TimeUnit.MILLISECONDS);
            } else {
                zzu();
            }
        }
        if (zzfroVar == null) {
            return null;
        }
        return zzfroVar.zza();
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final synchronized void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzn.submit(new zzfrq(this));
        }
    }

    public final synchronized String zzk() {
        Object zzs;
        zzs = zzs();
        return zzX(zzs == null ? null : zzc(zzs));
    }

    public final void zzl(zzfrf zzfrfVar) {
        this.zzr = zzfrfVar;
    }

    public final synchronized void zzm(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzk.zzf(i);
    }

    protected final String zzn() {
        return this.zzl;
    }

    protected final AdFormat zzo() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    protected final synchronized int zzp() {
        return this.zzj.size();
    }

    protected final boolean zzq() {
        return this.zzg.get() && !this.zzm.get() && zzp() < this.zze.zzd && !this.zzk.zzd();
    }

    protected final synchronized void zzr() {
        this.zzj.clear();
    }

    protected final synchronized Object zzs() {
        zzfro zzfroVar = (zzfro) this.zzj.peek();
        if (zzfroVar == null) {
            return null;
        }
        return zzfroVar.zza();
    }

    protected final boolean zzt() {
        return this.zzm.get();
    }

    protected final synchronized void zzu() {
        zzz();
        zzU();
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            zzv();
        }
    }

    protected final synchronized void zzv() {
        ListenableFuture zza;
        Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (zzd == null) {
            String str = this.zze.zza;
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(valueOf));
            zza = zza(this.zzb);
        } else {
            zza = zza(zzd);
        }
        zzgzo.zzr(zza, new zzfrp(this), this.zzn);
    }

    protected final void zzw(int i) {
        zzfqr zzfqrVar;
        Preconditions.checkArgument(i > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i2 = this.zze.zzd;
        int size = this.zzj.size();
        synchronized (this) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
            this.zze = new com.google.android.gms.ads.internal.client.zzft(zzftVar.zza, zzftVar.zzb, zzftVar.zzc, i > 0 ? i : zzftVar.zzd);
            Queue queue = this.zzj;
            if (queue.size() > i) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzx)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < i; i3++) {
                        zzfro zzfroVar = (zzfro) queue.poll();
                        if (zzfroVar != null) {
                            arrayList.add(zzfroVar);
                        }
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                    if (size > arrayList.size() && (zzfqrVar = this.zzf) != null) {
                        int size2 = size - arrayList.size();
                        if (arrayList.isEmpty()) {
                            size2--;
                        }
                        zzfqrVar.zzc(this, size2);
                    }
                }
            }
        }
        zzfrf zzfrfVar = this.zzr;
        if (zzfrfVar == null || adFormat == null) {
            return;
        }
        zzfrfVar.zzc(i2, i, this.zzs.currentTimeMillis(), new zzfrm(new zzfrl(this.zze.zza, adFormat), null));
    }

    protected final void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzC)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzp());
            bundle.putInt("plbs", this.zze.zzd);
            bundle.putString("plid", this.zzl);
        }
    }

    final long zzy() {
        long zzb = zzb();
        if (zzb >= 0) {
            return zzb;
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzP)).longValue();
    }

    public zzfsa(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, zzfqr zzfqrVar) {
        this(str, clientApi, context, i, zzfkgVar, zzftVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
        this.zzh = zzchVar;
    }

    private zzfsa(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, zzfqr zzfqrVar) {
        Queue priorityQueue;
        this.zzl = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzfkgVar;
        this.zze = zzftVar;
        int max = Math.max(1, zzftVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzX)).booleanValue()) {
            priorityQueue = new zzfsd();
        } else {
            priorityQueue = new PriorityQueue(max, zzfrw.zza);
        }
        this.zzj = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzm = new AtomicBoolean(false);
        this.zzn = scheduledExecutorService;
        this.zzo = zzfmyVar;
        this.zzk = zzfraVar;
        this.zzp = new AtomicBoolean(true);
        this.zzq = new AtomicBoolean(false);
        this.zzs = clock;
        zzfrl zzfrlVar = new zzfrl(zzftVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfrlVar.zza(str);
        this.zzt = new zzfrm(zzfrlVar, null);
        this.zzf = zzfqrVar;
    }
}
