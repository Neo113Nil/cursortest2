package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeiu implements zzeeb {
    private final zzejy zza;
    private final zzdqc zzb;

    zzeiu(zzejy zzejyVar, zzdqc zzdqcVar) {
        this.zza = zzejyVar;
        this.zzb = zzdqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeec zza(String str, JSONObject jSONObject) throws zzfdj {
        zzbqw zzbqwVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbR)).booleanValue()) {
            try {
                zzbqwVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbqwVar = null;
            }
        } else {
            zzbqwVar = this.zza.zzb(str);
        }
        if (zzbqwVar == null) {
            return null;
        }
        return new zzeec(zzbqwVar, new zzefo(), str);
    }
}
