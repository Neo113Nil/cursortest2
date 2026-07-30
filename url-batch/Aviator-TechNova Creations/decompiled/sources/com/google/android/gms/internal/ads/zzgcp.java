package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgcp implements Comparable {
    final Runnable zza;
    final long zzb;

    zzgcp(Runnable runnable, long j) {
        this.zza = runnable;
        this.zzb = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgcp) obj).zzb);
    }
}
