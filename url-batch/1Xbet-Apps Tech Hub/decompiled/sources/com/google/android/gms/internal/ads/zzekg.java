package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzekg implements zzegb {
    private final Context zza;
    private final zzdqd zzb;

    public zzekg(Context context, zzdqd zzdqdVar) {
        this.zza = context;
        this.zzb = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev, zzejt {
        zzeia zzeiaVar = new zzeia(zzfduVar, (zzbrp) zzefyVar.zzb, AdFormat.REWARDED);
        zzdpz zze = this.zzb.zze(new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza), new zzdqa(zzeiaVar));
        zzeiaVar.zzb(zze.zzc());
        ((zzehr) zzefyVar.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        try {
            ((zzbrp) zzefyVar.zzb).zzq(zzfduVar.zzaa);
            if (zzfehVar.zza.zza.zzo.zza == 3) {
                ((zzbrp) zzefyVar.zzb).zzo(zzfduVar.zzV, zzfduVar.zzw.toString(), zzfehVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekf(this, zzefyVar, null), (zzbpx) zzefyVar.zzc);
            } else {
                ((zzbrp) zzefyVar.zzb).zzp(zzfduVar.zzV, zzfduVar.zzw.toString(), zzfehVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekf(this, zzefyVar, null), (zzbpx) zzefyVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
