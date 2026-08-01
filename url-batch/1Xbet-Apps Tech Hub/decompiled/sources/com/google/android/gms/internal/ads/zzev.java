package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzev {
    public final Object zza;
    private zzaf zzb = new zzaf();
    private boolean zzc;
    private boolean zzd;

    public zzev(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzev) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzet zzetVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzetVar.zza(this.zza);
    }

    public final void zzb(zzeu zzeuVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzah zzb = this.zzb.zzb();
        this.zzb = new zzaf();
        this.zzc = false;
        zzeuVar.zza(this.zza, zzb);
    }

    public final void zzc(zzeu zzeuVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzeuVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
