package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzfg {
    private final Object zza;
    private final int zzb;

    zzfg(Object obj, int i4) {
        this.zza = obj;
        this.zzb = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj;
        return this.zza == zzfgVar.zza && this.zzb == zzfgVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
