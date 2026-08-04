package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzesj implements zzeun {
    public final Bundle zza;

    public zzesj(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        Bundle zza = zzfdr.zza(bundle, "device");
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", zza);
    }
}
