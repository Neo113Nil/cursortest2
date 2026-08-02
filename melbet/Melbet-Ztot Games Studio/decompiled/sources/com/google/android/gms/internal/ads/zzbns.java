package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbns implements zzbne {
    private final zzbng zza;
    private final zzbnh zzb;
    private final zzbna zzc;
    private final String zzd;

    zzbns(zzbna zzbnaVar, String str, zzbnh zzbnhVar, zzbng zzbngVar) {
        this.zzc = zzbnaVar;
        this.zzd = str;
        this.zzb = zzbnhVar;
        this.zza = zzbngVar;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbns zzbnsVar, zzbmu zzbmuVar, zzbnb zzbnbVar, Object obj, zzbzt zzbztVar) {
        try {
            com.google.android.gms.ads.internal.zzu.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbiw.zzo.zzc(uuid, new zzbnr(zzbnsVar, zzbmuVar, zzbztVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbnsVar.zzb.zzb(obj));
            zzbnbVar.zzl(zzbnsVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzbztVar.zzd(e);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbmuVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbq
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbne
    public final ListenableFuture zzb(Object obj) {
        zzbzt zzbztVar = new zzbzt();
        zzbmu zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zzj(new zzbnp(this, zzb, obj, zzbztVar), new zzbnq(this, zzbztVar, zzb));
        return zzbztVar;
    }
}
