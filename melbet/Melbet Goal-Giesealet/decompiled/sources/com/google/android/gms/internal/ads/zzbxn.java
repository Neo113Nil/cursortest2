package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbxn extends zzbxs {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    final zzhqg zzh;
    private final Clock zzj;

    zzbxn(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxr zzbxrVar) {
        this.zzj = clock;
        zzhpx zza = zzhpy.zza(context);
        this.zza = zza;
        zzhpx zza2 = zzhpy.zza(zzgVar);
        this.zzb = zza2;
        this.zzc = zzhpw.zza(zzbxh.zza(zza, zza2));
        zzhpx zza3 = zzhpy.zza(clock);
        this.zzd = zza3;
        zzhpx zza4 = zzhpy.zza(zzbxrVar);
        this.zze = zza4;
        zzhqg zza5 = zzhpw.zza(zzbxj.zza(zza3, zza2, zza4));
        this.zzf = zza5;
        zzbxl zzc = zzbxl.zzc(zza3, zza5);
        this.zzg = zzc;
        this.zzh = zzhpw.zza(zzbxy.zza(zza, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    final zzbxk zza() {
        return new zzbxk(this.zzj, (zzbxi) this.zzf.zzb());
    }
}
