package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzees implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzees(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzees zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzees(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeer zzb() {
        return new zzeer((Context) this.zza.zzb(), (zzcny) this.zzb.zzb());
    }
}
