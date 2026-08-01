package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdmu implements zzhdp {
    private final zzdmn zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzdmu(zzdmn zzdmnVar, zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzdmnVar;
        this.zzb = zzhecVar;
        this.zzc = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdfw(((zzdpu) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
