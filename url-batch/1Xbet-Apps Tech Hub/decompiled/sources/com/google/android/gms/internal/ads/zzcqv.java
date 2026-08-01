package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcqv implements zzavq {
    private zzcgv zza;
    private final Executor zzb;
    private final zzcqh zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcqk zzg = new zzcqk();

    public zzcqv(Executor executor, zzcqh zzcqhVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcqhVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcqv.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzbu(zzavp zzavpVar) {
        boolean z = this.zzf ? false : zzavpVar.zzj;
        zzcqk zzcqkVar = this.zzg;
        zzcqkVar.zza = z;
        zzcqkVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzavpVar;
        if (this.zze) {
            zzg();
        }
    }

    final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcgv zzcgvVar) {
        this.zza = zzcgvVar;
    }
}
