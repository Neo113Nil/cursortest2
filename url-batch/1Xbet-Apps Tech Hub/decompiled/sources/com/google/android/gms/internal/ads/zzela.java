package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzela implements zzefx {
    private final zzeme zza;
    private final zzdrk zzb;

    zzela(zzeme zzemeVar, zzdrk zzdrkVar) {
        this.zza = zzemeVar;
        this.zzb = zzdrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefx
    public final zzefy zza(String str, JSONObject jSONObject) throws zzfev {
        zzbrp zzbrpVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbC)).booleanValue()) {
            try {
                zzbrpVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                zzcbn.zzh("Coundn't create RTB adapter: ", e);
                zzbrpVar = null;
            }
        } else {
            zzbrpVar = this.zza.zza(str);
        }
        if (zzbrpVar == null) {
            return null;
        }
        return new zzefy(zzbrpVar, new zzehr(), str);
    }
}
