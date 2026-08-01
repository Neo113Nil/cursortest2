package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcyz extends zzddv {
    private boolean zzb;

    public zzcyz(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzcyy
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzczb) obj).zzq();
            }
        });
        this.zzb = true;
    }
}
