package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcwb extends zzdbq implements zzcvw {
    public zzcwb(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcwa
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                ((zzcwi) obj).zzj(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzd(final zzdgo zzdgoVar) {
        zzs(new zzdbp() { // from class: com.google.android.gms.internal.ads.zzcvy
            @Override // com.google.android.gms.internal.ads.zzdbp
            public final /* synthetic */ void zza(Object obj) {
                zzcwi zzcwiVar = (zzcwi) obj;
                String message = zzdgo.this.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzcwiVar.zzj(zzfee.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zze() {
        zzs(zzcvz.zza);
    }
}
