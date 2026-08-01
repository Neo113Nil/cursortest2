package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcsu implements zzhdp {
    private final zzhec zza;

    public zzcsu(zzhec zzhecVar) {
        this.zza = zzhecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzcxy) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfx)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
