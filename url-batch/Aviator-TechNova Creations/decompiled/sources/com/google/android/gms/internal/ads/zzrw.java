package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzrw implements zzsj {
    final /* synthetic */ zzsd zza;

    /* synthetic */ zzrw(zzsd zzsdVar, byte[] bArr) {
        Objects.requireNonNull(zzsdVar);
        this.zza = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zza(long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        zzee.zzc("AudioTrackAudioOutput", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zzb(final long j) {
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzrv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzqa) obj).zza(j);
            }
        };
        zzed zzs = this.zza.zzs();
        zzs.zzd(-1, zzdyVar);
        zzs.zze();
    }
}
