package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeqy implements zzeuy {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzeuy zzc;
    private final long zzd;

    public zzeqy(zzeuy zzeuyVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzeuyVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        zzeqx zzeqxVar = (zzeqx) this.zza.get();
        if (zzeqxVar == null || zzeqxVar.zza()) {
            zzeuy zzeuyVar = this.zzc;
            zzeqx zzeqxVar2 = new zzeqx(zzeuyVar.zzb(), this.zzd, this.zzb);
            this.zza.set(zzeqxVar2);
            zzeqxVar = zzeqxVar2;
        }
        return zzeqxVar.zza;
    }
}
