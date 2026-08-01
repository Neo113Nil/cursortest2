package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcxh implements zzczv, zzczc {
    private final Context zza;
    private final zzfdu zzb;
    private final zzbtu zzc;

    public zzcxh(Context context, zzfdu zzfduVar, zzbtu zzbtuVar) {
        this.zza = context;
        this.zzb = zzfduVar;
        this.zzc = zzbtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbo(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbq(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzbr(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        zzbtv zzbtvVar = this.zzb.zzae;
        if (zzbtvVar == null || !zzbtvVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
