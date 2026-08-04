package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcab implements Runnable {
    final /* synthetic */ zzcah zza;

    zzcab(zzcah zzcahVar) {
        Objects.requireNonNull(zzcahVar);
        this.zza = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcah zzcahVar = this.zza;
        if (zzcahVar.zzt() != null) {
            zzcahVar.zzt().zza();
        }
    }
}
