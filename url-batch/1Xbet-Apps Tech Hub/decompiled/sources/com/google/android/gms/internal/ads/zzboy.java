package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzboy implements zzbok {
    private final zzbom zza;
    private final zzbon zzb;
    private final zzbog zzc;
    private final String zzd;

    zzboy(zzbog zzbogVar, String str, zzbon zzbonVar, zzbom zzbomVar) {
        this.zzc = zzbogVar;
        this.zzd = str;
        this.zzb = zzbonVar;
        this.zza = zzbomVar;
    }

    static /* bridge */ /* synthetic */ void zzd(zzboy zzboyVar, zzboa zzboaVar, zzboh zzbohVar, Object obj, zzccf zzccfVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbkc.zzo.zzc(uuid, new zzbox(zzboyVar, zzboaVar, zzccfVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject.put("args", zzboyVar.zzb.zzb(obj));
            zzbohVar.zzl(zzboyVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzccfVar.zzd(e);
                zzcbn.zzh("Unable to invokeJavascript", e);
            } finally {
                zzboaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgai
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final ListenableFuture zzb(Object obj) {
        zzccf zzccfVar = new zzccf();
        zzboa zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zzi(new zzbov(this, zzb, obj, zzccfVar), new zzbow(this, zzccfVar, zzb));
        return zzccfVar;
    }
}
