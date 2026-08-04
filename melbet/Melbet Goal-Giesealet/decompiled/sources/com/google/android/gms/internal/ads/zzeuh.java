package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeuh implements zzeup {
    private final boolean zza;

    zzeuh(zzfaf zzfafVar) {
        this.zza = zzfafVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzeug(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 36;
    }
}
