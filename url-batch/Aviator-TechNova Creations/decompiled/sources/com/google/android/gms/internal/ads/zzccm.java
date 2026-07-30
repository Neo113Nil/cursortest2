package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzccm extends zzccr {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    final zzikp zzg;
    final zzikp zzh;
    private final Clock zzj;

    zzccm(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzccq zzccqVar) {
        this.zzj = clock;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(zzgVar);
        this.zzb = zza2;
        this.zzc = zzikf.zza(zzccg.zza(zza, zza2));
        zzikg zza3 = zzikh.zza(clock);
        this.zzd = zza3;
        zzikg zza4 = zzikh.zza(zzccqVar);
        this.zze = zza4;
        zzikp zza5 = zzikf.zza(zzcci.zza(zza3, zza2, zza4));
        this.zzf = zza5;
        zzcck zzc = zzcck.zzc(zza3, zza5);
        this.zzg = zzc;
        this.zzh = zzikf.zza(zzccx.zza(zza, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzccr
    final zzccj zza() {
        return new zzccj(this.zzj, (zzcch) this.zzf.zzb());
    }
}
