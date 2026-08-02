package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbhi {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private zzbfy zzc;

    public zzbhi(com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbfy zzf(zzbfx zzbfxVar) {
        zzbfy zzbfyVar = this.zzc;
        if (zzbfyVar != null) {
            return zzbfyVar;
        }
        zzbfy zzbfyVar2 = new zzbfy(zzbfxVar);
        this.zzc = zzbfyVar2;
        return zzbfyVar2;
    }

    public final zzbgh zzc() {
        zzbhe zzbheVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbhf(this, zzbheVar);
    }

    public final zzbgk zzd() {
        return new zzbhh(this, null);
    }
}
