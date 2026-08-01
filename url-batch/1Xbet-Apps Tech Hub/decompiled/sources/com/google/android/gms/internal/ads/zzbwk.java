package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbwk extends zzbwl {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbok zzd;

    public zzbwk(Context context, zzbok zzbokVar) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbokVar;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcbt.zza().zza);
            jSONObject.put("mf", zzbev.zza.zze());
            jSONObject.put("cl", "579009612");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final ListenableFuture zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzc.getLong("js_last_update", 0L) < ((Long) zzbev.zzb.zze()).longValue()) {
            return zzgbb.zzh(null);
        }
        return zzgbb.zzm(this.zzd.zzb(zzc(this.zzb)), new zzftn() { // from class: com.google.android.gms.internal.ads.zzbwj
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                zzbwk.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzcca.zzf);
    }

    final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbcu zzbcuVar = zzbdc.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb();
        SharedPreferences.Editor edit = zzbcw.zza(this.zzb).edit();
        com.google.android.gms.ads.internal.client.zzba.zza();
        zzbeh zzbehVar = zzbem.zza;
        com.google.android.gms.ads.internal.client.zzba.zza().zze(edit, 1, jSONObject);
        com.google.android.gms.ads.internal.client.zzba.zzb();
        edit.commit();
        this.zzc.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()).apply();
        return null;
    }
}
