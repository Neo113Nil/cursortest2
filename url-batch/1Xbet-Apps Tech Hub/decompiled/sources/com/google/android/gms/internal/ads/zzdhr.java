package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdhr implements zzhdp {
    private final zzdhb zza;
    private final zzhec zzb;

    public zzdhr(zzdhb zzdhbVar, zzhec zzhecVar) {
        this.zza = zzdhbVar;
        this.zzb = zzhecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
