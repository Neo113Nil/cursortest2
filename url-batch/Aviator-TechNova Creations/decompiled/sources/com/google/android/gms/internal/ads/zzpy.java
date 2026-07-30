package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzpy {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpy zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzpy zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzpy zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }

    public final zzpz zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpz(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
