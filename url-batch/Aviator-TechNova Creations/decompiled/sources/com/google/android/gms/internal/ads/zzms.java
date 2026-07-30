package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzms {
    public static final zzms zza = new zzms(new zzmr());
    public final zzgup zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzms(zzmr zzmrVar) {
        this.zzb = zzmrVar.zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzms)) {
            return false;
        }
        zzms zzmsVar = (zzms) obj;
        if (!this.zzb.equals(zzmsVar.zzb)) {
            return false;
        }
        boolean z = zzmsVar.zzf;
        boolean z2 = zzmsVar.zzi;
        Double d = zzmsVar.zzc;
        if (!Objects.equals(null, null)) {
            return false;
        }
        Double d2 = zzmsVar.zzd;
        if (!Objects.equals(null, null)) {
            return false;
        }
        boolean z3 = zzmsVar.zze;
        boolean z4 = zzmsVar.zzg;
        boolean z5 = zzmsVar.zzh;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, true, true, true, true, true);
    }
}
