package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzesp implements zzeux {
    public final zzfdt zza;

    public zzesp(zzfdt zzfdtVar) {
        this.zza = zzfdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkZ)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", this.zza.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
