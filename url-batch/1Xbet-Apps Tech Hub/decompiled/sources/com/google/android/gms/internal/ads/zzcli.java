package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcli {
    private zzcit zza;
    private zzcmv zzb;
    private zzfiy zzc;
    private zzcnh zzd;
    private zzffs zze;

    private zzcli() {
    }

    /* synthetic */ zzcli(zzclh zzclhVar) {
    }

    public final zzciq zza() {
        zzhdx.zzc(this.zza, zzcit.class);
        zzhdx.zzc(this.zzb, zzcmv.class);
        if (this.zzc == null) {
            this.zzc = new zzfiy();
        }
        if (this.zzd == null) {
            this.zzd = new zzcnh();
        }
        if (this.zze == null) {
            this.zze = new zzffs();
        }
        return new zzckm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcli zzb(zzcit zzcitVar) {
        this.zza = zzcitVar;
        return this;
    }

    public final zzcli zzc(zzcmv zzcmvVar) {
        this.zzb = zzcmvVar;
        return this;
    }
}
