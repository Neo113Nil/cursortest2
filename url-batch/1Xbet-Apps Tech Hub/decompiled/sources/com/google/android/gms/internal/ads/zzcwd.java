package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcwd implements zzhdp {
    private final zzcwc zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzcwd(zzcwc zzcwcVar, zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzcwcVar;
        this.zzb = zzhecVar;
        this.zzc = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzbyo) this.zzc.zzb(), null);
    }
}
