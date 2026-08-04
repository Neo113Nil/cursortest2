package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeia implements zzeef {
    private final Context zza;
    private final zzdor zzb;

    public zzeia(Context context, zzdor zzdorVar) {
        this.zza = context;
        this.zzb = zzdorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        try {
            zzbqw zzbqwVar = (zzbqw) zzeecVar.zzb;
            zzbqwVar.zzo(zzfcjVar.zzZ);
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            if (zzfdcVar.zzp.zza == 3) {
                zzbqwVar.zzp(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfdcVar.zzd, ObjectWrapper.wrap(this.zza), new zzehz(this, zzeecVar, null), (zzbpd) zzeecVar.zzc);
            } else {
                zzbqwVar.zzl(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfdcVar.zzd, ObjectWrapper.wrap(this.zza), new zzehz(this, zzeecVar, null), (zzbpd) zzeecVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzefx zzefxVar = new zzefx(zzfcjVar, (zzbqw) zzeecVar.zzb, AdFormat.REWARDED);
        zzdon zzf = this.zzb.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdoo(zzefxVar));
        zzefxVar.zzc(zzf.zzd());
        ((zzefo) zzeecVar.zzc).zzc(zzf.zzn());
        return zzf.zzh();
    }
}
