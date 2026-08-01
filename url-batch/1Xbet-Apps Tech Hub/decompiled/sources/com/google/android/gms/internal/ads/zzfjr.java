package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfjr implements zzfje {
    private final zzfjo zza;
    private final zzfjm zzb;

    public zzfjr(zzfjo zzfjoVar, zzfjm zzfjmVar) {
        this.zza = zzfjoVar;
        this.zzb = zzfjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final String zza(zzfjd zzfjdVar) {
        zzfjm zzfjmVar = this.zzb;
        Map zzj = zzfjdVar.zzj();
        zzfjmVar.zza(zzj);
        return this.zza.zza(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final void zzb(zzfjd zzfjdVar) {
    }
}
