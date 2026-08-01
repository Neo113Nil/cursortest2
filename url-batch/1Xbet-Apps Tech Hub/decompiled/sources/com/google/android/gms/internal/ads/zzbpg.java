package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbpg implements zzgai {
    private final zzbom zza;
    private final zzbon zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzd;

    zzbpg(ListenableFuture listenableFuture, String str, zzbon zzbonVar, zzbom zzbomVar) {
        this.zzd = listenableFuture;
        this.zzb = zzbonVar;
        this.zza = zzbomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgai
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgbb.zzn(this.zzd, new zzgai() { // from class: com.google.android.gms.internal.ads.zzbpe
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj2) {
                return zzbpg.this.zzc(obj, (zzboh) obj2);
            }
        }, zzcca.zzf);
    }

    final /* synthetic */ ListenableFuture zzc(Object obj, zzboh zzbohVar) throws Exception {
        zzccf zzccfVar = new zzccf();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbkc.zzo.zzc(uuid, new zzbpf(this, zzccfVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbohVar.zzl(this.zzc, jSONObject);
        return zzccfVar;
    }
}
