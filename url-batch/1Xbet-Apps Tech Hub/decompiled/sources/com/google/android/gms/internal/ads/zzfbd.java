package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfbd implements zzftn {
    final /* synthetic */ zzfbh zza;

    zzfbd(zzfbh zzfbhVar) {
        this.zza = zzfbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftn
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfgn zze;
        zzfbg zzfbgVar;
        zzcbn.zzh("", (zzdzp) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfbh zzfbhVar = this.zza;
        zze = zzfbhVar.zze();
        zzfbhVar.zzd = new zzfbg(null, zze, null);
        zzfbgVar = this.zza.zzd;
        return zzfbgVar;
    }
}
