package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzefw implements zzefv {
    public final zzefv zza;
    private final zzftn zzb;

    public zzefw(zzefv zzefvVar, zzftn zzftnVar) {
        this.zza = zzefvVar;
        this.zzb = zzftnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(zzfeh zzfehVar, zzfdu zzfduVar) {
        return zzgbb.zzm(this.zza.zza(zzfehVar, zzfduVar), this.zzb, zzcca.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        return this.zza.zzb(zzfehVar, zzfduVar);
    }
}
