package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdrc implements zzczc {
    private final zzcgv zza;

    zzdrc(zzcgv zzcgvVar) {
        this.zza = zzcgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbo(Context context) {
        zzcgv zzcgvVar = this.zza;
        if (zzcgvVar != null) {
            zzcgvVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbq(Context context) {
        zzcgv zzcgvVar = this.zza;
        if (zzcgvVar != null) {
            zzcgvVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbr(Context context) {
        zzcgv zzcgvVar = this.zza;
        if (zzcgvVar != null) {
            zzcgvVar.onResume();
        }
    }
}
