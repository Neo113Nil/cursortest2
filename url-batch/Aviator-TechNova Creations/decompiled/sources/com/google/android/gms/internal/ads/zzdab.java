package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzdab implements zzdct, zzdca {
    private final zzfir zza;

    public zzdab(Context context, zzfir zzfirVar, zzbxx zzbxxVar) {
        this.zza = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzc(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzbxy zzbxyVar = this.zza.zzad;
        if (zzbxyVar == null || !zzbxyVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbxyVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}
