package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzdsp;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzf extends QueryInfoGenerationCallback {
    private final zze zza;
    private final zzdsp zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
    private final Boolean zzf;

    public zzf(zze zzeVar, boolean z, int i, Boolean bool, zzdsp zzdspVar) {
        this.zza = zzeVar;
        this.zzc = z;
        this.zzd = i;
        this.zzf = bool;
        this.zzb = zzdspVar;
    }

    private static long zza() {
        return com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziX)).longValue();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        zzq.zzd(this.zzb, null, "sgpcf", new Pair("sgf_reason", str), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(zzb())), new Pair("sgpc_rn", Integer.toString(this.zzd)), new Pair("sgpc_lsu", String.valueOf(this.zzf)), new Pair("tpc", true != this.zzc ? "0" : "1"));
        this.zza.zzf(this.zzc, new zzg(null, str, zza(), this.zzd));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        zzq.zzd(this.zzb, null, "sgpcs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(zzb())), new Pair("sgpc_rn", Integer.toString(this.zzd)), new Pair("sgpc_lsu", String.valueOf(this.zzf)), new Pair("tpc", true != this.zzc ? "0" : "1"));
        this.zza.zzf(this.zzc, new zzg(queryInfo, "", zza(), this.zzd));
    }
}
