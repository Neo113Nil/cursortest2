package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzpf {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpf zza(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzpf zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzpf zzc(boolean z) {
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

    public final zzpg zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpg(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
