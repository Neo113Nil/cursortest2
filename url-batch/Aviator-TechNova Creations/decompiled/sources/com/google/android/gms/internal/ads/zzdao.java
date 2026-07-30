package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdao {
    private final Context zza;
    private final zzfjk zzb;
    private final Bundle zzc;
    private final zzfjd zzd;
    private final zzdag zze;
    private final zzekl zzf;
    private final int zzg;

    /* synthetic */ zzdao(zzdan zzdanVar, byte[] bArr) {
        this.zza = zzdanVar.zzi();
        this.zzb = zzdanVar.zzj();
        this.zzc = zzdanVar.zzk();
        this.zzd = zzdanVar.zzl();
        this.zze = zzdanVar.zzm();
        this.zzf = zzdanVar.zzn();
        this.zzg = zzdanVar.zzo();
    }

    final zzdan zza() {
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(this.zza);
        zzdanVar.zzb(this.zzb);
        zzdanVar.zzc(this.zzc);
        zzdanVar.zzd(this.zze);
        zzdanVar.zzg(this.zzf);
        return zzdanVar;
    }

    final zzfjk zzb() {
        return this.zzb;
    }

    final zzfjd zzc() {
        return this.zzd;
    }

    final Bundle zzd() {
        return this.zzc;
    }

    final zzdag zze() {
        return this.zze;
    }

    final Context zzf(Context context) {
        return this.zza;
    }

    final zzekl zzg(String str) {
        zzekl zzeklVar = this.zzf;
        return zzeklVar != null ? zzeklVar : new zzekl(str);
    }

    final int zzh() {
        return this.zzg;
    }
}
