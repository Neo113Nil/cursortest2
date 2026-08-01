package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcyt extends zzddv implements zzcyl {
    public zzcyt(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzcys
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzcyx) obj).zzp(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzb() {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzcyr
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzcyx) obj).zzp(zzffr.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzc(final zzdif zzdifVar) {
        zzt(new zzddu() { // from class: com.google.android.gms.internal.ads.zzcyq
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zza(Object obj) {
                ((zzcyx) obj).zzp(zzffr.zzd(12, zzdif.this.getMessage(), null));
            }
        });
    }
}
