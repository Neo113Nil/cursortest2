package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzgxc {
    private static final zzgvy zzb = zzgvy.zza;
    protected volatile zzgxw zza;
    private volatile zzgve zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgxc)) {
            return false;
        }
        zzgxc zzgxcVar = (zzgxc) obj;
        zzgxw zzgxwVar = this.zza;
        zzgxw zzgxwVar2 = zzgxcVar.zza;
        if (zzgxwVar == null && zzgxwVar2 == null) {
            return zzb().equals(zzgxcVar.zzb());
        }
        if (zzgxwVar != null && zzgxwVar2 != null) {
            return zzgxwVar.equals(zzgxwVar2);
        }
        if (zzgxwVar != null) {
            zzgxcVar.zzc(zzgxwVar.zzbg());
            return zzgxwVar.equals(zzgxcVar.zza);
        }
        zzc(zzgxwVar2.zzbg());
        return this.zza.equals(zzgxwVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgva) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgve zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgve.zzb;
            } else {
                this.zzc = this.zza.zzau();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzgxw zzgxwVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzgxwVar;
                this.zzc = zzgve.zzb;
            } catch (zzgwy unused) {
                this.zza = zzgxwVar;
                this.zzc = zzgve.zzb;
            }
        }
    }
}
