package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzepb implements zzeki {
    private final zzeqf zza;
    private final zzdvp zzb;

    zzepb(zzeqf zzeqfVar, zzdvp zzdvpVar) {
        this.zza = zzeqfVar;
        this.zzb = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        zzbvs zzbvsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzck)).booleanValue()) {
            try {
                zzbvsVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbvsVar = null;
            }
        } else {
            zzbvsVar = this.zza.zzb(str);
        }
        if (zzbvsVar == null) {
            return null;
        }
        return new zzekj(zzbvsVar, new zzelv(), str);
    }
}
