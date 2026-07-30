package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdan {
    private Context zza;
    private zzfjk zzb;
    private Bundle zzc;
    private zzfjd zzd;
    private zzdag zze;
    private zzekl zzf;
    private int zzg = 0;

    public final zzdan zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdan zzb(zzfjk zzfjkVar) {
        this.zzb = zzfjkVar;
        return this;
    }

    public final zzdan zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdan zzd(zzdag zzdagVar) {
        this.zze = zzdagVar;
        return this;
    }

    public final zzdao zze() {
        return new zzdao(this, null);
    }

    public final zzdan zzf(zzfjd zzfjdVar) {
        this.zzd = zzfjdVar;
        return this;
    }

    public final zzdan zzg(zzekl zzeklVar) {
        this.zzf = zzeklVar;
        return this;
    }

    public final zzdan zzh(int i) {
        this.zzg = i;
        return this;
    }

    final /* synthetic */ Context zzi() {
        return this.zza;
    }

    final /* synthetic */ zzfjk zzj() {
        return this.zzb;
    }

    final /* synthetic */ Bundle zzk() {
        return this.zzc;
    }

    final /* synthetic */ zzfjd zzl() {
        return this.zzd;
    }

    final /* synthetic */ zzdag zzm() {
        return this.zze;
    }

    final /* synthetic */ zzekl zzn() {
        return this.zzf;
    }

    final /* synthetic */ int zzo() {
        return this.zzg;
    }
}
