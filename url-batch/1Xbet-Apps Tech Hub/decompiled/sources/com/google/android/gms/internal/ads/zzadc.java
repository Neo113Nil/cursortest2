package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzadc {
    public final zzadf zza;
    public final zzadf zzb;

    public zzadc(zzadf zzadfVar, zzadf zzadfVar2) {
        this.zza = zzadfVar;
        this.zzb = zzadfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadc zzadcVar = (zzadc) obj;
            if (this.zza.equals(zzadcVar.zza) && this.zzb.equals(zzadcVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzadf zzadfVar = this.zza;
        zzadf zzadfVar2 = this.zzb;
        return "[" + zzadfVar.toString() + (zzadfVar.equals(zzadfVar2) ? "" : ", ".concat(this.zzb.toString())) + "]";
    }
}
