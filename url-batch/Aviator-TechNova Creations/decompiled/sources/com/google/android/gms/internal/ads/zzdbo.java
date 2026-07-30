package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdbo extends zzdhd implements zzdbj {
    public zzdbo(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdbn
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzdbv) obj).zzj(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzd(final zzdmb zzdmbVar) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdbl
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                zzdbv zzdbvVar = (zzdbv) obj;
                String message = zzdmb.this.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzdbvVar.zzj(zzfkm.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zze() {
        zzs(zzdbm.zza);
    }
}
