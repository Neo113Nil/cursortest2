package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbaj implements Runnable {
    final /* synthetic */ zzbak zza;

    zzbaj(zzbak zzbakVar) {
        Objects.requireNonNull(zzbakVar);
        this.zza = zzbakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbhe.zza(this.zza.zza);
    }
}
