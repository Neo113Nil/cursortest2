package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcdj implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcdk zzb;

    zzcdj(zzcdk zzcdkVar, boolean z) {
        this.zzb = zzcdkVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
