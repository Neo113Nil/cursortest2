package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcac implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcah zzc;

    zzcac(zzcah zzcahVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        Objects.requireNonNull(zzcahVar);
        this.zzc = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcah zzcahVar = this.zzc;
        if (zzcahVar.zzt() != null) {
            zzcahVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
