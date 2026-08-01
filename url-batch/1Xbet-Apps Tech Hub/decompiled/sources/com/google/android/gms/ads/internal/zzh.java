package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfnt;
import com.google.android.gms.internal.ads.zzfow;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzh implements zzfow {
    final /* synthetic */ zzi zza;

    zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final void zza(int i, long j) {
        zzfnt zzfntVar;
        zzfntVar = this.zza.zzi;
        zzfntVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final void zzb(int i, long j, String str) {
        zzfnt zzfntVar;
        zzfntVar = this.zza.zzi;
        zzfntVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
