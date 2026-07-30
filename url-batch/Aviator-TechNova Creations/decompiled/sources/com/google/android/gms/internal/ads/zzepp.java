package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzepp implements zzekg {
    private final Context zza;
    private final zzcvc zzb;
    private final zzbhz zzc;
    private final zzgzy zzd;
    private final zzfnu zze;

    public zzepp(Context context, zzcvc zzcvcVar, zzfnu zzfnuVar, zzgzy zzgzyVar, zzbhz zzbhzVar) {
        this.zza = context;
        this.zzb = zzcvcVar;
        this.zze = zzfnuVar;
        this.zzd = zzgzyVar;
        this.zzc = zzbhzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar;
        return (this.zzc == null || (zzfiwVar = zzfirVar.zzs) == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final ListenableFuture zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzepl zzeplVar = new zzepl(this, new View(this.zza), null, zzepn.zza, (zzfis) zzfirVar.zzu.get(0));
        zzcty zzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, null), zzeplVar);
        zzepo zzl = zzf.zzl();
        zzfiw zzfiwVar = zzfirVar.zzs;
        final zzbhu zzbhuVar = new zzbhu(zzl, zzfiwVar.zzb, zzfiwVar.zza);
        zzfno zzfnoVar = zzfno.CUSTOM_RENDER_SYN;
        zzfnu zzfnuVar = this.zze;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzd(new zzfna() { // from class: com.google.android.gms.internal.ads.zzepm
            @Override // com.google.android.gms.internal.ads.zzfna
            public final /* synthetic */ void zza() {
                zzepp.this.zzc(zzbhuVar);
            }
        }, this.zzd, zzfnoVar, zzfnuVar).zzj(zzfno.CUSTOM_RENDER_ACK).zze(zzgzo.zza(zzf.zzi())).zzi();
    }

    final /* synthetic */ void zzc(zzbhu zzbhuVar) {
        this.zzc.zze(zzbhuVar);
    }
}
