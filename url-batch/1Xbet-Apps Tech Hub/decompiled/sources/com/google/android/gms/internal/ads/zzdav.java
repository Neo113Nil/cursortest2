package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdav implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdaw zzdawVar = (zzdaw) this.zza.get();
        if (zzdawVar != null) {
            zzdawVar.zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdat
                @Override // com.google.android.gms.internal.ads.zzddu
                public final void zza(Object obj) {
                    ((zzdax) obj).zza();
                }
            });
        }
    }
}
