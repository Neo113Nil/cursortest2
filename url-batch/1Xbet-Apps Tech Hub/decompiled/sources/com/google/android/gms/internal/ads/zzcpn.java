package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcpn implements zzgax {
    final /* synthetic */ zzfla zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcpo zzc;

    zzcpn(zzcpo zzcpoVar, zzfla zzflaVar, String str) {
        this.zzc = zzcpoVar;
        this.zza = zzflaVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(final Throwable th) {
        zzgbl zzgblVar;
        zzgblVar = this.zzc.zze;
        final zzfla zzflaVar = this.zza;
        final String str = this.zzb;
        zzgblVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpl
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                zzbuu zzbuuVar;
                zzcpn zzcpnVar = zzcpn.this;
                zzcpo zzcpoVar = zzcpnVar.zzc;
                context = zzcpoVar.zza;
                zzcpoVar.zzh = zzbus.zza(context);
                zzbuuVar = zzcpnVar.zzc.zzh;
                zzbuuVar.zzf(th, "AttributionReporting.registerSourceAndPingClickUrl");
                zzflaVar.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgbl zzgblVar;
        zzcpo zzcpoVar = this.zzc;
        final zzfla zzflaVar = this.zza;
        final String str = (String) obj;
        zzgblVar = zzcpoVar.zze;
        zzgblVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpm
            @Override // java.lang.Runnable
            public final void run() {
                zzfla.this.zzc(str, null);
            }
        });
    }
}
