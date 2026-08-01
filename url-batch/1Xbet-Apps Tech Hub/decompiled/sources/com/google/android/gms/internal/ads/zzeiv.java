package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeiv implements zzegb {
    private final Context zza;
    private final zzdiu zzb;
    private zzbqg zzc;
    private final zzcbt zzd;

    public zzeiv(Context context, zzdiu zzdiuVar, zzcbt zzcbtVar) {
        this.zza = context;
        this.zzb = zzdiuVar;
        this.zzd = zzcbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev, zzejt {
        if (!zzfehVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzejt(2, "Unified must be used for RTB.");
        }
        zzdkk zzt = zzdkk.zzt(this.zzc);
        zzfeq zzfeqVar = zzfehVar.zza.zza;
        if (!zzfeqVar.zzg.contains(Integer.toString(zzt.zzc()))) {
            throw new zzejt(1, "No corresponding native ad listener");
        }
        zzdkm zze = this.zzb.zze(new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza), new zzdkw(zzt), new zzdmn(null, null, this.zzc));
        ((zzehr) zzefyVar.zzc).zzc(zze.zzi());
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        try {
            ((zzbrp) zzefyVar.zzb).zzq(zzfduVar.zzaa);
            zzeit zzeitVar = null;
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbF)).intValue()) {
                ((zzbrp) zzefyVar.zzb).zzm(zzfduVar.zzV, zzfduVar.zzw.toString(), zzfehVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiu(this, zzefyVar, zzeitVar), (zzbpx) zzefyVar.zzc);
            } else {
                ((zzbrp) zzefyVar.zzb).zzn(zzfduVar.zzV, zzfduVar.zzw.toString(), zzfehVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiu(this, zzefyVar, zzeitVar), (zzbpx) zzefyVar.zzc, zzfehVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfev(e);
        }
    }
}
