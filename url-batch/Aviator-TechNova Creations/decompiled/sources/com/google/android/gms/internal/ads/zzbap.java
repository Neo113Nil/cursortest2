package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbap implements Runnable {
    final /* synthetic */ zzbar zza;

    zzbap(zzbar zzbarVar) {
        Objects.requireNonNull(zzbarVar);
        this.zza = zzbarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
