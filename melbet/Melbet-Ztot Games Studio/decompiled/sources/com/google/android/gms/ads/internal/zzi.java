package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfpk;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzi implements zzfpk {
    final /* synthetic */ zzj zza;

    zzi(zzj zzjVar) {
        this.zza = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final void zza(int i, long j) {
        zzfoh zzfohVar;
        zzfohVar = this.zza.zzi;
        zzfohVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final void zzb(int i, long j, String str) {
        zzfoh zzfohVar;
        zzfohVar = this.zza.zzi;
        zzfohVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
