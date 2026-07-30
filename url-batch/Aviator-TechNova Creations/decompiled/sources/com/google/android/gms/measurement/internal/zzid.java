package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
final class zzid implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzij zzb;

    zzid(zzij zzijVar, Boolean bool) {
        this.zzb = zzijVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
