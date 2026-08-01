package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcl {
    private final zzaf zza = new zzaf();

    public final zzcl zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzcl zzb(zzcn zzcnVar) {
        zzah zzahVar;
        zzahVar = zzcnVar.zzd;
        for (int i = 0; i < zzahVar.zzb(); i++) {
            this.zza.zza(zzahVar.zza(i));
        }
        return this;
    }

    public final zzcl zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzcl zzd(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzcn zze() {
        return new zzcn(this.zza.zzb(), null);
    }
}
