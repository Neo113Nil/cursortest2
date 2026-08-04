package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzetg implements zzeun {
    private final Bundle zza;

    public zzetg(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bundle != null) {
            zzcuuVar.zza.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bundle != null) {
            zzcuuVar.zzb.putAll(bundle);
        }
    }
}
