package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeyn implements zzeuy {
    private final zzcaw zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgbl zze;
    private final String zzf;
    private final zzcal zzg;

    zzeyn(zzcaw zzcawVar, boolean z, boolean z2, zzcal zzcalVar, zzgbl zzgblVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzcawVar;
        this.zzb = z;
        this.zzc = z2;
        this.zzg = zzcalVar;
        this.zze = zzgblVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhh)).booleanValue() && this.zzc) {
            return zzgbb.zzh(null);
        }
        if (!this.zzb) {
            return zzgbb.zzh(null);
        }
        return zzgbb.zze(zzgbb.zzo(zzgbb.zzm(zzgbb.zzh(null), new zzftn() { // from class: com.google.android.gms.internal.ads.zzeyl
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzeyo(str);
            }
        }, this.zze), ((Long) zzbfj.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzftn() { // from class: com.google.android.gms.internal.ads.zzeym
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                zzeyn.this.zzc((Exception) obj);
                return null;
            }
        }, this.zze);
    }

    final /* synthetic */ zzeyo zzc(Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return null;
    }
}
