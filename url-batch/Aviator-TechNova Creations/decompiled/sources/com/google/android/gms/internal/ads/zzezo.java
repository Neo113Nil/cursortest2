package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzezo implements zzfav {
    private final Bundle zza;

    public zzezo(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bundle != null) {
            zzdahVar.zza.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (bundle != null) {
            zzdahVar.zzb.putAll(bundle);
        }
    }
}
