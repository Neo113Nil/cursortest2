package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeih implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzeih(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeig zzb() {
        return new zzeig((Context) this.zza.zzb(), (zzdhy) this.zzb.zzb());
    }
}
