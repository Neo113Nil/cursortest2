package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzenp implements zzeun {
    private final String zza;
    private final boolean zzb;

    public zzenp(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (str != null) {
            Bundle zza = zzfdr.zza(zzcuuVar.zza, "pii");
            zza.putString("afai", str);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
