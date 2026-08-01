package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdaq extends zzddv implements zzczb, zzdag {
    private final zzfdu zzb;
    private final AtomicBoolean zzc;

    public zzdaq(Set set, zzfdu zzfduVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfduVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhG)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzaf) != null && zzsVar.zza == 3) {
            zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdap
                @Override // com.google.android.gms.internal.ads.zzddu
                public final void zza(Object obj) {
                    zzdaq.this.zza((zzdas) obj);
                }
            });
        }
    }

    final /* synthetic */ void zza(zzdas zzdasVar) throws Exception {
        zzdasVar.zzh(this.zzb.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzq() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
