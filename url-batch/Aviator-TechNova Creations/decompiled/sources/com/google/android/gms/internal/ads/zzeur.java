package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeur implements zzfax {
    private final zzgzy zza;
    private final VersionInfoParcel zzb;

    zzeur(VersionInfoParcel versionInfoParcel, zzgzy zzgzyVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeur.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 54;
    }

    final /* synthetic */ zzeus zzc() {
        return zzeus.zzc(this.zzb);
    }
}
