package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfaq implements zzfgy {
    public final zzfbk zza;
    public final zzfbm zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfgn zzg;

    public zzfaq(zzfbk zzfbkVar, zzfbm zzfbmVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfgn zzfgnVar) {
        this.zza = zzfbkVar;
        this.zzb = zzfbmVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgy
    public final zzfgn zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfgy
    public final Executor zzb() {
        return this.zze;
    }
}
