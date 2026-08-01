package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbuj extends zzbud {
    final /* synthetic */ List zza;

    zzbuj(zzbum zzbumVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbue
    public final void zze(String str) {
        zzcbn.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbue
    public final void zzf(List list) {
        zzcbn.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
