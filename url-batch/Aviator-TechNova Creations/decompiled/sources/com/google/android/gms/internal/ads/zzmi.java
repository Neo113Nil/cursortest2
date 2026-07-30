package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzmi extends zzvy {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmi(zzmj zzmjVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmjVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.zzb;
        zzbd zzd = zzbfVar.zzd(i, zzbdVar, z);
        if (!zzbfVar.zzb(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zzf = true;
            return zzd;
        }
        Object obj = zzbdVar.zza;
        Object obj2 = zzbdVar.zzb;
        int i2 = zzbdVar.zzc;
        long j = zzbdVar.zzd;
        long j2 = zzbdVar.zze;
        zzd.zza(obj, obj2, i2, j, 0L, zzc.zza, true);
        return zzd;
    }
}
