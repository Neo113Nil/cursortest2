package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzav {
    private final zzq zza = new zzq();

    public final zzav zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzav zzb(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzav zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzav zzd(zzaw zzawVar) {
        zzr zza = zzawVar.zza();
        for (int i = 0; i < zza.zzb(); i++) {
            this.zza.zza(zza.zzc(i));
        }
        return this;
    }

    public final zzaw zze() {
        return new zzaw(this.zza.zzb(), null);
    }
}
