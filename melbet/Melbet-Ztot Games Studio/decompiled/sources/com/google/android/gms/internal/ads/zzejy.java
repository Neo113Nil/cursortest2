package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzejy implements zzeev {
    private final zzelc zza;
    private final zzdqb zzb;

    zzejy(zzelc zzelcVar, zzdqb zzdqbVar) {
        this.zza = zzelcVar;
        this.zzb = zzdqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    public final zzeew zza(String str, JSONObject jSONObject) throws zzffn {
        zzbql zzbqlVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbu)).booleanValue()) {
            try {
                zzbqlVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Coundn't create RTB adapter: ", e);
                zzbqlVar = null;
            }
        } else {
            zzbqlVar = this.zza.zza(str);
        }
        if (zzbqlVar == null) {
            return null;
        }
        return new zzeew(zzbqlVar, new zzegp(), str);
    }
}
