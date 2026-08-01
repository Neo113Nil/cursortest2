package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdgu extends zzddv {
    private boolean zzb;

    protected zzdgu(Set set) {
        super(set);
    }

    public final void zza() {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdgr
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdgq
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzt(zzdgs.zza);
            this.zzb = true;
        }
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzdgt
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzt(zzdgs.zza);
        this.zzb = true;
    }
}
