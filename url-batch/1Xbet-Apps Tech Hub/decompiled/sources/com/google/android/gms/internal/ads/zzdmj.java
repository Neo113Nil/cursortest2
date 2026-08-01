package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdmj implements zzczb {
    private final zzdkk zza;
    private final zzdkp zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdmj(zzdkk zzdkkVar, zzdkp zzdkpVar, Executor executor, Executor executor2) {
        this.zza = zzdkkVar;
        this.zzb = zzdkpVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcgv zzcgvVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // java.lang.Runnable
            public final void run() {
                zzcgv.this.zzd("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzq() {
        if (this.zzb.zzd()) {
            zzdkk zzdkkVar = this.zza;
            zzflf zzu = zzdkkVar.zzu();
            if (zzu == null && zzdkkVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeZ)).booleanValue()) {
                zzdkk zzdkkVar2 = this.zza;
                ListenableFuture zzw = zzdkkVar2.zzw();
                zzccf zzp = zzdkkVar2.zzp();
                if (zzw == null || zzp == null) {
                    return;
                }
                zzgbb.zzr(zzgbb.zzl(zzw, zzp), new zzdmi(this), this.zzd);
                return;
            }
            if (zzu != null) {
                zzdkk zzdkkVar3 = this.zza;
                zzcgv zzr = zzdkkVar3.zzr();
                zzcgv zzs = zzdkkVar3.zzs();
                if (zzr == null) {
                    zzr = zzs != null ? zzs : null;
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
