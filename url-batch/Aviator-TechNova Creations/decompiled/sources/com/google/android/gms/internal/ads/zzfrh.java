package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfrh implements zzbdy {
    final /* synthetic */ zzfrj zza;

    zzfrh(zzfrj zzfrjVar) {
        Objects.requireNonNull(zzfrjVar);
        this.zza = zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzz)).booleanValue()) {
            this.zza.zzj(z);
        }
    }
}
