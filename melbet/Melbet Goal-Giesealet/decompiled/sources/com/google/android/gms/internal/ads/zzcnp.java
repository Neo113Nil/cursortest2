package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcnp implements zzayi {
    private zzcek zza;
    private final Executor zzb;
    private final zzcnb zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcne zzg = new zzcne();

    public zzcnp(Executor executor, zzcnb zzcnbVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcnbVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcno
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcnp.this.zzf(zzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        boolean z = this.zzf ? false : zzayhVar.zzj;
        zzcne zzcneVar = this.zzg;
        zzcneVar.zza = z;
        zzcneVar.zzd = this.zzd.elapsedRealtime();
        zzcneVar.zzf = zzayhVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    final /* synthetic */ void zzf(JSONObject jSONObject) {
        String obj = jSONObject.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 31);
        sb.append("Calling AFMA_updateActiveView(");
        sb.append(obj);
        sb.append(")");
        String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
