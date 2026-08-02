package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeij extends zzeic {
    private final zzcgj zza;
    private final zzcvy zzb;
    private final zzdck zzc;
    private final zzein zzd;

    @Nullable
    private final zzfey zze;
    private final zzeey zzf;

    public zzeij(zzcgj zzcgjVar, zzcvy zzcvyVar, zzdck zzdckVar, @Nullable zzfey zzfeyVar, zzein zzeinVar, zzeey zzeeyVar) {
        this.zza = zzcgjVar;
        this.zzb = zzcvyVar;
        this.zzc = zzdckVar;
        this.zze = zzfeyVar;
        this.zzd = zzeinVar;
        this.zzf = zzeeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeic
    protected final ListenableFuture zzc(zzffg zzffgVar, Bundle bundle, zzfel zzfelVar, zzfex zzfexVar) {
        zzfey zzfeyVar;
        zzcvy zzcvyVar = this.zzb;
        zzcvyVar.zzi(zzffgVar);
        zzcvyVar.zzf(bundle);
        zzcvyVar.zzg(new zzcvs(zzfexVar, zzfelVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdh)).booleanValue() && (zzfeyVar = this.zze) != null) {
            this.zzb.zzh(zzfeyVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdi)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcgj zzcgjVar = this.zza;
        zzcvy zzcvyVar2 = this.zzb;
        zzdot zzi = zzcgjVar.zzi();
        zzi.zzd(zzcvyVar2.zzj());
        zzi.zzc(this.zzc);
        zzctc zzb = zzi.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
