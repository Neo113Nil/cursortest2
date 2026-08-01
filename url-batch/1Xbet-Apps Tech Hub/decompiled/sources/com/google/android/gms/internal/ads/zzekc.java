package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzekc implements zzegb {
    private final Context zza;
    private final Executor zzb;
    private final zzdqd zzc;

    public zzekc(Context context, Executor executor, zzdqd zzdqdVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, zzfdu zzfduVar, final zzefy zzefyVar) throws zzfev, zzejt {
        zzdpz zze = this.zzc.zze(new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza), new zzdqa(new zzdig() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(boolean z, Context context, zzcyu zzcyuVar) {
                zzefy zzefyVar2 = zzefy.this;
                try {
                    ((zzffm) zzefyVar2.zzb).zzv(z);
                    ((zzffm) zzefyVar2.zzb).zzz(context);
                } catch (zzfev e) {
                    throw new zzdif(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcpf((zzffm) zzefyVar.zzb), this.zzb);
        ((zzehr) zzefyVar.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        try {
            zzfeq zzfeqVar = zzfehVar.zza.zza;
            if (zzfeqVar.zzo.zza == 3) {
                ((zzffm) zzefyVar.zzb).zzr(this.zza, zzfeqVar.zzd, zzfduVar.zzw.toString(), (zzbpx) zzefyVar.zzc);
            } else {
                ((zzffm) zzefyVar.zzb).zzq(this.zza, zzfeqVar.zzd, zzfduVar.zzw.toString(), (zzbpx) zzefyVar.zzc);
            }
        } catch (Exception e) {
            zzcbn.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefyVar.zza)), e);
        }
    }
}
