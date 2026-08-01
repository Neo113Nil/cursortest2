package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzept implements zzeux {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final zzcbt zzb;
    private final boolean zzc;

    public zzept(com.google.android.gms.ads.internal.client.zzw zzwVar, zzcbt zzcbtVar, boolean z) {
        this.zza = zzwVar;
        this.zzb = zzcbtVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfg)).intValue()) {
            bundle.putString("app_open_version", ExifInterface.GPS_MEASUREMENT_2D);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfh)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
