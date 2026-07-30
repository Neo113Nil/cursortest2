package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzdef implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdeg zzdegVar = (zzdeg) this.zza.get();
        if (zzdegVar != null) {
            zzdegVar.zzs(zzdec.zza);
        }
    }
}
