package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdvb implements zzdup {
    private final long zza;
    private final zzenu zzb;

    zzdvb(long j, Context context, zzduu zzduuVar, zzciq zzciqVar, String str) {
        this.zza = j;
        zzfbz zzu = zzciqVar.zzu();
        zzu.zzc(context);
        zzu.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzu.zzb(str);
        zzenu zza = zzu.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdva(this, zzduuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdup
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdup
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdup
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
