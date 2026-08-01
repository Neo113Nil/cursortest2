package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcux implements zzgax {
    final /* synthetic */ zzcuz zza;

    zzcux(zzcuz zzcuzVar) {
        this.zza = zzcuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzddm zzddmVar;
        zzddmVar = this.zza.zzf;
        zzddmVar.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzddm zzddmVar;
        zzddmVar = this.zza.zzf;
        zzddmVar.zzn(true);
    }
}
