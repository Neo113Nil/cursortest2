package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzccm {
    private final zzccf zza;
    private final AtomicInteger zzb;

    public zzccm() {
        zzccf zzccfVar = new zzccf();
        this.zza = zzccfVar;
        this.zzb = new AtomicInteger(0);
        zzgbb.zzr(zzccfVar, new zzcck(this), zzcca.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzi(zzccj zzccjVar, zzcch zzcchVar) {
        zzgbb.zzr(this.zza, new zzccl(this, zzccjVar, zzcchVar), zzcca.zzf);
    }
}
