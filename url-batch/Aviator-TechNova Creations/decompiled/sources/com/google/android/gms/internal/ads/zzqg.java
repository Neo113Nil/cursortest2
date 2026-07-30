package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzqg {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqg zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzqg zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzqg zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzqg zzd(int i) {
        this.zzd = i;
        return this;
    }

    final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final zzqh zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqh(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
