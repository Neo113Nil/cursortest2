package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdky implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzdky(zzdkr zzdkrVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzdky zza(zzdkr zzdkrVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzdky(zzdkrVar, zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcna) this.zzb).zza();
        final zzfir zza2 = ((zzcww) this.zzc).zza();
        final zzfjk zza3 = ((zzdaw) this.zzd).zza();
        return new zzdje(new zzdct() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // com.google.android.gms.internal.ads.zzdct
            public final /* synthetic */ void zzg() {
                zzfjk zzfjkVar = zza3;
                JSONObject jSONObject = zza2.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, zza.afmaVersion, jSONObject.toString(), zzfjkVar.zzg);
            }
        }, zzcei.zzg);
    }
}
