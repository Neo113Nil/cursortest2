package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbft extends zzcen {
    final /* synthetic */ zzbfz zza;

    zzbft(zzbfz zzbfzVar) {
        Objects.requireNonNull(zzbfzVar);
        this.zza = zzbfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcen, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zza.zzb();
        return super.cancel(z);
    }
}
