package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhcn extends zzhcg {
    private final zzhcv zza;
    private final zzhyg zzb;
    private final zzhyg zzc;
    private final zzhye zzd;

    @Nullable
    private final Integer zze;

    /* synthetic */ zzhcn(zzhcv zzhcvVar, zzhyg zzhygVar, zzhyg zzhygVar2, zzhye zzhyeVar, Integer num, byte[] bArr) {
        this.zza = zzhcvVar;
        this.zzb = zzhygVar;
        this.zzc = zzhygVar2;
        this.zzd = zzhyeVar;
        this.zze = num;
    }

    public static zzhcm zzd() {
        return new zzhcm(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    @Nullable
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final zzhye zzc() {
        return this.zzd;
    }

    public final zzhyg zze() {
        return this.zzb;
    }

    public final zzhyg zzf() {
        return this.zzc;
    }

    public final zzhcv zzg() {
        return this.zza;
    }
}
