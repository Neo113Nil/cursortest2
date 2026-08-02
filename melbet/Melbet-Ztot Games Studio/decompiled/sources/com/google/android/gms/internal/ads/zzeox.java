package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeox implements zzevo {
    private final zzgcu zza;
    private final zzffg zzb;
    private final VersionInfoParcel zzc;
    private final zzbzi zzd;

    public zzeox(zzgcu zzgcuVar, zzffg zzffgVar, VersionInfoParcel versionInfoParcel, zzbzi zzbziVar) {
        this.zza = zzgcuVar;
        this.zzb = zzffgVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzbziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeow
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeox.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeoy zzc() throws Exception {
        return new zzeoy(this.zzb.zzj, this.zzc, this.zzd.zzm());
    }
}
