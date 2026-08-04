package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzflb {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfdy zzd;
    protected com.google.android.gms.ads.internal.client.zzft zze;
    protected AtomicBoolean zzf;
    protected com.google.android.gms.ads.internal.client.zzch zzg;
    private com.google.android.gms.ads.internal.client.zzce zzh;
    private final Queue zzi;
    private final zzfkf zzj;
    private final String zzk;
    private AtomicBoolean zzl;
    private final ScheduledExecutorService zzm;
    private AtomicBoolean zzn;
    private AtomicBoolean zzo;
    private zzfkk zzp;
    private final Clock zzq;
    private final zzfkr zzr;

    public zzflb(ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        this(ViewProps.NONE, clientApi, context, i, zzfdyVar, zzftVar, scheduledExecutorService, zzfkfVar, clock);
        this.zzh = zzceVar;
    }

    static final /* synthetic */ double zzD(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzcvl) {
            return ((zzcvl) zzeaVar).zzl();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzF, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzt(Object obj) {
        this.zzl.set(false);
        if (obj != null) {
            this.zzj.zza();
            this.zzo.set(true);
            zzI(obj);
        }
        zzJ(obj == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzG, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzu(Throwable th) {
        this.zzl.set(false);
        if ((th instanceof zzfjx) && ((zzfjx) th).zza() == 0) {
            throw null;
        }
        zzJ(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzv(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzn.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfky(this, zzeVar));
        }
        this.zzl.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            zzJ(true);
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
        this.zzf.set(false);
        zzfkq zzfkqVar = new zzfkq(this.zze.zza, zzm());
        zzfkqVar.zza(this.zzk);
        this.zzp.zzk(this.zzq.currentTimeMillis(), new zzfkr(zzfkqVar, null), zzeVar, this.zze.zzd, zzn(), zzz());
    }

    private final synchronized void zzI(Object obj) {
        Clock clock = this.zzq;
        zzfks zzfksVar = new zzfks(obj, clock);
        this.zzi.add(zzfksVar);
        com.google.android.gms.ads.internal.client.zzea zzb = zzb(obj);
        long currentTimeMillis = clock.currentTimeMillis();
        if (this.zzn.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfkw(this, zzb));
        }
        ScheduledExecutorService scheduledExecutorService = this.zzm;
        scheduledExecutorService.execute(new zzfkx(this, currentTimeMillis, zzb));
        scheduledExecutorService.schedule(new zzfkv(this), zzfksVar.zzc(), TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzJ(boolean z) {
        zzfkf zzfkfVar = this.zzj;
        if (zzfkfVar.zzd()) {
            return;
        }
        if (z) {
            zzfkfVar.zzc();
        }
        this.zzm.schedule(new zzfkv(this), zzfkfVar.zzb(), TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzK() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            if (((zzfks) it.next()).zzb()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzL, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzg;
        if (zzchVar != null) {
            try {
                zzchVar.zzg(this.zzk, zzeVar);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zze);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzg;
        if (zzchVar != null) {
            try {
                zzchVar.zze(this.zzk, zzeaVar);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    private final synchronized void zzN() {
        if (this.zzo.get() && this.zzi.isEmpty()) {
            this.zzo.set(false);
            if (this.zzn.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfkz(this));
            }
            this.zzm.execute(new zzfla(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzy() {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zze);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzg;
        if (zzchVar != null) {
            try {
                zzchVar.zzf(this.zzk);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzP, reason: merged with bridge method [inline-methods] */
    public final String zzz() {
        return true != ViewProps.NONE.equals(this.zzk) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzQ(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzcvl) {
            return ((zzcvl) zzeaVar).zzk();
        }
        return null;
    }

    final /* synthetic */ zzfkk zzA() {
        return this.zzp;
    }

    final /* synthetic */ Clock zzB() {
        return this.zzq;
    }

    final /* synthetic */ zzfkr zzC() {
        return this.zzr;
    }

    protected abstract ListenableFuture zza(Context context);

    protected abstract com.google.android.gms.ads.internal.client.zzea zzb(Object obj);

    public final synchronized zzflb zzc() {
        this.zzm.submit(new zzfkv(this));
        return this;
    }

    public final synchronized boolean zzd() {
        zzK();
        return !this.zzi.isEmpty();
    }

    public final synchronized Object zze() {
        this.zzj.zza();
        Queue queue = this.zzi;
        zzfks zzfksVar = (zzfks) queue.poll();
        this.zzo.set(zzfksVar != null);
        if (zzfksVar == null) {
            zzfksVar = null;
        } else if (!queue.isEmpty()) {
            zzfks zzfksVar2 = (zzfks) queue.peek();
            AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
            String zzQ = zzQ(zzb(zzfksVar.zza()));
            if (zzfksVar2 != null && adFormat != null && zzQ != null && zzfksVar2.zzd() < zzfksVar.zzd()) {
                this.zzp.zzg(this.zzq.currentTimeMillis(), this.zze.zzd, zzn(), zzQ, this.zzr, zzz());
            }
        }
        zzq();
        if (zzfksVar == null) {
            return null;
        }
        return zzfksVar.zza();
    }

    public final void zzf() {
        this.zzf.set(false);
        this.zzn.set(false);
    }

    public final void zzg() {
        this.zzf.set(false);
    }

    public final synchronized void zzh() {
        this.zzf.set(true);
        this.zzn.set(true);
        this.zzm.submit(new zzfkv(this));
    }

    public final synchronized String zzi() {
        Object zzp;
        zzp = zzp();
        return zzQ(zzp == null ? null : zzb(zzp));
    }

    public final void zzj(zzfkk zzfkkVar) {
        this.zzp = zzfkkVar;
    }

    public final synchronized void zzk(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzj.zze(i);
    }

    protected final String zzl() {
        return this.zzk;
    }

    protected final AdFormat zzm() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    protected final synchronized int zzn() {
        return this.zzi.size();
    }

    protected final void zzo() {
        this.zzi.clear();
    }

    protected final synchronized Object zzp() {
        zzfks zzfksVar = (zzfks) this.zzi.peek();
        if (zzfksVar == null) {
            return null;
        }
        return zzfksVar.zza();
    }

    protected final synchronized void zzq() {
        ListenableFuture zza;
        zzK();
        zzN();
        if (!this.zzl.get() && this.zzf.get() && this.zzi.size() < this.zze.zzd) {
            this.zzl.set(true);
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
            zzgot.zzq(zza, new zzfkt(this), this.zzm);
        }
    }

    protected final void zzr(int i) {
        Preconditions.checkArgument(i > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i2 = this.zze.zzd;
        synchronized (this) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
            this.zze = new com.google.android.gms.ads.internal.client.zzft(zzftVar.zza, zzftVar.zzb, zzftVar.zzc, i > 0 ? i : zzftVar.zzd);
            Queue queue = this.zzi;
            if (queue.size() > i) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzv)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < i; i3++) {
                        zzfks zzfksVar = (zzfks) queue.poll();
                        if (zzfksVar != null) {
                            arrayList.add(zzfksVar);
                        }
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                }
            }
        }
        zzfkk zzfkkVar = this.zzp;
        if (zzfkkVar == null || adFormat == null) {
            return;
        }
        zzfkkVar.zzc(i2, i, this.zzq.currentTimeMillis(), new zzfkr(new zzfkq(this.zze.zza, adFormat), null));
    }

    protected final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzA)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzn());
            bundle.putInt("plbs", this.zze.zzd);
            bundle.putString("plid", this.zzk);
        }
    }

    public zzflb(String str, ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        this(str, clientApi, context, i, zzfdyVar, zzftVar, scheduledExecutorService, zzfkfVar, clock);
        this.zzg = zzchVar;
    }

    private zzflb(String str, ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        this.zzk = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzfdyVar;
        this.zze = zzftVar;
        this.zzi = new PriorityQueue(Math.max(1, zzftVar.zzd), new zzfku(this));
        this.zzf = new AtomicBoolean(true);
        this.zzl = new AtomicBoolean(false);
        this.zzm = scheduledExecutorService;
        this.zzj = zzfkfVar;
        this.zzn = new AtomicBoolean(true);
        this.zzo = new AtomicBoolean(false);
        this.zzq = clock;
        zzfkq zzfkqVar = new zzfkq(zzftVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfkqVar.zza(str);
        this.zzr = new zzfkr(zzfkqVar, null);
    }
}
