package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzanj;
import com.google.android.gms.internal.ads.zzcbn;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbj implements zzane {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbn zzb;

    zzbj(zzbq zzbqVar, String str, zzbn zzbnVar) {
        this.zza = str;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(zzanj zzanjVar) {
        zzcbn.zzj("Failed to load URL: " + this.zza + "\n" + zzanjVar.toString());
        this.zzb.zza((Object) null);
    }
}
