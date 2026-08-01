package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzego implements zzegb {
    private final Context zza;
    private final zzcrd zzb;

    zzego(Context context, zzcrd zzcrdVar) {
        this.zza = context;
        this.zzb = zzcrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev, zzejt {
        zzeia zzeiaVar = new zzeia(zzfduVar, (zzbrp) zzefyVar.zzb, AdFormat.APP_OPEN_AD);
        zzcra zza = this.zzb.zza(new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza), new zzdhb(zzeiaVar, null), new zzcrb(zzfduVar.zzab));
        zzeiaVar.zzb(zza.zzc());
        ((zzehr) zzefyVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        try {
            ((zzbrp) zzefyVar.zzb).zzq(zzfduVar.zzaa);
            ((zzbrp) zzefyVar.zzb).zzi(zzfduVar.zzV, zzfduVar.zzw.toString(), zzfehVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegn(zzefyVar, null), (zzbpx) zzefyVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfev(e);
        }
    }
}
