package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfgb implements zzgqt {
    final /* synthetic */ zzfgf zza;

    zzfgb(zzfgf zzfgfVar) {
        Objects.requireNonNull(zzfgfVar);
        this.zza = zzfgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (zzeff) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfgf zzfgfVar = this.zza;
        zzfgfVar.zzd(new zzfgd(null, zzfgfVar.zzb(), null));
        return zzfgfVar.zzc();
    }
}
