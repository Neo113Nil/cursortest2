package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzegc implements zzeef {
    private final Context zza;
    private final zzdgh zzb;

    public zzegc(Context context, zzdgh zzdghVar) {
        this.zza = context;
        this.zzb = zzdghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        try {
            zzbqw zzbqwVar = (zzbqw) zzeecVar.zzb;
            zzbqwVar.zzo(zzfcjVar.zzZ);
            zzbqwVar.zzj(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfcuVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegb(this, zzeecVar, null), (zzbpd) zzeecVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfdj(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzefx zzefxVar = new zzefx(zzfcjVar, (zzbqw) zzeecVar.zzb, AdFormat.INTERSTITIAL);
        zzdfb zzd = this.zzb.zzd(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdfe(zzefxVar, null));
        zzefxVar.zzc(zzd.zzd());
        ((zzefo) zzeecVar.zzc).zzc(zzd.zzg());
        return zzd.zzh();
    }
}
