package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfgz {
    private final zzfgd zza;
    private final zzfgx zzb;
    private final zzffz zzc;
    private zzfhf zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfgz(zzfgd zzfgdVar, zzffz zzffzVar, zzfgx zzfgxVar) {
        this.zza = zzfgdVar;
        this.zzc = zzffzVar;
        this.zzb = zzfgxVar;
        zzffzVar.zzb(new zzfgu(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgo)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfgy zzfgyVar = (zzfgy) this.zzd.pollFirst();
                if (zzfgyVar == null || (zzfgyVar.zza() != null && this.zza.zze(zzfgyVar.zza()))) {
                    zzfhf zzfhfVar = new zzfhf(this.zza, this.zzb, zzfgyVar);
                    this.zze = zzfhfVar;
                    zzfhfVar.zzd(new zzfgv(this, zzfgyVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized ListenableFuture zza(zzfgy zzfgyVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfgyVar);
    }

    public final synchronized void zze(zzfgy zzfgyVar) {
        this.zzd.add(zzfgyVar);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
