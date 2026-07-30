package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfwf;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzh implements zzfwf {
    final /* synthetic */ zzk zza;

    zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zza(int i, long j) {
        this.zza.zzo().zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zzb(int i, long j, String str) {
        this.zza.zzo().zzf(i, System.currentTimeMillis() - j, str);
    }
}
