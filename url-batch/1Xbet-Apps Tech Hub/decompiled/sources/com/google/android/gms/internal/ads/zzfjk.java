package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfjk implements zzfje {
    private final zzfjo zza;
    private final zzfjm zzb;
    private final zzfjb zzc;

    public zzfjk(zzfjb zzfjbVar, zzfjo zzfjoVar, zzfjm zzfjmVar) {
        this.zzc = zzfjbVar;
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
        this.zzc.zzb(zza(zzfjdVar));
    }
}
