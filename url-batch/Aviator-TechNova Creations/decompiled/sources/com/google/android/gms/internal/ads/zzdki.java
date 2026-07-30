package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdki extends zzdhd {
    private boolean zzb;

    protected zzdki(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdkh.zza);
    }

    public final void zzb() {
        zzs(zzdkd.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdke.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzs(zzdkg.zza);
            this.zzb = true;
        }
        zzs(zzdkf.zza);
    }
}
