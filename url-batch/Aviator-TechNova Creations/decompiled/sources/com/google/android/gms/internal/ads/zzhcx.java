package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhcx extends zzhcg {
    private final zzhdd zza;
    private final zzhyg zzb;
    private final zzhye zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhcx(zzhdd zzhddVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num, byte[] bArr) {
        this.zza = zzhddVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhcw zzd() {
        return new zzhcw(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final zzhye zzc() {
        return this.zzc;
    }

    public final zzhyg zze() {
        return this.zzb;
    }

    public final zzhdd zzf() {
        return this.zza;
    }
}
