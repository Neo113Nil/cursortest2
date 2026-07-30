package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhbd {
    private boolean zza;

    @Nullable
    private final zzhbp zzc;
    private final zzhbb zzb = zzhbb.zza;
    private zzhbe zzd = null;

    @Nullable
    private zzhbf zze = null;

    /* synthetic */ zzhbd(zzhbp zzhbpVar, byte[] bArr) {
        this.zzc = zzhbpVar;
    }

    public final zzhbd zza() {
        zzhbf zzhbfVar = this.zze;
        if (zzhbfVar != null) {
            zzhbfVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhbd zzb() {
        zzhbe zzhbeVar;
        zzhbeVar = zzhbe.zza;
        this.zzd = zzhbeVar;
        return this;
    }

    final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zza = false;
    }

    final /* synthetic */ zzhbb zze() {
        return this.zzb;
    }

    final /* synthetic */ zzhbp zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzhbe zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzhbf zzh() {
        return this.zze;
    }

    final /* synthetic */ void zzi(zzhbf zzhbfVar) {
        this.zze = zzhbfVar;
    }
}
