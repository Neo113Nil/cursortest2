package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeaq {
    private final zzgbl zza;
    private final zzeal zzb;
    private final zzfiu zzc;

    zzeaq(zzgbl zzgblVar, zzeal zzealVar, zzfiu zzfiuVar) {
        this.zza = zzgblVar;
        this.zzb = zzealVar;
        this.zzc = zzfiuVar;
    }

    public final ListenableFuture zza(final zzbwa zzbwaVar) {
        zzfil zzb = this.zzc.zzb(zzfio.GMS_SIGNALS, zzgbb.zzm(zzgbb.zzh(null), new zzftn() { // from class: com.google.android.gms.internal.ads.zzean
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                zzbwa zzbwaVar2 = zzbwa.this;
                return new zzbve(zzbwaVar2.zzc, zzbwaVar2.zzd, zzbwaVar2.zzf, zzfun.zzc(zzbwaVar2.zza.getString("ms")), -1, zzbwaVar2.zzh, zzbwaVar2.zze, zzbwaVar2.zzk, zzbwaVar2.zzl);
            }
        }, this.zza));
        final zzeal zzealVar = this.zzb;
        return zzgbb.zzm(zzb.zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzeao
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeal.this.zzb((zzbve) obj);
            }
        }).zza(), new zzftn() { // from class: com.google.android.gms.internal.ads.zzeap
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbwaVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject zzh = com.google.android.gms.ads.internal.client.zzay.zzb().zzh(bundle);
                    try {
                        com.google.android.gms.ads.internal.client.zzay.zzb().zzk(jSONObject, zzh);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return zzh;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.zza);
    }
}
