package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeig implements zzegb {
    private final Context zza;
    private final zzdhy zzb;

    public zzeig(Context context, zzdhy zzdhyVar) {
        this.zza = context;
        this.zzb = zzdhyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev, zzejt {
        zzeia zzeiaVar = new zzeia(zzfduVar, (zzbrp) zzefyVar.zzb, AdFormat.INTERSTITIAL);
        zzdgy zze = this.zzb.zze(new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza), new zzdhb(zzeiaVar, null));
        zzeiaVar.zzb(zze.zzc());
        ((zzehr) zzefyVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        try {
            ((zzbrp) zzefyVar.zzb).zzq(zzfduVar.zzaa);
            ((zzbrp) zzefyVar.zzb).zzl(zzfduVar.zzV, zzfduVar.zzw.toString(), zzfehVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeif(this, zzefyVar, null), (zzbpx) zzefyVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfev(e);
        }
    }
}
